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
 * Represents CallsActionCallRequest model.
 */
public class CallsActionCallRequest {

    private CallEndpoint endpoint;

    private String from;

    private String fromDisplayName;

    private Integer connectTimeout;

    private CallRecordingRequest recording;

    private CallsMachineDetectionRequest machineDetection;

    private Integer maxDuration;

    private Map<String, String> customData = null;

    /**
     * Sets endpoint.
     * <p>
     * The field is required.
     *
     * @param endpoint
     * @return This {@link CallsActionCallRequest instance}.
     */
    public CallsActionCallRequest endpoint(CallEndpoint endpoint) {
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
    public CallEndpoint getEndpoint() {
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
    public void setEndpoint(CallEndpoint endpoint) {
        this.endpoint = endpoint;
    }

    /**
     * Sets from.
     * <p>
     * Field description:
     * Caller identifier. Must be a number in the [E.164](https://en.wikipedia.org/wiki/E.164) format for calls to &#x60;PHONE&#x60;, a string for calls to &#x60;WEBRTC&#x60; or &#x60;SIP&#x60;, and a Viber Voice number for calls to &#x60;VIBER&#x60;.
     * <p>
     * The field is required.
     *
     * @param from
     * @return This {@link CallsActionCallRequest instance}.
     */
    public CallsActionCallRequest from(String from) {
        this.from = from;
        return this;
    }

    /**
     * Returns from.
     * <p>
     * Field description:
     * Caller identifier. Must be a number in the [E.164](https://en.wikipedia.org/wiki/E.164) format for calls to &#x60;PHONE&#x60;, a string for calls to &#x60;WEBRTC&#x60; or &#x60;SIP&#x60;, and a Viber Voice number for calls to &#x60;VIBER&#x60;.
     * <p>
     * The field is required.
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
     * Caller identifier. Must be a number in the [E.164](https://en.wikipedia.org/wiki/E.164) format for calls to &#x60;PHONE&#x60;, a string for calls to &#x60;WEBRTC&#x60; or &#x60;SIP&#x60;, and a Viber Voice number for calls to &#x60;VIBER&#x60;.
     * <p>
     * The field is required.
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
     * @return This {@link CallsActionCallRequest instance}.
     */
    public CallsActionCallRequest fromDisplayName(String fromDisplayName) {
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
     * @return This {@link CallsActionCallRequest instance}.
     */
    public CallsActionCallRequest connectTimeout(Integer connectTimeout) {
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
     * Sets recording.
     *
     * @param recording
     * @return This {@link CallsActionCallRequest instance}.
     */
    public CallsActionCallRequest recording(CallRecordingRequest recording) {
        this.recording = recording;
        return this;
    }

    /**
     * Returns recording.
     *
     * @return recording
     */
    @JsonProperty("recording")
    public CallRecordingRequest getRecording() {
        return recording;
    }

    /**
     * Sets recording.
     *
     * @param recording
     */
    @JsonProperty("recording")
    public void setRecording(CallRecordingRequest recording) {
        this.recording = recording;
    }

    /**
     * Sets machineDetection.
     *
     * @param machineDetection
     * @return This {@link CallsActionCallRequest instance}.
     */
    public CallsActionCallRequest machineDetection(CallsMachineDetectionRequest machineDetection) {
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
     * Sets maxDuration.
     * <p>
     * Field description:
     * Max duration in seconds.
     *
     * @param maxDuration
     * @return This {@link CallsActionCallRequest instance}.
     */
    public CallsActionCallRequest maxDuration(Integer maxDuration) {
        this.maxDuration = maxDuration;
        return this;
    }

    /**
     * Returns maxDuration.
     * <p>
     * Field description:
     * Max duration in seconds.
     *
     * @return maxDuration
     */
    @JsonProperty("maxDuration")
    public Integer getMaxDuration() {
        return maxDuration;
    }

    /**
     * Sets maxDuration.
     * <p>
     * Field description:
     * Max duration in seconds.
     *
     * @param maxDuration
     */
    @JsonProperty("maxDuration")
    public void setMaxDuration(Integer maxDuration) {
        this.maxDuration = maxDuration;
    }

    /**
     * Sets customData.
     * <p>
     * Field description:
     * Custom data.
     *
     * @param customData
     * @return This {@link CallsActionCallRequest instance}.
     */
    public CallsActionCallRequest customData(Map<String, String> customData) {
        this.customData = customData;
        return this;
    }

    /**
     * Puts and entry into customData.
     * <p>
     * Field description:
     * Custom data.
     *
     * @param key The given key.
     * @param customDataItem The item to be associated with the given key.
     * @return This {@link CallsActionCallRequest instance}.
     */
    public CallsActionCallRequest putCustomDataItem(String key, String customDataItem) {
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
     * Custom data.
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
     * Custom data.
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
        CallsActionCallRequest callsActionCallRequest = (CallsActionCallRequest) o;
        return Objects.equals(this.endpoint, callsActionCallRequest.endpoint)
                && Objects.equals(this.from, callsActionCallRequest.from)
                && Objects.equals(this.fromDisplayName, callsActionCallRequest.fromDisplayName)
                && Objects.equals(this.connectTimeout, callsActionCallRequest.connectTimeout)
                && Objects.equals(this.recording, callsActionCallRequest.recording)
                && Objects.equals(this.machineDetection, callsActionCallRequest.machineDetection)
                && Objects.equals(this.maxDuration, callsActionCallRequest.maxDuration)
                && Objects.equals(this.customData, callsActionCallRequest.customData);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                endpoint, from, fromDisplayName, connectTimeout, recording, machineDetection, maxDuration, customData);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class CallsActionCallRequest {")
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
                .append("    recording: ")
                .append(toIndentedString(recording))
                .append(newLine)
                .append("    machineDetection: ")
                .append(toIndentedString(machineDetection))
                .append(newLine)
                .append("    maxDuration: ")
                .append(toIndentedString(maxDuration))
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
