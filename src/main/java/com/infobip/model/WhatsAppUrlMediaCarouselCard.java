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
 * Carousel cards. Should be defined in the correct order.It can have between two and ten cards.
 */
public class WhatsAppUrlMediaCarouselCard {

    private WhatsAppMediaCarouselCardHeader header;

    private WhatsAppMediaCarouselCardBody body;

    private WhatsAppUrlCardActionButton button;

    /**
     * Sets header.
     * <p>
     * The field is required.
     *
     * @param header
     * @return This {@link WhatsAppUrlMediaCarouselCard instance}.
     */
    public WhatsAppUrlMediaCarouselCard header(WhatsAppMediaCarouselCardHeader header) {
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
    public WhatsAppMediaCarouselCardHeader getHeader() {
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
    public void setHeader(WhatsAppMediaCarouselCardHeader header) {
        this.header = header;
    }

    /**
     * Sets body.
     * <p>
     * The field is required.
     *
     * @param body
     * @return This {@link WhatsAppUrlMediaCarouselCard instance}.
     */
    public WhatsAppUrlMediaCarouselCard body(WhatsAppMediaCarouselCardBody body) {
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
    public WhatsAppMediaCarouselCardBody getBody() {
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
    public void setBody(WhatsAppMediaCarouselCardBody body) {
        this.body = body;
    }

    /**
     * Sets button.
     * <p>
     * The field is required.
     *
     * @param button
     * @return This {@link WhatsAppUrlMediaCarouselCard instance}.
     */
    public WhatsAppUrlMediaCarouselCard button(WhatsAppUrlCardActionButton button) {
        this.button = button;
        return this;
    }

    /**
     * Returns button.
     * <p>
     * The field is required.
     *
     * @return button
     */
    @JsonProperty("button")
    public WhatsAppUrlCardActionButton getButton() {
        return button;
    }

    /**
     * Sets button.
     * <p>
     * The field is required.
     *
     * @param button
     */
    @JsonProperty("button")
    public void setButton(WhatsAppUrlCardActionButton button) {
        this.button = button;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WhatsAppUrlMediaCarouselCard whatsAppUrlMediaCarouselCard = (WhatsAppUrlMediaCarouselCard) o;
        return Objects.equals(this.header, whatsAppUrlMediaCarouselCard.header)
                && Objects.equals(this.body, whatsAppUrlMediaCarouselCard.body)
                && Objects.equals(this.button, whatsAppUrlMediaCarouselCard.button);
    }

    @Override
    public int hashCode() {
        return Objects.hash(header, body, button);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class WhatsAppUrlMediaCarouselCard {")
                .append(newLine)
                .append("    header: ")
                .append(toIndentedString(header))
                .append(newLine)
                .append("    body: ")
                .append(toIndentedString(body))
                .append(newLine)
                .append("    button: ")
                .append(toIndentedString(button))
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
