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
 * Represents WhatsAppTemplateCategoryPushEventChange model.
 */
public class WhatsAppTemplateCategoryPushEventChange extends WhatsAppTemplatePushEventChange {

    private WhatsAppPreviousTemplateCategory previousCategory;

    private WhatsAppNewTemplateCategory newCategory;

    /**
     * Constructs a new {@link WhatsAppTemplateCategoryPushEventChange} instance.
     */
    public WhatsAppTemplateCategoryPushEventChange() {
        super("TEMPLATE_CATEGORY_UPDATE");
    }

    /**
     * Sets previousCategory.
     * <p>
     * The field is required.
     *
     * @param previousCategory
     * @return This {@link WhatsAppTemplateCategoryPushEventChange instance}.
     */
    public WhatsAppTemplateCategoryPushEventChange previousCategory(WhatsAppPreviousTemplateCategory previousCategory) {
        this.previousCategory = previousCategory;
        return this;
    }

    /**
     * Returns previousCategory.
     * <p>
     * The field is required.
     *
     * @return previousCategory
     */
    @JsonProperty("previousCategory")
    public WhatsAppPreviousTemplateCategory getPreviousCategory() {
        return previousCategory;
    }

    /**
     * Sets previousCategory.
     * <p>
     * The field is required.
     *
     * @param previousCategory
     */
    @JsonProperty("previousCategory")
    public void setPreviousCategory(WhatsAppPreviousTemplateCategory previousCategory) {
        this.previousCategory = previousCategory;
    }

    /**
     * Sets newCategory.
     * <p>
     * The field is required.
     *
     * @param newCategory
     * @return This {@link WhatsAppTemplateCategoryPushEventChange instance}.
     */
    public WhatsAppTemplateCategoryPushEventChange newCategory(WhatsAppNewTemplateCategory newCategory) {
        this.newCategory = newCategory;
        return this;
    }

    /**
     * Returns newCategory.
     * <p>
     * The field is required.
     *
     * @return newCategory
     */
    @JsonProperty("newCategory")
    public WhatsAppNewTemplateCategory getNewCategory() {
        return newCategory;
    }

    /**
     * Sets newCategory.
     * <p>
     * The field is required.
     *
     * @param newCategory
     */
    @JsonProperty("newCategory")
    public void setNewCategory(WhatsAppNewTemplateCategory newCategory) {
        this.newCategory = newCategory;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WhatsAppTemplateCategoryPushEventChange whatsAppTemplateCategoryPushEventChange =
                (WhatsAppTemplateCategoryPushEventChange) o;
        return Objects.equals(this.previousCategory, whatsAppTemplateCategoryPushEventChange.previousCategory)
                && Objects.equals(this.newCategory, whatsAppTemplateCategoryPushEventChange.newCategory)
                && super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(previousCategory, newCategory, super.hashCode());
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class WhatsAppTemplateCategoryPushEventChange {")
                .append(newLine)
                .append("    ")
                .append(toIndentedString(super.toString()))
                .append(newLine)
                .append("    previousCategory: ")
                .append(toIndentedString(previousCategory))
                .append(newLine)
                .append("    newCategory: ")
                .append(toIndentedString(newCategory))
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
