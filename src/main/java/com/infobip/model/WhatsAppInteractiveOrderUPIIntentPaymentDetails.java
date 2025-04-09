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
 * Represents WhatsAppInteractiveOrderUPIIntentPaymentDetails model.
 */
public class WhatsAppInteractiveOrderUPIIntentPaymentDetails extends WhatsAppInteractiveAllowedOrderPaymentDetails {

    private String id;

    private WhatsAppBeneficiary beneficiary;

    private WhatsAppUPIIntentPaymentFormat format;

    /**
     * Constructs a new {@link WhatsAppInteractiveOrderUPIIntentPaymentDetails} instance.
     */
    public WhatsAppInteractiveOrderUPIIntentPaymentDetails() {
        super("UPI_INTENT");
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
     * @return This {@link WhatsAppInteractiveOrderUPIIntentPaymentDetails instance}.
     */
    public WhatsAppInteractiveOrderUPIIntentPaymentDetails id(String id) {
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
     * @return This {@link WhatsAppInteractiveOrderUPIIntentPaymentDetails instance}.
     */
    public WhatsAppInteractiveOrderUPIIntentPaymentDetails beneficiary(WhatsAppBeneficiary beneficiary) {
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

    /**
     * Sets format.
     * <p>
     * The field is required.
     *
     * @param format
     * @return This {@link WhatsAppInteractiveOrderUPIIntentPaymentDetails instance}.
     */
    public WhatsAppInteractiveOrderUPIIntentPaymentDetails format(WhatsAppUPIIntentPaymentFormat format) {
        this.format = format;
        return this;
    }

    /**
     * Returns format.
     * <p>
     * The field is required.
     *
     * @return format
     */
    @JsonProperty("format")
    public WhatsAppUPIIntentPaymentFormat getFormat() {
        return format;
    }

    /**
     * Sets format.
     * <p>
     * The field is required.
     *
     * @param format
     */
    @JsonProperty("format")
    public void setFormat(WhatsAppUPIIntentPaymentFormat format) {
        this.format = format;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WhatsAppInteractiveOrderUPIIntentPaymentDetails whatsAppInteractiveOrderUPIIntentPaymentDetails =
                (WhatsAppInteractiveOrderUPIIntentPaymentDetails) o;
        return Objects.equals(this.id, whatsAppInteractiveOrderUPIIntentPaymentDetails.id)
                && Objects.equals(this.beneficiary, whatsAppInteractiveOrderUPIIntentPaymentDetails.beneficiary)
                && Objects.equals(this.format, whatsAppInteractiveOrderUPIIntentPaymentDetails.format)
                && super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, beneficiary, format, super.hashCode());
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class WhatsAppInteractiveOrderUPIIntentPaymentDetails {")
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
                .append("    format: ")
                .append(toIndentedString(format))
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
