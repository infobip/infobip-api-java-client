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
 * User options available during a call. Depending on the fields, certain options for a call will be shown to a user.
 */
public class WebRtcCallOptions {

    private Boolean mute;

    private Boolean screenShare;

    private Boolean camera;

    private Boolean switchCameraFacingMode;

    private Boolean dialPad;

    private Boolean chat;

    private Boolean settings;

    /**
     * Sets mute.
     * <p>
     * Field description:
     * User will be able to mute themselves during the call.
     *
     * @param mute
     * @return This {@link WebRtcCallOptions instance}.
     */
    public WebRtcCallOptions mute(Boolean mute) {
        this.mute = mute;
        return this;
    }

    /**
     * Returns mute.
     * <p>
     * Field description:
     * User will be able to mute themselves during the call.
     *
     * @return mute
     */
    @JsonProperty("mute")
    public Boolean getMute() {
        return mute;
    }

    /**
     * Sets mute.
     * <p>
     * Field description:
     * User will be able to mute themselves during the call.
     *
     * @param mute
     */
    @JsonProperty("mute")
    public void setMute(Boolean mute) {
        this.mute = mute;
    }

    /**
     * Sets screenShare.
     * <p>
     * Field description:
     * User will be able to share the screen during the call.
     *
     * @param screenShare
     * @return This {@link WebRtcCallOptions instance}.
     */
    public WebRtcCallOptions screenShare(Boolean screenShare) {
        this.screenShare = screenShare;
        return this;
    }

    /**
     * Returns screenShare.
     * <p>
     * Field description:
     * User will be able to share the screen during the call.
     *
     * @return screenShare
     */
    @JsonProperty("screenShare")
    public Boolean getScreenShare() {
        return screenShare;
    }

    /**
     * Sets screenShare.
     * <p>
     * Field description:
     * User will be able to share the screen during the call.
     *
     * @param screenShare
     */
    @JsonProperty("screenShare")
    public void setScreenShare(Boolean screenShare) {
        this.screenShare = screenShare;
    }

    /**
     * Sets camera.
     * <p>
     * Field description:
     * User will be able to toggle the video during the call.
     *
     * @param camera
     * @return This {@link WebRtcCallOptions instance}.
     */
    public WebRtcCallOptions camera(Boolean camera) {
        this.camera = camera;
        return this;
    }

    /**
     * Returns camera.
     * <p>
     * Field description:
     * User will be able to toggle the video during the call.
     *
     * @return camera
     */
    @JsonProperty("camera")
    public Boolean getCamera() {
        return camera;
    }

    /**
     * Sets camera.
     * <p>
     * Field description:
     * User will be able to toggle the video during the call.
     *
     * @param camera
     */
    @JsonProperty("camera")
    public void setCamera(Boolean camera) {
        this.camera = camera;
    }

    /**
     * Sets switchCameraFacingMode.
     * <p>
     * Field description:
     * User will be able to switch between front-facing and back camera during the call.
     *
     * @param switchCameraFacingMode
     * @return This {@link WebRtcCallOptions instance}.
     */
    public WebRtcCallOptions switchCameraFacingMode(Boolean switchCameraFacingMode) {
        this.switchCameraFacingMode = switchCameraFacingMode;
        return this;
    }

    /**
     * Returns switchCameraFacingMode.
     * <p>
     * Field description:
     * User will be able to switch between front-facing and back camera during the call.
     *
     * @return switchCameraFacingMode
     */
    @JsonProperty("switchCameraFacingMode")
    public Boolean getSwitchCameraFacingMode() {
        return switchCameraFacingMode;
    }

    /**
     * Sets switchCameraFacingMode.
     * <p>
     * Field description:
     * User will be able to switch between front-facing and back camera during the call.
     *
     * @param switchCameraFacingMode
     */
    @JsonProperty("switchCameraFacingMode")
    public void setSwitchCameraFacingMode(Boolean switchCameraFacingMode) {
        this.switchCameraFacingMode = switchCameraFacingMode;
    }

    /**
     * Sets dialPad.
     * <p>
     * Field description:
     * User will be able to use dial pad for DTMF, during the call.
     *
     * @param dialPad
     * @return This {@link WebRtcCallOptions instance}.
     */
    public WebRtcCallOptions dialPad(Boolean dialPad) {
        this.dialPad = dialPad;
        return this;
    }

    /**
     * Returns dialPad.
     * <p>
     * Field description:
     * User will be able to use dial pad for DTMF, during the call.
     *
     * @return dialPad
     */
    @JsonProperty("dialPad")
    public Boolean getDialPad() {
        return dialPad;
    }

    /**
     * Sets dialPad.
     * <p>
     * Field description:
     * User will be able to use dial pad for DTMF, during the call.
     *
     * @param dialPad
     */
    @JsonProperty("dialPad")
    public void setDialPad(Boolean dialPad) {
        this.dialPad = dialPad;
    }

    /**
     * Sets chat.
     * <p>
     * Field description:
     * Users will be able to open the chat box and send and receive text messages that are visible to all the participants. This is applicable only for the ROOM call type. Messages sent before joining the room are not visible.
     *
     * @param chat
     * @return This {@link WebRtcCallOptions instance}.
     */
    public WebRtcCallOptions chat(Boolean chat) {
        this.chat = chat;
        return this;
    }

    /**
     * Returns chat.
     * <p>
     * Field description:
     * Users will be able to open the chat box and send and receive text messages that are visible to all the participants. This is applicable only for the ROOM call type. Messages sent before joining the room are not visible.
     *
     * @return chat
     */
    @JsonProperty("chat")
    public Boolean getChat() {
        return chat;
    }

    /**
     * Sets chat.
     * <p>
     * Field description:
     * Users will be able to open the chat box and send and receive text messages that are visible to all the participants. This is applicable only for the ROOM call type. Messages sent before joining the room are not visible.
     *
     * @param chat
     */
    @JsonProperty("chat")
    public void setChat(Boolean chat) {
        this.chat = chat;
    }

    /**
     * Sets settings.
     * <p>
     * Field description:
     * User will be able to access settings during the call.
     *
     * @param settings
     * @return This {@link WebRtcCallOptions instance}.
     */
    public WebRtcCallOptions settings(Boolean settings) {
        this.settings = settings;
        return this;
    }

    /**
     * Returns settings.
     * <p>
     * Field description:
     * User will be able to access settings during the call.
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
     * User will be able to access settings during the call.
     *
     * @param settings
     */
    @JsonProperty("settings")
    public void setSettings(Boolean settings) {
        this.settings = settings;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WebRtcCallOptions webRtcCallOptions = (WebRtcCallOptions) o;
        return Objects.equals(this.mute, webRtcCallOptions.mute)
                && Objects.equals(this.screenShare, webRtcCallOptions.screenShare)
                && Objects.equals(this.camera, webRtcCallOptions.camera)
                && Objects.equals(this.switchCameraFacingMode, webRtcCallOptions.switchCameraFacingMode)
                && Objects.equals(this.dialPad, webRtcCallOptions.dialPad)
                && Objects.equals(this.chat, webRtcCallOptions.chat)
                && Objects.equals(this.settings, webRtcCallOptions.settings);
    }

    @Override
    public int hashCode() {
        return Objects.hash(mute, screenShare, camera, switchCameraFacingMode, dialPad, chat, settings);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class WebRtcCallOptions {")
                .append(newLine)
                .append("    mute: ")
                .append(toIndentedString(mute))
                .append(newLine)
                .append("    screenShare: ")
                .append(toIndentedString(screenShare))
                .append(newLine)
                .append("    camera: ")
                .append(toIndentedString(camera))
                .append(newLine)
                .append("    switchCameraFacingMode: ")
                .append(toIndentedString(switchCameraFacingMode))
                .append(newLine)
                .append("    dialPad: ")
                .append(toIndentedString(dialPad))
                .append(newLine)
                .append("    chat: ")
                .append(toIndentedString(chat))
                .append(newLine)
                .append("    settings: ")
                .append(toIndentedString(settings))
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
