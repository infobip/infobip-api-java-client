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
 * Allows you to specify order details.
 */
public class WhatsAppInteractiveOrderDetailsActionContent {

    private WhatsAppInteractiveAllowedOrderPaymentDetails payment;

    private String paymentConfiguration;

    private WhatsAppOrderCurrency orderCurrency;

    private WhatsAppOrderType orderType;

    private WhatsAppInteractiveOrderDetailsAmount totalAmount;

    private WhatsAppInteractiveOrderDetailsOrder order;

    /**
     * Sets payment.
     * <p>
     * The field is required.
     *
     * @param payment
     * @return This {@link WhatsAppInteractiveOrderDetailsActionContent instance}.
     */
    public WhatsAppInteractiveOrderDetailsActionContent payment(WhatsAppInteractiveAllowedOrderPaymentDetails payment) {
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
     * Sets paymentConfiguration.
     * <p>
     * Field description:
     * Name of the WhatsApp payment configuration to be used for this order. Can be omitted for Brazil PIX and must be omitted for Brazil link payment.
     *
     * @param paymentConfiguration
     * @return This {@link WhatsAppInteractiveOrderDetailsActionContent instance}.
     */
    public WhatsAppInteractiveOrderDetailsActionContent paymentConfiguration(String paymentConfiguration) {
        this.paymentConfiguration = paymentConfiguration;
        return this;
    }

    /**
     * Returns paymentConfiguration.
     * <p>
     * Field description:
     * Name of the WhatsApp payment configuration to be used for this order. Can be omitted for Brazil PIX and must be omitted for Brazil link payment.
     *
     * @return paymentConfiguration
     */
    @JsonProperty("paymentConfiguration")
    public String getPaymentConfiguration() {
        return paymentConfiguration;
    }

    /**
     * Sets paymentConfiguration.
     * <p>
     * Field description:
     * Name of the WhatsApp payment configuration to be used for this order. Can be omitted for Brazil PIX and must be omitted for Brazil link payment.
     *
     * @param paymentConfiguration
     */
    @JsonProperty("paymentConfiguration")
    public void setPaymentConfiguration(String paymentConfiguration) {
        this.paymentConfiguration = paymentConfiguration;
    }

    /**
     * Sets orderCurrency.
     * <p>
     * The field is required.
     *
     * @param orderCurrency
     * @return This {@link WhatsAppInteractiveOrderDetailsActionContent instance}.
     */
    public WhatsAppInteractiveOrderDetailsActionContent orderCurrency(WhatsAppOrderCurrency orderCurrency) {
        this.orderCurrency = orderCurrency;
        return this;
    }

    /**
     * Returns orderCurrency.
     * <p>
     * The field is required.
     *
     * @return orderCurrency
     */
    @JsonProperty("orderCurrency")
    public WhatsAppOrderCurrency getOrderCurrency() {
        return orderCurrency;
    }

    /**
     * Sets orderCurrency.
     * <p>
     * The field is required.
     *
     * @param orderCurrency
     */
    @JsonProperty("orderCurrency")
    public void setOrderCurrency(WhatsAppOrderCurrency orderCurrency) {
        this.orderCurrency = orderCurrency;
    }

    /**
     * Sets orderType.
     * <p>
     * The field is required.
     *
     * @param orderType
     * @return This {@link WhatsAppInteractiveOrderDetailsActionContent instance}.
     */
    public WhatsAppInteractiveOrderDetailsActionContent orderType(WhatsAppOrderType orderType) {
        this.orderType = orderType;
        return this;
    }

    /**
     * Returns orderType.
     * <p>
     * The field is required.
     *
     * @return orderType
     */
    @JsonProperty("orderType")
    public WhatsAppOrderType getOrderType() {
        return orderType;
    }

    /**
     * Sets orderType.
     * <p>
     * The field is required.
     *
     * @param orderType
     */
    @JsonProperty("orderType")
    public void setOrderType(WhatsAppOrderType orderType) {
        this.orderType = orderType;
    }

    /**
     * Sets totalAmount.
     * <p>
     * The field is required.
     *
     * @param totalAmount
     * @return This {@link WhatsAppInteractiveOrderDetailsActionContent instance}.
     */
    public WhatsAppInteractiveOrderDetailsActionContent totalAmount(WhatsAppInteractiveOrderDetailsAmount totalAmount) {
        this.totalAmount = totalAmount;
        return this;
    }

    /**
     * Returns totalAmount.
     * <p>
     * The field is required.
     *
     * @return totalAmount
     */
    @JsonProperty("totalAmount")
    public WhatsAppInteractiveOrderDetailsAmount getTotalAmount() {
        return totalAmount;
    }

    /**
     * Sets totalAmount.
     * <p>
     * The field is required.
     *
     * @param totalAmount
     */
    @JsonProperty("totalAmount")
    public void setTotalAmount(WhatsAppInteractiveOrderDetailsAmount totalAmount) {
        this.totalAmount = totalAmount;
    }

    /**
     * Sets order.
     * <p>
     * The field is required.
     *
     * @param order
     * @return This {@link WhatsAppInteractiveOrderDetailsActionContent instance}.
     */
    public WhatsAppInteractiveOrderDetailsActionContent order(WhatsAppInteractiveOrderDetailsOrder order) {
        this.order = order;
        return this;
    }

    /**
     * Returns order.
     * <p>
     * The field is required.
     *
     * @return order
     */
    @JsonProperty("order")
    public WhatsAppInteractiveOrderDetailsOrder getOrder() {
        return order;
    }

    /**
     * Sets order.
     * <p>
     * The field is required.
     *
     * @param order
     */
    @JsonProperty("order")
    public void setOrder(WhatsAppInteractiveOrderDetailsOrder order) {
        this.order = order;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WhatsAppInteractiveOrderDetailsActionContent whatsAppInteractiveOrderDetailsActionContent =
                (WhatsAppInteractiveOrderDetailsActionContent) o;
        return Objects.equals(this.payment, whatsAppInteractiveOrderDetailsActionContent.payment)
                && Objects.equals(
                        this.paymentConfiguration, whatsAppInteractiveOrderDetailsActionContent.paymentConfiguration)
                && Objects.equals(this.orderCurrency, whatsAppInteractiveOrderDetailsActionContent.orderCurrency)
                && Objects.equals(this.orderType, whatsAppInteractiveOrderDetailsActionContent.orderType)
                && Objects.equals(this.totalAmount, whatsAppInteractiveOrderDetailsActionContent.totalAmount)
                && Objects.equals(this.order, whatsAppInteractiveOrderDetailsActionContent.order);
    }

    @Override
    public int hashCode() {
        return Objects.hash(payment, paymentConfiguration, orderCurrency, orderType, totalAmount, order);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class WhatsAppInteractiveOrderDetailsActionContent {")
                .append(newLine)
                .append("    payment: ")
                .append(toIndentedString(payment))
                .append(newLine)
                .append("    paymentConfiguration: ")
                .append(toIndentedString(paymentConfiguration))
                .append(newLine)
                .append("    orderCurrency: ")
                .append(toIndentedString(orderCurrency))
                .append(newLine)
                .append("    orderType: ")
                .append(toIndentedString(orderType))
                .append(newLine)
                .append("    totalAmount: ")
                .append(toIndentedString(totalAmount))
                .append(newLine)
                .append("    order: ")
                .append(toIndentedString(order))
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
