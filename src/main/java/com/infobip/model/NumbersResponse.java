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
 * Represents NumbersResponse model.
 */
public class NumbersResponse {

    private List<NumbersNumberResponse> numbers = null;

    private Long numberCount;

    /**
     * Sets numbers.
     *
     * @param numbers
     * @return This {@link NumbersResponse instance}.
     */
    public NumbersResponse numbers(List<NumbersNumberResponse> numbers) {
        this.numbers = numbers;
        return this;
    }

    /**
     * Adds and item into numbers.
     *
     * @param numbersItem The item to be added to the list.
     * @return This {@link NumbersResponse instance}.
     */
    public NumbersResponse addNumbersItem(NumbersNumberResponse numbersItem) {
        if (this.numbers == null) {
            this.numbers = new ArrayList<>();
        }
        this.numbers.add(numbersItem);
        return this;
    }

    /**
     * Returns numbers.
     *
     * @return numbers
     */
    @JsonProperty("numbers")
    public List<NumbersNumberResponse> getNumbers() {
        return numbers;
    }

    /**
     * Sets numbers.
     *
     * @param numbers
     */
    @JsonProperty("numbers")
    public void setNumbers(List<NumbersNumberResponse> numbers) {
        this.numbers = numbers;
    }

    /**
     * Sets numberCount.
     *
     * @param numberCount
     * @return This {@link NumbersResponse instance}.
     */
    public NumbersResponse numberCount(Long numberCount) {
        this.numberCount = numberCount;
        return this;
    }

    /**
     * Returns numberCount.
     *
     * @return numberCount
     */
    @JsonProperty("numberCount")
    public Long getNumberCount() {
        return numberCount;
    }

    /**
     * Sets numberCount.
     *
     * @param numberCount
     */
    @JsonProperty("numberCount")
    public void setNumberCount(Long numberCount) {
        this.numberCount = numberCount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        NumbersResponse numbersResponse = (NumbersResponse) o;
        return Objects.equals(this.numbers, numbersResponse.numbers)
                && Objects.equals(this.numberCount, numbersResponse.numberCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numbers, numberCount);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class NumbersResponse {")
                .append(newLine)
                .append("    numbers: ")
                .append(toIndentedString(numbers))
                .append(newLine)
                .append("    numberCount: ")
                .append(toIndentedString(numberCount))
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
