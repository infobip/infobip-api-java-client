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
 * Route status request object.
 */
public class CallRoutingRouteStatusRequest {

    private CallRoutingRouteStatus routeStatus;

    /**
     * Sets routeStatus.
     * <p>
     * The field is required.
     *
     * @param routeStatus
     * @return This {@link CallRoutingRouteStatusRequest instance}.
     */
    public CallRoutingRouteStatusRequest routeStatus(CallRoutingRouteStatus routeStatus) {
        this.routeStatus = routeStatus;
        return this;
    }

    /**
     * Returns routeStatus.
     * <p>
     * The field is required.
     *
     * @return routeStatus
     */
    @JsonProperty("routeStatus")
    public CallRoutingRouteStatus getRouteStatus() {
        return routeStatus;
    }

    /**
     * Sets routeStatus.
     * <p>
     * The field is required.
     *
     * @param routeStatus
     */
    @JsonProperty("routeStatus")
    public void setRouteStatus(CallRoutingRouteStatus routeStatus) {
        this.routeStatus = routeStatus;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CallRoutingRouteStatusRequest callRoutingRouteStatusRequest = (CallRoutingRouteStatusRequest) o;
        return Objects.equals(this.routeStatus, callRoutingRouteStatusRequest.routeStatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(routeStatus);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class CallRoutingRouteStatusRequest {")
                .append(newLine)
                .append("    routeStatus: ")
                .append(toIndentedString(routeStatus))
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
