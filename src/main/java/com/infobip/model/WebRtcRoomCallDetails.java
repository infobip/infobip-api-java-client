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
 * Represents WebRtcRoomCallDetails model.
 */
public class WebRtcRoomCallDetails extends WebRtcCallDetails {

    private List<WebRtcConferenceParticipant> participants = new ArrayList<>();

    /**
     * Constructs a new {@link WebRtcRoomCallDetails} instance.
     */
    public WebRtcRoomCallDetails() {
        super("ROOM");
    }

    /**
     * Sets participants.
     * <p>
     * Field description:
     * List of participants of the call.
     * <p>
     * The field is required.
     *
     * @param participants
     * @return This {@link WebRtcRoomCallDetails instance}.
     */
    public WebRtcRoomCallDetails participants(List<WebRtcConferenceParticipant> participants) {
        this.participants = participants;
        return this;
    }

    /**
     * Adds and item into participants.
     * <p>
     * Field description:
     * List of participants of the call.
     * <p>
     * The field is required.
     *
     * @param participantsItem The item to be added to the list.
     * @return This {@link WebRtcRoomCallDetails instance}.
     */
    public WebRtcRoomCallDetails addParticipantsItem(WebRtcConferenceParticipant participantsItem) {
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
     * List of participants of the call.
     * <p>
     * The field is required.
     *
     * @return participants
     */
    @JsonProperty("participants")
    public List<WebRtcConferenceParticipant> getParticipants() {
        return participants;
    }

    /**
     * Sets participants.
     * <p>
     * Field description:
     * List of participants of the call.
     * <p>
     * The field is required.
     *
     * @param participants
     */
    @JsonProperty("participants")
    public void setParticipants(List<WebRtcConferenceParticipant> participants) {
        this.participants = participants;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WebRtcRoomCallDetails webRtcRoomCallDetails = (WebRtcRoomCallDetails) o;
        return Objects.equals(this.participants, webRtcRoomCallDetails.participants) && super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(participants, super.hashCode());
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class WebRtcRoomCallDetails {")
                .append(newLine)
                .append("    ")
                .append(toIndentedString(super.toString()))
                .append(newLine)
                .append("    participants: ")
                .append(toIndentedString(participants))
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
