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
 * Rejection reasons details.
 */
public class NumbersRejectionReason {

    private String errorCode;

    private String description;

    private String recommendedAction;

    /**
     * Sets errorCode.
     * <p>
     * Field description:
     * Predefined code.
     *
     * @param errorCode
     * @return This {@link NumbersRejectionReason instance}.
     */
    public NumbersRejectionReason errorCode(String errorCode) {
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
     * @return This {@link NumbersRejectionReason instance}.
     */
    public NumbersRejectionReason description(String description) {
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

    /**
     * Sets recommendedAction.
     * <p>
     * Field description:
     * Recommended action.
     *
     * @param recommendedAction
     * @return This {@link NumbersRejectionReason instance}.
     */
    public NumbersRejectionReason recommendedAction(String recommendedAction) {
        this.recommendedAction = recommendedAction;
        return this;
    }

    /**
     * Returns recommendedAction.
     * <p>
     * Field description:
     * Recommended action.
     *
     * @return recommendedAction
     */
    @JsonProperty("recommendedAction")
    public String getRecommendedAction() {
        return recommendedAction;
    }

    /**
     * Sets recommendedAction.
     * <p>
     * Field description:
     * Recommended action.
     *
     * @param recommendedAction
     */
    @JsonProperty("recommendedAction")
    public void setRecommendedAction(String recommendedAction) {
        this.recommendedAction = recommendedAction;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        NumbersRejectionReason numbersRejectionReason = (NumbersRejectionReason) o;
        return Objects.equals(this.errorCode, numbersRejectionReason.errorCode)
                && Objects.equals(this.description, numbersRejectionReason.description)
                && Objects.equals(this.recommendedAction, numbersRejectionReason.recommendedAction);
    }

    @Override
    public int hashCode() {
        return Objects.hash(errorCode, description, recommendedAction);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class NumbersRejectionReason {")
                .append(newLine)
                .append("    errorCode: ")
                .append(toIndentedString(errorCode))
                .append(newLine)
                .append("    description: ")
                .append(toIndentedString(description))
                .append(newLine)
                .append("    recommendedAction: ")
                .append(toIndentedString(recommendedAction))
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
