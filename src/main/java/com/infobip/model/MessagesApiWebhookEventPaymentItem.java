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
 * Items information included in the incoming message.
 */
public class MessagesApiWebhookEventPaymentItem {

    private String name;

    private Double amount;

    private String retailerId;

    private String catalogId;

    /**
     * Sets name.
     * <p>
     * Field description:
     * (Apple specific) A short, localized description of the item.
     *
     * @param name
     * @return This {@link MessagesApiWebhookEventPaymentItem instance}.
     */
    public MessagesApiWebhookEventPaymentItem name(String name) {
        this.name = name;
        return this;
    }

    /**
     * Returns name.
     * <p>
     * Field description:
     * (Apple specific) A short, localized description of the item.
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
     * (Apple specific) A short, localized description of the item.
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
     * Field description:
     * (Apple specific) The monetary amount of the item.
     *
     * @param amount
     * @return This {@link MessagesApiWebhookEventPaymentItem instance}.
     */
    public MessagesApiWebhookEventPaymentItem amount(Double amount) {
        this.amount = amount;
        return this;
    }

    /**
     * Returns amount.
     * <p>
     * Field description:
     * (Apple specific) The monetary amount of the item.
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
     * (Apple specific) The monetary amount of the item.
     *
     * @param amount
     */
    @JsonProperty("amount")
    public void setAmount(Double amount) {
        this.amount = amount;
    }

    /**
     * Sets retailerId.
     * <p>
     * Field description:
     * (WhatsApp specific) Product unique identifier, as defined in catalog.
     *
     * @param retailerId
     * @return This {@link MessagesApiWebhookEventPaymentItem instance}.
     */
    public MessagesApiWebhookEventPaymentItem retailerId(String retailerId) {
        this.retailerId = retailerId;
        return this;
    }

    /**
     * Returns retailerId.
     * <p>
     * Field description:
     * (WhatsApp specific) Product unique identifier, as defined in catalog.
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
     * (WhatsApp specific) Product unique identifier, as defined in catalog.
     *
     * @param retailerId
     */
    @JsonProperty("retailerId")
    public void setRetailerId(String retailerId) {
        this.retailerId = retailerId;
    }

    /**
     * Sets catalogId.
     * <p>
     * Field description:
     * (WhatsApp specific) The ID that uniquely identifies the catalog registered with Facebook, connected to the WhatsApp Business Account (WABA) the sender belongs to.
     *
     * @param catalogId
     * @return This {@link MessagesApiWebhookEventPaymentItem instance}.
     */
    public MessagesApiWebhookEventPaymentItem catalogId(String catalogId) {
        this.catalogId = catalogId;
        return this;
    }

    /**
     * Returns catalogId.
     * <p>
     * Field description:
     * (WhatsApp specific) The ID that uniquely identifies the catalog registered with Facebook, connected to the WhatsApp Business Account (WABA) the sender belongs to.
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
     * (WhatsApp specific) The ID that uniquely identifies the catalog registered with Facebook, connected to the WhatsApp Business Account (WABA) the sender belongs to.
     *
     * @param catalogId
     */
    @JsonProperty("catalogId")
    public void setCatalogId(String catalogId) {
        this.catalogId = catalogId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MessagesApiWebhookEventPaymentItem messagesApiWebhookEventPaymentItem = (MessagesApiWebhookEventPaymentItem) o;
        return Objects.equals(this.name, messagesApiWebhookEventPaymentItem.name)
                && Objects.equals(this.amount, messagesApiWebhookEventPaymentItem.amount)
                && Objects.equals(this.retailerId, messagesApiWebhookEventPaymentItem.retailerId)
                && Objects.equals(this.catalogId, messagesApiWebhookEventPaymentItem.catalogId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, amount, retailerId, catalogId);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class MessagesApiWebhookEventPaymentItem {")
                .append(newLine)
                .append("    name: ")
                .append(toIndentedString(name))
                .append(newLine)
                .append("    amount: ")
                .append(toIndentedString(amount))
                .append(newLine)
                .append("    retailerId: ")
                .append(toIndentedString(retailerId))
                .append(newLine)
                .append("    catalogId: ")
                .append(toIndentedString(catalogId))
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
