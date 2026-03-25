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
 * The list of the results for this page.
 */
public class NumbersNumberPoolUsageApiResponse {

    private String numberPoolId;

    private String campaignId;

    private String campaignName;

    /**
     * Sets numberPoolId.
     * <p>
     * Field description:
     * Unique identifier of the number pool.
     *
     * @param numberPoolId
     * @return This {@link NumbersNumberPoolUsageApiResponse instance}.
     */
    public NumbersNumberPoolUsageApiResponse numberPoolId(String numberPoolId) {
        this.numberPoolId = numberPoolId;
        return this;
    }

    /**
     * Returns numberPoolId.
     * <p>
     * Field description:
     * Unique identifier of the number pool.
     *
     * @return numberPoolId
     */
    @JsonProperty("numberPoolId")
    public String getNumberPoolId() {
        return numberPoolId;
    }

    /**
     * Sets numberPoolId.
     * <p>
     * Field description:
     * Unique identifier of the number pool.
     *
     * @param numberPoolId
     */
    @JsonProperty("numberPoolId")
    public void setNumberPoolId(String numberPoolId) {
        this.numberPoolId = numberPoolId;
    }

    /**
     * Sets campaignId.
     * <p>
     * Field description:
     * Unique identifier of the campaign currently associated with this number pool. If the number pool is unassigned, this field will be empty.
     *
     * @param campaignId
     * @return This {@link NumbersNumberPoolUsageApiResponse instance}.
     */
    public NumbersNumberPoolUsageApiResponse campaignId(String campaignId) {
        this.campaignId = campaignId;
        return this;
    }

    /**
     * Returns campaignId.
     * <p>
     * Field description:
     * Unique identifier of the campaign currently associated with this number pool. If the number pool is unassigned, this field will be empty.
     *
     * @return campaignId
     */
    @JsonProperty("campaignId")
    public String getCampaignId() {
        return campaignId;
    }

    /**
     * Sets campaignId.
     * <p>
     * Field description:
     * Unique identifier of the campaign currently associated with this number pool. If the number pool is unassigned, this field will be empty.
     *
     * @param campaignId
     */
    @JsonProperty("campaignId")
    public void setCampaignId(String campaignId) {
        this.campaignId = campaignId;
    }

    /**
     * Sets campaignName.
     * <p>
     * Field description:
     * Name of the associated campaign. Will be empty if no campaign is associated.
     *
     * @param campaignName
     * @return This {@link NumbersNumberPoolUsageApiResponse instance}.
     */
    public NumbersNumberPoolUsageApiResponse campaignName(String campaignName) {
        this.campaignName = campaignName;
        return this;
    }

    /**
     * Returns campaignName.
     * <p>
     * Field description:
     * Name of the associated campaign. Will be empty if no campaign is associated.
     *
     * @return campaignName
     */
    @JsonProperty("campaignName")
    public String getCampaignName() {
        return campaignName;
    }

    /**
     * Sets campaignName.
     * <p>
     * Field description:
     * Name of the associated campaign. Will be empty if no campaign is associated.
     *
     * @param campaignName
     */
    @JsonProperty("campaignName")
    public void setCampaignName(String campaignName) {
        this.campaignName = campaignName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        NumbersNumberPoolUsageApiResponse numbersNumberPoolUsageApiResponse = (NumbersNumberPoolUsageApiResponse) o;
        return Objects.equals(this.numberPoolId, numbersNumberPoolUsageApiResponse.numberPoolId)
                && Objects.equals(this.campaignId, numbersNumberPoolUsageApiResponse.campaignId)
                && Objects.equals(this.campaignName, numbersNumberPoolUsageApiResponse.campaignName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numberPoolId, campaignId, campaignName);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class NumbersNumberPoolUsageApiResponse {")
                .append(newLine)
                .append("    numberPoolId: ")
                .append(toIndentedString(numberPoolId))
                .append(newLine)
                .append("    campaignId: ")
                .append(toIndentedString(campaignId))
                .append(newLine)
                .append("    campaignName: ")
                .append(toIndentedString(campaignName))
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
