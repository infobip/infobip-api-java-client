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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 * Bulk item list.
 */
public class CallsBulkItem {

    private String from;

    private List<CallsBulkCallRequest> callRequests = new ArrayList<>();

    private CallRecordingRequest recording;

    private CallsMachineDetectionRequest machineDetection;

    private Integer maxDuration;

    private Integer connectTimeout;

    private CallRate callRate;

    private Integer validityPeriod;

    private CallsRetryOptions retryOptions;

    private CallsSchedulingOptions schedulingOptions;

    private Map<String, String> customData = null;

    /**
     * Sets from.
     * <p>
     * Field description:
     * Caller identifier. Must be a number in the [E.164](https://en.wikipedia.org/wiki/E.164) format.
     * <p>
     * The field is required.
     *
     * @param from
     * @return This {@link CallsBulkItem instance}.
     */
    public CallsBulkItem from(String from) {
        this.from = from;
        return this;
    }

    /**
     * Returns from.
     * <p>
     * Field description:
     * Caller identifier. Must be a number in the [E.164](https://en.wikipedia.org/wiki/E.164) format.
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
     * Caller identifier. Must be a number in the [E.164](https://en.wikipedia.org/wiki/E.164) format.
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
     * Sets callRequests.
     * <p>
     * Field description:
     * Call request list.
     * <p>
     * The field is required.
     *
     * @param callRequests
     * @return This {@link CallsBulkItem instance}.
     */
    public CallsBulkItem callRequests(List<CallsBulkCallRequest> callRequests) {
        this.callRequests = callRequests;
        return this;
    }

    /**
     * Adds and item into callRequests.
     * <p>
     * Field description:
     * Call request list.
     * <p>
     * The field is required.
     *
     * @param callRequestsItem The item to be added to the list.
     * @return This {@link CallsBulkItem instance}.
     */
    public CallsBulkItem addCallRequestsItem(CallsBulkCallRequest callRequestsItem) {
        if (this.callRequests == null) {
            this.callRequests = new ArrayList<>();
        }
        this.callRequests.add(callRequestsItem);
        return this;
    }

    /**
     * Returns callRequests.
     * <p>
     * Field description:
     * Call request list.
     * <p>
     * The field is required.
     *
     * @return callRequests
     */
    @JsonProperty("callRequests")
    public List<CallsBulkCallRequest> getCallRequests() {
        return callRequests;
    }

    /**
     * Sets callRequests.
     * <p>
     * Field description:
     * Call request list.
     * <p>
     * The field is required.
     *
     * @param callRequests
     */
    @JsonProperty("callRequests")
    public void setCallRequests(List<CallsBulkCallRequest> callRequests) {
        this.callRequests = callRequests;
    }

    /**
     * Sets recording.
     *
     * @param recording
     * @return This {@link CallsBulkItem instance}.
     */
    public CallsBulkItem recording(CallRecordingRequest recording) {
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
     * @return This {@link CallsBulkItem instance}.
     */
    public CallsBulkItem machineDetection(CallsMachineDetectionRequest machineDetection) {
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
     * Maximum call duration in seconds. Once exceeded, the call terminates automatically.
     *
     * @param maxDuration
     * @return This {@link CallsBulkItem instance}.
     */
    public CallsBulkItem maxDuration(Integer maxDuration) {
        this.maxDuration = maxDuration;
        return this;
    }

    /**
     * Returns maxDuration.
     * <p>
     * Field description:
     * Maximum call duration in seconds. Once exceeded, the call terminates automatically.
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
     * Maximum call duration in seconds. Once exceeded, the call terminates automatically.
     *
     * @param maxDuration
     */
    @JsonProperty("maxDuration")
    public void setMaxDuration(Integer maxDuration) {
        this.maxDuration = maxDuration;
    }

    /**
     * Sets connectTimeout.
     * <p>
     * Field description:
     * Time to wait, in seconds, before the called party answers the call. Once exceeded, the call terminates automatically.
     *
     * @param connectTimeout
     * @return This {@link CallsBulkItem instance}.
     */
    public CallsBulkItem connectTimeout(Integer connectTimeout) {
        this.connectTimeout = connectTimeout;
        return this;
    }

    /**
     * Returns connectTimeout.
     * <p>
     * Field description:
     * Time to wait, in seconds, before the called party answers the call. Once exceeded, the call terminates automatically.
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
     * Time to wait, in seconds, before the called party answers the call. Once exceeded, the call terminates automatically.
     *
     * @param connectTimeout
     */
    @JsonProperty("connectTimeout")
    public void setConnectTimeout(Integer connectTimeout) {
        this.connectTimeout = connectTimeout;
    }

    /**
     * Sets callRate.
     *
     * @param callRate
     * @return This {@link CallsBulkItem instance}.
     */
    public CallsBulkItem callRate(CallRate callRate) {
        this.callRate = callRate;
        return this;
    }

    /**
     * Returns callRate.
     *
     * @return callRate
     */
    @JsonProperty("callRate")
    public CallRate getCallRate() {
        return callRate;
    }

    /**
     * Sets callRate.
     *
     * @param callRate
     */
    @JsonProperty("callRate")
    public void setCallRate(CallRate callRate) {
        this.callRate = callRate;
    }

    /**
     * Sets validityPeriod.
     * <p>
     * Field description:
     * The call validity period in minutes. Once expired, the call is not established.
     *
     * @param validityPeriod
     * @return This {@link CallsBulkItem instance}.
     */
    public CallsBulkItem validityPeriod(Integer validityPeriod) {
        this.validityPeriod = validityPeriod;
        return this;
    }

    /**
     * Returns validityPeriod.
     * <p>
     * Field description:
     * The call validity period in minutes. Once expired, the call is not established.
     *
     * @return validityPeriod
     */
    @JsonProperty("validityPeriod")
    public Integer getValidityPeriod() {
        return validityPeriod;
    }

    /**
     * Sets validityPeriod.
     * <p>
     * Field description:
     * The call validity period in minutes. Once expired, the call is not established.
     *
     * @param validityPeriod
     */
    @JsonProperty("validityPeriod")
    public void setValidityPeriod(Integer validityPeriod) {
        this.validityPeriod = validityPeriod;
    }

    /**
     * Sets retryOptions.
     *
     * @param retryOptions
     * @return This {@link CallsBulkItem instance}.
     */
    public CallsBulkItem retryOptions(CallsRetryOptions retryOptions) {
        this.retryOptions = retryOptions;
        return this;
    }

    /**
     * Returns retryOptions.
     *
     * @return retryOptions
     */
    @JsonProperty("retryOptions")
    public CallsRetryOptions getRetryOptions() {
        return retryOptions;
    }

    /**
     * Sets retryOptions.
     *
     * @param retryOptions
     */
    @JsonProperty("retryOptions")
    public void setRetryOptions(CallsRetryOptions retryOptions) {
        this.retryOptions = retryOptions;
    }

    /**
     * Sets schedulingOptions.
     *
     * @param schedulingOptions
     * @return This {@link CallsBulkItem instance}.
     */
    public CallsBulkItem schedulingOptions(CallsSchedulingOptions schedulingOptions) {
        this.schedulingOptions = schedulingOptions;
        return this;
    }

    /**
     * Returns schedulingOptions.
     *
     * @return schedulingOptions
     */
    @JsonProperty("schedulingOptions")
    public CallsSchedulingOptions getSchedulingOptions() {
        return schedulingOptions;
    }

    /**
     * Sets schedulingOptions.
     *
     * @param schedulingOptions
     */
    @JsonProperty("schedulingOptions")
    public void setSchedulingOptions(CallsSchedulingOptions schedulingOptions) {
        this.schedulingOptions = schedulingOptions;
    }

    /**
     * Sets customData.
     * <p>
     * Field description:
     * Client-defined, bulk-level custom data.
     *
     * @param customData
     * @return This {@link CallsBulkItem instance}.
     */
    public CallsBulkItem customData(Map<String, String> customData) {
        this.customData = customData;
        return this;
    }

    /**
     * Puts and entry into customData.
     * <p>
     * Field description:
     * Client-defined, bulk-level custom data.
     *
     * @param key The given key.
     * @param customDataItem The item to be associated with the given key.
     * @return This {@link CallsBulkItem instance}.
     */
    public CallsBulkItem putCustomDataItem(String key, String customDataItem) {
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
     * Client-defined, bulk-level custom data.
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
     * Client-defined, bulk-level custom data.
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
        CallsBulkItem callsBulkItem = (CallsBulkItem) o;
        return Objects.equals(this.from, callsBulkItem.from)
                && Objects.equals(this.callRequests, callsBulkItem.callRequests)
                && Objects.equals(this.recording, callsBulkItem.recording)
                && Objects.equals(this.machineDetection, callsBulkItem.machineDetection)
                && Objects.equals(this.maxDuration, callsBulkItem.maxDuration)
                && Objects.equals(this.connectTimeout, callsBulkItem.connectTimeout)
                && Objects.equals(this.callRate, callsBulkItem.callRate)
                && Objects.equals(this.validityPeriod, callsBulkItem.validityPeriod)
                && Objects.equals(this.retryOptions, callsBulkItem.retryOptions)
                && Objects.equals(this.schedulingOptions, callsBulkItem.schedulingOptions)
                && Objects.equals(this.customData, callsBulkItem.customData);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                from,
                callRequests,
                recording,
                machineDetection,
                maxDuration,
                connectTimeout,
                callRate,
                validityPeriod,
                retryOptions,
                schedulingOptions,
                customData);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class CallsBulkItem {")
                .append(newLine)
                .append("    from: ")
                .append(toIndentedString(from))
                .append(newLine)
                .append("    callRequests: ")
                .append(toIndentedString(callRequests))
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
                .append("    connectTimeout: ")
                .append(toIndentedString(connectTimeout))
                .append(newLine)
                .append("    callRate: ")
                .append(toIndentedString(callRate))
                .append(newLine)
                .append("    validityPeriod: ")
                .append(toIndentedString(validityPeriod))
                .append(newLine)
                .append("    retryOptions: ")
                .append(toIndentedString(retryOptions))
                .append(newLine)
                .append("    schedulingOptions: ")
                .append(toIndentedString(schedulingOptions))
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
