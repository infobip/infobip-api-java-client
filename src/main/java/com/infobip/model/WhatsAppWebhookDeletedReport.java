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
 * Represents WhatsAppWebhookDeletedReport model.
 */
public class WhatsAppWebhookDeletedReport {

    private String messageId;

    private String from;

    private String to;

    private OffsetDateTime sentAt;

    private OffsetDateTime deletedAt;

    /**
     * Sets messageId.
     * <p>
     * Field description:
     * The ID of the sent message.
     *
     * @param messageId
     * @return This {@link WhatsAppWebhookDeletedReport instance}.
     */
    public WhatsAppWebhookDeletedReport messageId(String messageId) {
        this.messageId = messageId;
        return this;
    }

    /**
     * Returns messageId.
     * <p>
     * Field description:
     * The ID of the sent message.
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
     * The ID of the sent message.
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
     * Number which sent the message.
     *
     * @param from
     * @return This {@link WhatsAppWebhookDeletedReport instance}.
     */
    public WhatsAppWebhookDeletedReport from(String from) {
        this.from = from;
        return this;
    }

    /**
     * Returns from.
     * <p>
     * Field description:
     * Number which sent the message.
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
     * Number which sent the message.
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
     * Registered WhatsApp business number.
     *
     * @param to
     * @return This {@link WhatsAppWebhookDeletedReport instance}.
     */
    public WhatsAppWebhookDeletedReport to(String to) {
        this.to = to;
        return this;
    }

    /**
     * Returns to.
     * <p>
     * Field description:
     * Registered WhatsApp business number.
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
     * Registered WhatsApp business number.
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
     * Tells when the message was sent.
     *
     * @param sentAt
     * @return This {@link WhatsAppWebhookDeletedReport instance}.
     */
    public WhatsAppWebhookDeletedReport sentAt(OffsetDateTime sentAt) {
        this.sentAt = sentAt;
        return this;
    }

    /**
     * Returns sentAt.
     * <p>
     * Field description:
     * Tells when the message was sent.
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
     * Tells when the message was sent.
     *
     * @param sentAt
     */
    @JsonProperty("sentAt")
    public void setSentAt(OffsetDateTime sentAt) {
        this.sentAt = sentAt;
    }

    /**
     * Sets deletedAt.
     * <p>
     * Field description:
     * Tells when the message was deleted.
     *
     * @param deletedAt
     * @return This {@link WhatsAppWebhookDeletedReport instance}.
     */
    public WhatsAppWebhookDeletedReport deletedAt(OffsetDateTime deletedAt) {
        this.deletedAt = deletedAt;
        return this;
    }

    /**
     * Returns deletedAt.
     * <p>
     * Field description:
     * Tells when the message was deleted.
     *
     * @return deletedAt
     */
    @JsonProperty("deletedAt")
    public OffsetDateTime getDeletedAt() {
        return deletedAt;
    }

    /**
     * Sets deletedAt.
     * <p>
     * Field description:
     * Tells when the message was deleted.
     *
     * @param deletedAt
     */
    @JsonProperty("deletedAt")
    public void setDeletedAt(OffsetDateTime deletedAt) {
        this.deletedAt = deletedAt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WhatsAppWebhookDeletedReport whatsAppWebhookDeletedReport = (WhatsAppWebhookDeletedReport) o;
        return Objects.equals(this.messageId, whatsAppWebhookDeletedReport.messageId)
                && Objects.equals(this.from, whatsAppWebhookDeletedReport.from)
                && Objects.equals(this.to, whatsAppWebhookDeletedReport.to)
                && Objects.equals(this.sentAt, whatsAppWebhookDeletedReport.sentAt)
                && Objects.equals(this.deletedAt, whatsAppWebhookDeletedReport.deletedAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(messageId, from, to, sentAt, deletedAt);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class WhatsAppWebhookDeletedReport {")
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
                .append("    deletedAt: ")
                .append(toIndentedString(deletedAt))
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
