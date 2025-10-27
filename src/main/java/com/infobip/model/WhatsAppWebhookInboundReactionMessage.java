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
 * Represents WhatsAppWebhookInboundReactionMessage model.
 */
public class WhatsAppWebhookInboundReactionMessage extends WhatsAppWebhookInboundMessage {

    private String emoji;

    private WhatsAppReactionAction action;

    private WhatsAppContext context;

    /**
     * Constructs a new {@link WhatsAppWebhookInboundReactionMessage} instance.
     */
    public WhatsAppWebhookInboundReactionMessage() {
        super("REACTION");
    }

    /**
     * Sets emoji.
     * <p>
     * Field description:
     * Emoji reaction.
     *
     * @param emoji
     * @return This {@link WhatsAppWebhookInboundReactionMessage instance}.
     */
    public WhatsAppWebhookInboundReactionMessage emoji(String emoji) {
        this.emoji = emoji;
        return this;
    }

    /**
     * Returns emoji.
     * <p>
     * Field description:
     * Emoji reaction.
     *
     * @return emoji
     */
    @JsonProperty("emoji")
    public String getEmoji() {
        return emoji;
    }

    /**
     * Sets emoji.
     * <p>
     * Field description:
     * Emoji reaction.
     *
     * @param emoji
     */
    @JsonProperty("emoji")
    public void setEmoji(String emoji) {
        this.emoji = emoji;
    }

    /**
     * Sets action.
     *
     * @param action
     * @return This {@link WhatsAppWebhookInboundReactionMessage instance}.
     */
    public WhatsAppWebhookInboundReactionMessage action(WhatsAppReactionAction action) {
        this.action = action;
        return this;
    }

    /**
     * Returns action.
     *
     * @return action
     */
    @JsonProperty("action")
    public WhatsAppReactionAction getAction() {
        return action;
    }

    /**
     * Sets action.
     *
     * @param action
     */
    @JsonProperty("action")
    public void setAction(WhatsAppReactionAction action) {
        this.action = action;
    }

    /**
     * Sets context.
     *
     * @param context
     * @return This {@link WhatsAppWebhookInboundReactionMessage instance}.
     */
    public WhatsAppWebhookInboundReactionMessage context(WhatsAppContext context) {
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
        WhatsAppWebhookInboundReactionMessage whatsAppWebhookInboundReactionMessage =
                (WhatsAppWebhookInboundReactionMessage) o;
        return Objects.equals(this.emoji, whatsAppWebhookInboundReactionMessage.emoji)
                && Objects.equals(this.action, whatsAppWebhookInboundReactionMessage.action)
                && Objects.equals(this.context, whatsAppWebhookInboundReactionMessage.context)
                && super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(emoji, action, context, super.hashCode());
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class WhatsAppWebhookInboundReactionMessage {")
                .append(newLine)
                .append("    ")
                .append(toIndentedString(super.toString()))
                .append(newLine)
                .append("    emoji: ")
                .append(toIndentedString(emoji))
                .append(newLine)
                .append("    action: ")
                .append(toIndentedString(action))
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
