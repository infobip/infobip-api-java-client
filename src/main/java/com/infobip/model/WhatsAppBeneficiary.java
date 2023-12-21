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
 * Beneficiary for this order. Required when orderType is set to PHYSICAL_GOODS.
 */
public class WhatsAppBeneficiary {

    private String name;

    private String firstAddressLine;

    private String secondAddressLine;

    private String city;

    private String state;

    private WhatsAppBeneficiaryCountry country;

    private String postalCode;

    /**
     * Sets name.
     * <p>
     * Field description:
     * Name of the individual or business receiving the physical goods.
     * <p>
     * The field is required.
     *
     * @param name
     * @return This {@link WhatsAppBeneficiary instance}.
     */
    public WhatsAppBeneficiary name(String name) {
        this.name = name;
        return this;
    }

    /**
     * Returns name.
     * <p>
     * Field description:
     * Name of the individual or business receiving the physical goods.
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
     * Name of the individual or business receiving the physical goods.
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
     * Sets firstAddressLine.
     * <p>
     * Field description:
     * First line of the address.
     * <p>
     * The field is required.
     *
     * @param firstAddressLine
     * @return This {@link WhatsAppBeneficiary instance}.
     */
    public WhatsAppBeneficiary firstAddressLine(String firstAddressLine) {
        this.firstAddressLine = firstAddressLine;
        return this;
    }

    /**
     * Returns firstAddressLine.
     * <p>
     * Field description:
     * First line of the address.
     * <p>
     * The field is required.
     *
     * @return firstAddressLine
     */
    @JsonProperty("firstAddressLine")
    public String getFirstAddressLine() {
        return firstAddressLine;
    }

    /**
     * Sets firstAddressLine.
     * <p>
     * Field description:
     * First line of the address.
     * <p>
     * The field is required.
     *
     * @param firstAddressLine
     */
    @JsonProperty("firstAddressLine")
    public void setFirstAddressLine(String firstAddressLine) {
        this.firstAddressLine = firstAddressLine;
    }

    /**
     * Sets secondAddressLine.
     * <p>
     * Field description:
     * Second line of the address.
     *
     * @param secondAddressLine
     * @return This {@link WhatsAppBeneficiary instance}.
     */
    public WhatsAppBeneficiary secondAddressLine(String secondAddressLine) {
        this.secondAddressLine = secondAddressLine;
        return this;
    }

    /**
     * Returns secondAddressLine.
     * <p>
     * Field description:
     * Second line of the address.
     *
     * @return secondAddressLine
     */
    @JsonProperty("secondAddressLine")
    public String getSecondAddressLine() {
        return secondAddressLine;
    }

    /**
     * Sets secondAddressLine.
     * <p>
     * Field description:
     * Second line of the address.
     *
     * @param secondAddressLine
     */
    @JsonProperty("secondAddressLine")
    public void setSecondAddressLine(String secondAddressLine) {
        this.secondAddressLine = secondAddressLine;
    }

    /**
     * Sets city.
     * <p>
     * Field description:
     * City.
     *
     * @param city
     * @return This {@link WhatsAppBeneficiary instance}.
     */
    public WhatsAppBeneficiary city(String city) {
        this.city = city;
        return this;
    }

    /**
     * Returns city.
     * <p>
     * Field description:
     * City.
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
     * City.
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
     * State.
     *
     * @param state
     * @return This {@link WhatsAppBeneficiary instance}.
     */
    public WhatsAppBeneficiary state(String state) {
        this.state = state;
        return this;
    }

    /**
     * Returns state.
     * <p>
     * Field description:
     * State.
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
     * State.
     *
     * @param state
     */
    @JsonProperty("state")
    public void setState(String state) {
        this.state = state;
    }

    /**
     * Sets country.
     * <p>
     * The field is required.
     *
     * @param country
     * @return This {@link WhatsAppBeneficiary instance}.
     */
    public WhatsAppBeneficiary country(WhatsAppBeneficiaryCountry country) {
        this.country = country;
        return this;
    }

    /**
     * Returns country.
     * <p>
     * The field is required.
     *
     * @return country
     */
    @JsonProperty("country")
    public WhatsAppBeneficiaryCountry getCountry() {
        return country;
    }

    /**
     * Sets country.
     * <p>
     * The field is required.
     *
     * @param country
     */
    @JsonProperty("country")
    public void setCountry(WhatsAppBeneficiaryCountry country) {
        this.country = country;
    }

    /**
     * Sets postalCode.
     * <p>
     * Field description:
     * Postal code.
     * <p>
     * The field is required.
     *
     * @param postalCode
     * @return This {@link WhatsAppBeneficiary instance}.
     */
    public WhatsAppBeneficiary postalCode(String postalCode) {
        this.postalCode = postalCode;
        return this;
    }

    /**
     * Returns postalCode.
     * <p>
     * Field description:
     * Postal code.
     * <p>
     * The field is required.
     *
     * @return postalCode
     */
    @JsonProperty("postalCode")
    public String getPostalCode() {
        return postalCode;
    }

    /**
     * Sets postalCode.
     * <p>
     * Field description:
     * Postal code.
     * <p>
     * The field is required.
     *
     * @param postalCode
     */
    @JsonProperty("postalCode")
    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WhatsAppBeneficiary whatsAppBeneficiary = (WhatsAppBeneficiary) o;
        return Objects.equals(this.name, whatsAppBeneficiary.name)
                && Objects.equals(this.firstAddressLine, whatsAppBeneficiary.firstAddressLine)
                && Objects.equals(this.secondAddressLine, whatsAppBeneficiary.secondAddressLine)
                && Objects.equals(this.city, whatsAppBeneficiary.city)
                && Objects.equals(this.state, whatsAppBeneficiary.state)
                && Objects.equals(this.country, whatsAppBeneficiary.country)
                && Objects.equals(this.postalCode, whatsAppBeneficiary.postalCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, firstAddressLine, secondAddressLine, city, state, country, postalCode);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class WhatsAppBeneficiary {")
                .append(newLine)
                .append("    name: ")
                .append(toIndentedString(name))
                .append(newLine)
                .append("    firstAddressLine: ")
                .append(toIndentedString(firstAddressLine))
                .append(newLine)
                .append("    secondAddressLine: ")
                .append(toIndentedString(secondAddressLine))
                .append(newLine)
                .append("    city: ")
                .append(toIndentedString(city))
                .append(newLine)
                .append("    state: ")
                .append(toIndentedString(state))
                .append(newLine)
                .append("    country: ")
                .append(toIndentedString(country))
                .append(newLine)
                .append("    postalCode: ")
                .append(toIndentedString(postalCode))
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
