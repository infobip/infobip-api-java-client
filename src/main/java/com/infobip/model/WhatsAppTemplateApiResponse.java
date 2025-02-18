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
import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * The list of the results for this page.
 */
@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.EXISTING_PROPERTY,
        property = "category",
        visible = true)
@JsonSubTypes({
    @JsonSubTypes.Type(value = WhatsAppAuthenticationTemplateApiResponse.class, name = "AUTHENTICATION"),
    @JsonSubTypes.Type(value = WhatsAppDefaultMarketingTemplateApiResponse.class, name = "MARKETING"),
    @JsonSubTypes.Type(value = WhatsAppDefaultUtilityTemplateApiResponse.class, name = "UTILITY"),
})
public abstract class WhatsAppTemplateApiResponse {

    private String id;

    private Long businessAccountId;

    private String name;

    private WhatsAppLanguage language;

    private WhatsAppStatus status;

    protected final WhatsAppCategory category;

    /**
     * Constructs a new {@link WhatsAppTemplateApiResponse} instance.
     */
    public WhatsAppTemplateApiResponse(String category) {
        this.category = WhatsAppCategory.fromValue(category);
    }

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

    private Platform platform;

    private OffsetDateTime createdAt;

    private OffsetDateTime lastUpdatedAt;

    /**
     * Sets id.
     * <p>
     * Field description:
     * Template ID.
     *
     * @param id
     * @return This {@link WhatsAppTemplateApiResponse instance}.
     */
    public WhatsAppTemplateApiResponse id(String id) {
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
     * @return This {@link WhatsAppTemplateApiResponse instance}.
     */
    public WhatsAppTemplateApiResponse businessAccountId(Long businessAccountId) {
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
     * @return This {@link WhatsAppTemplateApiResponse instance}.
     */
    public WhatsAppTemplateApiResponse name(String name) {
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
     * @return This {@link WhatsAppTemplateApiResponse instance}.
     */
    public WhatsAppTemplateApiResponse language(WhatsAppLanguage language) {
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
     * @return This {@link WhatsAppTemplateApiResponse instance}.
     */
    public WhatsAppTemplateApiResponse status(WhatsAppStatus status) {
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
     * Returns category.
     *
     * @return category
     */
    @JsonProperty("category")
    public WhatsAppCategory getCategory() {
        return category;
    }

    /**
     * Sets structure.
     * <p>
     * The field is required.
     *
     * @param structure
     * @return This {@link WhatsAppTemplateApiResponse instance}.
     */
    public WhatsAppTemplateApiResponse structure(WhatsAppDefaultTemplateStructureApiData structure) {
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
     * @return This {@link WhatsAppTemplateApiResponse instance}.
     */
    public WhatsAppTemplateApiResponse quality(QualityEnum quality) {
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

    /**
     * Sets platform.
     *
     * @param platform
     * @return This {@link WhatsAppTemplateApiResponse instance}.
     */
    public WhatsAppTemplateApiResponse platform(Platform platform) {
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

    /**
     * Sets createdAt.
     * <p>
     * Field description:
     * Creation date of the template.
     *
     * @param createdAt
     * @return This {@link WhatsAppTemplateApiResponse instance}.
     */
    public WhatsAppTemplateApiResponse createdAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * Returns createdAt.
     * <p>
     * Field description:
     * Creation date of the template.
     *
     * @return createdAt
     */
    @JsonProperty("createdAt")
    public OffsetDateTime getCreatedAt() {
        return createdAt;
    }

    /**
     * Sets createdAt.
     * <p>
     * Field description:
     * Creation date of the template.
     *
     * @param createdAt
     */
    @JsonProperty("createdAt")
    public void setCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * Sets lastUpdatedAt.
     * <p>
     * Field description:
     * Last update date of the template.
     *
     * @param lastUpdatedAt
     * @return This {@link WhatsAppTemplateApiResponse instance}.
     */
    public WhatsAppTemplateApiResponse lastUpdatedAt(OffsetDateTime lastUpdatedAt) {
        this.lastUpdatedAt = lastUpdatedAt;
        return this;
    }

    /**
     * Returns lastUpdatedAt.
     * <p>
     * Field description:
     * Last update date of the template.
     *
     * @return lastUpdatedAt
     */
    @JsonProperty("lastUpdatedAt")
    public OffsetDateTime getLastUpdatedAt() {
        return lastUpdatedAt;
    }

    /**
     * Sets lastUpdatedAt.
     * <p>
     * Field description:
     * Last update date of the template.
     *
     * @param lastUpdatedAt
     */
    @JsonProperty("lastUpdatedAt")
    public void setLastUpdatedAt(OffsetDateTime lastUpdatedAt) {
        this.lastUpdatedAt = lastUpdatedAt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WhatsAppTemplateApiResponse whatsAppTemplateApiResponse = (WhatsAppTemplateApiResponse) o;
        return Objects.equals(this.id, whatsAppTemplateApiResponse.id)
                && Objects.equals(this.businessAccountId, whatsAppTemplateApiResponse.businessAccountId)
                && Objects.equals(this.name, whatsAppTemplateApiResponse.name)
                && Objects.equals(this.language, whatsAppTemplateApiResponse.language)
                && Objects.equals(this.status, whatsAppTemplateApiResponse.status)
                && Objects.equals(this.category, whatsAppTemplateApiResponse.category)
                && Objects.equals(this.structure, whatsAppTemplateApiResponse.structure)
                && Objects.equals(this.quality, whatsAppTemplateApiResponse.quality)
                && Objects.equals(this.platform, whatsAppTemplateApiResponse.platform)
                && Objects.equals(this.createdAt, whatsAppTemplateApiResponse.createdAt)
                && Objects.equals(this.lastUpdatedAt, whatsAppTemplateApiResponse.lastUpdatedAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                id,
                businessAccountId,
                name,
                language,
                status,
                category,
                structure,
                quality,
                platform,
                createdAt,
                lastUpdatedAt);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class WhatsAppTemplateApiResponse {")
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
                .append("    platform: ")
                .append(toIndentedString(platform))
                .append(newLine)
                .append("    createdAt: ")
                .append(toIndentedString(createdAt))
                .append(newLine)
                .append("    lastUpdatedAt: ")
                .append(toIndentedString(lastUpdatedAt))
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
