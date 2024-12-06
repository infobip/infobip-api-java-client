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
import java.util.Objects;

/**
 * Represents CallsDialCallbackResponse model.
 */
public class CallsDialCallbackResponse extends CallbackResponse {

    private String phoneNumber;

    private String callerId;

    private CallsAnnouncements announcements;

    private CallsRecording recording;

    private String clientReferenceId;

    /**
     * Constructs a new {@link CallsDialCallbackResponse} instance.
     */
    public CallsDialCallbackResponse() {
        super("dial");
    }

    /**
     * Sets phoneNumber.
     * <p>
     * Field description:
     * Destination phone number to call.
     * <p>
     * The field is required.
     *
     * @param phoneNumber
     * @return This {@link CallsDialCallbackResponse instance}.
     */
    public CallsDialCallbackResponse phoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    /**
     * Returns phoneNumber.
     * <p>
     * Field description:
     * Destination phone number to call.
     * <p>
     * The field is required.
     *
     * @return phoneNumber
     */
    @JsonProperty("phoneNumber")
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Sets phoneNumber.
     * <p>
     * Field description:
     * Destination phone number to call.
     * <p>
     * The field is required.
     *
     * @param phoneNumber
     */
    @JsonProperty("phoneNumber")
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /**
     * Sets callerId.
     * <p>
     * Field description:
     * Caller ID displayed to a called party.
     * <p>
     * The field is required.
     *
     * @param callerId
     * @return This {@link CallsDialCallbackResponse instance}.
     */
    public CallsDialCallbackResponse callerId(String callerId) {
        this.callerId = callerId;
        return this;
    }

    /**
     * Returns callerId.
     * <p>
     * Field description:
     * Caller ID displayed to a called party.
     * <p>
     * The field is required.
     *
     * @return callerId
     */
    @JsonProperty("callerId")
    public String getCallerId() {
        return callerId;
    }

    /**
     * Sets callerId.
     * <p>
     * Field description:
     * Caller ID displayed to a called party.
     * <p>
     * The field is required.
     *
     * @param callerId
     */
    @JsonProperty("callerId")
    public void setCallerId(String callerId) {
        this.callerId = callerId;
    }

    /**
     * Sets announcements.
     *
     * @param announcements
     * @return This {@link CallsDialCallbackResponse instance}.
     */
    public CallsDialCallbackResponse announcements(CallsAnnouncements announcements) {
        this.announcements = announcements;
        return this;
    }

    /**
     * Returns announcements.
     *
     * @return announcements
     */
    @JsonProperty("announcements")
    public CallsAnnouncements getAnnouncements() {
        return announcements;
    }

    /**
     * Sets announcements.
     *
     * @param announcements
     */
    @JsonProperty("announcements")
    public void setAnnouncements(CallsAnnouncements announcements) {
        this.announcements = announcements;
    }

    /**
     * Sets recording.
     *
     * @param recording
     * @return This {@link CallsDialCallbackResponse instance}.
     */
    public CallsDialCallbackResponse recording(CallsRecording recording) {
        this.recording = recording;
        return this;
    }

    /**
     * Returns recording.
     *
     * @return recording
     */
    @JsonProperty("recording")
    public CallsRecording getRecording() {
        return recording;
    }

    /**
     * Sets recording.
     *
     * @param recording
     */
    @JsonProperty("recording")
    public void setRecording(CallsRecording recording) {
        this.recording = recording;
    }

    /**
     * Sets clientReferenceId.
     * <p>
     * Field description:
     * A user-defined reference ID for associating with a number masking session. This ID will appear in subsequent status requests and, if the session is recorded and our SFTP facility is used, will name the recording file. **Note:** In the case of recording, please limit this field to &#x60;200&#x60; characters as generated file name uses this field, call ID and extension, and if total file name is bigger than 256 characters, saving of the recording file will fail.
     *
     * @param clientReferenceId
     * @return This {@link CallsDialCallbackResponse instance}.
     */
    public CallsDialCallbackResponse clientReferenceId(String clientReferenceId) {
        this.clientReferenceId = clientReferenceId;
        return this;
    }

    /**
     * Returns clientReferenceId.
     * <p>
     * Field description:
     * A user-defined reference ID for associating with a number masking session. This ID will appear in subsequent status requests and, if the session is recorded and our SFTP facility is used, will name the recording file. **Note:** In the case of recording, please limit this field to &#x60;200&#x60; characters as generated file name uses this field, call ID and extension, and if total file name is bigger than 256 characters, saving of the recording file will fail.
     *
     * @return clientReferenceId
     */
    @JsonProperty("clientReferenceId")
    public String getClientReferenceId() {
        return clientReferenceId;
    }

    /**
     * Sets clientReferenceId.
     * <p>
     * Field description:
     * A user-defined reference ID for associating with a number masking session. This ID will appear in subsequent status requests and, if the session is recorded and our SFTP facility is used, will name the recording file. **Note:** In the case of recording, please limit this field to &#x60;200&#x60; characters as generated file name uses this field, call ID and extension, and if total file name is bigger than 256 characters, saving of the recording file will fail.
     *
     * @param clientReferenceId
     */
    @JsonProperty("clientReferenceId")
    public void setClientReferenceId(String clientReferenceId) {
        this.clientReferenceId = clientReferenceId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CallsDialCallbackResponse callsDialCallbackResponse = (CallsDialCallbackResponse) o;
        return Objects.equals(this.phoneNumber, callsDialCallbackResponse.phoneNumber)
                && Objects.equals(this.callerId, callsDialCallbackResponse.callerId)
                && Objects.equals(this.announcements, callsDialCallbackResponse.announcements)
                && Objects.equals(this.recording, callsDialCallbackResponse.recording)
                && Objects.equals(this.clientReferenceId, callsDialCallbackResponse.clientReferenceId)
                && super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(phoneNumber, callerId, announcements, recording, clientReferenceId, super.hashCode());
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class CallsDialCallbackResponse {")
                .append(newLine)
                .append("    ")
                .append(toIndentedString(super.toString()))
                .append(newLine)
                .append("    phoneNumber: ")
                .append(toIndentedString(phoneNumber))
                .append(newLine)
                .append("    callerId: ")
                .append(toIndentedString(callerId))
                .append(newLine)
                .append("    announcements: ")
                .append(toIndentedString(announcements))
                .append(newLine)
                .append("    recording: ")
                .append(toIndentedString(recording))
                .append(newLine)
                .append("    clientReferenceId: ")
                .append(toIndentedString(clientReferenceId))
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
