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
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Represents CallsApplicationTransferRequest model.
 */
public class CallsApplicationTransferRequest {

    private String destinationApplicationId;

    private Integer timeout;

    private Map<String, String> customData = null;

    /**
     * Sets destinationApplicationId.
     * <p>
     * Field description:
     * ID of the application to which the call is to be transferred.
     * <p>
     * The field is required.
     *
     * @param destinationApplicationId
     * @return This {@link CallsApplicationTransferRequest instance}.
     */
    public CallsApplicationTransferRequest destinationApplicationId(String destinationApplicationId) {
        this.destinationApplicationId = destinationApplicationId;
        return this;
    }

    /**
     * Returns destinationApplicationId.
     * <p>
     * Field description:
     * ID of the application to which the call is to be transferred.
     * <p>
     * The field is required.
     *
     * @return destinationApplicationId
     */
    @JsonProperty("destinationApplicationId")
    public String getDestinationApplicationId() {
        return destinationApplicationId;
    }

    /**
     * Sets destinationApplicationId.
     * <p>
     * Field description:
     * ID of the application to which the call is to be transferred.
     * <p>
     * The field is required.
     *
     * @param destinationApplicationId
     */
    @JsonProperty("destinationApplicationId")
    public void setDestinationApplicationId(String destinationApplicationId) {
        this.destinationApplicationId = destinationApplicationId;
    }

    /**
     * Sets timeout.
     * <p>
     * Field description:
     * Time to wait, in seconds, for the receiving application to accept the transfer.
     *
     * @param timeout
     * @return This {@link CallsApplicationTransferRequest instance}.
     */
    public CallsApplicationTransferRequest timeout(Integer timeout) {
        this.timeout = timeout;
        return this;
    }

    /**
     * Returns timeout.
     * <p>
     * Field description:
     * Time to wait, in seconds, for the receiving application to accept the transfer.
     *
     * @return timeout
     */
    @JsonProperty("timeout")
    public Integer getTimeout() {
        return timeout;
    }

    /**
     * Sets timeout.
     * <p>
     * Field description:
     * Time to wait, in seconds, for the receiving application to accept the transfer.
     *
     * @param timeout
     */
    @JsonProperty("timeout")
    public void setTimeout(Integer timeout) {
        this.timeout = timeout;
    }

    /**
     * Sets customData.
     * <p>
     * Field description:
     * Optional parameter to update a call&#39;s custom data.
     *
     * @param customData
     * @return This {@link CallsApplicationTransferRequest instance}.
     */
    public CallsApplicationTransferRequest customData(Map<String, String> customData) {
        this.customData = customData;
        return this;
    }

    /**
     * Puts and entry into customData.
     * <p>
     * Field description:
     * Optional parameter to update a call&#39;s custom data.
     *
     * @param key The given key.
     * @param customDataItem The item to be associated with the given key.
     * @return This {@link CallsApplicationTransferRequest instance}.
     */
    public CallsApplicationTransferRequest putCustomDataItem(String key, String customDataItem) {
        if (this.customData == null) {
            this.customData = new HashMap<>();
        }
        this.customData.put(key, customDataItem);
        return this;
    }

    /**
     * Returns customData.
     * <p>
     * Field description:
     * Optional parameter to update a call&#39;s custom data.
     *
     * @return customData
     */
    @JsonProperty("customData")
    public Map<String, String> getCustomData() {
        return customData;
    }

    /**
     * Sets customData.
     * <p>
     * Field description:
     * Optional parameter to update a call&#39;s custom data.
     *
     * @param customData
     */
    @JsonProperty("customData")
    public void setCustomData(Map<String, String> customData) {
        this.customData = customData;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CallsApplicationTransferRequest callsApplicationTransferRequest = (CallsApplicationTransferRequest) o;
        return Objects.equals(this.destinationApplicationId, callsApplicationTransferRequest.destinationApplicationId)
                && Objects.equals(this.timeout, callsApplicationTransferRequest.timeout)
                && Objects.equals(this.customData, callsApplicationTransferRequest.customData);
    }

    @Override
    public int hashCode() {
        return Objects.hash(destinationApplicationId, timeout, customData);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class CallsApplicationTransferRequest {")
                .append(newLine)
                .append("    destinationApplicationId: ")
                .append(toIndentedString(destinationApplicationId))
                .append(newLine)
                .append("    timeout: ")
                .append(toIndentedString(timeout))
                .append(newLine)
                .append("    customData: ")
                .append(toIndentedString(customData))
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
