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
 * Represents CallStartedEvent model.
 */
public class CallStartedEvent extends CallsEvent {

    private CallProperties properties;

    private CallsRetryProperties retryProperties;

    /**
     * Constructs a new {@link CallStartedEvent} instance.
     */
    public CallStartedEvent() {
        super("CALL_STARTED");
    }

    /**
     * Sets properties.
     *
     * @param properties
     * @return This {@link CallStartedEvent instance}.
     */
    public CallStartedEvent properties(CallProperties properties) {
        this.properties = properties;
        return this;
    }

    /**
     * Returns properties.
     *
     * @return properties
     */
    @JsonProperty("properties")
    public CallProperties getProperties() {
        return properties;
    }

    /**
     * Sets properties.
     *
     * @param properties
     */
    @JsonProperty("properties")
    public void setProperties(CallProperties properties) {
        this.properties = properties;
    }

    /**
     * Sets retryProperties.
     *
     * @param retryProperties
     * @return This {@link CallStartedEvent instance}.
     */
    public CallStartedEvent retryProperties(CallsRetryProperties retryProperties) {
        this.retryProperties = retryProperties;
        return this;
    }

    /**
     * Returns retryProperties.
     *
     * @return retryProperties
     */
    @JsonProperty("retryProperties")
    public CallsRetryProperties getRetryProperties() {
        return retryProperties;
    }

    /**
     * Sets retryProperties.
     *
     * @param retryProperties
     */
    @JsonProperty("retryProperties")
    public void setRetryProperties(CallsRetryProperties retryProperties) {
        this.retryProperties = retryProperties;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CallStartedEvent callStartedEvent = (CallStartedEvent) o;
        return Objects.equals(this.properties, callStartedEvent.properties)
                && Objects.equals(this.retryProperties, callStartedEvent.retryProperties)
                && super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(properties, retryProperties, super.hashCode());
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class CallStartedEvent {")
                .append(newLine)
                .append("    ")
                .append(toIndentedString(super.toString()))
                .append(newLine)
                .append("    properties: ")
                .append(toIndentedString(properties))
                .append(newLine)
                .append("    retryProperties: ")
                .append(toIndentedString(retryProperties))
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
