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
 * Represents WhatsAppTemplateMultiProductButtonContent model.
 */
public class WhatsAppTemplateMultiProductButtonContent extends WhatsAppTemplateButtonContent {

    private String thumbnailProductRetailerId;

    private List<WhatsAppMultiProductSectionContent> sections = new ArrayList<>();

    /**
     * Constructs a new {@link WhatsAppTemplateMultiProductButtonContent} instance.
     */
    public WhatsAppTemplateMultiProductButtonContent() {
        super("MULTI_PRODUCT");
    }

    /**
     * Sets thumbnailProductRetailerId.
     * <p>
     * Field description:
     * Product-unique identifier, as defined in catalog. If omitted, the image of the first item in your catalog will be used.
     *
     * @param thumbnailProductRetailerId
     * @return This {@link WhatsAppTemplateMultiProductButtonContent instance}.
     */
    public WhatsAppTemplateMultiProductButtonContent thumbnailProductRetailerId(String thumbnailProductRetailerId) {
        this.thumbnailProductRetailerId = thumbnailProductRetailerId;
        return this;
    }

    /**
     * Returns thumbnailProductRetailerId.
     * <p>
     * Field description:
     * Product-unique identifier, as defined in catalog. If omitted, the image of the first item in your catalog will be used.
     *
     * @return thumbnailProductRetailerId
     */
    @JsonProperty("thumbnailProductRetailerId")
    public String getThumbnailProductRetailerId() {
        return thumbnailProductRetailerId;
    }

    /**
     * Sets thumbnailProductRetailerId.
     * <p>
     * Field description:
     * Product-unique identifier, as defined in catalog. If omitted, the image of the first item in your catalog will be used.
     *
     * @param thumbnailProductRetailerId
     */
    @JsonProperty("thumbnailProductRetailerId")
    public void setThumbnailProductRetailerId(String thumbnailProductRetailerId) {
        this.thumbnailProductRetailerId = thumbnailProductRetailerId;
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
     * @return This {@link WhatsAppTemplateMultiProductButtonContent instance}.
     */
    public WhatsAppTemplateMultiProductButtonContent sections(List<WhatsAppMultiProductSectionContent> sections) {
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
     * @return This {@link WhatsAppTemplateMultiProductButtonContent instance}.
     */
    public WhatsAppTemplateMultiProductButtonContent addSectionsItem(WhatsAppMultiProductSectionContent sectionsItem) {
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
    public List<WhatsAppMultiProductSectionContent> getSections() {
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
    public void setSections(List<WhatsAppMultiProductSectionContent> sections) {
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
        WhatsAppTemplateMultiProductButtonContent whatsAppTemplateMultiProductButtonContent =
                (WhatsAppTemplateMultiProductButtonContent) o;
        return Objects.equals(
                        this.thumbnailProductRetailerId,
                        whatsAppTemplateMultiProductButtonContent.thumbnailProductRetailerId)
                && Objects.equals(this.sections, whatsAppTemplateMultiProductButtonContent.sections)
                && super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(thumbnailProductRetailerId, sections, super.hashCode());
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class WhatsAppTemplateMultiProductButtonContent {")
                .append(newLine)
                .append("    ")
                .append(toIndentedString(super.toString()))
                .append(newLine)
                .append("    thumbnailProductRetailerId: ")
                .append(toIndentedString(thumbnailProductRetailerId))
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
