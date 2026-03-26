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
 * Represents ResourcesRcsSenderResourceOrderApiDoc model.
 */
public class ResourcesRcsSenderResourceOrderApiDoc
        implements ResourcesGetResourceRequestResponse,
                ResourcesPageResourceOrderApiDocResultsInner,
                ResourcesUpdateResourceRequestResponse {

    private UUID id;

    /**
     * Type of resource.
     */
    public enum TypeEnum {
        RCS_SENDER_LAUNCH("RCS_SENDER_LAUNCH");

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

    private ResourcesResourceOrderStatus status;

    private String countryCode;

    private List<String> excludedCarriers = null;

    private String senderName;

    private String requestedByEmailAddress;

    private List<String> additionalContactEmails = null;

    private OffsetDateTime requestedDate;

    private ResourcesTrafficOrigin trafficOrigin;

    private String note;

    private List<ResourcesFilledRequirement> requirements = null;

    private List<ResourcesFilledRequirementFeedback> requirementsFeedback = null;

    private Platform platform;

    /**
     * Sets id.
     * <p>
     * Field description:
     * The ID of the resource.
     *
     * @param id
     * @return This {@link ResourcesRcsSenderResourceOrderApiDoc instance}.
     */
    public ResourcesRcsSenderResourceOrderApiDoc id(UUID id) {
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
     * @return This {@link ResourcesRcsSenderResourceOrderApiDoc instance}.
     */
    public ResourcesRcsSenderResourceOrderApiDoc type(TypeEnum type) {
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
     * Sets status.
     *
     * @param status
     * @return This {@link ResourcesRcsSenderResourceOrderApiDoc instance}.
     */
    public ResourcesRcsSenderResourceOrderApiDoc status(ResourcesResourceOrderStatus status) {
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
     * Sets countryCode.
     * <p>
     * Field description:
     * Country code in two-letter ISO standard.
     *
     * @param countryCode
     * @return This {@link ResourcesRcsSenderResourceOrderApiDoc instance}.
     */
    public ResourcesRcsSenderResourceOrderApiDoc countryCode(String countryCode) {
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
     * Sets excludedCarriers.
     * <p>
     * Field description:
     * List of carrier names excluded from the sender launch.
     *
     * @param excludedCarriers
     * @return This {@link ResourcesRcsSenderResourceOrderApiDoc instance}.
     */
    public ResourcesRcsSenderResourceOrderApiDoc excludedCarriers(List<String> excludedCarriers) {
        this.excludedCarriers = excludedCarriers;
        return this;
    }

    /**
     * Adds and item into excludedCarriers.
     * <p>
     * Field description:
     * List of carrier names excluded from the sender launch.
     *
     * @param excludedCarriersItem The item to be added to the list.
     * @return This {@link ResourcesRcsSenderResourceOrderApiDoc instance}.
     */
    public ResourcesRcsSenderResourceOrderApiDoc addExcludedCarriersItem(String excludedCarriersItem) {
        if (this.excludedCarriers == null) {
            this.excludedCarriers = new ArrayList<>();
        }
        this.excludedCarriers.add(excludedCarriersItem);
        return this;
    }

    /**
     * Returns excludedCarriers.
     * <p>
     * Field description:
     * List of carrier names excluded from the sender launch.
     *
     * @return excludedCarriers
     */
    @JsonProperty("excludedCarriers")
    public List<String> getExcludedCarriers() {
        return excludedCarriers;
    }

    /**
     * Sets excludedCarriers.
     * <p>
     * Field description:
     * List of carrier names excluded from the sender launch.
     *
     * @param excludedCarriers
     */
    @JsonProperty("excludedCarriers")
    public void setExcludedCarriers(List<String> excludedCarriers) {
        this.excludedCarriers = excludedCarriers;
    }

    /**
     * Sets senderName.
     * <p>
     * Field description:
     * Sender name.
     *
     * @param senderName
     * @return This {@link ResourcesRcsSenderResourceOrderApiDoc instance}.
     */
    public ResourcesRcsSenderResourceOrderApiDoc senderName(String senderName) {
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
     * @return This {@link ResourcesRcsSenderResourceOrderApiDoc instance}.
     */
    public ResourcesRcsSenderResourceOrderApiDoc requestedByEmailAddress(String requestedByEmailAddress) {
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
     * Sets additionalContactEmails.
     * <p>
     * Field description:
     * Additional email addresses.
     *
     * @param additionalContactEmails
     * @return This {@link ResourcesRcsSenderResourceOrderApiDoc instance}.
     */
    public ResourcesRcsSenderResourceOrderApiDoc additionalContactEmails(List<String> additionalContactEmails) {
        this.additionalContactEmails = additionalContactEmails;
        return this;
    }

    /**
     * Adds and item into additionalContactEmails.
     * <p>
     * Field description:
     * Additional email addresses.
     *
     * @param additionalContactEmailsItem The item to be added to the list.
     * @return This {@link ResourcesRcsSenderResourceOrderApiDoc instance}.
     */
    public ResourcesRcsSenderResourceOrderApiDoc addAdditionalContactEmailsItem(String additionalContactEmailsItem) {
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
     * Additional email addresses.
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
     * Additional email addresses.
     *
     * @param additionalContactEmails
     */
    @JsonProperty("additionalContactEmails")
    public void setAdditionalContactEmails(List<String> additionalContactEmails) {
        this.additionalContactEmails = additionalContactEmails;
    }

    /**
     * Sets requestedDate.
     * <p>
     * Field description:
     * Date and time the resource was requested.
     *
     * @param requestedDate
     * @return This {@link ResourcesRcsSenderResourceOrderApiDoc instance}.
     */
    public ResourcesRcsSenderResourceOrderApiDoc requestedDate(OffsetDateTime requestedDate) {
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
     * Sets trafficOrigin.
     *
     * @param trafficOrigin
     * @return This {@link ResourcesRcsSenderResourceOrderApiDoc instance}.
     */
    public ResourcesRcsSenderResourceOrderApiDoc trafficOrigin(ResourcesTrafficOrigin trafficOrigin) {
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
     * Sets note.
     * <p>
     * Field description:
     * A note containing extra data about the request.
     *
     * @param note
     * @return This {@link ResourcesRcsSenderResourceOrderApiDoc instance}.
     */
    public ResourcesRcsSenderResourceOrderApiDoc note(String note) {
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
     * Sets requirements.
     * <p>
     * Field description:
     * List of requirements for the resource.
     *
     * @param requirements
     * @return This {@link ResourcesRcsSenderResourceOrderApiDoc instance}.
     */
    public ResourcesRcsSenderResourceOrderApiDoc requirements(List<ResourcesFilledRequirement> requirements) {
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
     * @return This {@link ResourcesRcsSenderResourceOrderApiDoc instance}.
     */
    public ResourcesRcsSenderResourceOrderApiDoc addRequirementsItem(ResourcesFilledRequirement requirementsItem) {
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
     * Sets requirementsFeedback.
     * <p>
     * Field description:
     * List of feedback for requirements.
     *
     * @param requirementsFeedback
     * @return This {@link ResourcesRcsSenderResourceOrderApiDoc instance}.
     */
    public ResourcesRcsSenderResourceOrderApiDoc requirementsFeedback(
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
     * @return This {@link ResourcesRcsSenderResourceOrderApiDoc instance}.
     */
    public ResourcesRcsSenderResourceOrderApiDoc addRequirementsFeedbackItem(
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
     * Sets platform.
     *
     * @param platform
     * @return This {@link ResourcesRcsSenderResourceOrderApiDoc instance}.
     */
    public ResourcesRcsSenderResourceOrderApiDoc platform(Platform platform) {
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
        ResourcesRcsSenderResourceOrderApiDoc resourcesRcsSenderResourceOrderApiDoc =
                (ResourcesRcsSenderResourceOrderApiDoc) o;
        return Objects.equals(this.id, resourcesRcsSenderResourceOrderApiDoc.id)
                && Objects.equals(this.type, resourcesRcsSenderResourceOrderApiDoc.type)
                && Objects.equals(this.status, resourcesRcsSenderResourceOrderApiDoc.status)
                && Objects.equals(this.countryCode, resourcesRcsSenderResourceOrderApiDoc.countryCode)
                && Objects.equals(this.excludedCarriers, resourcesRcsSenderResourceOrderApiDoc.excludedCarriers)
                && Objects.equals(this.senderName, resourcesRcsSenderResourceOrderApiDoc.senderName)
                && Objects.equals(
                        this.requestedByEmailAddress, resourcesRcsSenderResourceOrderApiDoc.requestedByEmailAddress)
                && Objects.equals(
                        this.additionalContactEmails, resourcesRcsSenderResourceOrderApiDoc.additionalContactEmails)
                && Objects.equals(this.requestedDate, resourcesRcsSenderResourceOrderApiDoc.requestedDate)
                && Objects.equals(this.trafficOrigin, resourcesRcsSenderResourceOrderApiDoc.trafficOrigin)
                && Objects.equals(this.note, resourcesRcsSenderResourceOrderApiDoc.note)
                && Objects.equals(this.requirements, resourcesRcsSenderResourceOrderApiDoc.requirements)
                && Objects.equals(this.requirementsFeedback, resourcesRcsSenderResourceOrderApiDoc.requirementsFeedback)
                && Objects.equals(this.platform, resourcesRcsSenderResourceOrderApiDoc.platform);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                id,
                type,
                status,
                countryCode,
                excludedCarriers,
                senderName,
                requestedByEmailAddress,
                additionalContactEmails,
                requestedDate,
                trafficOrigin,
                note,
                requirements,
                requirementsFeedback,
                platform);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class ResourcesRcsSenderResourceOrderApiDoc {")
                .append(newLine)
                .append("    id: ")
                .append(toIndentedString(id))
                .append(newLine)
                .append("    type: ")
                .append(toIndentedString(type))
                .append(newLine)
                .append("    status: ")
                .append(toIndentedString(status))
                .append(newLine)
                .append("    countryCode: ")
                .append(toIndentedString(countryCode))
                .append(newLine)
                .append("    excludedCarriers: ")
                .append(toIndentedString(excludedCarriers))
                .append(newLine)
                .append("    senderName: ")
                .append(toIndentedString(senderName))
                .append(newLine)
                .append("    requestedByEmailAddress: ")
                .append(toIndentedString(requestedByEmailAddress))
                .append(newLine)
                .append("    additionalContactEmails: ")
                .append(toIndentedString(additionalContactEmails))
                .append(newLine)
                .append("    requestedDate: ")
                .append(toIndentedString(requestedDate))
                .append(newLine)
                .append("    trafficOrigin: ")
                .append(toIndentedString(trafficOrigin))
                .append(newLine)
                .append("    note: ")
                .append(toIndentedString(note))
                .append(newLine)
                .append("    requirements: ")
                .append(toIndentedString(requirements))
                .append(newLine)
                .append("    requirementsFeedback: ")
                .append(toIndentedString(requirementsFeedback))
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
