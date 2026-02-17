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
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.util.Objects;

/**
 * Simulator endpoint to be used for the simulation.
 */
@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.EXISTING_PROPERTY,
        property = "type",
        visible = true)
@JsonSubTypes({
    @JsonSubTypes.Type(value = CallRoutingSimulatorPhoneEndpoint.class, name = "PHONE"),
    @JsonSubTypes.Type(value = CallRoutingSimulatorSipEndpoint.class, name = "SIP"),
    @JsonSubTypes.Type(value = CallRoutingSimulatorWebRTCEndpoint.class, name = "WEBRTC"),
})
public abstract class CallRoutingSimulatorCallEndpoint {

    protected final CallRoutingSimulatorCallEndpointType type;

    /**
     * Constructs a new {@link CallRoutingSimulatorCallEndpoint} instance.
     */
    public CallRoutingSimulatorCallEndpoint(String type) {
        this.type = CallRoutingSimulatorCallEndpointType.fromValue(type);
    }

    /**
     * Returns type.
     *
     * @return type
     */
    @JsonProperty("type")
    public CallRoutingSimulatorCallEndpointType getType() {
        return type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CallRoutingSimulatorCallEndpoint callRoutingSimulatorCallEndpoint = (CallRoutingSimulatorCallEndpoint) o;
        return Objects.equals(this.type, callRoutingSimulatorCallEndpoint.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class CallRoutingSimulatorCallEndpoint {")
                .append(newLine)
                .append("    type: ")
                .append(toIndentedString(type))
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
