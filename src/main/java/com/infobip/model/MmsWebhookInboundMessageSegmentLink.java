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
 * Represents MmsWebhookInboundMessageSegmentLink model.
 */
public class MmsWebhookInboundMessageSegmentLink {

    private String contentType;

    private String url;

    /**
     * Sets contentType.
     * <p>
     * Field description:
     * Content type of the message segment, e.g. &#x60;image/jpeg&#x60;.
     *
     * @param contentType
     * @return This {@link MmsWebhookInboundMessageSegmentLink instance}.
     */
    public MmsWebhookInboundMessageSegmentLink contentType(String contentType) {
        this.contentType = contentType;
        return this;
    }

    /**
     * Returns contentType.
     * <p>
     * Field description:
     * Content type of the message segment, e.g. &#x60;image/jpeg&#x60;.
     *
     * @return contentType
     */
    @JsonProperty("contentType")
    public String getContentType() {
        return contentType;
    }

    /**
     * Sets contentType.
     * <p>
     * Field description:
     * Content type of the message segment, e.g. &#x60;image/jpeg&#x60;.
     *
     * @param contentType
     */
    @JsonProperty("contentType")
    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    /**
     * Sets url.
     * <p>
     * Field description:
     * URL from which content can be downloaded.
     *
     * @param url
     * @return This {@link MmsWebhookInboundMessageSegmentLink instance}.
     */
    public MmsWebhookInboundMessageSegmentLink url(String url) {
        this.url = url;
        return this;
    }

    /**
     * Returns url.
     * <p>
     * Field description:
     * URL from which content can be downloaded.
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
     * URL from which content can be downloaded.
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
        MmsWebhookInboundMessageSegmentLink mmsWebhookInboundMessageSegmentLink =
                (MmsWebhookInboundMessageSegmentLink) o;
        return Objects.equals(this.contentType, mmsWebhookInboundMessageSegmentLink.contentType)
                && Objects.equals(this.url, mmsWebhookInboundMessageSegmentLink.url);
    }

    @Override
    public int hashCode() {
        return Objects.hash(contentType, url);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class MmsWebhookInboundMessageSegmentLink {")
                .append(newLine)
                .append("    contentType: ")
                .append(toIndentedString(contentType))
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
