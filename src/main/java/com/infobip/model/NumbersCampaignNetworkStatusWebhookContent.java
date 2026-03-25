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
import java.util.UUID;

/**
 * Event content.
 */
public class NumbersCampaignNetworkStatusWebhookContent {

    private UUID campaignId;

    private NumbersCampaignRegistrar campaignNetwork;

    private NumbersWebhookCampaignNetworkStatus campaignNetworkStatus;

    /**
     * Sets campaignId.
     * <p>
     * Field description:
     * The ID of campaign.
     *
     * @param campaignId
     * @return This {@link NumbersCampaignNetworkStatusWebhookContent instance}.
     */
    public NumbersCampaignNetworkStatusWebhookContent campaignId(UUID campaignId) {
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
     * Sets campaignNetwork.
     *
     * @param campaignNetwork
     * @return This {@link NumbersCampaignNetworkStatusWebhookContent instance}.
     */
    public NumbersCampaignNetworkStatusWebhookContent campaignNetwork(NumbersCampaignRegistrar campaignNetwork) {
        this.campaignNetwork = campaignNetwork;
        return this;
    }

    /**
     * Returns campaignNetwork.
     *
     * @return campaignNetwork
     */
    @JsonProperty("campaignNetwork")
    public NumbersCampaignRegistrar getCampaignNetwork() {
        return campaignNetwork;
    }

    /**
     * Sets campaignNetwork.
     *
     * @param campaignNetwork
     */
    @JsonProperty("campaignNetwork")
    public void setCampaignNetwork(NumbersCampaignRegistrar campaignNetwork) {
        this.campaignNetwork = campaignNetwork;
    }

    /**
     * Sets campaignNetworkStatus.
     *
     * @param campaignNetworkStatus
     * @return This {@link NumbersCampaignNetworkStatusWebhookContent instance}.
     */
    public NumbersCampaignNetworkStatusWebhookContent campaignNetworkStatus(
            NumbersWebhookCampaignNetworkStatus campaignNetworkStatus) {
        this.campaignNetworkStatus = campaignNetworkStatus;
        return this;
    }

    /**
     * Returns campaignNetworkStatus.
     *
     * @return campaignNetworkStatus
     */
    @JsonProperty("campaignNetworkStatus")
    public NumbersWebhookCampaignNetworkStatus getCampaignNetworkStatus() {
        return campaignNetworkStatus;
    }

    /**
     * Sets campaignNetworkStatus.
     *
     * @param campaignNetworkStatus
     */
    @JsonProperty("campaignNetworkStatus")
    public void setCampaignNetworkStatus(NumbersWebhookCampaignNetworkStatus campaignNetworkStatus) {
        this.campaignNetworkStatus = campaignNetworkStatus;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        NumbersCampaignNetworkStatusWebhookContent numbersCampaignNetworkStatusWebhookContent =
                (NumbersCampaignNetworkStatusWebhookContent) o;
        return Objects.equals(this.campaignId, numbersCampaignNetworkStatusWebhookContent.campaignId)
                && Objects.equals(this.campaignNetwork, numbersCampaignNetworkStatusWebhookContent.campaignNetwork)
                && Objects.equals(
                        this.campaignNetworkStatus, numbersCampaignNetworkStatusWebhookContent.campaignNetworkStatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(campaignId, campaignNetwork, campaignNetworkStatus);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class NumbersCampaignNetworkStatusWebhookContent {")
                .append(newLine)
                .append("    campaignId: ")
                .append(toIndentedString(campaignId))
                .append(newLine)
                .append("    campaignNetwork: ")
                .append(toIndentedString(campaignNetwork))
                .append(newLine)
                .append("    campaignNetworkStatus: ")
                .append(toIndentedString(campaignNetworkStatus))
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
