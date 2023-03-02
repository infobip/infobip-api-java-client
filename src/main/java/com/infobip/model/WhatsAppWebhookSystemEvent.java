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
 * Content of the event.
 */
public class WhatsAppWebhookSystemEvent {

    private String description;

    private String hash;

    /**
     * Indicates type of system event forwarded.
     */
    public enum TypeEnum {
        USER_IDENTITY_CHANGED("user_identity_changed");

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

    private String userNumber;

    /**
     * Sets description.
     * <p>
     * Field description:
     * Description of the event.
     *
     * @param description
     * @return This {@link WhatsAppWebhookSystemEvent instance}.
     */
    public WhatsAppWebhookSystemEvent description(String description) {
        this.description = description;
        return this;
    }

    /**
     * Returns description.
     * <p>
     * Field description:
     * Description of the event.
     *
     * @return description
     */
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    /**
     * Sets description.
     * <p>
     * Field description:
     * Description of the event.
     *
     * @param description
     */
    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Sets hash.
     * <p>
     * Field description:
     * Identity hash.
     *
     * @param hash
     * @return This {@link WhatsAppWebhookSystemEvent instance}.
     */
    public WhatsAppWebhookSystemEvent hash(String hash) {
        this.hash = hash;
        return this;
    }

    /**
     * Returns hash.
     * <p>
     * Field description:
     * Identity hash.
     *
     * @return hash
     */
    @JsonProperty("hash")
    public String getHash() {
        return hash;
    }

    /**
     * Sets hash.
     * <p>
     * Field description:
     * Identity hash.
     *
     * @param hash
     */
    @JsonProperty("hash")
    public void setHash(String hash) {
        this.hash = hash;
    }

    /**
     * Sets type.
     * <p>
     * Field description:
     * Indicates type of system event forwarded.
     *
     * @param type
     * @return This {@link WhatsAppWebhookSystemEvent instance}.
     */
    public WhatsAppWebhookSystemEvent type(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * Returns type.
     * <p>
     * Field description:
     * Indicates type of system event forwarded.
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
     * Indicates type of system event forwarded.
     *
     * @param type
     */
    @JsonProperty("type")
    public void setType(TypeEnum type) {
        this.type = type;
    }

    /**
     * Sets userNumber.
     * <p>
     * Field description:
     * End user&#39;s number. Must be in international format.
     *
     * @param userNumber
     * @return This {@link WhatsAppWebhookSystemEvent instance}.
     */
    public WhatsAppWebhookSystemEvent userNumber(String userNumber) {
        this.userNumber = userNumber;
        return this;
    }

    /**
     * Returns userNumber.
     * <p>
     * Field description:
     * End user&#39;s number. Must be in international format.
     *
     * @return userNumber
     */
    @JsonProperty("userNumber")
    public String getUserNumber() {
        return userNumber;
    }

    /**
     * Sets userNumber.
     * <p>
     * Field description:
     * End user&#39;s number. Must be in international format.
     *
     * @param userNumber
     */
    @JsonProperty("userNumber")
    public void setUserNumber(String userNumber) {
        this.userNumber = userNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WhatsAppWebhookSystemEvent whatsAppWebhookSystemEvent = (WhatsAppWebhookSystemEvent) o;
        return Objects.equals(this.description, whatsAppWebhookSystemEvent.description)
                && Objects.equals(this.hash, whatsAppWebhookSystemEvent.hash)
                && Objects.equals(this.type, whatsAppWebhookSystemEvent.type)
                && Objects.equals(this.userNumber, whatsAppWebhookSystemEvent.userNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(description, hash, type, userNumber);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class WhatsAppWebhookSystemEvent {")
                .append(newLine)
                .append("    description: ")
                .append(toIndentedString(description))
                .append(newLine)
                .append("    hash: ")
                .append(toIndentedString(hash))
                .append(newLine)
                .append("    type: ")
                .append(toIndentedString(type))
                .append(newLine)
                .append("    userNumber: ")
                .append(toIndentedString(userNumber))
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
