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
 * Represents MessagesApiWebhookEvent model.
 */
public class MessagesApiWebhookEvent extends MessagesApiInboundEvent {

    private MessagesApiInboundMoEventChannel channel;

    private String sender;

    private String destination;

    private List<MessagesApiWebhookEventContent> content = new ArrayList<>();

    private OffsetDateTime receivedAt;

    private String messageId;

    private String pairedMessageId;

    private String callbackData;

    private Integer messageCount;

    private Platform platform;

    private String campaignReferenceId;

    private MessagesApiWebhookEventMetadata metadata;

    /**
     * Constructs a new {@link MessagesApiWebhookEvent} instance.
     */
    public MessagesApiWebhookEvent() {
        super("MO");
    }

    /**
     * Sets channel.
     * <p>
     * The field is required.
     *
     * @param channel
     * @return This {@link MessagesApiWebhookEvent instance}.
     */
    public MessagesApiWebhookEvent channel(MessagesApiInboundMoEventChannel channel) {
        this.channel = channel;
        return this;
    }

    /**
     * Returns channel.
     * <p>
     * The field is required.
     *
     * @return channel
     */
    @JsonProperty("channel")
    public MessagesApiInboundMoEventChannel getChannel() {
        return channel;
    }

    /**
     * Sets channel.
     * <p>
     * The field is required.
     *
     * @param channel
     */
    @JsonProperty("channel")
    public void setChannel(MessagesApiInboundMoEventChannel channel) {
        this.channel = channel;
    }

    /**
     * Sets sender.
     * <p>
     * Field description:
     * Identifier (usually number) of the party which sent the message.
     * <p>
     * The field is required.
     *
     * @param sender
     * @return This {@link MessagesApiWebhookEvent instance}.
     */
    public MessagesApiWebhookEvent sender(String sender) {
        this.sender = sender;
        return this;
    }

    /**
     * Returns sender.
     * <p>
     * Field description:
     * Identifier (usually number) of the party which sent the message.
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
     * Identifier (usually number) of the party which sent the message.
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
     * Sets destination.
     * <p>
     * Field description:
     * Sender provided during the activation process.
     * <p>
     * The field is required.
     *
     * @param destination
     * @return This {@link MessagesApiWebhookEvent instance}.
     */
    public MessagesApiWebhookEvent destination(String destination) {
        this.destination = destination;
        return this;
    }

    /**
     * Returns destination.
     * <p>
     * Field description:
     * Sender provided during the activation process.
     * <p>
     * The field is required.
     *
     * @return destination
     */
    @JsonProperty("destination")
    public String getDestination() {
        return destination;
    }

    /**
     * Sets destination.
     * <p>
     * Field description:
     * Sender provided during the activation process.
     * <p>
     * The field is required.
     *
     * @param destination
     */
    @JsonProperty("destination")
    public void setDestination(String destination) {
        this.destination = destination;
    }

    /**
     * Sets content.
     * <p>
     * Field description:
     * Content of the message.
     * <p>
     * The field is required.
     *
     * @param content
     * @return This {@link MessagesApiWebhookEvent instance}.
     */
    public MessagesApiWebhookEvent content(List<MessagesApiWebhookEventContent> content) {
        this.content = content;
        return this;
    }

    /**
     * Adds and item into content.
     * <p>
     * Field description:
     * Content of the message.
     * <p>
     * The field is required.
     *
     * @param contentItem The item to be added to the list.
     * @return This {@link MessagesApiWebhookEvent instance}.
     */
    public MessagesApiWebhookEvent addContentItem(MessagesApiWebhookEventContent contentItem) {
        if (this.content == null) {
            this.content = new ArrayList<>();
        }
        this.content.add(contentItem);
        return this;
    }

    /**
     * Returns content.
     * <p>
     * Field description:
     * Content of the message.
     * <p>
     * The field is required.
     *
     * @return content
     */
    @JsonProperty("content")
    public List<MessagesApiWebhookEventContent> getContent() {
        return content;
    }

    /**
     * Sets content.
     * <p>
     * Field description:
     * Content of the message.
     * <p>
     * The field is required.
     *
     * @param content
     */
    @JsonProperty("content")
    public void setContent(List<MessagesApiWebhookEventContent> content) {
        this.content = content;
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
     * @return This {@link MessagesApiWebhookEvent instance}.
     */
    public MessagesApiWebhookEvent receivedAt(OffsetDateTime receivedAt) {
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
     * Sets messageId.
     * <p>
     * Field description:
     * The ID that uniquely identifies the received message.
     * <p>
     * The field is required.
     *
     * @param messageId
     * @return This {@link MessagesApiWebhookEvent instance}.
     */
    public MessagesApiWebhookEvent messageId(String messageId) {
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
     * Message ID of the MT message that this MO message is a response to.
     *
     * @param pairedMessageId
     * @return This {@link MessagesApiWebhookEvent instance}.
     */
    public MessagesApiWebhookEvent pairedMessageId(String pairedMessageId) {
        this.pairedMessageId = pairedMessageId;
        return this;
    }

    /**
     * Returns pairedMessageId.
     * <p>
     * Field description:
     * Message ID of the MT message that this MO message is a response to.
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
     * Message ID of the MT message that this MO message is a response to.
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
     * Value of the &#x60;callbackData&#x60; field from the MT message (if exists) or from the MO Action setup (if exists).
     *
     * @param callbackData
     * @return This {@link MessagesApiWebhookEvent instance}.
     */
    public MessagesApiWebhookEvent callbackData(String callbackData) {
        this.callbackData = callbackData;
        return this;
    }

    /**
     * Returns callbackData.
     * <p>
     * Field description:
     * Value of the &#x60;callbackData&#x60; field from the MT message (if exists) or from the MO Action setup (if exists).
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
     * Value of the &#x60;callbackData&#x60; field from the MT message (if exists) or from the MO Action setup (if exists).
     *
     * @param callbackData
     */
    @JsonProperty("callbackData")
    public void setCallbackData(String callbackData) {
        this.callbackData = callbackData;
    }

    /**
     * Sets messageCount.
     * <p>
     * Field description:
     * The number of parts the message content was split into.
     * <p>
     * The field is required.
     *
     * @param messageCount
     * @return This {@link MessagesApiWebhookEvent instance}.
     */
    public MessagesApiWebhookEvent messageCount(Integer messageCount) {
        this.messageCount = messageCount;
        return this;
    }

    /**
     * Returns messageCount.
     * <p>
     * Field description:
     * The number of parts the message content was split into.
     * <p>
     * The field is required.
     *
     * @return messageCount
     */
    @JsonProperty("messageCount")
    public Integer getMessageCount() {
        return messageCount;
    }

    /**
     * Sets messageCount.
     * <p>
     * Field description:
     * The number of parts the message content was split into.
     * <p>
     * The field is required.
     *
     * @param messageCount
     */
    @JsonProperty("messageCount")
    public void setMessageCount(Integer messageCount) {
        this.messageCount = messageCount;
    }

    /**
     * Sets platform.
     *
     * @param platform
     * @return This {@link MessagesApiWebhookEvent instance}.
     */
    public MessagesApiWebhookEvent platform(Platform platform) {
        this.platform = platform;
        return this;
    }

    /**
     * Returns platform.
     *
     * @return platform
     */
    @JsonProperty("platform")
    public Platform getPlatform() {
        return platform;
    }

    /**
     * Sets platform.
     *
     * @param platform
     */
    @JsonProperty("platform")
    public void setPlatform(Platform platform) {
        this.platform = platform;
    }

    /**
     * Sets campaignReferenceId.
     * <p>
     * Field description:
     * ID of a campaign that was sent in the MT message
     *
     * @param campaignReferenceId
     * @return This {@link MessagesApiWebhookEvent instance}.
     */
    public MessagesApiWebhookEvent campaignReferenceId(String campaignReferenceId) {
        this.campaignReferenceId = campaignReferenceId;
        return this;
    }

    /**
     * Returns campaignReferenceId.
     * <p>
     * Field description:
     * ID of a campaign that was sent in the MT message
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
     * ID of a campaign that was sent in the MT message
     *
     * @param campaignReferenceId
     */
    @JsonProperty("campaignReferenceId")
    public void setCampaignReferenceId(String campaignReferenceId) {
        this.campaignReferenceId = campaignReferenceId;
    }

    /**
     * Sets metadata.
     *
     * @param metadata
     * @return This {@link MessagesApiWebhookEvent instance}.
     */
    public MessagesApiWebhookEvent metadata(MessagesApiWebhookEventMetadata metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * Returns metadata.
     *
     * @return metadata
     */
    @JsonProperty("metadata")
    public MessagesApiWebhookEventMetadata getMetadata() {
        return metadata;
    }

    /**
     * Sets metadata.
     *
     * @param metadata
     */
    @JsonProperty("metadata")
    public void setMetadata(MessagesApiWebhookEventMetadata metadata) {
        this.metadata = metadata;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MessagesApiWebhookEvent messagesApiWebhookEvent = (MessagesApiWebhookEvent) o;
        return Objects.equals(this.channel, messagesApiWebhookEvent.channel)
                && Objects.equals(this.sender, messagesApiWebhookEvent.sender)
                && Objects.equals(this.destination, messagesApiWebhookEvent.destination)
                && Objects.equals(this.content, messagesApiWebhookEvent.content)
                && Objects.equals(this.receivedAt, messagesApiWebhookEvent.receivedAt)
                && Objects.equals(this.messageId, messagesApiWebhookEvent.messageId)
                && Objects.equals(this.pairedMessageId, messagesApiWebhookEvent.pairedMessageId)
                && Objects.equals(this.callbackData, messagesApiWebhookEvent.callbackData)
                && Objects.equals(this.messageCount, messagesApiWebhookEvent.messageCount)
                && Objects.equals(this.platform, messagesApiWebhookEvent.platform)
                && Objects.equals(this.campaignReferenceId, messagesApiWebhookEvent.campaignReferenceId)
                && Objects.equals(this.metadata, messagesApiWebhookEvent.metadata)
                && super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                channel,
                sender,
                destination,
                content,
                receivedAt,
                messageId,
                pairedMessageId,
                callbackData,
                messageCount,
                platform,
                campaignReferenceId,
                metadata,
                super.hashCode());
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class MessagesApiWebhookEvent {")
                .append(newLine)
                .append("    ")
                .append(toIndentedString(super.toString()))
                .append(newLine)
                .append("    channel: ")
                .append(toIndentedString(channel))
                .append(newLine)
                .append("    sender: ")
                .append(toIndentedString(sender))
                .append(newLine)
                .append("    destination: ")
                .append(toIndentedString(destination))
                .append(newLine)
                .append("    content: ")
                .append(toIndentedString(content))
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
                .append("    messageCount: ")
                .append(toIndentedString(messageCount))
                .append(newLine)
                .append("    platform: ")
                .append(toIndentedString(platform))
                .append(newLine)
                .append("    campaignReferenceId: ")
                .append(toIndentedString(campaignReferenceId))
                .append(newLine)
                .append("    metadata: ")
                .append(toIndentedString(metadata))
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
