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
public class WhatsAppInteractiveOrderDetailsOrderItem {

    private String retailerId;

    private String name;

    private WhatsAppInteractiveOrderDetailsAmount amount;

    private WhatsAppInteractiveOrderDetailsAmount saleAmount;

    private Integer quantity;

    private String originCountry;

    private String importerName;

    private WhatsAppInteractiveOrderDetailsImporterAddress importerAddress;

    /**
     * Sets retailerId.
     * <p>
     * Field description:
     * Product-unique identifier, as defined in catalog.
     * <p>
     * The field is required.
     *
     * @param retailerId
     * @return This {@link WhatsAppInteractiveOrderDetailsOrderItem instance}.
     */
    public WhatsAppInteractiveOrderDetailsOrderItem retailerId(String retailerId) {
        this.retailerId = retailerId;
        return this;
    }

    /**
     * Returns retailerId.
     * <p>
     * Field description:
     * Product-unique identifier, as defined in catalog.
     * <p>
     * The field is required.
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
     * Product-unique identifier, as defined in catalog.
     * <p>
     * The field is required.
     *
     * @param retailerId
     */
    @JsonProperty("retailerId")
    public void setRetailerId(String retailerId) {
        this.retailerId = retailerId;
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
     * @return This {@link WhatsAppInteractiveOrderDetailsOrderItem instance}.
     */
    public WhatsAppInteractiveOrderDetailsOrderItem name(String name) {
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
     * Sets amount.
     * <p>
     * The field is required.
     *
     * @param amount
     * @return This {@link WhatsAppInteractiveOrderDetailsOrderItem instance}.
     */
    public WhatsAppInteractiveOrderDetailsOrderItem amount(WhatsAppInteractiveOrderDetailsAmount amount) {
        this.amount = amount;
        return this;
    }

    /**
     * Returns amount.
     * <p>
     * The field is required.
     *
     * @return amount
     */
    @JsonProperty("amount")
    public WhatsAppInteractiveOrderDetailsAmount getAmount() {
        return amount;
    }

    /**
     * Sets amount.
     * <p>
     * The field is required.
     *
     * @param amount
     */
    @JsonProperty("amount")
    public void setAmount(WhatsAppInteractiveOrderDetailsAmount amount) {
        this.amount = amount;
    }

    /**
     * Sets saleAmount.
     *
     * @param saleAmount
     * @return This {@link WhatsAppInteractiveOrderDetailsOrderItem instance}.
     */
    public WhatsAppInteractiveOrderDetailsOrderItem saleAmount(WhatsAppInteractiveOrderDetailsAmount saleAmount) {
        this.saleAmount = saleAmount;
        return this;
    }

    /**
     * Returns saleAmount.
     *
     * @return saleAmount
     */
    @JsonProperty("saleAmount")
    public WhatsAppInteractiveOrderDetailsAmount getSaleAmount() {
        return saleAmount;
    }

    /**
     * Sets saleAmount.
     *
     * @param saleAmount
     */
    @JsonProperty("saleAmount")
    public void setSaleAmount(WhatsAppInteractiveOrderDetailsAmount saleAmount) {
        this.saleAmount = saleAmount;
    }

    /**
     * Sets quantity.
     * <p>
     * Field description:
     * The number of items.
     * <p>
     * The field is required.
     *
     * @param quantity
     * @return This {@link WhatsAppInteractiveOrderDetailsOrderItem instance}.
     */
    public WhatsAppInteractiveOrderDetailsOrderItem quantity(Integer quantity) {
        this.quantity = quantity;
        return this;
    }

    /**
     * Returns quantity.
     * <p>
     * Field description:
     * The number of items.
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
     * The number of items.
     * <p>
     * The field is required.
     *
     * @param quantity
     */
    @JsonProperty("quantity")
    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    /**
     * Sets originCountry.
     * <p>
     * Field description:
     * Country of origin. Required when catalogId is not provided. It&#39;s supported only for UPI PayU payments.
     *
     * @param originCountry
     * @return This {@link WhatsAppInteractiveOrderDetailsOrderItem instance}.
     */
    public WhatsAppInteractiveOrderDetailsOrderItem originCountry(String originCountry) {
        this.originCountry = originCountry;
        return this;
    }

    /**
     * Returns originCountry.
     * <p>
     * Field description:
     * Country of origin. Required when catalogId is not provided. It&#39;s supported only for UPI PayU payments.
     *
     * @return originCountry
     */
    @JsonProperty("originCountry")
    public String getOriginCountry() {
        return originCountry;
    }

    /**
     * Sets originCountry.
     * <p>
     * Field description:
     * Country of origin. Required when catalogId is not provided. It&#39;s supported only for UPI PayU payments.
     *
     * @param originCountry
     */
    @JsonProperty("originCountry")
    public void setOriginCountry(String originCountry) {
        this.originCountry = originCountry;
    }

    /**
     * Sets importerName.
     * <p>
     * Field description:
     * Importer name. Required when catalogId is not provided. It&#39;s supported only for UPI PayU payments.
     *
     * @param importerName
     * @return This {@link WhatsAppInteractiveOrderDetailsOrderItem instance}.
     */
    public WhatsAppInteractiveOrderDetailsOrderItem importerName(String importerName) {
        this.importerName = importerName;
        return this;
    }

    /**
     * Returns importerName.
     * <p>
     * Field description:
     * Importer name. Required when catalogId is not provided. It&#39;s supported only for UPI PayU payments.
     *
     * @return importerName
     */
    @JsonProperty("importerName")
    public String getImporterName() {
        return importerName;
    }

    /**
     * Sets importerName.
     * <p>
     * Field description:
     * Importer name. Required when catalogId is not provided. It&#39;s supported only for UPI PayU payments.
     *
     * @param importerName
     */
    @JsonProperty("importerName")
    public void setImporterName(String importerName) {
        this.importerName = importerName;
    }

    /**
     * Sets importerAddress.
     *
     * @param importerAddress
     * @return This {@link WhatsAppInteractiveOrderDetailsOrderItem instance}.
     */
    public WhatsAppInteractiveOrderDetailsOrderItem importerAddress(
            WhatsAppInteractiveOrderDetailsImporterAddress importerAddress) {
        this.importerAddress = importerAddress;
        return this;
    }

    /**
     * Returns importerAddress.
     *
     * @return importerAddress
     */
    @JsonProperty("importerAddress")
    public WhatsAppInteractiveOrderDetailsImporterAddress getImporterAddress() {
        return importerAddress;
    }

    /**
     * Sets importerAddress.
     *
     * @param importerAddress
     */
    @JsonProperty("importerAddress")
    public void setImporterAddress(WhatsAppInteractiveOrderDetailsImporterAddress importerAddress) {
        this.importerAddress = importerAddress;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WhatsAppInteractiveOrderDetailsOrderItem whatsAppInteractiveOrderDetailsOrderItem =
                (WhatsAppInteractiveOrderDetailsOrderItem) o;
        return Objects.equals(this.retailerId, whatsAppInteractiveOrderDetailsOrderItem.retailerId)
                && Objects.equals(this.name, whatsAppInteractiveOrderDetailsOrderItem.name)
                && Objects.equals(this.amount, whatsAppInteractiveOrderDetailsOrderItem.amount)
                && Objects.equals(this.saleAmount, whatsAppInteractiveOrderDetailsOrderItem.saleAmount)
                && Objects.equals(this.quantity, whatsAppInteractiveOrderDetailsOrderItem.quantity)
                && Objects.equals(this.originCountry, whatsAppInteractiveOrderDetailsOrderItem.originCountry)
                && Objects.equals(this.importerName, whatsAppInteractiveOrderDetailsOrderItem.importerName)
                && Objects.equals(this.importerAddress, whatsAppInteractiveOrderDetailsOrderItem.importerAddress);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                retailerId, name, amount, saleAmount, quantity, originCountry, importerName, importerAddress);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class WhatsAppInteractiveOrderDetailsOrderItem {")
                .append(newLine)
                .append("    retailerId: ")
                .append(toIndentedString(retailerId))
                .append(newLine)
                .append("    name: ")
                .append(toIndentedString(name))
                .append(newLine)
                .append("    amount: ")
                .append(toIndentedString(amount))
                .append(newLine)
                .append("    saleAmount: ")
                .append(toIndentedString(saleAmount))
                .append(newLine)
                .append("    quantity: ")
                .append(toIndentedString(quantity))
                .append(newLine)
                .append("    originCountry: ")
                .append(toIndentedString(originCountry))
                .append(newLine)
                .append("    importerName: ")
                .append(toIndentedString(importerName))
                .append(newLine)
                .append("    importerAddress: ")
                .append(toIndentedString(importerAddress))
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
