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
 * Represents WebhookMessageCount model.
 */
public class WebhookMessageCount {

    private Integer messageCount;

    private Integer pendingMessageCount;

    /**
     * Sets messageCount.
     * <p>
     * Field description:
     * Number of returned messages in this request.
     *
     * @param messageCount
     * @return This {@link WebhookMessageCount instance}.
     */
    public WebhookMessageCount messageCount(Integer messageCount) {
        this.messageCount = messageCount;
        return this;
    }

    /**
     * Returns messageCount.
     * <p>
     * Field description:
     * Number of returned messages in this request.
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
     * Number of returned messages in this request.
     *
     * @param messageCount
     */
    @JsonProperty("messageCount")
    public void setMessageCount(Integer messageCount) {
        this.messageCount = messageCount;
    }

    /**
     * Sets pendingMessageCount.
     * <p>
     * Field description:
     * Number of remaining new messages on Infobip servers ready to be returned in the next request.
     *
     * @param pendingMessageCount
     * @return This {@link WebhookMessageCount instance}.
     */
    public WebhookMessageCount pendingMessageCount(Integer pendingMessageCount) {
        this.pendingMessageCount = pendingMessageCount;
        return this;
    }

    /**
     * Returns pendingMessageCount.
     * <p>
     * Field description:
     * Number of remaining new messages on Infobip servers ready to be returned in the next request.
     *
     * @return pendingMessageCount
     */
    @JsonProperty("pendingMessageCount")
    public Integer getPendingMessageCount() {
        return pendingMessageCount;
    }

    /**
     * Sets pendingMessageCount.
     * <p>
     * Field description:
     * Number of remaining new messages on Infobip servers ready to be returned in the next request.
     *
     * @param pendingMessageCount
     */
    @JsonProperty("pendingMessageCount")
    public void setPendingMessageCount(Integer pendingMessageCount) {
        this.pendingMessageCount = pendingMessageCount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WebhookMessageCount webhookMessageCount = (WebhookMessageCount) o;
        return Objects.equals(this.messageCount, webhookMessageCount.messageCount)
                && Objects.equals(this.pendingMessageCount, webhookMessageCount.pendingMessageCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(messageCount, pendingMessageCount);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class WebhookMessageCount {")
                .append(newLine)
                .append("    messageCount: ")
                .append(toIndentedString(messageCount))
                .append(newLine)
                .append("    pendingMessageCount: ")
                .append(toIndentedString(pendingMessageCount))
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
