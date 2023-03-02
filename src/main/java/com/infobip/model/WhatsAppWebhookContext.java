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
 * Information about the message to which the end user responded.
 */
public class WhatsAppWebhookContext {

    private String id;

    private String from;

    private WhatsAppWebhookReferredProduct referredProduct;

    /**
     * Sets id.
     * <p>
     * Field description:
     * MessageId of the message to which the end user responded.
     *
     * @param id
     * @return This {@link WhatsAppWebhookContext instance}.
     */
    public WhatsAppWebhookContext id(String id) {
        this.id = id;
        return this;
    }

    /**
     * Returns id.
     * <p>
     * Field description:
     * MessageId of the message to which the end user responded.
     *
     * @return id
     */
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    /**
     * Sets id.
     * <p>
     * Field description:
     * MessageId of the message to which the end user responded.
     *
     * @param id
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Sets from.
     * <p>
     * Field description:
     * End user&#39;s phone number.
     *
     * @param from
     * @return This {@link WhatsAppWebhookContext instance}.
     */
    public WhatsAppWebhookContext from(String from) {
        this.from = from;
        return this;
    }

    /**
     * Returns from.
     * <p>
     * Field description:
     * End user&#39;s phone number.
     *
     * @return from
     */
    @JsonProperty("from")
    public String getFrom() {
        return from;
    }

    /**
     * Sets from.
     * <p>
     * Field description:
     * End user&#39;s phone number.
     *
     * @param from
     */
    @JsonProperty("from")
    public void setFrom(String from) {
        this.from = from;
    }

    /**
     * Sets referredProduct.
     *
     * @param referredProduct
     * @return This {@link WhatsAppWebhookContext instance}.
     */
    public WhatsAppWebhookContext referredProduct(WhatsAppWebhookReferredProduct referredProduct) {
        this.referredProduct = referredProduct;
        return this;
    }

    /**
     * Returns referredProduct.
     *
     * @return referredProduct
     */
    @JsonProperty("referredProduct")
    public WhatsAppWebhookReferredProduct getReferredProduct() {
        return referredProduct;
    }

    /**
     * Sets referredProduct.
     *
     * @param referredProduct
     */
    @JsonProperty("referredProduct")
    public void setReferredProduct(WhatsAppWebhookReferredProduct referredProduct) {
        this.referredProduct = referredProduct;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WhatsAppWebhookContext whatsAppWebhookContext = (WhatsAppWebhookContext) o;
        return Objects.equals(this.id, whatsAppWebhookContext.id)
                && Objects.equals(this.from, whatsAppWebhookContext.from)
                && Objects.equals(this.referredProduct, whatsAppWebhookContext.referredProduct);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, from, referredProduct);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class WhatsAppWebhookContext {")
                .append(newLine)
                .append("    id: ")
                .append(toIndentedString(id))
                .append(newLine)
                .append("    from: ")
                .append(toIndentedString(from))
                .append(newLine)
                .append("    referredProduct: ")
                .append(toIndentedString(referredProduct))
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
