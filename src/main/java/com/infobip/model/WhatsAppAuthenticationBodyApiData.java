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
 * Template body.
 */
public class WhatsAppAuthenticationBodyApiData {

    private Boolean addSecurityRecommendation;

    /**
     * Sets addSecurityRecommendation.
     * <p>
     * Field description:
     * Set to true if you want the template to include the string, \&quot;For your security, do not share this code.\&quot; Set to false to exclude the string.
     *
     * @param addSecurityRecommendation
     * @return This {@link WhatsAppAuthenticationBodyApiData instance}.
     */
    public WhatsAppAuthenticationBodyApiData addSecurityRecommendation(Boolean addSecurityRecommendation) {
        this.addSecurityRecommendation = addSecurityRecommendation;
        return this;
    }

    /**
     * Returns addSecurityRecommendation.
     * <p>
     * Field description:
     * Set to true if you want the template to include the string, \&quot;For your security, do not share this code.\&quot; Set to false to exclude the string.
     *
     * @return addSecurityRecommendation
     */
    @JsonProperty("addSecurityRecommendation")
    public Boolean getAddSecurityRecommendation() {
        return addSecurityRecommendation;
    }

    /**
     * Sets addSecurityRecommendation.
     * <p>
     * Field description:
     * Set to true if you want the template to include the string, \&quot;For your security, do not share this code.\&quot; Set to false to exclude the string.
     *
     * @param addSecurityRecommendation
     */
    @JsonProperty("addSecurityRecommendation")
    public void setAddSecurityRecommendation(Boolean addSecurityRecommendation) {
        this.addSecurityRecommendation = addSecurityRecommendation;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WhatsAppAuthenticationBodyApiData whatsAppAuthenticationBodyApiData = (WhatsAppAuthenticationBodyApiData) o;
        return Objects.equals(
                this.addSecurityRecommendation, whatsAppAuthenticationBodyApiData.addSecurityRecommendation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(addSecurityRecommendation);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class WhatsAppAuthenticationBodyApiData {")
                .append(newLine)
                .append("    addSecurityRecommendation: ")
                .append(toIndentedString(addSecurityRecommendation))
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
