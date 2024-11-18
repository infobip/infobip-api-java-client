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
 * List of buttons of a template message.
 */
@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.EXISTING_PROPERTY,
        property = "type",
        visible = true)
@JsonSubTypes({
    @JsonSubTypes.Type(value = MessagesApiTemplateCatalogButton.class, name = "CATALOG"),
    @JsonSubTypes.Type(value = MessagesApiTemplateCopyCodeButton.class, name = "COPY_CODE"),
    @JsonSubTypes.Type(value = MessagesApiTemplateFlowButton.class, name = "FLOW"),
    @JsonSubTypes.Type(value = MessagesApiTemplateMultiProductButton.class, name = "MULTI_PRODUCT"),
    @JsonSubTypes.Type(value = MessagesApiTemplateOpenUrlButton.class, name = "OPEN_URL"),
    @JsonSubTypes.Type(value = MessagesApiTemplatePhoneNumberButton.class, name = "PHONE_NUMBER"),
    @JsonSubTypes.Type(value = MessagesApiTemplateQuickReplyButton.class, name = "QUICK_REPLY"),
})
public abstract class MessagesApiTemplateButton {

    protected final MessagesApiTemplateButtonType type;

    /**
     * Constructs a new {@link MessagesApiTemplateButton} instance.
     */
    public MessagesApiTemplateButton(String type) {
        this.type = MessagesApiTemplateButtonType.fromValue(type);
    }

    /**
     * Returns type.
     * <p>
     * The field is required.
     *
     * @return type
     */
    @JsonProperty("type")
    public MessagesApiTemplateButtonType getType() {
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
        MessagesApiTemplateButton messagesApiTemplateButton = (MessagesApiTemplateButton) o;
        return Objects.equals(this.type, messagesApiTemplateButton.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class MessagesApiTemplateButton {")
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
