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
 * Represents CallsDialogResponse model.
 */
public class CallsDialogResponse {

    private String id;

    private String applicationId;

    private CallsDialogState state;

    private OffsetDateTime startTime;

    private OffsetDateTime establishTime;

    private OffsetDateTime endTime;

    private Call parentCall;

    private Call childCall;

    /**
     * Sets id.
     * <p>
     * Field description:
     * Unique dialog ID.
     *
     * @param id
     * @return This {@link CallsDialogResponse instance}.
     */
    public CallsDialogResponse id(String id) {
        this.id = id;
        return this;
    }

    /**
     * Returns id.
     * <p>
     * Field description:
     * Unique dialog ID.
     *
     * @return id
     */
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    /**
     * Sets id.
     * <p>
     * Field description:
     * Unique dialog ID.
     *
     * @param id
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Sets applicationId.
     * <p>
     * Field description:
     * Application ID.
     *
     * @param applicationId
     * @return This {@link CallsDialogResponse instance}.
     */
    public CallsDialogResponse applicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }

    /**
     * Returns applicationId.
     * <p>
     * Field description:
     * Application ID.
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
     * Application ID.
     *
     * @param applicationId
     */
    @JsonProperty("applicationId")
    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    /**
     * Sets state.
     *
     * @param state
     * @return This {@link CallsDialogResponse instance}.
     */
    public CallsDialogResponse state(CallsDialogState state) {
        this.state = state;
        return this;
    }

    /**
     * Returns state.
     *
     * @return state
     */
    @JsonProperty("state")
    public CallsDialogState getState() {
        return state;
    }

    /**
     * Sets state.
     *
     * @param state
     */
    @JsonProperty("state")
    public void setState(CallsDialogState state) {
        this.state = state;
    }

    /**
     * Sets startTime.
     * <p>
     * Field description:
     * Date and time for when the dialog has been created.
     *
     * @param startTime
     * @return This {@link CallsDialogResponse instance}.
     */
    public CallsDialogResponse startTime(OffsetDateTime startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * Returns startTime.
     * <p>
     * Field description:
     * Date and time for when the dialog has been created.
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
     * Date and time for when the dialog has been created.
     *
     * @param startTime
     */
    @JsonProperty("startTime")
    public void setStartTime(OffsetDateTime startTime) {
        this.startTime = startTime;
    }

    /**
     * Sets establishTime.
     * <p>
     * Field description:
     * Date and time for when the dialog has been established.
     *
     * @param establishTime
     * @return This {@link CallsDialogResponse instance}.
     */
    public CallsDialogResponse establishTime(OffsetDateTime establishTime) {
        this.establishTime = establishTime;
        return this;
    }

    /**
     * Returns establishTime.
     * <p>
     * Field description:
     * Date and time for when the dialog has been established.
     *
     * @return establishTime
     */
    @JsonProperty("establishTime")
    public OffsetDateTime getEstablishTime() {
        return establishTime;
    }

    /**
     * Sets establishTime.
     * <p>
     * Field description:
     * Date and time for when the dialog has been established.
     *
     * @param establishTime
     */
    @JsonProperty("establishTime")
    public void setEstablishTime(OffsetDateTime establishTime) {
        this.establishTime = establishTime;
    }

    /**
     * Sets endTime.
     * <p>
     * Field description:
     * Date and time for when the dialog has been finished.
     *
     * @param endTime
     * @return This {@link CallsDialogResponse instance}.
     */
    public CallsDialogResponse endTime(OffsetDateTime endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * Returns endTime.
     * <p>
     * Field description:
     * Date and time for when the dialog has been finished.
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
     * Date and time for when the dialog has been finished.
     *
     * @param endTime
     */
    @JsonProperty("endTime")
    public void setEndTime(OffsetDateTime endTime) {
        this.endTime = endTime;
    }

    /**
     * Sets parentCall.
     *
     * @param parentCall
     * @return This {@link CallsDialogResponse instance}.
     */
    public CallsDialogResponse parentCall(Call parentCall) {
        this.parentCall = parentCall;
        return this;
    }

    /**
     * Returns parentCall.
     *
     * @return parentCall
     */
    @JsonProperty("parentCall")
    public Call getParentCall() {
        return parentCall;
    }

    /**
     * Sets parentCall.
     *
     * @param parentCall
     */
    @JsonProperty("parentCall")
    public void setParentCall(Call parentCall) {
        this.parentCall = parentCall;
    }

    /**
     * Sets childCall.
     *
     * @param childCall
     * @return This {@link CallsDialogResponse instance}.
     */
    public CallsDialogResponse childCall(Call childCall) {
        this.childCall = childCall;
        return this;
    }

    /**
     * Returns childCall.
     *
     * @return childCall
     */
    @JsonProperty("childCall")
    public Call getChildCall() {
        return childCall;
    }

    /**
     * Sets childCall.
     *
     * @param childCall
     */
    @JsonProperty("childCall")
    public void setChildCall(Call childCall) {
        this.childCall = childCall;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CallsDialogResponse callsDialogResponse = (CallsDialogResponse) o;
        return Objects.equals(this.id, callsDialogResponse.id)
                && Objects.equals(this.applicationId, callsDialogResponse.applicationId)
                && Objects.equals(this.state, callsDialogResponse.state)
                && Objects.equals(this.startTime, callsDialogResponse.startTime)
                && Objects.equals(this.establishTime, callsDialogResponse.establishTime)
                && Objects.equals(this.endTime, callsDialogResponse.endTime)
                && Objects.equals(this.parentCall, callsDialogResponse.parentCall)
                && Objects.equals(this.childCall, callsDialogResponse.childCall);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, applicationId, state, startTime, establishTime, endTime, parentCall, childCall);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class CallsDialogResponse {")
                .append(newLine)
                .append("    id: ")
                .append(toIndentedString(id))
                .append(newLine)
                .append("    applicationId: ")
                .append(toIndentedString(applicationId))
                .append(newLine)
                .append("    state: ")
                .append(toIndentedString(state))
                .append(newLine)
                .append("    startTime: ")
                .append(toIndentedString(startTime))
                .append(newLine)
                .append("    establishTime: ")
                .append(toIndentedString(establishTime))
                .append(newLine)
                .append("    endTime: ")
                .append(toIndentedString(endTime))
                .append(newLine)
                .append("    parentCall: ")
                .append(toIndentedString(parentCall))
                .append(newLine)
                .append("    childCall: ")
                .append(toIndentedString(childCall))
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
