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
 * Represents WhatsAppWebhookInboundDocumentMessage model.
 */
public class WhatsAppWebhookInboundDocumentMessage extends WhatsAppWebhookInboundMessage {

    private String caption;

    private String url;

    /**
     * Constructs a new {@link WhatsAppWebhookInboundDocumentMessage} instance.
     */
    public WhatsAppWebhookInboundDocumentMessage() {
        super("DOCUMENT");
    }

    /**
     * Sets caption.
     * <p>
     * Field description:
     * Media Caption.
     *
     * @param caption
     * @return This {@link WhatsAppWebhookInboundDocumentMessage instance}.
     */
    public WhatsAppWebhookInboundDocumentMessage caption(String caption) {
        this.caption = caption;
        return this;
    }

    /**
     * Returns caption.
     * <p>
     * Field description:
     * Media Caption.
     *
     * @return caption
     */
    @JsonProperty("caption")
    public String getCaption() {
        return caption;
    }

    /**
     * Sets caption.
     * <p>
     * Field description:
     * Media Caption.
     *
     * @param caption
     */
    @JsonProperty("caption")
    public void setCaption(String caption) {
        this.caption = caption;
    }

    /**
     * Sets url.
     * <p>
     * Field description:
     * Url for media download.
     *
     * @param url
     * @return This {@link WhatsAppWebhookInboundDocumentMessage instance}.
     */
    public WhatsAppWebhookInboundDocumentMessage url(String url) {
        this.url = url;
        return this;
    }

    /**
     * Returns url.
     * <p>
     * Field description:
     * Url for media download.
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
     * Url for media download.
     *
     * @param url
     */
    @JsonProperty("url")
    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WhatsAppWebhookInboundDocumentMessage whatsAppWebhookInboundDocumentMessage =
                (WhatsAppWebhookInboundDocumentMessage) o;
        return Objects.equals(this.caption, whatsAppWebhookInboundDocumentMessage.caption)
                && Objects.equals(this.url, whatsAppWebhookInboundDocumentMessage.url)
                && super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(caption, url, super.hashCode());
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class WhatsAppWebhookInboundDocumentMessage {")
                .append(newLine)
                .append("    ")
                .append(toIndentedString(super.toString()))
                .append(newLine)
                .append("    caption: ")
                .append(toIndentedString(caption))
                .append(newLine)
                .append("    url: ")
                .append(toIndentedString(url))
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
