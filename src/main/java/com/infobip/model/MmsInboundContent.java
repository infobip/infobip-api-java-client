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
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Message content.
 */
public class MmsInboundContent {

    private List<MmsInboundSegment> messageSegments = new ArrayList<>();

    /**
     * Sets messageSegments.
     * <p>
     * Field description:
     * Content of the message.
     * <p>
     * The field is required.
     *
     * @param messageSegments
     * @return This {@link MmsInboundContent instance}.
     */
    public MmsInboundContent messageSegments(List<MmsInboundSegment> messageSegments) {
        this.messageSegments = messageSegments;
        return this;
    }

    /**
     * Adds and item into messageSegments.
     * <p>
     * Field description:
     * Content of the message.
     * <p>
     * The field is required.
     *
     * @param messageSegmentsItem The item to be added to the list.
     * @return This {@link MmsInboundContent instance}.
     */
    public MmsInboundContent addMessageSegmentsItem(MmsInboundSegment messageSegmentsItem) {
        if (this.messageSegments == null) {
            this.messageSegments = new ArrayList<>();
        }
        this.messageSegments.add(messageSegmentsItem);
        return this;
    }

    /**
     * Returns messageSegments.
     * <p>
     * Field description:
     * Content of the message.
     * <p>
     * The field is required.
     *
     * @return messageSegments
     */
    @JsonProperty("messageSegments")
    public List<MmsInboundSegment> getMessageSegments() {
        return messageSegments;
    }

    /**
     * Sets messageSegments.
     * <p>
     * Field description:
     * Content of the message.
     * <p>
     * The field is required.
     *
     * @param messageSegments
     */
    @JsonProperty("messageSegments")
    public void setMessageSegments(List<MmsInboundSegment> messageSegments) {
        this.messageSegments = messageSegments;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MmsInboundContent mmsInboundContent = (MmsInboundContent) o;
        return Objects.equals(this.messageSegments, mmsInboundContent.messageSegments);
    }

    @Override
    public int hashCode() {
        return Objects.hash(messageSegments);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class MmsInboundContent {")
                .append(newLine)
                .append("    messageSegments: ")
                .append(toIndentedString(messageSegments))
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
