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
 * Represents MessagesApiMessageSelectFormPage model.
 */
public class MessagesApiMessageSelectFormPage extends MessagesApiMessageFormPage {

    private String title;

    private String text;

    private String pageIdentifier;

    private String nextPageIdentifier;

    private List<MessagesApiMessageFormSelectPageItem> items = new ArrayList<>();

    private Boolean submitForm;

    private Boolean multipleSelection;

    /**
     * Constructs a new {@link MessagesApiMessageSelectFormPage} instance.
     */
    public MessagesApiMessageSelectFormPage() {
        super("SELECT");
    }

    /**
     * Sets title.
     * <p>
     * Field description:
     * Title of the page.
     *
     * @param title
     * @return This {@link MessagesApiMessageSelectFormPage instance}.
     */
    public MessagesApiMessageSelectFormPage title(String title) {
        this.title = title;
        return this;
    }

    /**
     * Returns title.
     * <p>
     * Field description:
     * Title of the page.
     *
     * @return title
     */
    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    /**
     * Sets title.
     * <p>
     * Field description:
     * Title of the page.
     *
     * @param title
     */
    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Sets text.
     * <p>
     * Field description:
     * Text of the page.
     * <p>
     * The field is required.
     *
     * @param text
     * @return This {@link MessagesApiMessageSelectFormPage instance}.
     */
    public MessagesApiMessageSelectFormPage text(String text) {
        this.text = text;
        return this;
    }

    /**
     * Returns text.
     * <p>
     * Field description:
     * Text of the page.
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
     * Text of the page.
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
     * Sets pageIdentifier.
     * <p>
     * Field description:
     * Unique identifier of the page.
     * <p>
     * The field is required.
     *
     * @param pageIdentifier
     * @return This {@link MessagesApiMessageSelectFormPage instance}.
     */
    public MessagesApiMessageSelectFormPage pageIdentifier(String pageIdentifier) {
        this.pageIdentifier = pageIdentifier;
        return this;
    }

    /**
     * Returns pageIdentifier.
     * <p>
     * Field description:
     * Unique identifier of the page.
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
     * Unique identifier of the page.
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
     * Sets nextPageIdentifier.
     * <p>
     * Field description:
     * Identifier of the next page. If not set, the client assumes the current page to be the final page.
     *
     * @param nextPageIdentifier
     * @return This {@link MessagesApiMessageSelectFormPage instance}.
     */
    public MessagesApiMessageSelectFormPage nextPageIdentifier(String nextPageIdentifier) {
        this.nextPageIdentifier = nextPageIdentifier;
        return this;
    }

    /**
     * Returns nextPageIdentifier.
     * <p>
     * Field description:
     * Identifier of the next page. If not set, the client assumes the current page to be the final page.
     *
     * @return nextPageIdentifier
     */
    @JsonProperty("nextPageIdentifier")
    public String getNextPageIdentifier() {
        return nextPageIdentifier;
    }

    /**
     * Sets nextPageIdentifier.
     * <p>
     * Field description:
     * Identifier of the next page. If not set, the client assumes the current page to be the final page.
     *
     * @param nextPageIdentifier
     */
    @JsonProperty("nextPageIdentifier")
    public void setNextPageIdentifier(String nextPageIdentifier) {
        this.nextPageIdentifier = nextPageIdentifier;
    }

    /**
     * Sets items.
     * <p>
     * Field description:
     * An array of objects defining the user experience.
     * <p>
     * The field is required.
     *
     * @param items
     * @return This {@link MessagesApiMessageSelectFormPage instance}.
     */
    public MessagesApiMessageSelectFormPage items(List<MessagesApiMessageFormSelectPageItem> items) {
        this.items = items;
        return this;
    }

    /**
     * Adds and item into items.
     * <p>
     * Field description:
     * An array of objects defining the user experience.
     * <p>
     * The field is required.
     *
     * @param itemsItem The item to be added to the list.
     * @return This {@link MessagesApiMessageSelectFormPage instance}.
     */
    public MessagesApiMessageSelectFormPage addItemsItem(MessagesApiMessageFormSelectPageItem itemsItem) {
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
     * An array of objects defining the user experience.
     * <p>
     * The field is required.
     *
     * @return items
     */
    @JsonProperty("items")
    public List<MessagesApiMessageFormSelectPageItem> getItems() {
        return items;
    }

    /**
     * Sets items.
     * <p>
     * Field description:
     * An array of objects defining the user experience.
     * <p>
     * The field is required.
     *
     * @param items
     */
    @JsonProperty("items")
    public void setItems(List<MessagesApiMessageFormSelectPageItem> items) {
        this.items = items;
    }

    /**
     * Sets submitForm.
     * <p>
     * Field description:
     * Placed on the pages to denote the end page of the form. Can be set on multiple pages.
     *
     * @param submitForm
     * @return This {@link MessagesApiMessageSelectFormPage instance}.
     */
    public MessagesApiMessageSelectFormPage submitForm(Boolean submitForm) {
        this.submitForm = submitForm;
        return this;
    }

    /**
     * Returns submitForm.
     * <p>
     * Field description:
     * Placed on the pages to denote the end page of the form. Can be set on multiple pages.
     *
     * @return submitForm
     */
    @JsonProperty("submitForm")
    public Boolean getSubmitForm() {
        return submitForm;
    }

    /**
     * Sets submitForm.
     * <p>
     * Field description:
     * Placed on the pages to denote the end page of the form. Can be set on multiple pages.
     *
     * @param submitForm
     */
    @JsonProperty("submitForm")
    public void setSubmitForm(Boolean submitForm) {
        this.submitForm = submitForm;
    }

    /**
     * Sets multipleSelection.
     * <p>
     * Field description:
     * Enables multiple selection for the page.
     *
     * @param multipleSelection
     * @return This {@link MessagesApiMessageSelectFormPage instance}.
     */
    public MessagesApiMessageSelectFormPage multipleSelection(Boolean multipleSelection) {
        this.multipleSelection = multipleSelection;
        return this;
    }

    /**
     * Returns multipleSelection.
     * <p>
     * Field description:
     * Enables multiple selection for the page.
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
     * Enables multiple selection for the page.
     *
     * @param multipleSelection
     */
    @JsonProperty("multipleSelection")
    public void setMultipleSelection(Boolean multipleSelection) {
        this.multipleSelection = multipleSelection;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MessagesApiMessageSelectFormPage messagesApiMessageSelectFormPage = (MessagesApiMessageSelectFormPage) o;
        return Objects.equals(this.title, messagesApiMessageSelectFormPage.title)
                && Objects.equals(this.text, messagesApiMessageSelectFormPage.text)
                && Objects.equals(this.pageIdentifier, messagesApiMessageSelectFormPage.pageIdentifier)
                && Objects.equals(this.nextPageIdentifier, messagesApiMessageSelectFormPage.nextPageIdentifier)
                && Objects.equals(this.items, messagesApiMessageSelectFormPage.items)
                && Objects.equals(this.submitForm, messagesApiMessageSelectFormPage.submitForm)
                && Objects.equals(this.multipleSelection, messagesApiMessageSelectFormPage.multipleSelection)
                && super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                title,
                text,
                pageIdentifier,
                nextPageIdentifier,
                items,
                submitForm,
                multipleSelection,
                super.hashCode());
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class MessagesApiMessageSelectFormPage {")
                .append(newLine)
                .append("    ")
                .append(toIndentedString(super.toString()))
                .append(newLine)
                .append("    title: ")
                .append(toIndentedString(title))
                .append(newLine)
                .append("    text: ")
                .append(toIndentedString(text))
                .append(newLine)
                .append("    pageIdentifier: ")
                .append(toIndentedString(pageIdentifier))
                .append(newLine)
                .append("    nextPageIdentifier: ")
                .append(toIndentedString(nextPageIdentifier))
                .append(newLine)
                .append("    items: ")
                .append(toIndentedString(items))
                .append(newLine)
                .append("    submitForm: ")
                .append(toIndentedString(submitForm))
                .append(newLine)
                .append("    multipleSelection: ")
                .append(toIndentedString(multipleSelection))
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
