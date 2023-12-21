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
 * Expiration of the order.
 */
public class WhatsAppInteractiveOrderDetailsOrderExpiration {

    private Long expirationSeconds;

    private String description;

    /**
     * Sets expirationSeconds.
     * <p>
     * Field description:
     * Order expiration time in seconds, at least 360.
     * <p>
     * The field is required.
     *
     * @param expirationSeconds
     * @return This {@link WhatsAppInteractiveOrderDetailsOrderExpiration instance}.
     */
    public WhatsAppInteractiveOrderDetailsOrderExpiration expirationSeconds(Long expirationSeconds) {
        this.expirationSeconds = expirationSeconds;
        return this;
    }

    /**
     * Returns expirationSeconds.
     * <p>
     * Field description:
     * Order expiration time in seconds, at least 360.
     * <p>
     * The field is required.
     *
     * @return expirationSeconds
     */
    @JsonProperty("expirationSeconds")
    public Long getExpirationSeconds() {
        return expirationSeconds;
    }

    /**
     * Sets expirationSeconds.
     * <p>
     * Field description:
     * Order expiration time in seconds, at least 360.
     * <p>
     * The field is required.
     *
     * @param expirationSeconds
     */
    @JsonProperty("expirationSeconds")
    public void setExpirationSeconds(Long expirationSeconds) {
        this.expirationSeconds = expirationSeconds;
    }

    /**
     * Sets description.
     * <p>
     * Field description:
     * Text explanation of expiration.
     * <p>
     * The field is required.
     *
     * @param description
     * @return This {@link WhatsAppInteractiveOrderDetailsOrderExpiration instance}.
     */
    public WhatsAppInteractiveOrderDetailsOrderExpiration description(String description) {
        this.description = description;
        return this;
    }

    /**
     * Returns description.
     * <p>
     * Field description:
     * Text explanation of expiration.
     * <p>
     * The field is required.
     *
     * @return description
     */
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    /**
     * Sets description.
     * <p>
     * Field description:
     * Text explanation of expiration.
     * <p>
     * The field is required.
     *
     * @param description
     */
    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WhatsAppInteractiveOrderDetailsOrderExpiration whatsAppInteractiveOrderDetailsOrderExpiration =
                (WhatsAppInteractiveOrderDetailsOrderExpiration) o;
        return Objects.equals(this.expirationSeconds, whatsAppInteractiveOrderDetailsOrderExpiration.expirationSeconds)
                && Objects.equals(this.description, whatsAppInteractiveOrderDetailsOrderExpiration.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(expirationSeconds, description);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class WhatsAppInteractiveOrderDetailsOrderExpiration {")
                .append(newLine)
                .append("    expirationSeconds: ")
                .append(toIndentedString(expirationSeconds))
                .append(newLine)
                .append("    description: ")
                .append(toIndentedString(description))
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
