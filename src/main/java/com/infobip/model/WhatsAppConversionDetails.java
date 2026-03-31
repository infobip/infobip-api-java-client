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
 * Details should contain value and currency information indicating exact value of the conversion that happened.
 */
public class WhatsAppConversionDetails {

    private String currency;

    private Double value;

    /**
     * Sets currency.
     * <p>
     * Field description:
     * Currency of the conversion. Has to be the same as it is set on ad account.
     * <p>
     * The field is required.
     *
     * @param currency
     * @return This {@link WhatsAppConversionDetails instance}.
     */
    public WhatsAppConversionDetails currency(String currency) {
        this.currency = currency;
        return this;
    }

    /**
     * Returns currency.
     * <p>
     * Field description:
     * Currency of the conversion. Has to be the same as it is set on ad account.
     * <p>
     * The field is required.
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
     * Currency of the conversion. Has to be the same as it is set on ad account.
     * <p>
     * The field is required.
     *
     * @param currency
     */
    @JsonProperty("currency")
    public void setCurrency(String currency) {
        this.currency = currency;
    }

    /**
     * Sets value.
     * <p>
     * Field description:
     * Value of the conversion. Can be 0.
     * <p>
     * The field is required.
     *
     * @param value
     * @return This {@link WhatsAppConversionDetails instance}.
     */
    public WhatsAppConversionDetails value(Double value) {
        this.value = value;
        return this;
    }

    /**
     * Returns value.
     * <p>
     * Field description:
     * Value of the conversion. Can be 0.
     * <p>
     * The field is required.
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
     * Value of the conversion. Can be 0.
     * <p>
     * The field is required.
     *
     * @param value
     */
    @JsonProperty("value")
    public void setValue(Double value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WhatsAppConversionDetails whatsAppConversionDetails = (WhatsAppConversionDetails) o;
        return Objects.equals(this.currency, whatsAppConversionDetails.currency)
                && Objects.equals(this.value, whatsAppConversionDetails.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(currency, value);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class WhatsAppConversionDetails {")
                .append(newLine)
                .append("    currency: ")
                .append(toIndentedString(currency))
                .append(newLine)
                .append("    value: ")
                .append(toIndentedString(value))
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
