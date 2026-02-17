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
 * Represents CallsConferenceCompositionFinishedEvent model.
 */
public class CallsConferenceCompositionFinishedEvent extends CallsEvent {

    private CallsConferenceCompositionFinishedProperties properties;

    /**
     * Constructs a new {@link CallsConferenceCompositionFinishedEvent} instance.
     */
    public CallsConferenceCompositionFinishedEvent() {
        super("CONFERENCE_COMPOSITION_FINISHED");
    }

    /**
     * Sets properties.
     *
     * @param properties
     * @return This {@link CallsConferenceCompositionFinishedEvent instance}.
     */
    public CallsConferenceCompositionFinishedEvent properties(CallsConferenceCompositionFinishedProperties properties) {
        this.properties = properties;
        return this;
    }

    /**
     * Returns properties.
     *
     * @return properties
     */
    @JsonProperty("properties")
    public CallsConferenceCompositionFinishedProperties getProperties() {
        return properties;
    }

    /**
     * Sets properties.
     *
     * @param properties
     */
    @JsonProperty("properties")
    public void setProperties(CallsConferenceCompositionFinishedProperties properties) {
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
        CallsConferenceCompositionFinishedEvent callsConferenceCompositionFinishedEvent =
                (CallsConferenceCompositionFinishedEvent) o;
        return Objects.equals(this.properties, callsConferenceCompositionFinishedEvent.properties) && super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(properties, super.hashCode());
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class CallsConferenceCompositionFinishedEvent {")
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
