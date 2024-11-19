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
 * List of buttons of a card.
 */
@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.EXISTING_PROPERTY,
        property = "type",
        visible = true)
@JsonSubTypes({
    @JsonSubTypes.Type(value = MessagesApiCarouselTemplateOpenUrlButton.class, name = "OPEN_URL"),
    @JsonSubTypes.Type(value = MessagesApiCarouselTemplatePhoneNumberButton.class, name = "PHONE_NUMBER"),
    @JsonSubTypes.Type(value = MessagesApiCarouselTemplateQuickReplyButton.class, name = "QUICK_REPLY"),
})
public abstract class MessagesApiCarouselTemplateButton {

    protected final MessagesApiCarouselTemplateButtonType type;

    /**
     * Constructs a new {@link MessagesApiCarouselTemplateButton} instance.
     */
    public MessagesApiCarouselTemplateButton(String type) {
        this.type = MessagesApiCarouselTemplateButtonType.fromValue(type);
    }

    /**
     * Returns type.
     * <p>
     * The field is required.
     *
     * @return type
     */
    @JsonProperty("type")
    public MessagesApiCarouselTemplateButtonType getType() {
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
        MessagesApiCarouselTemplateButton messagesApiCarouselTemplateButton = (MessagesApiCarouselTemplateButton) o;
        return Objects.equals(this.type, messagesApiCarouselTemplateButton.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class MessagesApiCarouselTemplateButton {")
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
