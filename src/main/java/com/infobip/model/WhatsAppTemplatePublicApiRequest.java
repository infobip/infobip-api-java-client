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
 * Represents WhatsAppTemplatePublicApiRequest model.
 */
@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.EXISTING_PROPERTY,
        property = "category",
        visible = true)
@JsonSubTypes({
    @JsonSubTypes.Type(value = WhatsAppAuthenticationTemplatePublicApiRequest.class, name = "AUTHENTICATION"),
    @JsonSubTypes.Type(value = WhatsAppDefaultMarketingTemplatePublicApiRequest.class, name = "MARKETING"),
    @JsonSubTypes.Type(value = WhatsAppDefaultUtilityTemplatePublicApiRequest.class, name = "UTILITY"),
})
public abstract class WhatsAppTemplatePublicApiRequest {

    private String name;

    private WhatsAppLanguage language;

    /**
     * Category of the template. Mind that each category has different fields available for the endpoint. If you&#39;re sending traffic in India, for &#x60;AUTHENTICATION&#x60;, use fields available for &#x60;UTILITY&#x60; with &#x60;AUTHENTICATION&#x60; as category.
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

    protected final CategoryEnum category;

    /**
     * Constructs a new {@link WhatsAppTemplatePublicApiRequest} instance.
     */
    public WhatsAppTemplatePublicApiRequest(String category) {
        this.category = CategoryEnum.fromValue(category);
    }

    private Boolean allowCategoryChange;

    private Object structure;

    private Platform platform;

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
     * Returns category.
     * <p>
     * Field description:
     * Category of the template. Mind that each category has different fields available for the endpoint. If you&#39;re sending traffic in India, for &#x60;AUTHENTICATION&#x60;, use fields available for &#x60;UTILITY&#x60; with &#x60;AUTHENTICATION&#x60; as category.
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
     * Sets allowCategoryChange.
     * <p>
     * Field description:
     * If set to true, Meta will be able to assign category based on their template guidelines. If omitted, template will not be auto-assigned a category and may get rejected if determined to be miscategorized.
     *
     * @param allowCategoryChange
     * @return This {@link WhatsAppTemplatePublicApiRequest instance}.
     */
    public WhatsAppTemplatePublicApiRequest allowCategoryChange(Boolean allowCategoryChange) {
        this.allowCategoryChange = allowCategoryChange;
        return this;
    }

    /**
     * Returns allowCategoryChange.
     * <p>
     * Field description:
     * If set to true, Meta will be able to assign category based on their template guidelines. If omitted, template will not be auto-assigned a category and may get rejected if determined to be miscategorized.
     *
     * @return allowCategoryChange
     */
    @JsonProperty("allowCategoryChange")
    public Boolean getAllowCategoryChange() {
        return allowCategoryChange;
    }

    /**
     * Sets allowCategoryChange.
     * <p>
     * Field description:
     * If set to true, Meta will be able to assign category based on their template guidelines. If omitted, template will not be auto-assigned a category and may get rejected if determined to be miscategorized.
     *
     * @param allowCategoryChange
     */
    @JsonProperty("allowCategoryChange")
    public void setAllowCategoryChange(Boolean allowCategoryChange) {
        this.allowCategoryChange = allowCategoryChange;
    }

    /**
     * Sets structure.
     * <p>
     * The field is required.
     *
     * @param structure
     * @return This {@link WhatsAppTemplatePublicApiRequest instance}.
     */
    public WhatsAppTemplatePublicApiRequest structure(Object structure) {
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
    public Object getStructure() {
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
    public void setStructure(Object structure) {
        this.structure = structure;
    }

    /**
     * Sets platform.
     *
     * @param platform
     * @return This {@link WhatsAppTemplatePublicApiRequest instance}.
     */
    public WhatsAppTemplatePublicApiRequest platform(Platform platform) {
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
        WhatsAppTemplatePublicApiRequest whatsAppTemplatePublicApiRequest = (WhatsAppTemplatePublicApiRequest) o;
        return Objects.equals(this.name, whatsAppTemplatePublicApiRequest.name)
                && Objects.equals(this.language, whatsAppTemplatePublicApiRequest.language)
                && Objects.equals(this.category, whatsAppTemplatePublicApiRequest.category)
                && Objects.equals(this.allowCategoryChange, whatsAppTemplatePublicApiRequest.allowCategoryChange)
                && Objects.equals(this.structure, whatsAppTemplatePublicApiRequest.structure)
                && Objects.equals(this.platform, whatsAppTemplatePublicApiRequest.platform);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, language, category, allowCategoryChange, structure, platform);
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
                .append("    allowCategoryChange: ")
                .append(toIndentedString(allowCategoryChange))
                .append(newLine)
                .append("    structure: ")
                .append(toIndentedString(structure))
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
