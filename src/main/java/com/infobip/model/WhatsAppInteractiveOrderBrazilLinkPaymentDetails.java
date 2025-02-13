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
 * Represents WhatsAppInteractiveOrderBrazilLinkPaymentDetails model.
 */
public class WhatsAppInteractiveOrderBrazilLinkPaymentDetails extends WhatsAppTemplateAllowedOrderPaymentDetails {

    private String id;

    private String paymentLink;

    /**
     * Constructs a new {@link WhatsAppInteractiveOrderBrazilLinkPaymentDetails} instance.
     */
    public WhatsAppInteractiveOrderBrazilLinkPaymentDetails() {
        super("BRAZIL_LINK");
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
     * @return This {@link WhatsAppInteractiveOrderBrazilLinkPaymentDetails instance}.
     */
    public WhatsAppInteractiveOrderBrazilLinkPaymentDetails id(String id) {
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
     * Sets paymentLink.
     * <p>
     * Field description:
     * Payment link.
     * <p>
     * The field is required.
     *
     * @param paymentLink
     * @return This {@link WhatsAppInteractiveOrderBrazilLinkPaymentDetails instance}.
     */
    public WhatsAppInteractiveOrderBrazilLinkPaymentDetails paymentLink(String paymentLink) {
        this.paymentLink = paymentLink;
        return this;
    }

    /**
     * Returns paymentLink.
     * <p>
     * Field description:
     * Payment link.
     * <p>
     * The field is required.
     *
     * @return paymentLink
     */
    @JsonProperty("paymentLink")
    public String getPaymentLink() {
        return paymentLink;
    }

    /**
     * Sets paymentLink.
     * <p>
     * Field description:
     * Payment link.
     * <p>
     * The field is required.
     *
     * @param paymentLink
     */
    @JsonProperty("paymentLink")
    public void setPaymentLink(String paymentLink) {
        this.paymentLink = paymentLink;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WhatsAppInteractiveOrderBrazilLinkPaymentDetails whatsAppInteractiveOrderBrazilLinkPaymentDetails =
                (WhatsAppInteractiveOrderBrazilLinkPaymentDetails) o;
        return Objects.equals(this.id, whatsAppInteractiveOrderBrazilLinkPaymentDetails.id)
                && Objects.equals(this.paymentLink, whatsAppInteractiveOrderBrazilLinkPaymentDetails.paymentLink)
                && super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, paymentLink, super.hashCode());
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class WhatsAppInteractiveOrderBrazilLinkPaymentDetails {")
                .append(newLine)
                .append("    ")
                .append(toIndentedString(super.toString()))
                .append(newLine)
                .append("    id: ")
                .append(toIndentedString(id))
                .append(newLine)
                .append("    paymentLink: ")
                .append(toIndentedString(paymentLink))
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
