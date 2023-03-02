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
 * Indicates whether an error occurred during the query execution.
 */
public class SmsError {

    private Integer groupId;

    private String groupName;

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
     * @return This {@link SmsError instance}.
     */
    public SmsError groupId(Integer groupId) {
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
     * <p>
     * Field description:
     * Error group name.
     *
     * @param groupName
     * @return This {@link SmsError instance}.
     */
    public SmsError groupName(String groupName) {
        this.groupName = groupName;
        return this;
    }

    /**
     * Returns groupName.
     * <p>
     * Field description:
     * Error group name.
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
     * Error group name.
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
     * Error ID.
     *
     * @param id
     * @return This {@link SmsError instance}.
     */
    public SmsError id(Integer id) {
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
     * Error name.
     *
     * @param name
     * @return This {@link SmsError instance}.
     */
    public SmsError name(String name) {
        this.name = name;
        return this;
    }

    /**
     * Returns name.
     * <p>
     * Field description:
     * Error name.
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
     * Error name.
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
     * Human-readable description of the error..
     *
     * @param description
     * @return This {@link SmsError instance}.
     */
    public SmsError description(String description) {
        this.description = description;
        return this;
    }

    /**
     * Returns description.
     * <p>
     * Field description:
     * Human-readable description of the error..
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
     * Human-readable description of the error..
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
     * Tells if the error is permanent.
     *
     * @param permanent
     * @return This {@link SmsError instance}.
     */
    public SmsError permanent(Boolean permanent) {
        this.permanent = permanent;
        return this;
    }

    /**
     * Returns permanent.
     * <p>
     * Field description:
     * Tells if the error is permanent.
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
     * Tells if the error is permanent.
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
        SmsError smsError = (SmsError) o;
        return Objects.equals(this.groupId, smsError.groupId)
                && Objects.equals(this.groupName, smsError.groupName)
                && Objects.equals(this.id, smsError.id)
                && Objects.equals(this.name, smsError.name)
                && Objects.equals(this.description, smsError.description)
                && Objects.equals(this.permanent, smsError.permanent);
    }

    @Override
    public int hashCode() {
        return Objects.hash(groupId, groupName, id, name, description, permanent);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class SmsError {")
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
