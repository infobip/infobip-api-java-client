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
 * Represents MessagesApiMessageRichLinkBody model.
 */
public class MessagesApiMessageRichLinkBody extends MessagesApiMessageBody {

    private String redirectUrl;

    private String text;

    private String url;

    private Boolean isVideo;

    private String thumbnailUrl;

    private String buttonText;

    /**
     * Constructs a new {@link MessagesApiMessageRichLinkBody} instance.
     */
    public MessagesApiMessageRichLinkBody() {
        super("RICH_LINK");
    }

    /**
     * Sets redirectUrl.
     * <p>
     * Field description:
     * URL to be redirected to.
     * <p>
     * The field is required.
     *
     * @param redirectUrl
     * @return This {@link MessagesApiMessageRichLinkBody instance}.
     */
    public MessagesApiMessageRichLinkBody redirectUrl(String redirectUrl) {
        this.redirectUrl = redirectUrl;
        return this;
    }

    /**
     * Returns redirectUrl.
     * <p>
     * Field description:
     * URL to be redirected to.
     * <p>
     * The field is required.
     *
     * @return redirectUrl
     */
    @JsonProperty("redirectUrl")
    public String getRedirectUrl() {
        return redirectUrl;
    }

    /**
     * Sets redirectUrl.
     * <p>
     * Field description:
     * URL to be redirected to.
     * <p>
     * The field is required.
     *
     * @param redirectUrl
     */
    @JsonProperty("redirectUrl")
    public void setRedirectUrl(String redirectUrl) {
        this.redirectUrl = redirectUrl;
    }

    /**
     * Sets text.
     * <p>
     * Field description:
     * Text to be sent.
     * <p>
     * The field is required.
     *
     * @param text
     * @return This {@link MessagesApiMessageRichLinkBody instance}.
     */
    public MessagesApiMessageRichLinkBody text(String text) {
        this.text = text;
        return this;
    }

    /**
     * Returns text.
     * <p>
     * Field description:
     * Text to be sent.
     * <p>
     * The field is required.
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
     * Text to be sent.
     * <p>
     * The field is required.
     *
     * @param text
     */
    @JsonProperty("text")
    public void setText(String text) {
        this.text = text;
    }

    /**
     * Sets url.
     * <p>
     * Field description:
     * URL of the rich link. It can be image or video. When you provide it with &#x60;isVideo&#x3D;true&#x60; then it will be mapped as a video, otherwise - as an image.
     * <p>
     * The field is required.
     *
     * @param url
     * @return This {@link MessagesApiMessageRichLinkBody instance}.
     */
    public MessagesApiMessageRichLinkBody url(String url) {
        this.url = url;
        return this;
    }

    /**
     * Returns url.
     * <p>
     * Field description:
     * URL of the rich link. It can be image or video. When you provide it with &#x60;isVideo&#x3D;true&#x60; then it will be mapped as a video, otherwise - as an image.
     * <p>
     * The field is required.
     *
     * @return url
     */
    @JsonProperty("url")
    public String getUrl() {
        return url;
    }

    /**
     * Sets url.
     * <p>
     * Field description:
     * URL of the rich link. It can be image or video. When you provide it with &#x60;isVideo&#x3D;true&#x60; then it will be mapped as a video, otherwise - as an image.
     * <p>
     * The field is required.
     *
     * @param url
     */
    @JsonProperty("url")
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * Sets isVideo.
     * <p>
     * Field description:
     * Indicates if provided &#x60;url&#x60; is a video.
     *
     * @param isVideo
     * @return This {@link MessagesApiMessageRichLinkBody instance}.
     */
    public MessagesApiMessageRichLinkBody isVideo(Boolean isVideo) {
        this.isVideo = isVideo;
        return this;
    }

    /**
     * Returns isVideo.
     * <p>
     * Field description:
     * Indicates if provided &#x60;url&#x60; is a video.
     *
     * @return isVideo
     */
    @JsonProperty("isVideo")
    public Boolean getIsVideo() {
        return isVideo;
    }

    /**
     * Sets isVideo.
     * <p>
     * Field description:
     * Indicates if provided &#x60;url&#x60; is a video.
     *
     * @param isVideo
     */
    @JsonProperty("isVideo")
    public void setIsVideo(Boolean isVideo) {
        this.isVideo = isVideo;
    }

    /**
     * Sets thumbnailUrl.
     * <p>
     * Field description:
     * URL of the thumbnail image. If you add this, then we use as thumbnail image for video you provided in &#x60;url&#x60;. Applicable only when &#x60;isVideo&#x3D;true&#x60;.
     *
     * @param thumbnailUrl
     * @return This {@link MessagesApiMessageRichLinkBody instance}.
     */
    public MessagesApiMessageRichLinkBody thumbnailUrl(String thumbnailUrl) {
        this.thumbnailUrl = thumbnailUrl;
        return this;
    }

    /**
     * Returns thumbnailUrl.
     * <p>
     * Field description:
     * URL of the thumbnail image. If you add this, then we use as thumbnail image for video you provided in &#x60;url&#x60;. Applicable only when &#x60;isVideo&#x3D;true&#x60;.
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
     * URL of the thumbnail image. If you add this, then we use as thumbnail image for video you provided in &#x60;url&#x60;. Applicable only when &#x60;isVideo&#x3D;true&#x60;.
     *
     * @param thumbnailUrl
     */
    @JsonProperty("thumbnailUrl")
    public void setThumbnailUrl(String thumbnailUrl) {
        this.thumbnailUrl = thumbnailUrl;
    }

    /**
     * Sets buttonText.
     * <p>
     * Field description:
     * Button label text.
     *
     * @param buttonText
     * @return This {@link MessagesApiMessageRichLinkBody instance}.
     */
    public MessagesApiMessageRichLinkBody buttonText(String buttonText) {
        this.buttonText = buttonText;
        return this;
    }

    /**
     * Returns buttonText.
     * <p>
     * Field description:
     * Button label text.
     *
     * @return buttonText
     */
    @JsonProperty("buttonText")
    public String getButtonText() {
        return buttonText;
    }

    /**
     * Sets buttonText.
     * <p>
     * Field description:
     * Button label text.
     *
     * @param buttonText
     */
    @JsonProperty("buttonText")
    public void setButtonText(String buttonText) {
        this.buttonText = buttonText;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MessagesApiMessageRichLinkBody messagesApiMessageRichLinkBody = (MessagesApiMessageRichLinkBody) o;
        return Objects.equals(this.redirectUrl, messagesApiMessageRichLinkBody.redirectUrl)
                && Objects.equals(this.text, messagesApiMessageRichLinkBody.text)
                && Objects.equals(this.url, messagesApiMessageRichLinkBody.url)
                && Objects.equals(this.isVideo, messagesApiMessageRichLinkBody.isVideo)
                && Objects.equals(this.thumbnailUrl, messagesApiMessageRichLinkBody.thumbnailUrl)
                && Objects.equals(this.buttonText, messagesApiMessageRichLinkBody.buttonText)
                && super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(redirectUrl, text, url, isVideo, thumbnailUrl, buttonText, super.hashCode());
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class MessagesApiMessageRichLinkBody {")
                .append(newLine)
                .append("    ")
                .append(toIndentedString(super.toString()))
                .append(newLine)
                .append("    redirectUrl: ")
                .append(toIndentedString(redirectUrl))
                .append(newLine)
                .append("    text: ")
                .append(toIndentedString(text))
                .append(newLine)
                .append("    url: ")
                .append(toIndentedString(url))
                .append(newLine)
                .append("    isVideo: ")
                .append(toIndentedString(isVideo))
                .append(newLine)
                .append("    thumbnailUrl: ")
                .append(toIndentedString(thumbnailUrl))
                .append(newLine)
                .append("    buttonText: ")
                .append(toIndentedString(buttonText))
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
