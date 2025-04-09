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
 * Represents MessagesApiMessageProductBody model.
 */
public class MessagesApiMessageProductBody extends MessagesApiMessageBody {

    private String text;

    private String catalogId;

    private List<MessagesApiMessageProductSection> sections = new ArrayList<>();

    /**
     * Constructs a new {@link MessagesApiMessageProductBody} instance.
     */
    public MessagesApiMessageProductBody() {
        super("PRODUCT");
    }

    /**
     * Sets text.
     * <p>
     * Field description:
     * Content of message body. Required only for multi-product messages.
     *
     * @param text
     * @return This {@link MessagesApiMessageProductBody instance}.
     */
    public MessagesApiMessageProductBody text(String text) {
        this.text = text;
        return this;
    }

    /**
     * Returns text.
     * <p>
     * Field description:
     * Content of message body. Required only for multi-product messages.
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
     * Content of message body. Required only for multi-product messages.
     *
     * @param text
     */
    @JsonProperty("text")
    public void setText(String text) {
        this.text = text;
    }

    /**
     * Sets catalogId.
     * <p>
     * Field description:
     * The ID that uniquely identifies the catalog
     * <p>
     * The field is required.
     *
     * @param catalogId
     * @return This {@link MessagesApiMessageProductBody instance}.
     */
    public MessagesApiMessageProductBody catalogId(String catalogId) {
        this.catalogId = catalogId;
        return this;
    }

    /**
     * Returns catalogId.
     * <p>
     * Field description:
     * The ID that uniquely identifies the catalog
     * <p>
     * The field is required.
     *
     * @return catalogId
     */
    @JsonProperty("catalogId")
    public String getCatalogId() {
        return catalogId;
    }

    /**
     * Sets catalogId.
     * <p>
     * Field description:
     * The ID that uniquely identifies the catalog
     * <p>
     * The field is required.
     *
     * @param catalogId
     */
    @JsonProperty("catalogId")
    public void setCatalogId(String catalogId) {
        this.catalogId = catalogId;
    }

    /**
     * Sets sections.
     * <p>
     * Field description:
     * An array of product sections. Header and title fields are required in case of multiple products.
     * <p>
     * The field is required.
     *
     * @param sections
     * @return This {@link MessagesApiMessageProductBody instance}.
     */
    public MessagesApiMessageProductBody sections(List<MessagesApiMessageProductSection> sections) {
        this.sections = sections;
        return this;
    }

    /**
     * Adds and item into sections.
     * <p>
     * Field description:
     * An array of product sections. Header and title fields are required in case of multiple products.
     * <p>
     * The field is required.
     *
     * @param sectionsItem The item to be added to the list.
     * @return This {@link MessagesApiMessageProductBody instance}.
     */
    public MessagesApiMessageProductBody addSectionsItem(MessagesApiMessageProductSection sectionsItem) {
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
     * An array of product sections. Header and title fields are required in case of multiple products.
     * <p>
     * The field is required.
     *
     * @return sections
     */
    @JsonProperty("sections")
    public List<MessagesApiMessageProductSection> getSections() {
        return sections;
    }

    /**
     * Sets sections.
     * <p>
     * Field description:
     * An array of product sections. Header and title fields are required in case of multiple products.
     * <p>
     * The field is required.
     *
     * @param sections
     */
    @JsonProperty("sections")
    public void setSections(List<MessagesApiMessageProductSection> sections) {
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
        MessagesApiMessageProductBody messagesApiMessageProductBody = (MessagesApiMessageProductBody) o;
        return Objects.equals(this.text, messagesApiMessageProductBody.text)
                && Objects.equals(this.catalogId, messagesApiMessageProductBody.catalogId)
                && Objects.equals(this.sections, messagesApiMessageProductBody.sections)
                && super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(text, catalogId, sections, super.hashCode());
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class MessagesApiMessageProductBody {")
                .append(newLine)
                .append("    ")
                .append(toIndentedString(super.toString()))
                .append(newLine)
                .append("    text: ")
                .append(toIndentedString(text))
                .append(newLine)
                .append("    catalogId: ")
                .append(toIndentedString(catalogId))
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
