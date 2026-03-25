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
 * Represents ResourcesAlphaResourceOrderApiDoc model.
 */
public class ResourcesAlphaResourceOrderApiDoc
        implements GetResourceRequest200Response, ResourcesPageResourceOrderApiDocResultsInner {

    private UUID id;

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

    private String countryCode;

    private String senderName;

    private String requestedByEmailAddress;

    private List<String> additionalContactEmailAddresses = null;

    private OffsetDateTime requestedDate;

    private ResourcesResourceOrderStatus status;

    private ResourcesTrafficOrigin trafficOrigin;

    private ResourcesTrafficType trafficType;

    private String note;

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
     * @return This {@link ResourcesAlphaResourceOrderApiDoc instance}.
     */
    public ResourcesAlphaResourceOrderApiDoc id(UUID id) {
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
     * @return This {@link ResourcesAlphaResourceOrderApiDoc instance}.
     */
    public ResourcesAlphaResourceOrderApiDoc type(TypeEnum type) {
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
     * @return This {@link ResourcesAlphaResourceOrderApiDoc instance}.
     */
    public ResourcesAlphaResourceOrderApiDoc countryCode(String countryCode) {
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
     * Sets senderName.
     * <p>
     * Field description:
     * Sender name.
     *
     * @param senderName
     * @return This {@link ResourcesAlphaResourceOrderApiDoc instance}.
     */
    public ResourcesAlphaResourceOrderApiDoc senderName(String senderName) {
        this.senderName = senderName;
        return this;
    }

    /**
     * Returns senderName.
     * <p>
     * Field description:
     * Sender name.
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
     * Sender name.
     *
     * @param senderName
     */
    @JsonProperty("senderName")
    public void setSenderName(String senderName) {
        this.senderName = senderName;
    }

    /**
     * Sets requestedByEmailAddress.
     * <p>
     * Field description:
     * Email address of the requester.
     *
     * @param requestedByEmailAddress
     * @return This {@link ResourcesAlphaResourceOrderApiDoc instance}.
     */
    public ResourcesAlphaResourceOrderApiDoc requestedByEmailAddress(String requestedByEmailAddress) {
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
     * @return This {@link ResourcesAlphaResourceOrderApiDoc instance}.
     */
    public ResourcesAlphaResourceOrderApiDoc additionalContactEmailAddresses(
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
     * @return This {@link ResourcesAlphaResourceOrderApiDoc instance}.
     */
    public ResourcesAlphaResourceOrderApiDoc addAdditionalContactEmailAddressesItem(
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
     * @return This {@link ResourcesAlphaResourceOrderApiDoc instance}.
     */
    public ResourcesAlphaResourceOrderApiDoc requestedDate(OffsetDateTime requestedDate) {
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
     * @return This {@link ResourcesAlphaResourceOrderApiDoc instance}.
     */
    public ResourcesAlphaResourceOrderApiDoc status(ResourcesResourceOrderStatus status) {
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
     * Sets trafficOrigin.
     *
     * @param trafficOrigin
     * @return This {@link ResourcesAlphaResourceOrderApiDoc instance}.
     */
    public ResourcesAlphaResourceOrderApiDoc trafficOrigin(ResourcesTrafficOrigin trafficOrigin) {
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
     * @return This {@link ResourcesAlphaResourceOrderApiDoc instance}.
     */
    public ResourcesAlphaResourceOrderApiDoc trafficType(ResourcesTrafficType trafficType) {
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
     * Sets note.
     * <p>
     * Field description:
     * A note containing extra data about the request.
     *
     * @param note
     * @return This {@link ResourcesAlphaResourceOrderApiDoc instance}.
     */
    public ResourcesAlphaResourceOrderApiDoc note(String note) {
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
     * Sets requirementsFeedback.
     * <p>
     * Field description:
     * List of feedback for requirements.
     *
     * @param requirementsFeedback
     * @return This {@link ResourcesAlphaResourceOrderApiDoc instance}.
     */
    public ResourcesAlphaResourceOrderApiDoc requirementsFeedback(
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
     * @return This {@link ResourcesAlphaResourceOrderApiDoc instance}.
     */
    public ResourcesAlphaResourceOrderApiDoc addRequirementsFeedbackItem(
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
     * @return This {@link ResourcesAlphaResourceOrderApiDoc instance}.
     */
    public ResourcesAlphaResourceOrderApiDoc requirements(List<ResourcesFilledRequirement> requirements) {
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
     * @return This {@link ResourcesAlphaResourceOrderApiDoc instance}.
     */
    public ResourcesAlphaResourceOrderApiDoc addRequirementsItem(ResourcesFilledRequirement requirementsItem) {
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
     * @return This {@link ResourcesAlphaResourceOrderApiDoc instance}.
     */
    public ResourcesAlphaResourceOrderApiDoc platform(Platform platform) {
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
        ResourcesAlphaResourceOrderApiDoc resourcesAlphaResourceOrderApiDoc = (ResourcesAlphaResourceOrderApiDoc) o;
        return Objects.equals(this.id, resourcesAlphaResourceOrderApiDoc.id)
                && Objects.equals(this.type, resourcesAlphaResourceOrderApiDoc.type)
                && Objects.equals(this.countryCode, resourcesAlphaResourceOrderApiDoc.countryCode)
                && Objects.equals(this.senderName, resourcesAlphaResourceOrderApiDoc.senderName)
                && Objects.equals(
                        this.requestedByEmailAddress, resourcesAlphaResourceOrderApiDoc.requestedByEmailAddress)
                && Objects.equals(
                        this.additionalContactEmailAddresses,
                        resourcesAlphaResourceOrderApiDoc.additionalContactEmailAddresses)
                && Objects.equals(this.requestedDate, resourcesAlphaResourceOrderApiDoc.requestedDate)
                && Objects.equals(this.status, resourcesAlphaResourceOrderApiDoc.status)
                && Objects.equals(this.trafficOrigin, resourcesAlphaResourceOrderApiDoc.trafficOrigin)
                && Objects.equals(this.trafficType, resourcesAlphaResourceOrderApiDoc.trafficType)
                && Objects.equals(this.note, resourcesAlphaResourceOrderApiDoc.note)
                && Objects.equals(this.requirementsFeedback, resourcesAlphaResourceOrderApiDoc.requirementsFeedback)
                && Objects.equals(this.requirements, resourcesAlphaResourceOrderApiDoc.requirements)
                && Objects.equals(this.platform, resourcesAlphaResourceOrderApiDoc.platform);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                id,
                type,
                countryCode,
                senderName,
                requestedByEmailAddress,
                additionalContactEmailAddresses,
                requestedDate,
                status,
                trafficOrigin,
                trafficType,
                note,
                requirementsFeedback,
                requirements,
                platform);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class ResourcesAlphaResourceOrderApiDoc {")
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
                .append("    senderName: ")
                .append(toIndentedString(senderName))
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
                .append("    trafficOrigin: ")
                .append(toIndentedString(trafficOrigin))
                .append(newLine)
                .append("    trafficType: ")
                .append(toIndentedString(trafficType))
                .append(newLine)
                .append("    note: ")
                .append(toIndentedString(note))
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
