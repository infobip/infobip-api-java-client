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
 * Records for the domain.
 */
public class EmailDnsRecordResponse {

    private String recordType;

    private String name;

    private String expectedValue;

    private Boolean verified;

    /**
     * Sets recordType.
     * <p>
     * Field description:
     * Type of the record.
     *
     * @param recordType
     * @return This {@link EmailDnsRecordResponse instance}.
     */
    public EmailDnsRecordResponse recordType(String recordType) {
        this.recordType = recordType;
        return this;
    }

    /**
     * Returns recordType.
     * <p>
     * Field description:
     * Type of the record.
     *
     * @return recordType
     */
    @JsonProperty("recordType")
    public String getRecordType() {
        return recordType;
    }

    /**
     * Sets recordType.
     * <p>
     * Field description:
     * Type of the record.
     *
     * @param recordType
     */
    @JsonProperty("recordType")
    public void setRecordType(String recordType) {
        this.recordType = recordType;
    }

    /**
     * Sets name.
     * <p>
     * Field description:
     * Name of the record.
     *
     * @param name
     * @return This {@link EmailDnsRecordResponse instance}.
     */
    public EmailDnsRecordResponse name(String name) {
        this.name = name;
        return this;
    }

    /**
     * Returns name.
     * <p>
     * Field description:
     * Name of the record.
     *
     * @return name
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * Sets name.
     * <p>
     * Field description:
     * Name of the record.
     *
     * @param name
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Sets expectedValue.
     * <p>
     * Field description:
     * Expected value to be set for the given record.
     *
     * @param expectedValue
     * @return This {@link EmailDnsRecordResponse instance}.
     */
    public EmailDnsRecordResponse expectedValue(String expectedValue) {
        this.expectedValue = expectedValue;
        return this;
    }

    /**
     * Returns expectedValue.
     * <p>
     * Field description:
     * Expected value to be set for the given record.
     *
     * @return expectedValue
     */
    @JsonProperty("expectedValue")
    public String getExpectedValue() {
        return expectedValue;
    }

    /**
     * Sets expectedValue.
     * <p>
     * Field description:
     * Expected value to be set for the given record.
     *
     * @param expectedValue
     */
    @JsonProperty("expectedValue")
    public void setExpectedValue(String expectedValue) {
        this.expectedValue = expectedValue;
    }

    /**
     * Sets verified.
     * <p>
     * Field description:
     * Boolean value representing if the record is verified or not.
     *
     * @param verified
     * @return This {@link EmailDnsRecordResponse instance}.
     */
    public EmailDnsRecordResponse verified(Boolean verified) {
        this.verified = verified;
        return this;
    }

    /**
     * Returns verified.
     * <p>
     * Field description:
     * Boolean value representing if the record is verified or not.
     *
     * @return verified
     */
    @JsonProperty("verified")
    public Boolean getVerified() {
        return verified;
    }

    /**
     * Sets verified.
     * <p>
     * Field description:
     * Boolean value representing if the record is verified or not.
     *
     * @param verified
     */
    @JsonProperty("verified")
    public void setVerified(Boolean verified) {
        this.verified = verified;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        EmailDnsRecordResponse emailDnsRecordResponse = (EmailDnsRecordResponse) o;
        return Objects.equals(this.recordType, emailDnsRecordResponse.recordType)
                && Objects.equals(this.name, emailDnsRecordResponse.name)
                && Objects.equals(this.expectedValue, emailDnsRecordResponse.expectedValue)
                && Objects.equals(this.verified, emailDnsRecordResponse.verified);
    }

    @Override
    public int hashCode() {
        return Objects.hash(recordType, name, expectedValue, verified);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class EmailDnsRecordResponse {")
                .append(newLine)
                .append("    recordType: ")
                .append(toIndentedString(recordType))
                .append(newLine)
                .append("    name: ")
                .append(toIndentedString(name))
                .append(newLine)
                .append("    expectedValue: ")
                .append(toIndentedString(expectedValue))
                .append(newLine)
                .append("    verified: ")
                .append(toIndentedString(verified))
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
