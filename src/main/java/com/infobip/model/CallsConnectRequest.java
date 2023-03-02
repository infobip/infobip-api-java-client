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
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

/**
 * Represents CallsConnectRequest model.
 */
public class CallsConnectRequest {

    private Set<String> callIds = new LinkedHashSet<>();

    private CallsActionConferenceRequest conferenceRequest;

    /**
     * Sets callIds.
     * <p>
     * Field description:
     * IDs of the calls to connect.
     * <p>
     * The field is required.
     *
     * @param callIds
     * @return This {@link CallsConnectRequest instance}.
     */
    public CallsConnectRequest callIds(Set<String> callIds) {
        this.callIds = callIds;
        return this;
    }

    /**
     * Adds and item into callIds.
     * <p>
     * Field description:
     * IDs of the calls to connect.
     * <p>
     * The field is required.
     *
     * @param callIdsItem The item to be added to the list.
     * @return This {@link CallsConnectRequest instance}.
     */
    public CallsConnectRequest addCallIdsItem(String callIdsItem) {
        if (this.callIds == null) {
            this.callIds = new LinkedHashSet<>();
        }
        this.callIds.add(callIdsItem);
        return this;
    }

    /**
     * Returns callIds.
     * <p>
     * Field description:
     * IDs of the calls to connect.
     * <p>
     * The field is required.
     *
     * @return callIds
     */
    @JsonProperty("callIds")
    public Set<String> getCallIds() {
        return callIds;
    }

    /**
     * Sets callIds.
     * <p>
     * Field description:
     * IDs of the calls to connect.
     * <p>
     * The field is required.
     *
     * @param callIds
     */
    @JsonProperty("callIds")
    public void setCallIds(Set<String> callIds) {
        this.callIds = callIds;
    }

    /**
     * Sets conferenceRequest.
     *
     * @param conferenceRequest
     * @return This {@link CallsConnectRequest instance}.
     */
    public CallsConnectRequest conferenceRequest(CallsActionConferenceRequest conferenceRequest) {
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
        CallsConnectRequest callsConnectRequest = (CallsConnectRequest) o;
        return Objects.equals(this.callIds, callsConnectRequest.callIds)
                && Objects.equals(this.conferenceRequest, callsConnectRequest.conferenceRequest);
    }

    @Override
    public int hashCode() {
        return Objects.hash(callIds, conferenceRequest);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class CallsConnectRequest {")
                .append(newLine)
                .append("    callIds: ")
                .append(toIndentedString(callIds))
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
