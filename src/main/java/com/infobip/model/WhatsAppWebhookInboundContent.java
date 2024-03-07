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
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;

/**
 * Message content.
 */
@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.EXISTING_PROPERTY,
        property = "type",
        visible = true)
@JsonSubTypes({
    @JsonSubTypes.Type(value = WhatsAppWebhookInboundAudioContent.class, name = "AUDIO"),
    @JsonSubTypes.Type(value = WhatsAppWebhookInboundQuickReplyContent.class, name = "BUTTON"),
    @JsonSubTypes.Type(value = WhatsAppWebhookInboundContactsContent.class, name = "CONTACT"),
    @JsonSubTypes.Type(value = WhatsAppWebhookInboundDocumentContent.class, name = "DOCUMENT"),
    @JsonSubTypes.Type(value = WhatsAppWebhookInboundImageContent.class, name = "IMAGE"),
    @JsonSubTypes.Type(value = WhatsAppWebhookInboundInfectedContent.class, name = "INFECTED_CONTENT"),
    @JsonSubTypes.Type(value = WhatsAppWebhookInboundButtonReplyContent.class, name = "INTERACTIVE_BUTTON_REPLY"),
    @JsonSubTypes.Type(value = WhatsAppWebhookInboundExtensionReplyContent.class, name = "INTERACTIVE_EXTENSION_REPLY"),
    @JsonSubTypes.Type(value = WhatsAppWebhookInboundFlowReplyContent.class, name = "INTERACTIVE_FLOW_REPLY"),
    @JsonSubTypes.Type(value = WhatsAppWebhookInboundListReplyContent.class, name = "INTERACTIVE_LIST_REPLY"),
    @JsonSubTypes.Type(
            value = WhatsAppWebhookInboundPaymentConfirmationContent.class,
            name = "INTERACTIVE_PAYMENT_CONFIRMATION"),
    @JsonSubTypes.Type(value = WhatsAppWebhookInboundLocationContent.class, name = "LOCATION"),
    @JsonSubTypes.Type(value = WhatsAppWebhookInboundOrderContent.class, name = "ORDER"),
    @JsonSubTypes.Type(value = WhatsAppWebhookInboundStickerContent.class, name = "STICKER"),
    @JsonSubTypes.Type(value = WhatsAppWebhookInboundTextContent.class, name = "TEXT"),
    @JsonSubTypes.Type(value = WhatsAppWebhookInboundUnsupportedContent.class, name = "UNSUPPORTED"),
    @JsonSubTypes.Type(value = WhatsAppWebhookInboundVideoContent.class, name = "VIDEO"),
    @JsonSubTypes.Type(value = WhatsAppWebhookInboundVoiceContent.class, name = "VOICE"),
})
public abstract class WhatsAppWebhookInboundContent {
    /**
     * Represents type enumeration.
     */
    public enum TypeEnum {
        UNSUPPORTED("UNSUPPORTED"),
        TEXT("TEXT"),
        LOCATION("LOCATION"),
        IMAGE("IMAGE"),
        DOCUMENT("DOCUMENT"),
        AUDIO("AUDIO"),
        VIDEO("VIDEO"),
        VOICE("VOICE"),
        CONTACT("CONTACT"),
        INFECTED_CONTENT("INFECTED_CONTENT"),
        BUTTON("BUTTON"),
        STICKER("STICKER"),
        INTERACTIVE_BUTTON_REPLY("INTERACTIVE_BUTTON_REPLY"),
        INTERACTIVE_LIST_REPLY("INTERACTIVE_LIST_REPLY"),
        INTERACTIVE_EXTENSION_REPLY("INTERACTIVE_EXTENSION_REPLY"),
        INTERACTIVE_FLOW_REPLY("INTERACTIVE_FLOW_REPLY"),
        INTERACTIVE_PAYMENT_CONFIRMATION("INTERACTIVE_PAYMENT_CONFIRMATION"),
        ORDER("ORDER");

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

    protected final TypeEnum type;

    /**
     * Constructs a new {@link WhatsAppWebhookInboundContent} instance.
     */
    public WhatsAppWebhookInboundContent(String type) {
        this.type = TypeEnum.fromValue(type);
    }

    /**
     * Returns type.
     * <p>
     * The field is required.
     *
     * @return type
     */
    @JsonProperty("type")
    public TypeEnum getType() {
        return type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WhatsAppWebhookInboundContent whatsAppWebhookInboundContent = (WhatsAppWebhookInboundContent) o;
        return Objects.equals(this.type, whatsAppWebhookInboundContent.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class WhatsAppWebhookInboundContent {")
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
