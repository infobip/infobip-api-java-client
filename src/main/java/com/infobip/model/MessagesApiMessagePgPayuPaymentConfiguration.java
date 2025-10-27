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
 * Represents MessagesApiMessagePgPayuPaymentConfiguration model.
 */
public class MessagesApiMessagePgPayuPaymentConfiguration extends MessagesApiMessagePaymentConfiguration {

    private String id;

    private String name;

    private MessagesApiMessagePaymentBeneficiary beneficiary;

    private List<String> callbackData = null;

    /**
     * Constructs a new {@link MessagesApiMessagePgPayuPaymentConfiguration} instance.
     */
    public MessagesApiMessagePgPayuPaymentConfiguration() {
        super("PG_PAYU");
    }

    /**
     * Sets id.
     * <p>
     * Field description:
     * Unique identifier of the payment. It can only contain English letters, numbers, underscores, dashes, or dots, and should not exceed 35 characters
     *
     * @param id
     * @return This {@link MessagesApiMessagePgPayuPaymentConfiguration instance}.
     */
    public MessagesApiMessagePgPayuPaymentConfiguration id(String id) {
        this.id = id;
        return this;
    }

    /**
     * Returns id.
     * <p>
     * Field description:
     * Unique identifier of the payment. It can only contain English letters, numbers, underscores, dashes, or dots, and should not exceed 35 characters
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
     * Unique identifier of the payment. It can only contain English letters, numbers, underscores, dashes, or dots, and should not exceed 35 characters
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
     * @return This {@link MessagesApiMessagePgPayuPaymentConfiguration instance}.
     */
    public MessagesApiMessagePgPayuPaymentConfiguration name(String name) {
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
     * Sets beneficiary.
     *
     * @param beneficiary
     * @return This {@link MessagesApiMessagePgPayuPaymentConfiguration instance}.
     */
    public MessagesApiMessagePgPayuPaymentConfiguration beneficiary(MessagesApiMessagePaymentBeneficiary beneficiary) {
        this.beneficiary = beneficiary;
        return this;
    }

    /**
     * Returns beneficiary.
     *
     * @return beneficiary
     */
    @JsonProperty("beneficiary")
    public MessagesApiMessagePaymentBeneficiary getBeneficiary() {
        return beneficiary;
    }

    /**
     * Sets beneficiary.
     *
     * @param beneficiary
     */
    @JsonProperty("beneficiary")
    public void setBeneficiary(MessagesApiMessagePaymentBeneficiary beneficiary) {
        this.beneficiary = beneficiary;
    }

    /**
     * Sets callbackData.
     * <p>
     * Field description:
     * List of custom parameters corresponding to the transaction.
     *
     * @param callbackData
     * @return This {@link MessagesApiMessagePgPayuPaymentConfiguration instance}.
     */
    public MessagesApiMessagePgPayuPaymentConfiguration callbackData(List<String> callbackData) {
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
     * @return This {@link MessagesApiMessagePgPayuPaymentConfiguration instance}.
     */
    public MessagesApiMessagePgPayuPaymentConfiguration addCallbackDataItem(String callbackDataItem) {
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
        MessagesApiMessagePgPayuPaymentConfiguration messagesApiMessagePgPayuPaymentConfiguration =
                (MessagesApiMessagePgPayuPaymentConfiguration) o;
        return Objects.equals(this.id, messagesApiMessagePgPayuPaymentConfiguration.id)
                && Objects.equals(this.name, messagesApiMessagePgPayuPaymentConfiguration.name)
                && Objects.equals(this.beneficiary, messagesApiMessagePgPayuPaymentConfiguration.beneficiary)
                && Objects.equals(this.callbackData, messagesApiMessagePgPayuPaymentConfiguration.callbackData)
                && super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, beneficiary, callbackData, super.hashCode());
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class MessagesApiMessagePgPayuPaymentConfiguration {")
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
