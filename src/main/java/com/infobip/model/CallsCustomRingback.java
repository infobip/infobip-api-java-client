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
 * Custom ringback tones configuration. Allows specifying different audio files to play during ringing and when the call fails.
 */
public class CallsCustomRingback {

    private CallsAudioContent ringingAudio;

    private CallsAudioContent failedAudio;

    /**
     * Sets ringingAudio.
     * <p>
     * The field is required.
     *
     * @param ringingAudio
     * @return This {@link CallsCustomRingback instance}.
     */
    public CallsCustomRingback ringingAudio(CallsAudioContent ringingAudio) {
        this.ringingAudio = ringingAudio;
        return this;
    }

    /**
     * Returns ringingAudio.
     * <p>
     * The field is required.
     *
     * @return ringingAudio
     */
    @JsonProperty("ringingAudio")
    public CallsAudioContent getRingingAudio() {
        return ringingAudio;
    }

    /**
     * Sets ringingAudio.
     * <p>
     * The field is required.
     *
     * @param ringingAudio
     */
    @JsonProperty("ringingAudio")
    public void setRingingAudio(CallsAudioContent ringingAudio) {
        this.ringingAudio = ringingAudio;
    }

    /**
     * Sets failedAudio.
     *
     * @param failedAudio
     * @return This {@link CallsCustomRingback instance}.
     */
    public CallsCustomRingback failedAudio(CallsAudioContent failedAudio) {
        this.failedAudio = failedAudio;
        return this;
    }

    /**
     * Returns failedAudio.
     *
     * @return failedAudio
     */
    @JsonProperty("failedAudio")
    public CallsAudioContent getFailedAudio() {
        return failedAudio;
    }

    /**
     * Sets failedAudio.
     *
     * @param failedAudio
     */
    @JsonProperty("failedAudio")
    public void setFailedAudio(CallsAudioContent failedAudio) {
        this.failedAudio = failedAudio;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CallsCustomRingback callsCustomRingback = (CallsCustomRingback) o;
        return Objects.equals(this.ringingAudio, callsCustomRingback.ringingAudio)
                && Objects.equals(this.failedAudio, callsCustomRingback.failedAudio);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ringingAudio, failedAudio);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class CallsCustomRingback {")
                .append(newLine)
                .append("    ringingAudio: ")
                .append(toIndentedString(ringingAudio))
                .append(newLine)
                .append("    failedAudio: ")
                .append(toIndentedString(failedAudio))
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
