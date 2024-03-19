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
 * Represents MessagesApiMessageListBody model.
 */
public class MessagesApiMessageListBody extends MessagesApiMessageBody {

    private String text;

    private String description;

    private String imageUrl;

    private List<MessagesApiMessageListSection> sections = new ArrayList<>();

    /**
     * Constructs a new {@link MessagesApiMessageListBody} instance.
     */
    public MessagesApiMessageListBody() {
        super("LIST");
    }

    /**
     * Sets text.
     * <p>
     * Field description:
     * Text to be sent.
     * <p>
     * The field is required.
     *
     * @param text
     * @return This {@link MessagesApiMessageListBody instance}.
     */
    public MessagesApiMessageListBody text(String text) {
        this.text = text;
        return this;
    }

    /**
     * Returns text.
     * <p>
     * Field description:
     * Text to be sent.
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
     * Text to be sent.
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
     * Sets description.
     * <p>
     * Field description:
     * Description.
     *
     * @param description
     * @return This {@link MessagesApiMessageListBody instance}.
     */
    public MessagesApiMessageListBody description(String description) {
        this.description = description;
        return this;
    }

    /**
     * Returns description.
     * <p>
     * Field description:
     * Description.
     *
     * @return description
     */
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    /**
     * Sets description.
     * <p>
     * Field description:
     * Description.
     *
     * @param description
     */
    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Sets imageUrl.
     * <p>
     * Field description:
     * URL of the image.
     *
     * @param imageUrl
     * @return This {@link MessagesApiMessageListBody instance}.
     */
    public MessagesApiMessageListBody imageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }

    /**
     * Returns imageUrl.
     * <p>
     * Field description:
     * URL of the image.
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
     * URL of the image.
     *
     * @param imageUrl
     */
    @JsonProperty("imageUrl")
    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    /**
     * Sets sections.
     * <p>
     * Field description:
     * Section&#39;s list.
     * <p>
     * The field is required.
     *
     * @param sections
     * @return This {@link MessagesApiMessageListBody instance}.
     */
    public MessagesApiMessageListBody sections(List<MessagesApiMessageListSection> sections) {
        this.sections = sections;
        return this;
    }

    /**
     * Adds and item into sections.
     * <p>
     * Field description:
     * Section&#39;s list.
     * <p>
     * The field is required.
     *
     * @param sectionsItem The item to be added to the list.
     * @return This {@link MessagesApiMessageListBody instance}.
     */
    public MessagesApiMessageListBody addSectionsItem(MessagesApiMessageListSection sectionsItem) {
        if (this.sections == null) {
            this.sections = new ArrayList<>();
        }
        this.sections.add(sectionsItem);
        return this;
    }

    /**
     * Returns sections.
     * <p>
     * Field description:
     * Section&#39;s list.
     * <p>
     * The field is required.
     *
     * @return sections
     */
    @JsonProperty("sections")
    public List<MessagesApiMessageListSection> getSections() {
        return sections;
    }

    /**
     * Sets sections.
     * <p>
     * Field description:
     * Section&#39;s list.
     * <p>
     * The field is required.
     *
     * @param sections
     */
    @JsonProperty("sections")
    public void setSections(List<MessagesApiMessageListSection> sections) {
        this.sections = sections;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MessagesApiMessageListBody messagesApiMessageListBody = (MessagesApiMessageListBody) o;
        return Objects.equals(this.text, messagesApiMessageListBody.text)
                && Objects.equals(this.description, messagesApiMessageListBody.description)
                && Objects.equals(this.imageUrl, messagesApiMessageListBody.imageUrl)
                && Objects.equals(this.sections, messagesApiMessageListBody.sections)
                && super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(text, description, imageUrl, sections, super.hashCode());
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class MessagesApiMessageListBody {")
                .append(newLine)
                .append("    ")
                .append(toIndentedString(super.toString()))
                .append(newLine)
                .append("    text: ")
                .append(toIndentedString(text))
                .append(newLine)
                .append("    description: ")
                .append(toIndentedString(description))
                .append(newLine)
                .append("    imageUrl: ")
                .append(toIndentedString(imageUrl))
                .append(newLine)
                .append("    sections: ")
                .append(toIndentedString(sections))
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
