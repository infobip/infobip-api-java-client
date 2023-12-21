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
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * An array of destination objects for where messages are being sent. A valid destination is required.
 */
public class MmsDestination {

    private String messageId;

    private String to;

    private List<MmsDestinationSingle> group = new ArrayList<>();

    /**
     * Sets messageId.
     * <p>
     * Field description:
     * The ID that uniquely identifies the message sent.
     *
     * @param messageId
     * @return This {@link MmsDestination instance}.
     */
    public MmsDestination messageId(String messageId) {
        this.messageId = messageId;
        return this;
    }

    /**
     * Returns messageId.
     * <p>
     * Field description:
     * The ID that uniquely identifies the message sent.
     *
     * @return messageId
     */
    @JsonProperty("messageId")
    public String getMessageId() {
        return messageId;
    }

    /**
     * Sets messageId.
     * <p>
     * Field description:
     * The ID that uniquely identifies the message sent.
     *
     * @param messageId
     */
    @JsonProperty("messageId")
    public void setMessageId(String messageId) {
        this.messageId = messageId;
    }

    /**
     * Sets to.
     * <p>
     * Field description:
     * Message destination address. Addresses must be in international format (Example: &#x60;41793026727&#x60;).
     * <p>
     * The field is required.
     *
     * @param to
     * @return This {@link MmsDestination instance}.
     */
    public MmsDestination to(String to) {
        this.to = to;
        return this;
    }

    /**
     * Returns to.
     * <p>
     * Field description:
     * Message destination address. Addresses must be in international format (Example: &#x60;41793026727&#x60;).
     * <p>
     * The field is required.
     *
     * @return to
     */
    @JsonProperty("to")
    public String getTo() {
        return to;
    }

    /**
     * Sets to.
     * <p>
     * Field description:
     * Message destination address. Addresses must be in international format (Example: &#x60;41793026727&#x60;).
     * <p>
     * The field is required.
     *
     * @param to
     */
    @JsonProperty("to")
    public void setTo(String to) {
        this.to = to;
    }

    /**
     * Sets group.
     * <p>
     * The field is required.
     *
     * @param group
     * @return This {@link MmsDestination instance}.
     */
    public MmsDestination group(List<MmsDestinationSingle> group) {
        this.group = group;
        return this;
    }

    /**
     * Adds and item into group.
     * <p>
     * The field is required.
     *
     * @param groupItem The item to be added to the list.
     * @return This {@link MmsDestination instance}.
     */
    public MmsDestination addGroupItem(MmsDestinationSingle groupItem) {
        if (this.group == null) {
            this.group = new ArrayList<>();
        }
        this.group.add(groupItem);
        return this;
    }

    /**
     * Returns group.
     * <p>
     * The field is required.
     *
     * @return group
     */
    @JsonProperty("group")
    public List<MmsDestinationSingle> getGroup() {
        return group;
    }

    /**
     * Sets group.
     * <p>
     * The field is required.
     *
     * @param group
     */
    @JsonProperty("group")
    public void setGroup(List<MmsDestinationSingle> group) {
        this.group = group;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MmsDestination mmsDestination = (MmsDestination) o;
        return Objects.equals(this.messageId, mmsDestination.messageId)
                && Objects.equals(this.to, mmsDestination.to)
                && Objects.equals(this.group, mmsDestination.group);
    }

    @Override
    public int hashCode() {
        return Objects.hash(messageId, to, group);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class MmsDestination {")
                .append(newLine)
                .append("    messageId: ")
                .append(toIndentedString(messageId))
                .append(newLine)
                .append("    to: ")
                .append(toIndentedString(to))
                .append(newLine)
                .append("    group: ")
                .append(toIndentedString(group))
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
