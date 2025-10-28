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
 * Represents MessagesApiMessageUpiIntentPaymentConfiguration model.
 */
public class MessagesApiMessageUpiIntentPaymentConfiguration extends MessagesApiMessagePaymentConfiguration {

    private String id;

    private MessagesApiMessagePaymentBeneficiary beneficiary;

    private MessagesApiUpiIntentPaymentFormat format;

    /**
     * Constructs a new {@link MessagesApiMessageUpiIntentPaymentConfiguration} instance.
     */
    public MessagesApiMessageUpiIntentPaymentConfiguration() {
        super("UPI_INTENT");
    }

    /**
     * Sets id.
     * <p>
     * Field description:
     * Unique identifier of the payment. It can only contain English letters, numbers, underscores, dashes, or dots, and should not exceed 35 characters
     *
     * @param id
     * @return This {@link MessagesApiMessageUpiIntentPaymentConfiguration instance}.
     */
    public MessagesApiMessageUpiIntentPaymentConfiguration id(String id) {
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
     * Sets beneficiary.
     *
     * @param beneficiary
     * @return This {@link MessagesApiMessageUpiIntentPaymentConfiguration instance}.
     */
    public MessagesApiMessageUpiIntentPaymentConfiguration beneficiary(
            MessagesApiMessagePaymentBeneficiary beneficiary) {
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
     * Sets format.
     *
     * @param format
     * @return This {@link MessagesApiMessageUpiIntentPaymentConfiguration instance}.
     */
    public MessagesApiMessageUpiIntentPaymentConfiguration format(MessagesApiUpiIntentPaymentFormat format) {
        this.format = format;
        return this;
    }

    /**
     * Returns format.
     *
     * @return format
     */
    @JsonProperty("format")
    public MessagesApiUpiIntentPaymentFormat getFormat() {
        return format;
    }

    /**
     * Sets format.
     *
     * @param format
     */
    @JsonProperty("format")
    public void setFormat(MessagesApiUpiIntentPaymentFormat format) {
        this.format = format;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MessagesApiMessageUpiIntentPaymentConfiguration messagesApiMessageUpiIntentPaymentConfiguration =
                (MessagesApiMessageUpiIntentPaymentConfiguration) o;
        return Objects.equals(this.id, messagesApiMessageUpiIntentPaymentConfiguration.id)
                && Objects.equals(this.beneficiary, messagesApiMessageUpiIntentPaymentConfiguration.beneficiary)
                && Objects.equals(this.format, messagesApiMessageUpiIntentPaymentConfiguration.format)
                && super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, beneficiary, format, super.hashCode());
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class MessagesApiMessageUpiIntentPaymentConfiguration {")
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
                .append("    format: ")
                .append(toIndentedString(format))
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
