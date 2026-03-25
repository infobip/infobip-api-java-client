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
 * The rejection reasons details. This field is present only when new campaign registration status is &#39;REJECTED&#39;.
 */
public class NumbersRejectionReasonPayload {

    private String errorCode;

    private String description;

    /**
     * Sets errorCode.
     * <p>
     * Field description:
     * Predefined code.
     *
     * @param errorCode
     * @return This {@link NumbersRejectionReasonPayload instance}.
     */
    public NumbersRejectionReasonPayload errorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    /**
     * Returns errorCode.
     * <p>
     * Field description:
     * Predefined code.
     *
     * @return errorCode
     */
    @JsonProperty("errorCode")
    public String getErrorCode() {
        return errorCode;
    }

    /**
     * Sets errorCode.
     * <p>
     * Field description:
     * Predefined code.
     *
     * @param errorCode
     */
    @JsonProperty("errorCode")
    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    /**
     * Sets description.
     * <p>
     * Field description:
     * Rejection reason.
     *
     * @param description
     * @return This {@link NumbersRejectionReasonPayload instance}.
     */
    public NumbersRejectionReasonPayload description(String description) {
        this.description = description;
        return this;
    }

    /**
     * Returns description.
     * <p>
     * Field description:
     * Rejection reason.
     *
     * @return description
     */
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    /**
     * Sets description.
     * <p>
     * Field description:
     * Rejection reason.
     *
     * @param description
     */
    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        NumbersRejectionReasonPayload numbersRejectionReasonPayload = (NumbersRejectionReasonPayload) o;
        return Objects.equals(this.errorCode, numbersRejectionReasonPayload.errorCode)
                && Objects.equals(this.description, numbersRejectionReasonPayload.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(errorCode, description);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class NumbersRejectionReasonPayload {")
                .append(newLine)
                .append("    errorCode: ")
                .append(toIndentedString(errorCode))
                .append(newLine)
                .append("    description: ")
                .append(toIndentedString(description))
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
