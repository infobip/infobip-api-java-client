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
 * Represents CallsRecordingRequest model.
 */
public class CallsRecordingRequest {

    private CallsRecordingType recordingType;

    private Integer maxSilence;

    private Boolean beep;

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
                && Objects.equals(this.beep, callsRecordingRequest.beep);
    }

    @Override
    public int hashCode() {
        return Objects.hash(recordingType, maxSilence, beep);
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
