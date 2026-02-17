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
 * Represents RcsIsTypingEvents model.
 */
public class RcsIsTypingEvents {

    private List<RcsIsTypingEvent> results = new ArrayList<>();

    private Integer eventCount;

    private Integer pendingEventCount;

    /**
     * Sets results.
     * <p>
     * Field description:
     * Collection of typing indicator events.
     * <p>
     * The field is required.
     *
     * @param results
     * @return This {@link RcsIsTypingEvents instance}.
     */
    public RcsIsTypingEvents results(List<RcsIsTypingEvent> results) {
        this.results = results;
        return this;
    }

    /**
     * Adds and item into results.
     * <p>
     * Field description:
     * Collection of typing indicator events.
     * <p>
     * The field is required.
     *
     * @param resultsItem The item to be added to the list.
     * @return This {@link RcsIsTypingEvents instance}.
     */
    public RcsIsTypingEvents addResultsItem(RcsIsTypingEvent resultsItem) {
        if (this.results == null) {
            this.results = new ArrayList<>();
        }
        this.results.add(resultsItem);
        return this;
    }

    /**
     * Returns results.
     * <p>
     * Field description:
     * Collection of typing indicator events.
     * <p>
     * The field is required.
     *
     * @return results
     */
    @JsonProperty("results")
    public List<RcsIsTypingEvent> getResults() {
        return results;
    }

    /**
     * Sets results.
     * <p>
     * Field description:
     * Collection of typing indicator events.
     * <p>
     * The field is required.
     *
     * @param results
     */
    @JsonProperty("results")
    public void setResults(List<RcsIsTypingEvent> results) {
        this.results = results;
    }

    /**
     * Sets eventCount.
     * <p>
     * Field description:
     * The number of events returned in the results array.
     * <p>
     * The field is required.
     *
     * @param eventCount
     * @return This {@link RcsIsTypingEvents instance}.
     */
    public RcsIsTypingEvents eventCount(Integer eventCount) {
        this.eventCount = eventCount;
        return this;
    }

    /**
     * Returns eventCount.
     * <p>
     * Field description:
     * The number of events returned in the results array.
     * <p>
     * The field is required.
     *
     * @return eventCount
     */
    @JsonProperty("eventCount")
    public Integer getEventCount() {
        return eventCount;
    }

    /**
     * Sets eventCount.
     * <p>
     * Field description:
     * The number of events returned in the results array.
     * <p>
     * The field is required.
     *
     * @param eventCount
     */
    @JsonProperty("eventCount")
    public void setEventCount(Integer eventCount) {
        this.eventCount = eventCount;
    }

    /**
     * Sets pendingEventCount.
     * <p>
     * Field description:
     * The number of events that have not been pulled in.
     * <p>
     * The field is required.
     *
     * @param pendingEventCount
     * @return This {@link RcsIsTypingEvents instance}.
     */
    public RcsIsTypingEvents pendingEventCount(Integer pendingEventCount) {
        this.pendingEventCount = pendingEventCount;
        return this;
    }

    /**
     * Returns pendingEventCount.
     * <p>
     * Field description:
     * The number of events that have not been pulled in.
     * <p>
     * The field is required.
     *
     * @return pendingEventCount
     */
    @JsonProperty("pendingEventCount")
    public Integer getPendingEventCount() {
        return pendingEventCount;
    }

    /**
     * Sets pendingEventCount.
     * <p>
     * Field description:
     * The number of events that have not been pulled in.
     * <p>
     * The field is required.
     *
     * @param pendingEventCount
     */
    @JsonProperty("pendingEventCount")
    public void setPendingEventCount(Integer pendingEventCount) {
        this.pendingEventCount = pendingEventCount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RcsIsTypingEvents rcsIsTypingEvents = (RcsIsTypingEvents) o;
        return Objects.equals(this.results, rcsIsTypingEvents.results)
                && Objects.equals(this.eventCount, rcsIsTypingEvents.eventCount)
                && Objects.equals(this.pendingEventCount, rcsIsTypingEvents.pendingEventCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(results, eventCount, pendingEventCount);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class RcsIsTypingEvents {")
                .append(newLine)
                .append("    results: ")
                .append(toIndentedString(results))
                .append(newLine)
                .append("    eventCount: ")
                .append(toIndentedString(eventCount))
                .append(newLine)
                .append("    pendingEventCount: ")
                .append(toIndentedString(pendingEventCount))
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
