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
 * Represents NumbersNumberResponse model.
 */
public class NumbersNumberResponse {

    private String numberKey;

    private String number;

    private String country;

    private String countryName;

    private NumberType type;

    private List<NumbersNumberCapabilityType> capabilities = null;

    private Boolean shared;

    private NumbersNumberPrice price;

    private String network;

    private List<String> keywords = null;

    private NumbersVoiceSetup voiceSetup;

    private NumbersReservationStatus reservationStatus;

    private Boolean additionalSetupRequired;

    private NumbersEditPermissions editPermissions;

    private String note;

    private String applicationId;

    private String entityId;

    /**
     * Sets numberKey.
     * <p>
     * Field description:
     * Unique ID of a number.
     *
     * @param numberKey
     * @return This {@link NumbersNumberResponse instance}.
     */
    public NumbersNumberResponse numberKey(String numberKey) {
        this.numberKey = numberKey;
        return this;
    }

    /**
     * Returns numberKey.
     * <p>
     * Field description:
     * Unique ID of a number.
     *
     * @return numberKey
     */
    @JsonProperty("numberKey")
    public String getNumberKey() {
        return numberKey;
    }

    /**
     * Sets numberKey.
     * <p>
     * Field description:
     * Unique ID of a number.
     *
     * @param numberKey
     */
    @JsonProperty("numberKey")
    public void setNumberKey(String numberKey) {
        this.numberKey = numberKey;
    }

    /**
     * Sets number.
     * <p>
     * Field description:
     * The number.
     *
     * @param number
     * @return This {@link NumbersNumberResponse instance}.
     */
    public NumbersNumberResponse number(String number) {
        this.number = number;
        return this;
    }

    /**
     * Returns number.
     * <p>
     * Field description:
     * The number.
     *
     * @return number
     */
    @JsonProperty("number")
    public String getNumber() {
        return number;
    }

    /**
     * Sets number.
     * <p>
     * Field description:
     * The number.
     *
     * @param number
     */
    @JsonProperty("number")
    public void setNumber(String number) {
        this.number = number;
    }

    /**
     * Sets country.
     * <p>
     * Field description:
     * Number&#39;s country code.
     *
     * @param country
     * @return This {@link NumbersNumberResponse instance}.
     */
    public NumbersNumberResponse country(String country) {
        this.country = country;
        return this;
    }

    /**
     * Returns country.
     * <p>
     * Field description:
     * Number&#39;s country code.
     *
     * @return country
     */
    @JsonProperty("country")
    public String getCountry() {
        return country;
    }

    /**
     * Sets country.
     * <p>
     * Field description:
     * Number&#39;s country code.
     *
     * @param country
     */
    @JsonProperty("country")
    public void setCountry(String country) {
        this.country = country;
    }

    /**
     * Sets countryName.
     * <p>
     * Field description:
     * Number&#39;s country.
     *
     * @param countryName
     * @return This {@link NumbersNumberResponse instance}.
     */
    public NumbersNumberResponse countryName(String countryName) {
        this.countryName = countryName;
        return this;
    }

    /**
     * Returns countryName.
     * <p>
     * Field description:
     * Number&#39;s country.
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
     * Number&#39;s country.
     *
     * @param countryName
     */
    @JsonProperty("countryName")
    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    /**
     * Sets type.
     *
     * @param type
     * @return This {@link NumbersNumberResponse instance}.
     */
    public NumbersNumberResponse type(NumberType type) {
        this.type = type;
        return this;
    }

    /**
     * Returns type.
     *
     * @return type
     */
    @JsonProperty("type")
    public NumberType getType() {
        return type;
    }

    /**
     * Sets type.
     *
     * @param type
     */
    @JsonProperty("type")
    public void setType(NumberType type) {
        this.type = type;
    }

    /**
     * Sets capabilities.
     * <p>
     * Field description:
     * An array of communication channels the number can support.
     *
     * @param capabilities
     * @return This {@link NumbersNumberResponse instance}.
     */
    public NumbersNumberResponse capabilities(List<NumbersNumberCapabilityType> capabilities) {
        this.capabilities = capabilities;
        return this;
    }

    /**
     * Adds and item into capabilities.
     * <p>
     * Field description:
     * An array of communication channels the number can support.
     *
     * @param capabilitiesItem The item to be added to the list.
     * @return This {@link NumbersNumberResponse instance}.
     */
    public NumbersNumberResponse addCapabilitiesItem(NumbersNumberCapabilityType capabilitiesItem) {
        if (this.capabilities == null) {
            this.capabilities = new ArrayList<>();
        }
        this.capabilities.add(capabilitiesItem);
        return this;
    }

    /**
     * Returns capabilities.
     * <p>
     * Field description:
     * An array of communication channels the number can support.
     *
     * @return capabilities
     */
    @JsonProperty("capabilities")
    public List<NumbersNumberCapabilityType> getCapabilities() {
        return capabilities;
    }

    /**
     * Sets capabilities.
     * <p>
     * Field description:
     * An array of communication channels the number can support.
     *
     * @param capabilities
     */
    @JsonProperty("capabilities")
    public void setCapabilities(List<NumbersNumberCapabilityType> capabilities) {
        this.capabilities = capabilities;
    }

    /**
     * Sets shared.
     * <p>
     * Field description:
     * Indicates whether a number is shared.
     *
     * @param shared
     * @return This {@link NumbersNumberResponse instance}.
     */
    public NumbersNumberResponse shared(Boolean shared) {
        this.shared = shared;
        return this;
    }

    /**
     * Returns shared.
     * <p>
     * Field description:
     * Indicates whether a number is shared.
     *
     * @return shared
     */
    @JsonProperty("shared")
    public Boolean getShared() {
        return shared;
    }

    /**
     * Sets shared.
     * <p>
     * Field description:
     * Indicates whether a number is shared.
     *
     * @param shared
     */
    @JsonProperty("shared")
    public void setShared(Boolean shared) {
        this.shared = shared;
    }

    /**
     * Sets price.
     *
     * @param price
     * @return This {@link NumbersNumberResponse instance}.
     */
    public NumbersNumberResponse price(NumbersNumberPrice price) {
        this.price = price;
        return this;
    }

    /**
     * Returns price.
     *
     * @return price
     */
    @JsonProperty("price")
    public NumbersNumberPrice getPrice() {
        return price;
    }

    /**
     * Sets price.
     *
     * @param price
     */
    @JsonProperty("price")
    public void setPrice(NumbersNumberPrice price) {
        this.price = price;
    }

    /**
     * Sets network.
     * <p>
     * Field description:
     * Indicates the network that owns the number.
     *
     * @param network
     * @return This {@link NumbersNumberResponse instance}.
     */
    public NumbersNumberResponse network(String network) {
        this.network = network;
        return this;
    }

    /**
     * Returns network.
     * <p>
     * Field description:
     * Indicates the network that owns the number.
     *
     * @return network
     */
    @JsonProperty("network")
    public String getNetwork() {
        return network;
    }

    /**
     * Sets network.
     * <p>
     * Field description:
     * Indicates the network that owns the number.
     *
     * @param network
     */
    @JsonProperty("network")
    public void setNetwork(String network) {
        this.network = network;
    }

    /**
     * Sets keywords.
     * <p>
     * Field description:
     * Keywords defined for the number.
     *
     * @param keywords
     * @return This {@link NumbersNumberResponse instance}.
     */
    public NumbersNumberResponse keywords(List<String> keywords) {
        this.keywords = keywords;
        return this;
    }

    /**
     * Adds and item into keywords.
     * <p>
     * Field description:
     * Keywords defined for the number.
     *
     * @param keywordsItem The item to be added to the list.
     * @return This {@link NumbersNumberResponse instance}.
     */
    public NumbersNumberResponse addKeywordsItem(String keywordsItem) {
        if (this.keywords == null) {
            this.keywords = new ArrayList<>();
        }
        this.keywords.add(keywordsItem);
        return this;
    }

    /**
     * Returns keywords.
     * <p>
     * Field description:
     * Keywords defined for the number.
     *
     * @return keywords
     */
    @JsonProperty("keywords")
    public List<String> getKeywords() {
        return keywords;
    }

    /**
     * Sets keywords.
     * <p>
     * Field description:
     * Keywords defined for the number.
     *
     * @param keywords
     */
    @JsonProperty("keywords")
    public void setKeywords(List<String> keywords) {
        this.keywords = keywords;
    }

    /**
     * Sets voiceSetup.
     *
     * @param voiceSetup
     * @return This {@link NumbersNumberResponse instance}.
     */
    public NumbersNumberResponse voiceSetup(NumbersVoiceSetup voiceSetup) {
        this.voiceSetup = voiceSetup;
        return this;
    }

    /**
     * Returns voiceSetup.
     *
     * @return voiceSetup
     */
    @JsonProperty("voiceSetup")
    public NumbersVoiceSetup getVoiceSetup() {
        return voiceSetup;
    }

    /**
     * Sets voiceSetup.
     *
     * @param voiceSetup
     */
    @JsonProperty("voiceSetup")
    public void setVoiceSetup(NumbersVoiceSetup voiceSetup) {
        this.voiceSetup = voiceSetup;
    }

    /**
     * Sets reservationStatus.
     *
     * @param reservationStatus
     * @return This {@link NumbersNumberResponse instance}.
     */
    public NumbersNumberResponse reservationStatus(NumbersReservationStatus reservationStatus) {
        this.reservationStatus = reservationStatus;
        return this;
    }

    /**
     * Returns reservationStatus.
     *
     * @return reservationStatus
     */
    @JsonProperty("reservationStatus")
    public NumbersReservationStatus getReservationStatus() {
        return reservationStatus;
    }

    /**
     * Sets reservationStatus.
     *
     * @param reservationStatus
     */
    @JsonProperty("reservationStatus")
    public void setReservationStatus(NumbersReservationStatus reservationStatus) {
        this.reservationStatus = reservationStatus;
    }

    /**
     * Sets additionalSetupRequired.
     * <p>
     * Field description:
     * Indicates whether the number requires additional setup before being used.
     *
     * @param additionalSetupRequired
     * @return This {@link NumbersNumberResponse instance}.
     */
    public NumbersNumberResponse additionalSetupRequired(Boolean additionalSetupRequired) {
        this.additionalSetupRequired = additionalSetupRequired;
        return this;
    }

    /**
     * Returns additionalSetupRequired.
     * <p>
     * Field description:
     * Indicates whether the number requires additional setup before being used.
     *
     * @return additionalSetupRequired
     */
    @JsonProperty("additionalSetupRequired")
    public Boolean getAdditionalSetupRequired() {
        return additionalSetupRequired;
    }

    /**
     * Sets additionalSetupRequired.
     * <p>
     * Field description:
     * Indicates whether the number requires additional setup before being used.
     *
     * @param additionalSetupRequired
     */
    @JsonProperty("additionalSetupRequired")
    public void setAdditionalSetupRequired(Boolean additionalSetupRequired) {
        this.additionalSetupRequired = additionalSetupRequired;
    }

    /**
     * Sets editPermissions.
     *
     * @param editPermissions
     * @return This {@link NumbersNumberResponse instance}.
     */
    public NumbersNumberResponse editPermissions(NumbersEditPermissions editPermissions) {
        this.editPermissions = editPermissions;
        return this;
    }

    /**
     * Returns editPermissions.
     *
     * @return editPermissions
     */
    @JsonProperty("editPermissions")
    public NumbersEditPermissions getEditPermissions() {
        return editPermissions;
    }

    /**
     * Sets editPermissions.
     *
     * @param editPermissions
     */
    @JsonProperty("editPermissions")
    public void setEditPermissions(NumbersEditPermissions editPermissions) {
        this.editPermissions = editPermissions;
    }

    /**
     * Sets note.
     * <p>
     * Field description:
     * Additional information attached to the number. Available only for SHORT_CODE and VIRTUAL_LONG_NUMBER number types.
     *
     * @param note
     * @return This {@link NumbersNumberResponse instance}.
     */
    public NumbersNumberResponse note(String note) {
        this.note = note;
        return this;
    }

    /**
     * Returns note.
     * <p>
     * Field description:
     * Additional information attached to the number. Available only for SHORT_CODE and VIRTUAL_LONG_NUMBER number types.
     *
     * @return note
     */
    @JsonProperty("note")
    public String getNote() {
        return note;
    }

    /**
     * Sets note.
     * <p>
     * Field description:
     * Additional information attached to the number. Available only for SHORT_CODE and VIRTUAL_LONG_NUMBER number types.
     *
     * @param note
     */
    @JsonProperty("note")
    public void setNote(String note) {
        this.note = note;
    }

    /**
     * Sets applicationId.
     * <p>
     * Field description:
     * ID of the Application that would be associated with the number.
     *
     * @param applicationId
     * @return This {@link NumbersNumberResponse instance}.
     */
    public NumbersNumberResponse applicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }

    /**
     * Returns applicationId.
     * <p>
     * Field description:
     * ID of the Application that would be associated with the number.
     *
     * @return applicationId
     */
    @JsonProperty("applicationId")
    public String getApplicationId() {
        return applicationId;
    }

    /**
     * Sets applicationId.
     * <p>
     * Field description:
     * ID of the Application that would be associated with the number.
     *
     * @param applicationId
     */
    @JsonProperty("applicationId")
    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    /**
     * Sets entityId.
     * <p>
     * Field description:
     * ID of the Entity that would be associated with the number.
     *
     * @param entityId
     * @return This {@link NumbersNumberResponse instance}.
     */
    public NumbersNumberResponse entityId(String entityId) {
        this.entityId = entityId;
        return this;
    }

    /**
     * Returns entityId.
     * <p>
     * Field description:
     * ID of the Entity that would be associated with the number.
     *
     * @return entityId
     */
    @JsonProperty("entityId")
    public String getEntityId() {
        return entityId;
    }

    /**
     * Sets entityId.
     * <p>
     * Field description:
     * ID of the Entity that would be associated with the number.
     *
     * @param entityId
     */
    @JsonProperty("entityId")
    public void setEntityId(String entityId) {
        this.entityId = entityId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        NumbersNumberResponse numbersNumberResponse = (NumbersNumberResponse) o;
        return Objects.equals(this.numberKey, numbersNumberResponse.numberKey)
                && Objects.equals(this.number, numbersNumberResponse.number)
                && Objects.equals(this.country, numbersNumberResponse.country)
                && Objects.equals(this.countryName, numbersNumberResponse.countryName)
                && Objects.equals(this.type, numbersNumberResponse.type)
                && Objects.equals(this.capabilities, numbersNumberResponse.capabilities)
                && Objects.equals(this.shared, numbersNumberResponse.shared)
                && Objects.equals(this.price, numbersNumberResponse.price)
                && Objects.equals(this.network, numbersNumberResponse.network)
                && Objects.equals(this.keywords, numbersNumberResponse.keywords)
                && Objects.equals(this.voiceSetup, numbersNumberResponse.voiceSetup)
                && Objects.equals(this.reservationStatus, numbersNumberResponse.reservationStatus)
                && Objects.equals(this.additionalSetupRequired, numbersNumberResponse.additionalSetupRequired)
                && Objects.equals(this.editPermissions, numbersNumberResponse.editPermissions)
                && Objects.equals(this.note, numbersNumberResponse.note)
                && Objects.equals(this.applicationId, numbersNumberResponse.applicationId)
                && Objects.equals(this.entityId, numbersNumberResponse.entityId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                numberKey,
                number,
                country,
                countryName,
                type,
                capabilities,
                shared,
                price,
                network,
                keywords,
                voiceSetup,
                reservationStatus,
                additionalSetupRequired,
                editPermissions,
                note,
                applicationId,
                entityId);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class NumbersNumberResponse {")
                .append(newLine)
                .append("    numberKey: ")
                .append(toIndentedString(numberKey))
                .append(newLine)
                .append("    number: ")
                .append(toIndentedString(number))
                .append(newLine)
                .append("    country: ")
                .append(toIndentedString(country))
                .append(newLine)
                .append("    countryName: ")
                .append(toIndentedString(countryName))
                .append(newLine)
                .append("    type: ")
                .append(toIndentedString(type))
                .append(newLine)
                .append("    capabilities: ")
                .append(toIndentedString(capabilities))
                .append(newLine)
                .append("    shared: ")
                .append(toIndentedString(shared))
                .append(newLine)
                .append("    price: ")
                .append(toIndentedString(price))
                .append(newLine)
                .append("    network: ")
                .append(toIndentedString(network))
                .append(newLine)
                .append("    keywords: ")
                .append(toIndentedString(keywords))
                .append(newLine)
                .append("    voiceSetup: ")
                .append(toIndentedString(voiceSetup))
                .append(newLine)
                .append("    reservationStatus: ")
                .append(toIndentedString(reservationStatus))
                .append(newLine)
                .append("    additionalSetupRequired: ")
                .append(toIndentedString(additionalSetupRequired))
                .append(newLine)
                .append("    editPermissions: ")
                .append(toIndentedString(editPermissions))
                .append(newLine)
                .append("    note: ")
                .append(toIndentedString(note))
                .append(newLine)
                .append("    applicationId: ")
                .append(toIndentedString(applicationId))
                .append(newLine)
                .append("    entityId: ")
                .append(toIndentedString(entityId))
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
