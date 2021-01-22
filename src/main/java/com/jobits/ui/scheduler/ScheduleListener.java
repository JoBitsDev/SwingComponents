package com.jobits.ui.scheduler;

import java.awt.event.MouseEvent;
import java.time.LocalDateTime;
import java.util.EventListener;

public interface ScheduleListener extends EventListener {

    /**
     * Deal with an action performed (likely a user click) on the given resource
     * at the given time.Implementations would likely prompt to add an
     * appointment.
     *
     * @param resource (not null) Resource clicked in.
     * @param time (not null) Time selected.
     * @param e (not null) Mouse Info
     */
    void actionPerformed(Resource resource, LocalDateTime time, MouseEvent e);
}
