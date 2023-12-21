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
 * SIP trunk status request.
 */
public class CallsSipTrunkStatusRequest {

    private CallsSipTrunkAdminStatus adminStatus;

    /**
     * Sets adminStatus.
     * <p>
     * The field is required.
     *
     * @param adminStatus
     * @return This {@link CallsSipTrunkStatusRequest instance}.
     */
    public CallsSipTrunkStatusRequest adminStatus(CallsSipTrunkAdminStatus adminStatus) {
        this.adminStatus = adminStatus;
        return this;
    }

    /**
     * Returns adminStatus.
     * <p>
     * The field is required.
     *
     * @return adminStatus
     */
    @JsonProperty("adminStatus")
    public CallsSipTrunkAdminStatus getAdminStatus() {
        return adminStatus;
    }

    /**
     * Sets adminStatus.
     * <p>
     * The field is required.
     *
     * @param adminStatus
     */
    @JsonProperty("adminStatus")
    public void setAdminStatus(CallsSipTrunkAdminStatus adminStatus) {
        this.adminStatus = adminStatus;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CallsSipTrunkStatusRequest callsSipTrunkStatusRequest = (CallsSipTrunkStatusRequest) o;
        return Objects.equals(this.adminStatus, callsSipTrunkStatusRequest.adminStatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(adminStatus);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class CallsSipTrunkStatusRequest {")
                .append(newLine)
                .append("    adminStatus: ")
                .append(toIndentedString(adminStatus))
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
