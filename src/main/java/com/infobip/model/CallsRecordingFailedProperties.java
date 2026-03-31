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
 * Represents CallsRecordingFailedProperties model.
 */
public class CallsRecordingFailedProperties {

    private String reason;

    private Map<String, String> recordingCustomData = null;

    /**
     * Sets reason.
     * <p>
     * Field description:
     * Recording failure reason.
     *
     * @param reason
     * @return This {@link CallsRecordingFailedProperties instance}.
     */
    public CallsRecordingFailedProperties reason(String reason) {
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
     * @return This {@link CallsRecordingFailedProperties instance}.
     */
    public CallsRecordingFailedProperties recordingCustomData(Map<String, String> recordingCustomData) {
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
     * @return This {@link CallsRecordingFailedProperties instance}.
     */
    public CallsRecordingFailedProperties putRecordingCustomDataItem(String key, String recordingCustomDataItem) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CallsRecordingFailedProperties callsRecordingFailedProperties = (CallsRecordingFailedProperties) o;
        return Objects.equals(this.reason, callsRecordingFailedProperties.reason)
                && Objects.equals(this.recordingCustomData, callsRecordingFailedProperties.recordingCustomData);
    }

    @Override
    public int hashCode() {
        return Objects.hash(reason, recordingCustomData);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class CallsRecordingFailedProperties {")
                .append(newLine)
                .append("    reason: ")
                .append(toIndentedString(reason))
                .append(newLine)
                .append("    recordingCustomData: ")
                .append(toIndentedString(recordingCustomData))
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
