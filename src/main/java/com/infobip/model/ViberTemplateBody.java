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
 * Template body containing the actual message text for a specific language.
 */
public class ViberTemplateBody {

    private ViberTemplateLang language;

    private String template;

    /**
     * Sets language.
     * <p>
     * The field is required.
     *
     * @param language
     * @return This {@link ViberTemplateBody instance}.
     */
    public ViberTemplateBody language(ViberTemplateLang language) {
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
    public ViberTemplateLang getLanguage() {
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
    public void setLanguage(ViberTemplateLang language) {
        this.language = language;
    }

    /**
     * Sets template.
     * <p>
     * Field description:
     * Template message text with optional placeholders for variables (e.g., {{1}}, {{2}}). Maximum 1000 characters. Last word in the template text cannot be a placeholder.
     * <p>
     * The field is required.
     *
     * @param template
     * @return This {@link ViberTemplateBody instance}.
     */
    public ViberTemplateBody template(String template) {
        this.template = template;
        return this;
    }

    /**
     * Returns template.
     * <p>
     * Field description:
     * Template message text with optional placeholders for variables (e.g., {{1}}, {{2}}). Maximum 1000 characters. Last word in the template text cannot be a placeholder.
     * <p>
     * The field is required.
     *
     * @return template
     */
    @JsonProperty("template")
    public String getTemplate() {
        return template;
    }

    /**
     * Sets template.
     * <p>
     * Field description:
     * Template message text with optional placeholders for variables (e.g., {{1}}, {{2}}). Maximum 1000 characters. Last word in the template text cannot be a placeholder.
     * <p>
     * The field is required.
     *
     * @param template
     */
    @JsonProperty("template")
    public void setTemplate(String template) {
        this.template = template;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ViberTemplateBody viberTemplateBody = (ViberTemplateBody) o;
        return Objects.equals(this.language, viberTemplateBody.language)
                && Objects.equals(this.template, viberTemplateBody.template);
    }

    @Override
    public int hashCode() {
        return Objects.hash(language, template);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class ViberTemplateBody {")
                .append(newLine)
                .append("    language: ")
                .append(toIndentedString(language))
                .append(newLine)
                .append("    template: ")
                .append(toIndentedString(template))
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
