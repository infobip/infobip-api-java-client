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
public class WhatsAppWebhookEmail {

    private String email;

    private String type;

    /**
     * Sets email.
     * <p>
     * Field description:
     * Contact&#39;s email.
     *
     * @param email
     * @return This {@link WhatsAppWebhookEmail instance}.
     */
    public WhatsAppWebhookEmail email(String email) {
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
     * <p>
     * Field description:
     * Type of the email. Can be &#x60;HOME&#x60; or &#x60;WORK&#x60;.
     *
     * @param type
     * @return This {@link WhatsAppWebhookEmail instance}.
     */
    public WhatsAppWebhookEmail type(String type) {
        this.type = type;
        return this;
    }

    /**
     * Returns type.
     * <p>
     * Field description:
     * Type of the email. Can be &#x60;HOME&#x60; or &#x60;WORK&#x60;.
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
     * Field description:
     * Type of the email. Can be &#x60;HOME&#x60; or &#x60;WORK&#x60;.
     *
     * @param type
     */
    @JsonProperty("type")
    public void setType(String type) {
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
        WhatsAppWebhookEmail whatsAppWebhookEmail = (WhatsAppWebhookEmail) o;
        return Objects.equals(this.email, whatsAppWebhookEmail.email)
                && Objects.equals(this.type, whatsAppWebhookEmail.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(email, type);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class WhatsAppWebhookEmail {")
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
