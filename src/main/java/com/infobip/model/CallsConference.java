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
 * Represents CallsConference model.
 */
public class CallsConference {

    private String id;

    private String name;

    private List<CallsParticipant> participants = null;

    private String callsConfigurationId;

    private String applicationId;

    /**
     * Sets id.
     * <p>
     * Field description:
     * Unique conference ID.
     *
     * @param id
     * @return This {@link CallsConference instance}.
     */
    public CallsConference id(String id) {
        this.id = id;
        return this;
    }

    /**
     * Returns id.
     * <p>
     * Field description:
     * Unique conference ID.
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
     * Unique conference ID.
     *
     * @param id
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Sets name.
     * <p>
     * Field description:
     * Conference name, requested or autogenerated on creation.
     *
     * @param name
     * @return This {@link CallsConference instance}.
     */
    public CallsConference name(String name) {
        this.name = name;
        return this;
    }

    /**
     * Returns name.
     * <p>
     * Field description:
     * Conference name, requested or autogenerated on creation.
     *
     * @return name
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * Sets name.
     * <p>
     * Field description:
     * Conference name, requested or autogenerated on creation.
     *
     * @param name
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Sets participants.
     * <p>
     * Field description:
     * The list of conference participants.
     *
     * @param participants
     * @return This {@link CallsConference instance}.
     */
    public CallsConference participants(List<CallsParticipant> participants) {
        this.participants = participants;
        return this;
    }

    /**
     * Adds and item into participants.
     * <p>
     * Field description:
     * The list of conference participants.
     *
     * @param participantsItem The item to be added to the list.
     * @return This {@link CallsConference instance}.
     */
    public CallsConference addParticipantsItem(CallsParticipant participantsItem) {
        if (this.participants == null) {
            this.participants = new ArrayList<>();
        }
        this.participants.add(participantsItem);
        return this;
    }

    /**
     * Returns participants.
     * <p>
     * Field description:
     * The list of conference participants.
     *
     * @return participants
     */
    @JsonProperty("participants")
    public List<CallsParticipant> getParticipants() {
        return participants;
    }

    /**
     * Sets participants.
     * <p>
     * Field description:
     * The list of conference participants.
     *
     * @param participants
     */
    @JsonProperty("participants")
    public void setParticipants(List<CallsParticipant> participants) {
        this.participants = participants;
    }

    /**
     * Sets callsConfigurationId.
     * <p>
     * Field description:
     * Calls Configuration ID.
     *
     * @param callsConfigurationId
     * @return This {@link CallsConference instance}.
     */
    public CallsConference callsConfigurationId(String callsConfigurationId) {
        this.callsConfigurationId = callsConfigurationId;
        return this;
    }

    /**
     * Returns callsConfigurationId.
     * <p>
     * Field description:
     * Calls Configuration ID.
     *
     * @return callsConfigurationId
     */
    @JsonProperty("callsConfigurationId")
    public String getCallsConfigurationId() {
        return callsConfigurationId;
    }

    /**
     * Sets callsConfigurationId.
     * <p>
     * Field description:
     * Calls Configuration ID.
     *
     * @param callsConfigurationId
     */
    @JsonProperty("callsConfigurationId")
    public void setCallsConfigurationId(String callsConfigurationId) {
        this.callsConfigurationId = callsConfigurationId;
    }

    /**
     * Sets applicationId.
     * <p>
     * Field description:
     * Application ID.
     *
     * @param applicationId
     * @return This {@link CallsConference instance}.
     */
    public CallsConference applicationId(String applicationId) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CallsConference callsConference = (CallsConference) o;
        return Objects.equals(this.id, callsConference.id)
                && Objects.equals(this.name, callsConference.name)
                && Objects.equals(this.participants, callsConference.participants)
                && Objects.equals(this.callsConfigurationId, callsConference.callsConfigurationId)
                && Objects.equals(this.applicationId, callsConference.applicationId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, participants, callsConfigurationId, applicationId);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class CallsConference {")
                .append(newLine)
                .append("    id: ")
                .append(toIndentedString(id))
                .append(newLine)
                .append("    name: ")
                .append(toIndentedString(name))
                .append(newLine)
                .append("    participants: ")
                .append(toIndentedString(participants))
                .append(newLine)
                .append("    callsConfigurationId: ")
                .append(toIndentedString(callsConfigurationId))
                .append(newLine)
                .append("    applicationId: ")
                .append(toIndentedString(applicationId))
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
