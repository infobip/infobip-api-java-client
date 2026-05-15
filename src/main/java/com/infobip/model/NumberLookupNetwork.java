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
 * Information about the roaming network.
 */
public class NumberLookupNetwork {

    private String networkName;

    private String networkPrefix;

    private String countryName;

    private String countryPrefix;

    private Integer networkId;

    /**
     * Sets networkName.
     * <p>
     * Field description:
     * Optional human readable name of the network.
     *
     * @param networkName
     * @return This {@link NumberLookupNetwork instance}.
     */
    public NumberLookupNetwork networkName(String networkName) {
        this.networkName = networkName;
        return this;
    }

    /**
     * Returns networkName.
     * <p>
     * Field description:
     * Optional human readable name of the network.
     *
     * @return networkName
     */
    @JsonProperty("networkName")
    public String getNetworkName() {
        return networkName;
    }

    /**
     * Sets networkName.
     * <p>
     * Field description:
     * Optional human readable name of the network.
     *
     * @param networkName
     */
    @JsonProperty("networkName")
    public void setNetworkName(String networkName) {
        this.networkName = networkName;
    }

    /**
     * Sets networkPrefix.
     * <p>
     * Field description:
     * Network prefix.
     *
     * @param networkPrefix
     * @return This {@link NumberLookupNetwork instance}.
     */
    public NumberLookupNetwork networkPrefix(String networkPrefix) {
        this.networkPrefix = networkPrefix;
        return this;
    }

    /**
     * Returns networkPrefix.
     * <p>
     * Field description:
     * Network prefix.
     *
     * @return networkPrefix
     */
    @JsonProperty("networkPrefix")
    public String getNetworkPrefix() {
        return networkPrefix;
    }

    /**
     * Sets networkPrefix.
     * <p>
     * Field description:
     * Network prefix.
     *
     * @param networkPrefix
     */
    @JsonProperty("networkPrefix")
    public void setNetworkPrefix(String networkPrefix) {
        this.networkPrefix = networkPrefix;
    }

    /**
     * Sets countryName.
     * <p>
     * Field description:
     * Optional name of the country the network operates in.
     *
     * @param countryName
     * @return This {@link NumberLookupNetwork instance}.
     */
    public NumberLookupNetwork countryName(String countryName) {
        this.countryName = countryName;
        return this;
    }

    /**
     * Returns countryName.
     * <p>
     * Field description:
     * Optional name of the country the network operates in.
     *
     * @return countryName
     */
    @JsonProperty("countryName")
    public String getCountryName() {
        return countryName;
    }

    /**
     * Sets countryName.
     * <p>
     * Field description:
     * Optional name of the country the network operates in.
     *
     * @param countryName
     */
    @JsonProperty("countryName")
    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    /**
     * Sets countryPrefix.
     * <p>
     * Field description:
     * Country prefix.
     *
     * @param countryPrefix
     * @return This {@link NumberLookupNetwork instance}.
     */
    public NumberLookupNetwork countryPrefix(String countryPrefix) {
        this.countryPrefix = countryPrefix;
        return this;
    }

    /**
     * Returns countryPrefix.
     * <p>
     * Field description:
     * Country prefix.
     *
     * @return countryPrefix
     */
    @JsonProperty("countryPrefix")
    public String getCountryPrefix() {
        return countryPrefix;
    }

    /**
     * Sets countryPrefix.
     * <p>
     * Field description:
     * Country prefix.
     *
     * @param countryPrefix
     */
    @JsonProperty("countryPrefix")
    public void setCountryPrefix(String countryPrefix) {
        this.countryPrefix = countryPrefix;
    }

    /**
     * Sets networkId.
     * <p>
     * Field description:
     * ID of the network.
     *
     * @param networkId
     * @return This {@link NumberLookupNetwork instance}.
     */
    public NumberLookupNetwork networkId(Integer networkId) {
        this.networkId = networkId;
        return this;
    }

    /**
     * Returns networkId.
     * <p>
     * Field description:
     * ID of the network.
     *
     * @return networkId
     */
    @JsonProperty("networkId")
    public Integer getNetworkId() {
        return networkId;
    }

    /**
     * Sets networkId.
     * <p>
     * Field description:
     * ID of the network.
     *
     * @param networkId
     */
    @JsonProperty("networkId")
    public void setNetworkId(Integer networkId) {
        this.networkId = networkId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        NumberLookupNetwork numberLookupNetwork = (NumberLookupNetwork) o;
        return Objects.equals(this.networkName, numberLookupNetwork.networkName)
                && Objects.equals(this.networkPrefix, numberLookupNetwork.networkPrefix)
                && Objects.equals(this.countryName, numberLookupNetwork.countryName)
                && Objects.equals(this.countryPrefix, numberLookupNetwork.countryPrefix)
                && Objects.equals(this.networkId, numberLookupNetwork.networkId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(networkName, networkPrefix, countryName, countryPrefix, networkId);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class NumberLookupNetwork {")
                .append(newLine)
                .append("    networkName: ")
                .append(toIndentedString(networkName))
                .append(newLine)
                .append("    networkPrefix: ")
                .append(toIndentedString(networkPrefix))
                .append(newLine)
                .append("    countryName: ")
                .append(toIndentedString(countryName))
                .append(newLine)
                .append("    countryPrefix: ")
                .append(toIndentedString(countryPrefix))
                .append(newLine)
                .append("    networkId: ")
                .append(toIndentedString(networkId))
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
