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
 * Represents CallsDialogRequest model.
 */
public class CallsDialogRequest {

    private String parentCallId;

    private CallsDialogCallRequest childCallRequest;

    private CallsDialogRecordingRequest recording;

    private Integer maxDuration;

    private CallsDialogPropagationOptions propagationOptions;

    /**
     * Sets parentCallId.
     * <p>
     * Field description:
     * Unique parent call ID.
     * <p>
     * The field is required.
     *
     * @param parentCallId
     * @return This {@link CallsDialogRequest instance}.
     */
    public CallsDialogRequest parentCallId(String parentCallId) {
        this.parentCallId = parentCallId;
        return this;
    }

    /**
     * Returns parentCallId.
     * <p>
     * Field description:
     * Unique parent call ID.
     * <p>
     * The field is required.
     *
     * @return parentCallId
     */
    @JsonProperty("parentCallId")
    public String getParentCallId() {
        return parentCallId;
    }

    /**
     * Sets parentCallId.
     * <p>
     * Field description:
     * Unique parent call ID.
     * <p>
     * The field is required.
     *
     * @param parentCallId
     */
    @JsonProperty("parentCallId")
    public void setParentCallId(String parentCallId) {
        this.parentCallId = parentCallId;
    }

    /**
     * Sets childCallRequest.
     *
     * @param childCallRequest
     * @return This {@link CallsDialogRequest instance}.
     */
    public CallsDialogRequest childCallRequest(CallsDialogCallRequest childCallRequest) {
        this.childCallRequest = childCallRequest;
        return this;
    }

    /**
     * Returns childCallRequest.
     *
     * @return childCallRequest
     */
    @JsonProperty("childCallRequest")
    public CallsDialogCallRequest getChildCallRequest() {
        return childCallRequest;
    }

    /**
     * Sets childCallRequest.
     *
     * @param childCallRequest
     */
    @JsonProperty("childCallRequest")
    public void setChildCallRequest(CallsDialogCallRequest childCallRequest) {
        this.childCallRequest = childCallRequest;
    }

    /**
     * Sets recording.
     *
     * @param recording
     * @return This {@link CallsDialogRequest instance}.
     */
    public CallsDialogRequest recording(CallsDialogRecordingRequest recording) {
        this.recording = recording;
        return this;
    }

    /**
     * Returns recording.
     *
     * @return recording
     */
    @JsonProperty("recording")
    public CallsDialogRecordingRequest getRecording() {
        return recording;
    }

    /**
     * Sets recording.
     *
     * @param recording
     */
    @JsonProperty("recording")
    public void setRecording(CallsDialogRecordingRequest recording) {
        this.recording = recording;
    }

    /**
     * Sets maxDuration.
     * <p>
     * Field description:
     * Max duration in seconds.
     *
     * @param maxDuration
     * @return This {@link CallsDialogRequest instance}.
     */
    public CallsDialogRequest maxDuration(Integer maxDuration) {
        this.maxDuration = maxDuration;
        return this;
    }

    /**
     * Returns maxDuration.
     * <p>
     * Field description:
     * Max duration in seconds.
     *
     * @return maxDuration
     */
    @JsonProperty("maxDuration")
    public Integer getMaxDuration() {
        return maxDuration;
    }

    /**
     * Sets maxDuration.
     * <p>
     * Field description:
     * Max duration in seconds.
     *
     * @param maxDuration
     */
    @JsonProperty("maxDuration")
    public void setMaxDuration(Integer maxDuration) {
        this.maxDuration = maxDuration;
    }

    /**
     * Sets propagationOptions.
     *
     * @param propagationOptions
     * @return This {@link CallsDialogRequest instance}.
     */
    public CallsDialogRequest propagationOptions(CallsDialogPropagationOptions propagationOptions) {
        this.propagationOptions = propagationOptions;
        return this;
    }

    /**
     * Returns propagationOptions.
     *
     * @return propagationOptions
     */
    @JsonProperty("propagationOptions")
    public CallsDialogPropagationOptions getPropagationOptions() {
        return propagationOptions;
    }

    /**
     * Sets propagationOptions.
     *
     * @param propagationOptions
     */
    @JsonProperty("propagationOptions")
    public void setPropagationOptions(CallsDialogPropagationOptions propagationOptions) {
        this.propagationOptions = propagationOptions;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CallsDialogRequest callsDialogRequest = (CallsDialogRequest) o;
        return Objects.equals(this.parentCallId, callsDialogRequest.parentCallId)
                && Objects.equals(this.childCallRequest, callsDialogRequest.childCallRequest)
                && Objects.equals(this.recording, callsDialogRequest.recording)
                && Objects.equals(this.maxDuration, callsDialogRequest.maxDuration)
                && Objects.equals(this.propagationOptions, callsDialogRequest.propagationOptions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(parentCallId, childCallRequest, recording, maxDuration, propagationOptions);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class CallsDialogRequest {")
                .append(newLine)
                .append("    parentCallId: ")
                .append(toIndentedString(parentCallId))
                .append(newLine)
                .append("    childCallRequest: ")
                .append(toIndentedString(childCallRequest))
                .append(newLine)
                .append("    recording: ")
                .append(toIndentedString(recording))
                .append(newLine)
                .append("    maxDuration: ")
                .append(toIndentedString(maxDuration))
                .append(newLine)
                .append("    propagationOptions: ")
                .append(toIndentedString(propagationOptions))
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
