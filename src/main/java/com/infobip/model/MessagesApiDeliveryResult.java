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
 * Incoming Delivery reports.
 */
public class MessagesApiDeliveryResult {

    private String event = "DELIVERY";

    private MessagesApiInboundDlrChannel channel;

    private String sender;

    private String destination;

    private String sentAt;

    private String doneAt;

    private String bulkId;

    private String messageId;

    private String callbackData;

    private Integer messageCount;

    private MessagesApiDeliveryStatus status;

    private MessageError error;

    private Platform platform;

    private String deviceDetails;

    private Integer mccMnc;

    private Integer networkId;

    private String campaignReferenceId;

    /**
     * Sets event.
     * <p>
     * Field description:
     * Event type (delivery report in this case).
     * <p>
     * The field is required.
     *
     * @param event
     * @return This {@link MessagesApiDeliveryResult instance}.
     */
    public MessagesApiDeliveryResult event(String event) {
        this.event = event;
        return this;
    }

    /**
     * Returns event.
     * <p>
     * Field description:
     * Event type (delivery report in this case).
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
     * Event type (delivery report in this case).
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
     * @return This {@link MessagesApiDeliveryResult instance}.
     */
    public MessagesApiDeliveryResult channel(MessagesApiInboundDlrChannel channel) {
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
    public MessagesApiInboundDlrChannel getChannel() {
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
    public void setChannel(MessagesApiInboundDlrChannel channel) {
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
     * @return This {@link MessagesApiDeliveryResult instance}.
     */
    public MessagesApiDeliveryResult sender(String sender) {
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
     * @return This {@link MessagesApiDeliveryResult instance}.
     */
    public MessagesApiDeliveryResult destination(String destination) {
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
     * @return This {@link MessagesApiDeliveryResult instance}.
     */
    public MessagesApiDeliveryResult sentAt(String sentAt) {
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
     * Sets doneAt.
     * <p>
     * Field description:
     * Tells when the message was finished processing by Infobip (ie. delivered to destination, delivered to destination network, etc.). Has the following format: &#x60;yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZ&#x60;.
     * <p>
     * The field is required.
     *
     * @param doneAt
     * @return This {@link MessagesApiDeliveryResult instance}.
     */
    public MessagesApiDeliveryResult doneAt(String doneAt) {
        this.doneAt = doneAt;
        return this;
    }

    /**
     * Returns doneAt.
     * <p>
     * Field description:
     * Tells when the message was finished processing by Infobip (ie. delivered to destination, delivered to destination network, etc.). Has the following format: &#x60;yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZ&#x60;.
     * <p>
     * The field is required.
     *
     * @return doneAt
     */
    @JsonProperty("doneAt")
    public String getDoneAt() {
        return doneAt;
    }

    /**
     * Sets doneAt.
     * <p>
     * Field description:
     * Tells when the message was finished processing by Infobip (ie. delivered to destination, delivered to destination network, etc.). Has the following format: &#x60;yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZ&#x60;.
     * <p>
     * The field is required.
     *
     * @param doneAt
     */
    @JsonProperty("doneAt")
    public void setDoneAt(String doneAt) {
        this.doneAt = doneAt;
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
     * @return This {@link MessagesApiDeliveryResult instance}.
     */
    public MessagesApiDeliveryResult bulkId(String bulkId) {
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
     * @return This {@link MessagesApiDeliveryResult instance}.
     */
    public MessagesApiDeliveryResult messageId(String messageId) {
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
     * @return This {@link MessagesApiDeliveryResult instance}.
     */
    public MessagesApiDeliveryResult callbackData(String callbackData) {
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
     * @return This {@link MessagesApiDeliveryResult instance}.
     */
    public MessagesApiDeliveryResult messageCount(Integer messageCount) {
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
     * Sets status.
     * <p>
     * The field is required.
     *
     * @param status
     * @return This {@link MessagesApiDeliveryResult instance}.
     */
    public MessagesApiDeliveryResult status(MessagesApiDeliveryStatus status) {
        this.status = status;
        return this;
    }

    /**
     * Returns status.
     * <p>
     * The field is required.
     *
     * @return status
     */
    @JsonProperty("status")
    public MessagesApiDeliveryStatus getStatus() {
        return status;
    }

    /**
     * Sets status.
     * <p>
     * The field is required.
     *
     * @param status
     */
    @JsonProperty("status")
    public void setStatus(MessagesApiDeliveryStatus status) {
        this.status = status;
    }

    /**
     * Sets error.
     * <p>
     * The field is required.
     *
     * @param error
     * @return This {@link MessagesApiDeliveryResult instance}.
     */
    public MessagesApiDeliveryResult error(MessageError error) {
        this.error = error;
        return this;
    }

    /**
     * Returns error.
     * <p>
     * The field is required.
     *
     * @return error
     */
    @JsonProperty("error")
    public MessageError getError() {
        return error;
    }

    /**
     * Sets error.
     * <p>
     * The field is required.
     *
     * @param error
     */
    @JsonProperty("error")
    public void setError(MessageError error) {
        this.error = error;
    }

    /**
     * Sets platform.
     *
     * @param platform
     * @return This {@link MessagesApiDeliveryResult instance}.
     */
    public MessagesApiDeliveryResult platform(Platform platform) {
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
     * Sets deviceDetails.
     * <p>
     * Field description:
     * Device name if available.
     *
     * @param deviceDetails
     * @return This {@link MessagesApiDeliveryResult instance}.
     */
    public MessagesApiDeliveryResult deviceDetails(String deviceDetails) {
        this.deviceDetails = deviceDetails;
        return this;
    }

    /**
     * Returns deviceDetails.
     * <p>
     * Field description:
     * Device name if available.
     *
     * @return deviceDetails
     */
    @JsonProperty("deviceDetails")
    public String getDeviceDetails() {
        return deviceDetails;
    }

    /**
     * Sets deviceDetails.
     * <p>
     * Field description:
     * Device name if available.
     *
     * @param deviceDetails
     */
    @JsonProperty("deviceDetails")
    public void setDeviceDetails(String deviceDetails) {
        this.deviceDetails = deviceDetails;
    }

    /**
     * Sets mccMnc.
     * <p>
     * Field description:
     * Mobile country and network codes.
     *
     * @param mccMnc
     * @return This {@link MessagesApiDeliveryResult instance}.
     */
    public MessagesApiDeliveryResult mccMnc(Integer mccMnc) {
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
    public Integer getMccMnc() {
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
    public void setMccMnc(Integer mccMnc) {
        this.mccMnc = mccMnc;
    }

    /**
     * Sets networkId.
     * <p>
     * Field description:
     * Network id dependent on Country.
     *
     * @param networkId
     * @return This {@link MessagesApiDeliveryResult instance}.
     */
    public MessagesApiDeliveryResult networkId(Integer networkId) {
        this.networkId = networkId;
        return this;
    }

    /**
     * Returns networkId.
     * <p>
     * Field description:
     * Network id dependent on Country.
     *
     * @return networkId
     */
    @JsonProperty("networkId")
    public Integer getNetworkId() {
        return networkId;
    }

    /**
     * Sets networkId.
     * <p>
     * Field description:
     * Network id dependent on Country.
     *
     * @param networkId
     */
    @JsonProperty("networkId")
    public void setNetworkId(Integer networkId) {
        this.networkId = networkId;
    }

    /**
     * Sets campaignReferenceId.
     * <p>
     * Field description:
     * ID of a campaign that was sent in the message.
     *
     * @param campaignReferenceId
     * @return This {@link MessagesApiDeliveryResult instance}.
     */
    public MessagesApiDeliveryResult campaignReferenceId(String campaignReferenceId) {
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
        MessagesApiDeliveryResult messagesApiDeliveryResult = (MessagesApiDeliveryResult) o;
        return Objects.equals(this.event, messagesApiDeliveryResult.event)
                && Objects.equals(this.channel, messagesApiDeliveryResult.channel)
                && Objects.equals(this.sender, messagesApiDeliveryResult.sender)
                && Objects.equals(this.destination, messagesApiDeliveryResult.destination)
                && Objects.equals(this.sentAt, messagesApiDeliveryResult.sentAt)
                && Objects.equals(this.doneAt, messagesApiDeliveryResult.doneAt)
                && Objects.equals(this.bulkId, messagesApiDeliveryResult.bulkId)
                && Objects.equals(this.messageId, messagesApiDeliveryResult.messageId)
                && Objects.equals(this.callbackData, messagesApiDeliveryResult.callbackData)
                && Objects.equals(this.messageCount, messagesApiDeliveryResult.messageCount)
                && Objects.equals(this.status, messagesApiDeliveryResult.status)
                && Objects.equals(this.error, messagesApiDeliveryResult.error)
                && Objects.equals(this.platform, messagesApiDeliveryResult.platform)
                && Objects.equals(this.deviceDetails, messagesApiDeliveryResult.deviceDetails)
                && Objects.equals(this.mccMnc, messagesApiDeliveryResult.mccMnc)
                && Objects.equals(this.networkId, messagesApiDeliveryResult.networkId)
                && Objects.equals(this.campaignReferenceId, messagesApiDeliveryResult.campaignReferenceId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                event,
                channel,
                sender,
                destination,
                sentAt,
                doneAt,
                bulkId,
                messageId,
                callbackData,
                messageCount,
                status,
                error,
                platform,
                deviceDetails,
                mccMnc,
                networkId,
                campaignReferenceId);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class MessagesApiDeliveryResult {")
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
                .append("    doneAt: ")
                .append(toIndentedString(doneAt))
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
                .append("    messageCount: ")
                .append(toIndentedString(messageCount))
                .append(newLine)
                .append("    status: ")
                .append(toIndentedString(status))
                .append(newLine)
                .append("    error: ")
                .append(toIndentedString(error))
                .append(newLine)
                .append("    platform: ")
                .append(toIndentedString(platform))
                .append(newLine)
                .append("    deviceDetails: ")
                .append(toIndentedString(deviceDetails))
                .append(newLine)
                .append("    mccMnc: ")
                .append(toIndentedString(mccMnc))
                .append(newLine)
                .append("    networkId: ")
                .append(toIndentedString(networkId))
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
