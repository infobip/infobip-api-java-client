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
 * Represents SmsOutboundMessageInfo model.
 */
public class SmsOutboundMessageInfo {

    private String to;

    private MessageStatus status;

    private Integer smsCount;

    private String messageId;

    /**
     * Sets to.
     * <p>
     * Field description:
     * The recipient phone number.
     *
     * @param to
     * @return This {@link SmsOutboundMessageInfo instance}.
     */
    public SmsOutboundMessageInfo to(String to) {
        this.to = to;
        return this;
    }

    /**
     * Returns to.
     * <p>
     * Field description:
     * The recipient phone number.
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
     * The recipient phone number.
     *
     * @param to
     */
    @JsonProperty("to")
    public void setTo(String to) {
        this.to = to;
    }

    /**
     * Sets status.
     * <p>
     * Field description:
     * Indicates the status of the message and how to recover from an error should there be any.
     *
     * @param status
     * @return This {@link SmsOutboundMessageInfo instance}.
     */
    public SmsOutboundMessageInfo status(MessageStatus status) {
        this.status = status;
        return this;
    }

    /**
     * Returns status.
     * <p>
     * Field description:
     * Indicates the status of the message and how to recover from an error should there be any.
     *
     * @return status
     */
    @JsonProperty("status")
    public MessageStatus getStatus() {
        return status;
    }

    /**
     * Sets status.
     * <p>
     * Field description:
     * Indicates the status of the message and how to recover from an error should there be any.
     *
     * @param status
     */
    @JsonProperty("status")
    public void setStatus(MessageStatus status) {
        this.status = status;
    }

    /**
     * Sets smsCount.
     * <p>
     * Field description:
     * The number of sent messages.
     *
     * @param smsCount
     * @return This {@link SmsOutboundMessageInfo instance}.
     */
    public SmsOutboundMessageInfo smsCount(Integer smsCount) {
        this.smsCount = smsCount;
        return this;
    }

    /**
     * Returns smsCount.
     * <p>
     * Field description:
     * The number of sent messages.
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
     * The number of sent messages.
     *
     * @param smsCount
     */
    @JsonProperty("smsCount")
    public void setSmsCount(Integer smsCount) {
        this.smsCount = smsCount;
    }

    /**
     * Sets messageId.
     * <p>
     * Field description:
     * The ID that uniquely identifies the message sent.
     *
     * @param messageId
     * @return This {@link SmsOutboundMessageInfo instance}.
     */
    public SmsOutboundMessageInfo messageId(String messageId) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SmsOutboundMessageInfo smsOutboundMessageInfo = (SmsOutboundMessageInfo) o;
        return Objects.equals(this.to, smsOutboundMessageInfo.to)
                && Objects.equals(this.status, smsOutboundMessageInfo.status)
                && Objects.equals(this.smsCount, smsOutboundMessageInfo.smsCount)
                && Objects.equals(this.messageId, smsOutboundMessageInfo.messageId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(to, status, smsCount, messageId);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class SmsOutboundMessageInfo {")
                .append(newLine)
                .append("    to: ")
                .append(toIndentedString(to))
                .append(newLine)
                .append("    status: ")
                .append(toIndentedString(status))
                .append(newLine)
                .append("    smsCount: ")
                .append(toIndentedString(smsCount))
                .append(newLine)
                .append("    messageId: ")
                .append(toIndentedString(messageId))
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
