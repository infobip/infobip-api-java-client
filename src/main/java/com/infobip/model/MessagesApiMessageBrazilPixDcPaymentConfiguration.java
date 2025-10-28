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
 * Represents MessagesApiMessageBrazilPixDcPaymentConfiguration model.
 */
public class MessagesApiMessageBrazilPixDcPaymentConfiguration extends MessagesApiMessagePaymentConfiguration {

    private String id;

    private String name;

    private String code;

    private String merchantName;

    private MessagesApiMessageBrazilPixDcPaymentContentKeyType keyType;

    private String key;

    /**
     * Constructs a new {@link MessagesApiMessageBrazilPixDcPaymentConfiguration} instance.
     */
    public MessagesApiMessageBrazilPixDcPaymentConfiguration() {
        super("BRAZIL_PIX_DC");
    }

    /**
     * Sets id.
     * <p>
     * Field description:
     * Unique identifier of the payment. It can only contain English letters, numbers, underscores, dashes, or dots, and should not exceed 35 characters
     *
     * @param id
     * @return This {@link MessagesApiMessageBrazilPixDcPaymentConfiguration instance}.
     */
    public MessagesApiMessageBrazilPixDcPaymentConfiguration id(String id) {
        this.id = id;
        return this;
    }

    /**
     * Returns id.
     * <p>
     * Field description:
     * Unique identifier of the payment. It can only contain English letters, numbers, underscores, dashes, or dots, and should not exceed 35 characters
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
     * Unique identifier of the payment. It can only contain English letters, numbers, underscores, dashes, or dots, and should not exceed 35 characters
     *
     * @param id
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Sets name.
     * <p>
     * Field description:
     * Name of the WhatsApp payment configuration to be used for this order. Can be omitted for Brazil PIX.
     *
     * @param name
     * @return This {@link MessagesApiMessageBrazilPixDcPaymentConfiguration instance}.
     */
    public MessagesApiMessageBrazilPixDcPaymentConfiguration name(String name) {
        this.name = name;
        return this;
    }

    /**
     * Returns name.
     * <p>
     * Field description:
     * Name of the WhatsApp payment configuration to be used for this order. Can be omitted for Brazil PIX.
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
     * Name of the WhatsApp payment configuration to be used for this order. Can be omitted for Brazil PIX.
     *
     * @param name
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Sets code.
     * <p>
     * Field description:
     * Dynamic Pix code which will be copied by the buyer.
     *
     * @param code
     * @return This {@link MessagesApiMessageBrazilPixDcPaymentConfiguration instance}.
     */
    public MessagesApiMessageBrazilPixDcPaymentConfiguration code(String code) {
        this.code = code;
        return this;
    }

    /**
     * Returns code.
     * <p>
     * Field description:
     * Dynamic Pix code which will be copied by the buyer.
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
     *
     * @param merchantName
     * @return This {@link MessagesApiMessageBrazilPixDcPaymentConfiguration instance}.
     */
    public MessagesApiMessageBrazilPixDcPaymentConfiguration merchantName(String merchantName) {
        this.merchantName = merchantName;
        return this;
    }

    /**
     * Returns merchantName.
     * <p>
     * Field description:
     * Pix account holder name.
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
     *
     * @param merchantName
     */
    @JsonProperty("merchantName")
    public void setMerchantName(String merchantName) {
        this.merchantName = merchantName;
    }

    /**
     * Sets keyType.
     *
     * @param keyType
     * @return This {@link MessagesApiMessageBrazilPixDcPaymentConfiguration instance}.
     */
    public MessagesApiMessageBrazilPixDcPaymentConfiguration keyType(
            MessagesApiMessageBrazilPixDcPaymentContentKeyType keyType) {
        this.keyType = keyType;
        return this;
    }

    /**
     * Returns keyType.
     *
     * @return keyType
     */
    @JsonProperty("keyType")
    public MessagesApiMessageBrazilPixDcPaymentContentKeyType getKeyType() {
        return keyType;
    }

    /**
     * Sets keyType.
     *
     * @param keyType
     */
    @JsonProperty("keyType")
    public void setKeyType(MessagesApiMessageBrazilPixDcPaymentContentKeyType keyType) {
        this.keyType = keyType;
    }

    /**
     * Sets key.
     * <p>
     * Field description:
     * Key to identify the pix user’s account.
     *
     * @param key
     * @return This {@link MessagesApiMessageBrazilPixDcPaymentConfiguration instance}.
     */
    public MessagesApiMessageBrazilPixDcPaymentConfiguration key(String key) {
        this.key = key;
        return this;
    }

    /**
     * Returns key.
     * <p>
     * Field description:
     * Key to identify the pix user’s account.
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
        MessagesApiMessageBrazilPixDcPaymentConfiguration messagesApiMessageBrazilPixDcPaymentConfiguration =
                (MessagesApiMessageBrazilPixDcPaymentConfiguration) o;
        return Objects.equals(this.id, messagesApiMessageBrazilPixDcPaymentConfiguration.id)
                && Objects.equals(this.name, messagesApiMessageBrazilPixDcPaymentConfiguration.name)
                && Objects.equals(this.code, messagesApiMessageBrazilPixDcPaymentConfiguration.code)
                && Objects.equals(this.merchantName, messagesApiMessageBrazilPixDcPaymentConfiguration.merchantName)
                && Objects.equals(this.keyType, messagesApiMessageBrazilPixDcPaymentConfiguration.keyType)
                && Objects.equals(this.key, messagesApiMessageBrazilPixDcPaymentConfiguration.key)
                && super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, code, merchantName, keyType, key, super.hashCode());
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class MessagesApiMessageBrazilPixDcPaymentConfiguration {")
                .append(newLine)
                .append("    ")
                .append(toIndentedString(super.toString()))
                .append(newLine)
                .append("    id: ")
                .append(toIndentedString(id))
                .append(newLine)
                .append("    name: ")
                .append(toIndentedString(name))
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
