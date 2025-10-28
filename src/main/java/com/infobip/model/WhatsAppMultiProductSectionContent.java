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
public class WhatsAppMultiProductSectionContent {

    private String title;

    private List<String> productRetailerIds = new ArrayList<>();

    /**
     * Sets title.
     * <p>
     * Field description:
     * Title of the section.
     * <p>
     * The field is required.
     *
     * @param title
     * @return This {@link WhatsAppMultiProductSectionContent instance}.
     */
    public WhatsAppMultiProductSectionContent title(String title) {
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
     * Sets productRetailerIds.
     * <p>
     * Field description:
     * An array of product-unique identifiers as defined in the [catalog](https://www.infobip.com/docs/whatsapp/manage-integration/integration-essentials#enable-meta-catalog-for-product-based-messaging). If product retailer ID doesn&#39;t exist in your catalog, the product won&#39;t be displayed.
     * <p>
     * The field is required.
     *
     * @param productRetailerIds
     * @return This {@link WhatsAppMultiProductSectionContent instance}.
     */
    public WhatsAppMultiProductSectionContent productRetailerIds(List<String> productRetailerIds) {
        this.productRetailerIds = productRetailerIds;
        return this;
    }

    /**
     * Adds and item into productRetailerIds.
     * <p>
     * Field description:
     * An array of product-unique identifiers as defined in the [catalog](https://www.infobip.com/docs/whatsapp/manage-integration/integration-essentials#enable-meta-catalog-for-product-based-messaging). If product retailer ID doesn&#39;t exist in your catalog, the product won&#39;t be displayed.
     * <p>
     * The field is required.
     *
     * @param productRetailerIdsItem The item to be added to the list.
     * @return This {@link WhatsAppMultiProductSectionContent instance}.
     */
    public WhatsAppMultiProductSectionContent addProductRetailerIdsItem(String productRetailerIdsItem) {
        if (this.productRetailerIds == null) {
            this.productRetailerIds = new ArrayList<>();
        }
        this.productRetailerIds.add(productRetailerIdsItem);
        return this;
    }

    /**
     * Returns productRetailerIds.
     * <p>
     * Field description:
     * An array of product-unique identifiers as defined in the [catalog](https://www.infobip.com/docs/whatsapp/manage-integration/integration-essentials#enable-meta-catalog-for-product-based-messaging). If product retailer ID doesn&#39;t exist in your catalog, the product won&#39;t be displayed.
     * <p>
     * The field is required.
     *
     * @return productRetailerIds
     */
    @JsonProperty("productRetailerIds")
    public List<String> getProductRetailerIds() {
        return productRetailerIds;
    }

    /**
     * Sets productRetailerIds.
     * <p>
     * Field description:
     * An array of product-unique identifiers as defined in the [catalog](https://www.infobip.com/docs/whatsapp/manage-integration/integration-essentials#enable-meta-catalog-for-product-based-messaging). If product retailer ID doesn&#39;t exist in your catalog, the product won&#39;t be displayed.
     * <p>
     * The field is required.
     *
     * @param productRetailerIds
     */
    @JsonProperty("productRetailerIds")
    public void setProductRetailerIds(List<String> productRetailerIds) {
        this.productRetailerIds = productRetailerIds;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WhatsAppMultiProductSectionContent whatsAppMultiProductSectionContent = (WhatsAppMultiProductSectionContent) o;
        return Objects.equals(this.title, whatsAppMultiProductSectionContent.title)
                && Objects.equals(this.productRetailerIds, whatsAppMultiProductSectionContent.productRetailerIds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, productRetailerIds);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class WhatsAppMultiProductSectionContent {")
                .append(newLine)
                .append("    title: ")
                .append(toIndentedString(title))
                .append(newLine)
                .append("    productRetailerIds: ")
                .append(toIndentedString(productRetailerIds))
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
