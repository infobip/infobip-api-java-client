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
 * Represents WhatsAppInteractiveOrderDetailsAmount model.
 */
public class WhatsAppInteractiveOrderDetailsAmount {

    private Integer value;

    /**
     * Sets value.
     * <p>
     * Field description:
     * Value multiplied by the offset (100 for INR and BRL).
     * <p>
     * The field is required.
     *
     * @param value
     * @return This {@link WhatsAppInteractiveOrderDetailsAmount instance}.
     */
    public WhatsAppInteractiveOrderDetailsAmount value(Integer value) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WhatsAppInteractiveOrderDetailsAmount whatsAppInteractiveOrderDetailsAmount =
                (WhatsAppInteractiveOrderDetailsAmount) o;
        return Objects.equals(this.value, whatsAppInteractiveOrderDetailsAmount.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class WhatsAppInteractiveOrderDetailsAmount {")
                .append(newLine)
                .append("    value: ")
                .append(toIndentedString(value))
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
