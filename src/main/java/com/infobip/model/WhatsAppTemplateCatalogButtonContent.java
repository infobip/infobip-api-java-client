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
 * Represents WhatsAppTemplateCatalogButtonContent model.
 */
public class WhatsAppTemplateCatalogButtonContent extends WhatsAppTemplateButtonContent {

    private String thumbnailProductRetailerId;

    /**
     * Constructs a new {@link WhatsAppTemplateCatalogButtonContent} instance.
     */
    public WhatsAppTemplateCatalogButtonContent() {
        super("CATALOG");
    }

    /**
     * Sets thumbnailProductRetailerId.
     * <p>
     * Field description:
     * Product-unique identifier, as defined in catalog. If omitted, the image of the first item in your catalog will be used.
     *
     * @param thumbnailProductRetailerId
     * @return This {@link WhatsAppTemplateCatalogButtonContent instance}.
     */
    public WhatsAppTemplateCatalogButtonContent thumbnailProductRetailerId(String thumbnailProductRetailerId) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WhatsAppTemplateCatalogButtonContent whatsAppTemplateCatalogButtonContent =
                (WhatsAppTemplateCatalogButtonContent) o;
        return Objects.equals(
                        this.thumbnailProductRetailerId,
                        whatsAppTemplateCatalogButtonContent.thumbnailProductRetailerId)
                && super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(thumbnailProductRetailerId, super.hashCode());
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class WhatsAppTemplateCatalogButtonContent {")
                .append(newLine)
                .append("    ")
                .append(toIndentedString(super.toString()))
                .append(newLine)
                .append("    thumbnailProductRetailerId: ")
                .append(toIndentedString(thumbnailProductRetailerId))
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
