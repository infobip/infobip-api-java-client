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
 * Represents ViberOutboundVideoContent model.
 */
public class ViberOutboundVideoContent extends ViberOutboundContent {

    private String text;

    private String mediaUrl;

    private String mediaDuration;

    private String thumbnailUrl;

    private String buttonTitle;

    private ViberButton button;

    /**
     * Constructs a new {@link ViberOutboundVideoContent} instance.
     */
    public ViberOutboundVideoContent() {
        super("VIDEO");
    }

    /**
     * Sets text.
     * <p>
     * Field description:
     * Text to be displayed alongside the video.
     *
     * @param text
     * @return This {@link ViberOutboundVideoContent instance}.
     */
    public ViberOutboundVideoContent text(String text) {
        this.text = text;
        return this;
    }

    /**
     * Returns text.
     * <p>
     * Field description:
     * Text to be displayed alongside the video.
     *
     * @return text
     */
    @JsonProperty("text")
    public String getText() {
        return text;
    }

    /**
     * Sets text.
     * <p>
     * Field description:
     * Text to be displayed alongside the video.
     *
     * @param text
     */
    @JsonProperty("text")
    public void setText(String text) {
        this.text = text;
    }

    /**
     * Sets mediaUrl.
     * <p>
     * Field description:
     * URL of the video being sent. Must be a valid URL starting with https:// or http://. The resource must allow HEAD request with &#39;Content-Length&#39; header. Supported video types are .3gp, .m4v, .mov, .mp4. Maximum video size is 200 MB.
     * <p>
     * The field is required.
     *
     * @param mediaUrl
     * @return This {@link ViberOutboundVideoContent instance}.
     */
    public ViberOutboundVideoContent mediaUrl(String mediaUrl) {
        this.mediaUrl = mediaUrl;
        return this;
    }

    /**
     * Returns mediaUrl.
     * <p>
     * Field description:
     * URL of the video being sent. Must be a valid URL starting with https:// or http://. The resource must allow HEAD request with &#39;Content-Length&#39; header. Supported video types are .3gp, .m4v, .mov, .mp4. Maximum video size is 200 MB.
     * <p>
     * The field is required.
     *
     * @return mediaUrl
     */
    @JsonProperty("mediaUrl")
    public String getMediaUrl() {
        return mediaUrl;
    }

    /**
     * Sets mediaUrl.
     * <p>
     * Field description:
     * URL of the video being sent. Must be a valid URL starting with https:// or http://. The resource must allow HEAD request with &#39;Content-Length&#39; header. Supported video types are .3gp, .m4v, .mov, .mp4. Maximum video size is 200 MB.
     * <p>
     * The field is required.
     *
     * @param mediaUrl
     */
    @JsonProperty("mediaUrl")
    public void setMediaUrl(String mediaUrl) {
        this.mediaUrl = mediaUrl;
    }

    /**
     * Sets mediaDuration.
     * <p>
     * Field description:
     * How long is the video.
     * <p>
     * The field is required.
     *
     * @param mediaDuration
     * @return This {@link ViberOutboundVideoContent instance}.
     */
    public ViberOutboundVideoContent mediaDuration(String mediaDuration) {
        this.mediaDuration = mediaDuration;
        return this;
    }

    /**
     * Returns mediaDuration.
     * <p>
     * Field description:
     * How long is the video.
     * <p>
     * The field is required.
     *
     * @return mediaDuration
     */
    @JsonProperty("mediaDuration")
    public String getMediaDuration() {
        return mediaDuration;
    }

    /**
     * Sets mediaDuration.
     * <p>
     * Field description:
     * How long is the video.
     * <p>
     * The field is required.
     *
     * @param mediaDuration
     */
    @JsonProperty("mediaDuration")
    public void setMediaDuration(String mediaDuration) {
        this.mediaDuration = mediaDuration;
    }

    /**
     * Sets thumbnailUrl.
     * <p>
     * Field description:
     * URL of the thumbnail being sent. Must be a valid URL starting with https:// or http://. Supported thumbnail types are .jpg, .jpeg, .png. Recommended resolution: 800 px x 800 px.
     * <p>
     * The field is required.
     *
     * @param thumbnailUrl
     * @return This {@link ViberOutboundVideoContent instance}.
     */
    public ViberOutboundVideoContent thumbnailUrl(String thumbnailUrl) {
        this.thumbnailUrl = thumbnailUrl;
        return this;
    }

    /**
     * Returns thumbnailUrl.
     * <p>
     * Field description:
     * URL of the thumbnail being sent. Must be a valid URL starting with https:// or http://. Supported thumbnail types are .jpg, .jpeg, .png. Recommended resolution: 800 px x 800 px.
     * <p>
     * The field is required.
     *
     * @return thumbnailUrl
     */
    @JsonProperty("thumbnailUrl")
    public String getThumbnailUrl() {
        return thumbnailUrl;
    }

    /**
     * Sets thumbnailUrl.
     * <p>
     * Field description:
     * URL of the thumbnail being sent. Must be a valid URL starting with https:// or http://. Supported thumbnail types are .jpg, .jpeg, .png. Recommended resolution: 800 px x 800 px.
     * <p>
     * The field is required.
     *
     * @param thumbnailUrl
     */
    @JsonProperty("thumbnailUrl")
    public void setThumbnailUrl(String thumbnailUrl) {
        this.thumbnailUrl = thumbnailUrl;
    }

    /**
     * Sets buttonTitle.
     * <p>
     * Field description:
     * The text that will appear on the button.
     *
     * @param buttonTitle
     * @return This {@link ViberOutboundVideoContent instance}.
     */
    public ViberOutboundVideoContent buttonTitle(String buttonTitle) {
        this.buttonTitle = buttonTitle;
        return this;
    }

    /**
     * Returns buttonTitle.
     * <p>
     * Field description:
     * The text that will appear on the button.
     *
     * @return buttonTitle
     */
    @JsonProperty("buttonTitle")
    public String getButtonTitle() {
        return buttonTitle;
    }

    /**
     * Sets buttonTitle.
     * <p>
     * Field description:
     * The text that will appear on the button.
     *
     * @param buttonTitle
     */
    @JsonProperty("buttonTitle")
    public void setButtonTitle(String buttonTitle) {
        this.buttonTitle = buttonTitle;
    }

    /**
     * Sets button.
     *
     * @param button
     * @return This {@link ViberOutboundVideoContent instance}.
     */
    public ViberOutboundVideoContent button(ViberButton button) {
        this.button = button;
        return this;
    }

    /**
     * Returns button.
     *
     * @return button
     */
    @JsonProperty("button")
    public ViberButton getButton() {
        return button;
    }

    /**
     * Sets button.
     *
     * @param button
     */
    @JsonProperty("button")
    public void setButton(ViberButton button) {
        this.button = button;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ViberOutboundVideoContent viberOutboundVideoContent = (ViberOutboundVideoContent) o;
        return Objects.equals(this.text, viberOutboundVideoContent.text)
                && Objects.equals(this.mediaUrl, viberOutboundVideoContent.mediaUrl)
                && Objects.equals(this.mediaDuration, viberOutboundVideoContent.mediaDuration)
                && Objects.equals(this.thumbnailUrl, viberOutboundVideoContent.thumbnailUrl)
                && Objects.equals(this.buttonTitle, viberOutboundVideoContent.buttonTitle)
                && Objects.equals(this.button, viberOutboundVideoContent.button)
                && super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(text, mediaUrl, mediaDuration, thumbnailUrl, buttonTitle, button, super.hashCode());
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class ViberOutboundVideoContent {")
                .append(newLine)
                .append("    ")
                .append(toIndentedString(super.toString()))
                .append(newLine)
                .append("    text: ")
                .append(toIndentedString(text))
                .append(newLine)
                .append("    mediaUrl: ")
                .append(toIndentedString(mediaUrl))
                .append(newLine)
                .append("    mediaDuration: ")
                .append(toIndentedString(mediaDuration))
                .append(newLine)
                .append("    thumbnailUrl: ")
                .append(toIndentedString(thumbnailUrl))
                .append(newLine)
                .append("    buttonTitle: ")
                .append(toIndentedString(buttonTitle))
                .append(newLine)
                .append("    button: ")
                .append(toIndentedString(button))
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
