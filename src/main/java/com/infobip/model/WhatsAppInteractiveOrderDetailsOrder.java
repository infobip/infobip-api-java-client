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
 * The order details.
 */
public class WhatsAppInteractiveOrderDetailsOrder {

    private String catalogId;

    private List<WhatsAppInteractiveOrderDetailsOrderItem> items = new ArrayList<>();

    private WhatsAppInteractiveOrderDetailsAmount subtotal;

    private WhatsAppInteractiveOrderDetailsDescriptiveAmount tax;

    private WhatsAppInteractiveOrderDetailsDescriptiveAmount shipping;

    private WhatsAppInteractiveOrderDetailsDiscount discount;

    private WhatsAppInteractiveOrderDetailsOrderExpiration orderExpiration;

    private WhatsAppOrderDetailsType orderDetailsType;

    /**
     * Sets catalogId.
     * <p>
     * Field description:
     * The ID that uniquely identifies the [catalog](https://www.infobip.com/docs/whatsapp/manage-integration/integration-essentials#enable-meta-catalog-for-product-based-messaging) registered with Facebook and connected to the WhatsApp Business Account the sender belongs to.
     *
     * @param catalogId
     * @return This {@link WhatsAppInteractiveOrderDetailsOrder instance}.
     */
    public WhatsAppInteractiveOrderDetailsOrder catalogId(String catalogId) {
        this.catalogId = catalogId;
        return this;
    }

    /**
     * Returns catalogId.
     * <p>
     * Field description:
     * The ID that uniquely identifies the [catalog](https://www.infobip.com/docs/whatsapp/manage-integration/integration-essentials#enable-meta-catalog-for-product-based-messaging) registered with Facebook and connected to the WhatsApp Business Account the sender belongs to.
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
     * The ID that uniquely identifies the [catalog](https://www.infobip.com/docs/whatsapp/manage-integration/integration-essentials#enable-meta-catalog-for-product-based-messaging) registered with Facebook and connected to the WhatsApp Business Account the sender belongs to.
     *
     * @param catalogId
     */
    @JsonProperty("catalogId")
    public void setCatalogId(String catalogId) {
        this.catalogId = catalogId;
    }

    /**
     * Sets items.
     * <p>
     * Field description:
     * An array of items in the order.
     * <p>
     * The field is required.
     *
     * @param items
     * @return This {@link WhatsAppInteractiveOrderDetailsOrder instance}.
     */
    public WhatsAppInteractiveOrderDetailsOrder items(List<WhatsAppInteractiveOrderDetailsOrderItem> items) {
        this.items = items;
        return this;
    }

    /**
     * Adds and item into items.
     * <p>
     * Field description:
     * An array of items in the order.
     * <p>
     * The field is required.
     *
     * @param itemsItem The item to be added to the list.
     * @return This {@link WhatsAppInteractiveOrderDetailsOrder instance}.
     */
    public WhatsAppInteractiveOrderDetailsOrder addItemsItem(WhatsAppInteractiveOrderDetailsOrderItem itemsItem) {
        if (this.items == null) {
            this.items = new ArrayList<>();
        }
        this.items.add(itemsItem);
        return this;
    }

    /**
     * Returns items.
     * <p>
     * Field description:
     * An array of items in the order.
     * <p>
     * The field is required.
     *
     * @return items
     */
    @JsonProperty("items")
    public List<WhatsAppInteractiveOrderDetailsOrderItem> getItems() {
        return items;
    }

    /**
     * Sets items.
     * <p>
     * Field description:
     * An array of items in the order.
     * <p>
     * The field is required.
     *
     * @param items
     */
    @JsonProperty("items")
    public void setItems(List<WhatsAppInteractiveOrderDetailsOrderItem> items) {
        this.items = items;
    }

    /**
     * Sets subtotal.
     * <p>
     * The field is required.
     *
     * @param subtotal
     * @return This {@link WhatsAppInteractiveOrderDetailsOrder instance}.
     */
    public WhatsAppInteractiveOrderDetailsOrder subtotal(WhatsAppInteractiveOrderDetailsAmount subtotal) {
        this.subtotal = subtotal;
        return this;
    }

    /**
     * Returns subtotal.
     * <p>
     * The field is required.
     *
     * @return subtotal
     */
    @JsonProperty("subtotal")
    public WhatsAppInteractiveOrderDetailsAmount getSubtotal() {
        return subtotal;
    }

    /**
     * Sets subtotal.
     * <p>
     * The field is required.
     *
     * @param subtotal
     */
    @JsonProperty("subtotal")
    public void setSubtotal(WhatsAppInteractiveOrderDetailsAmount subtotal) {
        this.subtotal = subtotal;
    }

    /**
     * Sets tax.
     * <p>
     * The field is required.
     *
     * @param tax
     * @return This {@link WhatsAppInteractiveOrderDetailsOrder instance}.
     */
    public WhatsAppInteractiveOrderDetailsOrder tax(WhatsAppInteractiveOrderDetailsDescriptiveAmount tax) {
        this.tax = tax;
        return this;
    }

    /**
     * Returns tax.
     * <p>
     * The field is required.
     *
     * @return tax
     */
    @JsonProperty("tax")
    public WhatsAppInteractiveOrderDetailsDescriptiveAmount getTax() {
        return tax;
    }

    /**
     * Sets tax.
     * <p>
     * The field is required.
     *
     * @param tax
     */
    @JsonProperty("tax")
    public void setTax(WhatsAppInteractiveOrderDetailsDescriptiveAmount tax) {
        this.tax = tax;
    }

    /**
     * Sets shipping.
     *
     * @param shipping
     * @return This {@link WhatsAppInteractiveOrderDetailsOrder instance}.
     */
    public WhatsAppInteractiveOrderDetailsOrder shipping(WhatsAppInteractiveOrderDetailsDescriptiveAmount shipping) {
        this.shipping = shipping;
        return this;
    }

    /**
     * Returns shipping.
     *
     * @return shipping
     */
    @JsonProperty("shipping")
    public WhatsAppInteractiveOrderDetailsDescriptiveAmount getShipping() {
        return shipping;
    }

    /**
     * Sets shipping.
     *
     * @param shipping
     */
    @JsonProperty("shipping")
    public void setShipping(WhatsAppInteractiveOrderDetailsDescriptiveAmount shipping) {
        this.shipping = shipping;
    }

    /**
     * Sets discount.
     *
     * @param discount
     * @return This {@link WhatsAppInteractiveOrderDetailsOrder instance}.
     */
    public WhatsAppInteractiveOrderDetailsOrder discount(WhatsAppInteractiveOrderDetailsDiscount discount) {
        this.discount = discount;
        return this;
    }

    /**
     * Returns discount.
     *
     * @return discount
     */
    @JsonProperty("discount")
    public WhatsAppInteractiveOrderDetailsDiscount getDiscount() {
        return discount;
    }

    /**
     * Sets discount.
     *
     * @param discount
     */
    @JsonProperty("discount")
    public void setDiscount(WhatsAppInteractiveOrderDetailsDiscount discount) {
        this.discount = discount;
    }

    /**
     * Sets orderExpiration.
     *
     * @param orderExpiration
     * @return This {@link WhatsAppInteractiveOrderDetailsOrder instance}.
     */
    public WhatsAppInteractiveOrderDetailsOrder orderExpiration(
            WhatsAppInteractiveOrderDetailsOrderExpiration orderExpiration) {
        this.orderExpiration = orderExpiration;
        return this;
    }

    /**
     * Returns orderExpiration.
     *
     * @return orderExpiration
     */
    @JsonProperty("orderExpiration")
    public WhatsAppInteractiveOrderDetailsOrderExpiration getOrderExpiration() {
        return orderExpiration;
    }

    /**
     * Sets orderExpiration.
     *
     * @param orderExpiration
     */
    @JsonProperty("orderExpiration")
    public void setOrderExpiration(WhatsAppInteractiveOrderDetailsOrderExpiration orderExpiration) {
        this.orderExpiration = orderExpiration;
    }

    /**
     * Sets orderDetailsType.
     *
     * @param orderDetailsType
     * @return This {@link WhatsAppInteractiveOrderDetailsOrder instance}.
     */
    public WhatsAppInteractiveOrderDetailsOrder orderDetailsType(WhatsAppOrderDetailsType orderDetailsType) {
        this.orderDetailsType = orderDetailsType;
        return this;
    }

    /**
     * Returns orderDetailsType.
     *
     * @return orderDetailsType
     */
    @JsonProperty("orderDetailsType")
    public WhatsAppOrderDetailsType getOrderDetailsType() {
        return orderDetailsType;
    }

    /**
     * Sets orderDetailsType.
     *
     * @param orderDetailsType
     */
    @JsonProperty("orderDetailsType")
    public void setOrderDetailsType(WhatsAppOrderDetailsType orderDetailsType) {
        this.orderDetailsType = orderDetailsType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WhatsAppInteractiveOrderDetailsOrder whatsAppInteractiveOrderDetailsOrder =
                (WhatsAppInteractiveOrderDetailsOrder) o;
        return Objects.equals(this.catalogId, whatsAppInteractiveOrderDetailsOrder.catalogId)
                && Objects.equals(this.items, whatsAppInteractiveOrderDetailsOrder.items)
                && Objects.equals(this.subtotal, whatsAppInteractiveOrderDetailsOrder.subtotal)
                && Objects.equals(this.tax, whatsAppInteractiveOrderDetailsOrder.tax)
                && Objects.equals(this.shipping, whatsAppInteractiveOrderDetailsOrder.shipping)
                && Objects.equals(this.discount, whatsAppInteractiveOrderDetailsOrder.discount)
                && Objects.equals(this.orderExpiration, whatsAppInteractiveOrderDetailsOrder.orderExpiration)
                && Objects.equals(this.orderDetailsType, whatsAppInteractiveOrderDetailsOrder.orderDetailsType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(catalogId, items, subtotal, tax, shipping, discount, orderExpiration, orderDetailsType);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class WhatsAppInteractiveOrderDetailsOrder {")
                .append(newLine)
                .append("    catalogId: ")
                .append(toIndentedString(catalogId))
                .append(newLine)
                .append("    items: ")
                .append(toIndentedString(items))
                .append(newLine)
                .append("    subtotal: ")
                .append(toIndentedString(subtotal))
                .append(newLine)
                .append("    tax: ")
                .append(toIndentedString(tax))
                .append(newLine)
                .append("    shipping: ")
                .append(toIndentedString(shipping))
                .append(newLine)
                .append("    discount: ")
                .append(toIndentedString(discount))
                .append(newLine)
                .append("    orderExpiration: ")
                .append(toIndentedString(orderExpiration))
                .append(newLine)
                .append("    orderDetailsType: ")
                .append(toIndentedString(orderDetailsType))
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
