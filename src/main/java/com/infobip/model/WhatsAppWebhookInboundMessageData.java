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
import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * Represents WhatsAppWebhookInboundMessageData model.
 */
public class WhatsAppWebhookInboundMessageData {

    private String from;

    private String to;

    private OffsetDateTime receivedAt;

    private String messageId;

    private MessagePrice price;

    private WhatsAppWebhookInboundMessage message;

    private WhatsAppWebhookContactName contact;

    /**
     * Sets from.
     * <p>
     * Field description:
     * Number which sent the message.
     *
     * @param from
     * @return This {@link WhatsAppWebhookInboundMessageData instance}.
     */
    public WhatsAppWebhookInboundMessageData from(String from) {
        this.from = from;
        return this;
    }

    /**
     * Returns from.
     * <p>
     * Field description:
     * Number which sent the message.
     *
     * @return from
     */
    @JsonProperty("from")
    public String getFrom() {
        return from;
    }

    /**
     * Sets from.
     * <p>
     * Field description:
     * Number which sent the message.
     *
     * @param from
     */
    @JsonProperty("from")
    public void setFrom(String from) {
        this.from = from;
    }

    /**
     * Sets to.
     * <p>
     * Field description:
     * Sender provided during the activation process.
     *
     * @param to
     * @return This {@link WhatsAppWebhookInboundMessageData instance}.
     */
    public WhatsAppWebhookInboundMessageData to(String to) {
        this.to = to;
        return this;
    }

    /**
     * Returns to.
     * <p>
     * Field description:
     * Sender provided during the activation process.
     *
     * @return to
     */
    @JsonProperty("to")
    public String getTo() {
        return to;
    }

    /**
     * Sets to.
     * <p>
     * Field description:
     * Sender provided during the activation process.
     *
     * @param to
     */
    @JsonProperty("to")
    public void setTo(String to) {
        this.to = to;
    }

    /**
     * Sets receivedAt.
     * <p>
     * Field description:
     * Date and time when Infobip received the message.
     *
     * @param receivedAt
     * @return This {@link WhatsAppWebhookInboundMessageData instance}.
     */
    public WhatsAppWebhookInboundMessageData receivedAt(OffsetDateTime receivedAt) {
        this.receivedAt = receivedAt;
        return this;
    }

    /**
     * Returns receivedAt.
     * <p>
     * Field description:
     * Date and time when Infobip received the message.
     *
     * @return receivedAt
     */
    @JsonProperty("receivedAt")
    public OffsetDateTime getReceivedAt() {
        return receivedAt;
    }

    /**
     * Sets receivedAt.
     * <p>
     * Field description:
     * Date and time when Infobip received the message.
     *
     * @param receivedAt
     */
    @JsonProperty("receivedAt")
    public void setReceivedAt(OffsetDateTime receivedAt) {
        this.receivedAt = receivedAt;
    }

    /**
     * Sets messageId.
     * <p>
     * Field description:
     * The ID that uniquely identifies the received message.
     *
     * @param messageId
     * @return This {@link WhatsAppWebhookInboundMessageData instance}.
     */
    public WhatsAppWebhookInboundMessageData messageId(String messageId) {
        this.messageId = messageId;
        return this;
    }

    /**
     * Returns messageId.
     * <p>
     * Field description:
     * The ID that uniquely identifies the received message.
     *
     * @return messageId
     */
    @JsonProperty("messageId")
    public String getMessageId() {
        return messageId;
    }

    /**
     * Sets messageId.
     * <p>
     * Field description:
     * The ID that uniquely identifies the received message.
     *
     * @param messageId
     */
    @JsonProperty("messageId")
    public void setMessageId(String messageId) {
        this.messageId = messageId;
    }

    /**
     * Sets price.
     *
     * @param price
     * @return This {@link WhatsAppWebhookInboundMessageData instance}.
     */
    public WhatsAppWebhookInboundMessageData price(MessagePrice price) {
        this.price = price;
        return this;
    }

    /**
     * Returns price.
     *
     * @return price
     */
    @JsonProperty("price")
    public MessagePrice getPrice() {
        return price;
    }

    /**
     * Sets price.
     *
     * @param price
     */
    @JsonProperty("price")
    public void setPrice(MessagePrice price) {
        this.price = price;
    }

    /**
     * Sets message.
     *
     * @param message
     * @return This {@link WhatsAppWebhookInboundMessageData instance}.
     */
    public WhatsAppWebhookInboundMessageData message(WhatsAppWebhookInboundMessage message) {
        this.message = message;
        return this;
    }

    /**
     * Returns message.
     *
     * @return message
     */
    @JsonProperty("message")
    public WhatsAppWebhookInboundMessage getMessage() {
        return message;
    }

    /**
     * Sets message.
     *
     * @param message
     */
    @JsonProperty("message")
    public void setMessage(WhatsAppWebhookInboundMessage message) {
        this.message = message;
    }

    /**
     * Sets contact.
     * <p>
     * Field description:
     * Information about recipient.
     *
     * @param contact
     * @return This {@link WhatsAppWebhookInboundMessageData instance}.
     */
    public WhatsAppWebhookInboundMessageData contact(WhatsAppWebhookContactName contact) {
        this.contact = contact;
        return this;
    }

    /**
     * Returns contact.
     * <p>
     * Field description:
     * Information about recipient.
     *
     * @return contact
     */
    @JsonProperty("contact")
    public WhatsAppWebhookContactName getContact() {
        return contact;
    }

    /**
     * Sets contact.
     * <p>
     * Field description:
     * Information about recipient.
     *
     * @param contact
     */
    @JsonProperty("contact")
    public void setContact(WhatsAppWebhookContactName contact) {
        this.contact = contact;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WhatsAppWebhookInboundMessageData whatsAppWebhookInboundMessageData = (WhatsAppWebhookInboundMessageData) o;
        return Objects.equals(this.from, whatsAppWebhookInboundMessageData.from)
                && Objects.equals(this.to, whatsAppWebhookInboundMessageData.to)
                && Objects.equals(this.receivedAt, whatsAppWebhookInboundMessageData.receivedAt)
                && Objects.equals(this.messageId, whatsAppWebhookInboundMessageData.messageId)
                && Objects.equals(this.price, whatsAppWebhookInboundMessageData.price)
                && Objects.equals(this.message, whatsAppWebhookInboundMessageData.message)
                && Objects.equals(this.contact, whatsAppWebhookInboundMessageData.contact);
    }

    @Override
    public int hashCode() {
        return Objects.hash(from, to, receivedAt, messageId, price, message, contact);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class WhatsAppWebhookInboundMessageData {")
                .append(newLine)
                .append("    from: ")
                .append(toIndentedString(from))
                .append(newLine)
                .append("    to: ")
                .append(toIndentedString(to))
                .append(newLine)
                .append("    receivedAt: ")
                .append(toIndentedString(receivedAt))
                .append(newLine)
                .append("    messageId: ")
                .append(toIndentedString(messageId))
                .append(newLine)
                .append("    price: ")
                .append(toIndentedString(price))
                .append(newLine)
                .append("    message: ")
                .append(toIndentedString(message))
                .append(newLine)
                .append("    contact: ")
                .append(toIndentedString(contact))
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
