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
 * Structure that contains the details of the in-thread authentication reply.
 */
public class WhatsAppInThreadAuthenticationReply {

    private WhatsAppInThreadAuthenticationStatus status;

    private String businessScopedPasskeyHash;

    /**
     * Sets status.
     * <p>
     * The field is required.
     *
     * @param status
     * @return This {@link WhatsAppInThreadAuthenticationReply instance}.
     */
    public WhatsAppInThreadAuthenticationReply status(WhatsAppInThreadAuthenticationStatus status) {
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
    public WhatsAppInThreadAuthenticationStatus getStatus() {
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
    public void setStatus(WhatsAppInThreadAuthenticationStatus status) {
        this.status = status;
    }

    /**
     * Sets businessScopedPasskeyHash.
     * <p>
     * Field description:
     * Business-scoped passkey hash, present only when status is verified.
     *
     * @param businessScopedPasskeyHash
     * @return This {@link WhatsAppInThreadAuthenticationReply instance}.
     */
    public WhatsAppInThreadAuthenticationReply businessScopedPasskeyHash(String businessScopedPasskeyHash) {
        this.businessScopedPasskeyHash = businessScopedPasskeyHash;
        return this;
    }

    /**
     * Returns businessScopedPasskeyHash.
     * <p>
     * Field description:
     * Business-scoped passkey hash, present only when status is verified.
     *
     * @return businessScopedPasskeyHash
     */
    @JsonProperty("businessScopedPasskeyHash")
    public String getBusinessScopedPasskeyHash() {
        return businessScopedPasskeyHash;
    }

    /**
     * Sets businessScopedPasskeyHash.
     * <p>
     * Field description:
     * Business-scoped passkey hash, present only when status is verified.
     *
     * @param businessScopedPasskeyHash
     */
    @JsonProperty("businessScopedPasskeyHash")
    public void setBusinessScopedPasskeyHash(String businessScopedPasskeyHash) {
        this.businessScopedPasskeyHash = businessScopedPasskeyHash;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WhatsAppInThreadAuthenticationReply whatsAppInThreadAuthenticationReply =
                (WhatsAppInThreadAuthenticationReply) o;
        return Objects.equals(this.status, whatsAppInThreadAuthenticationReply.status)
                && Objects.equals(
                        this.businessScopedPasskeyHash, whatsAppInThreadAuthenticationReply.businessScopedPasskeyHash);
    }

    @Override
    public int hashCode() {
        return Objects.hash(status, businessScopedPasskeyHash);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class WhatsAppInThreadAuthenticationReply {")
                .append(newLine)
                .append("    status: ")
                .append(toIndentedString(status))
                .append(newLine)
                .append("    businessScopedPasskeyHash: ")
                .append(toIndentedString(businessScopedPasskeyHash))
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
