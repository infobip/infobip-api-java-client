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
 * Represents MessagesApiEventRequest model.
 */
public class MessagesApiEventRequest {

    private List<MessagesApiOutboundEvent> events = new ArrayList<>();

    /**
     * Sets events.
     * <p>
     * Field description:
     * Array of event objects of a single event or multiple events sent
     * <p>
     * The field is required.
     *
     * @param events
     * @return This {@link MessagesApiEventRequest instance}.
     */
    public MessagesApiEventRequest events(List<MessagesApiOutboundEvent> events) {
        this.events = events;
        return this;
    }

    /**
     * Adds and item into events.
     * <p>
     * Field description:
     * Array of event objects of a single event or multiple events sent
     * <p>
     * The field is required.
     *
     * @param eventsItem The item to be added to the list.
     * @return This {@link MessagesApiEventRequest instance}.
     */
    public MessagesApiEventRequest addEventsItem(MessagesApiOutboundEvent eventsItem) {
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
     * Array of event objects of a single event or multiple events sent
     * <p>
     * The field is required.
     *
     * @return events
     */
    @JsonProperty("events")
    public List<MessagesApiOutboundEvent> getEvents() {
        return events;
    }

    /**
     * Sets events.
     * <p>
     * Field description:
     * Array of event objects of a single event or multiple events sent
     * <p>
     * The field is required.
     *
     * @param events
     */
    @JsonProperty("events")
    public void setEvents(List<MessagesApiOutboundEvent> events) {
        this.events = events;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MessagesApiEventRequest messagesApiEventRequest = (MessagesApiEventRequest) o;
        return Objects.equals(this.events, messagesApiEventRequest.events);
    }

    @Override
    public int hashCode() {
        return Objects.hash(events);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class MessagesApiEventRequest {")
                .append(newLine)
                .append("    events: ")
                .append(toIndentedString(events))
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
