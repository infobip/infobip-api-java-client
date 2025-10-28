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
 * Address of the importer. Required when catalogId is not provided.
 */
public class MessagesApiMessageOrderImporterAddress {

    private String firstAddressLine;

    private String secondAddressLine;

    private String city;

    private String zoneCode;

    private String postalCode;

    private String countryCode;

    /**
     * Sets firstAddressLine.
     * <p>
     * Field description:
     * First address line.
     *
     * @param firstAddressLine
     * @return This {@link MessagesApiMessageOrderImporterAddress instance}.
     */
    public MessagesApiMessageOrderImporterAddress firstAddressLine(String firstAddressLine) {
        this.firstAddressLine = firstAddressLine;
        return this;
    }

    /**
     * Returns firstAddressLine.
     * <p>
     * Field description:
     * First address line.
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
     * First address line.
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
     * Second address line.
     *
     * @param secondAddressLine
     * @return This {@link MessagesApiMessageOrderImporterAddress instance}.
     */
    public MessagesApiMessageOrderImporterAddress secondAddressLine(String secondAddressLine) {
        this.secondAddressLine = secondAddressLine;
        return this;
    }

    /**
     * Returns secondAddressLine.
     * <p>
     * Field description:
     * Second address line.
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
     * Second address line.
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
     * City name.
     *
     * @param city
     * @return This {@link MessagesApiMessageOrderImporterAddress instance}.
     */
    public MessagesApiMessageOrderImporterAddress city(String city) {
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
     * Sets zoneCode.
     * <p>
     * Field description:
     * Zone code value.
     *
     * @param zoneCode
     * @return This {@link MessagesApiMessageOrderImporterAddress instance}.
     */
    public MessagesApiMessageOrderImporterAddress zoneCode(String zoneCode) {
        this.zoneCode = zoneCode;
        return this;
    }

    /**
     * Returns zoneCode.
     * <p>
     * Field description:
     * Zone code value.
     *
     * @return zoneCode
     */
    @JsonProperty("zoneCode")
    public String getZoneCode() {
        return zoneCode;
    }

    /**
     * Sets zoneCode.
     * <p>
     * Field description:
     * Zone code value.
     *
     * @param zoneCode
     */
    @JsonProperty("zoneCode")
    public void setZoneCode(String zoneCode) {
        this.zoneCode = zoneCode;
    }

    /**
     * Sets postalCode.
     * <p>
     * Field description:
     * Zip code value.
     *
     * @param postalCode
     * @return This {@link MessagesApiMessageOrderImporterAddress instance}.
     */
    public MessagesApiMessageOrderImporterAddress postalCode(String postalCode) {
        this.postalCode = postalCode;
        return this;
    }

    /**
     * Returns postalCode.
     * <p>
     * Field description:
     * Zip code value.
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
     * Zip code value.
     *
     * @param postalCode
     */
    @JsonProperty("postalCode")
    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    /**
     * Sets countryCode.
     * <p>
     * Field description:
     * Country code value.
     *
     * @param countryCode
     * @return This {@link MessagesApiMessageOrderImporterAddress instance}.
     */
    public MessagesApiMessageOrderImporterAddress countryCode(String countryCode) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MessagesApiMessageOrderImporterAddress messagesApiMessageOrderImporterAddress =
                (MessagesApiMessageOrderImporterAddress) o;
        return Objects.equals(this.firstAddressLine, messagesApiMessageOrderImporterAddress.firstAddressLine)
                && Objects.equals(this.secondAddressLine, messagesApiMessageOrderImporterAddress.secondAddressLine)
                && Objects.equals(this.city, messagesApiMessageOrderImporterAddress.city)
                && Objects.equals(this.zoneCode, messagesApiMessageOrderImporterAddress.zoneCode)
                && Objects.equals(this.postalCode, messagesApiMessageOrderImporterAddress.postalCode)
                && Objects.equals(this.countryCode, messagesApiMessageOrderImporterAddress.countryCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstAddressLine, secondAddressLine, city, zoneCode, postalCode, countryCode);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class MessagesApiMessageOrderImporterAddress {")
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
                .append("    zoneCode: ")
                .append(toIndentedString(zoneCode))
                .append(newLine)
                .append("    postalCode: ")
                .append(toIndentedString(postalCode))
                .append(newLine)
                .append("    countryCode: ")
                .append(toIndentedString(countryCode))
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
