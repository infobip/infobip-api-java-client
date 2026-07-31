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
 * Generated authentication credentials for inbound and outbound calls.
 */
public class CallsSipTrunkAuthenticationWithCredentials {

    private CallsSipTrunkInboundAuthenticationWithCredentials inbound;

    private CallsSipTrunkOutboundAuthenticationWithCredentials outbound;

    /**
     * Sets inbound.
     *
     * @param inbound
     * @return This {@link CallsSipTrunkAuthenticationWithCredentials instance}.
     */
    public CallsSipTrunkAuthenticationWithCredentials inbound(
            CallsSipTrunkInboundAuthenticationWithCredentials inbound) {
        this.inbound = inbound;
        return this;
    }

    /**
     * Returns inbound.
     *
     * @return inbound
     */
    @JsonProperty("inbound")
    public CallsSipTrunkInboundAuthenticationWithCredentials getInbound() {
        return inbound;
    }

    /**
     * Sets inbound.
     *
     * @param inbound
     */
    @JsonProperty("inbound")
    public void setInbound(CallsSipTrunkInboundAuthenticationWithCredentials inbound) {
        this.inbound = inbound;
    }

    /**
     * Sets outbound.
     *
     * @param outbound
     * @return This {@link CallsSipTrunkAuthenticationWithCredentials instance}.
     */
    public CallsSipTrunkAuthenticationWithCredentials outbound(
            CallsSipTrunkOutboundAuthenticationWithCredentials outbound) {
        this.outbound = outbound;
        return this;
    }

    /**
     * Returns outbound.
     *
     * @return outbound
     */
    @JsonProperty("outbound")
    public CallsSipTrunkOutboundAuthenticationWithCredentials getOutbound() {
        return outbound;
    }

    /**
     * Sets outbound.
     *
     * @param outbound
     */
    @JsonProperty("outbound")
    public void setOutbound(CallsSipTrunkOutboundAuthenticationWithCredentials outbound) {
        this.outbound = outbound;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CallsSipTrunkAuthenticationWithCredentials callsSipTrunkAuthenticationWithCredentials =
                (CallsSipTrunkAuthenticationWithCredentials) o;
        return Objects.equals(this.inbound, callsSipTrunkAuthenticationWithCredentials.inbound)
                && Objects.equals(this.outbound, callsSipTrunkAuthenticationWithCredentials.outbound);
    }

    @Override
    public int hashCode() {
        return Objects.hash(inbound, outbound);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class CallsSipTrunkAuthenticationWithCredentials {")
                .append(newLine)
                .append("    inbound: ")
                .append(toIndentedString(inbound))
                .append(newLine)
                .append("    outbound: ")
                .append(toIndentedString(outbound))
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
