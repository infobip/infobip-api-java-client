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
 * Array of voice message logs, one object per each message.
 */
public class CallsLogsReport {

    private String bulkId;

    private String messageId;

    private String to;

    private String from;

    private String text;

    private OffsetDateTime sentAt;

    private OffsetDateTime doneAt;

    private Integer duration;

    private String mccMnc;

    private CallsPrice price;

    private CallsSingleMessageStatus status;

    private CallsVoiceError error;

    /**
     * Sets bulkId.
     * <p>
     * Field description:
     * The ID that uniquely identifies the bulk of messages.
     *
     * @param bulkId
     * @return This {@link CallsLogsReport instance}.
     */
    public CallsLogsReport bulkId(String bulkId) {
        this.bulkId = bulkId;
        return this;
    }

    /**
     * Returns bulkId.
     * <p>
     * Field description:
     * The ID that uniquely identifies the bulk of messages.
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
     * The ID that uniquely identifies the bulk of messages.
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
     * The ID that uniquely identifies the message sent.
     *
     * @param messageId
     * @return This {@link CallsLogsReport instance}.
     */
    public CallsLogsReport messageId(String messageId) {
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
     * Sets to.
     * <p>
     * Field description:
     * Destination address of the voice message.
     *
     * @param to
     * @return This {@link CallsLogsReport instance}.
     */
    public CallsLogsReport to(String to) {
        this.to = to;
        return this;
    }

    /**
     * Returns to.
     * <p>
     * Field description:
     * Destination address of the voice message.
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
     * Destination address of the voice message.
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
     * The sender ID which can be alphanumeric or numeric.
     *
     * @param from
     * @return This {@link CallsLogsReport instance}.
     */
    public CallsLogsReport from(String from) {
        this.from = from;
        return this;
    }

    /**
     * Returns from.
     * <p>
     * Field description:
     * The sender ID which can be alphanumeric or numeric.
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
     * The sender ID which can be alphanumeric or numeric.
     *
     * @param from
     */
    @JsonProperty("from")
    public void setFrom(String from) {
        this.from = from;
    }

    /**
     * Sets text.
     * <p>
     * Field description:
     * Content of the voice message that was sent.
     *
     * @param text
     * @return This {@link CallsLogsReport instance}.
     */
    public CallsLogsReport text(String text) {
        this.text = text;
        return this;
    }

    /**
     * Returns text.
     * <p>
     * Field description:
     * Content of the voice message that was sent.
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
     * Content of the voice message that was sent.
     *
     * @param text
     */
    @JsonProperty("text")
    public void setText(String text) {
        this.text = text;
    }

    /**
     * Sets sentAt.
     * <p>
     * Field description:
     * Date and time when the voice message was initiated. Has the following format: yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZ.
     *
     * @param sentAt
     * @return This {@link CallsLogsReport instance}.
     */
    public CallsLogsReport sentAt(OffsetDateTime sentAt) {
        this.sentAt = sentAt;
        return this;
    }

    /**
     * Returns sentAt.
     * <p>
     * Field description:
     * Date and time when the voice message was initiated. Has the following format: yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZ.
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
     * Date and time when the voice message was initiated. Has the following format: yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZ.
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
     * Date and time when the Infobip services finished processing the voice message (i.e. delivered to the destination, delivered to the destination network, etc.).
     *
     * @param doneAt
     * @return This {@link CallsLogsReport instance}.
     */
    public CallsLogsReport doneAt(OffsetDateTime doneAt) {
        this.doneAt = doneAt;
        return this;
    }

    /**
     * Returns doneAt.
     * <p>
     * Field description:
     * Date and time when the Infobip services finished processing the voice message (i.e. delivered to the destination, delivered to the destination network, etc.).
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
     * Date and time when the Infobip services finished processing the voice message (i.e. delivered to the destination, delivered to the destination network, etc.).
     *
     * @param doneAt
     */
    @JsonProperty("doneAt")
    public void setDoneAt(OffsetDateTime doneAt) {
        this.doneAt = doneAt;
    }

    /**
     * Sets duration.
     * <p>
     * Field description:
     * Voice message duration in seconds.
     *
     * @param duration
     * @return This {@link CallsLogsReport instance}.
     */
    public CallsLogsReport duration(Integer duration) {
        this.duration = duration;
        return this;
    }

    /**
     * Returns duration.
     * <p>
     * Field description:
     * Voice message duration in seconds.
     *
     * @return duration
     */
    @JsonProperty("duration")
    public Integer getDuration() {
        return duration;
    }

    /**
     * Sets duration.
     * <p>
     * Field description:
     * Voice message duration in seconds.
     *
     * @param duration
     */
    @JsonProperty("duration")
    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    /**
     * Sets mccMnc.
     * <p>
     * Field description:
     * Mobile country and network codes.
     *
     * @param mccMnc
     * @return This {@link CallsLogsReport instance}.
     */
    public CallsLogsReport mccMnc(String mccMnc) {
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
     * Sets price.
     *
     * @param price
     * @return This {@link CallsLogsReport instance}.
     */
    public CallsLogsReport price(CallsPrice price) {
        this.price = price;
        return this;
    }

    /**
     * Returns price.
     *
     * @return price
     */
    @JsonProperty("price")
    public CallsPrice getPrice() {
        return price;
    }

    /**
     * Sets price.
     *
     * @param price
     */
    @JsonProperty("price")
    public void setPrice(CallsPrice price) {
        this.price = price;
    }

    /**
     * Sets status.
     *
     * @param status
     * @return This {@link CallsLogsReport instance}.
     */
    public CallsLogsReport status(CallsSingleMessageStatus status) {
        this.status = status;
        return this;
    }

    /**
     * Returns status.
     *
     * @return status
     */
    @JsonProperty("status")
    public CallsSingleMessageStatus getStatus() {
        return status;
    }

    /**
     * Sets status.
     *
     * @param status
     */
    @JsonProperty("status")
    public void setStatus(CallsSingleMessageStatus status) {
        this.status = status;
    }

    /**
     * Sets error.
     *
     * @param error
     * @return This {@link CallsLogsReport instance}.
     */
    public CallsLogsReport error(CallsVoiceError error) {
        this.error = error;
        return this;
    }

    /**
     * Returns error.
     *
     * @return error
     */
    @JsonProperty("error")
    public CallsVoiceError getError() {
        return error;
    }

    /**
     * Sets error.
     *
     * @param error
     */
    @JsonProperty("error")
    public void setError(CallsVoiceError error) {
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
        CallsLogsReport callsLogsReport = (CallsLogsReport) o;
        return Objects.equals(this.bulkId, callsLogsReport.bulkId)
                && Objects.equals(this.messageId, callsLogsReport.messageId)
                && Objects.equals(this.to, callsLogsReport.to)
                && Objects.equals(this.from, callsLogsReport.from)
                && Objects.equals(this.text, callsLogsReport.text)
                && Objects.equals(this.sentAt, callsLogsReport.sentAt)
                && Objects.equals(this.doneAt, callsLogsReport.doneAt)
                && Objects.equals(this.duration, callsLogsReport.duration)
                && Objects.equals(this.mccMnc, callsLogsReport.mccMnc)
                && Objects.equals(this.price, callsLogsReport.price)
                && Objects.equals(this.status, callsLogsReport.status)
                && Objects.equals(this.error, callsLogsReport.error);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bulkId, messageId, to, from, text, sentAt, doneAt, duration, mccMnc, price, status, error);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class CallsLogsReport {")
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
                .append("    from: ")
                .append(toIndentedString(from))
                .append(newLine)
                .append("    text: ")
                .append(toIndentedString(text))
                .append(newLine)
                .append("    sentAt: ")
                .append(toIndentedString(sentAt))
                .append(newLine)
                .append("    doneAt: ")
                .append(toIndentedString(doneAt))
                .append(newLine)
                .append("    duration: ")
                .append(toIndentedString(duration))
                .append(newLine)
                .append("    mccMnc: ")
                .append(toIndentedString(mccMnc))
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
