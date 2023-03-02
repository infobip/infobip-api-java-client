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
public class WhatsAppInteractiveMultiProductContent {

    private WhatsAppInteractiveMultiProductHeaderContent header;

    private WhatsAppInteractiveBodyContent body;

    private WhatsAppInteractiveMultiProductActionContent action;

    private WhatsAppInteractiveFooterContent footer;

    /**
     * Sets header.
     * <p>
     * The field is required.
     *
     * @param header
     * @return This {@link WhatsAppInteractiveMultiProductContent instance}.
     */
    public WhatsAppInteractiveMultiProductContent header(WhatsAppInteractiveMultiProductHeaderContent header) {
        this.header = header;
        return this;
    }

    /**
     * Returns header.
     * <p>
     * The field is required.
     *
     * @return header
     */
    @JsonProperty("header")
    public WhatsAppInteractiveMultiProductHeaderContent getHeader() {
        return header;
    }

    /**
     * Sets header.
     * <p>
     * The field is required.
     *
     * @param header
     */
    @JsonProperty("header")
    public void setHeader(WhatsAppInteractiveMultiProductHeaderContent header) {
        this.header = header;
    }

    /**
     * Sets body.
     * <p>
     * The field is required.
     *
     * @param body
     * @return This {@link WhatsAppInteractiveMultiProductContent instance}.
     */
    public WhatsAppInteractiveMultiProductContent body(WhatsAppInteractiveBodyContent body) {
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
    public WhatsAppInteractiveBodyContent getBody() {
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
    public void setBody(WhatsAppInteractiveBodyContent body) {
        this.body = body;
    }

    /**
     * Sets action.
     * <p>
     * The field is required.
     *
     * @param action
     * @return This {@link WhatsAppInteractiveMultiProductContent instance}.
     */
    public WhatsAppInteractiveMultiProductContent action(WhatsAppInteractiveMultiProductActionContent action) {
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
    public WhatsAppInteractiveMultiProductActionContent getAction() {
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
    public void setAction(WhatsAppInteractiveMultiProductActionContent action) {
        this.action = action;
    }

    /**
     * Sets footer.
     *
     * @param footer
     * @return This {@link WhatsAppInteractiveMultiProductContent instance}.
     */
    public WhatsAppInteractiveMultiProductContent footer(WhatsAppInteractiveFooterContent footer) {
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
        WhatsAppInteractiveMultiProductContent whatsAppInteractiveMultiProductContent =
                (WhatsAppInteractiveMultiProductContent) o;
        return Objects.equals(this.header, whatsAppInteractiveMultiProductContent.header)
                && Objects.equals(this.body, whatsAppInteractiveMultiProductContent.body)
                && Objects.equals(this.action, whatsAppInteractiveMultiProductContent.action)
                && Objects.equals(this.footer, whatsAppInteractiveMultiProductContent.footer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(header, body, action, footer);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class WhatsAppInteractiveMultiProductContent {")
                .append(newLine)
                .append("    header: ")
                .append(toIndentedString(header))
                .append(newLine)
                .append("    body: ")
                .append(toIndentedString(body))
                .append(newLine)
                .append("    action: ")
                .append(toIndentedString(action))
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
