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
 * Payment request order.
 */
public class MessagesApiMessageOrder {

    private String catalogId;

    private MessagesApiMessageOrderCurrency currency;

    private MessagesApiMessageOrderType type;

    private MessagesApiMessageOrderDetailsType detailsType;

    private List<MessagesApiMessageOrderItem> items = null;

    private MessagesApiMessageOrderExpiration expiration;

    /**
     * Sets catalogId.
     * <p>
     * Field description:
     * (WhatsApp specific) ID that uniquely identifies the [catalog](https://www.infobip.com/docs/api/platform/catalogs-api) registered with Facebook and connected to the WhatsApp Business Account the sender belongs to.
     *
     * @param catalogId
     * @return This {@link MessagesApiMessageOrder instance}.
     */
    public MessagesApiMessageOrder catalogId(String catalogId) {
        this.catalogId = catalogId;
        return this;
    }

    /**
     * Returns catalogId.
     * <p>
     * Field description:
     * (WhatsApp specific) ID that uniquely identifies the [catalog](https://www.infobip.com/docs/api/platform/catalogs-api) registered with Facebook and connected to the WhatsApp Business Account the sender belongs to.
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
     * (WhatsApp specific) ID that uniquely identifies the [catalog](https://www.infobip.com/docs/api/platform/catalogs-api) registered with Facebook and connected to the WhatsApp Business Account the sender belongs to.
     *
     * @param catalogId
     */
    @JsonProperty("catalogId")
    public void setCatalogId(String catalogId) {
        this.catalogId = catalogId;
    }

    /**
     * Sets currency.
     *
     * @param currency
     * @return This {@link MessagesApiMessageOrder instance}.
     */
    public MessagesApiMessageOrder currency(MessagesApiMessageOrderCurrency currency) {
        this.currency = currency;
        return this;
    }

    /**
     * Returns currency.
     *
     * @return currency
     */
    @JsonProperty("currency")
    public MessagesApiMessageOrderCurrency getCurrency() {
        return currency;
    }

    /**
     * Sets currency.
     *
     * @param currency
     */
    @JsonProperty("currency")
    public void setCurrency(MessagesApiMessageOrderCurrency currency) {
        this.currency = currency;
    }

    /**
     * Sets type.
     *
     * @param type
     * @return This {@link MessagesApiMessageOrder instance}.
     */
    public MessagesApiMessageOrder type(MessagesApiMessageOrderType type) {
        this.type = type;
        return this;
    }

    /**
     * Returns type.
     *
     * @return type
     */
    @JsonProperty("type")
    public MessagesApiMessageOrderType getType() {
        return type;
    }

    /**
     * Sets type.
     *
     * @param type
     */
    @JsonProperty("type")
    public void setType(MessagesApiMessageOrderType type) {
        this.type = type;
    }

    /**
     * Sets detailsType.
     *
     * @param detailsType
     * @return This {@link MessagesApiMessageOrder instance}.
     */
    public MessagesApiMessageOrder detailsType(MessagesApiMessageOrderDetailsType detailsType) {
        this.detailsType = detailsType;
        return this;
    }

    /**
     * Returns detailsType.
     *
     * @return detailsType
     */
    @JsonProperty("detailsType")
    public MessagesApiMessageOrderDetailsType getDetailsType() {
        return detailsType;
    }

    /**
     * Sets detailsType.
     *
     * @param detailsType
     */
    @JsonProperty("detailsType")
    public void setDetailsType(MessagesApiMessageOrderDetailsType detailsType) {
        this.detailsType = detailsType;
    }

    /**
     * Sets items.
     * <p>
     * Field description:
     * An array of items in the order.
     *
     * @param items
     * @return This {@link MessagesApiMessageOrder instance}.
     */
    public MessagesApiMessageOrder items(List<MessagesApiMessageOrderItem> items) {
        this.items = items;
        return this;
    }

    /**
     * Adds and item into items.
     * <p>
     * Field description:
     * An array of items in the order.
     *
     * @param itemsItem The item to be added to the list.
     * @return This {@link MessagesApiMessageOrder instance}.
     */
    public MessagesApiMessageOrder addItemsItem(MessagesApiMessageOrderItem itemsItem) {
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
     *
     * @return items
     */
    @JsonProperty("items")
    public List<MessagesApiMessageOrderItem> getItems() {
        return items;
    }

    /**
     * Sets items.
     * <p>
     * Field description:
     * An array of items in the order.
     *
     * @param items
     */
    @JsonProperty("items")
    public void setItems(List<MessagesApiMessageOrderItem> items) {
        this.items = items;
    }

    /**
     * Sets expiration.
     *
     * @param expiration
     * @return This {@link MessagesApiMessageOrder instance}.
     */
    public MessagesApiMessageOrder expiration(MessagesApiMessageOrderExpiration expiration) {
        this.expiration = expiration;
        return this;
    }

    /**
     * Returns expiration.
     *
     * @return expiration
     */
    @JsonProperty("expiration")
    public MessagesApiMessageOrderExpiration getExpiration() {
        return expiration;
    }

    /**
     * Sets expiration.
     *
     * @param expiration
     */
    @JsonProperty("expiration")
    public void setExpiration(MessagesApiMessageOrderExpiration expiration) {
        this.expiration = expiration;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MessagesApiMessageOrder messagesApiMessageOrder = (MessagesApiMessageOrder) o;
        return Objects.equals(this.catalogId, messagesApiMessageOrder.catalogId)
                && Objects.equals(this.currency, messagesApiMessageOrder.currency)
                && Objects.equals(this.type, messagesApiMessageOrder.type)
                && Objects.equals(this.detailsType, messagesApiMessageOrder.detailsType)
                && Objects.equals(this.items, messagesApiMessageOrder.items)
                && Objects.equals(this.expiration, messagesApiMessageOrder.expiration);
    }

    @Override
    public int hashCode() {
        return Objects.hash(catalogId, currency, type, detailsType, items, expiration);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class MessagesApiMessageOrder {")
                .append(newLine)
                .append("    catalogId: ")
                .append(toIndentedString(catalogId))
                .append(newLine)
                .append("    currency: ")
                .append(toIndentedString(currency))
                .append(newLine)
                .append("    type: ")
                .append(toIndentedString(type))
                .append(newLine)
                .append("    detailsType: ")
                .append(toIndentedString(detailsType))
                .append(newLine)
                .append("    items: ")
                .append(toIndentedString(items))
                .append(newLine)
                .append("    expiration: ")
                .append(toIndentedString(expiration))
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
