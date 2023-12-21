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
 * Array of sent message objects, one object per every message.
 */
public class MmsMessageResult {

    private MessageStatus status;

    private String to;

    private String messageId;

    private String cc;

    private String bcc;

    /**
     * Sets status.
     *
     * @param status
     * @return This {@link MmsMessageResult instance}.
     */
    public MmsMessageResult status(MessageStatus status) {
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
     * The message destination address.
     *
     * @param to
     * @return This {@link MmsMessageResult instance}.
     */
    public MmsMessageResult to(String to) {
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
     * Sets messageId.
     * <p>
     * Field description:
     * The ID that uniquely identifies the message sent.
     *
     * @param messageId
     * @return This {@link MmsMessageResult instance}.
     */
    public MmsMessageResult messageId(String messageId) {
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
     * Sets cc.
     * <p>
     * Field description:
     * The message destination address.
     *
     * @param cc
     * @return This {@link MmsMessageResult instance}.
     */
    public MmsMessageResult cc(String cc) {
        this.cc = cc;
        return this;
    }

    /**
     * Returns cc.
     * <p>
     * Field description:
     * The message destination address.
     *
     * @return cc
     */
    @JsonProperty("cc")
    public String getCc() {
        return cc;
    }

    /**
     * Sets cc.
     * <p>
     * Field description:
     * The message destination address.
     *
     * @param cc
     */
    @JsonProperty("cc")
    public void setCc(String cc) {
        this.cc = cc;
    }

    /**
     * Sets bcc.
     * <p>
     * Field description:
     * The message destination address.
     *
     * @param bcc
     * @return This {@link MmsMessageResult instance}.
     */
    public MmsMessageResult bcc(String bcc) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MmsMessageResult mmsMessageResult = (MmsMessageResult) o;
        return Objects.equals(this.status, mmsMessageResult.status)
                && Objects.equals(this.to, mmsMessageResult.to)
                && Objects.equals(this.messageId, mmsMessageResult.messageId)
                && Objects.equals(this.cc, mmsMessageResult.cc)
                && Objects.equals(this.bcc, mmsMessageResult.bcc);
    }

    @Override
    public int hashCode() {
        return Objects.hash(status, to, messageId, cc, bcc);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class MmsMessageResult {")
                .append(newLine)
                .append("    status: ")
                .append(toIndentedString(status))
                .append(newLine)
                .append("    to: ")
                .append(toIndentedString(to))
                .append(newLine)
                .append("    messageId: ")
                .append(toIndentedString(messageId))
                .append(newLine)
                .append("    cc: ")
                .append(toIndentedString(cc))
                .append(newLine)
                .append("    bcc: ")
                .append(toIndentedString(bcc))
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
