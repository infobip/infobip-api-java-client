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
 * Represents WhatsAppWebhookInboundFlowReplyContent model.
 */
public class WhatsAppWebhookInboundFlowReplyContent extends WhatsAppWebhookInboundContent {

    private String text;

    private Map<String, Object> response = null;

    private WhatsAppContext context;

    /**
     * Constructs a new {@link WhatsAppWebhookInboundFlowReplyContent} instance.
     */
    public WhatsAppWebhookInboundFlowReplyContent() {
        super("INTERACTIVE_FLOW_REPLY");
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
     * @return This {@link WhatsAppWebhookInboundFlowReplyContent instance}.
     */
    public WhatsAppWebhookInboundFlowReplyContent text(String text) {
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
     * @return This {@link WhatsAppWebhookInboundFlowReplyContent instance}.
     */
    public WhatsAppWebhookInboundFlowReplyContent response(Map<String, Object> response) {
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
     * @return This {@link WhatsAppWebhookInboundFlowReplyContent instance}.
     */
    public WhatsAppWebhookInboundFlowReplyContent putResponseItem(String key, Object responseItem) {
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
     * @return This {@link WhatsAppWebhookInboundFlowReplyContent instance}.
     */
    public WhatsAppWebhookInboundFlowReplyContent context(WhatsAppContext context) {
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
        WhatsAppWebhookInboundFlowReplyContent whatsAppWebhookInboundFlowReplyContent =
                (WhatsAppWebhookInboundFlowReplyContent) o;
        return Objects.equals(this.text, whatsAppWebhookInboundFlowReplyContent.text)
                && Objects.equals(this.response, whatsAppWebhookInboundFlowReplyContent.response)
                && Objects.equals(this.context, whatsAppWebhookInboundFlowReplyContent.context)
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
                .append("class WhatsAppWebhookInboundFlowReplyContent {")
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
