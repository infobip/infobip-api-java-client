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
 * Represents ResourcesRcsWebhookNotifApiDoc model.
 */
public class ResourcesRcsWebhookNotifApiDoc implements ResourcesWebhookNotifApiDocResultContent {

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
     * @return This {@link ResourcesRcsWebhookNotifApiDoc instance}.
     */
    public ResourcesRcsWebhookNotifApiDoc id(String id) {
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
     * @return This {@link ResourcesRcsWebhookNotifApiDoc instance}.
     */
    public ResourcesRcsWebhookNotifApiDoc status(StatusEnum status) {
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
     * Sets requirementsFeedback.
     * <p>
     * Field description:
     * Feedback for requirements. Present only for UPDATE_REQUESTED and UPDATE_REQUESTED_BY_INTERNAL_REVIEWER statuses.
     *
     * @param requirementsFeedback
     * @return This {@link ResourcesRcsWebhookNotifApiDoc instance}.
     */
    public ResourcesRcsWebhookNotifApiDoc requirementsFeedback(
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
     * @return This {@link ResourcesRcsWebhookNotifApiDoc instance}.
     */
    public ResourcesRcsWebhookNotifApiDoc addRequirementsFeedbackItem(
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
     * @return This {@link ResourcesRcsWebhookNotifApiDoc instance}.
     */
    public ResourcesRcsWebhookNotifApiDoc note(String note) {
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
     * @return This {@link ResourcesRcsWebhookNotifApiDoc instance}.
     */
    public ResourcesRcsWebhookNotifApiDoc type(ResourcesWebhookNotifContentType type) {
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
        ResourcesRcsWebhookNotifApiDoc resourcesRcsWebhookNotifApiDoc = (ResourcesRcsWebhookNotifApiDoc) o;
        return Objects.equals(this.id, resourcesRcsWebhookNotifApiDoc.id)
                && Objects.equals(this.status, resourcesRcsWebhookNotifApiDoc.status)
                && Objects.equals(this.requirementsFeedback, resourcesRcsWebhookNotifApiDoc.requirementsFeedback)
                && Objects.equals(this.note, resourcesRcsWebhookNotifApiDoc.note)
                && Objects.equals(this.type, resourcesRcsWebhookNotifApiDoc.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, status, requirementsFeedback, note, type);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class ResourcesRcsWebhookNotifApiDoc {")
                .append(newLine)
                .append("    id: ")
                .append(toIndentedString(id))
                .append(newLine)
                .append("    status: ")
                .append(toIndentedString(status))
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
