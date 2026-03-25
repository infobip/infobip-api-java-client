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
 * List of numbers linked with the resource.
 */
public class ResourcesProcuredNumber {

    private String number;

    private String numberKey;

    private ResourcesNumberStatus status;

    /**
     * Sets number.
     * <p>
     * Field description:
     * Number.
     * <p>
     * The field is required.
     *
     * @param number
     * @return This {@link ResourcesProcuredNumber instance}.
     */
    public ResourcesProcuredNumber number(String number) {
        this.number = number;
        return this;
    }

    /**
     * Returns number.
     * <p>
     * Field description:
     * Number.
     * <p>
     * The field is required.
     *
     * @return number
     */
    @JsonProperty("number")
    public String getNumber() {
        return number;
    }

    /**
     * Sets number.
     * <p>
     * Field description:
     * Number.
     * <p>
     * The field is required.
     *
     * @param number
     */
    @JsonProperty("number")
    public void setNumber(String number) {
        this.number = number;
    }

    /**
     * Sets numberKey.
     * <p>
     * Field description:
     * Unique ID of a number.
     *
     * @param numberKey
     * @return This {@link ResourcesProcuredNumber instance}.
     */
    public ResourcesProcuredNumber numberKey(String numberKey) {
        this.numberKey = numberKey;
        return this;
    }

    /**
     * Returns numberKey.
     * <p>
     * Field description:
     * Unique ID of a number.
     *
     * @return numberKey
     */
    @JsonProperty("numberKey")
    public String getNumberKey() {
        return numberKey;
    }

    /**
     * Sets numberKey.
     * <p>
     * Field description:
     * Unique ID of a number.
     *
     * @param numberKey
     */
    @JsonProperty("numberKey")
    public void setNumberKey(String numberKey) {
        this.numberKey = numberKey;
    }

    /**
     * Sets status.
     * <p>
     * The field is required.
     *
     * @param status
     * @return This {@link ResourcesProcuredNumber instance}.
     */
    public ResourcesProcuredNumber status(ResourcesNumberStatus status) {
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
    public ResourcesNumberStatus getStatus() {
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
    public void setStatus(ResourcesNumberStatus status) {
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
        ResourcesProcuredNumber resourcesProcuredNumber = (ResourcesProcuredNumber) o;
        return Objects.equals(this.number, resourcesProcuredNumber.number)
                && Objects.equals(this.numberKey, resourcesProcuredNumber.numberKey)
                && Objects.equals(this.status, resourcesProcuredNumber.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number, numberKey, status);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class ResourcesProcuredNumber {")
                .append(newLine)
                .append("    number: ")
                .append(toIndentedString(number))
                .append(newLine)
                .append("    numberKey: ")
                .append(toIndentedString(numberKey))
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
