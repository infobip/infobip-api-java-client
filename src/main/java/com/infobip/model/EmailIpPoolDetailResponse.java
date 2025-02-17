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
 * Represents EmailIpPoolDetailResponse model.
 */
public class EmailIpPoolDetailResponse {

    private String id;

    private String name;

    private Set<EmailIpResponse> ips = new LinkedHashSet<>();

    /**
     * Sets id.
     * <p>
     * Field description:
     * IP pool identifier.
     * <p>
     * The field is required.
     *
     * @param id
     * @return This {@link EmailIpPoolDetailResponse instance}.
     */
    public EmailIpPoolDetailResponse id(String id) {
        this.id = id;
        return this;
    }

    /**
     * Returns id.
     * <p>
     * Field description:
     * IP pool identifier.
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
     * IP pool identifier.
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
     * Sets name.
     * <p>
     * Field description:
     * IP pool name.
     * <p>
     * The field is required.
     *
     * @param name
     * @return This {@link EmailIpPoolDetailResponse instance}.
     */
    public EmailIpPoolDetailResponse name(String name) {
        this.name = name;
        return this;
    }

    /**
     * Returns name.
     * <p>
     * Field description:
     * IP pool name.
     * <p>
     * The field is required.
     *
     * @return name
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * Sets name.
     * <p>
     * Field description:
     * IP pool name.
     * <p>
     * The field is required.
     *
     * @param name
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Sets ips.
     * <p>
     * The field is required.
     *
     * @param ips
     * @return This {@link EmailIpPoolDetailResponse instance}.
     */
    public EmailIpPoolDetailResponse ips(Set<EmailIpResponse> ips) {
        this.ips = ips;
        return this;
    }

    /**
     * Adds and item into ips.
     * <p>
     * The field is required.
     *
     * @param ipsItem The item to be added to the list.
     * @return This {@link EmailIpPoolDetailResponse instance}.
     */
    public EmailIpPoolDetailResponse addIpsItem(EmailIpResponse ipsItem) {
        if (this.ips == null) {
            this.ips = new LinkedHashSet<>();
        }
        this.ips.add(ipsItem);
        return this;
    }

    /**
     * Returns ips.
     * <p>
     * The field is required.
     *
     * @return ips
     */
    @JsonProperty("ips")
    public Set<EmailIpResponse> getIps() {
        return ips;
    }

    /**
     * Sets ips.
     * <p>
     * The field is required.
     *
     * @param ips
     */
    @JsonProperty("ips")
    public void setIps(Set<EmailIpResponse> ips) {
        this.ips = ips;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        EmailIpPoolDetailResponse emailIpPoolDetailResponse = (EmailIpPoolDetailResponse) o;
        return Objects.equals(this.id, emailIpPoolDetailResponse.id)
                && Objects.equals(this.name, emailIpPoolDetailResponse.name)
                && Objects.equals(this.ips, emailIpPoolDetailResponse.ips);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, ips);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class EmailIpPoolDetailResponse {")
                .append(newLine)
                .append("    id: ")
                .append(toIndentedString(id))
                .append(newLine)
                .append("    name: ")
                .append(toIndentedString(name))
                .append(newLine)
                .append("    ips: ")
                .append(toIndentedString(ips))
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
