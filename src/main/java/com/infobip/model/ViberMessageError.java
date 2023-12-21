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
import java.util.Objects;

/**
 * Indicates whether an [error](https://www.infobip.com/docs/essentials/response-status-and-error-codes#error-codes) occurred during the query execution.
 */
public class ViberMessageError {

    private Integer groupId;

    private ViberMessageErrorGroup groupName;

    private Integer id;

    private String name;

    private String description;

    private Boolean permanent;

    /**
     * Sets groupId.
     * <p>
     * Field description:
     * Error group ID.
     *
     * @param groupId
     * @return This {@link ViberMessageError instance}.
     */
    public ViberMessageError groupId(Integer groupId) {
        this.groupId = groupId;
        return this;
    }

    /**
     * Returns groupId.
     * <p>
     * Field description:
     * Error group ID.
     *
     * @return groupId
     */
    @JsonProperty("groupId")
    public Integer getGroupId() {
        return groupId;
    }

    /**
     * Sets groupId.
     * <p>
     * Field description:
     * Error group ID.
     *
     * @param groupId
     */
    @JsonProperty("groupId")
    public void setGroupId(Integer groupId) {
        this.groupId = groupId;
    }

    /**
     * Sets groupName.
     *
     * @param groupName
     * @return This {@link ViberMessageError instance}.
     */
    public ViberMessageError groupName(ViberMessageErrorGroup groupName) {
        this.groupName = groupName;
        return this;
    }

    /**
     * Returns groupName.
     *
     * @return groupName
     */
    @JsonProperty("groupName")
    public ViberMessageErrorGroup getGroupName() {
        return groupName;
    }

    /**
     * Sets groupName.
     *
     * @param groupName
     */
    @JsonProperty("groupName")
    public void setGroupName(ViberMessageErrorGroup groupName) {
        this.groupName = groupName;
    }

    /**
     * Sets id.
     * <p>
     * Field description:
     * Error ID.
     *
     * @param id
     * @return This {@link ViberMessageError instance}.
     */
    public ViberMessageError id(Integer id) {
        this.id = id;
        return this;
    }

    /**
     * Returns id.
     * <p>
     * Field description:
     * Error ID.
     *
     * @return id
     */
    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

    /**
     * Sets id.
     * <p>
     * Field description:
     * Error ID.
     *
     * @param id
     */
    @JsonProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * Sets name.
     * <p>
     * Field description:
     * [Error name](https://www.infobip.com/docs/essentials/response-status-and-error-codes#error-codes).
     *
     * @param name
     * @return This {@link ViberMessageError instance}.
     */
    public ViberMessageError name(String name) {
        this.name = name;
        return this;
    }

    /**
     * Returns name.
     * <p>
     * Field description:
     * [Error name](https://www.infobip.com/docs/essentials/response-status-and-error-codes#error-codes).
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
     * [Error name](https://www.infobip.com/docs/essentials/response-status-and-error-codes#error-codes).
     *
     * @param name
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Sets description.
     * <p>
     * Field description:
     * Human-readable description of the error.
     *
     * @param description
     * @return This {@link ViberMessageError instance}.
     */
    public ViberMessageError description(String description) {
        this.description = description;
        return this;
    }

    /**
     * Returns description.
     * <p>
     * Field description:
     * Human-readable description of the error.
     *
     * @return description
     */
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    /**
     * Sets description.
     * <p>
     * Field description:
     * Human-readable description of the error.
     *
     * @param description
     */
    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Sets permanent.
     * <p>
     * Field description:
     * Indicates whether the error is recoverable or not.
     *
     * @param permanent
     * @return This {@link ViberMessageError instance}.
     */
    public ViberMessageError permanent(Boolean permanent) {
        this.permanent = permanent;
        return this;
    }

    /**
     * Returns permanent.
     * <p>
     * Field description:
     * Indicates whether the error is recoverable or not.
     *
     * @return permanent
     */
    @JsonProperty("permanent")
    public Boolean getPermanent() {
        return permanent;
    }

    /**
     * Sets permanent.
     * <p>
     * Field description:
     * Indicates whether the error is recoverable or not.
     *
     * @param permanent
     */
    @JsonProperty("permanent")
    public void setPermanent(Boolean permanent) {
        this.permanent = permanent;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ViberMessageError viberMessageError = (ViberMessageError) o;
        return Objects.equals(this.groupId, viberMessageError.groupId)
                && Objects.equals(this.groupName, viberMessageError.groupName)
                && Objects.equals(this.id, viberMessageError.id)
                && Objects.equals(this.name, viberMessageError.name)
                && Objects.equals(this.description, viberMessageError.description)
                && Objects.equals(this.permanent, viberMessageError.permanent);
    }

    @Override
    public int hashCode() {
        return Objects.hash(groupId, groupName, id, name, description, permanent);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class ViberMessageError {")
                .append(newLine)
                .append("    groupId: ")
                .append(toIndentedString(groupId))
                .append(newLine)
                .append("    groupName: ")
                .append(toIndentedString(groupName))
                .append(newLine)
                .append("    id: ")
                .append(toIndentedString(id))
                .append(newLine)
                .append("    name: ")
                .append(toIndentedString(name))
                .append(newLine)
                .append("    description: ")
                .append(toIndentedString(description))
                .append(newLine)
                .append("    permanent: ")
                .append(toIndentedString(permanent))
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
