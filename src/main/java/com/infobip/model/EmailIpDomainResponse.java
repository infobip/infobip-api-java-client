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
 * Represents EmailIpDomainResponse model.
 */
public class EmailIpDomainResponse {

    private Long id;

    private String name;

    private Set<EmailDomainIpApiPool> pools = new LinkedHashSet<>();

    /**
     * Sets id.
     * <p>
     * Field description:
     * Domain identifier.
     * <p>
     * The field is required.
     *
     * @param id
     * @return This {@link EmailIpDomainResponse instance}.
     */
    public EmailIpDomainResponse id(Long id) {
        this.id = id;
        return this;
    }

    /**
     * Returns id.
     * <p>
     * Field description:
     * Domain identifier.
     * <p>
     * The field is required.
     *
     * @return id
     */
    @JsonProperty("id")
    public Long getId() {
        return id;
    }

    /**
     * Sets id.
     * <p>
     * Field description:
     * Domain identifier.
     * <p>
     * The field is required.
     *
     * @param id
     */
    @JsonProperty("id")
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Sets name.
     * <p>
     * Field description:
     * Domain name.
     * <p>
     * The field is required.
     *
     * @param name
     * @return This {@link EmailIpDomainResponse instance}.
     */
    public EmailIpDomainResponse name(String name) {
        this.name = name;
        return this;
    }

    /**
     * Returns name.
     * <p>
     * Field description:
     * Domain name.
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
     * Domain name.
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
     * Sets pools.
     * <p>
     * The field is required.
     *
     * @param pools
     * @return This {@link EmailIpDomainResponse instance}.
     */
    public EmailIpDomainResponse pools(Set<EmailDomainIpApiPool> pools) {
        this.pools = pools;
        return this;
    }

    /**
     * Adds and item into pools.
     * <p>
     * The field is required.
     *
     * @param poolsItem The item to be added to the list.
     * @return This {@link EmailIpDomainResponse instance}.
     */
    public EmailIpDomainResponse addPoolsItem(EmailDomainIpApiPool poolsItem) {
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
    public Set<EmailDomainIpApiPool> getPools() {
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
    public void setPools(Set<EmailDomainIpApiPool> pools) {
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
        EmailIpDomainResponse emailIpDomainResponse = (EmailIpDomainResponse) o;
        return Objects.equals(this.id, emailIpDomainResponse.id)
                && Objects.equals(this.name, emailIpDomainResponse.name)
                && Objects.equals(this.pools, emailIpDomainResponse.pools);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, pools);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class EmailIpDomainResponse {")
                .append(newLine)
                .append("    id: ")
                .append(toIndentedString(id))
                .append(newLine)
                .append("    name: ")
                .append(toIndentedString(name))
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
