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
 * Template buttons. Can contain 1 to 10 buttons which include up to 2 URL buttons, a phone number button and &#x60;copy code&#x60; button. &#x60;quick reply&#x60; and non &#x60;quick reply&#x60; buttons have to be grouped together.
 */
@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.EXISTING_PROPERTY,
        property = "type",
        visible = true)
@JsonSubTypes({
    @JsonSubTypes.Type(value = WhatsAppCatalogButtonApiData.class, name = "CATALOG"),
    @JsonSubTypes.Type(value = WhatsAppCopyCodeDefaultButtonApiData.class, name = "COPY_CODE"),
    @JsonSubTypes.Type(value = WhatsAppFlowButtonApiData.class, name = "FLOW"),
    @JsonSubTypes.Type(value = WhatsAppMultiProductButtonApiData.class, name = "MULTI_PRODUCT"),
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
        QUICK_REPLY("QUICK_REPLY"),
        COPY_CODE("COPY_CODE"),
        FLOW("FLOW"),
        CATALOG("CATALOG"),
        MULTI_PRODUCT("MULTI_PRODUCT");

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

    /**
     * Returns type.
     *
     * @return type
     */
    @JsonProperty("type")
    public TypeEnum getType() {
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
        WhatsAppButtonApiData whatsAppButtonApiData = (WhatsAppButtonApiData) o;
        return Objects.equals(this.type, whatsAppButtonApiData.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type);
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
