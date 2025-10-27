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
 * Location of the event.
 */
public class MessagesApiMessageTimePickerLocation {

    private Double latitude;

    private Double longitude;

    private Double radius;

    private String name;

    /**
     * Sets latitude.
     * <p>
     * Field description:
     * Latitude of the location.
     * <p>
     * The field is required.
     *
     * @param latitude
     * @return This {@link MessagesApiMessageTimePickerLocation instance}.
     */
    public MessagesApiMessageTimePickerLocation latitude(Double latitude) {
        this.latitude = latitude;
        return this;
    }

    /**
     * Returns latitude.
     * <p>
     * Field description:
     * Latitude of the location.
     * <p>
     * The field is required.
     *
     * @return latitude
     */
    @JsonProperty("latitude")
    public Double getLatitude() {
        return latitude;
    }

    /**
     * Sets latitude.
     * <p>
     * Field description:
     * Latitude of the location.
     * <p>
     * The field is required.
     *
     * @param latitude
     */
    @JsonProperty("latitude")
    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    /**
     * Sets longitude.
     * <p>
     * Field description:
     * Longitude of the location.
     * <p>
     * The field is required.
     *
     * @param longitude
     * @return This {@link MessagesApiMessageTimePickerLocation instance}.
     */
    public MessagesApiMessageTimePickerLocation longitude(Double longitude) {
        this.longitude = longitude;
        return this;
    }

    /**
     * Returns longitude.
     * <p>
     * Field description:
     * Longitude of the location.
     * <p>
     * The field is required.
     *
     * @return longitude
     */
    @JsonProperty("longitude")
    public Double getLongitude() {
        return longitude;
    }

    /**
     * Sets longitude.
     * <p>
     * Field description:
     * Longitude of the location.
     * <p>
     * The field is required.
     *
     * @param longitude
     */
    @JsonProperty("longitude")
    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    /**
     * Sets radius.
     * <p>
     * Field description:
     * Radius of the location in meters.
     *
     * @param radius
     * @return This {@link MessagesApiMessageTimePickerLocation instance}.
     */
    public MessagesApiMessageTimePickerLocation radius(Double radius) {
        this.radius = radius;
        return this;
    }

    /**
     * Returns radius.
     * <p>
     * Field description:
     * Radius of the location in meters.
     *
     * @return radius
     */
    @JsonProperty("radius")
    public Double getRadius() {
        return radius;
    }

    /**
     * Sets radius.
     * <p>
     * Field description:
     * Radius of the location in meters.
     *
     * @param radius
     */
    @JsonProperty("radius")
    public void setRadius(Double radius) {
        this.radius = radius;
    }

    /**
     * Sets name.
     * <p>
     * Field description:
     * Name of the location.
     * <p>
     * The field is required.
     *
     * @param name
     * @return This {@link MessagesApiMessageTimePickerLocation instance}.
     */
    public MessagesApiMessageTimePickerLocation name(String name) {
        this.name = name;
        return this;
    }

    /**
     * Returns name.
     * <p>
     * Field description:
     * Name of the location.
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
     * Name of the location.
     * <p>
     * The field is required.
     *
     * @param name
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MessagesApiMessageTimePickerLocation messagesApiMessageTimePickerLocation =
                (MessagesApiMessageTimePickerLocation) o;
        return Objects.equals(this.latitude, messagesApiMessageTimePickerLocation.latitude)
                && Objects.equals(this.longitude, messagesApiMessageTimePickerLocation.longitude)
                && Objects.equals(this.radius, messagesApiMessageTimePickerLocation.radius)
                && Objects.equals(this.name, messagesApiMessageTimePickerLocation.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(latitude, longitude, radius, name);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class MessagesApiMessageTimePickerLocation {")
                .append(newLine)
                .append("    latitude: ")
                .append(toIndentedString(latitude))
                .append(newLine)
                .append("    longitude: ")
                .append(toIndentedString(longitude))
                .append(newLine)
                .append("    radius: ")
                .append(toIndentedString(radius))
                .append(newLine)
                .append("    name: ")
                .append(toIndentedString(name))
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
