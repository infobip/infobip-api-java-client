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
 * Represents MessagesApiMessageDatePickerFormPage model.
 */
public class MessagesApiMessageDatePickerFormPage extends MessagesApiMessageFormPage {

    private String title;

    private String text;

    private String pageIdentifier;

    private String nextPageIdentifier;

    private Boolean submitForm;

    private MessagesApiMessageDatePickerFormPageOptions options;

    /**
     * Constructs a new {@link MessagesApiMessageDatePickerFormPage} instance.
     */
    public MessagesApiMessageDatePickerFormPage() {
        super("DATE_PICKER");
    }

    /**
     * Sets title.
     * <p>
     * Field description:
     * Title of the page.
     *
     * @param title
     * @return This {@link MessagesApiMessageDatePickerFormPage instance}.
     */
    public MessagesApiMessageDatePickerFormPage title(String title) {
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
     * @return This {@link MessagesApiMessageDatePickerFormPage instance}.
     */
    public MessagesApiMessageDatePickerFormPage text(String text) {
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
     * @return This {@link MessagesApiMessageDatePickerFormPage instance}.
     */
    public MessagesApiMessageDatePickerFormPage pageIdentifier(String pageIdentifier) {
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
     * @return This {@link MessagesApiMessageDatePickerFormPage instance}.
     */
    public MessagesApiMessageDatePickerFormPage nextPageIdentifier(String nextPageIdentifier) {
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
     * Sets submitForm.
     * <p>
     * Field description:
     * Placed on the pages to denote the end page of the form. Can be set on multiple pages.
     *
     * @param submitForm
     * @return This {@link MessagesApiMessageDatePickerFormPage instance}.
     */
    public MessagesApiMessageDatePickerFormPage submitForm(Boolean submitForm) {
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
     * Sets options.
     *
     * @param options
     * @return This {@link MessagesApiMessageDatePickerFormPage instance}.
     */
    public MessagesApiMessageDatePickerFormPage options(MessagesApiMessageDatePickerFormPageOptions options) {
        this.options = options;
        return this;
    }

    /**
     * Returns options.
     *
     * @return options
     */
    @JsonProperty("options")
    public MessagesApiMessageDatePickerFormPageOptions getOptions() {
        return options;
    }

    /**
     * Sets options.
     *
     * @param options
     */
    @JsonProperty("options")
    public void setOptions(MessagesApiMessageDatePickerFormPageOptions options) {
        this.options = options;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MessagesApiMessageDatePickerFormPage messagesApiMessageDatePickerFormPage =
                (MessagesApiMessageDatePickerFormPage) o;
        return Objects.equals(this.title, messagesApiMessageDatePickerFormPage.title)
                && Objects.equals(this.text, messagesApiMessageDatePickerFormPage.text)
                && Objects.equals(this.pageIdentifier, messagesApiMessageDatePickerFormPage.pageIdentifier)
                && Objects.equals(this.nextPageIdentifier, messagesApiMessageDatePickerFormPage.nextPageIdentifier)
                && Objects.equals(this.submitForm, messagesApiMessageDatePickerFormPage.submitForm)
                && Objects.equals(this.options, messagesApiMessageDatePickerFormPage.options)
                && super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, text, pageIdentifier, nextPageIdentifier, submitForm, options, super.hashCode());
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class MessagesApiMessageDatePickerFormPage {")
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
                .append("    submitForm: ")
                .append(toIndentedString(submitForm))
                .append(newLine)
                .append("    options: ")
                .append(toIndentedString(options))
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
