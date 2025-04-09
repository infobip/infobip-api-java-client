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
 * Represents WhatsAppWebhookInboundInfectedMessage model.
 */
public class WhatsAppWebhookInboundInfectedMessage extends WhatsAppWebhookInboundMessage {

    private WhatsAppContext context;

    private String malware;

    private WhatsAppWebhookReferral referral;

    /**
     * Constructs a new {@link WhatsAppWebhookInboundInfectedMessage} instance.
     */
    public WhatsAppWebhookInboundInfectedMessage() {
        super("INFECTED_CONTENT");
    }

    /**
     * Sets context.
     *
     * @param context
     * @return This {@link WhatsAppWebhookInboundInfectedMessage instance}.
     */
    public WhatsAppWebhookInboundInfectedMessage context(WhatsAppContext context) {
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
     * Sets malware.
     * <p>
     * Field description:
     * Information about the malware.
     *
     * @param malware
     * @return This {@link WhatsAppWebhookInboundInfectedMessage instance}.
     */
    public WhatsAppWebhookInboundInfectedMessage malware(String malware) {
        this.malware = malware;
        return this;
    }

    /**
     * Returns malware.
     * <p>
     * Field description:
     * Information about the malware.
     *
     * @return malware
     */
    @JsonProperty("malware")
    public String getMalware() {
        return malware;
    }

    /**
     * Sets malware.
     * <p>
     * Field description:
     * Information about the malware.
     *
     * @param malware
     */
    @JsonProperty("malware")
    public void setMalware(String malware) {
        this.malware = malware;
    }

    /**
     * Sets referral.
     *
     * @param referral
     * @return This {@link WhatsAppWebhookInboundInfectedMessage instance}.
     */
    public WhatsAppWebhookInboundInfectedMessage referral(WhatsAppWebhookReferral referral) {
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
        WhatsAppWebhookInboundInfectedMessage whatsAppWebhookInboundInfectedMessage =
                (WhatsAppWebhookInboundInfectedMessage) o;
        return Objects.equals(this.context, whatsAppWebhookInboundInfectedMessage.context)
                && Objects.equals(this.malware, whatsAppWebhookInboundInfectedMessage.malware)
                && Objects.equals(this.referral, whatsAppWebhookInboundInfectedMessage.referral)
                && super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(context, malware, referral, super.hashCode());
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class WhatsAppWebhookInboundInfectedMessage {")
                .append(newLine)
                .append("    ")
                .append(toIndentedString(super.toString()))
                .append(newLine)
                .append("    context: ")
                .append(toIndentedString(context))
                .append(newLine)
                .append("    malware: ")
                .append(toIndentedString(malware))
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
