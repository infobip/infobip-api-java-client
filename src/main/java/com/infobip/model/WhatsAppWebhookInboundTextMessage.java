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
 * Represents WhatsAppWebhookInboundTextMessage model.
 */
public class WhatsAppWebhookInboundTextMessage extends WhatsAppWebhookInboundMessage {

    private String text;

    private WhatsAppContext context;

    private WhatsAppWebhookReferral referral;

    /**
     * Constructs a new {@link WhatsAppWebhookInboundTextMessage} instance.
     */
    public WhatsAppWebhookInboundTextMessage() {
        super("TEXT");
    }

    /**
     * Sets text.
     * <p>
     * Field description:
     * Content of the end user&#39;s message.
     * <p>
     * The field is required.
     *
     * @param text
     * @return This {@link WhatsAppWebhookInboundTextMessage instance}.
     */
    public WhatsAppWebhookInboundTextMessage text(String text) {
        this.text = text;
        return this;
    }

    /**
     * Returns text.
     * <p>
     * Field description:
     * Content of the end user&#39;s message.
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
     * Content of the end user&#39;s message.
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
     * Sets context.
     *
     * @param context
     * @return This {@link WhatsAppWebhookInboundTextMessage instance}.
     */
    public WhatsAppWebhookInboundTextMessage context(WhatsAppContext context) {
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
     * @return This {@link WhatsAppWebhookInboundTextMessage instance}.
     */
    public WhatsAppWebhookInboundTextMessage referral(WhatsAppWebhookReferral referral) {
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
        WhatsAppWebhookInboundTextMessage whatsAppWebhookInboundTextMessage = (WhatsAppWebhookInboundTextMessage) o;
        return Objects.equals(this.text, whatsAppWebhookInboundTextMessage.text)
                && Objects.equals(this.context, whatsAppWebhookInboundTextMessage.context)
                && Objects.equals(this.referral, whatsAppWebhookInboundTextMessage.referral)
                && super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(text, context, referral, super.hashCode());
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class WhatsAppWebhookInboundTextMessage {")
                .append(newLine)
                .append("    ")
                .append(toIndentedString(super.toString()))
                .append(newLine)
                .append("    text: ")
                .append(toIndentedString(text))
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
