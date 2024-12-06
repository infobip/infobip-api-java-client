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
 * Status request.
 */
public class NumberMaskingStatusRequest {

    private String action;

    private String from;

    private String to;

    private String transferTo;

    private Integer duration;

    private String status;

    private String nmCorrelationId;

    private String fileID;

    private String fileUrl;

    private String ringingTime;

    private String answeredTime;

    private String correlationId;

    private Integer inboundDuration;

    private Integer calculatedDuration;

    private Double pricePerSecond;

    private String currency;

    private String recordingFileId;

    private Boolean recordCalleeAnnouncement;

    private NumberMaskingRecordingStatus recordingStatus;

    private String clientReferenceId;

    /**
     * Sets action.
     * <p>
     * Field description:
     * Requested action (dial, audio, captureDtmf).
     *
     * @param action
     * @return This {@link NumberMaskingStatusRequest instance}.
     */
    public NumberMaskingStatusRequest action(String action) {
        this.action = action;
        return this;
    }

    /**
     * Returns action.
     * <p>
     * Field description:
     * Requested action (dial, audio, captureDtmf).
     *
     * @return action
     */
    @JsonProperty("action")
    public String getAction() {
        return action;
    }

    /**
     * Sets action.
     * <p>
     * Field description:
     * Requested action (dial, audio, captureDtmf).
     *
     * @param action
     */
    @JsonProperty("action")
    public void setAction(String action) {
        this.action = action;
    }

    /**
     * Sets from.
     * <p>
     * Field description:
     * Caller phone number.
     *
     * @param from
     * @return This {@link NumberMaskingStatusRequest instance}.
     */
    public NumberMaskingStatusRequest from(String from) {
        this.from = from;
        return this;
    }

    /**
     * Returns from.
     * <p>
     * Field description:
     * Caller phone number.
     *
     * @return from
     */
    @JsonProperty("from")
    public String getFrom() {
        return from;
    }

    /**
     * Sets from.
     * <p>
     * Field description:
     * Caller phone number.
     *
     * @param from
     */
    @JsonProperty("from")
    public void setFrom(String from) {
        this.from = from;
    }

    /**
     * Sets to.
     * <p>
     * Field description:
     * Called phone number.
     *
     * @param to
     * @return This {@link NumberMaskingStatusRequest instance}.
     */
    public NumberMaskingStatusRequest to(String to) {
        this.to = to;
        return this;
    }

    /**
     * Returns to.
     * <p>
     * Field description:
     * Called phone number.
     *
     * @return to
     */
    @JsonProperty("to")
    public String getTo() {
        return to;
    }

    /**
     * Sets to.
     * <p>
     * Field description:
     * Called phone number.
     *
     * @param to
     */
    @JsonProperty("to")
    public void setTo(String to) {
        this.to = to;
    }

    /**
     * Sets transferTo.
     * <p>
     * Field description:
     * Called party phone number that the call is transferred to.
     *
     * @param transferTo
     * @return This {@link NumberMaskingStatusRequest instance}.
     */
    public NumberMaskingStatusRequest transferTo(String transferTo) {
        this.transferTo = transferTo;
        return this;
    }

    /**
     * Returns transferTo.
     * <p>
     * Field description:
     * Called party phone number that the call is transferred to.
     *
     * @return transferTo
     */
    @JsonProperty("transferTo")
    public String getTransferTo() {
        return transferTo;
    }

    /**
     * Sets transferTo.
     * <p>
     * Field description:
     * Called party phone number that the call is transferred to.
     *
     * @param transferTo
     */
    @JsonProperty("transferTo")
    public void setTransferTo(String transferTo) {
        this.transferTo = transferTo;
    }

    /**
     * Sets duration.
     * <p>
     * Field description:
     * Duration of the outbound call shown in seconds
     *
     * @param duration
     * @return This {@link NumberMaskingStatusRequest instance}.
     */
    public NumberMaskingStatusRequest duration(Integer duration) {
        this.duration = duration;
        return this;
    }

    /**
     * Returns duration.
     * <p>
     * Field description:
     * Duration of the outbound call shown in seconds
     *
     * @return duration
     */
    @JsonProperty("duration")
    public Integer getDuration() {
        return duration;
    }

    /**
     * Sets duration.
     * <p>
     * Field description:
     * Duration of the outbound call shown in seconds
     *
     * @param duration
     */
    @JsonProperty("duration")
    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    /**
     * Sets status.
     * <p>
     * Field description:
     * Call status which can be: answered, busy, no answer, failed or congestion
     *
     * @param status
     * @return This {@link NumberMaskingStatusRequest instance}.
     */
    public NumberMaskingStatusRequest status(String status) {
        this.status = status;
        return this;
    }

    /**
     * Returns status.
     * <p>
     * Field description:
     * Call status which can be: answered, busy, no answer, failed or congestion
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
     * Call status which can be: answered, busy, no answer, failed or congestion
     *
     * @param status
     */
    @JsonProperty("status")
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * Sets nmCorrelationId.
     * <p>
     * Field description:
     * Unique identifier for correlation with inbound call, available in Callback and Status requests.
     *
     * @param nmCorrelationId
     * @return This {@link NumberMaskingStatusRequest instance}.
     */
    public NumberMaskingStatusRequest nmCorrelationId(String nmCorrelationId) {
        this.nmCorrelationId = nmCorrelationId;
        return this;
    }

    /**
     * Returns nmCorrelationId.
     * <p>
     * Field description:
     * Unique identifier for correlation with inbound call, available in Callback and Status requests.
     *
     * @return nmCorrelationId
     */
    @JsonProperty("nmCorrelationId")
    public String getNmCorrelationId() {
        return nmCorrelationId;
    }

    /**
     * Sets nmCorrelationId.
     * <p>
     * Field description:
     * Unique identifier for correlation with inbound call, available in Callback and Status requests.
     *
     * @param nmCorrelationId
     */
    @JsonProperty("nmCorrelationId")
    public void setNmCorrelationId(String nmCorrelationId) {
        this.nmCorrelationId = nmCorrelationId;
    }

    /**
     * Sets fileID.
     * <p>
     * Field description:
     * Identifier of the file played to the caller.
     *
     * @param fileID
     * @return This {@link NumberMaskingStatusRequest instance}.
     */
    public NumberMaskingStatusRequest fileID(String fileID) {
        this.fileID = fileID;
        return this;
    }

    /**
     * Returns fileID.
     * <p>
     * Field description:
     * Identifier of the file played to the caller.
     *
     * @return fileID
     */
    @JsonProperty("fileID")
    public String getFileID() {
        return fileID;
    }

    /**
     * Sets fileID.
     * <p>
     * Field description:
     * Identifier of the file played to the caller.
     *
     * @param fileID
     */
    @JsonProperty("fileID")
    public void setFileID(String fileID) {
        this.fileID = fileID;
    }

    /**
     * Sets fileUrl.
     * <p>
     * Field description:
     * The URL of the file played to the caller.
     *
     * @param fileUrl
     * @return This {@link NumberMaskingStatusRequest instance}.
     */
    public NumberMaskingStatusRequest fileUrl(String fileUrl) {
        this.fileUrl = fileUrl;
        return this;
    }

    /**
     * Returns fileUrl.
     * <p>
     * Field description:
     * The URL of the file played to the caller.
     *
     * @return fileUrl
     */
    @JsonProperty("fileUrl")
    public String getFileUrl() {
        return fileUrl;
    }

    /**
     * Sets fileUrl.
     * <p>
     * Field description:
     * The URL of the file played to the caller.
     *
     * @param fileUrl
     */
    @JsonProperty("fileUrl")
    public void setFileUrl(String fileUrl) {
        this.fileUrl = fileUrl;
    }

    /**
     * Sets ringingTime.
     * <p>
     * Field description:
     * Date and time when ringing started.
     *
     * @param ringingTime
     * @return This {@link NumberMaskingStatusRequest instance}.
     */
    public NumberMaskingStatusRequest ringingTime(String ringingTime) {
        this.ringingTime = ringingTime;
        return this;
    }

    /**
     * Returns ringingTime.
     * <p>
     * Field description:
     * Date and time when ringing started.
     *
     * @return ringingTime
     */
    @JsonProperty("ringingTime")
    public String getRingingTime() {
        return ringingTime;
    }

    /**
     * Sets ringingTime.
     * <p>
     * Field description:
     * Date and time when ringing started.
     *
     * @param ringingTime
     */
    @JsonProperty("ringingTime")
    public void setRingingTime(String ringingTime) {
        this.ringingTime = ringingTime;
    }

    /**
     * Sets answeredTime.
     * <p>
     * Field description:
     * Date and time when the call was answered.
     *
     * @param answeredTime
     * @return This {@link NumberMaskingStatusRequest instance}.
     */
    public NumberMaskingStatusRequest answeredTime(String answeredTime) {
        this.answeredTime = answeredTime;
        return this;
    }

    /**
     * Returns answeredTime.
     * <p>
     * Field description:
     * Date and time when the call was answered.
     *
     * @return answeredTime
     */
    @JsonProperty("answeredTime")
    public String getAnsweredTime() {
        return answeredTime;
    }

    /**
     * Sets answeredTime.
     * <p>
     * Field description:
     * Date and time when the call was answered.
     *
     * @param answeredTime
     */
    @JsonProperty("answeredTime")
    public void setAnsweredTime(String answeredTime) {
        this.answeredTime = answeredTime;
    }

    /**
     * Sets correlationId.
     * <p>
     * Field description:
     * Unique identifier of the call record, available for both Callback and Status requests.
     *
     * @param correlationId
     * @return This {@link NumberMaskingStatusRequest instance}.
     */
    public NumberMaskingStatusRequest correlationId(String correlationId) {
        this.correlationId = correlationId;
        return this;
    }

    /**
     * Returns correlationId.
     * <p>
     * Field description:
     * Unique identifier of the call record, available for both Callback and Status requests.
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
     * Unique identifier of the call record, available for both Callback and Status requests.
     *
     * @param correlationId
     */
    @JsonProperty("correlationId")
    public void setCorrelationId(String correlationId) {
        this.correlationId = correlationId;
    }

    /**
     * Sets inboundDuration.
     * <p>
     * Field description:
     * Duration of the inbound call shown in seconds.
     *
     * @param inboundDuration
     * @return This {@link NumberMaskingStatusRequest instance}.
     */
    public NumberMaskingStatusRequest inboundDuration(Integer inboundDuration) {
        this.inboundDuration = inboundDuration;
        return this;
    }

    /**
     * Returns inboundDuration.
     * <p>
     * Field description:
     * Duration of the inbound call shown in seconds.
     *
     * @return inboundDuration
     */
    @JsonProperty("inboundDuration")
    public Integer getInboundDuration() {
        return inboundDuration;
    }

    /**
     * Sets inboundDuration.
     * <p>
     * Field description:
     * Duration of the inbound call shown in seconds.
     *
     * @param inboundDuration
     */
    @JsonProperty("inboundDuration")
    public void setInboundDuration(Integer inboundDuration) {
        this.inboundDuration = inboundDuration;
    }

    /**
     * Sets calculatedDuration.
     * <p>
     * Field description:
     * The duration of the outbound part of the number masking session, where the voice billing model (1/1, 15/15,...) has been applied to the calculatedDuration.
     *
     * @param calculatedDuration
     * @return This {@link NumberMaskingStatusRequest instance}.
     */
    public NumberMaskingStatusRequest calculatedDuration(Integer calculatedDuration) {
        this.calculatedDuration = calculatedDuration;
        return this;
    }

    /**
     * Returns calculatedDuration.
     * <p>
     * Field description:
     * The duration of the outbound part of the number masking session, where the voice billing model (1/1, 15/15,...) has been applied to the calculatedDuration.
     *
     * @return calculatedDuration
     */
    @JsonProperty("calculatedDuration")
    public Integer getCalculatedDuration() {
        return calculatedDuration;
    }

    /**
     * Sets calculatedDuration.
     * <p>
     * Field description:
     * The duration of the outbound part of the number masking session, where the voice billing model (1/1, 15/15,...) has been applied to the calculatedDuration.
     *
     * @param calculatedDuration
     */
    @JsonProperty("calculatedDuration")
    public void setCalculatedDuration(Integer calculatedDuration) {
        this.calculatedDuration = calculatedDuration;
    }

    /**
     * Sets pricePerSecond.
     * <p>
     * Field description:
     * This is the price per second for the outbound part of the number masking session, with the price being expressed in cents per second.
     *
     * @param pricePerSecond
     * @return This {@link NumberMaskingStatusRequest instance}.
     */
    public NumberMaskingStatusRequest pricePerSecond(Double pricePerSecond) {
        this.pricePerSecond = pricePerSecond;
        return this;
    }

    /**
     * Returns pricePerSecond.
     * <p>
     * Field description:
     * This is the price per second for the outbound part of the number masking session, with the price being expressed in cents per second.
     *
     * @return pricePerSecond
     */
    @JsonProperty("pricePerSecond")
    public Double getPricePerSecond() {
        return pricePerSecond;
    }

    /**
     * Sets pricePerSecond.
     * <p>
     * Field description:
     * This is the price per second for the outbound part of the number masking session, with the price being expressed in cents per second.
     *
     * @param pricePerSecond
     */
    @JsonProperty("pricePerSecond")
    public void setPricePerSecond(Double pricePerSecond) {
        this.pricePerSecond = pricePerSecond;
    }

    /**
     * Sets currency.
     * <p>
     * Field description:
     * The currency in which the price is expressed.
     *
     * @param currency
     * @return This {@link NumberMaskingStatusRequest instance}.
     */
    public NumberMaskingStatusRequest currency(String currency) {
        this.currency = currency;
        return this;
    }

    /**
     * Returns currency.
     * <p>
     * Field description:
     * The currency in which the price is expressed.
     *
     * @return currency
     */
    @JsonProperty("currency")
    public String getCurrency() {
        return currency;
    }

    /**
     * Sets currency.
     * <p>
     * Field description:
     * The currency in which the price is expressed.
     *
     * @param currency
     */
    @JsonProperty("currency")
    public void setCurrency(String currency) {
        this.currency = currency;
    }

    /**
     * Sets recordingFileId.
     * <p>
     * Field description:
     * ID of a recording file of a call.
     *
     * @param recordingFileId
     * @return This {@link NumberMaskingStatusRequest instance}.
     */
    public NumberMaskingStatusRequest recordingFileId(String recordingFileId) {
        this.recordingFileId = recordingFileId;
        return this;
    }

    /**
     * Returns recordingFileId.
     * <p>
     * Field description:
     * ID of a recording file of a call.
     *
     * @return recordingFileId
     */
    @JsonProperty("recordingFileId")
    public String getRecordingFileId() {
        return recordingFileId;
    }

    /**
     * Sets recordingFileId.
     * <p>
     * Field description:
     * ID of a recording file of a call.
     *
     * @param recordingFileId
     */
    @JsonProperty("recordingFileId")
    public void setRecordingFileId(String recordingFileId) {
        this.recordingFileId = recordingFileId;
    }

    /**
     * Sets recordCalleeAnnouncement.
     * <p>
     * Field description:
     * Flag that indicates if callee announcement is included in recording file.
     *
     * @param recordCalleeAnnouncement
     * @return This {@link NumberMaskingStatusRequest instance}.
     */
    public NumberMaskingStatusRequest recordCalleeAnnouncement(Boolean recordCalleeAnnouncement) {
        this.recordCalleeAnnouncement = recordCalleeAnnouncement;
        return this;
    }

    /**
     * Returns recordCalleeAnnouncement.
     * <p>
     * Field description:
     * Flag that indicates if callee announcement is included in recording file.
     *
     * @return recordCalleeAnnouncement
     */
    @JsonProperty("recordCalleeAnnouncement")
    public Boolean getRecordCalleeAnnouncement() {
        return recordCalleeAnnouncement;
    }

    /**
     * Sets recordCalleeAnnouncement.
     * <p>
     * Field description:
     * Flag that indicates if callee announcement is included in recording file.
     *
     * @param recordCalleeAnnouncement
     */
    @JsonProperty("recordCalleeAnnouncement")
    public void setRecordCalleeAnnouncement(Boolean recordCalleeAnnouncement) {
        this.recordCalleeAnnouncement = recordCalleeAnnouncement;
    }

    /**
     * Sets recordingStatus.
     *
     * @param recordingStatus
     * @return This {@link NumberMaskingStatusRequest instance}.
     */
    public NumberMaskingStatusRequest recordingStatus(NumberMaskingRecordingStatus recordingStatus) {
        this.recordingStatus = recordingStatus;
        return this;
    }

    /**
     * Returns recordingStatus.
     *
     * @return recordingStatus
     */
    @JsonProperty("recordingStatus")
    public NumberMaskingRecordingStatus getRecordingStatus() {
        return recordingStatus;
    }

    /**
     * Sets recordingStatus.
     *
     * @param recordingStatus
     */
    @JsonProperty("recordingStatus")
    public void setRecordingStatus(NumberMaskingRecordingStatus recordingStatus) {
        this.recordingStatus = recordingStatus;
    }

    /**
     * Sets clientReferenceId.
     * <p>
     * Field description:
     * Client-defined ID of a valid file name. Used to correlate a call with this reference. If recording is enabled and files are stored in the SFTP server, that ID will be used as a file name instead.
     *
     * @param clientReferenceId
     * @return This {@link NumberMaskingStatusRequest instance}.
     */
    public NumberMaskingStatusRequest clientReferenceId(String clientReferenceId) {
        this.clientReferenceId = clientReferenceId;
        return this;
    }

    /**
     * Returns clientReferenceId.
     * <p>
     * Field description:
     * Client-defined ID of a valid file name. Used to correlate a call with this reference. If recording is enabled and files are stored in the SFTP server, that ID will be used as a file name instead.
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
     * Client-defined ID of a valid file name. Used to correlate a call with this reference. If recording is enabled and files are stored in the SFTP server, that ID will be used as a file name instead.
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
        NumberMaskingStatusRequest numberMaskingStatusRequest = (NumberMaskingStatusRequest) o;
        return Objects.equals(this.action, numberMaskingStatusRequest.action)
                && Objects.equals(this.from, numberMaskingStatusRequest.from)
                && Objects.equals(this.to, numberMaskingStatusRequest.to)
                && Objects.equals(this.transferTo, numberMaskingStatusRequest.transferTo)
                && Objects.equals(this.duration, numberMaskingStatusRequest.duration)
                && Objects.equals(this.status, numberMaskingStatusRequest.status)
                && Objects.equals(this.nmCorrelationId, numberMaskingStatusRequest.nmCorrelationId)
                && Objects.equals(this.fileID, numberMaskingStatusRequest.fileID)
                && Objects.equals(this.fileUrl, numberMaskingStatusRequest.fileUrl)
                && Objects.equals(this.ringingTime, numberMaskingStatusRequest.ringingTime)
                && Objects.equals(this.answeredTime, numberMaskingStatusRequest.answeredTime)
                && Objects.equals(this.correlationId, numberMaskingStatusRequest.correlationId)
                && Objects.equals(this.inboundDuration, numberMaskingStatusRequest.inboundDuration)
                && Objects.equals(this.calculatedDuration, numberMaskingStatusRequest.calculatedDuration)
                && Objects.equals(this.pricePerSecond, numberMaskingStatusRequest.pricePerSecond)
                && Objects.equals(this.currency, numberMaskingStatusRequest.currency)
                && Objects.equals(this.recordingFileId, numberMaskingStatusRequest.recordingFileId)
                && Objects.equals(this.recordCalleeAnnouncement, numberMaskingStatusRequest.recordCalleeAnnouncement)
                && Objects.equals(this.recordingStatus, numberMaskingStatusRequest.recordingStatus)
                && Objects.equals(this.clientReferenceId, numberMaskingStatusRequest.clientReferenceId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                action,
                from,
                to,
                transferTo,
                duration,
                status,
                nmCorrelationId,
                fileID,
                fileUrl,
                ringingTime,
                answeredTime,
                correlationId,
                inboundDuration,
                calculatedDuration,
                pricePerSecond,
                currency,
                recordingFileId,
                recordCalleeAnnouncement,
                recordingStatus,
                clientReferenceId);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class NumberMaskingStatusRequest {")
                .append(newLine)
                .append("    action: ")
                .append(toIndentedString(action))
                .append(newLine)
                .append("    from: ")
                .append(toIndentedString(from))
                .append(newLine)
                .append("    to: ")
                .append(toIndentedString(to))
                .append(newLine)
                .append("    transferTo: ")
                .append(toIndentedString(transferTo))
                .append(newLine)
                .append("    duration: ")
                .append(toIndentedString(duration))
                .append(newLine)
                .append("    status: ")
                .append(toIndentedString(status))
                .append(newLine)
                .append("    nmCorrelationId: ")
                .append(toIndentedString(nmCorrelationId))
                .append(newLine)
                .append("    fileID: ")
                .append(toIndentedString(fileID))
                .append(newLine)
                .append("    fileUrl: ")
                .append(toIndentedString(fileUrl))
                .append(newLine)
                .append("    ringingTime: ")
                .append(toIndentedString(ringingTime))
                .append(newLine)
                .append("    answeredTime: ")
                .append(toIndentedString(answeredTime))
                .append(newLine)
                .append("    correlationId: ")
                .append(toIndentedString(correlationId))
                .append(newLine)
                .append("    inboundDuration: ")
                .append(toIndentedString(inboundDuration))
                .append(newLine)
                .append("    calculatedDuration: ")
                .append(toIndentedString(calculatedDuration))
                .append(newLine)
                .append("    pricePerSecond: ")
                .append(toIndentedString(pricePerSecond))
                .append(newLine)
                .append("    currency: ")
                .append(toIndentedString(currency))
                .append(newLine)
                .append("    recordingFileId: ")
                .append(toIndentedString(recordingFileId))
                .append(newLine)
                .append("    recordCalleeAnnouncement: ")
                .append(toIndentedString(recordCalleeAnnouncement))
                .append(newLine)
                .append("    recordingStatus: ")
                .append(toIndentedString(recordingStatus))
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
