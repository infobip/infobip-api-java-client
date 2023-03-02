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
 * Represents WhatsAppTemplatePublicApiRequest model.
 */
public class WhatsAppTemplatePublicApiRequest {

    private String name;

    private WhatsAppLanguage language;

    /**
     * Category of the template.
     */
    public enum CategoryEnum {
        MARKETING("MARKETING"),
        TRANSACTIONAL("TRANSACTIONAL"),
        OTP("OTP");

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

    private WhatsAppTemplateStructureApiData structure;

    /**
     * Sets name.
     * <p>
     * Field description:
     * Template name. Must only contain lowercase alphanumeric characters and underscores.
     * <p>
     * The field is required.
     *
     * @param name
     * @return This {@link WhatsAppTemplatePublicApiRequest instance}.
     */
    public WhatsAppTemplatePublicApiRequest name(String name) {
        this.name = name;
        return this;
    }

    /**
     * Returns name.
     * <p>
     * Field description:
     * Template name. Must only contain lowercase alphanumeric characters and underscores.
     * <p>
     * The field is required.
     *
     * @return name
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * Sets name.
     * <p>
     * Field description:
     * Template name. Must only contain lowercase alphanumeric characters and underscores.
     * <p>
     * The field is required.
     *
     * @param name
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Sets language.
     * <p>
     * The field is required.
     *
     * @param language
     * @return This {@link WhatsAppTemplatePublicApiRequest instance}.
     */
    public WhatsAppTemplatePublicApiRequest language(WhatsAppLanguage language) {
        this.language = language;
        return this;
    }

    /**
     * Returns language.
     * <p>
     * The field is required.
     *
     * @return language
     */
    @JsonProperty("language")
    public WhatsAppLanguage getLanguage() {
        return language;
    }

    /**
     * Sets language.
     * <p>
     * The field is required.
     *
     * @param language
     */
    @JsonProperty("language")
    public void setLanguage(WhatsAppLanguage language) {
        this.language = language;
    }

    /**
     * Sets category.
     * <p>
     * Field description:
     * Category of the template.
     * <p>
     * The field is required.
     *
     * @param category
     * @return This {@link WhatsAppTemplatePublicApiRequest instance}.
     */
    public WhatsAppTemplatePublicApiRequest category(CategoryEnum category) {
        this.category = category;
        return this;
    }

    /**
     * Returns category.
     * <p>
     * Field description:
     * Category of the template.
     * <p>
     * The field is required.
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
     * Category of the template.
     * <p>
     * The field is required.
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
     * The field is required.
     *
     * @param structure
     * @return This {@link WhatsAppTemplatePublicApiRequest instance}.
     */
    public WhatsAppTemplatePublicApiRequest structure(WhatsAppTemplateStructureApiData structure) {
        this.structure = structure;
        return this;
    }

    /**
     * Returns structure.
     * <p>
     * The field is required.
     *
     * @return structure
     */
    @JsonProperty("structure")
    public WhatsAppTemplateStructureApiData getStructure() {
        return structure;
    }

    /**
     * Sets structure.
     * <p>
     * The field is required.
     *
     * @param structure
     */
    @JsonProperty("structure")
    public void setStructure(WhatsAppTemplateStructureApiData structure) {
        this.structure = structure;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WhatsAppTemplatePublicApiRequest whatsAppTemplatePublicApiRequest = (WhatsAppTemplatePublicApiRequest) o;
        return Objects.equals(this.name, whatsAppTemplatePublicApiRequest.name)
                && Objects.equals(this.language, whatsAppTemplatePublicApiRequest.language)
                && Objects.equals(this.category, whatsAppTemplatePublicApiRequest.category)
                && Objects.equals(this.structure, whatsAppTemplatePublicApiRequest.structure);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, language, category, structure);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class WhatsAppTemplatePublicApiRequest {")
                .append(newLine)
                .append("    name: ")
                .append(toIndentedString(name))
                .append(newLine)
                .append("    language: ")
                .append(toIndentedString(language))
                .append(newLine)
                .append("    category: ")
                .append(toIndentedString(category))
                .append(newLine)
                .append("    structure: ")
                .append(toIndentedString(structure))
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
