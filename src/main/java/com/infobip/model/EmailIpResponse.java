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
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

/**
 * Dedicated IPs assigned to the IP pool.
 */
public class EmailIpResponse {

    private String id;

    private String ip;

    private Set<String> ipAddresses = new LinkedHashSet<>();

    /**
     * Sets id.
     * <p>
     * Field description:
     * Dedicated IP identifier.
     * <p>
     * The field is required.
     *
     * @param id
     * @return This {@link EmailIpResponse instance}.
     */
    public EmailIpResponse id(String id) {
        this.id = id;
        return this;
    }

    /**
     * Returns id.
     * <p>
     * Field description:
     * Dedicated IP identifier.
     * <p>
     * The field is required.
     *
     * @return id
     */
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    /**
     * Sets id.
     * <p>
     * Field description:
     * Dedicated IP identifier.
     * <p>
     * The field is required.
     *
     * @param id
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Sets ip.
     * <p>
     * Field description:
     * Dedicated IP address.
     * <p>
     * The field is required.
     *
     * @param ip
     * @return This {@link EmailIpResponse instance}.
     */
    public EmailIpResponse ip(String ip) {
        this.ip = ip;
        return this;
    }

    /**
     * Returns ip.
     * <p>
     * Field description:
     * Dedicated IP address.
     * <p>
     * The field is required.
     *
     * @return ip
     */
    @JsonProperty("ip")
    public String getIp() {
        return ip;
    }

    /**
     * Sets ip.
     * <p>
     * Field description:
     * Dedicated IP address.
     * <p>
     * The field is required.
     *
     * @param ip
     */
    @JsonProperty("ip")
    public void setIp(String ip) {
        this.ip = ip;
    }

    /**
     * Sets ipAddresses.
     * <p>
     * The field is required.
     *
     * @param ipAddresses
     * @return This {@link EmailIpResponse instance}.
     */
    public EmailIpResponse ipAddresses(Set<String> ipAddresses) {
        this.ipAddresses = ipAddresses;
        return this;
    }

    /**
     * Adds and item into ipAddresses.
     * <p>
     * The field is required.
     *
     * @param ipAddressesItem The item to be added to the list.
     * @return This {@link EmailIpResponse instance}.
     */
    public EmailIpResponse addIpAddressesItem(String ipAddressesItem) {
        if (this.ipAddresses == null) {
            this.ipAddresses = new LinkedHashSet<>();
        }
        this.ipAddresses.add(ipAddressesItem);
        return this;
    }

    /**
     * Returns ipAddresses.
     * <p>
     * The field is required.
     *
     * @return ipAddresses
     */
    @JsonProperty("ipAddresses")
    public Set<String> getIpAddresses() {
        return ipAddresses;
    }

    /**
     * Sets ipAddresses.
     * <p>
     * The field is required.
     *
     * @param ipAddresses
     */
    @JsonProperty("ipAddresses")
    public void setIpAddresses(Set<String> ipAddresses) {
        this.ipAddresses = ipAddresses;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        EmailIpResponse emailIpResponse = (EmailIpResponse) o;
        return Objects.equals(this.id, emailIpResponse.id)
                && Objects.equals(this.ip, emailIpResponse.ip)
                && Objects.equals(this.ipAddresses, emailIpResponse.ipAddresses);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, ip, ipAddresses);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class EmailIpResponse {")
                .append(newLine)
                .append("    id: ")
                .append(toIndentedString(id))
                .append(newLine)
                .append("    ip: ")
                .append(toIndentedString(ip))
                .append(newLine)
                .append("    ipAddresses: ")
                .append(toIndentedString(ipAddresses))
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
