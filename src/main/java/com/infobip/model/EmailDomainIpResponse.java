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
 * Represents EmailDomainIpResponse model.
 */
public class EmailDomainIpResponse {

    private List<EmailDomainIp> result = new ArrayList<>();

    /**
     * Sets result.
     * <p>
     * Field description:
     * List of ip details.
     * <p>
     * The field is required.
     *
     * @param result
     * @return This {@link EmailDomainIpResponse instance}.
     */
    public EmailDomainIpResponse result(List<EmailDomainIp> result) {
        this.result = result;
        return this;
    }

    /**
     * Adds and item into result.
     * <p>
     * Field description:
     * List of ip details.
     * <p>
     * The field is required.
     *
     * @param resultItem The item to be added to the list.
     * @return This {@link EmailDomainIpResponse instance}.
     */
    public EmailDomainIpResponse addResultItem(EmailDomainIp resultItem) {
        if (this.result == null) {
            this.result = new ArrayList<>();
        }
        this.result.add(resultItem);
        return this;
    }

    /**
     * Returns result.
     * <p>
     * Field description:
     * List of ip details.
     * <p>
     * The field is required.
     *
     * @return result
     */
    @JsonProperty("result")
    public List<EmailDomainIp> getResult() {
        return result;
    }

    /**
     * Sets result.
     * <p>
     * Field description:
     * List of ip details.
     * <p>
     * The field is required.
     *
     * @param result
     */
    @JsonProperty("result")
    public void setResult(List<EmailDomainIp> result) {
        this.result = result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        EmailDomainIpResponse emailDomainIpResponse = (EmailDomainIpResponse) o;
        return Objects.equals(this.result, emailDomainIpResponse.result);
    }

    @Override
    public int hashCode() {
        return Objects.hash(result);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class EmailDomainIpResponse {")
                .append(newLine)
                .append("    result: ")
                .append(toIndentedString(result))
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
