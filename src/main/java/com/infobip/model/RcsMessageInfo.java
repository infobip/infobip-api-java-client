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
 * Represents RcsMessageInfo model.
 */
public class RcsMessageInfo {

    private String to;

    private String messageId;

    private MessageStatus status;

    /**
     * Sets to.
     * <p>
     * Field description:
     * The recipient phone number.
     *
     * @param to
     * @return This {@link RcsMessageInfo instance}.
     */
    public RcsMessageInfo to(String to) {
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
     * Sets messageId.
     * <p>
     * Field description:
     * The ID that uniquely identifies the message sent.
     *
     * @param messageId
     * @return This {@link RcsMessageInfo instance}.
     */
    public RcsMessageInfo messageId(String messageId) {
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
     * Sets status.
     * <p>
     * Field description:
     * Indicates the status of the message.
     *
     * @param status
     * @return This {@link RcsMessageInfo instance}.
     */
    public RcsMessageInfo status(MessageStatus status) {
        this.status = status;
        return this;
    }

    /**
     * Returns status.
     * <p>
     * Field description:
     * Indicates the status of the message.
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
     * Indicates the status of the message.
     *
     * @param status
     */
    @JsonProperty("status")
    public void setStatus(MessageStatus status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RcsMessageInfo rcsMessageInfo = (RcsMessageInfo) o;
        return Objects.equals(this.to, rcsMessageInfo.to)
                && Objects.equals(this.messageId, rcsMessageInfo.messageId)
                && Objects.equals(this.status, rcsMessageInfo.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(to, messageId, status);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class RcsMessageInfo {")
                .append(newLine)
                .append("    to: ")
                .append(toIndentedString(to))
                .append(newLine)
                .append("    messageId: ")
                .append(toIndentedString(messageId))
                .append(newLine)
                .append("    status: ")
                .append(toIndentedString(status))
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
