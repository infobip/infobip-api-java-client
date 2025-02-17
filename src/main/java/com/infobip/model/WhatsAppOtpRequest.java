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
 * Represents WhatsAppOtpRequest model.
 */
public class WhatsAppOtpRequest {

    private WhatsAppNumberType type;

    private String locale = "en_US";

    /**
     * Sets type.
     * <p>
     * The field is required.
     *
     * @param type
     * @return This {@link WhatsAppOtpRequest instance}.
     */
    public WhatsAppOtpRequest type(WhatsAppNumberType type) {
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
    public WhatsAppNumberType getType() {
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
    public void setType(WhatsAppNumberType type) {
        this.type = type;
    }

    /**
     * Sets locale.
     * <p>
     * Field description:
     * Locale which will be used to submit for verification.
     * <p>
     * The field is required.
     *
     * @param locale
     * @return This {@link WhatsAppOtpRequest instance}.
     */
    public WhatsAppOtpRequest locale(String locale) {
        this.locale = locale;
        return this;
    }

    /**
     * Returns locale.
     * <p>
     * Field description:
     * Locale which will be used to submit for verification.
     * <p>
     * The field is required.
     *
     * @return locale
     */
    @JsonProperty("locale")
    public String getLocale() {
        return locale;
    }

    /**
     * Sets locale.
     * <p>
     * Field description:
     * Locale which will be used to submit for verification.
     * <p>
     * The field is required.
     *
     * @param locale
     */
    @JsonProperty("locale")
    public void setLocale(String locale) {
        this.locale = locale;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WhatsAppOtpRequest whatsAppOtpRequest = (WhatsAppOtpRequest) o;
        return Objects.equals(this.type, whatsAppOtpRequest.type)
                && Objects.equals(this.locale, whatsAppOtpRequest.locale);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, locale);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class WhatsAppOtpRequest {")
                .append(newLine)
                .append("    type: ")
                .append(toIndentedString(type))
                .append(newLine)
                .append("    locale: ")
                .append(toIndentedString(locale))
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
