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
 * Represents MessagesApiWebhookEventButtonReplyContent model.
 */
public class MessagesApiWebhookEventButtonReplyContent extends MessagesApiWebhookEventContent {

    private String text;

    private String payload;

    private String id;

    /**
     * Constructs a new {@link MessagesApiWebhookEventButtonReplyContent} instance.
     */
    public MessagesApiWebhookEventButtonReplyContent() {
        super("BUTTON_REPLY");
    }

    /**
     * Sets text.
     * <p>
     * Field description:
     * Title of the selected button.
     * <p>
     * The field is required.
     *
     * @param text
     * @return This {@link MessagesApiWebhookEventButtonReplyContent instance}.
     */
    public MessagesApiWebhookEventButtonReplyContent text(String text) {
        this.text = text;
        return this;
    }

    /**
     * Returns text.
     * <p>
     * Field description:
     * Title of the selected button.
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
     * Title of the selected button.
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
     *
     * @param payload
     * @return This {@link MessagesApiWebhookEventButtonReplyContent instance}.
     */
    public MessagesApiWebhookEventButtonReplyContent payload(String payload) {
        this.payload = payload;
        return this;
    }

    /**
     * Returns payload.
     * <p>
     * Field description:
     * Payload of the selected button.
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
     *
     * @param payload
     */
    @JsonProperty("payload")
    public void setPayload(String payload) {
        this.payload = payload;
    }

    /**
     * Sets id.
     * <p>
     * Field description:
     * Identifier of the selected button.
     *
     * @param id
     * @return This {@link MessagesApiWebhookEventButtonReplyContent instance}.
     */
    public MessagesApiWebhookEventButtonReplyContent id(String id) {
        this.id = id;
        return this;
    }

    /**
     * Returns id.
     * <p>
     * Field description:
     * Identifier of the selected button.
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
     * Identifier of the selected button.
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
        MessagesApiWebhookEventButtonReplyContent messagesApiWebhookEventButtonReplyContent =
                (MessagesApiWebhookEventButtonReplyContent) o;
        return Objects.equals(this.text, messagesApiWebhookEventButtonReplyContent.text)
                && Objects.equals(this.payload, messagesApiWebhookEventButtonReplyContent.payload)
                && Objects.equals(this.id, messagesApiWebhookEventButtonReplyContent.id)
                && super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(text, payload, id, super.hashCode());
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class MessagesApiWebhookEventButtonReplyContent {")
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
