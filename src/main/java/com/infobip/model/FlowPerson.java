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
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/**
 * Person attributes. In case a person with either the specified &lt;code&gt;externalId&lt;/code&gt; or &lt;code&gt;contactInformation&lt;/code&gt; already exists in the People, the persons will be automatically merged. See &lt;a href&#x3D;\&quot;https://www.infobip.com/docs/api/customer-engagement/moments/add-flow-participants\&quot; target&#x3D;\&quot;_blank\&quot;&gt;endpoint description&lt;/a&gt; for more info.
 */
public class FlowPerson {

    private String createdAt;

    private String modifiedAt;

    private Long id;

    private String externalId;

    private String firstName;

    private String lastName;

    private FlowType type;

    private String address;

    private String city;

    private String country;

    private FlowGender gender;

    private String birthDate;

    private String middleName;

    private String preferredLanguage;

    private String profilePicture;

    private FlowOrigin origin;

    private FlowOrigin modifiedFrom;

    private Set<String> tags = null;

    private Map<String, Object> customAttributes = null;

    private FlowPersonContacts contactInformation;

    private FlowIntegrations integrations;

    private Map<String, Object> computedAttributes = null;

    /**
     * Sets createdAt.
     * <p>
     * Field description:
     * Date and time of creation. Has the following format: yyyy-MM-dd&#39;T&#39;HH:mm:ss.
     *
     * @param createdAt
     * @return This {@link FlowPerson instance}.
     */
    public FlowPerson createdAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * Returns createdAt.
     * <p>
     * Field description:
     * Date and time of creation. Has the following format: yyyy-MM-dd&#39;T&#39;HH:mm:ss.
     *
     * @return createdAt
     */
    @JsonProperty("createdAt")
    public String getCreatedAt() {
        return createdAt;
    }

    /**
     * Sets createdAt.
     * <p>
     * Field description:
     * Date and time of creation. Has the following format: yyyy-MM-dd&#39;T&#39;HH:mm:ss.
     *
     * @param createdAt
     */
    @JsonProperty("createdAt")
    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * Sets modifiedAt.
     * <p>
     * Field description:
     * Date and time of last modification. Has the following format: yyyy-MM-dd&#39;T&#39;HH:mm:ss.
     *
     * @param modifiedAt
     * @return This {@link FlowPerson instance}.
     */
    public FlowPerson modifiedAt(String modifiedAt) {
        this.modifiedAt = modifiedAt;
        return this;
    }

    /**
     * Returns modifiedAt.
     * <p>
     * Field description:
     * Date and time of last modification. Has the following format: yyyy-MM-dd&#39;T&#39;HH:mm:ss.
     *
     * @return modifiedAt
     */
    @JsonProperty("modifiedAt")
    public String getModifiedAt() {
        return modifiedAt;
    }

    /**
     * Sets modifiedAt.
     * <p>
     * Field description:
     * Date and time of last modification. Has the following format: yyyy-MM-dd&#39;T&#39;HH:mm:ss.
     *
     * @param modifiedAt
     */
    @JsonProperty("modifiedAt")
    public void setModifiedAt(String modifiedAt) {
        this.modifiedAt = modifiedAt;
    }

    /**
     * Sets id.
     * <p>
     * Field description:
     * Unique id of the entity.
     *
     * @param id
     * @return This {@link FlowPerson instance}.
     */
    public FlowPerson id(Long id) {
        this.id = id;
        return this;
    }

    /**
     * Returns id.
     * <p>
     * Field description:
     * Unique id of the entity.
     *
     * @return id
     */
    @JsonProperty("id")
    public Long getId() {
        return id;
    }

    /**
     * Sets id.
     * <p>
     * Field description:
     * Unique id of the entity.
     *
     * @param id
     */
    @JsonProperty("id")
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Sets externalId.
     * <p>
     * Field description:
     * Unique ID for a person from your or another external system, 256 characters max.
     *
     * @param externalId
     * @return This {@link FlowPerson instance}.
     */
    public FlowPerson externalId(String externalId) {
        this.externalId = externalId;
        return this;
    }

    /**
     * Returns externalId.
     * <p>
     * Field description:
     * Unique ID for a person from your or another external system, 256 characters max.
     *
     * @return externalId
     */
    @JsonProperty("externalId")
    public String getExternalId() {
        return externalId;
    }

    /**
     * Sets externalId.
     * <p>
     * Field description:
     * Unique ID for a person from your or another external system, 256 characters max.
     *
     * @param externalId
     */
    @JsonProperty("externalId")
    public void setExternalId(String externalId) {
        this.externalId = externalId;
    }

    /**
     * Sets firstName.
     * <p>
     * Field description:
     * Person&#39;s first name, 255 characters max.
     *
     * @param firstName
     * @return This {@link FlowPerson instance}.
     */
    public FlowPerson firstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    /**
     * Returns firstName.
     * <p>
     * Field description:
     * Person&#39;s first name, 255 characters max.
     *
     * @return firstName
     */
    @JsonProperty("firstName")
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets firstName.
     * <p>
     * Field description:
     * Person&#39;s first name, 255 characters max.
     *
     * @param firstName
     */
    @JsonProperty("firstName")
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Sets lastName.
     * <p>
     * Field description:
     * Person&#39;s last name, 255 characters max.
     *
     * @param lastName
     * @return This {@link FlowPerson instance}.
     */
    public FlowPerson lastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    /**
     * Returns lastName.
     * <p>
     * Field description:
     * Person&#39;s last name, 255 characters max.
     *
     * @return lastName
     */
    @JsonProperty("lastName")
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets lastName.
     * <p>
     * Field description:
     * Person&#39;s last name, 255 characters max.
     *
     * @param lastName
     */
    @JsonProperty("lastName")
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * Sets type.
     *
     * @param type
     * @return This {@link FlowPerson instance}.
     */
    public FlowPerson type(FlowType type) {
        this.type = type;
        return this;
    }

    /**
     * Returns type.
     *
     * @return type
     */
    @JsonProperty("type")
    public FlowType getType() {
        return type;
    }

    /**
     * Sets type.
     *
     * @param type
     */
    @JsonProperty("type")
    public void setType(FlowType type) {
        this.type = type;
    }

    /**
     * Sets address.
     * <p>
     * Field description:
     * Person&#39;s title, 50 characters max.
     *
     * @param address
     * @return This {@link FlowPerson instance}.
     */
    public FlowPerson address(String address) {
        this.address = address;
        return this;
    }

    /**
     * Returns address.
     * <p>
     * Field description:
     * Person&#39;s title, 50 characters max.
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
     * Person&#39;s title, 50 characters max.
     *
     * @param address
     */
    @JsonProperty("address")
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * Sets city.
     * <p>
     * Field description:
     * Person&#39;s city, 50 characters max.
     *
     * @param city
     * @return This {@link FlowPerson instance}.
     */
    public FlowPerson city(String city) {
        this.city = city;
        return this;
    }

    /**
     * Returns city.
     * <p>
     * Field description:
     * Person&#39;s city, 50 characters max.
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
     * Person&#39;s city, 50 characters max.
     *
     * @param city
     */
    @JsonProperty("city")
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * Sets country.
     * <p>
     * Field description:
     * Person&#39;s country, 50 characters max.
     *
     * @param country
     * @return This {@link FlowPerson instance}.
     */
    public FlowPerson country(String country) {
        this.country = country;
        return this;
    }

    /**
     * Returns country.
     * <p>
     * Field description:
     * Person&#39;s country, 50 characters max.
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
     * Person&#39;s country, 50 characters max.
     *
     * @param country
     */
    @JsonProperty("country")
    public void setCountry(String country) {
        this.country = country;
    }

    /**
     * Sets gender.
     *
     * @param gender
     * @return This {@link FlowPerson instance}.
     */
    public FlowPerson gender(FlowGender gender) {
        this.gender = gender;
        return this;
    }

    /**
     * Returns gender.
     *
     * @return gender
     */
    @JsonProperty("gender")
    public FlowGender getGender() {
        return gender;
    }

    /**
     * Sets gender.
     *
     * @param gender
     */
    @JsonProperty("gender")
    public void setGender(FlowGender gender) {
        this.gender = gender;
    }

    /**
     * Sets birthDate.
     * <p>
     * Field description:
     * Person&#39;s date of birth, format &#x60;YYYY-MM-DD&#x60;.
     *
     * @param birthDate
     * @return This {@link FlowPerson instance}.
     */
    public FlowPerson birthDate(String birthDate) {
        this.birthDate = birthDate;
        return this;
    }

    /**
     * Returns birthDate.
     * <p>
     * Field description:
     * Person&#39;s date of birth, format &#x60;YYYY-MM-DD&#x60;.
     *
     * @return birthDate
     */
    @JsonProperty("birthDate")
    public String getBirthDate() {
        return birthDate;
    }

    /**
     * Sets birthDate.
     * <p>
     * Field description:
     * Person&#39;s date of birth, format &#x60;YYYY-MM-DD&#x60;.
     *
     * @param birthDate
     */
    @JsonProperty("birthDate")
    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    /**
     * Sets middleName.
     * <p>
     * Field description:
     * Person&#39;s middle name, 50 characters max.
     *
     * @param middleName
     * @return This {@link FlowPerson instance}.
     */
    public FlowPerson middleName(String middleName) {
        this.middleName = middleName;
        return this;
    }

    /**
     * Returns middleName.
     * <p>
     * Field description:
     * Person&#39;s middle name, 50 characters max.
     *
     * @return middleName
     */
    @JsonProperty("middleName")
    public String getMiddleName() {
        return middleName;
    }

    /**
     * Sets middleName.
     * <p>
     * Field description:
     * Person&#39;s middle name, 50 characters max.
     *
     * @param middleName
     */
    @JsonProperty("middleName")
    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    /**
     * Sets preferredLanguage.
     * <p>
     * Field description:
     * Person&#39;s preferred language. Must be in two letter ISO (xx) or language-region BCP-47 (xx-YY) format.
     *
     * @param preferredLanguage
     * @return This {@link FlowPerson instance}.
     */
    public FlowPerson preferredLanguage(String preferredLanguage) {
        this.preferredLanguage = preferredLanguage;
        return this;
    }

    /**
     * Returns preferredLanguage.
     * <p>
     * Field description:
     * Person&#39;s preferred language. Must be in two letter ISO (xx) or language-region BCP-47 (xx-YY) format.
     *
     * @return preferredLanguage
     */
    @JsonProperty("preferredLanguage")
    public String getPreferredLanguage() {
        return preferredLanguage;
    }

    /**
     * Sets preferredLanguage.
     * <p>
     * Field description:
     * Person&#39;s preferred language. Must be in two letter ISO (xx) or language-region BCP-47 (xx-YY) format.
     *
     * @param preferredLanguage
     */
    @JsonProperty("preferredLanguage")
    public void setPreferredLanguage(String preferredLanguage) {
        this.preferredLanguage = preferredLanguage;
    }

    /**
     * Sets profilePicture.
     * <p>
     * Field description:
     * URL for the person&#39;s profile picture, 2083 characters max.
     *
     * @param profilePicture
     * @return This {@link FlowPerson instance}.
     */
    public FlowPerson profilePicture(String profilePicture) {
        this.profilePicture = profilePicture;
        return this;
    }

    /**
     * Returns profilePicture.
     * <p>
     * Field description:
     * URL for the person&#39;s profile picture, 2083 characters max.
     *
     * @return profilePicture
     */
    @JsonProperty("profilePicture")
    public String getProfilePicture() {
        return profilePicture;
    }

    /**
     * Sets profilePicture.
     * <p>
     * Field description:
     * URL for the person&#39;s profile picture, 2083 characters max.
     *
     * @param profilePicture
     */
    @JsonProperty("profilePicture")
    public void setProfilePicture(String profilePicture) {
        this.profilePicture = profilePicture;
    }

    /**
     * Sets origin.
     *
     * @param origin
     * @return This {@link FlowPerson instance}.
     */
    public FlowPerson origin(FlowOrigin origin) {
        this.origin = origin;
        return this;
    }

    /**
     * Returns origin.
     *
     * @return origin
     */
    @JsonProperty("origin")
    public FlowOrigin getOrigin() {
        return origin;
    }

    /**
     * Sets origin.
     *
     * @param origin
     */
    @JsonProperty("origin")
    public void setOrigin(FlowOrigin origin) {
        this.origin = origin;
    }

    /**
     * Sets modifiedFrom.
     *
     * @param modifiedFrom
     * @return This {@link FlowPerson instance}.
     */
    public FlowPerson modifiedFrom(FlowOrigin modifiedFrom) {
        this.modifiedFrom = modifiedFrom;
        return this;
    }

    /**
     * Returns modifiedFrom.
     *
     * @return modifiedFrom
     */
    @JsonProperty("modifiedFrom")
    public FlowOrigin getModifiedFrom() {
        return modifiedFrom;
    }

    /**
     * Sets modifiedFrom.
     *
     * @param modifiedFrom
     */
    @JsonProperty("modifiedFrom")
    public void setModifiedFrom(FlowOrigin modifiedFrom) {
        this.modifiedFrom = modifiedFrom;
    }

    /**
     * Sets tags.
     * <p>
     * Field description:
     * List of tags that this person has.
     *
     * @param tags
     * @return This {@link FlowPerson instance}.
     */
    public FlowPerson tags(Set<String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * Adds and item into tags.
     * <p>
     * Field description:
     * List of tags that this person has.
     *
     * @param tagsItem The item to be added to the list.
     * @return This {@link FlowPerson instance}.
     */
    public FlowPerson addTagsItem(String tagsItem) {
        if (this.tags == null) {
            this.tags = new LinkedHashSet<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    /**
     * Returns tags.
     * <p>
     * Field description:
     * List of tags that this person has.
     *
     * @return tags
     */
    @JsonProperty("tags")
    public Set<String> getTags() {
        return tags;
    }

    /**
     * Sets tags.
     * <p>
     * Field description:
     * List of tags that this person has.
     *
     * @param tags
     */
    @JsonProperty("tags")
    public void setTags(Set<String> tags) {
        this.tags = tags;
    }

    /**
     * Sets customAttributes.
     * <p>
     * Field description:
     * List of custom attributes for the person, 4096 characters max per value.
     *
     * @param customAttributes
     * @return This {@link FlowPerson instance}.
     */
    public FlowPerson customAttributes(Map<String, Object> customAttributes) {
        this.customAttributes = customAttributes;
        return this;
    }

    /**
     * Puts and entry into customAttributes.
     * <p>
     * Field description:
     * List of custom attributes for the person, 4096 characters max per value.
     *
     * @param key The given key.
     * @param customAttributesItem The item to be associated with the given key.
     * @return This {@link FlowPerson instance}.
     */
    public FlowPerson putCustomAttributesItem(String key, Object customAttributesItem) {
        if (this.customAttributes == null) {
            this.customAttributes = new HashMap<>();
        }
        this.customAttributes.put(key, customAttributesItem);
        return this;
    }

    /**
     * Returns customAttributes.
     * <p>
     * Field description:
     * List of custom attributes for the person, 4096 characters max per value.
     *
     * @return customAttributes
     */
    @JsonProperty("customAttributes")
    public Map<String, Object> getCustomAttributes() {
        return customAttributes;
    }

    /**
     * Sets customAttributes.
     * <p>
     * Field description:
     * List of custom attributes for the person, 4096 characters max per value.
     *
     * @param customAttributes
     */
    @JsonProperty("customAttributes")
    public void setCustomAttributes(Map<String, Object> customAttributes) {
        this.customAttributes = customAttributes;
    }

    /**
     * Sets contactInformation.
     *
     * @param contactInformation
     * @return This {@link FlowPerson instance}.
     */
    public FlowPerson contactInformation(FlowPersonContacts contactInformation) {
        this.contactInformation = contactInformation;
        return this;
    }

    /**
     * Returns contactInformation.
     *
     * @return contactInformation
     */
    @JsonProperty("contactInformation")
    public FlowPersonContacts getContactInformation() {
        return contactInformation;
    }

    /**
     * Sets contactInformation.
     *
     * @param contactInformation
     */
    @JsonProperty("contactInformation")
    public void setContactInformation(FlowPersonContacts contactInformation) {
        this.contactInformation = contactInformation;
    }

    /**
     * Sets integrations.
     *
     * @param integrations
     * @return This {@link FlowPerson instance}.
     */
    public FlowPerson integrations(FlowIntegrations integrations) {
        this.integrations = integrations;
        return this;
    }

    /**
     * Returns integrations.
     *
     * @return integrations
     */
    @JsonProperty("integrations")
    public FlowIntegrations getIntegrations() {
        return integrations;
    }

    /**
     * Sets integrations.
     *
     * @param integrations
     */
    @JsonProperty("integrations")
    public void setIntegrations(FlowIntegrations integrations) {
        this.integrations = integrations;
    }

    /**
     * Sets computedAttributes.
     * <p>
     * Field description:
     * Person&#39;s computed attributes grouped by type.
     *
     * @param computedAttributes
     * @return This {@link FlowPerson instance}.
     */
    public FlowPerson computedAttributes(Map<String, Object> computedAttributes) {
        this.computedAttributes = computedAttributes;
        return this;
    }

    /**
     * Puts and entry into computedAttributes.
     * <p>
     * Field description:
     * Person&#39;s computed attributes grouped by type.
     *
     * @param key The given key.
     * @param computedAttributesItem The item to be associated with the given key.
     * @return This {@link FlowPerson instance}.
     */
    public FlowPerson putComputedAttributesItem(String key, Object computedAttributesItem) {
        if (this.computedAttributes == null) {
            this.computedAttributes = new HashMap<>();
        }
        this.computedAttributes.put(key, computedAttributesItem);
        return this;
    }

    /**
     * Returns computedAttributes.
     * <p>
     * Field description:
     * Person&#39;s computed attributes grouped by type.
     *
     * @return computedAttributes
     */
    @JsonProperty("computedAttributes")
    public Map<String, Object> getComputedAttributes() {
        return computedAttributes;
    }

    /**
     * Sets computedAttributes.
     * <p>
     * Field description:
     * Person&#39;s computed attributes grouped by type.
     *
     * @param computedAttributes
     */
    @JsonProperty("computedAttributes")
    public void setComputedAttributes(Map<String, Object> computedAttributes) {
        this.computedAttributes = computedAttributes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        FlowPerson flowPerson = (FlowPerson) o;
        return Objects.equals(this.createdAt, flowPerson.createdAt)
                && Objects.equals(this.modifiedAt, flowPerson.modifiedAt)
                && Objects.equals(this.id, flowPerson.id)
                && Objects.equals(this.externalId, flowPerson.externalId)
                && Objects.equals(this.firstName, flowPerson.firstName)
                && Objects.equals(this.lastName, flowPerson.lastName)
                && Objects.equals(this.type, flowPerson.type)
                && Objects.equals(this.address, flowPerson.address)
                && Objects.equals(this.city, flowPerson.city)
                && Objects.equals(this.country, flowPerson.country)
                && Objects.equals(this.gender, flowPerson.gender)
                && Objects.equals(this.birthDate, flowPerson.birthDate)
                && Objects.equals(this.middleName, flowPerson.middleName)
                && Objects.equals(this.preferredLanguage, flowPerson.preferredLanguage)
                && Objects.equals(this.profilePicture, flowPerson.profilePicture)
                && Objects.equals(this.origin, flowPerson.origin)
                && Objects.equals(this.modifiedFrom, flowPerson.modifiedFrom)
                && Objects.equals(this.tags, flowPerson.tags)
                && Objects.equals(this.customAttributes, flowPerson.customAttributes)
                && Objects.equals(this.contactInformation, flowPerson.contactInformation)
                && Objects.equals(this.integrations, flowPerson.integrations)
                && Objects.equals(this.computedAttributes, flowPerson.computedAttributes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                createdAt,
                modifiedAt,
                id,
                externalId,
                firstName,
                lastName,
                type,
                address,
                city,
                country,
                gender,
                birthDate,
                middleName,
                preferredLanguage,
                profilePicture,
                origin,
                modifiedFrom,
                tags,
                customAttributes,
                contactInformation,
                integrations,
                computedAttributes);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class FlowPerson {")
                .append(newLine)
                .append("    createdAt: ")
                .append(toIndentedString(createdAt))
                .append(newLine)
                .append("    modifiedAt: ")
                .append(toIndentedString(modifiedAt))
                .append(newLine)
                .append("    id: ")
                .append(toIndentedString(id))
                .append(newLine)
                .append("    externalId: ")
                .append(toIndentedString(externalId))
                .append(newLine)
                .append("    firstName: ")
                .append(toIndentedString(firstName))
                .append(newLine)
                .append("    lastName: ")
                .append(toIndentedString(lastName))
                .append(newLine)
                .append("    type: ")
                .append(toIndentedString(type))
                .append(newLine)
                .append("    address: ")
                .append(toIndentedString(address))
                .append(newLine)
                .append("    city: ")
                .append(toIndentedString(city))
                .append(newLine)
                .append("    country: ")
                .append(toIndentedString(country))
                .append(newLine)
                .append("    gender: ")
                .append(toIndentedString(gender))
                .append(newLine)
                .append("    birthDate: ")
                .append(toIndentedString(birthDate))
                .append(newLine)
                .append("    middleName: ")
                .append(toIndentedString(middleName))
                .append(newLine)
                .append("    preferredLanguage: ")
                .append(toIndentedString(preferredLanguage))
                .append(newLine)
                .append("    profilePicture: ")
                .append(toIndentedString(profilePicture))
                .append(newLine)
                .append("    origin: ")
                .append(toIndentedString(origin))
                .append(newLine)
                .append("    modifiedFrom: ")
                .append(toIndentedString(modifiedFrom))
                .append(newLine)
                .append("    tags: ")
                .append(toIndentedString(tags))
                .append(newLine)
                .append("    customAttributes: ")
                .append(toIndentedString(customAttributes))
                .append(newLine)
                .append("    contactInformation: ")
                .append(toIndentedString(contactInformation))
                .append(newLine)
                .append("    integrations: ")
                .append(toIndentedString(integrations))
                .append(newLine)
                .append("    computedAttributes: ")
                .append(toIndentedString(computedAttributes))
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
