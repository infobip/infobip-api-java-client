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
 * Represents MmsLogsMessageSegmentText model.
 */
public class MmsLogsMessageSegmentText {

    private String contentId;

    private String text;

    /**
     * Sets contentId.
     * <p>
     * Field description:
     * Unique identifier within single message. &#x60;[a-zA-Z]&#x60; up to 20 characters.
     *
     * @param contentId
     * @return This {@link MmsLogsMessageSegmentText instance}.
     */
    public MmsLogsMessageSegmentText contentId(String contentId) {
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
     * @return This {@link MmsLogsMessageSegmentText instance}.
     */
    public MmsLogsMessageSegmentText text(String text) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MmsLogsMessageSegmentText mmsLogsMessageSegmentText = (MmsLogsMessageSegmentText) o;
        return Objects.equals(this.contentId, mmsLogsMessageSegmentText.contentId)
                && Objects.equals(this.text, mmsLogsMessageSegmentText.text);
    }

    @Override
    public int hashCode() {
        return Objects.hash(contentId, text);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class MmsLogsMessageSegmentText {")
                .append(newLine)
                .append("    contentId: ")
                .append(toIndentedString(contentId))
                .append(newLine)
                .append("    text: ")
                .append(toIndentedString(text))
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
