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
 * Represents CallsDialogRecordingRequest model.
 */
public class CallsDialogRecordingRequest {

    private CallsRecordingType recordingType;

    private CallsDialogRecordingComposition dialogComposition;

    private Map<String, String> customData = null;

    private String filePrefix;

    /**
     * Sets recordingType.
     * <p>
     * The field is required.
     *
     * @param recordingType
     * @return This {@link CallsDialogRecordingRequest instance}.
     */
    public CallsDialogRecordingRequest recordingType(CallsRecordingType recordingType) {
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
     * Sets dialogComposition.
     *
     * @param dialogComposition
     * @return This {@link CallsDialogRecordingRequest instance}.
     */
    public CallsDialogRecordingRequest dialogComposition(CallsDialogRecordingComposition dialogComposition) {
        this.dialogComposition = dialogComposition;
        return this;
    }

    /**
     * Returns dialogComposition.
     *
     * @return dialogComposition
     */
    @JsonProperty("dialogComposition")
    public CallsDialogRecordingComposition getDialogComposition() {
        return dialogComposition;
    }

    /**
     * Sets dialogComposition.
     *
     * @param dialogComposition
     */
    @JsonProperty("dialogComposition")
    public void setDialogComposition(CallsDialogRecordingComposition dialogComposition) {
        this.dialogComposition = dialogComposition;
    }

    /**
     * Sets customData.
     * <p>
     * Field description:
     * Custom data.
     *
     * @param customData
     * @return This {@link CallsDialogRecordingRequest instance}.
     */
    public CallsDialogRecordingRequest customData(Map<String, String> customData) {
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
     * @return This {@link CallsDialogRecordingRequest instance}.
     */
    public CallsDialogRecordingRequest putCustomDataItem(String key, String customDataItem) {
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
     * Custom name for the recording&#39;s zip file. Applicable only when SFTP server is enabled on [Voice settings page](https://portal.infobip.com/apps/voice/recording/settings). Using the same filePrefix will override the files on the SFTP server. For recordings without composition, &#x60;callId&#x60; and &#x60;fileId&#x60; will be appended to the &#x60;filePrefix&#x60; value.
     *
     * @param filePrefix
     * @return This {@link CallsDialogRecordingRequest instance}.
     */
    public CallsDialogRecordingRequest filePrefix(String filePrefix) {
        this.filePrefix = filePrefix;
        return this;
    }

    /**
     * Returns filePrefix.
     * <p>
     * Field description:
     * Custom name for the recording&#39;s zip file. Applicable only when SFTP server is enabled on [Voice settings page](https://portal.infobip.com/apps/voice/recording/settings). Using the same filePrefix will override the files on the SFTP server. For recordings without composition, &#x60;callId&#x60; and &#x60;fileId&#x60; will be appended to the &#x60;filePrefix&#x60; value.
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
     * Custom name for the recording&#39;s zip file. Applicable only when SFTP server is enabled on [Voice settings page](https://portal.infobip.com/apps/voice/recording/settings). Using the same filePrefix will override the files on the SFTP server. For recordings without composition, &#x60;callId&#x60; and &#x60;fileId&#x60; will be appended to the &#x60;filePrefix&#x60; value.
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
        CallsDialogRecordingRequest callsDialogRecordingRequest = (CallsDialogRecordingRequest) o;
        return Objects.equals(this.recordingType, callsDialogRecordingRequest.recordingType)
                && Objects.equals(this.dialogComposition, callsDialogRecordingRequest.dialogComposition)
                && Objects.equals(this.customData, callsDialogRecordingRequest.customData)
                && Objects.equals(this.filePrefix, callsDialogRecordingRequest.filePrefix);
    }

    @Override
    public int hashCode() {
        return Objects.hash(recordingType, dialogComposition, customData, filePrefix);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class CallsDialogRecordingRequest {")
                .append(newLine)
                .append("    recordingType: ")
                .append(toIndentedString(recordingType))
                .append(newLine)
                .append("    dialogComposition: ")
                .append(toIndentedString(dialogComposition))
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
