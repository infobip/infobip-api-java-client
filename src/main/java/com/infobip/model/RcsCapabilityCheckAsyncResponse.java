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
 * Represents RcsCapabilityCheckAsyncResponse model.
 */
public class RcsCapabilityCheckAsyncResponse {

    private String bulkId;

    private List<RcsCapabilityCheckRequestState> capabilityCheckRequestStates = new ArrayList<>();

    /**
     * Sets bulkId.
     * <p>
     * Field description:
     * The ID that uniquely identifies the request. This ID is automatically generated and will be included in the API response.
     * <p>
     * The field is required.
     *
     * @param bulkId
     * @return This {@link RcsCapabilityCheckAsyncResponse instance}.
     */
    public RcsCapabilityCheckAsyncResponse bulkId(String bulkId) {
        this.bulkId = bulkId;
        return this;
    }

    /**
     * Returns bulkId.
     * <p>
     * Field description:
     * The ID that uniquely identifies the request. This ID is automatically generated and will be included in the API response.
     * <p>
     * The field is required.
     *
     * @return bulkId
     */
    @JsonProperty("bulkId")
    public String getBulkId() {
        return bulkId;
    }

    /**
     * Sets bulkId.
     * <p>
     * Field description:
     * The ID that uniquely identifies the request. This ID is automatically generated and will be included in the API response.
     * <p>
     * The field is required.
     *
     * @param bulkId
     */
    @JsonProperty("bulkId")
    public void setBulkId(String bulkId) {
        this.bulkId = bulkId;
    }

    /**
     * Sets capabilityCheckRequestStates.
     * <p>
     * Field description:
     * The sync response from the RCS capability checker for the specified phone numbers. Represents the current status of the requests.
     * <p>
     * The field is required.
     *
     * @param capabilityCheckRequestStates
     * @return This {@link RcsCapabilityCheckAsyncResponse instance}.
     */
    public RcsCapabilityCheckAsyncResponse capabilityCheckRequestStates(
            List<RcsCapabilityCheckRequestState> capabilityCheckRequestStates) {
        this.capabilityCheckRequestStates = capabilityCheckRequestStates;
        return this;
    }

    /**
     * Adds and item into capabilityCheckRequestStates.
     * <p>
     * Field description:
     * The sync response from the RCS capability checker for the specified phone numbers. Represents the current status of the requests.
     * <p>
     * The field is required.
     *
     * @param capabilityCheckRequestStatesItem The item to be added to the list.
     * @return This {@link RcsCapabilityCheckAsyncResponse instance}.
     */
    public RcsCapabilityCheckAsyncResponse addCapabilityCheckRequestStatesItem(
            RcsCapabilityCheckRequestState capabilityCheckRequestStatesItem) {
        if (this.capabilityCheckRequestStates == null) {
            this.capabilityCheckRequestStates = new ArrayList<>();
        }
        this.capabilityCheckRequestStates.add(capabilityCheckRequestStatesItem);
        return this;
    }

    /**
     * Returns capabilityCheckRequestStates.
     * <p>
     * Field description:
     * The sync response from the RCS capability checker for the specified phone numbers. Represents the current status of the requests.
     * <p>
     * The field is required.
     *
     * @return capabilityCheckRequestStates
     */
    @JsonProperty("capabilityCheckRequestStates")
    public List<RcsCapabilityCheckRequestState> getCapabilityCheckRequestStates() {
        return capabilityCheckRequestStates;
    }

    /**
     * Sets capabilityCheckRequestStates.
     * <p>
     * Field description:
     * The sync response from the RCS capability checker for the specified phone numbers. Represents the current status of the requests.
     * <p>
     * The field is required.
     *
     * @param capabilityCheckRequestStates
     */
    @JsonProperty("capabilityCheckRequestStates")
    public void setCapabilityCheckRequestStates(List<RcsCapabilityCheckRequestState> capabilityCheckRequestStates) {
        this.capabilityCheckRequestStates = capabilityCheckRequestStates;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RcsCapabilityCheckAsyncResponse rcsCapabilityCheckAsyncResponse = (RcsCapabilityCheckAsyncResponse) o;
        return Objects.equals(this.bulkId, rcsCapabilityCheckAsyncResponse.bulkId)
                && Objects.equals(
                        this.capabilityCheckRequestStates,
                        rcsCapabilityCheckAsyncResponse.capabilityCheckRequestStates);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bulkId, capabilityCheckRequestStates);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class RcsCapabilityCheckAsyncResponse {")
                .append(newLine)
                .append("    bulkId: ")
                .append(toIndentedString(bulkId))
                .append(newLine)
                .append("    capabilityCheckRequestStates: ")
                .append(toIndentedString(capabilityCheckRequestStates))
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
