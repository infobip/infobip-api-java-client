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
 * Represents CallsMediaStream model.
 */
public class CallsMediaStream {

    private CallsMediaStreamAudioProperties audioProperties;

    /**
     * Sets audioProperties.
     *
     * @param audioProperties
     * @return This {@link CallsMediaStream instance}.
     */
    public CallsMediaStream audioProperties(CallsMediaStreamAudioProperties audioProperties) {
        this.audioProperties = audioProperties;
        return this;
    }

    /**
     * Returns audioProperties.
     *
     * @return audioProperties
     */
    @JsonProperty("audioProperties")
    public CallsMediaStreamAudioProperties getAudioProperties() {
        return audioProperties;
    }

    /**
     * Sets audioProperties.
     *
     * @param audioProperties
     */
    @JsonProperty("audioProperties")
    public void setAudioProperties(CallsMediaStreamAudioProperties audioProperties) {
        this.audioProperties = audioProperties;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CallsMediaStream callsMediaStream = (CallsMediaStream) o;
        return Objects.equals(this.audioProperties, callsMediaStream.audioProperties);
    }

    @Override
    public int hashCode() {
        return Objects.hash(audioProperties);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class CallsMediaStream {")
                .append(newLine)
                .append("    audioProperties: ")
                .append(toIndentedString(audioProperties))
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
