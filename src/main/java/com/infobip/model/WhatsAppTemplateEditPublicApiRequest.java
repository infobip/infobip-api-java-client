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
 * Represents WhatsAppTemplateEditPublicApiRequest model.
 */
public class WhatsAppTemplateEditPublicApiRequest {
    /**
     * Category of the template. Approved template category cannot be edited.
     */
    public enum CategoryEnum {
        MARKETING("MARKETING"),
        AUTHENTICATION("AUTHENTICATION"),
        UTILITY("UTILITY");

        private String value;

        CategoryEnum(String value) {
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
        public static CategoryEnum fromValue(String value) {
            for (CategoryEnum enumElement : CategoryEnum.values()) {
                if (enumElement.value.equals(value)) {
                    return enumElement;
                }
            }
            throw new IllegalArgumentException("Unexpected enum value '" + value + "'.");
        }
    }

    private CategoryEnum category;

    private Object structure;

    private ValidityPeriod validityPeriod;

    private Platform platform;

    /**
     * Sets category.
     * <p>
     * Field description:
     * Category of the template. Approved template category cannot be edited.
     *
     * @param category
     * @return This {@link WhatsAppTemplateEditPublicApiRequest instance}.
     */
    public WhatsAppTemplateEditPublicApiRequest category(CategoryEnum category) {
        this.category = category;
        return this;
    }

    /**
     * Returns category.
     * <p>
     * Field description:
     * Category of the template. Approved template category cannot be edited.
     *
     * @return category
     */
    @JsonProperty("category")
    public CategoryEnum getCategory() {
        return category;
    }

    /**
     * Sets category.
     * <p>
     * Field description:
     * Category of the template. Approved template category cannot be edited.
     *
     * @param category
     */
    @JsonProperty("category")
    public void setCategory(CategoryEnum category) {
        this.category = category;
    }

    /**
     * Sets structure.
     * <p>
     * Field description:
     * Template structure. Format depends on the template category.
     *
     * @param structure
     * @return This {@link WhatsAppTemplateEditPublicApiRequest instance}.
     */
    public WhatsAppTemplateEditPublicApiRequest structure(Object structure) {
        this.structure = structure;
        return this;
    }

    /**
     * Returns structure.
     * <p>
     * Field description:
     * Template structure. Format depends on the template category.
     *
     * @return structure
     */
    @JsonProperty("structure")
    public Object getStructure() {
        return structure;
    }

    /**
     * Sets structure.
     * <p>
     * Field description:
     * Template structure. Format depends on the template category.
     *
     * @param structure
     */
    @JsonProperty("structure")
    public void setStructure(Object structure) {
        this.structure = structure;
    }

    /**
     * Sets validityPeriod.
     *
     * @param validityPeriod
     * @return This {@link WhatsAppTemplateEditPublicApiRequest instance}.
     */
    public WhatsAppTemplateEditPublicApiRequest validityPeriod(ValidityPeriod validityPeriod) {
        this.validityPeriod = validityPeriod;
        return this;
    }

    /**
     * Returns validityPeriod.
     *
     * @return validityPeriod
     */
    @JsonProperty("validityPeriod")
    public ValidityPeriod getValidityPeriod() {
        return validityPeriod;
    }

    /**
     * Sets validityPeriod.
     *
     * @param validityPeriod
     */
    @JsonProperty("validityPeriod")
    public void setValidityPeriod(ValidityPeriod validityPeriod) {
        this.validityPeriod = validityPeriod;
    }

    /**
     * Sets platform.
     *
     * @param platform
     * @return This {@link WhatsAppTemplateEditPublicApiRequest instance}.
     */
    public WhatsAppTemplateEditPublicApiRequest platform(Platform platform) {
        this.platform = platform;
        return this;
    }

    /**
     * Returns platform.
     *
     * @return platform
     */
    @JsonProperty("platform")
    public Platform getPlatform() {
        return platform;
    }

    /**
     * Sets platform.
     *
     * @param platform
     */
    @JsonProperty("platform")
    public void setPlatform(Platform platform) {
        this.platform = platform;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WhatsAppTemplateEditPublicApiRequest whatsAppTemplateEditPublicApiRequest =
                (WhatsAppTemplateEditPublicApiRequest) o;
        return Objects.equals(this.category, whatsAppTemplateEditPublicApiRequest.category)
                && Objects.equals(this.structure, whatsAppTemplateEditPublicApiRequest.structure)
                && Objects.equals(this.validityPeriod, whatsAppTemplateEditPublicApiRequest.validityPeriod)
                && Objects.equals(this.platform, whatsAppTemplateEditPublicApiRequest.platform);
    }

    @Override
    public int hashCode() {
        return Objects.hash(category, structure, validityPeriod, platform);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class WhatsAppTemplateEditPublicApiRequest {")
                .append(newLine)
                .append("    category: ")
                .append(toIndentedString(category))
                .append(newLine)
                .append("    structure: ")
                .append(toIndentedString(structure))
                .append(newLine)
                .append("    validityPeriod: ")
                .append(toIndentedString(validityPeriod))
                .append(newLine)
                .append("    platform: ")
                .append(toIndentedString(platform))
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
