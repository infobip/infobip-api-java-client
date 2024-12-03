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
 * Set variable action makes it possible to set a variable defined inside the IVR scenario to a specified value.
 */
public class CallsSetVariable implements CallsScriptInner {

    private String setVariable;

    private String value;

    /**
     * Sets setVariable.
     * <p>
     * Field description:
     * Name of a variable.
     * <p>
     * The field is required.
     *
     * @param setVariable
     * @return This {@link CallsSetVariable instance}.
     */
    public CallsSetVariable setVariable(String setVariable) {
        this.setVariable = setVariable;
        return this;
    }

    /**
     * Returns setVariable.
     * <p>
     * Field description:
     * Name of a variable.
     * <p>
     * The field is required.
     *
     * @return setVariable
     */
    @JsonProperty("setVariable")
    public String getSetVariable() {
        return setVariable;
    }

    /**
     * Sets setVariable.
     * <p>
     * Field description:
     * Name of a variable.
     * <p>
     * The field is required.
     *
     * @param setVariable
     */
    @JsonProperty("setVariable")
    public void setSetVariable(String setVariable) {
        this.setVariable = setVariable;
    }

    /**
     * Sets value.
     * <p>
     * Field description:
     * Value to which the variable should be set.
     * <p>
     * The field is required.
     *
     * @param value
     * @return This {@link CallsSetVariable instance}.
     */
    public CallsSetVariable value(String value) {
        this.value = value;
        return this;
    }

    /**
     * Returns value.
     * <p>
     * Field description:
     * Value to which the variable should be set.
     * <p>
     * The field is required.
     *
     * @return value
     */
    @JsonProperty("value")
    public String getValue() {
        return value;
    }

    /**
     * Sets value.
     * <p>
     * Field description:
     * Value to which the variable should be set.
     * <p>
     * The field is required.
     *
     * @param value
     */
    @JsonProperty("value")
    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CallsSetVariable callsSetVariable = (CallsSetVariable) o;
        return Objects.equals(this.setVariable, callsSetVariable.setVariable)
                && Objects.equals(this.value, callsSetVariable.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(setVariable, value);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class CallsSetVariable {")
                .append(newLine)
                .append("    setVariable: ")
                .append(toIndentedString(setVariable))
                .append(newLine)
                .append("    value: ")
                .append(toIndentedString(value))
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
