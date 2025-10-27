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
import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * Structure that contains the details of the user response for the call permissions request message.
 */
public class WhatsAppCallPermissionReply {

    private WhatsAppResponse response;

    private OffsetDateTime expirationTimestamp;

    /**
     * Sets response.
     * <p>
     * The field is required.
     *
     * @param response
     * @return This {@link WhatsAppCallPermissionReply instance}.
     */
    public WhatsAppCallPermissionReply response(WhatsAppResponse response) {
        this.response = response;
        return this;
    }

    /**
     * Returns response.
     * <p>
     * The field is required.
     *
     * @return response
     */
    @JsonProperty("response")
    public WhatsAppResponse getResponse() {
        return response;
    }

    /**
     * Sets response.
     * <p>
     * The field is required.
     *
     * @param response
     */
    @JsonProperty("response")
    public void setResponse(WhatsAppResponse response) {
        this.response = response;
    }

    /**
     * Sets expirationTimestamp.
     * <p>
     * Field description:
     * Timestamp of when the call permission expires if user accepted the call.
     *
     * @param expirationTimestamp
     * @return This {@link WhatsAppCallPermissionReply instance}.
     */
    public WhatsAppCallPermissionReply expirationTimestamp(OffsetDateTime expirationTimestamp) {
        this.expirationTimestamp = expirationTimestamp;
        return this;
    }

    /**
     * Returns expirationTimestamp.
     * <p>
     * Field description:
     * Timestamp of when the call permission expires if user accepted the call.
     *
     * @return expirationTimestamp
     */
    @JsonProperty("expirationTimestamp")
    public OffsetDateTime getExpirationTimestamp() {
        return expirationTimestamp;
    }

    /**
     * Sets expirationTimestamp.
     * <p>
     * Field description:
     * Timestamp of when the call permission expires if user accepted the call.
     *
     * @param expirationTimestamp
     */
    @JsonProperty("expirationTimestamp")
    public void setExpirationTimestamp(OffsetDateTime expirationTimestamp) {
        this.expirationTimestamp = expirationTimestamp;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WhatsAppCallPermissionReply whatsAppCallPermissionReply = (WhatsAppCallPermissionReply) o;
        return Objects.equals(this.response, whatsAppCallPermissionReply.response)
                && Objects.equals(this.expirationTimestamp, whatsAppCallPermissionReply.expirationTimestamp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(response, expirationTimestamp);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class WhatsAppCallPermissionReply {")
                .append(newLine)
                .append("    response: ")
                .append(toIndentedString(response))
                .append(newLine)
                .append("    expirationTimestamp: ")
                .append(toIndentedString(expirationTimestamp))
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
