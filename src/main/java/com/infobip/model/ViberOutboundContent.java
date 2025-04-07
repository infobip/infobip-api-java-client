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
 * Message content.&lt;br/&gt;The &#x60;LIST&#x60; content type is in early access phase. Please contact Infobip Support to enable it for your sender.
 */
@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.EXISTING_PROPERTY,
        property = "type",
        visible = true)
@JsonSubTypes({
    @JsonSubTypes.Type(value = ViberOutboundFileContent.class, name = "FILE"),
    @JsonSubTypes.Type(value = ViberOutboundImageContent.class, name = "IMAGE"),
    @JsonSubTypes.Type(value = ViberOutboundListContent.class, name = "LIST"),
    @JsonSubTypes.Type(value = ViberOutboundOtpTemplateContent.class, name = "OTP_TEMPLATE"),
    @JsonSubTypes.Type(value = ViberOutboundTextContent.class, name = "TEXT"),
    @JsonSubTypes.Type(value = ViberOutboundVideoContent.class, name = "VIDEO"),
})
public abstract class ViberOutboundContent {

    protected final ViberOutboundContentType type;

    /**
     * Constructs a new {@link ViberOutboundContent} instance.
     */
    public ViberOutboundContent(String type) {
        this.type = ViberOutboundContentType.fromValue(type);
    }

    /**
     * Returns type.
     * <p>
     * The field is required.
     *
     * @return type
     */
    @JsonProperty("type")
    public ViberOutboundContentType getType() {
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
        ViberOutboundContent viberOutboundContent = (ViberOutboundContent) o;
        return Objects.equals(this.type, viberOutboundContent.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class ViberOutboundContent {")
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
