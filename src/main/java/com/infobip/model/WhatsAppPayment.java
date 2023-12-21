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
 * Represents WhatsAppPayment model.
 */
public class WhatsAppPayment {

    private String referenceId;

    private String paymentId;

    private WhatsAppPaymentStatus paymentStatus;

    private WhatsAppPaymentCurrency currency;

    private Integer totalAmountValue;

    private Integer totalAmountOffset;

    private List<WhatsAppPaymentTransaction> transactions = new ArrayList<>();

    private List<String> callbackData = null;

    /**
     * Sets referenceId.
     * <p>
     * Field description:
     * Unique identifier generated by the payment service provider.
     * <p>
     * The field is required.
     *
     * @param referenceId
     * @return This {@link WhatsAppPayment instance}.
     */
    public WhatsAppPayment referenceId(String referenceId) {
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
     * @return This {@link WhatsAppPayment instance}.
     */
    public WhatsAppPayment paymentId(String paymentId) {
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
     * Sets paymentStatus.
     * <p>
     * The field is required.
     *
     * @param paymentStatus
     * @return This {@link WhatsAppPayment instance}.
     */
    public WhatsAppPayment paymentStatus(WhatsAppPaymentStatus paymentStatus) {
        this.paymentStatus = paymentStatus;
        return this;
    }

    /**
     * Returns paymentStatus.
     * <p>
     * The field is required.
     *
     * @return paymentStatus
     */
    @JsonProperty("paymentStatus")
    public WhatsAppPaymentStatus getPaymentStatus() {
        return paymentStatus;
    }

    /**
     * Sets paymentStatus.
     * <p>
     * The field is required.
     *
     * @param paymentStatus
     */
    @JsonProperty("paymentStatus")
    public void setPaymentStatus(WhatsAppPaymentStatus paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    /**
     * Sets currency.
     * <p>
     * The field is required.
     *
     * @param currency
     * @return This {@link WhatsAppPayment instance}.
     */
    public WhatsAppPayment currency(WhatsAppPaymentCurrency currency) {
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
     * Sets totalAmountValue.
     * <p>
     * Field description:
     * Value of the payment amount.
     * <p>
     * The field is required.
     *
     * @param totalAmountValue
     * @return This {@link WhatsAppPayment instance}.
     */
    public WhatsAppPayment totalAmountValue(Integer totalAmountValue) {
        this.totalAmountValue = totalAmountValue;
        return this;
    }

    /**
     * Returns totalAmountValue.
     * <p>
     * Field description:
     * Value of the payment amount.
     * <p>
     * The field is required.
     *
     * @return totalAmountValue
     */
    @JsonProperty("totalAmountValue")
    public Integer getTotalAmountValue() {
        return totalAmountValue;
    }

    /**
     * Sets totalAmountValue.
     * <p>
     * Field description:
     * Value of the payment amount.
     * <p>
     * The field is required.
     *
     * @param totalAmountValue
     */
    @JsonProperty("totalAmountValue")
    public void setTotalAmountValue(Integer totalAmountValue) {
        this.totalAmountValue = totalAmountValue;
    }

    /**
     * Sets totalAmountOffset.
     * <p>
     * Field description:
     * Offset of the payment amount.
     * <p>
     * The field is required.
     *
     * @param totalAmountOffset
     * @return This {@link WhatsAppPayment instance}.
     */
    public WhatsAppPayment totalAmountOffset(Integer totalAmountOffset) {
        this.totalAmountOffset = totalAmountOffset;
        return this;
    }

    /**
     * Returns totalAmountOffset.
     * <p>
     * Field description:
     * Offset of the payment amount.
     * <p>
     * The field is required.
     *
     * @return totalAmountOffset
     */
    @JsonProperty("totalAmountOffset")
    public Integer getTotalAmountOffset() {
        return totalAmountOffset;
    }

    /**
     * Sets totalAmountOffset.
     * <p>
     * Field description:
     * Offset of the payment amount.
     * <p>
     * The field is required.
     *
     * @param totalAmountOffset
     */
    @JsonProperty("totalAmountOffset")
    public void setTotalAmountOffset(Integer totalAmountOffset) {
        this.totalAmountOffset = totalAmountOffset;
    }

    /**
     * Sets transactions.
     * <p>
     * Field description:
     * Transactions of the payment.
     * <p>
     * The field is required.
     *
     * @param transactions
     * @return This {@link WhatsAppPayment instance}.
     */
    public WhatsAppPayment transactions(List<WhatsAppPaymentTransaction> transactions) {
        this.transactions = transactions;
        return this;
    }

    /**
     * Adds and item into transactions.
     * <p>
     * Field description:
     * Transactions of the payment.
     * <p>
     * The field is required.
     *
     * @param transactionsItem The item to be added to the list.
     * @return This {@link WhatsAppPayment instance}.
     */
    public WhatsAppPayment addTransactionsItem(WhatsAppPaymentTransaction transactionsItem) {
        if (this.transactions == null) {
            this.transactions = new ArrayList<>();
        }
        this.transactions.add(transactionsItem);
        return this;
    }

    /**
     * Returns transactions.
     * <p>
     * Field description:
     * Transactions of the payment.
     * <p>
     * The field is required.
     *
     * @return transactions
     */
    @JsonProperty("transactions")
    public List<WhatsAppPaymentTransaction> getTransactions() {
        return transactions;
    }

    /**
     * Sets transactions.
     * <p>
     * Field description:
     * Transactions of the payment.
     * <p>
     * The field is required.
     *
     * @param transactions
     */
    @JsonProperty("transactions")
    public void setTransactions(List<WhatsAppPaymentTransaction> transactions) {
        this.transactions = transactions;
    }

    /**
     * Sets callbackData.
     * <p>
     * Field description:
     * List of custom parameters corresponding to the transaction. Available only for UPI Payments.
     *
     * @param callbackData
     * @return This {@link WhatsAppPayment instance}.
     */
    public WhatsAppPayment callbackData(List<String> callbackData) {
        this.callbackData = callbackData;
        return this;
    }

    /**
     * Adds and item into callbackData.
     * <p>
     * Field description:
     * List of custom parameters corresponding to the transaction. Available only for UPI Payments.
     *
     * @param callbackDataItem The item to be added to the list.
     * @return This {@link WhatsAppPayment instance}.
     */
    public WhatsAppPayment addCallbackDataItem(String callbackDataItem) {
        if (this.callbackData == null) {
            this.callbackData = new ArrayList<>();
        }
        this.callbackData.add(callbackDataItem);
        return this;
    }

    /**
     * Returns callbackData.
     * <p>
     * Field description:
     * List of custom parameters corresponding to the transaction. Available only for UPI Payments.
     *
     * @return callbackData
     */
    @JsonProperty("callbackData")
    public List<String> getCallbackData() {
        return callbackData;
    }

    /**
     * Sets callbackData.
     * <p>
     * Field description:
     * List of custom parameters corresponding to the transaction. Available only for UPI Payments.
     *
     * @param callbackData
     */
    @JsonProperty("callbackData")
    public void setCallbackData(List<String> callbackData) {
        this.callbackData = callbackData;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WhatsAppPayment whatsAppPayment = (WhatsAppPayment) o;
        return Objects.equals(this.referenceId, whatsAppPayment.referenceId)
                && Objects.equals(this.paymentId, whatsAppPayment.paymentId)
                && Objects.equals(this.paymentStatus, whatsAppPayment.paymentStatus)
                && Objects.equals(this.currency, whatsAppPayment.currency)
                && Objects.equals(this.totalAmountValue, whatsAppPayment.totalAmountValue)
                && Objects.equals(this.totalAmountOffset, whatsAppPayment.totalAmountOffset)
                && Objects.equals(this.transactions, whatsAppPayment.transactions)
                && Objects.equals(this.callbackData, whatsAppPayment.callbackData);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                referenceId,
                paymentId,
                paymentStatus,
                currency,
                totalAmountValue,
                totalAmountOffset,
                transactions,
                callbackData);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class WhatsAppPayment {")
                .append(newLine)
                .append("    referenceId: ")
                .append(toIndentedString(referenceId))
                .append(newLine)
                .append("    paymentId: ")
                .append(toIndentedString(paymentId))
                .append(newLine)
                .append("    paymentStatus: ")
                .append(toIndentedString(paymentStatus))
                .append(newLine)
                .append("    currency: ")
                .append(toIndentedString(currency))
                .append(newLine)
                .append("    totalAmountValue: ")
                .append(toIndentedString(totalAmountValue))
                .append(newLine)
                .append("    totalAmountOffset: ")
                .append(toIndentedString(totalAmountOffset))
                .append(newLine)
                .append("    transactions: ")
                .append(toIndentedString(transactions))
                .append(newLine)
                .append("    callbackData: ")
                .append(toIndentedString(callbackData))
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