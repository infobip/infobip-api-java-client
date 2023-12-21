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
 * Represents WhatsAppInteractiveOrderUPIPGPayUPaymentDetails model.
 */
public class WhatsAppInteractiveOrderUPIPGPayUPaymentDetails extends WhatsAppInteractiveOrderPaymentDetails {

    private String id;

    private WhatsAppBeneficiary beneficiary;

    private List<String> callbackData = null;

    /**
     * Constructs a new {@link WhatsAppInteractiveOrderUPIPGPayUPaymentDetails} instance.
     */
    public WhatsAppInteractiveOrderUPIPGPayUPaymentDetails() {
        super("PG_PAYU");
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
     * @return This {@link WhatsAppInteractiveOrderUPIPGPayUPaymentDetails instance}.
     */
    public WhatsAppInteractiveOrderUPIPGPayUPaymentDetails id(String id) {
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
     * @return This {@link WhatsAppInteractiveOrderUPIPGPayUPaymentDetails instance}.
     */
    public WhatsAppInteractiveOrderUPIPGPayUPaymentDetails beneficiary(WhatsAppBeneficiary beneficiary) {
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
     * Sets callbackData.
     * <p>
     * Field description:
     * List of custom parameters corresponding to the transaction.
     *
     * @param callbackData
     * @return This {@link WhatsAppInteractiveOrderUPIPGPayUPaymentDetails instance}.
     */
    public WhatsAppInteractiveOrderUPIPGPayUPaymentDetails callbackData(List<String> callbackData) {
        this.callbackData = callbackData;
        return this;
    }

    /**
     * Adds and item into callbackData.
     * <p>
     * Field description:
     * List of custom parameters corresponding to the transaction.
     *
     * @param callbackDataItem The item to be added to the list.
     * @return This {@link WhatsAppInteractiveOrderUPIPGPayUPaymentDetails instance}.
     */
    public WhatsAppInteractiveOrderUPIPGPayUPaymentDetails addCallbackDataItem(String callbackDataItem) {
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
     * List of custom parameters corresponding to the transaction.
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
     * List of custom parameters corresponding to the transaction.
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
        WhatsAppInteractiveOrderUPIPGPayUPaymentDetails whatsAppInteractiveOrderUPIPGPayUPaymentDetails =
                (WhatsAppInteractiveOrderUPIPGPayUPaymentDetails) o;
        return Objects.equals(this.id, whatsAppInteractiveOrderUPIPGPayUPaymentDetails.id)
                && Objects.equals(this.beneficiary, whatsAppInteractiveOrderUPIPGPayUPaymentDetails.beneficiary)
                && Objects.equals(this.callbackData, whatsAppInteractiveOrderUPIPGPayUPaymentDetails.callbackData)
                && super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, beneficiary, callbackData, super.hashCode());
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class WhatsAppInteractiveOrderUPIPGPayUPaymentDetails {")
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
