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
 * Geolocation data such as Country and City. This data will be available only for opens, clicks and unsubscribes.
 */
public class EmailWebhookGeoLocation {

    private String countryName;

    private String city;

    /**
     * Sets countryName.
     * <p>
     * Field description:
     * Country where the user action is recorded.
     *
     * @param countryName
     * @return This {@link EmailWebhookGeoLocation instance}.
     */
    public EmailWebhookGeoLocation countryName(String countryName) {
        this.countryName = countryName;
        return this;
    }

    /**
     * Returns countryName.
     * <p>
     * Field description:
     * Country where the user action is recorded.
     *
     * @return countryName
     */
    @JsonProperty("countryName")
    public String getCountryName() {
        return countryName;
    }

    /**
     * Sets countryName.
     * <p>
     * Field description:
     * Country where the user action is recorded.
     *
     * @param countryName
     */
    @JsonProperty("countryName")
    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    /**
     * Sets city.
     * <p>
     * Field description:
     * City where the user action is recorded.
     *
     * @param city
     * @return This {@link EmailWebhookGeoLocation instance}.
     */
    public EmailWebhookGeoLocation city(String city) {
        this.city = city;
        return this;
    }

    /**
     * Returns city.
     * <p>
     * Field description:
     * City where the user action is recorded.
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
     * City where the user action is recorded.
     *
     * @param city
     */
    @JsonProperty("city")
    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        EmailWebhookGeoLocation emailWebhookGeoLocation = (EmailWebhookGeoLocation) o;
        return Objects.equals(this.countryName, emailWebhookGeoLocation.countryName)
                && Objects.equals(this.city, emailWebhookGeoLocation.city);
    }

    @Override
    public int hashCode() {
        return Objects.hash(countryName, city);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class EmailWebhookGeoLocation {")
                .append(newLine)
                .append("    countryName: ")
                .append(toIndentedString(countryName))
                .append(newLine)
                .append("    city: ")
                .append(toIndentedString(city))
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
