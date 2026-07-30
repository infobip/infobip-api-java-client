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
 * Received message parts.
 */
public class MmsInboundMessagePart {

    private String origin;

    private String contentType;

    private String contentId;

    private String value;

    /**
     * Sets origin.
     *
     * @param origin
     * @return This {@link MmsInboundMessagePart instance}.
     */
    public MmsInboundMessagePart origin(String origin) {
        this.origin = origin;
        return this;
    }

    /**
     * Returns origin.
     *
     * @return origin
     */
    @JsonProperty("origin")
    public String getOrigin() {
        return origin;
    }

    /**
     * Sets origin.
     *
     * @param origin
     */
    @JsonProperty("origin")
    public void setOrigin(String origin) {
        this.origin = origin;
    }

    /**
     * Sets contentType.
     *
     * @param contentType
     * @return This {@link MmsInboundMessagePart instance}.
     */
    public MmsInboundMessagePart contentType(String contentType) {
        this.contentType = contentType;
        return this;
    }

    /**
     * Returns contentType.
     *
     * @return contentType
     */
    @JsonProperty("contentType")
    public String getContentType() {
        return contentType;
    }

    /**
     * Sets contentType.
     *
     * @param contentType
     */
    @JsonProperty("contentType")
    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    /**
     * Sets contentId.
     *
     * @param contentId
     * @return This {@link MmsInboundMessagePart instance}.
     */
    public MmsInboundMessagePart contentId(String contentId) {
        this.contentId = contentId;
        return this;
    }

    /**
     * Returns contentId.
     *
     * @return contentId
     */
    @JsonProperty("contentId")
    public String getContentId() {
        return contentId;
    }

    /**
     * Sets contentId.
     *
     * @param contentId
     */
    @JsonProperty("contentId")
    public void setContentId(String contentId) {
        this.contentId = contentId;
    }

    /**
     * Sets value.
     *
     * @param value
     * @return This {@link MmsInboundMessagePart instance}.
     */
    public MmsInboundMessagePart value(String value) {
        this.value = value;
        return this;
    }

    /**
     * Returns value.
     *
     * @return value
     */
    @JsonProperty("value")
    public String getValue() {
        return value;
    }

    /**
     * Sets value.
     *
     * @param value
     */
    @JsonProperty("value")
    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MmsInboundMessagePart mmsInboundMessagePart = (MmsInboundMessagePart) o;
        return Objects.equals(this.origin, mmsInboundMessagePart.origin)
                && Objects.equals(this.contentType, mmsInboundMessagePart.contentType)
                && Objects.equals(this.contentId, mmsInboundMessagePart.contentId)
                && Objects.equals(this.value, mmsInboundMessagePart.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(origin, contentType, contentId, value);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class MmsInboundMessagePart {")
                .append(newLine)
                .append("    origin: ")
                .append(toIndentedString(origin))
                .append(newLine)
                .append("    contentType: ")
                .append(toIndentedString(contentType))
                .append(newLine)
                .append("    contentId: ")
                .append(toIndentedString(contentId))
                .append(newLine)
                .append("    value: ")
                .append(toIndentedString(value))
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
