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
 * Outbound call request.
 */
public class CallRequest {

    private CallEndpoint endpoint;

    private String from;

    private String fromDisplayName;

    private Integer connectTimeout;

    private CallRecordingRequest recording;

    private CallsMachineDetectionRequest machineDetection;

    private Integer maxDuration;

    private Map<String, String> customData = null;

    private String applicationId;

    private String parentCallId;

    /**
     * Sets endpoint.
     * <p>
     * The field is required.
     *
     * @param endpoint
     * @return This {@link CallRequest instance}.
     */
    public CallRequest endpoint(CallEndpoint endpoint) {
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
     * @return This {@link CallRequest instance}.
     */
    public CallRequest from(String from) {
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
     * @return This {@link CallRequest instance}.
     */
    public CallRequest fromDisplayName(String fromDisplayName) {
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
     * @return This {@link CallRequest instance}.
     */
    public CallRequest connectTimeout(Integer connectTimeout) {
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
     * @return This {@link CallRequest instance}.
     */
    public CallRequest recording(CallRecordingRequest recording) {
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
     * @return This {@link CallRequest instance}.
     */
    public CallRequest machineDetection(CallsMachineDetectionRequest machineDetection) {
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
     * @return This {@link CallRequest instance}.
     */
    public CallRequest maxDuration(Integer maxDuration) {
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
     * @return This {@link CallRequest instance}.
     */
    public CallRequest customData(Map<String, String> customData) {
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
     * @return This {@link CallRequest instance}.
     */
    public CallRequest putCustomDataItem(String key, String customDataItem) {
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

    /**
     * Sets applicationId.
     * <p>
     * Field description:
     * Application ID.
     * <p>
     * The field is required.
     *
     * @param applicationId
     * @return This {@link CallRequest instance}.
     */
    public CallRequest applicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }

    /**
     * Returns applicationId.
     * <p>
     * Field description:
     * Application ID.
     * <p>
     * The field is required.
     *
     * @return applicationId
     */
    @JsonProperty("applicationId")
    public String getApplicationId() {
        return applicationId;
    }

    /**
     * Sets applicationId.
     * <p>
     * Field description:
     * Application ID.
     * <p>
     * The field is required.
     *
     * @param applicationId
     */
    @JsonProperty("applicationId")
    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    /**
     * Sets parentCallId.
     * <p>
     * Field description:
     * ID of an existing call that initiated this leg. Required for [creating a dialog with an existing call.](#create-dialog-with-existing-calls)
     *
     * @param parentCallId
     * @return This {@link CallRequest instance}.
     */
    public CallRequest parentCallId(String parentCallId) {
        this.parentCallId = parentCallId;
        return this;
    }

    /**
     * Returns parentCallId.
     * <p>
     * Field description:
     * ID of an existing call that initiated this leg. Required for [creating a dialog with an existing call.](#create-dialog-with-existing-calls)
     *
     * @return parentCallId
     */
    @JsonProperty("parentCallId")
    public String getParentCallId() {
        return parentCallId;
    }

    /**
     * Sets parentCallId.
     * <p>
     * Field description:
     * ID of an existing call that initiated this leg. Required for [creating a dialog with an existing call.](#create-dialog-with-existing-calls)
     *
     * @param parentCallId
     */
    @JsonProperty("parentCallId")
    public void setParentCallId(String parentCallId) {
        this.parentCallId = parentCallId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CallRequest callRequest = (CallRequest) o;
        return Objects.equals(this.endpoint, callRequest.endpoint)
                && Objects.equals(this.from, callRequest.from)
                && Objects.equals(this.fromDisplayName, callRequest.fromDisplayName)
                && Objects.equals(this.connectTimeout, callRequest.connectTimeout)
                && Objects.equals(this.recording, callRequest.recording)
                && Objects.equals(this.machineDetection, callRequest.machineDetection)
                && Objects.equals(this.maxDuration, callRequest.maxDuration)
                && Objects.equals(this.customData, callRequest.customData)
                && Objects.equals(this.applicationId, callRequest.applicationId)
                && Objects.equals(this.parentCallId, callRequest.parentCallId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                endpoint,
                from,
                fromDisplayName,
                connectTimeout,
                recording,
                machineDetection,
                maxDuration,
                customData,
                applicationId,
                parentCallId);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class CallRequest {")
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
                .append("    applicationId: ")
                .append(toIndentedString(applicationId))
                .append(newLine)
                .append("    parentCallId: ")
                .append(toIndentedString(parentCallId))
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
