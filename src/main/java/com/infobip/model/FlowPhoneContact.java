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
 * A list of person&#39;s phone numbers. Max 100 numbers per person.
 */
public class FlowPhoneContact {

    private String number;

    /**
     * Sets number.
     * <p>
     * Field description:
     * Person&#39;s phone number. Must be in [international format](https://en.wikipedia.org/wiki/E.164) and cannot exceed 50 characters. One person can have up to 100 phone numbers.
     *
     * @param number
     * @return This {@link FlowPhoneContact instance}.
     */
    public FlowPhoneContact number(String number) {
        this.number = number;
        return this;
    }

    /**
     * Returns number.
     * <p>
     * Field description:
     * Person&#39;s phone number. Must be in [international format](https://en.wikipedia.org/wiki/E.164) and cannot exceed 50 characters. One person can have up to 100 phone numbers.
     *
     * @return number
     */
    @JsonProperty("number")
    public String getNumber() {
        return number;
    }

    /**
     * Sets number.
     * <p>
     * Field description:
     * Person&#39;s phone number. Must be in [international format](https://en.wikipedia.org/wiki/E.164) and cannot exceed 50 characters. One person can have up to 100 phone numbers.
     *
     * @param number
     */
    @JsonProperty("number")
    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        FlowPhoneContact flowPhoneContact = (FlowPhoneContact) o;
        return Objects.equals(this.number, flowPhoneContact.number);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class FlowPhoneContact {")
                .append(newLine)
                .append("    number: ")
                .append(toIndentedString(number))
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
