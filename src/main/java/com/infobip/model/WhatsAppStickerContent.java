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
 * The content object to build a message that will be sent.
 */
public class WhatsAppStickerContent {

    private String mediaUrl;

    /**
     * Sets mediaUrl.
     * <p>
     * Field description:
     * URL of a sticker sent in a WhatsApp message. Must be a valid URL starting with &#x60;https://&#x60; or &#x60;http://&#x60;. Supported sticker type is &#x60;WebP&#x60;. Sticker file should be 512x512 pixels. Maximum size is 100KB for static sticker and 500KB for animated sticker.
     * <p>
     * The field is required.
     *
     * @param mediaUrl
     * @return This {@link WhatsAppStickerContent instance}.
     */
    public WhatsAppStickerContent mediaUrl(String mediaUrl) {
        this.mediaUrl = mediaUrl;
        return this;
    }

    /**
     * Returns mediaUrl.
     * <p>
     * Field description:
     * URL of a sticker sent in a WhatsApp message. Must be a valid URL starting with &#x60;https://&#x60; or &#x60;http://&#x60;. Supported sticker type is &#x60;WebP&#x60;. Sticker file should be 512x512 pixels. Maximum size is 100KB for static sticker and 500KB for animated sticker.
     * <p>
     * The field is required.
     *
     * @return mediaUrl
     */
    @JsonProperty("mediaUrl")
    public String getMediaUrl() {
        return mediaUrl;
    }

    /**
     * Sets mediaUrl.
     * <p>
     * Field description:
     * URL of a sticker sent in a WhatsApp message. Must be a valid URL starting with &#x60;https://&#x60; or &#x60;http://&#x60;. Supported sticker type is &#x60;WebP&#x60;. Sticker file should be 512x512 pixels. Maximum size is 100KB for static sticker and 500KB for animated sticker.
     * <p>
     * The field is required.
     *
     * @param mediaUrl
     */
    @JsonProperty("mediaUrl")
    public void setMediaUrl(String mediaUrl) {
        this.mediaUrl = mediaUrl;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WhatsAppStickerContent whatsAppStickerContent = (WhatsAppStickerContent) o;
        return Objects.equals(this.mediaUrl, whatsAppStickerContent.mediaUrl);
    }

    @Override
    public int hashCode() {
        return Objects.hash(mediaUrl);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class WhatsAppStickerContent {")
                .append(newLine)
                .append("    mediaUrl: ")
                .append(toIndentedString(mediaUrl))
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
