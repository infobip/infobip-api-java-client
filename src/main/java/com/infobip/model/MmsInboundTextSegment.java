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
 * Represents MmsInboundTextSegment model.
 */
public class MmsInboundTextSegment extends MmsInboundSegment {

    private String contentType;

    private String value;

    /**
     * Constructs a new {@link MmsInboundTextSegment} instance.
     */
    public MmsInboundTextSegment() {
        super("TEXT");
    }

    /**
     * Sets contentType.
     * <p>
     * Field description:
     * Content type of the message segment, e.g. &#x60;text/plain&#x60;.
     *
     * @param contentType
     * @return This {@link MmsInboundTextSegment instance}.
     */
    public MmsInboundTextSegment contentType(String contentType) {
        this.contentType = contentType;
        return this;
    }

    /**
     * Returns contentType.
     * <p>
     * Field description:
     * Content type of the message segment, e.g. &#x60;text/plain&#x60;.
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
     * Content type of the message segment, e.g. &#x60;text/plain&#x60;.
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
     * @return This {@link MmsInboundTextSegment instance}.
     */
    public MmsInboundTextSegment value(String value) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MmsInboundTextSegment mmsInboundTextSegment = (MmsInboundTextSegment) o;
        return Objects.equals(this.contentType, mmsInboundTextSegment.contentType)
                && Objects.equals(this.value, mmsInboundTextSegment.value)
                && super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(contentType, value, super.hashCode());
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class MmsInboundTextSegment {")
                .append(newLine)
                .append("    ")
                .append(toIndentedString(super.toString()))
                .append(newLine)
                .append("    contentType: ")
                .append(toIndentedString(contentType))
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
