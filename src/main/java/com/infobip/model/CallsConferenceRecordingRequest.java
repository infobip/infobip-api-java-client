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
 * Represents CallsConferenceRecordingRequest model.
 */
public class CallsConferenceRecordingRequest {

    private CallsRecordingType recordingType;

    private CallsConferenceComposition conferenceComposition;

    private Map<String, String> customData = null;

    private String filePrefix;

    /**
     * Sets recordingType.
     * <p>
     * The field is required.
     *
     * @param recordingType
     * @return This {@link CallsConferenceRecordingRequest instance}.
     */
    public CallsConferenceRecordingRequest recordingType(CallsRecordingType recordingType) {
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
     * Sets conferenceComposition.
     *
     * @param conferenceComposition
     * @return This {@link CallsConferenceRecordingRequest instance}.
     */
    public CallsConferenceRecordingRequest conferenceComposition(CallsConferenceComposition conferenceComposition) {
        this.conferenceComposition = conferenceComposition;
        return this;
    }

    /**
     * Returns conferenceComposition.
     *
     * @return conferenceComposition
     */
    @JsonProperty("conferenceComposition")
    public CallsConferenceComposition getConferenceComposition() {
        return conferenceComposition;
    }

    /**
     * Sets conferenceComposition.
     *
     * @param conferenceComposition
     */
    @JsonProperty("conferenceComposition")
    public void setConferenceComposition(CallsConferenceComposition conferenceComposition) {
        this.conferenceComposition = conferenceComposition;
    }

    /**
     * Sets customData.
     * <p>
     * Field description:
     * Custom data.
     *
     * @param customData
     * @return This {@link CallsConferenceRecordingRequest instance}.
     */
    public CallsConferenceRecordingRequest customData(Map<String, String> customData) {
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
     * @return This {@link CallsConferenceRecordingRequest instance}.
     */
    public CallsConferenceRecordingRequest putCustomDataItem(String key, String customDataItem) {
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
     * Custom name for the recording&#39;s zip file. Applicable only when SFTP server is enabled on [Voice settings page](https://portal.infobip.com/apps/voice/recording/settings). Using the same &#x60;filePrefix&#x60; will override the files on the SFTP server. For recording without composition, &#x60;callId&#x60; and &#x60;fileId&#x60; will be appended to the &#x60;filePrefix&#x60; value.
     *
     * @param filePrefix
     * @return This {@link CallsConferenceRecordingRequest instance}.
     */
    public CallsConferenceRecordingRequest filePrefix(String filePrefix) {
        this.filePrefix = filePrefix;
        return this;
    }

    /**
     * Returns filePrefix.
     * <p>
     * Field description:
     * Custom name for the recording&#39;s zip file. Applicable only when SFTP server is enabled on [Voice settings page](https://portal.infobip.com/apps/voice/recording/settings). Using the same &#x60;filePrefix&#x60; will override the files on the SFTP server. For recording without composition, &#x60;callId&#x60; and &#x60;fileId&#x60; will be appended to the &#x60;filePrefix&#x60; value.
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
     * Custom name for the recording&#39;s zip file. Applicable only when SFTP server is enabled on [Voice settings page](https://portal.infobip.com/apps/voice/recording/settings). Using the same &#x60;filePrefix&#x60; will override the files on the SFTP server. For recording without composition, &#x60;callId&#x60; and &#x60;fileId&#x60; will be appended to the &#x60;filePrefix&#x60; value.
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
        CallsConferenceRecordingRequest callsConferenceRecordingRequest = (CallsConferenceRecordingRequest) o;
        return Objects.equals(this.recordingType, callsConferenceRecordingRequest.recordingType)
                && Objects.equals(this.conferenceComposition, callsConferenceRecordingRequest.conferenceComposition)
                && Objects.equals(this.customData, callsConferenceRecordingRequest.customData)
                && Objects.equals(this.filePrefix, callsConferenceRecordingRequest.filePrefix);
    }

    @Override
    public int hashCode() {
        return Objects.hash(recordingType, conferenceComposition, customData, filePrefix);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class CallsConferenceRecordingRequest {")
                .append(newLine)
                .append("    recordingType: ")
                .append(toIndentedString(recordingType))
                .append(newLine)
                .append("    conferenceComposition: ")
                .append(toIndentedString(conferenceComposition))
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
