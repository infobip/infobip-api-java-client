/*
 * This class is auto generated from the Infobip OpenAPI specification
 * through the OpenAPI Specification Client API libraries (Re)Generator (OSCAR),
 * powered by the OpenAPI Generator (https://openapi-generator.tech).
 *
 * Do not edit manually. To learn how to raise an issue, see the CONTRIBUTING guide
 * or contact us @ support@infobip.com.
 */

package com.infobip.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * Represents WhatsAppWebhookPaymentTransactionNotification model.
 */
public class WhatsAppWebhookPaymentTransactionNotification {

    private String id;

    /**
     * Type of the transaction.
     */
    public enum TypeEnum {
        UPI("UPI"),
        BR("BR"),
        UNKNOWN("UNKNOWN");

        private String value;

        TypeEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static TypeEnum fromValue(String value) {
            for (TypeEnum enumElement : TypeEnum.values()) {
                if (enumElement.value.equals(value)) {
                    return enumElement;
                }
            }
            throw new IllegalArgumentException("Unexpected enum value '" + value + "'.");
        }
    }

    private TypeEnum type;

    /**
     * Status of the transaction.
     */
    public enum StatusEnum {
        PENDING("PENDING"),
        FAILED("FAILED"),
        SUCCESS("SUCCESS"),
        CANCELED("CANCELED"),
        UNKNOWN("UNKNOWN");

        private String value;

        StatusEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static StatusEnum fromValue(String value) {
            for (StatusEnum enumElement : StatusEnum.values()) {
                if (enumElement.value.equals(value)) {
                    return enumElement;
                }
            }
            throw new IllegalArgumentException("Unexpected enum value '" + value + "'.");
        }
    }

    private StatusEnum status;

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
     * <p>
     * Field description:
     * Type of the transaction.
     *
     * @param type
     * @return This {@link WhatsAppWebhookPaymentTransactionNotification instance}.
     */
    public WhatsAppWebhookPaymentTransactionNotification type(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * Returns type.
     * <p>
     * Field description:
     * Type of the transaction.
     *
     * @return type
     */
    @JsonProperty("type")
    public TypeEnum getType() {
        return type;
    }

    /**
     * Sets type.
     * <p>
     * Field description:
     * Type of the transaction.
     *
     * @param type
     */
    @JsonProperty("type")
    public void setType(TypeEnum type) {
        this.type = type;
    }

    /**
     * Sets status.
     * <p>
     * Field description:
     * Status of the transaction.
     *
     * @param status
     * @return This {@link WhatsAppWebhookPaymentTransactionNotification instance}.
     */
    public WhatsAppWebhookPaymentTransactionNotification status(StatusEnum status) {
        this.status = status;
        return this;
    }

    /**
     * Returns status.
     * <p>
     * Field description:
     * Status of the transaction.
     *
     * @return status
     */
    @JsonProperty("status")
    public StatusEnum getStatus() {
        return status;
    }

    /**
     * Sets status.
     * <p>
     * Field description:
     * Status of the transaction.
     *
     * @param status
     */
    @JsonProperty("status")
    public void setStatus(StatusEnum status) {
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
