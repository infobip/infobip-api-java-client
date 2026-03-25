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
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

/**
 * Represents ResourcesNumberResourceOrderApiDoc model.
 */
public class ResourcesNumberResourceOrderApiDoc
        implements GetResourceRequest200Response, ResourcesPageResourceOrderApiDocResultsInner {

    private UUID id;

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

    private String countryCode;

    private String requestedByEmailAddress;

    private List<String> additionalContactEmailAddresses = null;

    private OffsetDateTime requestedDate;

    private ResourcesResourceOrderStatus status;

    private ResourcesResourceNumberType numberType;

    private List<ResourcesResourceNumberCapability> capabilities = null;

    private Integer quantity;

    private String note;

    private List<ResourcesProcuredNumber> numbers = null;

    private List<ResourcesFilledRequirementFeedback> requirementsFeedback = null;

    private List<ResourcesFilledRequirement> requirements = null;

    private Platform platform;

    /**
     * Sets id.
     * <p>
     * Field description:
     * The ID of the resource.
     *
     * @param id
     * @return This {@link ResourcesNumberResourceOrderApiDoc instance}.
     */
    public ResourcesNumberResourceOrderApiDoc id(UUID id) {
        this.id = id;
        return this;
    }

    /**
     * Returns id.
     * <p>
     * Field description:
     * The ID of the resource.
     *
     * @return id
     */
    @JsonProperty("id")
    public UUID getId() {
        return id;
    }

    /**
     * Sets id.
     * <p>
     * Field description:
     * The ID of the resource.
     *
     * @param id
     */
    @JsonProperty("id")
    public void setId(UUID id) {
        this.id = id;
    }

    /**
     * Sets type.
     * <p>
     * Field description:
     * Type of resource.
     *
     * @param type
     * @return This {@link ResourcesNumberResourceOrderApiDoc instance}.
     */
    public ResourcesNumberResourceOrderApiDoc type(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * Returns type.
     * <p>
     * Field description:
     * Type of resource.
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
     *
     * @param type
     */
    @JsonProperty("type")
    public void setType(TypeEnum type) {
        this.type = type;
    }

    /**
     * Sets countryCode.
     * <p>
     * Field description:
     * Country code in two-letter ISO standard.
     *
     * @param countryCode
     * @return This {@link ResourcesNumberResourceOrderApiDoc instance}.
     */
    public ResourcesNumberResourceOrderApiDoc countryCode(String countryCode) {
        this.countryCode = countryCode;
        return this;
    }

    /**
     * Returns countryCode.
     * <p>
     * Field description:
     * Country code in two-letter ISO standard.
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
     *
     * @param countryCode
     */
    @JsonProperty("countryCode")
    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    /**
     * Sets requestedByEmailAddress.
     * <p>
     * Field description:
     * Email address of the requester.
     *
     * @param requestedByEmailAddress
     * @return This {@link ResourcesNumberResourceOrderApiDoc instance}.
     */
    public ResourcesNumberResourceOrderApiDoc requestedByEmailAddress(String requestedByEmailAddress) {
        this.requestedByEmailAddress = requestedByEmailAddress;
        return this;
    }

    /**
     * Returns requestedByEmailAddress.
     * <p>
     * Field description:
     * Email address of the requester.
     *
     * @return requestedByEmailAddress
     */
    @JsonProperty("requestedByEmailAddress")
    public String getRequestedByEmailAddress() {
        return requestedByEmailAddress;
    }

    /**
     * Sets requestedByEmailAddress.
     * <p>
     * Field description:
     * Email address of the requester.
     *
     * @param requestedByEmailAddress
     */
    @JsonProperty("requestedByEmailAddress")
    public void setRequestedByEmailAddress(String requestedByEmailAddress) {
        this.requestedByEmailAddress = requestedByEmailAddress;
    }

    /**
     * Sets additionalContactEmailAddresses.
     * <p>
     * Field description:
     * Additional email addresses.
     *
     * @param additionalContactEmailAddresses
     * @return This {@link ResourcesNumberResourceOrderApiDoc instance}.
     */
    public ResourcesNumberResourceOrderApiDoc additionalContactEmailAddresses(
            List<String> additionalContactEmailAddresses) {
        this.additionalContactEmailAddresses = additionalContactEmailAddresses;
        return this;
    }

    /**
     * Adds and item into additionalContactEmailAddresses.
     * <p>
     * Field description:
     * Additional email addresses.
     *
     * @param additionalContactEmailAddressesItem The item to be added to the list.
     * @return This {@link ResourcesNumberResourceOrderApiDoc instance}.
     */
    public ResourcesNumberResourceOrderApiDoc addAdditionalContactEmailAddressesItem(
            String additionalContactEmailAddressesItem) {
        if (this.additionalContactEmailAddresses == null) {
            this.additionalContactEmailAddresses = new ArrayList<>();
        }
        this.additionalContactEmailAddresses.add(additionalContactEmailAddressesItem);
        return this;
    }

    /**
     * Returns additionalContactEmailAddresses.
     * <p>
     * Field description:
     * Additional email addresses.
     *
     * @return additionalContactEmailAddresses
     */
    @JsonProperty("additionalContactEmailAddresses")
    public List<String> getAdditionalContactEmailAddresses() {
        return additionalContactEmailAddresses;
    }

    /**
     * Sets additionalContactEmailAddresses.
     * <p>
     * Field description:
     * Additional email addresses.
     *
     * @param additionalContactEmailAddresses
     */
    @JsonProperty("additionalContactEmailAddresses")
    public void setAdditionalContactEmailAddresses(List<String> additionalContactEmailAddresses) {
        this.additionalContactEmailAddresses = additionalContactEmailAddresses;
    }

    /**
     * Sets requestedDate.
     * <p>
     * Field description:
     * Date and time the resource was requested.
     *
     * @param requestedDate
     * @return This {@link ResourcesNumberResourceOrderApiDoc instance}.
     */
    public ResourcesNumberResourceOrderApiDoc requestedDate(OffsetDateTime requestedDate) {
        this.requestedDate = requestedDate;
        return this;
    }

    /**
     * Returns requestedDate.
     * <p>
     * Field description:
     * Date and time the resource was requested.
     *
     * @return requestedDate
     */
    @JsonProperty("requestedDate")
    public OffsetDateTime getRequestedDate() {
        return requestedDate;
    }

    /**
     * Sets requestedDate.
     * <p>
     * Field description:
     * Date and time the resource was requested.
     *
     * @param requestedDate
     */
    @JsonProperty("requestedDate")
    public void setRequestedDate(OffsetDateTime requestedDate) {
        this.requestedDate = requestedDate;
    }

    /**
     * Sets status.
     *
     * @param status
     * @return This {@link ResourcesNumberResourceOrderApiDoc instance}.
     */
    public ResourcesNumberResourceOrderApiDoc status(ResourcesResourceOrderStatus status) {
        this.status = status;
        return this;
    }

    /**
     * Returns status.
     *
     * @return status
     */
    @JsonProperty("status")
    public ResourcesResourceOrderStatus getStatus() {
        return status;
    }

    /**
     * Sets status.
     *
     * @param status
     */
    @JsonProperty("status")
    public void setStatus(ResourcesResourceOrderStatus status) {
        this.status = status;
    }

    /**
     * Sets numberType.
     *
     * @param numberType
     * @return This {@link ResourcesNumberResourceOrderApiDoc instance}.
     */
    public ResourcesNumberResourceOrderApiDoc numberType(ResourcesResourceNumberType numberType) {
        this.numberType = numberType;
        return this;
    }

    /**
     * Returns numberType.
     *
     * @return numberType
     */
    @JsonProperty("numberType")
    public ResourcesResourceNumberType getNumberType() {
        return numberType;
    }

    /**
     * Sets numberType.
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
     *
     * @param capabilities
     * @return This {@link ResourcesNumberResourceOrderApiDoc instance}.
     */
    public ResourcesNumberResourceOrderApiDoc capabilities(List<ResourcesResourceNumberCapability> capabilities) {
        this.capabilities = capabilities;
        return this;
    }

    /**
     * Adds and item into capabilities.
     * <p>
     * Field description:
     * Capabilities of the numbers.
     *
     * @param capabilitiesItem The item to be added to the list.
     * @return This {@link ResourcesNumberResourceOrderApiDoc instance}.
     */
    public ResourcesNumberResourceOrderApiDoc addCapabilitiesItem(ResourcesResourceNumberCapability capabilitiesItem) {
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
     *
     * @param capabilities
     */
    @JsonProperty("capabilities")
    public void setCapabilities(List<ResourcesResourceNumberCapability> capabilities) {
        this.capabilities = capabilities;
    }

    /**
     * Sets quantity.
     * <p>
     * Field description:
     * Amount of numbers.
     *
     * @param quantity
     * @return This {@link ResourcesNumberResourceOrderApiDoc instance}.
     */
    public ResourcesNumberResourceOrderApiDoc quantity(Integer quantity) {
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
     * Sets note.
     * <p>
     * Field description:
     * A note containing extra data about the request.
     *
     * @param note
     * @return This {@link ResourcesNumberResourceOrderApiDoc instance}.
     */
    public ResourcesNumberResourceOrderApiDoc note(String note) {
        this.note = note;
        return this;
    }

    /**
     * Returns note.
     * <p>
     * Field description:
     * A note containing extra data about the request.
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
     * A note containing extra data about the request.
     *
     * @param note
     */
    @JsonProperty("note")
    public void setNote(String note) {
        this.note = note;
    }

    /**
     * Sets numbers.
     * <p>
     * Field description:
     * List of numbers linked with the resource.
     *
     * @param numbers
     * @return This {@link ResourcesNumberResourceOrderApiDoc instance}.
     */
    public ResourcesNumberResourceOrderApiDoc numbers(List<ResourcesProcuredNumber> numbers) {
        this.numbers = numbers;
        return this;
    }

    /**
     * Adds and item into numbers.
     * <p>
     * Field description:
     * List of numbers linked with the resource.
     *
     * @param numbersItem The item to be added to the list.
     * @return This {@link ResourcesNumberResourceOrderApiDoc instance}.
     */
    public ResourcesNumberResourceOrderApiDoc addNumbersItem(ResourcesProcuredNumber numbersItem) {
        if (this.numbers == null) {
            this.numbers = new ArrayList<>();
        }
        this.numbers.add(numbersItem);
        return this;
    }

    /**
     * Returns numbers.
     * <p>
     * Field description:
     * List of numbers linked with the resource.
     *
     * @return numbers
     */
    @JsonProperty("numbers")
    public List<ResourcesProcuredNumber> getNumbers() {
        return numbers;
    }

    /**
     * Sets numbers.
     * <p>
     * Field description:
     * List of numbers linked with the resource.
     *
     * @param numbers
     */
    @JsonProperty("numbers")
    public void setNumbers(List<ResourcesProcuredNumber> numbers) {
        this.numbers = numbers;
    }

    /**
     * Sets requirementsFeedback.
     * <p>
     * Field description:
     * List of feedback for requirements.
     *
     * @param requirementsFeedback
     * @return This {@link ResourcesNumberResourceOrderApiDoc instance}.
     */
    public ResourcesNumberResourceOrderApiDoc requirementsFeedback(
            List<ResourcesFilledRequirementFeedback> requirementsFeedback) {
        this.requirementsFeedback = requirementsFeedback;
        return this;
    }

    /**
     * Adds and item into requirementsFeedback.
     * <p>
     * Field description:
     * List of feedback for requirements.
     *
     * @param requirementsFeedbackItem The item to be added to the list.
     * @return This {@link ResourcesNumberResourceOrderApiDoc instance}.
     */
    public ResourcesNumberResourceOrderApiDoc addRequirementsFeedbackItem(
            ResourcesFilledRequirementFeedback requirementsFeedbackItem) {
        if (this.requirementsFeedback == null) {
            this.requirementsFeedback = new ArrayList<>();
        }
        this.requirementsFeedback.add(requirementsFeedbackItem);
        return this;
    }

    /**
     * Returns requirementsFeedback.
     * <p>
     * Field description:
     * List of feedback for requirements.
     *
     * @return requirementsFeedback
     */
    @JsonProperty("requirementsFeedback")
    public List<ResourcesFilledRequirementFeedback> getRequirementsFeedback() {
        return requirementsFeedback;
    }

    /**
     * Sets requirementsFeedback.
     * <p>
     * Field description:
     * List of feedback for requirements.
     *
     * @param requirementsFeedback
     */
    @JsonProperty("requirementsFeedback")
    public void setRequirementsFeedback(List<ResourcesFilledRequirementFeedback> requirementsFeedback) {
        this.requirementsFeedback = requirementsFeedback;
    }

    /**
     * Sets requirements.
     * <p>
     * Field description:
     * List of requirements for the resource.
     *
     * @param requirements
     * @return This {@link ResourcesNumberResourceOrderApiDoc instance}.
     */
    public ResourcesNumberResourceOrderApiDoc requirements(List<ResourcesFilledRequirement> requirements) {
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
     * @return This {@link ResourcesNumberResourceOrderApiDoc instance}.
     */
    public ResourcesNumberResourceOrderApiDoc addRequirementsItem(ResourcesFilledRequirement requirementsItem) {
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
     * @return This {@link ResourcesNumberResourceOrderApiDoc instance}.
     */
    public ResourcesNumberResourceOrderApiDoc platform(Platform platform) {
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
        ResourcesNumberResourceOrderApiDoc resourcesNumberResourceOrderApiDoc = (ResourcesNumberResourceOrderApiDoc) o;
        return Objects.equals(this.id, resourcesNumberResourceOrderApiDoc.id)
                && Objects.equals(this.type, resourcesNumberResourceOrderApiDoc.type)
                && Objects.equals(this.countryCode, resourcesNumberResourceOrderApiDoc.countryCode)
                && Objects.equals(
                        this.requestedByEmailAddress, resourcesNumberResourceOrderApiDoc.requestedByEmailAddress)
                && Objects.equals(
                        this.additionalContactEmailAddresses,
                        resourcesNumberResourceOrderApiDoc.additionalContactEmailAddresses)
                && Objects.equals(this.requestedDate, resourcesNumberResourceOrderApiDoc.requestedDate)
                && Objects.equals(this.status, resourcesNumberResourceOrderApiDoc.status)
                && Objects.equals(this.numberType, resourcesNumberResourceOrderApiDoc.numberType)
                && Objects.equals(this.capabilities, resourcesNumberResourceOrderApiDoc.capabilities)
                && Objects.equals(this.quantity, resourcesNumberResourceOrderApiDoc.quantity)
                && Objects.equals(this.note, resourcesNumberResourceOrderApiDoc.note)
                && Objects.equals(this.numbers, resourcesNumberResourceOrderApiDoc.numbers)
                && Objects.equals(this.requirementsFeedback, resourcesNumberResourceOrderApiDoc.requirementsFeedback)
                && Objects.equals(this.requirements, resourcesNumberResourceOrderApiDoc.requirements)
                && Objects.equals(this.platform, resourcesNumberResourceOrderApiDoc.platform);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                id,
                type,
                countryCode,
                requestedByEmailAddress,
                additionalContactEmailAddresses,
                requestedDate,
                status,
                numberType,
                capabilities,
                quantity,
                note,
                numbers,
                requirementsFeedback,
                requirements,
                platform);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class ResourcesNumberResourceOrderApiDoc {")
                .append(newLine)
                .append("    id: ")
                .append(toIndentedString(id))
                .append(newLine)
                .append("    type: ")
                .append(toIndentedString(type))
                .append(newLine)
                .append("    countryCode: ")
                .append(toIndentedString(countryCode))
                .append(newLine)
                .append("    requestedByEmailAddress: ")
                .append(toIndentedString(requestedByEmailAddress))
                .append(newLine)
                .append("    additionalContactEmailAddresses: ")
                .append(toIndentedString(additionalContactEmailAddresses))
                .append(newLine)
                .append("    requestedDate: ")
                .append(toIndentedString(requestedDate))
                .append(newLine)
                .append("    status: ")
                .append(toIndentedString(status))
                .append(newLine)
                .append("    numberType: ")
                .append(toIndentedString(numberType))
                .append(newLine)
                .append("    capabilities: ")
                .append(toIndentedString(capabilities))
                .append(newLine)
                .append("    quantity: ")
                .append(toIndentedString(quantity))
                .append(newLine)
                .append("    note: ")
                .append(toIndentedString(note))
                .append(newLine)
                .append("    numbers: ")
                .append(toIndentedString(numbers))
                .append(newLine)
                .append("    requirementsFeedback: ")
                .append(toIndentedString(requirementsFeedback))
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
