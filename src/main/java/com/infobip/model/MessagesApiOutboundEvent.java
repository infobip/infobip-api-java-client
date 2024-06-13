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
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.util.Objects;

/**
 * Array of event objects of a single event or multiple events sent
 */
@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.EXISTING_PROPERTY,
        property = "event",
        visible = true)
@JsonSubTypes({
    @JsonSubTypes.Type(value = MessagesApiOutboundTypingStartedEvent.class, name = "TYPING_STARTED"),
    @JsonSubTypes.Type(value = MessagesApiOutboundTypingStoppedEvent.class, name = "TYPING_STOPPED"),
})
public abstract class MessagesApiOutboundEvent {

    protected final MessagesApiOutboundEventType event;

    /**
     * Constructs a new {@link MessagesApiOutboundEvent} instance.
     */
    public MessagesApiOutboundEvent(String event) {
        this.event = MessagesApiOutboundEventType.fromValue(event);
    }

    /**
     * Returns event.
     * <p>
     * The field is required.
     *
     * @return event
     */
    @JsonProperty("event")
    public MessagesApiOutboundEventType getEvent() {
        return event;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MessagesApiOutboundEvent messagesApiOutboundEvent = (MessagesApiOutboundEvent) o;
        return Objects.equals(this.event, messagesApiOutboundEvent.event);
    }

    @Override
    public int hashCode() {
        return Objects.hash(event);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class MessagesApiOutboundEvent {")
                .append(newLine)
                .append("    event: ")
                .append(toIndentedString(event))
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
