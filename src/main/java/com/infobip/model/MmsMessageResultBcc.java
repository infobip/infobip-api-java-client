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
 * Represents MmsMessageResultBcc model.
 */
public class MmsMessageResultBcc {

    private String bcc;

    private MessageStatus status;

    private String messageId;

    /**
     * Sets bcc.
     * <p>
     * Field description:
     * The message destination address.
     *
     * @param bcc
     * @return This {@link MmsMessageResultBcc instance}.
     */
    public MmsMessageResultBcc bcc(String bcc) {
        this.bcc = bcc;
        return this;
    }

    /**
     * Returns bcc.
     * <p>
     * Field description:
     * The message destination address.
     *
     * @return bcc
     */
    @JsonProperty("bcc")
    public String getBcc() {
        return bcc;
    }

    /**
     * Sets bcc.
     * <p>
     * Field description:
     * The message destination address.
     *
     * @param bcc
     */
    @JsonProperty("bcc")
    public void setBcc(String bcc) {
        this.bcc = bcc;
    }

    /**
     * Sets status.
     * <p>
     * The field is required.
     *
     * @param status
     * @return This {@link MmsMessageResultBcc instance}.
     */
    public MmsMessageResultBcc status(MessageStatus status) {
        this.status = status;
        return this;
    }

    /**
     * Returns status.
     * <p>
     * The field is required.
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
     * The field is required.
     *
     * @param status
     */
    @JsonProperty("status")
    public void setStatus(MessageStatus status) {
        this.status = status;
    }

    /**
     * Sets messageId.
     * <p>
     * Field description:
     * The ID that uniquely identifies the message sent.
     *
     * @param messageId
     * @return This {@link MmsMessageResultBcc instance}.
     */
    public MmsMessageResultBcc messageId(String messageId) {
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
        MmsMessageResultBcc mmsMessageResultBcc = (MmsMessageResultBcc) o;
        return Objects.equals(this.bcc, mmsMessageResultBcc.bcc)
                && Objects.equals(this.status, mmsMessageResultBcc.status)
                && Objects.equals(this.messageId, mmsMessageResultBcc.messageId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bcc, status, messageId);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class MmsMessageResultBcc {")
                .append(newLine)
                .append("    bcc: ")
                .append(toIndentedString(bcc))
                .append(newLine)
                .append("    status: ")
                .append(toIndentedString(status))
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
