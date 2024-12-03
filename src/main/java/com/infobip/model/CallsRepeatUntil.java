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
 * This action is deprecated and should not be used, as it leads to incorrect behaviour and it will not be supported in the future. Please, use repeat-while loop instead.
 */
public class CallsRepeatUntil implements CallsScriptInner {

    private List<Object> repeat = new ArrayList<>();

    private String until;

    /**
     * Sets repeat.
     * <p>
     * Field description:
     * Array of actions to execute.
     * <p>
     * The field is required.
     *
     * @param repeat
     * @return This {@link CallsRepeatUntil instance}.
     */
    public CallsRepeatUntil repeat(List<Object> repeat) {
        this.repeat = repeat;
        return this;
    }

    /**
     * Adds and item into repeat.
     * <p>
     * Field description:
     * Array of actions to execute.
     * <p>
     * The field is required.
     *
     * @param repeatItem The item to be added to the list.
     * @return This {@link CallsRepeatUntil instance}.
     */
    public CallsRepeatUntil addRepeatItem(Object repeatItem) {
        if (this.repeat == null) {
            this.repeat = new ArrayList<>();
        }
        this.repeat.add(repeatItem);
        return this;
    }

    /**
     * Returns repeat.
     * <p>
     * Field description:
     * Array of actions to execute.
     * <p>
     * The field is required.
     *
     * @return repeat
     */
    @JsonProperty("repeat")
    public List<Object> getRepeat() {
        return repeat;
    }

    /**
     * Sets repeat.
     * <p>
     * Field description:
     * Array of actions to execute.
     * <p>
     * The field is required.
     *
     * @param repeat
     */
    @JsonProperty("repeat")
    public void setRepeat(List<Object> repeat) {
        this.repeat = repeat;
    }

    /**
     * Sets until.
     * <p>
     * Field description:
     * The expression to evaluate.
     * <p>
     * The field is required.
     *
     * @param until
     * @return This {@link CallsRepeatUntil instance}.
     */
    public CallsRepeatUntil until(String until) {
        this.until = until;
        return this;
    }

    /**
     * Returns until.
     * <p>
     * Field description:
     * The expression to evaluate.
     * <p>
     * The field is required.
     *
     * @return until
     */
    @JsonProperty("until")
    public String getUntil() {
        return until;
    }

    /**
     * Sets until.
     * <p>
     * Field description:
     * The expression to evaluate.
     * <p>
     * The field is required.
     *
     * @param until
     */
    @JsonProperty("until")
    public void setUntil(String until) {
        this.until = until;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CallsRepeatUntil callsRepeatUntil = (CallsRepeatUntil) o;
        return Objects.equals(this.repeat, callsRepeatUntil.repeat)
                && Objects.equals(this.until, callsRepeatUntil.until);
    }

    @Override
    public int hashCode() {
        return Objects.hash(repeat, until);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class CallsRepeatUntil {")
                .append(newLine)
                .append("    repeat: ")
                .append(toIndentedString(repeat))
                .append(newLine)
                .append("    until: ")
                .append(toIndentedString(until))
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
