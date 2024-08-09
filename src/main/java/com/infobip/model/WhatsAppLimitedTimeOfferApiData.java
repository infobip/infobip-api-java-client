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
 * Limited time offer.
 */
public class WhatsAppLimitedTimeOfferApiData {

    private Boolean hasExpiration;

    private String text;

    /**
     * Sets hasExpiration.
     * <p>
     * Field description:
     * Indicates whether offer expiration details will appear in the delivered message. If set to true, copy code button must be included in the buttons array, and must appear first in the array.
     *
     * @param hasExpiration
     * @return This {@link WhatsAppLimitedTimeOfferApiData instance}.
     */
    public WhatsAppLimitedTimeOfferApiData hasExpiration(Boolean hasExpiration) {
        this.hasExpiration = hasExpiration;
        return this;
    }

    /**
     * Returns hasExpiration.
     * <p>
     * Field description:
     * Indicates whether offer expiration details will appear in the delivered message. If set to true, copy code button must be included in the buttons array, and must appear first in the array.
     *
     * @return hasExpiration
     */
    @JsonProperty("hasExpiration")
    public Boolean getHasExpiration() {
        return hasExpiration;
    }

    /**
     * Sets hasExpiration.
     * <p>
     * Field description:
     * Indicates whether offer expiration details will appear in the delivered message. If set to true, copy code button must be included in the buttons array, and must appear first in the array.
     *
     * @param hasExpiration
     */
    @JsonProperty("hasExpiration")
    public void setHasExpiration(Boolean hasExpiration) {
        this.hasExpiration = hasExpiration;
    }

    /**
     * Sets text.
     * <p>
     * Field description:
     * Offer details text. Up to 16 characters.
     * <p>
     * The field is required.
     *
     * @param text
     * @return This {@link WhatsAppLimitedTimeOfferApiData instance}.
     */
    public WhatsAppLimitedTimeOfferApiData text(String text) {
        this.text = text;
        return this;
    }

    /**
     * Returns text.
     * <p>
     * Field description:
     * Offer details text. Up to 16 characters.
     * <p>
     * The field is required.
     *
     * @return text
     */
    @JsonProperty("text")
    public String getText() {
        return text;
    }

    /**
     * Sets text.
     * <p>
     * Field description:
     * Offer details text. Up to 16 characters.
     * <p>
     * The field is required.
     *
     * @param text
     */
    @JsonProperty("text")
    public void setText(String text) {
        this.text = text;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WhatsAppLimitedTimeOfferApiData whatsAppLimitedTimeOfferApiData = (WhatsAppLimitedTimeOfferApiData) o;
        return Objects.equals(this.hasExpiration, whatsAppLimitedTimeOfferApiData.hasExpiration)
                && Objects.equals(this.text, whatsAppLimitedTimeOfferApiData.text);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hasExpiration, text);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class WhatsAppLimitedTimeOfferApiData {")
                .append(newLine)
                .append("    hasExpiration: ")
                .append(toIndentedString(hasExpiration))
                .append(newLine)
                .append("    text: ")
                .append(toIndentedString(text))
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
