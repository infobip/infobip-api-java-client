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
 * Represents WhatsAppWebhookInboundStickerMessage model.
 */
public class WhatsAppWebhookInboundStickerMessage extends WhatsAppWebhookInboundMessage {

    private String url;

    private WhatsAppContext context;

    private WhatsAppWebhookReferral referral;

    /**
     * Constructs a new {@link WhatsAppWebhookInboundStickerMessage} instance.
     */
    public WhatsAppWebhookInboundStickerMessage() {
        super("STICKER");
    }

    /**
     * Sets url.
     * <p>
     * Field description:
     * URL for media download.
     * <p>
     * The field is required.
     *
     * @param url
     * @return This {@link WhatsAppWebhookInboundStickerMessage instance}.
     */
    public WhatsAppWebhookInboundStickerMessage url(String url) {
        this.url = url;
        return this;
    }

    /**
     * Returns url.
     * <p>
     * Field description:
     * URL for media download.
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
     * URL for media download.
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
     * Sets context.
     *
     * @param context
     * @return This {@link WhatsAppWebhookInboundStickerMessage instance}.
     */
    public WhatsAppWebhookInboundStickerMessage context(WhatsAppContext context) {
        this.context = context;
        return this;
    }

    /**
     * Returns context.
     *
     * @return context
     */
    @JsonProperty("context")
    public WhatsAppContext getContext() {
        return context;
    }

    /**
     * Sets context.
     *
     * @param context
     */
    @JsonProperty("context")
    public void setContext(WhatsAppContext context) {
        this.context = context;
    }

    /**
     * Sets referral.
     *
     * @param referral
     * @return This {@link WhatsAppWebhookInboundStickerMessage instance}.
     */
    public WhatsAppWebhookInboundStickerMessage referral(WhatsAppWebhookReferral referral) {
        this.referral = referral;
        return this;
    }

    /**
     * Returns referral.
     *
     * @return referral
     */
    @JsonProperty("referral")
    public WhatsAppWebhookReferral getReferral() {
        return referral;
    }

    /**
     * Sets referral.
     *
     * @param referral
     */
    @JsonProperty("referral")
    public void setReferral(WhatsAppWebhookReferral referral) {
        this.referral = referral;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WhatsAppWebhookInboundStickerMessage whatsAppWebhookInboundStickerMessage =
                (WhatsAppWebhookInboundStickerMessage) o;
        return Objects.equals(this.url, whatsAppWebhookInboundStickerMessage.url)
                && Objects.equals(this.context, whatsAppWebhookInboundStickerMessage.context)
                && Objects.equals(this.referral, whatsAppWebhookInboundStickerMessage.referral)
                && super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(url, context, referral, super.hashCode());
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class WhatsAppWebhookInboundStickerMessage {")
                .append(newLine)
                .append("    ")
                .append(toIndentedString(super.toString()))
                .append(newLine)
                .append("    url: ")
                .append(toIndentedString(url))
                .append(newLine)
                .append("    context: ")
                .append(toIndentedString(context))
                .append(newLine)
                .append("    referral: ")
                .append(toIndentedString(referral))
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
