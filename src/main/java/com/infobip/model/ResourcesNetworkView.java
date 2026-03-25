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
 * Network data.
 */
public class ResourcesNetworkView {

    private String mccNnc;

    private String networkName;

    /**
     * Sets mccNnc.
     * <p>
     * Field description:
     * Norm net code uniquely identifying the specific mobile network operator.
     *
     * @param mccNnc
     * @return This {@link ResourcesNetworkView instance}.
     */
    public ResourcesNetworkView mccNnc(String mccNnc) {
        this.mccNnc = mccNnc;
        return this;
    }

    /**
     * Returns mccNnc.
     * <p>
     * Field description:
     * Norm net code uniquely identifying the specific mobile network operator.
     *
     * @return mccNnc
     */
    @JsonProperty("mccNnc")
    public String getMccNnc() {
        return mccNnc;
    }

    /**
     * Sets mccNnc.
     * <p>
     * Field description:
     * Norm net code uniquely identifying the specific mobile network operator.
     *
     * @param mccNnc
     */
    @JsonProperty("mccNnc")
    public void setMccNnc(String mccNnc) {
        this.mccNnc = mccNnc;
    }

    /**
     * Sets networkName.
     * <p>
     * Field description:
     * Network name.
     *
     * @param networkName
     * @return This {@link ResourcesNetworkView instance}.
     */
    public ResourcesNetworkView networkName(String networkName) {
        this.networkName = networkName;
        return this;
    }

    /**
     * Returns networkName.
     * <p>
     * Field description:
     * Network name.
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
     * Network name.
     *
     * @param networkName
     */
    @JsonProperty("networkName")
    public void setNetworkName(String networkName) {
        this.networkName = networkName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ResourcesNetworkView resourcesNetworkView = (ResourcesNetworkView) o;
        return Objects.equals(this.mccNnc, resourcesNetworkView.mccNnc)
                && Objects.equals(this.networkName, resourcesNetworkView.networkName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(mccNnc, networkName);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class ResourcesNetworkView {")
                .append(newLine)
                .append("    mccNnc: ")
                .append(toIndentedString(mccNnc))
                .append(newLine)
                .append("    networkName: ")
                .append(toIndentedString(networkName))
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
