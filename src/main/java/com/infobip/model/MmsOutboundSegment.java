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
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.util.Objects;

/**
 * Content of the message being sent.
 */
@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.EXISTING_PROPERTY,
        property = "type",
        visible = true)
@JsonSubTypes({
    @JsonSubTypes.Type(value = MmsOutboundLinkSegment.class, name = "LINK"),
    @JsonSubTypes.Type(value = MmsOutboundSmilSegment.class, name = "SMIL"),
    @JsonSubTypes.Type(value = MmsOutboundTextSegment.class, name = "TEXT"),
    @JsonSubTypes.Type(value = MmsOutboundUploadedReferenceSegment.class, name = "UPLOADED_REFERENCE"),
})
public abstract class MmsOutboundSegment {

    protected final MmsOutboundSegmentType type;

    /**
     * Constructs a new {@link MmsOutboundSegment} instance.
     */
    public MmsOutboundSegment(String type) {
        this.type = MmsOutboundSegmentType.fromValue(type);
    }

    /**
     * Returns type.
     *
     * @return type
     */
    @JsonProperty("type")
    public MmsOutboundSegmentType getType() {
        return type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MmsOutboundSegment mmsOutboundSegment = (MmsOutboundSegment) o;
        return Objects.equals(this.type, mmsOutboundSegment.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class MmsOutboundSegment {")
                .append(newLine)
                .append("    type: ")
                .append(toIndentedString(type))
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
