package com.infobip.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.LocalDateTime;

public class BrandVetResponse {
    private String vetId;
    private String brandId;
    private int score;
    private LocalDateTime vettedDate;
    private LocalDateTime enhancedVettedDate;
    private String status;
    private String type;
    private boolean imported;
    private String importedVetProvider;
    /**
     * Returns vetId.
     *
     * @return vetId
     */
    @JsonProperty("vetId")
    public String getVetId() {
        return vetId;
    }

    /**
     * Sets vetId.
     *
     * @param vetId the vetId
     */
    @JsonProperty("vetId")
    public void setVetId(String vetId) {
        this.vetId = vetId;
    }

    /**
     * Sets vetId.
     *
     * @param vetId the vetId
     * @return This {@link BrandVetResponse} instance.
     */
    public BrandVetResponse vetId(String vetId) {
        this.vetId = vetId;
        return this;
    }

    /**
     * Returns brandId.
     *
     * @return brandId
     */
    @JsonProperty("brandId")
    public String getBrandId() {
        return brandId;
    }

    /**
     * Sets brandId.
     *
     * @param brandId the brandId
     */
    @JsonProperty("brandId")
    public void setBrandId(String brandId) {
        this.brandId = brandId;
    }

    /**
     * Sets brandId.
     *
     * @param brandId the brandId
     * @return This {@link BrandVetResponse} instance.
     */
    public BrandVetResponse brandId(String brandId) {
        this.brandId = brandId;
        return this;
    }

    /**
     * Returns score.
     *
     * @return score
     */
    @JsonProperty("score")
    public int getScore() {
        return score;
    }

    /**
     * Sets score.
     *
     * @param score the score
     */
    @JsonProperty("score")
    public void setScore(int score) {
        this.score = score;
    }

    /**
     * Sets score.
     *
     * @param score the score
     * @return This {@link BrandVetResponse} instance.
     */
    public BrandVetResponse score(int score) {
        this.score = score;
        return this;
    }

    /**
     * Returns vettedDate.
     *
     * @return vettedDate
     */
    @JsonProperty("vettedDate")
    public LocalDateTime getVettedDate() {
        return vettedDate;
    }

    /**
     * Sets vettedDate.
     *
     * @param vettedDate the vettedDate
     */
    @JsonProperty("vettedDate")
    public void setVettedDate(LocalDateTime vettedDate) {
        this.vettedDate = vettedDate;
    }

    /**
     * Sets vettedDate.
     *
     * @param vettedDate the vettedDate
     * @return This {@link BrandVetResponse} instance.
     */
    public BrandVetResponse vettedDate(LocalDateTime vettedDate) {
        this.vettedDate = vettedDate;
        return this;
    }

    /**
     * Returns enhancedVettedDate.
     *
     * @return enhancedVettedDate
     */
    @JsonProperty("enhancedVettedDate")
    public LocalDateTime getEnhancedVettedDate() {
        return enhancedVettedDate;
    }

    /**
     * Sets enhancedVettedDate.
     *
     * @param enhancedVettedDate the enhancedVettedDate
     */
    @JsonProperty("enhancedVettedDate")
    public void setEnhancedVettedDate(LocalDateTime enhancedVettedDate) {
        this.enhancedVettedDate = enhancedVettedDate;
    }

    /**
     * Sets enhancedVettedDate.
     *
     * @param enhancedVettedDate the enhancedVettedDate
     * @return This {@link BrandVetResponse} instance.
     */
    public BrandVetResponse enhancedVettedDate(LocalDateTime enhancedVettedDate) {
        this.enhancedVettedDate = enhancedVettedDate;
        return this;
    }

    /**
     * Returns status.
     *
     * @return status
     */
    @JsonProperty("status")
    public String getStatus() {
        return status;
    }

    /**
     * Sets status.
     *
     * @param status the status
     */
    @JsonProperty("status")
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * Sets status.
     *
     * @param status the status
     * @return This {@link BrandVetResponse} instance.
     */
    public BrandVetResponse status(String status) {
        this.status = status;
        return this;
    }

    /**
     * Returns type.
     *
     * @return type
     */
    @JsonProperty("type")
    public String getType() {
        return type;
    }

    /**
     * Sets type.
     *
     * @param type the type
     */
    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    /**
     * Sets type.
     *
     * @param type the type
     * @return This {@link BrandVetResponse} instance.
     */
    public BrandVetResponse type(String type) {
        this.type = type;
        return this;
    }

    /**
     * Returns imported.
     *
     * @return imported
     */
    @JsonProperty("imported")
    public boolean isImported() {
        return imported;
    }

    /**
     * Sets imported.
     *
     * @param imported the imported
     */
    @JsonProperty("imported")
    public void setImported(boolean imported) {
        this.imported = imported;
    }

    /**
     * Sets imported.
     *
     * @param imported the imported
     * @return This {@link BrandVetResponse} instance.
     */
    public BrandVetResponse imported(boolean imported) {
        this.imported = imported;
        return this;
    }

    /**
     * Returns importedVetProvider.
     *
     * @return importedVetProvider
     */
    @JsonProperty("importedVetProvider")
    public String getImportedVetProvider() {
        return importedVetProvider;
    }

    /**
     * Sets importedVetProvider.
     *
     * @param importedVetProvider the importedVetProvider
     */
    @JsonProperty("importedVetProvider")
    public void setImportedVetProvider(String importedVetProvider) {
        this.importedVetProvider = importedVetProvider;
    }

    /**
     * Sets importedVetProvider.
     *
     * @param importedVetProvider the importedVetProvider
     * @return This {@link BrandVetResponse} instance.
     */
    public BrandVetResponse importedVetProvider(String importedVetProvider) {
        this.importedVetProvider = importedVetProvider;
        return this;
    }
}
