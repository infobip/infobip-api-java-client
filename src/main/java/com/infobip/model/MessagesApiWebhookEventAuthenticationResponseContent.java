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
 * Represents MessagesApiWebhookEventAuthenticationResponseContent model.
 */
public class MessagesApiWebhookEventAuthenticationResponseContent extends MessagesApiWebhookEventContent {

    private String authCode;

    private String error;

    /**
     * Constructs a new {@link MessagesApiWebhookEventAuthenticationResponseContent} instance.
     */
    public MessagesApiWebhookEventAuthenticationResponseContent() {
        super("AUTHENTICATION_RESPONSE");
    }

    /**
     * Sets authCode.
     * <p>
     * Field description:
     * Authentication code.
     *
     * @param authCode
     * @return This {@link MessagesApiWebhookEventAuthenticationResponseContent instance}.
     */
    public MessagesApiWebhookEventAuthenticationResponseContent authCode(String authCode) {
        this.authCode = authCode;
        return this;
    }

    /**
     * Returns authCode.
     * <p>
     * Field description:
     * Authentication code.
     *
     * @return authCode
     */
    @JsonProperty("authCode")
    public String getAuthCode() {
        return authCode;
    }

    /**
     * Sets authCode.
     * <p>
     * Field description:
     * Authentication code.
     *
     * @param authCode
     */
    @JsonProperty("authCode")
    public void setAuthCode(String authCode) {
        this.authCode = authCode;
    }

    /**
     * Sets error.
     * <p>
     * Field description:
     * Error in case of unsuccessful authentication.
     *
     * @param error
     * @return This {@link MessagesApiWebhookEventAuthenticationResponseContent instance}.
     */
    public MessagesApiWebhookEventAuthenticationResponseContent error(String error) {
        this.error = error;
        return this;
    }

    /**
     * Returns error.
     * <p>
     * Field description:
     * Error in case of unsuccessful authentication.
     *
     * @return error
     */
    @JsonProperty("error")
    public String getError() {
        return error;
    }

    /**
     * Sets error.
     * <p>
     * Field description:
     * Error in case of unsuccessful authentication.
     *
     * @param error
     */
    @JsonProperty("error")
    public void setError(String error) {
        this.error = error;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MessagesApiWebhookEventAuthenticationResponseContent messagesApiWebhookEventAuthenticationResponseContent =
                (MessagesApiWebhookEventAuthenticationResponseContent) o;
        return Objects.equals(this.authCode, messagesApiWebhookEventAuthenticationResponseContent.authCode)
                && Objects.equals(this.error, messagesApiWebhookEventAuthenticationResponseContent.error)
                && super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(authCode, error, super.hashCode());
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class MessagesApiWebhookEventAuthenticationResponseContent {")
                .append(newLine)
                .append("    ")
                .append(toIndentedString(super.toString()))
                .append(newLine)
                .append("    authCode: ")
                .append(toIndentedString(authCode))
                .append(newLine)
                .append("    error: ")
                .append(toIndentedString(error))
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
