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
 * Template validity period in which WhatsApp will try to deliver template message to end user. Validity period can be customized between 1 and 10 minutes. -1 can be used to use Meta&#39;s default message validity period. This is 24 hours for the Cloud senders and 30 days for the On-Premises. Works only for templates with &#x60;AUTHENTICATION&#x60; category. It can be only edited alongside with category or structure in the request.
 */
public class WhatsAppEditValidityPeriod {

    private Integer amount;

    private WhatsAppValidityPeriodTimeUnit timeUnit;

    /**
     * Sets amount.
     * <p>
     * Field description:
     * Template validity period amount.
     * <p>
     * The field is required.
     *
     * @param amount
     * @return This {@link WhatsAppEditValidityPeriod instance}.
     */
    public WhatsAppEditValidityPeriod amount(Integer amount) {
        this.amount = amount;
        return this;
    }

    /**
     * Returns amount.
     * <p>
     * Field description:
     * Template validity period amount.
     * <p>
     * The field is required.
     *
     * @return amount
     */
    @JsonProperty("amount")
    public Integer getAmount() {
        return amount;
    }

    /**
     * Sets amount.
     * <p>
     * Field description:
     * Template validity period amount.
     * <p>
     * The field is required.
     *
     * @param amount
     */
    @JsonProperty("amount")
    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    /**
     * Sets timeUnit.
     *
     * @param timeUnit
     * @return This {@link WhatsAppEditValidityPeriod instance}.
     */
    public WhatsAppEditValidityPeriod timeUnit(WhatsAppValidityPeriodTimeUnit timeUnit) {
        this.timeUnit = timeUnit;
        return this;
    }

    /**
     * Returns timeUnit.
     *
     * @return timeUnit
     */
    @JsonProperty("timeUnit")
    public WhatsAppValidityPeriodTimeUnit getTimeUnit() {
        return timeUnit;
    }

    /**
     * Sets timeUnit.
     *
     * @param timeUnit
     */
    @JsonProperty("timeUnit")
    public void setTimeUnit(WhatsAppValidityPeriodTimeUnit timeUnit) {
        this.timeUnit = timeUnit;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WhatsAppEditValidityPeriod whatsAppEditValidityPeriod = (WhatsAppEditValidityPeriod) o;
        return Objects.equals(this.amount, whatsAppEditValidityPeriod.amount)
                && Objects.equals(this.timeUnit, whatsAppEditValidityPeriod.timeUnit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(amount, timeUnit);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class WhatsAppEditValidityPeriod {")
                .append(newLine)
                .append("    amount: ")
                .append(toIndentedString(amount))
                .append(newLine)
                .append("    timeUnit: ")
                .append(toIndentedString(timeUnit))
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
