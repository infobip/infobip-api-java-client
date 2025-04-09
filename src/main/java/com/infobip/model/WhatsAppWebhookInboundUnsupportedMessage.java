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
 * Represents WhatsAppWebhookInboundUnsupportedMessage model.
 */
public class WhatsAppWebhookInboundUnsupportedMessage extends WhatsAppWebhookInboundMessage {

    private WhatsAppContext context;

    /**
     * Constructs a new {@link WhatsAppWebhookInboundUnsupportedMessage} instance.
     */
    public WhatsAppWebhookInboundUnsupportedMessage() {
        super("UNSUPPORTED");
    }

    /**
     * Sets context.
     *
     * @param context
     * @return This {@link WhatsAppWebhookInboundUnsupportedMessage instance}.
     */
    public WhatsAppWebhookInboundUnsupportedMessage context(WhatsAppContext context) {
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
        WhatsAppWebhookInboundUnsupportedMessage whatsAppWebhookInboundUnsupportedMessage =
                (WhatsAppWebhookInboundUnsupportedMessage) o;
        return Objects.equals(this.context, whatsAppWebhookInboundUnsupportedMessage.context) && super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(context, super.hashCode());
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class WhatsAppWebhookInboundUnsupportedMessage {")
                .append(newLine)
                .append("    ")
                .append(toIndentedString(super.toString()))
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
