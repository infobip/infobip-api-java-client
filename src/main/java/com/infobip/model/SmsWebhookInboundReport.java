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
 * Represents SmsWebhookInboundReport model.
 */
public class SmsWebhookInboundReport {

    private String messageId;

    private String from;

    private String to;

    private String text;

    private String cleanText;

    private String keyword;

    private OffsetDateTime receivedAt;

    private Integer smsCount;

    private MessagePrice price;

    private String callbackData;

    /**
     * Sets messageId.
     * <p>
     * Field description:
     * Unique SMS ID.
     *
     * @param messageId
     * @return This {@link SmsWebhookInboundReport instance}.
     */
    public SmsWebhookInboundReport messageId(String messageId) {
        this.messageId = messageId;
        return this;
    }

    /**
     * Returns messageId.
     * <p>
     * Field description:
     * Unique SMS ID.
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
     * Unique SMS ID.
     *
     * @param messageId
     */
    @JsonProperty("messageId")
    public void setMessageId(String messageId) {
        this.messageId = messageId;
    }

    /**
     * Sets from.
     * <p>
     * Field description:
     * Sender ID that can be alphanumeric or numeric.
     *
     * @param from
     * @return This {@link SmsWebhookInboundReport instance}.
     */
    public SmsWebhookInboundReport from(String from) {
        this.from = from;
        return this;
    }

    /**
     * Returns from.
     * <p>
     * Field description:
     * Sender ID that can be alphanumeric or numeric.
     *
     * @return from
     */
    @JsonProperty("from")
    public String getFrom() {
        return from;
    }

    /**
     * Sets from.
     * <p>
     * Field description:
     * Sender ID that can be alphanumeric or numeric.
     *
     * @param from
     */
    @JsonProperty("from")
    public void setFrom(String from) {
        this.from = from;
    }

    /**
     * Sets to.
     * <p>
     * Field description:
     * The recipient number.
     *
     * @param to
     * @return This {@link SmsWebhookInboundReport instance}.
     */
    public SmsWebhookInboundReport to(String to) {
        this.to = to;
        return this;
    }

    /**
     * Returns to.
     * <p>
     * Field description:
     * The recipient number.
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
     * The recipient number.
     *
     * @param to
     */
    @JsonProperty("to")
    public void setTo(String to) {
        this.to = to;
    }

    /**
     * Sets text.
     * <p>
     * Field description:
     * Received message content.
     *
     * @param text
     * @return This {@link SmsWebhookInboundReport instance}.
     */
    public SmsWebhookInboundReport text(String text) {
        this.text = text;
        return this;
    }

    /**
     * Returns text.
     * <p>
     * Field description:
     * Received message content.
     *
     * @return text
     */
    @JsonProperty("text")
    public String getText() {
        return text;
    }

    /**
     * Sets text.
     * <p>
     * Field description:
     * Received message content.
     *
     * @param text
     */
    @JsonProperty("text")
    public void setText(String text) {
        this.text = text;
    }

    /**
     * Sets cleanText.
     * <p>
     * Field description:
     * Text of received message without a keyword (if a keyword was sent).
     *
     * @param cleanText
     * @return This {@link SmsWebhookInboundReport instance}.
     */
    public SmsWebhookInboundReport cleanText(String cleanText) {
        this.cleanText = cleanText;
        return this;
    }

    /**
     * Returns cleanText.
     * <p>
     * Field description:
     * Text of received message without a keyword (if a keyword was sent).
     *
     * @return cleanText
     */
    @JsonProperty("cleanText")
    public String getCleanText() {
        return cleanText;
    }

    /**
     * Sets cleanText.
     * <p>
     * Field description:
     * Text of received message without a keyword (if a keyword was sent).
     *
     * @param cleanText
     */
    @JsonProperty("cleanText")
    public void setCleanText(String cleanText) {
        this.cleanText = cleanText;
    }

    /**
     * Sets keyword.
     * <p>
     * Field description:
     * Keyword extracted from the message text.
     *
     * @param keyword
     * @return This {@link SmsWebhookInboundReport instance}.
     */
    public SmsWebhookInboundReport keyword(String keyword) {
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
     * Sets receivedAt.
     * <p>
     * Field description:
     * Date and time when Infobip received the message.
     *
     * @param receivedAt
     * @return This {@link SmsWebhookInboundReport instance}.
     */
    public SmsWebhookInboundReport receivedAt(OffsetDateTime receivedAt) {
        this.receivedAt = receivedAt;
        return this;
    }

    /**
     * Returns receivedAt.
     * <p>
     * Field description:
     * Date and time when Infobip received the message.
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
     *
     * @param receivedAt
     */
    @JsonProperty("receivedAt")
    public void setReceivedAt(OffsetDateTime receivedAt) {
        this.receivedAt = receivedAt;
    }

    /**
     * Sets smsCount.
     * <p>
     * Field description:
     * Long SMS messages have a character limit on how much can be sent over one message.  Longer messages will be split up into multiple messages and sent separately.  This is the total count of messages one SMS was sent over.
     *
     * @param smsCount
     * @return This {@link SmsWebhookInboundReport instance}.
     */
    public SmsWebhookInboundReport smsCount(Integer smsCount) {
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
     * Sets price.
     *
     * @param price
     * @return This {@link SmsWebhookInboundReport instance}.
     */
    public SmsWebhookInboundReport price(MessagePrice price) {
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
     * Sets callbackData.
     * <p>
     * Field description:
     * The callback data sent through the callbackData field in your fully featured SMS message.
     *
     * @param callbackData
     * @return This {@link SmsWebhookInboundReport instance}.
     */
    public SmsWebhookInboundReport callbackData(String callbackData) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SmsWebhookInboundReport smsWebhookInboundReport = (SmsWebhookInboundReport) o;
        return Objects.equals(this.messageId, smsWebhookInboundReport.messageId)
                && Objects.equals(this.from, smsWebhookInboundReport.from)
                && Objects.equals(this.to, smsWebhookInboundReport.to)
                && Objects.equals(this.text, smsWebhookInboundReport.text)
                && Objects.equals(this.cleanText, smsWebhookInboundReport.cleanText)
                && Objects.equals(this.keyword, smsWebhookInboundReport.keyword)
                && Objects.equals(this.receivedAt, smsWebhookInboundReport.receivedAt)
                && Objects.equals(this.smsCount, smsWebhookInboundReport.smsCount)
                && Objects.equals(this.price, smsWebhookInboundReport.price)
                && Objects.equals(this.callbackData, smsWebhookInboundReport.callbackData);
    }

    @Override
    public int hashCode() {
        return Objects.hash(messageId, from, to, text, cleanText, keyword, receivedAt, smsCount, price, callbackData);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class SmsWebhookInboundReport {")
                .append(newLine)
                .append("    messageId: ")
                .append(toIndentedString(messageId))
                .append(newLine)
                .append("    from: ")
                .append(toIndentedString(from))
                .append(newLine)
                .append("    to: ")
                .append(toIndentedString(to))
                .append(newLine)
                .append("    text: ")
                .append(toIndentedString(text))
                .append(newLine)
                .append("    cleanText: ")
                .append(toIndentedString(cleanText))
                .append(newLine)
                .append("    keyword: ")
                .append(toIndentedString(keyword))
                .append(newLine)
                .append("    receivedAt: ")
                .append(toIndentedString(receivedAt))
                .append(newLine)
                .append("    smsCount: ")
                .append(toIndentedString(smsCount))
                .append(newLine)
                .append("    price: ")
                .append(toIndentedString(price))
                .append(newLine)
                .append("    callbackData: ")
                .append(toIndentedString(callbackData))
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
