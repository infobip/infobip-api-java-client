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
 * Represents NumbersForwardToCallRoutingDetails model.
 */
public class NumbersForwardToCallRoutingDetails extends NumbersVoiceActionDetails {

    private String routeId;

    /**
     * Constructs a new {@link NumbersForwardToCallRoutingDetails} instance.
     */
    public NumbersForwardToCallRoutingDetails() {
        super("FORWARD_TO_CALL_ROUTING");
    }

    /**
     * Sets routeId.
     * <p>
     * Field description:
     * Unique identifier of a route.
     *
     * @param routeId
     * @return This {@link NumbersForwardToCallRoutingDetails instance}.
     */
    public NumbersForwardToCallRoutingDetails routeId(String routeId) {
        this.routeId = routeId;
        return this;
    }

    /**
     * Returns routeId.
     * <p>
     * Field description:
     * Unique identifier of a route.
     *
     * @return routeId
     */
    @JsonProperty("routeId")
    public String getRouteId() {
        return routeId;
    }

    /**
     * Sets routeId.
     * <p>
     * Field description:
     * Unique identifier of a route.
     *
     * @param routeId
     */
    @JsonProperty("routeId")
    public void setRouteId(String routeId) {
        this.routeId = routeId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        NumbersForwardToCallRoutingDetails numbersForwardToCallRoutingDetails = (NumbersForwardToCallRoutingDetails) o;
        return Objects.equals(this.routeId, numbersForwardToCallRoutingDetails.routeId) && super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(routeId, super.hashCode());
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class NumbersForwardToCallRoutingDetails {")
                .append(newLine)
                .append("    ")
                .append(toIndentedString(super.toString()))
                .append(newLine)
                .append("    routeId: ")
                .append(toIndentedString(routeId))
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
