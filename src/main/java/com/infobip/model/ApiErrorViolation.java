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
 * List of violations that caused the error.
 */
public class ApiErrorViolation {

    private String property;

    private String violation;

    /**
     * Sets property.
     * <p>
     * Field description:
     * Request property that caused the error.
     *
     * @param property
     * @return This {@link ApiErrorViolation instance}.
     */
    public ApiErrorViolation property(String property) {
        this.property = property;
        return this;
    }

    /**
     * Returns property.
     * <p>
     * Field description:
     * Request property that caused the error.
     *
     * @return property
     */
    @JsonProperty("property")
    public String getProperty() {
        return property;
    }

    /**
     * Sets property.
     * <p>
     * Field description:
     * Request property that caused the error.
     *
     * @param property
     */
    @JsonProperty("property")
    public void setProperty(String property) {
        this.property = property;
    }

    /**
     * Sets violation.
     * <p>
     * Field description:
     * Detailed violation description.
     *
     * @param violation
     * @return This {@link ApiErrorViolation instance}.
     */
    public ApiErrorViolation violation(String violation) {
        this.violation = violation;
        return this;
    }

    /**
     * Returns violation.
     * <p>
     * Field description:
     * Detailed violation description.
     *
     * @return violation
     */
    @JsonProperty("violation")
    public String getViolation() {
        return violation;
    }

    /**
     * Sets violation.
     * <p>
     * Field description:
     * Detailed violation description.
     *
     * @param violation
     */
    @JsonProperty("violation")
    public void setViolation(String violation) {
        this.violation = violation;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ApiErrorViolation apiErrorViolation = (ApiErrorViolation) o;
        return Objects.equals(this.property, apiErrorViolation.property)
                && Objects.equals(this.violation, apiErrorViolation.violation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(property, violation);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class ApiErrorViolation {")
                .append(newLine)
                .append("    property: ")
                .append(toIndentedString(property))
                .append(newLine)
                .append("    violation: ")
                .append(toIndentedString(violation))
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
