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
 * Recording information available when recording is started.
 */
public class CallsRecordingStartedProperties {

    private CallsRecordingType recordingType;

    private Boolean composition;

    private String filePrefix;

    private Map<String, String> customData = null;

    /**
     * Sets recordingType.
     *
     * @param recordingType
     * @return This {@link CallsRecordingStartedProperties instance}.
     */
    public CallsRecordingStartedProperties recordingType(CallsRecordingType recordingType) {
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
     * Sets composition.
     * <p>
     * Field description:
     * Flag indicating whether auto-compose feature was turned on for the recording.
     *
     * @param composition
     * @return This {@link CallsRecordingStartedProperties instance}.
     */
    public CallsRecordingStartedProperties composition(Boolean composition) {
        this.composition = composition;
        return this;
    }

    /**
     * Returns composition.
     * <p>
     * Field description:
     * Flag indicating whether auto-compose feature was turned on for the recording.
     *
     * @return composition
     */
    @JsonProperty("composition")
    public Boolean getComposition() {
        return composition;
    }

    /**
     * Sets composition.
     * <p>
     * Field description:
     * Flag indicating whether auto-compose feature was turned on for the recording.
     *
     * @param composition
     */
    @JsonProperty("composition")
    public void setComposition(Boolean composition) {
        this.composition = composition;
    }

    /**
     * Sets filePrefix.
     * <p>
     * Field description:
     * Custom name for the recording&#39;s zip file.
     *
     * @param filePrefix
     * @return This {@link CallsRecordingStartedProperties instance}.
     */
    public CallsRecordingStartedProperties filePrefix(String filePrefix) {
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
     * @return This {@link CallsRecordingStartedProperties instance}.
     */
    public CallsRecordingStartedProperties customData(Map<String, String> customData) {
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
     * @return This {@link CallsRecordingStartedProperties instance}.
     */
    public CallsRecordingStartedProperties putCustomDataItem(String key, String customDataItem) {
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
        CallsRecordingStartedProperties callsRecordingStartedProperties = (CallsRecordingStartedProperties) o;
        return Objects.equals(this.recordingType, callsRecordingStartedProperties.recordingType)
                && Objects.equals(this.composition, callsRecordingStartedProperties.composition)
                && Objects.equals(this.filePrefix, callsRecordingStartedProperties.filePrefix)
                && Objects.equals(this.customData, callsRecordingStartedProperties.customData);
    }

    @Override
    public int hashCode() {
        return Objects.hash(recordingType, composition, filePrefix, customData);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class CallsRecordingStartedProperties {")
                .append(newLine)
                .append("    recordingType: ")
                .append(toIndentedString(recordingType))
                .append(newLine)
                .append("    composition: ")
                .append(toIndentedString(composition))
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
