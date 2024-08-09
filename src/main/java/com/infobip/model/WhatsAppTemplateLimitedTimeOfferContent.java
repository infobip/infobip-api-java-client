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
 * Template limited-time offer. Should be defined, only if template contains limited-time offer.
 */
public class WhatsAppTemplateLimitedTimeOfferContent {

    private OffsetDateTime expirationTime;

    /**
     * Sets expirationTime.
     * <p>
     * Field description:
     * Offer code expiration time. Has the following format: &#x60;yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZ&#x60;.
     * <p>
     * The field is required.
     *
     * @param expirationTime
     * @return This {@link WhatsAppTemplateLimitedTimeOfferContent instance}.
     */
    public WhatsAppTemplateLimitedTimeOfferContent expirationTime(OffsetDateTime expirationTime) {
        this.expirationTime = expirationTime;
        return this;
    }

    /**
     * Returns expirationTime.
     * <p>
     * Field description:
     * Offer code expiration time. Has the following format: &#x60;yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZ&#x60;.
     * <p>
     * The field is required.
     *
     * @return expirationTime
     */
    @JsonProperty("expirationTime")
    public OffsetDateTime getExpirationTime() {
        return expirationTime;
    }

    /**
     * Sets expirationTime.
     * <p>
     * Field description:
     * Offer code expiration time. Has the following format: &#x60;yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZ&#x60;.
     * <p>
     * The field is required.
     *
     * @param expirationTime
     */
    @JsonProperty("expirationTime")
    public void setExpirationTime(OffsetDateTime expirationTime) {
        this.expirationTime = expirationTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WhatsAppTemplateLimitedTimeOfferContent whatsAppTemplateLimitedTimeOfferContent =
                (WhatsAppTemplateLimitedTimeOfferContent) o;
        return Objects.equals(this.expirationTime, whatsAppTemplateLimitedTimeOfferContent.expirationTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(expirationTime);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class WhatsAppTemplateLimitedTimeOfferContent {")
                .append(newLine)
                .append("    expirationTime: ")
                .append(toIndentedString(expirationTime))
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
