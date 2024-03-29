/*
 * This class is auto generated from the Infobip OpenAPI specification
 * through the OpenAPI Specification Client API libraries (Re)Generator (OSCAR),
 * powered by the OpenAPI Generator (https://openapi-generator.tech).
 *
 * Do not edit manually. To learn how to raise an issue, see the CONTRIBUTING guide
 * or contact us @ support@infobip.com.
 */

package com.infobip.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Content of the notification.
 */
public class WhatsAppWebhookPaymentNotification {

    private String from;

    private String type;

    private String referenceId;

    private String paymentId;

    /**
     * Status of the payment.
     */
    public enum PaymentStatusEnum {
        NEW("NEW"),
        PENDING("PENDING"),
        CAPTURED("CAPTURED"),
        CANCELED("CANCELED"),
        FAILED("FAILED"),
        UNKNOWN("UNKNOWN");

        private String value;

        PaymentStatusEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static PaymentStatusEnum fromValue(String value) {
            for (PaymentStatusEnum enumElement : PaymentStatusEnum.values()) {
                if (enumElement.value.equals(value)) {
                    return enumElement;
                }
            }
            throw new IllegalArgumentException("Unexpected enum value '" + value + "'.");
        }
    }

    private PaymentStatusEnum paymentStatus;

    /**
     * Currency of the payment.
     */
    public enum CurrencyEnum {
        INR("INR"),
        BRL("BRL"),
        UNKNOWN("UNKNOWN");

        private String value;

        CurrencyEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static CurrencyEnum fromValue(String value) {
            for (CurrencyEnum enumElement : CurrencyEnum.values()) {
                if (enumElement.value.equals(value)) {
                    return enumElement;
                }
            }
            throw new IllegalArgumentException("Unexpected enum value '" + value + "'.");
        }
    }

    private CurrencyEnum currency;

    private Integer totalAmountValue;

    private Integer totalAmountOffset;

    private List<String> callbackData = null;

    private List<WhatsAppWebhookPaymentTransactionNotification> transactions = null;

    /**
     * Sets from.
     * <p>
     * Field description:
     * Number of the payer.
     *
     * @param from
     * @return This {@link WhatsAppWebhookPaymentNotification instance}.
     */
    public WhatsAppWebhookPaymentNotification from(String from) {
        this.from = from;
        return this;
    }

    /**
     * Returns from.
     * <p>
     * Field description:
     * Number of the payer.
     *
     * @return from
     */
    @JsonProperty("from")
    public String getFrom() {
        return from;
    }

    /**
     * Sets from.
     * <p>
     * Field description:
     * Number of the payer.
     *
     * @param from
     */
    @JsonProperty("from")
    public void setFrom(String from) {
        this.from = from;
    }

    /**
     * Sets type.
     * <p>
     * Field description:
     * Type of the notification. It is always &#x60;payment&#x60;.
     *
     * @param type
     * @return This {@link WhatsAppWebhookPaymentNotification instance}.
     */
    public WhatsAppWebhookPaymentNotification type(String type) {
        this.type = type;
        return this;
    }

    /**
     * Returns type.
     * <p>
     * Field description:
     * Type of the notification. It is always &#x60;payment&#x60;.
     *
     * @return type
     */
    @JsonProperty("type")
    public String getType() {
        return type;
    }

    /**
     * Sets type.
     * <p>
     * Field description:
     * Type of the notification. It is always &#x60;payment&#x60;.
     *
     * @param type
     */
    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    /**
     * Sets referenceId.
     * <p>
     * Field description:
     * Unique identifier generated by the payment service provider.
     *
     * @param referenceId
     * @return This {@link WhatsAppWebhookPaymentNotification instance}.
     */
    public WhatsAppWebhookPaymentNotification referenceId(String referenceId) {
        this.referenceId = referenceId;
        return this;
    }

    /**
     * Returns referenceId.
     * <p>
     * Field description:
     * Unique identifier generated by the payment service provider.
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
     *
     * @param paymentId
     * @return This {@link WhatsAppWebhookPaymentNotification instance}.
     */
    public WhatsAppWebhookPaymentNotification paymentId(String paymentId) {
        this.paymentId = paymentId;
        return this;
    }

    /**
     * Returns paymentId.
     * <p>
     * Field description:
     * Unique identifier of the payment.
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
     * Field description:
     * Status of the payment.
     *
     * @param paymentStatus
     * @return This {@link WhatsAppWebhookPaymentNotification instance}.
     */
    public WhatsAppWebhookPaymentNotification paymentStatus(PaymentStatusEnum paymentStatus) {
        this.paymentStatus = paymentStatus;
        return this;
    }

    /**
     * Returns paymentStatus.
     * <p>
     * Field description:
     * Status of the payment.
     *
     * @return paymentStatus
     */
    @JsonProperty("paymentStatus")
    public PaymentStatusEnum getPaymentStatus() {
        return paymentStatus;
    }

    /**
     * Sets paymentStatus.
     * <p>
     * Field description:
     * Status of the payment.
     *
     * @param paymentStatus
     */
    @JsonProperty("paymentStatus")
    public void setPaymentStatus(PaymentStatusEnum paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    /**
     * Sets currency.
     * <p>
     * Field description:
     * Currency of the payment.
     *
     * @param currency
     * @return This {@link WhatsAppWebhookPaymentNotification instance}.
     */
    public WhatsAppWebhookPaymentNotification currency(CurrencyEnum currency) {
        this.currency = currency;
        return this;
    }

    /**
     * Returns currency.
     * <p>
     * Field description:
     * Currency of the payment.
     *
     * @return currency
     */
    @JsonProperty("currency")
    public CurrencyEnum getCurrency() {
        return currency;
    }

    /**
     * Sets currency.
     * <p>
     * Field description:
     * Currency of the payment.
     *
     * @param currency
     */
    @JsonProperty("currency")
    public void setCurrency(CurrencyEnum currency) {
        this.currency = currency;
    }

    /**
     * Sets totalAmountValue.
     * <p>
     * Field description:
     * Value of the payment amount multiplied by the offset.
     *
     * @param totalAmountValue
     * @return This {@link WhatsAppWebhookPaymentNotification instance}.
     */
    public WhatsAppWebhookPaymentNotification totalAmountValue(Integer totalAmountValue) {
        this.totalAmountValue = totalAmountValue;
        return this;
    }

    /**
     * Returns totalAmountValue.
     * <p>
     * Field description:
     * Value of the payment amount multiplied by the offset.
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
     * Value of the payment amount multiplied by the offset.
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
     * Offset of the payment amount (100 for INR and BRL).
     *
     * @param totalAmountOffset
     * @return This {@link WhatsAppWebhookPaymentNotification instance}.
     */
    public WhatsAppWebhookPaymentNotification totalAmountOffset(Integer totalAmountOffset) {
        this.totalAmountOffset = totalAmountOffset;
        return this;
    }

    /**
     * Returns totalAmountOffset.
     * <p>
     * Field description:
     * Offset of the payment amount (100 for INR and BRL).
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
     * Offset of the payment amount (100 for INR and BRL).
     *
     * @param totalAmountOffset
     */
    @JsonProperty("totalAmountOffset")
    public void setTotalAmountOffset(Integer totalAmountOffset) {
        this.totalAmountOffset = totalAmountOffset;
    }

    /**
     * Sets callbackData.
     * <p>
     * Field description:
     * List of custom parameters corresponding to the transaction. Available only for UPI Payments.
     *
     * @param callbackData
     * @return This {@link WhatsAppWebhookPaymentNotification instance}.
     */
    public WhatsAppWebhookPaymentNotification callbackData(List<String> callbackData) {
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
     * @return This {@link WhatsAppWebhookPaymentNotification instance}.
     */
    public WhatsAppWebhookPaymentNotification addCallbackDataItem(String callbackDataItem) {
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

    /**
     * Sets transactions.
     * <p>
     * Field description:
     * Transactions of the payment.
     *
     * @param transactions
     * @return This {@link WhatsAppWebhookPaymentNotification instance}.
     */
    public WhatsAppWebhookPaymentNotification transactions(
            List<WhatsAppWebhookPaymentTransactionNotification> transactions) {
        this.transactions = transactions;
        return this;
    }

    /**
     * Adds and item into transactions.
     * <p>
     * Field description:
     * Transactions of the payment.
     *
     * @param transactionsItem The item to be added to the list.
     * @return This {@link WhatsAppWebhookPaymentNotification instance}.
     */
    public WhatsAppWebhookPaymentNotification addTransactionsItem(
            WhatsAppWebhookPaymentTransactionNotification transactionsItem) {
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
     *
     * @return transactions
     */
    @JsonProperty("transactions")
    public List<WhatsAppWebhookPaymentTransactionNotification> getTransactions() {
        return transactions;
    }

    /**
     * Sets transactions.
     * <p>
     * Field description:
     * Transactions of the payment.
     *
     * @param transactions
     */
    @JsonProperty("transactions")
    public void setTransactions(List<WhatsAppWebhookPaymentTransactionNotification> transactions) {
        this.transactions = transactions;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WhatsAppWebhookPaymentNotification whatsAppWebhookPaymentNotification = (WhatsAppWebhookPaymentNotification) o;
        return Objects.equals(this.from, whatsAppWebhookPaymentNotification.from)
                && Objects.equals(this.type, whatsAppWebhookPaymentNotification.type)
                && Objects.equals(this.referenceId, whatsAppWebhookPaymentNotification.referenceId)
                && Objects.equals(this.paymentId, whatsAppWebhookPaymentNotification.paymentId)
                && Objects.equals(this.paymentStatus, whatsAppWebhookPaymentNotification.paymentStatus)
                && Objects.equals(this.currency, whatsAppWebhookPaymentNotification.currency)
                && Objects.equals(this.totalAmountValue, whatsAppWebhookPaymentNotification.totalAmountValue)
                && Objects.equals(this.totalAmountOffset, whatsAppWebhookPaymentNotification.totalAmountOffset)
                && Objects.equals(this.callbackData, whatsAppWebhookPaymentNotification.callbackData)
                && Objects.equals(this.transactions, whatsAppWebhookPaymentNotification.transactions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                from,
                type,
                referenceId,
                paymentId,
                paymentStatus,
                currency,
                totalAmountValue,
                totalAmountOffset,
                callbackData,
                transactions);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class WhatsAppWebhookPaymentNotification {")
                .append(newLine)
                .append("    from: ")
                .append(toIndentedString(from))
                .append(newLine)
                .append("    type: ")
                .append(toIndentedString(type))
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
                .append("    callbackData: ")
                .append(toIndentedString(callbackData))
                .append(newLine)
                .append("    transactions: ")
                .append(toIndentedString(transactions))
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
