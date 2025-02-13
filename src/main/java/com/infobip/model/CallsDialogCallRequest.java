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
 * Represents CallsDialogCallRequest model.
 */
public class CallsDialogCallRequest {

    private CallEndpoint endpoint;

    private String from;

    private String fromDisplayName;

    private Integer connectTimeout;

    private CallsMachineDetectionRequest machineDetection;

    private Map<String, String> customData = null;

    /**
     * Sets endpoint.
     *
     * @param endpoint
     * @return This {@link CallsDialogCallRequest instance}.
     */
    public CallsDialogCallRequest endpoint(CallEndpoint endpoint) {
        this.endpoint = endpoint;
        return this;
    }

    /**
     * Returns endpoint.
     *
     * @return endpoint
     */
    @JsonProperty("endpoint")
    public CallEndpoint getEndpoint() {
        return endpoint;
    }

    /**
     * Sets endpoint.
     *
     * @param endpoint
     */
    @JsonProperty("endpoint")
    public void setEndpoint(CallEndpoint endpoint) {
        this.endpoint = endpoint;
    }

    /**
     * Sets from.
     * <p>
     * Field description:
     * Caller identifier. Must be a number in the [E.164](https://en.wikipedia.org/wiki/E.164) format for calls to &#x60;PHONE&#x60;, a string for calls to &#x60;WEBRTC&#x60; or &#x60;SIP&#x60;, and a Viber Voice number for calls to &#x60;VIBER&#x60;. Field is mandatory for &#x60;VIBER&#x60; endpoint and calls to emergency numbers.
     *
     * @param from
     * @return This {@link CallsDialogCallRequest instance}.
     */
    public CallsDialogCallRequest from(String from) {
        this.from = from;
        return this;
    }

    /**
     * Returns from.
     * <p>
     * Field description:
     * Caller identifier. Must be a number in the [E.164](https://en.wikipedia.org/wiki/E.164) format for calls to &#x60;PHONE&#x60;, a string for calls to &#x60;WEBRTC&#x60; or &#x60;SIP&#x60;, and a Viber Voice number for calls to &#x60;VIBER&#x60;. Field is mandatory for &#x60;VIBER&#x60; endpoint and calls to emergency numbers.
     *
     * @return from
     */
    @JsonProperty("from")
    public String getFrom() {
        return from;
    }

    /**
     * Sets from.
     * <p>
     * Field description:
     * Caller identifier. Must be a number in the [E.164](https://en.wikipedia.org/wiki/E.164) format for calls to &#x60;PHONE&#x60;, a string for calls to &#x60;WEBRTC&#x60; or &#x60;SIP&#x60;, and a Viber Voice number for calls to &#x60;VIBER&#x60;. Field is mandatory for &#x60;VIBER&#x60; endpoint and calls to emergency numbers.
     *
     * @param from
     */
    @JsonProperty("from")
    public void setFrom(String from) {
        this.from = from;
    }

    /**
     * Sets fromDisplayName.
     * <p>
     * Field description:
     * Display name to show when placing calls towards WEBRTC endpoints. Can be any alphanumeric string.
     *
     * @param fromDisplayName
     * @return This {@link CallsDialogCallRequest instance}.
     */
    public CallsDialogCallRequest fromDisplayName(String fromDisplayName) {
        this.fromDisplayName = fromDisplayName;
        return this;
    }

    /**
     * Returns fromDisplayName.
     * <p>
     * Field description:
     * Display name to show when placing calls towards WEBRTC endpoints. Can be any alphanumeric string.
     *
     * @return fromDisplayName
     */
    @JsonProperty("fromDisplayName")
    public String getFromDisplayName() {
        return fromDisplayName;
    }

    /**
     * Sets fromDisplayName.
     * <p>
     * Field description:
     * Display name to show when placing calls towards WEBRTC endpoints. Can be any alphanumeric string.
     *
     * @param fromDisplayName
     */
    @JsonProperty("fromDisplayName")
    public void setFromDisplayName(String fromDisplayName) {
        this.fromDisplayName = fromDisplayName;
    }

    /**
     * Sets connectTimeout.
     * <p>
     * Field description:
     * Time to wait, in seconds, before the called party answers the call.
     *
     * @param connectTimeout
     * @return This {@link CallsDialogCallRequest instance}.
     */
    public CallsDialogCallRequest connectTimeout(Integer connectTimeout) {
        this.connectTimeout = connectTimeout;
        return this;
    }

    /**
     * Returns connectTimeout.
     * <p>
     * Field description:
     * Time to wait, in seconds, before the called party answers the call.
     *
     * @return connectTimeout
     */
    @JsonProperty("connectTimeout")
    public Integer getConnectTimeout() {
        return connectTimeout;
    }

    /**
     * Sets connectTimeout.
     * <p>
     * Field description:
     * Time to wait, in seconds, before the called party answers the call.
     *
     * @param connectTimeout
     */
    @JsonProperty("connectTimeout")
    public void setConnectTimeout(Integer connectTimeout) {
        this.connectTimeout = connectTimeout;
    }

    /**
     * Sets machineDetection.
     *
     * @param machineDetection
     * @return This {@link CallsDialogCallRequest instance}.
     */
    public CallsDialogCallRequest machineDetection(CallsMachineDetectionRequest machineDetection) {
        this.machineDetection = machineDetection;
        return this;
    }

    /**
     * Returns machineDetection.
     *
     * @return machineDetection
     */
    @JsonProperty("machineDetection")
    public CallsMachineDetectionRequest getMachineDetection() {
        return machineDetection;
    }

    /**
     * Sets machineDetection.
     *
     * @param machineDetection
     */
    @JsonProperty("machineDetection")
    public void setMachineDetection(CallsMachineDetectionRequest machineDetection) {
        this.machineDetection = machineDetection;
    }

    /**
     * Sets customData.
     * <p>
     * Field description:
     * Custom data is used for storing call-specific data defined by the client.
     *
     * @param customData
     * @return This {@link CallsDialogCallRequest instance}.
     */
    public CallsDialogCallRequest customData(Map<String, String> customData) {
        this.customData = customData;
        return this;
    }

    /**
     * Puts and entry into customData.
     * <p>
     * Field description:
     * Custom data is used for storing call-specific data defined by the client.
     *
     * @param key The given key.
     * @param customDataItem The item to be associated with the given key.
     * @return This {@link CallsDialogCallRequest instance}.
     */
    public CallsDialogCallRequest putCustomDataItem(String key, String customDataItem) {
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
     * Custom data is used for storing call-specific data defined by the client.
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
     * Custom data is used for storing call-specific data defined by the client.
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
        CallsDialogCallRequest callsDialogCallRequest = (CallsDialogCallRequest) o;
        return Objects.equals(this.endpoint, callsDialogCallRequest.endpoint)
                && Objects.equals(this.from, callsDialogCallRequest.from)
                && Objects.equals(this.fromDisplayName, callsDialogCallRequest.fromDisplayName)
                && Objects.equals(this.connectTimeout, callsDialogCallRequest.connectTimeout)
                && Objects.equals(this.machineDetection, callsDialogCallRequest.machineDetection)
                && Objects.equals(this.customData, callsDialogCallRequest.customData);
    }

    @Override
    public int hashCode() {
        return Objects.hash(endpoint, from, fromDisplayName, connectTimeout, machineDetection, customData);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class CallsDialogCallRequest {")
                .append(newLine)
                .append("    endpoint: ")
                .append(toIndentedString(endpoint))
                .append(newLine)
                .append("    from: ")
                .append(toIndentedString(from))
                .append(newLine)
                .append("    fromDisplayName: ")
                .append(toIndentedString(fromDisplayName))
                .append(newLine)
                .append("    connectTimeout: ")
                .append(toIndentedString(connectTimeout))
                .append(newLine)
                .append("    machineDetection: ")
                .append(toIndentedString(machineDetection))
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
