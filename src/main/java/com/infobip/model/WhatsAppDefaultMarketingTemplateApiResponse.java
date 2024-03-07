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
 * Represents WhatsAppDefaultMarketingTemplateApiResponse model.
 */
public class WhatsAppDefaultMarketingTemplateApiResponse {

    private String id;

    private Long businessAccountId;

    private String name;

    private WhatsAppLanguage language;

    private WhatsAppStatus status;

    private WhatsAppCategory category;

    private WhatsAppDefaultTemplateStructureApiData structure;

    /**
     * Quality of the template.
     */
    public enum QualityEnum {
        HIGH("HIGH"),
        MEDIUM("MEDIUM"),
        LOW("LOW"),
        UNKNOWN("UNKNOWN");

        private String value;

        QualityEnum(String value) {
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
        public static QualityEnum fromValue(String value) {
            for (QualityEnum enumElement : QualityEnum.values()) {
                if (enumElement.value.equals(value)) {
                    return enumElement;
                }
            }
            throw new IllegalArgumentException("Unexpected enum value '" + value + "'.");
        }
    }

    private QualityEnum quality;

    /**
     * Sets id.
     * <p>
     * Field description:
     * Template ID.
     *
     * @param id
     * @return This {@link WhatsAppDefaultMarketingTemplateApiResponse instance}.
     */
    public WhatsAppDefaultMarketingTemplateApiResponse id(String id) {
        this.id = id;
        return this;
    }

    /**
     * Returns id.
     * <p>
     * Field description:
     * Template ID.
     *
     * @return id
     */
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    /**
     * Sets id.
     * <p>
     * Field description:
     * Template ID.
     *
     * @param id
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Sets businessAccountId.
     * <p>
     * Field description:
     * Business account ID to which template belongs.
     *
     * @param businessAccountId
     * @return This {@link WhatsAppDefaultMarketingTemplateApiResponse instance}.
     */
    public WhatsAppDefaultMarketingTemplateApiResponse businessAccountId(Long businessAccountId) {
        this.businessAccountId = businessAccountId;
        return this;
    }

    /**
     * Returns businessAccountId.
     * <p>
     * Field description:
     * Business account ID to which template belongs.
     *
     * @return businessAccountId
     */
    @JsonProperty("businessAccountId")
    public Long getBusinessAccountId() {
        return businessAccountId;
    }

    /**
     * Sets businessAccountId.
     * <p>
     * Field description:
     * Business account ID to which template belongs.
     *
     * @param businessAccountId
     */
    @JsonProperty("businessAccountId")
    public void setBusinessAccountId(Long businessAccountId) {
        this.businessAccountId = businessAccountId;
    }

    /**
     * Sets name.
     * <p>
     * Field description:
     * Name of the template.
     *
     * @param name
     * @return This {@link WhatsAppDefaultMarketingTemplateApiResponse instance}.
     */
    public WhatsAppDefaultMarketingTemplateApiResponse name(String name) {
        this.name = name;
        return this;
    }

    /**
     * Returns name.
     * <p>
     * Field description:
     * Name of the template.
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
     * Name of the template.
     *
     * @param name
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Sets language.
     *
     * @param language
     * @return This {@link WhatsAppDefaultMarketingTemplateApiResponse instance}.
     */
    public WhatsAppDefaultMarketingTemplateApiResponse language(WhatsAppLanguage language) {
        this.language = language;
        return this;
    }

    /**
     * Returns language.
     *
     * @return language
     */
    @JsonProperty("language")
    public WhatsAppLanguage getLanguage() {
        return language;
    }

    /**
     * Sets language.
     *
     * @param language
     */
    @JsonProperty("language")
    public void setLanguage(WhatsAppLanguage language) {
        this.language = language;
    }

    /**
     * Sets status.
     *
     * @param status
     * @return This {@link WhatsAppDefaultMarketingTemplateApiResponse instance}.
     */
    public WhatsAppDefaultMarketingTemplateApiResponse status(WhatsAppStatus status) {
        this.status = status;
        return this;
    }

    /**
     * Returns status.
     *
     * @return status
     */
    @JsonProperty("status")
    public WhatsAppStatus getStatus() {
        return status;
    }

    /**
     * Sets status.
     *
     * @param status
     */
    @JsonProperty("status")
    public void setStatus(WhatsAppStatus status) {
        this.status = status;
    }

    /**
     * Sets category.
     *
     * @param category
     * @return This {@link WhatsAppDefaultMarketingTemplateApiResponse instance}.
     */
    public WhatsAppDefaultMarketingTemplateApiResponse category(WhatsAppCategory category) {
        this.category = category;
        return this;
    }

    /**
     * Returns category.
     *
     * @return category
     */
    @JsonProperty("category")
    public WhatsAppCategory getCategory() {
        return category;
    }

    /**
     * Sets category.
     *
     * @param category
     */
    @JsonProperty("category")
    public void setCategory(WhatsAppCategory category) {
        this.category = category;
    }

    /**
     * Sets structure.
     * <p>
     * The field is required.
     *
     * @param structure
     * @return This {@link WhatsAppDefaultMarketingTemplateApiResponse instance}.
     */
    public WhatsAppDefaultMarketingTemplateApiResponse structure(WhatsAppDefaultTemplateStructureApiData structure) {
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
    public WhatsAppDefaultTemplateStructureApiData getStructure() {
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
    public void setStructure(WhatsAppDefaultTemplateStructureApiData structure) {
        this.structure = structure;
    }

    /**
     * Sets quality.
     * <p>
     * Field description:
     * Quality of the template.
     *
     * @param quality
     * @return This {@link WhatsAppDefaultMarketingTemplateApiResponse instance}.
     */
    public WhatsAppDefaultMarketingTemplateApiResponse quality(QualityEnum quality) {
        this.quality = quality;
        return this;
    }

    /**
     * Returns quality.
     * <p>
     * Field description:
     * Quality of the template.
     *
     * @return quality
     */
    @JsonProperty("quality")
    public QualityEnum getQuality() {
        return quality;
    }

    /**
     * Sets quality.
     * <p>
     * Field description:
     * Quality of the template.
     *
     * @param quality
     */
    @JsonProperty("quality")
    public void setQuality(QualityEnum quality) {
        this.quality = quality;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WhatsAppDefaultMarketingTemplateApiResponse whatsAppDefaultMarketingTemplateApiResponse =
                (WhatsAppDefaultMarketingTemplateApiResponse) o;
        return Objects.equals(this.id, whatsAppDefaultMarketingTemplateApiResponse.id)
                && Objects.equals(this.businessAccountId, whatsAppDefaultMarketingTemplateApiResponse.businessAccountId)
                && Objects.equals(this.name, whatsAppDefaultMarketingTemplateApiResponse.name)
                && Objects.equals(this.language, whatsAppDefaultMarketingTemplateApiResponse.language)
                && Objects.equals(this.status, whatsAppDefaultMarketingTemplateApiResponse.status)
                && Objects.equals(this.category, whatsAppDefaultMarketingTemplateApiResponse.category)
                && Objects.equals(this.structure, whatsAppDefaultMarketingTemplateApiResponse.structure)
                && Objects.equals(this.quality, whatsAppDefaultMarketingTemplateApiResponse.quality);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, businessAccountId, name, language, status, category, structure, quality);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class WhatsAppDefaultMarketingTemplateApiResponse {")
                .append(newLine)
                .append("    id: ")
                .append(toIndentedString(id))
                .append(newLine)
                .append("    businessAccountId: ")
                .append(toIndentedString(businessAccountId))
                .append(newLine)
                .append("    name: ")
                .append(toIndentedString(name))
                .append(newLine)
                .append("    language: ")
                .append(toIndentedString(language))
                .append(newLine)
                .append("    status: ")
                .append(toIndentedString(status))
                .append(newLine)
                .append("    category: ")
                .append(toIndentedString(category))
                .append(newLine)
                .append("    structure: ")
                .append(toIndentedString(structure))
                .append(newLine)
                .append("    quality: ")
                .append(toIndentedString(quality))
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
