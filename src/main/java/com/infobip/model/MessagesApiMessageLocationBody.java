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
 * Represents MessagesApiMessageLocationBody model.
 */
public class MessagesApiMessageLocationBody extends MessagesApiMessageBody {

    private Double latitude;

    private Double longitude;

    private String name;

    private String address;

    /**
     * Constructs a new {@link MessagesApiMessageLocationBody} instance.
     */
    public MessagesApiMessageLocationBody() {
        super("LOCATION");
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
     * @return This {@link MessagesApiMessageLocationBody instance}.
     */
    public MessagesApiMessageLocationBody latitude(Double latitude) {
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
     * @return This {@link MessagesApiMessageLocationBody instance}.
     */
    public MessagesApiMessageLocationBody longitude(Double longitude) {
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
     * Sets name.
     * <p>
     * Field description:
     * Location name.
     *
     * @param name
     * @return This {@link MessagesApiMessageLocationBody instance}.
     */
    public MessagesApiMessageLocationBody name(String name) {
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
     * @return This {@link MessagesApiMessageLocationBody instance}.
     */
    public MessagesApiMessageLocationBody address(String address) {
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
        MessagesApiMessageLocationBody messagesApiMessageLocationBody = (MessagesApiMessageLocationBody) o;
        return Objects.equals(this.latitude, messagesApiMessageLocationBody.latitude)
                && Objects.equals(this.longitude, messagesApiMessageLocationBody.longitude)
                && Objects.equals(this.name, messagesApiMessageLocationBody.name)
                && Objects.equals(this.address, messagesApiMessageLocationBody.address)
                && super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(latitude, longitude, name, address, super.hashCode());
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class MessagesApiMessageLocationBody {")
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
