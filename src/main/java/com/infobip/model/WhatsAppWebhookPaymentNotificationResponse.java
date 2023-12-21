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
 * Represents WhatsAppWebhookPaymentNotificationResponse model.
 */
public class WhatsAppWebhookPaymentNotificationResponse {

    private String from;

    private WhatsAppWebhookPaymentNotification content;

    private OffsetDateTime createdAt;

    /**
     * Sets from.
     * <p>
     * Field description:
     * Registered WhatsApp sender number.
     *
     * @param from
     * @return This {@link WhatsAppWebhookPaymentNotificationResponse instance}.
     */
    public WhatsAppWebhookPaymentNotificationResponse from(String from) {
        this.from = from;
        return this;
    }

    /**
     * Returns from.
     * <p>
     * Field description:
     * Registered WhatsApp sender number.
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
     * Registered WhatsApp sender number.
     *
     * @param from
     */
    @JsonProperty("from")
    public void setFrom(String from) {
        this.from = from;
    }

    /**
     * Sets content.
     *
     * @param content
     * @return This {@link WhatsAppWebhookPaymentNotificationResponse instance}.
     */
    public WhatsAppWebhookPaymentNotificationResponse content(WhatsAppWebhookPaymentNotification content) {
        this.content = content;
        return this;
    }

    /**
     * Returns content.
     *
     * @return content
     */
    @JsonProperty("content")
    public WhatsAppWebhookPaymentNotification getContent() {
        return content;
    }

    /**
     * Sets content.
     *
     * @param content
     */
    @JsonProperty("content")
    public void setContent(WhatsAppWebhookPaymentNotification content) {
        this.content = content;
    }

    /**
     * Sets createdAt.
     * <p>
     * Field description:
     * Tells when the event occurred. Has the following format: &#x60;yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZ&#x60;.
     *
     * @param createdAt
     * @return This {@link WhatsAppWebhookPaymentNotificationResponse instance}.
     */
    public WhatsAppWebhookPaymentNotificationResponse createdAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * Returns createdAt.
     * <p>
     * Field description:
     * Tells when the event occurred. Has the following format: &#x60;yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZ&#x60;.
     *
     * @return createdAt
     */
    @JsonProperty("createdAt")
    public OffsetDateTime getCreatedAt() {
        return createdAt;
    }

    /**
     * Sets createdAt.
     * <p>
     * Field description:
     * Tells when the event occurred. Has the following format: &#x60;yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZ&#x60;.
     *
     * @param createdAt
     */
    @JsonProperty("createdAt")
    public void setCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WhatsAppWebhookPaymentNotificationResponse whatsAppWebhookPaymentNotificationResponse =
                (WhatsAppWebhookPaymentNotificationResponse) o;
        return Objects.equals(this.from, whatsAppWebhookPaymentNotificationResponse.from)
                && Objects.equals(this.content, whatsAppWebhookPaymentNotificationResponse.content)
                && Objects.equals(this.createdAt, whatsAppWebhookPaymentNotificationResponse.createdAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(from, content, createdAt);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class WhatsAppWebhookPaymentNotificationResponse {")
                .append(newLine)
                .append("    from: ")
                .append(toIndentedString(from))
                .append(newLine)
                .append("    content: ")
                .append(toIndentedString(content))
                .append(newLine)
                .append("    createdAt: ")
                .append(toIndentedString(createdAt))
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
