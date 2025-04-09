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
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
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
    @JsonSubTypes.Type(value = WhatsAppWebhookInboundAudioMessage.class, name = "AUDIO"),
    @JsonSubTypes.Type(value = WhatsAppWebhookQuickReplyContent.class, name = "BUTTON"),
    @JsonSubTypes.Type(value = WhatsAppWebhookInboundContactMessage.class, name = "CONTACT"),
    @JsonSubTypes.Type(value = WhatsAppWebhookInboundDocumentMessage.class, name = "DOCUMENT"),
    @JsonSubTypes.Type(value = WhatsAppWebhookInboundImageMessage.class, name = "IMAGE"),
    @JsonSubTypes.Type(value = WhatsAppWebhookInboundInfectedMessage.class, name = "INFECTED_CONTENT"),
    @JsonSubTypes.Type(value = WhatsAppWebhookButtonReplyContent.class, name = "INTERACTIVE_BUTTON_REPLY"),
    @JsonSubTypes.Type(value = WhatsAppWebhookFlowReplyContent.class, name = "INTERACTIVE_FLOW_REPLY"),
    @JsonSubTypes.Type(value = WhatsAppWebhookListReplyContent.class, name = "INTERACTIVE_LIST_REPLY"),
    @JsonSubTypes.Type(
            value = WhatsAppWebhookPaymentConfirmationContent.class,
            name = "INTERACTIVE_PAYMENT_CONFIRMATION"),
    @JsonSubTypes.Type(value = WhatsAppWebhookInboundLocationMessage.class, name = "LOCATION"),
    @JsonSubTypes.Type(value = WhatsAppWebhookOrderContent.class, name = "ORDER"),
    @JsonSubTypes.Type(value = WhatsAppWebhookInboundStickerMessage.class, name = "STICKER"),
    @JsonSubTypes.Type(value = WhatsAppWebhookInboundTextMessage.class, name = "TEXT"),
    @JsonSubTypes.Type(value = WhatsAppWebhookInboundUnsupportedMessage.class, name = "UNSUPPORTED"),
    @JsonSubTypes.Type(value = WhatsAppWebhookInboundVideoMessage.class, name = "VIDEO"),
    @JsonSubTypes.Type(value = WhatsAppWebhookInboundVoiceMessage.class, name = "VOICE"),
})
public abstract class WhatsAppWebhookInboundMessage {

    protected final WhatsAppWebhookType type;

    /**
     * Constructs a new {@link WhatsAppWebhookInboundMessage} instance.
     */
    public WhatsAppWebhookInboundMessage(String type) {
        this.type = WhatsAppWebhookType.fromValue(type);
    }

    /**
     * Returns type.
     * <p>
     * The field is required.
     *
     * @return type
     */
    @JsonProperty("type")
    public WhatsAppWebhookType getType() {
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
        WhatsAppWebhookInboundMessage whatsAppWebhookInboundMessage = (WhatsAppWebhookInboundMessage) o;
        return Objects.equals(this.type, whatsAppWebhookInboundMessage.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class WhatsAppWebhookInboundMessage {")
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
