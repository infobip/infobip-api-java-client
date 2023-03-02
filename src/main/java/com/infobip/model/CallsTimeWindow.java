/*
 * This class is auto generated from the Infobip OpenAPI specification
 * through the OpenAPI Specification Client API libraries (Re)Generator (OSCAR),
 * powered by the OpenAPI Generator (https://openapi-generator.tech).
 *
 * Do not edit manually. To learn how to raise an issue, see the CONTRIBUTING guide
 * or contact us @ support@infobip.com.
 */

package com.infobip.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Defines a scheduling object that allows setting up a detailed time window in which calls can be established. Consists of from, to and days properties. Days property is mandatory.
 */
public class CallsTimeWindow {

    private CallsTimeWindowPoint from;

    private CallsTimeWindowPoint to;

    /**
     * Days when scheduling call establishment will be attempted.
     */
    public enum DaysEnum {
        MONDAY("MONDAY"),
        TUESDAY("TUESDAY"),
        WEDNESDAY("WEDNESDAY"),
        THURSDAY("THURSDAY"),
        FRIDAY("FRIDAY"),
        SATURDAY("SATURDAY"),
        SUNDAY("SUNDAY");

        private String value;

        DaysEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static DaysEnum fromValue(String value) {
            for (DaysEnum enumElement : DaysEnum.values()) {
                if (enumElement.value.equals(value)) {
                    return enumElement;
                }
            }
            throw new IllegalArgumentException("Unexpected enum value '" + value + "'.");
        }
    }

    private List<DaysEnum> days = new ArrayList<>();

    /**
     * Sets from.
     *
     * @param from
     * @return This {@link CallsTimeWindow instance}.
     */
    public CallsTimeWindow from(CallsTimeWindowPoint from) {
        this.from = from;
        return this;
    }

    /**
     * Returns from.
     *
     * @return from
     */
    @JsonProperty("from")
    public CallsTimeWindowPoint getFrom() {
        return from;
    }

    /**
     * Sets from.
     *
     * @param from
     */
    @JsonProperty("from")
    public void setFrom(CallsTimeWindowPoint from) {
        this.from = from;
    }

    /**
     * Sets to.
     *
     * @param to
     * @return This {@link CallsTimeWindow instance}.
     */
    public CallsTimeWindow to(CallsTimeWindowPoint to) {
        this.to = to;
        return this;
    }

    /**
     * Returns to.
     *
     * @return to
     */
    @JsonProperty("to")
    public CallsTimeWindowPoint getTo() {
        return to;
    }

    /**
     * Sets to.
     *
     * @param to
     */
    @JsonProperty("to")
    public void setTo(CallsTimeWindowPoint to) {
        this.to = to;
    }

    /**
     * Sets days.
     * <p>
     * Field description:
     * Days when scheduling call establishment will be attempted.
     * <p>
     * The field is required.
     *
     * @param days
     * @return This {@link CallsTimeWindow instance}.
     */
    public CallsTimeWindow days(List<DaysEnum> days) {
        this.days = days;
        return this;
    }

    /**
     * Adds and item into days.
     * <p>
     * Field description:
     * Days when scheduling call establishment will be attempted.
     * <p>
     * The field is required.
     *
     * @param daysItem The item to be added to the list.
     * @return This {@link CallsTimeWindow instance}.
     */
    public CallsTimeWindow addDaysItem(DaysEnum daysItem) {
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
     * Days when scheduling call establishment will be attempted.
     * <p>
     * The field is required.
     *
     * @return days
     */
    @JsonProperty("days")
    public List<DaysEnum> getDays() {
        return days;
    }

    /**
     * Sets days.
     * <p>
     * Field description:
     * Days when scheduling call establishment will be attempted.
     * <p>
     * The field is required.
     *
     * @param days
     */
    @JsonProperty("days")
    public void setDays(List<DaysEnum> days) {
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
        CallsTimeWindow callsTimeWindow = (CallsTimeWindow) o;
        return Objects.equals(this.from, callsTimeWindow.from)
                && Objects.equals(this.to, callsTimeWindow.to)
                && Objects.equals(this.days, callsTimeWindow.days);
    }

    @Override
    public int hashCode() {
        return Objects.hash(from, to, days);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class CallsTimeWindow {")
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
