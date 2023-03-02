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
 * Represents WhatsAppTemplateTextHeaderContent model.
 */
public class WhatsAppTemplateTextHeaderContent extends WhatsAppTemplateHeaderContent {

    private String placeholder;

    /**
     * Constructs a new {@link WhatsAppTemplateTextHeaderContent} instance.
     */
    public WhatsAppTemplateTextHeaderContent() {
        super("TEXT");
    }

    /**
     * Sets placeholder.
     * <p>
     * Field description:
     * Value of a placeholder in the text header.
     * <p>
     * The field is required.
     *
     * @param placeholder
     * @return This {@link WhatsAppTemplateTextHeaderContent instance}.
     */
    public WhatsAppTemplateTextHeaderContent placeholder(String placeholder) {
        this.placeholder = placeholder;
        return this;
    }

    /**
     * Returns placeholder.
     * <p>
     * Field description:
     * Value of a placeholder in the text header.
     * <p>
     * The field is required.
     *
     * @return placeholder
     */
    @JsonProperty("placeholder")
    public String getPlaceholder() {
        return placeholder;
    }

    /**
     * Sets placeholder.
     * <p>
     * Field description:
     * Value of a placeholder in the text header.
     * <p>
     * The field is required.
     *
     * @param placeholder
     */
    @JsonProperty("placeholder")
    public void setPlaceholder(String placeholder) {
        this.placeholder = placeholder;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WhatsAppTemplateTextHeaderContent whatsAppTemplateTextHeaderContent = (WhatsAppTemplateTextHeaderContent) o;
        return Objects.equals(this.placeholder, whatsAppTemplateTextHeaderContent.placeholder) && super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(placeholder, super.hashCode());
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class WhatsAppTemplateTextHeaderContent {")
                .append(newLine)
                .append("    ")
                .append(toIndentedString(super.toString()))
                .append(newLine)
                .append("    placeholder: ")
                .append(toIndentedString(placeholder))
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
