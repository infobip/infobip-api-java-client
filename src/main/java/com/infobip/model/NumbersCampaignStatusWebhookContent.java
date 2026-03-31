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
import java.util.UUID;

/**
 * Event content.
 */
public class NumbersCampaignStatusWebhookContent {

    private UUID campaignId;

    private NumbersWebhookCampaignStage campaignStatus;

    private String rejectionReasons;

    private List<NumbersRejectionReasonPayload> rejectionDetails = null;

    private OffsetDateTime rejectionDate;

    /**
     * Sets campaignId.
     * <p>
     * Field description:
     * The ID of campaign.
     *
     * @param campaignId
     * @return This {@link NumbersCampaignStatusWebhookContent instance}.
     */
    public NumbersCampaignStatusWebhookContent campaignId(UUID campaignId) {
        this.campaignId = campaignId;
        return this;
    }

    /**
     * Returns campaignId.
     * <p>
     * Field description:
     * The ID of campaign.
     *
     * @return campaignId
     */
    @JsonProperty("campaignId")
    public UUID getCampaignId() {
        return campaignId;
    }

    /**
     * Sets campaignId.
     * <p>
     * Field description:
     * The ID of campaign.
     *
     * @param campaignId
     */
    @JsonProperty("campaignId")
    public void setCampaignId(UUID campaignId) {
        this.campaignId = campaignId;
    }

    /**
     * Sets campaignStatus.
     *
     * @param campaignStatus
     * @return This {@link NumbersCampaignStatusWebhookContent instance}.
     */
    public NumbersCampaignStatusWebhookContent campaignStatus(NumbersWebhookCampaignStage campaignStatus) {
        this.campaignStatus = campaignStatus;
        return this;
    }

    /**
     * Returns campaignStatus.
     *
     * @return campaignStatus
     */
    @JsonProperty("campaignStatus")
    public NumbersWebhookCampaignStage getCampaignStatus() {
        return campaignStatus;
    }

    /**
     * Sets campaignStatus.
     *
     * @param campaignStatus
     */
    @JsonProperty("campaignStatus")
    public void setCampaignStatus(NumbersWebhookCampaignStage campaignStatus) {
        this.campaignStatus = campaignStatus;
    }

    /**
     * Sets rejectionReasons.
     * <p>
     * Field description:
     * The rejection reasons. This field is present only when new campaign registration status is &#39;REJECTED&#39;.
     *
     * @param rejectionReasons
     * @return This {@link NumbersCampaignStatusWebhookContent instance}.
     */
    public NumbersCampaignStatusWebhookContent rejectionReasons(String rejectionReasons) {
        this.rejectionReasons = rejectionReasons;
        return this;
    }

    /**
     * Returns rejectionReasons.
     * <p>
     * Field description:
     * The rejection reasons. This field is present only when new campaign registration status is &#39;REJECTED&#39;.
     *
     * @return rejectionReasons
     */
    @JsonProperty("rejectionReasons")
    public String getRejectionReasons() {
        return rejectionReasons;
    }

    /**
     * Sets rejectionReasons.
     * <p>
     * Field description:
     * The rejection reasons. This field is present only when new campaign registration status is &#39;REJECTED&#39;.
     *
     * @param rejectionReasons
     */
    @JsonProperty("rejectionReasons")
    public void setRejectionReasons(String rejectionReasons) {
        this.rejectionReasons = rejectionReasons;
    }

    /**
     * Sets rejectionDetails.
     * <p>
     * Field description:
     * The rejection reasons details. This field is present only when new campaign registration status is &#39;REJECTED&#39;.
     *
     * @param rejectionDetails
     * @return This {@link NumbersCampaignStatusWebhookContent instance}.
     */
    public NumbersCampaignStatusWebhookContent rejectionDetails(List<NumbersRejectionReasonPayload> rejectionDetails) {
        this.rejectionDetails = rejectionDetails;
        return this;
    }

    /**
     * Adds and item into rejectionDetails.
     * <p>
     * Field description:
     * The rejection reasons details. This field is present only when new campaign registration status is &#39;REJECTED&#39;.
     *
     * @param rejectionDetailsItem The item to be added to the list.
     * @return This {@link NumbersCampaignStatusWebhookContent instance}.
     */
    public NumbersCampaignStatusWebhookContent addRejectionDetailsItem(
            NumbersRejectionReasonPayload rejectionDetailsItem) {
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
     * The rejection reasons details. This field is present only when new campaign registration status is &#39;REJECTED&#39;.
     *
     * @return rejectionDetails
     */
    @JsonProperty("rejectionDetails")
    public List<NumbersRejectionReasonPayload> getRejectionDetails() {
        return rejectionDetails;
    }

    /**
     * Sets rejectionDetails.
     * <p>
     * Field description:
     * The rejection reasons details. This field is present only when new campaign registration status is &#39;REJECTED&#39;.
     *
     * @param rejectionDetails
     */
    @JsonProperty("rejectionDetails")
    public void setRejectionDetails(List<NumbersRejectionReasonPayload> rejectionDetails) {
        this.rejectionDetails = rejectionDetails;
    }

    /**
     * Sets rejectionDate.
     * <p>
     * Field description:
     * The rejection date. This field is present only when new campaign registration status is &#39;REJECTED&#39;.
     *
     * @param rejectionDate
     * @return This {@link NumbersCampaignStatusWebhookContent instance}.
     */
    public NumbersCampaignStatusWebhookContent rejectionDate(OffsetDateTime rejectionDate) {
        this.rejectionDate = rejectionDate;
        return this;
    }

    /**
     * Returns rejectionDate.
     * <p>
     * Field description:
     * The rejection date. This field is present only when new campaign registration status is &#39;REJECTED&#39;.
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
     * The rejection date. This field is present only when new campaign registration status is &#39;REJECTED&#39;.
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
        NumbersCampaignStatusWebhookContent numbersCampaignStatusWebhookContent =
                (NumbersCampaignStatusWebhookContent) o;
        return Objects.equals(this.campaignId, numbersCampaignStatusWebhookContent.campaignId)
                && Objects.equals(this.campaignStatus, numbersCampaignStatusWebhookContent.campaignStatus)
                && Objects.equals(this.rejectionReasons, numbersCampaignStatusWebhookContent.rejectionReasons)
                && Objects.equals(this.rejectionDetails, numbersCampaignStatusWebhookContent.rejectionDetails)
                && Objects.equals(this.rejectionDate, numbersCampaignStatusWebhookContent.rejectionDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(campaignId, campaignStatus, rejectionReasons, rejectionDetails, rejectionDate);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class NumbersCampaignStatusWebhookContent {")
                .append(newLine)
                .append("    campaignId: ")
                .append(toIndentedString(campaignId))
                .append(newLine)
                .append("    campaignStatus: ")
                .append(toIndentedString(campaignStatus))
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
