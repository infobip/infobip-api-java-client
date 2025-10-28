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
 * Options applicable to all messages in the request.
 */
public class MessagesApiDefaultMessageRequestOptions {

    private MessagesApiRequestSchedulingSettings schedule;

    private UrlOptions tracking;

    private MessagesApiMessageOrderingOptions messageOrdering;

    /**
     * Sets schedule.
     *
     * @param schedule
     * @return This {@link MessagesApiDefaultMessageRequestOptions instance}.
     */
    public MessagesApiDefaultMessageRequestOptions schedule(MessagesApiRequestSchedulingSettings schedule) {
        this.schedule = schedule;
        return this;
    }

    /**
     * Returns schedule.
     *
     * @return schedule
     */
    @JsonProperty("schedule")
    public MessagesApiRequestSchedulingSettings getSchedule() {
        return schedule;
    }

    /**
     * Sets schedule.
     *
     * @param schedule
     */
    @JsonProperty("schedule")
    public void setSchedule(MessagesApiRequestSchedulingSettings schedule) {
        this.schedule = schedule;
    }

    /**
     * Sets tracking.
     *
     * @param tracking
     * @return This {@link MessagesApiDefaultMessageRequestOptions instance}.
     */
    public MessagesApiDefaultMessageRequestOptions tracking(UrlOptions tracking) {
        this.tracking = tracking;
        return this;
    }

    /**
     * Returns tracking.
     *
     * @return tracking
     */
    @JsonProperty("tracking")
    public UrlOptions getTracking() {
        return tracking;
    }

    /**
     * Sets tracking.
     *
     * @param tracking
     */
    @JsonProperty("tracking")
    public void setTracking(UrlOptions tracking) {
        this.tracking = tracking;
    }

    /**
     * Sets messageOrdering.
     *
     * @param messageOrdering
     * @return This {@link MessagesApiDefaultMessageRequestOptions instance}.
     */
    public MessagesApiDefaultMessageRequestOptions messageOrdering(MessagesApiMessageOrderingOptions messageOrdering) {
        this.messageOrdering = messageOrdering;
        return this;
    }

    /**
     * Returns messageOrdering.
     *
     * @return messageOrdering
     */
    @JsonProperty("messageOrdering")
    public MessagesApiMessageOrderingOptions getMessageOrdering() {
        return messageOrdering;
    }

    /**
     * Sets messageOrdering.
     *
     * @param messageOrdering
     */
    @JsonProperty("messageOrdering")
    public void setMessageOrdering(MessagesApiMessageOrderingOptions messageOrdering) {
        this.messageOrdering = messageOrdering;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MessagesApiDefaultMessageRequestOptions messagesApiDefaultMessageRequestOptions =
                (MessagesApiDefaultMessageRequestOptions) o;
        return Objects.equals(this.schedule, messagesApiDefaultMessageRequestOptions.schedule)
                && Objects.equals(this.tracking, messagesApiDefaultMessageRequestOptions.tracking)
                && Objects.equals(this.messageOrdering, messagesApiDefaultMessageRequestOptions.messageOrdering);
    }

    @Override
    public int hashCode() {
        return Objects.hash(schedule, tracking, messageOrdering);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class MessagesApiDefaultMessageRequestOptions {")
                .append(newLine)
                .append("    schedule: ")
                .append(toIndentedString(schedule))
                .append(newLine)
                .append("    tracking: ")
                .append(toIndentedString(tracking))
                .append(newLine)
                .append("    messageOrdering: ")
                .append(toIndentedString(messageOrdering))
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
