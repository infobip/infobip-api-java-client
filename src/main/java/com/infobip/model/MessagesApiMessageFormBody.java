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
 * Represents MessagesApiMessageFormBody model.
 */
public class MessagesApiMessageFormBody extends MessagesApiMessageBody {

    private String text;

    private String imageUrl;

    private List<MessagesApiMessageFormPage> pages = new ArrayList<>();

    private String startPageIdentifier;

    private Boolean isPrivate;

    private Boolean showSummary;

    /**
     * Constructs a new {@link MessagesApiMessageFormBody} instance.
     */
    public MessagesApiMessageFormBody() {
        super("FORM");
    }

    /**
     * Sets text.
     * <p>
     * Field description:
     * Text of the received message.
     * <p>
     * The field is required.
     *
     * @param text
     * @return This {@link MessagesApiMessageFormBody instance}.
     */
    public MessagesApiMessageFormBody text(String text) {
        this.text = text;
        return this;
    }

    /**
     * Returns text.
     * <p>
     * Field description:
     * Text of the received message.
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
     * Text of the received message.
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
     * Sets imageUrl.
     * <p>
     * Field description:
     * Image of the received message.
     *
     * @param imageUrl
     * @return This {@link MessagesApiMessageFormBody instance}.
     */
    public MessagesApiMessageFormBody imageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }

    /**
     * Returns imageUrl.
     * <p>
     * Field description:
     * Image of the received message.
     *
     * @return imageUrl
     */
    @JsonProperty("imageUrl")
    public String getImageUrl() {
        return imageUrl;
    }

    /**
     * Sets imageUrl.
     * <p>
     * Field description:
     * Image of the received message.
     *
     * @param imageUrl
     */
    @JsonProperty("imageUrl")
    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    /**
     * Sets pages.
     * <p>
     * Field description:
     * An array of different pages to be shown in the form. If INTRO page is included it will always appear first.
     * <p>
     * The field is required.
     *
     * @param pages
     * @return This {@link MessagesApiMessageFormBody instance}.
     */
    public MessagesApiMessageFormBody pages(List<MessagesApiMessageFormPage> pages) {
        this.pages = pages;
        return this;
    }

    /**
     * Adds and item into pages.
     * <p>
     * Field description:
     * An array of different pages to be shown in the form. If INTRO page is included it will always appear first.
     * <p>
     * The field is required.
     *
     * @param pagesItem The item to be added to the list.
     * @return This {@link MessagesApiMessageFormBody instance}.
     */
    public MessagesApiMessageFormBody addPagesItem(MessagesApiMessageFormPage pagesItem) {
        if (this.pages == null) {
            this.pages = new ArrayList<>();
        }
        this.pages.add(pagesItem);
        return this;
    }

    /**
     * Returns pages.
     * <p>
     * Field description:
     * An array of different pages to be shown in the form. If INTRO page is included it will always appear first.
     * <p>
     * The field is required.
     *
     * @return pages
     */
    @JsonProperty("pages")
    public List<MessagesApiMessageFormPage> getPages() {
        return pages;
    }

    /**
     * Sets pages.
     * <p>
     * Field description:
     * An array of different pages to be shown in the form. If INTRO page is included it will always appear first.
     * <p>
     * The field is required.
     *
     * @param pages
     */
    @JsonProperty("pages")
    public void setPages(List<MessagesApiMessageFormPage> pages) {
        this.pages = pages;
    }

    /**
     * Sets startPageIdentifier.
     * <p>
     * Field description:
     * Identifier for the starting page of the form. Must match one of the string identifiers for the configured pages.
     * <p>
     * The field is required.
     *
     * @param startPageIdentifier
     * @return This {@link MessagesApiMessageFormBody instance}.
     */
    public MessagesApiMessageFormBody startPageIdentifier(String startPageIdentifier) {
        this.startPageIdentifier = startPageIdentifier;
        return this;
    }

    /**
     * Returns startPageIdentifier.
     * <p>
     * Field description:
     * Identifier for the starting page of the form. Must match one of the string identifiers for the configured pages.
     * <p>
     * The field is required.
     *
     * @return startPageIdentifier
     */
    @JsonProperty("startPageIdentifier")
    public String getStartPageIdentifier() {
        return startPageIdentifier;
    }

    /**
     * Sets startPageIdentifier.
     * <p>
     * Field description:
     * Identifier for the starting page of the form. Must match one of the string identifiers for the configured pages.
     * <p>
     * The field is required.
     *
     * @param startPageIdentifier
     */
    @JsonProperty("startPageIdentifier")
    public void setStartPageIdentifier(String startPageIdentifier) {
        this.startPageIdentifier = startPageIdentifier;
    }

    /**
     * Sets isPrivate.
     * <p>
     * Field description:
     * Indicates whether to mark the response as private.
     *
     * @param isPrivate
     * @return This {@link MessagesApiMessageFormBody instance}.
     */
    public MessagesApiMessageFormBody isPrivate(Boolean isPrivate) {
        this.isPrivate = isPrivate;
        return this;
    }

    /**
     * Returns isPrivate.
     * <p>
     * Field description:
     * Indicates whether to mark the response as private.
     *
     * @return isPrivate
     */
    @JsonProperty("isPrivate")
    public Boolean getIsPrivate() {
        return isPrivate;
    }

    /**
     * Sets isPrivate.
     * <p>
     * Field description:
     * Indicates whether to mark the response as private.
     *
     * @param isPrivate
     */
    @JsonProperty("isPrivate")
    public void setIsPrivate(Boolean isPrivate) {
        this.isPrivate = isPrivate;
    }

    /**
     * Sets showSummary.
     * <p>
     * Field description:
     * If set to true then it shows the summary of all the selections made within the form.
     *
     * @param showSummary
     * @return This {@link MessagesApiMessageFormBody instance}.
     */
    public MessagesApiMessageFormBody showSummary(Boolean showSummary) {
        this.showSummary = showSummary;
        return this;
    }

    /**
     * Returns showSummary.
     * <p>
     * Field description:
     * If set to true then it shows the summary of all the selections made within the form.
     *
     * @return showSummary
     */
    @JsonProperty("showSummary")
    public Boolean getShowSummary() {
        return showSummary;
    }

    /**
     * Sets showSummary.
     * <p>
     * Field description:
     * If set to true then it shows the summary of all the selections made within the form.
     *
     * @param showSummary
     */
    @JsonProperty("showSummary")
    public void setShowSummary(Boolean showSummary) {
        this.showSummary = showSummary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MessagesApiMessageFormBody messagesApiMessageFormBody = (MessagesApiMessageFormBody) o;
        return Objects.equals(this.text, messagesApiMessageFormBody.text)
                && Objects.equals(this.imageUrl, messagesApiMessageFormBody.imageUrl)
                && Objects.equals(this.pages, messagesApiMessageFormBody.pages)
                && Objects.equals(this.startPageIdentifier, messagesApiMessageFormBody.startPageIdentifier)
                && Objects.equals(this.isPrivate, messagesApiMessageFormBody.isPrivate)
                && Objects.equals(this.showSummary, messagesApiMessageFormBody.showSummary)
                && super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(text, imageUrl, pages, startPageIdentifier, isPrivate, showSummary, super.hashCode());
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class MessagesApiMessageFormBody {")
                .append(newLine)
                .append("    ")
                .append(toIndentedString(super.toString()))
                .append(newLine)
                .append("    text: ")
                .append(toIndentedString(text))
                .append(newLine)
                .append("    imageUrl: ")
                .append(toIndentedString(imageUrl))
                .append(newLine)
                .append("    pages: ")
                .append(toIndentedString(pages))
                .append(newLine)
                .append("    startPageIdentifier: ")
                .append(toIndentedString(startPageIdentifier))
                .append(newLine)
                .append("    isPrivate: ")
                .append(toIndentedString(isPrivate))
                .append(newLine)
                .append("    showSummary: ")
                .append(toIndentedString(showSummary))
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
