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
 * Address of an Emergency Service.
 */
public class CallsAddress {

    private String name;

    private String streetName;

    private String streetNumber;

    private String city;

    private String countryCode;

    private String stateCode;

    private String zipCode;

    private CallsDirection direction;

    private String suite;

    /**
     * Sets name.
     * <p>
     * Field description:
     * Emergency Service address name.
     * <p>
     * The field is required.
     *
     * @param name
     * @return This {@link CallsAddress instance}.
     */
    public CallsAddress name(String name) {
        this.name = name;
        return this;
    }

    /**
     * Returns name.
     * <p>
     * Field description:
     * Emergency Service address name.
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
     * Emergency Service address name.
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
     * Sets streetName.
     * <p>
     * Field description:
     * Emergency Service address street.
     * <p>
     * The field is required.
     *
     * @param streetName
     * @return This {@link CallsAddress instance}.
     */
    public CallsAddress streetName(String streetName) {
        this.streetName = streetName;
        return this;
    }

    /**
     * Returns streetName.
     * <p>
     * Field description:
     * Emergency Service address street.
     * <p>
     * The field is required.
     *
     * @return streetName
     */
    @JsonProperty("streetName")
    public String getStreetName() {
        return streetName;
    }

    /**
     * Sets streetName.
     * <p>
     * Field description:
     * Emergency Service address street.
     * <p>
     * The field is required.
     *
     * @param streetName
     */
    @JsonProperty("streetName")
    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    /**
     * Sets streetNumber.
     * <p>
     * Field description:
     * Emergency Service address street number.
     * <p>
     * The field is required.
     *
     * @param streetNumber
     * @return This {@link CallsAddress instance}.
     */
    public CallsAddress streetNumber(String streetNumber) {
        this.streetNumber = streetNumber;
        return this;
    }

    /**
     * Returns streetNumber.
     * <p>
     * Field description:
     * Emergency Service address street number.
     * <p>
     * The field is required.
     *
     * @return streetNumber
     */
    @JsonProperty("streetNumber")
    public String getStreetNumber() {
        return streetNumber;
    }

    /**
     * Sets streetNumber.
     * <p>
     * Field description:
     * Emergency Service address street number.
     * <p>
     * The field is required.
     *
     * @param streetNumber
     */
    @JsonProperty("streetNumber")
    public void setStreetNumber(String streetNumber) {
        this.streetNumber = streetNumber;
    }

    /**
     * Sets city.
     * <p>
     * Field description:
     * Emergency Service address city.
     * <p>
     * The field is required.
     *
     * @param city
     * @return This {@link CallsAddress instance}.
     */
    public CallsAddress city(String city) {
        this.city = city;
        return this;
    }

    /**
     * Returns city.
     * <p>
     * Field description:
     * Emergency Service address city.
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
     * Emergency Service address city.
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
     * Sets countryCode.
     * <p>
     * Field description:
     * Emergency Service address country code.
     * <p>
     * The field is required.
     *
     * @param countryCode
     * @return This {@link CallsAddress instance}.
     */
    public CallsAddress countryCode(String countryCode) {
        this.countryCode = countryCode;
        return this;
    }

    /**
     * Returns countryCode.
     * <p>
     * Field description:
     * Emergency Service address country code.
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
     * Emergency Service address country code.
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
     * Sets stateCode.
     * <p>
     * Field description:
     * Emergency Service address state code.
     * <p>
     * The field is required.
     *
     * @param stateCode
     * @return This {@link CallsAddress instance}.
     */
    public CallsAddress stateCode(String stateCode) {
        this.stateCode = stateCode;
        return this;
    }

    /**
     * Returns stateCode.
     * <p>
     * Field description:
     * Emergency Service address state code.
     * <p>
     * The field is required.
     *
     * @return stateCode
     */
    @JsonProperty("stateCode")
    public String getStateCode() {
        return stateCode;
    }

    /**
     * Sets stateCode.
     * <p>
     * Field description:
     * Emergency Service address state code.
     * <p>
     * The field is required.
     *
     * @param stateCode
     */
    @JsonProperty("stateCode")
    public void setStateCode(String stateCode) {
        this.stateCode = stateCode;
    }

    /**
     * Sets zipCode.
     * <p>
     * Field description:
     * Emergency Service address zip code.
     * <p>
     * The field is required.
     *
     * @param zipCode
     * @return This {@link CallsAddress instance}.
     */
    public CallsAddress zipCode(String zipCode) {
        this.zipCode = zipCode;
        return this;
    }

    /**
     * Returns zipCode.
     * <p>
     * Field description:
     * Emergency Service address zip code.
     * <p>
     * The field is required.
     *
     * @return zipCode
     */
    @JsonProperty("zipCode")
    public String getZipCode() {
        return zipCode;
    }

    /**
     * Sets zipCode.
     * <p>
     * Field description:
     * Emergency Service address zip code.
     * <p>
     * The field is required.
     *
     * @param zipCode
     */
    @JsonProperty("zipCode")
    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    /**
     * Sets direction.
     *
     * @param direction
     * @return This {@link CallsAddress instance}.
     */
    public CallsAddress direction(CallsDirection direction) {
        this.direction = direction;
        return this;
    }

    /**
     * Returns direction.
     *
     * @return direction
     */
    @JsonProperty("direction")
    public CallsDirection getDirection() {
        return direction;
    }

    /**
     * Sets direction.
     *
     * @param direction
     */
    @JsonProperty("direction")
    public void setDirection(CallsDirection direction) {
        this.direction = direction;
    }

    /**
     * Sets suite.
     * <p>
     * Field description:
     * Emergency Service address suite.
     *
     * @param suite
     * @return This {@link CallsAddress instance}.
     */
    public CallsAddress suite(String suite) {
        this.suite = suite;
        return this;
    }

    /**
     * Returns suite.
     * <p>
     * Field description:
     * Emergency Service address suite.
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
     * Emergency Service address suite.
     *
     * @param suite
     */
    @JsonProperty("suite")
    public void setSuite(String suite) {
        this.suite = suite;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CallsAddress callsAddress = (CallsAddress) o;
        return Objects.equals(this.name, callsAddress.name)
                && Objects.equals(this.streetName, callsAddress.streetName)
                && Objects.equals(this.streetNumber, callsAddress.streetNumber)
                && Objects.equals(this.city, callsAddress.city)
                && Objects.equals(this.countryCode, callsAddress.countryCode)
                && Objects.equals(this.stateCode, callsAddress.stateCode)
                && Objects.equals(this.zipCode, callsAddress.zipCode)
                && Objects.equals(this.direction, callsAddress.direction)
                && Objects.equals(this.suite, callsAddress.suite);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, streetName, streetNumber, city, countryCode, stateCode, zipCode, direction, suite);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class CallsAddress {")
                .append(newLine)
                .append("    name: ")
                .append(toIndentedString(name))
                .append(newLine)
                .append("    streetName: ")
                .append(toIndentedString(streetName))
                .append(newLine)
                .append("    streetNumber: ")
                .append(toIndentedString(streetNumber))
                .append(newLine)
                .append("    city: ")
                .append(toIndentedString(city))
                .append(newLine)
                .append("    countryCode: ")
                .append(toIndentedString(countryCode))
                .append(newLine)
                .append("    stateCode: ")
                .append(toIndentedString(stateCode))
                .append(newLine)
                .append("    zipCode: ")
                .append(toIndentedString(zipCode))
                .append(newLine)
                .append("    direction: ")
                .append(toIndentedString(direction))
                .append(newLine)
                .append("    suite: ")
                .append(toIndentedString(suite))
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
