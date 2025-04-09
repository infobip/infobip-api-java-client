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
 * Represents CallsWebsocketEndpointConfigResponse model.
 */
public class CallsWebsocketEndpointConfigResponse extends CallsMediaStreamConfigResponse {

    private String sampleRate;

    /**
     * Constructs a new {@link CallsWebsocketEndpointConfigResponse} instance.
     */
    public CallsWebsocketEndpointConfigResponse() {
        super("WEBSOCKET_ENDPOINT");
    }

    /**
     * Sets sampleRate.
     * <p>
     * Field description:
     * Audio sampling rate.
     *
     * @param sampleRate
     * @return This {@link CallsWebsocketEndpointConfigResponse instance}.
     */
    public CallsWebsocketEndpointConfigResponse sampleRate(String sampleRate) {
        this.sampleRate = sampleRate;
        return this;
    }

    /**
     * Returns sampleRate.
     * <p>
     * Field description:
     * Audio sampling rate.
     *
     * @return sampleRate
     */
    @JsonProperty("sampleRate")
    public String getSampleRate() {
        return sampleRate;
    }

    /**
     * Sets sampleRate.
     * <p>
     * Field description:
     * Audio sampling rate.
     *
     * @param sampleRate
     */
    @JsonProperty("sampleRate")
    public void setSampleRate(String sampleRate) {
        this.sampleRate = sampleRate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CallsWebsocketEndpointConfigResponse callsWebsocketEndpointConfigResponse =
                (CallsWebsocketEndpointConfigResponse) o;
        return Objects.equals(this.sampleRate, callsWebsocketEndpointConfigResponse.sampleRate) && super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sampleRate, super.hashCode());
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class CallsWebsocketEndpointConfigResponse {")
                .append(newLine)
                .append("    ")
                .append(toIndentedString(super.toString()))
                .append(newLine)
                .append("    sampleRate: ")
                .append(toIndentedString(sampleRate))
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
