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
 * The price object indicating pricing details for the number.
 */
public class NumbersNumberPrice {

    private Double pricePerMonth;

    private Double setupPrice;

    private Double initialMonthPrice;

    private String currency;

    /**
     * Sets pricePerMonth.
     * <p>
     * Field description:
     * Price of the monthly fee.
     *
     * @param pricePerMonth
     * @return This {@link NumbersNumberPrice instance}.
     */
    public NumbersNumberPrice pricePerMonth(Double pricePerMonth) {
        this.pricePerMonth = pricePerMonth;
        return this;
    }

    /**
     * Returns pricePerMonth.
     * <p>
     * Field description:
     * Price of the monthly fee.
     *
     * @return pricePerMonth
     */
    @JsonProperty("pricePerMonth")
    public Double getPricePerMonth() {
        return pricePerMonth;
    }

    /**
     * Sets pricePerMonth.
     * <p>
     * Field description:
     * Price of the monthly fee.
     *
     * @param pricePerMonth
     */
    @JsonProperty("pricePerMonth")
    public void setPricePerMonth(Double pricePerMonth) {
        this.pricePerMonth = pricePerMonth;
    }

    /**
     * Sets setupPrice.
     * <p>
     * Field description:
     * Price of the setup fee.
     *
     * @param setupPrice
     * @return This {@link NumbersNumberPrice instance}.
     */
    public NumbersNumberPrice setupPrice(Double setupPrice) {
        this.setupPrice = setupPrice;
        return this;
    }

    /**
     * Returns setupPrice.
     * <p>
     * Field description:
     * Price of the setup fee.
     *
     * @return setupPrice
     */
    @JsonProperty("setupPrice")
    public Double getSetupPrice() {
        return setupPrice;
    }

    /**
     * Sets setupPrice.
     * <p>
     * Field description:
     * Price of the setup fee.
     *
     * @param setupPrice
     */
    @JsonProperty("setupPrice")
    public void setSetupPrice(Double setupPrice) {
        this.setupPrice = setupPrice;
    }

    /**
     * Sets initialMonthPrice.
     * <p>
     * Field description:
     * Price for the initial month.
     *
     * @param initialMonthPrice
     * @return This {@link NumbersNumberPrice instance}.
     */
    public NumbersNumberPrice initialMonthPrice(Double initialMonthPrice) {
        this.initialMonthPrice = initialMonthPrice;
        return this;
    }

    /**
     * Returns initialMonthPrice.
     * <p>
     * Field description:
     * Price for the initial month.
     *
     * @return initialMonthPrice
     */
    @JsonProperty("initialMonthPrice")
    public Double getInitialMonthPrice() {
        return initialMonthPrice;
    }

    /**
     * Sets initialMonthPrice.
     * <p>
     * Field description:
     * Price for the initial month.
     *
     * @param initialMonthPrice
     */
    @JsonProperty("initialMonthPrice")
    public void setInitialMonthPrice(Double initialMonthPrice) {
        this.initialMonthPrice = initialMonthPrice;
    }

    /**
     * Sets currency.
     * <p>
     * Field description:
     * Currency of the number&#39;s fees.
     *
     * @param currency
     * @return This {@link NumbersNumberPrice instance}.
     */
    public NumbersNumberPrice currency(String currency) {
        this.currency = currency;
        return this;
    }

    /**
     * Returns currency.
     * <p>
     * Field description:
     * Currency of the number&#39;s fees.
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
     * Currency of the number&#39;s fees.
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
        NumbersNumberPrice numbersNumberPrice = (NumbersNumberPrice) o;
        return Objects.equals(this.pricePerMonth, numbersNumberPrice.pricePerMonth)
                && Objects.equals(this.setupPrice, numbersNumberPrice.setupPrice)
                && Objects.equals(this.initialMonthPrice, numbersNumberPrice.initialMonthPrice)
                && Objects.equals(this.currency, numbersNumberPrice.currency);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pricePerMonth, setupPrice, initialMonthPrice, currency);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class NumbersNumberPrice {")
                .append(newLine)
                .append("    pricePerMonth: ")
                .append(toIndentedString(pricePerMonth))
                .append(newLine)
                .append("    setupPrice: ")
                .append(toIndentedString(setupPrice))
                .append(newLine)
                .append("    initialMonthPrice: ")
                .append(toIndentedString(initialMonthPrice))
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
