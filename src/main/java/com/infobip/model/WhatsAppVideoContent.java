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
public class WhatsAppVideoContent {

    private String mediaUrl;

    private String caption;

    /**
     * Sets mediaUrl.
     * <p>
     * Field description:
     * URL of a video sent in a WhatsApp message. Must be a valid URL starting with &#x60;https://&#x60; or &#x60;http://&#x60;. Supported video types are &#x60;MP4&#x60;, &#x60;3GPP&#x60;. Maximum video size is 16MB.
     * <p>
     * The field is required.
     *
     * @param mediaUrl
     * @return This {@link WhatsAppVideoContent instance}.
     */
    public WhatsAppVideoContent mediaUrl(String mediaUrl) {
        this.mediaUrl = mediaUrl;
        return this;
    }

    /**
     * Returns mediaUrl.
     * <p>
     * Field description:
     * URL of a video sent in a WhatsApp message. Must be a valid URL starting with &#x60;https://&#x60; or &#x60;http://&#x60;. Supported video types are &#x60;MP4&#x60;, &#x60;3GPP&#x60;. Maximum video size is 16MB.
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
     * URL of a video sent in a WhatsApp message. Must be a valid URL starting with &#x60;https://&#x60; or &#x60;http://&#x60;. Supported video types are &#x60;MP4&#x60;, &#x60;3GPP&#x60;. Maximum video size is 16MB.
     * <p>
     * The field is required.
     *
     * @param mediaUrl
     */
    @JsonProperty("mediaUrl")
    public void setMediaUrl(String mediaUrl) {
        this.mediaUrl = mediaUrl;
    }

    /**
     * Sets caption.
     * <p>
     * Field description:
     * Caption of the video.
     *
     * @param caption
     * @return This {@link WhatsAppVideoContent instance}.
     */
    public WhatsAppVideoContent caption(String caption) {
        this.caption = caption;
        return this;
    }

    /**
     * Returns caption.
     * <p>
     * Field description:
     * Caption of the video.
     *
     * @return caption
     */
    @JsonProperty("caption")
    public String getCaption() {
        return caption;
    }

    /**
     * Sets caption.
     * <p>
     * Field description:
     * Caption of the video.
     *
     * @param caption
     */
    @JsonProperty("caption")
    public void setCaption(String caption) {
        this.caption = caption;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WhatsAppVideoContent whatsAppVideoContent = (WhatsAppVideoContent) o;
        return Objects.equals(this.mediaUrl, whatsAppVideoContent.mediaUrl)
                && Objects.equals(this.caption, whatsAppVideoContent.caption);
    }

    @Override
    public int hashCode() {
        return Objects.hash(mediaUrl, caption);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class WhatsAppVideoContent {")
                .append(newLine)
                .append("    mediaUrl: ")
                .append(toIndentedString(mediaUrl))
                .append(newLine)
                .append("    caption: ")
                .append(toIndentedString(caption))
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
