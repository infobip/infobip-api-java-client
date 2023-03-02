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
public class SmsStatus {

    private Integer groupId;

    private String groupName;

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
     * @return This {@link SmsStatus instance}.
     */
    public SmsStatus groupId(Integer groupId) {
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
     * <p>
     * Field description:
     * Status group name that describes which category the status code belongs to, e.g. PENDING, UNDELIVERABLE, DELIVERED, EXPIRED, REJECTED.
     *
     * @param groupName
     * @return This {@link SmsStatus instance}.
     */
    public SmsStatus groupName(String groupName) {
        this.groupName = groupName;
        return this;
    }

    /**
     * Returns groupName.
     * <p>
     * Field description:
     * Status group name that describes which category the status code belongs to, e.g. PENDING, UNDELIVERABLE, DELIVERED, EXPIRED, REJECTED.
     *
     * @return groupName
     */
    @JsonProperty("groupName")
    public String getGroupName() {
        return groupName;
    }

    /**
     * Sets groupName.
     * <p>
     * Field description:
     * Status group name that describes which category the status code belongs to, e.g. PENDING, UNDELIVERABLE, DELIVERED, EXPIRED, REJECTED.
     *
     * @param groupName
     */
    @JsonProperty("groupName")
    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    /**
     * Sets id.
     * <p>
     * Field description:
     * Status ID.
     *
     * @param id
     * @return This {@link SmsStatus instance}.
     */
    public SmsStatus id(Integer id) {
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
     * [Status name](https://www.infobip.com/docs/essentials/response-status-and-error-codes).
     *
     * @param name
     * @return This {@link SmsStatus instance}.
     */
    public SmsStatus name(String name) {
        this.name = name;
        return this;
    }

    /**
     * Returns name.
     * <p>
     * Field description:
     * [Status name](https://www.infobip.com/docs/essentials/response-status-and-error-codes).
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
     * [Status name](https://www.infobip.com/docs/essentials/response-status-and-error-codes).
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
     * @return This {@link SmsStatus instance}.
     */
    public SmsStatus description(String description) {
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
     * @return This {@link SmsStatus instance}.
     */
    public SmsStatus action(String action) {
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
        SmsStatus smsStatus = (SmsStatus) o;
        return Objects.equals(this.groupId, smsStatus.groupId)
                && Objects.equals(this.groupName, smsStatus.groupName)
                && Objects.equals(this.id, smsStatus.id)
                && Objects.equals(this.name, smsStatus.name)
                && Objects.equals(this.description, smsStatus.description)
                && Objects.equals(this.action, smsStatus.action);
    }

    @Override
    public int hashCode() {
        return Objects.hash(groupId, groupName, id, name, description, action);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class SmsStatus {")
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
