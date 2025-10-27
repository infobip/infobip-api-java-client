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
 * An array of items in the order.
 */
public class MessagesApiMessageOrderItem {

    private String name;

    private String retailerId;

    private Integer quantity;

    private Double amount;

    private Double saleAmount;

    private MessagesApiMessageOrderImporter importer;

    /**
     * Sets name.
     * <p>
     * Field description:
     * Name of the item.
     * <p>
     * The field is required.
     *
     * @param name
     * @return This {@link MessagesApiMessageOrderItem instance}.
     */
    public MessagesApiMessageOrderItem name(String name) {
        this.name = name;
        return this;
    }

    /**
     * Returns name.
     * <p>
     * Field description:
     * Name of the item.
     * <p>
     * The field is required.
     *
     * @return name
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * Sets name.
     * <p>
     * Field description:
     * Name of the item.
     * <p>
     * The field is required.
     *
     * @param name
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Sets retailerId.
     * <p>
     * Field description:
     * (WhatsApp specific, and required) Product-unique identifier, as defined in catalog.
     *
     * @param retailerId
     * @return This {@link MessagesApiMessageOrderItem instance}.
     */
    public MessagesApiMessageOrderItem retailerId(String retailerId) {
        this.retailerId = retailerId;
        return this;
    }

    /**
     * Returns retailerId.
     * <p>
     * Field description:
     * (WhatsApp specific, and required) Product-unique identifier, as defined in catalog.
     *
     * @return retailerId
     */
    @JsonProperty("retailerId")
    public String getRetailerId() {
        return retailerId;
    }

    /**
     * Sets retailerId.
     * <p>
     * Field description:
     * (WhatsApp specific, and required) Product-unique identifier, as defined in catalog.
     *
     * @param retailerId
     */
    @JsonProperty("retailerId")
    public void setRetailerId(String retailerId) {
        this.retailerId = retailerId;
    }

    /**
     * Sets quantity.
     * <p>
     * Field description:
     * (WhatsApp specific) Item quantity.
     *
     * @param quantity
     * @return This {@link MessagesApiMessageOrderItem instance}.
     */
    public MessagesApiMessageOrderItem quantity(Integer quantity) {
        this.quantity = quantity;
        return this;
    }

    /**
     * Returns quantity.
     * <p>
     * Field description:
     * (WhatsApp specific) Item quantity.
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
     * (WhatsApp specific) Item quantity.
     *
     * @param quantity
     */
    @JsonProperty("quantity")
    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    /**
     * Sets amount.
     * <p>
     * Field description:
     * Price of the item (up to 2 decimal places). For WhatsApp it has to be multiplied by offset (100 for &#x60;INR&#x60; and &#x60;BRL&#x60;)
     * <p>
     * The field is required.
     *
     * @param amount
     * @return This {@link MessagesApiMessageOrderItem instance}.
     */
    public MessagesApiMessageOrderItem amount(Double amount) {
        this.amount = amount;
        return this;
    }

    /**
     * Returns amount.
     * <p>
     * Field description:
     * Price of the item (up to 2 decimal places). For WhatsApp it has to be multiplied by offset (100 for &#x60;INR&#x60; and &#x60;BRL&#x60;)
     * <p>
     * The field is required.
     *
     * @return amount
     */
    @JsonProperty("amount")
    public Double getAmount() {
        return amount;
    }

    /**
     * Sets amount.
     * <p>
     * Field description:
     * Price of the item (up to 2 decimal places). For WhatsApp it has to be multiplied by offset (100 for &#x60;INR&#x60; and &#x60;BRL&#x60;)
     * <p>
     * The field is required.
     *
     * @param amount
     */
    @JsonProperty("amount")
    public void setAmount(Double amount) {
        this.amount = amount;
    }

    /**
     * Sets saleAmount.
     * <p>
     * Field description:
     * (WhatsApp specific) Item discount (up to 2 decimal places). For WhatsApp it has to be multiplied by offset (100 for &#x60;INR&#x60; and &#x60;BRL&#x60;)
     *
     * @param saleAmount
     * @return This {@link MessagesApiMessageOrderItem instance}.
     */
    public MessagesApiMessageOrderItem saleAmount(Double saleAmount) {
        this.saleAmount = saleAmount;
        return this;
    }

    /**
     * Returns saleAmount.
     * <p>
     * Field description:
     * (WhatsApp specific) Item discount (up to 2 decimal places). For WhatsApp it has to be multiplied by offset (100 for &#x60;INR&#x60; and &#x60;BRL&#x60;)
     *
     * @return saleAmount
     */
    @JsonProperty("saleAmount")
    public Double getSaleAmount() {
        return saleAmount;
    }

    /**
     * Sets saleAmount.
     * <p>
     * Field description:
     * (WhatsApp specific) Item discount (up to 2 decimal places). For WhatsApp it has to be multiplied by offset (100 for &#x60;INR&#x60; and &#x60;BRL&#x60;)
     *
     * @param saleAmount
     */
    @JsonProperty("saleAmount")
    public void setSaleAmount(Double saleAmount) {
        this.saleAmount = saleAmount;
    }

    /**
     * Sets importer.
     *
     * @param importer
     * @return This {@link MessagesApiMessageOrderItem instance}.
     */
    public MessagesApiMessageOrderItem importer(MessagesApiMessageOrderImporter importer) {
        this.importer = importer;
        return this;
    }

    /**
     * Returns importer.
     *
     * @return importer
     */
    @JsonProperty("importer")
    public MessagesApiMessageOrderImporter getImporter() {
        return importer;
    }

    /**
     * Sets importer.
     *
     * @param importer
     */
    @JsonProperty("importer")
    public void setImporter(MessagesApiMessageOrderImporter importer) {
        this.importer = importer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MessagesApiMessageOrderItem messagesApiMessageOrderItem = (MessagesApiMessageOrderItem) o;
        return Objects.equals(this.name, messagesApiMessageOrderItem.name)
                && Objects.equals(this.retailerId, messagesApiMessageOrderItem.retailerId)
                && Objects.equals(this.quantity, messagesApiMessageOrderItem.quantity)
                && Objects.equals(this.amount, messagesApiMessageOrderItem.amount)
                && Objects.equals(this.saleAmount, messagesApiMessageOrderItem.saleAmount)
                && Objects.equals(this.importer, messagesApiMessageOrderItem.importer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, retailerId, quantity, amount, saleAmount, importer);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class MessagesApiMessageOrderItem {")
                .append(newLine)
                .append("    name: ")
                .append(toIndentedString(name))
                .append(newLine)
                .append("    retailerId: ")
                .append(toIndentedString(retailerId))
                .append(newLine)
                .append("    quantity: ")
                .append(toIndentedString(quantity))
                .append(newLine)
                .append("    amount: ")
                .append(toIndentedString(amount))
                .append(newLine)
                .append("    saleAmount: ")
                .append(toIndentedString(saleAmount))
                .append(newLine)
                .append("    importer: ")
                .append(toIndentedString(importer))
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
