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
 * Represents CallsStartRecordingRequest model.
 */
public class CallsStartRecordingRequest {

    private CallsConferenceRecordingRequest recording;

    /**
     * Sets recording.
     * <p>
     * The field is required.
     *
     * @param recording
     * @return This {@link CallsStartRecordingRequest instance}.
     */
    public CallsStartRecordingRequest recording(CallsConferenceRecordingRequest recording) {
        this.recording = recording;
        return this;
    }

    /**
     * Returns recording.
     * <p>
     * The field is required.
     *
     * @return recording
     */
    @JsonProperty("recording")
    public CallsConferenceRecordingRequest getRecording() {
        return recording;
    }

    /**
     * Sets recording.
     * <p>
     * The field is required.
     *
     * @param recording
     */
    @JsonProperty("recording")
    public void setRecording(CallsConferenceRecordingRequest recording) {
        this.recording = recording;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CallsStartRecordingRequest callsStartRecordingRequest = (CallsStartRecordingRequest) o;
        return Objects.equals(this.recording, callsStartRecordingRequest.recording);
    }

    @Override
    public int hashCode() {
        return Objects.hash(recording);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class CallsStartRecordingRequest {")
                .append(newLine)
                .append("    recording: ")
                .append(toIndentedString(recording))
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
