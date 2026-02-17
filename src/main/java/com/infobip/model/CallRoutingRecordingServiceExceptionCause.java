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
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Represents CallRoutingRecordingServiceExceptionCause model.
 */
@JsonTypeName("CallRoutingRecordingServiceException_cause")
public class CallRoutingRecordingServiceExceptionCause {

    private List<CallRoutingRecordingServiceExceptionCauseStackTraceInner> stackTrace = null;

    private String message;

    private String localizedMessage;

    /**
     * Sets stackTrace.
     *
     * @param stackTrace
     * @return This {@link CallRoutingRecordingServiceExceptionCause instance}.
     */
    public CallRoutingRecordingServiceExceptionCause stackTrace(
            List<CallRoutingRecordingServiceExceptionCauseStackTraceInner> stackTrace) {
        this.stackTrace = stackTrace;
        return this;
    }

    /**
     * Adds and item into stackTrace.
     *
     * @param stackTraceItem The item to be added to the list.
     * @return This {@link CallRoutingRecordingServiceExceptionCause instance}.
     */
    public CallRoutingRecordingServiceExceptionCause addStackTraceItem(
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
     * @return This {@link CallRoutingRecordingServiceExceptionCause instance}.
     */
    public CallRoutingRecordingServiceExceptionCause message(String message) {
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
     * Sets localizedMessage.
     *
     * @param localizedMessage
     * @return This {@link CallRoutingRecordingServiceExceptionCause instance}.
     */
    public CallRoutingRecordingServiceExceptionCause localizedMessage(String localizedMessage) {
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
        CallRoutingRecordingServiceExceptionCause callRoutingRecordingServiceExceptionCause =
                (CallRoutingRecordingServiceExceptionCause) o;
        return Objects.equals(this.stackTrace, callRoutingRecordingServiceExceptionCause.stackTrace)
                && Objects.equals(this.message, callRoutingRecordingServiceExceptionCause.message)
                && Objects.equals(this.localizedMessage, callRoutingRecordingServiceExceptionCause.localizedMessage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(stackTrace, message, localizedMessage);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class CallRoutingRecordingServiceExceptionCause {")
                .append(newLine)
                .append("    stackTrace: ")
                .append(toIndentedString(stackTrace))
                .append(newLine)
                .append("    message: ")
                .append(toIndentedString(message))
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
