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
 * Represents WhatsAppWebhookInboundMessage model.
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
    @JsonSubTypes.Type(value = WhatsAppWebhookButtonReplyContent.class, name = "INTERACTIVE_BUTTON_REPLY"),
    @JsonSubTypes.Type(value = WhatsAppWebhookListReplyContent.class, name = "INTERACTIVE_LIST_REPLY"),
    @JsonSubTypes.Type(
            value = WhatsAppWebhookPaymentConfirmationContent.class,
            name = "INTERACTIVE_PAYMENT_CONFIRMATION"),
    @JsonSubTypes.Type(value = WhatsAppWebhookInboundLocationMessage.class, name = "LOCATION"),
    @JsonSubTypes.Type(value = WhatsAppWebhookOrderContent.class, name = "ORDER"),
    @JsonSubTypes.Type(value = WhatsAppWebhookInboundStickerMessage.class, name = "STICKER"),
    @JsonSubTypes.Type(value = WhatsAppWebhookInboundTextMessage.class, name = "TEXT"),
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

    private WhatsAppContext context;

    private WhatsAppWebhookIdentity identity;

    private WhatsAppWebhookReferral referral;

    /**
     * Returns type.
     *
     * @return type
     */
    @JsonProperty("type")
    public WhatsAppWebhookType getType() {
        return type;
    }

    /**
     * Sets context.
     *
     * @param context
     * @return This {@link WhatsAppWebhookInboundMessage instance}.
     */
    public WhatsAppWebhookInboundMessage context(WhatsAppContext context) {
        this.context = context;
        return this;
    }

    /**
     * Returns context.
     *
     * @return context
     */
    @JsonProperty("context")
    public WhatsAppContext getContext() {
        return context;
    }

    /**
     * Sets context.
     *
     * @param context
     */
    @JsonProperty("context")
    public void setContext(WhatsAppContext context) {
        this.context = context;
    }

    /**
     * Sets identity.
     *
     * @param identity
     * @return This {@link WhatsAppWebhookInboundMessage instance}.
     */
    public WhatsAppWebhookInboundMessage identity(WhatsAppWebhookIdentity identity) {
        this.identity = identity;
        return this;
    }

    /**
     * Returns identity.
     *
     * @return identity
     */
    @JsonProperty("identity")
    public WhatsAppWebhookIdentity getIdentity() {
        return identity;
    }

    /**
     * Sets identity.
     *
     * @param identity
     */
    @JsonProperty("identity")
    public void setIdentity(WhatsAppWebhookIdentity identity) {
        this.identity = identity;
    }

    /**
     * Sets referral.
     *
     * @param referral
     * @return This {@link WhatsAppWebhookInboundMessage instance}.
     */
    public WhatsAppWebhookInboundMessage referral(WhatsAppWebhookReferral referral) {
        this.referral = referral;
        return this;
    }

    /**
     * Returns referral.
     *
     * @return referral
     */
    @JsonProperty("referral")
    public WhatsAppWebhookReferral getReferral() {
        return referral;
    }

    /**
     * Sets referral.
     *
     * @param referral
     */
    @JsonProperty("referral")
    public void setReferral(WhatsAppWebhookReferral referral) {
        this.referral = referral;
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
        return Objects.equals(this.type, whatsAppWebhookInboundMessage.type)
                && Objects.equals(this.context, whatsAppWebhookInboundMessage.context)
                && Objects.equals(this.identity, whatsAppWebhookInboundMessage.identity)
                && Objects.equals(this.referral, whatsAppWebhookInboundMessage.referral);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, context, identity, referral);
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
                .append("    context: ")
                .append(toIndentedString(context))
                .append(newLine)
                .append("    identity: ")
                .append(toIndentedString(identity))
                .append(newLine)
                .append("    referral: ")
                .append(toIndentedString(referral))
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
