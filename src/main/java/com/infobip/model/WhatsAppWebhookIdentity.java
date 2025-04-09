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
 * Represents WhatsAppWebhookIdentity model.
 */
public class WhatsAppWebhookIdentity {

    private Boolean acknowledged;

    private String hash;

    private OffsetDateTime createdAt;

    /**
     * Sets acknowledged.
     * <p>
     * The field is required.
     *
     * @param acknowledged
     * @return This {@link WhatsAppWebhookIdentity instance}.
     */
    public WhatsAppWebhookIdentity acknowledged(Boolean acknowledged) {
        this.acknowledged = acknowledged;
        return this;
    }

    /**
     * Returns acknowledged.
     * <p>
     * The field is required.
     *
     * @return acknowledged
     */
    @JsonProperty("acknowledged")
    public Boolean getAcknowledged() {
        return acknowledged;
    }

    /**
     * Sets acknowledged.
     * <p>
     * The field is required.
     *
     * @param acknowledged
     */
    @JsonProperty("acknowledged")
    public void setAcknowledged(Boolean acknowledged) {
        this.acknowledged = acknowledged;
    }

    /**
     * Sets hash.
     * <p>
     * The field is required.
     *
     * @param hash
     * @return This {@link WhatsAppWebhookIdentity instance}.
     */
    public WhatsAppWebhookIdentity hash(String hash) {
        this.hash = hash;
        return this;
    }

    /**
     * Returns hash.
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
     * The field is required.
     *
     * @param hash
     */
    @JsonProperty("hash")
    public void setHash(String hash) {
        this.hash = hash;
    }

    /**
     * Sets createdAt.
     * <p>
     * The field is required.
     *
     * @param createdAt
     * @return This {@link WhatsAppWebhookIdentity instance}.
     */
    public WhatsAppWebhookIdentity createdAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * Returns createdAt.
     * <p>
     * The field is required.
     *
     * @return createdAt
     */
    @JsonProperty("createdAt")
    public OffsetDateTime getCreatedAt() {
        return createdAt;
    }

    /**
     * Sets createdAt.
     * <p>
     * The field is required.
     *
     * @param createdAt
     */
    @JsonProperty("createdAt")
    public void setCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WhatsAppWebhookIdentity whatsAppWebhookIdentity = (WhatsAppWebhookIdentity) o;
        return Objects.equals(this.acknowledged, whatsAppWebhookIdentity.acknowledged)
                && Objects.equals(this.hash, whatsAppWebhookIdentity.hash)
                && Objects.equals(this.createdAt, whatsAppWebhookIdentity.createdAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(acknowledged, hash, createdAt);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class WhatsAppWebhookIdentity {")
                .append(newLine)
                .append("    acknowledged: ")
                .append(toIndentedString(acknowledged))
                .append(newLine)
                .append("    hash: ")
                .append(toIndentedString(hash))
                .append(newLine)
                .append("    createdAt: ")
                .append(toIndentedString(createdAt))
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
