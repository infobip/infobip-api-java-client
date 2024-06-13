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
 * Represents WhatsAppTemplateCopyCodeButtonContent model.
 */
public class WhatsAppTemplateCopyCodeButtonContent extends WhatsAppTemplateButtonContent {

    private String parameter;

    /**
     * Constructs a new {@link WhatsAppTemplateCopyCodeButtonContent} instance.
     */
    public WhatsAppTemplateCopyCodeButtonContent() {
        super("COPY_CODE");
    }

    /**
     * Sets parameter.
     * <p>
     * Field description:
     * Code.
     * <p>
     * The field is required.
     *
     * @param parameter
     * @return This {@link WhatsAppTemplateCopyCodeButtonContent instance}.
     */
    public WhatsAppTemplateCopyCodeButtonContent parameter(String parameter) {
        this.parameter = parameter;
        return this;
    }

    /**
     * Returns parameter.
     * <p>
     * Field description:
     * Code.
     * <p>
     * The field is required.
     *
     * @return parameter
     */
    @JsonProperty("parameter")
    public String getParameter() {
        return parameter;
    }

    /**
     * Sets parameter.
     * <p>
     * Field description:
     * Code.
     * <p>
     * The field is required.
     *
     * @param parameter
     */
    @JsonProperty("parameter")
    public void setParameter(String parameter) {
        this.parameter = parameter;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WhatsAppTemplateCopyCodeButtonContent whatsAppTemplateCopyCodeButtonContent =
                (WhatsAppTemplateCopyCodeButtonContent) o;
        return Objects.equals(this.parameter, whatsAppTemplateCopyCodeButtonContent.parameter) && super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(parameter, super.hashCode());
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class WhatsAppTemplateCopyCodeButtonContent {")
                .append(newLine)
                .append("    ")
                .append(toIndentedString(super.toString()))
                .append(newLine)
                .append("    parameter: ")
                .append(toIndentedString(parameter))
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
