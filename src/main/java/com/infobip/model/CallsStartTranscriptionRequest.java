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
 * Represents CallsStartTranscriptionRequest model.
 */
public class CallsStartTranscriptionRequest {

    private CallsTranscription transcription;

    /**
     * Sets transcription.
     *
     * @param transcription
     * @return This {@link CallsStartTranscriptionRequest instance}.
     */
    public CallsStartTranscriptionRequest transcription(CallsTranscription transcription) {
        this.transcription = transcription;
        return this;
    }

    /**
     * Returns transcription.
     *
     * @return transcription
     */
    @JsonProperty("transcription")
    public CallsTranscription getTranscription() {
        return transcription;
    }

    /**
     * Sets transcription.
     *
     * @param transcription
     */
    @JsonProperty("transcription")
    public void setTranscription(CallsTranscription transcription) {
        this.transcription = transcription;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CallsStartTranscriptionRequest callsStartTranscriptionRequest = (CallsStartTranscriptionRequest) o;
        return Objects.equals(this.transcription, callsStartTranscriptionRequest.transcription);
    }

    @Override
    public int hashCode() {
        return Objects.hash(transcription);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class CallsStartTranscriptionRequest {")
                .append(newLine)
                .append("    transcription: ")
                .append(toIndentedString(transcription))
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
