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
 * Represents WhatsAppWebhookInboundImageMessage model.
 */
public class WhatsAppWebhookInboundImageMessage extends WhatsAppWebhookInboundMessage {

    private String url;

    private String caption;

    private WhatsAppContext context;

    private WhatsAppWebhookReferral referral;

    /**
     * Constructs a new {@link WhatsAppWebhookInboundImageMessage} instance.
     */
    public WhatsAppWebhookInboundImageMessage() {
        super("IMAGE");
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
     * @return This {@link WhatsAppWebhookInboundImageMessage instance}.
     */
    public WhatsAppWebhookInboundImageMessage url(String url) {
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
     * Sets caption.
     * <p>
     * Field description:
     * Media Caption.
     *
     * @param caption
     * @return This {@link WhatsAppWebhookInboundImageMessage instance}.
     */
    public WhatsAppWebhookInboundImageMessage caption(String caption) {
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
     * Sets context.
     *
     * @param context
     * @return This {@link WhatsAppWebhookInboundImageMessage instance}.
     */
    public WhatsAppWebhookInboundImageMessage context(WhatsAppContext context) {
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
     * @return This {@link WhatsAppWebhookInboundImageMessage instance}.
     */
    public WhatsAppWebhookInboundImageMessage referral(WhatsAppWebhookReferral referral) {
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
        WhatsAppWebhookInboundImageMessage whatsAppWebhookInboundImageMessage = (WhatsAppWebhookInboundImageMessage) o;
        return Objects.equals(this.url, whatsAppWebhookInboundImageMessage.url)
                && Objects.equals(this.caption, whatsAppWebhookInboundImageMessage.caption)
                && Objects.equals(this.context, whatsAppWebhookInboundImageMessage.context)
                && Objects.equals(this.referral, whatsAppWebhookInboundImageMessage.referral)
                && super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(url, caption, context, referral, super.hashCode());
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class WhatsAppWebhookInboundImageMessage {")
                .append(newLine)
                .append("    ")
                .append(toIndentedString(super.toString()))
                .append(newLine)
                .append("    url: ")
                .append(toIndentedString(url))
                .append(newLine)
                .append("    caption: ")
                .append(toIndentedString(caption))
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
