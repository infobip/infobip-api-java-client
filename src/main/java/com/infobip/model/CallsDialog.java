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
 * Represents CallsDialog model.
 */
public class CallsDialog {

    private String id;

    private String callsConfigurationId;

    private String applicationId;

    private String entityId;

    private CallsDialogState state;

    private OffsetDateTime startTime;

    private OffsetDateTime establishTime;

    private OffsetDateTime endTime;

    private Call parentCall;

    private Call childCall;

    /**
     * Sets id.
     *
     * @param id
     * @return This {@link CallsDialog instance}.
     */
    public CallsDialog id(String id) {
        this.id = id;
        return this;
    }

    /**
     * Returns id.
     *
     * @return id
     */
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    /**
     * Sets id.
     *
     * @param id
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Sets callsConfigurationId.
     *
     * @param callsConfigurationId
     * @return This {@link CallsDialog instance}.
     */
    public CallsDialog callsConfigurationId(String callsConfigurationId) {
        this.callsConfigurationId = callsConfigurationId;
        return this;
    }

    /**
     * Returns callsConfigurationId.
     *
     * @return callsConfigurationId
     */
    @JsonProperty("callsConfigurationId")
    public String getCallsConfigurationId() {
        return callsConfigurationId;
    }

    /**
     * Sets callsConfigurationId.
     *
     * @param callsConfigurationId
     */
    @JsonProperty("callsConfigurationId")
    public void setCallsConfigurationId(String callsConfigurationId) {
        this.callsConfigurationId = callsConfigurationId;
    }

    /**
     * Sets applicationId.
     *
     * @param applicationId
     * @return This {@link CallsDialog instance}.
     */
    public CallsDialog applicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }

    /**
     * Returns applicationId.
     *
     * @return applicationId
     */
    @JsonProperty("applicationId")
    public String getApplicationId() {
        return applicationId;
    }

    /**
     * Sets applicationId.
     *
     * @param applicationId
     */
    @JsonProperty("applicationId")
    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    /**
     * Sets entityId.
     *
     * @param entityId
     * @return This {@link CallsDialog instance}.
     */
    public CallsDialog entityId(String entityId) {
        this.entityId = entityId;
        return this;
    }

    /**
     * Returns entityId.
     *
     * @return entityId
     */
    @JsonProperty("entityId")
    public String getEntityId() {
        return entityId;
    }

    /**
     * Sets entityId.
     *
     * @param entityId
     */
    @JsonProperty("entityId")
    public void setEntityId(String entityId) {
        this.entityId = entityId;
    }

    /**
     * Sets state.
     *
     * @param state
     * @return This {@link CallsDialog instance}.
     */
    public CallsDialog state(CallsDialogState state) {
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
     *
     * @param startTime
     * @return This {@link CallsDialog instance}.
     */
    public CallsDialog startTime(OffsetDateTime startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * Returns startTime.
     *
     * @return startTime
     */
    @JsonProperty("startTime")
    public OffsetDateTime getStartTime() {
        return startTime;
    }

    /**
     * Sets startTime.
     *
     * @param startTime
     */
    @JsonProperty("startTime")
    public void setStartTime(OffsetDateTime startTime) {
        this.startTime = startTime;
    }

    /**
     * Sets establishTime.
     *
     * @param establishTime
     * @return This {@link CallsDialog instance}.
     */
    public CallsDialog establishTime(OffsetDateTime establishTime) {
        this.establishTime = establishTime;
        return this;
    }

    /**
     * Returns establishTime.
     *
     * @return establishTime
     */
    @JsonProperty("establishTime")
    public OffsetDateTime getEstablishTime() {
        return establishTime;
    }

    /**
     * Sets establishTime.
     *
     * @param establishTime
     */
    @JsonProperty("establishTime")
    public void setEstablishTime(OffsetDateTime establishTime) {
        this.establishTime = establishTime;
    }

    /**
     * Sets endTime.
     *
     * @param endTime
     * @return This {@link CallsDialog instance}.
     */
    public CallsDialog endTime(OffsetDateTime endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * Returns endTime.
     *
     * @return endTime
     */
    @JsonProperty("endTime")
    public OffsetDateTime getEndTime() {
        return endTime;
    }

    /**
     * Sets endTime.
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
     * @return This {@link CallsDialog instance}.
     */
    public CallsDialog parentCall(Call parentCall) {
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
     * @return This {@link CallsDialog instance}.
     */
    public CallsDialog childCall(Call childCall) {
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
        CallsDialog callsDialog = (CallsDialog) o;
        return Objects.equals(this.id, callsDialog.id)
                && Objects.equals(this.callsConfigurationId, callsDialog.callsConfigurationId)
                && Objects.equals(this.applicationId, callsDialog.applicationId)
                && Objects.equals(this.entityId, callsDialog.entityId)
                && Objects.equals(this.state, callsDialog.state)
                && Objects.equals(this.startTime, callsDialog.startTime)
                && Objects.equals(this.establishTime, callsDialog.establishTime)
                && Objects.equals(this.endTime, callsDialog.endTime)
                && Objects.equals(this.parentCall, callsDialog.parentCall)
                && Objects.equals(this.childCall, callsDialog.childCall);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                id,
                callsConfigurationId,
                applicationId,
                entityId,
                state,
                startTime,
                establishTime,
                endTime,
                parentCall,
                childCall);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class CallsDialog {")
                .append(newLine)
                .append("    id: ")
                .append(toIndentedString(id))
                .append(newLine)
                .append("    callsConfigurationId: ")
                .append(toIndentedString(callsConfigurationId))
                .append(newLine)
                .append("    applicationId: ")
                .append(toIndentedString(applicationId))
                .append(newLine)
                .append("    entityId: ")
                .append(toIndentedString(entityId))
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
