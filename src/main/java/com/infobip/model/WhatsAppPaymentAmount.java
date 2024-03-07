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
public class WhatsAppPaymentAmount {

    private Integer value;

    private Integer offset;

    /**
     * Sets value.
     * <p>
     * Field description:
     * Value of the payment amount multiplied by the offset.
     * <p>
     * The field is required.
     *
     * @param value
     * @return This {@link WhatsAppPaymentAmount instance}.
     */
    public WhatsAppPaymentAmount value(Integer value) {
        this.value = value;
        return this;
    }

    /**
     * Returns value.
     * <p>
     * Field description:
     * Value of the payment amount multiplied by the offset.
     * <p>
     * The field is required.
     *
     * @return value
     */
    @JsonProperty("value")
    public Integer getValue() {
        return value;
    }

    /**
     * Sets value.
     * <p>
     * Field description:
     * Value of the payment amount multiplied by the offset.
     * <p>
     * The field is required.
     *
     * @param value
     */
    @JsonProperty("value")
    public void setValue(Integer value) {
        this.value = value;
    }

    /**
     * Sets offset.
     * <p>
     * Field description:
     * Offset of the payment amount (100 for INR and BRL).
     * <p>
     * The field is required.
     *
     * @param offset
     * @return This {@link WhatsAppPaymentAmount instance}.
     */
    public WhatsAppPaymentAmount offset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * Returns offset.
     * <p>
     * Field description:
     * Offset of the payment amount (100 for INR and BRL).
     * <p>
     * The field is required.
     *
     * @return offset
     */
    @JsonProperty("offset")
    public Integer getOffset() {
        return offset;
    }

    /**
     * Sets offset.
     * <p>
     * Field description:
     * Offset of the payment amount (100 for INR and BRL).
     * <p>
     * The field is required.
     *
     * @param offset
     */
    @JsonProperty("offset")
    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WhatsAppPaymentAmount whatsAppPaymentAmount = (WhatsAppPaymentAmount) o;
        return Objects.equals(this.value, whatsAppPaymentAmount.value)
                && Objects.equals(this.offset, whatsAppPaymentAmount.offset);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value, offset);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class WhatsAppPaymentAmount {")
                .append(newLine)
                .append("    value: ")
                .append(toIndentedString(value))
                .append(newLine)
                .append("    offset: ")
                .append(toIndentedString(offset))
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
