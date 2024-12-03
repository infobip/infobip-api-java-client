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
 * Suppression.
 */
public class EmailAddSuppression {

    private String domainName;

    private List<String> emailAddress = new ArrayList<>();

    private EmailApiAddDeleteSuppressionType type;

    /**
     * Sets domainName.
     * <p>
     * Field description:
     * Domain name from which suppressions will be added.
     * <p>
     * The field is required.
     *
     * @param domainName
     * @return This {@link EmailAddSuppression instance}.
     */
    public EmailAddSuppression domainName(String domainName) {
        this.domainName = domainName;
        return this;
    }

    /**
     * Returns domainName.
     * <p>
     * Field description:
     * Domain name from which suppressions will be added.
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
     * Domain name from which suppressions will be added.
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
     * Email addresses to add to suppression list.
     * <p>
     * The field is required.
     *
     * @param emailAddress
     * @return This {@link EmailAddSuppression instance}.
     */
    public EmailAddSuppression emailAddress(List<String> emailAddress) {
        this.emailAddress = emailAddress;
        return this;
    }

    /**
     * Adds and item into emailAddress.
     * <p>
     * Field description:
     * Email addresses to add to suppression list.
     * <p>
     * The field is required.
     *
     * @param emailAddressItem The item to be added to the list.
     * @return This {@link EmailAddSuppression instance}.
     */
    public EmailAddSuppression addEmailAddressItem(String emailAddressItem) {
        if (this.emailAddress == null) {
            this.emailAddress = new ArrayList<>();
        }
        this.emailAddress.add(emailAddressItem);
        return this;
    }

    /**
     * Returns emailAddress.
     * <p>
     * Field description:
     * Email addresses to add to suppression list.
     * <p>
     * The field is required.
     *
     * @return emailAddress
     */
    @JsonProperty("emailAddress")
    public List<String> getEmailAddress() {
        return emailAddress;
    }

    /**
     * Sets emailAddress.
     * <p>
     * Field description:
     * Email addresses to add to suppression list.
     * <p>
     * The field is required.
     *
     * @param emailAddress
     */
    @JsonProperty("emailAddress")
    public void setEmailAddress(List<String> emailAddress) {
        this.emailAddress = emailAddress;
    }

    /**
     * Sets type.
     * <p>
     * The field is required.
     *
     * @param type
     * @return This {@link EmailAddSuppression instance}.
     */
    public EmailAddSuppression type(EmailApiAddDeleteSuppressionType type) {
        this.type = type;
        return this;
    }

    /**
     * Returns type.
     * <p>
     * The field is required.
     *
     * @return type
     */
    @JsonProperty("type")
    public EmailApiAddDeleteSuppressionType getType() {
        return type;
    }

    /**
     * Sets type.
     * <p>
     * The field is required.
     *
     * @param type
     */
    @JsonProperty("type")
    public void setType(EmailApiAddDeleteSuppressionType type) {
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        EmailAddSuppression emailAddSuppression = (EmailAddSuppression) o;
        return Objects.equals(this.domainName, emailAddSuppression.domainName)
                && Objects.equals(this.emailAddress, emailAddSuppression.emailAddress)
                && Objects.equals(this.type, emailAddSuppression.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(domainName, emailAddress, type);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class EmailAddSuppression {")
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
