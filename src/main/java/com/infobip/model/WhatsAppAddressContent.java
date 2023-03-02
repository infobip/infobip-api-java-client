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
 * Array of addresses information.
 */
public class WhatsAppAddressContent {

    private String street;

    private String city;

    private String state;

    private String zip;

    private String country;

    private String countryCode;

    private WhatsAppAddressType type;

    /**
     * Sets street.
     * <p>
     * Field description:
     * Street name.
     *
     * @param street
     * @return This {@link WhatsAppAddressContent instance}.
     */
    public WhatsAppAddressContent street(String street) {
        this.street = street;
        return this;
    }

    /**
     * Returns street.
     * <p>
     * Field description:
     * Street name.
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
     * Street name.
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
     * City name.
     *
     * @param city
     * @return This {@link WhatsAppAddressContent instance}.
     */
    public WhatsAppAddressContent city(String city) {
        this.city = city;
        return this;
    }

    /**
     * Returns city.
     * <p>
     * Field description:
     * City name.
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
     * City name.
     *
     * @param city
     */
    @JsonProperty("city")
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * Sets state.
     * <p>
     * Field description:
     * State name.
     *
     * @param state
     * @return This {@link WhatsAppAddressContent instance}.
     */
    public WhatsAppAddressContent state(String state) {
        this.state = state;
        return this;
    }

    /**
     * Returns state.
     * <p>
     * Field description:
     * State name.
     *
     * @return state
     */
    @JsonProperty("state")
    public String getState() {
        return state;
    }

    /**
     * Sets state.
     * <p>
     * Field description:
     * State name.
     *
     * @param state
     */
    @JsonProperty("state")
    public void setState(String state) {
        this.state = state;
    }

    /**
     * Sets zip.
     * <p>
     * Field description:
     * Zip code value.
     *
     * @param zip
     * @return This {@link WhatsAppAddressContent instance}.
     */
    public WhatsAppAddressContent zip(String zip) {
        this.zip = zip;
        return this;
    }

    /**
     * Returns zip.
     * <p>
     * Field description:
     * Zip code value.
     *
     * @return zip
     */
    @JsonProperty("zip")
    public String getZip() {
        return zip;
    }

    /**
     * Sets zip.
     * <p>
     * Field description:
     * Zip code value.
     *
     * @param zip
     */
    @JsonProperty("zip")
    public void setZip(String zip) {
        this.zip = zip;
    }

    /**
     * Sets country.
     * <p>
     * Field description:
     * Country name.
     *
     * @param country
     * @return This {@link WhatsAppAddressContent instance}.
     */
    public WhatsAppAddressContent country(String country) {
        this.country = country;
        return this;
    }

    /**
     * Returns country.
     * <p>
     * Field description:
     * Country name.
     *
     * @return country
     */
    @JsonProperty("country")
    public String getCountry() {
        return country;
    }

    /**
     * Sets country.
     * <p>
     * Field description:
     * Country name.
     *
     * @param country
     */
    @JsonProperty("country")
    public void setCountry(String country) {
        this.country = country;
    }

    /**
     * Sets countryCode.
     * <p>
     * Field description:
     * Country code value.
     *
     * @param countryCode
     * @return This {@link WhatsAppAddressContent instance}.
     */
    public WhatsAppAddressContent countryCode(String countryCode) {
        this.countryCode = countryCode;
        return this;
    }

    /**
     * Returns countryCode.
     * <p>
     * Field description:
     * Country code value.
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
     * Country code value.
     *
     * @param countryCode
     */
    @JsonProperty("countryCode")
    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    /**
     * Sets type.
     *
     * @param type
     * @return This {@link WhatsAppAddressContent instance}.
     */
    public WhatsAppAddressContent type(WhatsAppAddressType type) {
        this.type = type;
        return this;
    }

    /**
     * Returns type.
     *
     * @return type
     */
    @JsonProperty("type")
    public WhatsAppAddressType getType() {
        return type;
    }

    /**
     * Sets type.
     *
     * @param type
     */
    @JsonProperty("type")
    public void setType(WhatsAppAddressType type) {
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WhatsAppAddressContent whatsAppAddressContent = (WhatsAppAddressContent) o;
        return Objects.equals(this.street, whatsAppAddressContent.street)
                && Objects.equals(this.city, whatsAppAddressContent.city)
                && Objects.equals(this.state, whatsAppAddressContent.state)
                && Objects.equals(this.zip, whatsAppAddressContent.zip)
                && Objects.equals(this.country, whatsAppAddressContent.country)
                && Objects.equals(this.countryCode, whatsAppAddressContent.countryCode)
                && Objects.equals(this.type, whatsAppAddressContent.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(street, city, state, zip, country, countryCode, type);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class WhatsAppAddressContent {")
                .append(newLine)
                .append("    street: ")
                .append(toIndentedString(street))
                .append(newLine)
                .append("    city: ")
                .append(toIndentedString(city))
                .append(newLine)
                .append("    state: ")
                .append(toIndentedString(state))
                .append(newLine)
                .append("    zip: ")
                .append(toIndentedString(zip))
                .append(newLine)
                .append("    country: ")
                .append(toIndentedString(country))
                .append(newLine)
                .append("    countryCode: ")
                .append(toIndentedString(countryCode))
                .append(newLine)
                .append("    type: ")
                .append(toIndentedString(type))
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
