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
 * Represents WhatsAppWebhookPaymentTransactionNotification model.
 */
public class WhatsAppWebhookPaymentTransactionNotification {

    private String id;

    private WhatsAppPaymentTransactionType type;

    private WhatsAppPaymentTransactionStatus status;

    private OffsetDateTime createdTimestamp;

    private OffsetDateTime updatedTimestamp;

    /**
     * Sets id.
     * <p>
     * Field description:
     * Unique identifier of the transaction.
     *
     * @param id
     * @return This {@link WhatsAppWebhookPaymentTransactionNotification instance}.
     */
    public WhatsAppWebhookPaymentTransactionNotification id(String id) {
        this.id = id;
        return this;
    }

    /**
     * Returns id.
     * <p>
     * Field description:
     * Unique identifier of the transaction.
     *
     * @return id
     */
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    /**
     * Sets id.
     * <p>
     * Field description:
     * Unique identifier of the transaction.
     *
     * @param id
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Sets type.
     *
     * @param type
     * @return This {@link WhatsAppWebhookPaymentTransactionNotification instance}.
     */
    public WhatsAppWebhookPaymentTransactionNotification type(WhatsAppPaymentTransactionType type) {
        this.type = type;
        return this;
    }

    /**
     * Returns type.
     *
     * @return type
     */
    @JsonProperty("type")
    public WhatsAppPaymentTransactionType getType() {
        return type;
    }

    /**
     * Sets type.
     *
     * @param type
     */
    @JsonProperty("type")
    public void setType(WhatsAppPaymentTransactionType type) {
        this.type = type;
    }

    /**
     * Sets status.
     *
     * @param status
     * @return This {@link WhatsAppWebhookPaymentTransactionNotification instance}.
     */
    public WhatsAppWebhookPaymentTransactionNotification status(WhatsAppPaymentTransactionStatus status) {
        this.status = status;
        return this;
    }

    /**
     * Returns status.
     *
     * @return status
     */
    @JsonProperty("status")
    public WhatsAppPaymentTransactionStatus getStatus() {
        return status;
    }

    /**
     * Sets status.
     *
     * @param status
     */
    @JsonProperty("status")
    public void setStatus(WhatsAppPaymentTransactionStatus status) {
        this.status = status;
    }

    /**
     * Sets createdTimestamp.
     * <p>
     * Field description:
     * Creation time of the transaction. Has the following format: &#x60;yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZ&#x60;.
     *
     * @param createdTimestamp
     * @return This {@link WhatsAppWebhookPaymentTransactionNotification instance}.
     */
    public WhatsAppWebhookPaymentTransactionNotification createdTimestamp(OffsetDateTime createdTimestamp) {
        this.createdTimestamp = createdTimestamp;
        return this;
    }

    /**
     * Returns createdTimestamp.
     * <p>
     * Field description:
     * Creation time of the transaction. Has the following format: &#x60;yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZ&#x60;.
     *
     * @return createdTimestamp
     */
    @JsonProperty("createdTimestamp")
    public OffsetDateTime getCreatedTimestamp() {
        return createdTimestamp;
    }

    /**
     * Sets createdTimestamp.
     * <p>
     * Field description:
     * Creation time of the transaction. Has the following format: &#x60;yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZ&#x60;.
     *
     * @param createdTimestamp
     */
    @JsonProperty("createdTimestamp")
    public void setCreatedTimestamp(OffsetDateTime createdTimestamp) {
        this.createdTimestamp = createdTimestamp;
    }

    /**
     * Sets updatedTimestamp.
     * <p>
     * Field description:
     * Update time of the transaction. Has the following format: &#x60;yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZ&#x60;.
     *
     * @param updatedTimestamp
     * @return This {@link WhatsAppWebhookPaymentTransactionNotification instance}.
     */
    public WhatsAppWebhookPaymentTransactionNotification updatedTimestamp(OffsetDateTime updatedTimestamp) {
        this.updatedTimestamp = updatedTimestamp;
        return this;
    }

    /**
     * Returns updatedTimestamp.
     * <p>
     * Field description:
     * Update time of the transaction. Has the following format: &#x60;yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZ&#x60;.
     *
     * @return updatedTimestamp
     */
    @JsonProperty("updatedTimestamp")
    public OffsetDateTime getUpdatedTimestamp() {
        return updatedTimestamp;
    }

    /**
     * Sets updatedTimestamp.
     * <p>
     * Field description:
     * Update time of the transaction. Has the following format: &#x60;yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZ&#x60;.
     *
     * @param updatedTimestamp
     */
    @JsonProperty("updatedTimestamp")
    public void setUpdatedTimestamp(OffsetDateTime updatedTimestamp) {
        this.updatedTimestamp = updatedTimestamp;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WhatsAppWebhookPaymentTransactionNotification whatsAppWebhookPaymentTransactionNotification =
                (WhatsAppWebhookPaymentTransactionNotification) o;
        return Objects.equals(this.id, whatsAppWebhookPaymentTransactionNotification.id)
                && Objects.equals(this.type, whatsAppWebhookPaymentTransactionNotification.type)
                && Objects.equals(this.status, whatsAppWebhookPaymentTransactionNotification.status)
                && Objects.equals(this.createdTimestamp, whatsAppWebhookPaymentTransactionNotification.createdTimestamp)
                && Objects.equals(
                        this.updatedTimestamp, whatsAppWebhookPaymentTransactionNotification.updatedTimestamp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, type, status, createdTimestamp, updatedTimestamp);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class WhatsAppWebhookPaymentTransactionNotification {")
                .append(newLine)
                .append("    id: ")
                .append(toIndentedString(id))
                .append(newLine)
                .append("    type: ")
                .append(toIndentedString(type))
                .append(newLine)
                .append("    status: ")
                .append(toIndentedString(status))
                .append(newLine)
                .append("    createdTimestamp: ")
                .append(toIndentedString(createdTimestamp))
                .append(newLine)
                .append("    updatedTimestamp: ")
                .append(toIndentedString(updatedTimestamp))
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
