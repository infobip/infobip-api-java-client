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
 * Represents FormsValidationRules model.
 */
public class FormsValidationRules {

    private String datePattern;

    private Integer maxLength;

    private String maxValue;

    private String minValue;

    private String pattern;

    private String sample;

    private List<String> forbiddenSymbols = null;

    /**
     * Sets datePattern.
     *
     * @param datePattern
     * @return This {@link FormsValidationRules instance}.
     */
    public FormsValidationRules datePattern(String datePattern) {
        this.datePattern = datePattern;
        return this;
    }

    /**
     * Returns datePattern.
     *
     * @return datePattern
     */
    @JsonProperty("datePattern")
    public String getDatePattern() {
        return datePattern;
    }

    /**
     * Sets datePattern.
     *
     * @param datePattern
     */
    @JsonProperty("datePattern")
    public void setDatePattern(String datePattern) {
        this.datePattern = datePattern;
    }

    /**
     * Sets maxLength.
     *
     * @param maxLength
     * @return This {@link FormsValidationRules instance}.
     */
    public FormsValidationRules maxLength(Integer maxLength) {
        this.maxLength = maxLength;
        return this;
    }

    /**
     * Returns maxLength.
     *
     * @return maxLength
     */
    @JsonProperty("maxLength")
    public Integer getMaxLength() {
        return maxLength;
    }

    /**
     * Sets maxLength.
     *
     * @param maxLength
     */
    @JsonProperty("maxLength")
    public void setMaxLength(Integer maxLength) {
        this.maxLength = maxLength;
    }

    /**
     * Sets maxValue.
     *
     * @param maxValue
     * @return This {@link FormsValidationRules instance}.
     */
    public FormsValidationRules maxValue(String maxValue) {
        this.maxValue = maxValue;
        return this;
    }

    /**
     * Returns maxValue.
     *
     * @return maxValue
     */
    @JsonProperty("maxValue")
    public String getMaxValue() {
        return maxValue;
    }

    /**
     * Sets maxValue.
     *
     * @param maxValue
     */
    @JsonProperty("maxValue")
    public void setMaxValue(String maxValue) {
        this.maxValue = maxValue;
    }

    /**
     * Sets minValue.
     *
     * @param minValue
     * @return This {@link FormsValidationRules instance}.
     */
    public FormsValidationRules minValue(String minValue) {
        this.minValue = minValue;
        return this;
    }

    /**
     * Returns minValue.
     *
     * @return minValue
     */
    @JsonProperty("minValue")
    public String getMinValue() {
        return minValue;
    }

    /**
     * Sets minValue.
     *
     * @param minValue
     */
    @JsonProperty("minValue")
    public void setMinValue(String minValue) {
        this.minValue = minValue;
    }

    /**
     * Sets pattern.
     *
     * @param pattern
     * @return This {@link FormsValidationRules instance}.
     */
    public FormsValidationRules pattern(String pattern) {
        this.pattern = pattern;
        return this;
    }

    /**
     * Returns pattern.
     *
     * @return pattern
     */
    @JsonProperty("pattern")
    public String getPattern() {
        return pattern;
    }

    /**
     * Sets pattern.
     *
     * @param pattern
     */
    @JsonProperty("pattern")
    public void setPattern(String pattern) {
        this.pattern = pattern;
    }

    /**
     * Sets sample.
     *
     * @param sample
     * @return This {@link FormsValidationRules instance}.
     */
    public FormsValidationRules sample(String sample) {
        this.sample = sample;
        return this;
    }

    /**
     * Returns sample.
     *
     * @return sample
     */
    @JsonProperty("sample")
    public String getSample() {
        return sample;
    }

    /**
     * Sets sample.
     *
     * @param sample
     */
    @JsonProperty("sample")
    public void setSample(String sample) {
        this.sample = sample;
    }

    /**
     * Sets forbiddenSymbols.
     *
     * @param forbiddenSymbols
     * @return This {@link FormsValidationRules instance}.
     */
    public FormsValidationRules forbiddenSymbols(List<String> forbiddenSymbols) {
        this.forbiddenSymbols = forbiddenSymbols;
        return this;
    }

    /**
     * Adds and item into forbiddenSymbols.
     *
     * @param forbiddenSymbolsItem The item to be added to the list.
     * @return This {@link FormsValidationRules instance}.
     */
    public FormsValidationRules addForbiddenSymbolsItem(String forbiddenSymbolsItem) {
        if (this.forbiddenSymbols == null) {
            this.forbiddenSymbols = new ArrayList<>();
        }
        this.forbiddenSymbols.add(forbiddenSymbolsItem);
        return this;
    }

    /**
     * Returns forbiddenSymbols.
     *
     * @return forbiddenSymbols
     */
    @JsonProperty("forbiddenSymbols")
    public List<String> getForbiddenSymbols() {
        return forbiddenSymbols;
    }

    /**
     * Sets forbiddenSymbols.
     *
     * @param forbiddenSymbols
     */
    @JsonProperty("forbiddenSymbols")
    public void setForbiddenSymbols(List<String> forbiddenSymbols) {
        this.forbiddenSymbols = forbiddenSymbols;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        FormsValidationRules formsValidationRules = (FormsValidationRules) o;
        return Objects.equals(this.datePattern, formsValidationRules.datePattern)
                && Objects.equals(this.maxLength, formsValidationRules.maxLength)
                && Objects.equals(this.maxValue, formsValidationRules.maxValue)
                && Objects.equals(this.minValue, formsValidationRules.minValue)
                && Objects.equals(this.pattern, formsValidationRules.pattern)
                && Objects.equals(this.sample, formsValidationRules.sample)
                && Objects.equals(this.forbiddenSymbols, formsValidationRules.forbiddenSymbols);
    }

    @Override
    public int hashCode() {
        return Objects.hash(datePattern, maxLength, maxValue, minValue, pattern, sample, forbiddenSymbols);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class FormsValidationRules {")
                .append(newLine)
                .append("    datePattern: ")
                .append(toIndentedString(datePattern))
                .append(newLine)
                .append("    maxLength: ")
                .append(toIndentedString(maxLength))
                .append(newLine)
                .append("    maxValue: ")
                .append(toIndentedString(maxValue))
                .append(newLine)
                .append("    minValue: ")
                .append(toIndentedString(minValue))
                .append(newLine)
                .append("    pattern: ")
                .append(toIndentedString(pattern))
                .append(newLine)
                .append("    sample: ")
                .append(toIndentedString(sample))
                .append(newLine)
                .append("    forbiddenSymbols: ")
                .append(toIndentedString(forbiddenSymbols))
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
