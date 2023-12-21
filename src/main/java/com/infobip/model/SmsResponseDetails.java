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
 * An array of message objects of a single message or multiple messages sent under one bulk ID.
 */
public class SmsResponseDetails {

    private String messageId;

    private MessageStatus status;

    private String to;

    private Integer smsCount;

    /**
     * Sets messageId.
     * <p>
     * Field description:
     * Unique message ID. If not passed, it will be automatically generated and returned in a response.
     *
     * @param messageId
     * @return This {@link SmsResponseDetails instance}.
     */
    public SmsResponseDetails messageId(String messageId) {
        this.messageId = messageId;
        return this;
    }

    /**
     * Returns messageId.
     * <p>
     * Field description:
     * Unique message ID. If not passed, it will be automatically generated and returned in a response.
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
     * Unique message ID. If not passed, it will be automatically generated and returned in a response.
     *
     * @param messageId
     */
    @JsonProperty("messageId")
    public void setMessageId(String messageId) {
        this.messageId = messageId;
    }

    /**
     * Sets status.
     *
     * @param status
     * @return This {@link SmsResponseDetails instance}.
     */
    public SmsResponseDetails status(MessageStatus status) {
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
     * Sets to.
     * <p>
     * Field description:
     * The destination address of the message.
     *
     * @param to
     * @return This {@link SmsResponseDetails instance}.
     */
    public SmsResponseDetails to(String to) {
        this.to = to;
        return this;
    }

    /**
     * Returns to.
     * <p>
     * Field description:
     * The destination address of the message.
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
     * The destination address of the message.
     *
     * @param to
     */
    @JsonProperty("to")
    public void setTo(String to) {
        this.to = to;
    }

    /**
     * Sets smsCount.
     * <p>
     * Field description:
     * This is the total count of SMS submitted in the request. SMS messages have a character limit and messages longer than that limit will be split into multiple SMS and reflected in the total count of SMS submitted.
     *
     * @param smsCount
     * @return This {@link SmsResponseDetails instance}.
     */
    public SmsResponseDetails smsCount(Integer smsCount) {
        this.smsCount = smsCount;
        return this;
    }

    /**
     * Returns smsCount.
     * <p>
     * Field description:
     * This is the total count of SMS submitted in the request. SMS messages have a character limit and messages longer than that limit will be split into multiple SMS and reflected in the total count of SMS submitted.
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
     * This is the total count of SMS submitted in the request. SMS messages have a character limit and messages longer than that limit will be split into multiple SMS and reflected in the total count of SMS submitted.
     *
     * @param smsCount
     */
    @JsonProperty("smsCount")
    public void setSmsCount(Integer smsCount) {
        this.smsCount = smsCount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SmsResponseDetails smsResponseDetails = (SmsResponseDetails) o;
        return Objects.equals(this.messageId, smsResponseDetails.messageId)
                && Objects.equals(this.status, smsResponseDetails.status)
                && Objects.equals(this.to, smsResponseDetails.to)
                && Objects.equals(this.smsCount, smsResponseDetails.smsCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(messageId, status, to, smsCount);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class SmsResponseDetails {")
                .append(newLine)
                .append("    messageId: ")
                .append(toIndentedString(messageId))
                .append(newLine)
                .append("    status: ")
                .append(toIndentedString(status))
                .append(newLine)
                .append("    to: ")
                .append(toIndentedString(to))
                .append(newLine)
                .append("    smsCount: ")
                .append(toIndentedString(smsCount))
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
