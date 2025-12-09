package com.infobip.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Represents BrandApi model.
 */
public class BrandRequest {
    private String name;
    private String applicationId;
    private String entityId;
    private String website;
    private String type;
    private String referenceId;
    private String legalName;
    private Address address;
    private String countryCode;
    private String supportEmail;
    private String supportPhone;
    private String vertical;
    private String taxId;
    private String taxIdIssuingCountry;
    private AlternateBusinessId alternateBusinessId;
    private String stockExchange;
    private String stockSymbol;
    private String businessContactEmail;

    /**
     * Returns name.
     *
     * @return name
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * Sets name.
     *
     * @param name the name
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Sets name.
     *
     * @param name the name
     * @return This {@link BrandRequest} instance.
     */
    public BrandRequest name(String name) {
        this.name = name;
        return this;
    }

    /**
     * Returns applicationId.
     *
     * @return applicationId
     */
    @JsonProperty("applicationId")
    public String getApplicationId() {
        return applicationId;
    }

    /**
     * Sets applicationId.
     *
     * @param applicationId the application id
     */
    @JsonProperty("applicationId")
    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    /**
     * Sets applicationId.
     *
     * @param applicationId the application id
     * @return This {@link BrandRequest} instance.
     */
    public BrandRequest applicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }

    /**
     * Returns entityId.
     *
     * @return entityId
     */
    @JsonProperty("entityId")
    public String getEntityId() {
        return entityId;
    }

    /**
     * Sets entityId.
     *
     * @param entityId the entity id
     */
    @JsonProperty("entityId")
    public void setEntityId(String entityId) {
        this.entityId = entityId;
    }

    /**
     * Sets entityId.
     *
     * @param entityId the entity id
     * @return This {@link BrandRequest} instance.
     */
    public BrandRequest entityId(String entityId) {
        this.entityId = entityId;
        return this;
    }

    /**
     * Returns website.
     *
     * @return website
     */
    @JsonProperty("website")
    public String getWebsite() {
        return website;
    }

    /**
     * Sets website.
     *
     * @param website the website
     */
    @JsonProperty("website")
    public void setWebsite(String website) {
        this.website = website;
    }

    /**
     * Sets website.
     *
     * @param website the website
     * @return This {@link BrandRequest} instance.
     */
    public BrandRequest website(String website) {
        this.website = website;
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
     * @return This {@link BrandRequest} instance.
     */
    public BrandRequest type(String type) {
        this.type = type;
        return this;
    }

    /**
     * Returns referenceId.
     *
     * @return referenceId
     */
    @JsonProperty("referenceId")
    public String getReferenceId() {
        return referenceId;
    }

    /**
     * Sets referenceId.
     *
     * @param referenceId the reference id
     */
    @JsonProperty("referenceId")
    public void setReferenceId(String referenceId) {
        this.referenceId = referenceId;
    }

    /**
     * Sets referenceId.
     *
     * @param referenceId the reference id
     * @return This {@link BrandRequest} instance.
     */
    public BrandRequest referenceId(String referenceId) {
        this.referenceId = referenceId;
        return this;
    }

    /**
     * Returns legalName.
     *
     * @return legalName
     */
    @JsonProperty("legalName")
    public String getLegalName() {
        return legalName;
    }

    /**
     * Sets legalName.
     *
     * @param legalName the legal name
     */
    @JsonProperty("legalName")
    public void setLegalName(String legalName) {
        this.legalName = legalName;
    }

    /**
     * Sets legalName.
     *
     * @param legalName the legal name
     * @return This {@link BrandRequest} instance.
     */
    public BrandRequest legalName(String legalName) {
        this.legalName = legalName;
        return this;
    }

    /**
     * Returns address.
     *
     * @return address
     */
    @JsonProperty("address")
    public Address getAddress() {
        return address;
    }

    /**
     * Sets address.
     *
     * @param address the address
     */
    @JsonProperty("address")
    public void setAddress(Address address) {
        this.address = address;
    }

    /**
     * Sets address.
     *
     * @param address the address
     * @return This {@link BrandRequest} instance.
     */
    public BrandRequest address(Address address) {
        this.address = address;
        return this;
    }

    /**
     * Returns countryCode.
     *
     * @return countryCode
     */
    @JsonProperty("countryCode")
    public String getCountryCode() {
        return countryCode;
    }

    /**
     * Sets countryCode.
     *
     * @param countryCode the country code
     */
    @JsonProperty("countryCode")
    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    /**
     * Sets countryCode.
     *
     * @param countryCode the country code
     * @return This {@link BrandRequest} instance.
     */
    public BrandRequest countryCode(String countryCode) {
        this.countryCode = countryCode;
        return this;
    }

    /**
     * Returns supportEmail.
     *
     * @return supportEmail
     */
    @JsonProperty("supportEmail")
    public String getSupportEmail() {
        return supportEmail;
    }

    /**
     * Sets supportEmail.
     *
     * @param supportEmail the support email
     */
    @JsonProperty("supportEmail")
    public void setSupportEmail(String supportEmail) {
        this.supportEmail = supportEmail;
    }

    /**
     * Sets supportEmail.
     *
     * @param supportEmail the support email
     * @return This {@link BrandRequest} instance.
     */
    public BrandRequest supportEmail(String supportEmail) {
        this.supportEmail = supportEmail;
        return this;
    }

    /**
     * Returns supportPhone.
     *
     * @return supportPhone
     */
    @JsonProperty("supportPhone")
    public String getSupportPhone() {
        return supportPhone;
    }

    /**
     * Sets supportPhone.
     *
     * @param supportPhone the support phone
     */
    @JsonProperty("supportPhone")
    public void setSupportPhone(String supportPhone) {
        this.supportPhone = supportPhone;
    }

    /**
     * Sets supportPhone.
     *
     * @param supportPhone the support phone
     * @return This {@link BrandRequest} instance.
     */
    public BrandRequest supportPhone(String supportPhone) {
        this.supportPhone = supportPhone;
        return this;
    }

    /**
     * Returns vertical.
     *
     * @return vertical
     */
    @JsonProperty("vertical")
    public String getVertical() {
        return vertical;
    }

    /**
     * Sets vertical.
     *
     * @param vertical the vertical
     */
    @JsonProperty("vertical")
    public void setVertical(String vertical) {
        this.vertical = vertical;
    }

    /**
     * Sets vertical.
     *
     * @param vertical the vertical
     * @return This {@link BrandRequest} instance.
     */
    public BrandRequest vertical(String vertical) {
        this.vertical = vertical;
        return this;
    }

    /**
     * Returns taxId.
     *
     * @return taxId
     */
    @JsonProperty("taxId")
    public String getTaxId() {
        return taxId;
    }

    /**
     * Sets taxId.
     *
     * @param taxId the tax id
     */
    @JsonProperty("taxId")
    public void setTaxId(String taxId) {
        this.taxId = taxId;
    }

    /**
     * Sets taxId.
     *
     * @param taxId the tax id
     * @return This {@link BrandRequest} instance.
     */
    public BrandRequest taxId(String taxId) {
        this.taxId = taxId;
        return this;
    }

    /**
     * Returns taxIdIssuingCountry.
     *
     * @return taxIdIssuingCountry
     */
    @JsonProperty("taxIdIssuingCountry")
    public String getTaxIdIssuingCountry() {
        return taxIdIssuingCountry;
    }

    /**
     * Sets taxIdIssuingCountry.
     *
     * @param taxIdIssuingCountry the tax id issuing country
     */
    @JsonProperty("taxIdIssuingCountry")
    public void setTaxIdIssuingCountry(String taxIdIssuingCountry) {
        this.taxIdIssuingCountry = taxIdIssuingCountry;
    }

    /**
     * Sets taxIdIssuingCountry.
     *
     * @param taxIdIssuingCountry the tax id issuing country
     * @return This {@link BrandRequest} instance.
     */
    public BrandRequest taxIdIssuingCountry(String taxIdIssuingCountry) {
        this.taxIdIssuingCountry = taxIdIssuingCountry;
        return this;
    }

    /**
     * Returns alternateBusinessId.
     *
     * @return alternateBusinessId
     */
    @JsonProperty("alternateBusinessId")
    public AlternateBusinessId getAlternateBusinessId() {
        return alternateBusinessId;
    }

    /**
     * Sets alternateBusinessId.
     *
     * @param alternateBusinessId the alternate business id
     */
    @JsonProperty("alternateBusinessId")
    public void setAlternateBusinessId(AlternateBusinessId alternateBusinessId) {
        this.alternateBusinessId = alternateBusinessId;
    }

    /**
     * Sets alternateBusinessId.
     *
     * @param alternateBusinessId the alternate business id
     * @return This {@link BrandRequest} instance.
     */
    public BrandRequest alternateBusinessId(AlternateBusinessId alternateBusinessId) {
        this.alternateBusinessId = alternateBusinessId;
        return this;
    }

    /**
     * Returns stockExchange.
     *
     * @return stockExchange
     */
    @JsonProperty("stockExchange")
    public String getStockExchange() {
        return stockExchange;
    }

    /**
     * Sets stockExchange.
     *
     * @param stockExchange the stock exchange
     */
    @JsonProperty("stockExchange")
    public void setStockExchange(String stockExchange) {
        this.stockExchange = stockExchange;
    }

    /**
     * Sets stockExchange.
     *
     * @param stockExchange the stock exchange
     * @return This {@link BrandRequest} instance.
     */
    public BrandRequest stockExchange(String stockExchange) {
        this.stockExchange = stockExchange;
        return this;
    }

    /**
     * Returns stockSymbol.
     *
     * @return stockSymbol
     */
    @JsonProperty("stockSymbol")
    public String getStockSymbol() {
        return stockSymbol;
    }

    /**
     * Sets stockSymbol.
     *
     * @param stockSymbol the stock symbol
     */
    @JsonProperty("stockSymbol")
    public void setStockSymbol(String stockSymbol) {
        this.stockSymbol = stockSymbol;
    }

    /**
     * Sets stockSymbol.
     *
     * @param stockSymbol the stock symbol
     * @return This {@link BrandRequest} instance.
     */
    public BrandRequest stockSymbol(String stockSymbol) {
        this.stockSymbol = stockSymbol;
        return this;
    }

    /**
     * Returns businessContactEmail.
     *
     * @return businessContactEmail
     */
    @JsonProperty("businessContactEmail")
    public String getBusinessContactEmail() {
        return businessContactEmail;
    }

    /**
     * Sets businessContactEmail.
     *
     * @param businessContactEmail the business contact email
     */
    @JsonProperty("businessContactEmail")
    public void setBusinessContactEmail(String businessContactEmail) {
        this.businessContactEmail = businessContactEmail;
    }

    /**
     * Sets businessContactEmail.
     *
     * @param businessContactEmail the business contact email
     * @return This {@link BrandRequest} instance.
     */
    public BrandRequest businessContactEmail(String businessContactEmail) {
        this.businessContactEmail = businessContactEmail;
        return this;
    }
}
