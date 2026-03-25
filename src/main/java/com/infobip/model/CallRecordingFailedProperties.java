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
 * Represents CallRecordingFailedProperties model.
 */
public class CallRecordingFailedProperties {

    private String reason;

    private Map<String, String> recordingCustomData = null;

    private String fileId;

    /**
     * Sets reason.
     * <p>
     * Field description:
     * Recording failure reason.
     *
     * @param reason
     * @return This {@link CallRecordingFailedProperties instance}.
     */
    public CallRecordingFailedProperties reason(String reason) {
        this.reason = reason;
        return this;
    }

    /**
     * Returns reason.
     * <p>
     * Field description:
     * Recording failure reason.
     *
     * @return reason
     */
    @JsonProperty("reason")
    public String getReason() {
        return reason;
    }

    /**
     * Sets reason.
     * <p>
     * Field description:
     * Recording failure reason.
     *
     * @param reason
     */
    @JsonProperty("reason")
    public void setReason(String reason) {
        this.reason = reason;
    }

    /**
     * Sets recordingCustomData.
     * <p>
     * Field description:
     * Recording custom data.
     *
     * @param recordingCustomData
     * @return This {@link CallRecordingFailedProperties instance}.
     */
    public CallRecordingFailedProperties recordingCustomData(Map<String, String> recordingCustomData) {
        this.recordingCustomData = recordingCustomData;
        return this;
    }

    /**
     * Puts and entry into recordingCustomData.
     * <p>
     * Field description:
     * Recording custom data.
     *
     * @param key The given key.
     * @param recordingCustomDataItem The item to be associated with the given key.
     * @return This {@link CallRecordingFailedProperties instance}.
     */
    public CallRecordingFailedProperties putRecordingCustomDataItem(String key, String recordingCustomDataItem) {
        if (this.recordingCustomData == null) {
            this.recordingCustomData = new HashMap<>();
        }
        this.recordingCustomData.put(key, recordingCustomDataItem);
        return this;
    }

    /**
     * Returns recordingCustomData.
     * <p>
     * Field description:
     * Recording custom data.
     *
     * @return recordingCustomData
     */
    @JsonProperty("recordingCustomData")
    public Map<String, String> getRecordingCustomData() {
        return recordingCustomData;
    }

    /**
     * Sets recordingCustomData.
     * <p>
     * Field description:
     * Recording custom data.
     *
     * @param recordingCustomData
     */
    @JsonProperty("recordingCustomData")
    public void setRecordingCustomData(Map<String, String> recordingCustomData) {
        this.recordingCustomData = recordingCustomData;
    }

    /**
     * Sets fileId.
     * <p>
     * Field description:
     * Recording file identifier.
     *
     * @param fileId
     * @return This {@link CallRecordingFailedProperties instance}.
     */
    public CallRecordingFailedProperties fileId(String fileId) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CallRecordingFailedProperties callRecordingFailedProperties = (CallRecordingFailedProperties) o;
        return Objects.equals(this.reason, callRecordingFailedProperties.reason)
                && Objects.equals(this.recordingCustomData, callRecordingFailedProperties.recordingCustomData)
                && Objects.equals(this.fileId, callRecordingFailedProperties.fileId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(reason, recordingCustomData, fileId);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class CallRecordingFailedProperties {")
                .append(newLine)
                .append("    reason: ")
                .append(toIndentedString(reason))
                .append(newLine)
                .append("    recordingCustomData: ")
                .append(toIndentedString(recordingCustomData))
                .append(newLine)
                .append("    fileId: ")
                .append(toIndentedString(fileId))
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
