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
 * Represents MessagesApiWebhookEventFormContent model.
 */
public class MessagesApiWebhookEventFormContent extends MessagesApiWebhookEventContent {

    private Boolean isPrivate;

    private List<MessagesApiWebhookEventFormSelection> selections = new ArrayList<>();

    /**
     * Constructs a new {@link MessagesApiWebhookEventFormContent} instance.
     */
    public MessagesApiWebhookEventFormContent() {
        super("FORM_RESPONSE");
    }

    /**
     * Sets isPrivate.
     * <p>
     * Field description:
     * Indicates if response is private.
     *
     * @param isPrivate
     * @return This {@link MessagesApiWebhookEventFormContent instance}.
     */
    public MessagesApiWebhookEventFormContent isPrivate(Boolean isPrivate) {
        this.isPrivate = isPrivate;
        return this;
    }

    /**
     * Returns isPrivate.
     * <p>
     * Field description:
     * Indicates if response is private.
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
     * Indicates if response is private.
     *
     * @param isPrivate
     */
    @JsonProperty("isPrivate")
    public void setIsPrivate(Boolean isPrivate) {
        this.isPrivate = isPrivate;
    }

    /**
     * Sets selections.
     * <p>
     * Field description:
     * List of user responses.
     * <p>
     * The field is required.
     *
     * @param selections
     * @return This {@link MessagesApiWebhookEventFormContent instance}.
     */
    public MessagesApiWebhookEventFormContent selections(List<MessagesApiWebhookEventFormSelection> selections) {
        this.selections = selections;
        return this;
    }

    /**
     * Adds and item into selections.
     * <p>
     * Field description:
     * List of user responses.
     * <p>
     * The field is required.
     *
     * @param selectionsItem The item to be added to the list.
     * @return This {@link MessagesApiWebhookEventFormContent instance}.
     */
    public MessagesApiWebhookEventFormContent addSelectionsItem(MessagesApiWebhookEventFormSelection selectionsItem) {
        if (this.selections == null) {
            this.selections = new ArrayList<>();
        }
        this.selections.add(selectionsItem);
        return this;
    }

    /**
     * Returns selections.
     * <p>
     * Field description:
     * List of user responses.
     * <p>
     * The field is required.
     *
     * @return selections
     */
    @JsonProperty("selections")
    public List<MessagesApiWebhookEventFormSelection> getSelections() {
        return selections;
    }

    /**
     * Sets selections.
     * <p>
     * Field description:
     * List of user responses.
     * <p>
     * The field is required.
     *
     * @param selections
     */
    @JsonProperty("selections")
    public void setSelections(List<MessagesApiWebhookEventFormSelection> selections) {
        this.selections = selections;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MessagesApiWebhookEventFormContent messagesApiWebhookEventFormContent = (MessagesApiWebhookEventFormContent) o;
        return Objects.equals(this.isPrivate, messagesApiWebhookEventFormContent.isPrivate)
                && Objects.equals(this.selections, messagesApiWebhookEventFormContent.selections)
                && super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isPrivate, selections, super.hashCode());
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class MessagesApiWebhookEventFormContent {")
                .append(newLine)
                .append("    ")
                .append(toIndentedString(super.toString()))
                .append(newLine)
                .append("    isPrivate: ")
                .append(toIndentedString(isPrivate))
                .append(newLine)
                .append("    selections: ")
                .append(toIndentedString(selections))
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
