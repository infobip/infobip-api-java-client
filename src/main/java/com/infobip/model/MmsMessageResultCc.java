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
 * Represents MmsMessageResultCc model.
 */
public class MmsMessageResultCc {

    private String cc;

    private MessageStatus status;

    private String messageId;

    /**
     * Sets cc.
     * <p>
     * Field description:
     * The message destination address.
     *
     * @param cc
     * @return This {@link MmsMessageResultCc instance}.
     */
    public MmsMessageResultCc cc(String cc) {
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
     * Sets status.
     * <p>
     * The field is required.
     *
     * @param status
     * @return This {@link MmsMessageResultCc instance}.
     */
    public MmsMessageResultCc status(MessageStatus status) {
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
     * @return This {@link MmsMessageResultCc instance}.
     */
    public MmsMessageResultCc messageId(String messageId) {
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
        MmsMessageResultCc mmsMessageResultCc = (MmsMessageResultCc) o;
        return Objects.equals(this.cc, mmsMessageResultCc.cc)
                && Objects.equals(this.status, mmsMessageResultCc.status)
                && Objects.equals(this.messageId, mmsMessageResultCc.messageId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cc, status, messageId);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class MmsMessageResultCc {")
                .append(newLine)
                .append("    cc: ")
                .append(toIndentedString(cc))
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
