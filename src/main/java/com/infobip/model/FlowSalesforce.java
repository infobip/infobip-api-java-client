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
 * Salesforce integration.
 */
public class FlowSalesforce {

    private String leadId;

    private String contactId;

    /**
     * Sets leadId.
     * <p>
     * Field description:
     * Salesforce lead id.
     *
     * @param leadId
     * @return This {@link FlowSalesforce instance}.
     */
    public FlowSalesforce leadId(String leadId) {
        this.leadId = leadId;
        return this;
    }

    /**
     * Returns leadId.
     * <p>
     * Field description:
     * Salesforce lead id.
     *
     * @return leadId
     */
    @JsonProperty("leadId")
    public String getLeadId() {
        return leadId;
    }

    /**
     * Sets leadId.
     * <p>
     * Field description:
     * Salesforce lead id.
     *
     * @param leadId
     */
    @JsonProperty("leadId")
    public void setLeadId(String leadId) {
        this.leadId = leadId;
    }

    /**
     * Sets contactId.
     * <p>
     * Field description:
     * Salesforce contact id.
     *
     * @param contactId
     * @return This {@link FlowSalesforce instance}.
     */
    public FlowSalesforce contactId(String contactId) {
        this.contactId = contactId;
        return this;
    }

    /**
     * Returns contactId.
     * <p>
     * Field description:
     * Salesforce contact id.
     *
     * @return contactId
     */
    @JsonProperty("contactId")
    public String getContactId() {
        return contactId;
    }

    /**
     * Sets contactId.
     * <p>
     * Field description:
     * Salesforce contact id.
     *
     * @param contactId
     */
    @JsonProperty("contactId")
    public void setContactId(String contactId) {
        this.contactId = contactId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        FlowSalesforce flowSalesforce = (FlowSalesforce) o;
        return Objects.equals(this.leadId, flowSalesforce.leadId)
                && Objects.equals(this.contactId, flowSalesforce.contactId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(leadId, contactId);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class FlowSalesforce {")
                .append(newLine)
                .append("    leadId: ")
                .append(toIndentedString(leadId))
                .append(newLine)
                .append("    contactId: ")
                .append(toIndentedString(contactId))
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
