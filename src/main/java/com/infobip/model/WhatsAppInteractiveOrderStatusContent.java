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
public class WhatsAppInteractiveOrderStatusContent {

    private WhatsAppInteractiveOrderStatusActionContent action;

    private WhatsAppInteractiveBodyContent body;

    private WhatsAppInteractiveFooterContent footer;

    /**
     * Sets action.
     * <p>
     * The field is required.
     *
     * @param action
     * @return This {@link WhatsAppInteractiveOrderStatusContent instance}.
     */
    public WhatsAppInteractiveOrderStatusContent action(WhatsAppInteractiveOrderStatusActionContent action) {
        this.action = action;
        return this;
    }

    /**
     * Returns action.
     * <p>
     * The field is required.
     *
     * @return action
     */
    @JsonProperty("action")
    public WhatsAppInteractiveOrderStatusActionContent getAction() {
        return action;
    }

    /**
     * Sets action.
     * <p>
     * The field is required.
     *
     * @param action
     */
    @JsonProperty("action")
    public void setAction(WhatsAppInteractiveOrderStatusActionContent action) {
        this.action = action;
    }

    /**
     * Sets body.
     *
     * @param body
     * @return This {@link WhatsAppInteractiveOrderStatusContent instance}.
     */
    public WhatsAppInteractiveOrderStatusContent body(WhatsAppInteractiveBodyContent body) {
        this.body = body;
        return this;
    }

    /**
     * Returns body.
     *
     * @return body
     */
    @JsonProperty("body")
    public WhatsAppInteractiveBodyContent getBody() {
        return body;
    }

    /**
     * Sets body.
     *
     * @param body
     */
    @JsonProperty("body")
    public void setBody(WhatsAppInteractiveBodyContent body) {
        this.body = body;
    }

    /**
     * Sets footer.
     *
     * @param footer
     * @return This {@link WhatsAppInteractiveOrderStatusContent instance}.
     */
    public WhatsAppInteractiveOrderStatusContent footer(WhatsAppInteractiveFooterContent footer) {
        this.footer = footer;
        return this;
    }

    /**
     * Returns footer.
     *
     * @return footer
     */
    @JsonProperty("footer")
    public WhatsAppInteractiveFooterContent getFooter() {
        return footer;
    }

    /**
     * Sets footer.
     *
     * @param footer
     */
    @JsonProperty("footer")
    public void setFooter(WhatsAppInteractiveFooterContent footer) {
        this.footer = footer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WhatsAppInteractiveOrderStatusContent whatsAppInteractiveOrderStatusContent =
                (WhatsAppInteractiveOrderStatusContent) o;
        return Objects.equals(this.action, whatsAppInteractiveOrderStatusContent.action)
                && Objects.equals(this.body, whatsAppInteractiveOrderStatusContent.body)
                && Objects.equals(this.footer, whatsAppInteractiveOrderStatusContent.footer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(action, body, footer);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class WhatsAppInteractiveOrderStatusContent {")
                .append(newLine)
                .append("    action: ")
                .append(toIndentedString(action))
                .append(newLine)
                .append("    body: ")
                .append(toIndentedString(body))
                .append(newLine)
                .append("    footer: ")
                .append(toIndentedString(footer))
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
