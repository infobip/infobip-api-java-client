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
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Represents ViberOutboundTransactionalTemplateContent model.
 */
public class ViberOutboundTransactionalTemplateContent extends ViberOutboundContent {

    private String templateId;

    private Map<String, String> parameters = null;

    private String language;

    /**
     * Constructs a new {@link ViberOutboundTransactionalTemplateContent} instance.
     */
    public ViberOutboundTransactionalTemplateContent() {
        super("TEMPLATE");
    }

    /**
     * Sets templateId.
     * <p>
     * Field description:
     * Predefined code of a template to be sent.
     * <p>
     * The field is required.
     *
     * @param templateId
     * @return This {@link ViberOutboundTransactionalTemplateContent instance}.
     */
    public ViberOutboundTransactionalTemplateContent templateId(String templateId) {
        this.templateId = templateId;
        return this;
    }

    /**
     * Returns templateId.
     * <p>
     * Field description:
     * Predefined code of a template to be sent.
     * <p>
     * The field is required.
     *
     * @return templateId
     */
    @JsonProperty("templateId")
    public String getTemplateId() {
        return templateId;
    }

    /**
     * Sets templateId.
     * <p>
     * Field description:
     * Predefined code of a template to be sent.
     * <p>
     * The field is required.
     *
     * @param templateId
     */
    @JsonProperty("templateId")
    public void setTemplateId(String templateId) {
        this.templateId = templateId;
    }

    /**
     * Sets parameters.
     * <p>
     * Field description:
     * A range of variables which are specific per template. Omit it if template doesn&#39;t have parameters.
     *
     * @param parameters
     * @return This {@link ViberOutboundTransactionalTemplateContent instance}.
     */
    public ViberOutboundTransactionalTemplateContent parameters(Map<String, String> parameters) {
        this.parameters = parameters;
        return this;
    }

    /**
     * Puts and entry into parameters.
     * <p>
     * Field description:
     * A range of variables which are specific per template. Omit it if template doesn&#39;t have parameters.
     *
     * @param key The given key.
     * @param parametersItem The item to be associated with the given key.
     * @return This {@link ViberOutboundTransactionalTemplateContent instance}.
     */
    public ViberOutboundTransactionalTemplateContent putParametersItem(String key, String parametersItem) {
        if (this.parameters == null) {
            this.parameters = new HashMap<>();
        }
        this.parameters.put(key, parametersItem);
        return this;
    }

    /**
     * Returns parameters.
     * <p>
     * Field description:
     * A range of variables which are specific per template. Omit it if template doesn&#39;t have parameters.
     *
     * @return parameters
     */
    @JsonProperty("parameters")
    public Map<String, String> getParameters() {
        return parameters;
    }

    /**
     * Sets parameters.
     * <p>
     * Field description:
     * A range of variables which are specific per template. Omit it if template doesn&#39;t have parameters.
     *
     * @param parameters
     */
    @JsonProperty("parameters")
    public void setParameters(Map<String, String> parameters) {
        this.parameters = parameters;
    }

    /**
     * Sets language.
     * <p>
     * Field description:
     * Template language. Must match the &#39;lang&#39; parameter from template creation. If not specified (OTP templates only), defaults to device language.
     * <p>
     * The field is required.
     *
     * @param language
     * @return This {@link ViberOutboundTransactionalTemplateContent instance}.
     */
    public ViberOutboundTransactionalTemplateContent language(String language) {
        this.language = language;
        return this;
    }

    /**
     * Returns language.
     * <p>
     * Field description:
     * Template language. Must match the &#39;lang&#39; parameter from template creation. If not specified (OTP templates only), defaults to device language.
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
     * Template language. Must match the &#39;lang&#39; parameter from template creation. If not specified (OTP templates only), defaults to device language.
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
        ViberOutboundTransactionalTemplateContent viberOutboundTransactionalTemplateContent =
                (ViberOutboundTransactionalTemplateContent) o;
        return Objects.equals(this.templateId, viberOutboundTransactionalTemplateContent.templateId)
                && Objects.equals(this.parameters, viberOutboundTransactionalTemplateContent.parameters)
                && Objects.equals(this.language, viberOutboundTransactionalTemplateContent.language)
                && super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(templateId, parameters, language, super.hashCode());
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class ViberOutboundTransactionalTemplateContent {")
                .append(newLine)
                .append("    ")
                .append(toIndentedString(super.toString()))
                .append(newLine)
                .append("    templateId: ")
                .append(toIndentedString(templateId))
                .append(newLine)
                .append("    parameters: ")
                .append(toIndentedString(parameters))
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
