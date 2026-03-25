/*
 * This class is auto generated from the Infobip OpenAPI specification
 * through the OpenAPI Specification Client API libraries (Re)Generator (OSCAR),
 * powered by the OpenAPI Generator (https://openapi-generator.tech).
 *
 * Do not edit manually. To learn how to raise an issue, see the CONTRIBUTING guide
 * or contact us @ support@infobip.com.
 */

package com.infobip.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Represents ResourcesAlphaResourceOrderRequestApiDoc model.
 */
public class ResourcesAlphaResourceOrderRequestApiDoc implements ResourcesSubmitResourceRequestBody {
    /**
     * Type of resource.
     */
    public enum TypeEnum {
        ALPHANUMERIC_REGISTRATION("ALPHANUMERIC_REGISTRATION");

        private String value;

        TypeEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static TypeEnum fromValue(String value) {
            for (TypeEnum enumElement : TypeEnum.values()) {
                if (enumElement.value.equals(value)) {
                    return enumElement;
                }
            }
            throw new IllegalArgumentException("Unexpected enum value '" + value + "'.");
        }
    }

    private TypeEnum type;

    private String senderName;

    private List<String> additionalContactEmails = null;

    private String countryCode;

    private ResourcesTrafficOrigin trafficOrigin;

    private ResourcesTrafficType trafficType;

    private List<ResourcesFilledRequirement> requirements = new ArrayList<>();

    private Platform platform;

    /**
     * Sets type.
     * <p>
     * Field description:
     * Type of resource.
     * <p>
     * The field is required.
     *
     * @param type
     * @return This {@link ResourcesAlphaResourceOrderRequestApiDoc instance}.
     */
    public ResourcesAlphaResourceOrderRequestApiDoc type(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * Returns type.
     * <p>
     * Field description:
     * Type of resource.
     * <p>
     * The field is required.
     *
     * @return type
     */
    @JsonProperty("type")
    public TypeEnum getType() {
        return type;
    }

    /**
     * Sets type.
     * <p>
     * Field description:
     * Type of resource.
     * <p>
     * The field is required.
     *
     * @param type
     */
    @JsonProperty("type")
    public void setType(TypeEnum type) {
        this.type = type;
    }

    /**
     * Sets senderName.
     * <p>
     * Field description:
     * Sender name. GSM7 format required, with at least one letter.
     * <p>
     * The field is required.
     *
     * @param senderName
     * @return This {@link ResourcesAlphaResourceOrderRequestApiDoc instance}.
     */
    public ResourcesAlphaResourceOrderRequestApiDoc senderName(String senderName) {
        this.senderName = senderName;
        return this;
    }

    /**
     * Returns senderName.
     * <p>
     * Field description:
     * Sender name. GSM7 format required, with at least one letter.
     * <p>
     * The field is required.
     *
     * @return senderName
     */
    @JsonProperty("senderName")
    public String getSenderName() {
        return senderName;
    }

    /**
     * Sets senderName.
     * <p>
     * Field description:
     * Sender name. GSM7 format required, with at least one letter.
     * <p>
     * The field is required.
     *
     * @param senderName
     */
    @JsonProperty("senderName")
    public void setSenderName(String senderName) {
        this.senderName = senderName;
    }

    /**
     * Sets additionalContactEmails.
     * <p>
     * Field description:
     * Email addresses that would be contacted by Infobip support team for any request related matter.
     *
     * @param additionalContactEmails
     * @return This {@link ResourcesAlphaResourceOrderRequestApiDoc instance}.
     */
    public ResourcesAlphaResourceOrderRequestApiDoc additionalContactEmails(List<String> additionalContactEmails) {
        this.additionalContactEmails = additionalContactEmails;
        return this;
    }

    /**
     * Adds and item into additionalContactEmails.
     * <p>
     * Field description:
     * Email addresses that would be contacted by Infobip support team for any request related matter.
     *
     * @param additionalContactEmailsItem The item to be added to the list.
     * @return This {@link ResourcesAlphaResourceOrderRequestApiDoc instance}.
     */
    public ResourcesAlphaResourceOrderRequestApiDoc addAdditionalContactEmailsItem(String additionalContactEmailsItem) {
        if (this.additionalContactEmails == null) {
            this.additionalContactEmails = new ArrayList<>();
        }
        this.additionalContactEmails.add(additionalContactEmailsItem);
        return this;
    }

    /**
     * Returns additionalContactEmails.
     * <p>
     * Field description:
     * Email addresses that would be contacted by Infobip support team for any request related matter.
     *
     * @return additionalContactEmails
     */
    @JsonProperty("additionalContactEmails")
    public List<String> getAdditionalContactEmails() {
        return additionalContactEmails;
    }

    /**
     * Sets additionalContactEmails.
     * <p>
     * Field description:
     * Email addresses that would be contacted by Infobip support team for any request related matter.
     *
     * @param additionalContactEmails
     */
    @JsonProperty("additionalContactEmails")
    public void setAdditionalContactEmails(List<String> additionalContactEmails) {
        this.additionalContactEmails = additionalContactEmails;
    }

    /**
     * Sets countryCode.
     * <p>
     * Field description:
     * Country code in two-letter ISO standard.
     * <p>
     * The field is required.
     *
     * @param countryCode
     * @return This {@link ResourcesAlphaResourceOrderRequestApiDoc instance}.
     */
    public ResourcesAlphaResourceOrderRequestApiDoc countryCode(String countryCode) {
        this.countryCode = countryCode;
        return this;
    }

    /**
     * Returns countryCode.
     * <p>
     * Field description:
     * Country code in two-letter ISO standard.
     * <p>
     * The field is required.
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
     * Country code in two-letter ISO standard.
     * <p>
     * The field is required.
     *
     * @param countryCode
     */
    @JsonProperty("countryCode")
    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    /**
     * Sets trafficOrigin.
     *
     * @param trafficOrigin
     * @return This {@link ResourcesAlphaResourceOrderRequestApiDoc instance}.
     */
    public ResourcesAlphaResourceOrderRequestApiDoc trafficOrigin(ResourcesTrafficOrigin trafficOrigin) {
        this.trafficOrigin = trafficOrigin;
        return this;
    }

    /**
     * Returns trafficOrigin.
     *
     * @return trafficOrigin
     */
    @JsonProperty("trafficOrigin")
    public ResourcesTrafficOrigin getTrafficOrigin() {
        return trafficOrigin;
    }

    /**
     * Sets trafficOrigin.
     *
     * @param trafficOrigin
     */
    @JsonProperty("trafficOrigin")
    public void setTrafficOrigin(ResourcesTrafficOrigin trafficOrigin) {
        this.trafficOrigin = trafficOrigin;
    }

    /**
     * Sets trafficType.
     *
     * @param trafficType
     * @return This {@link ResourcesAlphaResourceOrderRequestApiDoc instance}.
     */
    public ResourcesAlphaResourceOrderRequestApiDoc trafficType(ResourcesTrafficType trafficType) {
        this.trafficType = trafficType;
        return this;
    }

    /**
     * Returns trafficType.
     *
     * @return trafficType
     */
    @JsonProperty("trafficType")
    public ResourcesTrafficType getTrafficType() {
        return trafficType;
    }

    /**
     * Sets trafficType.
     *
     * @param trafficType
     */
    @JsonProperty("trafficType")
    public void setTrafficType(ResourcesTrafficType trafficType) {
        this.trafficType = trafficType;
    }

    /**
     * Sets requirements.
     * <p>
     * Field description:
     * List of requirements for the resource.
     * <p>
     * The field is required.
     *
     * @param requirements
     * @return This {@link ResourcesAlphaResourceOrderRequestApiDoc instance}.
     */
    public ResourcesAlphaResourceOrderRequestApiDoc requirements(List<ResourcesFilledRequirement> requirements) {
        this.requirements = requirements;
        return this;
    }

    /**
     * Adds and item into requirements.
     * <p>
     * Field description:
     * List of requirements for the resource.
     * <p>
     * The field is required.
     *
     * @param requirementsItem The item to be added to the list.
     * @return This {@link ResourcesAlphaResourceOrderRequestApiDoc instance}.
     */
    public ResourcesAlphaResourceOrderRequestApiDoc addRequirementsItem(ResourcesFilledRequirement requirementsItem) {
        if (this.requirements == null) {
            this.requirements = new ArrayList<>();
        }
        this.requirements.add(requirementsItem);
        return this;
    }

    /**
     * Returns requirements.
     * <p>
     * Field description:
     * List of requirements for the resource.
     * <p>
     * The field is required.
     *
     * @return requirements
     */
    @JsonProperty("requirements")
    public List<ResourcesFilledRequirement> getRequirements() {
        return requirements;
    }

    /**
     * Sets requirements.
     * <p>
     * Field description:
     * List of requirements for the resource.
     * <p>
     * The field is required.
     *
     * @param requirements
     */
    @JsonProperty("requirements")
    public void setRequirements(List<ResourcesFilledRequirement> requirements) {
        this.requirements = requirements;
    }

    /**
     * Sets platform.
     *
     * @param platform
     * @return This {@link ResourcesAlphaResourceOrderRequestApiDoc instance}.
     */
    public ResourcesAlphaResourceOrderRequestApiDoc platform(Platform platform) {
        this.platform = platform;
        return this;
    }

    /**
     * Returns platform.
     *
     * @return platform
     */
    @JsonProperty("platform")
    public Platform getPlatform() {
        return platform;
    }

    /**
     * Sets platform.
     *
     * @param platform
     */
    @JsonProperty("platform")
    public void setPlatform(Platform platform) {
        this.platform = platform;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ResourcesAlphaResourceOrderRequestApiDoc resourcesAlphaResourceOrderRequestApiDoc =
                (ResourcesAlphaResourceOrderRequestApiDoc) o;
        return Objects.equals(this.type, resourcesAlphaResourceOrderRequestApiDoc.type)
                && Objects.equals(this.senderName, resourcesAlphaResourceOrderRequestApiDoc.senderName)
                && Objects.equals(
                        this.additionalContactEmails, resourcesAlphaResourceOrderRequestApiDoc.additionalContactEmails)
                && Objects.equals(this.countryCode, resourcesAlphaResourceOrderRequestApiDoc.countryCode)
                && Objects.equals(this.trafficOrigin, resourcesAlphaResourceOrderRequestApiDoc.trafficOrigin)
                && Objects.equals(this.trafficType, resourcesAlphaResourceOrderRequestApiDoc.trafficType)
                && Objects.equals(this.requirements, resourcesAlphaResourceOrderRequestApiDoc.requirements)
                && Objects.equals(this.platform, resourcesAlphaResourceOrderRequestApiDoc.platform);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                type,
                senderName,
                additionalContactEmails,
                countryCode,
                trafficOrigin,
                trafficType,
                requirements,
                platform);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class ResourcesAlphaResourceOrderRequestApiDoc {")
                .append(newLine)
                .append("    type: ")
                .append(toIndentedString(type))
                .append(newLine)
                .append("    senderName: ")
                .append(toIndentedString(senderName))
                .append(newLine)
                .append("    additionalContactEmails: ")
                .append(toIndentedString(additionalContactEmails))
                .append(newLine)
                .append("    countryCode: ")
                .append(toIndentedString(countryCode))
                .append(newLine)
                .append("    trafficOrigin: ")
                .append(toIndentedString(trafficOrigin))
                .append(newLine)
                .append("    trafficType: ")
                .append(toIndentedString(trafficType))
                .append(newLine)
                .append("    requirements: ")
                .append(toIndentedString(requirements))
                .append(newLine)
                .append("    platform: ")
                .append(toIndentedString(platform))
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
