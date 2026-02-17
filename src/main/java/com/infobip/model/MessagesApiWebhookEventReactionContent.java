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
 * Represents MessagesApiWebhookEventReactionContent model.
 */
public class MessagesApiWebhookEventReactionContent extends MessagesApiWebhookEventContent {

    private String emoji;

    private MessagesApiReactionActionType action;

    /**
     * Constructs a new {@link MessagesApiWebhookEventReactionContent} instance.
     */
    public MessagesApiWebhookEventReactionContent() {
        super("REACTION");
    }

    /**
     * Sets emoji.
     * <p>
     * Field description:
     * Emoji used in the reaction.
     *
     * @param emoji
     * @return This {@link MessagesApiWebhookEventReactionContent instance}.
     */
    public MessagesApiWebhookEventReactionContent emoji(String emoji) {
        this.emoji = emoji;
        return this;
    }

    /**
     * Returns emoji.
     * <p>
     * Field description:
     * Emoji used in the reaction.
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
     * Emoji used in the reaction.
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
     * @return This {@link MessagesApiWebhookEventReactionContent instance}.
     */
    public MessagesApiWebhookEventReactionContent action(MessagesApiReactionActionType action) {
        this.action = action;
        return this;
    }

    /**
     * Returns action.
     *
     * @return action
     */
    @JsonProperty("action")
    public MessagesApiReactionActionType getAction() {
        return action;
    }

    /**
     * Sets action.
     *
     * @param action
     */
    @JsonProperty("action")
    public void setAction(MessagesApiReactionActionType action) {
        this.action = action;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MessagesApiWebhookEventReactionContent messagesApiWebhookEventReactionContent =
                (MessagesApiWebhookEventReactionContent) o;
        return Objects.equals(this.emoji, messagesApiWebhookEventReactionContent.emoji)
                && Objects.equals(this.action, messagesApiWebhookEventReactionContent.action)
                && super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(emoji, action, super.hashCode());
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class MessagesApiWebhookEventReactionContent {")
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
