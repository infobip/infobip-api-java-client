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
 * Collection of mobile originated events.
 */
public class RcsInboundEvent {

    private String campaignReferenceId;

    private String sender;

    private String to;

    private String integrationType;

    private OffsetDateTime receivedAt;

    private RcsEventInteractionType interactionType;

    private String keyword;

    private String messageId;

    private String pairedMessageId;

    private String callbackData;

    private RcsInboundMessageContent message;

    private RcsMessagePrice price;

    private RcsConversationInfo conversation;

    private RcsPlatformInfo platform;

    /**
     * Sets campaignReferenceId.
     * <p>
     * Field description:
     * ID that allows you to track, analyze, and show an aggregated overview and the performance of individual campaigns per sending channel.
     *
     * @param campaignReferenceId
     * @return This {@link RcsInboundEvent instance}.
     */
    public RcsInboundEvent campaignReferenceId(String campaignReferenceId) {
        this.campaignReferenceId = campaignReferenceId;
        return this;
    }

    /**
     * Returns campaignReferenceId.
     * <p>
     * Field description:
     * ID that allows you to track, analyze, and show an aggregated overview and the performance of individual campaigns per sending channel.
     *
     * @return campaignReferenceId
     */
    @JsonProperty("campaignReferenceId")
    public String getCampaignReferenceId() {
        return campaignReferenceId;
    }

    /**
     * Sets campaignReferenceId.
     * <p>
     * Field description:
     * ID that allows you to track, analyze, and show an aggregated overview and the performance of individual campaigns per sending channel.
     *
     * @param campaignReferenceId
     */
    @JsonProperty("campaignReferenceId")
    public void setCampaignReferenceId(String campaignReferenceId) {
        this.campaignReferenceId = campaignReferenceId;
    }

    /**
     * Sets sender.
     * <p>
     * Field description:
     * Number which sent the message.
     * <p>
     * The field is required.
     *
     * @param sender
     * @return This {@link RcsInboundEvent instance}.
     */
    public RcsInboundEvent sender(String sender) {
        this.sender = sender;
        return this;
    }

    /**
     * Returns sender.
     * <p>
     * Field description:
     * Number which sent the message.
     * <p>
     * The field is required.
     *
     * @return sender
     */
    @JsonProperty("sender")
    public String getSender() {
        return sender;
    }

    /**
     * Sets sender.
     * <p>
     * Field description:
     * Number which sent the message.
     * <p>
     * The field is required.
     *
     * @param sender
     */
    @JsonProperty("sender")
    public void setSender(String sender) {
        this.sender = sender;
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
     * @return This {@link RcsInboundEvent instance}.
     */
    public RcsInboundEvent to(String to) {
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
     * @return This {@link RcsInboundEvent instance}.
     */
    public RcsInboundEvent integrationType(String integrationType) {
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
     * Date and time when Infobip received the message. Has the following format: yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZ.
     * <p>
     * The field is required.
     *
     * @param receivedAt
     * @return This {@link RcsInboundEvent instance}.
     */
    public RcsInboundEvent receivedAt(OffsetDateTime receivedAt) {
        this.receivedAt = receivedAt;
        return this;
    }

    /**
     * Returns receivedAt.
     * <p>
     * Field description:
     * Date and time when Infobip received the message. Has the following format: yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZ.
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
     * Date and time when Infobip received the message. Has the following format: yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZ.
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
     * Sets interactionType.
     * <p>
     * The field is required.
     *
     * @param interactionType
     * @return This {@link RcsInboundEvent instance}.
     */
    public RcsInboundEvent interactionType(RcsEventInteractionType interactionType) {
        this.interactionType = interactionType;
        return this;
    }

    /**
     * Returns interactionType.
     * <p>
     * The field is required.
     *
     * @return interactionType
     */
    @JsonProperty("interactionType")
    public RcsEventInteractionType getInteractionType() {
        return interactionType;
    }

    /**
     * Sets interactionType.
     * <p>
     * The field is required.
     *
     * @param interactionType
     */
    @JsonProperty("interactionType")
    public void setInteractionType(RcsEventInteractionType interactionType) {
        this.interactionType = interactionType;
    }

    /**
     * Sets keyword.
     * <p>
     * Field description:
     * Keyword extracted from the message text.
     *
     * @param keyword
     * @return This {@link RcsInboundEvent instance}.
     */
    public RcsInboundEvent keyword(String keyword) {
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
     * @return This {@link RcsInboundEvent instance}.
     */
    public RcsInboundEvent messageId(String messageId) {
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
     * @return This {@link RcsInboundEvent instance}.
     */
    public RcsInboundEvent pairedMessageId(String pairedMessageId) {
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
     * @return This {@link RcsInboundEvent instance}.
     */
    public RcsInboundEvent callbackData(String callbackData) {
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
     * @return This {@link RcsInboundEvent instance}.
     */
    public RcsInboundEvent message(RcsInboundMessageContent message) {
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
    public RcsInboundMessageContent getMessage() {
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
    public void setMessage(RcsInboundMessageContent message) {
        this.message = message;
    }

    /**
     * Sets price.
     * <p>
     * The field is required.
     *
     * @param price
     * @return This {@link RcsInboundEvent instance}.
     */
    public RcsInboundEvent price(RcsMessagePrice price) {
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
    public RcsMessagePrice getPrice() {
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
    public void setPrice(RcsMessagePrice price) {
        this.price = price;
    }

    /**
     * Sets conversation.
     * <p>
     * The field is required.
     *
     * @param conversation
     * @return This {@link RcsInboundEvent instance}.
     */
    public RcsInboundEvent conversation(RcsConversationInfo conversation) {
        this.conversation = conversation;
        return this;
    }

    /**
     * Returns conversation.
     * <p>
     * The field is required.
     *
     * @return conversation
     */
    @JsonProperty("conversation")
    public RcsConversationInfo getConversation() {
        return conversation;
    }

    /**
     * Sets conversation.
     * <p>
     * The field is required.
     *
     * @param conversation
     */
    @JsonProperty("conversation")
    public void setConversation(RcsConversationInfo conversation) {
        this.conversation = conversation;
    }

    /**
     * Sets platform.
     * <p>
     * The field is required.
     *
     * @param platform
     * @return This {@link RcsInboundEvent instance}.
     */
    public RcsInboundEvent platform(RcsPlatformInfo platform) {
        this.platform = platform;
        return this;
    }

    /**
     * Returns platform.
     * <p>
     * The field is required.
     *
     * @return platform
     */
    @JsonProperty("platform")
    public RcsPlatformInfo getPlatform() {
        return platform;
    }

    /**
     * Sets platform.
     * <p>
     * The field is required.
     *
     * @param platform
     */
    @JsonProperty("platform")
    public void setPlatform(RcsPlatformInfo platform) {
        this.platform = platform;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RcsInboundEvent rcsInboundEvent = (RcsInboundEvent) o;
        return Objects.equals(this.campaignReferenceId, rcsInboundEvent.campaignReferenceId)
                && Objects.equals(this.sender, rcsInboundEvent.sender)
                && Objects.equals(this.to, rcsInboundEvent.to)
                && Objects.equals(this.integrationType, rcsInboundEvent.integrationType)
                && Objects.equals(this.receivedAt, rcsInboundEvent.receivedAt)
                && Objects.equals(this.interactionType, rcsInboundEvent.interactionType)
                && Objects.equals(this.keyword, rcsInboundEvent.keyword)
                && Objects.equals(this.messageId, rcsInboundEvent.messageId)
                && Objects.equals(this.pairedMessageId, rcsInboundEvent.pairedMessageId)
                && Objects.equals(this.callbackData, rcsInboundEvent.callbackData)
                && Objects.equals(this.message, rcsInboundEvent.message)
                && Objects.equals(this.price, rcsInboundEvent.price)
                && Objects.equals(this.conversation, rcsInboundEvent.conversation)
                && Objects.equals(this.platform, rcsInboundEvent.platform);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                campaignReferenceId,
                sender,
                to,
                integrationType,
                receivedAt,
                interactionType,
                keyword,
                messageId,
                pairedMessageId,
                callbackData,
                message,
                price,
                conversation,
                platform);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class RcsInboundEvent {")
                .append(newLine)
                .append("    campaignReferenceId: ")
                .append(toIndentedString(campaignReferenceId))
                .append(newLine)
                .append("    sender: ")
                .append(toIndentedString(sender))
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
                .append("    interactionType: ")
                .append(toIndentedString(interactionType))
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
                .append("    conversation: ")
                .append(toIndentedString(conversation))
                .append(newLine)
                .append("    platform: ")
                .append(toIndentedString(platform))
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
