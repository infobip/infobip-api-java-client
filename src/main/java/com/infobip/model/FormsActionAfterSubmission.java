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
 * Action after the submission
 */
public class FormsActionAfterSubmission {

    private FormsActionAfterSubmissionType type;

    private String value;

    /**
     * Sets type.
     * <p>
     * The field is required.
     *
     * @param type
     * @return This {@link FormsActionAfterSubmission instance}.
     */
    public FormsActionAfterSubmission type(FormsActionAfterSubmissionType type) {
        this.type = type;
        return this;
    }

    /**
     * Returns type.
     * <p>
     * The field is required.
     *
     * @return type
     */
    @JsonProperty("type")
    public FormsActionAfterSubmissionType getType() {
        return type;
    }

    /**
     * Sets type.
     * <p>
     * The field is required.
     *
     * @param type
     */
    @JsonProperty("type")
    public void setType(FormsActionAfterSubmissionType type) {
        this.type = type;
    }

    /**
     * Sets value.
     * <p>
     * The field is required.
     *
     * @param value
     * @return This {@link FormsActionAfterSubmission instance}.
     */
    public FormsActionAfterSubmission value(String value) {
        this.value = value;
        return this;
    }

    /**
     * Returns value.
     * <p>
     * The field is required.
     *
     * @return value
     */
    @JsonProperty("value")
    public String getValue() {
        return value;
    }

    /**
     * Sets value.
     * <p>
     * The field is required.
     *
     * @param value
     */
    @JsonProperty("value")
    public void setValue(String value) {
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
        FormsActionAfterSubmission formsActionAfterSubmission = (FormsActionAfterSubmission) o;
        return Objects.equals(this.type, formsActionAfterSubmission.type)
                && Objects.equals(this.value, formsActionAfterSubmission.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, value);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class FormsActionAfterSubmission {")
                .append(newLine)
                .append("    type: ")
                .append(toIndentedString(type))
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
