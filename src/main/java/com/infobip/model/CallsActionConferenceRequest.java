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
 * Represents CallsActionConferenceRequest model.
 */
public class CallsActionConferenceRequest {

    private String name;

    private CallsConferenceRecordingRequest recording;

    private Integer maxDuration;

    /**
     * Sets name.
     * <p>
     * Field description:
     * Conference name, will be auto-generated if not provided.
     *
     * @param name
     * @return This {@link CallsActionConferenceRequest instance}.
     */
    public CallsActionConferenceRequest name(String name) {
        this.name = name;
        return this;
    }

    /**
     * Returns name.
     * <p>
     * Field description:
     * Conference name, will be auto-generated if not provided.
     *
     * @return name
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * Sets name.
     * <p>
     * Field description:
     * Conference name, will be auto-generated if not provided.
     *
     * @param name
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Sets recording.
     *
     * @param recording
     * @return This {@link CallsActionConferenceRequest instance}.
     */
    public CallsActionConferenceRequest recording(CallsConferenceRecordingRequest recording) {
        this.recording = recording;
        return this;
    }

    /**
     * Returns recording.
     *
     * @return recording
     */
    @JsonProperty("recording")
    public CallsConferenceRecordingRequest getRecording() {
        return recording;
    }

    /**
     * Sets recording.
     *
     * @param recording
     */
    @JsonProperty("recording")
    public void setRecording(CallsConferenceRecordingRequest recording) {
        this.recording = recording;
    }

    /**
     * Sets maxDuration.
     * <p>
     * Field description:
     * Max duration in seconds.
     *
     * @param maxDuration
     * @return This {@link CallsActionConferenceRequest instance}.
     */
    public CallsActionConferenceRequest maxDuration(Integer maxDuration) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CallsActionConferenceRequest callsActionConferenceRequest = (CallsActionConferenceRequest) o;
        return Objects.equals(this.name, callsActionConferenceRequest.name)
                && Objects.equals(this.recording, callsActionConferenceRequest.recording)
                && Objects.equals(this.maxDuration, callsActionConferenceRequest.maxDuration);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, recording, maxDuration);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class CallsActionConferenceRequest {")
                .append(newLine)
                .append("    name: ")
                .append(toIndentedString(name))
                .append(newLine)
                .append("    recording: ")
                .append(toIndentedString(recording))
                .append(newLine)
                .append("    maxDuration: ")
                .append(toIndentedString(maxDuration))
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
