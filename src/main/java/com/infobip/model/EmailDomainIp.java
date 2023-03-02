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
 * List of ip details.
 */
public class EmailDomainIp {

    private String ipAddress;

    private Boolean dedicated;

    private Integer assignedDomainCount;

    private String status;

    /**
     * Sets ipAddress.
     * <p>
     * Field description:
     * Ip Address.
     * <p>
     * The field is required.
     *
     * @param ipAddress
     * @return This {@link EmailDomainIp instance}.
     */
    public EmailDomainIp ipAddress(String ipAddress) {
        this.ipAddress = ipAddress;
        return this;
    }

    /**
     * Returns ipAddress.
     * <p>
     * Field description:
     * Ip Address.
     * <p>
     * The field is required.
     *
     * @return ipAddress
     */
    @JsonProperty("ipAddress")
    public String getIpAddress() {
        return ipAddress;
    }

    /**
     * Sets ipAddress.
     * <p>
     * Field description:
     * Ip Address.
     * <p>
     * The field is required.
     *
     * @param ipAddress
     */
    @JsonProperty("ipAddress")
    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    /**
     * Sets dedicated.
     * <p>
     * Field description:
     * Is Dedicated Ip Address.
     * <p>
     * The field is required.
     *
     * @param dedicated
     * @return This {@link EmailDomainIp instance}.
     */
    public EmailDomainIp dedicated(Boolean dedicated) {
        this.dedicated = dedicated;
        return this;
    }

    /**
     * Returns dedicated.
     * <p>
     * Field description:
     * Is Dedicated Ip Address.
     * <p>
     * The field is required.
     *
     * @return dedicated
     */
    @JsonProperty("dedicated")
    public Boolean getDedicated() {
        return dedicated;
    }

    /**
     * Sets dedicated.
     * <p>
     * Field description:
     * Is Dedicated Ip Address.
     * <p>
     * The field is required.
     *
     * @param dedicated
     */
    @JsonProperty("dedicated")
    public void setDedicated(Boolean dedicated) {
        this.dedicated = dedicated;
    }

    /**
     * Sets assignedDomainCount.
     * <p>
     * Field description:
     * Ip Class.
     * <p>
     * The field is required.
     *
     * @param assignedDomainCount
     * @return This {@link EmailDomainIp instance}.
     */
    public EmailDomainIp assignedDomainCount(Integer assignedDomainCount) {
        this.assignedDomainCount = assignedDomainCount;
        return this;
    }

    /**
     * Returns assignedDomainCount.
     * <p>
     * Field description:
     * Ip Class.
     * <p>
     * The field is required.
     *
     * @return assignedDomainCount
     */
    @JsonProperty("assignedDomainCount")
    public Integer getAssignedDomainCount() {
        return assignedDomainCount;
    }

    /**
     * Sets assignedDomainCount.
     * <p>
     * Field description:
     * Ip Class.
     * <p>
     * The field is required.
     *
     * @param assignedDomainCount
     */
    @JsonProperty("assignedDomainCount")
    public void setAssignedDomainCount(Integer assignedDomainCount) {
        this.assignedDomainCount = assignedDomainCount;
    }

    /**
     * Sets status.
     * <p>
     * Field description:
     * Status of the IP Address.
     * <p>
     * The field is required.
     *
     * @param status
     * @return This {@link EmailDomainIp instance}.
     */
    public EmailDomainIp status(String status) {
        this.status = status;
        return this;
    }

    /**
     * Returns status.
     * <p>
     * Field description:
     * Status of the IP Address.
     * <p>
     * The field is required.
     *
     * @return status
     */
    @JsonProperty("status")
    public String getStatus() {
        return status;
    }

    /**
     * Sets status.
     * <p>
     * Field description:
     * Status of the IP Address.
     * <p>
     * The field is required.
     *
     * @param status
     */
    @JsonProperty("status")
    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        EmailDomainIp emailDomainIp = (EmailDomainIp) o;
        return Objects.equals(this.ipAddress, emailDomainIp.ipAddress)
                && Objects.equals(this.dedicated, emailDomainIp.dedicated)
                && Objects.equals(this.assignedDomainCount, emailDomainIp.assignedDomainCount)
                && Objects.equals(this.status, emailDomainIp.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ipAddress, dedicated, assignedDomainCount, status);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class EmailDomainIp {")
                .append(newLine)
                .append("    ipAddress: ")
                .append(toIndentedString(ipAddress))
                .append(newLine)
                .append("    dedicated: ")
                .append(toIndentedString(dedicated))
                .append(newLine)
                .append("    assignedDomainCount: ")
                .append(toIndentedString(assignedDomainCount))
                .append(newLine)
                .append("    status: ")
                .append(toIndentedString(status))
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
