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
 * WhatsApp sender public key information
 */
public class WhatsAppSenderPublicKeyResponse {

    private String publicKey;

    private String publicKeySignatureStatus;

    /**
     * Sets publicKey.
     * <p>
     * Field description:
     * PEM-formatted customer public key
     * <p>
     * The field is required.
     *
     * @param publicKey
     * @return This {@link WhatsAppSenderPublicKeyResponse instance}.
     */
    public WhatsAppSenderPublicKeyResponse publicKey(String publicKey) {
        this.publicKey = publicKey;
        return this;
    }

    /**
     * Returns publicKey.
     * <p>
     * Field description:
     * PEM-formatted customer public key
     * <p>
     * The field is required.
     *
     * @return publicKey
     */
    @JsonProperty("publicKey")
    public String getPublicKey() {
        return publicKey;
    }

    /**
     * Sets publicKey.
     * <p>
     * Field description:
     * PEM-formatted customer public key
     * <p>
     * The field is required.
     *
     * @param publicKey
     */
    @JsonProperty("publicKey")
    public void setPublicKey(String publicKey) {
        this.publicKey = publicKey;
    }

    /**
     * Sets publicKeySignatureStatus.
     * <p>
     * Field description:
     * Status of the customer public key signature
     * <p>
     * The field is required.
     *
     * @param publicKeySignatureStatus
     * @return This {@link WhatsAppSenderPublicKeyResponse instance}.
     */
    public WhatsAppSenderPublicKeyResponse publicKeySignatureStatus(String publicKeySignatureStatus) {
        this.publicKeySignatureStatus = publicKeySignatureStatus;
        return this;
    }

    /**
     * Returns publicKeySignatureStatus.
     * <p>
     * Field description:
     * Status of the customer public key signature
     * <p>
     * The field is required.
     *
     * @return publicKeySignatureStatus
     */
    @JsonProperty("publicKeySignatureStatus")
    public String getPublicKeySignatureStatus() {
        return publicKeySignatureStatus;
    }

    /**
     * Sets publicKeySignatureStatus.
     * <p>
     * Field description:
     * Status of the customer public key signature
     * <p>
     * The field is required.
     *
     * @param publicKeySignatureStatus
     */
    @JsonProperty("publicKeySignatureStatus")
    public void setPublicKeySignatureStatus(String publicKeySignatureStatus) {
        this.publicKeySignatureStatus = publicKeySignatureStatus;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WhatsAppSenderPublicKeyResponse whatsAppSenderPublicKeyResponse = (WhatsAppSenderPublicKeyResponse) o;
        return Objects.equals(this.publicKey, whatsAppSenderPublicKeyResponse.publicKey)
                && Objects.equals(
                        this.publicKeySignatureStatus, whatsAppSenderPublicKeyResponse.publicKeySignatureStatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(publicKey, publicKeySignatureStatus);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class WhatsAppSenderPublicKeyResponse {")
                .append(newLine)
                .append("    publicKey: ")
                .append(toIndentedString(publicKey))
                .append(newLine)
                .append("    publicKeySignatureStatus: ")
                .append(toIndentedString(publicKeySignatureStatus))
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
