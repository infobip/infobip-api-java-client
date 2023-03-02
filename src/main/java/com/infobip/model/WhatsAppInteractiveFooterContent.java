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
 * Footer of a message containing one or more [interactive elements](https://www.infobip.com/docs/whatsapp/message-types#free-form-messages).
 */
public class WhatsAppInteractiveFooterContent {

    private String text;

    /**
     * Sets text.
     * <p>
     * Field description:
     * Content of the message footer.
     * <p>
     * The field is required.
     *
     * @param text
     * @return This {@link WhatsAppInteractiveFooterContent instance}.
     */
    public WhatsAppInteractiveFooterContent text(String text) {
        this.text = text;
        return this;
    }

    /**
     * Returns text.
     * <p>
     * Field description:
     * Content of the message footer.
     * <p>
     * The field is required.
     *
     * @return text
     */
    @JsonProperty("text")
    public String getText() {
        return text;
    }

    /**
     * Sets text.
     * <p>
     * Field description:
     * Content of the message footer.
     * <p>
     * The field is required.
     *
     * @param text
     */
    @JsonProperty("text")
    public void setText(String text) {
        this.text = text;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WhatsAppInteractiveFooterContent whatsAppInteractiveFooterContent = (WhatsAppInteractiveFooterContent) o;
        return Objects.equals(this.text, whatsAppInteractiveFooterContent.text);
    }

    @Override
    public int hashCode() {
        return Objects.hash(text);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class WhatsAppInteractiveFooterContent {")
                .append(newLine)
                .append("    text: ")
                .append(toIndentedString(text))
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
