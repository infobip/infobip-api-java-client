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
 * Represents ResourcesNumberResourceOrderRequestApiDoc model.
 */
public class ResourcesNumberResourceOrderRequestApiDoc implements ResourcesSubmitResourceRequestBody {
    /**
     * Type of resource.
     */
    public enum TypeEnum {
        NUMBER_PURCHASE("NUMBER_PURCHASE");

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

    private Integer quantity;

    private ResourcesResourceNumberType numberType;

    private List<ResourcesResourceNumberCapability> capabilities = new ArrayList<>();

    private List<String> additionalContactEmails = null;

    private String countryCode;

    private List<ResourcesFilledRequirement> requirements = null;

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
     * @return This {@link ResourcesNumberResourceOrderRequestApiDoc instance}.
     */
    public ResourcesNumberResourceOrderRequestApiDoc type(TypeEnum type) {
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
     * Sets quantity.
     * <p>
     * Field description:
     * Amount of numbers.
     *
     * @param quantity
     * @return This {@link ResourcesNumberResourceOrderRequestApiDoc instance}.
     */
    public ResourcesNumberResourceOrderRequestApiDoc quantity(Integer quantity) {
        this.quantity = quantity;
        return this;
    }

    /**
     * Returns quantity.
     * <p>
     * Field description:
     * Amount of numbers.
     *
     * @return quantity
     */
    @JsonProperty("quantity")
    public Integer getQuantity() {
        return quantity;
    }

    /**
     * Sets quantity.
     * <p>
     * Field description:
     * Amount of numbers.
     *
     * @param quantity
     */
    @JsonProperty("quantity")
    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    /**
     * Sets numberType.
     * <p>
     * The field is required.
     *
     * @param numberType
     * @return This {@link ResourcesNumberResourceOrderRequestApiDoc instance}.
     */
    public ResourcesNumberResourceOrderRequestApiDoc numberType(ResourcesResourceNumberType numberType) {
        this.numberType = numberType;
        return this;
    }

    /**
     * Returns numberType.
     * <p>
     * The field is required.
     *
     * @return numberType
     */
    @JsonProperty("numberType")
    public ResourcesResourceNumberType getNumberType() {
        return numberType;
    }

    /**
     * Sets numberType.
     * <p>
     * The field is required.
     *
     * @param numberType
     */
    @JsonProperty("numberType")
    public void setNumberType(ResourcesResourceNumberType numberType) {
        this.numberType = numberType;
    }

    /**
     * Sets capabilities.
     * <p>
     * Field description:
     * Capabilities of the numbers.
     * <p>
     * The field is required.
     *
     * @param capabilities
     * @return This {@link ResourcesNumberResourceOrderRequestApiDoc instance}.
     */
    public ResourcesNumberResourceOrderRequestApiDoc capabilities(
            List<ResourcesResourceNumberCapability> capabilities) {
        this.capabilities = capabilities;
        return this;
    }

    /**
     * Adds and item into capabilities.
     * <p>
     * Field description:
     * Capabilities of the numbers.
     * <p>
     * The field is required.
     *
     * @param capabilitiesItem The item to be added to the list.
     * @return This {@link ResourcesNumberResourceOrderRequestApiDoc instance}.
     */
    public ResourcesNumberResourceOrderRequestApiDoc addCapabilitiesItem(
            ResourcesResourceNumberCapability capabilitiesItem) {
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
     * Capabilities of the numbers.
     * <p>
     * The field is required.
     *
     * @return capabilities
     */
    @JsonProperty("capabilities")
    public List<ResourcesResourceNumberCapability> getCapabilities() {
        return capabilities;
    }

    /**
     * Sets capabilities.
     * <p>
     * Field description:
     * Capabilities of the numbers.
     * <p>
     * The field is required.
     *
     * @param capabilities
     */
    @JsonProperty("capabilities")
    public void setCapabilities(List<ResourcesResourceNumberCapability> capabilities) {
        this.capabilities = capabilities;
    }

    /**
     * Sets additionalContactEmails.
     * <p>
     * Field description:
     * Email addresses that would be contacted by Infobip support team for any request related matter.
     *
     * @param additionalContactEmails
     * @return This {@link ResourcesNumberResourceOrderRequestApiDoc instance}.
     */
    public ResourcesNumberResourceOrderRequestApiDoc additionalContactEmails(List<String> additionalContactEmails) {
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
     * @return This {@link ResourcesNumberResourceOrderRequestApiDoc instance}.
     */
    public ResourcesNumberResourceOrderRequestApiDoc addAdditionalContactEmailsItem(
            String additionalContactEmailsItem) {
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
     * @return This {@link ResourcesNumberResourceOrderRequestApiDoc instance}.
     */
    public ResourcesNumberResourceOrderRequestApiDoc countryCode(String countryCode) {
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
     * Sets requirements.
     * <p>
     * Field description:
     * List of requirements for the resource.
     *
     * @param requirements
     * @return This {@link ResourcesNumberResourceOrderRequestApiDoc instance}.
     */
    public ResourcesNumberResourceOrderRequestApiDoc requirements(List<ResourcesFilledRequirement> requirements) {
        this.requirements = requirements;
        return this;
    }

    /**
     * Adds and item into requirements.
     * <p>
     * Field description:
     * List of requirements for the resource.
     *
     * @param requirementsItem The item to be added to the list.
     * @return This {@link ResourcesNumberResourceOrderRequestApiDoc instance}.
     */
    public ResourcesNumberResourceOrderRequestApiDoc addRequirementsItem(ResourcesFilledRequirement requirementsItem) {
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
     * @return This {@link ResourcesNumberResourceOrderRequestApiDoc instance}.
     */
    public ResourcesNumberResourceOrderRequestApiDoc platform(Platform platform) {
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
        ResourcesNumberResourceOrderRequestApiDoc resourcesNumberResourceOrderRequestApiDoc =
                (ResourcesNumberResourceOrderRequestApiDoc) o;
        return Objects.equals(this.type, resourcesNumberResourceOrderRequestApiDoc.type)
                && Objects.equals(this.quantity, resourcesNumberResourceOrderRequestApiDoc.quantity)
                && Objects.equals(this.numberType, resourcesNumberResourceOrderRequestApiDoc.numberType)
                && Objects.equals(this.capabilities, resourcesNumberResourceOrderRequestApiDoc.capabilities)
                && Objects.equals(
                        this.additionalContactEmails, resourcesNumberResourceOrderRequestApiDoc.additionalContactEmails)
                && Objects.equals(this.countryCode, resourcesNumberResourceOrderRequestApiDoc.countryCode)
                && Objects.equals(this.requirements, resourcesNumberResourceOrderRequestApiDoc.requirements)
                && Objects.equals(this.platform, resourcesNumberResourceOrderRequestApiDoc.platform);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                type, quantity, numberType, capabilities, additionalContactEmails, countryCode, requirements, platform);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class ResourcesNumberResourceOrderRequestApiDoc {")
                .append(newLine)
                .append("    type: ")
                .append(toIndentedString(type))
                .append(newLine)
                .append("    quantity: ")
                .append(toIndentedString(quantity))
                .append(newLine)
                .append("    numberType: ")
                .append(toIndentedString(numberType))
                .append(newLine)
                .append("    capabilities: ")
                .append(toIndentedString(capabilities))
                .append(newLine)
                .append("    additionalContactEmails: ")
                .append(toIndentedString(additionalContactEmails))
                .append(newLine)
                .append("    countryCode: ")
                .append(toIndentedString(countryCode))
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
