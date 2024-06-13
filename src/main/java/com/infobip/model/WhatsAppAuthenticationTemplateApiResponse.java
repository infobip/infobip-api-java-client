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
 * Represents WhatsAppAuthenticationTemplateApiResponse model.
 */
public class WhatsAppAuthenticationTemplateApiResponse extends WhatsAppTemplateApiResponse {

    private WhatsAppValidityPeriodApiData validityPeriod;

    /**
     * Constructs a new {@link WhatsAppAuthenticationTemplateApiResponse} instance.
     */
    public WhatsAppAuthenticationTemplateApiResponse() {
        super("AUTHENTICATION");
    }

    /**
     * Sets validityPeriod.
     *
     * @param validityPeriod
     * @return This {@link WhatsAppAuthenticationTemplateApiResponse instance}.
     */
    public WhatsAppAuthenticationTemplateApiResponse validityPeriod(WhatsAppValidityPeriodApiData validityPeriod) {
        this.validityPeriod = validityPeriod;
        return this;
    }

    /**
     * Returns validityPeriod.
     *
     * @return validityPeriod
     */
    @JsonProperty("validityPeriod")
    public WhatsAppValidityPeriodApiData getValidityPeriod() {
        return validityPeriod;
    }

    /**
     * Sets validityPeriod.
     *
     * @param validityPeriod
     */
    @JsonProperty("validityPeriod")
    public void setValidityPeriod(WhatsAppValidityPeriodApiData validityPeriod) {
        this.validityPeriod = validityPeriod;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WhatsAppAuthenticationTemplateApiResponse whatsAppAuthenticationTemplateApiResponse =
                (WhatsAppAuthenticationTemplateApiResponse) o;
        return Objects.equals(this.validityPeriod, whatsAppAuthenticationTemplateApiResponse.validityPeriod)
                && super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(validityPeriod, super.hashCode());
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class WhatsAppAuthenticationTemplateApiResponse {")
                .append(newLine)
                .append("    ")
                .append(toIndentedString(super.toString()))
                .append(newLine)
                .append("    validityPeriod: ")
                .append(toIndentedString(validityPeriod))
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
