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
 * SIP trunk service address request.
 */
public class CallsPublicSipTrunkServiceAddressRequest {

    private String name;

    private String street;

    private String city;

    private String postCode;

    private String suite;

    private String countryCode;

    private String countryRegionCode;

    /**
     * Sets name.
     * <p>
     * Field description:
     * SIP trunk service address name.
     * <p>
     * The field is required.
     *
     * @param name
     * @return This {@link CallsPublicSipTrunkServiceAddressRequest instance}.
     */
    public CallsPublicSipTrunkServiceAddressRequest name(String name) {
        this.name = name;
        return this;
    }

    /**
     * Returns name.
     * <p>
     * Field description:
     * SIP trunk service address name.
     * <p>
     * The field is required.
     *
     * @return name
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * Sets name.
     * <p>
     * Field description:
     * SIP trunk service address name.
     * <p>
     * The field is required.
     *
     * @param name
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Sets street.
     * <p>
     * Field description:
     * SIP trunk service address street.
     * <p>
     * The field is required.
     *
     * @param street
     * @return This {@link CallsPublicSipTrunkServiceAddressRequest instance}.
     */
    public CallsPublicSipTrunkServiceAddressRequest street(String street) {
        this.street = street;
        return this;
    }

    /**
     * Returns street.
     * <p>
     * Field description:
     * SIP trunk service address street.
     * <p>
     * The field is required.
     *
     * @return street
     */
    @JsonProperty("street")
    public String getStreet() {
        return street;
    }

    /**
     * Sets street.
     * <p>
     * Field description:
     * SIP trunk service address street.
     * <p>
     * The field is required.
     *
     * @param street
     */
    @JsonProperty("street")
    public void setStreet(String street) {
        this.street = street;
    }

    /**
     * Sets city.
     * <p>
     * Field description:
     * SIP trunk service address city.
     * <p>
     * The field is required.
     *
     * @param city
     * @return This {@link CallsPublicSipTrunkServiceAddressRequest instance}.
     */
    public CallsPublicSipTrunkServiceAddressRequest city(String city) {
        this.city = city;
        return this;
    }

    /**
     * Returns city.
     * <p>
     * Field description:
     * SIP trunk service address city.
     * <p>
     * The field is required.
     *
     * @return city
     */
    @JsonProperty("city")
    public String getCity() {
        return city;
    }

    /**
     * Sets city.
     * <p>
     * Field description:
     * SIP trunk service address city.
     * <p>
     * The field is required.
     *
     * @param city
     */
    @JsonProperty("city")
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * Sets postCode.
     * <p>
     * Field description:
     * SIP trunk service address post code.
     * <p>
     * The field is required.
     *
     * @param postCode
     * @return This {@link CallsPublicSipTrunkServiceAddressRequest instance}.
     */
    public CallsPublicSipTrunkServiceAddressRequest postCode(String postCode) {
        this.postCode = postCode;
        return this;
    }

    /**
     * Returns postCode.
     * <p>
     * Field description:
     * SIP trunk service address post code.
     * <p>
     * The field is required.
     *
     * @return postCode
     */
    @JsonProperty("postCode")
    public String getPostCode() {
        return postCode;
    }

    /**
     * Sets postCode.
     * <p>
     * Field description:
     * SIP trunk service address post code.
     * <p>
     * The field is required.
     *
     * @param postCode
     */
    @JsonProperty("postCode")
    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    /**
     * Sets suite.
     * <p>
     * Field description:
     * SIP trunk service address suite.
     *
     * @param suite
     * @return This {@link CallsPublicSipTrunkServiceAddressRequest instance}.
     */
    public CallsPublicSipTrunkServiceAddressRequest suite(String suite) {
        this.suite = suite;
        return this;
    }

    /**
     * Returns suite.
     * <p>
     * Field description:
     * SIP trunk service address suite.
     *
     * @return suite
     */
    @JsonProperty("suite")
    public String getSuite() {
        return suite;
    }

    /**
     * Sets suite.
     * <p>
     * Field description:
     * SIP trunk service address suite.
     *
     * @param suite
     */
    @JsonProperty("suite")
    public void setSuite(String suite) {
        this.suite = suite;
    }

    /**
     * Sets countryCode.
     * <p>
     * Field description:
     * SIP trunk service address [country code](#get-countries).
     * <p>
     * The field is required.
     *
     * @param countryCode
     * @return This {@link CallsPublicSipTrunkServiceAddressRequest instance}.
     */
    public CallsPublicSipTrunkServiceAddressRequest countryCode(String countryCode) {
        this.countryCode = countryCode;
        return this;
    }

    /**
     * Returns countryCode.
     * <p>
     * Field description:
     * SIP trunk service address [country code](#get-countries).
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
     * SIP trunk service address [country code](#get-countries).
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
     * Sets countryRegionCode.
     * <p>
     * Field description:
     * SIP trunk service address [country region code](#get-regions). Mandatory for countries that have defined regions.
     *
     * @param countryRegionCode
     * @return This {@link CallsPublicSipTrunkServiceAddressRequest instance}.
     */
    public CallsPublicSipTrunkServiceAddressRequest countryRegionCode(String countryRegionCode) {
        this.countryRegionCode = countryRegionCode;
        return this;
    }

    /**
     * Returns countryRegionCode.
     * <p>
     * Field description:
     * SIP trunk service address [country region code](#get-regions). Mandatory for countries that have defined regions.
     *
     * @return countryRegionCode
     */
    @JsonProperty("countryRegionCode")
    public String getCountryRegionCode() {
        return countryRegionCode;
    }

    /**
     * Sets countryRegionCode.
     * <p>
     * Field description:
     * SIP trunk service address [country region code](#get-regions). Mandatory for countries that have defined regions.
     *
     * @param countryRegionCode
     */
    @JsonProperty("countryRegionCode")
    public void setCountryRegionCode(String countryRegionCode) {
        this.countryRegionCode = countryRegionCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CallsPublicSipTrunkServiceAddressRequest callsPublicSipTrunkServiceAddressRequest =
                (CallsPublicSipTrunkServiceAddressRequest) o;
        return Objects.equals(this.name, callsPublicSipTrunkServiceAddressRequest.name)
                && Objects.equals(this.street, callsPublicSipTrunkServiceAddressRequest.street)
                && Objects.equals(this.city, callsPublicSipTrunkServiceAddressRequest.city)
                && Objects.equals(this.postCode, callsPublicSipTrunkServiceAddressRequest.postCode)
                && Objects.equals(this.suite, callsPublicSipTrunkServiceAddressRequest.suite)
                && Objects.equals(this.countryCode, callsPublicSipTrunkServiceAddressRequest.countryCode)
                && Objects.equals(this.countryRegionCode, callsPublicSipTrunkServiceAddressRequest.countryRegionCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, street, city, postCode, suite, countryCode, countryRegionCode);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class CallsPublicSipTrunkServiceAddressRequest {")
                .append(newLine)
                .append("    name: ")
                .append(toIndentedString(name))
                .append(newLine)
                .append("    street: ")
                .append(toIndentedString(street))
                .append(newLine)
                .append("    city: ")
                .append(toIndentedString(city))
                .append(newLine)
                .append("    postCode: ")
                .append(toIndentedString(postCode))
                .append(newLine)
                .append("    suite: ")
                .append(toIndentedString(suite))
                .append(newLine)
                .append("    countryCode: ")
                .append(toIndentedString(countryCode))
                .append(newLine)
                .append("    countryRegionCode: ")
                .append(toIndentedString(countryRegionCode))
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
