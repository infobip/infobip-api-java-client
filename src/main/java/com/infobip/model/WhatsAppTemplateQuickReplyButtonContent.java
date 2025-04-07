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
 * Represents WhatsAppTemplateQuickReplyButtonContent model.
 */
public class WhatsAppTemplateQuickReplyButtonContent extends WhatsAppTemplateButtonContent {

    private String type;

    private String parameter;

    /**
     * Constructs a new {@link WhatsAppTemplateQuickReplyButtonContent} instance.
     */
    public WhatsAppTemplateQuickReplyButtonContent() {
        super("QUICK_REPLY");
    }

    /**
     * Sets type.
     * <p>
     * The field is required.
     *
     * @param type
     * @return This {@link WhatsAppTemplateQuickReplyButtonContent instance}.
     */
    public WhatsAppTemplateQuickReplyButtonContent type(String type) {
        this.type = type;
        return this;
    }

    /**
     * Returns type.
     * <p>
     * The field is required.
     *
     * @return type
     */
    @JsonProperty("type")
    public String getType() {
        return type;
    }

    /**
     * Sets type.
     * <p>
     * The field is required.
     *
     * @param type
     */
    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    /**
     * Sets parameter.
     * <p>
     * Field description:
     * Payload of a &#x60;quick reply&#x60; button.
     * <p>
     * The field is required.
     *
     * @param parameter
     * @return This {@link WhatsAppTemplateQuickReplyButtonContent instance}.
     */
    public WhatsAppTemplateQuickReplyButtonContent parameter(String parameter) {
        this.parameter = parameter;
        return this;
    }

    /**
     * Returns parameter.
     * <p>
     * Field description:
     * Payload of a &#x60;quick reply&#x60; button.
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
     * Payload of a &#x60;quick reply&#x60; button.
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
        WhatsAppTemplateQuickReplyButtonContent whatsAppTemplateQuickReplyButtonContent =
                (WhatsAppTemplateQuickReplyButtonContent) o;
        return Objects.equals(this.type, whatsAppTemplateQuickReplyButtonContent.type)
                && Objects.equals(this.parameter, whatsAppTemplateQuickReplyButtonContent.parameter)
                && super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, parameter, super.hashCode());
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class WhatsAppTemplateQuickReplyButtonContent {")
                .append(newLine)
                .append("    ")
                .append(toIndentedString(super.toString()))
                .append(newLine)
                .append("    type: ")
                .append(toIndentedString(type))
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
