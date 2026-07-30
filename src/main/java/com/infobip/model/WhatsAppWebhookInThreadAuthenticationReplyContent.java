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
 * Represents WhatsAppWebhookInThreadAuthenticationReplyContent model.
 */
public class WhatsAppWebhookInThreadAuthenticationReplyContent extends WhatsAppWebhookInboundMessage {

    private WhatsAppInThreadAuthenticationReply inThreadAuthenticationReply;

    private WhatsAppContext context;

    /**
     * Constructs a new {@link WhatsAppWebhookInThreadAuthenticationReplyContent} instance.
     */
    public WhatsAppWebhookInThreadAuthenticationReplyContent() {
        super("INTERACTIVE_IN_THREAD_AUTHENTICATION_REPLY");
    }

    /**
     * Sets inThreadAuthenticationReply.
     * <p>
     * The field is required.
     *
     * @param inThreadAuthenticationReply
     * @return This {@link WhatsAppWebhookInThreadAuthenticationReplyContent instance}.
     */
    public WhatsAppWebhookInThreadAuthenticationReplyContent inThreadAuthenticationReply(
            WhatsAppInThreadAuthenticationReply inThreadAuthenticationReply) {
        this.inThreadAuthenticationReply = inThreadAuthenticationReply;
        return this;
    }

    /**
     * Returns inThreadAuthenticationReply.
     * <p>
     * The field is required.
     *
     * @return inThreadAuthenticationReply
     */
    @JsonProperty("inThreadAuthenticationReply")
    public WhatsAppInThreadAuthenticationReply getInThreadAuthenticationReply() {
        return inThreadAuthenticationReply;
    }

    /**
     * Sets inThreadAuthenticationReply.
     * <p>
     * The field is required.
     *
     * @param inThreadAuthenticationReply
     */
    @JsonProperty("inThreadAuthenticationReply")
    public void setInThreadAuthenticationReply(WhatsAppInThreadAuthenticationReply inThreadAuthenticationReply) {
        this.inThreadAuthenticationReply = inThreadAuthenticationReply;
    }

    /**
     * Sets context.
     *
     * @param context
     * @return This {@link WhatsAppWebhookInThreadAuthenticationReplyContent instance}.
     */
    public WhatsAppWebhookInThreadAuthenticationReplyContent context(WhatsAppContext context) {
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
        WhatsAppWebhookInThreadAuthenticationReplyContent whatsAppWebhookInThreadAuthenticationReplyContent =
                (WhatsAppWebhookInThreadAuthenticationReplyContent) o;
        return Objects.equals(
                        this.inThreadAuthenticationReply,
                        whatsAppWebhookInThreadAuthenticationReplyContent.inThreadAuthenticationReply)
                && Objects.equals(this.context, whatsAppWebhookInThreadAuthenticationReplyContent.context)
                && super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(inThreadAuthenticationReply, context, super.hashCode());
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class WhatsAppWebhookInThreadAuthenticationReplyContent {")
                .append(newLine)
                .append("    ")
                .append(toIndentedString(super.toString()))
                .append(newLine)
                .append("    inThreadAuthenticationReply: ")
                .append(toIndentedString(inThreadAuthenticationReply))
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
