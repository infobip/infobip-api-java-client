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
 * Represents CallsDtmfOptions model.
 */
public class CallsDtmfOptions {

    private Integer maxInputLength;

    private Object mappedValues;

    /**
     * Sets maxInputLength.
     * <p>
     * Field description:
     * Maximum acceptable number of digits. Capturing is stopped after this number of digits has been entered. Max accepted value is 255. If not set, maximum value will be used.
     *
     * @param maxInputLength
     * @return This {@link CallsDtmfOptions instance}.
     */
    public CallsDtmfOptions maxInputLength(Integer maxInputLength) {
        this.maxInputLength = maxInputLength;
        return this;
    }

    /**
     * Returns maxInputLength.
     * <p>
     * Field description:
     * Maximum acceptable number of digits. Capturing is stopped after this number of digits has been entered. Max accepted value is 255. If not set, maximum value will be used.
     *
     * @return maxInputLength
     */
    @JsonProperty("maxInputLength")
    public Integer getMaxInputLength() {
        return maxInputLength;
    }

    /**
     * Sets maxInputLength.
     * <p>
     * Field description:
     * Maximum acceptable number of digits. Capturing is stopped after this number of digits has been entered. Max accepted value is 255. If not set, maximum value will be used.
     *
     * @param maxInputLength
     */
    @JsonProperty("maxInputLength")
    public void setMaxInputLength(Integer maxInputLength) {
        this.maxInputLength = maxInputLength;
    }

    /**
     * Sets mappedValues.
     * <p>
     * Field description:
     * Map of expected collected DTMF values with some real meaning. (Example: if you have multilingual IVR, and option for users to press 1 to enter \&quot;English\&quot; menu, you can define {\&quot;1\&quot;:\&quot;English\&quot;}, so the reporting and analysis will be easier). When this option is defined additional variable is present in the scenario. If you set your capture action variable name to myVar, then you will get additional variable myVar_Meaning containing the mapped value for a collected DTMF.
     *
     * @param mappedValues
     * @return This {@link CallsDtmfOptions instance}.
     */
    public CallsDtmfOptions mappedValues(Object mappedValues) {
        this.mappedValues = mappedValues;
        return this;
    }

    /**
     * Returns mappedValues.
     * <p>
     * Field description:
     * Map of expected collected DTMF values with some real meaning. (Example: if you have multilingual IVR, and option for users to press 1 to enter \&quot;English\&quot; menu, you can define {\&quot;1\&quot;:\&quot;English\&quot;}, so the reporting and analysis will be easier). When this option is defined additional variable is present in the scenario. If you set your capture action variable name to myVar, then you will get additional variable myVar_Meaning containing the mapped value for a collected DTMF.
     *
     * @return mappedValues
     */
    @JsonProperty("mappedValues")
    public Object getMappedValues() {
        return mappedValues;
    }

    /**
     * Sets mappedValues.
     * <p>
     * Field description:
     * Map of expected collected DTMF values with some real meaning. (Example: if you have multilingual IVR, and option for users to press 1 to enter \&quot;English\&quot; menu, you can define {\&quot;1\&quot;:\&quot;English\&quot;}, so the reporting and analysis will be easier). When this option is defined additional variable is present in the scenario. If you set your capture action variable name to myVar, then you will get additional variable myVar_Meaning containing the mapped value for a collected DTMF.
     *
     * @param mappedValues
     */
    @JsonProperty("mappedValues")
    public void setMappedValues(Object mappedValues) {
        this.mappedValues = mappedValues;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CallsDtmfOptions callsDtmfOptions = (CallsDtmfOptions) o;
        return Objects.equals(this.maxInputLength, callsDtmfOptions.maxInputLength)
                && Objects.equals(this.mappedValues, callsDtmfOptions.mappedValues);
    }

    @Override
    public int hashCode() {
        return Objects.hash(maxInputLength, mappedValues);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class CallsDtmfOptions {")
                .append(newLine)
                .append("    maxInputLength: ")
                .append(toIndentedString(maxInputLength))
                .append(newLine)
                .append("    mappedValues: ")
                .append(toIndentedString(mappedValues))
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
