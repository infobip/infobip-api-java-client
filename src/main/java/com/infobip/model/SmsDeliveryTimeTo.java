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
 * The exact time of day to end sending messages. Time is expressed in the UTC time zone. If set, use it together with the &#x60;from&#x60; property with minimum 1 hour difference.
 */
public class SmsDeliveryTimeTo {

    private Integer hour;

    private Integer minute;

    /**
     * Sets hour.
     * <p>
     * Field description:
     * Hour when the time window opens when used in the &#x60;from&#x60; property or closes when used in the &#x60;to&#x60; property.
     * <p>
     * The field is required.
     *
     * @param hour
     * @return This {@link SmsDeliveryTimeTo instance}.
     */
    public SmsDeliveryTimeTo hour(Integer hour) {
        this.hour = hour;
        return this;
    }

    /**
     * Returns hour.
     * <p>
     * Field description:
     * Hour when the time window opens when used in the &#x60;from&#x60; property or closes when used in the &#x60;to&#x60; property.
     * <p>
     * The field is required.
     *
     * @return hour
     */
    @JsonProperty("hour")
    public Integer getHour() {
        return hour;
    }

    /**
     * Sets hour.
     * <p>
     * Field description:
     * Hour when the time window opens when used in the &#x60;from&#x60; property or closes when used in the &#x60;to&#x60; property.
     * <p>
     * The field is required.
     *
     * @param hour
     */
    @JsonProperty("hour")
    public void setHour(Integer hour) {
        this.hour = hour;
    }

    /**
     * Sets minute.
     * <p>
     * Field description:
     * Minute when the time window opens when used in the &#x60;from&#x60; property or closes when used in the &#x60;to&#x60; property.
     * <p>
     * The field is required.
     *
     * @param minute
     * @return This {@link SmsDeliveryTimeTo instance}.
     */
    public SmsDeliveryTimeTo minute(Integer minute) {
        this.minute = minute;
        return this;
    }

    /**
     * Returns minute.
     * <p>
     * Field description:
     * Minute when the time window opens when used in the &#x60;from&#x60; property or closes when used in the &#x60;to&#x60; property.
     * <p>
     * The field is required.
     *
     * @return minute
     */
    @JsonProperty("minute")
    public Integer getMinute() {
        return minute;
    }

    /**
     * Sets minute.
     * <p>
     * Field description:
     * Minute when the time window opens when used in the &#x60;from&#x60; property or closes when used in the &#x60;to&#x60; property.
     * <p>
     * The field is required.
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
        SmsDeliveryTimeTo smsDeliveryTimeTo = (SmsDeliveryTimeTo) o;
        return Objects.equals(this.hour, smsDeliveryTimeTo.hour)
                && Objects.equals(this.minute, smsDeliveryTimeTo.minute);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hour, minute);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class SmsDeliveryTimeTo {")
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
