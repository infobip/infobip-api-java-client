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
 * The editPermissions object to indicate editing permissions for the number.
 */
public class NumbersEditPermissions {

    private Boolean canEditNumber;

    private Boolean canEditConfiguration;

    /**
     * Sets canEditNumber.
     * <p>
     * Field description:
     * Indicates whether the permissions allow for editing a number.
     *
     * @param canEditNumber
     * @return This {@link NumbersEditPermissions instance}.
     */
    public NumbersEditPermissions canEditNumber(Boolean canEditNumber) {
        this.canEditNumber = canEditNumber;
        return this;
    }

    /**
     * Returns canEditNumber.
     * <p>
     * Field description:
     * Indicates whether the permissions allow for editing a number.
     *
     * @return canEditNumber
     */
    @JsonProperty("canEditNumber")
    public Boolean getCanEditNumber() {
        return canEditNumber;
    }

    /**
     * Sets canEditNumber.
     * <p>
     * Field description:
     * Indicates whether the permissions allow for editing a number.
     *
     * @param canEditNumber
     */
    @JsonProperty("canEditNumber")
    public void setCanEditNumber(Boolean canEditNumber) {
        this.canEditNumber = canEditNumber;
    }

    /**
     * Sets canEditConfiguration.
     * <p>
     * Field description:
     * Indicates whether the  the permissions allow for editing number configuration.
     *
     * @param canEditConfiguration
     * @return This {@link NumbersEditPermissions instance}.
     */
    public NumbersEditPermissions canEditConfiguration(Boolean canEditConfiguration) {
        this.canEditConfiguration = canEditConfiguration;
        return this;
    }

    /**
     * Returns canEditConfiguration.
     * <p>
     * Field description:
     * Indicates whether the  the permissions allow for editing number configuration.
     *
     * @return canEditConfiguration
     */
    @JsonProperty("canEditConfiguration")
    public Boolean getCanEditConfiguration() {
        return canEditConfiguration;
    }

    /**
     * Sets canEditConfiguration.
     * <p>
     * Field description:
     * Indicates whether the  the permissions allow for editing number configuration.
     *
     * @param canEditConfiguration
     */
    @JsonProperty("canEditConfiguration")
    public void setCanEditConfiguration(Boolean canEditConfiguration) {
        this.canEditConfiguration = canEditConfiguration;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        NumbersEditPermissions numbersEditPermissions = (NumbersEditPermissions) o;
        return Objects.equals(this.canEditNumber, numbersEditPermissions.canEditNumber)
                && Objects.equals(this.canEditConfiguration, numbersEditPermissions.canEditConfiguration);
    }

    @Override
    public int hashCode() {
        return Objects.hash(canEditNumber, canEditConfiguration);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class NumbersEditPermissions {")
                .append(newLine)
                .append("    canEditNumber: ")
                .append(toIndentedString(canEditNumber))
                .append(newLine)
                .append("    canEditConfiguration: ")
                .append(toIndentedString(canEditConfiguration))
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
