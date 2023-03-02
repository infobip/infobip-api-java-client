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
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Detailed domain information.
 */
public class EmailDomainResponse {

    private Long domainId;

    private String domainName;

    private Boolean active;

    private EmailTrackingResponse tracking;

    private List<EmailDnsRecordResponse> dnsRecords = null;

    private Boolean blocked;

    private OffsetDateTime createdAt;

    /**
     * Sets domainId.
     * <p>
     * Field description:
     * Id of the domain.
     *
     * @param domainId
     * @return This {@link EmailDomainResponse instance}.
     */
    public EmailDomainResponse domainId(Long domainId) {
        this.domainId = domainId;
        return this;
    }

    /**
     * Returns domainId.
     * <p>
     * Field description:
     * Id of the domain.
     *
     * @return domainId
     */
    @JsonProperty("domainId")
    public Long getDomainId() {
        return domainId;
    }

    /**
     * Sets domainId.
     * <p>
     * Field description:
     * Id of the domain.
     *
     * @param domainId
     */
    @JsonProperty("domainId")
    public void setDomainId(Long domainId) {
        this.domainId = domainId;
    }

    /**
     * Sets domainName.
     * <p>
     * Field description:
     * Name of the domain.
     *
     * @param domainName
     * @return This {@link EmailDomainResponse instance}.
     */
    public EmailDomainResponse domainName(String domainName) {
        this.domainName = domainName;
        return this;
    }

    /**
     * Returns domainName.
     * <p>
     * Field description:
     * Name of the domain.
     *
     * @return domainName
     */
    @JsonProperty("domainName")
    public String getDomainName() {
        return domainName;
    }

    /**
     * Sets domainName.
     * <p>
     * Field description:
     * Name of the domain.
     *
     * @param domainName
     */
    @JsonProperty("domainName")
    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    /**
     * Sets active.
     * <p>
     * Field description:
     * Activation status of the domain.
     *
     * @param active
     * @return This {@link EmailDomainResponse instance}.
     */
    public EmailDomainResponse active(Boolean active) {
        this.active = active;
        return this;
    }

    /**
     * Returns active.
     * <p>
     * Field description:
     * Activation status of the domain.
     *
     * @return active
     */
    @JsonProperty("active")
    public Boolean getActive() {
        return active;
    }

    /**
     * Sets active.
     * <p>
     * Field description:
     * Activation status of the domain.
     *
     * @param active
     */
    @JsonProperty("active")
    public void setActive(Boolean active) {
        this.active = active;
    }

    /**
     * Sets tracking.
     *
     * @param tracking
     * @return This {@link EmailDomainResponse instance}.
     */
    public EmailDomainResponse tracking(EmailTrackingResponse tracking) {
        this.tracking = tracking;
        return this;
    }

    /**
     * Returns tracking.
     *
     * @return tracking
     */
    @JsonProperty("tracking")
    public EmailTrackingResponse getTracking() {
        return tracking;
    }

    /**
     * Sets tracking.
     *
     * @param tracking
     */
    @JsonProperty("tracking")
    public void setTracking(EmailTrackingResponse tracking) {
        this.tracking = tracking;
    }

    /**
     * Sets dnsRecords.
     * <p>
     * Field description:
     * DNS records for the domain.
     *
     * @param dnsRecords
     * @return This {@link EmailDomainResponse instance}.
     */
    public EmailDomainResponse dnsRecords(List<EmailDnsRecordResponse> dnsRecords) {
        this.dnsRecords = dnsRecords;
        return this;
    }

    /**
     * Adds and item into dnsRecords.
     * <p>
     * Field description:
     * DNS records for the domain.
     *
     * @param dnsRecordsItem The item to be added to the list.
     * @return This {@link EmailDomainResponse instance}.
     */
    public EmailDomainResponse addDnsRecordsItem(EmailDnsRecordResponse dnsRecordsItem) {
        if (this.dnsRecords == null) {
            this.dnsRecords = new ArrayList<>();
        }
        this.dnsRecords.add(dnsRecordsItem);
        return this;
    }

    /**
     * Returns dnsRecords.
     * <p>
     * Field description:
     * DNS records for the domain.
     *
     * @return dnsRecords
     */
    @JsonProperty("dnsRecords")
    public List<EmailDnsRecordResponse> getDnsRecords() {
        return dnsRecords;
    }

    /**
     * Sets dnsRecords.
     * <p>
     * Field description:
     * DNS records for the domain.
     *
     * @param dnsRecords
     */
    @JsonProperty("dnsRecords")
    public void setDnsRecords(List<EmailDnsRecordResponse> dnsRecords) {
        this.dnsRecords = dnsRecords;
    }

    /**
     * Sets blocked.
     * <p>
     * Field description:
     * Status if the domain is blocked.
     *
     * @param blocked
     * @return This {@link EmailDomainResponse instance}.
     */
    public EmailDomainResponse blocked(Boolean blocked) {
        this.blocked = blocked;
        return this;
    }

    /**
     * Returns blocked.
     * <p>
     * Field description:
     * Status if the domain is blocked.
     *
     * @return blocked
     */
    @JsonProperty("blocked")
    public Boolean getBlocked() {
        return blocked;
    }

    /**
     * Sets blocked.
     * <p>
     * Field description:
     * Status if the domain is blocked.
     *
     * @param blocked
     */
    @JsonProperty("blocked")
    public void setBlocked(Boolean blocked) {
        this.blocked = blocked;
    }

    /**
     * Sets createdAt.
     * <p>
     * Field description:
     * Date the domain was created. Has the following format: &#x60;yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZ&#x60;
     *
     * @param createdAt
     * @return This {@link EmailDomainResponse instance}.
     */
    public EmailDomainResponse createdAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * Returns createdAt.
     * <p>
     * Field description:
     * Date the domain was created. Has the following format: &#x60;yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZ&#x60;
     *
     * @return createdAt
     */
    @JsonProperty("createdAt")
    public OffsetDateTime getCreatedAt() {
        return createdAt;
    }

    /**
     * Sets createdAt.
     * <p>
     * Field description:
     * Date the domain was created. Has the following format: &#x60;yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZ&#x60;
     *
     * @param createdAt
     */
    @JsonProperty("createdAt")
    public void setCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        EmailDomainResponse emailDomainResponse = (EmailDomainResponse) o;
        return Objects.equals(this.domainId, emailDomainResponse.domainId)
                && Objects.equals(this.domainName, emailDomainResponse.domainName)
                && Objects.equals(this.active, emailDomainResponse.active)
                && Objects.equals(this.tracking, emailDomainResponse.tracking)
                && Objects.equals(this.dnsRecords, emailDomainResponse.dnsRecords)
                && Objects.equals(this.blocked, emailDomainResponse.blocked)
                && Objects.equals(this.createdAt, emailDomainResponse.createdAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(domainId, domainName, active, tracking, dnsRecords, blocked, createdAt);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class EmailDomainResponse {")
                .append(newLine)
                .append("    domainId: ")
                .append(toIndentedString(domainId))
                .append(newLine)
                .append("    domainName: ")
                .append(toIndentedString(domainName))
                .append(newLine)
                .append("    active: ")
                .append(toIndentedString(active))
                .append(newLine)
                .append("    tracking: ")
                .append(toIndentedString(tracking))
                .append(newLine)
                .append("    dnsRecords: ")
                .append(toIndentedString(dnsRecords))
                .append(newLine)
                .append("    blocked: ")
                .append(toIndentedString(blocked))
                .append(newLine)
                .append("    createdAt: ")
                .append(toIndentedString(createdAt))
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
