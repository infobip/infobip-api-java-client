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
 * Generated inbound authentication credentials.
 */
public class CallsSipTrunkInboundAuthenticationWithCredentials {

    private String headerValue;

    private Boolean digestAuthenticationEnabled;

    private String digestUsername;

    private String digestPassword;

    /**
     * Sets headerValue.
     * <p>
     * Field description:
     * Authorization header value used for authenticating inbound SIP requests.
     *
     * @param headerValue
     * @return This {@link CallsSipTrunkInboundAuthenticationWithCredentials instance}.
     */
    public CallsSipTrunkInboundAuthenticationWithCredentials headerValue(String headerValue) {
        this.headerValue = headerValue;
        return this;
    }

    /**
     * Returns headerValue.
     * <p>
     * Field description:
     * Authorization header value used for authenticating inbound SIP requests.
     *
     * @return headerValue
     */
    @JsonProperty("headerValue")
    public String getHeaderValue() {
        return headerValue;
    }

    /**
     * Sets headerValue.
     * <p>
     * Field description:
     * Authorization header value used for authenticating inbound SIP requests.
     *
     * @param headerValue
     */
    @JsonProperty("headerValue")
    public void setHeaderValue(String headerValue) {
        this.headerValue = headerValue;
    }

    /**
     * Sets digestAuthenticationEnabled.
     * <p>
     * Field description:
     * Indicates whether digest authentication is enabled for inbound SIP calls.
     *
     * @param digestAuthenticationEnabled
     * @return This {@link CallsSipTrunkInboundAuthenticationWithCredentials instance}.
     */
    public CallsSipTrunkInboundAuthenticationWithCredentials digestAuthenticationEnabled(
            Boolean digestAuthenticationEnabled) {
        this.digestAuthenticationEnabled = digestAuthenticationEnabled;
        return this;
    }

    /**
     * Returns digestAuthenticationEnabled.
     * <p>
     * Field description:
     * Indicates whether digest authentication is enabled for inbound SIP calls.
     *
     * @return digestAuthenticationEnabled
     */
    @JsonProperty("digestAuthenticationEnabled")
    public Boolean getDigestAuthenticationEnabled() {
        return digestAuthenticationEnabled;
    }

    /**
     * Sets digestAuthenticationEnabled.
     * <p>
     * Field description:
     * Indicates whether digest authentication is enabled for inbound SIP calls.
     *
     * @param digestAuthenticationEnabled
     */
    @JsonProperty("digestAuthenticationEnabled")
    public void setDigestAuthenticationEnabled(Boolean digestAuthenticationEnabled) {
        this.digestAuthenticationEnabled = digestAuthenticationEnabled;
    }

    /**
     * Sets digestUsername.
     * <p>
     * Field description:
     * Username used for digest authentication.
     *
     * @param digestUsername
     * @return This {@link CallsSipTrunkInboundAuthenticationWithCredentials instance}.
     */
    public CallsSipTrunkInboundAuthenticationWithCredentials digestUsername(String digestUsername) {
        this.digestUsername = digestUsername;
        return this;
    }

    /**
     * Returns digestUsername.
     * <p>
     * Field description:
     * Username used for digest authentication.
     *
     * @return digestUsername
     */
    @JsonProperty("digestUsername")
    public String getDigestUsername() {
        return digestUsername;
    }

    /**
     * Sets digestUsername.
     * <p>
     * Field description:
     * Username used for digest authentication.
     *
     * @param digestUsername
     */
    @JsonProperty("digestUsername")
    public void setDigestUsername(String digestUsername) {
        this.digestUsername = digestUsername;
    }

    /**
     * Sets digestPassword.
     * <p>
     * Field description:
     * Password used for digest authentication.
     *
     * @param digestPassword
     * @return This {@link CallsSipTrunkInboundAuthenticationWithCredentials instance}.
     */
    public CallsSipTrunkInboundAuthenticationWithCredentials digestPassword(String digestPassword) {
        this.digestPassword = digestPassword;
        return this;
    }

    /**
     * Returns digestPassword.
     * <p>
     * Field description:
     * Password used for digest authentication.
     *
     * @return digestPassword
     */
    @JsonProperty("digestPassword")
    public String getDigestPassword() {
        return digestPassword;
    }

    /**
     * Sets digestPassword.
     * <p>
     * Field description:
     * Password used for digest authentication.
     *
     * @param digestPassword
     */
    @JsonProperty("digestPassword")
    public void setDigestPassword(String digestPassword) {
        this.digestPassword = digestPassword;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CallsSipTrunkInboundAuthenticationWithCredentials callsSipTrunkInboundAuthenticationWithCredentials =
                (CallsSipTrunkInboundAuthenticationWithCredentials) o;
        return Objects.equals(this.headerValue, callsSipTrunkInboundAuthenticationWithCredentials.headerValue)
                && Objects.equals(
                        this.digestAuthenticationEnabled,
                        callsSipTrunkInboundAuthenticationWithCredentials.digestAuthenticationEnabled)
                && Objects.equals(this.digestUsername, callsSipTrunkInboundAuthenticationWithCredentials.digestUsername)
                && Objects.equals(
                        this.digestPassword, callsSipTrunkInboundAuthenticationWithCredentials.digestPassword);
    }

    @Override
    public int hashCode() {
        return Objects.hash(headerValue, digestAuthenticationEnabled, digestUsername, digestPassword);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class CallsSipTrunkInboundAuthenticationWithCredentials {")
                .append(newLine)
                .append("    headerValue: ")
                .append(toIndentedString(headerValue))
                .append(newLine)
                .append("    digestAuthenticationEnabled: ")
                .append(toIndentedString(digestAuthenticationEnabled))
                .append(newLine)
                .append("    digestUsername: ")
                .append(toIndentedString(digestUsername))
                .append(newLine)
                .append("    digestPassword: ")
                .append(toIndentedString(digestPassword))
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
