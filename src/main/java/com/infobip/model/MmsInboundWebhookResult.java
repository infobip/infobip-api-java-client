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
 * Represents MmsInboundWebhookResult model.
 */
public class MmsInboundWebhookResult {

    private String entityId;

    private String applicationId;

    private String from;

    private String to;

    private OffsetDateTime receivedAt;

    private String messageId;

    private String pairedMessageId;

    private String callbackData;

    private String userAgent;

    private List<MmsInboundMessageSegment> message = null;

    private List<MmsInboundDestination> group = null;

    private MessagePrice price;

    /**
     * Sets entityId.
     * <p>
     * Field description:
     * The ID of the entity, if application and entity management is used.
     *
     * @param entityId
     * @return This {@link MmsInboundWebhookResult instance}.
     */
    public MmsInboundWebhookResult entityId(String entityId) {
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
     * @return This {@link MmsInboundWebhookResult instance}.
     */
    public MmsInboundWebhookResult applicationId(String applicationId) {
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
     * @return This {@link MmsInboundWebhookResult instance}.
     */
    public MmsInboundWebhookResult from(String from) {
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
     * Message destination address.
     *
     * @param to
     * @return This {@link MmsInboundWebhookResult instance}.
     */
    public MmsInboundWebhookResult to(String to) {
        this.to = to;
        return this;
    }

    /**
     * Returns to.
     * <p>
     * Field description:
     * Message destination address.
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
     * Message destination address.
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
     * @return This {@link MmsInboundWebhookResult instance}.
     */
    public MmsInboundWebhookResult receivedAt(OffsetDateTime receivedAt) {
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
     * ID that uniquely identifies the received message.
     *
     * @param messageId
     * @return This {@link MmsInboundWebhookResult instance}.
     */
    public MmsInboundWebhookResult messageId(String messageId) {
        this.messageId = messageId;
        return this;
    }

    /**
     * Returns messageId.
     * <p>
     * Field description:
     * ID that uniquely identifies the received message.
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
     * ID that uniquely identifies the received message.
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
     * @return This {@link MmsInboundWebhookResult instance}.
     */
    public MmsInboundWebhookResult pairedMessageId(String pairedMessageId) {
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
     * Custom callback data can be inserted during the setup phase.
     *
     * @param callbackData
     * @return This {@link MmsInboundWebhookResult instance}.
     */
    public MmsInboundWebhookResult callbackData(String callbackData) {
        this.callbackData = callbackData;
        return this;
    }

    /**
     * Returns callbackData.
     * <p>
     * Field description:
     * Custom callback data can be inserted during the setup phase.
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
     * Custom callback data can be inserted during the setup phase.
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
     * @return This {@link MmsInboundWebhookResult instance}.
     */
    public MmsInboundWebhookResult userAgent(String userAgent) {
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
     * @return This {@link MmsInboundWebhookResult instance}.
     */
    public MmsInboundWebhookResult message(List<MmsInboundMessageSegment> message) {
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
     * @return This {@link MmsInboundWebhookResult instance}.
     */
    public MmsInboundWebhookResult addMessageItem(MmsInboundMessageSegment messageItem) {
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
    public List<MmsInboundMessageSegment> getMessage() {
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
    public void setMessage(List<MmsInboundMessageSegment> message) {
        this.message = message;
    }

    /**
     * Sets group.
     * <p>
     * Field description:
     * Recipients of group MMS.
     *
     * @param group
     * @return This {@link MmsInboundWebhookResult instance}.
     */
    public MmsInboundWebhookResult group(List<MmsInboundDestination> group) {
        this.group = group;
        return this;
    }

    /**
     * Adds and item into group.
     * <p>
     * Field description:
     * Recipients of group MMS.
     *
     * @param groupItem The item to be added to the list.
     * @return This {@link MmsInboundWebhookResult instance}.
     */
    public MmsInboundWebhookResult addGroupItem(MmsInboundDestination groupItem) {
        if (this.group == null) {
            this.group = new ArrayList<>();
        }
        this.group.add(groupItem);
        return this;
    }

    /**
     * Returns group.
     * <p>
     * Field description:
     * Recipients of group MMS.
     *
     * @return group
     */
    @JsonProperty("group")
    public List<MmsInboundDestination> getGroup() {
        return group;
    }

    /**
     * Sets group.
     * <p>
     * Field description:
     * Recipients of group MMS.
     *
     * @param group
     */
    @JsonProperty("group")
    public void setGroup(List<MmsInboundDestination> group) {
        this.group = group;
    }

    /**
     * Sets price.
     *
     * @param price
     * @return This {@link MmsInboundWebhookResult instance}.
     */
    public MmsInboundWebhookResult price(MessagePrice price) {
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
        MmsInboundWebhookResult mmsInboundWebhookResult = (MmsInboundWebhookResult) o;
        return Objects.equals(this.entityId, mmsInboundWebhookResult.entityId)
                && Objects.equals(this.applicationId, mmsInboundWebhookResult.applicationId)
                && Objects.equals(this.from, mmsInboundWebhookResult.from)
                && Objects.equals(this.to, mmsInboundWebhookResult.to)
                && Objects.equals(this.receivedAt, mmsInboundWebhookResult.receivedAt)
                && Objects.equals(this.messageId, mmsInboundWebhookResult.messageId)
                && Objects.equals(this.pairedMessageId, mmsInboundWebhookResult.pairedMessageId)
                && Objects.equals(this.callbackData, mmsInboundWebhookResult.callbackData)
                && Objects.equals(this.userAgent, mmsInboundWebhookResult.userAgent)
                && Objects.equals(this.message, mmsInboundWebhookResult.message)
                && Objects.equals(this.group, mmsInboundWebhookResult.group)
                && Objects.equals(this.price, mmsInboundWebhookResult.price);
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
                group,
                price);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class MmsInboundWebhookResult {")
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
                .append("    group: ")
                .append(toIndentedString(group))
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
