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
 * Set specific scheduling options to send a message within daily or hourly intervals.
 */
public class MmsDeliveryTimeWindow {

    private List<MmsDeliveryDay> days = new ArrayList<>();

    private MmsDeliveryTime from;

    private MmsDeliveryTime to;

    /**
     * Sets days.
     * <p>
     * Field description:
     * Days of the week which are included in the delivery time window. At least one day must be provided.
     * <p>
     * The field is required.
     *
     * @param days
     * @return This {@link MmsDeliveryTimeWindow instance}.
     */
    public MmsDeliveryTimeWindow days(List<MmsDeliveryDay> days) {
        this.days = days;
        return this;
    }

    /**
     * Adds and item into days.
     * <p>
     * Field description:
     * Days of the week which are included in the delivery time window. At least one day must be provided.
     * <p>
     * The field is required.
     *
     * @param daysItem The item to be added to the list.
     * @return This {@link MmsDeliveryTimeWindow instance}.
     */
    public MmsDeliveryTimeWindow addDaysItem(MmsDeliveryDay daysItem) {
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
     * Days of the week which are included in the delivery time window. At least one day must be provided.
     * <p>
     * The field is required.
     *
     * @return days
     */
    @JsonProperty("days")
    public List<MmsDeliveryDay> getDays() {
        return days;
    }

    /**
     * Sets days.
     * <p>
     * Field description:
     * Days of the week which are included in the delivery time window. At least one day must be provided.
     * <p>
     * The field is required.
     *
     * @param days
     */
    @JsonProperty("days")
    public void setDays(List<MmsDeliveryDay> days) {
        this.days = days;
    }

    /**
     * Sets from.
     *
     * @param from
     * @return This {@link MmsDeliveryTimeWindow instance}.
     */
    public MmsDeliveryTimeWindow from(MmsDeliveryTime from) {
        this.from = from;
        return this;
    }

    /**
     * Returns from.
     *
     * @return from
     */
    @JsonProperty("from")
    public MmsDeliveryTime getFrom() {
        return from;
    }

    /**
     * Sets from.
     *
     * @param from
     */
    @JsonProperty("from")
    public void setFrom(MmsDeliveryTime from) {
        this.from = from;
    }

    /**
     * Sets to.
     *
     * @param to
     * @return This {@link MmsDeliveryTimeWindow instance}.
     */
    public MmsDeliveryTimeWindow to(MmsDeliveryTime to) {
        this.to = to;
        return this;
    }

    /**
     * Returns to.
     *
     * @return to
     */
    @JsonProperty("to")
    public MmsDeliveryTime getTo() {
        return to;
    }

    /**
     * Sets to.
     *
     * @param to
     */
    @JsonProperty("to")
    public void setTo(MmsDeliveryTime to) {
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
        MmsDeliveryTimeWindow mmsDeliveryTimeWindow = (MmsDeliveryTimeWindow) o;
        return Objects.equals(this.days, mmsDeliveryTimeWindow.days)
                && Objects.equals(this.from, mmsDeliveryTimeWindow.from)
                && Objects.equals(this.to, mmsDeliveryTimeWindow.to);
    }

    @Override
    public int hashCode() {
        return Objects.hash(days, from, to);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class MmsDeliveryTimeWindow {")
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
