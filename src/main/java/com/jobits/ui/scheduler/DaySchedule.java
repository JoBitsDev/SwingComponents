package com.jobits.ui.scheduler;

import com.jobits.ui.scheduler.components.AbstractResourceComponent;
import com.jobits.ui.scheduler.components.AbstractAppointmentComponent;
import com.jobits.ui.scheduler.components.BasicComponentFactory;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.geom.Rectangle2D;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Iterator;

/**
 * Panel to show a given day.
 *
 * I'm still working on exactly where the api line here should be drawn between
 * the panel and the layout, but my thinking is that the panel knows of the
 * model but the layout does not. The layout only knows of its size and the
 * components it has been asked to draw. I realize that seems sort of obvious,
 * but hindsight is 20/20.
 *
 * @author Joshua Gerth - jgerth@thirdnf.com
 */
public class DaySchedule extends JPanel implements ResourceChangeListener, AppointmentChangeListener {

    private ScheduleModel _model = null;

    // The inner panel holds the real days.
    private InnerPanel _innerPanel;

    // The date which is currently being shown
    private LocalDate _currentDate;

    // The Label which we can update
    private final JLabel _currentDateLabel;

    private int _nextResource = 0;

    private BasicComponentFactory _componentFactory;

    private ScheduleListener _scheduleListener = null;

    /**
     * Basic constructor. This sets up the date label at the top but does not
     * create the inner panel until it has been asked to show a day.
     */
    public DaySchedule() {
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        _currentDateLabel = new JLabel("No Date Showing");
        add(_currentDateLabel);
        setBackground(Color.white);
        setOpaque(true);

        _componentFactory = new BasicComponentFactory();
    }

    /**
     * Set the model that this panel should use.
     *
     * @param model (not null) The model that should be used.
     */
    public void setModel(ScheduleModel model) {
        _model = model;

        // Tie into the model's notification about resource and appointment changes
        _model.addResourceChangeListener(this);
        _model.addAppointmentChangeListener(this);
    }

    /**
     * Set the component factory for drawing the components. By default it draws
     * basic components.
     *
     * @param componentFactory (not null) New component factory to use when
     * drawing appointments and resources.
     */
    public void setComponentFactory(BasicComponentFactory componentFactory) {
        _componentFactory = componentFactory;
    }

    /**
     * Set the date which is shown. This will trigger a complete redraw of the
     * panel.
     *
     * @param date (not null) Date to show.
     */
    public void setDate(LocalDate date) {
        // Check if we area already showing a date.  If so, remove it
        if (_innerPanel != null) {
            remove(_innerPanel);
        }
        _nextResource = 0;

        _currentDate = date;
        _currentDateLabel.setText(date.toString());
//        _currentDateLabel.setText(date.toString("EEEE - MMMM d, yyyy"));

        // The model knows the begin and end times of the day for this date
        LocalTime startTime = _model.getStartTime(date);
        LocalTime endTime = _model.getEndTime(date);

        _innerPanel = new InnerPanel(_currentDate, startTime, endTime);
        // Attach the listener
        if (_scheduleListener != null) {
            _innerPanel.setScheduleListener(_scheduleListener);
        }

        add(_innerPanel);

        _model.visitResources(new ResourceVisitor() {
            @Override
            public boolean visitResource(Resource resource) {
                addResource(resource, -1);
                return true;
            }
        }, date);

        _model.visitAppointments(new AppointmentVisitor() {
            @Override
            public boolean visitAppointment(Appointment appointment) {
                addAppointment(appointment);
                return true;
            }
        }, date);

        // Trigger a repaint to show the new information.
        revalidate();
        repaint();
    }

    /**
     * Add a resource to the panel by wrapping it in a component and then adding
     * it to the layout.
     *
     * @param resource (not null) The resource to add.
     * @param index Location to add resource, -1 is an add
     */
    private void addResource(Resource resource, int index) {
        // Get the next available column.
        if (index == -1) {
            index = _nextResource++;
        }

        // Wrap the resource in a component
        AbstractResourceComponent resourceComponent = _componentFactory.makeResourceComponent(resource);

        _innerPanel.add(resourceComponent, new Integer(index));
    }

    /**
     * Private method to add an appointment to the panel. This takes the
     * appointment given and wraps it in a component and adds the component to
     * the inner panel.
     *
     * @param appointment (not null) Appointment to add.
     */
    private void addAppointment(Appointment appointment) {
        AbstractAppointmentComponent appointmentComponent = _componentFactory.makeAppointmentComponent(appointment);

        _innerPanel.add(appointmentComponent);
    }

    /**
     * Helper method to find component which represents the given resource. We
     * could (and maybe should) do this with a map, but I cringe at yet another
     * structure to hold what is essentially duplicate data. I don't think the
     * number of components will be excessive and I don't expect this to be
     * called a lot anyhow. Later we could add a map in and easily update this
     * method.
     *
     * @param resource (not null) The resource to find the component for.
     * @return (nullable) Component for this resource or null if it can't find
     * one.
     */
    private AbstractResourceComponent getResourceComponent(Resource resource) {
        // We have to find the one to remove ... we could use a map but I don't think there are going to be a
        //  lot so this is more straight forward
        int count = _innerPanel.getComponentCount();

        for (int index = 0; index < count; ++index) {
            Component component = _innerPanel.getComponent(index);
            if (component instanceof AbstractResourceComponent) {
                AbstractResourceComponent resourceComponent = (AbstractResourceComponent) component;
                if (resourceComponent.getResource().equals(resource)) {
                    return resourceComponent;
                }
            }
        }

        return null;
    }

    /**
     * Helper method to find a component which represents the given appointment.
     * See the javadoc for {@link #getResourceComponent(Resource)} for more
     * details.
     *
     * @param appointment (not null) Appointment to find the component for
     * @return (nullable) Component for the appointment or null if it could not
     * be found.
     */
    private AbstractAppointmentComponent getAppointmentComponent(Appointment appointment) {
        // We have to find the one to remove ... we could use a map but I don't think there are going to be a
        //  lot so this is more straight forward
        int count = _innerPanel.getComponentCount();

        for (int index = 0; index < count; ++index) {
            Component component = _innerPanel.getComponent(index);
            if (component instanceof AbstractAppointmentComponent) {
                AbstractAppointmentComponent appointmentComponent = (AbstractAppointmentComponent) component;
                if (appointmentComponent.getAppointment().equals(appointment)) {
                    return appointmentComponent;
                }
            }
        }
        return null;
    }

    /**
     * Add a schedule listener to be notified when a user clicks anywhere in the
     * panel which is not on an appointment or resource. The values sent are the
     * "time" location of the event and the resource column. From this the
     * listener could pull up a dialog box and ask to add an appointment if they
     * wanted to.
     *
     * @param scheduleListener (not null) the listener to be notified on an
     * appointment click.
     */
    public void setScheduleListener(ScheduleListener scheduleListener) {
        _scheduleListener = scheduleListener;
        if (_innerPanel != null) {
            _innerPanel.setScheduleListener(scheduleListener);
        }
    }

    /**
     * Called by a print request to the scheduler. This DOES NOT WORK CURRENTLY.
     *
     * @param graphics (not null) Graphics to print to.
     * @param area (not null) Area in which to render this schedule.
     */
    public void print(Graphics2D graphics, Rectangle area) {
        Color oldColor = graphics.getColor();

        graphics.setColor(Color.white);
        _innerPanel.print(graphics, area);
        graphics.fillRect(area.x, area.y, area.width, area.height);

        graphics.setColor(oldColor);
    }

    @Override
    public void resourceAdded(Resource resource, LocalDate date, int index) {
        // This is a day view so we only care if the day matches
        if (!date.equals(_currentDate)) {
            return;
        }

        // Add it to the panel
        addResource(resource, index);

        // Force the layout to redraw
        _innerPanel.revalidate();

        // We have added a column so we need to repaint our background as well
        _innerPanel.repaint();
    }

    @Override
    public void resourceRemoved(Resource resource, LocalDate date) {
        // This is a day view so we only care if the day matches
        if (!date.equals(_currentDate)) {
            return;
        }

        // First remove the component
        Component component = getResourceComponent(resource);
        if (component != null) {
            _innerPanel.remove(component);
        }

        // Force the layout to redraw
        _innerPanel.revalidate();

        // We have removed a column so we need to repaint our background as well
        _innerPanel.repaint();
    }

    @Override
    public void resourceUpdated(Resource resource) {
        Component component = getResourceComponent(resource);
        if (component != null) {
            component.repaint();
        }

        // Availability may have changed
        repaint();
    }

    @Override
    public void appointmentAdded(Appointment appointment) {
        LocalDate date = appointment.getDateTime().toLocalDate();

        // This is a day view so we only care if the day matches
        if (!date.equals(_currentDate)) {
            return;
        }

        // TODO - Handle this in the existing frame without forcing a redraw of everything
        // For now we are going to cheat and just reload the date
        setDate(_currentDate);
    }

    @Override
    public void appointmentRemoved(Appointment appointment) {
        LocalDate date = appointment.getDateTime().toLocalDate();

        // This is a day view so we only care if the day matches
        if (!date.equals(_currentDate)) {
            return;
        }

        Component component = getAppointmentComponent(appointment);
        if (component != null) {
            _innerPanel.remove(component);
        }

        // This may cause a conflicted appointment to change sizes so invalidate everything.
        _innerPanel.revalidate();

        // Repaint to remove the old one.
        _innerPanel.repaint();
    }

    @Override
    public void appointmentUpdated(Appointment appointment) {
        // The appointment may have moved so re-layout
        _innerPanel.revalidate();

        // Repaint to remove the old one.
        _innerPanel.repaint();
    }

    /**
     * This is the inner panel that actually holds the components. This panel
     * can be removed and replaced as the date changes or as otherwise needed.
     */
    private static class InnerPanel extends JPanel implements MouseListener {

        private final LocalDate _date;
        private final LocalTime _startTime;
        private final LocalTime _endTime;
        private final Duration _increments;

        private ScheduleListener _scheduleListener = null;

        /**
         * Create the inner panel with a start and end times as given. These
         * start and end times are the total span that should be shown for the
         * day. There is no way to specify a day which spans midnight, this
         * library is simply not being designed to handle that.
         *
         * @param date (not null) Date the inner panel is showing. Needed for
         * availability checking.
         * @param startTime (not null) Time of the day to start.
         * @param endTime (not null) Time of the day to end.
         */
        InnerPanel(LocalDate date, LocalTime startTime, LocalTime endTime) {
            _date = date;
            _startTime = startTime;
            _endTime = endTime;
            _increments = Duration.ofMinutes(15);

            DayScheduleLayout layout = new DayScheduleLayout(startTime, endTime);

            setLayout(layout);
            setBackground(Color.white);
            setOpaque(true);
            setBorder(BorderFactory.createEtchedBorder());

            addMouseListener(this);
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);

            DayScheduleLayout layout = (DayScheduleLayout) getLayout();

            Graphics2D graphics = (Graphics2D) g;

            Insets insets = getInsets();

            int width = getWidth() - insets.left - insets.right;
            int height = getHeight() - insets.top - insets.bottom;

            FontMetrics fontMetrics = getFontMetrics(getFont());
            int fontHeight = fontMetrics.getHeight();

            Color oldColor = graphics.getColor();

            graphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            int leftHeader = layout.getX(0);
            int columns = layout.getColumnCount();

            // Color in times which they are not available.  This goes through and basically draws from the
            //  top to the first appointment, then from that appointment to the next and so forth and so on
            //  at the end it then draws from the last appointment to the bottom.
            graphics.setColor(Color.lightGray);
            for (int i = 0; i < columns; ++i) {
                int y1 = layout.getTopHeader();
                int x1 = layout.getX(i);
                int x2 = layout.getX(i + 1);

                Resource resource = layout.getResource(i);
                Iterator<Availability> iterator = resource.getAvailability(_date);
                while (iterator.hasNext()) {
                    Availability availability = iterator.next();
                    // Color this availability white
                    LocalTime startTime = availability.getTime();
                    Duration duration = availability.getDuration();
                    int y2 = layout.getY(startTime);

                    if (y2 > y1) {
                        graphics.fillRect(x1, y1, x2 - x1, y2 - y1);
                    }

                    LocalTime endTime = startTime.plus(duration);
                    y1 = layout.getY(endTime);
                }

                int y2 = insets.top + height;
                if (y2 > y1) {
                    graphics.fillRect(x1, y1, x2 - x1, y2 - y1);
                }
            }

//            Period period = Period.from(_increments);

            for (LocalTime time = _startTime; time.compareTo(_endTime) < 0; time = time.plus(_increments)) {
                Integer y = layout.getY(time);
                if (y != null) {
                    boolean onTheHour = time.getMinute() == 0;

                    if (onTheHour) {
                        graphics.setColor(Color.black);
                    }

                    graphics.drawLine(leftHeader, y, insets.left + width, y);

                    if (onTheHour) {
                        // We want to draw hour markers and right justify them.

                        String timeString = time.format(DateTimeFormatter.ofPattern("h:mm a"));

                        Rectangle2D rect = fontMetrics.getStringBounds(timeString, graphics);
                        int stringX = (int) (leftHeader - rect.getWidth() - 10);

                        graphics.drawString(timeString, stringX, y + fontHeight / 2);
                        graphics.setColor(Color.lightGray);
                    }
                }
            }

            // Finally draw the column lines over everything
            graphics.setColor(Color.black);
            for (int i = 0; i < columns; ++i) {
                int x = layout.getX(i);
                graphics.drawLine(x, insets.top, x, insets.top + height);
            }

            // Reset the graphics
            graphics.setColor(oldColor);
            graphics.setPaintMode();
        }

        /**
         * Handle a print request of the inner panel. DO NOT USE, THIS IS STILL
         * UNDER DEVELOPMENT.
         *
         * @param graphics (not null) Graphics to print to.
         * @param area (not null) Area in which to render this component.
         */
        public void print(Graphics2D graphics, Rectangle area) {
            // TODO - draw the background

            DayScheduleLayout layout = (DayScheduleLayout) getLayout();
            layout.print(this, graphics, area);
        }

        /**
         * Add a schedule listener to be notified when a user clicks anywhere in
         * the panel which is not on an appointment or resource. The values sent
         * are the "time" location of the event and the resource column. From
         * this the listener could pull up a dialog box and ask to add an
         * appointment if they wanted to.
         *
         * @param scheduleListener (not null) the listener to be notified on an
         * appointment click.
         */
        public void setScheduleListener(ScheduleListener scheduleListener) {
            _scheduleListener = scheduleListener;
        }

        @Override
        public void mouseClicked(MouseEvent e) {
        }

        @Override
        public void mousePressed(MouseEvent e) {
        }

        @Override
        public void mouseReleased(MouseEvent e) {
            if (_scheduleListener != null) {
                int x = e.getX();
                int y = e.getY();

                DayScheduleLayout layout = (DayScheduleLayout) getLayout();

                // Determine the resource clicked
                Resource resource = null;
                int columns = layout.getColumnCount();
                int x1 = layout.getX(0);

                for (int i = 0; i < columns; ++i) {
                    int x2 = layout.getX(i + 1);
                    if (x > x1 && x < x2) {
                        resource = layout.getResource(i);
                    }
                    x1 = x2;
                }

                if (resource == null) {
                    return;
                }

                LocalTime time = layout.getTime(y);

                // Now convert the time into a date time and send it to the listener
                LocalDateTime dateTime = LocalDateTime.of(_date.getYear(), _date.getMonth(), _date.getDayOfMonth(),
                        time.getHour(), time.getMinute(), time.getSecond(), 0);

                _scheduleListener.actionPerformed(resource, dateTime);
            }
        }

        @Override
        public void mouseEntered(MouseEvent e) {
        }

        @Override
        public void mouseExited(MouseEvent e) {
        }

    }
}
