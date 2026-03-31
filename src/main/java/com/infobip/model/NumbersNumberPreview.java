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
 * Represents NumbersNumberPreview model.
 */
public class NumbersNumberPreview {

    private String numberKey;

    private String number;

    private String countryCode;

    /**
     * Sets numberKey.
     * <p>
     * Field description:
     * Unique ID of the number.
     *
     * @param numberKey
     * @return This {@link NumbersNumberPreview instance}.
     */
    public NumbersNumberPreview numberKey(String numberKey) {
        this.numberKey = numberKey;
        return this;
    }

    /**
     * Returns numberKey.
     * <p>
     * Field description:
     * Unique ID of the number.
     *
     * @return numberKey
     */
    @JsonProperty("numberKey")
    public String getNumberKey() {
        return numberKey;
    }

    /**
     * Sets numberKey.
     * <p>
     * Field description:
     * Unique ID of the number.
     *
     * @param numberKey
     */
    @JsonProperty("numberKey")
    public void setNumberKey(String numberKey) {
        this.numberKey = numberKey;
    }

    /**
     * Sets number.
     * <p>
     * Field description:
     * Number.
     *
     * @param number
     * @return This {@link NumbersNumberPreview instance}.
     */
    public NumbersNumberPreview number(String number) {
        this.number = number;
        return this;
    }

    /**
     * Returns number.
     * <p>
     * Field description:
     * Number.
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
     * Number.
     *
     * @param number
     */
    @JsonProperty("number")
    public void setNumber(String number) {
        this.number = number;
    }

    /**
     * Sets countryCode.
     * <p>
     * Field description:
     * Number&#39;s country code.
     *
     * @param countryCode
     * @return This {@link NumbersNumberPreview instance}.
     */
    public NumbersNumberPreview countryCode(String countryCode) {
        this.countryCode = countryCode;
        return this;
    }

    /**
     * Returns countryCode.
     * <p>
     * Field description:
     * Number&#39;s country code.
     *
     * @return countryCode
     */
    @JsonProperty("countryCode")
    public String getCountryCode() {
        return countryCode;
    }

    /**
     * Sets countryCode.
     * <p>
     * Field description:
     * Number&#39;s country code.
     *
     * @param countryCode
     */
    @JsonProperty("countryCode")
    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        NumbersNumberPreview numbersNumberPreview = (NumbersNumberPreview) o;
        return Objects.equals(this.numberKey, numbersNumberPreview.numberKey)
                && Objects.equals(this.number, numbersNumberPreview.number)
                && Objects.equals(this.countryCode, numbersNumberPreview.countryCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numberKey, number, countryCode);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class NumbersNumberPreview {")
                .append(newLine)
                .append("    numberKey: ")
                .append(toIndentedString(numberKey))
                .append(newLine)
                .append("    number: ")
                .append(toIndentedString(number))
                .append(newLine)
                .append("    countryCode: ")
                .append(toIndentedString(countryCode))
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
