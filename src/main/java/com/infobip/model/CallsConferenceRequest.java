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
 * Represents CallsConferenceRequest model.
 */
public class CallsConferenceRequest {

    private String name;

    private CallsConferenceRecordingRequest recording;

    private Integer maxDuration;

    private String callsConfigurationId;

    private CallsPlatform platform;

    /**
     * Sets name.
     * <p>
     * Field description:
     * Conference name, will be auto-generated if not provided.
     *
     * @param name
     * @return This {@link CallsConferenceRequest instance}.
     */
    public CallsConferenceRequest name(String name) {
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
     * @return This {@link CallsConferenceRequest instance}.
     */
    public CallsConferenceRequest recording(CallsConferenceRecordingRequest recording) {
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
     * @return This {@link CallsConferenceRequest instance}.
     */
    public CallsConferenceRequest maxDuration(Integer maxDuration) {
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
     * Sets callsConfigurationId.
     * <p>
     * Field description:
     * Calls Configuration ID.
     * <p>
     * The field is required.
     *
     * @param callsConfigurationId
     * @return This {@link CallsConferenceRequest instance}.
     */
    public CallsConferenceRequest callsConfigurationId(String callsConfigurationId) {
        this.callsConfigurationId = callsConfigurationId;
        return this;
    }

    /**
     * Returns callsConfigurationId.
     * <p>
     * Field description:
     * Calls Configuration ID.
     * <p>
     * The field is required.
     *
     * @return callsConfigurationId
     */
    @JsonProperty("callsConfigurationId")
    public String getCallsConfigurationId() {
        return callsConfigurationId;
    }

    /**
     * Sets callsConfigurationId.
     * <p>
     * Field description:
     * Calls Configuration ID.
     * <p>
     * The field is required.
     *
     * @param callsConfigurationId
     */
    @JsonProperty("callsConfigurationId")
    public void setCallsConfigurationId(String callsConfigurationId) {
        this.callsConfigurationId = callsConfigurationId;
    }

    /**
     * Sets platform.
     *
     * @param platform
     * @return This {@link CallsConferenceRequest instance}.
     */
    public CallsConferenceRequest platform(CallsPlatform platform) {
        this.platform = platform;
        return this;
    }

    /**
     * Returns platform.
     *
     * @return platform
     */
    @JsonProperty("platform")
    public CallsPlatform getPlatform() {
        return platform;
    }

    /**
     * Sets platform.
     *
     * @param platform
     */
    @JsonProperty("platform")
    public void setPlatform(CallsPlatform platform) {
        this.platform = platform;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CallsConferenceRequest callsConferenceRequest = (CallsConferenceRequest) o;
        return Objects.equals(this.name, callsConferenceRequest.name)
                && Objects.equals(this.recording, callsConferenceRequest.recording)
                && Objects.equals(this.maxDuration, callsConferenceRequest.maxDuration)
                && Objects.equals(this.callsConfigurationId, callsConferenceRequest.callsConfigurationId)
                && Objects.equals(this.platform, callsConferenceRequest.platform);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, recording, maxDuration, callsConfigurationId, platform);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class CallsConferenceRequest {")
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
                .append("    callsConfigurationId: ")
                .append(toIndentedString(callsConfigurationId))
                .append(newLine)
                .append("    platform: ")
                .append(toIndentedString(platform))
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
