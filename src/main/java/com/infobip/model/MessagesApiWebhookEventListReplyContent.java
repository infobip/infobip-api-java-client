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
 * Represents MessagesApiWebhookEventListReplyContent model.
 */
public class MessagesApiWebhookEventListReplyContent extends MessagesApiWebhookEventContent {

    private String text;

    private String id;

    /**
     * Constructs a new {@link MessagesApiWebhookEventListReplyContent} instance.
     */
    public MessagesApiWebhookEventListReplyContent() {
        super("LIST_REPLY");
    }

    /**
     * Sets text.
     * <p>
     * Field description:
     * Text of the selected reply.
     * <p>
     * The field is required.
     *
     * @param text
     * @return This {@link MessagesApiWebhookEventListReplyContent instance}.
     */
    public MessagesApiWebhookEventListReplyContent text(String text) {
        this.text = text;
        return this;
    }

    /**
     * Returns text.
     * <p>
     * Field description:
     * Text of the selected reply.
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
     * Text of the selected reply.
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
     * Sets id.
     * <p>
     * Field description:
     * Identifier of the selected reply.
     * <p>
     * The field is required.
     *
     * @param id
     * @return This {@link MessagesApiWebhookEventListReplyContent instance}.
     */
    public MessagesApiWebhookEventListReplyContent id(String id) {
        this.id = id;
        return this;
    }

    /**
     * Returns id.
     * <p>
     * Field description:
     * Identifier of the selected reply.
     * <p>
     * The field is required.
     *
     * @return id
     */
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    /**
     * Sets id.
     * <p>
     * Field description:
     * Identifier of the selected reply.
     * <p>
     * The field is required.
     *
     * @param id
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MessagesApiWebhookEventListReplyContent messagesApiWebhookEventListReplyContent =
                (MessagesApiWebhookEventListReplyContent) o;
        return Objects.equals(this.text, messagesApiWebhookEventListReplyContent.text)
                && Objects.equals(this.id, messagesApiWebhookEventListReplyContent.id)
                && super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(text, id, super.hashCode());
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class MessagesApiWebhookEventListReplyContent {")
                .append(newLine)
                .append("    ")
                .append(toIndentedString(super.toString()))
                .append(newLine)
                .append("    text: ")
                .append(toIndentedString(text))
                .append(newLine)
                .append("    id: ")
                .append(toIndentedString(id))
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
