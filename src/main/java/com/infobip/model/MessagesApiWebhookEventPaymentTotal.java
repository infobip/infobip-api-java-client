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
 * Total amount of the payment.
 */
public class MessagesApiWebhookEventPaymentTotal {

    private Double value;

    private String description;

    private MessagesApiWebhookEventPaymentCurrency currency;

    /**
     * Sets value.
     * <p>
     * Field description:
     * Value of the payment amount. In case of Apple it represents a value of all items. In case of WhatsApp it represents a value multiplied by the offset.
     *
     * @param value
     * @return This {@link MessagesApiWebhookEventPaymentTotal instance}.
     */
    public MessagesApiWebhookEventPaymentTotal value(Double value) {
        this.value = value;
        return this;
    }

    /**
     * Returns value.
     * <p>
     * Field description:
     * Value of the payment amount. In case of Apple it represents a value of all items. In case of WhatsApp it represents a value multiplied by the offset.
     *
     * @return value
     */
    @JsonProperty("value")
    public Double getValue() {
        return value;
    }

    /**
     * Sets value.
     * <p>
     * Field description:
     * Value of the payment amount. In case of Apple it represents a value of all items. In case of WhatsApp it represents a value multiplied by the offset.
     *
     * @param value
     */
    @JsonProperty("value")
    public void setValue(Double value) {
        this.value = value;
    }

    /**
     * Sets description.
     * <p>
     * Field description:
     * (Apple specific) A short localized description.
     *
     * @param description
     * @return This {@link MessagesApiWebhookEventPaymentTotal instance}.
     */
    public MessagesApiWebhookEventPaymentTotal description(String description) {
        this.description = description;
        return this;
    }

    /**
     * Returns description.
     * <p>
     * Field description:
     * (Apple specific) A short localized description.
     *
     * @return description
     */
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    /**
     * Sets description.
     * <p>
     * Field description:
     * (Apple specific) A short localized description.
     *
     * @param description
     */
    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Sets currency.
     *
     * @param currency
     * @return This {@link MessagesApiWebhookEventPaymentTotal instance}.
     */
    public MessagesApiWebhookEventPaymentTotal currency(MessagesApiWebhookEventPaymentCurrency currency) {
        this.currency = currency;
        return this;
    }

    /**
     * Returns currency.
     *
     * @return currency
     */
    @JsonProperty("currency")
    public MessagesApiWebhookEventPaymentCurrency getCurrency() {
        return currency;
    }

    /**
     * Sets currency.
     *
     * @param currency
     */
    @JsonProperty("currency")
    public void setCurrency(MessagesApiWebhookEventPaymentCurrency currency) {
        this.currency = currency;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MessagesApiWebhookEventPaymentTotal messagesApiWebhookEventPaymentTotal =
                (MessagesApiWebhookEventPaymentTotal) o;
        return Objects.equals(this.value, messagesApiWebhookEventPaymentTotal.value)
                && Objects.equals(this.description, messagesApiWebhookEventPaymentTotal.description)
                && Objects.equals(this.currency, messagesApiWebhookEventPaymentTotal.currency);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value, description, currency);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class MessagesApiWebhookEventPaymentTotal {")
                .append(newLine)
                .append("    value: ")
                .append(toIndentedString(value))
                .append(newLine)
                .append("    description: ")
                .append(toIndentedString(description))
                .append(newLine)
                .append("    currency: ")
                .append(toIndentedString(currency))
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
