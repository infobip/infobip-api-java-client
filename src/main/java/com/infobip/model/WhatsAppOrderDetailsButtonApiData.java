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
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;

/**
 * Represents WhatsAppOrderDetailsButtonApiData model.
 */
public class WhatsAppOrderDetailsButtonApiData extends WhatsAppButtonApiData {
    /**
     * Order details variant.
     */
    public enum VariantEnum {
        BRAZIL("BRAZIL"),
        INDIA("INDIA");

        private String value;

        VariantEnum(String value) {
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
        public static VariantEnum fromValue(String value) {
            for (VariantEnum enumElement : VariantEnum.values()) {
                if (enumElement.value.equals(value)) {
                    return enumElement;
                }
            }
            throw new IllegalArgumentException("Unexpected enum value '" + value + "'.");
        }
    }

    private VariantEnum variant;

    /**
     * Constructs a new {@link WhatsAppOrderDetailsButtonApiData} instance.
     */
    public WhatsAppOrderDetailsButtonApiData() {
        super("ORDER_DETAILS");
    }

    /**
     * Sets variant.
     * <p>
     * Field description:
     * Order details variant.
     * <p>
     * The field is required.
     *
     * @param variant
     * @return This {@link WhatsAppOrderDetailsButtonApiData instance}.
     */
    public WhatsAppOrderDetailsButtonApiData variant(VariantEnum variant) {
        this.variant = variant;
        return this;
    }

    /**
     * Returns variant.
     * <p>
     * Field description:
     * Order details variant.
     * <p>
     * The field is required.
     *
     * @return variant
     */
    @JsonProperty("variant")
    public VariantEnum getVariant() {
        return variant;
    }

    /**
     * Sets variant.
     * <p>
     * Field description:
     * Order details variant.
     * <p>
     * The field is required.
     *
     * @param variant
     */
    @JsonProperty("variant")
    public void setVariant(VariantEnum variant) {
        this.variant = variant;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WhatsAppOrderDetailsButtonApiData whatsAppOrderDetailsButtonApiData = (WhatsAppOrderDetailsButtonApiData) o;
        return Objects.equals(this.variant, whatsAppOrderDetailsButtonApiData.variant) && super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(variant, super.hashCode());
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class WhatsAppOrderDetailsButtonApiData {")
                .append(newLine)
                .append("    ")
                .append(toIndentedString(super.toString()))
                .append(newLine)
                .append("    variant: ")
                .append(toIndentedString(variant))
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
