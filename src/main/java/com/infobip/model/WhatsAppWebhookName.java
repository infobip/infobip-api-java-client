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
 * Contains information about contact&#39;s name.
 */
public class WhatsAppWebhookName {

    private String firstName;

    private String lastName;

    private String middleName;

    private String nameSuffix;

    private String namePrefix;

    private String formattedName;

    /**
     * Sets firstName.
     * <p>
     * Field description:
     * Contact&#39;s first name.
     *
     * @param firstName
     * @return This {@link WhatsAppWebhookName instance}.
     */
    public WhatsAppWebhookName firstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    /**
     * Returns firstName.
     * <p>
     * Field description:
     * Contact&#39;s first name.
     *
     * @return firstName
     */
    @JsonProperty("firstName")
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets firstName.
     * <p>
     * Field description:
     * Contact&#39;s first name.
     *
     * @param firstName
     */
    @JsonProperty("firstName")
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Sets lastName.
     * <p>
     * Field description:
     * Contact&#39;s last name.
     *
     * @param lastName
     * @return This {@link WhatsAppWebhookName instance}.
     */
    public WhatsAppWebhookName lastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    /**
     * Returns lastName.
     * <p>
     * Field description:
     * Contact&#39;s last name.
     *
     * @return lastName
     */
    @JsonProperty("lastName")
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets lastName.
     * <p>
     * Field description:
     * Contact&#39;s last name.
     *
     * @param lastName
     */
    @JsonProperty("lastName")
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * Sets middleName.
     * <p>
     * Field description:
     * Contact&#39;s middle name.
     *
     * @param middleName
     * @return This {@link WhatsAppWebhookName instance}.
     */
    public WhatsAppWebhookName middleName(String middleName) {
        this.middleName = middleName;
        return this;
    }

    /**
     * Returns middleName.
     * <p>
     * Field description:
     * Contact&#39;s middle name.
     *
     * @return middleName
     */
    @JsonProperty("middleName")
    public String getMiddleName() {
        return middleName;
    }

    /**
     * Sets middleName.
     * <p>
     * Field description:
     * Contact&#39;s middle name.
     *
     * @param middleName
     */
    @JsonProperty("middleName")
    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    /**
     * Sets nameSuffix.
     * <p>
     * Field description:
     * Contact&#39;s name suffix.
     *
     * @param nameSuffix
     * @return This {@link WhatsAppWebhookName instance}.
     */
    public WhatsAppWebhookName nameSuffix(String nameSuffix) {
        this.nameSuffix = nameSuffix;
        return this;
    }

    /**
     * Returns nameSuffix.
     * <p>
     * Field description:
     * Contact&#39;s name suffix.
     *
     * @return nameSuffix
     */
    @JsonProperty("nameSuffix")
    public String getNameSuffix() {
        return nameSuffix;
    }

    /**
     * Sets nameSuffix.
     * <p>
     * Field description:
     * Contact&#39;s name suffix.
     *
     * @param nameSuffix
     */
    @JsonProperty("nameSuffix")
    public void setNameSuffix(String nameSuffix) {
        this.nameSuffix = nameSuffix;
    }

    /**
     * Sets namePrefix.
     * <p>
     * Field description:
     * Contact&#39;s name prefix.
     *
     * @param namePrefix
     * @return This {@link WhatsAppWebhookName instance}.
     */
    public WhatsAppWebhookName namePrefix(String namePrefix) {
        this.namePrefix = namePrefix;
        return this;
    }

    /**
     * Returns namePrefix.
     * <p>
     * Field description:
     * Contact&#39;s name prefix.
     *
     * @return namePrefix
     */
    @JsonProperty("namePrefix")
    public String getNamePrefix() {
        return namePrefix;
    }

    /**
     * Sets namePrefix.
     * <p>
     * Field description:
     * Contact&#39;s name prefix.
     *
     * @param namePrefix
     */
    @JsonProperty("namePrefix")
    public void setNamePrefix(String namePrefix) {
        this.namePrefix = namePrefix;
    }

    /**
     * Sets formattedName.
     * <p>
     * Field description:
     * Contact&#39;s full name as it normally appears.
     *
     * @param formattedName
     * @return This {@link WhatsAppWebhookName instance}.
     */
    public WhatsAppWebhookName formattedName(String formattedName) {
        this.formattedName = formattedName;
        return this;
    }

    /**
     * Returns formattedName.
     * <p>
     * Field description:
     * Contact&#39;s full name as it normally appears.
     *
     * @return formattedName
     */
    @JsonProperty("formattedName")
    public String getFormattedName() {
        return formattedName;
    }

    /**
     * Sets formattedName.
     * <p>
     * Field description:
     * Contact&#39;s full name as it normally appears.
     *
     * @param formattedName
     */
    @JsonProperty("formattedName")
    public void setFormattedName(String formattedName) {
        this.formattedName = formattedName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WhatsAppWebhookName whatsAppWebhookName = (WhatsAppWebhookName) o;
        return Objects.equals(this.firstName, whatsAppWebhookName.firstName)
                && Objects.equals(this.lastName, whatsAppWebhookName.lastName)
                && Objects.equals(this.middleName, whatsAppWebhookName.middleName)
                && Objects.equals(this.nameSuffix, whatsAppWebhookName.nameSuffix)
                && Objects.equals(this.namePrefix, whatsAppWebhookName.namePrefix)
                && Objects.equals(this.formattedName, whatsAppWebhookName.formattedName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, middleName, nameSuffix, namePrefix, formattedName);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class WhatsAppWebhookName {")
                .append(newLine)
                .append("    firstName: ")
                .append(toIndentedString(firstName))
                .append(newLine)
                .append("    lastName: ")
                .append(toIndentedString(lastName))
                .append(newLine)
                .append("    middleName: ")
                .append(toIndentedString(middleName))
                .append(newLine)
                .append("    nameSuffix: ")
                .append(toIndentedString(nameSuffix))
                .append(newLine)
                .append("    namePrefix: ")
                .append(toIndentedString(namePrefix))
                .append(newLine)
                .append("    formattedName: ")
                .append(toIndentedString(formattedName))
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
