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
 * Represents NumbersExternalAutomaticReviewResults model.
 */
public class NumbersExternalAutomaticReviewResults {

    private NumbersExternalAutomaticReviewStatus reviewStatus;

    private List<NumbersExternalAutomaticReviewError> campaignErrors = null;

    /**
     * Sets reviewStatus.
     *
     * @param reviewStatus
     * @return This {@link NumbersExternalAutomaticReviewResults instance}.
     */
    public NumbersExternalAutomaticReviewResults reviewStatus(NumbersExternalAutomaticReviewStatus reviewStatus) {
        this.reviewStatus = reviewStatus;
        return this;
    }

    /**
     * Returns reviewStatus.
     *
     * @return reviewStatus
     */
    @JsonProperty("reviewStatus")
    public NumbersExternalAutomaticReviewStatus getReviewStatus() {
        return reviewStatus;
    }

    /**
     * Sets reviewStatus.
     *
     * @param reviewStatus
     */
    @JsonProperty("reviewStatus")
    public void setReviewStatus(NumbersExternalAutomaticReviewStatus reviewStatus) {
        this.reviewStatus = reviewStatus;
    }

    /**
     * Sets campaignErrors.
     * <p>
     * Field description:
     * List of compliance errors found during the AI campaign review. Empty when the review is still processing or the campaign is compliant.
     *
     * @param campaignErrors
     * @return This {@link NumbersExternalAutomaticReviewResults instance}.
     */
    public NumbersExternalAutomaticReviewResults campaignErrors(
            List<NumbersExternalAutomaticReviewError> campaignErrors) {
        this.campaignErrors = campaignErrors;
        return this;
    }

    /**
     * Adds and item into campaignErrors.
     * <p>
     * Field description:
     * List of compliance errors found during the AI campaign review. Empty when the review is still processing or the campaign is compliant.
     *
     * @param campaignErrorsItem The item to be added to the list.
     * @return This {@link NumbersExternalAutomaticReviewResults instance}.
     */
    public NumbersExternalAutomaticReviewResults addCampaignErrorsItem(
            NumbersExternalAutomaticReviewError campaignErrorsItem) {
        if (this.campaignErrors == null) {
            this.campaignErrors = new ArrayList<>();
        }
        this.campaignErrors.add(campaignErrorsItem);
        return this;
    }

    /**
     * Returns campaignErrors.
     * <p>
     * Field description:
     * List of compliance errors found during the AI campaign review. Empty when the review is still processing or the campaign is compliant.
     *
     * @return campaignErrors
     */
    @JsonProperty("campaignErrors")
    public List<NumbersExternalAutomaticReviewError> getCampaignErrors() {
        return campaignErrors;
    }

    /**
     * Sets campaignErrors.
     * <p>
     * Field description:
     * List of compliance errors found during the AI campaign review. Empty when the review is still processing or the campaign is compliant.
     *
     * @param campaignErrors
     */
    @JsonProperty("campaignErrors")
    public void setCampaignErrors(List<NumbersExternalAutomaticReviewError> campaignErrors) {
        this.campaignErrors = campaignErrors;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        NumbersExternalAutomaticReviewResults numbersExternalAutomaticReviewResults =
                (NumbersExternalAutomaticReviewResults) o;
        return Objects.equals(this.reviewStatus, numbersExternalAutomaticReviewResults.reviewStatus)
                && Objects.equals(this.campaignErrors, numbersExternalAutomaticReviewResults.campaignErrors);
    }

    @Override
    public int hashCode() {
        return Objects.hash(reviewStatus, campaignErrors);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class NumbersExternalAutomaticReviewResults {")
                .append(newLine)
                .append("    reviewStatus: ")
                .append(toIndentedString(reviewStatus))
                .append(newLine)
                .append("    campaignErrors: ")
                .append(toIndentedString(campaignErrors))
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
