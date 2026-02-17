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
 * Call recording information available when recording is started.
 */
public class CallRecordingStartedProperties {

    private CallsRecordingType recordingType;

    private String fileId;

    private Integer maxDuration;

    private Integer maxSilence;

    private Boolean beep;

    private String filePrefix;

    private Map<String, String> customData = null;

    /**
     * Sets recordingType.
     *
     * @param recordingType
     * @return This {@link CallRecordingStartedProperties instance}.
     */
    public CallRecordingStartedProperties recordingType(CallsRecordingType recordingType) {
        this.recordingType = recordingType;
        return this;
    }

    /**
     * Returns recordingType.
     *
     * @return recordingType
     */
    @JsonProperty("recordingType")
    public CallsRecordingType getRecordingType() {
        return recordingType;
    }

    /**
     * Sets recordingType.
     *
     * @param recordingType
     */
    @JsonProperty("recordingType")
    public void setRecordingType(CallsRecordingType recordingType) {
        this.recordingType = recordingType;
    }

    /**
     * Sets fileId.
     * <p>
     * Field description:
     * Recording file identifier.
     *
     * @param fileId
     * @return This {@link CallRecordingStartedProperties instance}.
     */
    public CallRecordingStartedProperties fileId(String fileId) {
        this.fileId = fileId;
        return this;
    }

    /**
     * Returns fileId.
     * <p>
     * Field description:
     * Recording file identifier.
     *
     * @return fileId
     */
    @JsonProperty("fileId")
    public String getFileId() {
        return fileId;
    }

    /**
     * Sets fileId.
     * <p>
     * Field description:
     * Recording file identifier.
     *
     * @param fileId
     */
    @JsonProperty("fileId")
    public void setFileId(String fileId) {
        this.fileId = fileId;
    }

    /**
     * Sets maxDuration.
     * <p>
     * Field description:
     * Maximum recording duration in seconds.
     *
     * @param maxDuration
     * @return This {@link CallRecordingStartedProperties instance}.
     */
    public CallRecordingStartedProperties maxDuration(Integer maxDuration) {
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
     * Sets maxSilence.
     * <p>
     * Field description:
     * Silence duration, in seconds, before the recording stops.
     *
     * @param maxSilence
     * @return This {@link CallRecordingStartedProperties instance}.
     */
    public CallRecordingStartedProperties maxSilence(Integer maxSilence) {
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
     * @return This {@link CallRecordingStartedProperties instance}.
     */
    public CallRecordingStartedProperties beep(Boolean beep) {
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
     * Sets filePrefix.
     * <p>
     * Field description:
     * Custom name for the recording&#39;s zip file.
     *
     * @param filePrefix
     * @return This {@link CallRecordingStartedProperties instance}.
     */
    public CallRecordingStartedProperties filePrefix(String filePrefix) {
        this.filePrefix = filePrefix;
        return this;
    }

    /**
     * Returns filePrefix.
     * <p>
     * Field description:
     * Custom name for the recording&#39;s zip file.
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
     * Custom name for the recording&#39;s zip file.
     *
     * @param filePrefix
     */
    @JsonProperty("filePrefix")
    public void setFilePrefix(String filePrefix) {
        this.filePrefix = filePrefix;
    }

    /**
     * Sets customData.
     * <p>
     * Field description:
     * Custom data.
     *
     * @param customData
     * @return This {@link CallRecordingStartedProperties instance}.
     */
    public CallRecordingStartedProperties customData(Map<String, String> customData) {
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
     * @return This {@link CallRecordingStartedProperties instance}.
     */
    public CallRecordingStartedProperties putCustomDataItem(String key, String customDataItem) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CallRecordingStartedProperties callRecordingStartedProperties = (CallRecordingStartedProperties) o;
        return Objects.equals(this.recordingType, callRecordingStartedProperties.recordingType)
                && Objects.equals(this.fileId, callRecordingStartedProperties.fileId)
                && Objects.equals(this.maxDuration, callRecordingStartedProperties.maxDuration)
                && Objects.equals(this.maxSilence, callRecordingStartedProperties.maxSilence)
                && Objects.equals(this.beep, callRecordingStartedProperties.beep)
                && Objects.equals(this.filePrefix, callRecordingStartedProperties.filePrefix)
                && Objects.equals(this.customData, callRecordingStartedProperties.customData);
    }

    @Override
    public int hashCode() {
        return Objects.hash(recordingType, fileId, maxDuration, maxSilence, beep, filePrefix, customData);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class CallRecordingStartedProperties {")
                .append(newLine)
                .append("    recordingType: ")
                .append(toIndentedString(recordingType))
                .append(newLine)
                .append("    fileId: ")
                .append(toIndentedString(fileId))
                .append(newLine)
                .append("    maxDuration: ")
                .append(toIndentedString(maxDuration))
                .append(newLine)
                .append("    maxSilence: ")
                .append(toIndentedString(maxSilence))
                .append(newLine)
                .append("    beep: ")
                .append(toIndentedString(beep))
                .append(newLine)
                .append("    filePrefix: ")
                .append(toIndentedString(filePrefix))
                .append(newLine)
                .append("    customData: ")
                .append(toIndentedString(customData))
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
