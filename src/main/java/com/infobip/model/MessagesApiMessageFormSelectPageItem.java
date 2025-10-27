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
public class MessagesApiMessageFormSelectPageItem {

    private String identifier;

    private String title;

    private String value;

    private String nextPageIdentifier;

    private String imageUrl;

    /**
     * Sets identifier.
     * <p>
     * Field description:
     * Unique identifier of the item.
     * <p>
     * The field is required.
     *
     * @param identifier
     * @return This {@link MessagesApiMessageFormSelectPageItem instance}.
     */
    public MessagesApiMessageFormSelectPageItem identifier(String identifier) {
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
     * @return This {@link MessagesApiMessageFormSelectPageItem instance}.
     */
    public MessagesApiMessageFormSelectPageItem title(String title) {
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
     * @return This {@link MessagesApiMessageFormSelectPageItem instance}.
     */
    public MessagesApiMessageFormSelectPageItem value(String value) {
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

    /**
     * Sets nextPageIdentifier.
     * <p>
     * Field description:
     * Identifier of the next page. Set this value only when multipleSelection is not defined or set to false.
     *
     * @param nextPageIdentifier
     * @return This {@link MessagesApiMessageFormSelectPageItem instance}.
     */
    public MessagesApiMessageFormSelectPageItem nextPageIdentifier(String nextPageIdentifier) {
        this.nextPageIdentifier = nextPageIdentifier;
        return this;
    }

    /**
     * Returns nextPageIdentifier.
     * <p>
     * Field description:
     * Identifier of the next page. Set this value only when multipleSelection is not defined or set to false.
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
     * Identifier of the next page. Set this value only when multipleSelection is not defined or set to false.
     *
     * @param nextPageIdentifier
     */
    @JsonProperty("nextPageIdentifier")
    public void setNextPageIdentifier(String nextPageIdentifier) {
        this.nextPageIdentifier = nextPageIdentifier;
    }

    /**
     * Sets imageUrl.
     * <p>
     * Field description:
     * Image of the item.
     *
     * @param imageUrl
     * @return This {@link MessagesApiMessageFormSelectPageItem instance}.
     */
    public MessagesApiMessageFormSelectPageItem imageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }

    /**
     * Returns imageUrl.
     * <p>
     * Field description:
     * Image of the item.
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
     * Image of the item.
     *
     * @param imageUrl
     */
    @JsonProperty("imageUrl")
    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MessagesApiMessageFormSelectPageItem messagesApiMessageFormSelectPageItem =
                (MessagesApiMessageFormSelectPageItem) o;
        return Objects.equals(this.identifier, messagesApiMessageFormSelectPageItem.identifier)
                && Objects.equals(this.title, messagesApiMessageFormSelectPageItem.title)
                && Objects.equals(this.value, messagesApiMessageFormSelectPageItem.value)
                && Objects.equals(this.nextPageIdentifier, messagesApiMessageFormSelectPageItem.nextPageIdentifier)
                && Objects.equals(this.imageUrl, messagesApiMessageFormSelectPageItem.imageUrl);
    }

    @Override
    public int hashCode() {
        return Objects.hash(identifier, title, value, nextPageIdentifier, imageUrl);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class MessagesApiMessageFormSelectPageItem {")
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
                .append("    nextPageIdentifier: ")
                .append(toIndentedString(nextPageIdentifier))
                .append(newLine)
                .append("    imageUrl: ")
                .append(toIndentedString(imageUrl))
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
