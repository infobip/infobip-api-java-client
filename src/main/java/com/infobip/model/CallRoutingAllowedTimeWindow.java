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
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Sets specific delivery windows outside of which calls won&#39;t be forwarded to the destination. If defined, call forwarding is allowed only if any time window in array is satisfied.
 */
public class CallRoutingAllowedTimeWindow {

    private CallRoutingAllowedTimeFrom from;

    private CallRoutingAllowedTimeTo to;

    private List<CallRoutingAllowedDay> days = null;

    /**
     * Sets from.
     *
     * @param from
     * @return This {@link CallRoutingAllowedTimeWindow instance}.
     */
    public CallRoutingAllowedTimeWindow from(CallRoutingAllowedTimeFrom from) {
        this.from = from;
        return this;
    }

    /**
     * Returns from.
     *
     * @return from
     */
    @JsonProperty("from")
    public CallRoutingAllowedTimeFrom getFrom() {
        return from;
    }

    /**
     * Sets from.
     *
     * @param from
     */
    @JsonProperty("from")
    public void setFrom(CallRoutingAllowedTimeFrom from) {
        this.from = from;
    }

    /**
     * Sets to.
     *
     * @param to
     * @return This {@link CallRoutingAllowedTimeWindow instance}.
     */
    public CallRoutingAllowedTimeWindow to(CallRoutingAllowedTimeTo to) {
        this.to = to;
        return this;
    }

    /**
     * Returns to.
     *
     * @return to
     */
    @JsonProperty("to")
    public CallRoutingAllowedTimeTo getTo() {
        return to;
    }

    /**
     * Sets to.
     *
     * @param to
     */
    @JsonProperty("to")
    public void setTo(CallRoutingAllowedTimeTo to) {
        this.to = to;
    }

    /**
     * Sets days.
     * <p>
     * Field description:
     * Days for which to apply the &#x60;from&#x60; and &#x60;to&#x60; properties. If not set, defaults to all days.
     *
     * @param days
     * @return This {@link CallRoutingAllowedTimeWindow instance}.
     */
    public CallRoutingAllowedTimeWindow days(List<CallRoutingAllowedDay> days) {
        this.days = days;
        return this;
    }

    /**
     * Adds and item into days.
     * <p>
     * Field description:
     * Days for which to apply the &#x60;from&#x60; and &#x60;to&#x60; properties. If not set, defaults to all days.
     *
     * @param daysItem The item to be added to the list.
     * @return This {@link CallRoutingAllowedTimeWindow instance}.
     */
    public CallRoutingAllowedTimeWindow addDaysItem(CallRoutingAllowedDay daysItem) {
        if (this.days == null) {
            this.days = new ArrayList<>();
        }
        this.days.add(daysItem);
        return this;
    }

    /**
     * Returns days.
     * <p>
     * Field description:
     * Days for which to apply the &#x60;from&#x60; and &#x60;to&#x60; properties. If not set, defaults to all days.
     *
     * @return days
     */
    @JsonProperty("days")
    public List<CallRoutingAllowedDay> getDays() {
        return days;
    }

    /**
     * Sets days.
     * <p>
     * Field description:
     * Days for which to apply the &#x60;from&#x60; and &#x60;to&#x60; properties. If not set, defaults to all days.
     *
     * @param days
     */
    @JsonProperty("days")
    public void setDays(List<CallRoutingAllowedDay> days) {
        this.days = days;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CallRoutingAllowedTimeWindow callRoutingAllowedTimeWindow = (CallRoutingAllowedTimeWindow) o;
        return Objects.equals(this.from, callRoutingAllowedTimeWindow.from)
                && Objects.equals(this.to, callRoutingAllowedTimeWindow.to)
                && Objects.equals(this.days, callRoutingAllowedTimeWindow.days);
    }

    @Override
    public int hashCode() {
        return Objects.hash(from, to, days);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class CallRoutingAllowedTimeWindow {")
                .append(newLine)
                .append("    from: ")
                .append(toIndentedString(from))
                .append(newLine)
                .append("    to: ")
                .append(toIndentedString(to))
                .append(newLine)
                .append("    days: ")
                .append(toIndentedString(days))
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
