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
 * Represents CallsDialToConversationsOptions model.
 */
public class CallsDialToConversationsOptions {

    private CallsTagIdentifierType tagIdentifierType;

    private List<String> tags = new ArrayList<>();

    /**
     * Sets tagIdentifierType.
     *
     * @param tagIdentifierType
     * @return This {@link CallsDialToConversationsOptions instance}.
     */
    public CallsDialToConversationsOptions tagIdentifierType(CallsTagIdentifierType tagIdentifierType) {
        this.tagIdentifierType = tagIdentifierType;
        return this;
    }

    /**
     * Returns tagIdentifierType.
     *
     * @return tagIdentifierType
     */
    @JsonProperty("tagIdentifierType")
    public CallsTagIdentifierType getTagIdentifierType() {
        return tagIdentifierType;
    }

    /**
     * Sets tagIdentifierType.
     *
     * @param tagIdentifierType
     */
    @JsonProperty("tagIdentifierType")
    public void setTagIdentifierType(CallsTagIdentifierType tagIdentifierType) {
        this.tagIdentifierType = tagIdentifierType;
    }

    /**
     * Sets tags.
     * <p>
     * Field description:
     * An array of [conversation tag](https://www.infobip.com/docs/conversations/get-to-know-conversations#tags-templates-and-tags) names or ids that are assigned to this conversation for better categorization of the topics or customer intent. Value can be an array of tag names/ids, empty array, or null value.
     * <p>
     * The field is required.
     *
     * @param tags
     * @return This {@link CallsDialToConversationsOptions instance}.
     */
    public CallsDialToConversationsOptions tags(List<String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * Adds and item into tags.
     * <p>
     * Field description:
     * An array of [conversation tag](https://www.infobip.com/docs/conversations/get-to-know-conversations#tags-templates-and-tags) names or ids that are assigned to this conversation for better categorization of the topics or customer intent. Value can be an array of tag names/ids, empty array, or null value.
     * <p>
     * The field is required.
     *
     * @param tagsItem The item to be added to the list.
     * @return This {@link CallsDialToConversationsOptions instance}.
     */
    public CallsDialToConversationsOptions addTagsItem(String tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    /**
     * Returns tags.
     * <p>
     * Field description:
     * An array of [conversation tag](https://www.infobip.com/docs/conversations/get-to-know-conversations#tags-templates-and-tags) names or ids that are assigned to this conversation for better categorization of the topics or customer intent. Value can be an array of tag names/ids, empty array, or null value.
     * <p>
     * The field is required.
     *
     * @return tags
     */
    @JsonProperty("tags")
    public List<String> getTags() {
        return tags;
    }

    /**
     * Sets tags.
     * <p>
     * Field description:
     * An array of [conversation tag](https://www.infobip.com/docs/conversations/get-to-know-conversations#tags-templates-and-tags) names or ids that are assigned to this conversation for better categorization of the topics or customer intent. Value can be an array of tag names/ids, empty array, or null value.
     * <p>
     * The field is required.
     *
     * @param tags
     */
    @JsonProperty("tags")
    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CallsDialToConversationsOptions callsDialToConversationsOptions = (CallsDialToConversationsOptions) o;
        return Objects.equals(this.tagIdentifierType, callsDialToConversationsOptions.tagIdentifierType)
                && Objects.equals(this.tags, callsDialToConversationsOptions.tags);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tagIdentifierType, tags);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class CallsDialToConversationsOptions {")
                .append(newLine)
                .append("    tagIdentifierType: ")
                .append(toIndentedString(tagIdentifierType))
                .append(newLine)
                .append("    tags: ")
                .append(toIndentedString(tags))
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
