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
 * Represents WhatsAppWebhookInboundQuickReplyContent model.
 */
public class WhatsAppWebhookInboundQuickReplyContent extends WhatsAppWebhookInboundContent {

    private String text;

    private String payload;

    private WhatsAppContext context;

    /**
     * Constructs a new {@link WhatsAppWebhookInboundQuickReplyContent} instance.
     */
    public WhatsAppWebhookInboundQuickReplyContent() {
        super("BUTTON");
    }

    /**
     * Sets text.
     * <p>
     * Field description:
     * Text of the selected button.
     * <p>
     * The field is required.
     *
     * @param text
     * @return This {@link WhatsAppWebhookInboundQuickReplyContent instance}.
     */
    public WhatsAppWebhookInboundQuickReplyContent text(String text) {
        this.text = text;
        return this;
    }

    /**
     * Returns text.
     * <p>
     * Field description:
     * Text of the selected button.
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
     * Text of the selected button.
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
     * Sets payload.
     * <p>
     * Field description:
     * Payload of the selected button.
     * <p>
     * The field is required.
     *
     * @param payload
     * @return This {@link WhatsAppWebhookInboundQuickReplyContent instance}.
     */
    public WhatsAppWebhookInboundQuickReplyContent payload(String payload) {
        this.payload = payload;
        return this;
    }

    /**
     * Returns payload.
     * <p>
     * Field description:
     * Payload of the selected button.
     * <p>
     * The field is required.
     *
     * @return payload
     */
    @JsonProperty("payload")
    public String getPayload() {
        return payload;
    }

    /**
     * Sets payload.
     * <p>
     * Field description:
     * Payload of the selected button.
     * <p>
     * The field is required.
     *
     * @param payload
     */
    @JsonProperty("payload")
    public void setPayload(String payload) {
        this.payload = payload;
    }

    /**
     * Sets context.
     *
     * @param context
     * @return This {@link WhatsAppWebhookInboundQuickReplyContent instance}.
     */
    public WhatsAppWebhookInboundQuickReplyContent context(WhatsAppContext context) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WhatsAppWebhookInboundQuickReplyContent whatsAppWebhookInboundQuickReplyContent =
                (WhatsAppWebhookInboundQuickReplyContent) o;
        return Objects.equals(this.text, whatsAppWebhookInboundQuickReplyContent.text)
                && Objects.equals(this.payload, whatsAppWebhookInboundQuickReplyContent.payload)
                && Objects.equals(this.context, whatsAppWebhookInboundQuickReplyContent.context)
                && super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(text, payload, context, super.hashCode());
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class WhatsAppWebhookInboundQuickReplyContent {")
                .append(newLine)
                .append("    ")
                .append(toIndentedString(super.toString()))
                .append(newLine)
                .append("    text: ")
                .append(toIndentedString(text))
                .append(newLine)
                .append("    payload: ")
                .append(toIndentedString(payload))
                .append(newLine)
                .append("    context: ")
                .append(toIndentedString(context))
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
