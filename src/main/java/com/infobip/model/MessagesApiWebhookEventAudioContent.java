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
 * Represents MessagesApiWebhookEventAudioContent model.
 */
public class MessagesApiWebhookEventAudioContent extends MessagesApiWebhookEventContent {

    private String url;

    private String text;

    /**
     * Constructs a new {@link MessagesApiWebhookEventAudioContent} instance.
     */
    public MessagesApiWebhookEventAudioContent() {
        super("AUDIO");
    }

    /**
     * Sets url.
     * <p>
     * Field description:
     * URL of the audio.
     * <p>
     * The field is required.
     *
     * @param url
     * @return This {@link MessagesApiWebhookEventAudioContent instance}.
     */
    public MessagesApiWebhookEventAudioContent url(String url) {
        this.url = url;
        return this;
    }

    /**
     * Returns url.
     * <p>
     * Field description:
     * URL of the audio.
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
     * URL of the audio.
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
     * Audio caption.
     *
     * @param text
     * @return This {@link MessagesApiWebhookEventAudioContent instance}.
     */
    public MessagesApiWebhookEventAudioContent text(String text) {
        this.text = text;
        return this;
    }

    /**
     * Returns text.
     * <p>
     * Field description:
     * Audio caption.
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
     * Audio caption.
     *
     * @param text
     */
    @JsonProperty("text")
    public void setText(String text) {
        this.text = text;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MessagesApiWebhookEventAudioContent messagesApiWebhookEventAudioContent =
                (MessagesApiWebhookEventAudioContent) o;
        return Objects.equals(this.url, messagesApiWebhookEventAudioContent.url)
                && Objects.equals(this.text, messagesApiWebhookEventAudioContent.text)
                && super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(url, text, super.hashCode());
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class MessagesApiWebhookEventAudioContent {")
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
