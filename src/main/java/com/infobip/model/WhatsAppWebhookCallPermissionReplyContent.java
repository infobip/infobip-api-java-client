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
 * Represents WhatsAppWebhookCallPermissionReplyContent model.
 */
public class WhatsAppWebhookCallPermissionReplyContent extends WhatsAppWebhookInboundMessage {

    private WhatsAppCallPermissionReply callPermissionReply;

    private WhatsAppContext context;

    /**
     * Constructs a new {@link WhatsAppWebhookCallPermissionReplyContent} instance.
     */
    public WhatsAppWebhookCallPermissionReplyContent() {
        super("INTERACTIVE_CALL_PERMISSION_REPLY");
    }

    /**
     * Sets callPermissionReply.
     * <p>
     * The field is required.
     *
     * @param callPermissionReply
     * @return This {@link WhatsAppWebhookCallPermissionReplyContent instance}.
     */
    public WhatsAppWebhookCallPermissionReplyContent callPermissionReply(
            WhatsAppCallPermissionReply callPermissionReply) {
        this.callPermissionReply = callPermissionReply;
        return this;
    }

    /**
     * Returns callPermissionReply.
     * <p>
     * The field is required.
     *
     * @return callPermissionReply
     */
    @JsonProperty("callPermissionReply")
    public WhatsAppCallPermissionReply getCallPermissionReply() {
        return callPermissionReply;
    }

    /**
     * Sets callPermissionReply.
     * <p>
     * The field is required.
     *
     * @param callPermissionReply
     */
    @JsonProperty("callPermissionReply")
    public void setCallPermissionReply(WhatsAppCallPermissionReply callPermissionReply) {
        this.callPermissionReply = callPermissionReply;
    }

    /**
     * Sets context.
     *
     * @param context
     * @return This {@link WhatsAppWebhookCallPermissionReplyContent instance}.
     */
    public WhatsAppWebhookCallPermissionReplyContent context(WhatsAppContext context) {
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
        WhatsAppWebhookCallPermissionReplyContent whatsAppWebhookCallPermissionReplyContent =
                (WhatsAppWebhookCallPermissionReplyContent) o;
        return Objects.equals(this.callPermissionReply, whatsAppWebhookCallPermissionReplyContent.callPermissionReply)
                && Objects.equals(this.context, whatsAppWebhookCallPermissionReplyContent.context)
                && super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(callPermissionReply, context, super.hashCode());
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class WhatsAppWebhookCallPermissionReplyContent {")
                .append(newLine)
                .append("    ")
                .append(toIndentedString(super.toString()))
                .append(newLine)
                .append("    callPermissionReply: ")
                .append(toIndentedString(callPermissionReply))
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
