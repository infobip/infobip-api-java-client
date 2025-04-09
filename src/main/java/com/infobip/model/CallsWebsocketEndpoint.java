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
 * Represents CallsWebsocketEndpoint model.
 */
public class CallsWebsocketEndpoint extends CallEndpoint {

    private String websocketEndpointConfigId;

    private String identifier;

    /**
     * Constructs a new {@link CallsWebsocketEndpoint} instance.
     */
    public CallsWebsocketEndpoint() {
        super("WEBSOCKET");
    }

    /**
     * Sets websocketEndpointConfigId.
     * <p>
     * Field description:
     * Websocket endpoint configuration ID.
     * <p>
     * The field is required.
     *
     * @param websocketEndpointConfigId
     * @return This {@link CallsWebsocketEndpoint instance}.
     */
    public CallsWebsocketEndpoint websocketEndpointConfigId(String websocketEndpointConfigId) {
        this.websocketEndpointConfigId = websocketEndpointConfigId;
        return this;
    }

    /**
     * Returns websocketEndpointConfigId.
     * <p>
     * Field description:
     * Websocket endpoint configuration ID.
     * <p>
     * The field is required.
     *
     * @return websocketEndpointConfigId
     */
    @JsonProperty("websocketEndpointConfigId")
    public String getWebsocketEndpointConfigId() {
        return websocketEndpointConfigId;
    }

    /**
     * Sets websocketEndpointConfigId.
     * <p>
     * Field description:
     * Websocket endpoint configuration ID.
     * <p>
     * The field is required.
     *
     * @param websocketEndpointConfigId
     */
    @JsonProperty("websocketEndpointConfigId")
    public void setWebsocketEndpointConfigId(String websocketEndpointConfigId) {
        this.websocketEndpointConfigId = websocketEndpointConfigId;
    }

    /**
     * Sets identifier.
     * <p>
     * Field description:
     * Optional identifier for websocket calls.
     *
     * @param identifier
     * @return This {@link CallsWebsocketEndpoint instance}.
     */
    public CallsWebsocketEndpoint identifier(String identifier) {
        this.identifier = identifier;
        return this;
    }

    /**
     * Returns identifier.
     * <p>
     * Field description:
     * Optional identifier for websocket calls.
     *
     * @return identifier
     */
    @JsonProperty("identifier")
    public String getIdentifier() {
        return identifier;
    }

    /**
     * Sets identifier.
     * <p>
     * Field description:
     * Optional identifier for websocket calls.
     *
     * @param identifier
     */
    @JsonProperty("identifier")
    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CallsWebsocketEndpoint callsWebsocketEndpoint = (CallsWebsocketEndpoint) o;
        return Objects.equals(this.websocketEndpointConfigId, callsWebsocketEndpoint.websocketEndpointConfigId)
                && Objects.equals(this.identifier, callsWebsocketEndpoint.identifier)
                && super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(websocketEndpointConfigId, identifier, super.hashCode());
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class CallsWebsocketEndpoint {")
                .append(newLine)
                .append("    ")
                .append(toIndentedString(super.toString()))
                .append(newLine)
                .append("    websocketEndpointConfigId: ")
                .append(toIndentedString(websocketEndpointConfigId))
                .append(newLine)
                .append("    identifier: ")
                .append(toIndentedString(identifier))
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
