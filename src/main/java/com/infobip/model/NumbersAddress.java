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
 * The address of the brand.
 */
public class NumbersAddress {

    private String city;

    private String state;

    private String street;

    private String zipCode;

    /**
     * Sets city.
     * <p>
     * Field description:
     * The city in which the brand is located.
     * <p>
     * The field is required.
     *
     * @param city
     * @return This {@link NumbersAddress instance}.
     */
    public NumbersAddress city(String city) {
        this.city = city;
        return this;
    }

    /**
     * Returns city.
     * <p>
     * Field description:
     * The city in which the brand is located.
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
     * The city in which the brand is located.
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
     * Sets state.
     * <p>
     * Field description:
     * State or province. For the United States, please use 2 character codes. E.g. &#39;CA&#39; for California.
     *
     * @param state
     * @return This {@link NumbersAddress instance}.
     */
    public NumbersAddress state(String state) {
        this.state = state;
        return this;
    }

    /**
     * Returns state.
     * <p>
     * Field description:
     * State or province. For the United States, please use 2 character codes. E.g. &#39;CA&#39; for California.
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
     * State or province. For the United States, please use 2 character codes. E.g. &#39;CA&#39; for California.
     *
     * @param state
     */
    @JsonProperty("state")
    public void setState(String state) {
        this.state = state;
    }

    /**
     * Sets street.
     * <p>
     * Field description:
     * The street address for the brand.
     * <p>
     * The field is required.
     *
     * @param street
     * @return This {@link NumbersAddress instance}.
     */
    public NumbersAddress street(String street) {
        this.street = street;
        return this;
    }

    /**
     * Returns street.
     * <p>
     * Field description:
     * The street address for the brand.
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
     * The street address for the brand.
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
     * Sets zipCode.
     * <p>
     * Field description:
     * The zipcode in which the brand is located.
     * <p>
     * The field is required.
     *
     * @param zipCode
     * @return This {@link NumbersAddress instance}.
     */
    public NumbersAddress zipCode(String zipCode) {
        this.zipCode = zipCode;
        return this;
    }

    /**
     * Returns zipCode.
     * <p>
     * Field description:
     * The zipcode in which the brand is located.
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
     * The zipcode in which the brand is located.
     * <p>
     * The field is required.
     *
     * @param zipCode
     */
    @JsonProperty("zipCode")
    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        NumbersAddress numbersAddress = (NumbersAddress) o;
        return Objects.equals(this.city, numbersAddress.city)
                && Objects.equals(this.state, numbersAddress.state)
                && Objects.equals(this.street, numbersAddress.street)
                && Objects.equals(this.zipCode, numbersAddress.zipCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(city, state, street, zipCode);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class NumbersAddress {")
                .append(newLine)
                .append("    city: ")
                .append(toIndentedString(city))
                .append(newLine)
                .append("    state: ")
                .append(toIndentedString(state))
                .append(newLine)
                .append("    street: ")
                .append(toIndentedString(street))
                .append(newLine)
                .append("    zipCode: ")
                .append(toIndentedString(zipCode))
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
