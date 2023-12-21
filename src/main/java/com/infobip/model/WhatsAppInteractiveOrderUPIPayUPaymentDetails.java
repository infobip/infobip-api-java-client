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
 * Represents WhatsAppInteractiveOrderUPIPayUPaymentDetails model.
 */
public class WhatsAppInteractiveOrderUPIPayUPaymentDetails extends WhatsAppInteractiveOrderPaymentDetails {

    private String id;

    private String productDescription;

    private String customerFirstName;

    private String customerLastName;

    private String customerEmail;

    private List<String> callbackData = null;

    /**
     * Constructs a new {@link WhatsAppInteractiveOrderUPIPayUPaymentDetails} instance.
     */
    public WhatsAppInteractiveOrderUPIPayUPaymentDetails() {
        super("UPI_PAYU");
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
     * @return This {@link WhatsAppInteractiveOrderUPIPayUPaymentDetails instance}.
     */
    public WhatsAppInteractiveOrderUPIPayUPaymentDetails id(String id) {
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
     * Sets productDescription.
     * <p>
     * Field description:
     * Brief description of products in this order.
     * <p>
     * The field is required.
     *
     * @param productDescription
     * @return This {@link WhatsAppInteractiveOrderUPIPayUPaymentDetails instance}.
     */
    public WhatsAppInteractiveOrderUPIPayUPaymentDetails productDescription(String productDescription) {
        this.productDescription = productDescription;
        return this;
    }

    /**
     * Returns productDescription.
     * <p>
     * Field description:
     * Brief description of products in this order.
     * <p>
     * The field is required.
     *
     * @return productDescription
     */
    @JsonProperty("productDescription")
    public String getProductDescription() {
        return productDescription;
    }

    /**
     * Sets productDescription.
     * <p>
     * Field description:
     * Brief description of products in this order.
     * <p>
     * The field is required.
     *
     * @param productDescription
     */
    @JsonProperty("productDescription")
    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    /**
     * Sets customerFirstName.
     * <p>
     * Field description:
     * Customer&#39;s first name.
     * <p>
     * The field is required.
     *
     * @param customerFirstName
     * @return This {@link WhatsAppInteractiveOrderUPIPayUPaymentDetails instance}.
     */
    public WhatsAppInteractiveOrderUPIPayUPaymentDetails customerFirstName(String customerFirstName) {
        this.customerFirstName = customerFirstName;
        return this;
    }

    /**
     * Returns customerFirstName.
     * <p>
     * Field description:
     * Customer&#39;s first name.
     * <p>
     * The field is required.
     *
     * @return customerFirstName
     */
    @JsonProperty("customerFirstName")
    public String getCustomerFirstName() {
        return customerFirstName;
    }

    /**
     * Sets customerFirstName.
     * <p>
     * Field description:
     * Customer&#39;s first name.
     * <p>
     * The field is required.
     *
     * @param customerFirstName
     */
    @JsonProperty("customerFirstName")
    public void setCustomerFirstName(String customerFirstName) {
        this.customerFirstName = customerFirstName;
    }

    /**
     * Sets customerLastName.
     * <p>
     * Field description:
     * Customer&#39;s last name.
     *
     * @param customerLastName
     * @return This {@link WhatsAppInteractiveOrderUPIPayUPaymentDetails instance}.
     */
    public WhatsAppInteractiveOrderUPIPayUPaymentDetails customerLastName(String customerLastName) {
        this.customerLastName = customerLastName;
        return this;
    }

    /**
     * Returns customerLastName.
     * <p>
     * Field description:
     * Customer&#39;s last name.
     *
     * @return customerLastName
     */
    @JsonProperty("customerLastName")
    public String getCustomerLastName() {
        return customerLastName;
    }

    /**
     * Sets customerLastName.
     * <p>
     * Field description:
     * Customer&#39;s last name.
     *
     * @param customerLastName
     */
    @JsonProperty("customerLastName")
    public void setCustomerLastName(String customerLastName) {
        this.customerLastName = customerLastName;
    }

    /**
     * Sets customerEmail.
     * <p>
     * Field description:
     * Customer&#39;s email.
     * <p>
     * The field is required.
     *
     * @param customerEmail
     * @return This {@link WhatsAppInteractiveOrderUPIPayUPaymentDetails instance}.
     */
    public WhatsAppInteractiveOrderUPIPayUPaymentDetails customerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
        return this;
    }

    /**
     * Returns customerEmail.
     * <p>
     * Field description:
     * Customer&#39;s email.
     * <p>
     * The field is required.
     *
     * @return customerEmail
     */
    @JsonProperty("customerEmail")
    public String getCustomerEmail() {
        return customerEmail;
    }

    /**
     * Sets customerEmail.
     * <p>
     * Field description:
     * Customer&#39;s email.
     * <p>
     * The field is required.
     *
     * @param customerEmail
     */
    @JsonProperty("customerEmail")
    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    /**
     * Sets callbackData.
     * <p>
     * Field description:
     * List of custom parameters corresponding to the transaction.
     *
     * @param callbackData
     * @return This {@link WhatsAppInteractiveOrderUPIPayUPaymentDetails instance}.
     */
    public WhatsAppInteractiveOrderUPIPayUPaymentDetails callbackData(List<String> callbackData) {
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
     * @return This {@link WhatsAppInteractiveOrderUPIPayUPaymentDetails instance}.
     */
    public WhatsAppInteractiveOrderUPIPayUPaymentDetails addCallbackDataItem(String callbackDataItem) {
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
        WhatsAppInteractiveOrderUPIPayUPaymentDetails whatsAppInteractiveOrderUPIPayUPaymentDetails =
                (WhatsAppInteractiveOrderUPIPayUPaymentDetails) o;
        return Objects.equals(this.id, whatsAppInteractiveOrderUPIPayUPaymentDetails.id)
                && Objects.equals(
                        this.productDescription, whatsAppInteractiveOrderUPIPayUPaymentDetails.productDescription)
                && Objects.equals(
                        this.customerFirstName, whatsAppInteractiveOrderUPIPayUPaymentDetails.customerFirstName)
                && Objects.equals(this.customerLastName, whatsAppInteractiveOrderUPIPayUPaymentDetails.customerLastName)
                && Objects.equals(this.customerEmail, whatsAppInteractiveOrderUPIPayUPaymentDetails.customerEmail)
                && Objects.equals(this.callbackData, whatsAppInteractiveOrderUPIPayUPaymentDetails.callbackData)
                && super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                id,
                productDescription,
                customerFirstName,
                customerLastName,
                customerEmail,
                callbackData,
                super.hashCode());
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class WhatsAppInteractiveOrderUPIPayUPaymentDetails {")
                .append(newLine)
                .append("    ")
                .append(toIndentedString(super.toString()))
                .append(newLine)
                .append("    id: ")
                .append(toIndentedString(id))
                .append(newLine)
                .append("    productDescription: ")
                .append(toIndentedString(productDescription))
                .append(newLine)
                .append("    customerFirstName: ")
                .append(toIndentedString(customerFirstName))
                .append(newLine)
                .append("    customerLastName: ")
                .append(toIndentedString(customerLastName))
                .append(newLine)
                .append("    customerEmail: ")
                .append(toIndentedString(customerEmail))
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
