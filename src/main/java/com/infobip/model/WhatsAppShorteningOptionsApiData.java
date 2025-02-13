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
 * URL shortening options. Applicable only if at least one dynamic URL button is present. Modifying this provided URL outside of our company&#39;s services may lead to unexpected results.
 */
public class WhatsAppShorteningOptionsApiData {

    private String customDomain;

    /**
     * Sets customDomain.
     * <p>
     * Field description:
     * Custom domain to be used for URL shortening.
     * <p>
     * The field is required.
     *
     * @param customDomain
     * @return This {@link WhatsAppShorteningOptionsApiData instance}.
     */
    public WhatsAppShorteningOptionsApiData customDomain(String customDomain) {
        this.customDomain = customDomain;
        return this;
    }

    /**
     * Returns customDomain.
     * <p>
     * Field description:
     * Custom domain to be used for URL shortening.
     * <p>
     * The field is required.
     *
     * @return customDomain
     */
    @JsonProperty("customDomain")
    public String getCustomDomain() {
        return customDomain;
    }

    /**
     * Sets customDomain.
     * <p>
     * Field description:
     * Custom domain to be used for URL shortening.
     * <p>
     * The field is required.
     *
     * @param customDomain
     */
    @JsonProperty("customDomain")
    public void setCustomDomain(String customDomain) {
        this.customDomain = customDomain;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WhatsAppShorteningOptionsApiData whatsAppShorteningOptionsApiData = (WhatsAppShorteningOptionsApiData) o;
        return Objects.equals(this.customDomain, whatsAppShorteningOptionsApiData.customDomain);
    }

    @Override
    public int hashCode() {
        return Objects.hash(customDomain);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class WhatsAppShorteningOptionsApiData {")
                .append(newLine)
                .append("    customDomain: ")
                .append(toIndentedString(customDomain))
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
