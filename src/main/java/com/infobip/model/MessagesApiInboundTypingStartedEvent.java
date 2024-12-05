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
 * Represents MessagesApiInboundTypingStartedEvent model.
 */
public class MessagesApiInboundTypingStartedEvent extends MessagesApiInboundEvent {

    private MessagesApiInboundTypingIndicatorChannel channel;

    private String sender;

    private String destination;

    private OffsetDateTime receivedAt;

    private String messageId;

    private String pairedMessageId;

    private String callbackData;

    private Platform platform;

    /**
     * Constructs a new {@link MessagesApiInboundTypingStartedEvent} instance.
     */
    public MessagesApiInboundTypingStartedEvent() {
        super("TYPING_STARTED");
    }

    /**
     * Sets channel.
     * <p>
     * The field is required.
     *
     * @param channel
     * @return This {@link MessagesApiInboundTypingStartedEvent instance}.
     */
    public MessagesApiInboundTypingStartedEvent channel(MessagesApiInboundTypingIndicatorChannel channel) {
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
    public MessagesApiInboundTypingIndicatorChannel getChannel() {
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
    public void setChannel(MessagesApiInboundTypingIndicatorChannel channel) {
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
     * @return This {@link MessagesApiInboundTypingStartedEvent instance}.
     */
    public MessagesApiInboundTypingStartedEvent sender(String sender) {
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
     * @return This {@link MessagesApiInboundTypingStartedEvent instance}.
     */
    public MessagesApiInboundTypingStartedEvent destination(String destination) {
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
     * Sets receivedAt.
     * <p>
     * Field description:
     * Date and time when Infobip received the message.
     * <p>
     * The field is required.
     *
     * @param receivedAt
     * @return This {@link MessagesApiInboundTypingStartedEvent instance}.
     */
    public MessagesApiInboundTypingStartedEvent receivedAt(OffsetDateTime receivedAt) {
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
     * @return This {@link MessagesApiInboundTypingStartedEvent instance}.
     */
    public MessagesApiInboundTypingStartedEvent messageId(String messageId) {
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
     * @return This {@link MessagesApiInboundTypingStartedEvent instance}.
     */
    public MessagesApiInboundTypingStartedEvent pairedMessageId(String pairedMessageId) {
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
     * @return This {@link MessagesApiInboundTypingStartedEvent instance}.
     */
    public MessagesApiInboundTypingStartedEvent callbackData(String callbackData) {
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
     * Sets platform.
     *
     * @param platform
     * @return This {@link MessagesApiInboundTypingStartedEvent instance}.
     */
    public MessagesApiInboundTypingStartedEvent platform(Platform platform) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MessagesApiInboundTypingStartedEvent messagesApiInboundTypingStartedEvent =
                (MessagesApiInboundTypingStartedEvent) o;
        return Objects.equals(this.channel, messagesApiInboundTypingStartedEvent.channel)
                && Objects.equals(this.sender, messagesApiInboundTypingStartedEvent.sender)
                && Objects.equals(this.destination, messagesApiInboundTypingStartedEvent.destination)
                && Objects.equals(this.receivedAt, messagesApiInboundTypingStartedEvent.receivedAt)
                && Objects.equals(this.messageId, messagesApiInboundTypingStartedEvent.messageId)
                && Objects.equals(this.pairedMessageId, messagesApiInboundTypingStartedEvent.pairedMessageId)
                && Objects.equals(this.callbackData, messagesApiInboundTypingStartedEvent.callbackData)
                && Objects.equals(this.platform, messagesApiInboundTypingStartedEvent.platform)
                && super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                channel,
                sender,
                destination,
                receivedAt,
                messageId,
                pairedMessageId,
                callbackData,
                platform,
                super.hashCode());
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class MessagesApiInboundTypingStartedEvent {")
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
