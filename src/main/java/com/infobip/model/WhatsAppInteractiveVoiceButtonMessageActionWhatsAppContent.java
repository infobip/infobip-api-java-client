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
 * Allows you to specify message details.
 */
public class WhatsAppInteractiveVoiceButtonMessageActionWhatsAppContent {

    private String buttonDisplayText;

    private Integer callValidityPeriod;

    private String callContextPayload;

    /**
     * Sets buttonDisplayText.
     * <p>
     * Field description:
     * Text to be displayed on the button.
     *
     * @param buttonDisplayText
     * @return This {@link WhatsAppInteractiveVoiceButtonMessageActionWhatsAppContent instance}.
     */
    public WhatsAppInteractiveVoiceButtonMessageActionWhatsAppContent buttonDisplayText(String buttonDisplayText) {
        this.buttonDisplayText = buttonDisplayText;
        return this;
    }

    /**
     * Returns buttonDisplayText.
     * <p>
     * Field description:
     * Text to be displayed on the button.
     *
     * @return buttonDisplayText
     */
    @JsonProperty("buttonDisplayText")
    public String getButtonDisplayText() {
        return buttonDisplayText;
    }

    /**
     * Sets buttonDisplayText.
     * <p>
     * Field description:
     * Text to be displayed on the button.
     *
     * @param buttonDisplayText
     */
    @JsonProperty("buttonDisplayText")
    public void setButtonDisplayText(String buttonDisplayText) {
        this.buttonDisplayText = buttonDisplayText;
    }

    /**
     * Sets callValidityPeriod.
     * <p>
     * Field description:
     * Time to live for the voice call button in minutes. Must be between 1 and 43200 (30 days). Default value is 10080 (7 days).
     *
     * @param callValidityPeriod
     * @return This {@link WhatsAppInteractiveVoiceButtonMessageActionWhatsAppContent instance}.
     */
    public WhatsAppInteractiveVoiceButtonMessageActionWhatsAppContent callValidityPeriod(Integer callValidityPeriod) {
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
     * @return This {@link WhatsAppInteractiveVoiceButtonMessageActionWhatsAppContent instance}.
     */
    public WhatsAppInteractiveVoiceButtonMessageActionWhatsAppContent callContextPayload(String callContextPayload) {
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
        WhatsAppInteractiveVoiceButtonMessageActionWhatsAppContent
                whatsAppInteractiveVoiceButtonMessageActionWhatsAppContent =
                        (WhatsAppInteractiveVoiceButtonMessageActionWhatsAppContent) o;
        return Objects.equals(
                        this.buttonDisplayText,
                        whatsAppInteractiveVoiceButtonMessageActionWhatsAppContent.buttonDisplayText)
                && Objects.equals(
                        this.callValidityPeriod,
                        whatsAppInteractiveVoiceButtonMessageActionWhatsAppContent.callValidityPeriod)
                && Objects.equals(
                        this.callContextPayload,
                        whatsAppInteractiveVoiceButtonMessageActionWhatsAppContent.callContextPayload);
    }

    @Override
    public int hashCode() {
        return Objects.hash(buttonDisplayText, callValidityPeriod, callContextPayload);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class WhatsAppInteractiveVoiceButtonMessageActionWhatsAppContent {")
                .append(newLine)
                .append("    buttonDisplayText: ")
                .append(toIndentedString(buttonDisplayText))
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
