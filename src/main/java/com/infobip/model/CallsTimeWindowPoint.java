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
 * Call establishment attempt end time.
 */
public class CallsTimeWindowPoint {

    private Integer hour;

    private Integer minute;

    /**
     * Sets hour.
     *
     * @param hour
     * @return This {@link CallsTimeWindowPoint instance}.
     */
    public CallsTimeWindowPoint hour(Integer hour) {
        this.hour = hour;
        return this;
    }

    /**
     * Returns hour.
     *
     * @return hour
     */
    @JsonProperty("hour")
    public Integer getHour() {
        return hour;
    }

    /**
     * Sets hour.
     *
     * @param hour
     */
    @JsonProperty("hour")
    public void setHour(Integer hour) {
        this.hour = hour;
    }

    /**
     * Sets minute.
     *
     * @param minute
     * @return This {@link CallsTimeWindowPoint instance}.
     */
    public CallsTimeWindowPoint minute(Integer minute) {
        this.minute = minute;
        return this;
    }

    /**
     * Returns minute.
     *
     * @return minute
     */
    @JsonProperty("minute")
    public Integer getMinute() {
        return minute;
    }

    /**
     * Sets minute.
     *
     * @param minute
     */
    @JsonProperty("minute")
    public void setMinute(Integer minute) {
        this.minute = minute;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CallsTimeWindowPoint callsTimeWindowPoint = (CallsTimeWindowPoint) o;
        return Objects.equals(this.hour, callsTimeWindowPoint.hour)
                && Objects.equals(this.minute, callsTimeWindowPoint.minute);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hour, minute);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class CallsTimeWindowPoint {")
                .append(newLine)
                .append("    hour: ")
                .append(toIndentedString(hour))
                .append(newLine)
                .append("    minute: ")
                .append(toIndentedString(minute))
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
