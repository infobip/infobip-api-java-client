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
 * The content object to build a message that will be sent.
 */
public class WhatsAppLocationContent {

    private Double latitude;

    private Double longitude;

    private String name;

    private String address;

    /**
     * Sets latitude.
     * <p>
     * Field description:
     * Latitude of a location sent in the WhatsApp message.
     * <p>
     * The field is required.
     *
     * @param latitude
     * @return This {@link WhatsAppLocationContent instance}.
     */
    public WhatsAppLocationContent latitude(Double latitude) {
        this.latitude = latitude;
        return this;
    }

    /**
     * Returns latitude.
     * <p>
     * Field description:
     * Latitude of a location sent in the WhatsApp message.
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
     * Latitude of a location sent in the WhatsApp message.
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
     * Longitude of a location sent in the WhatsApp message.
     * <p>
     * The field is required.
     *
     * @param longitude
     * @return This {@link WhatsAppLocationContent instance}.
     */
    public WhatsAppLocationContent longitude(Double longitude) {
        this.longitude = longitude;
        return this;
    }

    /**
     * Returns longitude.
     * <p>
     * Field description:
     * Longitude of a location sent in the WhatsApp message.
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
     * Longitude of a location sent in the WhatsApp message.
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
     * Sets name.
     * <p>
     * Field description:
     * Location name.
     *
     * @param name
     * @return This {@link WhatsAppLocationContent instance}.
     */
    public WhatsAppLocationContent name(String name) {
        this.name = name;
        return this;
    }

    /**
     * Returns name.
     * <p>
     * Field description:
     * Location name.
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
     * Location name.
     *
     * @param name
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Sets address.
     * <p>
     * Field description:
     * Location address.
     *
     * @param address
     * @return This {@link WhatsAppLocationContent instance}.
     */
    public WhatsAppLocationContent address(String address) {
        this.address = address;
        return this;
    }

    /**
     * Returns address.
     * <p>
     * Field description:
     * Location address.
     *
     * @return address
     */
    @JsonProperty("address")
    public String getAddress() {
        return address;
    }

    /**
     * Sets address.
     * <p>
     * Field description:
     * Location address.
     *
     * @param address
     */
    @JsonProperty("address")
    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WhatsAppLocationContent whatsAppLocationContent = (WhatsAppLocationContent) o;
        return Objects.equals(this.latitude, whatsAppLocationContent.latitude)
                && Objects.equals(this.longitude, whatsAppLocationContent.longitude)
                && Objects.equals(this.name, whatsAppLocationContent.name)
                && Objects.equals(this.address, whatsAppLocationContent.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(latitude, longitude, name, address);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class WhatsAppLocationContent {")
                .append(newLine)
                .append("    latitude: ")
                .append(toIndentedString(latitude))
                .append(newLine)
                .append("    longitude: ")
                .append(toIndentedString(longitude))
                .append(newLine)
                .append("    name: ")
                .append(toIndentedString(name))
                .append(newLine)
                .append("    address: ")
                .append(toIndentedString(address))
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
