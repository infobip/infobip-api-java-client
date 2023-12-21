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
 * Represents CallsPublicSipTrunkServiceAddress model.
 */
public class CallsPublicSipTrunkServiceAddress {

    private String id;

    private String name;

    private String street;

    private String city;

    private String postCode;

    private String suite;

    private CallsPublicCountry country;

    private CallsPublicRegion region;

    /**
     * Sets id.
     * <p>
     * Field description:
     * SIP trunk service address ID.
     *
     * @param id
     * @return This {@link CallsPublicSipTrunkServiceAddress instance}.
     */
    public CallsPublicSipTrunkServiceAddress id(String id) {
        this.id = id;
        return this;
    }

    /**
     * Returns id.
     * <p>
     * Field description:
     * SIP trunk service address ID.
     *
     * @return id
     */
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    /**
     * Sets id.
     * <p>
     * Field description:
     * SIP trunk service address ID.
     *
     * @param id
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Sets name.
     * <p>
     * Field description:
     * SIP trunk service address name.
     *
     * @param name
     * @return This {@link CallsPublicSipTrunkServiceAddress instance}.
     */
    public CallsPublicSipTrunkServiceAddress name(String name) {
        this.name = name;
        return this;
    }

    /**
     * Returns name.
     * <p>
     * Field description:
     * SIP trunk service address name.
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
     *
     * @param street
     * @return This {@link CallsPublicSipTrunkServiceAddress instance}.
     */
    public CallsPublicSipTrunkServiceAddress street(String street) {
        this.street = street;
        return this;
    }

    /**
     * Returns street.
     * <p>
     * Field description:
     * SIP trunk service address street.
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
     *
     * @param city
     * @return This {@link CallsPublicSipTrunkServiceAddress instance}.
     */
    public CallsPublicSipTrunkServiceAddress city(String city) {
        this.city = city;
        return this;
    }

    /**
     * Returns city.
     * <p>
     * Field description:
     * SIP trunk service address city.
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
     *
     * @param postCode
     * @return This {@link CallsPublicSipTrunkServiceAddress instance}.
     */
    public CallsPublicSipTrunkServiceAddress postCode(String postCode) {
        this.postCode = postCode;
        return this;
    }

    /**
     * Returns postCode.
     * <p>
     * Field description:
     * SIP trunk service address post code.
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
     * @return This {@link CallsPublicSipTrunkServiceAddress instance}.
     */
    public CallsPublicSipTrunkServiceAddress suite(String suite) {
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
     * Sets country.
     *
     * @param country
     * @return This {@link CallsPublicSipTrunkServiceAddress instance}.
     */
    public CallsPublicSipTrunkServiceAddress country(CallsPublicCountry country) {
        this.country = country;
        return this;
    }

    /**
     * Returns country.
     *
     * @return country
     */
    @JsonProperty("country")
    public CallsPublicCountry getCountry() {
        return country;
    }

    /**
     * Sets country.
     *
     * @param country
     */
    @JsonProperty("country")
    public void setCountry(CallsPublicCountry country) {
        this.country = country;
    }

    /**
     * Sets region.
     *
     * @param region
     * @return This {@link CallsPublicSipTrunkServiceAddress instance}.
     */
    public CallsPublicSipTrunkServiceAddress region(CallsPublicRegion region) {
        this.region = region;
        return this;
    }

    /**
     * Returns region.
     *
     * @return region
     */
    @JsonProperty("region")
    public CallsPublicRegion getRegion() {
        return region;
    }

    /**
     * Sets region.
     *
     * @param region
     */
    @JsonProperty("region")
    public void setRegion(CallsPublicRegion region) {
        this.region = region;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CallsPublicSipTrunkServiceAddress callsPublicSipTrunkServiceAddress = (CallsPublicSipTrunkServiceAddress) o;
        return Objects.equals(this.id, callsPublicSipTrunkServiceAddress.id)
                && Objects.equals(this.name, callsPublicSipTrunkServiceAddress.name)
                && Objects.equals(this.street, callsPublicSipTrunkServiceAddress.street)
                && Objects.equals(this.city, callsPublicSipTrunkServiceAddress.city)
                && Objects.equals(this.postCode, callsPublicSipTrunkServiceAddress.postCode)
                && Objects.equals(this.suite, callsPublicSipTrunkServiceAddress.suite)
                && Objects.equals(this.country, callsPublicSipTrunkServiceAddress.country)
                && Objects.equals(this.region, callsPublicSipTrunkServiceAddress.region);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, street, city, postCode, suite, country, region);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class CallsPublicSipTrunkServiceAddress {")
                .append(newLine)
                .append("    id: ")
                .append(toIndentedString(id))
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
                .append("    country: ")
                .append(toIndentedString(country))
                .append(newLine)
                .append("    region: ")
                .append(toIndentedString(region))
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
