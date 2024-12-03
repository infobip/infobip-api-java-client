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
 * Message validity period. Once expired, the message won&#39;t be sent. Validity period longer than 48h is not supported. If exceeded, it will be automatically set to 48h.
 */
public class SmsValidityPeriod {

    private Integer amount;

    private ValidityPeriodTimeUnit timeUnit;

    /**
     * Sets amount.
     * <p>
     * Field description:
     * Message validity period&#39;s value. If &#x60;timeUnit&#x60; is not set, it will default to &#x60;MINUTES&#x60;.
     * <p>
     * The field is required.
     *
     * @param amount
     * @return This {@link SmsValidityPeriod instance}.
     */
    public SmsValidityPeriod amount(Integer amount) {
        this.amount = amount;
        return this;
    }

    /**
     * Returns amount.
     * <p>
     * Field description:
     * Message validity period&#39;s value. If &#x60;timeUnit&#x60; is not set, it will default to &#x60;MINUTES&#x60;.
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
     * Message validity period&#39;s value. If &#x60;timeUnit&#x60; is not set, it will default to &#x60;MINUTES&#x60;.
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
     * @return This {@link SmsValidityPeriod instance}.
     */
    public SmsValidityPeriod timeUnit(ValidityPeriodTimeUnit timeUnit) {
        this.timeUnit = timeUnit;
        return this;
    }

    /**
     * Returns timeUnit.
     *
     * @return timeUnit
     */
    @JsonProperty("timeUnit")
    public ValidityPeriodTimeUnit getTimeUnit() {
        return timeUnit;
    }

    /**
     * Sets timeUnit.
     *
     * @param timeUnit
     */
    @JsonProperty("timeUnit")
    public void setTimeUnit(ValidityPeriodTimeUnit timeUnit) {
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
        SmsValidityPeriod smsValidityPeriod = (SmsValidityPeriod) o;
        return Objects.equals(this.amount, smsValidityPeriod.amount)
                && Objects.equals(this.timeUnit, smsValidityPeriod.timeUnit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(amount, timeUnit);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class SmsValidityPeriod {")
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
