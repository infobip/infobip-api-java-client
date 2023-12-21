/*
 * This class is auto generated from the Infobip OpenAPI specification
 * through the OpenAPI Specification Client API libraries (Re)Generator (OSCAR),
 * powered by the OpenAPI Generator (https://openapi-generator.tech).
 *
 * Do not edit manually. To learn how to raise an issue, see the CONTRIBUTING guide
 * or contact us @ support@infobip.com.
 */

package com.infobip.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * Options applicable to all messages in the request.
 */
public class ViberDefaultMessageRequestOptions {

    private ViberMessageRequestSchedulingSettings schedule;

    private ViberUrlOptions tracking;

    /**
     * Sets schedule.
     *
     * @param schedule
     * @return This {@link ViberDefaultMessageRequestOptions instance}.
     */
    public ViberDefaultMessageRequestOptions schedule(ViberMessageRequestSchedulingSettings schedule) {
        this.schedule = schedule;
        return this;
    }

    /**
     * Returns schedule.
     *
     * @return schedule
     */
    @JsonProperty("schedule")
    public ViberMessageRequestSchedulingSettings getSchedule() {
        return schedule;
    }

    /**
     * Sets schedule.
     *
     * @param schedule
     */
    @JsonProperty("schedule")
    public void setSchedule(ViberMessageRequestSchedulingSettings schedule) {
        this.schedule = schedule;
    }

    /**
     * Sets tracking.
     *
     * @param tracking
     * @return This {@link ViberDefaultMessageRequestOptions instance}.
     */
    public ViberDefaultMessageRequestOptions tracking(ViberUrlOptions tracking) {
        this.tracking = tracking;
        return this;
    }

    /**
     * Returns tracking.
     *
     * @return tracking
     */
    @JsonProperty("tracking")
    public ViberUrlOptions getTracking() {
        return tracking;
    }

    /**
     * Sets tracking.
     *
     * @param tracking
     */
    @JsonProperty("tracking")
    public void setTracking(ViberUrlOptions tracking) {
        this.tracking = tracking;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ViberDefaultMessageRequestOptions viberDefaultMessageRequestOptions = (ViberDefaultMessageRequestOptions) o;
        return Objects.equals(this.schedule, viberDefaultMessageRequestOptions.schedule)
                && Objects.equals(this.tracking, viberDefaultMessageRequestOptions.tracking);
    }

    @Override
    public int hashCode() {
        return Objects.hash(schedule, tracking);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class ViberDefaultMessageRequestOptions {")
                .append(newLine)
                .append("    schedule: ")
                .append(toIndentedString(schedule))
                .append(newLine)
                .append("    tracking: ")
                .append(toIndentedString(tracking))
                .append(newLine)
                .append("}")
                .toString();
    }

    private String toIndentedString(Object o) {
        if (o == null) {
            return "null";
        }
        String lineSeparator = System.lineSeparator();
        String lineSeparatorFollowedByIndentation = lineSeparator + "    ";
        return o.toString().replace(lineSeparator, lineSeparatorFollowedByIndentation);
    }
}
