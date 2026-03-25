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
 * Represents WhatsAppEventRequest model.
 */
public class WhatsAppEventRequest {

    private List<WhatsAppEvent> events = new ArrayList<>();

    private WhatsAppDefaultEventRequestOptions options;

    /**
     * Sets events.
     * <p>
     * Field description:
     * An array of event objects of the events to be sent.
     * <p>
     * The field is required.
     *
     * @param events
     * @return This {@link WhatsAppEventRequest instance}.
     */
    public WhatsAppEventRequest events(List<WhatsAppEvent> events) {
        this.events = events;
        return this;
    }

    /**
     * Adds and item into events.
     * <p>
     * Field description:
     * An array of event objects of the events to be sent.
     * <p>
     * The field is required.
     *
     * @param eventsItem The item to be added to the list.
     * @return This {@link WhatsAppEventRequest instance}.
     */
    public WhatsAppEventRequest addEventsItem(WhatsAppEvent eventsItem) {
        if (this.events == null) {
            this.events = new ArrayList<>();
        }
        this.events.add(eventsItem);
        return this;
    }

    /**
     * Returns events.
     * <p>
     * Field description:
     * An array of event objects of the events to be sent.
     * <p>
     * The field is required.
     *
     * @return events
     */
    @JsonProperty("events")
    public List<WhatsAppEvent> getEvents() {
        return events;
    }

    /**
     * Sets events.
     * <p>
     * Field description:
     * An array of event objects of the events to be sent.
     * <p>
     * The field is required.
     *
     * @param events
     */
    @JsonProperty("events")
    public void setEvents(List<WhatsAppEvent> events) {
        this.events = events;
    }

    /**
     * Sets options.
     *
     * @param options
     * @return This {@link WhatsAppEventRequest instance}.
     */
    public WhatsAppEventRequest options(WhatsAppDefaultEventRequestOptions options) {
        this.options = options;
        return this;
    }

    /**
     * Returns options.
     *
     * @return options
     */
    @JsonProperty("options")
    public WhatsAppDefaultEventRequestOptions getOptions() {
        return options;
    }

    /**
     * Sets options.
     *
     * @param options
     */
    @JsonProperty("options")
    public void setOptions(WhatsAppDefaultEventRequestOptions options) {
        this.options = options;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WhatsAppEventRequest whatsAppEventRequest = (WhatsAppEventRequest) o;
        return Objects.equals(this.events, whatsAppEventRequest.events)
                && Objects.equals(this.options, whatsAppEventRequest.options);
    }

    @Override
    public int hashCode() {
        return Objects.hash(events, options);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class WhatsAppEventRequest {")
                .append(newLine)
                .append("    events: ")
                .append(toIndentedString(events))
                .append(newLine)
                .append("    options: ")
                .append(toIndentedString(options))
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
