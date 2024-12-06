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
import java.util.List;
import java.util.Objects;

/**
 * Represents CallRoutingEndpointDestination model.
 */
public class CallRoutingEndpointDestination extends CallRoutingDestination {

    private CallRoutingEndpoint value;

    private Integer connectTimeout;

    private CallRoutingRecording recording;

    private List<DeliveryTimeWindow> allowedTimeWindows = null;

    /**
     * Constructs a new {@link CallRoutingEndpointDestination} instance.
     */
    public CallRoutingEndpointDestination() {
        super("ENDPOINT");
    }

    /**
     * Sets value.
     * <p>
     * The field is required.
     *
     * @param value
     * @return This {@link CallRoutingEndpointDestination instance}.
     */
    public CallRoutingEndpointDestination value(CallRoutingEndpoint value) {
        this.value = value;
        return this;
    }

    /**
     * Returns value.
     * <p>
     * The field is required.
     *
     * @return value
     */
    @JsonProperty("value")
    public CallRoutingEndpoint getValue() {
        return value;
    }

    /**
     * Sets value.
     * <p>
     * The field is required.
     *
     * @param value
     */
    @JsonProperty("value")
    public void setValue(CallRoutingEndpoint value) {
        this.value = value;
    }

    /**
     * Sets connectTimeout.
     * <p>
     * Field description:
     * Time to wait, in seconds, to establish a call toward the destination endpoint. The call will be terminated if it is not answered within the specified time.
     *
     * @param connectTimeout
     * @return This {@link CallRoutingEndpointDestination instance}.
     */
    public CallRoutingEndpointDestination connectTimeout(Integer connectTimeout) {
        this.connectTimeout = connectTimeout;
        return this;
    }

    /**
     * Returns connectTimeout.
     * <p>
     * Field description:
     * Time to wait, in seconds, to establish a call toward the destination endpoint. The call will be terminated if it is not answered within the specified time.
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
     * Time to wait, in seconds, to establish a call toward the destination endpoint. The call will be terminated if it is not answered within the specified time.
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
     * @return This {@link CallRoutingEndpointDestination instance}.
     */
    public CallRoutingEndpointDestination recording(CallRoutingRecording recording) {
        this.recording = recording;
        return this;
    }

    /**
     * Returns recording.
     *
     * @return recording
     */
    @JsonProperty("recording")
    public CallRoutingRecording getRecording() {
        return recording;
    }

    /**
     * Sets recording.
     *
     * @param recording
     */
    @JsonProperty("recording")
    public void setRecording(CallRoutingRecording recording) {
        this.recording = recording;
    }

    /**
     * Sets allowedTimeWindows.
     * <p>
     * Field description:
     * Sets specific delivery windows outside of which calls won&#39;t be forwarded to the destination. If defined, call forwarding is allowed only if any time window in array is satisfied.
     *
     * @param allowedTimeWindows
     * @return This {@link CallRoutingEndpointDestination instance}.
     */
    public CallRoutingEndpointDestination allowedTimeWindows(List<DeliveryTimeWindow> allowedTimeWindows) {
        this.allowedTimeWindows = allowedTimeWindows;
        return this;
    }

    /**
     * Adds and item into allowedTimeWindows.
     * <p>
     * Field description:
     * Sets specific delivery windows outside of which calls won&#39;t be forwarded to the destination. If defined, call forwarding is allowed only if any time window in array is satisfied.
     *
     * @param allowedTimeWindowsItem The item to be added to the list.
     * @return This {@link CallRoutingEndpointDestination instance}.
     */
    public CallRoutingEndpointDestination addAllowedTimeWindowsItem(DeliveryTimeWindow allowedTimeWindowsItem) {
        if (this.allowedTimeWindows == null) {
            this.allowedTimeWindows = new ArrayList<>();
        }
        this.allowedTimeWindows.add(allowedTimeWindowsItem);
        return this;
    }

    /**
     * Returns allowedTimeWindows.
     * <p>
     * Field description:
     * Sets specific delivery windows outside of which calls won&#39;t be forwarded to the destination. If defined, call forwarding is allowed only if any time window in array is satisfied.
     *
     * @return allowedTimeWindows
     */
    @JsonProperty("allowedTimeWindows")
    public List<DeliveryTimeWindow> getAllowedTimeWindows() {
        return allowedTimeWindows;
    }

    /**
     * Sets allowedTimeWindows.
     * <p>
     * Field description:
     * Sets specific delivery windows outside of which calls won&#39;t be forwarded to the destination. If defined, call forwarding is allowed only if any time window in array is satisfied.
     *
     * @param allowedTimeWindows
     */
    @JsonProperty("allowedTimeWindows")
    public void setAllowedTimeWindows(List<DeliveryTimeWindow> allowedTimeWindows) {
        this.allowedTimeWindows = allowedTimeWindows;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CallRoutingEndpointDestination callRoutingEndpointDestination = (CallRoutingEndpointDestination) o;
        return Objects.equals(this.value, callRoutingEndpointDestination.value)
                && Objects.equals(this.connectTimeout, callRoutingEndpointDestination.connectTimeout)
                && Objects.equals(this.recording, callRoutingEndpointDestination.recording)
                && Objects.equals(this.allowedTimeWindows, callRoutingEndpointDestination.allowedTimeWindows)
                && super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value, connectTimeout, recording, allowedTimeWindows, super.hashCode());
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class CallRoutingEndpointDestination {")
                .append(newLine)
                .append("    ")
                .append(toIndentedString(super.toString()))
                .append(newLine)
                .append("    value: ")
                .append(toIndentedString(value))
                .append(newLine)
                .append("    connectTimeout: ")
                .append(toIndentedString(connectTimeout))
                .append(newLine)
                .append("    recording: ")
                .append(toIndentedString(recording))
                .append(newLine)
                .append("    allowedTimeWindows: ")
                .append(toIndentedString(allowedTimeWindows))
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
