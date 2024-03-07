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
public class WhatsAppContext {

    private String from;

    private String id;

    private String groupId;

    private WhatsAppReferredProduct referredProduct;

    /**
     * Sets from.
     * <p>
     * Field description:
     * End user&#39;s phone number.
     *
     * @param from
     * @return This {@link WhatsAppContext instance}.
     */
    public WhatsAppContext from(String from) {
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
     * Sets id.
     * <p>
     * Field description:
     * MessageId of the message to which the end user responded.
     *
     * @param id
     * @return This {@link WhatsAppContext instance}.
     */
    public WhatsAppContext id(String id) {
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
     * Sets groupId.
     * <p>
     * Field description:
     * GroupId of the message to which the end user responded.
     *
     * @param groupId
     * @return This {@link WhatsAppContext instance}.
     */
    public WhatsAppContext groupId(String groupId) {
        this.groupId = groupId;
        return this;
    }

    /**
     * Returns groupId.
     * <p>
     * Field description:
     * GroupId of the message to which the end user responded.
     *
     * @return groupId
     */
    @JsonProperty("groupId")
    public String getGroupId() {
        return groupId;
    }

    /**
     * Sets groupId.
     * <p>
     * Field description:
     * GroupId of the message to which the end user responded.
     *
     * @param groupId
     */
    @JsonProperty("groupId")
    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    /**
     * Sets referredProduct.
     *
     * @param referredProduct
     * @return This {@link WhatsAppContext instance}.
     */
    public WhatsAppContext referredProduct(WhatsAppReferredProduct referredProduct) {
        this.referredProduct = referredProduct;
        return this;
    }

    /**
     * Returns referredProduct.
     *
     * @return referredProduct
     */
    @JsonProperty("referredProduct")
    public WhatsAppReferredProduct getReferredProduct() {
        return referredProduct;
    }

    /**
     * Sets referredProduct.
     *
     * @param referredProduct
     */
    @JsonProperty("referredProduct")
    public void setReferredProduct(WhatsAppReferredProduct referredProduct) {
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
        WhatsAppContext whatsAppContext = (WhatsAppContext) o;
        return Objects.equals(this.from, whatsAppContext.from)
                && Objects.equals(this.id, whatsAppContext.id)
                && Objects.equals(this.groupId, whatsAppContext.groupId)
                && Objects.equals(this.referredProduct, whatsAppContext.referredProduct);
    }

    @Override
    public int hashCode() {
        return Objects.hash(from, id, groupId, referredProduct);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class WhatsAppContext {")
                .append(newLine)
                .append("    from: ")
                .append(toIndentedString(from))
                .append(newLine)
                .append("    id: ")
                .append(toIndentedString(id))
                .append(newLine)
                .append("    groupId: ")
                .append(toIndentedString(groupId))
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
