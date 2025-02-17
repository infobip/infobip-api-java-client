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
 * Represents WhatsAppWebhookPaymentConfirmationContent model.
 */
public class WhatsAppWebhookPaymentConfirmationContent extends WhatsAppWebhookInboundMessage {

    private String referenceId;

    private String paymentId;

    private WhatsAppPaymentTransactionStatus status;

    private WhatsAppPaymentCurrency currency;

    private WhatsAppWebhookPaymentAmount totalAmount;

    private String transactionId;

    private WhatsAppPaymentTransactionType transactionType;

    /**
     * Constructs a new {@link WhatsAppWebhookPaymentConfirmationContent} instance.
     */
    public WhatsAppWebhookPaymentConfirmationContent() {
        super("INTERACTIVE_PAYMENT_CONFIRMATION");
    }

    /**
     * Sets referenceId.
     * <p>
     * Field description:
     * Unique identifier generated by the payment service provider.
     * <p>
     * The field is required.
     *
     * @param referenceId
     * @return This {@link WhatsAppWebhookPaymentConfirmationContent instance}.
     */
    public WhatsAppWebhookPaymentConfirmationContent referenceId(String referenceId) {
        this.referenceId = referenceId;
        return this;
    }

    /**
     * Returns referenceId.
     * <p>
     * Field description:
     * Unique identifier generated by the payment service provider.
     * <p>
     * The field is required.
     *
     * @return referenceId
     */
    @JsonProperty("referenceId")
    public String getReferenceId() {
        return referenceId;
    }

    /**
     * Sets referenceId.
     * <p>
     * Field description:
     * Unique identifier generated by the payment service provider.
     * <p>
     * The field is required.
     *
     * @param referenceId
     */
    @JsonProperty("referenceId")
    public void setReferenceId(String referenceId) {
        this.referenceId = referenceId;
    }

    /**
     * Sets paymentId.
     * <p>
     * Field description:
     * Unique identifier of the payment.
     * <p>
     * The field is required.
     *
     * @param paymentId
     * @return This {@link WhatsAppWebhookPaymentConfirmationContent instance}.
     */
    public WhatsAppWebhookPaymentConfirmationContent paymentId(String paymentId) {
        this.paymentId = paymentId;
        return this;
    }

    /**
     * Returns paymentId.
     * <p>
     * Field description:
     * Unique identifier of the payment.
     * <p>
     * The field is required.
     *
     * @return paymentId
     */
    @JsonProperty("paymentId")
    public String getPaymentId() {
        return paymentId;
    }

    /**
     * Sets paymentId.
     * <p>
     * Field description:
     * Unique identifier of the payment.
     * <p>
     * The field is required.
     *
     * @param paymentId
     */
    @JsonProperty("paymentId")
    public void setPaymentId(String paymentId) {
        this.paymentId = paymentId;
    }

    /**
     * Sets status.
     * <p>
     * The field is required.
     *
     * @param status
     * @return This {@link WhatsAppWebhookPaymentConfirmationContent instance}.
     */
    public WhatsAppWebhookPaymentConfirmationContent status(WhatsAppPaymentTransactionStatus status) {
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
    public WhatsAppPaymentTransactionStatus getStatus() {
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
    public void setStatus(WhatsAppPaymentTransactionStatus status) {
        this.status = status;
    }

    /**
     * Sets currency.
     * <p>
     * The field is required.
     *
     * @param currency
     * @return This {@link WhatsAppWebhookPaymentConfirmationContent instance}.
     */
    public WhatsAppWebhookPaymentConfirmationContent currency(WhatsAppPaymentCurrency currency) {
        this.currency = currency;
        return this;
    }

    /**
     * Returns currency.
     * <p>
     * The field is required.
     *
     * @return currency
     */
    @JsonProperty("currency")
    public WhatsAppPaymentCurrency getCurrency() {
        return currency;
    }

    /**
     * Sets currency.
     * <p>
     * The field is required.
     *
     * @param currency
     */
    @JsonProperty("currency")
    public void setCurrency(WhatsAppPaymentCurrency currency) {
        this.currency = currency;
    }

    /**
     * Sets totalAmount.
     * <p>
     * The field is required.
     *
     * @param totalAmount
     * @return This {@link WhatsAppWebhookPaymentConfirmationContent instance}.
     */
    public WhatsAppWebhookPaymentConfirmationContent totalAmount(WhatsAppWebhookPaymentAmount totalAmount) {
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
    public WhatsAppWebhookPaymentAmount getTotalAmount() {
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
    public void setTotalAmount(WhatsAppWebhookPaymentAmount totalAmount) {
        this.totalAmount = totalAmount;
    }

    /**
     * Sets transactionId.
     * <p>
     * Field description:
     * Unique identifier of the transaction.
     * <p>
     * The field is required.
     *
     * @param transactionId
     * @return This {@link WhatsAppWebhookPaymentConfirmationContent instance}.
     */
    public WhatsAppWebhookPaymentConfirmationContent transactionId(String transactionId) {
        this.transactionId = transactionId;
        return this;
    }

    /**
     * Returns transactionId.
     * <p>
     * Field description:
     * Unique identifier of the transaction.
     * <p>
     * The field is required.
     *
     * @return transactionId
     */
    @JsonProperty("transactionId")
    public String getTransactionId() {
        return transactionId;
    }

    /**
     * Sets transactionId.
     * <p>
     * Field description:
     * Unique identifier of the transaction.
     * <p>
     * The field is required.
     *
     * @param transactionId
     */
    @JsonProperty("transactionId")
    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    /**
     * Sets transactionType.
     * <p>
     * The field is required.
     *
     * @param transactionType
     * @return This {@link WhatsAppWebhookPaymentConfirmationContent instance}.
     */
    public WhatsAppWebhookPaymentConfirmationContent transactionType(WhatsAppPaymentTransactionType transactionType) {
        this.transactionType = transactionType;
        return this;
    }

    /**
     * Returns transactionType.
     * <p>
     * The field is required.
     *
     * @return transactionType
     */
    @JsonProperty("transactionType")
    public WhatsAppPaymentTransactionType getTransactionType() {
        return transactionType;
    }

    /**
     * Sets transactionType.
     * <p>
     * The field is required.
     *
     * @param transactionType
     */
    @JsonProperty("transactionType")
    public void setTransactionType(WhatsAppPaymentTransactionType transactionType) {
        this.transactionType = transactionType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WhatsAppWebhookPaymentConfirmationContent whatsAppWebhookPaymentConfirmationContent =
                (WhatsAppWebhookPaymentConfirmationContent) o;
        return Objects.equals(this.referenceId, whatsAppWebhookPaymentConfirmationContent.referenceId)
                && Objects.equals(this.paymentId, whatsAppWebhookPaymentConfirmationContent.paymentId)
                && Objects.equals(this.status, whatsAppWebhookPaymentConfirmationContent.status)
                && Objects.equals(this.currency, whatsAppWebhookPaymentConfirmationContent.currency)
                && Objects.equals(this.totalAmount, whatsAppWebhookPaymentConfirmationContent.totalAmount)
                && Objects.equals(this.transactionId, whatsAppWebhookPaymentConfirmationContent.transactionId)
                && Objects.equals(this.transactionType, whatsAppWebhookPaymentConfirmationContent.transactionType)
                && super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                referenceId,
                paymentId,
                status,
                currency,
                totalAmount,
                transactionId,
                transactionType,
                super.hashCode());
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class WhatsAppWebhookPaymentConfirmationContent {")
                .append(newLine)
                .append("    ")
                .append(toIndentedString(super.toString()))
                .append(newLine)
                .append("    referenceId: ")
                .append(toIndentedString(referenceId))
                .append(newLine)
                .append("    paymentId: ")
                .append(toIndentedString(paymentId))
                .append(newLine)
                .append("    status: ")
                .append(toIndentedString(status))
                .append(newLine)
                .append("    currency: ")
                .append(toIndentedString(currency))
                .append(newLine)
                .append("    totalAmount: ")
                .append(toIndentedString(totalAmount))
                .append(newLine)
                .append("    transactionId: ")
                .append(toIndentedString(transactionId))
                .append(newLine)
                .append("    transactionType: ")
                .append(toIndentedString(transactionType))
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
