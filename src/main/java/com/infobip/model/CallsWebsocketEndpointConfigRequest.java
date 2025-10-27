/*
 * This class is auto generated from the Infobip OpenAPI specification
 * through the OpenAPI Specification Client API libraries (Re)Generator (OSCAR),
 * powered by the OpenAPI Generator (https://openapi-generator.tech).
 *
 * Do not edit manually. To learn how to raise an issue, see the CONTRIBUTING guide
 * or contact us @ support@infobip.com.
 */

package com.infobip.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;

/**
 * Represents CallsWebsocketEndpointConfigRequest model.
 */
public class CallsWebsocketEndpointConfigRequest extends CallsMediaStreamConfigRequest {
    /**
     * Audio sampling rate.
     */
    public enum SampleRateEnum {
        _8000("8000"),
        _16000("16000"),
        _24000("24000"),
        _32000("32000");

        private String value;

        SampleRateEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static SampleRateEnum fromValue(String value) {
            for (SampleRateEnum enumElement : SampleRateEnum.values()) {
                if (enumElement.value.equals(value)) {
                    return enumElement;
                }
            }
            throw new IllegalArgumentException("Unexpected enum value '" + value + "'.");
        }
    }

    private SampleRateEnum sampleRate;

    /**
     * Constructs a new {@link CallsWebsocketEndpointConfigRequest} instance.
     */
    public CallsWebsocketEndpointConfigRequest() {
        super("WEBSOCKET_ENDPOINT");
    }

    /**
     * Sets sampleRate.
     * <p>
     * Field description:
     * Audio sampling rate.
     *
     * @param sampleRate
     * @return This {@link CallsWebsocketEndpointConfigRequest instance}.
     */
    public CallsWebsocketEndpointConfigRequest sampleRate(SampleRateEnum sampleRate) {
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
    public SampleRateEnum getSampleRate() {
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
    public void setSampleRate(SampleRateEnum sampleRate) {
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
        CallsWebsocketEndpointConfigRequest callsWebsocketEndpointConfigRequest =
                (CallsWebsocketEndpointConfigRequest) o;
        return Objects.equals(this.sampleRate, callsWebsocketEndpointConfigRequest.sampleRate) && super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sampleRate, super.hashCode());
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class CallsWebsocketEndpointConfigRequest {")
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
