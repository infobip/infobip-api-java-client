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
 * Represents CallBulkRequest model.
 */
public class CallBulkRequest {

    private String bulkId;

    private String callsConfigurationId;

    private CallsPlatform platform;

    private List<CallsBulkItem> items = new ArrayList<>();

    /**
     * Sets bulkId.
     * <p>
     * Field description:
     * Unique ID of the bulk request. If it&#39;s not set, a unique ID will be assigned to the bulk request.
     *
     * @param bulkId
     * @return This {@link CallBulkRequest instance}.
     */
    public CallBulkRequest bulkId(String bulkId) {
        this.bulkId = bulkId;
        return this;
    }

    /**
     * Returns bulkId.
     * <p>
     * Field description:
     * Unique ID of the bulk request. If it&#39;s not set, a unique ID will be assigned to the bulk request.
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
     * Unique ID of the bulk request. If it&#39;s not set, a unique ID will be assigned to the bulk request.
     *
     * @param bulkId
     */
    @JsonProperty("bulkId")
    public void setBulkId(String bulkId) {
        this.bulkId = bulkId;
    }

    /**
     * Sets callsConfigurationId.
     * <p>
     * Field description:
     * Calls Configuration ID.
     * <p>
     * The field is required.
     *
     * @param callsConfigurationId
     * @return This {@link CallBulkRequest instance}.
     */
    public CallBulkRequest callsConfigurationId(String callsConfigurationId) {
        this.callsConfigurationId = callsConfigurationId;
        return this;
    }

    /**
     * Returns callsConfigurationId.
     * <p>
     * Field description:
     * Calls Configuration ID.
     * <p>
     * The field is required.
     *
     * @return callsConfigurationId
     */
    @JsonProperty("callsConfigurationId")
    public String getCallsConfigurationId() {
        return callsConfigurationId;
    }

    /**
     * Sets callsConfigurationId.
     * <p>
     * Field description:
     * Calls Configuration ID.
     * <p>
     * The field is required.
     *
     * @param callsConfigurationId
     */
    @JsonProperty("callsConfigurationId")
    public void setCallsConfigurationId(String callsConfigurationId) {
        this.callsConfigurationId = callsConfigurationId;
    }

    /**
     * Sets platform.
     *
     * @param platform
     * @return This {@link CallBulkRequest instance}.
     */
    public CallBulkRequest platform(CallsPlatform platform) {
        this.platform = platform;
        return this;
    }

    /**
     * Returns platform.
     *
     * @return platform
     */
    @JsonProperty("platform")
    public CallsPlatform getPlatform() {
        return platform;
    }

    /**
     * Sets platform.
     *
     * @param platform
     */
    @JsonProperty("platform")
    public void setPlatform(CallsPlatform platform) {
        this.platform = platform;
    }

    /**
     * Sets items.
     * <p>
     * Field description:
     * Bulk item list.
     * <p>
     * The field is required.
     *
     * @param items
     * @return This {@link CallBulkRequest instance}.
     */
    public CallBulkRequest items(List<CallsBulkItem> items) {
        this.items = items;
        return this;
    }

    /**
     * Adds and item into items.
     * <p>
     * Field description:
     * Bulk item list.
     * <p>
     * The field is required.
     *
     * @param itemsItem The item to be added to the list.
     * @return This {@link CallBulkRequest instance}.
     */
    public CallBulkRequest addItemsItem(CallsBulkItem itemsItem) {
        if (this.items == null) {
            this.items = new ArrayList<>();
        }
        this.items.add(itemsItem);
        return this;
    }

    /**
     * Returns items.
     * <p>
     * Field description:
     * Bulk item list.
     * <p>
     * The field is required.
     *
     * @return items
     */
    @JsonProperty("items")
    public List<CallsBulkItem> getItems() {
        return items;
    }

    /**
     * Sets items.
     * <p>
     * Field description:
     * Bulk item list.
     * <p>
     * The field is required.
     *
     * @param items
     */
    @JsonProperty("items")
    public void setItems(List<CallsBulkItem> items) {
        this.items = items;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CallBulkRequest callBulkRequest = (CallBulkRequest) o;
        return Objects.equals(this.bulkId, callBulkRequest.bulkId)
                && Objects.equals(this.callsConfigurationId, callBulkRequest.callsConfigurationId)
                && Objects.equals(this.platform, callBulkRequest.platform)
                && Objects.equals(this.items, callBulkRequest.items);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bulkId, callsConfigurationId, platform, items);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class CallBulkRequest {")
                .append(newLine)
                .append("    bulkId: ")
                .append(toIndentedString(bulkId))
                .append(newLine)
                .append("    callsConfigurationId: ")
                .append(toIndentedString(callsConfigurationId))
                .append(newLine)
                .append("    platform: ")
                .append(toIndentedString(platform))
                .append(newLine)
                .append("    items: ")
                .append(toIndentedString(items))
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
