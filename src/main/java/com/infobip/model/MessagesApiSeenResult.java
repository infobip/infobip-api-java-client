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
 * Collection of reports, one per every message.
 */
public class MessagesApiSeenResult {

    private String event = "SEEN";

    private MessagesApiInboundSeenChannel channel;

    private String sender;

    private String destination;

    private String sentAt;

    private String seenAt;

    private String bulkId;

    private String messageId;

    private String callbackData;

    private Platform platform;

    private String campaignReferenceId;

    /**
     * Sets event.
     * <p>
     * Field description:
     * Event type (seen report in this case).
     * <p>
     * The field is required.
     *
     * @param event
     * @return This {@link MessagesApiSeenResult instance}.
     */
    public MessagesApiSeenResult event(String event) {
        this.event = event;
        return this;
    }

    /**
     * Returns event.
     * <p>
     * Field description:
     * Event type (seen report in this case).
     * <p>
     * The field is required.
     *
     * @return event
     */
    @JsonProperty("event")
    public String getEvent() {
        return event;
    }

    /**
     * Sets event.
     * <p>
     * Field description:
     * Event type (seen report in this case).
     * <p>
     * The field is required.
     *
     * @param event
     */
    @JsonProperty("event")
    public void setEvent(String event) {
        this.event = event;
    }

    /**
     * Sets channel.
     * <p>
     * The field is required.
     *
     * @param channel
     * @return This {@link MessagesApiSeenResult instance}.
     */
    public MessagesApiSeenResult channel(MessagesApiInboundSeenChannel channel) {
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
    public MessagesApiInboundSeenChannel getChannel() {
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
    public void setChannel(MessagesApiInboundSeenChannel channel) {
        this.channel = channel;
    }

    /**
     * Sets sender.
     * <p>
     * Field description:
     * The sender ID which can be alphanumeric or numeric (e.g., &#x60;CompanyName&#x60;).
     * <p>
     * The field is required.
     *
     * @param sender
     * @return This {@link MessagesApiSeenResult instance}.
     */
    public MessagesApiSeenResult sender(String sender) {
        this.sender = sender;
        return this;
    }

    /**
     * Returns sender.
     * <p>
     * Field description:
     * The sender ID which can be alphanumeric or numeric (e.g., &#x60;CompanyName&#x60;).
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
     * The sender ID which can be alphanumeric or numeric (e.g., &#x60;CompanyName&#x60;).
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
     * Message destination address.
     * <p>
     * The field is required.
     *
     * @param destination
     * @return This {@link MessagesApiSeenResult instance}.
     */
    public MessagesApiSeenResult destination(String destination) {
        this.destination = destination;
        return this;
    }

    /**
     * Returns destination.
     * <p>
     * Field description:
     * Message destination address.
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
     * Message destination address.
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
     * Sets sentAt.
     * <p>
     * Field description:
     * Tells when the message was sent. Has the following format: &#x60;yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZ&#x60;.
     * <p>
     * The field is required.
     *
     * @param sentAt
     * @return This {@link MessagesApiSeenResult instance}.
     */
    public MessagesApiSeenResult sentAt(String sentAt) {
        this.sentAt = sentAt;
        return this;
    }

    /**
     * Returns sentAt.
     * <p>
     * Field description:
     * Tells when the message was sent. Has the following format: &#x60;yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZ&#x60;.
     * <p>
     * The field is required.
     *
     * @return sentAt
     */
    @JsonProperty("sentAt")
    public String getSentAt() {
        return sentAt;
    }

    /**
     * Sets sentAt.
     * <p>
     * Field description:
     * Tells when the message was sent. Has the following format: &#x60;yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZ&#x60;.
     * <p>
     * The field is required.
     *
     * @param sentAt
     */
    @JsonProperty("sentAt")
    public void setSentAt(String sentAt) {
        this.sentAt = sentAt;
    }

    /**
     * Sets seenAt.
     * <p>
     * Field description:
     * Tells when the message was seen. Has the following format: &#x60;yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZ&#x60;.
     * <p>
     * The field is required.
     *
     * @param seenAt
     * @return This {@link MessagesApiSeenResult instance}.
     */
    public MessagesApiSeenResult seenAt(String seenAt) {
        this.seenAt = seenAt;
        return this;
    }

    /**
     * Returns seenAt.
     * <p>
     * Field description:
     * Tells when the message was seen. Has the following format: &#x60;yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZ&#x60;.
     * <p>
     * The field is required.
     *
     * @return seenAt
     */
    @JsonProperty("seenAt")
    public String getSeenAt() {
        return seenAt;
    }

    /**
     * Sets seenAt.
     * <p>
     * Field description:
     * Tells when the message was seen. Has the following format: &#x60;yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZ&#x60;.
     * <p>
     * The field is required.
     *
     * @param seenAt
     */
    @JsonProperty("seenAt")
    public void setSeenAt(String seenAt) {
        this.seenAt = seenAt;
    }

    /**
     * Sets bulkId.
     * <p>
     * Field description:
     * The ID that uniquely identifies the request.
     * <p>
     * The field is required.
     *
     * @param bulkId
     * @return This {@link MessagesApiSeenResult instance}.
     */
    public MessagesApiSeenResult bulkId(String bulkId) {
        this.bulkId = bulkId;
        return this;
    }

    /**
     * Returns bulkId.
     * <p>
     * Field description:
     * The ID that uniquely identifies the request.
     * <p>
     * The field is required.
     *
     * @return bulkId
     */
    @JsonProperty("bulkId")
    public String getBulkId() {
        return bulkId;
    }

    /**
     * Sets bulkId.
     * <p>
     * Field description:
     * The ID that uniquely identifies the request.
     * <p>
     * The field is required.
     *
     * @param bulkId
     */
    @JsonProperty("bulkId")
    public void setBulkId(String bulkId) {
        this.bulkId = bulkId;
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
     * @return This {@link MessagesApiSeenResult instance}.
     */
    public MessagesApiSeenResult messageId(String messageId) {
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
     * Sets callbackData.
     * <p>
     * Field description:
     * Value of the &#x60;callbackData&#x60; field from the MT message (if exists) or from the MO Action setup (if exists).
     *
     * @param callbackData
     * @return This {@link MessagesApiSeenResult instance}.
     */
    public MessagesApiSeenResult callbackData(String callbackData) {
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
     * @return This {@link MessagesApiSeenResult instance}.
     */
    public MessagesApiSeenResult platform(Platform platform) {
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
     * ID of a campaign that was sent in the message.
     *
     * @param campaignReferenceId
     * @return This {@link MessagesApiSeenResult instance}.
     */
    public MessagesApiSeenResult campaignReferenceId(String campaignReferenceId) {
        this.campaignReferenceId = campaignReferenceId;
        return this;
    }

    /**
     * Returns campaignReferenceId.
     * <p>
     * Field description:
     * ID of a campaign that was sent in the message.
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
     * ID of a campaign that was sent in the message.
     *
     * @param campaignReferenceId
     */
    @JsonProperty("campaignReferenceId")
    public void setCampaignReferenceId(String campaignReferenceId) {
        this.campaignReferenceId = campaignReferenceId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MessagesApiSeenResult messagesApiSeenResult = (MessagesApiSeenResult) o;
        return Objects.equals(this.event, messagesApiSeenResult.event)
                && Objects.equals(this.channel, messagesApiSeenResult.channel)
                && Objects.equals(this.sender, messagesApiSeenResult.sender)
                && Objects.equals(this.destination, messagesApiSeenResult.destination)
                && Objects.equals(this.sentAt, messagesApiSeenResult.sentAt)
                && Objects.equals(this.seenAt, messagesApiSeenResult.seenAt)
                && Objects.equals(this.bulkId, messagesApiSeenResult.bulkId)
                && Objects.equals(this.messageId, messagesApiSeenResult.messageId)
                && Objects.equals(this.callbackData, messagesApiSeenResult.callbackData)
                && Objects.equals(this.platform, messagesApiSeenResult.platform)
                && Objects.equals(this.campaignReferenceId, messagesApiSeenResult.campaignReferenceId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                event,
                channel,
                sender,
                destination,
                sentAt,
                seenAt,
                bulkId,
                messageId,
                callbackData,
                platform,
                campaignReferenceId);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class MessagesApiSeenResult {")
                .append(newLine)
                .append("    event: ")
                .append(toIndentedString(event))
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
                .append("    sentAt: ")
                .append(toIndentedString(sentAt))
                .append(newLine)
                .append("    seenAt: ")
                .append(toIndentedString(seenAt))
                .append(newLine)
                .append("    bulkId: ")
                .append(toIndentedString(bulkId))
                .append(newLine)
                .append("    messageId: ")
                .append(toIndentedString(messageId))
                .append(newLine)
                .append("    callbackData: ")
                .append(toIndentedString(callbackData))
                .append(newLine)
                .append("    platform: ")
                .append(toIndentedString(platform))
                .append(newLine)
                .append("    campaignReferenceId: ")
                .append(toIndentedString(campaignReferenceId))
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
