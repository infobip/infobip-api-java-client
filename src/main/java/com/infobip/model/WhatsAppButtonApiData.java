/*
 * This class is auto generated from the Infobip OpenAPI specification
 * through the OpenAPI Specification Client API libraries (Re)Generator (OSCAR),
 * powered by the OpenAPI Generator (https://openapi-generator.tech).
 *
 * Do not edit manually. To learn how to raise an issue, see the CONTRIBUTING guide
 * or contact us @ support@infobip.com.
 */

package com.infobip.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;

/**
 * Template buttons. Can be either up to 3 &#x60;quick reply&#x60; buttons or up to 2 &#x60;call to action&#x60; buttons. Call to action buttons must be unique in type.
 */
@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.EXISTING_PROPERTY,
        property = "type",
        visible = true)
@JsonSubTypes({
    @JsonSubTypes.Type(value = WhatsAppPhoneNumberButtonApiData.class, name = "PHONE_NUMBER"),
    @JsonSubTypes.Type(value = WhatsAppQuickReplyButtonApiData.class, name = "QUICK_REPLY"),
    @JsonSubTypes.Type(value = WhatsAppUrlButtonApiData.class, name = "URL"),
})
public abstract class WhatsAppButtonApiData {
    /**
     * Represents type enumeration.
     */
    public enum TypeEnum {
        PHONE_NUMBER("PHONE_NUMBER"),
        URL("URL"),
        QUICK_REPLY("QUICK_REPLY");

        private String value;

        TypeEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static TypeEnum fromValue(String value) {
            for (TypeEnum enumElement : TypeEnum.values()) {
                if (enumElement.value.equals(value)) {
                    return enumElement;
                }
            }
            throw new IllegalArgumentException("Unexpected enum value '" + value + "'.");
        }
    }

    protected final TypeEnum type;

    /**
     * Constructs a new {@link WhatsAppButtonApiData} instance.
     */
    public WhatsAppButtonApiData(String type) {
        this.type = TypeEnum.fromValue(type);
    }

    private String text;

    /**
     * Returns type.
     *
     * @return type
     */
    @JsonProperty("type")
    public TypeEnum getType() {
        return type;
    }

    /**
     * Sets text.
     * <p>
     * Field description:
     * Button text.
     * <p>
     * The field is required.
     *
     * @param text
     * @return This {@link WhatsAppButtonApiData instance}.
     */
    public WhatsAppButtonApiData text(String text) {
        this.text = text;
        return this;
    }

    /**
     * Returns text.
     * <p>
     * Field description:
     * Button text.
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
     * Button text.
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
        WhatsAppButtonApiData whatsAppButtonApiData = (WhatsAppButtonApiData) o;
        return Objects.equals(this.type, whatsAppButtonApiData.type)
                && Objects.equals(this.text, whatsAppButtonApiData.text);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, text);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class WhatsAppButtonApiData {")
                .append(newLine)
                .append("    type: ")
                .append(toIndentedString(type))
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
