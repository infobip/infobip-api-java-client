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
 * Represents CallsValidateAddressResponse model.
 */
public class CallsValidateAddressResponse {

    private List<CallsAddress> validAddresses = null;

    /**
     * Sets validAddresses.
     * <p>
     * Field description:
     * List of physical valid addresses that matches your input.
     *
     * @param validAddresses
     * @return This {@link CallsValidateAddressResponse instance}.
     */
    public CallsValidateAddressResponse validAddresses(List<CallsAddress> validAddresses) {
        this.validAddresses = validAddresses;
        return this;
    }

    /**
     * Adds and item into validAddresses.
     * <p>
     * Field description:
     * List of physical valid addresses that matches your input.
     *
     * @param validAddressesItem The item to be added to the list.
     * @return This {@link CallsValidateAddressResponse instance}.
     */
    public CallsValidateAddressResponse addValidAddressesItem(CallsAddress validAddressesItem) {
        if (this.validAddresses == null) {
            this.validAddresses = new ArrayList<>();
        }
        this.validAddresses.add(validAddressesItem);
        return this;
    }

    /**
     * Returns validAddresses.
     * <p>
     * Field description:
     * List of physical valid addresses that matches your input.
     *
     * @return validAddresses
     */
    @JsonProperty("validAddresses")
    public List<CallsAddress> getValidAddresses() {
        return validAddresses;
    }

    /**
     * Sets validAddresses.
     * <p>
     * Field description:
     * List of physical valid addresses that matches your input.
     *
     * @param validAddresses
     */
    @JsonProperty("validAddresses")
    public void setValidAddresses(List<CallsAddress> validAddresses) {
        this.validAddresses = validAddresses;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CallsValidateAddressResponse callsValidateAddressResponse = (CallsValidateAddressResponse) o;
        return Objects.equals(this.validAddresses, callsValidateAddressResponse.validAddresses);
    }

    @Override
    public int hashCode() {
        return Objects.hash(validAddresses);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class CallsValidateAddressResponse {")
                .append(newLine)
                .append("    validAddresses: ")
                .append(toIndentedString(validAddresses))
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
