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
 * Represents EmailIpDetailResponse model.
 */
public class EmailIpDetailResponse {

    private String id;

    private String ip;

    private Set<EmailIpPoolResponse> pools = new LinkedHashSet<>();

    /**
     * Sets id.
     * <p>
     * Field description:
     * Dedicated IP identifier.
     * <p>
     * The field is required.
     *
     * @param id
     * @return This {@link EmailIpDetailResponse instance}.
     */
    public EmailIpDetailResponse id(String id) {
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
     * @return This {@link EmailIpDetailResponse instance}.
     */
    public EmailIpDetailResponse ip(String ip) {
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
     * Sets pools.
     * <p>
     * The field is required.
     *
     * @param pools
     * @return This {@link EmailIpDetailResponse instance}.
     */
    public EmailIpDetailResponse pools(Set<EmailIpPoolResponse> pools) {
        this.pools = pools;
        return this;
    }

    /**
     * Adds and item into pools.
     * <p>
     * The field is required.
     *
     * @param poolsItem The item to be added to the list.
     * @return This {@link EmailIpDetailResponse instance}.
     */
    public EmailIpDetailResponse addPoolsItem(EmailIpPoolResponse poolsItem) {
        if (this.pools == null) {
            this.pools = new LinkedHashSet<>();
        }
        this.pools.add(poolsItem);
        return this;
    }

    /**
     * Returns pools.
     * <p>
     * The field is required.
     *
     * @return pools
     */
    @JsonProperty("pools")
    public Set<EmailIpPoolResponse> getPools() {
        return pools;
    }

    /**
     * Sets pools.
     * <p>
     * The field is required.
     *
     * @param pools
     */
    @JsonProperty("pools")
    public void setPools(Set<EmailIpPoolResponse> pools) {
        this.pools = pools;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        EmailIpDetailResponse emailIpDetailResponse = (EmailIpDetailResponse) o;
        return Objects.equals(this.id, emailIpDetailResponse.id)
                && Objects.equals(this.ip, emailIpDetailResponse.ip)
                && Objects.equals(this.pools, emailIpDetailResponse.pools);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, ip, pools);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class EmailIpDetailResponse {")
                .append(newLine)
                .append("    id: ")
                .append(toIndentedString(id))
                .append(newLine)
                .append("    ip: ")
                .append(toIndentedString(ip))
                .append(newLine)
                .append("    pools: ")
                .append(toIndentedString(pools))
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
