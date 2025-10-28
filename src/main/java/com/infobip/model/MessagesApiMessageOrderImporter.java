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
 * (WhatsApp specific) Importer data. Required when catalogId is not provided. It&#39;s supported only for UPI PayU payments.
 */
public class MessagesApiMessageOrderImporter {

    private String name;

    private MessagesApiMessageOrderImporterAddress address;

    private String originCountry;

    /**
     * Sets name.
     * <p>
     * Field description:
     * Name of the importer. Required when catalogId is not provided.
     *
     * @param name
     * @return This {@link MessagesApiMessageOrderImporter instance}.
     */
    public MessagesApiMessageOrderImporter name(String name) {
        this.name = name;
        return this;
    }

    /**
     * Returns name.
     * <p>
     * Field description:
     * Name of the importer. Required when catalogId is not provided.
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
     * Name of the importer. Required when catalogId is not provided.
     *
     * @param name
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Sets address.
     *
     * @param address
     * @return This {@link MessagesApiMessageOrderImporter instance}.
     */
    public MessagesApiMessageOrderImporter address(MessagesApiMessageOrderImporterAddress address) {
        this.address = address;
        return this;
    }

    /**
     * Returns address.
     *
     * @return address
     */
    @JsonProperty("address")
    public MessagesApiMessageOrderImporterAddress getAddress() {
        return address;
    }

    /**
     * Sets address.
     *
     * @param address
     */
    @JsonProperty("address")
    public void setAddress(MessagesApiMessageOrderImporterAddress address) {
        this.address = address;
    }

    /**
     * Sets originCountry.
     * <p>
     * Field description:
     * Country of origin. Required when catalogId is not provided.
     *
     * @param originCountry
     * @return This {@link MessagesApiMessageOrderImporter instance}.
     */
    public MessagesApiMessageOrderImporter originCountry(String originCountry) {
        this.originCountry = originCountry;
        return this;
    }

    /**
     * Returns originCountry.
     * <p>
     * Field description:
     * Country of origin. Required when catalogId is not provided.
     *
     * @return originCountry
     */
    @JsonProperty("originCountry")
    public String getOriginCountry() {
        return originCountry;
    }

    /**
     * Sets originCountry.
     * <p>
     * Field description:
     * Country of origin. Required when catalogId is not provided.
     *
     * @param originCountry
     */
    @JsonProperty("originCountry")
    public void setOriginCountry(String originCountry) {
        this.originCountry = originCountry;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MessagesApiMessageOrderImporter messagesApiMessageOrderImporter = (MessagesApiMessageOrderImporter) o;
        return Objects.equals(this.name, messagesApiMessageOrderImporter.name)
                && Objects.equals(this.address, messagesApiMessageOrderImporter.address)
                && Objects.equals(this.originCountry, messagesApiMessageOrderImporter.originCountry);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, address, originCountry);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class MessagesApiMessageOrderImporter {")
                .append(newLine)
                .append("    name: ")
                .append(toIndentedString(name))
                .append(newLine)
                .append("    address: ")
                .append(toIndentedString(address))
                .append(newLine)
                .append("    originCountry: ")
                .append(toIndentedString(originCountry))
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
