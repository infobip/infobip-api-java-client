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
 * Represents CallsStartMediaStreamRequest model.
 */
public class CallsStartMediaStreamRequest {

    private CallsMediaStream mediaStream;

    /**
     * Sets mediaStream.
     * <p>
     * The field is required.
     *
     * @param mediaStream
     * @return This {@link CallsStartMediaStreamRequest instance}.
     */
    public CallsStartMediaStreamRequest mediaStream(CallsMediaStream mediaStream) {
        this.mediaStream = mediaStream;
        return this;
    }

    /**
     * Returns mediaStream.
     * <p>
     * The field is required.
     *
     * @return mediaStream
     */
    @JsonProperty("mediaStream")
    public CallsMediaStream getMediaStream() {
        return mediaStream;
    }

    /**
     * Sets mediaStream.
     * <p>
     * The field is required.
     *
     * @param mediaStream
     */
    @JsonProperty("mediaStream")
    public void setMediaStream(CallsMediaStream mediaStream) {
        this.mediaStream = mediaStream;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CallsStartMediaStreamRequest callsStartMediaStreamRequest = (CallsStartMediaStreamRequest) o;
        return Objects.equals(this.mediaStream, callsStartMediaStreamRequest.mediaStream);
    }

    @Override
    public int hashCode() {
        return Objects.hash(mediaStream);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class CallsStartMediaStreamRequest {")
                .append(newLine)
                .append("    mediaStream: ")
                .append(toIndentedString(mediaStream))
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
