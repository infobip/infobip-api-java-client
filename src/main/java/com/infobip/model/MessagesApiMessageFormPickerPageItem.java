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
 * An array of objects defining the user experience.
 */
public class MessagesApiMessageFormPickerPageItem {

    private String identifier;

    private String title;

    private String value;

    /**
     * Sets identifier.
     * <p>
     * Field description:
     * Unique identifier of the item.
     * <p>
     * The field is required.
     *
     * @param identifier
     * @return This {@link MessagesApiMessageFormPickerPageItem instance}.
     */
    public MessagesApiMessageFormPickerPageItem identifier(String identifier) {
        this.identifier = identifier;
        return this;
    }

    /**
     * Returns identifier.
     * <p>
     * Field description:
     * Unique identifier of the item.
     * <p>
     * The field is required.
     *
     * @return identifier
     */
    @JsonProperty("identifier")
    public String getIdentifier() {
        return identifier;
    }

    /**
     * Sets identifier.
     * <p>
     * Field description:
     * Unique identifier of the item.
     * <p>
     * The field is required.
     *
     * @param identifier
     */
    @JsonProperty("identifier")
    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    /**
     * Sets title.
     * <p>
     * Field description:
     * Title of the item.
     * <p>
     * The field is required.
     *
     * @param title
     * @return This {@link MessagesApiMessageFormPickerPageItem instance}.
     */
    public MessagesApiMessageFormPickerPageItem title(String title) {
        this.title = title;
        return this;
    }

    /**
     * Returns title.
     * <p>
     * Field description:
     * Title of the item.
     * <p>
     * The field is required.
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
     * Title of the item.
     * <p>
     * The field is required.
     *
     * @param title
     */
    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Sets value.
     * <p>
     * Field description:
     * Value of the item.
     * <p>
     * The field is required.
     *
     * @param value
     * @return This {@link MessagesApiMessageFormPickerPageItem instance}.
     */
    public MessagesApiMessageFormPickerPageItem value(String value) {
        this.value = value;
        return this;
    }

    /**
     * Returns value.
     * <p>
     * Field description:
     * Value of the item.
     * <p>
     * The field is required.
     *
     * @return value
     */
    @JsonProperty("value")
    public String getValue() {
        return value;
    }

    /**
     * Sets value.
     * <p>
     * Field description:
     * Value of the item.
     * <p>
     * The field is required.
     *
     * @param value
     */
    @JsonProperty("value")
    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MessagesApiMessageFormPickerPageItem messagesApiMessageFormPickerPageItem =
                (MessagesApiMessageFormPickerPageItem) o;
        return Objects.equals(this.identifier, messagesApiMessageFormPickerPageItem.identifier)
                && Objects.equals(this.title, messagesApiMessageFormPickerPageItem.title)
                && Objects.equals(this.value, messagesApiMessageFormPickerPageItem.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(identifier, title, value);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class MessagesApiMessageFormPickerPageItem {")
                .append(newLine)
                .append("    identifier: ")
                .append(toIndentedString(identifier))
                .append(newLine)
                .append("    title: ")
                .append(toIndentedString(title))
                .append(newLine)
                .append("    value: ")
                .append(toIndentedString(value))
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
