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
 * Authentication configuration for inbound and outbound calls.
 */
public class CallsSipTrunkAuthentication {

    private CallsSipTrunkInboundAuthentication inbound;

    private CallsSipTrunkOutboundAuthentication outbound;

    /**
     * Sets inbound.
     *
     * @param inbound
     * @return This {@link CallsSipTrunkAuthentication instance}.
     */
    public CallsSipTrunkAuthentication inbound(CallsSipTrunkInboundAuthentication inbound) {
        this.inbound = inbound;
        return this;
    }

    /**
     * Returns inbound.
     *
     * @return inbound
     */
    @JsonProperty("inbound")
    public CallsSipTrunkInboundAuthentication getInbound() {
        return inbound;
    }

    /**
     * Sets inbound.
     *
     * @param inbound
     */
    @JsonProperty("inbound")
    public void setInbound(CallsSipTrunkInboundAuthentication inbound) {
        this.inbound = inbound;
    }

    /**
     * Sets outbound.
     *
     * @param outbound
     * @return This {@link CallsSipTrunkAuthentication instance}.
     */
    public CallsSipTrunkAuthentication outbound(CallsSipTrunkOutboundAuthentication outbound) {
        this.outbound = outbound;
        return this;
    }

    /**
     * Returns outbound.
     *
     * @return outbound
     */
    @JsonProperty("outbound")
    public CallsSipTrunkOutboundAuthentication getOutbound() {
        return outbound;
    }

    /**
     * Sets outbound.
     *
     * @param outbound
     */
    @JsonProperty("outbound")
    public void setOutbound(CallsSipTrunkOutboundAuthentication outbound) {
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
        CallsSipTrunkAuthentication callsSipTrunkAuthentication = (CallsSipTrunkAuthentication) o;
        return Objects.equals(this.inbound, callsSipTrunkAuthentication.inbound)
                && Objects.equals(this.outbound, callsSipTrunkAuthentication.outbound);
    }

    @Override
    public int hashCode() {
        return Objects.hash(inbound, outbound);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class CallsSipTrunkAuthentication {")
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
