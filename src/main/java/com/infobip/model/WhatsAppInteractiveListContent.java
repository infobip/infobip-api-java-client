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
public class WhatsAppInteractiveListContent {

    private WhatsAppInteractiveBodyContent body;

    private WhatsAppInteractiveListActionContent action;

    private WhatsAppInteractiveListHeaderContent header;

    private WhatsAppInteractiveFooterContent footer;

    /**
     * Sets body.
     * <p>
     * The field is required.
     *
     * @param body
     * @return This {@link WhatsAppInteractiveListContent instance}.
     */
    public WhatsAppInteractiveListContent body(WhatsAppInteractiveBodyContent body) {
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
     * @return This {@link WhatsAppInteractiveListContent instance}.
     */
    public WhatsAppInteractiveListContent action(WhatsAppInteractiveListActionContent action) {
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
    public WhatsAppInteractiveListActionContent getAction() {
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
    public void setAction(WhatsAppInteractiveListActionContent action) {
        this.action = action;
    }

    /**
     * Sets header.
     *
     * @param header
     * @return This {@link WhatsAppInteractiveListContent instance}.
     */
    public WhatsAppInteractiveListContent header(WhatsAppInteractiveListHeaderContent header) {
        this.header = header;
        return this;
    }

    /**
     * Returns header.
     *
     * @return header
     */
    @JsonProperty("header")
    public WhatsAppInteractiveListHeaderContent getHeader() {
        return header;
    }

    /**
     * Sets header.
     *
     * @param header
     */
    @JsonProperty("header")
    public void setHeader(WhatsAppInteractiveListHeaderContent header) {
        this.header = header;
    }

    /**
     * Sets footer.
     *
     * @param footer
     * @return This {@link WhatsAppInteractiveListContent instance}.
     */
    public WhatsAppInteractiveListContent footer(WhatsAppInteractiveFooterContent footer) {
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
        WhatsAppInteractiveListContent whatsAppInteractiveListContent = (WhatsAppInteractiveListContent) o;
        return Objects.equals(this.body, whatsAppInteractiveListContent.body)
                && Objects.equals(this.action, whatsAppInteractiveListContent.action)
                && Objects.equals(this.header, whatsAppInteractiveListContent.header)
                && Objects.equals(this.footer, whatsAppInteractiveListContent.footer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(body, action, header, footer);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class WhatsAppInteractiveListContent {")
                .append(newLine)
                .append("    body: ")
                .append(toIndentedString(body))
                .append(newLine)
                .append("    action: ")
                .append(toIndentedString(action))
                .append(newLine)
                .append("    header: ")
                .append(toIndentedString(header))
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
