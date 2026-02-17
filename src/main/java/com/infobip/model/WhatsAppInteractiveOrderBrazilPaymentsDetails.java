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
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Represents WhatsAppInteractiveOrderBrazilPaymentsDetails model.
 */
public class WhatsAppInteractiveOrderBrazilPaymentsDetails extends WhatsAppInteractiveAllowedOrderPaymentDetails {

    private List<WhatsAppInteractiveAllowedOrderPaymentDetails> payments = new ArrayList<>();

    /**
     * Constructs a new {@link WhatsAppInteractiveOrderBrazilPaymentsDetails} instance.
     */
    public WhatsAppInteractiveOrderBrazilPaymentsDetails() {
        super("BRAZIL_PAYMENTS");
    }

    /**
     * Sets payments.
     * <p>
     * Field description:
     * List of payments. Each payment must have same ID. Maximum 2 payments allowed.
     * <p>
     * The field is required.
     *
     * @param payments
     * @return This {@link WhatsAppInteractiveOrderBrazilPaymentsDetails instance}.
     */
    public WhatsAppInteractiveOrderBrazilPaymentsDetails payments(
            List<WhatsAppInteractiveAllowedOrderPaymentDetails> payments) {
        this.payments = payments;
        return this;
    }

    /**
     * Adds and item into payments.
     * <p>
     * Field description:
     * List of payments. Each payment must have same ID. Maximum 2 payments allowed.
     * <p>
     * The field is required.
     *
     * @param paymentsItem The item to be added to the list.
     * @return This {@link WhatsAppInteractiveOrderBrazilPaymentsDetails instance}.
     */
    public WhatsAppInteractiveOrderBrazilPaymentsDetails addPaymentsItem(
            WhatsAppInteractiveAllowedOrderPaymentDetails paymentsItem) {
        if (this.payments == null) {
            this.payments = new ArrayList<>();
        }
        this.payments.add(paymentsItem);
        return this;
    }

    /**
     * Returns payments.
     * <p>
     * Field description:
     * List of payments. Each payment must have same ID. Maximum 2 payments allowed.
     * <p>
     * The field is required.
     *
     * @return payments
     */
    @JsonProperty("payments")
    public List<WhatsAppInteractiveAllowedOrderPaymentDetails> getPayments() {
        return payments;
    }

    /**
     * Sets payments.
     * <p>
     * Field description:
     * List of payments. Each payment must have same ID. Maximum 2 payments allowed.
     * <p>
     * The field is required.
     *
     * @param payments
     */
    @JsonProperty("payments")
    public void setPayments(List<WhatsAppInteractiveAllowedOrderPaymentDetails> payments) {
        this.payments = payments;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WhatsAppInteractiveOrderBrazilPaymentsDetails whatsAppInteractiveOrderBrazilPaymentsDetails =
                (WhatsAppInteractiveOrderBrazilPaymentsDetails) o;
        return Objects.equals(this.payments, whatsAppInteractiveOrderBrazilPaymentsDetails.payments) && super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(payments, super.hashCode());
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class WhatsAppInteractiveOrderBrazilPaymentsDetails {")
                .append(newLine)
                .append("    ")
                .append(toIndentedString(super.toString()))
                .append(newLine)
                .append("    payments: ")
                .append(toIndentedString(payments))
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
