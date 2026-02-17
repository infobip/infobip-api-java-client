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
 * Represents RcsInboundLocationContent model.
 */
public class RcsInboundLocationContent extends RcsInboundMessageContent {

    private Double latitude;

    private Double longitude;

    /**
     * Constructs a new {@link RcsInboundLocationContent} instance.
     */
    public RcsInboundLocationContent() {
        super("LOCATION");
    }

    /**
     * Sets latitude.
     * <p>
     * Field description:
     * Latitude. The value must be between -90 and 90.
     * <p>
     * The field is required.
     *
     * @param latitude
     * @return This {@link RcsInboundLocationContent instance}.
     */
    public RcsInboundLocationContent latitude(Double latitude) {
        this.latitude = latitude;
        return this;
    }

    /**
     * Returns latitude.
     * <p>
     * Field description:
     * Latitude. The value must be between -90 and 90.
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
     * Latitude. The value must be between -90 and 90.
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
     * Longitude. The value must be between -180 and 180.
     * <p>
     * The field is required.
     *
     * @param longitude
     * @return This {@link RcsInboundLocationContent instance}.
     */
    public RcsInboundLocationContent longitude(Double longitude) {
        this.longitude = longitude;
        return this;
    }

    /**
     * Returns longitude.
     * <p>
     * Field description:
     * Longitude. The value must be between -180 and 180.
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
     * Longitude. The value must be between -180 and 180.
     * <p>
     * The field is required.
     *
     * @param longitude
     */
    @JsonProperty("longitude")
    public void setLongitude(Double longitude) {
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
        RcsInboundLocationContent rcsInboundLocationContent = (RcsInboundLocationContent) o;
        return Objects.equals(this.latitude, rcsInboundLocationContent.latitude)
                && Objects.equals(this.longitude, rcsInboundLocationContent.longitude)
                && super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(latitude, longitude, super.hashCode());
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class RcsInboundLocationContent {")
                .append(newLine)
                .append("    ")
                .append(toIndentedString(super.toString()))
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
