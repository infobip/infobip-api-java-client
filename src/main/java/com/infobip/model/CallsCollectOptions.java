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
 * Represents CallsCollectOptions model.
 */
public class CallsCollectOptions {

    private Integer maxInputLength;

    private Integer timeout;

    private CallsSendToReports sendToReports;

    private Object mappedValues;

    /**
     * Sets maxInputLength.
     * <p>
     * Field description:
     * Maximum acceptable number of digits. Stops reading after maxdigits have been entered (without requiring the user to press &#39;#&#39; key). Max accepted value is 255. If set to 0 then max value is applied.
     *
     * @param maxInputLength
     * @return This {@link CallsCollectOptions instance}.
     */
    public CallsCollectOptions maxInputLength(Integer maxInputLength) {
        this.maxInputLength = maxInputLength;
        return this;
    }

    /**
     * Returns maxInputLength.
     * <p>
     * Field description:
     * Maximum acceptable number of digits. Stops reading after maxdigits have been entered (without requiring the user to press &#39;#&#39; key). Max accepted value is 255. If set to 0 then max value is applied.
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
     * Maximum acceptable number of digits. Stops reading after maxdigits have been entered (without requiring the user to press &#39;#&#39; key). Max accepted value is 255. If set to 0 then max value is applied.
     *
     * @param maxInputLength
     */
    @JsonProperty("maxInputLength")
    public void setMaxInputLength(Integer maxInputLength) {
        this.maxInputLength = maxInputLength;
    }

    /**
     * Sets timeout.
     * <p>
     * Field description:
     * Timeout in seconds for user to press both first DTMF and all other inter-digit DTMFs. Default value is 5. Max value is 30.
     *
     * @param timeout
     * @return This {@link CallsCollectOptions instance}.
     */
    public CallsCollectOptions timeout(Integer timeout) {
        this.timeout = timeout;
        return this;
    }

    /**
     * Returns timeout.
     * <p>
     * Field description:
     * Timeout in seconds for user to press both first DTMF and all other inter-digit DTMFs. Default value is 5. Max value is 30.
     *
     * @return timeout
     */
    @JsonProperty("timeout")
    public Integer getTimeout() {
        return timeout;
    }

    /**
     * Sets timeout.
     * <p>
     * Field description:
     * Timeout in seconds for user to press both first DTMF and all other inter-digit DTMFs. Default value is 5. Max value is 30.
     *
     * @param timeout
     */
    @JsonProperty("timeout")
    public void setTimeout(Integer timeout) {
        this.timeout = timeout;
    }

    /**
     * Sets sendToReports.
     *
     * @param sendToReports
     * @return This {@link CallsCollectOptions instance}.
     */
    public CallsCollectOptions sendToReports(CallsSendToReports sendToReports) {
        this.sendToReports = sendToReports;
        return this;
    }

    /**
     * Returns sendToReports.
     *
     * @return sendToReports
     */
    @JsonProperty("sendToReports")
    public CallsSendToReports getSendToReports() {
        return sendToReports;
    }

    /**
     * Sets sendToReports.
     *
     * @param sendToReports
     */
    @JsonProperty("sendToReports")
    public void setSendToReports(CallsSendToReports sendToReports) {
        this.sendToReports = sendToReports;
    }

    /**
     * Sets mappedValues.
     * <p>
     * Field description:
     * Map of expected collected DTMF values with some real meaning. (Example: if you have multilingual IVR, and option for users to press 1 to enter \&quot;English\&quot; menu, you can define {\&quot;1\&quot;:\&quot;English\&quot;}, so the reporting and analysis will be easier). When this option is defined additional variable is present in the scenario. If you set your collect action variable name to myVar, then you will get additional variable myVar_Meaning containing the mapped value for a collected DTMF.
     *
     * @param mappedValues
     * @return This {@link CallsCollectOptions instance}.
     */
    public CallsCollectOptions mappedValues(Object mappedValues) {
        this.mappedValues = mappedValues;
        return this;
    }

    /**
     * Returns mappedValues.
     * <p>
     * Field description:
     * Map of expected collected DTMF values with some real meaning. (Example: if you have multilingual IVR, and option for users to press 1 to enter \&quot;English\&quot; menu, you can define {\&quot;1\&quot;:\&quot;English\&quot;}, so the reporting and analysis will be easier). When this option is defined additional variable is present in the scenario. If you set your collect action variable name to myVar, then you will get additional variable myVar_Meaning containing the mapped value for a collected DTMF.
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
     * Map of expected collected DTMF values with some real meaning. (Example: if you have multilingual IVR, and option for users to press 1 to enter \&quot;English\&quot; menu, you can define {\&quot;1\&quot;:\&quot;English\&quot;}, so the reporting and analysis will be easier). When this option is defined additional variable is present in the scenario. If you set your collect action variable name to myVar, then you will get additional variable myVar_Meaning containing the mapped value for a collected DTMF.
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
        CallsCollectOptions callsCollectOptions = (CallsCollectOptions) o;
        return Objects.equals(this.maxInputLength, callsCollectOptions.maxInputLength)
                && Objects.equals(this.timeout, callsCollectOptions.timeout)
                && Objects.equals(this.sendToReports, callsCollectOptions.sendToReports)
                && Objects.equals(this.mappedValues, callsCollectOptions.mappedValues);
    }

    @Override
    public int hashCode() {
        return Objects.hash(maxInputLength, timeout, sendToReports, mappedValues);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class CallsCollectOptions {")
                .append(newLine)
                .append("    maxInputLength: ")
                .append(toIndentedString(maxInputLength))
                .append(newLine)
                .append("    timeout: ")
                .append(toIndentedString(timeout))
                .append(newLine)
                .append("    sendToReports: ")
                .append(toIndentedString(sendToReports))
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
