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
 * Represents CallRoutingEndpointDestinationResponse model.
 */
public class CallRoutingEndpointDestinationResponse extends CallRoutingUrlDestinationResponse {

    private CallRoutingEndpoint value;

    private Integer connectTimeout;

    private CallRoutingRecording recording;

    /**
     * Constructs a new {@link CallRoutingEndpointDestinationResponse} instance.
     */
    public CallRoutingEndpointDestinationResponse() {
        super("ENDPOINT");
    }

    /**
     * Sets value.
     * <p>
     * The field is required.
     *
     * @param value
     * @return This {@link CallRoutingEndpointDestinationResponse instance}.
     */
    public CallRoutingEndpointDestinationResponse value(CallRoutingEndpoint value) {
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
     * @return This {@link CallRoutingEndpointDestinationResponse instance}.
     */
    public CallRoutingEndpointDestinationResponse connectTimeout(Integer connectTimeout) {
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
     * @return This {@link CallRoutingEndpointDestinationResponse instance}.
     */
    public CallRoutingEndpointDestinationResponse recording(CallRoutingRecording recording) {
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
        CallRoutingEndpointDestinationResponse callRoutingEndpointDestinationResponse =
                (CallRoutingEndpointDestinationResponse) o;
        return Objects.equals(this.value, callRoutingEndpointDestinationResponse.value)
                && Objects.equals(this.connectTimeout, callRoutingEndpointDestinationResponse.connectTimeout)
                && Objects.equals(this.recording, callRoutingEndpointDestinationResponse.recording)
                && super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value, connectTimeout, recording, super.hashCode());
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class CallRoutingEndpointDestinationResponse {")
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
