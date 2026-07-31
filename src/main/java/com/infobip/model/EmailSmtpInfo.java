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
 * SMTP details for the sent email.
 */
public class EmailSmtpInfo {

    private String response;

    /**
     * Sets response.
     * <p>
     * Field description:
     * SMTP server response for the sent email.
     *
     * @param response
     * @return This {@link EmailSmtpInfo instance}.
     */
    public EmailSmtpInfo response(String response) {
        this.response = response;
        return this;
    }

    /**
     * Returns response.
     * <p>
     * Field description:
     * SMTP server response for the sent email.
     *
     * @return response
     */
    @JsonProperty("response")
    public String getResponse() {
        return response;
    }

    /**
     * Sets response.
     * <p>
     * Field description:
     * SMTP server response for the sent email.
     *
     * @param response
     */
    @JsonProperty("response")
    public void setResponse(String response) {
        this.response = response;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        EmailSmtpInfo emailSmtpInfo = (EmailSmtpInfo) o;
        return Objects.equals(this.response, emailSmtpInfo.response);
    }

    @Override
    public int hashCode() {
        return Objects.hash(response);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class EmailSmtpInfo {")
                .append(newLine)
                .append("    response: ")
                .append(toIndentedString(response))
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
