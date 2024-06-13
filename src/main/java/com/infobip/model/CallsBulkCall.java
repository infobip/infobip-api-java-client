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
import java.util.Objects;

/**
 * Bulk call list.
 */
public class CallsBulkCall {

    private String applicationId;

    private String callId;

    private String externalId;

    private String from;

    private CallsBulkEndpoint endpoint;

    /**
     * Action status.
     */
    public enum StatusEnum {
        PENDING("PENDING"),
        IN_PROGRESS("IN_PROGRESS"),
        COMPLETED("COMPLETED"),
        FAILED("FAILED");

        private String value;

        StatusEnum(String value) {
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
        public static StatusEnum fromValue(String value) {
            for (StatusEnum enumElement : StatusEnum.values()) {
                if (enumElement.value.equals(value)) {
                    return enumElement;
                }
            }
            throw new IllegalArgumentException("Unexpected enum value '" + value + "'.");
        }
    }

    private StatusEnum status;

    private String reason;

    /**
     * Sets applicationId.
     * <p>
     * Field description:
     * Application ID.
     *
     * @param applicationId
     * @return This {@link CallsBulkCall instance}.
     */
    public CallsBulkCall applicationId(String applicationId) {
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
     * Sets callId.
     * <p>
     * Field description:
     * Unique call ID.
     *
     * @param callId
     * @return This {@link CallsBulkCall instance}.
     */
    public CallsBulkCall callId(String callId) {
        this.callId = callId;
        return this;
    }

    /**
     * Returns callId.
     * <p>
     * Field description:
     * Unique call ID.
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
     * Unique call ID.
     *
     * @param callId
     */
    @JsonProperty("callId")
    public void setCallId(String callId) {
        this.callId = callId;
    }

    /**
     * Sets externalId.
     * <p>
     * Field description:
     * Client-defined call ID.
     *
     * @param externalId
     * @return This {@link CallsBulkCall instance}.
     */
    public CallsBulkCall externalId(String externalId) {
        this.externalId = externalId;
        return this;
    }

    /**
     * Returns externalId.
     * <p>
     * Field description:
     * Client-defined call ID.
     *
     * @return externalId
     */
    @JsonProperty("externalId")
    public String getExternalId() {
        return externalId;
    }

    /**
     * Sets externalId.
     * <p>
     * Field description:
     * Client-defined call ID.
     *
     * @param externalId
     */
    @JsonProperty("externalId")
    public void setExternalId(String externalId) {
        this.externalId = externalId;
    }

    /**
     * Sets from.
     * <p>
     * Field description:
     * Caller identifier.
     *
     * @param from
     * @return This {@link CallsBulkCall instance}.
     */
    public CallsBulkCall from(String from) {
        this.from = from;
        return this;
    }

    /**
     * Returns from.
     * <p>
     * Field description:
     * Caller identifier.
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
     * Caller identifier.
     *
     * @param from
     */
    @JsonProperty("from")
    public void setFrom(String from) {
        this.from = from;
    }

    /**
     * Sets endpoint.
     *
     * @param endpoint
     * @return This {@link CallsBulkCall instance}.
     */
    public CallsBulkCall endpoint(CallsBulkEndpoint endpoint) {
        this.endpoint = endpoint;
        return this;
    }

    /**
     * Returns endpoint.
     *
     * @return endpoint
     */
    @JsonProperty("endpoint")
    public CallsBulkEndpoint getEndpoint() {
        return endpoint;
    }

    /**
     * Sets endpoint.
     *
     * @param endpoint
     */
    @JsonProperty("endpoint")
    public void setEndpoint(CallsBulkEndpoint endpoint) {
        this.endpoint = endpoint;
    }

    /**
     * Sets status.
     * <p>
     * Field description:
     * Action status.
     *
     * @param status
     * @return This {@link CallsBulkCall instance}.
     */
    public CallsBulkCall status(StatusEnum status) {
        this.status = status;
        return this;
    }

    /**
     * Returns status.
     * <p>
     * Field description:
     * Action status.
     *
     * @return status
     */
    @JsonProperty("status")
    public StatusEnum getStatus() {
        return status;
    }

    /**
     * Sets status.
     * <p>
     * Field description:
     * Action status.
     *
     * @param status
     */
    @JsonProperty("status")
    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    /**
     * Sets reason.
     * <p>
     * Field description:
     * Failure reason in human-readable format.
     *
     * @param reason
     * @return This {@link CallsBulkCall instance}.
     */
    public CallsBulkCall reason(String reason) {
        this.reason = reason;
        return this;
    }

    /**
     * Returns reason.
     * <p>
     * Field description:
     * Failure reason in human-readable format.
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
     * Failure reason in human-readable format.
     *
     * @param reason
     */
    @JsonProperty("reason")
    public void setReason(String reason) {
        this.reason = reason;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CallsBulkCall callsBulkCall = (CallsBulkCall) o;
        return Objects.equals(this.applicationId, callsBulkCall.applicationId)
                && Objects.equals(this.callId, callsBulkCall.callId)
                && Objects.equals(this.externalId, callsBulkCall.externalId)
                && Objects.equals(this.from, callsBulkCall.from)
                && Objects.equals(this.endpoint, callsBulkCall.endpoint)
                && Objects.equals(this.status, callsBulkCall.status)
                && Objects.equals(this.reason, callsBulkCall.reason);
    }

    @Override
    public int hashCode() {
        return Objects.hash(applicationId, callId, externalId, from, endpoint, status, reason);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class CallsBulkCall {")
                .append(newLine)
                .append("    applicationId: ")
                .append(toIndentedString(applicationId))
                .append(newLine)
                .append("    callId: ")
                .append(toIndentedString(callId))
                .append(newLine)
                .append("    externalId: ")
                .append(toIndentedString(externalId))
                .append(newLine)
                .append("    from: ")
                .append(toIndentedString(from))
                .append(newLine)
                .append("    endpoint: ")
                .append(toIndentedString(endpoint))
                .append(newLine)
                .append("    status: ")
                .append(toIndentedString(status))
                .append(newLine)
                .append("    reason: ")
                .append(toIndentedString(reason))
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
