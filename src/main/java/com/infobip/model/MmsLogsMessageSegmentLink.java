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
 * Represents MmsLogsMessageSegmentLink model.
 */
public class MmsLogsMessageSegmentLink {

    private String contentId;

    private String contentType;

    private String contentUrl;

    /**
     * Sets contentId.
     * <p>
     * Field description:
     * Unique identifier within single message. &#x60;[a-zA-Z]&#x60; up to 20 characters.
     *
     * @param contentId
     * @return This {@link MmsLogsMessageSegmentLink instance}.
     */
    public MmsLogsMessageSegmentLink contentId(String contentId) {
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
     * Sets contentType.
     * <p>
     * Field description:
     * Content type for media, for example &#39;image/png&#39;.
     *
     * @param contentType
     * @return This {@link MmsLogsMessageSegmentLink instance}.
     */
    public MmsLogsMessageSegmentLink contentType(String contentType) {
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
     * @return This {@link MmsLogsMessageSegmentLink instance}.
     */
    public MmsLogsMessageSegmentLink contentUrl(String contentUrl) {
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
        MmsLogsMessageSegmentLink mmsLogsMessageSegmentLink = (MmsLogsMessageSegmentLink) o;
        return Objects.equals(this.contentId, mmsLogsMessageSegmentLink.contentId)
                && Objects.equals(this.contentType, mmsLogsMessageSegmentLink.contentType)
                && Objects.equals(this.contentUrl, mmsLogsMessageSegmentLink.contentUrl);
    }

    @Override
    public int hashCode() {
        return Objects.hash(contentId, contentType, contentUrl);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class MmsLogsMessageSegmentLink {")
                .append(newLine)
                .append("    contentId: ")
                .append(toIndentedString(contentId))
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
