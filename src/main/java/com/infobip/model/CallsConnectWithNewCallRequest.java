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
 * Represents CallsConnectWithNewCallRequest model.
 */
public class CallsConnectWithNewCallRequest {

    private CallsActionCallRequest callRequest;

    private Boolean connectOnEarlyMedia;

    private RingbackGeneration ringbackGeneration;

    private CallsActionConferenceRequest conferenceRequest;

    /**
     * Sets callRequest.
     *
     * @param callRequest
     * @return This {@link CallsConnectWithNewCallRequest instance}.
     */
    public CallsConnectWithNewCallRequest callRequest(CallsActionCallRequest callRequest) {
        this.callRequest = callRequest;
        return this;
    }

    /**
     * Returns callRequest.
     *
     * @return callRequest
     */
    @JsonProperty("callRequest")
    public CallsActionCallRequest getCallRequest() {
        return callRequest;
    }

    /**
     * Sets callRequest.
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
     * Indicates whether to connect calls on early media. Otherwise, the calls are connected after being established. Cannot be &#x60;true&#x60; when &#x60;ringbackGeneration&#x60; is enabled.
     *
     * @param connectOnEarlyMedia
     * @return This {@link CallsConnectWithNewCallRequest instance}.
     */
    public CallsConnectWithNewCallRequest connectOnEarlyMedia(Boolean connectOnEarlyMedia) {
        this.connectOnEarlyMedia = connectOnEarlyMedia;
        return this;
    }

    /**
     * Returns connectOnEarlyMedia.
     * <p>
     * Field description:
     * Indicates whether to connect calls on early media. Otherwise, the calls are connected after being established. Cannot be &#x60;true&#x60; when &#x60;ringbackGeneration&#x60; is enabled.
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
     * Indicates whether to connect calls on early media. Otherwise, the calls are connected after being established. Cannot be &#x60;true&#x60; when &#x60;ringbackGeneration&#x60; is enabled.
     *
     * @param connectOnEarlyMedia
     */
    @JsonProperty("connectOnEarlyMedia")
    public void setConnectOnEarlyMedia(Boolean connectOnEarlyMedia) {
        this.connectOnEarlyMedia = connectOnEarlyMedia;
    }

    /**
     * Sets ringbackGeneration.
     *
     * @param ringbackGeneration
     * @return This {@link CallsConnectWithNewCallRequest instance}.
     */
    public CallsConnectWithNewCallRequest ringbackGeneration(RingbackGeneration ringbackGeneration) {
        this.ringbackGeneration = ringbackGeneration;
        return this;
    }

    /**
     * Returns ringbackGeneration.
     *
     * @return ringbackGeneration
     */
    @JsonProperty("ringbackGeneration")
    public RingbackGeneration getRingbackGeneration() {
        return ringbackGeneration;
    }

    /**
     * Sets ringbackGeneration.
     *
     * @param ringbackGeneration
     */
    @JsonProperty("ringbackGeneration")
    public void setRingbackGeneration(RingbackGeneration ringbackGeneration) {
        this.ringbackGeneration = ringbackGeneration;
    }

    /**
     * Sets conferenceRequest.
     *
     * @param conferenceRequest
     * @return This {@link CallsConnectWithNewCallRequest instance}.
     */
    public CallsConnectWithNewCallRequest conferenceRequest(CallsActionConferenceRequest conferenceRequest) {
        this.conferenceRequest = conferenceRequest;
        return this;
    }

    /**
     * Returns conferenceRequest.
     *
     * @return conferenceRequest
     */
    @JsonProperty("conferenceRequest")
    public CallsActionConferenceRequest getConferenceRequest() {
        return conferenceRequest;
    }

    /**
     * Sets conferenceRequest.
     *
     * @param conferenceRequest
     */
    @JsonProperty("conferenceRequest")
    public void setConferenceRequest(CallsActionConferenceRequest conferenceRequest) {
        this.conferenceRequest = conferenceRequest;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CallsConnectWithNewCallRequest callsConnectWithNewCallRequest = (CallsConnectWithNewCallRequest) o;
        return Objects.equals(this.callRequest, callsConnectWithNewCallRequest.callRequest)
                && Objects.equals(this.connectOnEarlyMedia, callsConnectWithNewCallRequest.connectOnEarlyMedia)
                && Objects.equals(this.ringbackGeneration, callsConnectWithNewCallRequest.ringbackGeneration)
                && Objects.equals(this.conferenceRequest, callsConnectWithNewCallRequest.conferenceRequest);
    }

    @Override
    public int hashCode() {
        return Objects.hash(callRequest, connectOnEarlyMedia, ringbackGeneration, conferenceRequest);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class CallsConnectWithNewCallRequest {")
                .append(newLine)
                .append("    callRequest: ")
                .append(toIndentedString(callRequest))
                .append(newLine)
                .append("    connectOnEarlyMedia: ")
                .append(toIndentedString(connectOnEarlyMedia))
                .append(newLine)
                .append("    ringbackGeneration: ")
                .append(toIndentedString(ringbackGeneration))
                .append(newLine)
                .append("    conferenceRequest: ")
                .append(toIndentedString(conferenceRequest))
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
