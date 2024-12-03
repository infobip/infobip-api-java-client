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
import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * Represents CallRoutingUrlDestinationHttpRequest model.
 */
public class CallRoutingUrlDestinationHttpRequest {

    private String applicationId;

    private String routeId;

    private String callId;

    private String from;

    private String to;

    private OffsetDateTime startTime;

    /**
     * Sets applicationId.
     * <p>
     * Field description:
     * Identifier of the application that originated the call.
     *
     * @param applicationId
     * @return This {@link CallRoutingUrlDestinationHttpRequest instance}.
     */
    public CallRoutingUrlDestinationHttpRequest applicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }

    /**
     * Returns applicationId.
     * <p>
     * Field description:
     * Identifier of the application that originated the call.
     *
     * @return applicationId
     */
    @JsonProperty("applicationId")
    public String getApplicationId() {
        return applicationId;
    }

    /**
     * Sets applicationId.
     * <p>
     * Field description:
     * Identifier of the application that originated the call.
     *
     * @param applicationId
     */
    @JsonProperty("applicationId")
    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    /**
     * Sets routeId.
     * <p>
     * Field description:
     * Identifier of the route that is used to process the call.
     *
     * @param routeId
     * @return This {@link CallRoutingUrlDestinationHttpRequest instance}.
     */
    public CallRoutingUrlDestinationHttpRequest routeId(String routeId) {
        this.routeId = routeId;
        return this;
    }

    /**
     * Returns routeId.
     * <p>
     * Field description:
     * Identifier of the route that is used to process the call.
     *
     * @return routeId
     */
    @JsonProperty("routeId")
    public String getRouteId() {
        return routeId;
    }

    /**
     * Sets routeId.
     * <p>
     * Field description:
     * Identifier of the route that is used to process the call.
     *
     * @param routeId
     */
    @JsonProperty("routeId")
    public void setRouteId(String routeId) {
        this.routeId = routeId;
    }

    /**
     * Sets callId.
     * <p>
     * Field description:
     * Identifier of the call that is being processed.
     *
     * @param callId
     * @return This {@link CallRoutingUrlDestinationHttpRequest instance}.
     */
    public CallRoutingUrlDestinationHttpRequest callId(String callId) {
        this.callId = callId;
        return this;
    }

    /**
     * Returns callId.
     * <p>
     * Field description:
     * Identifier of the call that is being processed.
     *
     * @return callId
     */
    @JsonProperty("callId")
    public String getCallId() {
        return callId;
    }

    /**
     * Sets callId.
     * <p>
     * Field description:
     * Identifier of the call that is being processed.
     *
     * @param callId
     */
    @JsonProperty("callId")
    public void setCallId(String callId) {
        this.callId = callId;
    }

    /**
     * Sets from.
     * <p>
     * Field description:
     * Phone number from which the call originated from.
     *
     * @param from
     * @return This {@link CallRoutingUrlDestinationHttpRequest instance}.
     */
    public CallRoutingUrlDestinationHttpRequest from(String from) {
        this.from = from;
        return this;
    }

    /**
     * Returns from.
     * <p>
     * Field description:
     * Phone number from which the call originated from.
     *
     * @return from
     */
    @JsonProperty("from")
    public String getFrom() {
        return from;
    }

    /**
     * Sets from.
     * <p>
     * Field description:
     * Phone number from which the call originated from.
     *
     * @param from
     */
    @JsonProperty("from")
    public void setFrom(String from) {
        this.from = from;
    }

    /**
     * Sets to.
     * <p>
     * Field description:
     * Destination phone number of the call.
     *
     * @param to
     * @return This {@link CallRoutingUrlDestinationHttpRequest instance}.
     */
    public CallRoutingUrlDestinationHttpRequest to(String to) {
        this.to = to;
        return this;
    }

    /**
     * Returns to.
     * <p>
     * Field description:
     * Destination phone number of the call.
     *
     * @return to
     */
    @JsonProperty("to")
    public String getTo() {
        return to;
    }

    /**
     * Sets to.
     * <p>
     * Field description:
     * Destination phone number of the call.
     *
     * @param to
     */
    @JsonProperty("to")
    public void setTo(String to) {
        this.to = to;
    }

    /**
     * Sets startTime.
     * <p>
     * Field description:
     * Timestamp representing start time of the call.
     *
     * @param startTime
     * @return This {@link CallRoutingUrlDestinationHttpRequest instance}.
     */
    public CallRoutingUrlDestinationHttpRequest startTime(OffsetDateTime startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * Returns startTime.
     * <p>
     * Field description:
     * Timestamp representing start time of the call.
     *
     * @return startTime
     */
    @JsonProperty("startTime")
    public OffsetDateTime getStartTime() {
        return startTime;
    }

    /**
     * Sets startTime.
     * <p>
     * Field description:
     * Timestamp representing start time of the call.
     *
     * @param startTime
     */
    @JsonProperty("startTime")
    public void setStartTime(OffsetDateTime startTime) {
        this.startTime = startTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CallRoutingUrlDestinationHttpRequest callRoutingUrlDestinationHttpRequest =
                (CallRoutingUrlDestinationHttpRequest) o;
        return Objects.equals(this.applicationId, callRoutingUrlDestinationHttpRequest.applicationId)
                && Objects.equals(this.routeId, callRoutingUrlDestinationHttpRequest.routeId)
                && Objects.equals(this.callId, callRoutingUrlDestinationHttpRequest.callId)
                && Objects.equals(this.from, callRoutingUrlDestinationHttpRequest.from)
                && Objects.equals(this.to, callRoutingUrlDestinationHttpRequest.to)
                && Objects.equals(this.startTime, callRoutingUrlDestinationHttpRequest.startTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(applicationId, routeId, callId, from, to, startTime);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class CallRoutingUrlDestinationHttpRequest {")
                .append(newLine)
                .append("    applicationId: ")
                .append(toIndentedString(applicationId))
                .append(newLine)
                .append("    routeId: ")
                .append(toIndentedString(routeId))
                .append(newLine)
                .append("    callId: ")
                .append(toIndentedString(callId))
                .append(newLine)
                .append("    from: ")
                .append(toIndentedString(from))
                .append(newLine)
                .append("    to: ")
                .append(toIndentedString(to))
                .append(newLine)
                .append("    startTime: ")
                .append(toIndentedString(startTime))
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
