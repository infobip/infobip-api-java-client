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
 * The content object to build a message that will be sent.
 */
public class ViberVideoContent {

    private String text;

    private String mediaUrl;

    private String thumbnailUrl;

    private Integer mediaDuration;

    private String buttonTitle;

    /**
     * Sets text.
     * <p>
     * Field description:
     * Text to be displayed alongside the video.
     *
     * @param text
     * @return This {@link ViberVideoContent instance}.
     */
    public ViberVideoContent text(String text) {
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
     * @return This {@link ViberVideoContent instance}.
     */
    public ViberVideoContent mediaUrl(String mediaUrl) {
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
     * Sets thumbnailUrl.
     * <p>
     * Field description:
     * URL of the thumbnail being sent. Must be a valid URL starting with https:// or http://. Supported thumbnail types are .jpg, .jpeg, .png.Recommended resolution: 800 px x 800 px.
     * <p>
     * The field is required.
     *
     * @param thumbnailUrl
     * @return This {@link ViberVideoContent instance}.
     */
    public ViberVideoContent thumbnailUrl(String thumbnailUrl) {
        this.thumbnailUrl = thumbnailUrl;
        return this;
    }

    /**
     * Returns thumbnailUrl.
     * <p>
     * Field description:
     * URL of the thumbnail being sent. Must be a valid URL starting with https:// or http://. Supported thumbnail types are .jpg, .jpeg, .png.Recommended resolution: 800 px x 800 px.
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
     * URL of the thumbnail being sent. Must be a valid URL starting with https:// or http://. Supported thumbnail types are .jpg, .jpeg, .png.Recommended resolution: 800 px x 800 px.
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
     * Sets mediaDuration.
     * <p>
     * Field description:
     * How long is the video. Maximum video duration is 600s.
     * <p>
     * The field is required.
     *
     * @param mediaDuration
     * @return This {@link ViberVideoContent instance}.
     */
    public ViberVideoContent mediaDuration(Integer mediaDuration) {
        this.mediaDuration = mediaDuration;
        return this;
    }

    /**
     * Returns mediaDuration.
     * <p>
     * Field description:
     * How long is the video. Maximum video duration is 600s.
     * <p>
     * The field is required.
     *
     * @return mediaDuration
     */
    @JsonProperty("mediaDuration")
    public Integer getMediaDuration() {
        return mediaDuration;
    }

    /**
     * Sets mediaDuration.
     * <p>
     * Field description:
     * How long is the video. Maximum video duration is 600s.
     * <p>
     * The field is required.
     *
     * @param mediaDuration
     */
    @JsonProperty("mediaDuration")
    public void setMediaDuration(Integer mediaDuration) {
        this.mediaDuration = mediaDuration;
    }

    /**
     * Sets buttonTitle.
     * <p>
     * Field description:
     * Button text.
     *
     * @param buttonTitle
     * @return This {@link ViberVideoContent instance}.
     */
    public ViberVideoContent buttonTitle(String buttonTitle) {
        this.buttonTitle = buttonTitle;
        return this;
    }

    /**
     * Returns buttonTitle.
     * <p>
     * Field description:
     * Button text.
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
     * Button text.
     *
     * @param buttonTitle
     */
    @JsonProperty("buttonTitle")
    public void setButtonTitle(String buttonTitle) {
        this.buttonTitle = buttonTitle;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ViberVideoContent viberVideoContent = (ViberVideoContent) o;
        return Objects.equals(this.text, viberVideoContent.text)
                && Objects.equals(this.mediaUrl, viberVideoContent.mediaUrl)
                && Objects.equals(this.thumbnailUrl, viberVideoContent.thumbnailUrl)
                && Objects.equals(this.mediaDuration, viberVideoContent.mediaDuration)
                && Objects.equals(this.buttonTitle, viberVideoContent.buttonTitle);
    }

    @Override
    public int hashCode() {
        return Objects.hash(text, mediaUrl, thumbnailUrl, mediaDuration, buttonTitle);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class ViberVideoContent {")
                .append(newLine)
                .append("    text: ")
                .append(toIndentedString(text))
                .append(newLine)
                .append("    mediaUrl: ")
                .append(toIndentedString(mediaUrl))
                .append(newLine)
                .append("    thumbnailUrl: ")
                .append(toIndentedString(thumbnailUrl))
                .append(newLine)
                .append("    mediaDuration: ")
                .append(toIndentedString(mediaDuration))
                .append(newLine)
                .append("    buttonTitle: ")
                .append(toIndentedString(buttonTitle))
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
