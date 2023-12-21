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
 * User options available when a user opens a call link page before initiating the call. Depending on the fields, certain options for the call will be shown to a user.
 */
public class WebRtcInitialOptions {

    private Boolean audio;

    private Boolean video;

    private Boolean muted;

    private Boolean settings;

    private WebRtcCameraFacingMode cameraFacingMode;

    /**
     * Sets audio.
     * <p>
     * Field description:
     * User will be able to initiate the audio call.
     *
     * @param audio
     * @return This {@link WebRtcInitialOptions instance}.
     */
    public WebRtcInitialOptions audio(Boolean audio) {
        this.audio = audio;
        return this;
    }

    /**
     * Returns audio.
     * <p>
     * Field description:
     * User will be able to initiate the audio call.
     *
     * @return audio
     */
    @JsonProperty("audio")
    public Boolean getAudio() {
        return audio;
    }

    /**
     * Sets audio.
     * <p>
     * Field description:
     * User will be able to initiate the audio call.
     *
     * @param audio
     */
    @JsonProperty("audio")
    public void setAudio(Boolean audio) {
        this.audio = audio;
    }

    /**
     * Sets video.
     * <p>
     * Field description:
     * User will be able to initiate the video call.
     *
     * @param video
     * @return This {@link WebRtcInitialOptions instance}.
     */
    public WebRtcInitialOptions video(Boolean video) {
        this.video = video;
        return this;
    }

    /**
     * Returns video.
     * <p>
     * Field description:
     * User will be able to initiate the video call.
     *
     * @return video
     */
    @JsonProperty("video")
    public Boolean getVideo() {
        return video;
    }

    /**
     * Sets video.
     * <p>
     * Field description:
     * User will be able to initiate the video call.
     *
     * @param video
     */
    @JsonProperty("video")
    public void setVideo(Boolean video) {
        this.video = video;
    }

    /**
     * Sets muted.
     * <p>
     * Field description:
     * User will be muted once the call is established.
     *
     * @param muted
     * @return This {@link WebRtcInitialOptions instance}.
     */
    public WebRtcInitialOptions muted(Boolean muted) {
        this.muted = muted;
        return this;
    }

    /**
     * Returns muted.
     * <p>
     * Field description:
     * User will be muted once the call is established.
     *
     * @return muted
     */
    @JsonProperty("muted")
    public Boolean getMuted() {
        return muted;
    }

    /**
     * Sets muted.
     * <p>
     * Field description:
     * User will be muted once the call is established.
     *
     * @param muted
     */
    @JsonProperty("muted")
    public void setMuted(Boolean muted) {
        this.muted = muted;
    }

    /**
     * Sets settings.
     * <p>
     * Field description:
     * User will be able to configure settings before a call.
     *
     * @param settings
     * @return This {@link WebRtcInitialOptions instance}.
     */
    public WebRtcInitialOptions settings(Boolean settings) {
        this.settings = settings;
        return this;
    }

    /**
     * Returns settings.
     * <p>
     * Field description:
     * User will be able to configure settings before a call.
     *
     * @return settings
     */
    @JsonProperty("settings")
    public Boolean getSettings() {
        return settings;
    }

    /**
     * Sets settings.
     * <p>
     * Field description:
     * User will be able to configure settings before a call.
     *
     * @param settings
     */
    @JsonProperty("settings")
    public void setSettings(Boolean settings) {
        this.settings = settings;
    }

    /**
     * Sets cameraFacingMode.
     *
     * @param cameraFacingMode
     * @return This {@link WebRtcInitialOptions instance}.
     */
    public WebRtcInitialOptions cameraFacingMode(WebRtcCameraFacingMode cameraFacingMode) {
        this.cameraFacingMode = cameraFacingMode;
        return this;
    }

    /**
     * Returns cameraFacingMode.
     *
     * @return cameraFacingMode
     */
    @JsonProperty("cameraFacingMode")
    public WebRtcCameraFacingMode getCameraFacingMode() {
        return cameraFacingMode;
    }

    /**
     * Sets cameraFacingMode.
     *
     * @param cameraFacingMode
     */
    @JsonProperty("cameraFacingMode")
    public void setCameraFacingMode(WebRtcCameraFacingMode cameraFacingMode) {
        this.cameraFacingMode = cameraFacingMode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WebRtcInitialOptions webRtcInitialOptions = (WebRtcInitialOptions) o;
        return Objects.equals(this.audio, webRtcInitialOptions.audio)
                && Objects.equals(this.video, webRtcInitialOptions.video)
                && Objects.equals(this.muted, webRtcInitialOptions.muted)
                && Objects.equals(this.settings, webRtcInitialOptions.settings)
                && Objects.equals(this.cameraFacingMode, webRtcInitialOptions.cameraFacingMode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(audio, video, muted, settings, cameraFacingMode);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class WebRtcInitialOptions {")
                .append(newLine)
                .append("    audio: ")
                .append(toIndentedString(audio))
                .append(newLine)
                .append("    video: ")
                .append(toIndentedString(video))
                .append(newLine)
                .append("    muted: ")
                .append(toIndentedString(muted))
                .append(newLine)
                .append("    settings: ")
                .append(toIndentedString(settings))
                .append(newLine)
                .append("    cameraFacingMode: ")
                .append(toIndentedString(cameraFacingMode))
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
