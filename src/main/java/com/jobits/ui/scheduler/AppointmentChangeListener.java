package com.jobits.ui.scheduler;

import java.util.EventListener;

/**
 * Implementations will respond to appointment changes.
 *
 * @author Joshua Gerth - jgerth@thirdnf.com
 */
public interface AppointmentChangeListener extends EventListener {

    /**
     * Called when an appointment has been added.
     *
     * @param appointment (not null) Appointment being added.
     */
    void appointmentAdded(Appointment appointment);

    /**
     * Called when an appointment has been removed.
     *
     * @param appointment (not null) Appointment being removed.
     */
    void appointmentRemoved(Appointment appointment);

    /**
     * Called when an appointment has been updated (date/time, resource) or just
     * needs to be redrawn.
     *
     * @param appointment (not null) Appointment which has been updated.
     */
    void appointmentUpdated(Appointment appointment);
}
