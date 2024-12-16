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
 * A list of person&#39;s email addresses. Max 100 emails per person.
 */
public class FlowEmailContact {

    private String address;

    /**
     * Sets address.
     * <p>
     * Field description:
     * Person&#39;s email address. Must comply with the [email format](https://tools.ietf.org/html/rfc2822) and cannot exceed 255 characters. One person can have up to 100 email addresses.
     *
     * @param address
     * @return This {@link FlowEmailContact instance}.
     */
    public FlowEmailContact address(String address) {
        this.address = address;
        return this;
    }

    /**
     * Returns address.
     * <p>
     * Field description:
     * Person&#39;s email address. Must comply with the [email format](https://tools.ietf.org/html/rfc2822) and cannot exceed 255 characters. One person can have up to 100 email addresses.
     *
     * @return address
     */
    @JsonProperty("address")
    public String getAddress() {
        return address;
    }

    /**
     * Sets address.
     * <p>
     * Field description:
     * Person&#39;s email address. Must comply with the [email format](https://tools.ietf.org/html/rfc2822) and cannot exceed 255 characters. One person can have up to 100 email addresses.
     *
     * @param address
     */
    @JsonProperty("address")
    public void setAddress(String address) {
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
        FlowEmailContact flowEmailContact = (FlowEmailContact) o;
        return Objects.equals(this.address, flowEmailContact.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(address);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class FlowEmailContact {")
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
