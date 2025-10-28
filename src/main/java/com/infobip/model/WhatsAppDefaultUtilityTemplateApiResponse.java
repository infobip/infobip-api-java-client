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
 * Represents WhatsAppDefaultUtilityTemplateApiResponse model.
 */
public class WhatsAppDefaultUtilityTemplateApiResponse extends WhatsAppTemplateApiResponse {

    private WhatsAppEditSubCategory subCategory;

    /**
     * Constructs a new {@link WhatsAppDefaultUtilityTemplateApiResponse} instance.
     */
    public WhatsAppDefaultUtilityTemplateApiResponse() {
        super("UTILITY");
    }

    /**
     * Sets subCategory.
     *
     * @param subCategory
     * @return This {@link WhatsAppDefaultUtilityTemplateApiResponse instance}.
     */
    public WhatsAppDefaultUtilityTemplateApiResponse subCategory(WhatsAppEditSubCategory subCategory) {
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
        WhatsAppDefaultUtilityTemplateApiResponse whatsAppDefaultUtilityTemplateApiResponse =
                (WhatsAppDefaultUtilityTemplateApiResponse) o;
        return Objects.equals(this.subCategory, whatsAppDefaultUtilityTemplateApiResponse.subCategory)
                && super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(subCategory, super.hashCode());
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class WhatsAppDefaultUtilityTemplateApiResponse {")
                .append(newLine)
                .append("    ")
                .append(toIndentedString(super.toString()))
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
