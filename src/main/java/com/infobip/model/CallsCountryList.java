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
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Represents CallsCountryList model.
 */
public class CallsCountryList {

    private List<CallsPublicCountry> countries = null;

    /**
     * Sets countries.
     * <p>
     * Field description:
     * List of countries.
     *
     * @param countries
     * @return This {@link CallsCountryList instance}.
     */
    public CallsCountryList countries(List<CallsPublicCountry> countries) {
        this.countries = countries;
        return this;
    }

    /**
     * Adds and item into countries.
     * <p>
     * Field description:
     * List of countries.
     *
     * @param countriesItem The item to be added to the list.
     * @return This {@link CallsCountryList instance}.
     */
    public CallsCountryList addCountriesItem(CallsPublicCountry countriesItem) {
        if (this.countries == null) {
            this.countries = new ArrayList<>();
        }
        this.countries.add(countriesItem);
        return this;
    }

    /**
     * Returns countries.
     * <p>
     * Field description:
     * List of countries.
     *
     * @return countries
     */
    @JsonProperty("countries")
    public List<CallsPublicCountry> getCountries() {
        return countries;
    }

    /**
     * Sets countries.
     * <p>
     * Field description:
     * List of countries.
     *
     * @param countries
     */
    @JsonProperty("countries")
    public void setCountries(List<CallsPublicCountry> countries) {
        this.countries = countries;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CallsCountryList callsCountryList = (CallsCountryList) o;
        return Objects.equals(this.countries, callsCountryList.countries);
    }

    @Override
    public int hashCode() {
        return Objects.hash(countries);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class CallsCountryList {")
                .append(newLine)
                .append("    countries: ")
                .append(toIndentedString(countries))
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
