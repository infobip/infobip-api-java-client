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
public class MmsDefaultMessageRequestOptions {

    private MmsRequestSchedulingSettings schedule;

    private UrlOptions tracking;

    /**
     * Sets schedule.
     *
     * @param schedule
     * @return This {@link MmsDefaultMessageRequestOptions instance}.
     */
    public MmsDefaultMessageRequestOptions schedule(MmsRequestSchedulingSettings schedule) {
        this.schedule = schedule;
        return this;
    }

    /**
     * Returns schedule.
     *
     * @return schedule
     */
    @JsonProperty("schedule")
    public MmsRequestSchedulingSettings getSchedule() {
        return schedule;
    }

    /**
     * Sets schedule.
     *
     * @param schedule
     */
    @JsonProperty("schedule")
    public void setSchedule(MmsRequestSchedulingSettings schedule) {
        this.schedule = schedule;
    }

    /**
     * Sets tracking.
     *
     * @param tracking
     * @return This {@link MmsDefaultMessageRequestOptions instance}.
     */
    public MmsDefaultMessageRequestOptions tracking(UrlOptions tracking) {
        this.tracking = tracking;
        return this;
    }

    /**
     * Returns tracking.
     *
     * @return tracking
     */
    @JsonProperty("tracking")
    public UrlOptions getTracking() {
        return tracking;
    }

    /**
     * Sets tracking.
     *
     * @param tracking
     */
    @JsonProperty("tracking")
    public void setTracking(UrlOptions tracking) {
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
        MmsDefaultMessageRequestOptions mmsDefaultMessageRequestOptions = (MmsDefaultMessageRequestOptions) o;
        return Objects.equals(this.schedule, mmsDefaultMessageRequestOptions.schedule)
                && Objects.equals(this.tracking, mmsDefaultMessageRequestOptions.tracking);
    }

    @Override
    public int hashCode() {
        return Objects.hash(schedule, tracking);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class MmsDefaultMessageRequestOptions {")
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
