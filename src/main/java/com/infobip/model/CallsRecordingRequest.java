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
 * Represents CallsRecordingRequest model.
 */
public class CallsRecordingRequest {

    private CallsRecordingType recordingType;

    private Integer maxSilence;

    private Boolean beep;

    private Integer maxDuration;

    private Map<String, String> customData = null;

    private String filePrefix;

    /**
     * Sets recordingType.
     * <p>
     * The field is required.
     *
     * @param recordingType
     * @return This {@link CallsRecordingRequest instance}.
     */
    public CallsRecordingRequest recordingType(CallsRecordingType recordingType) {
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
     * Sets maxSilence.
     * <p>
     * Field description:
     * Silence duration, in seconds, before the recording stops.
     *
     * @param maxSilence
     * @return This {@link CallsRecordingRequest instance}.
     */
    public CallsRecordingRequest maxSilence(Integer maxSilence) {
        this.maxSilence = maxSilence;
        return this;
    }

    /**
     * Returns maxSilence.
     * <p>
     * Field description:
     * Silence duration, in seconds, before the recording stops.
     *
     * @return maxSilence
     */
    @JsonProperty("maxSilence")
    public Integer getMaxSilence() {
        return maxSilence;
    }

    /**
     * Sets maxSilence.
     * <p>
     * Field description:
     * Silence duration, in seconds, before the recording stops.
     *
     * @param maxSilence
     */
    @JsonProperty("maxSilence")
    public void setMaxSilence(Integer maxSilence) {
        this.maxSilence = maxSilence;
    }

    /**
     * Sets beep.
     * <p>
     * Field description:
     * Flag indicating if a beep sound should be played before recording.
     *
     * @param beep
     * @return This {@link CallsRecordingRequest instance}.
     */
    public CallsRecordingRequest beep(Boolean beep) {
        this.beep = beep;
        return this;
    }

    /**
     * Returns beep.
     * <p>
     * Field description:
     * Flag indicating if a beep sound should be played before recording.
     *
     * @return beep
     */
    @JsonProperty("beep")
    public Boolean getBeep() {
        return beep;
    }

    /**
     * Sets beep.
     * <p>
     * Field description:
     * Flag indicating if a beep sound should be played before recording.
     *
     * @param beep
     */
    @JsonProperty("beep")
    public void setBeep(Boolean beep) {
        this.beep = beep;
    }

    /**
     * Sets maxDuration.
     * <p>
     * Field description:
     * Maximum recording duration in seconds.
     *
     * @param maxDuration
     * @return This {@link CallsRecordingRequest instance}.
     */
    public CallsRecordingRequest maxDuration(Integer maxDuration) {
        this.maxDuration = maxDuration;
        return this;
    }

    /**
     * Returns maxDuration.
     * <p>
     * Field description:
     * Maximum recording duration in seconds.
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
     * Maximum recording duration in seconds.
     *
     * @param maxDuration
     */
    @JsonProperty("maxDuration")
    public void setMaxDuration(Integer maxDuration) {
        this.maxDuration = maxDuration;
    }

    /**
     * Sets customData.
     * <p>
     * Field description:
     * Custom data.
     *
     * @param customData
     * @return This {@link CallsRecordingRequest instance}.
     */
    public CallsRecordingRequest customData(Map<String, String> customData) {
        this.customData = customData;
        return this;
    }

    /**
     * Puts and entry into customData.
     * <p>
     * Field description:
     * Custom data.
     *
     * @param key The given key.
     * @param customDataItem The item to be associated with the given key.
     * @return This {@link CallsRecordingRequest instance}.
     */
    public CallsRecordingRequest putCustomDataItem(String key, String customDataItem) {
        if (this.customData == null) {
            this.customData = new HashMap<>();
        }
        this.customData.put(key, customDataItem);
        return this;
    }

    /**
     * Returns customData.
     * <p>
     * Field description:
     * Custom data.
     *
     * @return customData
     */
    @JsonProperty("customData")
    public Map<String, String> getCustomData() {
        return customData;
    }

    /**
     * Sets customData.
     * <p>
     * Field description:
     * Custom data.
     *
     * @param customData
     */
    @JsonProperty("customData")
    public void setCustomData(Map<String, String> customData) {
        this.customData = customData;
    }

    /**
     * Sets filePrefix.
     * <p>
     * Field description:
     * Custom name for the recording&#39;s zip file. Applicable only when SFTP server is enabled on [Voice settings page](https://portal.infobip.com/apps/voice/recording/settings). Using the same &#x60;filePrefix&#x60; will override the files on the SFTP server.
     *
     * @param filePrefix
     * @return This {@link CallsRecordingRequest instance}.
     */
    public CallsRecordingRequest filePrefix(String filePrefix) {
        this.filePrefix = filePrefix;
        return this;
    }

    /**
     * Returns filePrefix.
     * <p>
     * Field description:
     * Custom name for the recording&#39;s zip file. Applicable only when SFTP server is enabled on [Voice settings page](https://portal.infobip.com/apps/voice/recording/settings). Using the same &#x60;filePrefix&#x60; will override the files on the SFTP server.
     *
     * @return filePrefix
     */
    @JsonProperty("filePrefix")
    public String getFilePrefix() {
        return filePrefix;
    }

    /**
     * Sets filePrefix.
     * <p>
     * Field description:
     * Custom name for the recording&#39;s zip file. Applicable only when SFTP server is enabled on [Voice settings page](https://portal.infobip.com/apps/voice/recording/settings). Using the same &#x60;filePrefix&#x60; will override the files on the SFTP server.
     *
     * @param filePrefix
     */
    @JsonProperty("filePrefix")
    public void setFilePrefix(String filePrefix) {
        this.filePrefix = filePrefix;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CallsRecordingRequest callsRecordingRequest = (CallsRecordingRequest) o;
        return Objects.equals(this.recordingType, callsRecordingRequest.recordingType)
                && Objects.equals(this.maxSilence, callsRecordingRequest.maxSilence)
                && Objects.equals(this.beep, callsRecordingRequest.beep)
                && Objects.equals(this.maxDuration, callsRecordingRequest.maxDuration)
                && Objects.equals(this.customData, callsRecordingRequest.customData)
                && Objects.equals(this.filePrefix, callsRecordingRequest.filePrefix);
    }

    @Override
    public int hashCode() {
        return Objects.hash(recordingType, maxSilence, beep, maxDuration, customData, filePrefix);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class CallsRecordingRequest {")
                .append(newLine)
                .append("    recordingType: ")
                .append(toIndentedString(recordingType))
                .append(newLine)
                .append("    maxSilence: ")
                .append(toIndentedString(maxSilence))
                .append(newLine)
                .append("    beep: ")
                .append(toIndentedString(beep))
                .append(newLine)
                .append("    maxDuration: ")
                .append(toIndentedString(maxDuration))
                .append(newLine)
                .append("    customData: ")
                .append(toIndentedString(customData))
                .append(newLine)
                .append("    filePrefix: ")
                .append(toIndentedString(filePrefix))
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
