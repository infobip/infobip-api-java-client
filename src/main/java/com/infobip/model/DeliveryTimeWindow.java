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
 * Sets specific message delivery window outside of which messages won&#39;t be delivered. Often, used when there are restrictions on when messages can be sent. The exact time of the day to start sending messages can be defined using the &#x60;from&#x60; property. The exact time of the day to end sending messages can be defined using the &#x60;to&#x60; property. Properties &#x60;from&#x60; and &#x60;to&#x60; should be both provided with the minimum 1 hour difference or omitted.
 */
public class DeliveryTimeWindow {

    private List<DeliveryDay> days = new ArrayList<>();

    private DeliveryTime from;

    private DeliveryTime to;

    /**
     * Sets days.
     * <p>
     * Field description:
     * Days of the week which are included in the delivery time window. At least one day must be provided. Separate multiple days with a comma.
     * <p>
     * The field is required.
     *
     * @param days
     * @return This {@link DeliveryTimeWindow instance}.
     */
    public DeliveryTimeWindow days(List<DeliveryDay> days) {
        this.days = days;
        return this;
    }

    /**
     * Adds and item into days.
     * <p>
     * Field description:
     * Days of the week which are included in the delivery time window. At least one day must be provided. Separate multiple days with a comma.
     * <p>
     * The field is required.
     *
     * @param daysItem The item to be added to the list.
     * @return This {@link DeliveryTimeWindow instance}.
     */
    public DeliveryTimeWindow addDaysItem(DeliveryDay daysItem) {
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
     * Days of the week which are included in the delivery time window. At least one day must be provided. Separate multiple days with a comma.
     * <p>
     * The field is required.
     *
     * @return days
     */
    @JsonProperty("days")
    public List<DeliveryDay> getDays() {
        return days;
    }

    /**
     * Sets days.
     * <p>
     * Field description:
     * Days of the week which are included in the delivery time window. At least one day must be provided. Separate multiple days with a comma.
     * <p>
     * The field is required.
     *
     * @param days
     */
    @JsonProperty("days")
    public void setDays(List<DeliveryDay> days) {
        this.days = days;
    }

    /**
     * Sets from.
     *
     * @param from
     * @return This {@link DeliveryTimeWindow instance}.
     */
    public DeliveryTimeWindow from(DeliveryTime from) {
        this.from = from;
        return this;
    }

    /**
     * Returns from.
     *
     * @return from
     */
    @JsonProperty("from")
    public DeliveryTime getFrom() {
        return from;
    }

    /**
     * Sets from.
     *
     * @param from
     */
    @JsonProperty("from")
    public void setFrom(DeliveryTime from) {
        this.from = from;
    }

    /**
     * Sets to.
     *
     * @param to
     * @return This {@link DeliveryTimeWindow instance}.
     */
    public DeliveryTimeWindow to(DeliveryTime to) {
        this.to = to;
        return this;
    }

    /**
     * Returns to.
     *
     * @return to
     */
    @JsonProperty("to")
    public DeliveryTime getTo() {
        return to;
    }

    /**
     * Sets to.
     *
     * @param to
     */
    @JsonProperty("to")
    public void setTo(DeliveryTime to) {
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
        DeliveryTimeWindow deliveryTimeWindow = (DeliveryTimeWindow) o;
        return Objects.equals(this.days, deliveryTimeWindow.days)
                && Objects.equals(this.from, deliveryTimeWindow.from)
                && Objects.equals(this.to, deliveryTimeWindow.to);
    }

    @Override
    public int hashCode() {
        return Objects.hash(days, from, to);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class DeliveryTimeWindow {")
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
