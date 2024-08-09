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
 * Details of the template.
 */
public class MessagesApiTemplate {

    private String templateName;

    private String language;

    /**
     * Sets templateName.
     * <p>
     * Field description:
     * Name of the template.
     * <p>
     * The field is required.
     *
     * @param templateName
     * @return This {@link MessagesApiTemplate instance}.
     */
    public MessagesApiTemplate templateName(String templateName) {
        this.templateName = templateName;
        return this;
    }

    /**
     * Returns templateName.
     * <p>
     * Field description:
     * Name of the template.
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
     * Name of the template.
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
     * Sets language.
     * <p>
     * Field description:
     * Language of the template.
     * <p>
     * The field is required.
     *
     * @param language
     * @return This {@link MessagesApiTemplate instance}.
     */
    public MessagesApiTemplate language(String language) {
        this.language = language;
        return this;
    }

    /**
     * Returns language.
     * <p>
     * Field description:
     * Language of the template.
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
     * Language of the template.
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
        MessagesApiTemplate messagesApiTemplate = (MessagesApiTemplate) o;
        return Objects.equals(this.templateName, messagesApiTemplate.templateName)
                && Objects.equals(this.language, messagesApiTemplate.language);
    }

    @Override
    public int hashCode() {
        return Objects.hash(templateName, language);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class MessagesApiTemplate {")
                .append(newLine)
                .append("    templateName: ")
                .append(toIndentedString(templateName))
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
