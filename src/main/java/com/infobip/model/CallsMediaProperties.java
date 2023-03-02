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
 * Represents CallsMediaProperties model.
 */
public class CallsMediaProperties {

    private CallsAudioMediaProperties audio;

    private CallsVideoMediaProperties video;

    /**
     * Sets audio.
     *
     * @param audio
     * @return This {@link CallsMediaProperties instance}.
     */
    public CallsMediaProperties audio(CallsAudioMediaProperties audio) {
        this.audio = audio;
        return this;
    }

    /**
     * Returns audio.
     *
     * @return audio
     */
    @JsonProperty("audio")
    public CallsAudioMediaProperties getAudio() {
        return audio;
    }

    /**
     * Sets audio.
     *
     * @param audio
     */
    @JsonProperty("audio")
    public void setAudio(CallsAudioMediaProperties audio) {
        this.audio = audio;
    }

    /**
     * Sets video.
     *
     * @param video
     * @return This {@link CallsMediaProperties instance}.
     */
    public CallsMediaProperties video(CallsVideoMediaProperties video) {
        this.video = video;
        return this;
    }

    /**
     * Returns video.
     *
     * @return video
     */
    @JsonProperty("video")
    public CallsVideoMediaProperties getVideo() {
        return video;
    }

    /**
     * Sets video.
     *
     * @param video
     */
    @JsonProperty("video")
    public void setVideo(CallsVideoMediaProperties video) {
        this.video = video;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CallsMediaProperties callsMediaProperties = (CallsMediaProperties) o;
        return Objects.equals(this.audio, callsMediaProperties.audio)
                && Objects.equals(this.video, callsMediaProperties.video);
    }

    @Override
    public int hashCode() {
        return Objects.hash(audio, video);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class CallsMediaProperties {")
                .append(newLine)
                .append("    audio: ")
                .append(toIndentedString(audio))
                .append(newLine)
                .append("    video: ")
                .append(toIndentedString(video))
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
