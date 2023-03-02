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
 * Represents WhatsAppMarkAsReadErrorResponse model.
 */
public class WhatsAppMarkAsReadErrorResponse {

    private String error;

    /**
     * Sets error.
     * <p>
     * Field description:
     * Error details
     *
     * @param error
     * @return This {@link WhatsAppMarkAsReadErrorResponse instance}.
     */
    public WhatsAppMarkAsReadErrorResponse error(String error) {
        this.error = error;
        return this;
    }

    /**
     * Returns error.
     * <p>
     * Field description:
     * Error details
     *
     * @return error
     */
    @JsonProperty("error")
    public String getError() {
        return error;
    }

    /**
     * Sets error.
     * <p>
     * Field description:
     * Error details
     *
     * @param error
     */
    @JsonProperty("error")
    public void setError(String error) {
        this.error = error;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WhatsAppMarkAsReadErrorResponse whatsAppMarkAsReadErrorResponse = (WhatsAppMarkAsReadErrorResponse) o;
        return Objects.equals(this.error, whatsAppMarkAsReadErrorResponse.error);
    }

    @Override
    public int hashCode() {
        return Objects.hash(error);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class WhatsAppMarkAsReadErrorResponse {")
                .append(newLine)
                .append("    error: ")
                .append(toIndentedString(error))
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
