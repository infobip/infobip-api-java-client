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
 * Request to add given participants to the Flow campaign.
 */
public class FlowAddFlowParticipantsRequest {

    private List<FlowParticipant> participants = new ArrayList<>();

    private String notifyUrl;

    private String callbackData;

    /**
     * Sets participants.
     * <p>
     * Field description:
     * Array of participants to add.
     * <p>
     * The field is required.
     *
     * @param participants
     * @return This {@link FlowAddFlowParticipantsRequest instance}.
     */
    public FlowAddFlowParticipantsRequest participants(List<FlowParticipant> participants) {
        this.participants = participants;
        return this;
    }

    /**
     * Adds and item into participants.
     * <p>
     * Field description:
     * Array of participants to add.
     * <p>
     * The field is required.
     *
     * @param participantsItem The item to be added to the list.
     * @return This {@link FlowAddFlowParticipantsRequest instance}.
     */
    public FlowAddFlowParticipantsRequest addParticipantsItem(FlowParticipant participantsItem) {
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
     * Array of participants to add.
     * <p>
     * The field is required.
     *
     * @return participants
     */
    @JsonProperty("participants")
    public List<FlowParticipant> getParticipants() {
        return participants;
    }

    /**
     * Sets participants.
     * <p>
     * Field description:
     * Array of participants to add.
     * <p>
     * The field is required.
     *
     * @param participants
     */
    @JsonProperty("participants")
    public void setParticipants(List<FlowParticipant> participants) {
        this.participants = participants;
    }

    /**
     * Sets notifyUrl.
     * <p>
     * Field description:
     * The URL on your callback server on which a report of operation results will be sent.
     *
     * @param notifyUrl
     * @return This {@link FlowAddFlowParticipantsRequest instance}.
     */
    public FlowAddFlowParticipantsRequest notifyUrl(String notifyUrl) {
        this.notifyUrl = notifyUrl;
        return this;
    }

    /**
     * Returns notifyUrl.
     * <p>
     * Field description:
     * The URL on your callback server on which a report of operation results will be sent.
     *
     * @return notifyUrl
     */
    @JsonProperty("notifyUrl")
    public String getNotifyUrl() {
        return notifyUrl;
    }

    /**
     * Sets notifyUrl.
     * <p>
     * Field description:
     * The URL on your callback server on which a report of operation results will be sent.
     *
     * @param notifyUrl
     */
    @JsonProperty("notifyUrl")
    public void setNotifyUrl(String notifyUrl) {
        this.notifyUrl = notifyUrl;
    }

    /**
     * Sets callbackData.
     * <p>
     * Field description:
     * Additional data will be passed in the request to your callback server along with the operation results report.
     *
     * @param callbackData
     * @return This {@link FlowAddFlowParticipantsRequest instance}.
     */
    public FlowAddFlowParticipantsRequest callbackData(String callbackData) {
        this.callbackData = callbackData;
        return this;
    }

    /**
     * Returns callbackData.
     * <p>
     * Field description:
     * Additional data will be passed in the request to your callback server along with the operation results report.
     *
     * @return callbackData
     */
    @JsonProperty("callbackData")
    public String getCallbackData() {
        return callbackData;
    }

    /**
     * Sets callbackData.
     * <p>
     * Field description:
     * Additional data will be passed in the request to your callback server along with the operation results report.
     *
     * @param callbackData
     */
    @JsonProperty("callbackData")
    public void setCallbackData(String callbackData) {
        this.callbackData = callbackData;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        FlowAddFlowParticipantsRequest flowAddFlowParticipantsRequest = (FlowAddFlowParticipantsRequest) o;
        return Objects.equals(this.participants, flowAddFlowParticipantsRequest.participants)
                && Objects.equals(this.notifyUrl, flowAddFlowParticipantsRequest.notifyUrl)
                && Objects.equals(this.callbackData, flowAddFlowParticipantsRequest.callbackData);
    }

    @Override
    public int hashCode() {
        return Objects.hash(participants, notifyUrl, callbackData);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class FlowAddFlowParticipantsRequest {")
                .append(newLine)
                .append("    participants: ")
                .append(toIndentedString(participants))
                .append(newLine)
                .append("    notifyUrl: ")
                .append(toIndentedString(notifyUrl))
                .append(newLine)
                .append("    callbackData: ")
                .append(toIndentedString(callbackData))
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
