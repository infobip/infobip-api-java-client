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
import java.util.Objects;

/**
 * Represents WhatsAppTemplateEditPublicApiRequest model.
 */
public class WhatsAppTemplateEditPublicApiRequest {

    private WhatsAppCategory category;

    private WhatsAppTemplateStructureApiData structure;

    private ValidityPeriod validityPeriod;

    private Platform platform;

    private WhatsAppEditSubCategory subCategory;

    /**
     * Sets category.
     *
     * @param category
     * @return This {@link WhatsAppTemplateEditPublicApiRequest instance}.
     */
    public WhatsAppTemplateEditPublicApiRequest category(WhatsAppCategory category) {
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
     *
     * @param structure
     * @return This {@link WhatsAppTemplateEditPublicApiRequest instance}.
     */
    public WhatsAppTemplateEditPublicApiRequest structure(WhatsAppTemplateStructureApiData structure) {
        this.structure = structure;
        return this;
    }

    /**
     * Returns structure.
     *
     * @return structure
     */
    @JsonProperty("structure")
    public WhatsAppTemplateStructureApiData getStructure() {
        return structure;
    }

    /**
     * Sets structure.
     *
     * @param structure
     */
    @JsonProperty("structure")
    public void setStructure(WhatsAppTemplateStructureApiData structure) {
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

    /**
     * Sets subCategory.
     *
     * @param subCategory
     * @return This {@link WhatsAppTemplateEditPublicApiRequest instance}.
     */
    public WhatsAppTemplateEditPublicApiRequest subCategory(WhatsAppEditSubCategory subCategory) {
        this.subCategory = subCategory;
        return this;
    }

    /**
     * Returns subCategory.
     *
     * @return subCategory
     */
    @JsonProperty("subCategory")
    public WhatsAppEditSubCategory getSubCategory() {
        return subCategory;
    }

    /**
     * Sets subCategory.
     *
     * @param subCategory
     */
    @JsonProperty("subCategory")
    public void setSubCategory(WhatsAppEditSubCategory subCategory) {
        this.subCategory = subCategory;
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
                && Objects.equals(this.platform, whatsAppTemplateEditPublicApiRequest.platform)
                && Objects.equals(this.subCategory, whatsAppTemplateEditPublicApiRequest.subCategory);
    }

    @Override
    public int hashCode() {
        return Objects.hash(category, structure, validityPeriod, platform, subCategory);
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
                .append("    subCategory: ")
                .append(toIndentedString(subCategory))
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
