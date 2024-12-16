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
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Represents FormsResponseContent model.
 */
public class FormsResponseContent {

    private String id;

    private String name;

    private List<FormsElement> elements = new ArrayList<>();

    private OffsetDateTime createdAt;

    private OffsetDateTime updatedAt;

    private FormsActionAfterSubmission actionAfterSubmission;

    private Boolean resubmitEnabled;

    private FormsType formType;

    private FormsStatus formStatus;

    /**
     * Sets id.
     * <p>
     * Field description:
     * Form identifier
     * <p>
     * The field is required.
     *
     * @param id
     * @return This {@link FormsResponseContent instance}.
     */
    public FormsResponseContent id(String id) {
        this.id = id;
        return this;
    }

    /**
     * Returns id.
     * <p>
     * Field description:
     * Form identifier
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
     * Form identifier
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
     * Sets name.
     * <p>
     * Field description:
     * Form name
     * <p>
     * The field is required.
     *
     * @param name
     * @return This {@link FormsResponseContent instance}.
     */
    public FormsResponseContent name(String name) {
        this.name = name;
        return this;
    }

    /**
     * Returns name.
     * <p>
     * Field description:
     * Form name
     * <p>
     * The field is required.
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
     * Form name
     * <p>
     * The field is required.
     *
     * @param name
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Sets elements.
     * <p>
     * Field description:
     * List of form fields
     * <p>
     * The field is required.
     *
     * @param elements
     * @return This {@link FormsResponseContent instance}.
     */
    public FormsResponseContent elements(List<FormsElement> elements) {
        this.elements = elements;
        return this;
    }

    /**
     * Adds and item into elements.
     * <p>
     * Field description:
     * List of form fields
     * <p>
     * The field is required.
     *
     * @param elementsItem The item to be added to the list.
     * @return This {@link FormsResponseContent instance}.
     */
    public FormsResponseContent addElementsItem(FormsElement elementsItem) {
        if (this.elements == null) {
            this.elements = new ArrayList<>();
        }
        this.elements.add(elementsItem);
        return this;
    }

    /**
     * Returns elements.
     * <p>
     * Field description:
     * List of form fields
     * <p>
     * The field is required.
     *
     * @return elements
     */
    @JsonProperty("elements")
    public List<FormsElement> getElements() {
        return elements;
    }

    /**
     * Sets elements.
     * <p>
     * Field description:
     * List of form fields
     * <p>
     * The field is required.
     *
     * @param elements
     */
    @JsonProperty("elements")
    public void setElements(List<FormsElement> elements) {
        this.elements = elements;
    }

    /**
     * Sets createdAt.
     * <p>
     * Field description:
     * Time when form was created
     *
     * @param createdAt
     * @return This {@link FormsResponseContent instance}.
     */
    public FormsResponseContent createdAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * Returns createdAt.
     * <p>
     * Field description:
     * Time when form was created
     *
     * @return createdAt
     */
    @JsonProperty("createdAt")
    public OffsetDateTime getCreatedAt() {
        return createdAt;
    }

    /**
     * Sets createdAt.
     * <p>
     * Field description:
     * Time when form was created
     *
     * @param createdAt
     */
    @JsonProperty("createdAt")
    public void setCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * Sets updatedAt.
     * <p>
     * Field description:
     * Time when form was update last time
     *
     * @param updatedAt
     * @return This {@link FormsResponseContent instance}.
     */
    public FormsResponseContent updatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * Returns updatedAt.
     * <p>
     * Field description:
     * Time when form was update last time
     *
     * @return updatedAt
     */
    @JsonProperty("updatedAt")
    public OffsetDateTime getUpdatedAt() {
        return updatedAt;
    }

    /**
     * Sets updatedAt.
     * <p>
     * Field description:
     * Time when form was update last time
     *
     * @param updatedAt
     */
    @JsonProperty("updatedAt")
    public void setUpdatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * Sets actionAfterSubmission.
     *
     * @param actionAfterSubmission
     * @return This {@link FormsResponseContent instance}.
     */
    public FormsResponseContent actionAfterSubmission(FormsActionAfterSubmission actionAfterSubmission) {
        this.actionAfterSubmission = actionAfterSubmission;
        return this;
    }

    /**
     * Returns actionAfterSubmission.
     *
     * @return actionAfterSubmission
     */
    @JsonProperty("actionAfterSubmission")
    public FormsActionAfterSubmission getActionAfterSubmission() {
        return actionAfterSubmission;
    }

    /**
     * Sets actionAfterSubmission.
     *
     * @param actionAfterSubmission
     */
    @JsonProperty("actionAfterSubmission")
    public void setActionAfterSubmission(FormsActionAfterSubmission actionAfterSubmission) {
        this.actionAfterSubmission = actionAfterSubmission;
    }

    /**
     * Sets resubmitEnabled.
     * <p>
     * Field description:
     * Can resubmit multiple times
     * <p>
     * The field is required.
     *
     * @param resubmitEnabled
     * @return This {@link FormsResponseContent instance}.
     */
    public FormsResponseContent resubmitEnabled(Boolean resubmitEnabled) {
        this.resubmitEnabled = resubmitEnabled;
        return this;
    }

    /**
     * Returns resubmitEnabled.
     * <p>
     * Field description:
     * Can resubmit multiple times
     * <p>
     * The field is required.
     *
     * @return resubmitEnabled
     */
    @JsonProperty("resubmitEnabled")
    public Boolean getResubmitEnabled() {
        return resubmitEnabled;
    }

    /**
     * Sets resubmitEnabled.
     * <p>
     * Field description:
     * Can resubmit multiple times
     * <p>
     * The field is required.
     *
     * @param resubmitEnabled
     */
    @JsonProperty("resubmitEnabled")
    public void setResubmitEnabled(Boolean resubmitEnabled) {
        this.resubmitEnabled = resubmitEnabled;
    }

    /**
     * Sets formType.
     * <p>
     * The field is required.
     *
     * @param formType
     * @return This {@link FormsResponseContent instance}.
     */
    public FormsResponseContent formType(FormsType formType) {
        this.formType = formType;
        return this;
    }

    /**
     * Returns formType.
     * <p>
     * The field is required.
     *
     * @return formType
     */
    @JsonProperty("formType")
    public FormsType getFormType() {
        return formType;
    }

    /**
     * Sets formType.
     * <p>
     * The field is required.
     *
     * @param formType
     */
    @JsonProperty("formType")
    public void setFormType(FormsType formType) {
        this.formType = formType;
    }

    /**
     * Sets formStatus.
     * <p>
     * The field is required.
     *
     * @param formStatus
     * @return This {@link FormsResponseContent instance}.
     */
    public FormsResponseContent formStatus(FormsStatus formStatus) {
        this.formStatus = formStatus;
        return this;
    }

    /**
     * Returns formStatus.
     * <p>
     * The field is required.
     *
     * @return formStatus
     */
    @JsonProperty("formStatus")
    public FormsStatus getFormStatus() {
        return formStatus;
    }

    /**
     * Sets formStatus.
     * <p>
     * The field is required.
     *
     * @param formStatus
     */
    @JsonProperty("formStatus")
    public void setFormStatus(FormsStatus formStatus) {
        this.formStatus = formStatus;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        FormsResponseContent formsResponseContent = (FormsResponseContent) o;
        return Objects.equals(this.id, formsResponseContent.id)
                && Objects.equals(this.name, formsResponseContent.name)
                && Objects.equals(this.elements, formsResponseContent.elements)
                && Objects.equals(this.createdAt, formsResponseContent.createdAt)
                && Objects.equals(this.updatedAt, formsResponseContent.updatedAt)
                && Objects.equals(this.actionAfterSubmission, formsResponseContent.actionAfterSubmission)
                && Objects.equals(this.resubmitEnabled, formsResponseContent.resubmitEnabled)
                && Objects.equals(this.formType, formsResponseContent.formType)
                && Objects.equals(this.formStatus, formsResponseContent.formStatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                id, name, elements, createdAt, updatedAt, actionAfterSubmission, resubmitEnabled, formType, formStatus);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class FormsResponseContent {")
                .append(newLine)
                .append("    id: ")
                .append(toIndentedString(id))
                .append(newLine)
                .append("    name: ")
                .append(toIndentedString(name))
                .append(newLine)
                .append("    elements: ")
                .append(toIndentedString(elements))
                .append(newLine)
                .append("    createdAt: ")
                .append(toIndentedString(createdAt))
                .append(newLine)
                .append("    updatedAt: ")
                .append(toIndentedString(updatedAt))
                .append(newLine)
                .append("    actionAfterSubmission: ")
                .append(toIndentedString(actionAfterSubmission))
                .append(newLine)
                .append("    resubmitEnabled: ")
                .append(toIndentedString(resubmitEnabled))
                .append(newLine)
                .append("    formType: ")
                .append(toIndentedString(formType))
                .append(newLine)
                .append("    formStatus: ")
                .append(toIndentedString(formStatus))
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
