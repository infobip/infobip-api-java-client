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
 * Represents CallsMediaStreamFinishedEvent model.
 */
public class CallsMediaStreamFinishedEvent extends CallsEvent {

    private CallsMediaStreamFinishedProperties properties;

    /**
     * Constructs a new {@link CallsMediaStreamFinishedEvent} instance.
     */
    public CallsMediaStreamFinishedEvent() {
        super("MEDIA_STREAM_FINISHED");
    }

    /**
     * Sets properties.
     *
     * @param properties
     * @return This {@link CallsMediaStreamFinishedEvent instance}.
     */
    public CallsMediaStreamFinishedEvent properties(CallsMediaStreamFinishedProperties properties) {
        this.properties = properties;
        return this;
    }

    /**
     * Returns properties.
     *
     * @return properties
     */
    @JsonProperty("properties")
    public CallsMediaStreamFinishedProperties getProperties() {
        return properties;
    }

    /**
     * Sets properties.
     *
     * @param properties
     */
    @JsonProperty("properties")
    public void setProperties(CallsMediaStreamFinishedProperties properties) {
        this.properties = properties;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CallsMediaStreamFinishedEvent callsMediaStreamFinishedEvent = (CallsMediaStreamFinishedEvent) o;
        return Objects.equals(this.properties, callsMediaStreamFinishedEvent.properties) && super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(properties, super.hashCode());
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class CallsMediaStreamFinishedEvent {")
                .append(newLine)
                .append("    ")
                .append(toIndentedString(super.toString()))
                .append(newLine)
                .append("    properties: ")
                .append(toIndentedString(properties))
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
