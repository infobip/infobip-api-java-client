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
 * Indicates the message status.
 */
public class EmailSingleMessageStatus {

    private Integer groupId;

    private String groupName;

    private Integer id;

    private String name;

    private String description;

    /**
     * Sets groupId.
     * <p>
     * Field description:
     * Status group ID.
     *
     * @param groupId
     * @return This {@link EmailSingleMessageStatus instance}.
     */
    public EmailSingleMessageStatus groupId(Integer groupId) {
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
     * Status group name.
     *
     * @param groupName
     * @return This {@link EmailSingleMessageStatus instance}.
     */
    public EmailSingleMessageStatus groupName(String groupName) {
        this.groupName = groupName;
        return this;
    }

    /**
     * Returns groupName.
     * <p>
     * Field description:
     * Status group name.
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
     * Status group name.
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
     * @return This {@link EmailSingleMessageStatus instance}.
     */
    public EmailSingleMessageStatus id(Integer id) {
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
     * Status name.
     *
     * @param name
     * @return This {@link EmailSingleMessageStatus instance}.
     */
    public EmailSingleMessageStatus name(String name) {
        this.name = name;
        return this;
    }

    /**
     * Returns name.
     * <p>
     * Field description:
     * Status name.
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
     * Status name.
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
     * Status description.
     *
     * @param description
     * @return This {@link EmailSingleMessageStatus instance}.
     */
    public EmailSingleMessageStatus description(String description) {
        this.description = description;
        return this;
    }

    /**
     * Returns description.
     * <p>
     * Field description:
     * Status description.
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
     * Status description.
     *
     * @param description
     */
    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        EmailSingleMessageStatus emailSingleMessageStatus = (EmailSingleMessageStatus) o;
        return Objects.equals(this.groupId, emailSingleMessageStatus.groupId)
                && Objects.equals(this.groupName, emailSingleMessageStatus.groupName)
                && Objects.equals(this.id, emailSingleMessageStatus.id)
                && Objects.equals(this.name, emailSingleMessageStatus.name)
                && Objects.equals(this.description, emailSingleMessageStatus.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(groupId, groupName, id, name, description);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class EmailSingleMessageStatus {")
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
