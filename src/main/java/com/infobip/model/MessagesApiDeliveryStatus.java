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
 * Messaged status.
 */
public class MessagesApiDeliveryStatus {

    private Integer groupId;

    private String groupName;

    private Integer id;

    private String name;

    private String description;

    /**
     * Sets groupId.
     * <p>
     * Field description:
     * Status group.
     * <p>
     * The field is required.
     *
     * @param groupId
     * @return This {@link MessagesApiDeliveryStatus instance}.
     */
    public MessagesApiDeliveryStatus groupId(Integer groupId) {
        this.groupId = groupId;
        return this;
    }

    /**
     * Returns groupId.
     * <p>
     * Field description:
     * Status group.
     * <p>
     * The field is required.
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
     * Status group.
     * <p>
     * The field is required.
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
     * <p>
     * The field is required.
     *
     * @param groupName
     * @return This {@link MessagesApiDeliveryStatus instance}.
     */
    public MessagesApiDeliveryStatus groupName(String groupName) {
        this.groupName = groupName;
        return this;
    }

    /**
     * Returns groupName.
     * <p>
     * Field description:
     * Status group name.
     * <p>
     * The field is required.
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
     * <p>
     * The field is required.
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
     * <p>
     * The field is required.
     *
     * @param id
     * @return This {@link MessagesApiDeliveryStatus instance}.
     */
    public MessagesApiDeliveryStatus id(Integer id) {
        this.id = id;
        return this;
    }

    /**
     * Returns id.
     * <p>
     * Field description:
     * Status ID.
     * <p>
     * The field is required.
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
     * <p>
     * The field is required.
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
     * <p>
     * The field is required.
     *
     * @param name
     * @return This {@link MessagesApiDeliveryStatus instance}.
     */
    public MessagesApiDeliveryStatus name(String name) {
        this.name = name;
        return this;
    }

    /**
     * Returns name.
     * <p>
     * Field description:
     * Status name.
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
     * Status name.
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
     * Sets description.
     * <p>
     * Field description:
     * Human-readable description of the status.
     * <p>
     * The field is required.
     *
     * @param description
     * @return This {@link MessagesApiDeliveryStatus instance}.
     */
    public MessagesApiDeliveryStatus description(String description) {
        this.description = description;
        return this;
    }

    /**
     * Returns description.
     * <p>
     * Field description:
     * Human-readable description of the status.
     * <p>
     * The field is required.
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
     * <p>
     * The field is required.
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
        MessagesApiDeliveryStatus messagesApiDeliveryStatus = (MessagesApiDeliveryStatus) o;
        return Objects.equals(this.groupId, messagesApiDeliveryStatus.groupId)
                && Objects.equals(this.groupName, messagesApiDeliveryStatus.groupName)
                && Objects.equals(this.id, messagesApiDeliveryStatus.id)
                && Objects.equals(this.name, messagesApiDeliveryStatus.name)
                && Objects.equals(this.description, messagesApiDeliveryStatus.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(groupId, groupName, id, name, description);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class MessagesApiDeliveryStatus {")
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
