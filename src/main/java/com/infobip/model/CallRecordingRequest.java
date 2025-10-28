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
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Represents CallRecordingRequest model.
 */
public class CallRecordingRequest {

    private CallsRecordingType recordingType;

    private Map<String, String> customData = null;

    private String filePrefix;

    private CallsRecordingChannels channels;

    /**
     * Sets recordingType.
     * <p>
     * The field is required.
     *
     * @param recordingType
     * @return This {@link CallRecordingRequest instance}.
     */
    public CallRecordingRequest recordingType(CallsRecordingType recordingType) {
        this.recordingType = recordingType;
        return this;
    }

    /**
     * Returns recordingType.
     * <p>
     * The field is required.
     *
     * @return recordingType
     */
    @JsonProperty("recordingType")
    public CallsRecordingType getRecordingType() {
        return recordingType;
    }

    /**
     * Sets recordingType.
     * <p>
     * The field is required.
     *
     * @param recordingType
     */
    @JsonProperty("recordingType")
    public void setRecordingType(CallsRecordingType recordingType) {
        this.recordingType = recordingType;
    }

    /**
     * Sets customData.
     *
     * @param customData
     * @return This {@link CallRecordingRequest instance}.
     */
    public CallRecordingRequest customData(Map<String, String> customData) {
        this.customData = customData;
        return this;
    }

    /**
     * Puts and entry into customData.
     *
     * @param key The given key.
     * @param customDataItem The item to be associated with the given key.
     * @return This {@link CallRecordingRequest instance}.
     */
    public CallRecordingRequest putCustomDataItem(String key, String customDataItem) {
        if (this.customData == null) {
            this.customData = new HashMap<>();
        }
        this.customData.put(key, customDataItem);
        return this;
    }

    /**
     * Returns customData.
     *
     * @return customData
     */
    @JsonProperty("customData")
    public Map<String, String> getCustomData() {
        return customData;
    }

    /**
     * Sets customData.
     *
     * @param customData
     */
    @JsonProperty("customData")
    public void setCustomData(Map<String, String> customData) {
        this.customData = customData;
    }

    /**
     * Sets filePrefix.
     *
     * @param filePrefix
     * @return This {@link CallRecordingRequest instance}.
     */
    public CallRecordingRequest filePrefix(String filePrefix) {
        this.filePrefix = filePrefix;
        return this;
    }

    /**
     * Returns filePrefix.
     *
     * @return filePrefix
     */
    @JsonProperty("filePrefix")
    public String getFilePrefix() {
        return filePrefix;
    }

    /**
     * Sets filePrefix.
     *
     * @param filePrefix
     */
    @JsonProperty("filePrefix")
    public void setFilePrefix(String filePrefix) {
        this.filePrefix = filePrefix;
    }

    /**
     * Sets channels.
     *
     * @param channels
     * @return This {@link CallRecordingRequest instance}.
     */
    public CallRecordingRequest channels(CallsRecordingChannels channels) {
        this.channels = channels;
        return this;
    }

    /**
     * Returns channels.
     *
     * @return channels
     */
    @JsonProperty("channels")
    public CallsRecordingChannels getChannels() {
        return channels;
    }

    /**
     * Sets channels.
     *
     * @param channels
     */
    @JsonProperty("channels")
    public void setChannels(CallsRecordingChannels channels) {
        this.channels = channels;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CallRecordingRequest callRecordingRequest = (CallRecordingRequest) o;
        return Objects.equals(this.recordingType, callRecordingRequest.recordingType)
                && Objects.equals(this.customData, callRecordingRequest.customData)
                && Objects.equals(this.filePrefix, callRecordingRequest.filePrefix)
                && Objects.equals(this.channels, callRecordingRequest.channels);
    }

    @Override
    public int hashCode() {
        return Objects.hash(recordingType, customData, filePrefix, channels);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class CallRecordingRequest {")
                .append(newLine)
                .append("    recordingType: ")
                .append(toIndentedString(recordingType))
                .append(newLine)
                .append("    customData: ")
                .append(toIndentedString(customData))
                .append(newLine)
                .append("    filePrefix: ")
                .append(toIndentedString(filePrefix))
                .append(newLine)
                .append("    channels: ")
                .append(toIndentedString(channels))
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
