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
 * Results.
 */
public class MmsInboundReport {

    private String messageId;

    private String to;

    private String from;

    private String message;

    private String receivedAt;

    private Integer mmsCount;

    private String callbackData;

    private MmsPrice price;

    /**
     * Sets messageId.
     * <p>
     * Field description:
     * The ID that uniquely identifies the received message.
     *
     * @param messageId
     * @return This {@link MmsInboundReport instance}.
     */
    public MmsInboundReport messageId(String messageId) {
        this.messageId = messageId;
        return this;
    }

    /**
     * Returns messageId.
     * <p>
     * Field description:
     * The ID that uniquely identifies the received message.
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
     * The message destination address.
     *
     * @param to
     * @return This {@link MmsInboundReport instance}.
     */
    public MmsInboundReport to(String to) {
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
     * Sets from.
     * <p>
     * Field description:
     * Sender ID that can be alphanumeric or numeric.
     *
     * @param from
     * @return This {@link MmsInboundReport instance}.
     */
    public MmsInboundReport from(String from) {
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
     * Sets message.
     * <p>
     * Field description:
     * Full text of the received message.
     *
     * @param message
     * @return This {@link MmsInboundReport instance}.
     */
    public MmsInboundReport message(String message) {
        this.message = message;
        return this;
    }

    /**
     * Returns message.
     * <p>
     * Field description:
     * Full text of the received message.
     *
     * @return message
     */
    @JsonProperty("message")
    public String getMessage() {
        return message;
    }

    /**
     * Sets message.
     * <p>
     * Field description:
     * Full text of the received message.
     *
     * @param message
     */
    @JsonProperty("message")
    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * Sets receivedAt.
     * <p>
     * Field description:
     * Tells when Infobip platform received the message. It has the following format: &#x60;yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZ&#x60;.
     *
     * @param receivedAt
     * @return This {@link MmsInboundReport instance}.
     */
    public MmsInboundReport receivedAt(String receivedAt) {
        this.receivedAt = receivedAt;
        return this;
    }

    /**
     * Returns receivedAt.
     * <p>
     * Field description:
     * Tells when Infobip platform received the message. It has the following format: &#x60;yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZ&#x60;.
     *
     * @return receivedAt
     */
    @JsonProperty("receivedAt")
    public String getReceivedAt() {
        return receivedAt;
    }

    /**
     * Sets receivedAt.
     * <p>
     * Field description:
     * Tells when Infobip platform received the message. It has the following format: &#x60;yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZ&#x60;.
     *
     * @param receivedAt
     */
    @JsonProperty("receivedAt")
    public void setReceivedAt(String receivedAt) {
        this.receivedAt = receivedAt;
    }

    /**
     * Sets mmsCount.
     * <p>
     * Field description:
     * The number of sent message segments.
     *
     * @param mmsCount
     * @return This {@link MmsInboundReport instance}.
     */
    public MmsInboundReport mmsCount(Integer mmsCount) {
        this.mmsCount = mmsCount;
        return this;
    }

    /**
     * Returns mmsCount.
     * <p>
     * Field description:
     * The number of sent message segments.
     *
     * @return mmsCount
     */
    @JsonProperty("mmsCount")
    public Integer getMmsCount() {
        return mmsCount;
    }

    /**
     * Sets mmsCount.
     * <p>
     * Field description:
     * The number of sent message segments.
     *
     * @param mmsCount
     */
    @JsonProperty("mmsCount")
    public void setMmsCount(Integer mmsCount) {
        this.mmsCount = mmsCount;
    }

    /**
     * Sets callbackData.
     * <p>
     * Field description:
     * Custom callback data can be inserted during the setup phase.
     *
     * @param callbackData
     * @return This {@link MmsInboundReport instance}.
     */
    public MmsInboundReport callbackData(String callbackData) {
        this.callbackData = callbackData;
        return this;
    }

    /**
     * Returns callbackData.
     * <p>
     * Field description:
     * Custom callback data can be inserted during the setup phase.
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
     * Custom callback data can be inserted during the setup phase.
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
     * @return This {@link MmsInboundReport instance}.
     */
    public MmsInboundReport price(MmsPrice price) {
        this.price = price;
        return this;
    }

    /**
     * Returns price.
     *
     * @return price
     */
    @JsonProperty("price")
    public MmsPrice getPrice() {
        return price;
    }

    /**
     * Sets price.
     *
     * @param price
     */
    @JsonProperty("price")
    public void setPrice(MmsPrice price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MmsInboundReport mmsInboundReport = (MmsInboundReport) o;
        return Objects.equals(this.messageId, mmsInboundReport.messageId)
                && Objects.equals(this.to, mmsInboundReport.to)
                && Objects.equals(this.from, mmsInboundReport.from)
                && Objects.equals(this.message, mmsInboundReport.message)
                && Objects.equals(this.receivedAt, mmsInboundReport.receivedAt)
                && Objects.equals(this.mmsCount, mmsInboundReport.mmsCount)
                && Objects.equals(this.callbackData, mmsInboundReport.callbackData)
                && Objects.equals(this.price, mmsInboundReport.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(messageId, to, from, message, receivedAt, mmsCount, callbackData, price);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class MmsInboundReport {")
                .append(newLine)
                .append("    messageId: ")
                .append(toIndentedString(messageId))
                .append(newLine)
                .append("    to: ")
                .append(toIndentedString(to))
                .append(newLine)
                .append("    from: ")
                .append(toIndentedString(from))
                .append(newLine)
                .append("    message: ")
                .append(toIndentedString(message))
                .append(newLine)
                .append("    receivedAt: ")
                .append(toIndentedString(receivedAt))
                .append(newLine)
                .append("    mmsCount: ")
                .append(toIndentedString(mmsCount))
                .append(newLine)
                .append("    callbackData: ")
                .append(toIndentedString(callbackData))
                .append(newLine)
                .append("    price: ")
                .append(toIndentedString(price))
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
