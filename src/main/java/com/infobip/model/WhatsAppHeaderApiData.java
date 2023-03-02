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
 * Template header. Can be &#x60;image&#x60;, &#x60;document&#x60;, &#x60;video&#x60;, &#x60;location&#x60; or &#x60;text&#x60;.
 */
@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.EXISTING_PROPERTY,
        property = "format",
        visible = true)
@JsonSubTypes({
    @JsonSubTypes.Type(value = WhatsAppDocumentHeaderApiData.class, name = "DOCUMENT"),
    @JsonSubTypes.Type(value = WhatsAppImageHeaderApiData.class, name = "IMAGE"),
    @JsonSubTypes.Type(value = WhatsAppLocationHeaderApiData.class, name = "LOCATION"),
    @JsonSubTypes.Type(value = WhatsAppTextHeaderApiData.class, name = "TEXT"),
    @JsonSubTypes.Type(value = WhatsAppVideoHeaderApiData.class, name = "VIDEO"),
})
public abstract class WhatsAppHeaderApiData {
    /**
     * Represents format enumeration.
     */
    public enum FormatEnum {
        TEXT("TEXT"),
        IMAGE("IMAGE"),
        VIDEO("VIDEO"),
        DOCUMENT("DOCUMENT"),
        LOCATION("LOCATION");

        private String value;

        FormatEnum(String value) {
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
        public static FormatEnum fromValue(String value) {
            for (FormatEnum enumElement : FormatEnum.values()) {
                if (enumElement.value.equals(value)) {
                    return enumElement;
                }
            }
            throw new IllegalArgumentException("Unexpected enum value '" + value + "'.");
        }
    }

    protected final FormatEnum format;

    /**
     * Constructs a new {@link WhatsAppHeaderApiData} instance.
     */
    public WhatsAppHeaderApiData(String format) {
        this.format = FormatEnum.fromValue(format);
    }

    /**
     * Returns format.
     *
     * @return format
     */
    @JsonProperty("format")
    public FormatEnum getFormat() {
        return format;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WhatsAppHeaderApiData whatsAppHeaderApiData = (WhatsAppHeaderApiData) o;
        return Objects.equals(this.format, whatsAppHeaderApiData.format);
    }

    @Override
    public int hashCode() {
        return Objects.hash(format);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class WhatsAppHeaderApiData {")
                .append(newLine)
                .append("    format: ")
                .append(toIndentedString(format))
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
