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
 * Represents WhatsAppWebhookMarketingUpdateNotificationResponse model.
 */
public class WhatsAppWebhookMarketingUpdateNotificationResponse {

    private String from;

    private WhatsAppWebhookMarketingUpdateNotification content;

    private OffsetDateTime createdAt;

    /**
     * Sets from.
     * <p>
     * Field description:
     * Registered WhatsApp sender number.
     *
     * @param from
     * @return This {@link WhatsAppWebhookMarketingUpdateNotificationResponse instance}.
     */
    public WhatsAppWebhookMarketingUpdateNotificationResponse from(String from) {
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
     * @return This {@link WhatsAppWebhookMarketingUpdateNotificationResponse instance}.
     */
    public WhatsAppWebhookMarketingUpdateNotificationResponse content(
            WhatsAppWebhookMarketingUpdateNotification content) {
        this.content = content;
        return this;
    }

    /**
     * Returns content.
     *
     * @return content
     */
    @JsonProperty("content")
    public WhatsAppWebhookMarketingUpdateNotification getContent() {
        return content;
    }

    /**
     * Sets content.
     *
     * @param content
     */
    @JsonProperty("content")
    public void setContent(WhatsAppWebhookMarketingUpdateNotification content) {
        this.content = content;
    }

    /**
     * Sets createdAt.
     * <p>
     * Field description:
     * Tells when the event occurred. Has the following format: &#x60;yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZ&#x60;.
     *
     * @param createdAt
     * @return This {@link WhatsAppWebhookMarketingUpdateNotificationResponse instance}.
     */
    public WhatsAppWebhookMarketingUpdateNotificationResponse createdAt(OffsetDateTime createdAt) {
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
        WhatsAppWebhookMarketingUpdateNotificationResponse whatsAppWebhookMarketingUpdateNotificationResponse =
                (WhatsAppWebhookMarketingUpdateNotificationResponse) o;
        return Objects.equals(this.from, whatsAppWebhookMarketingUpdateNotificationResponse.from)
                && Objects.equals(this.content, whatsAppWebhookMarketingUpdateNotificationResponse.content)
                && Objects.equals(this.createdAt, whatsAppWebhookMarketingUpdateNotificationResponse.createdAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(from, content, createdAt);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class WhatsAppWebhookMarketingUpdateNotificationResponse {")
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
