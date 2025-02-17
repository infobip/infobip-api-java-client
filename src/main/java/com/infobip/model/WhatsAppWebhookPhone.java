/*
 * This class is auto generated from the Infobip OpenAPI specification
 * through the OpenAPI Specification Client API libraries (Re)Generator (OSCAR),
 * powered by the OpenAPI Generator (https://openapi-generator.tech).
 *
 * Do not edit manually. To learn how to raise an issue, see the CONTRIBUTING guide
 * or contact us @ support@infobip.com.
 */

package com.infobip.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;

/**
 * Represents WhatsAppWebhookPhone model.
 */
public class WhatsAppWebhookPhone {

    private String phone;

    private String waId;

    /**
     * Type of a phone.
     */
    public enum TypeEnum {
        CELL("CELL"),
        MAIN("MAIN"),
        IPHONE("IPHONE"),
        HOME("HOME"),
        WORK("WORK");

        private String value;

        TypeEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static TypeEnum fromValue(String value) {
            for (TypeEnum enumElement : TypeEnum.values()) {
                if (enumElement.value.equals(value)) {
                    return enumElement;
                }
            }
            throw new IllegalArgumentException("Unexpected enum value '" + value + "'.");
        }
    }

    private TypeEnum type;

    /**
     * Sets phone.
     * <p>
     * Field description:
     * Contact phone number.
     *
     * @param phone
     * @return This {@link WhatsAppWebhookPhone instance}.
     */
    public WhatsAppWebhookPhone phone(String phone) {
        this.phone = phone;
        return this;
    }

    /**
     * Returns phone.
     * <p>
     * Field description:
     * Contact phone number.
     *
     * @return phone
     */
    @JsonProperty("phone")
    public String getPhone() {
        return phone;
    }

    /**
     * Sets phone.
     * <p>
     * Field description:
     * Contact phone number.
     *
     * @param phone
     */
    @JsonProperty("phone")
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * Sets waId.
     * <p>
     * Field description:
     * WhatsApp ID.
     *
     * @param waId
     * @return This {@link WhatsAppWebhookPhone instance}.
     */
    public WhatsAppWebhookPhone waId(String waId) {
        this.waId = waId;
        return this;
    }

    /**
     * Returns waId.
     * <p>
     * Field description:
     * WhatsApp ID.
     *
     * @return waId
     */
    @JsonProperty("waId")
    public String getWaId() {
        return waId;
    }

    /**
     * Sets waId.
     * <p>
     * Field description:
     * WhatsApp ID.
     *
     * @param waId
     */
    @JsonProperty("waId")
    public void setWaId(String waId) {
        this.waId = waId;
    }

    /**
     * Sets type.
     * <p>
     * Field description:
     * Type of a phone.
     *
     * @param type
     * @return This {@link WhatsAppWebhookPhone instance}.
     */
    public WhatsAppWebhookPhone type(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * Returns type.
     * <p>
     * Field description:
     * Type of a phone.
     *
     * @return type
     */
    @JsonProperty("type")
    public TypeEnum getType() {
        return type;
    }

    /**
     * Sets type.
     * <p>
     * Field description:
     * Type of a phone.
     *
     * @param type
     */
    @JsonProperty("type")
    public void setType(TypeEnum type) {
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WhatsAppWebhookPhone whatsAppWebhookPhone = (WhatsAppWebhookPhone) o;
        return Objects.equals(this.phone, whatsAppWebhookPhone.phone)
                && Objects.equals(this.waId, whatsAppWebhookPhone.waId)
                && Objects.equals(this.type, whatsAppWebhookPhone.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(phone, waId, type);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class WhatsAppWebhookPhone {")
                .append(newLine)
                .append("    phone: ")
                .append(toIndentedString(phone))
                .append(newLine)
                .append("    waId: ")
                .append(toIndentedString(waId))
                .append(newLine)
                .append("    type: ")
                .append(toIndentedString(type))
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
