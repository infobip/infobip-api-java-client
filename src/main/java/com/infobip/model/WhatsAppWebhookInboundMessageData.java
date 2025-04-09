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
 * Collection of mobile originated messages.
 */
public class WhatsAppWebhookInboundMessageData {

    private String entityId;

    private String applicationId;

    private String from;

    private String to;

    private String integrationType;

    private OffsetDateTime receivedAt;

    private String keyword;

    private String messageId;

    private String pairedMessageId;

    private String callbackData;

    private WhatsAppWebhookInboundMessage message;

    private MessagePrice price;

    private WhatsAppWebhookContactName contact;

    private WhatsAppWebhookIdentity identity;

    /**
     * Sets entityId.
     * <p>
     * Field description:
     * Used when specifying an entity in outbound send requests. It is also returned in notification events. For detailed usage, refer to the [documentation](https://www.infobip.com/docs/cpaas-x/application-and-entity-management).
     *
     * @param entityId
     * @return This {@link WhatsAppWebhookInboundMessageData instance}.
     */
    public WhatsAppWebhookInboundMessageData entityId(String entityId) {
        this.entityId = entityId;
        return this;
    }

    /**
     * Returns entityId.
     * <p>
     * Field description:
     * Used when specifying an entity in outbound send requests. It is also returned in notification events. For detailed usage, refer to the [documentation](https://www.infobip.com/docs/cpaas-x/application-and-entity-management).
     *
     * @return entityId
     */
    @JsonProperty("entityId")
    public String getEntityId() {
        return entityId;
    }

    /**
     * Sets entityId.
     * <p>
     * Field description:
     * Used when specifying an entity in outbound send requests. It is also returned in notification events. For detailed usage, refer to the [documentation](https://www.infobip.com/docs/cpaas-x/application-and-entity-management).
     *
     * @param entityId
     */
    @JsonProperty("entityId")
    public void setEntityId(String entityId) {
        this.entityId = entityId;
    }

    /**
     * Sets applicationId.
     * <p>
     * Field description:
     * Used when specifying an entity in outbound send requests. It is also returned in notification events. For detailed usage, refer to the [documentation](https://www.infobip.com/docs/cpaas-x/application-and-entity-management).
     *
     * @param applicationId
     * @return This {@link WhatsAppWebhookInboundMessageData instance}.
     */
    public WhatsAppWebhookInboundMessageData applicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }

    /**
     * Returns applicationId.
     * <p>
     * Field description:
     * Used when specifying an entity in outbound send requests. It is also returned in notification events. For detailed usage, refer to the [documentation](https://www.infobip.com/docs/cpaas-x/application-and-entity-management).
     *
     * @return applicationId
     */
    @JsonProperty("applicationId")
    public String getApplicationId() {
        return applicationId;
    }

    /**
     * Sets applicationId.
     * <p>
     * Field description:
     * Used when specifying an entity in outbound send requests. It is also returned in notification events. For detailed usage, refer to the [documentation](https://www.infobip.com/docs/cpaas-x/application-and-entity-management).
     *
     * @param applicationId
     */
    @JsonProperty("applicationId")
    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    /**
     * Sets from.
     * <p>
     * Field description:
     * Number which sent the message.
     * <p>
     * The field is required.
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
     * <p>
     * The field is required.
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
     * <p>
     * The field is required.
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
     * <p>
     * The field is required.
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
     * <p>
     * The field is required.
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
     * <p>
     * The field is required.
     *
     * @param to
     */
    @JsonProperty("to")
    public void setTo(String to) {
        this.to = to;
    }

    /**
     * Sets integrationType.
     * <p>
     * Field description:
     * Integration type.
     * <p>
     * The field is required.
     *
     * @param integrationType
     * @return This {@link WhatsAppWebhookInboundMessageData instance}.
     */
    public WhatsAppWebhookInboundMessageData integrationType(String integrationType) {
        this.integrationType = integrationType;
        return this;
    }

    /**
     * Returns integrationType.
     * <p>
     * Field description:
     * Integration type.
     * <p>
     * The field is required.
     *
     * @return integrationType
     */
    @JsonProperty("integrationType")
    public String getIntegrationType() {
        return integrationType;
    }

    /**
     * Sets integrationType.
     * <p>
     * Field description:
     * Integration type.
     * <p>
     * The field is required.
     *
     * @param integrationType
     */
    @JsonProperty("integrationType")
    public void setIntegrationType(String integrationType) {
        this.integrationType = integrationType;
    }

    /**
     * Sets receivedAt.
     * <p>
     * Field description:
     * Date and time when Infobip received the message.
     * <p>
     * The field is required.
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
     * <p>
     * The field is required.
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
     * <p>
     * The field is required.
     *
     * @param receivedAt
     */
    @JsonProperty("receivedAt")
    public void setReceivedAt(OffsetDateTime receivedAt) {
        this.receivedAt = receivedAt;
    }

    /**
     * Sets keyword.
     * <p>
     * Field description:
     * Keyword extracted from the message text.
     *
     * @param keyword
     * @return This {@link WhatsAppWebhookInboundMessageData instance}.
     */
    public WhatsAppWebhookInboundMessageData keyword(String keyword) {
        this.keyword = keyword;
        return this;
    }

    /**
     * Returns keyword.
     * <p>
     * Field description:
     * Keyword extracted from the message text.
     *
     * @return keyword
     */
    @JsonProperty("keyword")
    public String getKeyword() {
        return keyword;
    }

    /**
     * Sets keyword.
     * <p>
     * Field description:
     * Keyword extracted from the message text.
     *
     * @param keyword
     */
    @JsonProperty("keyword")
    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    /**
     * Sets messageId.
     * <p>
     * Field description:
     * The ID that uniquely identifies the received message.
     * <p>
     * The field is required.
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
     * <p>
     * The field is required.
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
     * <p>
     * The field is required.
     *
     * @param messageId
     */
    @JsonProperty("messageId")
    public void setMessageId(String messageId) {
        this.messageId = messageId;
    }

    /**
     * Sets pairedMessageId.
     * <p>
     * Field description:
     * Message ID of paired outgoing message if matched by Infobip platform.
     *
     * @param pairedMessageId
     * @return This {@link WhatsAppWebhookInboundMessageData instance}.
     */
    public WhatsAppWebhookInboundMessageData pairedMessageId(String pairedMessageId) {
        this.pairedMessageId = pairedMessageId;
        return this;
    }

    /**
     * Returns pairedMessageId.
     * <p>
     * Field description:
     * Message ID of paired outgoing message if matched by Infobip platform.
     *
     * @return pairedMessageId
     */
    @JsonProperty("pairedMessageId")
    public String getPairedMessageId() {
        return pairedMessageId;
    }

    /**
     * Sets pairedMessageId.
     * <p>
     * Field description:
     * Message ID of paired outgoing message if matched by Infobip platform.
     *
     * @param pairedMessageId
     */
    @JsonProperty("pairedMessageId")
    public void setPairedMessageId(String pairedMessageId) {
        this.pairedMessageId = pairedMessageId;
    }

    /**
     * Sets callbackData.
     * <p>
     * Field description:
     * Callback data sent through ‛callbackData‛ field when sending message.
     *
     * @param callbackData
     * @return This {@link WhatsAppWebhookInboundMessageData instance}.
     */
    public WhatsAppWebhookInboundMessageData callbackData(String callbackData) {
        this.callbackData = callbackData;
        return this;
    }

    /**
     * Returns callbackData.
     * <p>
     * Field description:
     * Callback data sent through ‛callbackData‛ field when sending message.
     *
     * @return callbackData
     */
    @JsonProperty("callbackData")
    public String getCallbackData() {
        return callbackData;
    }

    /**
     * Sets callbackData.
     * <p>
     * Field description:
     * Callback data sent through ‛callbackData‛ field when sending message.
     *
     * @param callbackData
     */
    @JsonProperty("callbackData")
    public void setCallbackData(String callbackData) {
        this.callbackData = callbackData;
    }

    /**
     * Sets message.
     * <p>
     * The field is required.
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
     * <p>
     * The field is required.
     *
     * @return message
     */
    @JsonProperty("message")
    public WhatsAppWebhookInboundMessage getMessage() {
        return message;
    }

    /**
     * Sets message.
     * <p>
     * The field is required.
     *
     * @param message
     */
    @JsonProperty("message")
    public void setMessage(WhatsAppWebhookInboundMessage message) {
        this.message = message;
    }

    /**
     * Sets price.
     * <p>
     * The field is required.
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
     * <p>
     * The field is required.
     *
     * @return price
     */
    @JsonProperty("price")
    public MessagePrice getPrice() {
        return price;
    }

    /**
     * Sets price.
     * <p>
     * The field is required.
     *
     * @param price
     */
    @JsonProperty("price")
    public void setPrice(MessagePrice price) {
        this.price = price;
    }

    /**
     * Sets contact.
     * <p>
     * The field is required.
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
     * The field is required.
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
     * The field is required.
     *
     * @param contact
     */
    @JsonProperty("contact")
    public void setContact(WhatsAppWebhookContactName contact) {
        this.contact = contact;
    }

    /**
     * Sets identity.
     *
     * @param identity
     * @return This {@link WhatsAppWebhookInboundMessageData instance}.
     */
    public WhatsAppWebhookInboundMessageData identity(WhatsAppWebhookIdentity identity) {
        this.identity = identity;
        return this;
    }

    /**
     * Returns identity.
     *
     * @return identity
     */
    @JsonProperty("identity")
    public WhatsAppWebhookIdentity getIdentity() {
        return identity;
    }

    /**
     * Sets identity.
     *
     * @param identity
     */
    @JsonProperty("identity")
    public void setIdentity(WhatsAppWebhookIdentity identity) {
        this.identity = identity;
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
        return Objects.equals(this.entityId, whatsAppWebhookInboundMessageData.entityId)
                && Objects.equals(this.applicationId, whatsAppWebhookInboundMessageData.applicationId)
                && Objects.equals(this.from, whatsAppWebhookInboundMessageData.from)
                && Objects.equals(this.to, whatsAppWebhookInboundMessageData.to)
                && Objects.equals(this.integrationType, whatsAppWebhookInboundMessageData.integrationType)
                && Objects.equals(this.receivedAt, whatsAppWebhookInboundMessageData.receivedAt)
                && Objects.equals(this.keyword, whatsAppWebhookInboundMessageData.keyword)
                && Objects.equals(this.messageId, whatsAppWebhookInboundMessageData.messageId)
                && Objects.equals(this.pairedMessageId, whatsAppWebhookInboundMessageData.pairedMessageId)
                && Objects.equals(this.callbackData, whatsAppWebhookInboundMessageData.callbackData)
                && Objects.equals(this.message, whatsAppWebhookInboundMessageData.message)
                && Objects.equals(this.price, whatsAppWebhookInboundMessageData.price)
                && Objects.equals(this.contact, whatsAppWebhookInboundMessageData.contact)
                && Objects.equals(this.identity, whatsAppWebhookInboundMessageData.identity);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                entityId,
                applicationId,
                from,
                to,
                integrationType,
                receivedAt,
                keyword,
                messageId,
                pairedMessageId,
                callbackData,
                message,
                price,
                contact,
                identity);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class WhatsAppWebhookInboundMessageData {")
                .append(newLine)
                .append("    entityId: ")
                .append(toIndentedString(entityId))
                .append(newLine)
                .append("    applicationId: ")
                .append(toIndentedString(applicationId))
                .append(newLine)
                .append("    from: ")
                .append(toIndentedString(from))
                .append(newLine)
                .append("    to: ")
                .append(toIndentedString(to))
                .append(newLine)
                .append("    integrationType: ")
                .append(toIndentedString(integrationType))
                .append(newLine)
                .append("    receivedAt: ")
                .append(toIndentedString(receivedAt))
                .append(newLine)
                .append("    keyword: ")
                .append(toIndentedString(keyword))
                .append(newLine)
                .append("    messageId: ")
                .append(toIndentedString(messageId))
                .append(newLine)
                .append("    pairedMessageId: ")
                .append(toIndentedString(pairedMessageId))
                .append(newLine)
                .append("    callbackData: ")
                .append(toIndentedString(callbackData))
                .append(newLine)
                .append("    message: ")
                .append(toIndentedString(message))
                .append(newLine)
                .append("    price: ")
                .append(toIndentedString(price))
                .append(newLine)
                .append("    contact: ")
                .append(toIndentedString(contact))
                .append(newLine)
                .append("    identity: ")
                .append(toIndentedString(identity))
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
