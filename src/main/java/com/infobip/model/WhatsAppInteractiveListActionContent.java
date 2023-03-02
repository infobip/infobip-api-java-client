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
 * Allows you to specify the title of the list and its sections. Each section can have a title and multiple rows to select.
 */
public class WhatsAppInteractiveListActionContent {

    private String title;

    private List<WhatsAppInteractiveListSectionContent> sections = new ArrayList<>();

    /**
     * Sets title.
     * <p>
     * Field description:
     * Title of the list. Does not allow emojis or markdown.
     * <p>
     * The field is required.
     *
     * @param title
     * @return This {@link WhatsAppInteractiveListActionContent instance}.
     */
    public WhatsAppInteractiveListActionContent title(String title) {
        this.title = title;
        return this;
    }

    /**
     * Returns title.
     * <p>
     * Field description:
     * Title of the list. Does not allow emojis or markdown.
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
     * Title of the list. Does not allow emojis or markdown.
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
     * Sets sections.
     * <p>
     * Field description:
     * Array of sections in the list.
     * <p>
     * The field is required.
     *
     * @param sections
     * @return This {@link WhatsAppInteractiveListActionContent instance}.
     */
    public WhatsAppInteractiveListActionContent sections(List<WhatsAppInteractiveListSectionContent> sections) {
        this.sections = sections;
        return this;
    }

    /**
     * Adds and item into sections.
     * <p>
     * Field description:
     * Array of sections in the list.
     * <p>
     * The field is required.
     *
     * @param sectionsItem The item to be added to the list.
     * @return This {@link WhatsAppInteractiveListActionContent instance}.
     */
    public WhatsAppInteractiveListActionContent addSectionsItem(WhatsAppInteractiveListSectionContent sectionsItem) {
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
     * Array of sections in the list.
     * <p>
     * The field is required.
     *
     * @return sections
     */
    @JsonProperty("sections")
    public List<WhatsAppInteractiveListSectionContent> getSections() {
        return sections;
    }

    /**
     * Sets sections.
     * <p>
     * Field description:
     * Array of sections in the list.
     * <p>
     * The field is required.
     *
     * @param sections
     */
    @JsonProperty("sections")
    public void setSections(List<WhatsAppInteractiveListSectionContent> sections) {
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
        WhatsAppInteractiveListActionContent whatsAppInteractiveListActionContent =
                (WhatsAppInteractiveListActionContent) o;
        return Objects.equals(this.title, whatsAppInteractiveListActionContent.title)
                && Objects.equals(this.sections, whatsAppInteractiveListActionContent.sections);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, sections);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class WhatsAppInteractiveListActionContent {")
                .append(newLine)
                .append("    title: ")
                .append(toIndentedString(title))
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
