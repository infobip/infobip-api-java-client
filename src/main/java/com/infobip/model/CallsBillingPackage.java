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
 * Billing package.
 */
public class CallsBillingPackage {

    private CallsBillingPackageType packageType;

    private String countryCode;

    private String addressId;

    /**
     * Sets packageType.
     * <p>
     * The field is required.
     *
     * @param packageType
     * @return This {@link CallsBillingPackage instance}.
     */
    public CallsBillingPackage packageType(CallsBillingPackageType packageType) {
        this.packageType = packageType;
        return this;
    }

    /**
     * Returns packageType.
     * <p>
     * The field is required.
     *
     * @return packageType
     */
    @JsonProperty("packageType")
    public CallsBillingPackageType getPackageType() {
        return packageType;
    }

    /**
     * Sets packageType.
     * <p>
     * The field is required.
     *
     * @param packageType
     */
    @JsonProperty("packageType")
    public void setPackageType(CallsBillingPackageType packageType) {
        this.packageType = packageType;
    }

    /**
     * Sets countryCode.
     * <p>
     * Field description:
     * Country code. Currently, only &#x60;USA&#x60; is supported and required for the &#x60;UNLIMITED&#x60; package type.
     *
     * @param countryCode
     * @return This {@link CallsBillingPackage instance}.
     */
    public CallsBillingPackage countryCode(String countryCode) {
        this.countryCode = countryCode;
        return this;
    }

    /**
     * Returns countryCode.
     * <p>
     * Field description:
     * Country code. Currently, only &#x60;USA&#x60; is supported and required for the &#x60;UNLIMITED&#x60; package type.
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
     * Country code. Currently, only &#x60;USA&#x60; is supported and required for the &#x60;UNLIMITED&#x60; package type.
     *
     * @param countryCode
     */
    @JsonProperty("countryCode")
    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    /**
     * Sets addressId.
     * <p>
     * Field description:
     * ID of SIP trunk address.
     *
     * @param addressId
     * @return This {@link CallsBillingPackage instance}.
     */
    public CallsBillingPackage addressId(String addressId) {
        this.addressId = addressId;
        return this;
    }

    /**
     * Returns addressId.
     * <p>
     * Field description:
     * ID of SIP trunk address.
     *
     * @return addressId
     */
    @JsonProperty("addressId")
    public String getAddressId() {
        return addressId;
    }

    /**
     * Sets addressId.
     * <p>
     * Field description:
     * ID of SIP trunk address.
     *
     * @param addressId
     */
    @JsonProperty("addressId")
    public void setAddressId(String addressId) {
        this.addressId = addressId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CallsBillingPackage callsBillingPackage = (CallsBillingPackage) o;
        return Objects.equals(this.packageType, callsBillingPackage.packageType)
                && Objects.equals(this.countryCode, callsBillingPackage.countryCode)
                && Objects.equals(this.addressId, callsBillingPackage.addressId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(packageType, countryCode, addressId);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class CallsBillingPackage {")
                .append(newLine)
                .append("    packageType: ")
                .append(toIndentedString(packageType))
                .append(newLine)
                .append("    countryCode: ")
                .append(toIndentedString(countryCode))
                .append(newLine)
                .append("    addressId: ")
                .append(toIndentedString(addressId))
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
