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
public class ResourcesTextRequirementValidation {

    private Integer minLength;

    private Integer maxLength;

    private String pattern;

    /**
     * Sets minLength.
     * <p>
     * Field description:
     * The minimum length of the text.
     *
     * @param minLength
     * @return This {@link ResourcesTextRequirementValidation instance}.
     */
    public ResourcesTextRequirementValidation minLength(Integer minLength) {
        this.minLength = minLength;
        return this;
    }

    /**
     * Returns minLength.
     * <p>
     * Field description:
     * The minimum length of the text.
     *
     * @return minLength
     */
    @JsonProperty("minLength")
    public Integer getMinLength() {
        return minLength;
    }

    /**
     * Sets minLength.
     * <p>
     * Field description:
     * The minimum length of the text.
     *
     * @param minLength
     */
    @JsonProperty("minLength")
    public void setMinLength(Integer minLength) {
        this.minLength = minLength;
    }

    /**
     * Sets maxLength.
     * <p>
     * Field description:
     * The maximum length of the text.
     *
     * @param maxLength
     * @return This {@link ResourcesTextRequirementValidation instance}.
     */
    public ResourcesTextRequirementValidation maxLength(Integer maxLength) {
        this.maxLength = maxLength;
        return this;
    }

    /**
     * Returns maxLength.
     * <p>
     * Field description:
     * The maximum length of the text.
     *
     * @return maxLength
     */
    @JsonProperty("maxLength")
    public Integer getMaxLength() {
        return maxLength;
    }

    /**
     * Sets maxLength.
     * <p>
     * Field description:
     * The maximum length of the text.
     *
     * @param maxLength
     */
    @JsonProperty("maxLength")
    public void setMaxLength(Integer maxLength) {
        this.maxLength = maxLength;
    }

    /**
     * Sets pattern.
     * <p>
     * Field description:
     * The pattern of the text.
     *
     * @param pattern
     * @return This {@link ResourcesTextRequirementValidation instance}.
     */
    public ResourcesTextRequirementValidation pattern(String pattern) {
        this.pattern = pattern;
        return this;
    }

    /**
     * Returns pattern.
     * <p>
     * Field description:
     * The pattern of the text.
     *
     * @return pattern
     */
    @JsonProperty("pattern")
    public String getPattern() {
        return pattern;
    }

    /**
     * Sets pattern.
     * <p>
     * Field description:
     * The pattern of the text.
     *
     * @param pattern
     */
    @JsonProperty("pattern")
    public void setPattern(String pattern) {
        this.pattern = pattern;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ResourcesTextRequirementValidation resourcesTextRequirementValidation = (ResourcesTextRequirementValidation) o;
        return Objects.equals(this.minLength, resourcesTextRequirementValidation.minLength)
                && Objects.equals(this.maxLength, resourcesTextRequirementValidation.maxLength)
                && Objects.equals(this.pattern, resourcesTextRequirementValidation.pattern);
    }

    @Override
    public int hashCode() {
        return Objects.hash(minLength, maxLength, pattern);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class ResourcesTextRequirementValidation {")
                .append(newLine)
                .append("    minLength: ")
                .append(toIndentedString(minLength))
                .append(newLine)
                .append("    maxLength: ")
                .append(toIndentedString(maxLength))
                .append(newLine)
                .append("    pattern: ")
                .append(toIndentedString(pattern))
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
