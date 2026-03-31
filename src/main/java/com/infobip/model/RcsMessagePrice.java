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
 * Price object with billing traffic type information.
 */
public class RcsMessagePrice {

    private RcsTrafficType trafficType;

    private Double pricePerMessage;

    private String currency;

    /**
     * Sets trafficType.
     *
     * @param trafficType
     * @return This {@link RcsMessagePrice instance}.
     */
    public RcsMessagePrice trafficType(RcsTrafficType trafficType) {
        this.trafficType = trafficType;
        return this;
    }

    /**
     * Returns trafficType.
     *
     * @return trafficType
     */
    @JsonProperty("trafficType")
    public RcsTrafficType getTrafficType() {
        return trafficType;
    }

    /**
     * Sets trafficType.
     *
     * @param trafficType
     */
    @JsonProperty("trafficType")
    public void setTrafficType(RcsTrafficType trafficType) {
        this.trafficType = trafficType;
    }

    /**
     * Sets pricePerMessage.
     * <p>
     * Field description:
     * Price per one message.
     *
     * @param pricePerMessage
     * @return This {@link RcsMessagePrice instance}.
     */
    public RcsMessagePrice pricePerMessage(Double pricePerMessage) {
        this.pricePerMessage = pricePerMessage;
        return this;
    }

    /**
     * Returns pricePerMessage.
     * <p>
     * Field description:
     * Price per one message.
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
     * Price per one message.
     *
     * @param pricePerMessage
     */
    @JsonProperty("pricePerMessage")
    public void setPricePerMessage(Double pricePerMessage) {
        this.pricePerMessage = pricePerMessage;
    }

    /**
     * Sets currency.
     * <p>
     * Field description:
     * The currency in which the price is expressed.
     *
     * @param currency
     * @return This {@link RcsMessagePrice instance}.
     */
    public RcsMessagePrice currency(String currency) {
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
        RcsMessagePrice rcsMessagePrice = (RcsMessagePrice) o;
        return Objects.equals(this.trafficType, rcsMessagePrice.trafficType)
                && Objects.equals(this.pricePerMessage, rcsMessagePrice.pricePerMessage)
                && Objects.equals(this.currency, rcsMessagePrice.currency);
    }

    @Override
    public int hashCode() {
        return Objects.hash(trafficType, pricePerMessage, currency);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class RcsMessagePrice {")
                .append(newLine)
                .append("    trafficType: ")
                .append(toIndentedString(trafficType))
                .append(newLine)
                .append("    pricePerMessage: ")
                .append(toIndentedString(pricePerMessage))
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
