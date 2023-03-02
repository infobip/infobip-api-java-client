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
 * Geolocation data such as Country, City, Latitude and Longitude. This data will be available only for opens and clicks.
 */
public class EmailWebhookGeoLocation {

    private String countryName;

    private String city;

    private String latitude;

    private String longitude;

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
    @JsonProperty("country_name")
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
    @JsonProperty("country_name")
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

    /**
     * Sets latitude.
     * <p>
     * Field description:
     * Latitude of the action originating device.
     *
     * @param latitude
     * @return This {@link EmailWebhookGeoLocation instance}.
     */
    public EmailWebhookGeoLocation latitude(String latitude) {
        this.latitude = latitude;
        return this;
    }

    /**
     * Returns latitude.
     * <p>
     * Field description:
     * Latitude of the action originating device.
     *
     * @return latitude
     */
    @JsonProperty("latitude")
    public String getLatitude() {
        return latitude;
    }

    /**
     * Sets latitude.
     * <p>
     * Field description:
     * Latitude of the action originating device.
     *
     * @param latitude
     */
    @JsonProperty("latitude")
    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    /**
     * Sets longitude.
     * <p>
     * Field description:
     * Longitude of the action originating device.
     *
     * @param longitude
     * @return This {@link EmailWebhookGeoLocation instance}.
     */
    public EmailWebhookGeoLocation longitude(String longitude) {
        this.longitude = longitude;
        return this;
    }

    /**
     * Returns longitude.
     * <p>
     * Field description:
     * Longitude of the action originating device.
     *
     * @return longitude
     */
    @JsonProperty("longitude")
    public String getLongitude() {
        return longitude;
    }

    /**
     * Sets longitude.
     * <p>
     * Field description:
     * Longitude of the action originating device.
     *
     * @param longitude
     */
    @JsonProperty("longitude")
    public void setLongitude(String longitude) {
        this.longitude = longitude;
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
                && Objects.equals(this.city, emailWebhookGeoLocation.city)
                && Objects.equals(this.latitude, emailWebhookGeoLocation.latitude)
                && Objects.equals(this.longitude, emailWebhookGeoLocation.longitude);
    }

    @Override
    public int hashCode() {
        return Objects.hash(countryName, city, latitude, longitude);
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
                .append("    latitude: ")
                .append(toIndentedString(latitude))
                .append(newLine)
                .append("    longitude: ")
                .append(toIndentedString(longitude))
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
