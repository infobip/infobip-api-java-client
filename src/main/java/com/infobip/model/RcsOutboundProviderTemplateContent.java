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
 * Represents RcsOutboundProviderTemplateContent model.
 */
public class RcsOutboundProviderTemplateContent extends RcsOutboundMessageContent {

    private String templateId;

    private List<RcsParameter> parameters = null;

    /**
     * Constructs a new {@link RcsOutboundProviderTemplateContent} instance.
     */
    public RcsOutboundProviderTemplateContent() {
        super("PROVIDER_TEMPLATE");
    }

    /**
     * Sets templateId.
     * <p>
     * Field description:
     * Unique Template code. Must match Template name as registered when creating template. Mismatch will result in EC7018.
     * <p>
     * The field is required.
     *
     * @param templateId
     * @return This {@link RcsOutboundProviderTemplateContent instance}.
     */
    public RcsOutboundProviderTemplateContent templateId(String templateId) {
        this.templateId = templateId;
        return this;
    }

    /**
     * Returns templateId.
     * <p>
     * Field description:
     * Unique Template code. Must match Template name as registered when creating template. Mismatch will result in EC7018.
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
     * Unique Template code. Must match Template name as registered when creating template. Mismatch will result in EC7018.
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
     * Template parameters. Parameter names should match ones defined in template and value to be replaced in message. Mismatch will result in EC7018.
     *
     * @param parameters
     * @return This {@link RcsOutboundProviderTemplateContent instance}.
     */
    public RcsOutboundProviderTemplateContent parameters(List<RcsParameter> parameters) {
        this.parameters = parameters;
        return this;
    }

    /**
     * Adds and item into parameters.
     * <p>
     * Field description:
     * Template parameters. Parameter names should match ones defined in template and value to be replaced in message. Mismatch will result in EC7018.
     *
     * @param parametersItem The item to be added to the list.
     * @return This {@link RcsOutboundProviderTemplateContent instance}.
     */
    public RcsOutboundProviderTemplateContent addParametersItem(RcsParameter parametersItem) {
        if (this.parameters == null) {
            this.parameters = new ArrayList<>();
        }
        this.parameters.add(parametersItem);
        return this;
    }

    /**
     * Returns parameters.
     * <p>
     * Field description:
     * Template parameters. Parameter names should match ones defined in template and value to be replaced in message. Mismatch will result in EC7018.
     *
     * @return parameters
     */
    @JsonProperty("parameters")
    public List<RcsParameter> getParameters() {
        return parameters;
    }

    /**
     * Sets parameters.
     * <p>
     * Field description:
     * Template parameters. Parameter names should match ones defined in template and value to be replaced in message. Mismatch will result in EC7018.
     *
     * @param parameters
     */
    @JsonProperty("parameters")
    public void setParameters(List<RcsParameter> parameters) {
        this.parameters = parameters;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RcsOutboundProviderTemplateContent rcsOutboundProviderTemplateContent = (RcsOutboundProviderTemplateContent) o;
        return Objects.equals(this.templateId, rcsOutboundProviderTemplateContent.templateId)
                && Objects.equals(this.parameters, rcsOutboundProviderTemplateContent.parameters)
                && super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(templateId, parameters, super.hashCode());
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class RcsOutboundProviderTemplateContent {")
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
