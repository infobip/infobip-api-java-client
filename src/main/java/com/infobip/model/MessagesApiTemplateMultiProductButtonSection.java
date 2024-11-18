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
 * An array of multi product sections.
 */
public class MessagesApiTemplateMultiProductButtonSection {

    private String title;

    private List<String> productIds = new ArrayList<>();

    /**
     * Sets title.
     * <p>
     * Field description:
     * Title of the section.
     * <p>
     * The field is required.
     *
     * @param title
     * @return This {@link MessagesApiTemplateMultiProductButtonSection instance}.
     */
    public MessagesApiTemplateMultiProductButtonSection title(String title) {
        this.title = title;
        return this;
    }

    /**
     * Returns title.
     * <p>
     * Field description:
     * Title of the section.
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
     * Title of the section.
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
     * Sets productIds.
     * <p>
     * Field description:
     * An array of product-unique identifiers as defined in the catalog. If product retailer ID doesn&#39;t exist in your catalog, the product won&#39;t be displayed.
     * <p>
     * The field is required.
     *
     * @param productIds
     * @return This {@link MessagesApiTemplateMultiProductButtonSection instance}.
     */
    public MessagesApiTemplateMultiProductButtonSection productIds(List<String> productIds) {
        this.productIds = productIds;
        return this;
    }

    /**
     * Adds and item into productIds.
     * <p>
     * Field description:
     * An array of product-unique identifiers as defined in the catalog. If product retailer ID doesn&#39;t exist in your catalog, the product won&#39;t be displayed.
     * <p>
     * The field is required.
     *
     * @param productIdsItem The item to be added to the list.
     * @return This {@link MessagesApiTemplateMultiProductButtonSection instance}.
     */
    public MessagesApiTemplateMultiProductButtonSection addProductIdsItem(String productIdsItem) {
        if (this.productIds == null) {
            this.productIds = new ArrayList<>();
        }
        this.productIds.add(productIdsItem);
        return this;
    }

    /**
     * Returns productIds.
     * <p>
     * Field description:
     * An array of product-unique identifiers as defined in the catalog. If product retailer ID doesn&#39;t exist in your catalog, the product won&#39;t be displayed.
     * <p>
     * The field is required.
     *
     * @return productIds
     */
    @JsonProperty("productIds")
    public List<String> getProductIds() {
        return productIds;
    }

    /**
     * Sets productIds.
     * <p>
     * Field description:
     * An array of product-unique identifiers as defined in the catalog. If product retailer ID doesn&#39;t exist in your catalog, the product won&#39;t be displayed.
     * <p>
     * The field is required.
     *
     * @param productIds
     */
    @JsonProperty("productIds")
    public void setProductIds(List<String> productIds) {
        this.productIds = productIds;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MessagesApiTemplateMultiProductButtonSection messagesApiTemplateMultiProductButtonSection =
                (MessagesApiTemplateMultiProductButtonSection) o;
        return Objects.equals(this.title, messagesApiTemplateMultiProductButtonSection.title)
                && Objects.equals(this.productIds, messagesApiTemplateMultiProductButtonSection.productIds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, productIds);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class MessagesApiTemplateMultiProductButtonSection {")
                .append(newLine)
                .append("    title: ")
                .append(toIndentedString(title))
                .append(newLine)
                .append("    productIds: ")
                .append(toIndentedString(productIds))
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
