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
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Represents CapabilityCheckResult model.
 */
public class CapabilityCheckResult {

    private String phoneNumber;

    private String mccMnc;

    private String countryCode;

    private String networkName;

    private List<ChannelCapability> capabilities;

    /**
     * Sets phoneNumber.
     * <p>
     * Field description:
     * The phone number that was checked.
     *
     * @param phoneNumber
     * @return This {@link CapabilityCheckResult instance}.
     */
    public CapabilityCheckResult phoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    /**
     * Returns phoneNumber.
     * <p>
     * Field description:
     * The phone number that was checked.
     *
     * @return phoneNumber
     */
    @JsonProperty("phoneNumber")
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Sets phoneNumber.
     * <p>
     * Field description:
     * The phone number that was checked.
     *
     * @param phoneNumber
     */
    @JsonProperty("phoneNumber")
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /**
     * Sets mccMnc.
     * <p>
     * Field description:
     * Mobile Country Code and Mobile Network Code.
     *
     * @param mccMnc
     * @return This {@link CapabilityCheckResult instance}.
     */
    public CapabilityCheckResult mccMnc(String mccMnc) {
        this.mccMnc = mccMnc;
        return this;
    }

    /**
     * Returns mccMnc.
     * <p>
     * Field description:
     * Mobile Country Code and Mobile Network Code.
     *
     * @return mccMnc
     */
    @JsonProperty("mccMnc")
    public String getMccMnc() {
        return mccMnc;
    }

    /**
     * Sets mccMnc.
     * <p>
     * Field description:
     * Mobile Country Code and Mobile Network Code.
     *
     * @param mccMnc
     */
    @JsonProperty("mccMnc")
    public void setMccMnc(String mccMnc) {
        this.mccMnc = mccMnc;
    }

    /**
     * Sets countryCode.
     * <p>
     * Field description:
     * ISO country code of the phone number.
     *
     * @param countryCode
     * @return This {@link CapabilityCheckResult instance}.
     */
    public CapabilityCheckResult countryCode(String countryCode) {
        this.countryCode = countryCode;
        return this;
    }

    /**
     * Returns countryCode.
     * <p>
     * Field description:
     * ISO country code of the phone number.
     *
     * @return countryCode
     */
    @JsonProperty("countryCode")
    public String getCountryCode() {
        return countryCode;
    }

    /**
     * Sets countryCode.
     * <p>
     * Field description:
     * ISO country code of the phone number.
     *
     * @param countryCode
     */
    @JsonProperty("countryCode")
    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    /**
     * Sets networkName.
     * <p>
     * Field description:
     * Name of the mobile network operator.
     *
     * @param networkName
     * @return This {@link CapabilityCheckResult instance}.
     */
    public CapabilityCheckResult networkName(String networkName) {
        this.networkName = networkName;
        return this;
    }

    /**
     * Returns networkName.
     * <p>
     * Field description:
     * Name of the mobile network operator.
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
     * Name of the mobile network operator.
     *
     * @param networkName
     */
    @JsonProperty("networkName")
    public void setNetworkName(String networkName) {
        this.networkName = networkName;
    }

    /**
     * Sets capabilities.
     * <p>
     * Field description:
     * List of channel capabilities for this phone number.
     *
     * @param capabilities
     * @return This {@link CapabilityCheckResult instance}.
     */
    public CapabilityCheckResult capabilities(List<ChannelCapability> capabilities) {
        this.capabilities = capabilities;
        return this;
    }

    /**
     * Adds and item into capabilities.
     * <p>
     * Field description:
     * List of channel capabilities for this phone number.
     *
     * @param capabilitiesItem The item to be added to the list.
     * @return This {@link CapabilityCheckResult instance}.
     */
    public CapabilityCheckResult addCapabilitiesItem(ChannelCapability capabilitiesItem) {
        if (this.capabilities == null) {
            this.capabilities = new ArrayList<>();
        }
        this.capabilities.add(capabilitiesItem);
        return this;
    }

    /**
     * Returns capabilities.
     * <p>
     * Field description:
     * List of channel capabilities for this phone number.
     *
     * @return capabilities
     */
    @JsonProperty("capabilities")
    public List<ChannelCapability> getCapabilities() {
        return capabilities;
    }

    /**
     * Sets capabilities.
     * <p>
     * Field description:
     * List of channel capabilities for this phone number.
     *
     * @param capabilities
     */
    @JsonProperty("capabilities")
    public void setCapabilities(List<ChannelCapability> capabilities) {
        this.capabilities = capabilities;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CapabilityCheckResult capabilityCheckResult = (CapabilityCheckResult) o;
        return Objects.equals(this.phoneNumber, capabilityCheckResult.phoneNumber)
                && Objects.equals(this.mccMnc, capabilityCheckResult.mccMnc)
                && Objects.equals(this.countryCode, capabilityCheckResult.countryCode)
                && Objects.equals(this.networkName, capabilityCheckResult.networkName)
                && Objects.equals(this.capabilities, capabilityCheckResult.capabilities);
    }

    @Override
    public int hashCode() {
        return Objects.hash(phoneNumber, mccMnc, countryCode, networkName, capabilities);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class CapabilityCheckResult {")
                .append(newLine)
                .append("    phoneNumber: ")
                .append(toIndentedString(phoneNumber))
                .append(newLine)
                .append("    mccMnc: ")
                .append(toIndentedString(mccMnc))
                .append(newLine)
                .append("    countryCode: ")
                .append(toIndentedString(countryCode))
                .append(newLine)
                .append("    networkName: ")
                .append(toIndentedString(networkName))
                .append(newLine)
                .append("    capabilities: ")
                .append(toIndentedString(capabilities))
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
