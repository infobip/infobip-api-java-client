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
 * Collection of logs.
 */
public class NumberLookupLog {

    private String bulkId;

    private String messageId;

    private String to;

    private OffsetDateTime sentAt;

    private OffsetDateTime doneAt;

    private String mccMnc;

    private NumberLookupLogPrice price;

    private MessageStatus status;

    private MessageError error;

    /**
     * Sets bulkId.
     * <p>
     * Field description:
     * The ID that uniquely identifies the request.
     *
     * @param bulkId
     * @return This {@link NumberLookupLog instance}.
     */
    public NumberLookupLog bulkId(String bulkId) {
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
     * Sets messageId.
     * <p>
     * Field description:
     * The ID that uniquely identifies the performed lookup.
     *
     * @param messageId
     * @return This {@link NumberLookupLog instance}.
     */
    public NumberLookupLog messageId(String messageId) {
        this.messageId = messageId;
        return this;
    }

    /**
     * Returns messageId.
     * <p>
     * Field description:
     * The ID that uniquely identifies the performed lookup.
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
     * The ID that uniquely identifies the performed lookup.
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
     * The looked up phone number.
     *
     * @param to
     * @return This {@link NumberLookupLog instance}.
     */
    public NumberLookupLog to(String to) {
        this.to = to;
        return this;
    }

    /**
     * Returns to.
     * <p>
     * Field description:
     * The looked up phone number.
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
     * The looked up phone number.
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
     * Tells when the lookup was performed. Has the following format: &#x60;yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZ&#x60;.
     *
     * @param sentAt
     * @return This {@link NumberLookupLog instance}.
     */
    public NumberLookupLog sentAt(OffsetDateTime sentAt) {
        this.sentAt = sentAt;
        return this;
    }

    /**
     * Returns sentAt.
     * <p>
     * Field description:
     * Tells when the lookup was performed. Has the following format: &#x60;yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZ&#x60;.
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
     * Tells when the lookup was performed. Has the following format: &#x60;yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZ&#x60;.
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
     * Tells when Infobip finished processing the lookup (e.g. lookup request was delivered to the destination network). Has the following format: &#x60;yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZ&#x60;.
     *
     * @param doneAt
     * @return This {@link NumberLookupLog instance}.
     */
    public NumberLookupLog doneAt(OffsetDateTime doneAt) {
        this.doneAt = doneAt;
        return this;
    }

    /**
     * Returns doneAt.
     * <p>
     * Field description:
     * Tells when Infobip finished processing the lookup (e.g. lookup request was delivered to the destination network). Has the following format: &#x60;yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZ&#x60;.
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
     * Tells when Infobip finished processing the lookup (e.g. lookup request was delivered to the destination network). Has the following format: &#x60;yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZ&#x60;.
     *
     * @param doneAt
     */
    @JsonProperty("doneAt")
    public void setDoneAt(OffsetDateTime doneAt) {
        this.doneAt = doneAt;
    }

    /**
     * Sets mccMnc.
     * <p>
     * Field description:
     * Mobile country and network codes.
     *
     * @param mccMnc
     * @return This {@link NumberLookupLog instance}.
     */
    public NumberLookupLog mccMnc(String mccMnc) {
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
     * @return This {@link NumberLookupLog instance}.
     */
    public NumberLookupLog price(NumberLookupLogPrice price) {
        this.price = price;
        return this;
    }

    /**
     * Returns price.
     *
     * @return price
     */
    @JsonProperty("price")
    public NumberLookupLogPrice getPrice() {
        return price;
    }

    /**
     * Sets price.
     *
     * @param price
     */
    @JsonProperty("price")
    public void setPrice(NumberLookupLogPrice price) {
        this.price = price;
    }

    /**
     * Sets status.
     *
     * @param status
     * @return This {@link NumberLookupLog instance}.
     */
    public NumberLookupLog status(MessageStatus status) {
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
     * @return This {@link NumberLookupLog instance}.
     */
    public NumberLookupLog error(MessageError error) {
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
        NumberLookupLog numberLookupLog = (NumberLookupLog) o;
        return Objects.equals(this.bulkId, numberLookupLog.bulkId)
                && Objects.equals(this.messageId, numberLookupLog.messageId)
                && Objects.equals(this.to, numberLookupLog.to)
                && Objects.equals(this.sentAt, numberLookupLog.sentAt)
                && Objects.equals(this.doneAt, numberLookupLog.doneAt)
                && Objects.equals(this.mccMnc, numberLookupLog.mccMnc)
                && Objects.equals(this.price, numberLookupLog.price)
                && Objects.equals(this.status, numberLookupLog.status)
                && Objects.equals(this.error, numberLookupLog.error);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bulkId, messageId, to, sentAt, doneAt, mccMnc, price, status, error);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class NumberLookupLog {")
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
