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
 * Array of sections in the list.
 */
public class WhatsAppInteractiveListSectionContent {

    private String title;

    private List<WhatsAppInteractiveRowContent> rows = new ArrayList<>();

    /**
     * Sets title.
     * <p>
     * Field description:
     * Title of the section. Required, if the message has more than one section.
     *
     * @param title
     * @return This {@link WhatsAppInteractiveListSectionContent instance}.
     */
    public WhatsAppInteractiveListSectionContent title(String title) {
        this.title = title;
        return this;
    }

    /**
     * Returns title.
     * <p>
     * Field description:
     * Title of the section. Required, if the message has more than one section.
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
     * Title of the section. Required, if the message has more than one section.
     *
     * @param title
     */
    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Sets rows.
     * <p>
     * Field description:
     * An array of rows sent within a section. Section must contain at least one row. Message can have up to ten rows.
     * <p>
     * The field is required.
     *
     * @param rows
     * @return This {@link WhatsAppInteractiveListSectionContent instance}.
     */
    public WhatsAppInteractiveListSectionContent rows(List<WhatsAppInteractiveRowContent> rows) {
        this.rows = rows;
        return this;
    }

    /**
     * Adds and item into rows.
     * <p>
     * Field description:
     * An array of rows sent within a section. Section must contain at least one row. Message can have up to ten rows.
     * <p>
     * The field is required.
     *
     * @param rowsItem The item to be added to the list.
     * @return This {@link WhatsAppInteractiveListSectionContent instance}.
     */
    public WhatsAppInteractiveListSectionContent addRowsItem(WhatsAppInteractiveRowContent rowsItem) {
        if (this.rows == null) {
            this.rows = new ArrayList<>();
        }
        this.rows.add(rowsItem);
        return this;
    }

    /**
     * Returns rows.
     * <p>
     * Field description:
     * An array of rows sent within a section. Section must contain at least one row. Message can have up to ten rows.
     * <p>
     * The field is required.
     *
     * @return rows
     */
    @JsonProperty("rows")
    public List<WhatsAppInteractiveRowContent> getRows() {
        return rows;
    }

    /**
     * Sets rows.
     * <p>
     * Field description:
     * An array of rows sent within a section. Section must contain at least one row. Message can have up to ten rows.
     * <p>
     * The field is required.
     *
     * @param rows
     */
    @JsonProperty("rows")
    public void setRows(List<WhatsAppInteractiveRowContent> rows) {
        this.rows = rows;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WhatsAppInteractiveListSectionContent whatsAppInteractiveListSectionContent =
                (WhatsAppInteractiveListSectionContent) o;
        return Objects.equals(this.title, whatsAppInteractiveListSectionContent.title)
                && Objects.equals(this.rows, whatsAppInteractiveListSectionContent.rows);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, rows);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class WhatsAppInteractiveListSectionContent {")
                .append(newLine)
                .append("    title: ")
                .append(toIndentedString(title))
                .append(newLine)
                .append("    rows: ")
                .append(toIndentedString(rows))
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
