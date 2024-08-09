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
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Represents WhatsAppWebhookExtensionReplyContent model.
 */
public class WhatsAppWebhookExtensionReplyContent extends WhatsAppWebhookInboundMessage {

    private String text;

    private Map<String, Object> response = null;

    private WhatsAppContext context;

    /**
     * Constructs a new {@link WhatsAppWebhookExtensionReplyContent} instance.
     */
    public WhatsAppWebhookExtensionReplyContent() {
        super("INTERACTIVE_EXTENSION_REPLY");
    }

    /**
     * Sets text.
     * <p>
     * Field description:
     * Text of the reply.
     * <p>
     * The field is required.
     *
     * @param text
     * @return This {@link WhatsAppWebhookExtensionReplyContent instance}.
     */
    public WhatsAppWebhookExtensionReplyContent text(String text) {
        this.text = text;
        return this;
    }

    /**
     * Returns text.
     * <p>
     * Field description:
     * Text of the reply.
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
     * Text of the reply.
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
     * Sets response.
     * <p>
     * Field description:
     * Response payload of the reply.
     *
     * @param response
     * @return This {@link WhatsAppWebhookExtensionReplyContent instance}.
     */
    public WhatsAppWebhookExtensionReplyContent response(Map<String, Object> response) {
        this.response = response;
        return this;
    }

    /**
     * Puts and entry into response.
     * <p>
     * Field description:
     * Response payload of the reply.
     *
     * @param key The given key.
     * @param responseItem The item to be associated with the given key.
     * @return This {@link WhatsAppWebhookExtensionReplyContent instance}.
     */
    public WhatsAppWebhookExtensionReplyContent putResponseItem(String key, Object responseItem) {
        if (this.response == null) {
            this.response = new HashMap<>();
        }
        this.response.put(key, responseItem);
        return this;
    }

    /**
     * Returns response.
     * <p>
     * Field description:
     * Response payload of the reply.
     *
     * @return response
     */
    @JsonProperty("response")
    public Map<String, Object> getResponse() {
        return response;
    }

    /**
     * Sets response.
     * <p>
     * Field description:
     * Response payload of the reply.
     *
     * @param response
     */
    @JsonProperty("response")
    public void setResponse(Map<String, Object> response) {
        this.response = response;
    }

    /**
     * Sets context.
     *
     * @param context
     * @return This {@link WhatsAppWebhookExtensionReplyContent instance}.
     */
    public WhatsAppWebhookExtensionReplyContent context(WhatsAppContext context) {
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
        WhatsAppWebhookExtensionReplyContent whatsAppWebhookExtensionReplyContent =
                (WhatsAppWebhookExtensionReplyContent) o;
        return Objects.equals(this.text, whatsAppWebhookExtensionReplyContent.text)
                && Objects.equals(this.response, whatsAppWebhookExtensionReplyContent.response)
                && Objects.equals(this.context, whatsAppWebhookExtensionReplyContent.context)
                && super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(text, response, context, super.hashCode());
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class WhatsAppWebhookExtensionReplyContent {")
                .append(newLine)
                .append("    ")
                .append(toIndentedString(super.toString()))
                .append(newLine)
                .append("    text: ")
                .append(toIndentedString(text))
                .append(newLine)
                .append("    response: ")
                .append(toIndentedString(response))
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
