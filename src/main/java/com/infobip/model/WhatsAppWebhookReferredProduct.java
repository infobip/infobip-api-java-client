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
 * Product information included in the incoming message.
 */
public class WhatsAppWebhookReferredProduct {

    private String catalogId;

    private String productRetailerId;

    /**
     * Sets catalogId.
     * <p>
     * Field description:
     * The ID that uniquely identifies the catalog registered with Facebook, connected to the WhatsApp Business Account (WABA) the sender belongs to.
     * <p>
     * The field is required.
     *
     * @param catalogId
     * @return This {@link WhatsAppWebhookReferredProduct instance}.
     */
    public WhatsAppWebhookReferredProduct catalogId(String catalogId) {
        this.catalogId = catalogId;
        return this;
    }

    /**
     * Returns catalogId.
     * <p>
     * Field description:
     * The ID that uniquely identifies the catalog registered with Facebook, connected to the WhatsApp Business Account (WABA) the sender belongs to.
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
     * The ID that uniquely identifies the catalog registered with Facebook, connected to the WhatsApp Business Account (WABA) the sender belongs to.
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
     * Sets productRetailerId.
     * <p>
     * Field description:
     * Product unique identifier, as defined in catalog.
     * <p>
     * The field is required.
     *
     * @param productRetailerId
     * @return This {@link WhatsAppWebhookReferredProduct instance}.
     */
    public WhatsAppWebhookReferredProduct productRetailerId(String productRetailerId) {
        this.productRetailerId = productRetailerId;
        return this;
    }

    /**
     * Returns productRetailerId.
     * <p>
     * Field description:
     * Product unique identifier, as defined in catalog.
     * <p>
     * The field is required.
     *
     * @return productRetailerId
     */
    @JsonProperty("productRetailerId")
    public String getProductRetailerId() {
        return productRetailerId;
    }

    /**
     * Sets productRetailerId.
     * <p>
     * Field description:
     * Product unique identifier, as defined in catalog.
     * <p>
     * The field is required.
     *
     * @param productRetailerId
     */
    @JsonProperty("productRetailerId")
    public void setProductRetailerId(String productRetailerId) {
        this.productRetailerId = productRetailerId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WhatsAppWebhookReferredProduct whatsAppWebhookReferredProduct = (WhatsAppWebhookReferredProduct) o;
        return Objects.equals(this.catalogId, whatsAppWebhookReferredProduct.catalogId)
                && Objects.equals(this.productRetailerId, whatsAppWebhookReferredProduct.productRetailerId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(catalogId, productRetailerId);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class WhatsAppWebhookReferredProduct {")
                .append(newLine)
                .append("    catalogId: ")
                .append(toIndentedString(catalogId))
                .append(newLine)
                .append("    productRetailerId: ")
                .append(toIndentedString(productRetailerId))
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
