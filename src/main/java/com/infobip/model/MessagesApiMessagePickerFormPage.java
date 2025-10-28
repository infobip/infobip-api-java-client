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
 * Represents MessagesApiMessagePickerFormPage model.
 */
public class MessagesApiMessagePickerFormPage extends MessagesApiMessageFormPage {

    private String title;

    private String text;

    private String pageIdentifier;

    private String nextPageIdentifier;

    private List<MessagesApiMessageFormPickerPageItem> items = new ArrayList<>();

    private Boolean submitForm;

    private String subtext;

    private Integer selectedItemIndex;

    /**
     * Constructs a new {@link MessagesApiMessagePickerFormPage} instance.
     */
    public MessagesApiMessagePickerFormPage() {
        super("PICKER");
    }

    /**
     * Sets title.
     * <p>
     * Field description:
     * Title of the page.
     *
     * @param title
     * @return This {@link MessagesApiMessagePickerFormPage instance}.
     */
    public MessagesApiMessagePickerFormPage title(String title) {
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
     * @return This {@link MessagesApiMessagePickerFormPage instance}.
     */
    public MessagesApiMessagePickerFormPage text(String text) {
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
     * @return This {@link MessagesApiMessagePickerFormPage instance}.
     */
    public MessagesApiMessagePickerFormPage pageIdentifier(String pageIdentifier) {
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
     * @return This {@link MessagesApiMessagePickerFormPage instance}.
     */
    public MessagesApiMessagePickerFormPage nextPageIdentifier(String nextPageIdentifier) {
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
     * @return This {@link MessagesApiMessagePickerFormPage instance}.
     */
    public MessagesApiMessagePickerFormPage items(List<MessagesApiMessageFormPickerPageItem> items) {
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
     * @return This {@link MessagesApiMessagePickerFormPage instance}.
     */
    public MessagesApiMessagePickerFormPage addItemsItem(MessagesApiMessageFormPickerPageItem itemsItem) {
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
    public List<MessagesApiMessageFormPickerPageItem> getItems() {
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
    public void setItems(List<MessagesApiMessageFormPickerPageItem> items) {
        this.items = items;
    }

    /**
     * Sets submitForm.
     * <p>
     * Field description:
     * Placed on the pages to denote the end page of the form. Can be set on multiple pages.
     *
     * @param submitForm
     * @return This {@link MessagesApiMessagePickerFormPage instance}.
     */
    public MessagesApiMessagePickerFormPage submitForm(Boolean submitForm) {
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
     * Sets subtext.
     * <p>
     * Field description:
     * Text shown next to the picker text field.
     *
     * @param subtext
     * @return This {@link MessagesApiMessagePickerFormPage instance}.
     */
    public MessagesApiMessagePickerFormPage subtext(String subtext) {
        this.subtext = subtext;
        return this;
    }

    /**
     * Returns subtext.
     * <p>
     * Field description:
     * Text shown next to the picker text field.
     *
     * @return subtext
     */
    @JsonProperty("subtext")
    public String getSubtext() {
        return subtext;
    }

    /**
     * Sets subtext.
     * <p>
     * Field description:
     * Text shown next to the picker text field.
     *
     * @param subtext
     */
    @JsonProperty("subtext")
    public void setSubtext(String subtext) {
        this.subtext = subtext;
    }

    /**
     * Sets selectedItemIndex.
     * <p>
     * Field description:
     * A zero-indexed number identifying the item in the picker wheel should be selected by default.
     *
     * @param selectedItemIndex
     * @return This {@link MessagesApiMessagePickerFormPage instance}.
     */
    public MessagesApiMessagePickerFormPage selectedItemIndex(Integer selectedItemIndex) {
        this.selectedItemIndex = selectedItemIndex;
        return this;
    }

    /**
     * Returns selectedItemIndex.
     * <p>
     * Field description:
     * A zero-indexed number identifying the item in the picker wheel should be selected by default.
     *
     * @return selectedItemIndex
     */
    @JsonProperty("selectedItemIndex")
    public Integer getSelectedItemIndex() {
        return selectedItemIndex;
    }

    /**
     * Sets selectedItemIndex.
     * <p>
     * Field description:
     * A zero-indexed number identifying the item in the picker wheel should be selected by default.
     *
     * @param selectedItemIndex
     */
    @JsonProperty("selectedItemIndex")
    public void setSelectedItemIndex(Integer selectedItemIndex) {
        this.selectedItemIndex = selectedItemIndex;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MessagesApiMessagePickerFormPage messagesApiMessagePickerFormPage = (MessagesApiMessagePickerFormPage) o;
        return Objects.equals(this.title, messagesApiMessagePickerFormPage.title)
                && Objects.equals(this.text, messagesApiMessagePickerFormPage.text)
                && Objects.equals(this.pageIdentifier, messagesApiMessagePickerFormPage.pageIdentifier)
                && Objects.equals(this.nextPageIdentifier, messagesApiMessagePickerFormPage.nextPageIdentifier)
                && Objects.equals(this.items, messagesApiMessagePickerFormPage.items)
                && Objects.equals(this.submitForm, messagesApiMessagePickerFormPage.submitForm)
                && Objects.equals(this.subtext, messagesApiMessagePickerFormPage.subtext)
                && Objects.equals(this.selectedItemIndex, messagesApiMessagePickerFormPage.selectedItemIndex)
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
                subtext,
                selectedItemIndex,
                super.hashCode());
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class MessagesApiMessagePickerFormPage {")
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
                .append("    subtext: ")
                .append(toIndentedString(subtext))
                .append(newLine)
                .append("    selectedItemIndex: ")
                .append(toIndentedString(selectedItemIndex))
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
