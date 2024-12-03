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
 * Suppression get response.
 */
public class EmailSuppressionInfo {

    private String domainName;

    private String emailAddress;

    private String type;

    private String createdDate;

    private String reason;

    /**
     * Sets domainName.
     * <p>
     * Field description:
     * Name of the requested domain.
     * <p>
     * The field is required.
     *
     * @param domainName
     * @return This {@link EmailSuppressionInfo instance}.
     */
    public EmailSuppressionInfo domainName(String domainName) {
        this.domainName = domainName;
        return this;
    }

    /**
     * Returns domainName.
     * <p>
     * Field description:
     * Name of the requested domain.
     * <p>
     * The field is required.
     *
     * @return domainName
     */
    @JsonProperty("domainName")
    public String getDomainName() {
        return domainName;
    }

    /**
     * Sets domainName.
     * <p>
     * Field description:
     * Name of the requested domain.
     * <p>
     * The field is required.
     *
     * @param domainName
     */
    @JsonProperty("domainName")
    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    /**
     * Sets emailAddress.
     * <p>
     * Field description:
     * Email address that is suppressed.
     * <p>
     * The field is required.
     *
     * @param emailAddress
     * @return This {@link EmailSuppressionInfo instance}.
     */
    public EmailSuppressionInfo emailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
        return this;
    }

    /**
     * Returns emailAddress.
     * <p>
     * Field description:
     * Email address that is suppressed.
     * <p>
     * The field is required.
     *
     * @return emailAddress
     */
    @JsonProperty("emailAddress")
    public String getEmailAddress() {
        return emailAddress;
    }

    /**
     * Sets emailAddress.
     * <p>
     * Field description:
     * Email address that is suppressed.
     * <p>
     * The field is required.
     *
     * @param emailAddress
     */
    @JsonProperty("emailAddress")
    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    /**
     * Sets type.
     * <p>
     * Field description:
     * Type of suppression.
     * <p>
     * The field is required.
     *
     * @param type
     * @return This {@link EmailSuppressionInfo instance}.
     */
    public EmailSuppressionInfo type(String type) {
        this.type = type;
        return this;
    }

    /**
     * Returns type.
     * <p>
     * Field description:
     * Type of suppression.
     * <p>
     * The field is required.
     *
     * @return type
     */
    @JsonProperty("type")
    public String getType() {
        return type;
    }

    /**
     * Sets type.
     * <p>
     * Field description:
     * Type of suppression.
     * <p>
     * The field is required.
     *
     * @param type
     */
    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    /**
     * Sets createdDate.
     * <p>
     * Field description:
     * Date and time when email address was suppressed.
     * <p>
     * The field is required.
     *
     * @param createdDate
     * @return This {@link EmailSuppressionInfo instance}.
     */
    public EmailSuppressionInfo createdDate(String createdDate) {
        this.createdDate = createdDate;
        return this;
    }

    /**
     * Returns createdDate.
     * <p>
     * Field description:
     * Date and time when email address was suppressed.
     * <p>
     * The field is required.
     *
     * @return createdDate
     */
    @JsonProperty("createdDate")
    public String getCreatedDate() {
        return createdDate;
    }

    /**
     * Sets createdDate.
     * <p>
     * Field description:
     * Date and time when email address was suppressed.
     * <p>
     * The field is required.
     *
     * @param createdDate
     */
    @JsonProperty("createdDate")
    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }

    /**
     * Sets reason.
     * <p>
     * Field description:
     * Reason for suppression.
     * <p>
     * The field is required.
     *
     * @param reason
     * @return This {@link EmailSuppressionInfo instance}.
     */
    public EmailSuppressionInfo reason(String reason) {
        this.reason = reason;
        return this;
    }

    /**
     * Returns reason.
     * <p>
     * Field description:
     * Reason for suppression.
     * <p>
     * The field is required.
     *
     * @return reason
     */
    @JsonProperty("reason")
    public String getReason() {
        return reason;
    }

    /**
     * Sets reason.
     * <p>
     * Field description:
     * Reason for suppression.
     * <p>
     * The field is required.
     *
     * @param reason
     */
    @JsonProperty("reason")
    public void setReason(String reason) {
        this.reason = reason;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        EmailSuppressionInfo emailSuppressionInfo = (EmailSuppressionInfo) o;
        return Objects.equals(this.domainName, emailSuppressionInfo.domainName)
                && Objects.equals(this.emailAddress, emailSuppressionInfo.emailAddress)
                && Objects.equals(this.type, emailSuppressionInfo.type)
                && Objects.equals(this.createdDate, emailSuppressionInfo.createdDate)
                && Objects.equals(this.reason, emailSuppressionInfo.reason);
    }

    @Override
    public int hashCode() {
        return Objects.hash(domainName, emailAddress, type, createdDate, reason);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class EmailSuppressionInfo {")
                .append(newLine)
                .append("    domainName: ")
                .append(toIndentedString(domainName))
                .append(newLine)
                .append("    emailAddress: ")
                .append(toIndentedString(emailAddress))
                .append(newLine)
                .append("    type: ")
                .append(toIndentedString(type))
                .append(newLine)
                .append("    createdDate: ")
                .append(toIndentedString(createdDate))
                .append(newLine)
                .append("    reason: ")
                .append(toIndentedString(reason))
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
