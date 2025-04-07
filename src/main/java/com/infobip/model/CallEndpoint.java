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
 * Call endpoint. Represents a caller for the inbound calls and a callee for the outbound calls.
 */
@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.EXISTING_PROPERTY,
        property = "type",
        visible = true)
@JsonSubTypes({
    @JsonSubTypes.Type(value = CallsPhoneEndpoint.class, name = "PHONE"),
    @JsonSubTypes.Type(value = CallsSipEndpoint.class, name = "SIP"),
    @JsonSubTypes.Type(value = CallsViberEndpoint.class, name = "VIBER"),
    @JsonSubTypes.Type(value = CallsWebRtcEndpoint.class, name = "WEBRTC"),
    @JsonSubTypes.Type(value = CallsWebsocketEndpoint.class, name = "WEBSOCKET"),
})
public abstract class CallEndpoint {

    protected final CallEndpointType type;

    /**
     * Constructs a new {@link CallEndpoint} instance.
     */
    public CallEndpoint(String type) {
        this.type = CallEndpointType.fromValue(type);
    }

    /**
     * Returns type.
     *
     * @return type
     */
    @JsonProperty("type")
    public CallEndpointType getType() {
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
        CallEndpoint callEndpoint = (CallEndpoint) o;
        return Objects.equals(this.type, callEndpoint.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class CallEndpoint {")
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
