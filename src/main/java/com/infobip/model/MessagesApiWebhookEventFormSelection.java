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
 * List of user responses.
 */
public class MessagesApiWebhookEventFormSelection {

    private MessagesApiWebhookEventFormSelectionType type;

    private String pageIdentifier;

    private String text;

    private List<MessagesApiWebhookEventFormItem> items = new ArrayList<>();

    /**
     * Sets type.
     * <p>
     * The field is required.
     *
     * @param type
     * @return This {@link MessagesApiWebhookEventFormSelection instance}.
     */
    public MessagesApiWebhookEventFormSelection type(MessagesApiWebhookEventFormSelectionType type) {
        this.type = type;
        return this;
    }

    /**
     * Returns type.
     * <p>
     * The field is required.
     *
     * @return type
     */
    @JsonProperty("type")
    public MessagesApiWebhookEventFormSelectionType getType() {
        return type;
    }

    /**
     * Sets type.
     * <p>
     * The field is required.
     *
     * @param type
     */
    @JsonProperty("type")
    public void setType(MessagesApiWebhookEventFormSelectionType type) {
        this.type = type;
    }

    /**
     * Sets pageIdentifier.
     * <p>
     * Field description:
     * Identifier of the form page where the selection was made.
     * <p>
     * The field is required.
     *
     * @param pageIdentifier
     * @return This {@link MessagesApiWebhookEventFormSelection instance}.
     */
    public MessagesApiWebhookEventFormSelection pageIdentifier(String pageIdentifier) {
        this.pageIdentifier = pageIdentifier;
        return this;
    }

    /**
     * Returns pageIdentifier.
     * <p>
     * Field description:
     * Identifier of the form page where the selection was made.
     * <p>
     * The field is required.
     *
     * @return pageIdentifier
     */
    @JsonProperty("pageIdentifier")
    public String getPageIdentifier() {
        return pageIdentifier;
    }

    /**
     * Sets pageIdentifier.
     * <p>
     * Field description:
     * Identifier of the form page where the selection was made.
     * <p>
     * The field is required.
     *
     * @param pageIdentifier
     */
    @JsonProperty("pageIdentifier")
    public void setPageIdentifier(String pageIdentifier) {
        this.pageIdentifier = pageIdentifier;
    }

    /**
     * Sets text.
     * <p>
     * Field description:
     * Text of selection.
     * <p>
     * The field is required.
     *
     * @param text
     * @return This {@link MessagesApiWebhookEventFormSelection instance}.
     */
    public MessagesApiWebhookEventFormSelection text(String text) {
        this.text = text;
        return this;
    }

    /**
     * Returns text.
     * <p>
     * Field description:
     * Text of selection.
     * <p>
     * The field is required.
     *
     * @return text
     */
    @JsonProperty("text")
    public String getText() {
        return text;
    }

    /**
     * Sets text.
     * <p>
     * Field description:
     * Text of selection.
     * <p>
     * The field is required.
     *
     * @param text
     */
    @JsonProperty("text")
    public void setText(String text) {
        this.text = text;
    }

    /**
     * Sets items.
     * <p>
     * Field description:
     * List of selected items or values provided by the user for this form selection.
     * <p>
     * The field is required.
     *
     * @param items
     * @return This {@link MessagesApiWebhookEventFormSelection instance}.
     */
    public MessagesApiWebhookEventFormSelection items(List<MessagesApiWebhookEventFormItem> items) {
        this.items = items;
        return this;
    }

    /**
     * Adds and item into items.
     * <p>
     * Field description:
     * List of selected items or values provided by the user for this form selection.
     * <p>
     * The field is required.
     *
     * @param itemsItem The item to be added to the list.
     * @return This {@link MessagesApiWebhookEventFormSelection instance}.
     */
    public MessagesApiWebhookEventFormSelection addItemsItem(MessagesApiWebhookEventFormItem itemsItem) {
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
     * List of selected items or values provided by the user for this form selection.
     * <p>
     * The field is required.
     *
     * @return items
     */
    @JsonProperty("items")
    public List<MessagesApiWebhookEventFormItem> getItems() {
        return items;
    }

    /**
     * Sets items.
     * <p>
     * Field description:
     * List of selected items or values provided by the user for this form selection.
     * <p>
     * The field is required.
     *
     * @param items
     */
    @JsonProperty("items")
    public void setItems(List<MessagesApiWebhookEventFormItem> items) {
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
        MessagesApiWebhookEventFormSelection messagesApiWebhookEventFormSelection =
                (MessagesApiWebhookEventFormSelection) o;
        return Objects.equals(this.type, messagesApiWebhookEventFormSelection.type)
                && Objects.equals(this.pageIdentifier, messagesApiWebhookEventFormSelection.pageIdentifier)
                && Objects.equals(this.text, messagesApiWebhookEventFormSelection.text)
                && Objects.equals(this.items, messagesApiWebhookEventFormSelection.items);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, pageIdentifier, text, items);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class MessagesApiWebhookEventFormSelection {")
                .append(newLine)
                .append("    type: ")
                .append(toIndentedString(type))
                .append(newLine)
                .append("    pageIdentifier: ")
                .append(toIndentedString(pageIdentifier))
                .append(newLine)
                .append("    text: ")
                .append(toIndentedString(text))
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
