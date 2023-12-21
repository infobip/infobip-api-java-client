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
 * List of the quality information related to specific senders.
 */
public class WhatsAppSenderQuality {

    private String sender;

    private WhatsAppSenderQualityRating qualityRating;

    private WhatsAppSenderStatus status;

    private WhatsAppSenderLimit currentLimit;

    private OffsetDateTime lastUpdated;

    /**
     * Sets sender.
     * <p>
     * Field description:
     * Sender to whom the information refers.
     * <p>
     * The field is required.
     *
     * @param sender
     * @return This {@link WhatsAppSenderQuality instance}.
     */
    public WhatsAppSenderQuality sender(String sender) {
        this.sender = sender;
        return this;
    }

    /**
     * Returns sender.
     * <p>
     * Field description:
     * Sender to whom the information refers.
     * <p>
     * The field is required.
     *
     * @return sender
     */
    @JsonProperty("sender")
    public String getSender() {
        return sender;
    }

    /**
     * Sets sender.
     * <p>
     * Field description:
     * Sender to whom the information refers.
     * <p>
     * The field is required.
     *
     * @param sender
     */
    @JsonProperty("sender")
    public void setSender(String sender) {
        this.sender = sender;
    }

    /**
     * Sets qualityRating.
     * <p>
     * The field is required.
     *
     * @param qualityRating
     * @return This {@link WhatsAppSenderQuality instance}.
     */
    public WhatsAppSenderQuality qualityRating(WhatsAppSenderQualityRating qualityRating) {
        this.qualityRating = qualityRating;
        return this;
    }

    /**
     * Returns qualityRating.
     * <p>
     * The field is required.
     *
     * @return qualityRating
     */
    @JsonProperty("qualityRating")
    public WhatsAppSenderQualityRating getQualityRating() {
        return qualityRating;
    }

    /**
     * Sets qualityRating.
     * <p>
     * The field is required.
     *
     * @param qualityRating
     */
    @JsonProperty("qualityRating")
    public void setQualityRating(WhatsAppSenderQualityRating qualityRating) {
        this.qualityRating = qualityRating;
    }

    /**
     * Sets status.
     * <p>
     * The field is required.
     *
     * @param status
     * @return This {@link WhatsAppSenderQuality instance}.
     */
    public WhatsAppSenderQuality status(WhatsAppSenderStatus status) {
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
    public WhatsAppSenderStatus getStatus() {
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
    public void setStatus(WhatsAppSenderStatus status) {
        this.status = status;
    }

    /**
     * Sets currentLimit.
     * <p>
     * The field is required.
     *
     * @param currentLimit
     * @return This {@link WhatsAppSenderQuality instance}.
     */
    public WhatsAppSenderQuality currentLimit(WhatsAppSenderLimit currentLimit) {
        this.currentLimit = currentLimit;
        return this;
    }

    /**
     * Returns currentLimit.
     * <p>
     * The field is required.
     *
     * @return currentLimit
     */
    @JsonProperty("currentLimit")
    public WhatsAppSenderLimit getCurrentLimit() {
        return currentLimit;
    }

    /**
     * Sets currentLimit.
     * <p>
     * The field is required.
     *
     * @param currentLimit
     */
    @JsonProperty("currentLimit")
    public void setCurrentLimit(WhatsAppSenderLimit currentLimit) {
        this.currentLimit = currentLimit;
    }

    /**
     * Sets lastUpdated.
     * <p>
     * Field description:
     * Last modification date.
     *
     * @param lastUpdated
     * @return This {@link WhatsAppSenderQuality instance}.
     */
    public WhatsAppSenderQuality lastUpdated(OffsetDateTime lastUpdated) {
        this.lastUpdated = lastUpdated;
        return this;
    }

    /**
     * Returns lastUpdated.
     * <p>
     * Field description:
     * Last modification date.
     *
     * @return lastUpdated
     */
    @JsonProperty("lastUpdated")
    public OffsetDateTime getLastUpdated() {
        return lastUpdated;
    }

    /**
     * Sets lastUpdated.
     * <p>
     * Field description:
     * Last modification date.
     *
     * @param lastUpdated
     */
    @JsonProperty("lastUpdated")
    public void setLastUpdated(OffsetDateTime lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WhatsAppSenderQuality whatsAppSenderQuality = (WhatsAppSenderQuality) o;
        return Objects.equals(this.sender, whatsAppSenderQuality.sender)
                && Objects.equals(this.qualityRating, whatsAppSenderQuality.qualityRating)
                && Objects.equals(this.status, whatsAppSenderQuality.status)
                && Objects.equals(this.currentLimit, whatsAppSenderQuality.currentLimit)
                && Objects.equals(this.lastUpdated, whatsAppSenderQuality.lastUpdated);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sender, qualityRating, status, currentLimit, lastUpdated);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class WhatsAppSenderQuality {")
                .append(newLine)
                .append("    sender: ")
                .append(toIndentedString(sender))
                .append(newLine)
                .append("    qualityRating: ")
                .append(toIndentedString(qualityRating))
                .append(newLine)
                .append("    status: ")
                .append(toIndentedString(status))
                .append(newLine)
                .append("    currentLimit: ")
                .append(toIndentedString(currentLimit))
                .append(newLine)
                .append("    lastUpdated: ")
                .append(toIndentedString(lastUpdated))
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
