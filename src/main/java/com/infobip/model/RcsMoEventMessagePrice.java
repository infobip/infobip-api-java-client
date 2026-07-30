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
 * Price object with traffic type information.
 */
public class RcsMoEventMessagePrice {

    private String trafficType;

    private Double pricePerMessage;

    private String currency;

    /**
     * Sets trafficType.
     * <p>
     * Field description:
     * Always will be null, events are not chargeable.
     *
     * @param trafficType
     * @return This {@link RcsMoEventMessagePrice instance}.
     */
    public RcsMoEventMessagePrice trafficType(String trafficType) {
        this.trafficType = trafficType;
        return this;
    }

    /**
     * Returns trafficType.
     * <p>
     * Field description:
     * Always will be null, events are not chargeable.
     *
     * @return trafficType
     */
    @JsonProperty("trafficType")
    public String getTrafficType() {
        return trafficType;
    }

    /**
     * Sets trafficType.
     * <p>
     * Field description:
     * Always will be null, events are not chargeable.
     *
     * @param trafficType
     */
    @JsonProperty("trafficType")
    public void setTrafficType(String trafficType) {
        this.trafficType = trafficType;
    }

    /**
     * Sets pricePerMessage.
     * <p>
     * Field description:
     * Price per one message.
     *
     * @param pricePerMessage
     * @return This {@link RcsMoEventMessagePrice instance}.
     */
    public RcsMoEventMessagePrice pricePerMessage(Double pricePerMessage) {
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
     * @return This {@link RcsMoEventMessagePrice instance}.
     */
    public RcsMoEventMessagePrice currency(String currency) {
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
        RcsMoEventMessagePrice rcsMoEventMessagePrice = (RcsMoEventMessagePrice) o;
        return Objects.equals(this.trafficType, rcsMoEventMessagePrice.trafficType)
                && Objects.equals(this.pricePerMessage, rcsMoEventMessagePrice.pricePerMessage)
                && Objects.equals(this.currency, rcsMoEventMessagePrice.currency);
    }

    @Override
    public int hashCode() {
        return Objects.hash(trafficType, pricePerMessage, currency);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class RcsMoEventMessagePrice {")
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
