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
 * Represents CallsSipTrunkAuthenticatedResetPasswordResponse model.
 */
public class CallsSipTrunkAuthenticatedResetPasswordResponse extends CallsSipTrunkResetPasswordResponse {

    private CallsSipTrunkAuthenticationWithCredentials authentication;

    /**
     * Constructs a new {@link CallsSipTrunkAuthenticatedResetPasswordResponse} instance.
     */
    public CallsSipTrunkAuthenticatedResetPasswordResponse() {
        super("AUTHENTICATED");
    }

    /**
     * Sets authentication.
     *
     * @param authentication
     * @return This {@link CallsSipTrunkAuthenticatedResetPasswordResponse instance}.
     */
    public CallsSipTrunkAuthenticatedResetPasswordResponse authentication(
            CallsSipTrunkAuthenticationWithCredentials authentication) {
        this.authentication = authentication;
        return this;
    }

    /**
     * Returns authentication.
     *
     * @return authentication
     */
    @JsonProperty("authentication")
    public CallsSipTrunkAuthenticationWithCredentials getAuthentication() {
        return authentication;
    }

    /**
     * Sets authentication.
     *
     * @param authentication
     */
    @JsonProperty("authentication")
    public void setAuthentication(CallsSipTrunkAuthenticationWithCredentials authentication) {
        this.authentication = authentication;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CallsSipTrunkAuthenticatedResetPasswordResponse callsSipTrunkAuthenticatedResetPasswordResponse =
                (CallsSipTrunkAuthenticatedResetPasswordResponse) o;
        return Objects.equals(this.authentication, callsSipTrunkAuthenticatedResetPasswordResponse.authentication)
                && super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(authentication, super.hashCode());
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class CallsSipTrunkAuthenticatedResetPasswordResponse {")
                .append(newLine)
                .append("    ")
                .append(toIndentedString(super.toString()))
                .append(newLine)
                .append("    authentication: ")
                .append(toIndentedString(authentication))
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
