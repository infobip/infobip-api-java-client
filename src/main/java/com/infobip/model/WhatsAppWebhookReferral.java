/*
 * This class is auto generated from the Infobip OpenAPI specification
 * through the OpenAPI Specification Client API libraries (Re)Generator (OSCAR),
 * powered by the OpenAPI Generator (https://openapi-generator.tech).
 *
 * Do not edit manually. To learn how to raise an issue, see the CONTRIBUTING guide
 * or contact us @ support@infobip.com.
 */

package com.infobip.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;

/**
 * Information about the referral which is either a Facebook ad or a post that triggered the message.
 */
public class WhatsAppWebhookReferral {
    /**
     * Indicates the source of the referral. Takes the value of &#x60;UNKNOWN&#x60; if there&#39;s no value or the value is different from &#x60;AD&#x60; or &#x60;POST&#x60;.
     */
    public enum SourceTypeEnum {
        AD("AD"),
        POST("POST"),
        UNKNOWN("UNKNOWN");

        private String value;

        SourceTypeEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static SourceTypeEnum fromValue(String value) {
            for (SourceTypeEnum enumElement : SourceTypeEnum.values()) {
                if (enumElement.value.equals(value)) {
                    return enumElement;
                }
            }
            throw new IllegalArgumentException("Unexpected enum value '" + value + "'.");
        }
    }

    private SourceTypeEnum sourceType;

    private String sourceId;

    private String sourceUrl;

    private String headline;

    private String body;

    private String ctwaClickId;

    private WhatsAppWebhookReferralMedia referralMedia;

    /**
     * Sets sourceType.
     * <p>
     * Field description:
     * Indicates the source of the referral. Takes the value of &#x60;UNKNOWN&#x60; if there&#39;s no value or the value is different from &#x60;AD&#x60; or &#x60;POST&#x60;.
     *
     * @param sourceType
     * @return This {@link WhatsAppWebhookReferral instance}.
     */
    public WhatsAppWebhookReferral sourceType(SourceTypeEnum sourceType) {
        this.sourceType = sourceType;
        return this;
    }

    /**
     * Returns sourceType.
     * <p>
     * Field description:
     * Indicates the source of the referral. Takes the value of &#x60;UNKNOWN&#x60; if there&#39;s no value or the value is different from &#x60;AD&#x60; or &#x60;POST&#x60;.
     *
     * @return sourceType
     */
    @JsonProperty("sourceType")
    public SourceTypeEnum getSourceType() {
        return sourceType;
    }

    /**
     * Sets sourceType.
     * <p>
     * Field description:
     * Indicates the source of the referral. Takes the value of &#x60;UNKNOWN&#x60; if there&#39;s no value or the value is different from &#x60;AD&#x60; or &#x60;POST&#x60;.
     *
     * @param sourceType
     */
    @JsonProperty("sourceType")
    public void setSourceType(SourceTypeEnum sourceType) {
        this.sourceType = sourceType;
    }

    /**
     * Sets sourceId.
     * <p>
     * Field description:
     * Facebook ID of an ad or a post.
     *
     * @param sourceId
     * @return This {@link WhatsAppWebhookReferral instance}.
     */
    public WhatsAppWebhookReferral sourceId(String sourceId) {
        this.sourceId = sourceId;
        return this;
    }

    /**
     * Returns sourceId.
     * <p>
     * Field description:
     * Facebook ID of an ad or a post.
     *
     * @return sourceId
     */
    @JsonProperty("sourceId")
    public String getSourceId() {
        return sourceId;
    }

    /**
     * Sets sourceId.
     * <p>
     * Field description:
     * Facebook ID of an ad or a post.
     *
     * @param sourceId
     */
    @JsonProperty("sourceId")
    public void setSourceId(String sourceId) {
        this.sourceId = sourceId;
    }

    /**
     * Sets sourceUrl.
     * <p>
     * Field description:
     * The URL that leads to a Facebook ad or a post.
     *
     * @param sourceUrl
     * @return This {@link WhatsAppWebhookReferral instance}.
     */
    public WhatsAppWebhookReferral sourceUrl(String sourceUrl) {
        this.sourceUrl = sourceUrl;
        return this;
    }

    /**
     * Returns sourceUrl.
     * <p>
     * Field description:
     * The URL that leads to a Facebook ad or a post.
     *
     * @return sourceUrl
     */
    @JsonProperty("sourceUrl")
    public String getSourceUrl() {
        return sourceUrl;
    }

    /**
     * Sets sourceUrl.
     * <p>
     * Field description:
     * The URL that leads to a Facebook ad or a post.
     *
     * @param sourceUrl
     */
    @JsonProperty("sourceUrl")
    public void setSourceUrl(String sourceUrl) {
        this.sourceUrl = sourceUrl;
    }

    /**
     * Sets headline.
     * <p>
     * Field description:
     * Headline used in the ad that generated the message.
     *
     * @param headline
     * @return This {@link WhatsAppWebhookReferral instance}.
     */
    public WhatsAppWebhookReferral headline(String headline) {
        this.headline = headline;
        return this;
    }

    /**
     * Returns headline.
     * <p>
     * Field description:
     * Headline used in the ad that generated the message.
     *
     * @return headline
     */
    @JsonProperty("headline")
    public String getHeadline() {
        return headline;
    }

    /**
     * Sets headline.
     * <p>
     * Field description:
     * Headline used in the ad that generated the message.
     *
     * @param headline
     */
    @JsonProperty("headline")
    public void setHeadline(String headline) {
        this.headline = headline;
    }

    /**
     * Sets body.
     * <p>
     * Field description:
     * Body from the ad that generated the message.
     *
     * @param body
     * @return This {@link WhatsAppWebhookReferral instance}.
     */
    public WhatsAppWebhookReferral body(String body) {
        this.body = body;
        return this;
    }

    /**
     * Returns body.
     * <p>
     * Field description:
     * Body from the ad that generated the message.
     *
     * @return body
     */
    @JsonProperty("body")
    public String getBody() {
        return body;
    }

    /**
     * Sets body.
     * <p>
     * Field description:
     * Body from the ad that generated the message.
     *
     * @param body
     */
    @JsonProperty("body")
    public void setBody(String body) {
        this.body = body;
    }

    /**
     * Sets ctwaClickId.
     * <p>
     * Field description:
     * Unique per click identifier exposed when the end user entering the conversation originated from a Click to WhatsApp (CTWA) ad.
     *
     * @param ctwaClickId
     * @return This {@link WhatsAppWebhookReferral instance}.
     */
    public WhatsAppWebhookReferral ctwaClickId(String ctwaClickId) {
        this.ctwaClickId = ctwaClickId;
        return this;
    }

    /**
     * Returns ctwaClickId.
     * <p>
     * Field description:
     * Unique per click identifier exposed when the end user entering the conversation originated from a Click to WhatsApp (CTWA) ad.
     *
     * @return ctwaClickId
     */
    @JsonProperty("ctwaClickId")
    public String getCtwaClickId() {
        return ctwaClickId;
    }

    /**
     * Sets ctwaClickId.
     * <p>
     * Field description:
     * Unique per click identifier exposed when the end user entering the conversation originated from a Click to WhatsApp (CTWA) ad.
     *
     * @param ctwaClickId
     */
    @JsonProperty("ctwaClickId")
    public void setCtwaClickId(String ctwaClickId) {
        this.ctwaClickId = ctwaClickId;
    }

    /**
     * Sets referralMedia.
     *
     * @param referralMedia
     * @return This {@link WhatsAppWebhookReferral instance}.
     */
    public WhatsAppWebhookReferral referralMedia(WhatsAppWebhookReferralMedia referralMedia) {
        this.referralMedia = referralMedia;
        return this;
    }

    /**
     * Returns referralMedia.
     *
     * @return referralMedia
     */
    @JsonProperty("referralMedia")
    public WhatsAppWebhookReferralMedia getReferralMedia() {
        return referralMedia;
    }

    /**
     * Sets referralMedia.
     *
     * @param referralMedia
     */
    @JsonProperty("referralMedia")
    public void setReferralMedia(WhatsAppWebhookReferralMedia referralMedia) {
        this.referralMedia = referralMedia;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WhatsAppWebhookReferral whatsAppWebhookReferral = (WhatsAppWebhookReferral) o;
        return Objects.equals(this.sourceType, whatsAppWebhookReferral.sourceType)
                && Objects.equals(this.sourceId, whatsAppWebhookReferral.sourceId)
                && Objects.equals(this.sourceUrl, whatsAppWebhookReferral.sourceUrl)
                && Objects.equals(this.headline, whatsAppWebhookReferral.headline)
                && Objects.equals(this.body, whatsAppWebhookReferral.body)
                && Objects.equals(this.ctwaClickId, whatsAppWebhookReferral.ctwaClickId)
                && Objects.equals(this.referralMedia, whatsAppWebhookReferral.referralMedia);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sourceType, sourceId, sourceUrl, headline, body, ctwaClickId, referralMedia);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class WhatsAppWebhookReferral {")
                .append(newLine)
                .append("    sourceType: ")
                .append(toIndentedString(sourceType))
                .append(newLine)
                .append("    sourceId: ")
                .append(toIndentedString(sourceId))
                .append(newLine)
                .append("    sourceUrl: ")
                .append(toIndentedString(sourceUrl))
                .append(newLine)
                .append("    headline: ")
                .append(toIndentedString(headline))
                .append(newLine)
                .append("    body: ")
                .append(toIndentedString(body))
                .append(newLine)
                .append("    ctwaClickId: ")
                .append(toIndentedString(ctwaClickId))
                .append(newLine)
                .append("    referralMedia: ")
                .append(toIndentedString(referralMedia))
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
