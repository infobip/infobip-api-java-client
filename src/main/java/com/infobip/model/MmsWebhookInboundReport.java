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
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Represents MmsWebhookInboundReport model.
 */
public class MmsWebhookInboundReport {

    private String entityId;

    private String applicationId;

    private String from;

    private String to;

    private OffsetDateTime receivedAt;

    private String messageId;

    private String pairedMessageId;

    private String callbackData;

    private String userAgent;

    private List<MmsWebhookInboundMessageSegment> message = null;

    private MessagePrice price;

    /**
     * Sets entityId.
     * <p>
     * Field description:
     * The ID of the entity, if application and entity management is used.
     *
     * @param entityId
     * @return This {@link MmsWebhookInboundReport instance}.
     */
    public MmsWebhookInboundReport entityId(String entityId) {
        this.entityId = entityId;
        return this;
    }

    /**
     * Returns entityId.
     * <p>
     * Field description:
     * The ID of the entity, if application and entity management is used.
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
     * The ID of the entity, if application and entity management is used.
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
     * The ID of the application, if application and entity management is used.
     *
     * @param applicationId
     * @return This {@link MmsWebhookInboundReport instance}.
     */
    public MmsWebhookInboundReport applicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }

    /**
     * Returns applicationId.
     * <p>
     * Field description:
     * The ID of the application, if application and entity management is used.
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
     * The ID of the application, if application and entity management is used.
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
     * Sender ID that can be alphanumeric or numeric.
     *
     * @param from
     * @return This {@link MmsWebhookInboundReport instance}.
     */
    public MmsWebhookInboundReport from(String from) {
        this.from = from;
        return this;
    }

    /**
     * Returns from.
     * <p>
     * Field description:
     * Sender ID that can be alphanumeric or numeric.
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
     * Sender ID that can be alphanumeric or numeric.
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
     * The message destination address.
     *
     * @param to
     * @return This {@link MmsWebhookInboundReport instance}.
     */
    public MmsWebhookInboundReport to(String to) {
        this.to = to;
        return this;
    }

    /**
     * Returns to.
     * <p>
     * Field description:
     * The message destination address.
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
     * The message destination address.
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
     * @return This {@link MmsWebhookInboundReport instance}.
     */
    public MmsWebhookInboundReport receivedAt(OffsetDateTime receivedAt) {
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
     * @return This {@link MmsWebhookInboundReport instance}.
     */
    public MmsWebhookInboundReport messageId(String messageId) {
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
     * Sets pairedMessageId.
     * <p>
     * Field description:
     * Message ID of paired outgoing message if matched by Infobip platform.
     *
     * @param pairedMessageId
     * @return This {@link MmsWebhookInboundReport instance}.
     */
    public MmsWebhookInboundReport pairedMessageId(String pairedMessageId) {
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
     * Callback data sent through &#x60;callbackData&#x60; field in fully featured MMS message.
     *
     * @param callbackData
     * @return This {@link MmsWebhookInboundReport instance}.
     */
    public MmsWebhookInboundReport callbackData(String callbackData) {
        this.callbackData = callbackData;
        return this;
    }

    /**
     * Returns callbackData.
     * <p>
     * Field description:
     * Callback data sent through &#x60;callbackData&#x60; field in fully featured MMS message.
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
     * Callback data sent through &#x60;callbackData&#x60; field in fully featured MMS message.
     *
     * @param callbackData
     */
    @JsonProperty("callbackData")
    public void setCallbackData(String callbackData) {
        this.callbackData = callbackData;
    }

    /**
     * Sets userAgent.
     * <p>
     * Field description:
     * Identifier of the device from which the message was sent.
     *
     * @param userAgent
     * @return This {@link MmsWebhookInboundReport instance}.
     */
    public MmsWebhookInboundReport userAgent(String userAgent) {
        this.userAgent = userAgent;
        return this;
    }

    /**
     * Returns userAgent.
     * <p>
     * Field description:
     * Identifier of the device from which the message was sent.
     *
     * @return userAgent
     */
    @JsonProperty("userAgent")
    public String getUserAgent() {
        return userAgent;
    }

    /**
     * Sets userAgent.
     * <p>
     * Field description:
     * Identifier of the device from which the message was sent.
     *
     * @param userAgent
     */
    @JsonProperty("userAgent")
    public void setUserAgent(String userAgent) {
        this.userAgent = userAgent;
    }

    /**
     * Sets message.
     * <p>
     * Field description:
     * All parts of the received message.
     *
     * @param message
     * @return This {@link MmsWebhookInboundReport instance}.
     */
    public MmsWebhookInboundReport message(List<MmsWebhookInboundMessageSegment> message) {
        this.message = message;
        return this;
    }

    /**
     * Adds and item into message.
     * <p>
     * Field description:
     * All parts of the received message.
     *
     * @param messageItem The item to be added to the list.
     * @return This {@link MmsWebhookInboundReport instance}.
     */
    public MmsWebhookInboundReport addMessageItem(MmsWebhookInboundMessageSegment messageItem) {
        if (this.message == null) {
            this.message = new ArrayList<>();
        }
        this.message.add(messageItem);
        return this;
    }

    /**
     * Returns message.
     * <p>
     * Field description:
     * All parts of the received message.
     *
     * @return message
     */
    @JsonProperty("message")
    public List<MmsWebhookInboundMessageSegment> getMessage() {
        return message;
    }

    /**
     * Sets message.
     * <p>
     * Field description:
     * All parts of the received message.
     *
     * @param message
     */
    @JsonProperty("message")
    public void setMessage(List<MmsWebhookInboundMessageSegment> message) {
        this.message = message;
    }

    /**
     * Sets price.
     *
     * @param price
     * @return This {@link MmsWebhookInboundReport instance}.
     */
    public MmsWebhookInboundReport price(MessagePrice price) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MmsWebhookInboundReport mmsWebhookInboundReport = (MmsWebhookInboundReport) o;
        return Objects.equals(this.entityId, mmsWebhookInboundReport.entityId)
                && Objects.equals(this.applicationId, mmsWebhookInboundReport.applicationId)
                && Objects.equals(this.from, mmsWebhookInboundReport.from)
                && Objects.equals(this.to, mmsWebhookInboundReport.to)
                && Objects.equals(this.receivedAt, mmsWebhookInboundReport.receivedAt)
                && Objects.equals(this.messageId, mmsWebhookInboundReport.messageId)
                && Objects.equals(this.pairedMessageId, mmsWebhookInboundReport.pairedMessageId)
                && Objects.equals(this.callbackData, mmsWebhookInboundReport.callbackData)
                && Objects.equals(this.userAgent, mmsWebhookInboundReport.userAgent)
                && Objects.equals(this.message, mmsWebhookInboundReport.message)
                && Objects.equals(this.price, mmsWebhookInboundReport.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                entityId,
                applicationId,
                from,
                to,
                receivedAt,
                messageId,
                pairedMessageId,
                callbackData,
                userAgent,
                message,
                price);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class MmsWebhookInboundReport {")
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
                .append("    receivedAt: ")
                .append(toIndentedString(receivedAt))
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
                .append("    userAgent: ")
                .append(toIndentedString(userAgent))
                .append(newLine)
                .append("    message: ")
                .append(toIndentedString(message))
                .append(newLine)
                .append("    price: ")
                .append(toIndentedString(price))
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
