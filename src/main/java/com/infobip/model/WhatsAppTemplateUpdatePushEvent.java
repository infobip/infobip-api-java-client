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
 * Represents WhatsAppTemplateUpdatePushEvent model.
 */
public class WhatsAppTemplateUpdatePushEvent {

    private Long messageTemplateId;

    private String messageTemplateName;

    private WhatsAppLanguage messageTemplateLanguage;

    private OffsetDateTime timestamp;

    private WhatsAppTemplatePushEventChange change;

    /**
     * Sets messageTemplateId.
     * <p>
     * Field description:
     * Template ID.
     * <p>
     * The field is required.
     *
     * @param messageTemplateId
     * @return This {@link WhatsAppTemplateUpdatePushEvent instance}.
     */
    public WhatsAppTemplateUpdatePushEvent messageTemplateId(Long messageTemplateId) {
        this.messageTemplateId = messageTemplateId;
        return this;
    }

    /**
     * Returns messageTemplateId.
     * <p>
     * Field description:
     * Template ID.
     * <p>
     * The field is required.
     *
     * @return messageTemplateId
     */
    @JsonProperty("messageTemplateId")
    public Long getMessageTemplateId() {
        return messageTemplateId;
    }

    /**
     * Sets messageTemplateId.
     * <p>
     * Field description:
     * Template ID.
     * <p>
     * The field is required.
     *
     * @param messageTemplateId
     */
    @JsonProperty("messageTemplateId")
    public void setMessageTemplateId(Long messageTemplateId) {
        this.messageTemplateId = messageTemplateId;
    }

    /**
     * Sets messageTemplateName.
     * <p>
     * Field description:
     * Name of the template.
     * <p>
     * The field is required.
     *
     * @param messageTemplateName
     * @return This {@link WhatsAppTemplateUpdatePushEvent instance}.
     */
    public WhatsAppTemplateUpdatePushEvent messageTemplateName(String messageTemplateName) {
        this.messageTemplateName = messageTemplateName;
        return this;
    }

    /**
     * Returns messageTemplateName.
     * <p>
     * Field description:
     * Name of the template.
     * <p>
     * The field is required.
     *
     * @return messageTemplateName
     */
    @JsonProperty("messageTemplateName")
    public String getMessageTemplateName() {
        return messageTemplateName;
    }

    /**
     * Sets messageTemplateName.
     * <p>
     * Field description:
     * Name of the template.
     * <p>
     * The field is required.
     *
     * @param messageTemplateName
     */
    @JsonProperty("messageTemplateName")
    public void setMessageTemplateName(String messageTemplateName) {
        this.messageTemplateName = messageTemplateName;
    }

    /**
     * Sets messageTemplateLanguage.
     * <p>
     * The field is required.
     *
     * @param messageTemplateLanguage
     * @return This {@link WhatsAppTemplateUpdatePushEvent instance}.
     */
    public WhatsAppTemplateUpdatePushEvent messageTemplateLanguage(WhatsAppLanguage messageTemplateLanguage) {
        this.messageTemplateLanguage = messageTemplateLanguage;
        return this;
    }

    /**
     * Returns messageTemplateLanguage.
     * <p>
     * The field is required.
     *
     * @return messageTemplateLanguage
     */
    @JsonProperty("messageTemplateLanguage")
    public WhatsAppLanguage getMessageTemplateLanguage() {
        return messageTemplateLanguage;
    }

    /**
     * Sets messageTemplateLanguage.
     * <p>
     * The field is required.
     *
     * @param messageTemplateLanguage
     */
    @JsonProperty("messageTemplateLanguage")
    public void setMessageTemplateLanguage(WhatsAppLanguage messageTemplateLanguage) {
        this.messageTemplateLanguage = messageTemplateLanguage;
    }

    /**
     * Sets timestamp.
     * <p>
     * Field description:
     * Date and time when event occurred. Has the following format: &#x60;yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZ&#x60;.
     * <p>
     * The field is required.
     *
     * @param timestamp
     * @return This {@link WhatsAppTemplateUpdatePushEvent instance}.
     */
    public WhatsAppTemplateUpdatePushEvent timestamp(OffsetDateTime timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    /**
     * Returns timestamp.
     * <p>
     * Field description:
     * Date and time when event occurred. Has the following format: &#x60;yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZ&#x60;.
     * <p>
     * The field is required.
     *
     * @return timestamp
     */
    @JsonProperty("timestamp")
    public OffsetDateTime getTimestamp() {
        return timestamp;
    }

    /**
     * Sets timestamp.
     * <p>
     * Field description:
     * Date and time when event occurred. Has the following format: &#x60;yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZ&#x60;.
     * <p>
     * The field is required.
     *
     * @param timestamp
     */
    @JsonProperty("timestamp")
    public void setTimestamp(OffsetDateTime timestamp) {
        this.timestamp = timestamp;
    }

    /**
     * Sets change.
     * <p>
     * The field is required.
     *
     * @param change
     * @return This {@link WhatsAppTemplateUpdatePushEvent instance}.
     */
    public WhatsAppTemplateUpdatePushEvent change(WhatsAppTemplatePushEventChange change) {
        this.change = change;
        return this;
    }

    /**
     * Returns change.
     * <p>
     * The field is required.
     *
     * @return change
     */
    @JsonProperty("change")
    public WhatsAppTemplatePushEventChange getChange() {
        return change;
    }

    /**
     * Sets change.
     * <p>
     * The field is required.
     *
     * @param change
     */
    @JsonProperty("change")
    public void setChange(WhatsAppTemplatePushEventChange change) {
        this.change = change;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WhatsAppTemplateUpdatePushEvent whatsAppTemplateUpdatePushEvent = (WhatsAppTemplateUpdatePushEvent) o;
        return Objects.equals(this.messageTemplateId, whatsAppTemplateUpdatePushEvent.messageTemplateId)
                && Objects.equals(this.messageTemplateName, whatsAppTemplateUpdatePushEvent.messageTemplateName)
                && Objects.equals(this.messageTemplateLanguage, whatsAppTemplateUpdatePushEvent.messageTemplateLanguage)
                && Objects.equals(this.timestamp, whatsAppTemplateUpdatePushEvent.timestamp)
                && Objects.equals(this.change, whatsAppTemplateUpdatePushEvent.change);
    }

    @Override
    public int hashCode() {
        return Objects.hash(messageTemplateId, messageTemplateName, messageTemplateLanguage, timestamp, change);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class WhatsAppTemplateUpdatePushEvent {")
                .append(newLine)
                .append("    messageTemplateId: ")
                .append(toIndentedString(messageTemplateId))
                .append(newLine)
                .append("    messageTemplateName: ")
                .append(toIndentedString(messageTemplateName))
                .append(newLine)
                .append("    messageTemplateLanguage: ")
                .append(toIndentedString(messageTemplateLanguage))
                .append(newLine)
                .append("    timestamp: ")
                .append(toIndentedString(timestamp))
                .append(newLine)
                .append("    change: ")
                .append(toIndentedString(change))
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
