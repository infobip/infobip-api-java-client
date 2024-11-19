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
 * Represents MessagesApiTemplateMultiProductButton model.
 */
public class MessagesApiTemplateMultiProductButton extends MessagesApiTemplateButton {

    private String productId;

    private List<MessagesApiTemplateMultiProductButtonSection> sections = new ArrayList<>();

    /**
     * Constructs a new {@link MessagesApiTemplateMultiProductButton} instance.
     */
    public MessagesApiTemplateMultiProductButton() {
        super("MULTI_PRODUCT");
    }

    /**
     * Sets productId.
     * <p>
     * Field description:
     * Product-unique identifier, as defined in catalog. If omitted, the image of the first item in your catalog will be used.
     *
     * @param productId
     * @return This {@link MessagesApiTemplateMultiProductButton instance}.
     */
    public MessagesApiTemplateMultiProductButton productId(String productId) {
        this.productId = productId;
        return this;
    }

    /**
     * Returns productId.
     * <p>
     * Field description:
     * Product-unique identifier, as defined in catalog. If omitted, the image of the first item in your catalog will be used.
     *
     * @return productId
     */
    @JsonProperty("productId")
    public String getProductId() {
        return productId;
    }

    /**
     * Sets productId.
     * <p>
     * Field description:
     * Product-unique identifier, as defined in catalog. If omitted, the image of the first item in your catalog will be used.
     *
     * @param productId
     */
    @JsonProperty("productId")
    public void setProductId(String productId) {
        this.productId = productId;
    }

    /**
     * Sets sections.
     * <p>
     * Field description:
     * An array of multi product sections.
     * <p>
     * The field is required.
     *
     * @param sections
     * @return This {@link MessagesApiTemplateMultiProductButton instance}.
     */
    public MessagesApiTemplateMultiProductButton sections(List<MessagesApiTemplateMultiProductButtonSection> sections) {
        this.sections = sections;
        return this;
    }

    /**
     * Adds and item into sections.
     * <p>
     * Field description:
     * An array of multi product sections.
     * <p>
     * The field is required.
     *
     * @param sectionsItem The item to be added to the list.
     * @return This {@link MessagesApiTemplateMultiProductButton instance}.
     */
    public MessagesApiTemplateMultiProductButton addSectionsItem(
            MessagesApiTemplateMultiProductButtonSection sectionsItem) {
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
     * An array of multi product sections.
     * <p>
     * The field is required.
     *
     * @return sections
     */
    @JsonProperty("sections")
    public List<MessagesApiTemplateMultiProductButtonSection> getSections() {
        return sections;
    }

    /**
     * Sets sections.
     * <p>
     * Field description:
     * An array of multi product sections.
     * <p>
     * The field is required.
     *
     * @param sections
     */
    @JsonProperty("sections")
    public void setSections(List<MessagesApiTemplateMultiProductButtonSection> sections) {
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
        MessagesApiTemplateMultiProductButton messagesApiTemplateMultiProductButton =
                (MessagesApiTemplateMultiProductButton) o;
        return Objects.equals(this.productId, messagesApiTemplateMultiProductButton.productId)
                && Objects.equals(this.sections, messagesApiTemplateMultiProductButton.sections)
                && super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productId, sections, super.hashCode());
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class MessagesApiTemplateMultiProductButton {")
                .append(newLine)
                .append("    ")
                .append(toIndentedString(super.toString()))
                .append(newLine)
                .append("    productId: ")
                .append(toIndentedString(productId))
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
