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
 * Section&#39;s list.
 */
public class MessagesApiMessageListSection {

    private String sectionTitle;

    private Boolean multipleSelection;

    private List<MessagesApiMessageListItem> items = null;

    /**
     * Sets sectionTitle.
     * <p>
     * Field description:
     * Section&#39;s title
     * <p>
     * The field is required.
     *
     * @param sectionTitle
     * @return This {@link MessagesApiMessageListSection instance}.
     */
    public MessagesApiMessageListSection sectionTitle(String sectionTitle) {
        this.sectionTitle = sectionTitle;
        return this;
    }

    /**
     * Returns sectionTitle.
     * <p>
     * Field description:
     * Section&#39;s title
     * <p>
     * The field is required.
     *
     * @return sectionTitle
     */
    @JsonProperty("sectionTitle")
    public String getSectionTitle() {
        return sectionTitle;
    }

    /**
     * Sets sectionTitle.
     * <p>
     * Field description:
     * Section&#39;s title
     * <p>
     * The field is required.
     *
     * @param sectionTitle
     */
    @JsonProperty("sectionTitle")
    public void setSectionTitle(String sectionTitle) {
        this.sectionTitle = sectionTitle;
    }

    /**
     * Sets multipleSelection.
     * <p>
     * Field description:
     * Multiple Selection.
     *
     * @param multipleSelection
     * @return This {@link MessagesApiMessageListSection instance}.
     */
    public MessagesApiMessageListSection multipleSelection(Boolean multipleSelection) {
        this.multipleSelection = multipleSelection;
        return this;
    }

    /**
     * Returns multipleSelection.
     * <p>
     * Field description:
     * Multiple Selection.
     *
     * @return multipleSelection
     */
    @JsonProperty("multipleSelection")
    public Boolean getMultipleSelection() {
        return multipleSelection;
    }

    /**
     * Sets multipleSelection.
     * <p>
     * Field description:
     * Multiple Selection.
     *
     * @param multipleSelection
     */
    @JsonProperty("multipleSelection")
    public void setMultipleSelection(Boolean multipleSelection) {
        this.multipleSelection = multipleSelection;
    }

    /**
     * Sets items.
     * <p>
     * Field description:
     * List Items.
     *
     * @param items
     * @return This {@link MessagesApiMessageListSection instance}.
     */
    public MessagesApiMessageListSection items(List<MessagesApiMessageListItem> items) {
        this.items = items;
        return this;
    }

    /**
     * Adds and item into items.
     * <p>
     * Field description:
     * List Items.
     *
     * @param itemsItem The item to be added to the list.
     * @return This {@link MessagesApiMessageListSection instance}.
     */
    public MessagesApiMessageListSection addItemsItem(MessagesApiMessageListItem itemsItem) {
        if (this.items == null) {
            this.items = new ArrayList<>();
        }
        this.items.add(itemsItem);
        return this;
    }

    /**
     * Returns items.
     * <p>
     * Field description:
     * List Items.
     *
     * @return items
     */
    @JsonProperty("items")
    public List<MessagesApiMessageListItem> getItems() {
        return items;
    }

    /**
     * Sets items.
     * <p>
     * Field description:
     * List Items.
     *
     * @param items
     */
    @JsonProperty("items")
    public void setItems(List<MessagesApiMessageListItem> items) {
        this.items = items;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MessagesApiMessageListSection messagesApiMessageListSection = (MessagesApiMessageListSection) o;
        return Objects.equals(this.sectionTitle, messagesApiMessageListSection.sectionTitle)
                && Objects.equals(this.multipleSelection, messagesApiMessageListSection.multipleSelection)
                && Objects.equals(this.items, messagesApiMessageListSection.items);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sectionTitle, multipleSelection, items);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class MessagesApiMessageListSection {")
                .append(newLine)
                .append("    sectionTitle: ")
                .append(toIndentedString(sectionTitle))
                .append(newLine)
                .append("    multipleSelection: ")
                .append(toIndentedString(multipleSelection))
                .append(newLine)
                .append("    items: ")
                .append(toIndentedString(items))
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
