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
 * Template buttons. Should be defined in correct order, only if &#x60;quick reply&#x60; or &#x60;dynamic URL&#x60; buttons have been registered. It can have up to three &#x60;quick reply&#x60; buttons or only one &#x60;dynamic URL&#x60; button.
 */
@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.EXISTING_PROPERTY,
        property = "type",
        visible = true)
@JsonSubTypes({
    @JsonSubTypes.Type(value = WhatsAppTemplateQuickReplyButtonContent.class, name = "QUICK_REPLY"),
    @JsonSubTypes.Type(value = WhatsAppTemplateUrlButtonContent.class, name = "URL"),
})
public abstract class WhatsAppTemplateButtonContent {

    protected final String type;

    /**
     * Constructs a new {@link WhatsAppTemplateButtonContent} instance.
     */
    public WhatsAppTemplateButtonContent(String type) {
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
        WhatsAppTemplateButtonContent whatsAppTemplateButtonContent = (WhatsAppTemplateButtonContent) o;
        return Objects.equals(this.type, whatsAppTemplateButtonContent.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class WhatsAppTemplateButtonContent {")
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
