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
 * Represents CallsEmergencyAddress model.
 */
public class CallsEmergencyAddress {

    private Boolean enabled = false;

    private CallsAddress address;

    /**
     * Sets enabled.
     * <p>
     * Field description:
     * Indicates whether configuration is enabled or not.
     * <p>
     * The field is required.
     *
     * @param enabled
     * @return This {@link CallsEmergencyAddress instance}.
     */
    public CallsEmergencyAddress enabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * Returns enabled.
     * <p>
     * Field description:
     * Indicates whether configuration is enabled or not.
     * <p>
     * The field is required.
     *
     * @return enabled
     */
    @JsonProperty("enabled")
    public Boolean getEnabled() {
        return enabled;
    }

    /**
     * Sets enabled.
     * <p>
     * Field description:
     * Indicates whether configuration is enabled or not.
     * <p>
     * The field is required.
     *
     * @param enabled
     */
    @JsonProperty("enabled")
    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * Sets address.
     * <p>
     * The field is required.
     *
     * @param address
     * @return This {@link CallsEmergencyAddress instance}.
     */
    public CallsEmergencyAddress address(CallsAddress address) {
        this.address = address;
        return this;
    }

    /**
     * Returns address.
     * <p>
     * The field is required.
     *
     * @return address
     */
    @JsonProperty("address")
    public CallsAddress getAddress() {
        return address;
    }

    /**
     * Sets address.
     * <p>
     * The field is required.
     *
     * @param address
     */
    @JsonProperty("address")
    public void setAddress(CallsAddress address) {
        this.address = address;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CallsEmergencyAddress callsEmergencyAddress = (CallsEmergencyAddress) o;
        return Objects.equals(this.enabled, callsEmergencyAddress.enabled)
                && Objects.equals(this.address, callsEmergencyAddress.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(enabled, address);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class CallsEmergencyAddress {")
                .append(newLine)
                .append("    enabled: ")
                .append(toIndentedString(enabled))
                .append(newLine)
                .append("    address: ")
                .append(toIndentedString(address))
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
