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
 * Represents NumberLookupLogPrice model.
 */
public class NumberLookupLogPrice {

    private String currency;

    private Double pricePerLookup;

    /**
     * Sets currency.
     * <p>
     * Field description:
     * The currency in which the price is expressed.
     *
     * @param currency
     * @return This {@link NumberLookupLogPrice instance}.
     */
    public NumberLookupLogPrice currency(String currency) {
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
     * Sets pricePerLookup.
     * <p>
     * Field description:
     * Price per one NC lookup.
     *
     * @param pricePerLookup
     * @return This {@link NumberLookupLogPrice instance}.
     */
    public NumberLookupLogPrice pricePerLookup(Double pricePerLookup) {
        this.pricePerLookup = pricePerLookup;
        return this;
    }

    /**
     * Returns pricePerLookup.
     * <p>
     * Field description:
     * Price per one NC lookup.
     *
     * @return pricePerLookup
     */
    @JsonProperty("pricePerLookup")
    public Double getPricePerLookup() {
        return pricePerLookup;
    }

    /**
     * Sets pricePerLookup.
     * <p>
     * Field description:
     * Price per one NC lookup.
     *
     * @param pricePerLookup
     */
    @JsonProperty("pricePerLookup")
    public void setPricePerLookup(Double pricePerLookup) {
        this.pricePerLookup = pricePerLookup;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        NumberLookupLogPrice numberLookupLogPrice = (NumberLookupLogPrice) o;
        return Objects.equals(this.currency, numberLookupLogPrice.currency)
                && Objects.equals(this.pricePerLookup, numberLookupLogPrice.pricePerLookup);
    }

    @Override
    public int hashCode() {
        return Objects.hash(currency, pricePerLookup);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class NumberLookupLogPrice {")
                .append(newLine)
                .append("    currency: ")
                .append(toIndentedString(currency))
                .append(newLine)
                .append("    pricePerLookup: ")
                .append(toIndentedString(pricePerLookup))
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
