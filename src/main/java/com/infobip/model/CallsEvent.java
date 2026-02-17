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
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * Represents CallsEvent model.
 */
@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.EXISTING_PROPERTY,
        property = "type",
        visible = true)
@JsonSubTypes({
    @JsonSubTypes.Type(value = CallsApplicationTransferFailedEvent.class, name = "APPLICATION_TRANSFER_FAILED"),
    @JsonSubTypes.Type(value = CallsApplicationTransferFinishedEvent.class, name = "APPLICATION_TRANSFER_FINISHED"),
    @JsonSubTypes.Type(value = CallsApplicationTransferRequestedEvent.class, name = "APPLICATION_TRANSFER_REQUESTED"),
    @JsonSubTypes.Type(value = CallsBulkCallStatusEvent.class, name = "BULK_CALL_STATUS"),
    @JsonSubTypes.Type(value = CallDisconnectedEvent.class, name = "CALL_DISCONNECTED"),
    @JsonSubTypes.Type(value = CallEstablishedEvent.class, name = "CALL_ESTABLISHED"),
    @JsonSubTypes.Type(value = CallFailedEvent.class, name = "CALL_FAILED"),
    @JsonSubTypes.Type(value = CallFinishedEvent.class, name = "CALL_FINISHED"),
    @JsonSubTypes.Type(value = CallMediaChangedEvent.class, name = "CALL_MEDIA_CHANGED"),
    @JsonSubTypes.Type(value = CallPreEstablishedEvent.class, name = "CALL_PRE_ESTABLISHED"),
    @JsonSubTypes.Type(value = CallReceivedEvent.class, name = "CALL_RECEIVED"),
    @JsonSubTypes.Type(value = CallReconnectedEvent.class, name = "CALL_RECONNECTED"),
    @JsonSubTypes.Type(value = CallRecordingDeletedEvent.class, name = "CALL_RECORDING_DELETED"),
    @JsonSubTypes.Type(value = CallRecordingFailedEvent.class, name = "CALL_RECORDING_FAILED"),
    @JsonSubTypes.Type(value = CallRecordingReadyEvent.class, name = "CALL_RECORDING_READY"),
    @JsonSubTypes.Type(value = CallRecordingStartedEvent.class, name = "CALL_RECORDING_STARTED"),
    @JsonSubTypes.Type(value = CallRecordingStoppedEvent.class, name = "CALL_RECORDING_STOPPED"),
    @JsonSubTypes.Type(value = CallRingingEvent.class, name = "CALL_RINGING"),
    @JsonSubTypes.Type(value = CallStartedEvent.class, name = "CALL_STARTED"),
    @JsonSubTypes.Type(value = CallsConferenceCompositionFailedEvent.class, name = "CONFERENCE_COMPOSITION_FAILED"),
    @JsonSubTypes.Type(value = CallsConferenceCompositionFinishedEvent.class, name = "CONFERENCE_COMPOSITION_FINISHED"),
    @JsonSubTypes.Type(value = CallsConferenceCreatedEvent.class, name = "CONFERENCE_CREATED"),
    @JsonSubTypes.Type(value = CallsConferenceFinishedEvent.class, name = "CONFERENCE_FINISHED"),
    @JsonSubTypes.Type(value = CallsConferenceRecordingDeletedEvent.class, name = "CONFERENCE_RECORDING_DELETED"),
    @JsonSubTypes.Type(value = CallsConferenceRecordingFailedEvent.class, name = "CONFERENCE_RECORDING_FAILED"),
    @JsonSubTypes.Type(value = CallsConferenceRecordingReadyEvent.class, name = "CONFERENCE_RECORDING_READY"),
    @JsonSubTypes.Type(value = CallsConferenceRecordingStartedEvent.class, name = "CONFERENCE_RECORDING_STARTED"),
    @JsonSubTypes.Type(value = CallsConferenceRecordingStoppedEvent.class, name = "CONFERENCE_RECORDING_STOPPED"),
    @JsonSubTypes.Type(value = CallsDialogCompositionFailedEvent.class, name = "DIALOG_COMPOSITION_FAILED"),
    @JsonSubTypes.Type(value = CallsDialogCompositionFinishedEvent.class, name = "DIALOG_COMPOSITION_FINISHED"),
    @JsonSubTypes.Type(value = CallsDialogCreatedEvent.class, name = "DIALOG_CREATED"),
    @JsonSubTypes.Type(value = CallsDialogEstablishedEvent.class, name = "DIALOG_ESTABLISHED"),
    @JsonSubTypes.Type(value = CallsDialogFailedEvent.class, name = "DIALOG_FAILED"),
    @JsonSubTypes.Type(value = CallsDialogFinishedEvent.class, name = "DIALOG_FINISHED"),
    @JsonSubTypes.Type(value = CallsDialogRecordingDeletedEvent.class, name = "DIALOG_RECORDING_DELETED"),
    @JsonSubTypes.Type(value = CallsDialogRecordingFailedEvent.class, name = "DIALOG_RECORDING_FAILED"),
    @JsonSubTypes.Type(value = CallsDialogRecordingReadyEvent.class, name = "DIALOG_RECORDING_READY"),
    @JsonSubTypes.Type(value = CallsDialogRecordingStartedEvent.class, name = "DIALOG_RECORDING_STARTED"),
    @JsonSubTypes.Type(value = CallsDialogRecordingStoppedEvent.class, name = "DIALOG_RECORDING_STOPPED"),
    @JsonSubTypes.Type(value = CallsDialogTransferFailedEvent.class, name = "DIALOG_TRANSFER_FAILED"),
    @JsonSubTypes.Type(value = CallsDialogTransferFinishedEvent.class, name = "DIALOG_TRANSFER_FINISHED"),
    @JsonSubTypes.Type(value = CallsDialogTransferRequestedEvent.class, name = "DIALOG_TRANSFER_REQUESTED"),
    @JsonSubTypes.Type(value = CallsDtmfCapturedEvent.class, name = "DTMF_CAPTURED"),
    @JsonSubTypes.Type(value = CallsErrorEvent.class, name = "ERROR"),
    @JsonSubTypes.Type(value = CallsMachineDetectionFailedEvent.class, name = "MACHINE_DETECTION_FAILED"),
    @JsonSubTypes.Type(value = CallsMachineDetectionFinishedEvent.class, name = "MACHINE_DETECTION_FINISHED"),
    @JsonSubTypes.Type(
            value = CallsMachineMessageDetectionFailedEvent.class,
            name = "MACHINE_MESSAGE_DETECTION_FAILED"),
    @JsonSubTypes.Type(
            value = CallsMachineMessageDetectionFinishedEvent.class,
            name = "MACHINE_MESSAGE_DETECTION_FINISHED"),
    @JsonSubTypes.Type(value = CallsMediaStreamFailedEvent.class, name = "MEDIA_STREAM_FAILED"),
    @JsonSubTypes.Type(value = CallsMediaStreamFinishedEvent.class, name = "MEDIA_STREAM_FINISHED"),
    @JsonSubTypes.Type(value = CallsMediaStreamStartedEvent.class, name = "MEDIA_STREAM_STARTED"),
    @JsonSubTypes.Type(value = CallsParticipantJoinedEvent.class, name = "PARTICIPANT_JOINED"),
    @JsonSubTypes.Type(value = CallsParticipantJoiningEvent.class, name = "PARTICIPANT_JOINING"),
    @JsonSubTypes.Type(value = CallsParticipantJoinFailedEvent.class, name = "PARTICIPANT_JOIN_FAILED"),
    @JsonSubTypes.Type(value = CallsParticipantMediaChangedEvent.class, name = "PARTICIPANT_MEDIA_CHANGED"),
    @JsonSubTypes.Type(value = CallsParticipantRecordingFailedEvent.class, name = "PARTICIPANT_RECORDING_FAILED"),
    @JsonSubTypes.Type(value = CallsParticipantRemovedEvent.class, name = "PARTICIPANT_REMOVED"),
    @JsonSubTypes.Type(value = CallsParticipantRoleChangedEvent.class, name = "PARTICIPANT_ROLE_CHANGED"),
    @JsonSubTypes.Type(value = CallsParticipantRoleChangeFailedEvent.class, name = "PARTICIPANT_ROLE_CHANGE_FAILED"),
    @JsonSubTypes.Type(value = CallsParticipantStartedTalkingEvent.class, name = "PARTICIPANT_STARTED_TALKING"),
    @JsonSubTypes.Type(value = CallsParticipantStoppedTalkingEvent.class, name = "PARTICIPANT_STOPPED_TALKING"),
    @JsonSubTypes.Type(value = CallsPlayFinishedEvent.class, name = "PLAY_FINISHED"),
    @JsonSubTypes.Type(value = CallsSayFinishedEvent.class, name = "SAY_FINISHED"),
    @JsonSubTypes.Type(value = CallsSpeechCapturedEvent.class, name = "SPEECH_CAPTURED"),
    @JsonSubTypes.Type(value = CallsTranscriptionEvent.class, name = "TRANSCRIPTION"),
})
public abstract class CallsEvent {

    private String conferenceId;

    private String callId;

    private OffsetDateTime timestamp;

    private String callsConfigurationId;

    private Platform platform;

    private String bulkId;

    private String dialogId;

    protected final CallsEventType type;

    /**
     * Constructs a new {@link CallsEvent} instance.
     */
    public CallsEvent(String type) {
        this.type = CallsEventType.fromValue(type);
    }

    /**
     * Sets conferenceId.
     * <p>
     * Field description:
     * Unique ID of the conference, if the event is related to a conference.
     *
     * @param conferenceId
     * @return This {@link CallsEvent instance}.
     */
    public CallsEvent conferenceId(String conferenceId) {
        this.conferenceId = conferenceId;
        return this;
    }

    /**
     * Returns conferenceId.
     * <p>
     * Field description:
     * Unique ID of the conference, if the event is related to a conference.
     *
     * @return conferenceId
     */
    @JsonProperty("conferenceId")
    public String getConferenceId() {
        return conferenceId;
    }

    /**
     * Sets conferenceId.
     * <p>
     * Field description:
     * Unique ID of the conference, if the event is related to a conference.
     *
     * @param conferenceId
     */
    @JsonProperty("conferenceId")
    public void setConferenceId(String conferenceId) {
        this.conferenceId = conferenceId;
    }

    /**
     * Sets callId.
     * <p>
     * Field description:
     * Unique ID of the call, if the event is related to a call.
     *
     * @param callId
     * @return This {@link CallsEvent instance}.
     */
    public CallsEvent callId(String callId) {
        this.callId = callId;
        return this;
    }

    /**
     * Returns callId.
     * <p>
     * Field description:
     * Unique ID of the call, if the event is related to a call.
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
     * Unique ID of the call, if the event is related to a call.
     *
     * @param callId
     */
    @JsonProperty("callId")
    public void setCallId(String callId) {
        this.callId = callId;
    }

    /**
     * Sets timestamp.
     * <p>
     * Field description:
     * Date and time for when the event has occurred.
     *
     * @param timestamp
     * @return This {@link CallsEvent instance}.
     */
    public CallsEvent timestamp(OffsetDateTime timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    /**
     * Returns timestamp.
     * <p>
     * Field description:
     * Date and time for when the event has occurred.
     *
     * @return timestamp
     */
    @JsonProperty("timestamp")
    public OffsetDateTime getTimestamp() {
        return timestamp;
    }

    /**
     * Sets timestamp.
     * <p>
     * Field description:
     * Date and time for when the event has occurred.
     *
     * @param timestamp
     */
    @JsonProperty("timestamp")
    public void setTimestamp(OffsetDateTime timestamp) {
        this.timestamp = timestamp;
    }

    /**
     * Sets callsConfigurationId.
     * <p>
     * Field description:
     * Unique ID of the calls configuration, if the event is related to a calls configuration.
     *
     * @param callsConfigurationId
     * @return This {@link CallsEvent instance}.
     */
    public CallsEvent callsConfigurationId(String callsConfigurationId) {
        this.callsConfigurationId = callsConfigurationId;
        return this;
    }

    /**
     * Returns callsConfigurationId.
     * <p>
     * Field description:
     * Unique ID of the calls configuration, if the event is related to a calls configuration.
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
     * Unique ID of the calls configuration, if the event is related to a calls configuration.
     *
     * @param callsConfigurationId
     */
    @JsonProperty("callsConfigurationId")
    public void setCallsConfigurationId(String callsConfigurationId) {
        this.callsConfigurationId = callsConfigurationId;
    }

    /**
     * Sets platform.
     *
     * @param platform
     * @return This {@link CallsEvent instance}.
     */
    public CallsEvent platform(Platform platform) {
        this.platform = platform;
        return this;
    }

    /**
     * Returns platform.
     *
     * @return platform
     */
    @JsonProperty("platform")
    public Platform getPlatform() {
        return platform;
    }

    /**
     * Sets platform.
     *
     * @param platform
     */
    @JsonProperty("platform")
    public void setPlatform(Platform platform) {
        this.platform = platform;
    }

    /**
     * Sets bulkId.
     * <p>
     * Field description:
     * Unique ID of the bulk action, if the event is related to a bulk action.
     *
     * @param bulkId
     * @return This {@link CallsEvent instance}.
     */
    public CallsEvent bulkId(String bulkId) {
        this.bulkId = bulkId;
        return this;
    }

    /**
     * Returns bulkId.
     * <p>
     * Field description:
     * Unique ID of the bulk action, if the event is related to a bulk action.
     *
     * @return bulkId
     */
    @JsonProperty("bulkId")
    public String getBulkId() {
        return bulkId;
    }

    /**
     * Sets bulkId.
     * <p>
     * Field description:
     * Unique ID of the bulk action, if the event is related to a bulk action.
     *
     * @param bulkId
     */
    @JsonProperty("bulkId")
    public void setBulkId(String bulkId) {
        this.bulkId = bulkId;
    }

    /**
     * Sets dialogId.
     * <p>
     * Field description:
     * Unique ID of the dialog that event is related to.
     *
     * @param dialogId
     * @return This {@link CallsEvent instance}.
     */
    public CallsEvent dialogId(String dialogId) {
        this.dialogId = dialogId;
        return this;
    }

    /**
     * Returns dialogId.
     * <p>
     * Field description:
     * Unique ID of the dialog that event is related to.
     *
     * @return dialogId
     */
    @JsonProperty("dialogId")
    public String getDialogId() {
        return dialogId;
    }

    /**
     * Sets dialogId.
     * <p>
     * Field description:
     * Unique ID of the dialog that event is related to.
     *
     * @param dialogId
     */
    @JsonProperty("dialogId")
    public void setDialogId(String dialogId) {
        this.dialogId = dialogId;
    }

    /**
     * Returns type.
     *
     * @return type
     */
    @JsonProperty("type")
    public CallsEventType getType() {
        return type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CallsEvent callsEvent = (CallsEvent) o;
        return Objects.equals(this.conferenceId, callsEvent.conferenceId)
                && Objects.equals(this.callId, callsEvent.callId)
                && Objects.equals(this.timestamp, callsEvent.timestamp)
                && Objects.equals(this.callsConfigurationId, callsEvent.callsConfigurationId)
                && Objects.equals(this.platform, callsEvent.platform)
                && Objects.equals(this.bulkId, callsEvent.bulkId)
                && Objects.equals(this.dialogId, callsEvent.dialogId)
                && Objects.equals(this.type, callsEvent.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(conferenceId, callId, timestamp, callsConfigurationId, platform, bulkId, dialogId, type);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class CallsEvent {")
                .append(newLine)
                .append("    conferenceId: ")
                .append(toIndentedString(conferenceId))
                .append(newLine)
                .append("    callId: ")
                .append(toIndentedString(callId))
                .append(newLine)
                .append("    timestamp: ")
                .append(toIndentedString(timestamp))
                .append(newLine)
                .append("    callsConfigurationId: ")
                .append(toIndentedString(callsConfigurationId))
                .append(newLine)
                .append("    platform: ")
                .append(toIndentedString(platform))
                .append(newLine)
                .append("    bulkId: ")
                .append(toIndentedString(bulkId))
                .append(newLine)
                .append("    dialogId: ")
                .append(toIndentedString(dialogId))
                .append(newLine)
                .append("    type: ")
                .append(toIndentedString(type))
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
