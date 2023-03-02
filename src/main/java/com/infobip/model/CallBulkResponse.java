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
 * Represents CallBulkResponse model.
 */
public class CallBulkResponse {

    private String bulkId;

    private List<CallsBulkCall> calls = null;

    /**
     * Sets bulkId.
     * <p>
     * Field description:
     * Unique ID of the bulk request.
     *
     * @param bulkId
     * @return This {@link CallBulkResponse instance}.
     */
    public CallBulkResponse bulkId(String bulkId) {
        this.bulkId = bulkId;
        return this;
    }

    /**
     * Returns bulkId.
     * <p>
     * Field description:
     * Unique ID of the bulk request.
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
     * Unique ID of the bulk request.
     *
     * @param bulkId
     */
    @JsonProperty("bulkId")
    public void setBulkId(String bulkId) {
        this.bulkId = bulkId;
    }

    /**
     * Sets calls.
     * <p>
     * Field description:
     * Bulk call list.
     *
     * @param calls
     * @return This {@link CallBulkResponse instance}.
     */
    public CallBulkResponse calls(List<CallsBulkCall> calls) {
        this.calls = calls;
        return this;
    }

    /**
     * Adds and item into calls.
     * <p>
     * Field description:
     * Bulk call list.
     *
     * @param callsItem The item to be added to the list.
     * @return This {@link CallBulkResponse instance}.
     */
    public CallBulkResponse addCallsItem(CallsBulkCall callsItem) {
        if (this.calls == null) {
            this.calls = new ArrayList<>();
        }
        this.calls.add(callsItem);
        return this;
    }

    /**
     * Returns calls.
     * <p>
     * Field description:
     * Bulk call list.
     *
     * @return calls
     */
    @JsonProperty("calls")
    public List<CallsBulkCall> getCalls() {
        return calls;
    }

    /**
     * Sets calls.
     * <p>
     * Field description:
     * Bulk call list.
     *
     * @param calls
     */
    @JsonProperty("calls")
    public void setCalls(List<CallsBulkCall> calls) {
        this.calls = calls;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CallBulkResponse callBulkResponse = (CallBulkResponse) o;
        return Objects.equals(this.bulkId, callBulkResponse.bulkId)
                && Objects.equals(this.calls, callBulkResponse.calls);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bulkId, calls);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class CallBulkResponse {")
                .append(newLine)
                .append("    bulkId: ")
                .append(toIndentedString(bulkId))
                .append(newLine)
                .append("    calls: ")
                .append(toIndentedString(calls))
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
