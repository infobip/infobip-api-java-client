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
 * Represents EmailDomainIpRequest model.
 */
public class EmailDomainIpRequest {

    private String domainName;

    private String ipAddress;

    /**
     * Sets domainName.
     * <p>
     * Field description:
     * Name of the domain.
     * <p>
     * The field is required.
     *
     * @param domainName
     * @return This {@link EmailDomainIpRequest instance}.
     */
    public EmailDomainIpRequest domainName(String domainName) {
        this.domainName = domainName;
        return this;
    }

    /**
     * Returns domainName.
     * <p>
     * Field description:
     * Name of the domain.
     * <p>
     * The field is required.
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
     * <p>
     * The field is required.
     *
     * @param domainName
     */
    @JsonProperty("domainName")
    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    /**
     * Sets ipAddress.
     * <p>
     * Field description:
     * Dedicated ip address.
     * <p>
     * The field is required.
     *
     * @param ipAddress
     * @return This {@link EmailDomainIpRequest instance}.
     */
    public EmailDomainIpRequest ipAddress(String ipAddress) {
        this.ipAddress = ipAddress;
        return this;
    }

    /**
     * Returns ipAddress.
     * <p>
     * Field description:
     * Dedicated ip address.
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
     * Dedicated ip address.
     * <p>
     * The field is required.
     *
     * @param ipAddress
     */
    @JsonProperty("ipAddress")
    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        EmailDomainIpRequest emailDomainIpRequest = (EmailDomainIpRequest) o;
        return Objects.equals(this.domainName, emailDomainIpRequest.domainName)
                && Objects.equals(this.ipAddress, emailDomainIpRequest.ipAddress);
    }

    @Override
    public int hashCode() {
        return Objects.hash(domainName, ipAddress);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class EmailDomainIpRequest {")
                .append(newLine)
                .append("    domainName: ")
                .append(toIndentedString(domainName))
                .append(newLine)
                .append("    ipAddress: ")
                .append(toIndentedString(ipAddress))
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
