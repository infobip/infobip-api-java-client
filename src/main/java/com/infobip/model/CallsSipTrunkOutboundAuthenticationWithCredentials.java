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
 * Generated outbound authentication credentials.
 */
public class CallsSipTrunkOutboundAuthenticationWithCredentials {

    private String fqdn;

    private String digestUsername;

    private String digestPassword;

    /**
     * Sets fqdn.
     * <p>
     * Field description:
     * Fully qualified domain name of the remote SIP endpoint for outbound calls.
     *
     * @param fqdn
     * @return This {@link CallsSipTrunkOutboundAuthenticationWithCredentials instance}.
     */
    public CallsSipTrunkOutboundAuthenticationWithCredentials fqdn(String fqdn) {
        this.fqdn = fqdn;
        return this;
    }

    /**
     * Returns fqdn.
     * <p>
     * Field description:
     * Fully qualified domain name of the remote SIP endpoint for outbound calls.
     *
     * @return fqdn
     */
    @JsonProperty("fqdn")
    public String getFqdn() {
        return fqdn;
    }

    /**
     * Sets fqdn.
     * <p>
     * Field description:
     * Fully qualified domain name of the remote SIP endpoint for outbound calls.
     *
     * @param fqdn
     */
    @JsonProperty("fqdn")
    public void setFqdn(String fqdn) {
        this.fqdn = fqdn;
    }

    /**
     * Sets digestUsername.
     * <p>
     * Field description:
     * Username used for outbound digest authentication.
     *
     * @param digestUsername
     * @return This {@link CallsSipTrunkOutboundAuthenticationWithCredentials instance}.
     */
    public CallsSipTrunkOutboundAuthenticationWithCredentials digestUsername(String digestUsername) {
        this.digestUsername = digestUsername;
        return this;
    }

    /**
     * Returns digestUsername.
     * <p>
     * Field description:
     * Username used for outbound digest authentication.
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
     * Username used for outbound digest authentication.
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
     * Password used for outbound digest authentication.
     *
     * @param digestPassword
     * @return This {@link CallsSipTrunkOutboundAuthenticationWithCredentials instance}.
     */
    public CallsSipTrunkOutboundAuthenticationWithCredentials digestPassword(String digestPassword) {
        this.digestPassword = digestPassword;
        return this;
    }

    /**
     * Returns digestPassword.
     * <p>
     * Field description:
     * Password used for outbound digest authentication.
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
     * Password used for outbound digest authentication.
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
        CallsSipTrunkOutboundAuthenticationWithCredentials callsSipTrunkOutboundAuthenticationWithCredentials =
                (CallsSipTrunkOutboundAuthenticationWithCredentials) o;
        return Objects.equals(this.fqdn, callsSipTrunkOutboundAuthenticationWithCredentials.fqdn)
                && Objects.equals(
                        this.digestUsername, callsSipTrunkOutboundAuthenticationWithCredentials.digestUsername)
                && Objects.equals(
                        this.digestPassword, callsSipTrunkOutboundAuthenticationWithCredentials.digestPassword);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fqdn, digestUsername, digestPassword);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class CallsSipTrunkOutboundAuthenticationWithCredentials {")
                .append(newLine)
                .append("    fqdn: ")
                .append(toIndentedString(fqdn))
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
