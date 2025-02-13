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
 * Audio content to play. It can either be previously uploaded file or a file from a URL.
 */
@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.EXISTING_PROPERTY,
        property = "type",
        visible = true)
@JsonSubTypes({
    @JsonSubTypes.Type(value = CallsFilePlayContent.class, name = "FILE"),
    @JsonSubTypes.Type(value = CallsRecordingPlayContent.class, name = "RECORDING"),
    @JsonSubTypes.Type(value = CallsTextPlayContent.class, name = "TEXT"),
    @JsonSubTypes.Type(value = CallsUrlPlayContent.class, name = "URL"),
})
public abstract class CallsPlayContent {

    protected final CallsPlayContentType type;

    /**
     * Constructs a new {@link CallsPlayContent} instance.
     */
    public CallsPlayContent(String type) {
        this.type = CallsPlayContentType.fromValue(type);
    }

    /**
     * Returns type.
     *
     * @return type
     */
    @JsonProperty("type")
    public CallsPlayContentType getType() {
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
        CallsPlayContent callsPlayContent = (CallsPlayContent) o;
        return Objects.equals(this.type, callsPlayContent.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class CallsPlayContent {")
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
