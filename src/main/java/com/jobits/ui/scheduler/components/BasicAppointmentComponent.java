package com.jobits.ui.scheduler.components;

import com.jobits.ui.scheduler.Appointment;
import java.awt.*;

/**
 * This is a very basic implementation of the abstract appointment component.
 * This one is ready to go but does not support mouse listening for when a user
 * clicks on a component. This class could easily be extended with a class that
 * did add that functionality.
 * <p>
 * It would be nice if this component rendered itself similar to how the Google
 * appointments are drawn in their calendar.
 *
 * @author Joshua Gerth - jgerth@thirdnf.com
 */
public class BasicAppointmentComponent extends AbstractAppointmentComponent {

    protected static final Color BACKGROUND_COLOR = new Color(9, 171, 246, 200);

    /**
     * Constructor given an appointment to wrap.
     *
     * @param appointment (not null) The appointment to wrap.
     */
    public BasicAppointmentComponent(Appointment appointment) {
        super(appointment);

        // The preferred size is pretty much just ignored for right now.
        setPreferredSize(new Dimension(100, 100));

        // Description of the appointment
        setToolTipText(appointment.getDescription());

        // Default our background color to blue
        setBackground(BACKGROUND_COLOR);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        Graphics2D graphics = (Graphics2D) g;

        Color oldColor = graphics.getColor();

        RenderingHints renderHints = graphics.getRenderingHints();

        Insets insets = getInsets();

        int width = getWidth() - insets.left - insets.right;
        int height = getHeight() - insets.top - insets.bottom;

        // Draw our border
        int arc = 10;

        graphics.setColor(getBackground());
        graphics.fillRoundRect(insets.left, insets.top, insets.left + width - 1, insets.top + height - 1, arc, arc);

        graphics.setColor(Color.gray);
        graphics.drawRoundRect(insets.left, insets.top, insets.left + width - 1, insets.top + height - 1, arc, arc);

        FontMetrics fontMetrics = getFontMetrics(getFont());
        int fontHeight = fontMetrics.getHeight() - fontMetrics.getDescent();

        graphics.setColor(Color.black);
        graphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        graphics.drawString(_appointment.getTitle(), insets.left + 20, insets.top + fontHeight + 2);

        graphics.setColor(super._appointment.getColorStatus());
        graphics.fillOval(insets.left + 3, insets.top + 3, 10, 10);

        graphics.setColor(Color.black);
        graphics.drawOval(insets.left + 3, insets.top + 3, 10, 10);

        graphics.setRenderingHints(renderHints);
        graphics.setColor(oldColor);
    }

    @Override
    public void print(Graphics2D graphics, Rectangle area) {
        Color oldColor = graphics.getColor();

        graphics.setColor(getBackground());
        graphics.fillRect(area.x, area.y, area.width, area.height);

        graphics.setColor(oldColor);
    }
}
