package com.jobits.ui.scheduler;

import java.awt.Color;
import java.time.Duration;
import java.time.LocalDateTime;

/**
 * Instances of this class will be appointments to add to the schedule.
 *
 * @author Joshua Gerth - jgerth@thirdnf.com
 */
public interface Appointment {

    /**
     * Get the appointment title/name. This is what the gui will display.
     *
     * @return (not null) Title for the appointment.
     */
    String getTitle();

    /**
     * Get the date/time of the appointment
     *
     * @return The date/time for the appointment.
     */
    LocalDateTime getDateTime();

    /**
     * Get the resource this appointment was assigned to. It may return null if
     * the appointment has not yet been assigned to a resource.
     *
     * @return (nullable) The resource this appointment has been assigned to.
     */
    Resource getResource();

    /**
     * Get the length of the appointment on the given day.
     *
     * @return (not null) Length of the appointment
     */
    Duration getDuration();

    /**
     * Get the description of the appointment on the given day.
     *
     * @return (not null) Formatted string description of the appointment
     */
    String getDescription();

    /**
     * Get the status color of the appointment on the given day.
     *
     * @return (not null) status color of the appointment
     */
    Color getColorStatus();

    /**
     * Get the check in status of the appointment on the given day.
     *
     * @return (not null) checkin status
     */
    boolean cheackIn();

}
