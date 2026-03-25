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
 * Represents NumbersGovernmentBrand model.
 */
public class NumbersGovernmentBrand extends NumbersBrand {

    private String referenceId;

    private NumbersAddress address;

    private String countryCode;

    private String supportPhone;

    private String supportEmail;

    private String businessContactFirstName;

    private String businessContactLastName;

    private String businessDBA;

    private String legalName;

    private NumbersBusinessIdentifier alternateBusinessId;

    private NumbersVertical vertical;

    private String taxId;

    private String taxIdIssuingCountry;

    /**
     * Constructs a new {@link NumbersGovernmentBrand} instance.
     */
    public NumbersGovernmentBrand() {
        super("TENDLC_GOVERNMENT");
    }

    /**
     * Sets referenceId.
     * <p>
     * Field description:
     * Unique user defined ID for the brand. While not required, it is recommended to supply a referenceId as the uniqueness constraint will help ensure a brand is not accidentally created multiple times. Subsequent create requests with the same referenceId will be rejected with an error.
     *
     * @param referenceId
     * @return This {@link NumbersGovernmentBrand instance}.
     */
    public NumbersGovernmentBrand referenceId(String referenceId) {
        this.referenceId = referenceId;
        return this;
    }

    /**
     * Returns referenceId.
     * <p>
     * Field description:
     * Unique user defined ID for the brand. While not required, it is recommended to supply a referenceId as the uniqueness constraint will help ensure a brand is not accidentally created multiple times. Subsequent create requests with the same referenceId will be rejected with an error.
     *
     * @return referenceId
     */
    @JsonProperty("referenceId")
    public String getReferenceId() {
        return referenceId;
    }

    /**
     * Sets referenceId.
     * <p>
     * Field description:
     * Unique user defined ID for the brand. While not required, it is recommended to supply a referenceId as the uniqueness constraint will help ensure a brand is not accidentally created multiple times. Subsequent create requests with the same referenceId will be rejected with an error.
     *
     * @param referenceId
     */
    @JsonProperty("referenceId")
    public void setReferenceId(String referenceId) {
        this.referenceId = referenceId;
    }

    /**
     * Sets address.
     * <p>
     * The field is required.
     *
     * @param address
     * @return This {@link NumbersGovernmentBrand instance}.
     */
    public NumbersGovernmentBrand address(NumbersAddress address) {
        this.address = address;
        return this;
    }

    /**
     * Returns address.
     * <p>
     * The field is required.
     *
     * @return address
     */
    @JsonProperty("address")
    public NumbersAddress getAddress() {
        return address;
    }

    /**
     * Sets address.
     * <p>
     * The field is required.
     *
     * @param address
     */
    @JsonProperty("address")
    public void setAddress(NumbersAddress address) {
        this.address = address;
    }

    /**
     * Sets countryCode.
     * <p>
     * Field description:
     * The country where the brand is located.
     * <p>
     * The field is required.
     *
     * @param countryCode
     * @return This {@link NumbersGovernmentBrand instance}.
     */
    public NumbersGovernmentBrand countryCode(String countryCode) {
        this.countryCode = countryCode;
        return this;
    }

    /**
     * Returns countryCode.
     * <p>
     * Field description:
     * The country where the brand is located.
     * <p>
     * The field is required.
     *
     * @return countryCode
     */
    @JsonProperty("countryCode")
    public String getCountryCode() {
        return countryCode;
    }

    /**
     * Sets countryCode.
     * <p>
     * Field description:
     * The country where the brand is located.
     * <p>
     * The field is required.
     *
     * @param countryCode
     */
    @JsonProperty("countryCode")
    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    /**
     * Sets supportPhone.
     * <p>
     * Field description:
     * The business phone number to contact about brand compliance issues.
     * <p>
     * The field is required.
     *
     * @param supportPhone
     * @return This {@link NumbersGovernmentBrand instance}.
     */
    public NumbersGovernmentBrand supportPhone(String supportPhone) {
        this.supportPhone = supportPhone;
        return this;
    }

    /**
     * Returns supportPhone.
     * <p>
     * Field description:
     * The business phone number to contact about brand compliance issues.
     * <p>
     * The field is required.
     *
     * @return supportPhone
     */
    @JsonProperty("supportPhone")
    public String getSupportPhone() {
        return supportPhone;
    }

    /**
     * Sets supportPhone.
     * <p>
     * Field description:
     * The business phone number to contact about brand compliance issues.
     * <p>
     * The field is required.
     *
     * @param supportPhone
     */
    @JsonProperty("supportPhone")
    public void setSupportPhone(String supportPhone) {
        this.supportPhone = supportPhone;
    }

    /**
     * Sets supportEmail.
     * <p>
     * Field description:
     * The business email address to contact about brand compliance issues. Must be a well formed email address that does not include a &#39;&#x3D;&#39; character.
     * <p>
     * The field is required.
     *
     * @param supportEmail
     * @return This {@link NumbersGovernmentBrand instance}.
     */
    public NumbersGovernmentBrand supportEmail(String supportEmail) {
        this.supportEmail = supportEmail;
        return this;
    }

    /**
     * Returns supportEmail.
     * <p>
     * Field description:
     * The business email address to contact about brand compliance issues. Must be a well formed email address that does not include a &#39;&#x3D;&#39; character.
     * <p>
     * The field is required.
     *
     * @return supportEmail
     */
    @JsonProperty("supportEmail")
    public String getSupportEmail() {
        return supportEmail;
    }

    /**
     * Sets supportEmail.
     * <p>
     * Field description:
     * The business email address to contact about brand compliance issues. Must be a well formed email address that does not include a &#39;&#x3D;&#39; character.
     * <p>
     * The field is required.
     *
     * @param supportEmail
     */
    @JsonProperty("supportEmail")
    public void setSupportEmail(String supportEmail) {
        this.supportEmail = supportEmail;
    }

    /**
     * Sets businessContactFirstName.
     * <p>
     * Field description:
     * First name of the primary contact person for the brand or business entity. Used for verification or compliance outreach.
     *
     * @param businessContactFirstName
     * @return This {@link NumbersGovernmentBrand instance}.
     */
    public NumbersGovernmentBrand businessContactFirstName(String businessContactFirstName) {
        this.businessContactFirstName = businessContactFirstName;
        return this;
    }

    /**
     * Returns businessContactFirstName.
     * <p>
     * Field description:
     * First name of the primary contact person for the brand or business entity. Used for verification or compliance outreach.
     *
     * @return businessContactFirstName
     */
    @JsonProperty("businessContactFirstName")
    public String getBusinessContactFirstName() {
        return businessContactFirstName;
    }

    /**
     * Sets businessContactFirstName.
     * <p>
     * Field description:
     * First name of the primary contact person for the brand or business entity. Used for verification or compliance outreach.
     *
     * @param businessContactFirstName
     */
    @JsonProperty("businessContactFirstName")
    public void setBusinessContactFirstName(String businessContactFirstName) {
        this.businessContactFirstName = businessContactFirstName;
    }

    /**
     * Sets businessContactLastName.
     * <p>
     * Field description:
     * Last name of the primary contact person for the brand or business entity.
     *
     * @param businessContactLastName
     * @return This {@link NumbersGovernmentBrand instance}.
     */
    public NumbersGovernmentBrand businessContactLastName(String businessContactLastName) {
        this.businessContactLastName = businessContactLastName;
        return this;
    }

    /**
     * Returns businessContactLastName.
     * <p>
     * Field description:
     * Last name of the primary contact person for the brand or business entity.
     *
     * @return businessContactLastName
     */
    @JsonProperty("businessContactLastName")
    public String getBusinessContactLastName() {
        return businessContactLastName;
    }

    /**
     * Sets businessContactLastName.
     * <p>
     * Field description:
     * Last name of the primary contact person for the brand or business entity.
     *
     * @param businessContactLastName
     */
    @JsonProperty("businessContactLastName")
    public void setBusinessContactLastName(String businessContactLastName) {
        this.businessContactLastName = businessContactLastName;
    }

    /**
     * Sets businessDBA.
     * <p>
     * Field description:
     * &#39;Doing Business As&#39; name if different from the legal business name.
     *
     * @param businessDBA
     * @return This {@link NumbersGovernmentBrand instance}.
     */
    public NumbersGovernmentBrand businessDBA(String businessDBA) {
        this.businessDBA = businessDBA;
        return this;
    }

    /**
     * Returns businessDBA.
     * <p>
     * Field description:
     * &#39;Doing Business As&#39; name if different from the legal business name.
     *
     * @return businessDBA
     */
    @JsonProperty("businessDBA")
    public String getBusinessDBA() {
        return businessDBA;
    }

    /**
     * Sets businessDBA.
     * <p>
     * Field description:
     * &#39;Doing Business As&#39; name if different from the legal business name.
     *
     * @param businessDBA
     */
    @JsonProperty("businessDBA")
    public void setBusinessDBA(String businessDBA) {
        this.businessDBA = businessDBA;
    }

    /**
     * Sets legalName.
     * <p>
     * Field description:
     * The legal name of the brand.
     * <p>
     * The field is required.
     *
     * @param legalName
     * @return This {@link NumbersGovernmentBrand instance}.
     */
    public NumbersGovernmentBrand legalName(String legalName) {
        this.legalName = legalName;
        return this;
    }

    /**
     * Returns legalName.
     * <p>
     * Field description:
     * The legal name of the brand.
     * <p>
     * The field is required.
     *
     * @return legalName
     */
    @JsonProperty("legalName")
    public String getLegalName() {
        return legalName;
    }

    /**
     * Sets legalName.
     * <p>
     * Field description:
     * The legal name of the brand.
     * <p>
     * The field is required.
     *
     * @param legalName
     */
    @JsonProperty("legalName")
    public void setLegalName(String legalName) {
        this.legalName = legalName;
    }

    /**
     * Sets alternateBusinessId.
     *
     * @param alternateBusinessId
     * @return This {@link NumbersGovernmentBrand instance}.
     */
    public NumbersGovernmentBrand alternateBusinessId(NumbersBusinessIdentifier alternateBusinessId) {
        this.alternateBusinessId = alternateBusinessId;
        return this;
    }

    /**
     * Returns alternateBusinessId.
     *
     * @return alternateBusinessId
     */
    @JsonProperty("alternateBusinessId")
    public NumbersBusinessIdentifier getAlternateBusinessId() {
        return alternateBusinessId;
    }

    /**
     * Sets alternateBusinessId.
     *
     * @param alternateBusinessId
     */
    @JsonProperty("alternateBusinessId")
    public void setAlternateBusinessId(NumbersBusinessIdentifier alternateBusinessId) {
        this.alternateBusinessId = alternateBusinessId;
    }

    /**
     * Sets vertical.
     * <p>
     * The field is required.
     *
     * @param vertical
     * @return This {@link NumbersGovernmentBrand instance}.
     */
    public NumbersGovernmentBrand vertical(NumbersVertical vertical) {
        this.vertical = vertical;
        return this;
    }

    /**
     * Returns vertical.
     * <p>
     * The field is required.
     *
     * @return vertical
     */
    @JsonProperty("vertical")
    public NumbersVertical getVertical() {
        return vertical;
    }

    /**
     * Sets vertical.
     * <p>
     * The field is required.
     *
     * @param vertical
     */
    @JsonProperty("vertical")
    public void setVertical(NumbersVertical vertical) {
        this.vertical = vertical;
    }

    /**
     * Sets taxId.
     * <p>
     * Field description:
     * The tax identifier for the brand.
     * <p>
     * The field is required.
     *
     * @param taxId
     * @return This {@link NumbersGovernmentBrand instance}.
     */
    public NumbersGovernmentBrand taxId(String taxId) {
        this.taxId = taxId;
        return this;
    }

    /**
     * Returns taxId.
     * <p>
     * Field description:
     * The tax identifier for the brand.
     * <p>
     * The field is required.
     *
     * @return taxId
     */
    @JsonProperty("taxId")
    public String getTaxId() {
        return taxId;
    }

    /**
     * Sets taxId.
     * <p>
     * Field description:
     * The tax identifier for the brand.
     * <p>
     * The field is required.
     *
     * @param taxId
     */
    @JsonProperty("taxId")
    public void setTaxId(String taxId) {
        this.taxId = taxId;
    }

    /**
     * Sets taxIdIssuingCountry.
     * <p>
     * Field description:
     * The country where tax identifier is issued. If not specified, the value from countryCode will be used.
     *
     * @param taxIdIssuingCountry
     * @return This {@link NumbersGovernmentBrand instance}.
     */
    public NumbersGovernmentBrand taxIdIssuingCountry(String taxIdIssuingCountry) {
        this.taxIdIssuingCountry = taxIdIssuingCountry;
        return this;
    }

    /**
     * Returns taxIdIssuingCountry.
     * <p>
     * Field description:
     * The country where tax identifier is issued. If not specified, the value from countryCode will be used.
     *
     * @return taxIdIssuingCountry
     */
    @JsonProperty("taxIdIssuingCountry")
    public String getTaxIdIssuingCountry() {
        return taxIdIssuingCountry;
    }

    /**
     * Sets taxIdIssuingCountry.
     * <p>
     * Field description:
     * The country where tax identifier is issued. If not specified, the value from countryCode will be used.
     *
     * @param taxIdIssuingCountry
     */
    @JsonProperty("taxIdIssuingCountry")
    public void setTaxIdIssuingCountry(String taxIdIssuingCountry) {
        this.taxIdIssuingCountry = taxIdIssuingCountry;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        NumbersGovernmentBrand numbersGovernmentBrand = (NumbersGovernmentBrand) o;
        return Objects.equals(this.referenceId, numbersGovernmentBrand.referenceId)
                && Objects.equals(this.address, numbersGovernmentBrand.address)
                && Objects.equals(this.countryCode, numbersGovernmentBrand.countryCode)
                && Objects.equals(this.supportPhone, numbersGovernmentBrand.supportPhone)
                && Objects.equals(this.supportEmail, numbersGovernmentBrand.supportEmail)
                && Objects.equals(this.businessContactFirstName, numbersGovernmentBrand.businessContactFirstName)
                && Objects.equals(this.businessContactLastName, numbersGovernmentBrand.businessContactLastName)
                && Objects.equals(this.businessDBA, numbersGovernmentBrand.businessDBA)
                && Objects.equals(this.legalName, numbersGovernmentBrand.legalName)
                && Objects.equals(this.alternateBusinessId, numbersGovernmentBrand.alternateBusinessId)
                && Objects.equals(this.vertical, numbersGovernmentBrand.vertical)
                && Objects.equals(this.taxId, numbersGovernmentBrand.taxId)
                && Objects.equals(this.taxIdIssuingCountry, numbersGovernmentBrand.taxIdIssuingCountry)
                && super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                referenceId,
                address,
                countryCode,
                supportPhone,
                supportEmail,
                businessContactFirstName,
                businessContactLastName,
                businessDBA,
                legalName,
                alternateBusinessId,
                vertical,
                taxId,
                taxIdIssuingCountry,
                super.hashCode());
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class NumbersGovernmentBrand {")
                .append(newLine)
                .append("    ")
                .append(toIndentedString(super.toString()))
                .append(newLine)
                .append("    referenceId: ")
                .append(toIndentedString(referenceId))
                .append(newLine)
                .append("    address: ")
                .append(toIndentedString(address))
                .append(newLine)
                .append("    countryCode: ")
                .append(toIndentedString(countryCode))
                .append(newLine)
                .append("    supportPhone: ")
                .append(toIndentedString(supportPhone))
                .append(newLine)
                .append("    supportEmail: ")
                .append(toIndentedString(supportEmail))
                .append(newLine)
                .append("    businessContactFirstName: ")
                .append(toIndentedString(businessContactFirstName))
                .append(newLine)
                .append("    businessContactLastName: ")
                .append(toIndentedString(businessContactLastName))
                .append(newLine)
                .append("    businessDBA: ")
                .append(toIndentedString(businessDBA))
                .append(newLine)
                .append("    legalName: ")
                .append(toIndentedString(legalName))
                .append(newLine)
                .append("    alternateBusinessId: ")
                .append(toIndentedString(alternateBusinessId))
                .append(newLine)
                .append("    vertical: ")
                .append(toIndentedString(vertical))
                .append(newLine)
                .append("    taxId: ")
                .append(toIndentedString(taxId))
                .append(newLine)
                .append("    taxIdIssuingCountry: ")
                .append(toIndentedString(taxIdIssuingCountry))
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
