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
 * Represents WhatsAppInteractiveUrlButtonTextHeaderContent model.
 */
public class WhatsAppInteractiveUrlButtonTextHeaderContent extends WhatsAppInteractiveUrlButtonHeaderContent {

    private String text;

    /**
     * Constructs a new {@link WhatsAppInteractiveUrlButtonTextHeaderContent} instance.
     */
    public WhatsAppInteractiveUrlButtonTextHeaderContent() {
        super("TEXT");
    }

    /**
     * Sets text.
     * <p>
     * Field description:
     * Content of the header used when creating interactive url button.
     * <p>
     * The field is required.
     *
     * @param text
     * @return This {@link WhatsAppInteractiveUrlButtonTextHeaderContent instance}.
     */
    public WhatsAppInteractiveUrlButtonTextHeaderContent text(String text) {
        this.text = text;
        return this;
    }

    /**
     * Returns text.
     * <p>
     * Field description:
     * Content of the header used when creating interactive url button.
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
     * Content of the header used when creating interactive url button.
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
        WhatsAppInteractiveUrlButtonTextHeaderContent whatsAppInteractiveUrlButtonTextHeaderContent =
                (WhatsAppInteractiveUrlButtonTextHeaderContent) o;
        return Objects.equals(this.text, whatsAppInteractiveUrlButtonTextHeaderContent.text) && super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(text, super.hashCode());
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class WhatsAppInteractiveUrlButtonTextHeaderContent {")
                .append(newLine)
                .append("    ")
                .append(toIndentedString(super.toString()))
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
