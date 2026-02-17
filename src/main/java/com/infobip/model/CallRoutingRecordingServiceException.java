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
 * Represents CallRoutingRecordingServiceException model.
 */
public class CallRoutingRecordingServiceException {

    private CallRoutingRecordingServiceExceptionCause cause;

    private List<CallRoutingRecordingServiceExceptionCauseStackTraceInner> stackTrace = null;

    private String message;

    private List<CallRoutingRecordingServiceExceptionCause> suppressed = null;

    private String localizedMessage;

    /**
     * Sets cause.
     *
     * @param cause
     * @return This {@link CallRoutingRecordingServiceException instance}.
     */
    public CallRoutingRecordingServiceException cause(CallRoutingRecordingServiceExceptionCause cause) {
        this.cause = cause;
        return this;
    }

    /**
     * Returns cause.
     *
     * @return cause
     */
    @JsonProperty("cause")
    public CallRoutingRecordingServiceExceptionCause getCause() {
        return cause;
    }

    /**
     * Sets cause.
     *
     * @param cause
     */
    @JsonProperty("cause")
    public void setCause(CallRoutingRecordingServiceExceptionCause cause) {
        this.cause = cause;
    }

    /**
     * Sets stackTrace.
     *
     * @param stackTrace
     * @return This {@link CallRoutingRecordingServiceException instance}.
     */
    public CallRoutingRecordingServiceException stackTrace(
            List<CallRoutingRecordingServiceExceptionCauseStackTraceInner> stackTrace) {
        this.stackTrace = stackTrace;
        return this;
    }

    /**
     * Adds and item into stackTrace.
     *
     * @param stackTraceItem The item to be added to the list.
     * @return This {@link CallRoutingRecordingServiceException instance}.
     */
    public CallRoutingRecordingServiceException addStackTraceItem(
            CallRoutingRecordingServiceExceptionCauseStackTraceInner stackTraceItem) {
        if (this.stackTrace == null) {
            this.stackTrace = new ArrayList<>();
        }
        this.stackTrace.add(stackTraceItem);
        return this;
    }

    /**
     * Returns stackTrace.
     *
     * @return stackTrace
     */
    @JsonProperty("stackTrace")
    public List<CallRoutingRecordingServiceExceptionCauseStackTraceInner> getStackTrace() {
        return stackTrace;
    }

    /**
     * Sets stackTrace.
     *
     * @param stackTrace
     */
    @JsonProperty("stackTrace")
    public void setStackTrace(List<CallRoutingRecordingServiceExceptionCauseStackTraceInner> stackTrace) {
        this.stackTrace = stackTrace;
    }

    /**
     * Sets message.
     *
     * @param message
     * @return This {@link CallRoutingRecordingServiceException instance}.
     */
    public CallRoutingRecordingServiceException message(String message) {
        this.message = message;
        return this;
    }

    /**
     * Returns message.
     *
     * @return message
     */
    @JsonProperty("message")
    public String getMessage() {
        return message;
    }

    /**
     * Sets message.
     *
     * @param message
     */
    @JsonProperty("message")
    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * Sets suppressed.
     *
     * @param suppressed
     * @return This {@link CallRoutingRecordingServiceException instance}.
     */
    public CallRoutingRecordingServiceException suppressed(List<CallRoutingRecordingServiceExceptionCause> suppressed) {
        this.suppressed = suppressed;
        return this;
    }

    /**
     * Adds and item into suppressed.
     *
     * @param suppressedItem The item to be added to the list.
     * @return This {@link CallRoutingRecordingServiceException instance}.
     */
    public CallRoutingRecordingServiceException addSuppressedItem(
            CallRoutingRecordingServiceExceptionCause suppressedItem) {
        if (this.suppressed == null) {
            this.suppressed = new ArrayList<>();
        }
        this.suppressed.add(suppressedItem);
        return this;
    }

    /**
     * Returns suppressed.
     *
     * @return suppressed
     */
    @JsonProperty("suppressed")
    public List<CallRoutingRecordingServiceExceptionCause> getSuppressed() {
        return suppressed;
    }

    /**
     * Sets suppressed.
     *
     * @param suppressed
     */
    @JsonProperty("suppressed")
    public void setSuppressed(List<CallRoutingRecordingServiceExceptionCause> suppressed) {
        this.suppressed = suppressed;
    }

    /**
     * Sets localizedMessage.
     *
     * @param localizedMessage
     * @return This {@link CallRoutingRecordingServiceException instance}.
     */
    public CallRoutingRecordingServiceException localizedMessage(String localizedMessage) {
        this.localizedMessage = localizedMessage;
        return this;
    }

    /**
     * Returns localizedMessage.
     *
     * @return localizedMessage
     */
    @JsonProperty("localizedMessage")
    public String getLocalizedMessage() {
        return localizedMessage;
    }

    /**
     * Sets localizedMessage.
     *
     * @param localizedMessage
     */
    @JsonProperty("localizedMessage")
    public void setLocalizedMessage(String localizedMessage) {
        this.localizedMessage = localizedMessage;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CallRoutingRecordingServiceException callRoutingRecordingServiceException =
                (CallRoutingRecordingServiceException) o;
        return Objects.equals(this.cause, callRoutingRecordingServiceException.cause)
                && Objects.equals(this.stackTrace, callRoutingRecordingServiceException.stackTrace)
                && Objects.equals(this.message, callRoutingRecordingServiceException.message)
                && Objects.equals(this.suppressed, callRoutingRecordingServiceException.suppressed)
                && Objects.equals(this.localizedMessage, callRoutingRecordingServiceException.localizedMessage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cause, stackTrace, message, suppressed, localizedMessage);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class CallRoutingRecordingServiceException {")
                .append(newLine)
                .append("    cause: ")
                .append(toIndentedString(cause))
                .append(newLine)
                .append("    stackTrace: ")
                .append(toIndentedString(stackTrace))
                .append(newLine)
                .append("    message: ")
                .append(toIndentedString(message))
                .append(newLine)
                .append("    suppressed: ")
                .append(toIndentedString(suppressed))
                .append(newLine)
                .append("    localizedMessage: ")
                .append(toIndentedString(localizedMessage))
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
