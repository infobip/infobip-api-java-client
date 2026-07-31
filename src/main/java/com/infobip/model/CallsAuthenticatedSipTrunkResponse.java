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
 * Represents CallsAuthenticatedSipTrunkResponse model.
 */
public class CallsAuthenticatedSipTrunkResponse extends CallsSipTrunkResponse {

    private CallsSipTrunkAuthentication authentication;

    /**
     * Constructs a new {@link CallsAuthenticatedSipTrunkResponse} instance.
     */
    public CallsAuthenticatedSipTrunkResponse() {
        super("AUTHENTICATED");
    }

    /**
     * Sets authentication.
     *
     * @param authentication
     * @return This {@link CallsAuthenticatedSipTrunkResponse instance}.
     */
    public CallsAuthenticatedSipTrunkResponse authentication(CallsSipTrunkAuthentication authentication) {
        this.authentication = authentication;
        return this;
    }

    /**
     * Returns authentication.
     *
     * @return authentication
     */
    @JsonProperty("authentication")
    public CallsSipTrunkAuthentication getAuthentication() {
        return authentication;
    }

    /**
     * Sets authentication.
     *
     * @param authentication
     */
    @JsonProperty("authentication")
    public void setAuthentication(CallsSipTrunkAuthentication authentication) {
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
        CallsAuthenticatedSipTrunkResponse callsAuthenticatedSipTrunkResponse = (CallsAuthenticatedSipTrunkResponse) o;
        return Objects.equals(this.authentication, callsAuthenticatedSipTrunkResponse.authentication)
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
                .append("class CallsAuthenticatedSipTrunkResponse {")
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
