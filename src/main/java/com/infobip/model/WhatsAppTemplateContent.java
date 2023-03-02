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
 * The content object to build a message that will be sent.
 */
public class WhatsAppTemplateContent {

    private String templateName;

    private WhatsAppTemplateDataContent templateData;

    private String language;

    /**
     * Sets templateName.
     * <p>
     * Field description:
     * Template name. Should only contain lowercase alphanumeric characters and underscores.
     * <p>
     * The field is required.
     *
     * @param templateName
     * @return This {@link WhatsAppTemplateContent instance}.
     */
    public WhatsAppTemplateContent templateName(String templateName) {
        this.templateName = templateName;
        return this;
    }

    /**
     * Returns templateName.
     * <p>
     * Field description:
     * Template name. Should only contain lowercase alphanumeric characters and underscores.
     * <p>
     * The field is required.
     *
     * @return templateName
     */
    @JsonProperty("templateName")
    public String getTemplateName() {
        return templateName;
    }

    /**
     * Sets templateName.
     * <p>
     * Field description:
     * Template name. Should only contain lowercase alphanumeric characters and underscores.
     * <p>
     * The field is required.
     *
     * @param templateName
     */
    @JsonProperty("templateName")
    public void setTemplateName(String templateName) {
        this.templateName = templateName;
    }

    /**
     * Sets templateData.
     * <p>
     * The field is required.
     *
     * @param templateData
     * @return This {@link WhatsAppTemplateContent instance}.
     */
    public WhatsAppTemplateContent templateData(WhatsAppTemplateDataContent templateData) {
        this.templateData = templateData;
        return this;
    }

    /**
     * Returns templateData.
     * <p>
     * The field is required.
     *
     * @return templateData
     */
    @JsonProperty("templateData")
    public WhatsAppTemplateDataContent getTemplateData() {
        return templateData;
    }

    /**
     * Sets templateData.
     * <p>
     * The field is required.
     *
     * @param templateData
     */
    @JsonProperty("templateData")
    public void setTemplateData(WhatsAppTemplateDataContent templateData) {
        this.templateData = templateData;
    }

    /**
     * Sets language.
     * <p>
     * Field description:
     * The code of language or locale to use. Must be the same code used when registering the template.
     * <p>
     * The field is required.
     *
     * @param language
     * @return This {@link WhatsAppTemplateContent instance}.
     */
    public WhatsAppTemplateContent language(String language) {
        this.language = language;
        return this;
    }

    /**
     * Returns language.
     * <p>
     * Field description:
     * The code of language or locale to use. Must be the same code used when registering the template.
     * <p>
     * The field is required.
     *
     * @return language
     */
    @JsonProperty("language")
    public String getLanguage() {
        return language;
    }

    /**
     * Sets language.
     * <p>
     * Field description:
     * The code of language or locale to use. Must be the same code used when registering the template.
     * <p>
     * The field is required.
     *
     * @param language
     */
    @JsonProperty("language")
    public void setLanguage(String language) {
        this.language = language;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WhatsAppTemplateContent whatsAppTemplateContent = (WhatsAppTemplateContent) o;
        return Objects.equals(this.templateName, whatsAppTemplateContent.templateName)
                && Objects.equals(this.templateData, whatsAppTemplateContent.templateData)
                && Objects.equals(this.language, whatsAppTemplateContent.language);
    }

    @Override
    public int hashCode() {
        return Objects.hash(templateName, templateData, language);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class WhatsAppTemplateContent {")
                .append(newLine)
                .append("    templateName: ")
                .append(toIndentedString(templateName))
                .append(newLine)
                .append("    templateData: ")
                .append(toIndentedString(templateData))
                .append(newLine)
                .append("    language: ")
                .append(toIndentedString(language))
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
