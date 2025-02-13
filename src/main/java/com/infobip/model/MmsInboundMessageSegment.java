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
 * All parts of the received message.
 */
public class MmsInboundMessageSegment {

    private String contentType;

    private String value;

    private String url;

    /**
     * Sets contentType.
     * <p>
     * Field description:
     * Content type of the message segment &#x60;image/jpeg&#x60;.
     *
     * @param contentType
     * @return This {@link MmsInboundMessageSegment instance}.
     */
    public MmsInboundMessageSegment contentType(String contentType) {
        this.contentType = contentType;
        return this;
    }

    /**
     * Returns contentType.
     * <p>
     * Field description:
     * Content type of the message segment &#x60;image/jpeg&#x60;.
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
     * Content type of the message segment &#x60;image/jpeg&#x60;.
     *
     * @param contentType
     */
    @JsonProperty("contentType")
    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    /**
     * Sets value.
     * <p>
     * Field description:
     * Message text.
     *
     * @param value
     * @return This {@link MmsInboundMessageSegment instance}.
     */
    public MmsInboundMessageSegment value(String value) {
        this.value = value;
        return this;
    }

    /**
     * Returns value.
     * <p>
     * Field description:
     * Message text.
     *
     * @return value
     */
    @JsonProperty("value")
    public String getValue() {
        return value;
    }

    /**
     * Sets value.
     * <p>
     * Field description:
     * Message text.
     *
     * @param value
     */
    @JsonProperty("value")
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Sets url.
     * <p>
     * Field description:
     * URL from which content can be downloaded.
     *
     * @param url
     * @return This {@link MmsInboundMessageSegment instance}.
     */
    public MmsInboundMessageSegment url(String url) {
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
        MmsInboundMessageSegment mmsInboundMessageSegment = (MmsInboundMessageSegment) o;
        return Objects.equals(this.contentType, mmsInboundMessageSegment.contentType)
                && Objects.equals(this.value, mmsInboundMessageSegment.value)
                && Objects.equals(this.url, mmsInboundMessageSegment.url);
    }

    @Override
    public int hashCode() {
        return Objects.hash(contentType, value, url);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class MmsInboundMessageSegment {")
                .append(newLine)
                .append("    contentType: ")
                .append(toIndentedString(contentType))
                .append(newLine)
                .append("    value: ")
                .append(toIndentedString(value))
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
