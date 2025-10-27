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
 * Body of a card.
 */
public class MessagesApiMessageCarouselCardBody {

    private String title;

    private String text;

    private String url;

    private Boolean isVideo;

    private String thumbnailUrl;

    private MessagesApiMessageCardOptions cardOptions;

    /**
     * Sets title.
     * <p>
     * Field description:
     * Title of the card.
     *
     * @param title
     * @return This {@link MessagesApiMessageCarouselCardBody instance}.
     */
    public MessagesApiMessageCarouselCardBody title(String title) {
        this.title = title;
        return this;
    }

    /**
     * Returns title.
     * <p>
     * Field description:
     * Title of the card.
     *
     * @return title
     */
    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    /**
     * Sets title.
     * <p>
     * Field description:
     * Title of the card.
     *
     * @param title
     */
    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Sets text.
     * <p>
     * Field description:
     * Text to be sent.
     *
     * @param text
     * @return This {@link MessagesApiMessageCarouselCardBody instance}.
     */
    public MessagesApiMessageCarouselCardBody text(String text) {
        this.text = text;
        return this;
    }

    /**
     * Returns text.
     * <p>
     * Field description:
     * Text to be sent.
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
     * URL of the card&#39;s media. It can be image or video. When you provide it with &#x60;isVideo&#x3D;true&#x60; then it will be mapped as a video, otherwise - as an image.
     *
     * @param url
     * @return This {@link MessagesApiMessageCarouselCardBody instance}.
     */
    public MessagesApiMessageCarouselCardBody url(String url) {
        this.url = url;
        return this;
    }

    /**
     * Returns url.
     * <p>
     * Field description:
     * URL of the card&#39;s media. It can be image or video. When you provide it with &#x60;isVideo&#x3D;true&#x60; then it will be mapped as a video, otherwise - as an image.
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
     * URL of the card&#39;s media. It can be image or video. When you provide it with &#x60;isVideo&#x3D;true&#x60; then it will be mapped as a video, otherwise - as an image.
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
     * @return This {@link MessagesApiMessageCarouselCardBody instance}.
     */
    public MessagesApiMessageCarouselCardBody isVideo(Boolean isVideo) {
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
     * @return This {@link MessagesApiMessageCarouselCardBody instance}.
     */
    public MessagesApiMessageCarouselCardBody thumbnailUrl(String thumbnailUrl) {
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
     * Sets cardOptions.
     *
     * @param cardOptions
     * @return This {@link MessagesApiMessageCarouselCardBody instance}.
     */
    public MessagesApiMessageCarouselCardBody cardOptions(MessagesApiMessageCardOptions cardOptions) {
        this.cardOptions = cardOptions;
        return this;
    }

    /**
     * Returns cardOptions.
     *
     * @return cardOptions
     */
    @JsonProperty("cardOptions")
    public MessagesApiMessageCardOptions getCardOptions() {
        return cardOptions;
    }

    /**
     * Sets cardOptions.
     *
     * @param cardOptions
     */
    @JsonProperty("cardOptions")
    public void setCardOptions(MessagesApiMessageCardOptions cardOptions) {
        this.cardOptions = cardOptions;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MessagesApiMessageCarouselCardBody messagesApiMessageCarouselCardBody = (MessagesApiMessageCarouselCardBody) o;
        return Objects.equals(this.title, messagesApiMessageCarouselCardBody.title)
                && Objects.equals(this.text, messagesApiMessageCarouselCardBody.text)
                && Objects.equals(this.url, messagesApiMessageCarouselCardBody.url)
                && Objects.equals(this.isVideo, messagesApiMessageCarouselCardBody.isVideo)
                && Objects.equals(this.thumbnailUrl, messagesApiMessageCarouselCardBody.thumbnailUrl)
                && Objects.equals(this.cardOptions, messagesApiMessageCarouselCardBody.cardOptions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, text, url, isVideo, thumbnailUrl, cardOptions);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class MessagesApiMessageCarouselCardBody {")
                .append(newLine)
                .append("    title: ")
                .append(toIndentedString(title))
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
                .append("    cardOptions: ")
                .append(toIndentedString(cardOptions))
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
