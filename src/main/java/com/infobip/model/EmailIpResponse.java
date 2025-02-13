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
 * Dedicated IPs assigned to the IP pool.
 */
public class EmailIpResponse {

    private String id;

    private String ip;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        EmailIpResponse emailIpResponse = (EmailIpResponse) o;
        return Objects.equals(this.id, emailIpResponse.id) && Objects.equals(this.ip, emailIpResponse.ip);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, ip);
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
