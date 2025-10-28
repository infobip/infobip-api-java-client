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
 * Represents MessagesApiMessageInputFormPage model.
 */
public class MessagesApiMessageInputFormPage extends MessagesApiMessageFormPage {

    private String title;

    private String text;

    private String pageIdentifier;

    private String nextPageIdentifier;

    private Boolean submitForm;

    private MessagesApiMessageInputFormPageOptions options;

    /**
     * Constructs a new {@link MessagesApiMessageInputFormPage} instance.
     */
    public MessagesApiMessageInputFormPage() {
        super("INPUT");
    }

    /**
     * Sets title.
     * <p>
     * Field description:
     * Title of the page.
     *
     * @param title
     * @return This {@link MessagesApiMessageInputFormPage instance}.
     */
    public MessagesApiMessageInputFormPage title(String title) {
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
     * @return This {@link MessagesApiMessageInputFormPage instance}.
     */
    public MessagesApiMessageInputFormPage text(String text) {
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
     * @return This {@link MessagesApiMessageInputFormPage instance}.
     */
    public MessagesApiMessageInputFormPage pageIdentifier(String pageIdentifier) {
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
     * @return This {@link MessagesApiMessageInputFormPage instance}.
     */
    public MessagesApiMessageInputFormPage nextPageIdentifier(String nextPageIdentifier) {
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
     * @return This {@link MessagesApiMessageInputFormPage instance}.
     */
    public MessagesApiMessageInputFormPage submitForm(Boolean submitForm) {
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
     * @return This {@link MessagesApiMessageInputFormPage instance}.
     */
    public MessagesApiMessageInputFormPage options(MessagesApiMessageInputFormPageOptions options) {
        this.options = options;
        return this;
    }

    /**
     * Returns options.
     *
     * @return options
     */
    @JsonProperty("options")
    public MessagesApiMessageInputFormPageOptions getOptions() {
        return options;
    }

    /**
     * Sets options.
     *
     * @param options
     */
    @JsonProperty("options")
    public void setOptions(MessagesApiMessageInputFormPageOptions options) {
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
        MessagesApiMessageInputFormPage messagesApiMessageInputFormPage = (MessagesApiMessageInputFormPage) o;
        return Objects.equals(this.title, messagesApiMessageInputFormPage.title)
                && Objects.equals(this.text, messagesApiMessageInputFormPage.text)
                && Objects.equals(this.pageIdentifier, messagesApiMessageInputFormPage.pageIdentifier)
                && Objects.equals(this.nextPageIdentifier, messagesApiMessageInputFormPage.nextPageIdentifier)
                && Objects.equals(this.submitForm, messagesApiMessageInputFormPage.submitForm)
                && Objects.equals(this.options, messagesApiMessageInputFormPage.options)
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
                .append("class MessagesApiMessageInputFormPage {")
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
