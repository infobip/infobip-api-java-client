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
public class WhatsAppNameContent {

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
     * <p>
     * The field is required.
     *
     * @param firstName
     * @return This {@link WhatsAppNameContent instance}.
     */
    public WhatsAppNameContent firstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    /**
     * Returns firstName.
     * <p>
     * Field description:
     * Contact&#39;s first name.
     * <p>
     * The field is required.
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
     * <p>
     * The field is required.
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
     * @return This {@link WhatsAppNameContent instance}.
     */
    public WhatsAppNameContent lastName(String lastName) {
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
     * @return This {@link WhatsAppNameContent instance}.
     */
    public WhatsAppNameContent middleName(String middleName) {
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
     * @return This {@link WhatsAppNameContent instance}.
     */
    public WhatsAppNameContent nameSuffix(String nameSuffix) {
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
     * @return This {@link WhatsAppNameContent instance}.
     */
    public WhatsAppNameContent namePrefix(String namePrefix) {
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
     * <p>
     * The field is required.
     *
     * @param formattedName
     * @return This {@link WhatsAppNameContent instance}.
     */
    public WhatsAppNameContent formattedName(String formattedName) {
        this.formattedName = formattedName;
        return this;
    }

    /**
     * Returns formattedName.
     * <p>
     * Field description:
     * Contact&#39;s full name as it normally appears.
     * <p>
     * The field is required.
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
     * <p>
     * The field is required.
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
        WhatsAppNameContent whatsAppNameContent = (WhatsAppNameContent) o;
        return Objects.equals(this.firstName, whatsAppNameContent.firstName)
                && Objects.equals(this.lastName, whatsAppNameContent.lastName)
                && Objects.equals(this.middleName, whatsAppNameContent.middleName)
                && Objects.equals(this.nameSuffix, whatsAppNameContent.nameSuffix)
                && Objects.equals(this.namePrefix, whatsAppNameContent.namePrefix)
                && Objects.equals(this.formattedName, whatsAppNameContent.formattedName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, middleName, nameSuffix, namePrefix, formattedName);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class WhatsAppNameContent {")
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
