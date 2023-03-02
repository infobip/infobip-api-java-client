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
 * Array of phones information.
 */
public class WhatsAppPhoneContent {

    private String phone;

    private WhatsAppPhoneType type;

    private String waId;

    /**
     * Sets phone.
     * <p>
     * Field description:
     * Contact&#39;s phone number.
     *
     * @param phone
     * @return This {@link WhatsAppPhoneContent instance}.
     */
    public WhatsAppPhoneContent phone(String phone) {
        this.phone = phone;
        return this;
    }

    /**
     * Returns phone.
     * <p>
     * Field description:
     * Contact&#39;s phone number.
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
     * Contact&#39;s phone number.
     *
     * @param phone
     */
    @JsonProperty("phone")
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * Sets type.
     *
     * @param type
     * @return This {@link WhatsAppPhoneContent instance}.
     */
    public WhatsAppPhoneContent type(WhatsAppPhoneType type) {
        this.type = type;
        return this;
    }

    /**
     * Returns type.
     *
     * @return type
     */
    @JsonProperty("type")
    public WhatsAppPhoneType getType() {
        return type;
    }

    /**
     * Sets type.
     *
     * @param type
     */
    @JsonProperty("type")
    public void setType(WhatsAppPhoneType type) {
        this.type = type;
    }

    /**
     * Sets waId.
     * <p>
     * Field description:
     * Contact&#39;s WhatsApp ID.
     *
     * @param waId
     * @return This {@link WhatsAppPhoneContent instance}.
     */
    public WhatsAppPhoneContent waId(String waId) {
        this.waId = waId;
        return this;
    }

    /**
     * Returns waId.
     * <p>
     * Field description:
     * Contact&#39;s WhatsApp ID.
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
     * Contact&#39;s WhatsApp ID.
     *
     * @param waId
     */
    @JsonProperty("waId")
    public void setWaId(String waId) {
        this.waId = waId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WhatsAppPhoneContent whatsAppPhoneContent = (WhatsAppPhoneContent) o;
        return Objects.equals(this.phone, whatsAppPhoneContent.phone)
                && Objects.equals(this.type, whatsAppPhoneContent.type)
                && Objects.equals(this.waId, whatsAppPhoneContent.waId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(phone, type, waId);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class WhatsAppPhoneContent {")
                .append(newLine)
                .append("    phone: ")
                .append(toIndentedString(phone))
                .append(newLine)
                .append("    type: ")
                .append(toIndentedString(type))
                .append(newLine)
                .append("    waId: ")
                .append(toIndentedString(waId))
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
