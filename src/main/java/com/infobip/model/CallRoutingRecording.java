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
 * If set, captures the call session from an established call to a given destination.
 */
public class CallRoutingRecording {

    private CallRoutingRecordingType recordingType;

    private CallRoutingRecordingComposition recordingComposition;

    private Map<String, String> customData = null;

    private String filePrefix;

    /**
     * Sets recordingType.
     * <p>
     * The field is required.
     *
     * @param recordingType
     * @return This {@link CallRoutingRecording instance}.
     */
    public CallRoutingRecording recordingType(CallRoutingRecordingType recordingType) {
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
    public CallRoutingRecordingType getRecordingType() {
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
    public void setRecordingType(CallRoutingRecordingType recordingType) {
        this.recordingType = recordingType;
    }

    /**
     * Sets recordingComposition.
     *
     * @param recordingComposition
     * @return This {@link CallRoutingRecording instance}.
     */
    public CallRoutingRecording recordingComposition(CallRoutingRecordingComposition recordingComposition) {
        this.recordingComposition = recordingComposition;
        return this;
    }

    /**
     * Returns recordingComposition.
     *
     * @return recordingComposition
     */
    @JsonProperty("recordingComposition")
    public CallRoutingRecordingComposition getRecordingComposition() {
        return recordingComposition;
    }

    /**
     * Sets recordingComposition.
     *
     * @param recordingComposition
     */
    @JsonProperty("recordingComposition")
    public void setRecordingComposition(CallRoutingRecordingComposition recordingComposition) {
        this.recordingComposition = recordingComposition;
    }

    /**
     * Sets customData.
     * <p>
     * Field description:
     * Client-defined data visible when a recording is downloaded.
     *
     * @param customData
     * @return This {@link CallRoutingRecording instance}.
     */
    public CallRoutingRecording customData(Map<String, String> customData) {
        this.customData = customData;
        return this;
    }

    /**
     * Puts and entry into customData.
     * <p>
     * Field description:
     * Client-defined data visible when a recording is downloaded.
     *
     * @param key The given key.
     * @param customDataItem The item to be associated with the given key.
     * @return This {@link CallRoutingRecording instance}.
     */
    public CallRoutingRecording putCustomDataItem(String key, String customDataItem) {
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
     * Client-defined data visible when a recording is downloaded.
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
     * Client-defined data visible when a recording is downloaded.
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
     * Custom name for the recording&#39;s zip file. Applicable only when SFTP server is enabled on [Voice settings page](https://portal.infobip.com/apps/voice/recording/settings). For recordings without composition, &#x60;callId&#x60; and &#x60;fileId&#x60; will be appended to the &#x60;filePrefix&#x60; value. For recordings with composition, &#x60;fileId&#x60; will be appended to the &#x60;filePrefix&#x60; value.
     *
     * @param filePrefix
     * @return This {@link CallRoutingRecording instance}.
     */
    public CallRoutingRecording filePrefix(String filePrefix) {
        this.filePrefix = filePrefix;
        return this;
    }

    /**
     * Returns filePrefix.
     * <p>
     * Field description:
     * Custom name for the recording&#39;s zip file. Applicable only when SFTP server is enabled on [Voice settings page](https://portal.infobip.com/apps/voice/recording/settings). For recordings without composition, &#x60;callId&#x60; and &#x60;fileId&#x60; will be appended to the &#x60;filePrefix&#x60; value. For recordings with composition, &#x60;fileId&#x60; will be appended to the &#x60;filePrefix&#x60; value.
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
     * Custom name for the recording&#39;s zip file. Applicable only when SFTP server is enabled on [Voice settings page](https://portal.infobip.com/apps/voice/recording/settings). For recordings without composition, &#x60;callId&#x60; and &#x60;fileId&#x60; will be appended to the &#x60;filePrefix&#x60; value. For recordings with composition, &#x60;fileId&#x60; will be appended to the &#x60;filePrefix&#x60; value.
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
        CallRoutingRecording callRoutingRecording = (CallRoutingRecording) o;
        return Objects.equals(this.recordingType, callRoutingRecording.recordingType)
                && Objects.equals(this.recordingComposition, callRoutingRecording.recordingComposition)
                && Objects.equals(this.customData, callRoutingRecording.customData)
                && Objects.equals(this.filePrefix, callRoutingRecording.filePrefix);
    }

    @Override
    public int hashCode() {
        return Objects.hash(recordingType, recordingComposition, customData, filePrefix);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class CallRoutingRecording {")
                .append(newLine)
                .append("    recordingType: ")
                .append(toIndentedString(recordingType))
                .append(newLine)
                .append("    recordingComposition: ")
                .append(toIndentedString(recordingComposition))
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
