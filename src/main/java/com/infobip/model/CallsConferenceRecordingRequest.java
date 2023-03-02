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
 * Represents CallsConferenceRecordingRequest model.
 */
public class CallsConferenceRecordingRequest {

    private CallsRecordingType recordingType;

    private CallsConferenceComposition conferenceComposition;

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
                && Objects.equals(this.conferenceComposition, callsConferenceRecordingRequest.conferenceComposition);
    }

    @Override
    public int hashCode() {
        return Objects.hash(recordingType, conferenceComposition);
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
