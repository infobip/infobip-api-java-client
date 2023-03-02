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
 * Represents CallsAddNewCallRequest model.
 */
public class CallsAddNewCallRequest {

    private CallsActionCallRequest callRequest;

    private Boolean connectOnEarlyMedia;

    /**
     * Sets callRequest.
     * <p>
     * The field is required.
     *
     * @param callRequest
     * @return This {@link CallsAddNewCallRequest instance}.
     */
    public CallsAddNewCallRequest callRequest(CallsActionCallRequest callRequest) {
        this.callRequest = callRequest;
        return this;
    }

    /**
     * Returns callRequest.
     * <p>
     * The field is required.
     *
     * @return callRequest
     */
    @JsonProperty("callRequest")
    public CallsActionCallRequest getCallRequest() {
        return callRequest;
    }

    /**
     * Sets callRequest.
     * <p>
     * The field is required.
     *
     * @param callRequest
     */
    @JsonProperty("callRequest")
    public void setCallRequest(CallsActionCallRequest callRequest) {
        this.callRequest = callRequest;
    }

    /**
     * Sets connectOnEarlyMedia.
     * <p>
     * Field description:
     * Indicates whether to connect a new call on early media. Otherwise, the call will be connected after being established.
     *
     * @param connectOnEarlyMedia
     * @return This {@link CallsAddNewCallRequest instance}.
     */
    public CallsAddNewCallRequest connectOnEarlyMedia(Boolean connectOnEarlyMedia) {
        this.connectOnEarlyMedia = connectOnEarlyMedia;
        return this;
    }

    /**
     * Returns connectOnEarlyMedia.
     * <p>
     * Field description:
     * Indicates whether to connect a new call on early media. Otherwise, the call will be connected after being established.
     *
     * @return connectOnEarlyMedia
     */
    @JsonProperty("connectOnEarlyMedia")
    public Boolean getConnectOnEarlyMedia() {
        return connectOnEarlyMedia;
    }

    /**
     * Sets connectOnEarlyMedia.
     * <p>
     * Field description:
     * Indicates whether to connect a new call on early media. Otherwise, the call will be connected after being established.
     *
     * @param connectOnEarlyMedia
     */
    @JsonProperty("connectOnEarlyMedia")
    public void setConnectOnEarlyMedia(Boolean connectOnEarlyMedia) {
        this.connectOnEarlyMedia = connectOnEarlyMedia;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CallsAddNewCallRequest callsAddNewCallRequest = (CallsAddNewCallRequest) o;
        return Objects.equals(this.callRequest, callsAddNewCallRequest.callRequest)
                && Objects.equals(this.connectOnEarlyMedia, callsAddNewCallRequest.connectOnEarlyMedia);
    }

    @Override
    public int hashCode() {
        return Objects.hash(callRequest, connectOnEarlyMedia);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class CallsAddNewCallRequest {")
                .append(newLine)
                .append("    callRequest: ")
                .append(toIndentedString(callRequest))
                .append(newLine)
                .append("    connectOnEarlyMedia: ")
                .append(toIndentedString(connectOnEarlyMedia))
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
