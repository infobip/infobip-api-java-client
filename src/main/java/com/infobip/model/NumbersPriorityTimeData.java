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
 * Represents NumbersPriorityTimeData model.
 */
public class NumbersPriorityTimeData {

    private NumbersPriorityTimeUnit timeUnit;

    private Integer amount;

    /**
     * Sets timeUnit.
     *
     * @param timeUnit
     * @return This {@link NumbersPriorityTimeData instance}.
     */
    public NumbersPriorityTimeData timeUnit(NumbersPriorityTimeUnit timeUnit) {
        this.timeUnit = timeUnit;
        return this;
    }

    /**
     * Returns timeUnit.
     *
     * @return timeUnit
     */
    @JsonProperty("timeUnit")
    public NumbersPriorityTimeUnit getTimeUnit() {
        return timeUnit;
    }

    /**
     * Sets timeUnit.
     *
     * @param timeUnit
     */
    @JsonProperty("timeUnit")
    public void setTimeUnit(NumbersPriorityTimeUnit timeUnit) {
        this.timeUnit = timeUnit;
    }

    /**
     * Sets amount.
     * <p>
     * Field description:
     * The amount of time unit.
     *
     * @param amount
     * @return This {@link NumbersPriorityTimeData instance}.
     */
    public NumbersPriorityTimeData amount(Integer amount) {
        this.amount = amount;
        return this;
    }

    /**
     * Returns amount.
     * <p>
     * Field description:
     * The amount of time unit.
     *
     * @return amount
     */
    @JsonProperty("amount")
    public Integer getAmount() {
        return amount;
    }

    /**
     * Sets amount.
     * <p>
     * Field description:
     * The amount of time unit.
     *
     * @param amount
     */
    @JsonProperty("amount")
    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        NumbersPriorityTimeData numbersPriorityTimeData = (NumbersPriorityTimeData) o;
        return Objects.equals(this.timeUnit, numbersPriorityTimeData.timeUnit)
                && Objects.equals(this.amount, numbersPriorityTimeData.amount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(timeUnit, amount);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class NumbersPriorityTimeData {")
                .append(newLine)
                .append("    timeUnit: ")
                .append(toIndentedString(timeUnit))
                .append(newLine)
                .append("    amount: ")
                .append(toIndentedString(amount))
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
