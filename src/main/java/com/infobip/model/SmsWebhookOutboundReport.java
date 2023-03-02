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
 * Represents SmsWebhookOutboundReport model.
 */
public class SmsWebhookOutboundReport {

    private String bulkId;

    private String messageId;

    private String to;

    private OffsetDateTime sentAt;

    private OffsetDateTime doneAt;

    private Integer smsCount;

    private String mccMnc;

    private String callbackData;

    private MessagePrice price;

    private MessageStatus status;

    private MessageError error;

    /**
     * Sets bulkId.
     * <p>
     * Field description:
     * Unique ID attributed to  messages sent to multiple recipients.
     *
     * @param bulkId
     * @return This {@link SmsWebhookOutboundReport instance}.
     */
    public SmsWebhookOutboundReport bulkId(String bulkId) {
        this.bulkId = bulkId;
        return this;
    }

    /**
     * Returns bulkId.
     * <p>
     * Field description:
     * Unique ID attributed to  messages sent to multiple recipients.
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
     * Unique ID attributed to  messages sent to multiple recipients.
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
     * Unique SMS ID for individual messages sent.
     *
     * @param messageId
     * @return This {@link SmsWebhookOutboundReport instance}.
     */
    public SmsWebhookOutboundReport messageId(String messageId) {
        this.messageId = messageId;
        return this;
    }

    /**
     * Returns messageId.
     * <p>
     * Field description:
     * Unique SMS ID for individual messages sent.
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
     * Unique SMS ID for individual messages sent.
     *
     * @param messageId
     */
    @JsonProperty("messageId")
    public void setMessageId(String messageId) {
        this.messageId = messageId;
    }

    /**
     * Sets to.
     * <p>
     * Field description:
     * Recipient number.
     *
     * @param to
     * @return This {@link SmsWebhookOutboundReport instance}.
     */
    public SmsWebhookOutboundReport to(String to) {
        this.to = to;
        return this;
    }

    /**
     * Returns to.
     * <p>
     * Field description:
     * Recipient number.
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
     * Recipient number.
     *
     * @param to
     */
    @JsonProperty("to")
    public void setTo(String to) {
        this.to = to;
    }

    /**
     * Sets sentAt.
     * <p>
     * Field description:
     * Date and time the message was sent.
     *
     * @param sentAt
     * @return This {@link SmsWebhookOutboundReport instance}.
     */
    public SmsWebhookOutboundReport sentAt(OffsetDateTime sentAt) {
        this.sentAt = sentAt;
        return this;
    }

    /**
     * Returns sentAt.
     * <p>
     * Field description:
     * Date and time the message was sent.
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
     * Date and time the message was sent.
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
     * Date and time the message was finished processing by Infobip.  This is when the message was delivered to the specified destination.
     *
     * @param doneAt
     * @return This {@link SmsWebhookOutboundReport instance}.
     */
    public SmsWebhookOutboundReport doneAt(OffsetDateTime doneAt) {
        this.doneAt = doneAt;
        return this;
    }

    /**
     * Returns doneAt.
     * <p>
     * Field description:
     * Date and time the message was finished processing by Infobip.  This is when the message was delivered to the specified destination.
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
     * Date and time the message was finished processing by Infobip.  This is when the message was delivered to the specified destination.
     *
     * @param doneAt
     */
    @JsonProperty("doneAt")
    public void setDoneAt(OffsetDateTime doneAt) {
        this.doneAt = doneAt;
    }

    /**
     * Sets smsCount.
     * <p>
     * Field description:
     * Long SMS messages have a character limit on how much can be sent over one message.  Longer messages will be split up into multiple messages and sent separately.  This is the total count of messages one SMS was sent over.
     *
     * @param smsCount
     * @return This {@link SmsWebhookOutboundReport instance}.
     */
    public SmsWebhookOutboundReport smsCount(Integer smsCount) {
        this.smsCount = smsCount;
        return this;
    }

    /**
     * Returns smsCount.
     * <p>
     * Field description:
     * Long SMS messages have a character limit on how much can be sent over one message.  Longer messages will be split up into multiple messages and sent separately.  This is the total count of messages one SMS was sent over.
     *
     * @return smsCount
     */
    @JsonProperty("smsCount")
    public Integer getSmsCount() {
        return smsCount;
    }

    /**
     * Sets smsCount.
     * <p>
     * Field description:
     * Long SMS messages have a character limit on how much can be sent over one message.  Longer messages will be split up into multiple messages and sent separately.  This is the total count of messages one SMS was sent over.
     *
     * @param smsCount
     */
    @JsonProperty("smsCount")
    public void setSmsCount(Integer smsCount) {
        this.smsCount = smsCount;
    }

    /**
     * Sets mccMnc.
     * <p>
     * Field description:
     * Mobile country and network codes.
     *
     * @param mccMnc
     * @return This {@link SmsWebhookOutboundReport instance}.
     */
    public SmsWebhookOutboundReport mccMnc(String mccMnc) {
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
     * The callback data sent through the callbackData field in your fully featured SMS message.
     *
     * @param callbackData
     * @return This {@link SmsWebhookOutboundReport instance}.
     */
    public SmsWebhookOutboundReport callbackData(String callbackData) {
        this.callbackData = callbackData;
        return this;
    }

    /**
     * Returns callbackData.
     * <p>
     * Field description:
     * The callback data sent through the callbackData field in your fully featured SMS message.
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
     * The callback data sent through the callbackData field in your fully featured SMS message.
     *
     * @param callbackData
     */
    @JsonProperty("callbackData")
    public void setCallbackData(String callbackData) {
        this.callbackData = callbackData;
    }

    /**
     * Sets price.
     *
     * @param price
     * @return This {@link SmsWebhookOutboundReport instance}.
     */
    public SmsWebhookOutboundReport price(MessagePrice price) {
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
     * @return This {@link SmsWebhookOutboundReport instance}.
     */
    public SmsWebhookOutboundReport status(MessageStatus status) {
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
     * @return This {@link SmsWebhookOutboundReport instance}.
     */
    public SmsWebhookOutboundReport error(MessageError error) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SmsWebhookOutboundReport smsWebhookOutboundReport = (SmsWebhookOutboundReport) o;
        return Objects.equals(this.bulkId, smsWebhookOutboundReport.bulkId)
                && Objects.equals(this.messageId, smsWebhookOutboundReport.messageId)
                && Objects.equals(this.to, smsWebhookOutboundReport.to)
                && Objects.equals(this.sentAt, smsWebhookOutboundReport.sentAt)
                && Objects.equals(this.doneAt, smsWebhookOutboundReport.doneAt)
                && Objects.equals(this.smsCount, smsWebhookOutboundReport.smsCount)
                && Objects.equals(this.mccMnc, smsWebhookOutboundReport.mccMnc)
                && Objects.equals(this.callbackData, smsWebhookOutboundReport.callbackData)
                && Objects.equals(this.price, smsWebhookOutboundReport.price)
                && Objects.equals(this.status, smsWebhookOutboundReport.status)
                && Objects.equals(this.error, smsWebhookOutboundReport.error);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                bulkId, messageId, to, sentAt, doneAt, smsCount, mccMnc, callbackData, price, status, error);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class SmsWebhookOutboundReport {")
                .append(newLine)
                .append("    bulkId: ")
                .append(toIndentedString(bulkId))
                .append(newLine)
                .append("    messageId: ")
                .append(toIndentedString(messageId))
                .append(newLine)
                .append("    to: ")
                .append(toIndentedString(to))
                .append(newLine)
                .append("    sentAt: ")
                .append(toIndentedString(sentAt))
                .append(newLine)
                .append("    doneAt: ")
                .append(toIndentedString(doneAt))
                .append(newLine)
                .append("    smsCount: ")
                .append(toIndentedString(smsCount))
                .append(newLine)
                .append("    mccMnc: ")
                .append(toIndentedString(mccMnc))
                .append(newLine)
                .append("    callbackData: ")
                .append(toIndentedString(callbackData))
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
