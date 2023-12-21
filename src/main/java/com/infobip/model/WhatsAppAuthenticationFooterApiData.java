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
 * Template footer.
 */
public class WhatsAppAuthenticationFooterApiData {

    private Integer codeExpirationMinutes;

    /**
     * Sets codeExpirationMinutes.
     * <p>
     * Field description:
     * Indicates number of minutes the password or code is valid. If omitted, the code expiration warning will not be displayed in the delivered message.
     *
     * @param codeExpirationMinutes
     * @return This {@link WhatsAppAuthenticationFooterApiData instance}.
     */
    public WhatsAppAuthenticationFooterApiData codeExpirationMinutes(Integer codeExpirationMinutes) {
        this.codeExpirationMinutes = codeExpirationMinutes;
        return this;
    }

    /**
     * Returns codeExpirationMinutes.
     * <p>
     * Field description:
     * Indicates number of minutes the password or code is valid. If omitted, the code expiration warning will not be displayed in the delivered message.
     *
     * @return codeExpirationMinutes
     */
    @JsonProperty("codeExpirationMinutes")
    public Integer getCodeExpirationMinutes() {
        return codeExpirationMinutes;
    }

    /**
     * Sets codeExpirationMinutes.
     * <p>
     * Field description:
     * Indicates number of minutes the password or code is valid. If omitted, the code expiration warning will not be displayed in the delivered message.
     *
     * @param codeExpirationMinutes
     */
    @JsonProperty("codeExpirationMinutes")
    public void setCodeExpirationMinutes(Integer codeExpirationMinutes) {
        this.codeExpirationMinutes = codeExpirationMinutes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WhatsAppAuthenticationFooterApiData whatsAppAuthenticationFooterApiData =
                (WhatsAppAuthenticationFooterApiData) o;
        return Objects.equals(this.codeExpirationMinutes, whatsAppAuthenticationFooterApiData.codeExpirationMinutes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codeExpirationMinutes);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class WhatsAppAuthenticationFooterApiData {")
                .append(newLine)
                .append("    codeExpirationMinutes: ")
                .append(toIndentedString(codeExpirationMinutes))
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
