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
 * Represents MessagesApiMessageMixedBody model.
 */
public class MessagesApiMessageMixedBody extends MessagesApiMessageBody {

    private List<MessagesApiMessageMixedItem> items = new ArrayList<>();

    /**
     * Constructs a new {@link MessagesApiMessageMixedBody} instance.
     */
    public MessagesApiMessageMixedBody() {
        super("MIXED");
    }

    /**
     * Sets items.
     * <p>
     * Field description:
     * Mixed items.
     * <p>
     * The field is required.
     *
     * @param items
     * @return This {@link MessagesApiMessageMixedBody instance}.
     */
    public MessagesApiMessageMixedBody items(List<MessagesApiMessageMixedItem> items) {
        this.items = items;
        return this;
    }

    /**
     * Adds and item into items.
     * <p>
     * Field description:
     * Mixed items.
     * <p>
     * The field is required.
     *
     * @param itemsItem The item to be added to the list.
     * @return This {@link MessagesApiMessageMixedBody instance}.
     */
    public MessagesApiMessageMixedBody addItemsItem(MessagesApiMessageMixedItem itemsItem) {
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
     * Mixed items.
     * <p>
     * The field is required.
     *
     * @return items
     */
    @JsonProperty("items")
    public List<MessagesApiMessageMixedItem> getItems() {
        return items;
    }

    /**
     * Sets items.
     * <p>
     * Field description:
     * Mixed items.
     * <p>
     * The field is required.
     *
     * @param items
     */
    @JsonProperty("items")
    public void setItems(List<MessagesApiMessageMixedItem> items) {
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
        MessagesApiMessageMixedBody messagesApiMessageMixedBody = (MessagesApiMessageMixedBody) o;
        return Objects.equals(this.items, messagesApiMessageMixedBody.items) && super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(items, super.hashCode());
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class MessagesApiMessageMixedBody {")
                .append(newLine)
                .append("    ")
                .append(toIndentedString(super.toString()))
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
