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
 * Sent voice message price.
 */
public class CallsPrice {

    private Double pricePerSecond;

    private String currency;

    /**
     * Sets pricePerSecond.
     * <p>
     * Field description:
     * Price per one second of the voice message.
     *
     * @param pricePerSecond
     * @return This {@link CallsPrice instance}.
     */
    public CallsPrice pricePerSecond(Double pricePerSecond) {
        this.pricePerSecond = pricePerSecond;
        return this;
    }

    /**
     * Returns pricePerSecond.
     * <p>
     * Field description:
     * Price per one second of the voice message.
     *
     * @return pricePerSecond
     */
    @JsonProperty("pricePerSecond")
    public Double getPricePerSecond() {
        return pricePerSecond;
    }

    /**
     * Sets pricePerSecond.
     * <p>
     * Field description:
     * Price per one second of the voice message.
     *
     * @param pricePerSecond
     */
    @JsonProperty("pricePerSecond")
    public void setPricePerSecond(Double pricePerSecond) {
        this.pricePerSecond = pricePerSecond;
    }

    /**
     * Sets currency.
     * <p>
     * Field description:
     * The currency in which the price is expressed.
     *
     * @param currency
     * @return This {@link CallsPrice instance}.
     */
    public CallsPrice currency(String currency) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CallsPrice callsPrice = (CallsPrice) o;
        return Objects.equals(this.pricePerSecond, callsPrice.pricePerSecond)
                && Objects.equals(this.currency, callsPrice.currency);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pricePerSecond, currency);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class CallsPrice {")
                .append(newLine)
                .append("    pricePerSecond: ")
                .append(toIndentedString(pricePerSecond))
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
