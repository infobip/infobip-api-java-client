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
 * Allows you to specify catalog and product details sent in the multi-product message.
 */
public class WhatsAppInteractiveMultiProductActionContent {

    private String catalogId;

    private List<WhatsAppInteractiveMultiProductSectionContent> sections = new ArrayList<>();

    /**
     * Sets catalogId.
     * <p>
     * Field description:
     * The ID that uniquely identifies the [catalog](https://www.infobip.com/docs/whatsapp/manage-integration#enable-meta-catalog-for-product-based-messaging) registered with Facebook and connected to the WhatsApp Business Account the sender belongs to.
     * <p>
     * The field is required.
     *
     * @param catalogId
     * @return This {@link WhatsAppInteractiveMultiProductActionContent instance}.
     */
    public WhatsAppInteractiveMultiProductActionContent catalogId(String catalogId) {
        this.catalogId = catalogId;
        return this;
    }

    /**
     * Returns catalogId.
     * <p>
     * Field description:
     * The ID that uniquely identifies the [catalog](https://www.infobip.com/docs/whatsapp/manage-integration#enable-meta-catalog-for-product-based-messaging) registered with Facebook and connected to the WhatsApp Business Account the sender belongs to.
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
     * The ID that uniquely identifies the [catalog](https://www.infobip.com/docs/whatsapp/manage-integration#enable-meta-catalog-for-product-based-messaging) registered with Facebook and connected to the WhatsApp Business Account the sender belongs to.
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
     * An array of multi product sections.
     * <p>
     * The field is required.
     *
     * @param sections
     * @return This {@link WhatsAppInteractiveMultiProductActionContent instance}.
     */
    public WhatsAppInteractiveMultiProductActionContent sections(
            List<WhatsAppInteractiveMultiProductSectionContent> sections) {
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
     * @return This {@link WhatsAppInteractiveMultiProductActionContent instance}.
     */
    public WhatsAppInteractiveMultiProductActionContent addSectionsItem(
            WhatsAppInteractiveMultiProductSectionContent sectionsItem) {
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
    public List<WhatsAppInteractiveMultiProductSectionContent> getSections() {
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
    public void setSections(List<WhatsAppInteractiveMultiProductSectionContent> sections) {
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
        WhatsAppInteractiveMultiProductActionContent whatsAppInteractiveMultiProductActionContent =
                (WhatsAppInteractiveMultiProductActionContent) o;
        return Objects.equals(this.catalogId, whatsAppInteractiveMultiProductActionContent.catalogId)
                && Objects.equals(this.sections, whatsAppInteractiveMultiProductActionContent.sections);
    }

    @Override
    public int hashCode() {
        return Objects.hash(catalogId, sections);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class WhatsAppInteractiveMultiProductActionContent {")
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
