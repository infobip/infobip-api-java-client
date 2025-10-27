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
 * An array of shipping information. For WhatsApp only one item allowed, for Apple many allowed.
 */
public class MessagesApiMessageShipping {

    private Double amount;

    private String description;

    private String identifier;

    private String label;

    /**
     * Sets amount.
     * <p>
     * Field description:
     * Amount of shipping cost (up to 2 decimal places). For WhatsApp it has to be multiplied by offset (100 for &#x60;INR&#x60; and &#x60;BRL&#x60;)
     * <p>
     * The field is required.
     *
     * @param amount
     * @return This {@link MessagesApiMessageShipping instance}.
     */
    public MessagesApiMessageShipping amount(Double amount) {
        this.amount = amount;
        return this;
    }

    /**
     * Returns amount.
     * <p>
     * Field description:
     * Amount of shipping cost (up to 2 decimal places). For WhatsApp it has to be multiplied by offset (100 for &#x60;INR&#x60; and &#x60;BRL&#x60;)
     * <p>
     * The field is required.
     *
     * @return amount
     */
    @JsonProperty("amount")
    public Double getAmount() {
        return amount;
    }

    /**
     * Sets amount.
     * <p>
     * Field description:
     * Amount of shipping cost (up to 2 decimal places). For WhatsApp it has to be multiplied by offset (100 for &#x60;INR&#x60; and &#x60;BRL&#x60;)
     * <p>
     * The field is required.
     *
     * @param amount
     */
    @JsonProperty("amount")
    public void setAmount(Double amount) {
        this.amount = amount;
    }

    /**
     * Sets description.
     * <p>
     * Field description:
     * (Apple specific and required) Additional description of shipping cost. Optional for WhatsApp.
     *
     * @param description
     * @return This {@link MessagesApiMessageShipping instance}.
     */
    public MessagesApiMessageShipping description(String description) {
        this.description = description;
        return this;
    }

    /**
     * Returns description.
     * <p>
     * Field description:
     * (Apple specific and required) Additional description of shipping cost. Optional for WhatsApp.
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
     * (Apple specific and required) Additional description of shipping cost. Optional for WhatsApp.
     *
     * @param description
     */
    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Sets identifier.
     * <p>
     * Field description:
     * (Apple specific and required) Client-defined value used to identify this shipping method.
     *
     * @param identifier
     * @return This {@link MessagesApiMessageShipping instance}.
     */
    public MessagesApiMessageShipping identifier(String identifier) {
        this.identifier = identifier;
        return this;
    }

    /**
     * Returns identifier.
     * <p>
     * Field description:
     * (Apple specific and required) Client-defined value used to identify this shipping method.
     *
     * @return identifier
     */
    @JsonProperty("identifier")
    public String getIdentifier() {
        return identifier;
    }

    /**
     * Sets identifier.
     * <p>
     * Field description:
     * (Apple specific and required) Client-defined value used to identify this shipping method.
     *
     * @param identifier
     */
    @JsonProperty("identifier")
    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    /**
     * Sets label.
     * <p>
     * Field description:
     * (Apple specific and required) Short description of the shipping method.
     *
     * @param label
     * @return This {@link MessagesApiMessageShipping instance}.
     */
    public MessagesApiMessageShipping label(String label) {
        this.label = label;
        return this;
    }

    /**
     * Returns label.
     * <p>
     * Field description:
     * (Apple specific and required) Short description of the shipping method.
     *
     * @return label
     */
    @JsonProperty("label")
    public String getLabel() {
        return label;
    }

    /**
     * Sets label.
     * <p>
     * Field description:
     * (Apple specific and required) Short description of the shipping method.
     *
     * @param label
     */
    @JsonProperty("label")
    public void setLabel(String label) {
        this.label = label;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MessagesApiMessageShipping messagesApiMessageShipping = (MessagesApiMessageShipping) o;
        return Objects.equals(this.amount, messagesApiMessageShipping.amount)
                && Objects.equals(this.description, messagesApiMessageShipping.description)
                && Objects.equals(this.identifier, messagesApiMessageShipping.identifier)
                && Objects.equals(this.label, messagesApiMessageShipping.label);
    }

    @Override
    public int hashCode() {
        return Objects.hash(amount, description, identifier, label);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class MessagesApiMessageShipping {")
                .append(newLine)
                .append("    amount: ")
                .append(toIndentedString(amount))
                .append(newLine)
                .append("    description: ")
                .append(toIndentedString(description))
                .append(newLine)
                .append("    identifier: ")
                .append(toIndentedString(identifier))
                .append(newLine)
                .append("    label: ")
                .append(toIndentedString(label))
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
