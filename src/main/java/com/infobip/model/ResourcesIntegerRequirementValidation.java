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
 * Validation rules.
 */
public class ResourcesIntegerRequirementValidation {

    private Integer minValue;

    private Integer maxValue;

    /**
     * Sets minValue.
     * <p>
     * Field description:
     * The minimum value of the integer.
     *
     * @param minValue
     * @return This {@link ResourcesIntegerRequirementValidation instance}.
     */
    public ResourcesIntegerRequirementValidation minValue(Integer minValue) {
        this.minValue = minValue;
        return this;
    }

    /**
     * Returns minValue.
     * <p>
     * Field description:
     * The minimum value of the integer.
     *
     * @return minValue
     */
    @JsonProperty("minValue")
    public Integer getMinValue() {
        return minValue;
    }

    /**
     * Sets minValue.
     * <p>
     * Field description:
     * The minimum value of the integer.
     *
     * @param minValue
     */
    @JsonProperty("minValue")
    public void setMinValue(Integer minValue) {
        this.minValue = minValue;
    }

    /**
     * Sets maxValue.
     * <p>
     * Field description:
     * The maximum value of the integer.
     *
     * @param maxValue
     * @return This {@link ResourcesIntegerRequirementValidation instance}.
     */
    public ResourcesIntegerRequirementValidation maxValue(Integer maxValue) {
        this.maxValue = maxValue;
        return this;
    }

    /**
     * Returns maxValue.
     * <p>
     * Field description:
     * The maximum value of the integer.
     *
     * @return maxValue
     */
    @JsonProperty("maxValue")
    public Integer getMaxValue() {
        return maxValue;
    }

    /**
     * Sets maxValue.
     * <p>
     * Field description:
     * The maximum value of the integer.
     *
     * @param maxValue
     */
    @JsonProperty("maxValue")
    public void setMaxValue(Integer maxValue) {
        this.maxValue = maxValue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ResourcesIntegerRequirementValidation resourcesIntegerRequirementValidation =
                (ResourcesIntegerRequirementValidation) o;
        return Objects.equals(this.minValue, resourcesIntegerRequirementValidation.minValue)
                && Objects.equals(this.maxValue, resourcesIntegerRequirementValidation.maxValue);
    }

    @Override
    public int hashCode() {
        return Objects.hash(minValue, maxValue);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class ResourcesIntegerRequirementValidation {")
                .append(newLine)
                .append("    minValue: ")
                .append(toIndentedString(minValue))
                .append(newLine)
                .append("    maxValue: ")
                .append(toIndentedString(maxValue))
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
