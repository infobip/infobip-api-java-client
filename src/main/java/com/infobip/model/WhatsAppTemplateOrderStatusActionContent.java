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
 * Represents WhatsAppTemplateOrderStatusActionContent model.
 */
public class WhatsAppTemplateOrderStatusActionContent extends WhatsAppOrderStatusContent {

    private WhatsAppInteractiveAllowedOrderPaymentDetails payment;

    private WhatsAppOrderStatus status;

    private String description;

    /**
     * Constructs a new {@link WhatsAppTemplateOrderStatusActionContent} instance.
     */
    public WhatsAppTemplateOrderStatusActionContent() {
        super("ORDER_STATUS");
    }

    /**
     * Sets payment.
     * <p>
     * The field is required.
     *
     * @param payment
     * @return This {@link WhatsAppTemplateOrderStatusActionContent instance}.
     */
    public WhatsAppTemplateOrderStatusActionContent payment(WhatsAppInteractiveAllowedOrderPaymentDetails payment) {
        this.payment = payment;
        return this;
    }

    /**
     * Returns payment.
     * <p>
     * The field is required.
     *
     * @return payment
     */
    @JsonProperty("payment")
    public WhatsAppInteractiveAllowedOrderPaymentDetails getPayment() {
        return payment;
    }

    /**
     * Sets payment.
     * <p>
     * The field is required.
     *
     * @param payment
     */
    @JsonProperty("payment")
    public void setPayment(WhatsAppInteractiveAllowedOrderPaymentDetails payment) {
        this.payment = payment;
    }

    /**
     * Sets status.
     * <p>
     * The field is required.
     *
     * @param status
     * @return This {@link WhatsAppTemplateOrderStatusActionContent instance}.
     */
    public WhatsAppTemplateOrderStatusActionContent status(WhatsAppOrderStatus status) {
        this.status = status;
        return this;
    }

    /**
     * Returns status.
     * <p>
     * The field is required.
     *
     * @return status
     */
    @JsonProperty("status")
    public WhatsAppOrderStatus getStatus() {
        return status;
    }

    /**
     * Sets status.
     * <p>
     * The field is required.
     *
     * @param status
     */
    @JsonProperty("status")
    public void setStatus(WhatsAppOrderStatus status) {
        this.status = status;
    }

    /**
     * Sets description.
     * <p>
     * Field description:
     * Description of the order status.
     *
     * @param description
     * @return This {@link WhatsAppTemplateOrderStatusActionContent instance}.
     */
    public WhatsAppTemplateOrderStatusActionContent description(String description) {
        this.description = description;
        return this;
    }

    /**
     * Returns description.
     * <p>
     * Field description:
     * Description of the order status.
     *
     * @return description
     */
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    /**
     * Sets description.
     * <p>
     * Field description:
     * Description of the order status.
     *
     * @param description
     */
    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WhatsAppTemplateOrderStatusActionContent whatsAppTemplateOrderStatusActionContent =
                (WhatsAppTemplateOrderStatusActionContent) o;
        return Objects.equals(this.payment, whatsAppTemplateOrderStatusActionContent.payment)
                && Objects.equals(this.status, whatsAppTemplateOrderStatusActionContent.status)
                && Objects.equals(this.description, whatsAppTemplateOrderStatusActionContent.description)
                && super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(payment, status, description, super.hashCode());
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class WhatsAppTemplateOrderStatusActionContent {")
                .append(newLine)
                .append("    ")
                .append(toIndentedString(super.toString()))
                .append(newLine)
                .append("    payment: ")
                .append(toIndentedString(payment))
                .append(newLine)
                .append("    status: ")
                .append(toIndentedString(status))
                .append(newLine)
                .append("    description: ")
                .append(toIndentedString(description))
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
