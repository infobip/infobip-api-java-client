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
 * Represents CallsNumbers model.
 */
public class CallsNumbers {

    private String number;

    private String numbers;

    /**
     * Sets number.
     * <p>
     * Field description:
     * must be a valid E164 MSISDN; the parameter can be constructed using variables
     *
     * @param number
     * @return This {@link CallsNumbers instance}.
     */
    public CallsNumbers number(String number) {
        this.number = number;
        return this;
    }

    /**
     * Returns number.
     * <p>
     * Field description:
     * must be a valid E164 MSISDN; the parameter can be constructed using variables
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
     * must be a valid E164 MSISDN; the parameter can be constructed using variables
     *
     * @param number
     */
    @JsonProperty("number")
    public void setNumber(String number) {
        this.number = number;
    }

    /**
     * Sets numbers.
     * <p>
     * Field description:
     * must be a comma-separated list of valid E164 MSISDN numbers; the parameter can be constructed using variables
     *
     * @param numbers
     * @return This {@link CallsNumbers instance}.
     */
    public CallsNumbers numbers(String numbers) {
        this.numbers = numbers;
        return this;
    }

    /**
     * Returns numbers.
     * <p>
     * Field description:
     * must be a comma-separated list of valid E164 MSISDN numbers; the parameter can be constructed using variables
     *
     * @return numbers
     */
    @JsonProperty("numbers")
    public String getNumbers() {
        return numbers;
    }

    /**
     * Sets numbers.
     * <p>
     * Field description:
     * must be a comma-separated list of valid E164 MSISDN numbers; the parameter can be constructed using variables
     *
     * @param numbers
     */
    @JsonProperty("numbers")
    public void setNumbers(String numbers) {
        this.numbers = numbers;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CallsNumbers callsNumbers = (CallsNumbers) o;
        return Objects.equals(this.number, callsNumbers.number) && Objects.equals(this.numbers, callsNumbers.numbers);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number, numbers);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class CallsNumbers {")
                .append(newLine)
                .append("    number: ")
                .append(toIndentedString(number))
                .append(newLine)
                .append("    numbers: ")
                .append(toIndentedString(numbers))
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
