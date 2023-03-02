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
public class WhatsAppInteractiveMultiProductSectionContent {

    private String title;

    private List<String> productRetailerIds = new ArrayList<>();

    /**
     * Sets title.
     * <p>
     * Field description:
     * Title of the section. Required, if the message has more than one section.
     *
     * @param title
     * @return This {@link WhatsAppInteractiveMultiProductSectionContent instance}.
     */
    public WhatsAppInteractiveMultiProductSectionContent title(String title) {
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
     * Sets productRetailerIds.
     * <p>
     * Field description:
     * An array of product-unique identifiers as defined in the [catalog](https://www.infobip.com/docs/whatsapp/manage-connection#manage-catalog). If product retailer ID doesn&#39;t exist in your catalog, the product won&#39;t be displayed.
     * <p>
     * The field is required.
     *
     * @param productRetailerIds
     * @return This {@link WhatsAppInteractiveMultiProductSectionContent instance}.
     */
    public WhatsAppInteractiveMultiProductSectionContent productRetailerIds(List<String> productRetailerIds) {
        this.productRetailerIds = productRetailerIds;
        return this;
    }

    /**
     * Adds and item into productRetailerIds.
     * <p>
     * Field description:
     * An array of product-unique identifiers as defined in the [catalog](https://www.infobip.com/docs/whatsapp/manage-connection#manage-catalog). If product retailer ID doesn&#39;t exist in your catalog, the product won&#39;t be displayed.
     * <p>
     * The field is required.
     *
     * @param productRetailerIdsItem The item to be added to the list.
     * @return This {@link WhatsAppInteractiveMultiProductSectionContent instance}.
     */
    public WhatsAppInteractiveMultiProductSectionContent addProductRetailerIdsItem(String productRetailerIdsItem) {
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
     * An array of product-unique identifiers as defined in the [catalog](https://www.infobip.com/docs/whatsapp/manage-connection#manage-catalog). If product retailer ID doesn&#39;t exist in your catalog, the product won&#39;t be displayed.
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
     * An array of product-unique identifiers as defined in the [catalog](https://www.infobip.com/docs/whatsapp/manage-connection#manage-catalog). If product retailer ID doesn&#39;t exist in your catalog, the product won&#39;t be displayed.
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
        WhatsAppInteractiveMultiProductSectionContent whatsAppInteractiveMultiProductSectionContent =
                (WhatsAppInteractiveMultiProductSectionContent) o;
        return Objects.equals(this.title, whatsAppInteractiveMultiProductSectionContent.title)
                && Objects.equals(
                        this.productRetailerIds, whatsAppInteractiveMultiProductSectionContent.productRetailerIds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, productRetailerIds);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class WhatsAppInteractiveMultiProductSectionContent {")
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
