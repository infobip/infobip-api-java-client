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
 * (WhatsApp specific) Discount of the order.
 */
public class MessagesApiMessageDescriptiveDiscountAmount {

    private Double value;

    private String description;

    /**
     * Sets value.
     * <p>
     * Field description:
     * Value of the amount (up to 2 decimal places). For WhatsApp it has to be multiplied by offset (100 for &#x60;INR&#x60; and &#x60;BRL&#x60;)
     *
     * @param value
     * @return This {@link MessagesApiMessageDescriptiveDiscountAmount instance}.
     */
    public MessagesApiMessageDescriptiveDiscountAmount value(Double value) {
        this.value = value;
        return this;
    }

    /**
     * Returns value.
     * <p>
     * Field description:
     * Value of the amount (up to 2 decimal places). For WhatsApp it has to be multiplied by offset (100 for &#x60;INR&#x60; and &#x60;BRL&#x60;)
     *
     * @return value
     */
    @JsonProperty("value")
    public Double getValue() {
        return value;
    }

    /**
     * Sets value.
     * <p>
     * Field description:
     * Value of the amount (up to 2 decimal places). For WhatsApp it has to be multiplied by offset (100 for &#x60;INR&#x60; and &#x60;BRL&#x60;)
     *
     * @param value
     */
    @JsonProperty("value")
    public void setValue(Double value) {
        this.value = value;
    }

    /**
     * Sets description.
     * <p>
     * Field description:
     * Additional description of the amount. Optional for WhatsApp.
     *
     * @param description
     * @return This {@link MessagesApiMessageDescriptiveDiscountAmount instance}.
     */
    public MessagesApiMessageDescriptiveDiscountAmount description(String description) {
        this.description = description;
        return this;
    }

    /**
     * Returns description.
     * <p>
     * Field description:
     * Additional description of the amount. Optional for WhatsApp.
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
     * Additional description of the amount. Optional for WhatsApp.
     *
     * @param description
     */
    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MessagesApiMessageDescriptiveDiscountAmount messagesApiMessageDescriptiveDiscountAmount =
                (MessagesApiMessageDescriptiveDiscountAmount) o;
        return Objects.equals(this.value, messagesApiMessageDescriptiveDiscountAmount.value)
                && Objects.equals(this.description, messagesApiMessageDescriptiveDiscountAmount.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value, description);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class MessagesApiMessageDescriptiveDiscountAmount {")
                .append(newLine)
                .append("    value: ")
                .append(toIndentedString(value))
                .append(newLine)
                .append("    description: ")
                .append(toIndentedString(description))
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
