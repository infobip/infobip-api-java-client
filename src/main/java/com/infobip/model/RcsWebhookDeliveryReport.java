/*
 * This class is auto generated from the Infobip OpenAPI specification
 * through the OpenAPI Specification Client API libraries (Re)Generator (OSCAR),
 * powered by the OpenAPI Generator (https://openapi-generator.tech).
 *
 * Do not edit manually. To learn how to raise an issue, see the CONTRIBUTING guide
 * or contact us @ support@infobip.com.
 */

package com.infobip.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * Collection of reports, one per every message.
 */
public class RcsWebhookDeliveryReport {

    private String bulkId;

    /**
     * The channel used to deliver a message. This property will be present only if the original message was sent with the failover option defined. The property will be included in the delivery report for the original RCS message and for the failover message (in case the failover was triggered).
     */
    public enum ChannelEnum {
        RCS("RCS"),
        SMS("SMS"),
        MMS("MMS");

        private String value;

        ChannelEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static ChannelEnum fromValue(String value) {
            for (ChannelEnum enumElement : ChannelEnum.values()) {
                if (enumElement.value.equals(value)) {
                    return enumElement;
                }
            }
            throw new IllegalArgumentException("Unexpected enum value '" + value + "'.");
        }
    }

    private ChannelEnum channel;

    private RcsMessagePrice price;

    private MessageStatus status;

    private MessageError error;

    private RcsConversationInfo conversation;

    private String messageId;

    private OffsetDateTime doneAt;

    private RcsMessageInteractionType interactionType;

    private Integer messageCount;

    private OffsetDateTime sentAt;

    private String mccMnc;

    private String callbackData;

    private String to;

    private String sender;

    private Platform platform;

    private String campaignReferenceId;

    /**
     * Sets bulkId.
     * <p>
     * Field description:
     * Unique ID assigned to the request if messaging multiple recipients or sending multiple messages via a single API request.
     *
     * @param bulkId
     * @return This {@link RcsWebhookDeliveryReport instance}.
     */
    public RcsWebhookDeliveryReport bulkId(String bulkId) {
        this.bulkId = bulkId;
        return this;
    }

    /**
     * Returns bulkId.
     * <p>
     * Field description:
     * Unique ID assigned to the request if messaging multiple recipients or sending multiple messages via a single API request.
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
     * Unique ID assigned to the request if messaging multiple recipients or sending multiple messages via a single API request.
     *
     * @param bulkId
     */
    @JsonProperty("bulkId")
    public void setBulkId(String bulkId) {
        this.bulkId = bulkId;
    }

    /**
     * Sets channel.
     * <p>
     * Field description:
     * The channel used to deliver a message. This property will be present only if the original message was sent with the failover option defined. The property will be included in the delivery report for the original RCS message and for the failover message (in case the failover was triggered).
     *
     * @param channel
     * @return This {@link RcsWebhookDeliveryReport instance}.
     */
    public RcsWebhookDeliveryReport channel(ChannelEnum channel) {
        this.channel = channel;
        return this;
    }

    /**
     * Returns channel.
     * <p>
     * Field description:
     * The channel used to deliver a message. This property will be present only if the original message was sent with the failover option defined. The property will be included in the delivery report for the original RCS message and for the failover message (in case the failover was triggered).
     *
     * @return channel
     */
    @JsonProperty("channel")
    public ChannelEnum getChannel() {
        return channel;
    }

    /**
     * Sets channel.
     * <p>
     * Field description:
     * The channel used to deliver a message. This property will be present only if the original message was sent with the failover option defined. The property will be included in the delivery report for the original RCS message and for the failover message (in case the failover was triggered).
     *
     * @param channel
     */
    @JsonProperty("channel")
    public void setChannel(ChannelEnum channel) {
        this.channel = channel;
    }

    /**
     * Sets price.
     *
     * @param price
     * @return This {@link RcsWebhookDeliveryReport instance}.
     */
    public RcsWebhookDeliveryReport price(RcsMessagePrice price) {
        this.price = price;
        return this;
    }

    /**
     * Returns price.
     *
     * @return price
     */
    @JsonProperty("price")
    public RcsMessagePrice getPrice() {
        return price;
    }

    /**
     * Sets price.
     *
     * @param price
     */
    @JsonProperty("price")
    public void setPrice(RcsMessagePrice price) {
        this.price = price;
    }

    /**
     * Sets status.
     *
     * @param status
     * @return This {@link RcsWebhookDeliveryReport instance}.
     */
    public RcsWebhookDeliveryReport status(MessageStatus status) {
        this.status = status;
        return this;
    }

    /**
     * Returns status.
     *
     * @return status
     */
    @JsonProperty("status")
    public MessageStatus getStatus() {
        return status;
    }

    /**
     * Sets status.
     *
     * @param status
     */
    @JsonProperty("status")
    public void setStatus(MessageStatus status) {
        this.status = status;
    }

    /**
     * Sets error.
     *
     * @param error
     * @return This {@link RcsWebhookDeliveryReport instance}.
     */
    public RcsWebhookDeliveryReport error(MessageError error) {
        this.error = error;
        return this;
    }

    /**
     * Returns error.
     *
     * @return error
     */
    @JsonProperty("error")
    public MessageError getError() {
        return error;
    }

    /**
     * Sets error.
     *
     * @param error
     */
    @JsonProperty("error")
    public void setError(MessageError error) {
        this.error = error;
    }

    /**
     * Sets conversation.
     *
     * @param conversation
     * @return This {@link RcsWebhookDeliveryReport instance}.
     */
    public RcsWebhookDeliveryReport conversation(RcsConversationInfo conversation) {
        this.conversation = conversation;
        return this;
    }

    /**
     * Returns conversation.
     *
     * @return conversation
     */
    @JsonProperty("conversation")
    public RcsConversationInfo getConversation() {
        return conversation;
    }

    /**
     * Sets conversation.
     *
     * @param conversation
     */
    @JsonProperty("conversation")
    public void setConversation(RcsConversationInfo conversation) {
        this.conversation = conversation;
    }

    /**
     * Sets messageId.
     * <p>
     * Field description:
     * Unique message ID.
     *
     * @param messageId
     * @return This {@link RcsWebhookDeliveryReport instance}.
     */
    public RcsWebhookDeliveryReport messageId(String messageId) {
        this.messageId = messageId;
        return this;
    }

    /**
     * Returns messageId.
     * <p>
     * Field description:
     * Unique message ID.
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
     * Unique message ID.
     *
     * @param messageId
     */
    @JsonProperty("messageId")
    public void setMessageId(String messageId) {
        this.messageId = messageId;
    }

    /**
     * Sets doneAt.
     * <p>
     * Field description:
     * Date and time when the Infobip services finished processing the message (i.e., delivered to the destination, network, etc.). Has the following format: yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZ.
     *
     * @param doneAt
     * @return This {@link RcsWebhookDeliveryReport instance}.
     */
    public RcsWebhookDeliveryReport doneAt(OffsetDateTime doneAt) {
        this.doneAt = doneAt;
        return this;
    }

    /**
     * Returns doneAt.
     * <p>
     * Field description:
     * Date and time when the Infobip services finished processing the message (i.e., delivered to the destination, network, etc.). Has the following format: yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZ.
     *
     * @return doneAt
     */
    @JsonProperty("doneAt")
    public OffsetDateTime getDoneAt() {
        return doneAt;
    }

    /**
     * Sets doneAt.
     * <p>
     * Field description:
     * Date and time when the Infobip services finished processing the message (i.e., delivered to the destination, network, etc.). Has the following format: yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZ.
     *
     * @param doneAt
     */
    @JsonProperty("doneAt")
    public void setDoneAt(OffsetDateTime doneAt) {
        this.doneAt = doneAt;
    }

    /**
     * Sets interactionType.
     *
     * @param interactionType
     * @return This {@link RcsWebhookDeliveryReport instance}.
     */
    public RcsWebhookDeliveryReport interactionType(RcsMessageInteractionType interactionType) {
        this.interactionType = interactionType;
        return this;
    }

    /**
     * Returns interactionType.
     *
     * @return interactionType
     */
    @JsonProperty("interactionType")
    public RcsMessageInteractionType getInteractionType() {
        return interactionType;
    }

    /**
     * Sets interactionType.
     *
     * @param interactionType
     */
    @JsonProperty("interactionType")
    public void setInteractionType(RcsMessageInteractionType interactionType) {
        this.interactionType = interactionType;
    }

    /**
     * Sets messageCount.
     * <p>
     * Field description:
     * The number of sent messages.
     *
     * @param messageCount
     * @return This {@link RcsWebhookDeliveryReport instance}.
     */
    public RcsWebhookDeliveryReport messageCount(Integer messageCount) {
        this.messageCount = messageCount;
        return this;
    }

    /**
     * Returns messageCount.
     * <p>
     * Field description:
     * The number of sent messages.
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
     * The number of sent messages.
     *
     * @param messageCount
     */
    @JsonProperty("messageCount")
    public void setMessageCount(Integer messageCount) {
        this.messageCount = messageCount;
    }

    /**
     * Sets sentAt.
     * <p>
     * Field description:
     * Date and time when the message was sent. Has the following format: yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZ.
     *
     * @param sentAt
     * @return This {@link RcsWebhookDeliveryReport instance}.
     */
    public RcsWebhookDeliveryReport sentAt(OffsetDateTime sentAt) {
        this.sentAt = sentAt;
        return this;
    }

    /**
     * Returns sentAt.
     * <p>
     * Field description:
     * Date and time when the message was sent. Has the following format: yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZ.
     *
     * @return sentAt
     */
    @JsonProperty("sentAt")
    public OffsetDateTime getSentAt() {
        return sentAt;
    }

    /**
     * Sets sentAt.
     * <p>
     * Field description:
     * Date and time when the message was sent. Has the following format: yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZ.
     *
     * @param sentAt
     */
    @JsonProperty("sentAt")
    public void setSentAt(OffsetDateTime sentAt) {
        this.sentAt = sentAt;
    }

    /**
     * Sets mccMnc.
     * <p>
     * Field description:
     * Mobile country and network codes.
     *
     * @param mccMnc
     * @return This {@link RcsWebhookDeliveryReport instance}.
     */
    public RcsWebhookDeliveryReport mccMnc(String mccMnc) {
        this.mccMnc = mccMnc;
        return this;
    }

    /**
     * Returns mccMnc.
     * <p>
     * Field description:
     * Mobile country and network codes.
     *
     * @return mccMnc
     */
    @JsonProperty("mccMnc")
    public String getMccMnc() {
        return mccMnc;
    }

    /**
     * Sets mccMnc.
     * <p>
     * Field description:
     * Mobile country and network codes.
     *
     * @param mccMnc
     */
    @JsonProperty("mccMnc")
    public void setMccMnc(String mccMnc) {
        this.mccMnc = mccMnc;
    }

    /**
     * Sets callbackData.
     * <p>
     * Field description:
     * Callback data sent through ‛callbackData‛ field when sending message.
     *
     * @param callbackData
     * @return This {@link RcsWebhookDeliveryReport instance}.
     */
    public RcsWebhookDeliveryReport callbackData(String callbackData) {
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
     * Sets to.
     * <p>
     * Field description:
     * Message destination address.
     *
     * @param to
     * @return This {@link RcsWebhookDeliveryReport instance}.
     */
    public RcsWebhookDeliveryReport to(String to) {
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
     * Sets sender.
     * <p>
     * Field description:
     * The sender ID which can be alphanumeric or numeric (e.g., &#x60;CompanyName&#x60;).
     *
     * @param sender
     * @return This {@link RcsWebhookDeliveryReport instance}.
     */
    public RcsWebhookDeliveryReport sender(String sender) {
        this.sender = sender;
        return this;
    }

    /**
     * Returns sender.
     * <p>
     * Field description:
     * The sender ID which can be alphanumeric or numeric (e.g., &#x60;CompanyName&#x60;).
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
     *
     * @param sender
     */
    @JsonProperty("sender")
    public void setSender(String sender) {
        this.sender = sender;
    }

    /**
     * Sets platform.
     *
     * @param platform
     * @return This {@link RcsWebhookDeliveryReport instance}.
     */
    public RcsWebhookDeliveryReport platform(Platform platform) {
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
     * @return This {@link RcsWebhookDeliveryReport instance}.
     */
    public RcsWebhookDeliveryReport campaignReferenceId(String campaignReferenceId) {
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
        RcsWebhookDeliveryReport rcsWebhookDeliveryReport = (RcsWebhookDeliveryReport) o;
        return Objects.equals(this.bulkId, rcsWebhookDeliveryReport.bulkId)
                && Objects.equals(this.channel, rcsWebhookDeliveryReport.channel)
                && Objects.equals(this.price, rcsWebhookDeliveryReport.price)
                && Objects.equals(this.status, rcsWebhookDeliveryReport.status)
                && Objects.equals(this.error, rcsWebhookDeliveryReport.error)
                && Objects.equals(this.conversation, rcsWebhookDeliveryReport.conversation)
                && Objects.equals(this.messageId, rcsWebhookDeliveryReport.messageId)
                && Objects.equals(this.doneAt, rcsWebhookDeliveryReport.doneAt)
                && Objects.equals(this.interactionType, rcsWebhookDeliveryReport.interactionType)
                && Objects.equals(this.messageCount, rcsWebhookDeliveryReport.messageCount)
                && Objects.equals(this.sentAt, rcsWebhookDeliveryReport.sentAt)
                && Objects.equals(this.mccMnc, rcsWebhookDeliveryReport.mccMnc)
                && Objects.equals(this.callbackData, rcsWebhookDeliveryReport.callbackData)
                && Objects.equals(this.to, rcsWebhookDeliveryReport.to)
                && Objects.equals(this.sender, rcsWebhookDeliveryReport.sender)
                && Objects.equals(this.platform, rcsWebhookDeliveryReport.platform)
                && Objects.equals(this.campaignReferenceId, rcsWebhookDeliveryReport.campaignReferenceId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                bulkId,
                channel,
                price,
                status,
                error,
                conversation,
                messageId,
                doneAt,
                interactionType,
                messageCount,
                sentAt,
                mccMnc,
                callbackData,
                to,
                sender,
                platform,
                campaignReferenceId);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class RcsWebhookDeliveryReport {")
                .append(newLine)
                .append("    bulkId: ")
                .append(toIndentedString(bulkId))
                .append(newLine)
                .append("    channel: ")
                .append(toIndentedString(channel))
                .append(newLine)
                .append("    price: ")
                .append(toIndentedString(price))
                .append(newLine)
                .append("    status: ")
                .append(toIndentedString(status))
                .append(newLine)
                .append("    error: ")
                .append(toIndentedString(error))
                .append(newLine)
                .append("    conversation: ")
                .append(toIndentedString(conversation))
                .append(newLine)
                .append("    messageId: ")
                .append(toIndentedString(messageId))
                .append(newLine)
                .append("    doneAt: ")
                .append(toIndentedString(doneAt))
                .append(newLine)
                .append("    interactionType: ")
                .append(toIndentedString(interactionType))
                .append(newLine)
                .append("    messageCount: ")
                .append(toIndentedString(messageCount))
                .append(newLine)
                .append("    sentAt: ")
                .append(toIndentedString(sentAt))
                .append(newLine)
                .append("    mccMnc: ")
                .append(toIndentedString(mccMnc))
                .append(newLine)
                .append("    callbackData: ")
                .append(toIndentedString(callbackData))
                .append(newLine)
                .append("    to: ")
                .append(toIndentedString(to))
                .append(newLine)
                .append("    sender: ")
                .append(toIndentedString(sender))
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
