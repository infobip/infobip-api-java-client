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
 * Incoming messages
 */
@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.EXISTING_PROPERTY,
        property = "event",
        visible = true)
@JsonSubTypes({
    @JsonSubTypes.Type(value = MessagesApiWebhookEvent.class, name = "MO"),
    @JsonSubTypes.Type(value = MessagesApiInboundTypingStartedEvent.class, name = "TYPING_STARTED"),
    @JsonSubTypes.Type(value = MessagesApiInboundTypingStoppedEvent.class, name = "TYPING_STOPPED"),
})
public abstract class MessagesApiInboundEvent {

    protected final MessagesApiInboundEventType event;

    /**
     * Constructs a new {@link MessagesApiInboundEvent} instance.
     */
    public MessagesApiInboundEvent(String event) {
        this.event = MessagesApiInboundEventType.fromValue(event);
    }

    /**
     * Returns event.
     * <p>
     * The field is required.
     *
     * @return event
     */
    @JsonProperty("event")
    public MessagesApiInboundEventType getEvent() {
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
        MessagesApiInboundEvent messagesApiInboundEvent = (MessagesApiInboundEvent) o;
        return Objects.equals(this.event, messagesApiInboundEvent.event);
    }

    @Override
    public int hashCode() {
        return Objects.hash(event);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class MessagesApiInboundEvent {")
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
