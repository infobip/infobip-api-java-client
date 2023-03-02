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
 * Array of emails information.
 */
public class WhatsAppEmailContent {

    private String email;

    private WhatsAppEmailType type;

    /**
     * Sets email.
     * <p>
     * Field description:
     * Contact&#39;s email.
     *
     * @param email
     * @return This {@link WhatsAppEmailContent instance}.
     */
    public WhatsAppEmailContent email(String email) {
        this.email = email;
        return this;
    }

    /**
     * Returns email.
     * <p>
     * Field description:
     * Contact&#39;s email.
     *
     * @return email
     */
    @JsonProperty("email")
    public String getEmail() {
        return email;
    }

    /**
     * Sets email.
     * <p>
     * Field description:
     * Contact&#39;s email.
     *
     * @param email
     */
    @JsonProperty("email")
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Sets type.
     *
     * @param type
     * @return This {@link WhatsAppEmailContent instance}.
     */
    public WhatsAppEmailContent type(WhatsAppEmailType type) {
        this.type = type;
        return this;
    }

    /**
     * Returns type.
     *
     * @return type
     */
    @JsonProperty("type")
    public WhatsAppEmailType getType() {
        return type;
    }

    /**
     * Sets type.
     *
     * @param type
     */
    @JsonProperty("type")
    public void setType(WhatsAppEmailType type) {
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WhatsAppEmailContent whatsAppEmailContent = (WhatsAppEmailContent) o;
        return Objects.equals(this.email, whatsAppEmailContent.email)
                && Objects.equals(this.type, whatsAppEmailContent.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(email, type);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class WhatsAppEmailContent {")
                .append(newLine)
                .append("    email: ")
                .append(toIndentedString(email))
                .append(newLine)
                .append("    type: ")
                .append(toIndentedString(type))
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
