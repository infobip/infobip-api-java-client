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
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Offers additional information regarding the campaign, includes rejection reason and time.
 */
public class NumbersCampaignFeedback {

    private List<String> rejectionReasons = null;

    private List<NumbersRejectionReason> rejectionDetails = null;

    private OffsetDateTime rejectionDate;

    /**
     * Sets rejectionReasons.
     * <p>
     * Field description:
     * The reasons for the rejection.
     *
     * @param rejectionReasons
     * @return This {@link NumbersCampaignFeedback instance}.
     */
    public NumbersCampaignFeedback rejectionReasons(List<String> rejectionReasons) {
        this.rejectionReasons = rejectionReasons;
        return this;
    }

    /**
     * Adds and item into rejectionReasons.
     * <p>
     * Field description:
     * The reasons for the rejection.
     *
     * @param rejectionReasonsItem The item to be added to the list.
     * @return This {@link NumbersCampaignFeedback instance}.
     */
    public NumbersCampaignFeedback addRejectionReasonsItem(String rejectionReasonsItem) {
        if (this.rejectionReasons == null) {
            this.rejectionReasons = new ArrayList<>();
        }
        this.rejectionReasons.add(rejectionReasonsItem);
        return this;
    }

    /**
     * Returns rejectionReasons.
     * <p>
     * Field description:
     * The reasons for the rejection.
     *
     * @return rejectionReasons
     */
    @JsonProperty("rejectionReasons")
    public List<String> getRejectionReasons() {
        return rejectionReasons;
    }

    /**
     * Sets rejectionReasons.
     * <p>
     * Field description:
     * The reasons for the rejection.
     *
     * @param rejectionReasons
     */
    @JsonProperty("rejectionReasons")
    public void setRejectionReasons(List<String> rejectionReasons) {
        this.rejectionReasons = rejectionReasons;
    }

    /**
     * Sets rejectionDetails.
     * <p>
     * Field description:
     * Rejection reasons details.
     *
     * @param rejectionDetails
     * @return This {@link NumbersCampaignFeedback instance}.
     */
    public NumbersCampaignFeedback rejectionDetails(List<NumbersRejectionReason> rejectionDetails) {
        this.rejectionDetails = rejectionDetails;
        return this;
    }

    /**
     * Adds and item into rejectionDetails.
     * <p>
     * Field description:
     * Rejection reasons details.
     *
     * @param rejectionDetailsItem The item to be added to the list.
     * @return This {@link NumbersCampaignFeedback instance}.
     */
    public NumbersCampaignFeedback addRejectionDetailsItem(NumbersRejectionReason rejectionDetailsItem) {
        if (this.rejectionDetails == null) {
            this.rejectionDetails = new ArrayList<>();
        }
        this.rejectionDetails.add(rejectionDetailsItem);
        return this;
    }

    /**
     * Returns rejectionDetails.
     * <p>
     * Field description:
     * Rejection reasons details.
     *
     * @return rejectionDetails
     */
    @JsonProperty("rejectionDetails")
    public List<NumbersRejectionReason> getRejectionDetails() {
        return rejectionDetails;
    }

    /**
     * Sets rejectionDetails.
     * <p>
     * Field description:
     * Rejection reasons details.
     *
     * @param rejectionDetails
     */
    @JsonProperty("rejectionDetails")
    public void setRejectionDetails(List<NumbersRejectionReason> rejectionDetails) {
        this.rejectionDetails = rejectionDetails;
    }

    /**
     * Sets rejectionDate.
     * <p>
     * Field description:
     * The time of the rejection.
     *
     * @param rejectionDate
     * @return This {@link NumbersCampaignFeedback instance}.
     */
    public NumbersCampaignFeedback rejectionDate(OffsetDateTime rejectionDate) {
        this.rejectionDate = rejectionDate;
        return this;
    }

    /**
     * Returns rejectionDate.
     * <p>
     * Field description:
     * The time of the rejection.
     *
     * @return rejectionDate
     */
    @JsonProperty("rejectionDate")
    public OffsetDateTime getRejectionDate() {
        return rejectionDate;
    }

    /**
     * Sets rejectionDate.
     * <p>
     * Field description:
     * The time of the rejection.
     *
     * @param rejectionDate
     */
    @JsonProperty("rejectionDate")
    public void setRejectionDate(OffsetDateTime rejectionDate) {
        this.rejectionDate = rejectionDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        NumbersCampaignFeedback numbersCampaignFeedback = (NumbersCampaignFeedback) o;
        return Objects.equals(this.rejectionReasons, numbersCampaignFeedback.rejectionReasons)
                && Objects.equals(this.rejectionDetails, numbersCampaignFeedback.rejectionDetails)
                && Objects.equals(this.rejectionDate, numbersCampaignFeedback.rejectionDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(rejectionReasons, rejectionDetails, rejectionDate);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class NumbersCampaignFeedback {")
                .append(newLine)
                .append("    rejectionReasons: ")
                .append(toIndentedString(rejectionReasons))
                .append(newLine)
                .append("    rejectionDetails: ")
                .append(toIndentedString(rejectionDetails))
                .append(newLine)
                .append("    rejectionDate: ")
                .append(toIndentedString(rejectionDate))
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
