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
public class EmailMessageRequestOptions {

    private EmailRequestSchedulingSettings schedule;

    private EmailUrlOptions tracking;

    private EmailClientPriority clientPriority;

    /**
     * Sets schedule.
     *
     * @param schedule
     * @return This {@link EmailMessageRequestOptions instance}.
     */
    public EmailMessageRequestOptions schedule(EmailRequestSchedulingSettings schedule) {
        this.schedule = schedule;
        return this;
    }

    /**
     * Returns schedule.
     *
     * @return schedule
     */
    @JsonProperty("schedule")
    public EmailRequestSchedulingSettings getSchedule() {
        return schedule;
    }

    /**
     * Sets schedule.
     *
     * @param schedule
     */
    @JsonProperty("schedule")
    public void setSchedule(EmailRequestSchedulingSettings schedule) {
        this.schedule = schedule;
    }

    /**
     * Sets tracking.
     *
     * @param tracking
     * @return This {@link EmailMessageRequestOptions instance}.
     */
    public EmailMessageRequestOptions tracking(EmailUrlOptions tracking) {
        this.tracking = tracking;
        return this;
    }

    /**
     * Returns tracking.
     *
     * @return tracking
     */
    @JsonProperty("tracking")
    public EmailUrlOptions getTracking() {
        return tracking;
    }

    /**
     * Sets tracking.
     *
     * @param tracking
     */
    @JsonProperty("tracking")
    public void setTracking(EmailUrlOptions tracking) {
        this.tracking = tracking;
    }

    /**
     * Sets clientPriority.
     *
     * @param clientPriority
     * @return This {@link EmailMessageRequestOptions instance}.
     */
    public EmailMessageRequestOptions clientPriority(EmailClientPriority clientPriority) {
        this.clientPriority = clientPriority;
        return this;
    }

    /**
     * Returns clientPriority.
     *
     * @return clientPriority
     */
    @JsonProperty("clientPriority")
    public EmailClientPriority getClientPriority() {
        return clientPriority;
    }

    /**
     * Sets clientPriority.
     *
     * @param clientPriority
     */
    @JsonProperty("clientPriority")
    public void setClientPriority(EmailClientPriority clientPriority) {
        this.clientPriority = clientPriority;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        EmailMessageRequestOptions emailMessageRequestOptions = (EmailMessageRequestOptions) o;
        return Objects.equals(this.schedule, emailMessageRequestOptions.schedule)
                && Objects.equals(this.tracking, emailMessageRequestOptions.tracking)
                && Objects.equals(this.clientPriority, emailMessageRequestOptions.clientPriority);
    }

    @Override
    public int hashCode() {
        return Objects.hash(schedule, tracking, clientPriority);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class EmailMessageRequestOptions {")
                .append(newLine)
                .append("    schedule: ")
                .append(toIndentedString(schedule))
                .append(newLine)
                .append("    tracking: ")
                .append(toIndentedString(tracking))
                .append(newLine)
                .append("    clientPriority: ")
                .append(toIndentedString(clientPriority))
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
