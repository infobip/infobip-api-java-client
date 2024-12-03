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
 * Arrays of delivery reports, one object for every message.
 */
public class CallsReport {

    private String bulkId;

    private String messageId;

    private String from;

    private String to;

    private String sentAt;

    private String mccMnc;

    private String callbackData;

    private CallsVoiceData voiceCall;

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
     * @return This {@link CallsReport instance}.
     */
    public CallsReport bulkId(String bulkId) {
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
     * @return This {@link CallsReport instance}.
     */
    public CallsReport messageId(String messageId) {
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
     * Sets from.
     * <p>
     * Field description:
     * The sender ID which can be alphanumeric or numeric.
     *
     * @param from
     * @return This {@link CallsReport instance}.
     */
    public CallsReport from(String from) {
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
     * Sets to.
     * <p>
     * Field description:
     * Destination address of the voice message.
     *
     * @param to
     * @return This {@link CallsReport instance}.
     */
    public CallsReport to(String to) {
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
     * Sets sentAt.
     * <p>
     * Field description:
     * Date and time when the voice message was initiated. Has the following format: &#x60;yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZ&#x60;.
     *
     * @param sentAt
     * @return This {@link CallsReport instance}.
     */
    public CallsReport sentAt(String sentAt) {
        this.sentAt = sentAt;
        return this;
    }

    /**
     * Returns sentAt.
     * <p>
     * Field description:
     * Date and time when the voice message was initiated. Has the following format: &#x60;yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZ&#x60;.
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
     * Date and time when the voice message was initiated. Has the following format: &#x60;yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZ&#x60;.
     *
     * @param sentAt
     */
    @JsonProperty("sentAt")
    public void setSentAt(String sentAt) {
        this.sentAt = sentAt;
    }

    /**
     * Sets mccMnc.
     * <p>
     * Field description:
     * Mobile country and network codes.
     *
     * @param mccMnc
     * @return This {@link CallsReport instance}.
     */
    public CallsReport mccMnc(String mccMnc) {
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
     * Custom data sent over to the notifyUrl.
     *
     * @param callbackData
     * @return This {@link CallsReport instance}.
     */
    public CallsReport callbackData(String callbackData) {
        this.callbackData = callbackData;
        return this;
    }

    /**
     * Returns callbackData.
     * <p>
     * Field description:
     * Custom data sent over to the notifyUrl.
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
     * Custom data sent over to the notifyUrl.
     *
     * @param callbackData
     */
    @JsonProperty("callbackData")
    public void setCallbackData(String callbackData) {
        this.callbackData = callbackData;
    }

    /**
     * Sets voiceCall.
     *
     * @param voiceCall
     * @return This {@link CallsReport instance}.
     */
    public CallsReport voiceCall(CallsVoiceData voiceCall) {
        this.voiceCall = voiceCall;
        return this;
    }

    /**
     * Returns voiceCall.
     *
     * @return voiceCall
     */
    @JsonProperty("voiceCall")
    public CallsVoiceData getVoiceCall() {
        return voiceCall;
    }

    /**
     * Sets voiceCall.
     *
     * @param voiceCall
     */
    @JsonProperty("voiceCall")
    public void setVoiceCall(CallsVoiceData voiceCall) {
        this.voiceCall = voiceCall;
    }

    /**
     * Sets price.
     *
     * @param price
     * @return This {@link CallsReport instance}.
     */
    public CallsReport price(CallsPrice price) {
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
     * @return This {@link CallsReport instance}.
     */
    public CallsReport status(CallsSingleMessageStatus status) {
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
     * @return This {@link CallsReport instance}.
     */
    public CallsReport error(CallsVoiceError error) {
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
        CallsReport callsReport = (CallsReport) o;
        return Objects.equals(this.bulkId, callsReport.bulkId)
                && Objects.equals(this.messageId, callsReport.messageId)
                && Objects.equals(this.from, callsReport.from)
                && Objects.equals(this.to, callsReport.to)
                && Objects.equals(this.sentAt, callsReport.sentAt)
                && Objects.equals(this.mccMnc, callsReport.mccMnc)
                && Objects.equals(this.callbackData, callsReport.callbackData)
                && Objects.equals(this.voiceCall, callsReport.voiceCall)
                && Objects.equals(this.price, callsReport.price)
                && Objects.equals(this.status, callsReport.status)
                && Objects.equals(this.error, callsReport.error);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bulkId, messageId, from, to, sentAt, mccMnc, callbackData, voiceCall, price, status, error);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class CallsReport {")
                .append(newLine)
                .append("    bulkId: ")
                .append(toIndentedString(bulkId))
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
                .append("    sentAt: ")
                .append(toIndentedString(sentAt))
                .append(newLine)
                .append("    mccMnc: ")
                .append(toIndentedString(mccMnc))
                .append(newLine)
                .append("    callbackData: ")
                .append(toIndentedString(callbackData))
                .append(newLine)
                .append("    voiceCall: ")
                .append(toIndentedString(voiceCall))
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
