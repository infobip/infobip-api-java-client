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
 * Represents WhatsAppTemplateUrlButtonContent model.
 */
public class WhatsAppTemplateUrlButtonContent extends WhatsAppTemplateButtonContent {

    private String parameter;

    /**
     * Constructs a new {@link WhatsAppTemplateUrlButtonContent} instance.
     */
    public WhatsAppTemplateUrlButtonContent() {
        super("URL");
    }

    /**
     * Sets parameter.
     * <p>
     * Field description:
     * URL extension of a &#x60;dynamic URL&#x60; defined in the registered template. Learn more about [URL buttons](https://www.infobip.com/docs/whatsapp/whatsapp-over-api#dynamic-template-button-urls-with-shortening-and-tracking).
     * <p>
     * The field is required.
     *
     * @param parameter
     * @return This {@link WhatsAppTemplateUrlButtonContent instance}.
     */
    public WhatsAppTemplateUrlButtonContent parameter(String parameter) {
        this.parameter = parameter;
        return this;
    }

    /**
     * Returns parameter.
     * <p>
     * Field description:
     * URL extension of a &#x60;dynamic URL&#x60; defined in the registered template. Learn more about [URL buttons](https://www.infobip.com/docs/whatsapp/whatsapp-over-api#dynamic-template-button-urls-with-shortening-and-tracking).
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
     * URL extension of a &#x60;dynamic URL&#x60; defined in the registered template. Learn more about [URL buttons](https://www.infobip.com/docs/whatsapp/whatsapp-over-api#dynamic-template-button-urls-with-shortening-and-tracking).
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
        WhatsAppTemplateUrlButtonContent whatsAppTemplateUrlButtonContent = (WhatsAppTemplateUrlButtonContent) o;
        return Objects.equals(this.parameter, whatsAppTemplateUrlButtonContent.parameter) && super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(parameter, super.hashCode());
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class WhatsAppTemplateUrlButtonContent {")
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
