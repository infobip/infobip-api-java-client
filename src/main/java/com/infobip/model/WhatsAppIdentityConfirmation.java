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
 * Represents WhatsAppIdentityConfirmation model.
 */
public class WhatsAppIdentityConfirmation {

    private String hash;

    /**
     * Sets hash.
     * <p>
     * Field description:
     * Identity hash
     * <p>
     * The field is required.
     *
     * @param hash
     * @return This {@link WhatsAppIdentityConfirmation instance}.
     */
    public WhatsAppIdentityConfirmation hash(String hash) {
        this.hash = hash;
        return this;
    }

    /**
     * Returns hash.
     * <p>
     * Field description:
     * Identity hash
     * <p>
     * The field is required.
     *
     * @return hash
     */
    @JsonProperty("hash")
    public String getHash() {
        return hash;
    }

    /**
     * Sets hash.
     * <p>
     * Field description:
     * Identity hash
     * <p>
     * The field is required.
     *
     * @param hash
     */
    @JsonProperty("hash")
    public void setHash(String hash) {
        this.hash = hash;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WhatsAppIdentityConfirmation whatsAppIdentityConfirmation = (WhatsAppIdentityConfirmation) o;
        return Objects.equals(this.hash, whatsAppIdentityConfirmation.hash);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hash);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class WhatsAppIdentityConfirmation {")
                .append(newLine)
                .append("    hash: ")
                .append(toIndentedString(hash))
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
