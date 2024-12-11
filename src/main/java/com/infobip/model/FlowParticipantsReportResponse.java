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
 * Summary of processing status for participants in a given operation.
 */
public class FlowParticipantsReportResponse {

    private String operationId;

    private Long campaignId;

    private String callbackData;

    private List<FlowAddFlowParticipantResult> participants = new ArrayList<>();

    /**
     * Sets operationId.
     * <p>
     * Field description:
     * Unique identifier of the operation.
     * <p>
     * The field is required.
     *
     * @param operationId
     * @return This {@link FlowParticipantsReportResponse instance}.
     */
    public FlowParticipantsReportResponse operationId(String operationId) {
        this.operationId = operationId;
        return this;
    }

    /**
     * Returns operationId.
     * <p>
     * Field description:
     * Unique identifier of the operation.
     * <p>
     * The field is required.
     *
     * @return operationId
     */
    @JsonProperty("operationId")
    public String getOperationId() {
        return operationId;
    }

    /**
     * Sets operationId.
     * <p>
     * Field description:
     * Unique identifier of the operation.
     * <p>
     * The field is required.
     *
     * @param operationId
     */
    @JsonProperty("operationId")
    public void setOperationId(String operationId) {
        this.operationId = operationId;
    }

    /**
     * Sets campaignId.
     * <p>
     * Field description:
     * Unique identifier of the flow campaign.
     * <p>
     * The field is required.
     *
     * @param campaignId
     * @return This {@link FlowParticipantsReportResponse instance}.
     */
    public FlowParticipantsReportResponse campaignId(Long campaignId) {
        this.campaignId = campaignId;
        return this;
    }

    /**
     * Returns campaignId.
     * <p>
     * Field description:
     * Unique identifier of the flow campaign.
     * <p>
     * The field is required.
     *
     * @return campaignId
     */
    @JsonProperty("campaignId")
    public Long getCampaignId() {
        return campaignId;
    }

    /**
     * Sets campaignId.
     * <p>
     * Field description:
     * Unique identifier of the flow campaign.
     * <p>
     * The field is required.
     *
     * @param campaignId
     */
    @JsonProperty("campaignId")
    public void setCampaignId(Long campaignId) {
        this.campaignId = campaignId;
    }

    /**
     * Sets callbackData.
     * <p>
     * Field description:
     * Additional data will be passed in the request to your callback server along with the operation results report.
     *
     * @param callbackData
     * @return This {@link FlowParticipantsReportResponse instance}.
     */
    public FlowParticipantsReportResponse callbackData(String callbackData) {
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

    /**
     * Sets participants.
     * <p>
     * Field description:
     * Array with information about each participant submitted for the operation.
     * <p>
     * The field is required.
     *
     * @param participants
     * @return This {@link FlowParticipantsReportResponse instance}.
     */
    public FlowParticipantsReportResponse participants(List<FlowAddFlowParticipantResult> participants) {
        this.participants = participants;
        return this;
    }

    /**
     * Adds and item into participants.
     * <p>
     * Field description:
     * Array with information about each participant submitted for the operation.
     * <p>
     * The field is required.
     *
     * @param participantsItem The item to be added to the list.
     * @return This {@link FlowParticipantsReportResponse instance}.
     */
    public FlowParticipantsReportResponse addParticipantsItem(FlowAddFlowParticipantResult participantsItem) {
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
     * Array with information about each participant submitted for the operation.
     * <p>
     * The field is required.
     *
     * @return participants
     */
    @JsonProperty("participants")
    public List<FlowAddFlowParticipantResult> getParticipants() {
        return participants;
    }

    /**
     * Sets participants.
     * <p>
     * Field description:
     * Array with information about each participant submitted for the operation.
     * <p>
     * The field is required.
     *
     * @param participants
     */
    @JsonProperty("participants")
    public void setParticipants(List<FlowAddFlowParticipantResult> participants) {
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
        FlowParticipantsReportResponse flowParticipantsReportResponse = (FlowParticipantsReportResponse) o;
        return Objects.equals(this.operationId, flowParticipantsReportResponse.operationId)
                && Objects.equals(this.campaignId, flowParticipantsReportResponse.campaignId)
                && Objects.equals(this.callbackData, flowParticipantsReportResponse.callbackData)
                && Objects.equals(this.participants, flowParticipantsReportResponse.participants);
    }

    @Override
    public int hashCode() {
        return Objects.hash(operationId, campaignId, callbackData, participants);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class FlowParticipantsReportResponse {")
                .append(newLine)
                .append("    operationId: ")
                .append(toIndentedString(operationId))
                .append(newLine)
                .append("    campaignId: ")
                .append(toIndentedString(campaignId))
                .append(newLine)
                .append("    callbackData: ")
                .append(toIndentedString(callbackData))
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
