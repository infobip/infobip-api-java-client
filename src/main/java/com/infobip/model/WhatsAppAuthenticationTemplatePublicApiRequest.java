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
 * Represents WhatsAppAuthenticationTemplatePublicApiRequest model.
 */
public class WhatsAppAuthenticationTemplatePublicApiRequest extends WhatsAppTemplatePublicApiRequest {

    private WhatsAppAuthenticationTemplateStructureApiData structure;

    private WhatsAppValidityPeriodApiData validityPeriod;

    /**
     * Constructs a new {@link WhatsAppAuthenticationTemplatePublicApiRequest} instance.
     */
    public WhatsAppAuthenticationTemplatePublicApiRequest() {
        super("AUTHENTICATION");
    }

    /**
     * Sets structure.
     * <p>
     * The field is required.
     *
     * @param structure
     * @return This {@link WhatsAppAuthenticationTemplatePublicApiRequest instance}.
     */
    public WhatsAppAuthenticationTemplatePublicApiRequest structure(
            WhatsAppAuthenticationTemplateStructureApiData structure) {
        this.structure = structure;
        return this;
    }

    /**
     * Returns structure.
     * <p>
     * The field is required.
     *
     * @return structure
     */
    @JsonProperty("structure")
    public WhatsAppAuthenticationTemplateStructureApiData getStructure() {
        return structure;
    }

    /**
     * Sets structure.
     * <p>
     * The field is required.
     *
     * @param structure
     */
    @JsonProperty("structure")
    public void setStructure(WhatsAppAuthenticationTemplateStructureApiData structure) {
        this.structure = structure;
    }

    /**
     * Sets validityPeriod.
     *
     * @param validityPeriod
     * @return This {@link WhatsAppAuthenticationTemplatePublicApiRequest instance}.
     */
    public WhatsAppAuthenticationTemplatePublicApiRequest validityPeriod(WhatsAppValidityPeriodApiData validityPeriod) {
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
        WhatsAppAuthenticationTemplatePublicApiRequest whatsAppAuthenticationTemplatePublicApiRequest =
                (WhatsAppAuthenticationTemplatePublicApiRequest) o;
        return Objects.equals(this.structure, whatsAppAuthenticationTemplatePublicApiRequest.structure)
                && Objects.equals(this.validityPeriod, whatsAppAuthenticationTemplatePublicApiRequest.validityPeriod)
                && super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(structure, validityPeriod, super.hashCode());
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class WhatsAppAuthenticationTemplatePublicApiRequest {")
                .append(newLine)
                .append("    ")
                .append(toIndentedString(super.toString()))
                .append(newLine)
                .append("    structure: ")
                .append(toIndentedString(structure))
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
