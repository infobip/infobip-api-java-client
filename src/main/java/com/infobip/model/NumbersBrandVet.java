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
import java.util.Objects;
import java.util.UUID;

/**
 * The list of the results for this page.
 */
public class NumbersBrandVet {

    private UUID vetId;

    private UUID brandId;

    private Integer score;

    private OffsetDateTime vettedDate;

    private OffsetDateTime enhancedVettedDate;

    private NumbersBrandVetStatus status;

    private NumbersVettingType type;

    private Boolean imported;

    private NumbersVettingProvider importedVetProvider;

    /**
     * Sets vetId.
     * <p>
     * Field description:
     * The ID of the vet record.
     *
     * @param vetId
     * @return This {@link NumbersBrandVet instance}.
     */
    public NumbersBrandVet vetId(UUID vetId) {
        this.vetId = vetId;
        return this;
    }

    /**
     * Returns vetId.
     * <p>
     * Field description:
     * The ID of the vet record.
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
     * The ID of the vet record.
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
     * The ID of the brand the vet belongs to.
     *
     * @param brandId
     * @return This {@link NumbersBrandVet instance}.
     */
    public NumbersBrandVet brandId(UUID brandId) {
        this.brandId = brandId;
        return this;
    }

    /**
     * Returns brandId.
     * <p>
     * Field description:
     * The ID of the brand the vet belongs to.
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
     * The ID of the brand the vet belongs to.
     *
     * @param brandId
     */
    @JsonProperty("brandId")
    public void setBrandId(UUID brandId) {
        this.brandId = brandId;
    }

    /**
     * Sets score.
     * <p>
     * Field description:
     * The score the brand received after being vetted.
     *
     * @param score
     * @return This {@link NumbersBrandVet instance}.
     */
    public NumbersBrandVet score(Integer score) {
        this.score = score;
        return this;
    }

    /**
     * Returns score.
     * <p>
     * Field description:
     * The score the brand received after being vetted.
     *
     * @return score
     */
    @JsonProperty("score")
    public Integer getScore() {
        return score;
    }

    /**
     * Sets score.
     * <p>
     * Field description:
     * The score the brand received after being vetted.
     *
     * @param score
     */
    @JsonProperty("score")
    public void setScore(Integer score) {
        this.score = score;
    }

    /**
     * Sets vettedDate.
     * <p>
     * Field description:
     * The date the vet was completed.
     *
     * @param vettedDate
     * @return This {@link NumbersBrandVet instance}.
     */
    public NumbersBrandVet vettedDate(OffsetDateTime vettedDate) {
        this.vettedDate = vettedDate;
        return this;
    }

    /**
     * Returns vettedDate.
     * <p>
     * Field description:
     * The date the vet was completed.
     *
     * @return vettedDate
     */
    @JsonProperty("vettedDate")
    public OffsetDateTime getVettedDate() {
        return vettedDate;
    }

    /**
     * Sets vettedDate.
     * <p>
     * Field description:
     * The date the vet was completed.
     *
     * @param vettedDate
     */
    @JsonProperty("vettedDate")
    public void setVettedDate(OffsetDateTime vettedDate) {
        this.vettedDate = vettedDate;
    }

    /**
     * Sets enhancedVettedDate.
     * <p>
     * Field description:
     * The date the vet was completed if it was an enhanced vet or if it was converted to enhanced from a standard vet.
     *
     * @param enhancedVettedDate
     * @return This {@link NumbersBrandVet instance}.
     */
    public NumbersBrandVet enhancedVettedDate(OffsetDateTime enhancedVettedDate) {
        this.enhancedVettedDate = enhancedVettedDate;
        return this;
    }

    /**
     * Returns enhancedVettedDate.
     * <p>
     * Field description:
     * The date the vet was completed if it was an enhanced vet or if it was converted to enhanced from a standard vet.
     *
     * @return enhancedVettedDate
     */
    @JsonProperty("enhancedVettedDate")
    public OffsetDateTime getEnhancedVettedDate() {
        return enhancedVettedDate;
    }

    /**
     * Sets enhancedVettedDate.
     * <p>
     * Field description:
     * The date the vet was completed if it was an enhanced vet or if it was converted to enhanced from a standard vet.
     *
     * @param enhancedVettedDate
     */
    @JsonProperty("enhancedVettedDate")
    public void setEnhancedVettedDate(OffsetDateTime enhancedVettedDate) {
        this.enhancedVettedDate = enhancedVettedDate;
    }

    /**
     * Sets status.
     *
     * @param status
     * @return This {@link NumbersBrandVet instance}.
     */
    public NumbersBrandVet status(NumbersBrandVetStatus status) {
        this.status = status;
        return this;
    }

    /**
     * Returns status.
     *
     * @return status
     */
    @JsonProperty("status")
    public NumbersBrandVetStatus getStatus() {
        return status;
    }

    /**
     * Sets status.
     *
     * @param status
     */
    @JsonProperty("status")
    public void setStatus(NumbersBrandVetStatus status) {
        this.status = status;
    }

    /**
     * Sets type.
     * <p>
     * The field is required.
     *
     * @param type
     * @return This {@link NumbersBrandVet instance}.
     */
    public NumbersBrandVet type(NumbersVettingType type) {
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
    public NumbersVettingType getType() {
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
    public void setType(NumbersVettingType type) {
        this.type = type;
    }

    /**
     * Sets imported.
     * <p>
     * Field description:
     * Showing is brand vet imported.
     *
     * @param imported
     * @return This {@link NumbersBrandVet instance}.
     */
    public NumbersBrandVet imported(Boolean imported) {
        this.imported = imported;
        return this;
    }

    /**
     * Returns imported.
     * <p>
     * Field description:
     * Showing is brand vet imported.
     *
     * @return imported
     */
    @JsonProperty("imported")
    public Boolean getImported() {
        return imported;
    }

    /**
     * Sets imported.
     * <p>
     * Field description:
     * Showing is brand vet imported.
     *
     * @param imported
     */
    @JsonProperty("imported")
    public void setImported(Boolean imported) {
        this.imported = imported;
    }

    /**
     * Sets importedVetProvider.
     *
     * @param importedVetProvider
     * @return This {@link NumbersBrandVet instance}.
     */
    public NumbersBrandVet importedVetProvider(NumbersVettingProvider importedVetProvider) {
        this.importedVetProvider = importedVetProvider;
        return this;
    }

    /**
     * Returns importedVetProvider.
     *
     * @return importedVetProvider
     */
    @JsonProperty("importedVetProvider")
    public NumbersVettingProvider getImportedVetProvider() {
        return importedVetProvider;
    }

    /**
     * Sets importedVetProvider.
     *
     * @param importedVetProvider
     */
    @JsonProperty("importedVetProvider")
    public void setImportedVetProvider(NumbersVettingProvider importedVetProvider) {
        this.importedVetProvider = importedVetProvider;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        NumbersBrandVet numbersBrandVet = (NumbersBrandVet) o;
        return Objects.equals(this.vetId, numbersBrandVet.vetId)
                && Objects.equals(this.brandId, numbersBrandVet.brandId)
                && Objects.equals(this.score, numbersBrandVet.score)
                && Objects.equals(this.vettedDate, numbersBrandVet.vettedDate)
                && Objects.equals(this.enhancedVettedDate, numbersBrandVet.enhancedVettedDate)
                && Objects.equals(this.status, numbersBrandVet.status)
                && Objects.equals(this.type, numbersBrandVet.type)
                && Objects.equals(this.imported, numbersBrandVet.imported)
                && Objects.equals(this.importedVetProvider, numbersBrandVet.importedVetProvider);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                vetId, brandId, score, vettedDate, enhancedVettedDate, status, type, imported, importedVetProvider);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class NumbersBrandVet {")
                .append(newLine)
                .append("    vetId: ")
                .append(toIndentedString(vetId))
                .append(newLine)
                .append("    brandId: ")
                .append(toIndentedString(brandId))
                .append(newLine)
                .append("    score: ")
                .append(toIndentedString(score))
                .append(newLine)
                .append("    vettedDate: ")
                .append(toIndentedString(vettedDate))
                .append(newLine)
                .append("    enhancedVettedDate: ")
                .append(toIndentedString(enhancedVettedDate))
                .append(newLine)
                .append("    status: ")
                .append(toIndentedString(status))
                .append(newLine)
                .append("    type: ")
                .append(toIndentedString(type))
                .append(newLine)
                .append("    imported: ")
                .append(toIndentedString(imported))
                .append(newLine)
                .append("    importedVetProvider: ")
                .append(toIndentedString(importedVetProvider))
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
