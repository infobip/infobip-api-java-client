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
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Represents WhatsAppTemplatesApiResponse model.
 */
public class WhatsAppTemplatesApiResponse {

    private List<WhatsAppTemplateApiResponse> templates = null;

    /**
     * Sets templates.
     * <p>
     * Field description:
     * List of all templates for given sender.
     *
     * @param templates
     * @return This {@link WhatsAppTemplatesApiResponse instance}.
     */
    public WhatsAppTemplatesApiResponse templates(List<WhatsAppTemplateApiResponse> templates) {
        this.templates = templates;
        return this;
    }

    /**
     * Adds and item into templates.
     * <p>
     * Field description:
     * List of all templates for given sender.
     *
     * @param templatesItem The item to be added to the list.
     * @return This {@link WhatsAppTemplatesApiResponse instance}.
     */
    public WhatsAppTemplatesApiResponse addTemplatesItem(WhatsAppTemplateApiResponse templatesItem) {
        if (this.templates == null) {
            this.templates = new ArrayList<>();
        }
        this.templates.add(templatesItem);
        return this;
    }

    /**
     * Returns templates.
     * <p>
     * Field description:
     * List of all templates for given sender.
     *
     * @return templates
     */
    @JsonProperty("templates")
    public List<WhatsAppTemplateApiResponse> getTemplates() {
        return templates;
    }

    /**
     * Sets templates.
     * <p>
     * Field description:
     * List of all templates for given sender.
     *
     * @param templates
     */
    @JsonProperty("templates")
    public void setTemplates(List<WhatsAppTemplateApiResponse> templates) {
        this.templates = templates;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WhatsAppTemplatesApiResponse whatsAppTemplatesApiResponse = (WhatsAppTemplatesApiResponse) o;
        return Objects.equals(this.templates, whatsAppTemplatesApiResponse.templates);
    }

    @Override
    public int hashCode() {
        return Objects.hash(templates);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class WhatsAppTemplatesApiResponse {")
                .append(newLine)
                .append("    templates: ")
                .append(toIndentedString(templates))
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
