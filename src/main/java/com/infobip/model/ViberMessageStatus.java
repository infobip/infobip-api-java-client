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
 * Indicates the [status](https://www.infobip.com/docs/essentials/response-status-and-error-codes#api-status-codes) of the message and how to recover from an error should there be any.
 */
public class ViberMessageStatus {

    private Integer groupId;

    private ViberMessageGeneralStatus groupName;

    private Integer id;

    private String name;

    private String description;

    private String action;

    /**
     * Sets groupId.
     * <p>
     * Field description:
     * Status group ID.
     *
     * @param groupId
     * @return This {@link ViberMessageStatus instance}.
     */
    public ViberMessageStatus groupId(Integer groupId) {
        this.groupId = groupId;
        return this;
    }

    /**
     * Returns groupId.
     * <p>
     * Field description:
     * Status group ID.
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
     * Status group ID.
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
     * @return This {@link ViberMessageStatus instance}.
     */
    public ViberMessageStatus groupName(ViberMessageGeneralStatus groupName) {
        this.groupName = groupName;
        return this;
    }

    /**
     * Returns groupName.
     *
     * @return groupName
     */
    @JsonProperty("groupName")
    public ViberMessageGeneralStatus getGroupName() {
        return groupName;
    }

    /**
     * Sets groupName.
     *
     * @param groupName
     */
    @JsonProperty("groupName")
    public void setGroupName(ViberMessageGeneralStatus groupName) {
        this.groupName = groupName;
    }

    /**
     * Sets id.
     * <p>
     * Field description:
     * Status ID.
     *
     * @param id
     * @return This {@link ViberMessageStatus instance}.
     */
    public ViberMessageStatus id(Integer id) {
        this.id = id;
        return this;
    }

    /**
     * Returns id.
     * <p>
     * Field description:
     * Status ID.
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
     * Status ID.
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
     * [Status name](https://www.infobip.com/docs/essentials/response-status-and-error-codes#api-status-codes).
     *
     * @param name
     * @return This {@link ViberMessageStatus instance}.
     */
    public ViberMessageStatus name(String name) {
        this.name = name;
        return this;
    }

    /**
     * Returns name.
     * <p>
     * Field description:
     * [Status name](https://www.infobip.com/docs/essentials/response-status-and-error-codes#api-status-codes).
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
     * [Status name](https://www.infobip.com/docs/essentials/response-status-and-error-codes#api-status-codes).
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
     * Human-readable description of the status.
     *
     * @param description
     * @return This {@link ViberMessageStatus instance}.
     */
    public ViberMessageStatus description(String description) {
        this.description = description;
        return this;
    }

    /**
     * Returns description.
     * <p>
     * Field description:
     * Human-readable description of the status.
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
     * Human-readable description of the status.
     *
     * @param description
     */
    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Sets action.
     * <p>
     * Field description:
     * Action that should be taken to recover from the error.
     *
     * @param action
     * @return This {@link ViberMessageStatus instance}.
     */
    public ViberMessageStatus action(String action) {
        this.action = action;
        return this;
    }

    /**
     * Returns action.
     * <p>
     * Field description:
     * Action that should be taken to recover from the error.
     *
     * @return action
     */
    @JsonProperty("action")
    public String getAction() {
        return action;
    }

    /**
     * Sets action.
     * <p>
     * Field description:
     * Action that should be taken to recover from the error.
     *
     * @param action
     */
    @JsonProperty("action")
    public void setAction(String action) {
        this.action = action;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ViberMessageStatus viberMessageStatus = (ViberMessageStatus) o;
        return Objects.equals(this.groupId, viberMessageStatus.groupId)
                && Objects.equals(this.groupName, viberMessageStatus.groupName)
                && Objects.equals(this.id, viberMessageStatus.id)
                && Objects.equals(this.name, viberMessageStatus.name)
                && Objects.equals(this.description, viberMessageStatus.description)
                && Objects.equals(this.action, viberMessageStatus.action);
    }

    @Override
    public int hashCode() {
        return Objects.hash(groupId, groupName, id, name, description, action);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class ViberMessageStatus {")
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
                .append("    action: ")
                .append(toIndentedString(action))
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
