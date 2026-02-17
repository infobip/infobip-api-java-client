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
 * Represents RcsCapabilityCheckResult model.
 */
public class RcsCapabilityCheckResult {

    private String bulkId;

    private String messageId;

    private String phoneNumber;

    private RcsCapabilityCheckResponseCode code;

    /**
     * Sets bulkId.
     * <p>
     * Field description:
     * The ID that uniquely identifies the request. This ID is automatically generated and will be included in the API response.
     * <p>
     * The field is required.
     *
     * @param bulkId
     * @return This {@link RcsCapabilityCheckResult instance}.
     */
    public RcsCapabilityCheckResult bulkId(String bulkId) {
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
     * Sets messageId.
     * <p>
     * Field description:
     * A unique message ID. This ID is automatically generated and will be included in the API response.
     * <p>
     * The field is required.
     *
     * @param messageId
     * @return This {@link RcsCapabilityCheckResult instance}.
     */
    public RcsCapabilityCheckResult messageId(String messageId) {
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
     * @return This {@link RcsCapabilityCheckResult instance}.
     */
    public RcsCapabilityCheckResult phoneNumber(String phoneNumber) {
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
     * Sets code.
     * <p>
     * The field is required.
     *
     * @param code
     * @return This {@link RcsCapabilityCheckResult instance}.
     */
    public RcsCapabilityCheckResult code(RcsCapabilityCheckResponseCode code) {
        this.code = code;
        return this;
    }

    /**
     * Returns code.
     * <p>
     * The field is required.
     *
     * @return code
     */
    @JsonProperty("code")
    public RcsCapabilityCheckResponseCode getCode() {
        return code;
    }

    /**
     * Sets code.
     * <p>
     * The field is required.
     *
     * @param code
     */
    @JsonProperty("code")
    public void setCode(RcsCapabilityCheckResponseCode code) {
        this.code = code;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RcsCapabilityCheckResult rcsCapabilityCheckResult = (RcsCapabilityCheckResult) o;
        return Objects.equals(this.bulkId, rcsCapabilityCheckResult.bulkId)
                && Objects.equals(this.messageId, rcsCapabilityCheckResult.messageId)
                && Objects.equals(this.phoneNumber, rcsCapabilityCheckResult.phoneNumber)
                && Objects.equals(this.code, rcsCapabilityCheckResult.code);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bulkId, messageId, phoneNumber, code);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class RcsCapabilityCheckResult {")
                .append(newLine)
                .append("    bulkId: ")
                .append(toIndentedString(bulkId))
                .append(newLine)
                .append("    messageId: ")
                .append(toIndentedString(messageId))
                .append(newLine)
                .append("    phoneNumber: ")
                .append(toIndentedString(phoneNumber))
                .append(newLine)
                .append("    code: ")
                .append(toIndentedString(code))
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
