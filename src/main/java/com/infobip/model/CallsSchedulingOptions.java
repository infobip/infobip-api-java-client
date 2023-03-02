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
import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * Scheduling object that allows setting up detailed time windows within which calls can be established. Note that calling time window is set in UTC timezone.
 */
public class CallsSchedulingOptions {

    private OffsetDateTime startTime;

    private CallsTimeWindow callingTimeWindow;

    /**
     * Sets startTime.
     * <p>
     * Field description:
     * Scheduling start date and time.
     *
     * @param startTime
     * @return This {@link CallsSchedulingOptions instance}.
     */
    public CallsSchedulingOptions startTime(OffsetDateTime startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * Returns startTime.
     * <p>
     * Field description:
     * Scheduling start date and time.
     *
     * @return startTime
     */
    @JsonProperty("startTime")
    public OffsetDateTime getStartTime() {
        return startTime;
    }

    /**
     * Sets startTime.
     * <p>
     * Field description:
     * Scheduling start date and time.
     *
     * @param startTime
     */
    @JsonProperty("startTime")
    public void setStartTime(OffsetDateTime startTime) {
        this.startTime = startTime;
    }

    /**
     * Sets callingTimeWindow.
     *
     * @param callingTimeWindow
     * @return This {@link CallsSchedulingOptions instance}.
     */
    public CallsSchedulingOptions callingTimeWindow(CallsTimeWindow callingTimeWindow) {
        this.callingTimeWindow = callingTimeWindow;
        return this;
    }

    /**
     * Returns callingTimeWindow.
     *
     * @return callingTimeWindow
     */
    @JsonProperty("callingTimeWindow")
    public CallsTimeWindow getCallingTimeWindow() {
        return callingTimeWindow;
    }

    /**
     * Sets callingTimeWindow.
     *
     * @param callingTimeWindow
     */
    @JsonProperty("callingTimeWindow")
    public void setCallingTimeWindow(CallsTimeWindow callingTimeWindow) {
        this.callingTimeWindow = callingTimeWindow;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CallsSchedulingOptions callsSchedulingOptions = (CallsSchedulingOptions) o;
        return Objects.equals(this.startTime, callsSchedulingOptions.startTime)
                && Objects.equals(this.callingTimeWindow, callsSchedulingOptions.callingTimeWindow);
    }

    @Override
    public int hashCode() {
        return Objects.hash(startTime, callingTimeWindow);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class CallsSchedulingOptions {")
                .append(newLine)
                .append("    startTime: ")
                .append(toIndentedString(startTime))
                .append(newLine)
                .append("    callingTimeWindow: ")
                .append(toIndentedString(callingTimeWindow))
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
