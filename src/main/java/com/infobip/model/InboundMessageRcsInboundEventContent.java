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
public class InboundMessageRcsInboundEventContent {

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

    private Platform platform;

    /**
     * Sets campaignReferenceId.
     * <p>
     * Field description:
     * ID that allows you to track, analyze, and show an aggregated overview and the performance of individual campaigns per sending channel.
     *
     * @param campaignReferenceId
     * @return This {@link InboundMessageRcsInboundEventContent instance}.
     */
    public InboundMessageRcsInboundEventContent campaignReferenceId(String campaignReferenceId) {
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
     * @return This {@link InboundMessageRcsInboundEventContent instance}.
     */
    public InboundMessageRcsInboundEventContent sender(String sender) {
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
     * @return This {@link InboundMessageRcsInboundEventContent instance}.
     */
    public InboundMessageRcsInboundEventContent to(String to) {
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
     * @return This {@link InboundMessageRcsInboundEventContent instance}.
     */
    public InboundMessageRcsInboundEventContent integrationType(String integrationType) {
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
     * @return This {@link InboundMessageRcsInboundEventContent instance}.
     */
    public InboundMessageRcsInboundEventContent receivedAt(OffsetDateTime receivedAt) {
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
     * @return This {@link InboundMessageRcsInboundEventContent instance}.
     */
    public InboundMessageRcsInboundEventContent interactionType(RcsEventInteractionType interactionType) {
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
     * @return This {@link InboundMessageRcsInboundEventContent instance}.
     */
    public InboundMessageRcsInboundEventContent keyword(String keyword) {
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
     * @return This {@link InboundMessageRcsInboundEventContent instance}.
     */
    public InboundMessageRcsInboundEventContent messageId(String messageId) {
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
     * @return This {@link InboundMessageRcsInboundEventContent instance}.
     */
    public InboundMessageRcsInboundEventContent pairedMessageId(String pairedMessageId) {
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
     * @return This {@link InboundMessageRcsInboundEventContent instance}.
     */
    public InboundMessageRcsInboundEventContent callbackData(String callbackData) {
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
     * @return This {@link InboundMessageRcsInboundEventContent instance}.
     */
    public InboundMessageRcsInboundEventContent message(RcsInboundMessageContent message) {
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
     * @return This {@link InboundMessageRcsInboundEventContent instance}.
     */
    public InboundMessageRcsInboundEventContent price(RcsMessagePrice price) {
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
     * @return This {@link InboundMessageRcsInboundEventContent instance}.
     */
    public InboundMessageRcsInboundEventContent conversation(RcsConversationInfo conversation) {
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
     * @return This {@link InboundMessageRcsInboundEventContent instance}.
     */
    public InboundMessageRcsInboundEventContent platform(Platform platform) {
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
    public Platform getPlatform() {
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
    public void setPlatform(Platform platform) {
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
        InboundMessageRcsInboundEventContent inboundMessageRcsInboundEventContent =
                (InboundMessageRcsInboundEventContent) o;
        return Objects.equals(this.campaignReferenceId, inboundMessageRcsInboundEventContent.campaignReferenceId)
                && Objects.equals(this.sender, inboundMessageRcsInboundEventContent.sender)
                && Objects.equals(this.to, inboundMessageRcsInboundEventContent.to)
                && Objects.equals(this.integrationType, inboundMessageRcsInboundEventContent.integrationType)
                && Objects.equals(this.receivedAt, inboundMessageRcsInboundEventContent.receivedAt)
                && Objects.equals(this.interactionType, inboundMessageRcsInboundEventContent.interactionType)
                && Objects.equals(this.keyword, inboundMessageRcsInboundEventContent.keyword)
                && Objects.equals(this.messageId, inboundMessageRcsInboundEventContent.messageId)
                && Objects.equals(this.pairedMessageId, inboundMessageRcsInboundEventContent.pairedMessageId)
                && Objects.equals(this.callbackData, inboundMessageRcsInboundEventContent.callbackData)
                && Objects.equals(this.message, inboundMessageRcsInboundEventContent.message)
                && Objects.equals(this.price, inboundMessageRcsInboundEventContent.price)
                && Objects.equals(this.conversation, inboundMessageRcsInboundEventContent.conversation)
                && Objects.equals(this.platform, inboundMessageRcsInboundEventContent.platform);
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
                .append("class InboundMessageRcsInboundEventContent {")
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
