/*
 * This class is auto generated from the Infobip OpenAPI specification
 * through the OpenAPI Specification Client API libraries (Re)Generator (OSCAR),
 * powered by the OpenAPI Generator (https://openapi-generator.tech).
 *
 * Do not edit manually. To learn how to raise an issue, see the CONTRIBUTING guide
 * or contact us @ support@infobip.com.
 */

package com.infobip.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;

/**
 * Represents NumbersTollFreeBrand model.
 */
public class NumbersTollFreeBrand extends NumbersBrand {

    private String referenceId;

    private NumbersAddress address;

    private String countryCode;

    private String supportPhone;

    private String supportEmail;

    private String businessContactFirstName;

    private String businessContactLastName;

    private String businessDBA;

    private String taxId;

    private String taxIdIssuingCountry;

    /**
     * Legal entity type of the business.
     */
    public enum LegalEntityTypeEnum {
        PRIVATE_COMPANY("PRIVATE_COMPANY"),
        PUBLIC_COMPANY("PUBLIC_COMPANY"),
        NON_PROFIT("NON_PROFIT"),
        GOVERNMENT("GOVERNMENT"),
        SOLE_PROPRIETOR("SOLE_PROPRIETOR");

        private String value;

        LegalEntityTypeEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static LegalEntityTypeEnum fromValue(String value) {
            for (LegalEntityTypeEnum enumElement : LegalEntityTypeEnum.values()) {
                if (enumElement.value.equals(value)) {
                    return enumElement;
                }
            }
            throw new IllegalArgumentException("Unexpected enum value '" + value + "'.");
        }
    }

    private LegalEntityTypeEnum legalEntityType;

    private NumbersBusinessRegistrationType businessRegistrationType;

    private String legalName;

    /**
     * Constructs a new {@link NumbersTollFreeBrand} instance.
     */
    public NumbersTollFreeBrand() {
        super("TOLL_FREE_NUMBER");
    }

    /**
     * Sets referenceId.
     * <p>
     * Field description:
     * Unique user defined ID for the brand. While not required, it is recommended to supply a referenceId as the uniqueness constraint will help ensure a brand is not accidentally created multiple times. Subsequent create requests with the same referenceId will be rejected with an error.
     *
     * @param referenceId
     * @return This {@link NumbersTollFreeBrand instance}.
     */
    public NumbersTollFreeBrand referenceId(String referenceId) {
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
     * @return This {@link NumbersTollFreeBrand instance}.
     */
    public NumbersTollFreeBrand address(NumbersAddress address) {
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
     * @return This {@link NumbersTollFreeBrand instance}.
     */
    public NumbersTollFreeBrand countryCode(String countryCode) {
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
     * @return This {@link NumbersTollFreeBrand instance}.
     */
    public NumbersTollFreeBrand supportPhone(String supportPhone) {
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
     * @return This {@link NumbersTollFreeBrand instance}.
     */
    public NumbersTollFreeBrand supportEmail(String supportEmail) {
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
     * <p>
     * The field is required.
     *
     * @param businessContactFirstName
     * @return This {@link NumbersTollFreeBrand instance}.
     */
    public NumbersTollFreeBrand businessContactFirstName(String businessContactFirstName) {
        this.businessContactFirstName = businessContactFirstName;
        return this;
    }

    /**
     * Returns businessContactFirstName.
     * <p>
     * Field description:
     * First name of the primary contact person for the brand or business entity. Used for verification or compliance outreach.
     * <p>
     * The field is required.
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
     * <p>
     * The field is required.
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
     * <p>
     * The field is required.
     *
     * @param businessContactLastName
     * @return This {@link NumbersTollFreeBrand instance}.
     */
    public NumbersTollFreeBrand businessContactLastName(String businessContactLastName) {
        this.businessContactLastName = businessContactLastName;
        return this;
    }

    /**
     * Returns businessContactLastName.
     * <p>
     * Field description:
     * Last name of the primary contact person for the brand or business entity.
     * <p>
     * The field is required.
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
     * <p>
     * The field is required.
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
     * @return This {@link NumbersTollFreeBrand instance}.
     */
    public NumbersTollFreeBrand businessDBA(String businessDBA) {
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
     * Sets taxId.
     * <p>
     * Field description:
     * The tax identifier for the brand.
     * <p>
     * The field is required.
     *
     * @param taxId
     * @return This {@link NumbersTollFreeBrand instance}.
     */
    public NumbersTollFreeBrand taxId(String taxId) {
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
     * @return This {@link NumbersTollFreeBrand instance}.
     */
    public NumbersTollFreeBrand taxIdIssuingCountry(String taxIdIssuingCountry) {
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

    /**
     * Sets legalEntityType.
     * <p>
     * Field description:
     * Legal entity type of the business.
     * <p>
     * The field is required.
     *
     * @param legalEntityType
     * @return This {@link NumbersTollFreeBrand instance}.
     */
    public NumbersTollFreeBrand legalEntityType(LegalEntityTypeEnum legalEntityType) {
        this.legalEntityType = legalEntityType;
        return this;
    }

    /**
     * Returns legalEntityType.
     * <p>
     * Field description:
     * Legal entity type of the business.
     * <p>
     * The field is required.
     *
     * @return legalEntityType
     */
    @JsonProperty("legalEntityType")
    public LegalEntityTypeEnum getLegalEntityType() {
        return legalEntityType;
    }

    /**
     * Sets legalEntityType.
     * <p>
     * Field description:
     * Legal entity type of the business.
     * <p>
     * The field is required.
     *
     * @param legalEntityType
     */
    @JsonProperty("legalEntityType")
    public void setLegalEntityType(LegalEntityTypeEnum legalEntityType) {
        this.legalEntityType = legalEntityType;
    }

    /**
     * Sets businessRegistrationType.
     * <p>
     * The field is required.
     *
     * @param businessRegistrationType
     * @return This {@link NumbersTollFreeBrand instance}.
     */
    public NumbersTollFreeBrand businessRegistrationType(NumbersBusinessRegistrationType businessRegistrationType) {
        this.businessRegistrationType = businessRegistrationType;
        return this;
    }

    /**
     * Returns businessRegistrationType.
     * <p>
     * The field is required.
     *
     * @return businessRegistrationType
     */
    @JsonProperty("businessRegistrationType")
    public NumbersBusinessRegistrationType getBusinessRegistrationType() {
        return businessRegistrationType;
    }

    /**
     * Sets businessRegistrationType.
     * <p>
     * The field is required.
     *
     * @param businessRegistrationType
     */
    @JsonProperty("businessRegistrationType")
    public void setBusinessRegistrationType(NumbersBusinessRegistrationType businessRegistrationType) {
        this.businessRegistrationType = businessRegistrationType;
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
     * @return This {@link NumbersTollFreeBrand instance}.
     */
    public NumbersTollFreeBrand legalName(String legalName) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        NumbersTollFreeBrand numbersTollFreeBrand = (NumbersTollFreeBrand) o;
        return Objects.equals(this.referenceId, numbersTollFreeBrand.referenceId)
                && Objects.equals(this.address, numbersTollFreeBrand.address)
                && Objects.equals(this.countryCode, numbersTollFreeBrand.countryCode)
                && Objects.equals(this.supportPhone, numbersTollFreeBrand.supportPhone)
                && Objects.equals(this.supportEmail, numbersTollFreeBrand.supportEmail)
                && Objects.equals(this.businessContactFirstName, numbersTollFreeBrand.businessContactFirstName)
                && Objects.equals(this.businessContactLastName, numbersTollFreeBrand.businessContactLastName)
                && Objects.equals(this.businessDBA, numbersTollFreeBrand.businessDBA)
                && Objects.equals(this.taxId, numbersTollFreeBrand.taxId)
                && Objects.equals(this.taxIdIssuingCountry, numbersTollFreeBrand.taxIdIssuingCountry)
                && Objects.equals(this.legalEntityType, numbersTollFreeBrand.legalEntityType)
                && Objects.equals(this.businessRegistrationType, numbersTollFreeBrand.businessRegistrationType)
                && Objects.equals(this.legalName, numbersTollFreeBrand.legalName)
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
                taxId,
                taxIdIssuingCountry,
                legalEntityType,
                businessRegistrationType,
                legalName,
                super.hashCode());
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class NumbersTollFreeBrand {")
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
                .append("    taxId: ")
                .append(toIndentedString(taxId))
                .append(newLine)
                .append("    taxIdIssuingCountry: ")
                .append(toIndentedString(taxIdIssuingCountry))
                .append(newLine)
                .append("    legalEntityType: ")
                .append(toIndentedString(legalEntityType))
                .append(newLine)
                .append("    businessRegistrationType: ")
                .append(toIndentedString(businessRegistrationType))
                .append(newLine)
                .append("    legalName: ")
                .append(toIndentedString(legalName))
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
