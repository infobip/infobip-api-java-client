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
 * Outbound authentication configuration.
 */
public class CallsSipTrunkOutboundAuthentication {

    private String fqdn;

    /**
     * Sets fqdn.
     * <p>
     * Field description:
     * Fully qualified domain name of the remote SIP endpoint for outbound calls.
     *
     * @param fqdn
     * @return This {@link CallsSipTrunkOutboundAuthentication instance}.
     */
    public CallsSipTrunkOutboundAuthentication fqdn(String fqdn) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CallsSipTrunkOutboundAuthentication callsSipTrunkOutboundAuthentication =
                (CallsSipTrunkOutboundAuthentication) o;
        return Objects.equals(this.fqdn, callsSipTrunkOutboundAuthentication.fqdn);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fqdn);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class CallsSipTrunkOutboundAuthentication {")
                .append(newLine)
                .append("    fqdn: ")
                .append(toIndentedString(fqdn))
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
