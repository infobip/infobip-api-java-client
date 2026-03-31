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
 * The content object to build a message that will be sent.
 */
public class WhatsAppInteractiveVoiceButtonContent {

    private WhatsAppInteractiveBodyWhatsAppContent body;

    private WhatsAppInteractiveVoiceButtonMessageActionWhatsAppContent action;

    /**
     * Sets body.
     * <p>
     * The field is required.
     *
     * @param body
     * @return This {@link WhatsAppInteractiveVoiceButtonContent instance}.
     */
    public WhatsAppInteractiveVoiceButtonContent body(WhatsAppInteractiveBodyWhatsAppContent body) {
        this.body = body;
        return this;
    }

    /**
     * Returns body.
     * <p>
     * The field is required.
     *
     * @return body
     */
    @JsonProperty("body")
    public WhatsAppInteractiveBodyWhatsAppContent getBody() {
        return body;
    }

    /**
     * Sets body.
     * <p>
     * The field is required.
     *
     * @param body
     */
    @JsonProperty("body")
    public void setBody(WhatsAppInteractiveBodyWhatsAppContent body) {
        this.body = body;
    }

    /**
     * Sets action.
     *
     * @param action
     * @return This {@link WhatsAppInteractiveVoiceButtonContent instance}.
     */
    public WhatsAppInteractiveVoiceButtonContent action(
            WhatsAppInteractiveVoiceButtonMessageActionWhatsAppContent action) {
        this.action = action;
        return this;
    }

    /**
     * Returns action.
     *
     * @return action
     */
    @JsonProperty("action")
    public WhatsAppInteractiveVoiceButtonMessageActionWhatsAppContent getAction() {
        return action;
    }

    /**
     * Sets action.
     *
     * @param action
     */
    @JsonProperty("action")
    public void setAction(WhatsAppInteractiveVoiceButtonMessageActionWhatsAppContent action) {
        this.action = action;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WhatsAppInteractiveVoiceButtonContent whatsAppInteractiveVoiceButtonContent =
                (WhatsAppInteractiveVoiceButtonContent) o;
        return Objects.equals(this.body, whatsAppInteractiveVoiceButtonContent.body)
                && Objects.equals(this.action, whatsAppInteractiveVoiceButtonContent.action);
    }

    @Override
    public int hashCode() {
        return Objects.hash(body, action);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class WhatsAppInteractiveVoiceButtonContent {")
                .append(newLine)
                .append("    body: ")
                .append(toIndentedString(body))
                .append(newLine)
                .append("    action: ")
                .append(toIndentedString(action))
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
