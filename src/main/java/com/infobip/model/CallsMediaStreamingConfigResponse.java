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
 * Represents CallsMediaStreamingConfigResponse model.
 */
public class CallsMediaStreamingConfigResponse extends CallsMediaStreamConfigResponse {

    private CallsAudioEncoding audioEncoding;

    /**
     * Constructs a new {@link CallsMediaStreamingConfigResponse} instance.
     */
    public CallsMediaStreamingConfigResponse() {
        super("MEDIA_STREAMING");
    }

    /**
     * Sets audioEncoding.
     *
     * @param audioEncoding
     * @return This {@link CallsMediaStreamingConfigResponse instance}.
     */
    public CallsMediaStreamingConfigResponse audioEncoding(CallsAudioEncoding audioEncoding) {
        this.audioEncoding = audioEncoding;
        return this;
    }

    /**
     * Returns audioEncoding.
     *
     * @return audioEncoding
     */
    @JsonProperty("audioEncoding")
    public CallsAudioEncoding getAudioEncoding() {
        return audioEncoding;
    }

    /**
     * Sets audioEncoding.
     *
     * @param audioEncoding
     */
    @JsonProperty("audioEncoding")
    public void setAudioEncoding(CallsAudioEncoding audioEncoding) {
        this.audioEncoding = audioEncoding;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CallsMediaStreamingConfigResponse callsMediaStreamingConfigResponse = (CallsMediaStreamingConfigResponse) o;
        return Objects.equals(this.audioEncoding, callsMediaStreamingConfigResponse.audioEncoding) && super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(audioEncoding, super.hashCode());
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class CallsMediaStreamingConfigResponse {")
                .append(newLine)
                .append("    ")
                .append(toIndentedString(super.toString()))
                .append(newLine)
                .append("    audioEncoding: ")
                .append(toIndentedString(audioEncoding))
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
