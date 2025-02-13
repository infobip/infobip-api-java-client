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
public class MessagesApiIndiaDltOptions {

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
     * @return This {@link MessagesApiIndiaDltOptions instance}.
     */
    public MessagesApiIndiaDltOptions contentTemplateId(String contentTemplateId) {
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
     * @return This {@link MessagesApiIndiaDltOptions instance}.
     */
    public MessagesApiIndiaDltOptions principalEntityId(String principalEntityId) {
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
     * @return This {@link MessagesApiIndiaDltOptions instance}.
     */
    public MessagesApiIndiaDltOptions telemarketerId(String telemarketerId) {
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
        MessagesApiIndiaDltOptions messagesApiIndiaDltOptions = (MessagesApiIndiaDltOptions) o;
        return Objects.equals(this.contentTemplateId, messagesApiIndiaDltOptions.contentTemplateId)
                && Objects.equals(this.principalEntityId, messagesApiIndiaDltOptions.principalEntityId)
                && Objects.equals(this.telemarketerId, messagesApiIndiaDltOptions.telemarketerId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(contentTemplateId, principalEntityId, telemarketerId);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class MessagesApiIndiaDltOptions {")
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
