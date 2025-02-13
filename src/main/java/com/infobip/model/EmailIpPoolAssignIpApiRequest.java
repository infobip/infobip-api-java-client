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
 * Represents EmailIpPoolAssignIpApiRequest model.
 */
public class EmailIpPoolAssignIpApiRequest {

    private String ipId;

    /**
     * Sets ipId.
     * <p>
     * Field description:
     * Dedicated IP identifier.
     * <p>
     * The field is required.
     *
     * @param ipId
     * @return This {@link EmailIpPoolAssignIpApiRequest instance}.
     */
    public EmailIpPoolAssignIpApiRequest ipId(String ipId) {
        this.ipId = ipId;
        return this;
    }

    /**
     * Returns ipId.
     * <p>
     * Field description:
     * Dedicated IP identifier.
     * <p>
     * The field is required.
     *
     * @return ipId
     */
    @JsonProperty("ipId")
    public String getIpId() {
        return ipId;
    }

    /**
     * Sets ipId.
     * <p>
     * Field description:
     * Dedicated IP identifier.
     * <p>
     * The field is required.
     *
     * @param ipId
     */
    @JsonProperty("ipId")
    public void setIpId(String ipId) {
        this.ipId = ipId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        EmailIpPoolAssignIpApiRequest emailIpPoolAssignIpApiRequest = (EmailIpPoolAssignIpApiRequest) o;
        return Objects.equals(this.ipId, emailIpPoolAssignIpApiRequest.ipId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ipId);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class EmailIpPoolAssignIpApiRequest {")
                .append(newLine)
                .append("    ipId: ")
                .append(toIndentedString(ipId))
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
