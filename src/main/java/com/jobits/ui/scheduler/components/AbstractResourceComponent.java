package com.jobits.ui.scheduler.components;

import com.jobits.ui.scheduler.Resource;
import javax.swing.*;
import java.awt.*;

@SuppressWarnings({"UnusedDeclaration"})
public abstract class AbstractResourceComponent extends JComponent {

    // The resource this component is wrapping.
    protected final Resource _resource;

    // This is the color which the DaySchedule and other views should use to identify this
    //  resource.  By default this is null which means they don't identify it.  This is not
    //  the same as the background or foreground colors which are used to paint this actual
    //  component.
    protected Color _color;

    /**
     * Constructor given a resource to wrap
     *
     * @param resource (not null) Resource to wrap.
     */
    protected AbstractResourceComponent(Resource resource) {
        _resource = resource;
    }

    /**
     * Simple getter to get the wrapped resource.
     *
     * @return (not null) The wrapped resource
     */
    public Resource getResource() {
        return _resource;
    }

    /**
     * Simple getter to get the color identifier for this resource.
     *
     * @return (nullable) Color for the resource or null if it has not been set.
     */
    public Color getColor() {
        return _color;
    }

    /**
     * Simple setter for this resource.
     *
     * @param color (nullable) Color to set for this resource.
     */
    public void setColor(Color color) {
        _color = color;
    }

    /**
     * Print this component into the given area using the graphics handle.
     *
     * @param graphics (not null) Graphics handle to draw with
     * @param area (not null) Area for printing
     */
    public abstract void print(Graphics2D graphics, Rectangle area);
}
