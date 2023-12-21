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
 * Represents CallsDialogWithExistingCallRequest model.
 */
public class CallsDialogWithExistingCallRequest {

    private CallsDialogRecordingRequest recording;

    private Integer maxDuration;

    private CallsDialogPropagationOptions propagationOptions;

    /**
     * Sets recording.
     *
     * @param recording
     * @return This {@link CallsDialogWithExistingCallRequest instance}.
     */
    public CallsDialogWithExistingCallRequest recording(CallsDialogRecordingRequest recording) {
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
     * @return This {@link CallsDialogWithExistingCallRequest instance}.
     */
    public CallsDialogWithExistingCallRequest maxDuration(Integer maxDuration) {
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
     * @return This {@link CallsDialogWithExistingCallRequest instance}.
     */
    public CallsDialogWithExistingCallRequest propagationOptions(CallsDialogPropagationOptions propagationOptions) {
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
        CallsDialogWithExistingCallRequest callsDialogWithExistingCallRequest = (CallsDialogWithExistingCallRequest) o;
        return Objects.equals(this.recording, callsDialogWithExistingCallRequest.recording)
                && Objects.equals(this.maxDuration, callsDialogWithExistingCallRequest.maxDuration)
                && Objects.equals(this.propagationOptions, callsDialogWithExistingCallRequest.propagationOptions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(recording, maxDuration, propagationOptions);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class CallsDialogWithExistingCallRequest {")
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
