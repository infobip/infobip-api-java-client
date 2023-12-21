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
 * Content of the message being sent.
 */
public class MmsLogsMessageSegment {

    private String contentId;

    private String text;

    private String contentType;

    private String contentUrl;

    /**
     * Sets contentId.
     * <p>
     * Field description:
     * Unique identifier within single message. &#x60;[a-zA-Z]&#x60; up to 20 characters.
     *
     * @param contentId
     * @return This {@link MmsLogsMessageSegment instance}.
     */
    public MmsLogsMessageSegment contentId(String contentId) {
        this.contentId = contentId;
        return this;
    }

    /**
     * Returns contentId.
     * <p>
     * Field description:
     * Unique identifier within single message. &#x60;[a-zA-Z]&#x60; up to 20 characters.
     *
     * @return contentId
     */
    @JsonProperty("contentId")
    public String getContentId() {
        return contentId;
    }

    /**
     * Sets contentId.
     * <p>
     * Field description:
     * Unique identifier within single message. &#x60;[a-zA-Z]&#x60; up to 20 characters.
     *
     * @param contentId
     */
    @JsonProperty("contentId")
    public void setContentId(String contentId) {
        this.contentId = contentId;
    }

    /**
     * Sets text.
     * <p>
     * Field description:
     * Message text.
     *
     * @param text
     * @return This {@link MmsLogsMessageSegment instance}.
     */
    public MmsLogsMessageSegment text(String text) {
        this.text = text;
        return this;
    }

    /**
     * Returns text.
     * <p>
     * Field description:
     * Message text.
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
     * Message text.
     *
     * @param text
     */
    @JsonProperty("text")
    public void setText(String text) {
        this.text = text;
    }

    /**
     * Sets contentType.
     * <p>
     * Field description:
     * Content type for media, for example &#39;image/png&#39;.
     *
     * @param contentType
     * @return This {@link MmsLogsMessageSegment instance}.
     */
    public MmsLogsMessageSegment contentType(String contentType) {
        this.contentType = contentType;
        return this;
    }

    /**
     * Returns contentType.
     * <p>
     * Field description:
     * Content type for media, for example &#39;image/png&#39;.
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
     * Content type for media, for example &#39;image/png&#39;.
     *
     * @param contentType
     */
    @JsonProperty("contentType")
    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    /**
     * Sets contentUrl.
     * <p>
     * Field description:
     * URL of hosted content. URL will be available for 48 hours. If hosted externally (by client) make sure it is available for 48 hours
     *
     * @param contentUrl
     * @return This {@link MmsLogsMessageSegment instance}.
     */
    public MmsLogsMessageSegment contentUrl(String contentUrl) {
        this.contentUrl = contentUrl;
        return this;
    }

    /**
     * Returns contentUrl.
     * <p>
     * Field description:
     * URL of hosted content. URL will be available for 48 hours. If hosted externally (by client) make sure it is available for 48 hours
     *
     * @return contentUrl
     */
    @JsonProperty("contentUrl")
    public String getContentUrl() {
        return contentUrl;
    }

    /**
     * Sets contentUrl.
     * <p>
     * Field description:
     * URL of hosted content. URL will be available for 48 hours. If hosted externally (by client) make sure it is available for 48 hours
     *
     * @param contentUrl
     */
    @JsonProperty("contentUrl")
    public void setContentUrl(String contentUrl) {
        this.contentUrl = contentUrl;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MmsLogsMessageSegment mmsLogsMessageSegment = (MmsLogsMessageSegment) o;
        return Objects.equals(this.contentId, mmsLogsMessageSegment.contentId)
                && Objects.equals(this.text, mmsLogsMessageSegment.text)
                && Objects.equals(this.contentType, mmsLogsMessageSegment.contentType)
                && Objects.equals(this.contentUrl, mmsLogsMessageSegment.contentUrl);
    }

    @Override
    public int hashCode() {
        return Objects.hash(contentId, text, contentType, contentUrl);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class MmsLogsMessageSegment {")
                .append(newLine)
                .append("    contentId: ")
                .append(toIndentedString(contentId))
                .append(newLine)
                .append("    text: ")
                .append(toIndentedString(text))
                .append(newLine)
                .append("    contentType: ")
                .append(toIndentedString(contentType))
                .append(newLine)
                .append("    contentUrl: ")
                .append(toIndentedString(contentUrl))
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
