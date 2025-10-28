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
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.util.Objects;

/**
 * Header of a message containing one or more [interactive elements](https://www.infobip.com/docs/whatsapp/message-types-and-templates/free-form-messages#available-interactive-formats).
 */
@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.EXISTING_PROPERTY,
        property = "type",
        visible = true)
@JsonSubTypes({
    @JsonSubTypes.Type(value = WhatsAppInteractiveUrlButtonDocumentHeaderContent.class, name = "DOCUMENT"),
    @JsonSubTypes.Type(value = WhatsAppInteractiveUrlButtonImageHeaderContent.class, name = "IMAGE"),
    @JsonSubTypes.Type(value = WhatsAppInteractiveUrlButtonTextHeaderContent.class, name = "TEXT"),
    @JsonSubTypes.Type(value = WhatsAppInteractiveUrlButtonVideoHeaderContent.class, name = "VIDEO"),
})
public abstract class WhatsAppInteractiveUrlButtonHeaderContent {

    protected final String type;

    /**
     * Constructs a new {@link WhatsAppInteractiveUrlButtonHeaderContent} instance.
     */
    public WhatsAppInteractiveUrlButtonHeaderContent(String type) {
        this.type = type;
    }

    /**
     * Returns type.
     * <p>
     * The field is required.
     *
     * @return type
     */
    @JsonProperty("type")
    public String getType() {
        return type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WhatsAppInteractiveUrlButtonHeaderContent whatsAppInteractiveUrlButtonHeaderContent =
                (WhatsAppInteractiveUrlButtonHeaderContent) o;
        return Objects.equals(this.type, whatsAppInteractiveUrlButtonHeaderContent.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class WhatsAppInteractiveUrlButtonHeaderContent {")
                .append(newLine)
                .append("    type: ")
                .append(toIndentedString(type))
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
