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
 * Represents WhatsAppWebhookSeenReport model.
 */
public class WhatsAppWebhookSeenReport {

    private String messageId;

    private String from;

    private String to;

    private OffsetDateTime sentAt;

    private OffsetDateTime seenAt;

    private String applicationId;

    private String entityId;

    /**
     * Sets messageId.
     * <p>
     * Field description:
     * The ID of the sent message.
     *
     * @param messageId
     * @return This {@link WhatsAppWebhookSeenReport instance}.
     */
    public WhatsAppWebhookSeenReport messageId(String messageId) {
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
     * @return This {@link WhatsAppWebhookSeenReport instance}.
     */
    public WhatsAppWebhookSeenReport from(String from) {
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
     * @return This {@link WhatsAppWebhookSeenReport instance}.
     */
    public WhatsAppWebhookSeenReport to(String to) {
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
     * @return This {@link WhatsAppWebhookSeenReport instance}.
     */
    public WhatsAppWebhookSeenReport sentAt(OffsetDateTime sentAt) {
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
     * Sets seenAt.
     * <p>
     * Field description:
     * Tells when the message was seen.
     *
     * @param seenAt
     * @return This {@link WhatsAppWebhookSeenReport instance}.
     */
    public WhatsAppWebhookSeenReport seenAt(OffsetDateTime seenAt) {
        this.seenAt = seenAt;
        return this;
    }

    /**
     * Returns seenAt.
     * <p>
     * Field description:
     * Tells when the message was seen.
     *
     * @return seenAt
     */
    @JsonProperty("seenAt")
    public OffsetDateTime getSeenAt() {
        return seenAt;
    }

    /**
     * Sets seenAt.
     * <p>
     * Field description:
     * Tells when the message was seen.
     *
     * @param seenAt
     */
    @JsonProperty("seenAt")
    public void setSeenAt(OffsetDateTime seenAt) {
        this.seenAt = seenAt;
    }

    /**
     * Sets applicationId.
     * <p>
     * Field description:
     * Application id that the message is linked to.
     *
     * @param applicationId
     * @return This {@link WhatsAppWebhookSeenReport instance}.
     */
    public WhatsAppWebhookSeenReport applicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }

    /**
     * Returns applicationId.
     * <p>
     * Field description:
     * Application id that the message is linked to.
     *
     * @return applicationId
     */
    @JsonProperty("applicationId")
    public String getApplicationId() {
        return applicationId;
    }

    /**
     * Sets applicationId.
     * <p>
     * Field description:
     * Application id that the message is linked to.
     *
     * @param applicationId
     */
    @JsonProperty("applicationId")
    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    /**
     * Sets entityId.
     * <p>
     * Field description:
     * Entity id that the message is linked to.
     *
     * @param entityId
     * @return This {@link WhatsAppWebhookSeenReport instance}.
     */
    public WhatsAppWebhookSeenReport entityId(String entityId) {
        this.entityId = entityId;
        return this;
    }

    /**
     * Returns entityId.
     * <p>
     * Field description:
     * Entity id that the message is linked to.
     *
     * @return entityId
     */
    @JsonProperty("entityId")
    public String getEntityId() {
        return entityId;
    }

    /**
     * Sets entityId.
     * <p>
     * Field description:
     * Entity id that the message is linked to.
     *
     * @param entityId
     */
    @JsonProperty("entityId")
    public void setEntityId(String entityId) {
        this.entityId = entityId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WhatsAppWebhookSeenReport whatsAppWebhookSeenReport = (WhatsAppWebhookSeenReport) o;
        return Objects.equals(this.messageId, whatsAppWebhookSeenReport.messageId)
                && Objects.equals(this.from, whatsAppWebhookSeenReport.from)
                && Objects.equals(this.to, whatsAppWebhookSeenReport.to)
                && Objects.equals(this.sentAt, whatsAppWebhookSeenReport.sentAt)
                && Objects.equals(this.seenAt, whatsAppWebhookSeenReport.seenAt)
                && Objects.equals(this.applicationId, whatsAppWebhookSeenReport.applicationId)
                && Objects.equals(this.entityId, whatsAppWebhookSeenReport.entityId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(messageId, from, to, sentAt, seenAt, applicationId, entityId);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class WhatsAppWebhookSeenReport {")
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
                .append("    seenAt: ")
                .append(toIndentedString(seenAt))
                .append(newLine)
                .append("    applicationId: ")
                .append(toIndentedString(applicationId))
                .append(newLine)
                .append("    entityId: ")
                .append(toIndentedString(entityId))
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
