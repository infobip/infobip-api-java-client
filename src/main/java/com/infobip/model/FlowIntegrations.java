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
 * Integrations.
 */
public class FlowIntegrations {

    private FlowSalesforce salesforce;

    /**
     * Sets salesforce.
     *
     * @param salesforce
     * @return This {@link FlowIntegrations instance}.
     */
    public FlowIntegrations salesforce(FlowSalesforce salesforce) {
        this.salesforce = salesforce;
        return this;
    }

    /**
     * Returns salesforce.
     *
     * @return salesforce
     */
    @JsonProperty("salesforce")
    public FlowSalesforce getSalesforce() {
        return salesforce;
    }

    /**
     * Sets salesforce.
     *
     * @param salesforce
     */
    @JsonProperty("salesforce")
    public void setSalesforce(FlowSalesforce salesforce) {
        this.salesforce = salesforce;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        FlowIntegrations flowIntegrations = (FlowIntegrations) o;
        return Objects.equals(this.salesforce, flowIntegrations.salesforce);
    }

    @Override
    public int hashCode() {
        return Objects.hash(salesforce);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class FlowIntegrations {")
                .append(newLine)
                .append("    salesforce: ")
                .append(toIndentedString(salesforce))
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
