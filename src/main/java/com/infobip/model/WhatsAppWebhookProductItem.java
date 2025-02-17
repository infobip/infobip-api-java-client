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
 * Represents WhatsAppWebhookProductItem model.
 */
public class WhatsAppWebhookProductItem {

    private String currency;

    private Double itemPrice;

    private String productRetailerId;

    private Integer quantity;

    /**
     * Sets currency.
     * <p>
     * Field description:
     * Currency of the product.
     * <p>
     * The field is required.
     *
     * @param currency
     * @return This {@link WhatsAppWebhookProductItem instance}.
     */
    public WhatsAppWebhookProductItem currency(String currency) {
        this.currency = currency;
        return this;
    }

    /**
     * Returns currency.
     * <p>
     * Field description:
     * Currency of the product.
     * <p>
     * The field is required.
     *
     * @return currency
     */
    @JsonProperty("currency")
    public String getCurrency() {
        return currency;
    }

    /**
     * Sets currency.
     * <p>
     * Field description:
     * Currency of the product.
     * <p>
     * The field is required.
     *
     * @param currency
     */
    @JsonProperty("currency")
    public void setCurrency(String currency) {
        this.currency = currency;
    }

    /**
     * Sets itemPrice.
     * <p>
     * Field description:
     * Price of the product.
     * <p>
     * The field is required.
     *
     * @param itemPrice
     * @return This {@link WhatsAppWebhookProductItem instance}.
     */
    public WhatsAppWebhookProductItem itemPrice(Double itemPrice) {
        this.itemPrice = itemPrice;
        return this;
    }

    /**
     * Returns itemPrice.
     * <p>
     * Field description:
     * Price of the product.
     * <p>
     * The field is required.
     *
     * @return itemPrice
     */
    @JsonProperty("itemPrice")
    public Double getItemPrice() {
        return itemPrice;
    }

    /**
     * Sets itemPrice.
     * <p>
     * Field description:
     * Price of the product.
     * <p>
     * The field is required.
     *
     * @param itemPrice
     */
    @JsonProperty("itemPrice")
    public void setItemPrice(Double itemPrice) {
        this.itemPrice = itemPrice;
    }

    /**
     * Sets productRetailerId.
     * <p>
     * Field description:
     * Product&#39;s unique identifier as defined in the catalog.
     * <p>
     * The field is required.
     *
     * @param productRetailerId
     * @return This {@link WhatsAppWebhookProductItem instance}.
     */
    public WhatsAppWebhookProductItem productRetailerId(String productRetailerId) {
        this.productRetailerId = productRetailerId;
        return this;
    }

    /**
     * Returns productRetailerId.
     * <p>
     * Field description:
     * Product&#39;s unique identifier as defined in the catalog.
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
     * Product&#39;s unique identifier as defined in the catalog.
     * <p>
     * The field is required.
     *
     * @param productRetailerId
     */
    @JsonProperty("productRetailerId")
    public void setProductRetailerId(String productRetailerId) {
        this.productRetailerId = productRetailerId;
    }

    /**
     * Sets quantity.
     * <p>
     * Field description:
     * Quantity of the ordered product.
     * <p>
     * The field is required.
     *
     * @param quantity
     * @return This {@link WhatsAppWebhookProductItem instance}.
     */
    public WhatsAppWebhookProductItem quantity(Integer quantity) {
        this.quantity = quantity;
        return this;
    }

    /**
     * Returns quantity.
     * <p>
     * Field description:
     * Quantity of the ordered product.
     * <p>
     * The field is required.
     *
     * @return quantity
     */
    @JsonProperty("quantity")
    public Integer getQuantity() {
        return quantity;
    }

    /**
     * Sets quantity.
     * <p>
     * Field description:
     * Quantity of the ordered product.
     * <p>
     * The field is required.
     *
     * @param quantity
     */
    @JsonProperty("quantity")
    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WhatsAppWebhookProductItem whatsAppWebhookProductItem = (WhatsAppWebhookProductItem) o;
        return Objects.equals(this.currency, whatsAppWebhookProductItem.currency)
                && Objects.equals(this.itemPrice, whatsAppWebhookProductItem.itemPrice)
                && Objects.equals(this.productRetailerId, whatsAppWebhookProductItem.productRetailerId)
                && Objects.equals(this.quantity, whatsAppWebhookProductItem.quantity);
    }

    @Override
    public int hashCode() {
        return Objects.hash(currency, itemPrice, productRetailerId, quantity);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class WhatsAppWebhookProductItem {")
                .append(newLine)
                .append("    currency: ")
                .append(toIndentedString(currency))
                .append(newLine)
                .append("    itemPrice: ")
                .append(toIndentedString(itemPrice))
                .append(newLine)
                .append("    productRetailerId: ")
                .append(toIndentedString(productRetailerId))
                .append(newLine)
                .append("    quantity: ")
                .append(toIndentedString(quantity))
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
