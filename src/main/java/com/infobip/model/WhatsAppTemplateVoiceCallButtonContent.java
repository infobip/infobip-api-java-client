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
 * Represents WhatsAppTemplateVoiceCallButtonContent model.
 */
public class WhatsAppTemplateVoiceCallButtonContent extends WhatsAppTemplateButtonContent {

    private Integer callValidityPeriod;

    private String callContextPayload;

    /**
     * Constructs a new {@link WhatsAppTemplateVoiceCallButtonContent} instance.
     */
    public WhatsAppTemplateVoiceCallButtonContent() {
        super("VOICE_CALL");
    }

    /**
     * Sets callValidityPeriod.
     * <p>
     * Field description:
     * Time to live for the voice call button in minutes. Must be between 1 and 43200 (30 days). Default value is 10080 (7 days).
     *
     * @param callValidityPeriod
     * @return This {@link WhatsAppTemplateVoiceCallButtonContent instance}.
     */
    public WhatsAppTemplateVoiceCallButtonContent callValidityPeriod(Integer callValidityPeriod) {
        this.callValidityPeriod = callValidityPeriod;
        return this;
    }

    /**
     * Returns callValidityPeriod.
     * <p>
     * Field description:
     * Time to live for the voice call button in minutes. Must be between 1 and 43200 (30 days). Default value is 10080 (7 days).
     *
     * @return callValidityPeriod
     */
    @JsonProperty("callValidityPeriod")
    public Integer getCallValidityPeriod() {
        return callValidityPeriod;
    }

    /**
     * Sets callValidityPeriod.
     * <p>
     * Field description:
     * Time to live for the voice call button in minutes. Must be between 1 and 43200 (30 days). Default value is 10080 (7 days).
     *
     * @param callValidityPeriod
     */
    @JsonProperty("callValidityPeriod")
    public void setCallValidityPeriod(Integer callValidityPeriod) {
        this.callValidityPeriod = callValidityPeriod;
    }

    /**
     * Sets callContextPayload.
     * <p>
     * Field description:
     * Payload data sent with the button. Can be retrieved from the call webhook.
     *
     * @param callContextPayload
     * @return This {@link WhatsAppTemplateVoiceCallButtonContent instance}.
     */
    public WhatsAppTemplateVoiceCallButtonContent callContextPayload(String callContextPayload) {
        this.callContextPayload = callContextPayload;
        return this;
    }

    /**
     * Returns callContextPayload.
     * <p>
     * Field description:
     * Payload data sent with the button. Can be retrieved from the call webhook.
     *
     * @return callContextPayload
     */
    @JsonProperty("callContextPayload")
    public String getCallContextPayload() {
        return callContextPayload;
    }

    /**
     * Sets callContextPayload.
     * <p>
     * Field description:
     * Payload data sent with the button. Can be retrieved from the call webhook.
     *
     * @param callContextPayload
     */
    @JsonProperty("callContextPayload")
    public void setCallContextPayload(String callContextPayload) {
        this.callContextPayload = callContextPayload;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WhatsAppTemplateVoiceCallButtonContent whatsAppTemplateVoiceCallButtonContent =
                (WhatsAppTemplateVoiceCallButtonContent) o;
        return Objects.equals(this.callValidityPeriod, whatsAppTemplateVoiceCallButtonContent.callValidityPeriod)
                && Objects.equals(this.callContextPayload, whatsAppTemplateVoiceCallButtonContent.callContextPayload)
                && super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(callValidityPeriod, callContextPayload, super.hashCode());
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class WhatsAppTemplateVoiceCallButtonContent {")
                .append(newLine)
                .append("    ")
                .append(toIndentedString(super.toString()))
                .append(newLine)
                .append("    callValidityPeriod: ")
                .append(toIndentedString(callValidityPeriod))
                .append(newLine)
                .append("    callContextPayload: ")
                .append(toIndentedString(callContextPayload))
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
