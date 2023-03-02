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
 * Call request list.
 */
public class CallsBulkCallRequest {

    private String externalId;

    private CallEndpoint endpoint;

    /**
     * Sets externalId.
     * <p>
     * Field description:
     * Client defined call ID.
     *
     * @param externalId
     * @return This {@link CallsBulkCallRequest instance}.
     */
    public CallsBulkCallRequest externalId(String externalId) {
        this.externalId = externalId;
        return this;
    }

    /**
     * Returns externalId.
     * <p>
     * Field description:
     * Client defined call ID.
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
     * Client defined call ID.
     *
     * @param externalId
     */
    @JsonProperty("externalId")
    public void setExternalId(String externalId) {
        this.externalId = externalId;
    }

    /**
     * Sets endpoint.
     * <p>
     * The field is required.
     *
     * @param endpoint
     * @return This {@link CallsBulkCallRequest instance}.
     */
    public CallsBulkCallRequest endpoint(CallEndpoint endpoint) {
        this.endpoint = endpoint;
        return this;
    }

    /**
     * Returns endpoint.
     * <p>
     * The field is required.
     *
     * @return endpoint
     */
    @JsonProperty("endpoint")
    public CallEndpoint getEndpoint() {
        return endpoint;
    }

    /**
     * Sets endpoint.
     * <p>
     * The field is required.
     *
     * @param endpoint
     */
    @JsonProperty("endpoint")
    public void setEndpoint(CallEndpoint endpoint) {
        this.endpoint = endpoint;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CallsBulkCallRequest callsBulkCallRequest = (CallsBulkCallRequest) o;
        return Objects.equals(this.externalId, callsBulkCallRequest.externalId)
                && Objects.equals(this.endpoint, callsBulkCallRequest.endpoint);
    }

    @Override
    public int hashCode() {
        return Objects.hash(externalId, endpoint);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class CallsBulkCallRequest {")
                .append(newLine)
                .append("    externalId: ")
                .append(toIndentedString(externalId))
                .append(newLine)
                .append("    endpoint: ")
                .append(toIndentedString(endpoint))
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
