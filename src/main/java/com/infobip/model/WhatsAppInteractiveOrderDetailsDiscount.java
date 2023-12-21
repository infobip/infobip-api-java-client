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
 * Discount of the order.
 */
public class WhatsAppInteractiveOrderDetailsDiscount {

    private WhatsAppInteractiveOrderDetailsDescriptiveAmount amount;

    private String programName;

    /**
     * Sets amount.
     * <p>
     * The field is required.
     *
     * @param amount
     * @return This {@link WhatsAppInteractiveOrderDetailsDiscount instance}.
     */
    public WhatsAppInteractiveOrderDetailsDiscount amount(WhatsAppInteractiveOrderDetailsDescriptiveAmount amount) {
        this.amount = amount;
        return this;
    }

    /**
     * Returns amount.
     * <p>
     * The field is required.
     *
     * @return amount
     */
    @JsonProperty("amount")
    public WhatsAppInteractiveOrderDetailsDescriptiveAmount getAmount() {
        return amount;
    }

    /**
     * Sets amount.
     * <p>
     * The field is required.
     *
     * @param amount
     */
    @JsonProperty("amount")
    public void setAmount(WhatsAppInteractiveOrderDetailsDescriptiveAmount amount) {
        this.amount = amount;
    }

    /**
     * Sets programName.
     * <p>
     * Field description:
     * Discount program name.
     *
     * @param programName
     * @return This {@link WhatsAppInteractiveOrderDetailsDiscount instance}.
     */
    public WhatsAppInteractiveOrderDetailsDiscount programName(String programName) {
        this.programName = programName;
        return this;
    }

    /**
     * Returns programName.
     * <p>
     * Field description:
     * Discount program name.
     *
     * @return programName
     */
    @JsonProperty("programName")
    public String getProgramName() {
        return programName;
    }

    /**
     * Sets programName.
     * <p>
     * Field description:
     * Discount program name.
     *
     * @param programName
     */
    @JsonProperty("programName")
    public void setProgramName(String programName) {
        this.programName = programName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WhatsAppInteractiveOrderDetailsDiscount whatsAppInteractiveOrderDetailsDiscount =
                (WhatsAppInteractiveOrderDetailsDiscount) o;
        return Objects.equals(this.amount, whatsAppInteractiveOrderDetailsDiscount.amount)
                && Objects.equals(this.programName, whatsAppInteractiveOrderDetailsDiscount.programName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(amount, programName);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class WhatsAppInteractiveOrderDetailsDiscount {")
                .append(newLine)
                .append("    amount: ")
                .append(toIndentedString(amount))
                .append(newLine)
                .append("    programName: ")
                .append(toIndentedString(programName))
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
