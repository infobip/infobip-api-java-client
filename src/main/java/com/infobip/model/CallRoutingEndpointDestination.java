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
 * Represents CallRoutingEndpointDestination model.
 */
public class CallRoutingEndpointDestination extends CallRoutingDestination {

    private CallRoutingEndpoint value;

    private Integer priority;

    private Integer weight;

    private Integer connectTimeout;

    private CallRoutingRecording recording;

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
     * Sets priority.
     * <p>
     * Field description:
     * Priority of the destination within a route. Destinations with lower value have higher priority. Either all or no destination need to have this value defined.
     *
     * @param priority
     * @return This {@link CallRoutingEndpointDestination instance}.
     */
    public CallRoutingEndpointDestination priority(Integer priority) {
        this.priority = priority;
        return this;
    }

    /**
     * Returns priority.
     * <p>
     * Field description:
     * Priority of the destination within a route. Destinations with lower value have higher priority. Either all or no destination need to have this value defined.
     *
     * @return priority
     */
    @JsonProperty("priority")
    public Integer getPriority() {
        return priority;
    }

    /**
     * Sets priority.
     * <p>
     * Field description:
     * Priority of the destination within a route. Destinations with lower value have higher priority. Either all or no destination need to have this value defined.
     *
     * @param priority
     */
    @JsonProperty("priority")
    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    /**
     * Sets weight.
     * <p>
     * Field description:
     * Weight of the destination within a route. It specifies how much traffic is handled by destination relative to other destinations within the same priority level. Values are evaluated relative to each other and they don&#39;t need to add up to 100.
     *
     * @param weight
     * @return This {@link CallRoutingEndpointDestination instance}.
     */
    public CallRoutingEndpointDestination weight(Integer weight) {
        this.weight = weight;
        return this;
    }

    /**
     * Returns weight.
     * <p>
     * Field description:
     * Weight of the destination within a route. It specifies how much traffic is handled by destination relative to other destinations within the same priority level. Values are evaluated relative to each other and they don&#39;t need to add up to 100.
     *
     * @return weight
     */
    @JsonProperty("weight")
    public Integer getWeight() {
        return weight;
    }

    /**
     * Sets weight.
     * <p>
     * Field description:
     * Weight of the destination within a route. It specifies how much traffic is handled by destination relative to other destinations within the same priority level. Values are evaluated relative to each other and they don&#39;t need to add up to 100.
     *
     * @param weight
     */
    @JsonProperty("weight")
    public void setWeight(Integer weight) {
        this.weight = weight;
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
                && Objects.equals(this.priority, callRoutingEndpointDestination.priority)
                && Objects.equals(this.weight, callRoutingEndpointDestination.weight)
                && Objects.equals(this.connectTimeout, callRoutingEndpointDestination.connectTimeout)
                && Objects.equals(this.recording, callRoutingEndpointDestination.recording)
                && super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value, priority, weight, connectTimeout, recording, super.hashCode());
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
                .append("    priority: ")
                .append(toIndentedString(priority))
                .append(newLine)
                .append("    weight: ")
                .append(toIndentedString(weight))
                .append(newLine)
                .append("    connectTimeout: ")
                .append(toIndentedString(connectTimeout))
                .append(newLine)
                .append("    recording: ")
                .append(toIndentedString(recording))
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
