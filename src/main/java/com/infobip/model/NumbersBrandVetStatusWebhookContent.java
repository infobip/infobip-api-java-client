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
public class NumbersBrandVetStatusWebhookContent {

    private UUID vetId;

    private UUID brandId;

    private Integer vettingScore;

    private NumbersWebhookBrandVetStatus brandVettingStatus;

    private NumbersWebhookBrandVettingType vetType;

    /**
     * Sets vetId.
     * <p>
     * Field description:
     * The ID of the brand vet.
     *
     * @param vetId
     * @return This {@link NumbersBrandVetStatusWebhookContent instance}.
     */
    public NumbersBrandVetStatusWebhookContent vetId(UUID vetId) {
        this.vetId = vetId;
        return this;
    }

    /**
     * Returns vetId.
     * <p>
     * Field description:
     * The ID of the brand vet.
     *
     * @return vetId
     */
    @JsonProperty("vetId")
    public UUID getVetId() {
        return vetId;
    }

    /**
     * Sets vetId.
     * <p>
     * Field description:
     * The ID of the brand vet.
     *
     * @param vetId
     */
    @JsonProperty("vetId")
    public void setVetId(UUID vetId) {
        this.vetId = vetId;
    }

    /**
     * Sets brandId.
     * <p>
     * Field description:
     * The ID of the brand.
     *
     * @param brandId
     * @return This {@link NumbersBrandVetStatusWebhookContent instance}.
     */
    public NumbersBrandVetStatusWebhookContent brandId(UUID brandId) {
        this.brandId = brandId;
        return this;
    }

    /**
     * Returns brandId.
     * <p>
     * Field description:
     * The ID of the brand.
     *
     * @return brandId
     */
    @JsonProperty("brandId")
    public UUID getBrandId() {
        return brandId;
    }

    /**
     * Sets brandId.
     * <p>
     * Field description:
     * The ID of the brand.
     *
     * @param brandId
     */
    @JsonProperty("brandId")
    public void setBrandId(UUID brandId) {
        this.brandId = brandId;
    }

    /**
     * Sets vettingScore.
     * <p>
     * Field description:
     * The vetting score of a brand vet. This can be empty if score isn&#39;t present.
     *
     * @param vettingScore
     * @return This {@link NumbersBrandVetStatusWebhookContent instance}.
     */
    public NumbersBrandVetStatusWebhookContent vettingScore(Integer vettingScore) {
        this.vettingScore = vettingScore;
        return this;
    }

    /**
     * Returns vettingScore.
     * <p>
     * Field description:
     * The vetting score of a brand vet. This can be empty if score isn&#39;t present.
     *
     * @return vettingScore
     */
    @JsonProperty("vettingScore")
    public Integer getVettingScore() {
        return vettingScore;
    }

    /**
     * Sets vettingScore.
     * <p>
     * Field description:
     * The vetting score of a brand vet. This can be empty if score isn&#39;t present.
     *
     * @param vettingScore
     */
    @JsonProperty("vettingScore")
    public void setVettingScore(Integer vettingScore) {
        this.vettingScore = vettingScore;
    }

    /**
     * Sets brandVettingStatus.
     *
     * @param brandVettingStatus
     * @return This {@link NumbersBrandVetStatusWebhookContent instance}.
     */
    public NumbersBrandVetStatusWebhookContent brandVettingStatus(NumbersWebhookBrandVetStatus brandVettingStatus) {
        this.brandVettingStatus = brandVettingStatus;
        return this;
    }

    /**
     * Returns brandVettingStatus.
     *
     * @return brandVettingStatus
     */
    @JsonProperty("brandVettingStatus")
    public NumbersWebhookBrandVetStatus getBrandVettingStatus() {
        return brandVettingStatus;
    }

    /**
     * Sets brandVettingStatus.
     *
     * @param brandVettingStatus
     */
    @JsonProperty("brandVettingStatus")
    public void setBrandVettingStatus(NumbersWebhookBrandVetStatus brandVettingStatus) {
        this.brandVettingStatus = brandVettingStatus;
    }

    /**
     * Sets vetType.
     *
     * @param vetType
     * @return This {@link NumbersBrandVetStatusWebhookContent instance}.
     */
    public NumbersBrandVetStatusWebhookContent vetType(NumbersWebhookBrandVettingType vetType) {
        this.vetType = vetType;
        return this;
    }

    /**
     * Returns vetType.
     *
     * @return vetType
     */
    @JsonProperty("vetType")
    public NumbersWebhookBrandVettingType getVetType() {
        return vetType;
    }

    /**
     * Sets vetType.
     *
     * @param vetType
     */
    @JsonProperty("vetType")
    public void setVetType(NumbersWebhookBrandVettingType vetType) {
        this.vetType = vetType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        NumbersBrandVetStatusWebhookContent numbersBrandVetStatusWebhookContent =
                (NumbersBrandVetStatusWebhookContent) o;
        return Objects.equals(this.vetId, numbersBrandVetStatusWebhookContent.vetId)
                && Objects.equals(this.brandId, numbersBrandVetStatusWebhookContent.brandId)
                && Objects.equals(this.vettingScore, numbersBrandVetStatusWebhookContent.vettingScore)
                && Objects.equals(this.brandVettingStatus, numbersBrandVetStatusWebhookContent.brandVettingStatus)
                && Objects.equals(this.vetType, numbersBrandVetStatusWebhookContent.vetType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vetId, brandId, vettingScore, brandVettingStatus, vetType);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class NumbersBrandVetStatusWebhookContent {")
                .append(newLine)
                .append("    vetId: ")
                .append(toIndentedString(vetId))
                .append(newLine)
                .append("    brandId: ")
                .append(toIndentedString(brandId))
                .append(newLine)
                .append("    vettingScore: ")
                .append(toIndentedString(vettingScore))
                .append(newLine)
                .append("    brandVettingStatus: ")
                .append(toIndentedString(brandVettingStatus))
                .append(newLine)
                .append("    vetType: ")
                .append(toIndentedString(vetType))
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
