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
 * Distributed Ledger Technology (DLT) specific parameters required for sending SMS to phone numbers registered in India.
 */
public class SmsIndiaDltOptions {

    private String contentTemplateId;

    private String principalEntityId;

    private String telemarketerId;

    /**
     * Sets contentTemplateId.
     * <p>
     * Field description:
     * Registered DLT content template ID which matches message you are sending.
     *
     * @param contentTemplateId
     * @return This {@link SmsIndiaDltOptions instance}.
     */
    public SmsIndiaDltOptions contentTemplateId(String contentTemplateId) {
        this.contentTemplateId = contentTemplateId;
        return this;
    }

    /**
     * Returns contentTemplateId.
     * <p>
     * Field description:
     * Registered DLT content template ID which matches message you are sending.
     *
     * @return contentTemplateId
     */
    @JsonProperty("contentTemplateId")
    public String getContentTemplateId() {
        return contentTemplateId;
    }

    /**
     * Sets contentTemplateId.
     * <p>
     * Field description:
     * Registered DLT content template ID which matches message you are sending.
     *
     * @param contentTemplateId
     */
    @JsonProperty("contentTemplateId")
    public void setContentTemplateId(String contentTemplateId) {
        this.contentTemplateId = contentTemplateId;
    }

    /**
     * Sets principalEntityId.
     * <p>
     * Field description:
     * Your assigned DLT principal entity ID.
     * <p>
     * The field is required.
     *
     * @param principalEntityId
     * @return This {@link SmsIndiaDltOptions instance}.
     */
    public SmsIndiaDltOptions principalEntityId(String principalEntityId) {
        this.principalEntityId = principalEntityId;
        return this;
    }

    /**
     * Returns principalEntityId.
     * <p>
     * Field description:
     * Your assigned DLT principal entity ID.
     * <p>
     * The field is required.
     *
     * @return principalEntityId
     */
    @JsonProperty("principalEntityId")
    public String getPrincipalEntityId() {
        return principalEntityId;
    }

    /**
     * Sets principalEntityId.
     * <p>
     * Field description:
     * Your assigned DLT principal entity ID.
     * <p>
     * The field is required.
     *
     * @param principalEntityId
     */
    @JsonProperty("principalEntityId")
    public void setPrincipalEntityId(String principalEntityId) {
        this.principalEntityId = principalEntityId;
    }

    /**
     * Sets telemarketerId.
     * <p>
     * Field description:
     * Your assigned Telemarketer ID. (required for Aggregators)
     *
     * @param telemarketerId
     * @return This {@link SmsIndiaDltOptions instance}.
     */
    public SmsIndiaDltOptions telemarketerId(String telemarketerId) {
        this.telemarketerId = telemarketerId;
        return this;
    }

    /**
     * Returns telemarketerId.
     * <p>
     * Field description:
     * Your assigned Telemarketer ID. (required for Aggregators)
     *
     * @return telemarketerId
     */
    @JsonProperty("telemarketerId")
    public String getTelemarketerId() {
        return telemarketerId;
    }

    /**
     * Sets telemarketerId.
     * <p>
     * Field description:
     * Your assigned Telemarketer ID. (required for Aggregators)
     *
     * @param telemarketerId
     */
    @JsonProperty("telemarketerId")
    public void setTelemarketerId(String telemarketerId) {
        this.telemarketerId = telemarketerId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SmsIndiaDltOptions smsIndiaDltOptions = (SmsIndiaDltOptions) o;
        return Objects.equals(this.contentTemplateId, smsIndiaDltOptions.contentTemplateId)
                && Objects.equals(this.principalEntityId, smsIndiaDltOptions.principalEntityId)
                && Objects.equals(this.telemarketerId, smsIndiaDltOptions.telemarketerId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(contentTemplateId, principalEntityId, telemarketerId);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class SmsIndiaDltOptions {")
                .append(newLine)
                .append("    contentTemplateId: ")
                .append(toIndentedString(contentTemplateId))
                .append(newLine)
                .append("    principalEntityId: ")
                .append(toIndentedString(principalEntityId))
                .append(newLine)
                .append("    telemarketerId: ")
                .append(toIndentedString(telemarketerId))
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
