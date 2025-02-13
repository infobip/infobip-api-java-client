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
 * Represents MmsOutboundTextSegment model.
 */
public class MmsOutboundTextSegment extends MmsOutboundSegment {

    private String contentId;

    private String text;

    /**
     * Constructs a new {@link MmsOutboundTextSegment} instance.
     */
    public MmsOutboundTextSegment() {
        super("TEXT");
    }

    /**
     * Sets contentId.
     * <p>
     * Field description:
     * Unique identifier within single message. Using other characters (e.g. spaces) may cause your message to be rejected by some mobile carriers.
     *
     * @param contentId
     * @return This {@link MmsOutboundTextSegment instance}.
     */
    public MmsOutboundTextSegment contentId(String contentId) {
        this.contentId = contentId;
        return this;
    }

    /**
     * Returns contentId.
     * <p>
     * Field description:
     * Unique identifier within single message. Using other characters (e.g. spaces) may cause your message to be rejected by some mobile carriers.
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
     * Unique identifier within single message. Using other characters (e.g. spaces) may cause your message to be rejected by some mobile carriers.
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
     * Content of the message being sent.
     * <p>
     * The field is required.
     *
     * @param text
     * @return This {@link MmsOutboundTextSegment instance}.
     */
    public MmsOutboundTextSegment text(String text) {
        this.text = text;
        return this;
    }

    /**
     * Returns text.
     * <p>
     * Field description:
     * Content of the message being sent.
     * <p>
     * The field is required.
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
     * Content of the message being sent.
     * <p>
     * The field is required.
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
        MmsOutboundTextSegment mmsOutboundTextSegment = (MmsOutboundTextSegment) o;
        return Objects.equals(this.contentId, mmsOutboundTextSegment.contentId)
                && Objects.equals(this.text, mmsOutboundTextSegment.text)
                && super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(contentId, text, super.hashCode());
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class MmsOutboundTextSegment {")
                .append(newLine)
                .append("    ")
                .append(toIndentedString(super.toString()))
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
