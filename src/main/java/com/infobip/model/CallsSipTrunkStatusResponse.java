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
 * Represents CallsSipTrunkStatusResponse model.
 */
public class CallsSipTrunkStatusResponse {

    private CallsSipTrunkAdminStatus adminStatus;

    /**
     * Sets adminStatus.
     *
     * @param adminStatus
     * @return This {@link CallsSipTrunkStatusResponse instance}.
     */
    public CallsSipTrunkStatusResponse adminStatus(CallsSipTrunkAdminStatus adminStatus) {
        this.adminStatus = adminStatus;
        return this;
    }

    /**
     * Returns adminStatus.
     *
     * @return adminStatus
     */
    @JsonProperty("adminStatus")
    public CallsSipTrunkAdminStatus getAdminStatus() {
        return adminStatus;
    }

    /**
     * Sets adminStatus.
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
        CallsSipTrunkStatusResponse callsSipTrunkStatusResponse = (CallsSipTrunkStatusResponse) o;
        return Objects.equals(this.adminStatus, callsSipTrunkStatusResponse.adminStatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(adminStatus);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class CallsSipTrunkStatusResponse {")
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
