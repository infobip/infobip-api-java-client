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
 * Request payment data.
 */
public class MessagesApiMessagePayment {

    private MessagesApiMessagePaymentConfiguration _configuration;

    private MessagesApiDescriptiveTotalAmount total;

    private Double subtotal;

    private MessagesApiMessageDescriptiveTaxAmount tax;

    private MessagesApiMessageDescriptiveDiscountAmount discount;

    /**
     * Sets _configuration.
     *
     * @param _configuration
     * @return This {@link MessagesApiMessagePayment instance}.
     */
    public MessagesApiMessagePayment _configuration(MessagesApiMessagePaymentConfiguration _configuration) {
        this._configuration = _configuration;
        return this;
    }

    /**
     * Returns _configuration.
     *
     * @return _configuration
     */
    @JsonProperty("configuration")
    public MessagesApiMessagePaymentConfiguration getConfiguration() {
        return _configuration;
    }

    /**
     * Sets _configuration.
     *
     * @param _configuration
     */
    @JsonProperty("configuration")
    public void setConfiguration(MessagesApiMessagePaymentConfiguration _configuration) {
        this._configuration = _configuration;
    }

    /**
     * Sets total.
     *
     * @param total
     * @return This {@link MessagesApiMessagePayment instance}.
     */
    public MessagesApiMessagePayment total(MessagesApiDescriptiveTotalAmount total) {
        this.total = total;
        return this;
    }

    /**
     * Returns total.
     *
     * @return total
     */
    @JsonProperty("total")
    public MessagesApiDescriptiveTotalAmount getTotal() {
        return total;
    }

    /**
     * Sets total.
     *
     * @param total
     */
    @JsonProperty("total")
    public void setTotal(MessagesApiDescriptiveTotalAmount total) {
        this.total = total;
    }

    /**
     * Sets subtotal.
     * <p>
     * Field description:
     * (WhatsApp specific, required) Sub-total amount of the order (up to 2 decimal places). For WhatsApp it has to be multiplied by offset (100 for &#x60;INR&#x60; and &#x60;BRL&#x60;)
     *
     * @param subtotal
     * @return This {@link MessagesApiMessagePayment instance}.
     */
    public MessagesApiMessagePayment subtotal(Double subtotal) {
        this.subtotal = subtotal;
        return this;
    }

    /**
     * Returns subtotal.
     * <p>
     * Field description:
     * (WhatsApp specific, required) Sub-total amount of the order (up to 2 decimal places). For WhatsApp it has to be multiplied by offset (100 for &#x60;INR&#x60; and &#x60;BRL&#x60;)
     *
     * @return subtotal
     */
    @JsonProperty("subtotal")
    public Double getSubtotal() {
        return subtotal;
    }

    /**
     * Sets subtotal.
     * <p>
     * Field description:
     * (WhatsApp specific, required) Sub-total amount of the order (up to 2 decimal places). For WhatsApp it has to be multiplied by offset (100 for &#x60;INR&#x60; and &#x60;BRL&#x60;)
     *
     * @param subtotal
     */
    @JsonProperty("subtotal")
    public void setSubtotal(Double subtotal) {
        this.subtotal = subtotal;
    }

    /**
     * Sets tax.
     *
     * @param tax
     * @return This {@link MessagesApiMessagePayment instance}.
     */
    public MessagesApiMessagePayment tax(MessagesApiMessageDescriptiveTaxAmount tax) {
        this.tax = tax;
        return this;
    }

    /**
     * Returns tax.
     *
     * @return tax
     */
    @JsonProperty("tax")
    public MessagesApiMessageDescriptiveTaxAmount getTax() {
        return tax;
    }

    /**
     * Sets tax.
     *
     * @param tax
     */
    @JsonProperty("tax")
    public void setTax(MessagesApiMessageDescriptiveTaxAmount tax) {
        this.tax = tax;
    }

    /**
     * Sets discount.
     *
     * @param discount
     * @return This {@link MessagesApiMessagePayment instance}.
     */
    public MessagesApiMessagePayment discount(MessagesApiMessageDescriptiveDiscountAmount discount) {
        this.discount = discount;
        return this;
    }

    /**
     * Returns discount.
     *
     * @return discount
     */
    @JsonProperty("discount")
    public MessagesApiMessageDescriptiveDiscountAmount getDiscount() {
        return discount;
    }

    /**
     * Sets discount.
     *
     * @param discount
     */
    @JsonProperty("discount")
    public void setDiscount(MessagesApiMessageDescriptiveDiscountAmount discount) {
        this.discount = discount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MessagesApiMessagePayment messagesApiMessagePayment = (MessagesApiMessagePayment) o;
        return Objects.equals(this._configuration, messagesApiMessagePayment._configuration)
                && Objects.equals(this.total, messagesApiMessagePayment.total)
                && Objects.equals(this.subtotal, messagesApiMessagePayment.subtotal)
                && Objects.equals(this.tax, messagesApiMessagePayment.tax)
                && Objects.equals(this.discount, messagesApiMessagePayment.discount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(_configuration, total, subtotal, tax, discount);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class MessagesApiMessagePayment {")
                .append(newLine)
                .append("    _configuration: ")
                .append(toIndentedString(_configuration))
                .append(newLine)
                .append("    total: ")
                .append(toIndentedString(total))
                .append(newLine)
                .append("    subtotal: ")
                .append(toIndentedString(subtotal))
                .append(newLine)
                .append("    tax: ")
                .append(toIndentedString(tax))
                .append(newLine)
                .append("    discount: ")
                .append(toIndentedString(discount))
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
