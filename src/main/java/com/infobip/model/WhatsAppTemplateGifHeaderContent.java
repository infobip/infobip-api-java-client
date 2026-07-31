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
 * Represents WhatsAppTemplateGifHeaderContent model.
 */
public class WhatsAppTemplateGifHeaderContent extends WhatsAppTemplateHeaderContent {

    private String mediaUrl;

    /**
     * Constructs a new {@link WhatsAppTemplateGifHeaderContent} instance.
     */
    public WhatsAppTemplateGifHeaderContent() {
        super("GIF");
    }

    /**
     * Sets mediaUrl.
     * <p>
     * Field description:
     * URL of a GIF sent in the header. Must be an MP4 file. It is expected to be a valid URL starting with &#x60;https://&#x60; or &#x60;http://&#x60;. Maximum GIF size is 3.5MB. Files larger than 3.5MB are delivered as video messages. Only available for MM API (Marketing Messages).
     * <p>
     * The field is required.
     *
     * @param mediaUrl
     * @return This {@link WhatsAppTemplateGifHeaderContent instance}.
     */
    public WhatsAppTemplateGifHeaderContent mediaUrl(String mediaUrl) {
        this.mediaUrl = mediaUrl;
        return this;
    }

    /**
     * Returns mediaUrl.
     * <p>
     * Field description:
     * URL of a GIF sent in the header. Must be an MP4 file. It is expected to be a valid URL starting with &#x60;https://&#x60; or &#x60;http://&#x60;. Maximum GIF size is 3.5MB. Files larger than 3.5MB are delivered as video messages. Only available for MM API (Marketing Messages).
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
     * URL of a GIF sent in the header. Must be an MP4 file. It is expected to be a valid URL starting with &#x60;https://&#x60; or &#x60;http://&#x60;. Maximum GIF size is 3.5MB. Files larger than 3.5MB are delivered as video messages. Only available for MM API (Marketing Messages).
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
        WhatsAppTemplateGifHeaderContent whatsAppTemplateGifHeaderContent = (WhatsAppTemplateGifHeaderContent) o;
        return Objects.equals(this.mediaUrl, whatsAppTemplateGifHeaderContent.mediaUrl) && super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(mediaUrl, super.hashCode());
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class WhatsAppTemplateGifHeaderContent {")
                .append(newLine)
                .append("    ")
                .append(toIndentedString(super.toString()))
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
