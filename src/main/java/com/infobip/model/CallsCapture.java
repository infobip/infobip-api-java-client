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
 * Capture action performs speech recognition of a specified duration. The recognized text can be used in other actions of the scenario.
 */
public class CallsCapture implements CallsScriptInner {

    private String capture;

    private Integer timeout;

    private CallsSpeechOptions speechOptions;

    private CallsDtmfOptions dtmfOptions;

    private CallsSendToReports sendToReports;

    private Integer actionId;

    /**
     * Sets capture.
     * <p>
     * Field description:
     * Variable name. If speech recognition matches one of the specified keyPhrases, a variable with this name will be set to match the keyphrase. Otherwise, this variable will be an empty string. Together with this variable, an implicit variable that contains the full text of the captured speech will be created. The name of this variable is constructed by adding _Full suffix to the variable name.
     * <p>
     * The field is required.
     *
     * @param capture
     * @return This {@link CallsCapture instance}.
     */
    public CallsCapture capture(String capture) {
        this.capture = capture;
        return this;
    }

    /**
     * Returns capture.
     * <p>
     * Field description:
     * Variable name. If speech recognition matches one of the specified keyPhrases, a variable with this name will be set to match the keyphrase. Otherwise, this variable will be an empty string. Together with this variable, an implicit variable that contains the full text of the captured speech will be created. The name of this variable is constructed by adding _Full suffix to the variable name.
     * <p>
     * The field is required.
     *
     * @return capture
     */
    @JsonProperty("capture")
    public String getCapture() {
        return capture;
    }

    /**
     * Sets capture.
     * <p>
     * Field description:
     * Variable name. If speech recognition matches one of the specified keyPhrases, a variable with this name will be set to match the keyphrase. Otherwise, this variable will be an empty string. Together with this variable, an implicit variable that contains the full text of the captured speech will be created. The name of this variable is constructed by adding _Full suffix to the variable name.
     * <p>
     * The field is required.
     *
     * @param capture
     */
    @JsonProperty("capture")
    public void setCapture(String capture) {
        this.capture = capture;
    }

    /**
     * Sets timeout.
     * <p>
     * Field description:
     * Number of seconds used for capturing speech or digits failover. Minimum value is 1 and maximum value is 30. Can be overriden with speechOptions.maxSilence.
     * <p>
     * The field is required.
     *
     * @param timeout
     * @return This {@link CallsCapture instance}.
     */
    public CallsCapture timeout(Integer timeout) {
        this.timeout = timeout;
        return this;
    }

    /**
     * Returns timeout.
     * <p>
     * Field description:
     * Number of seconds used for capturing speech or digits failover. Minimum value is 1 and maximum value is 30. Can be overriden with speechOptions.maxSilence.
     * <p>
     * The field is required.
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
     * Number of seconds used for capturing speech or digits failover. Minimum value is 1 and maximum value is 30. Can be overriden with speechOptions.maxSilence.
     * <p>
     * The field is required.
     *
     * @param timeout
     */
    @JsonProperty("timeout")
    public void setTimeout(Integer timeout) {
        this.timeout = timeout;
    }

    /**
     * Sets speechOptions.
     * <p>
     * The field is required.
     *
     * @param speechOptions
     * @return This {@link CallsCapture instance}.
     */
    public CallsCapture speechOptions(CallsSpeechOptions speechOptions) {
        this.speechOptions = speechOptions;
        return this;
    }

    /**
     * Returns speechOptions.
     * <p>
     * The field is required.
     *
     * @return speechOptions
     */
    @JsonProperty("speechOptions")
    public CallsSpeechOptions getSpeechOptions() {
        return speechOptions;
    }

    /**
     * Sets speechOptions.
     * <p>
     * The field is required.
     *
     * @param speechOptions
     */
    @JsonProperty("speechOptions")
    public void setSpeechOptions(CallsSpeechOptions speechOptions) {
        this.speechOptions = speechOptions;
    }

    /**
     * Sets dtmfOptions.
     *
     * @param dtmfOptions
     * @return This {@link CallsCapture instance}.
     */
    public CallsCapture dtmfOptions(CallsDtmfOptions dtmfOptions) {
        this.dtmfOptions = dtmfOptions;
        return this;
    }

    /**
     * Returns dtmfOptions.
     *
     * @return dtmfOptions
     */
    @JsonProperty("dtmfOptions")
    public CallsDtmfOptions getDtmfOptions() {
        return dtmfOptions;
    }

    /**
     * Sets dtmfOptions.
     *
     * @param dtmfOptions
     */
    @JsonProperty("dtmfOptions")
    public void setDtmfOptions(CallsDtmfOptions dtmfOptions) {
        this.dtmfOptions = dtmfOptions;
    }

    /**
     * Sets sendToReports.
     *
     * @param sendToReports
     * @return This {@link CallsCapture instance}.
     */
    public CallsCapture sendToReports(CallsSendToReports sendToReports) {
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
     * Sets actionId.
     * <p>
     * Field description:
     * User-defined ID of an action that can be used with go-to action.
     *
     * @param actionId
     * @return This {@link CallsCapture instance}.
     */
    public CallsCapture actionId(Integer actionId) {
        this.actionId = actionId;
        return this;
    }

    /**
     * Returns actionId.
     * <p>
     * Field description:
     * User-defined ID of an action that can be used with go-to action.
     *
     * @return actionId
     */
    @JsonProperty("actionId")
    public Integer getActionId() {
        return actionId;
    }

    /**
     * Sets actionId.
     * <p>
     * Field description:
     * User-defined ID of an action that can be used with go-to action.
     *
     * @param actionId
     */
    @JsonProperty("actionId")
    public void setActionId(Integer actionId) {
        this.actionId = actionId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CallsCapture callsCapture = (CallsCapture) o;
        return Objects.equals(this.capture, callsCapture.capture)
                && Objects.equals(this.timeout, callsCapture.timeout)
                && Objects.equals(this.speechOptions, callsCapture.speechOptions)
                && Objects.equals(this.dtmfOptions, callsCapture.dtmfOptions)
                && Objects.equals(this.sendToReports, callsCapture.sendToReports)
                && Objects.equals(this.actionId, callsCapture.actionId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(capture, timeout, speechOptions, dtmfOptions, sendToReports, actionId);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class CallsCapture {")
                .append(newLine)
                .append("    capture: ")
                .append(toIndentedString(capture))
                .append(newLine)
                .append("    timeout: ")
                .append(toIndentedString(timeout))
                .append(newLine)
                .append("    speechOptions: ")
                .append(toIndentedString(speechOptions))
                .append(newLine)
                .append("    dtmfOptions: ")
                .append(toIndentedString(dtmfOptions))
                .append(newLine)
                .append("    sendToReports: ")
                .append(toIndentedString(sendToReports))
                .append(newLine)
                .append("    actionId: ")
                .append(toIndentedString(actionId))
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
