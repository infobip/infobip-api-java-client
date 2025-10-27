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
 * (WhatsApp specific) Transaction of the payment.
 */
public class MessagesApiWebhookEventPaymentTransaction {

    private String id;

    private MessagesApiWebhookEventPaymentTransactionType type;

    /**
     * Sets id.
     * <p>
     * Field description:
     * (WhatsApp specific) Unique identifier of the transaction.
     *
     * @param id
     * @return This {@link MessagesApiWebhookEventPaymentTransaction instance}.
     */
    public MessagesApiWebhookEventPaymentTransaction id(String id) {
        this.id = id;
        return this;
    }

    /**
     * Returns id.
     * <p>
     * Field description:
     * (WhatsApp specific) Unique identifier of the transaction.
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
     * (WhatsApp specific) Unique identifier of the transaction.
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
     * @return This {@link MessagesApiWebhookEventPaymentTransaction instance}.
     */
    public MessagesApiWebhookEventPaymentTransaction type(MessagesApiWebhookEventPaymentTransactionType type) {
        this.type = type;
        return this;
    }

    /**
     * Returns type.
     *
     * @return type
     */
    @JsonProperty("type")
    public MessagesApiWebhookEventPaymentTransactionType getType() {
        return type;
    }

    /**
     * Sets type.
     *
     * @param type
     */
    @JsonProperty("type")
    public void setType(MessagesApiWebhookEventPaymentTransactionType type) {
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MessagesApiWebhookEventPaymentTransaction messagesApiWebhookEventPaymentTransaction =
                (MessagesApiWebhookEventPaymentTransaction) o;
        return Objects.equals(this.id, messagesApiWebhookEventPaymentTransaction.id)
                && Objects.equals(this.type, messagesApiWebhookEventPaymentTransaction.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, type);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class MessagesApiWebhookEventPaymentTransaction {")
                .append(newLine)
                .append("    id: ")
                .append(toIndentedString(id))
                .append(newLine)
                .append("    type: ")
                .append(toIndentedString(type))
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
