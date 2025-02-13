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
 * Set of alignment options for the Card.
 */
public class MessagesApiMessageCardOptions {

    private MessagesApiMessageCardOptionsOrientationEnum orientation;

    private MessagesApiMessageCardOptionsAlignmentEnum alignment;

    private MessagesApiMessageCardOptionsHeightEnum height;

    /**
     * Sets orientation.
     *
     * @param orientation
     * @return This {@link MessagesApiMessageCardOptions instance}.
     */
    public MessagesApiMessageCardOptions orientation(MessagesApiMessageCardOptionsOrientationEnum orientation) {
        this.orientation = orientation;
        return this;
    }

    /**
     * Returns orientation.
     *
     * @return orientation
     */
    @JsonProperty("orientation")
    public MessagesApiMessageCardOptionsOrientationEnum getOrientation() {
        return orientation;
    }

    /**
     * Sets orientation.
     *
     * @param orientation
     */
    @JsonProperty("orientation")
    public void setOrientation(MessagesApiMessageCardOptionsOrientationEnum orientation) {
        this.orientation = orientation;
    }

    /**
     * Sets alignment.
     *
     * @param alignment
     * @return This {@link MessagesApiMessageCardOptions instance}.
     */
    public MessagesApiMessageCardOptions alignment(MessagesApiMessageCardOptionsAlignmentEnum alignment) {
        this.alignment = alignment;
        return this;
    }

    /**
     * Returns alignment.
     *
     * @return alignment
     */
    @JsonProperty("alignment")
    public MessagesApiMessageCardOptionsAlignmentEnum getAlignment() {
        return alignment;
    }

    /**
     * Sets alignment.
     *
     * @param alignment
     */
    @JsonProperty("alignment")
    public void setAlignment(MessagesApiMessageCardOptionsAlignmentEnum alignment) {
        this.alignment = alignment;
    }

    /**
     * Sets height.
     *
     * @param height
     * @return This {@link MessagesApiMessageCardOptions instance}.
     */
    public MessagesApiMessageCardOptions height(MessagesApiMessageCardOptionsHeightEnum height) {
        this.height = height;
        return this;
    }

    /**
     * Returns height.
     *
     * @return height
     */
    @JsonProperty("height")
    public MessagesApiMessageCardOptionsHeightEnum getHeight() {
        return height;
    }

    /**
     * Sets height.
     *
     * @param height
     */
    @JsonProperty("height")
    public void setHeight(MessagesApiMessageCardOptionsHeightEnum height) {
        this.height = height;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MessagesApiMessageCardOptions messagesApiMessageCardOptions = (MessagesApiMessageCardOptions) o;
        return Objects.equals(this.orientation, messagesApiMessageCardOptions.orientation)
                && Objects.equals(this.alignment, messagesApiMessageCardOptions.alignment)
                && Objects.equals(this.height, messagesApiMessageCardOptions.height);
    }

    @Override
    public int hashCode() {
        return Objects.hash(orientation, alignment, height);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class MessagesApiMessageCardOptions {")
                .append(newLine)
                .append("    orientation: ")
                .append(toIndentedString(orientation))
                .append(newLine)
                .append("    alignment: ")
                .append(toIndentedString(alignment))
                .append(newLine)
                .append("    height: ")
                .append(toIndentedString(height))
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
