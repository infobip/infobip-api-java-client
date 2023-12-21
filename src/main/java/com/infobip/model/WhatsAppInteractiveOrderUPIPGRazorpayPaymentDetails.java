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
 * Represents WhatsAppInteractiveOrderUPIPGRazorpayPaymentDetails model.
 */
public class WhatsAppInteractiveOrderUPIPGRazorpayPaymentDetails extends WhatsAppInteractiveOrderPaymentDetails {

    private String id;

    private WhatsAppBeneficiary beneficiary;

    /**
     * Constructs a new {@link WhatsAppInteractiveOrderUPIPGRazorpayPaymentDetails} instance.
     */
    public WhatsAppInteractiveOrderUPIPGRazorpayPaymentDetails() {
        super("PG_RAZORPAY");
    }

    /**
     * Sets id.
     * <p>
     * Field description:
     * Unique identifier of the payment.
     * <p>
     * The field is required.
     *
     * @param id
     * @return This {@link WhatsAppInteractiveOrderUPIPGRazorpayPaymentDetails instance}.
     */
    public WhatsAppInteractiveOrderUPIPGRazorpayPaymentDetails id(String id) {
        this.id = id;
        return this;
    }

    /**
     * Returns id.
     * <p>
     * Field description:
     * Unique identifier of the payment.
     * <p>
     * The field is required.
     *
     * @return id
     */
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    /**
     * Sets id.
     * <p>
     * Field description:
     * Unique identifier of the payment.
     * <p>
     * The field is required.
     *
     * @param id
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Sets beneficiary.
     *
     * @param beneficiary
     * @return This {@link WhatsAppInteractiveOrderUPIPGRazorpayPaymentDetails instance}.
     */
    public WhatsAppInteractiveOrderUPIPGRazorpayPaymentDetails beneficiary(WhatsAppBeneficiary beneficiary) {
        this.beneficiary = beneficiary;
        return this;
    }

    /**
     * Returns beneficiary.
     *
     * @return beneficiary
     */
    @JsonProperty("beneficiary")
    public WhatsAppBeneficiary getBeneficiary() {
        return beneficiary;
    }

    /**
     * Sets beneficiary.
     *
     * @param beneficiary
     */
    @JsonProperty("beneficiary")
    public void setBeneficiary(WhatsAppBeneficiary beneficiary) {
        this.beneficiary = beneficiary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WhatsAppInteractiveOrderUPIPGRazorpayPaymentDetails whatsAppInteractiveOrderUPIPGRazorpayPaymentDetails =
                (WhatsAppInteractiveOrderUPIPGRazorpayPaymentDetails) o;
        return Objects.equals(this.id, whatsAppInteractiveOrderUPIPGRazorpayPaymentDetails.id)
                && Objects.equals(this.beneficiary, whatsAppInteractiveOrderUPIPGRazorpayPaymentDetails.beneficiary)
                && super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, beneficiary, super.hashCode());
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class WhatsAppInteractiveOrderUPIPGRazorpayPaymentDetails {")
                .append(newLine)
                .append("    ")
                .append(toIndentedString(super.toString()))
                .append(newLine)
                .append("    id: ")
                .append(toIndentedString(id))
                .append(newLine)
                .append("    beneficiary: ")
                .append(toIndentedString(beneficiary))
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
