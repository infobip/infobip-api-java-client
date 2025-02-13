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
 * An array of message log results, one object per each message log entry.
 */
public class ViberLog {

    private String sender;

    private String destination;

    private String bulkId;

    private String messageId;

    private OffsetDateTime sentAt;

    private OffsetDateTime doneAt;

    private Integer messageCount;

    private MessagePrice price;

    private MessageStatus status;

    private ViberMessageError error;

    private Platform platform;

    private ViberOutboundContent content;

    private String campaignReferenceId;

    /**
     * Sets sender.
     * <p>
     * Field description:
     * The sender ID which can be alphanumeric or numeric.
     *
     * @param sender
     * @return This {@link ViberLog instance}.
     */
    public ViberLog sender(String sender) {
        this.sender = sender;
        return this;
    }

    /**
     * Returns sender.
     * <p>
     * Field description:
     * The sender ID which can be alphanumeric or numeric.
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
     * The sender ID which can be alphanumeric or numeric.
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
     *
     * @param destination
     * @return This {@link ViberLog instance}.
     */
    public ViberLog destination(String destination) {
        this.destination = destination;
        return this;
    }

    /**
     * Returns destination.
     * <p>
     * Field description:
     * Message destination address.
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
     *
     * @param destination
     */
    @JsonProperty("destination")
    public void setDestination(String destination) {
        this.destination = destination;
    }

    /**
     * Sets bulkId.
     * <p>
     * Field description:
     * Unique ID assigned to the request if messaging multiple recipients or sending multiple messages via a single API request.
     *
     * @param bulkId
     * @return This {@link ViberLog instance}.
     */
    public ViberLog bulkId(String bulkId) {
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
     * Sets messageId.
     * <p>
     * Field description:
     * Unique message ID for which a log is requested.
     *
     * @param messageId
     * @return This {@link ViberLog instance}.
     */
    public ViberLog messageId(String messageId) {
        this.messageId = messageId;
        return this;
    }

    /**
     * Returns messageId.
     * <p>
     * Field description:
     * Unique message ID for which a log is requested.
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
     * Unique message ID for which a log is requested.
     *
     * @param messageId
     */
    @JsonProperty("messageId")
    public void setMessageId(String messageId) {
        this.messageId = messageId;
    }

    /**
     * Sets sentAt.
     * <p>
     * Field description:
     * Date and time when the message was sent. Has the following format: yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZ.
     *
     * @param sentAt
     * @return This {@link ViberLog instance}.
     */
    public ViberLog sentAt(OffsetDateTime sentAt) {
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
     * Sets doneAt.
     * <p>
     * Field description:
     * Date and time when the Infobip services finished processing the message (i.e., delivered to the destination, network, etc.). Has the following format: yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZ.
     *
     * @param doneAt
     * @return This {@link ViberLog instance}.
     */
    public ViberLog doneAt(OffsetDateTime doneAt) {
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
     * Sets messageCount.
     * <p>
     * Field description:
     * The number of messages content was split to.
     *
     * @param messageCount
     * @return This {@link ViberLog instance}.
     */
    public ViberLog messageCount(Integer messageCount) {
        this.messageCount = messageCount;
        return this;
    }

    /**
     * Returns messageCount.
     * <p>
     * Field description:
     * The number of messages content was split to.
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
     * The number of messages content was split to.
     *
     * @param messageCount
     */
    @JsonProperty("messageCount")
    public void setMessageCount(Integer messageCount) {
        this.messageCount = messageCount;
    }

    /**
     * Sets price.
     *
     * @param price
     * @return This {@link ViberLog instance}.
     */
    public ViberLog price(MessagePrice price) {
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

    /**
     * Sets status.
     *
     * @param status
     * @return This {@link ViberLog instance}.
     */
    public ViberLog status(MessageStatus status) {
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
     * @return This {@link ViberLog instance}.
     */
    public ViberLog error(ViberMessageError error) {
        this.error = error;
        return this;
    }

    /**
     * Returns error.
     *
     * @return error
     */
    @JsonProperty("error")
    public ViberMessageError getError() {
        return error;
    }

    /**
     * Sets error.
     *
     * @param error
     */
    @JsonProperty("error")
    public void setError(ViberMessageError error) {
        this.error = error;
    }

    /**
     * Sets platform.
     *
     * @param platform
     * @return This {@link ViberLog instance}.
     */
    public ViberLog platform(Platform platform) {
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
     * Sets content.
     *
     * @param content
     * @return This {@link ViberLog instance}.
     */
    public ViberLog content(ViberOutboundContent content) {
        this.content = content;
        return this;
    }

    /**
     * Returns content.
     *
     * @return content
     */
    @JsonProperty("content")
    public ViberOutboundContent getContent() {
        return content;
    }

    /**
     * Sets content.
     *
     * @param content
     */
    @JsonProperty("content")
    public void setContent(ViberOutboundContent content) {
        this.content = content;
    }

    /**
     * Sets campaignReferenceId.
     * <p>
     * Field description:
     * ID of a campaign that was sent in the message.
     *
     * @param campaignReferenceId
     * @return This {@link ViberLog instance}.
     */
    public ViberLog campaignReferenceId(String campaignReferenceId) {
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
        ViberLog viberLog = (ViberLog) o;
        return Objects.equals(this.sender, viberLog.sender)
                && Objects.equals(this.destination, viberLog.destination)
                && Objects.equals(this.bulkId, viberLog.bulkId)
                && Objects.equals(this.messageId, viberLog.messageId)
                && Objects.equals(this.sentAt, viberLog.sentAt)
                && Objects.equals(this.doneAt, viberLog.doneAt)
                && Objects.equals(this.messageCount, viberLog.messageCount)
                && Objects.equals(this.price, viberLog.price)
                && Objects.equals(this.status, viberLog.status)
                && Objects.equals(this.error, viberLog.error)
                && Objects.equals(this.platform, viberLog.platform)
                && Objects.equals(this.content, viberLog.content)
                && Objects.equals(this.campaignReferenceId, viberLog.campaignReferenceId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                sender,
                destination,
                bulkId,
                messageId,
                sentAt,
                doneAt,
                messageCount,
                price,
                status,
                error,
                platform,
                content,
                campaignReferenceId);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class ViberLog {")
                .append(newLine)
                .append("    sender: ")
                .append(toIndentedString(sender))
                .append(newLine)
                .append("    destination: ")
                .append(toIndentedString(destination))
                .append(newLine)
                .append("    bulkId: ")
                .append(toIndentedString(bulkId))
                .append(newLine)
                .append("    messageId: ")
                .append(toIndentedString(messageId))
                .append(newLine)
                .append("    sentAt: ")
                .append(toIndentedString(sentAt))
                .append(newLine)
                .append("    doneAt: ")
                .append(toIndentedString(doneAt))
                .append(newLine)
                .append("    messageCount: ")
                .append(toIndentedString(messageCount))
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
                .append("    platform: ")
                .append(toIndentedString(platform))
                .append(newLine)
                .append("    content: ")
                .append(toIndentedString(content))
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
