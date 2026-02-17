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
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Represents CallRoutingWebSocketEndpoint model.
 */
public class CallRoutingWebSocketEndpoint extends CallRoutingEndpoint {

    private String websocketEndpointConfigId;

    private String identifier;

    private Map<String, String> customData = null;

    /**
     * Constructs a new {@link CallRoutingWebSocketEndpoint} instance.
     */
    public CallRoutingWebSocketEndpoint() {
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
     * @return This {@link CallRoutingWebSocketEndpoint instance}.
     */
    public CallRoutingWebSocketEndpoint websocketEndpointConfigId(String websocketEndpointConfigId) {
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
     * @return This {@link CallRoutingWebSocketEndpoint instance}.
     */
    public CallRoutingWebSocketEndpoint identifier(String identifier) {
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

    /**
     * Sets customData.
     * <p>
     * Field description:
     * Custom data associated with the websocket endpoint. Supports using variables &#x60;${from}&#x60; and &#x60;${to}&#x60;.
     *
     * @param customData
     * @return This {@link CallRoutingWebSocketEndpoint instance}.
     */
    public CallRoutingWebSocketEndpoint customData(Map<String, String> customData) {
        this.customData = customData;
        return this;
    }

    /**
     * Puts and entry into customData.
     * <p>
     * Field description:
     * Custom data associated with the websocket endpoint. Supports using variables &#x60;${from}&#x60; and &#x60;${to}&#x60;.
     *
     * @param key The given key.
     * @param customDataItem The item to be associated with the given key.
     * @return This {@link CallRoutingWebSocketEndpoint instance}.
     */
    public CallRoutingWebSocketEndpoint putCustomDataItem(String key, String customDataItem) {
        if (this.customData == null) {
            this.customData = new HashMap<>();
        }
        this.customData.put(key, customDataItem);
        return this;
    }

    /**
     * Returns customData.
     * <p>
     * Field description:
     * Custom data associated with the websocket endpoint. Supports using variables &#x60;${from}&#x60; and &#x60;${to}&#x60;.
     *
     * @return customData
     */
    @JsonProperty("customData")
    public Map<String, String> getCustomData() {
        return customData;
    }

    /**
     * Sets customData.
     * <p>
     * Field description:
     * Custom data associated with the websocket endpoint. Supports using variables &#x60;${from}&#x60; and &#x60;${to}&#x60;.
     *
     * @param customData
     */
    @JsonProperty("customData")
    public void setCustomData(Map<String, String> customData) {
        this.customData = customData;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CallRoutingWebSocketEndpoint callRoutingWebSocketEndpoint = (CallRoutingWebSocketEndpoint) o;
        return Objects.equals(this.websocketEndpointConfigId, callRoutingWebSocketEndpoint.websocketEndpointConfigId)
                && Objects.equals(this.identifier, callRoutingWebSocketEndpoint.identifier)
                && Objects.equals(this.customData, callRoutingWebSocketEndpoint.customData)
                && super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(websocketEndpointConfigId, identifier, customData, super.hashCode());
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class CallRoutingWebSocketEndpoint {")
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
                .append("    customData: ")
                .append(toIndentedString(customData))
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
