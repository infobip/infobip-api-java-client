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
 * Represents WhatsAppWebhookOrderContent model.
 */
public class WhatsAppWebhookOrderContent extends WhatsAppWebhookInboundMessage {

    private String catalogId;

    private List<WhatsAppWebhookProductItem> productItems = new ArrayList<>();

    private String text;

    /**
     * Constructs a new {@link WhatsAppWebhookOrderContent} instance.
     */
    public WhatsAppWebhookOrderContent() {
        super("ORDER");
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
     * @return This {@link WhatsAppWebhookOrderContent instance}.
     */
    public WhatsAppWebhookOrderContent catalogId(String catalogId) {
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
     * Sets productItems.
     * <p>
     * Field description:
     * An array of selected products.
     * <p>
     * The field is required.
     *
     * @param productItems
     * @return This {@link WhatsAppWebhookOrderContent instance}.
     */
    public WhatsAppWebhookOrderContent productItems(List<WhatsAppWebhookProductItem> productItems) {
        this.productItems = productItems;
        return this;
    }

    /**
     * Adds and item into productItems.
     * <p>
     * Field description:
     * An array of selected products.
     * <p>
     * The field is required.
     *
     * @param productItemsItem The item to be added to the list.
     * @return This {@link WhatsAppWebhookOrderContent instance}.
     */
    public WhatsAppWebhookOrderContent addProductItemsItem(WhatsAppWebhookProductItem productItemsItem) {
        if (this.productItems == null) {
            this.productItems = new ArrayList<>();
        }
        this.productItems.add(productItemsItem);
        return this;
    }

    /**
     * Returns productItems.
     * <p>
     * Field description:
     * An array of selected products.
     * <p>
     * The field is required.
     *
     * @return productItems
     */
    @JsonProperty("productItems")
    public List<WhatsAppWebhookProductItem> getProductItems() {
        return productItems;
    }

    /**
     * Sets productItems.
     * <p>
     * Field description:
     * An array of selected products.
     * <p>
     * The field is required.
     *
     * @param productItems
     */
    @JsonProperty("productItems")
    public void setProductItems(List<WhatsAppWebhookProductItem> productItems) {
        this.productItems = productItems;
    }

    /**
     * Sets text.
     * <p>
     * Field description:
     * Text sent with order.
     *
     * @param text
     * @return This {@link WhatsAppWebhookOrderContent instance}.
     */
    public WhatsAppWebhookOrderContent text(String text) {
        this.text = text;
        return this;
    }

    /**
     * Returns text.
     * <p>
     * Field description:
     * Text sent with order.
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
     * Text sent with order.
     *
     * @param text
     */
    @JsonProperty("text")
    public void setText(String text) {
        this.text = text;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WhatsAppWebhookOrderContent whatsAppWebhookOrderContent = (WhatsAppWebhookOrderContent) o;
        return Objects.equals(this.catalogId, whatsAppWebhookOrderContent.catalogId)
                && Objects.equals(this.productItems, whatsAppWebhookOrderContent.productItems)
                && Objects.equals(this.text, whatsAppWebhookOrderContent.text)
                && super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(catalogId, productItems, text, super.hashCode());
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class WhatsAppWebhookOrderContent {")
                .append(newLine)
                .append("    ")
                .append(toIndentedString(super.toString()))
                .append(newLine)
                .append("    catalogId: ")
                .append(toIndentedString(catalogId))
                .append(newLine)
                .append("    productItems: ")
                .append(toIndentedString(productItems))
                .append(newLine)
                .append("    text: ")
                .append(toIndentedString(text))
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
