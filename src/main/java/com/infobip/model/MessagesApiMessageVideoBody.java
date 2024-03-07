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
 * Represents MessagesApiMessageVideoBody model.
 */
public class MessagesApiMessageVideoBody extends MessagesApiMessageBody {

    private String url;

    private String text;

    private String thumbnailUrl;

    /**
     * Constructs a new {@link MessagesApiMessageVideoBody} instance.
     */
    public MessagesApiMessageVideoBody() {
        super("VIDEO");
    }

    /**
     * Sets url.
     * <p>
     * Field description:
     * URL of the video.
     * <p>
     * The field is required.
     *
     * @param url
     * @return This {@link MessagesApiMessageVideoBody instance}.
     */
    public MessagesApiMessageVideoBody url(String url) {
        this.url = url;
        return this;
    }

    /**
     * Returns url.
     * <p>
     * Field description:
     * URL of the video.
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
     * URL of the video.
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
     * Sets text.
     * <p>
     * Field description:
     * Video caption.
     *
     * @param text
     * @return This {@link MessagesApiMessageVideoBody instance}.
     */
    public MessagesApiMessageVideoBody text(String text) {
        this.text = text;
        return this;
    }

    /**
     * Returns text.
     * <p>
     * Field description:
     * Video caption.
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
     * Video caption.
     *
     * @param text
     */
    @JsonProperty("text")
    public void setText(String text) {
        this.text = text;
    }

    /**
     * Sets thumbnailUrl.
     * <p>
     * Field description:
     * URL of the thumbnail of the video (required and used only for Viber messages).
     *
     * @param thumbnailUrl
     * @return This {@link MessagesApiMessageVideoBody instance}.
     */
    public MessagesApiMessageVideoBody thumbnailUrl(String thumbnailUrl) {
        this.thumbnailUrl = thumbnailUrl;
        return this;
    }

    /**
     * Returns thumbnailUrl.
     * <p>
     * Field description:
     * URL of the thumbnail of the video (required and used only for Viber messages).
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
     * URL of the thumbnail of the video (required and used only for Viber messages).
     *
     * @param thumbnailUrl
     */
    @JsonProperty("thumbnailUrl")
    public void setThumbnailUrl(String thumbnailUrl) {
        this.thumbnailUrl = thumbnailUrl;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MessagesApiMessageVideoBody messagesApiMessageVideoBody = (MessagesApiMessageVideoBody) o;
        return Objects.equals(this.url, messagesApiMessageVideoBody.url)
                && Objects.equals(this.text, messagesApiMessageVideoBody.text)
                && Objects.equals(this.thumbnailUrl, messagesApiMessageVideoBody.thumbnailUrl)
                && super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(url, text, thumbnailUrl, super.hashCode());
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class MessagesApiMessageVideoBody {")
                .append(newLine)
                .append("    ")
                .append(toIndentedString(super.toString()))
                .append(newLine)
                .append("    url: ")
                .append(toIndentedString(url))
                .append(newLine)
                .append("    text: ")
                .append(toIndentedString(text))
                .append(newLine)
                .append("    thumbnailUrl: ")
                .append(toIndentedString(thumbnailUrl))
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
