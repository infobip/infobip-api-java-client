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
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

/**
 * Scheduling object that allows setting up detailed time windows in which the message can be sent. Consists of from, to and days properties. Days property is mandatory. Days in the week are written as their full names: Monday-Sunday. Days parameter must be populated as a list, between two square brackets. &#x60;Example: [&#39;MONDAY&#39;, &#39;TUESDAY&#39;, &#39;WEDNESDAY&#39;]&#x60;. From and to properties should be either both included, to allow finer time window granulation or both omitted, to include whole days in the delivery time window. From and to parameters are objects, that consist of hour and minute fields that hold integer values. For example, &#x60; from: [ hour: 15, minute:45 ]&#x60;. For complete json, please check out our example. Note: delivery time window is set in UTC timezone.
 */
public class CallsDeliveryTimeWindow {

    private Set<CallsDeliveryDay> days = null;

    private CallsDeliveryTime from;

    private CallsDeliveryTime to;

    /**
     * Sets days.
     *
     * @param days
     * @return This {@link CallsDeliveryTimeWindow instance}.
     */
    public CallsDeliveryTimeWindow days(Set<CallsDeliveryDay> days) {
        this.days = days;
        return this;
    }

    /**
     * Adds and item into days.
     *
     * @param daysItem The item to be added to the list.
     * @return This {@link CallsDeliveryTimeWindow instance}.
     */
    public CallsDeliveryTimeWindow addDaysItem(CallsDeliveryDay daysItem) {
        if (this.days == null) {
            this.days = new LinkedHashSet<>();
        }
        this.days.add(daysItem);
        return this;
    }

    /**
     * Returns days.
     *
     * @return days
     */
    @JsonProperty("days")
    public Set<CallsDeliveryDay> getDays() {
        return days;
    }

    /**
     * Sets days.
     *
     * @param days
     */
    @JsonProperty("days")
    public void setDays(Set<CallsDeliveryDay> days) {
        this.days = days;
    }

    /**
     * Sets from.
     * <p>
     * The field is required.
     *
     * @param from
     * @return This {@link CallsDeliveryTimeWindow instance}.
     */
    public CallsDeliveryTimeWindow from(CallsDeliveryTime from) {
        this.from = from;
        return this;
    }

    /**
     * Returns from.
     * <p>
     * The field is required.
     *
     * @return from
     */
    @JsonProperty("from")
    public CallsDeliveryTime getFrom() {
        return from;
    }

    /**
     * Sets from.
     * <p>
     * The field is required.
     *
     * @param from
     */
    @JsonProperty("from")
    public void setFrom(CallsDeliveryTime from) {
        this.from = from;
    }

    /**
     * Sets to.
     * <p>
     * The field is required.
     *
     * @param to
     * @return This {@link CallsDeliveryTimeWindow instance}.
     */
    public CallsDeliveryTimeWindow to(CallsDeliveryTime to) {
        this.to = to;
        return this;
    }

    /**
     * Returns to.
     * <p>
     * The field is required.
     *
     * @return to
     */
    @JsonProperty("to")
    public CallsDeliveryTime getTo() {
        return to;
    }

    /**
     * Sets to.
     * <p>
     * The field is required.
     *
     * @param to
     */
    @JsonProperty("to")
    public void setTo(CallsDeliveryTime to) {
        this.to = to;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CallsDeliveryTimeWindow callsDeliveryTimeWindow = (CallsDeliveryTimeWindow) o;
        return Objects.equals(this.days, callsDeliveryTimeWindow.days)
                && Objects.equals(this.from, callsDeliveryTimeWindow.from)
                && Objects.equals(this.to, callsDeliveryTimeWindow.to);
    }

    @Override
    public int hashCode() {
        return Objects.hash(days, from, to);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class CallsDeliveryTimeWindow {")
                .append(newLine)
                .append("    days: ")
                .append(toIndentedString(days))
                .append(newLine)
                .append("    from: ")
                .append(toIndentedString(from))
                .append(newLine)
                .append("    to: ")
                .append(toIndentedString(to))
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
