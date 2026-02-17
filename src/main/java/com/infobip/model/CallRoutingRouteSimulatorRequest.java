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
 * Route simulator request object.
 */
public class CallRoutingRouteSimulatorRequest {

    private String to;

    private Boolean useDisabledRoutes;

    private CallRoutingSimulatorCallEndpoint endpoint;

    /**
     * Sets to.
     * <p>
     * Field description:
     * Phone number or regular expression pattern representing the phone number. Applies to all simulator endpoint types except &#x60;WEBRTC&#x60;. Examples: &#x60;41793026727&#x60;, &#x60;41793(.+)&#x60;.
     *
     * @param to
     * @return This {@link CallRoutingRouteSimulatorRequest instance}.
     */
    public CallRoutingRouteSimulatorRequest to(String to) {
        this.to = to;
        return this;
    }

    /**
     * Returns to.
     * <p>
     * Field description:
     * Phone number or regular expression pattern representing the phone number. Applies to all simulator endpoint types except &#x60;WEBRTC&#x60;. Examples: &#x60;41793026727&#x60;, &#x60;41793(.+)&#x60;.
     *
     * @return to
     */
    @JsonProperty("to")
    public String getTo() {
        return to;
    }

    /**
     * Sets to.
     * <p>
     * Field description:
     * Phone number or regular expression pattern representing the phone number. Applies to all simulator endpoint types except &#x60;WEBRTC&#x60;. Examples: &#x60;41793026727&#x60;, &#x60;41793(.+)&#x60;.
     *
     * @param to
     */
    @JsonProperty("to")
    public void setTo(String to) {
        this.to = to;
    }

    /**
     * Sets useDisabledRoutes.
     * <p>
     * Field description:
     * If set to &#x60;true&#x60;, the simulator will use disabled routes for simulation. If set to &#x60;false&#x60;, only enabled routes will be used.
     *
     * @param useDisabledRoutes
     * @return This {@link CallRoutingRouteSimulatorRequest instance}.
     */
    public CallRoutingRouteSimulatorRequest useDisabledRoutes(Boolean useDisabledRoutes) {
        this.useDisabledRoutes = useDisabledRoutes;
        return this;
    }

    /**
     * Returns useDisabledRoutes.
     * <p>
     * Field description:
     * If set to &#x60;true&#x60;, the simulator will use disabled routes for simulation. If set to &#x60;false&#x60;, only enabled routes will be used.
     *
     * @return useDisabledRoutes
     */
    @JsonProperty("useDisabledRoutes")
    public Boolean getUseDisabledRoutes() {
        return useDisabledRoutes;
    }

    /**
     * Sets useDisabledRoutes.
     * <p>
     * Field description:
     * If set to &#x60;true&#x60;, the simulator will use disabled routes for simulation. If set to &#x60;false&#x60;, only enabled routes will be used.
     *
     * @param useDisabledRoutes
     */
    @JsonProperty("useDisabledRoutes")
    public void setUseDisabledRoutes(Boolean useDisabledRoutes) {
        this.useDisabledRoutes = useDisabledRoutes;
    }

    /**
     * Sets endpoint.
     * <p>
     * The field is required.
     *
     * @param endpoint
     * @return This {@link CallRoutingRouteSimulatorRequest instance}.
     */
    public CallRoutingRouteSimulatorRequest endpoint(CallRoutingSimulatorCallEndpoint endpoint) {
        this.endpoint = endpoint;
        return this;
    }

    /**
     * Returns endpoint.
     * <p>
     * The field is required.
     *
     * @return endpoint
     */
    @JsonProperty("endpoint")
    public CallRoutingSimulatorCallEndpoint getEndpoint() {
        return endpoint;
    }

    /**
     * Sets endpoint.
     * <p>
     * The field is required.
     *
     * @param endpoint
     */
    @JsonProperty("endpoint")
    public void setEndpoint(CallRoutingSimulatorCallEndpoint endpoint) {
        this.endpoint = endpoint;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CallRoutingRouteSimulatorRequest callRoutingRouteSimulatorRequest = (CallRoutingRouteSimulatorRequest) o;
        return Objects.equals(this.to, callRoutingRouteSimulatorRequest.to)
                && Objects.equals(this.useDisabledRoutes, callRoutingRouteSimulatorRequest.useDisabledRoutes)
                && Objects.equals(this.endpoint, callRoutingRouteSimulatorRequest.endpoint);
    }

    @Override
    public int hashCode() {
        return Objects.hash(to, useDisabledRoutes, endpoint);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class CallRoutingRouteSimulatorRequest {")
                .append(newLine)
                .append("    to: ")
                .append(toIndentedString(to))
                .append(newLine)
                .append("    useDisabledRoutes: ")
                .append(toIndentedString(useDisabledRoutes))
                .append(newLine)
                .append("    endpoint: ")
                .append(toIndentedString(endpoint))
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
