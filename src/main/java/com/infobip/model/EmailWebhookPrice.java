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
 * Sent email price.
 */
public class EmailWebhookPrice {

    private String currency;

    private Double pricePerMessage;

    /**
     * Sets currency.
     * <p>
     * Field description:
     * The currency in which the price is expressed.
     *
     * @param currency
     * @return This {@link EmailWebhookPrice instance}.
     */
    public EmailWebhookPrice currency(String currency) {
        this.currency = currency;
        return this;
    }

    /**
     * Returns currency.
     * <p>
     * Field description:
     * The currency in which the price is expressed.
     *
     * @return currency
     */
    @JsonProperty("currency")
    public String getCurrency() {
        return currency;
    }

    /**
     * Sets currency.
     * <p>
     * Field description:
     * The currency in which the price is expressed.
     *
     * @param currency
     */
    @JsonProperty("currency")
    public void setCurrency(String currency) {
        this.currency = currency;
    }

    /**
     * Sets pricePerMessage.
     * <p>
     * Field description:
     * Price per message.
     *
     * @param pricePerMessage
     * @return This {@link EmailWebhookPrice instance}.
     */
    public EmailWebhookPrice pricePerMessage(Double pricePerMessage) {
        this.pricePerMessage = pricePerMessage;
        return this;
    }

    /**
     * Returns pricePerMessage.
     * <p>
     * Field description:
     * Price per message.
     *
     * @return pricePerMessage
     */
    @JsonProperty("pricePerMessage")
    public Double getPricePerMessage() {
        return pricePerMessage;
    }

    /**
     * Sets pricePerMessage.
     * <p>
     * Field description:
     * Price per message.
     *
     * @param pricePerMessage
     */
    @JsonProperty("pricePerMessage")
    public void setPricePerMessage(Double pricePerMessage) {
        this.pricePerMessage = pricePerMessage;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        EmailWebhookPrice emailWebhookPrice = (EmailWebhookPrice) o;
        return Objects.equals(this.currency, emailWebhookPrice.currency)
                && Objects.equals(this.pricePerMessage, emailWebhookPrice.pricePerMessage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(currency, pricePerMessage);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class EmailWebhookPrice {")
                .append(newLine)
                .append("    currency: ")
                .append(toIndentedString(currency))
                .append(newLine)
                .append("    pricePerMessage: ")
                .append(toIndentedString(pricePerMessage))
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
