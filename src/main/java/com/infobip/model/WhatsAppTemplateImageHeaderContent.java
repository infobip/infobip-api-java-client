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
 * Represents WhatsAppTemplateImageHeaderContent model.
 */
public class WhatsAppTemplateImageHeaderContent extends WhatsAppTemplateHeaderContent {

    private String mediaUrl;

    /**
     * Constructs a new {@link WhatsAppTemplateImageHeaderContent} instance.
     */
    public WhatsAppTemplateImageHeaderContent() {
        super("IMAGE");
    }

    /**
     * Sets mediaUrl.
     * <p>
     * Field description:
     * URL of an image sent in the header. It is expected to be a valid URL starting with &#x60;https://&#x60; or &#x60;http://&#x60;. Supported image types are &#x60;JPG&#x60;, &#x60;JPEG&#x60;, &#x60;PNG&#x60;. Maximum image size is 5MB.
     * <p>
     * The field is required.
     *
     * @param mediaUrl
     * @return This {@link WhatsAppTemplateImageHeaderContent instance}.
     */
    public WhatsAppTemplateImageHeaderContent mediaUrl(String mediaUrl) {
        this.mediaUrl = mediaUrl;
        return this;
    }

    /**
     * Returns mediaUrl.
     * <p>
     * Field description:
     * URL of an image sent in the header. It is expected to be a valid URL starting with &#x60;https://&#x60; or &#x60;http://&#x60;. Supported image types are &#x60;JPG&#x60;, &#x60;JPEG&#x60;, &#x60;PNG&#x60;. Maximum image size is 5MB.
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
     * URL of an image sent in the header. It is expected to be a valid URL starting with &#x60;https://&#x60; or &#x60;http://&#x60;. Supported image types are &#x60;JPG&#x60;, &#x60;JPEG&#x60;, &#x60;PNG&#x60;. Maximum image size is 5MB.
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
        WhatsAppTemplateImageHeaderContent whatsAppTemplateImageHeaderContent = (WhatsAppTemplateImageHeaderContent) o;
        return Objects.equals(this.mediaUrl, whatsAppTemplateImageHeaderContent.mediaUrl) && super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(mediaUrl, super.hashCode());
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class WhatsAppTemplateImageHeaderContent {")
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
