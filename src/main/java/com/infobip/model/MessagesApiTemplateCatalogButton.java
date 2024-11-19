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
 * Represents MessagesApiTemplateCatalogButton model.
 */
public class MessagesApiTemplateCatalogButton extends MessagesApiTemplateButton {

    private String productId;

    /**
     * Constructs a new {@link MessagesApiTemplateCatalogButton} instance.
     */
    public MessagesApiTemplateCatalogButton() {
        super("CATALOG");
    }

    /**
     * Sets productId.
     * <p>
     * Field description:
     * Product-unique identifier from the catalog.
     *
     * @param productId
     * @return This {@link MessagesApiTemplateCatalogButton instance}.
     */
    public MessagesApiTemplateCatalogButton productId(String productId) {
        this.productId = productId;
        return this;
    }

    /**
     * Returns productId.
     * <p>
     * Field description:
     * Product-unique identifier from the catalog.
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
     * Product-unique identifier from the catalog.
     *
     * @param productId
     */
    @JsonProperty("productId")
    public void setProductId(String productId) {
        this.productId = productId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MessagesApiTemplateCatalogButton messagesApiTemplateCatalogButton = (MessagesApiTemplateCatalogButton) o;
        return Objects.equals(this.productId, messagesApiTemplateCatalogButton.productId) && super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productId, super.hashCode());
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class MessagesApiTemplateCatalogButton {")
                .append(newLine)
                .append("    ")
                .append(toIndentedString(super.toString()))
                .append(newLine)
                .append("    productId: ")
                .append(toIndentedString(productId))
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
