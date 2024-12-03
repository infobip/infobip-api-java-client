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
 * Represents CallsGoToOptions model.
 */
public class CallsGoToOptions {

    private Integer goToLimit;

    private String countVariable;

    /**
     * Sets goToLimit.
     * <p>
     * Field description:
     * Maximum number of times goto can jump to specified action. Valid values are from 1 to 100.
     *
     * @param goToLimit
     * @return This {@link CallsGoToOptions instance}.
     */
    public CallsGoToOptions goToLimit(Integer goToLimit) {
        this.goToLimit = goToLimit;
        return this;
    }

    /**
     * Returns goToLimit.
     * <p>
     * Field description:
     * Maximum number of times goto can jump to specified action. Valid values are from 1 to 100.
     *
     * @return goToLimit
     */
    @JsonProperty("goToLimit")
    public Integer getGoToLimit() {
        return goToLimit;
    }

    /**
     * Sets goToLimit.
     * <p>
     * Field description:
     * Maximum number of times goto can jump to specified action. Valid values are from 1 to 100.
     *
     * @param goToLimit
     */
    @JsonProperty("goToLimit")
    public void setGoToLimit(Integer goToLimit) {
        this.goToLimit = goToLimit;
    }

    /**
     * Sets countVariable.
     * <p>
     * Field description:
     * Name of the variable which counts passes through goto action
     *
     * @param countVariable
     * @return This {@link CallsGoToOptions instance}.
     */
    public CallsGoToOptions countVariable(String countVariable) {
        this.countVariable = countVariable;
        return this;
    }

    /**
     * Returns countVariable.
     * <p>
     * Field description:
     * Name of the variable which counts passes through goto action
     *
     * @return countVariable
     */
    @JsonProperty("countVariable")
    public String getCountVariable() {
        return countVariable;
    }

    /**
     * Sets countVariable.
     * <p>
     * Field description:
     * Name of the variable which counts passes through goto action
     *
     * @param countVariable
     */
    @JsonProperty("countVariable")
    public void setCountVariable(String countVariable) {
        this.countVariable = countVariable;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CallsGoToOptions callsGoToOptions = (CallsGoToOptions) o;
        return Objects.equals(this.goToLimit, callsGoToOptions.goToLimit)
                && Objects.equals(this.countVariable, callsGoToOptions.countVariable);
    }

    @Override
    public int hashCode() {
        return Objects.hash(goToLimit, countVariable);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class CallsGoToOptions {")
                .append(newLine)
                .append("    goToLimit: ")
                .append(toIndentedString(goToLimit))
                .append(newLine)
                .append("    countVariable: ")
                .append(toIndentedString(countVariable))
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
