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
 * List of compliance errors found during the AI campaign review. Empty when the review is still processing or the campaign is compliant.
 */
public class NumbersExternalAutomaticReviewError {

    private String code;

    private String justification;

    private String description;

    private String recommendation;

    /**
     * Sets code.
     * <p>
     * Field description:
     * The error code identifying the type of compliance issue.
     *
     * @param code
     * @return This {@link NumbersExternalAutomaticReviewError instance}.
     */
    public NumbersExternalAutomaticReviewError code(String code) {
        this.code = code;
        return this;
    }

    /**
     * Returns code.
     * <p>
     * Field description:
     * The error code identifying the type of compliance issue.
     *
     * @return code
     */
    @JsonProperty("code")
    public String getCode() {
        return code;
    }

    /**
     * Sets code.
     * <p>
     * Field description:
     * The error code identifying the type of compliance issue.
     *
     * @param code
     */
    @JsonProperty("code")
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * Sets justification.
     * <p>
     * Field description:
     * The justification for why this was flagged as a compliance issue.
     *
     * @param justification
     * @return This {@link NumbersExternalAutomaticReviewError instance}.
     */
    public NumbersExternalAutomaticReviewError justification(String justification) {
        this.justification = justification;
        return this;
    }

    /**
     * Returns justification.
     * <p>
     * Field description:
     * The justification for why this was flagged as a compliance issue.
     *
     * @return justification
     */
    @JsonProperty("justification")
    public String getJustification() {
        return justification;
    }

    /**
     * Sets justification.
     * <p>
     * Field description:
     * The justification for why this was flagged as a compliance issue.
     *
     * @param justification
     */
    @JsonProperty("justification")
    public void setJustification(String justification) {
        this.justification = justification;
    }

    /**
     * Sets description.
     * <p>
     * Field description:
     * Description of the compliance issue.
     *
     * @param description
     * @return This {@link NumbersExternalAutomaticReviewError instance}.
     */
    public NumbersExternalAutomaticReviewError description(String description) {
        this.description = description;
        return this;
    }

    /**
     * Returns description.
     * <p>
     * Field description:
     * Description of the compliance issue.
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
     * Description of the compliance issue.
     *
     * @param description
     */
    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Sets recommendation.
     * <p>
     * Field description:
     * The recommended action to resolve the compliance issue.
     *
     * @param recommendation
     * @return This {@link NumbersExternalAutomaticReviewError instance}.
     */
    public NumbersExternalAutomaticReviewError recommendation(String recommendation) {
        this.recommendation = recommendation;
        return this;
    }

    /**
     * Returns recommendation.
     * <p>
     * Field description:
     * The recommended action to resolve the compliance issue.
     *
     * @return recommendation
     */
    @JsonProperty("recommendation")
    public String getRecommendation() {
        return recommendation;
    }

    /**
     * Sets recommendation.
     * <p>
     * Field description:
     * The recommended action to resolve the compliance issue.
     *
     * @param recommendation
     */
    @JsonProperty("recommendation")
    public void setRecommendation(String recommendation) {
        this.recommendation = recommendation;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        NumbersExternalAutomaticReviewError numbersExternalAutomaticReviewError =
                (NumbersExternalAutomaticReviewError) o;
        return Objects.equals(this.code, numbersExternalAutomaticReviewError.code)
                && Objects.equals(this.justification, numbersExternalAutomaticReviewError.justification)
                && Objects.equals(this.description, numbersExternalAutomaticReviewError.description)
                && Objects.equals(this.recommendation, numbersExternalAutomaticReviewError.recommendation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(code, justification, description, recommendation);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class NumbersExternalAutomaticReviewError {")
                .append(newLine)
                .append("    code: ")
                .append(toIndentedString(code))
                .append(newLine)
                .append("    justification: ")
                .append(toIndentedString(justification))
                .append(newLine)
                .append("    description: ")
                .append(toIndentedString(description))
                .append(newLine)
                .append("    recommendation: ")
                .append(toIndentedString(recommendation))
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
