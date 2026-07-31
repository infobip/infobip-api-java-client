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
 * Inbound authentication configuration for create requests.
 */
public class CallsSipTrunkInboundAuthenticationRequest {

    private String headerValue;

    private Boolean digestAuthenticationEnabled;

    /**
     * Sets headerValue.
     * <p>
     * Field description:
     * Value of the Authorization header for inbound SIP calls. If not provided, it will be auto-generated.
     *
     * @param headerValue
     * @return This {@link CallsSipTrunkInboundAuthenticationRequest instance}.
     */
    public CallsSipTrunkInboundAuthenticationRequest headerValue(String headerValue) {
        this.headerValue = headerValue;
        return this;
    }

    /**
     * Returns headerValue.
     * <p>
     * Field description:
     * Value of the Authorization header for inbound SIP calls. If not provided, it will be auto-generated.
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
     * Value of the Authorization header for inbound SIP calls. If not provided, it will be auto-generated.
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
     * Enables digest authentication for inbound SIP calls.
     *
     * @param digestAuthenticationEnabled
     * @return This {@link CallsSipTrunkInboundAuthenticationRequest instance}.
     */
    public CallsSipTrunkInboundAuthenticationRequest digestAuthenticationEnabled(Boolean digestAuthenticationEnabled) {
        this.digestAuthenticationEnabled = digestAuthenticationEnabled;
        return this;
    }

    /**
     * Returns digestAuthenticationEnabled.
     * <p>
     * Field description:
     * Enables digest authentication for inbound SIP calls.
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
     * Enables digest authentication for inbound SIP calls.
     *
     * @param digestAuthenticationEnabled
     */
    @JsonProperty("digestAuthenticationEnabled")
    public void setDigestAuthenticationEnabled(Boolean digestAuthenticationEnabled) {
        this.digestAuthenticationEnabled = digestAuthenticationEnabled;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CallsSipTrunkInboundAuthenticationRequest callsSipTrunkInboundAuthenticationRequest =
                (CallsSipTrunkInboundAuthenticationRequest) o;
        return Objects.equals(this.headerValue, callsSipTrunkInboundAuthenticationRequest.headerValue)
                && Objects.equals(
                        this.digestAuthenticationEnabled,
                        callsSipTrunkInboundAuthenticationRequest.digestAuthenticationEnabled);
    }

    @Override
    public int hashCode() {
        return Objects.hash(headerValue, digestAuthenticationEnabled);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class CallsSipTrunkInboundAuthenticationRequest {")
                .append(newLine)
                .append("    headerValue: ")
                .append(toIndentedString(headerValue))
                .append(newLine)
                .append("    digestAuthenticationEnabled: ")
                .append(toIndentedString(digestAuthenticationEnabled))
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
