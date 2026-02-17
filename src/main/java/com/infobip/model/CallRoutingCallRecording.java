/*
 * This class is auto generated from the Infobip OpenAPI specification
 * through the OpenAPI Specification Client API libraries (Re)Generator (OSCAR),
 * powered by the OpenAPI Generator (https://openapi-generator.tech).
 *
 * Do not edit manually. To learn how to raise an issue, see the CONTRIBUTING guide
 * or contact us @ support@infobip.com.
 */

package com.infobip.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Call recording metadata.
 */
public class CallRoutingCallRecording {

    private String callId;

    private String endpoint;

    /**
     * Call direction.
     */
    public enum DirectionEnum {
        INBOUND("INBOUND"),
        OUTBOUND("OUTBOUND");

        private String value;

        DirectionEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static DirectionEnum fromValue(String value) {
            for (DirectionEnum enumElement : DirectionEnum.values()) {
                if (enumElement.value.equals(value)) {
                    return enumElement;
                }
            }
            throw new IllegalArgumentException("Unexpected enum value '" + value + "'.");
        }
    }

    private DirectionEnum direction;

    private String status;

    private String reason;

    private List<CallRoutingRecordedFile> files = null;

    /**
     * Sets callId.
     * <p>
     * Field description:
     * Call identifier.
     *
     * @param callId
     * @return This {@link CallRoutingCallRecording instance}.
     */
    public CallRoutingCallRecording callId(String callId) {
        this.callId = callId;
        return this;
    }

    /**
     * Returns callId.
     * <p>
     * Field description:
     * Call identifier.
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
     * Call identifier.
     *
     * @param callId
     */
    @JsonProperty("callId")
    public void setCallId(String callId) {
        this.callId = callId;
    }

    /**
     * Sets endpoint.
     * <p>
     * Field description:
     * Call endpoint. Represents a caller for the inbound calls and a callee for the outbound calls.
     *
     * @param endpoint
     * @return This {@link CallRoutingCallRecording instance}.
     */
    public CallRoutingCallRecording endpoint(String endpoint) {
        this.endpoint = endpoint;
        return this;
    }

    /**
     * Returns endpoint.
     * <p>
     * Field description:
     * Call endpoint. Represents a caller for the inbound calls and a callee for the outbound calls.
     *
     * @return endpoint
     */
    @JsonProperty("endpoint")
    public String getEndpoint() {
        return endpoint;
    }

    /**
     * Sets endpoint.
     * <p>
     * Field description:
     * Call endpoint. Represents a caller for the inbound calls and a callee for the outbound calls.
     *
     * @param endpoint
     */
    @JsonProperty("endpoint")
    public void setEndpoint(String endpoint) {
        this.endpoint = endpoint;
    }

    /**
     * Sets direction.
     * <p>
     * Field description:
     * Call direction.
     *
     * @param direction
     * @return This {@link CallRoutingCallRecording instance}.
     */
    public CallRoutingCallRecording direction(DirectionEnum direction) {
        this.direction = direction;
        return this;
    }

    /**
     * Returns direction.
     * <p>
     * Field description:
     * Call direction.
     *
     * @return direction
     */
    @JsonProperty("direction")
    public DirectionEnum getDirection() {
        return direction;
    }

    /**
     * Sets direction.
     * <p>
     * Field description:
     * Call direction.
     *
     * @param direction
     */
    @JsonProperty("direction")
    public void setDirection(DirectionEnum direction) {
        this.direction = direction;
    }

    /**
     * Sets status.
     * <p>
     * Field description:
     * Status of call recording.
     *
     * @param status
     * @return This {@link CallRoutingCallRecording instance}.
     */
    public CallRoutingCallRecording status(String status) {
        this.status = status;
        return this;
    }

    /**
     * Returns status.
     * <p>
     * Field description:
     * Status of call recording.
     *
     * @return status
     */
    @JsonProperty("status")
    public String getStatus() {
        return status;
    }

    /**
     * Sets status.
     * <p>
     * Field description:
     * Status of call recording.
     *
     * @param status
     */
    @JsonProperty("status")
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * Sets reason.
     * <p>
     * Field description:
     * Reason for recording failure.
     *
     * @param reason
     * @return This {@link CallRoutingCallRecording instance}.
     */
    public CallRoutingCallRecording reason(String reason) {
        this.reason = reason;
        return this;
    }

    /**
     * Returns reason.
     * <p>
     * Field description:
     * Reason for recording failure.
     *
     * @return reason
     */
    @JsonProperty("reason")
    public String getReason() {
        return reason;
    }

    /**
     * Sets reason.
     * <p>
     * Field description:
     * Reason for recording failure.
     *
     * @param reason
     */
    @JsonProperty("reason")
    public void setReason(String reason) {
        this.reason = reason;
    }

    /**
     * Sets files.
     * <p>
     * Field description:
     * Recording files.
     *
     * @param files
     * @return This {@link CallRoutingCallRecording instance}.
     */
    public CallRoutingCallRecording files(List<CallRoutingRecordedFile> files) {
        this.files = files;
        return this;
    }

    /**
     * Adds and item into files.
     * <p>
     * Field description:
     * Recording files.
     *
     * @param filesItem The item to be added to the list.
     * @return This {@link CallRoutingCallRecording instance}.
     */
    public CallRoutingCallRecording addFilesItem(CallRoutingRecordedFile filesItem) {
        if (this.files == null) {
            this.files = new ArrayList<>();
        }
        this.files.add(filesItem);
        return this;
    }

    /**
     * Returns files.
     * <p>
     * Field description:
     * Recording files.
     *
     * @return files
     */
    @JsonProperty("files")
    public List<CallRoutingRecordedFile> getFiles() {
        return files;
    }

    /**
     * Sets files.
     * <p>
     * Field description:
     * Recording files.
     *
     * @param files
     */
    @JsonProperty("files")
    public void setFiles(List<CallRoutingRecordedFile> files) {
        this.files = files;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CallRoutingCallRecording callRoutingCallRecording = (CallRoutingCallRecording) o;
        return Objects.equals(this.callId, callRoutingCallRecording.callId)
                && Objects.equals(this.endpoint, callRoutingCallRecording.endpoint)
                && Objects.equals(this.direction, callRoutingCallRecording.direction)
                && Objects.equals(this.status, callRoutingCallRecording.status)
                && Objects.equals(this.reason, callRoutingCallRecording.reason)
                && Objects.equals(this.files, callRoutingCallRecording.files);
    }

    @Override
    public int hashCode() {
        return Objects.hash(callId, endpoint, direction, status, reason, files);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class CallRoutingCallRecording {")
                .append(newLine)
                .append("    callId: ")
                .append(toIndentedString(callId))
                .append(newLine)
                .append("    endpoint: ")
                .append(toIndentedString(endpoint))
                .append(newLine)
                .append("    direction: ")
                .append(toIndentedString(direction))
                .append(newLine)
                .append("    status: ")
                .append(toIndentedString(status))
                .append(newLine)
                .append("    reason: ")
                .append(toIndentedString(reason))
                .append(newLine)
                .append("    files: ")
                .append(toIndentedString(files))
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
