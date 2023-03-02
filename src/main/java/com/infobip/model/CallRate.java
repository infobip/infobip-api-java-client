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
import java.util.Objects;

/**
 * Call rate defined in number of calls created per second, minute, hour, or day.
 */
public class CallRate {

    private Integer maxCalls;

    /**
     * Defines a time unit used for calculating call creation rate.
     */
    public enum TimeUnitEnum {
        SECONDS("SECONDS"),
        MINUTES("MINUTES"),
        HOURS("HOURS"),
        DAYS("DAYS");

        private String value;

        TimeUnitEnum(String value) {
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
        public static TimeUnitEnum fromValue(String value) {
            for (TimeUnitEnum enumElement : TimeUnitEnum.values()) {
                if (enumElement.value.equals(value)) {
                    return enumElement;
                }
            }
            throw new IllegalArgumentException("Unexpected enum value '" + value + "'.");
        }
    }

    private TimeUnitEnum timeUnit;

    /**
     * Sets maxCalls.
     * <p>
     * Field description:
     * Defines the number of calls scheduled per specified time unit.
     *
     * @param maxCalls
     * @return This {@link CallRate instance}.
     */
    public CallRate maxCalls(Integer maxCalls) {
        this.maxCalls = maxCalls;
        return this;
    }

    /**
     * Returns maxCalls.
     * <p>
     * Field description:
     * Defines the number of calls scheduled per specified time unit.
     *
     * @return maxCalls
     */
    @JsonProperty("maxCalls")
    public Integer getMaxCalls() {
        return maxCalls;
    }

    /**
     * Sets maxCalls.
     * <p>
     * Field description:
     * Defines the number of calls scheduled per specified time unit.
     *
     * @param maxCalls
     */
    @JsonProperty("maxCalls")
    public void setMaxCalls(Integer maxCalls) {
        this.maxCalls = maxCalls;
    }

    /**
     * Sets timeUnit.
     * <p>
     * Field description:
     * Defines a time unit used for calculating call creation rate.
     *
     * @param timeUnit
     * @return This {@link CallRate instance}.
     */
    public CallRate timeUnit(TimeUnitEnum timeUnit) {
        this.timeUnit = timeUnit;
        return this;
    }

    /**
     * Returns timeUnit.
     * <p>
     * Field description:
     * Defines a time unit used for calculating call creation rate.
     *
     * @return timeUnit
     */
    @JsonProperty("timeUnit")
    public TimeUnitEnum getTimeUnit() {
        return timeUnit;
    }

    /**
     * Sets timeUnit.
     * <p>
     * Field description:
     * Defines a time unit used for calculating call creation rate.
     *
     * @param timeUnit
     */
    @JsonProperty("timeUnit")
    public void setTimeUnit(TimeUnitEnum timeUnit) {
        this.timeUnit = timeUnit;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CallRate callRate = (CallRate) o;
        return Objects.equals(this.maxCalls, callRate.maxCalls) && Objects.equals(this.timeUnit, callRate.timeUnit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(maxCalls, timeUnit);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class CallRate {")
                .append(newLine)
                .append("    maxCalls: ")
                .append(toIndentedString(maxCalls))
                .append(newLine)
                .append("    timeUnit: ")
                .append(toIndentedString(timeUnit))
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
