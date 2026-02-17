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
 * Represents CallRoutingCallRoutingApplication model.
 */
public class CallRoutingCallRoutingApplication extends CallRoutingRecordingApplication {

    private String routeId;

    private String routeName;

    private String correlationId;

    private OffsetDateTime startTime;

    private OffsetDateTime endTime;

    /**
     * Constructs a new {@link CallRoutingCallRoutingApplication} instance.
     */
    public CallRoutingCallRoutingApplication() {
        super("CALL_ROUTING");
    }

    /**
     * Sets routeId.
     * <p>
     * Field description:
     * Route identifier.
     *
     * @param routeId
     * @return This {@link CallRoutingCallRoutingApplication instance}.
     */
    public CallRoutingCallRoutingApplication routeId(String routeId) {
        this.routeId = routeId;
        return this;
    }

    /**
     * Returns routeId.
     * <p>
     * Field description:
     * Route identifier.
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
     * Route identifier.
     *
     * @param routeId
     */
    @JsonProperty("routeId")
    public void setRouteId(String routeId) {
        this.routeId = routeId;
    }

    /**
     * Sets routeName.
     * <p>
     * Field description:
     * Route name.
     *
     * @param routeName
     * @return This {@link CallRoutingCallRoutingApplication instance}.
     */
    public CallRoutingCallRoutingApplication routeName(String routeName) {
        this.routeName = routeName;
        return this;
    }

    /**
     * Returns routeName.
     * <p>
     * Field description:
     * Route name.
     *
     * @return routeName
     */
    @JsonProperty("routeName")
    public String getRouteName() {
        return routeName;
    }

    /**
     * Sets routeName.
     * <p>
     * Field description:
     * Route name.
     *
     * @param routeName
     */
    @JsonProperty("routeName")
    public void setRouteName(String routeName) {
        this.routeName = routeName;
    }

    /**
     * Sets correlationId.
     * <p>
     * Field description:
     * Unique identifier for a call routing recording call.
     * <p>
     * The field is required.
     *
     * @param correlationId
     * @return This {@link CallRoutingCallRoutingApplication instance}.
     */
    public CallRoutingCallRoutingApplication correlationId(String correlationId) {
        this.correlationId = correlationId;
        return this;
    }

    /**
     * Returns correlationId.
     * <p>
     * Field description:
     * Unique identifier for a call routing recording call.
     * <p>
     * The field is required.
     *
     * @return correlationId
     */
    @JsonProperty("correlationId")
    public String getCorrelationId() {
        return correlationId;
    }

    /**
     * Sets correlationId.
     * <p>
     * Field description:
     * Unique identifier for a call routing recording call.
     * <p>
     * The field is required.
     *
     * @param correlationId
     */
    @JsonProperty("correlationId")
    public void setCorrelationId(String correlationId) {
        this.correlationId = correlationId;
    }

    /**
     * Sets startTime.
     * <p>
     * Field description:
     * Start time of the call.
     *
     * @param startTime
     * @return This {@link CallRoutingCallRoutingApplication instance}.
     */
    public CallRoutingCallRoutingApplication startTime(OffsetDateTime startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * Returns startTime.
     * <p>
     * Field description:
     * Start time of the call.
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
     * Start time of the call.
     *
     * @param startTime
     */
    @JsonProperty("startTime")
    public void setStartTime(OffsetDateTime startTime) {
        this.startTime = startTime;
    }

    /**
     * Sets endTime.
     * <p>
     * Field description:
     * End time of the call.
     *
     * @param endTime
     * @return This {@link CallRoutingCallRoutingApplication instance}.
     */
    public CallRoutingCallRoutingApplication endTime(OffsetDateTime endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * Returns endTime.
     * <p>
     * Field description:
     * End time of the call.
     *
     * @return endTime
     */
    @JsonProperty("endTime")
    public OffsetDateTime getEndTime() {
        return endTime;
    }

    /**
     * Sets endTime.
     * <p>
     * Field description:
     * End time of the call.
     *
     * @param endTime
     */
    @JsonProperty("endTime")
    public void setEndTime(OffsetDateTime endTime) {
        this.endTime = endTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CallRoutingCallRoutingApplication callRoutingCallRoutingApplication = (CallRoutingCallRoutingApplication) o;
        return Objects.equals(this.routeId, callRoutingCallRoutingApplication.routeId)
                && Objects.equals(this.routeName, callRoutingCallRoutingApplication.routeName)
                && Objects.equals(this.correlationId, callRoutingCallRoutingApplication.correlationId)
                && Objects.equals(this.startTime, callRoutingCallRoutingApplication.startTime)
                && Objects.equals(this.endTime, callRoutingCallRoutingApplication.endTime)
                && super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(routeId, routeName, correlationId, startTime, endTime, super.hashCode());
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class CallRoutingCallRoutingApplication {")
                .append(newLine)
                .append("    ")
                .append(toIndentedString(super.toString()))
                .append(newLine)
                .append("    routeId: ")
                .append(toIndentedString(routeId))
                .append(newLine)
                .append("    routeName: ")
                .append(toIndentedString(routeName))
                .append(newLine)
                .append("    correlationId: ")
                .append(toIndentedString(correlationId))
                .append(newLine)
                .append("    startTime: ")
                .append(toIndentedString(startTime))
                .append(newLine)
                .append("    endTime: ")
                .append(toIndentedString(endTime))
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
