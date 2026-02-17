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
 * Represents CallsApplicationTransferFinishedProperties model.
 */
public class CallsApplicationTransferFinishedProperties {

    private String sourceCallsConfigurationId;

    private String destinationCallsConfigurationId;

    private String sourceApplicationId;

    private String destinationApplicationId;

    private String transferId;

    private Call call;

    private Integer locationId;

    /**
     * Sets sourceCallsConfigurationId.
     *
     * @param sourceCallsConfigurationId
     * @return This {@link CallsApplicationTransferFinishedProperties instance}.
     */
    public CallsApplicationTransferFinishedProperties sourceCallsConfigurationId(String sourceCallsConfigurationId) {
        this.sourceCallsConfigurationId = sourceCallsConfigurationId;
        return this;
    }

    /**
     * Returns sourceCallsConfigurationId.
     *
     * @return sourceCallsConfigurationId
     */
    @JsonProperty("sourceCallsConfigurationId")
    public String getSourceCallsConfigurationId() {
        return sourceCallsConfigurationId;
    }

    /**
     * Sets sourceCallsConfigurationId.
     *
     * @param sourceCallsConfigurationId
     */
    @JsonProperty("sourceCallsConfigurationId")
    public void setSourceCallsConfigurationId(String sourceCallsConfigurationId) {
        this.sourceCallsConfigurationId = sourceCallsConfigurationId;
    }

    /**
     * Sets destinationCallsConfigurationId.
     *
     * @param destinationCallsConfigurationId
     * @return This {@link CallsApplicationTransferFinishedProperties instance}.
     */
    public CallsApplicationTransferFinishedProperties destinationCallsConfigurationId(
            String destinationCallsConfigurationId) {
        this.destinationCallsConfigurationId = destinationCallsConfigurationId;
        return this;
    }

    /**
     * Returns destinationCallsConfigurationId.
     *
     * @return destinationCallsConfigurationId
     */
    @JsonProperty("destinationCallsConfigurationId")
    public String getDestinationCallsConfigurationId() {
        return destinationCallsConfigurationId;
    }

    /**
     * Sets destinationCallsConfigurationId.
     *
     * @param destinationCallsConfigurationId
     */
    @JsonProperty("destinationCallsConfigurationId")
    public void setDestinationCallsConfigurationId(String destinationCallsConfigurationId) {
        this.destinationCallsConfigurationId = destinationCallsConfigurationId;
    }

    /**
     * Sets sourceApplicationId.
     * <p>
     * The field is required.
     *
     * @param sourceApplicationId
     * @return This {@link CallsApplicationTransferFinishedProperties instance}.
     */
    public CallsApplicationTransferFinishedProperties sourceApplicationId(String sourceApplicationId) {
        this.sourceApplicationId = sourceApplicationId;
        return this;
    }

    /**
     * Returns sourceApplicationId.
     * <p>
     * The field is required.
     *
     * @return sourceApplicationId
     */
    @JsonProperty("sourceApplicationId")
    public String getSourceApplicationId() {
        return sourceApplicationId;
    }

    /**
     * Sets sourceApplicationId.
     * <p>
     * The field is required.
     *
     * @param sourceApplicationId
     */
    @JsonProperty("sourceApplicationId")
    public void setSourceApplicationId(String sourceApplicationId) {
        this.sourceApplicationId = sourceApplicationId;
    }

    /**
     * Sets destinationApplicationId.
     * <p>
     * The field is required.
     *
     * @param destinationApplicationId
     * @return This {@link CallsApplicationTransferFinishedProperties instance}.
     */
    public CallsApplicationTransferFinishedProperties destinationApplicationId(String destinationApplicationId) {
        this.destinationApplicationId = destinationApplicationId;
        return this;
    }

    /**
     * Returns destinationApplicationId.
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
     * The field is required.
     *
     * @param destinationApplicationId
     */
    @JsonProperty("destinationApplicationId")
    public void setDestinationApplicationId(String destinationApplicationId) {
        this.destinationApplicationId = destinationApplicationId;
    }

    /**
     * Sets transferId.
     * <p>
     * The field is required.
     *
     * @param transferId
     * @return This {@link CallsApplicationTransferFinishedProperties instance}.
     */
    public CallsApplicationTransferFinishedProperties transferId(String transferId) {
        this.transferId = transferId;
        return this;
    }

    /**
     * Returns transferId.
     * <p>
     * The field is required.
     *
     * @return transferId
     */
    @JsonProperty("transferId")
    public String getTransferId() {
        return transferId;
    }

    /**
     * Sets transferId.
     * <p>
     * The field is required.
     *
     * @param transferId
     */
    @JsonProperty("transferId")
    public void setTransferId(String transferId) {
        this.transferId = transferId;
    }

    /**
     * Sets call.
     * <p>
     * The field is required.
     *
     * @param call
     * @return This {@link CallsApplicationTransferFinishedProperties instance}.
     */
    public CallsApplicationTransferFinishedProperties call(Call call) {
        this.call = call;
        return this;
    }

    /**
     * Returns call.
     * <p>
     * The field is required.
     *
     * @return call
     */
    @JsonProperty("call")
    public Call getCall() {
        return call;
    }

    /**
     * Sets call.
     * <p>
     * The field is required.
     *
     * @param call
     */
    @JsonProperty("call")
    public void setCall(Call call) {
        this.call = call;
    }

    /**
     * Sets locationId.
     *
     * @param locationId
     * @return This {@link CallsApplicationTransferFinishedProperties instance}.
     */
    public CallsApplicationTransferFinishedProperties locationId(Integer locationId) {
        this.locationId = locationId;
        return this;
    }

    /**
     * Returns locationId.
     *
     * @return locationId
     */
    @JsonProperty("locationId")
    public Integer getLocationId() {
        return locationId;
    }

    /**
     * Sets locationId.
     *
     * @param locationId
     */
    @JsonProperty("locationId")
    public void setLocationId(Integer locationId) {
        this.locationId = locationId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CallsApplicationTransferFinishedProperties callsApplicationTransferFinishedProperties =
                (CallsApplicationTransferFinishedProperties) o;
        return Objects.equals(
                        this.sourceCallsConfigurationId,
                        callsApplicationTransferFinishedProperties.sourceCallsConfigurationId)
                && Objects.equals(
                        this.destinationCallsConfigurationId,
                        callsApplicationTransferFinishedProperties.destinationCallsConfigurationId)
                && Objects.equals(
                        this.sourceApplicationId, callsApplicationTransferFinishedProperties.sourceApplicationId)
                && Objects.equals(
                        this.destinationApplicationId,
                        callsApplicationTransferFinishedProperties.destinationApplicationId)
                && Objects.equals(this.transferId, callsApplicationTransferFinishedProperties.transferId)
                && Objects.equals(this.call, callsApplicationTransferFinishedProperties.call)
                && Objects.equals(this.locationId, callsApplicationTransferFinishedProperties.locationId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                sourceCallsConfigurationId,
                destinationCallsConfigurationId,
                sourceApplicationId,
                destinationApplicationId,
                transferId,
                call,
                locationId);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class CallsApplicationTransferFinishedProperties {")
                .append(newLine)
                .append("    sourceCallsConfigurationId: ")
                .append(toIndentedString(sourceCallsConfigurationId))
                .append(newLine)
                .append("    destinationCallsConfigurationId: ")
                .append(toIndentedString(destinationCallsConfigurationId))
                .append(newLine)
                .append("    sourceApplicationId: ")
                .append(toIndentedString(sourceApplicationId))
                .append(newLine)
                .append("    destinationApplicationId: ")
                .append(toIndentedString(destinationApplicationId))
                .append(newLine)
                .append("    transferId: ")
                .append(toIndentedString(transferId))
                .append(newLine)
                .append("    call: ")
                .append(toIndentedString(call))
                .append(newLine)
                .append("    locationId: ")
                .append(toIndentedString(locationId))
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
