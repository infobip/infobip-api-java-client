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
 * Transactions of the payment.
 */
public class WhatsAppPaymentTransaction {

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
     * <p>
     * The field is required.
     *
     * @param id
     * @return This {@link WhatsAppPaymentTransaction instance}.
     */
    public WhatsAppPaymentTransaction id(String id) {
        this.id = id;
        return this;
    }

    /**
     * Returns id.
     * <p>
     * Field description:
     * Unique identifier of the transaction.
     * <p>
     * The field is required.
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
     * <p>
     * The field is required.
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
     * The field is required.
     *
     * @param type
     * @return This {@link WhatsAppPaymentTransaction instance}.
     */
    public WhatsAppPaymentTransaction type(WhatsAppPaymentTransactionType type) {
        this.type = type;
        return this;
    }

    /**
     * Returns type.
     * <p>
     * The field is required.
     *
     * @return type
     */
    @JsonProperty("type")
    public WhatsAppPaymentTransactionType getType() {
        return type;
    }

    /**
     * Sets type.
     * <p>
     * The field is required.
     *
     * @param type
     */
    @JsonProperty("type")
    public void setType(WhatsAppPaymentTransactionType type) {
        this.type = type;
    }

    /**
     * Sets status.
     * <p>
     * The field is required.
     *
     * @param status
     * @return This {@link WhatsAppPaymentTransaction instance}.
     */
    public WhatsAppPaymentTransaction status(WhatsAppPaymentTransactionStatus status) {
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
    public WhatsAppPaymentTransactionStatus getStatus() {
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
    public void setStatus(WhatsAppPaymentTransactionStatus status) {
        this.status = status;
    }

    /**
     * Sets createdTimestamp.
     * <p>
     * Field description:
     * Creation time of the transaction.
     * <p>
     * The field is required.
     *
     * @param createdTimestamp
     * @return This {@link WhatsAppPaymentTransaction instance}.
     */
    public WhatsAppPaymentTransaction createdTimestamp(OffsetDateTime createdTimestamp) {
        this.createdTimestamp = createdTimestamp;
        return this;
    }

    /**
     * Returns createdTimestamp.
     * <p>
     * Field description:
     * Creation time of the transaction.
     * <p>
     * The field is required.
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
     * Creation time of the transaction.
     * <p>
     * The field is required.
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
     * Update time of the transaction.
     * <p>
     * The field is required.
     *
     * @param updatedTimestamp
     * @return This {@link WhatsAppPaymentTransaction instance}.
     */
    public WhatsAppPaymentTransaction updatedTimestamp(OffsetDateTime updatedTimestamp) {
        this.updatedTimestamp = updatedTimestamp;
        return this;
    }

    /**
     * Returns updatedTimestamp.
     * <p>
     * Field description:
     * Update time of the transaction.
     * <p>
     * The field is required.
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
     * Update time of the transaction.
     * <p>
     * The field is required.
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
        WhatsAppPaymentTransaction whatsAppPaymentTransaction = (WhatsAppPaymentTransaction) o;
        return Objects.equals(this.id, whatsAppPaymentTransaction.id)
                && Objects.equals(this.type, whatsAppPaymentTransaction.type)
                && Objects.equals(this.status, whatsAppPaymentTransaction.status)
                && Objects.equals(this.createdTimestamp, whatsAppPaymentTransaction.createdTimestamp)
                && Objects.equals(this.updatedTimestamp, whatsAppPaymentTransaction.updatedTimestamp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, type, status, createdTimestamp, updatedTimestamp);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class WhatsAppPaymentTransaction {")
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
