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
 * Callback request.
 */
public class CallbackRequest {

    private String from;

    private String to;

    private String correlationId;

    private String nmCorrelationId;

    private Boolean dtmfCaptured;

    /**
     * Sets from.
     * <p>
     * Field description:
     * Caller phone number.
     *
     * @param from
     * @return This {@link CallbackRequest instance}.
     */
    public CallbackRequest from(String from) {
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
     * @return This {@link CallbackRequest instance}.
     */
    public CallbackRequest to(String to) {
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
     * Sets correlationId.
     * <p>
     * Field description:
     * Unique identifier of the call record, available for both Callback and Status requests.
     *
     * @param correlationId
     * @return This {@link CallbackRequest instance}.
     */
    public CallbackRequest correlationId(String correlationId) {
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
     * Sets nmCorrelationId.
     * <p>
     * Field description:
     * Unique identifier for correlation with inbound call, available in Callback and Status requests.
     *
     * @param nmCorrelationId
     * @return This {@link CallbackRequest instance}.
     */
    public CallbackRequest nmCorrelationId(String nmCorrelationId) {
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
     * Sets dtmfCaptured.
     * <p>
     * Field description:
     * Indicates that this callback request is initiated after the &#x60;captureDtmf&#x60; command is executed. Not present in the first callback request for the call.
     *
     * @param dtmfCaptured
     * @return This {@link CallbackRequest instance}.
     */
    public CallbackRequest dtmfCaptured(Boolean dtmfCaptured) {
        this.dtmfCaptured = dtmfCaptured;
        return this;
    }

    /**
     * Returns dtmfCaptured.
     * <p>
     * Field description:
     * Indicates that this callback request is initiated after the &#x60;captureDtmf&#x60; command is executed. Not present in the first callback request for the call.
     *
     * @return dtmfCaptured
     */
    @JsonProperty("dtmfCaptured")
    public Boolean getDtmfCaptured() {
        return dtmfCaptured;
    }

    /**
     * Sets dtmfCaptured.
     * <p>
     * Field description:
     * Indicates that this callback request is initiated after the &#x60;captureDtmf&#x60; command is executed. Not present in the first callback request for the call.
     *
     * @param dtmfCaptured
     */
    @JsonProperty("dtmfCaptured")
    public void setDtmfCaptured(Boolean dtmfCaptured) {
        this.dtmfCaptured = dtmfCaptured;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CallbackRequest callbackRequest = (CallbackRequest) o;
        return Objects.equals(this.from, callbackRequest.from)
                && Objects.equals(this.to, callbackRequest.to)
                && Objects.equals(this.correlationId, callbackRequest.correlationId)
                && Objects.equals(this.nmCorrelationId, callbackRequest.nmCorrelationId)
                && Objects.equals(this.dtmfCaptured, callbackRequest.dtmfCaptured);
    }

    @Override
    public int hashCode() {
        return Objects.hash(from, to, correlationId, nmCorrelationId, dtmfCaptured);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class CallbackRequest {")
                .append(newLine)
                .append("    from: ")
                .append(toIndentedString(from))
                .append(newLine)
                .append("    to: ")
                .append(toIndentedString(to))
                .append(newLine)
                .append("    correlationId: ")
                .append(toIndentedString(correlationId))
                .append(newLine)
                .append("    nmCorrelationId: ")
                .append(toIndentedString(nmCorrelationId))
                .append(newLine)
                .append("    dtmfCaptured: ")
                .append(toIndentedString(dtmfCaptured))
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
