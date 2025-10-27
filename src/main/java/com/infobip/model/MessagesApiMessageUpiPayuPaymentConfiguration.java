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
 * Represents MessagesApiMessageUpiPayuPaymentConfiguration model.
 */
public class MessagesApiMessageUpiPayuPaymentConfiguration extends MessagesApiMessagePaymentConfiguration {

    private String id;

    private String name;

    private String productDescription;

    private String customerFirstName;

    private String customerLastName;

    private String customerEmail;

    private List<String> callbackData = null;

    /**
     * Constructs a new {@link MessagesApiMessageUpiPayuPaymentConfiguration} instance.
     */
    public MessagesApiMessageUpiPayuPaymentConfiguration() {
        super("UPI_PAYU");
    }

    /**
     * Sets id.
     * <p>
     * Field description:
     * Unique identifier of the payment.
     *
     * @param id
     * @return This {@link MessagesApiMessageUpiPayuPaymentConfiguration instance}.
     */
    public MessagesApiMessageUpiPayuPaymentConfiguration id(String id) {
        this.id = id;
        return this;
    }

    /**
     * Returns id.
     * <p>
     * Field description:
     * Unique identifier of the payment.
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
     *
     * @param id
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Sets name.
     * <p>
     * Field description:
     * Name of the WhatsApp payment configuration to be used for this order.
     *
     * @param name
     * @return This {@link MessagesApiMessageUpiPayuPaymentConfiguration instance}.
     */
    public MessagesApiMessageUpiPayuPaymentConfiguration name(String name) {
        this.name = name;
        return this;
    }

    /**
     * Returns name.
     * <p>
     * Field description:
     * Name of the WhatsApp payment configuration to be used for this order.
     *
     * @return name
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * Sets name.
     * <p>
     * Field description:
     * Name of the WhatsApp payment configuration to be used for this order.
     *
     * @param name
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Sets productDescription.
     * <p>
     * Field description:
     * Brief description of products in this order.
     *
     * @param productDescription
     * @return This {@link MessagesApiMessageUpiPayuPaymentConfiguration instance}.
     */
    public MessagesApiMessageUpiPayuPaymentConfiguration productDescription(String productDescription) {
        this.productDescription = productDescription;
        return this;
    }

    /**
     * Returns productDescription.
     * <p>
     * Field description:
     * Brief description of products in this order.
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
     *
     * @param customerFirstName
     * @return This {@link MessagesApiMessageUpiPayuPaymentConfiguration instance}.
     */
    public MessagesApiMessageUpiPayuPaymentConfiguration customerFirstName(String customerFirstName) {
        this.customerFirstName = customerFirstName;
        return this;
    }

    /**
     * Returns customerFirstName.
     * <p>
     * Field description:
     * Customer&#39;s first name.
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
     * @return This {@link MessagesApiMessageUpiPayuPaymentConfiguration instance}.
     */
    public MessagesApiMessageUpiPayuPaymentConfiguration customerLastName(String customerLastName) {
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
     *
     * @param customerEmail
     * @return This {@link MessagesApiMessageUpiPayuPaymentConfiguration instance}.
     */
    public MessagesApiMessageUpiPayuPaymentConfiguration customerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
        return this;
    }

    /**
     * Returns customerEmail.
     * <p>
     * Field description:
     * Customer&#39;s email.
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
     * @return This {@link MessagesApiMessageUpiPayuPaymentConfiguration instance}.
     */
    public MessagesApiMessageUpiPayuPaymentConfiguration callbackData(List<String> callbackData) {
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
     * @return This {@link MessagesApiMessageUpiPayuPaymentConfiguration instance}.
     */
    public MessagesApiMessageUpiPayuPaymentConfiguration addCallbackDataItem(String callbackDataItem) {
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
        MessagesApiMessageUpiPayuPaymentConfiguration messagesApiMessageUpiPayuPaymentConfiguration =
                (MessagesApiMessageUpiPayuPaymentConfiguration) o;
        return Objects.equals(this.id, messagesApiMessageUpiPayuPaymentConfiguration.id)
                && Objects.equals(this.name, messagesApiMessageUpiPayuPaymentConfiguration.name)
                && Objects.equals(
                        this.productDescription, messagesApiMessageUpiPayuPaymentConfiguration.productDescription)
                && Objects.equals(
                        this.customerFirstName, messagesApiMessageUpiPayuPaymentConfiguration.customerFirstName)
                && Objects.equals(this.customerLastName, messagesApiMessageUpiPayuPaymentConfiguration.customerLastName)
                && Objects.equals(this.customerEmail, messagesApiMessageUpiPayuPaymentConfiguration.customerEmail)
                && Objects.equals(this.callbackData, messagesApiMessageUpiPayuPaymentConfiguration.callbackData)
                && super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                id,
                name,
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
                .append("class MessagesApiMessageUpiPayuPaymentConfiguration {")
                .append(newLine)
                .append("    ")
                .append(toIndentedString(super.toString()))
                .append(newLine)
                .append("    id: ")
                .append(toIndentedString(id))
                .append(newLine)
                .append("    name: ")
                .append(toIndentedString(name))
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
