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
 * Represents ViberWebhookReport model.
 */
public class ViberWebhookReport {

    private String bulkId;

    private MessagePrice price;

    private MessageStatus status;

    private MessageError error;

    private String messageId;

    private OffsetDateTime doneAt;

    private Integer messageCount;

    private OffsetDateTime sentAt;

    private String to;

    private WebhookOmniChannel channel;

    /**
     * Sets bulkId.
     * <p>
     * Field description:
     * The ID that uniquely identifies the request.
     *
     * @param bulkId
     * @return This {@link ViberWebhookReport instance}.
     */
    public ViberWebhookReport bulkId(String bulkId) {
        this.bulkId = bulkId;
        return this;
    }

    /**
     * Returns bulkId.
     * <p>
     * Field description:
     * The ID that uniquely identifies the request.
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
     *
     * @param bulkId
     */
    @JsonProperty("bulkId")
    public void setBulkId(String bulkId) {
        this.bulkId = bulkId;
    }

    /**
     * Sets price.
     *
     * @param price
     * @return This {@link ViberWebhookReport instance}.
     */
    public ViberWebhookReport price(MessagePrice price) {
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
     * @return This {@link ViberWebhookReport instance}.
     */
    public ViberWebhookReport status(MessageStatus status) {
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
     * @return This {@link ViberWebhookReport instance}.
     */
    public ViberWebhookReport error(MessageError error) {
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
     * Sets messageId.
     * <p>
     * Field description:
     * The ID that uniquely identifies the message sent.
     *
     * @param messageId
     * @return This {@link ViberWebhookReport instance}.
     */
    public ViberWebhookReport messageId(String messageId) {
        this.messageId = messageId;
        return this;
    }

    /**
     * Returns messageId.
     * <p>
     * Field description:
     * The ID that uniquely identifies the message sent.
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
     * The ID that uniquely identifies the message sent.
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
     * Tells when the message was finished processing by Infobip (ie. delivered to destination, delivered to destination network, etc.).
     *
     * @param doneAt
     * @return This {@link ViberWebhookReport instance}.
     */
    public ViberWebhookReport doneAt(OffsetDateTime doneAt) {
        this.doneAt = doneAt;
        return this;
    }

    /**
     * Returns doneAt.
     * <p>
     * Field description:
     * Tells when the message was finished processing by Infobip (ie. delivered to destination, delivered to destination network, etc.).
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
     * Tells when the message was finished processing by Infobip (ie. delivered to destination, delivered to destination network, etc.).
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
     * The number of sent message segments.
     *
     * @param messageCount
     * @return This {@link ViberWebhookReport instance}.
     */
    public ViberWebhookReport messageCount(Integer messageCount) {
        this.messageCount = messageCount;
        return this;
    }

    /**
     * Returns messageCount.
     * <p>
     * Field description:
     * The number of sent message segments.
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
     * The number of sent message segments.
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
     * Tells when the message was sent. Has the following format: &#x60;yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZ&#x60;.
     *
     * @param sentAt
     * @return This {@link ViberWebhookReport instance}.
     */
    public ViberWebhookReport sentAt(OffsetDateTime sentAt) {
        this.sentAt = sentAt;
        return this;
    }

    /**
     * Returns sentAt.
     * <p>
     * Field description:
     * Tells when the message was sent. Has the following format: &#x60;yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZ&#x60;.
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
     * Tells when the message was sent. Has the following format: &#x60;yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZ&#x60;.
     *
     * @param sentAt
     */
    @JsonProperty("sentAt")
    public void setSentAt(OffsetDateTime sentAt) {
        this.sentAt = sentAt;
    }

    /**
     * Sets to.
     * <p>
     * Field description:
     * The message destination address.
     *
     * @param to
     * @return This {@link ViberWebhookReport instance}.
     */
    public ViberWebhookReport to(String to) {
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
     * Sets channel.
     * <p>
     * Field description:
     * Channel that was used for message delivering.
     *
     * @param channel
     * @return This {@link ViberWebhookReport instance}.
     */
    public ViberWebhookReport channel(WebhookOmniChannel channel) {
        this.channel = channel;
        return this;
    }

    /**
     * Returns channel.
     * <p>
     * Field description:
     * Channel that was used for message delivering.
     *
     * @return channel
     */
    @JsonProperty("channel")
    public WebhookOmniChannel getChannel() {
        return channel;
    }

    /**
     * Sets channel.
     * <p>
     * Field description:
     * Channel that was used for message delivering.
     *
     * @param channel
     */
    @JsonProperty("channel")
    public void setChannel(WebhookOmniChannel channel) {
        this.channel = channel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ViberWebhookReport viberWebhookReport = (ViberWebhookReport) o;
        return Objects.equals(this.bulkId, viberWebhookReport.bulkId)
                && Objects.equals(this.price, viberWebhookReport.price)
                && Objects.equals(this.status, viberWebhookReport.status)
                && Objects.equals(this.error, viberWebhookReport.error)
                && Objects.equals(this.messageId, viberWebhookReport.messageId)
                && Objects.equals(this.doneAt, viberWebhookReport.doneAt)
                && Objects.equals(this.messageCount, viberWebhookReport.messageCount)
                && Objects.equals(this.sentAt, viberWebhookReport.sentAt)
                && Objects.equals(this.to, viberWebhookReport.to)
                && Objects.equals(this.channel, viberWebhookReport.channel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bulkId, price, status, error, messageId, doneAt, messageCount, sentAt, to, channel);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class ViberWebhookReport {")
                .append(newLine)
                .append("    bulkId: ")
                .append(toIndentedString(bulkId))
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
                .append("    messageId: ")
                .append(toIndentedString(messageId))
                .append(newLine)
                .append("    doneAt: ")
                .append(toIndentedString(doneAt))
                .append(newLine)
                .append("    messageCount: ")
                .append(toIndentedString(messageCount))
                .append(newLine)
                .append("    sentAt: ")
                .append(toIndentedString(sentAt))
                .append(newLine)
                .append("    to: ")
                .append(toIndentedString(to))
                .append(newLine)
                .append("    channel: ")
                .append(toIndentedString(channel))
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
