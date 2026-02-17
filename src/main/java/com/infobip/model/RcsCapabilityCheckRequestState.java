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
 * The sync response from the RCS capability checker for the specified phone numbers. Represents the current status of the requests.
 */
public class RcsCapabilityCheckRequestState {

    private String messageId;

    private String phoneNumber;

    private RcsStatusReason status;

    /**
     * Sets messageId.
     * <p>
     * Field description:
     * A unique message ID. This ID is automatically generated and will be included in the API response.
     * <p>
     * The field is required.
     *
     * @param messageId
     * @return This {@link RcsCapabilityCheckRequestState instance}.
     */
    public RcsCapabilityCheckRequestState messageId(String messageId) {
        this.messageId = messageId;
        return this;
    }

    /**
     * Returns messageId.
     * <p>
     * Field description:
     * A unique message ID. This ID is automatically generated and will be included in the API response.
     * <p>
     * The field is required.
     *
     * @return messageId
     */
    @JsonProperty("messageId")
    public String getMessageId() {
        return messageId;
    }

    /**
     * Sets messageId.
     * <p>
     * Field description:
     * A unique message ID. This ID is automatically generated and will be included in the API response.
     * <p>
     * The field is required.
     *
     * @param messageId
     */
    @JsonProperty("messageId")
    public void setMessageId(String messageId) {
        this.messageId = messageId;
    }

    /**
     * Sets phoneNumber.
     * <p>
     * Field description:
     * The recipient&#39;s phone number that was checked for RCS capability.
     * <p>
     * The field is required.
     *
     * @param phoneNumber
     * @return This {@link RcsCapabilityCheckRequestState instance}.
     */
    public RcsCapabilityCheckRequestState phoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    /**
     * Returns phoneNumber.
     * <p>
     * Field description:
     * The recipient&#39;s phone number that was checked for RCS capability.
     * <p>
     * The field is required.
     *
     * @return phoneNumber
     */
    @JsonProperty("phoneNumber")
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Sets phoneNumber.
     * <p>
     * Field description:
     * The recipient&#39;s phone number that was checked for RCS capability.
     * <p>
     * The field is required.
     *
     * @param phoneNumber
     */
    @JsonProperty("phoneNumber")
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /**
     * Sets status.
     * <p>
     * The field is required.
     *
     * @param status
     * @return This {@link RcsCapabilityCheckRequestState instance}.
     */
    public RcsCapabilityCheckRequestState status(RcsStatusReason status) {
        this.status = status;
        return this;
    }

    /**
     * Returns status.
     * <p>
     * The field is required.
     *
     * @return status
     */
    @JsonProperty("status")
    public RcsStatusReason getStatus() {
        return status;
    }

    /**
     * Sets status.
     * <p>
     * The field is required.
     *
     * @param status
     */
    @JsonProperty("status")
    public void setStatus(RcsStatusReason status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RcsCapabilityCheckRequestState rcsCapabilityCheckRequestState = (RcsCapabilityCheckRequestState) o;
        return Objects.equals(this.messageId, rcsCapabilityCheckRequestState.messageId)
                && Objects.equals(this.phoneNumber, rcsCapabilityCheckRequestState.phoneNumber)
                && Objects.equals(this.status, rcsCapabilityCheckRequestState.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(messageId, phoneNumber, status);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class RcsCapabilityCheckRequestState {")
                .append(newLine)
                .append("    messageId: ")
                .append(toIndentedString(messageId))
                .append(newLine)
                .append("    phoneNumber: ")
                .append(toIndentedString(phoneNumber))
                .append(newLine)
                .append("    status: ")
                .append(toIndentedString(status))
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
