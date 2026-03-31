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
 * Represents ResourcesNumberWebhookNotifApiDoc model.
 */
public class ResourcesNumberWebhookNotifApiDoc implements ResourcesWebhookNotifApiDocResultContent {

    private String id;

    /**
     * Status of the resource request.
     */
    public enum StatusEnum {
        UPDATE_REQUESTED("UPDATE_REQUESTED"),
        UPDATE_REQUESTED_BY_INTERNAL_REVIEWER("UPDATE_REQUESTED_BY_INTERNAL_REVIEWER"),
        REJECTED("REJECTED"),
        COMPLETED("COMPLETED");

        private String value;

        StatusEnum(String value) {
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
        public static StatusEnum fromValue(String value) {
            for (StatusEnum enumElement : StatusEnum.values()) {
                if (enumElement.value.equals(value)) {
                    return enumElement;
                }
            }
            throw new IllegalArgumentException("Unexpected enum value '" + value + "'.");
        }
    }

    private StatusEnum status;

    private List<ResourcesProcuredNumber> numbers = null;

    private List<ResourcesFilledRequirementFeedbackApiDoc> requirementsFeedback = null;

    private String note;

    private ResourcesWebhookNotifContentType type;

    /**
     * Sets id.
     * <p>
     * Field description:
     * ID of the resource request.
     * <p>
     * The field is required.
     *
     * @param id
     * @return This {@link ResourcesNumberWebhookNotifApiDoc instance}.
     */
    public ResourcesNumberWebhookNotifApiDoc id(String id) {
        this.id = id;
        return this;
    }

    /**
     * Returns id.
     * <p>
     * Field description:
     * ID of the resource request.
     * <p>
     * The field is required.
     *
     * @return id
     */
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    /**
     * Sets id.
     * <p>
     * Field description:
     * ID of the resource request.
     * <p>
     * The field is required.
     *
     * @param id
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Sets status.
     * <p>
     * Field description:
     * Status of the resource request.
     * <p>
     * The field is required.
     *
     * @param status
     * @return This {@link ResourcesNumberWebhookNotifApiDoc instance}.
     */
    public ResourcesNumberWebhookNotifApiDoc status(StatusEnum status) {
        this.status = status;
        return this;
    }

    /**
     * Returns status.
     * <p>
     * Field description:
     * Status of the resource request.
     * <p>
     * The field is required.
     *
     * @return status
     */
    @JsonProperty("status")
    public StatusEnum getStatus() {
        return status;
    }

    /**
     * Sets status.
     * <p>
     * Field description:
     * Status of the resource request.
     * <p>
     * The field is required.
     *
     * @param status
     */
    @JsonProperty("status")
    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    /**
     * Sets numbers.
     * <p>
     * Field description:
     * List of numbers linked with the resource.
     *
     * @param numbers
     * @return This {@link ResourcesNumberWebhookNotifApiDoc instance}.
     */
    public ResourcesNumberWebhookNotifApiDoc numbers(List<ResourcesProcuredNumber> numbers) {
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
     * @return This {@link ResourcesNumberWebhookNotifApiDoc instance}.
     */
    public ResourcesNumberWebhookNotifApiDoc addNumbersItem(ResourcesProcuredNumber numbersItem) {
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
     * Feedback for requirements. Present only for UPDATE_REQUESTED and UPDATE_REQUESTED_BY_INTERNAL_REVIEWER statuses.
     *
     * @param requirementsFeedback
     * @return This {@link ResourcesNumberWebhookNotifApiDoc instance}.
     */
    public ResourcesNumberWebhookNotifApiDoc requirementsFeedback(
            List<ResourcesFilledRequirementFeedbackApiDoc> requirementsFeedback) {
        this.requirementsFeedback = requirementsFeedback;
        return this;
    }

    /**
     * Adds and item into requirementsFeedback.
     * <p>
     * Field description:
     * Feedback for requirements. Present only for UPDATE_REQUESTED and UPDATE_REQUESTED_BY_INTERNAL_REVIEWER statuses.
     *
     * @param requirementsFeedbackItem The item to be added to the list.
     * @return This {@link ResourcesNumberWebhookNotifApiDoc instance}.
     */
    public ResourcesNumberWebhookNotifApiDoc addRequirementsFeedbackItem(
            ResourcesFilledRequirementFeedbackApiDoc requirementsFeedbackItem) {
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
     * Feedback for requirements. Present only for UPDATE_REQUESTED and UPDATE_REQUESTED_BY_INTERNAL_REVIEWER statuses.
     *
     * @return requirementsFeedback
     */
    @JsonProperty("requirementsFeedback")
    public List<ResourcesFilledRequirementFeedbackApiDoc> getRequirementsFeedback() {
        return requirementsFeedback;
    }

    /**
     * Sets requirementsFeedback.
     * <p>
     * Field description:
     * Feedback for requirements. Present only for UPDATE_REQUESTED and UPDATE_REQUESTED_BY_INTERNAL_REVIEWER statuses.
     *
     * @param requirementsFeedback
     */
    @JsonProperty("requirementsFeedback")
    public void setRequirementsFeedback(List<ResourcesFilledRequirementFeedbackApiDoc> requirementsFeedback) {
        this.requirementsFeedback = requirementsFeedback;
    }

    /**
     * Sets note.
     * <p>
     * Field description:
     * A note containing extra data about the request.
     *
     * @param note
     * @return This {@link ResourcesNumberWebhookNotifApiDoc instance}.
     */
    public ResourcesNumberWebhookNotifApiDoc note(String note) {
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
     * Sets type.
     *
     * @param type
     * @return This {@link ResourcesNumberWebhookNotifApiDoc instance}.
     */
    public ResourcesNumberWebhookNotifApiDoc type(ResourcesWebhookNotifContentType type) {
        this.type = type;
        return this;
    }

    /**
     * Returns type.
     *
     * @return type
     */
    @JsonProperty("type")
    public ResourcesWebhookNotifContentType getType() {
        return type;
    }

    /**
     * Sets type.
     *
     * @param type
     */
    @JsonProperty("type")
    public void setType(ResourcesWebhookNotifContentType type) {
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ResourcesNumberWebhookNotifApiDoc resourcesNumberWebhookNotifApiDoc = (ResourcesNumberWebhookNotifApiDoc) o;
        return Objects.equals(this.id, resourcesNumberWebhookNotifApiDoc.id)
                && Objects.equals(this.status, resourcesNumberWebhookNotifApiDoc.status)
                && Objects.equals(this.numbers, resourcesNumberWebhookNotifApiDoc.numbers)
                && Objects.equals(this.requirementsFeedback, resourcesNumberWebhookNotifApiDoc.requirementsFeedback)
                && Objects.equals(this.note, resourcesNumberWebhookNotifApiDoc.note)
                && Objects.equals(this.type, resourcesNumberWebhookNotifApiDoc.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, status, numbers, requirementsFeedback, note, type);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class ResourcesNumberWebhookNotifApiDoc {")
                .append(newLine)
                .append("    id: ")
                .append(toIndentedString(id))
                .append(newLine)
                .append("    status: ")
                .append(toIndentedString(status))
                .append(newLine)
                .append("    numbers: ")
                .append(toIndentedString(numbers))
                .append(newLine)
                .append("    requirementsFeedback: ")
                .append(toIndentedString(requirementsFeedback))
                .append(newLine)
                .append("    note: ")
                .append(toIndentedString(note))
                .append(newLine)
                .append("    type: ")
                .append(toIndentedString(type))
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
