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
public class MessagesApiRequestOptions {

    private MessagesApiRequestScheduleOptions schedule;

    /**
     * Sets schedule.
     *
     * @param schedule
     * @return This {@link MessagesApiRequestOptions instance}.
     */
    public MessagesApiRequestOptions schedule(MessagesApiRequestScheduleOptions schedule) {
        this.schedule = schedule;
        return this;
    }

    /**
     * Returns schedule.
     *
     * @return schedule
     */
    @JsonProperty("schedule")
    public MessagesApiRequestScheduleOptions getSchedule() {
        return schedule;
    }

    /**
     * Sets schedule.
     *
     * @param schedule
     */
    @JsonProperty("schedule")
    public void setSchedule(MessagesApiRequestScheduleOptions schedule) {
        this.schedule = schedule;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MessagesApiRequestOptions messagesApiRequestOptions = (MessagesApiRequestOptions) o;
        return Objects.equals(this.schedule, messagesApiRequestOptions.schedule);
    }

    @Override
    public int hashCode() {
        return Objects.hash(schedule);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class MessagesApiRequestOptions {")
                .append(newLine)
                .append("    schedule: ")
                .append(toIndentedString(schedule))
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
