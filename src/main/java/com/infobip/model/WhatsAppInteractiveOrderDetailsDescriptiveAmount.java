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
 * Represents WhatsAppInteractiveOrderDetailsDescriptiveAmount model.
 */
public class WhatsAppInteractiveOrderDetailsDescriptiveAmount {

    private Integer value;

    private String description;

    /**
     * Sets value.
     * <p>
     * Field description:
     * Value multiplied by the offset (100 for INR and BRL).
     * <p>
     * The field is required.
     *
     * @param value
     * @return This {@link WhatsAppInteractiveOrderDetailsDescriptiveAmount instance}.
     */
    public WhatsAppInteractiveOrderDetailsDescriptiveAmount value(Integer value) {
        this.value = value;
        return this;
    }

    /**
     * Returns value.
     * <p>
     * Field description:
     * Value multiplied by the offset (100 for INR and BRL).
     * <p>
     * The field is required.
     *
     * @return value
     */
    @JsonProperty("value")
    public Integer getValue() {
        return value;
    }

    /**
     * Sets value.
     * <p>
     * Field description:
     * Value multiplied by the offset (100 for INR and BRL).
     * <p>
     * The field is required.
     *
     * @param value
     */
    @JsonProperty("value")
    public void setValue(Integer value) {
        this.value = value;
    }

    /**
     * Sets description.
     * <p>
     * Field description:
     * Description of the value.
     *
     * @param description
     * @return This {@link WhatsAppInteractiveOrderDetailsDescriptiveAmount instance}.
     */
    public WhatsAppInteractiveOrderDetailsDescriptiveAmount description(String description) {
        this.description = description;
        return this;
    }

    /**
     * Returns description.
     * <p>
     * Field description:
     * Description of the value.
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
     * Description of the value.
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
        WhatsAppInteractiveOrderDetailsDescriptiveAmount whatsAppInteractiveOrderDetailsDescriptiveAmount =
                (WhatsAppInteractiveOrderDetailsDescriptiveAmount) o;
        return Objects.equals(this.value, whatsAppInteractiveOrderDetailsDescriptiveAmount.value)
                && Objects.equals(this.description, whatsAppInteractiveOrderDetailsDescriptiveAmount.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value, description);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class WhatsAppInteractiveOrderDetailsDescriptiveAmount {")
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
