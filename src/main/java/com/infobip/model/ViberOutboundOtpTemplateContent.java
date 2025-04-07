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
 * Represents ViberOutboundOtpTemplateContent model.
 */
public class ViberOutboundOtpTemplateContent extends ViberOutboundContent {

    private String id;

    private Map<String, String> parameters = new HashMap<>();

    private ViberOtpTemplateLanguage language;

    /**
     * Constructs a new {@link ViberOutboundOtpTemplateContent} instance.
     */
    public ViberOutboundOtpTemplateContent() {
        super("OTP_TEMPLATE");
    }

    /**
     * Sets id.
     * <p>
     * Field description:
     * Predefined code of a template to be sent.
     * <p>
     * The field is required.
     *
     * @param id
     * @return This {@link ViberOutboundOtpTemplateContent instance}.
     */
    public ViberOutboundOtpTemplateContent id(String id) {
        this.id = id;
        return this;
    }

    /**
     * Returns id.
     * <p>
     * Field description:
     * Predefined code of a template to be sent.
     * <p>
     * The field is required.
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
     * Predefined code of a template to be sent.
     * <p>
     * The field is required.
     *
     * @param id
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Sets parameters.
     * <p>
     * Field description:
     * A range of variables which are specific per template.
     * <p>
     * The field is required.
     *
     * @param parameters
     * @return This {@link ViberOutboundOtpTemplateContent instance}.
     */
    public ViberOutboundOtpTemplateContent parameters(Map<String, String> parameters) {
        this.parameters = parameters;
        return this;
    }

    /**
     * Puts and entry into parameters.
     * <p>
     * Field description:
     * A range of variables which are specific per template.
     * <p>
     * The field is required.
     *
     * @param key The given key.
     * @param parametersItem The item to be associated with the given key.
     * @return This {@link ViberOutboundOtpTemplateContent instance}.
     */
    public ViberOutboundOtpTemplateContent putParametersItem(String key, String parametersItem) {
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
     * A range of variables which are specific per template.
     * <p>
     * The field is required.
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
     * A range of variables which are specific per template.
     * <p>
     * The field is required.
     *
     * @param parameters
     */
    @JsonProperty("parameters")
    public void setParameters(Map<String, String> parameters) {
        this.parameters = parameters;
    }

    /**
     * Sets language.
     *
     * @param language
     * @return This {@link ViberOutboundOtpTemplateContent instance}.
     */
    public ViberOutboundOtpTemplateContent language(ViberOtpTemplateLanguage language) {
        this.language = language;
        return this;
    }

    /**
     * Returns language.
     *
     * @return language
     */
    @JsonProperty("language")
    public ViberOtpTemplateLanguage getLanguage() {
        return language;
    }

    /**
     * Sets language.
     *
     * @param language
     */
    @JsonProperty("language")
    public void setLanguage(ViberOtpTemplateLanguage language) {
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
        ViberOutboundOtpTemplateContent viberOutboundOtpTemplateContent = (ViberOutboundOtpTemplateContent) o;
        return Objects.equals(this.id, viberOutboundOtpTemplateContent.id)
                && Objects.equals(this.parameters, viberOutboundOtpTemplateContent.parameters)
                && Objects.equals(this.language, viberOutboundOtpTemplateContent.language)
                && super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, parameters, language, super.hashCode());
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class ViberOutboundOtpTemplateContent {")
                .append(newLine)
                .append("    ")
                .append(toIndentedString(super.toString()))
                .append(newLine)
                .append("    id: ")
                .append(toIndentedString(id))
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
