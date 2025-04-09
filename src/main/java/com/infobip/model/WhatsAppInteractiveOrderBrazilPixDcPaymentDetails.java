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
 * Represents WhatsAppInteractiveOrderBrazilPixDcPaymentDetails model.
 */
public class WhatsAppInteractiveOrderBrazilPixDcPaymentDetails extends WhatsAppInteractiveAllowedOrderPaymentDetails {

    private String id;

    private String code;

    private String merchantName;

    private WhatsAppPixKeyType keyType;

    private String key;

    /**
     * Constructs a new {@link WhatsAppInteractiveOrderBrazilPixDcPaymentDetails} instance.
     */
    public WhatsAppInteractiveOrderBrazilPixDcPaymentDetails() {
        super("BRAZIL_PIX_DC");
    }

    /**
     * Sets id.
     * <p>
     * Field description:
     * Unique identifier of the payment.
     * <p>
     * The field is required.
     *
     * @param id
     * @return This {@link WhatsAppInteractiveOrderBrazilPixDcPaymentDetails instance}.
     */
    public WhatsAppInteractiveOrderBrazilPixDcPaymentDetails id(String id) {
        this.id = id;
        return this;
    }

    /**
     * Returns id.
     * <p>
     * Field description:
     * Unique identifier of the payment.
     * <p>
     * The field is required.
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
     * Unique identifier of the payment.
     * <p>
     * The field is required.
     *
     * @param id
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Sets code.
     * <p>
     * Field description:
     * Dynamic Pix code which will be copied by the buyer.
     * <p>
     * The field is required.
     *
     * @param code
     * @return This {@link WhatsAppInteractiveOrderBrazilPixDcPaymentDetails instance}.
     */
    public WhatsAppInteractiveOrderBrazilPixDcPaymentDetails code(String code) {
        this.code = code;
        return this;
    }

    /**
     * Returns code.
     * <p>
     * Field description:
     * Dynamic Pix code which will be copied by the buyer.
     * <p>
     * The field is required.
     *
     * @return code
     */
    @JsonProperty("code")
    public String getCode() {
        return code;
    }

    /**
     * Sets code.
     * <p>
     * Field description:
     * Dynamic Pix code which will be copied by the buyer.
     * <p>
     * The field is required.
     *
     * @param code
     */
    @JsonProperty("code")
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * Sets merchantName.
     * <p>
     * Field description:
     * Pix account holder name.
     * <p>
     * The field is required.
     *
     * @param merchantName
     * @return This {@link WhatsAppInteractiveOrderBrazilPixDcPaymentDetails instance}.
     */
    public WhatsAppInteractiveOrderBrazilPixDcPaymentDetails merchantName(String merchantName) {
        this.merchantName = merchantName;
        return this;
    }

    /**
     * Returns merchantName.
     * <p>
     * Field description:
     * Pix account holder name.
     * <p>
     * The field is required.
     *
     * @return merchantName
     */
    @JsonProperty("merchantName")
    public String getMerchantName() {
        return merchantName;
    }

    /**
     * Sets merchantName.
     * <p>
     * Field description:
     * Pix account holder name.
     * <p>
     * The field is required.
     *
     * @param merchantName
     */
    @JsonProperty("merchantName")
    public void setMerchantName(String merchantName) {
        this.merchantName = merchantName;
    }

    /**
     * Sets keyType.
     * <p>
     * The field is required.
     *
     * @param keyType
     * @return This {@link WhatsAppInteractiveOrderBrazilPixDcPaymentDetails instance}.
     */
    public WhatsAppInteractiveOrderBrazilPixDcPaymentDetails keyType(WhatsAppPixKeyType keyType) {
        this.keyType = keyType;
        return this;
    }

    /**
     * Returns keyType.
     * <p>
     * The field is required.
     *
     * @return keyType
     */
    @JsonProperty("keyType")
    public WhatsAppPixKeyType getKeyType() {
        return keyType;
    }

    /**
     * Sets keyType.
     * <p>
     * The field is required.
     *
     * @param keyType
     */
    @JsonProperty("keyType")
    public void setKeyType(WhatsAppPixKeyType keyType) {
        this.keyType = keyType;
    }

    /**
     * Sets key.
     * <p>
     * Field description:
     * Key to identify the pix user’s account.
     * <p>
     * The field is required.
     *
     * @param key
     * @return This {@link WhatsAppInteractiveOrderBrazilPixDcPaymentDetails instance}.
     */
    public WhatsAppInteractiveOrderBrazilPixDcPaymentDetails key(String key) {
        this.key = key;
        return this;
    }

    /**
     * Returns key.
     * <p>
     * Field description:
     * Key to identify the pix user’s account.
     * <p>
     * The field is required.
     *
     * @return key
     */
    @JsonProperty("key")
    public String getKey() {
        return key;
    }

    /**
     * Sets key.
     * <p>
     * Field description:
     * Key to identify the pix user’s account.
     * <p>
     * The field is required.
     *
     * @param key
     */
    @JsonProperty("key")
    public void setKey(String key) {
        this.key = key;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WhatsAppInteractiveOrderBrazilPixDcPaymentDetails whatsAppInteractiveOrderBrazilPixDcPaymentDetails =
                (WhatsAppInteractiveOrderBrazilPixDcPaymentDetails) o;
        return Objects.equals(this.id, whatsAppInteractiveOrderBrazilPixDcPaymentDetails.id)
                && Objects.equals(this.code, whatsAppInteractiveOrderBrazilPixDcPaymentDetails.code)
                && Objects.equals(this.merchantName, whatsAppInteractiveOrderBrazilPixDcPaymentDetails.merchantName)
                && Objects.equals(this.keyType, whatsAppInteractiveOrderBrazilPixDcPaymentDetails.keyType)
                && Objects.equals(this.key, whatsAppInteractiveOrderBrazilPixDcPaymentDetails.key)
                && super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, code, merchantName, keyType, key, super.hashCode());
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class WhatsAppInteractiveOrderBrazilPixDcPaymentDetails {")
                .append(newLine)
                .append("    ")
                .append(toIndentedString(super.toString()))
                .append(newLine)
                .append("    id: ")
                .append(toIndentedString(id))
                .append(newLine)
                .append("    code: ")
                .append(toIndentedString(code))
                .append(newLine)
                .append("    merchantName: ")
                .append(toIndentedString(merchantName))
                .append(newLine)
                .append("    keyType: ")
                .append(toIndentedString(keyType))
                .append(newLine)
                .append("    key: ")
                .append(toIndentedString(key))
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
