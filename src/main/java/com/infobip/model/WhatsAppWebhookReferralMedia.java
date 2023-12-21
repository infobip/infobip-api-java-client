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
 * Media information of included referral.
 */
public class WhatsAppWebhookReferralMedia {

    protected final WhatsAppWebhookMediaType type;

    /**
     * Constructs a new {@link WhatsAppWebhookReferralMedia} instance.
     */
    public WhatsAppWebhookReferralMedia(String type) {
        this.type = WhatsAppWebhookMediaType.fromValue(type);
    }

    private String url;

    /**
     * Returns type.
     *
     * @return type
     */
    @JsonProperty("type")
    public WhatsAppWebhookMediaType getType() {
        return type;
    }

    /**
     * Sets url.
     * <p>
     * Field description:
     * URL that leads to the video that end user saw and clicked.
     *
     * @param url
     * @return This {@link WhatsAppWebhookReferralMedia instance}.
     */
    public WhatsAppWebhookReferralMedia url(String url) {
        this.url = url;
        return this;
    }

    /**
     * Returns url.
     * <p>
     * Field description:
     * URL that leads to the video that end user saw and clicked.
     *
     * @return url
     */
    @JsonProperty("url")
    public String getUrl() {
        return url;
    }

    /**
     * Sets url.
     * <p>
     * Field description:
     * URL that leads to the video that end user saw and clicked.
     *
     * @param url
     */
    @JsonProperty("url")
    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WhatsAppWebhookReferralMedia whatsAppWebhookReferralMedia = (WhatsAppWebhookReferralMedia) o;
        return Objects.equals(this.type, whatsAppWebhookReferralMedia.type)
                && Objects.equals(this.url, whatsAppWebhookReferralMedia.url);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, url);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class WhatsAppWebhookReferralMedia {")
                .append(newLine)
                .append("    type: ")
                .append(toIndentedString(type))
                .append(newLine)
                .append("    url: ")
                .append(toIndentedString(url))
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
