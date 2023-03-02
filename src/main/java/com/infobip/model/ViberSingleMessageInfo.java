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
 * Represents ViberSingleMessageInfo model.
 */
public class ViberSingleMessageInfo {

    private String to;

    private Integer messageCount;

    private String messageId;

    private ViberSingleMessageStatus status;

    /**
     * Sets to.
     * <p>
     * Field description:
     * The destination address of the message.
     *
     * @param to
     * @return This {@link ViberSingleMessageInfo instance}.
     */
    public ViberSingleMessageInfo to(String to) {
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
     * Sets messageCount.
     * <p>
     * Field description:
     * Number of messages required to deliver.
     *
     * @param messageCount
     * @return This {@link ViberSingleMessageInfo instance}.
     */
    public ViberSingleMessageInfo messageCount(Integer messageCount) {
        this.messageCount = messageCount;
        return this;
    }

    /**
     * Returns messageCount.
     * <p>
     * Field description:
     * Number of messages required to deliver.
     *
     * @return messageCount
     */
    @JsonProperty("messageCount")
    public Integer getMessageCount() {
        return messageCount;
    }

    /**
     * Sets messageCount.
     * <p>
     * Field description:
     * Number of messages required to deliver.
     *
     * @param messageCount
     */
    @JsonProperty("messageCount")
    public void setMessageCount(Integer messageCount) {
        this.messageCount = messageCount;
    }

    /**
     * Sets messageId.
     * <p>
     * Field description:
     * The ID that uniquely identifies the message sent. If not passed, it will be automatically generated and returned in a response.
     *
     * @param messageId
     * @return This {@link ViberSingleMessageInfo instance}.
     */
    public ViberSingleMessageInfo messageId(String messageId) {
        this.messageId = messageId;
        return this;
    }

    /**
     * Returns messageId.
     * <p>
     * Field description:
     * The ID that uniquely identifies the message sent. If not passed, it will be automatically generated and returned in a response.
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
     * The ID that uniquely identifies the message sent. If not passed, it will be automatically generated and returned in a response.
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
     * @return This {@link ViberSingleMessageInfo instance}.
     */
    public ViberSingleMessageInfo status(ViberSingleMessageStatus status) {
        this.status = status;
        return this;
    }

    /**
     * Returns status.
     *
     * @return status
     */
    @JsonProperty("status")
    public ViberSingleMessageStatus getStatus() {
        return status;
    }

    /**
     * Sets status.
     *
     * @param status
     */
    @JsonProperty("status")
    public void setStatus(ViberSingleMessageStatus status) {
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
        ViberSingleMessageInfo viberSingleMessageInfo = (ViberSingleMessageInfo) o;
        return Objects.equals(this.to, viberSingleMessageInfo.to)
                && Objects.equals(this.messageCount, viberSingleMessageInfo.messageCount)
                && Objects.equals(this.messageId, viberSingleMessageInfo.messageId)
                && Objects.equals(this.status, viberSingleMessageInfo.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(to, messageCount, messageId, status);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class ViberSingleMessageInfo {")
                .append(newLine)
                .append("    to: ")
                .append(toIndentedString(to))
                .append(newLine)
                .append("    messageCount: ")
                .append(toIndentedString(messageCount))
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
