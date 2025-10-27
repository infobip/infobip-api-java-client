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
 * An array of different pages to be shown in the form. If INTRO page is included it will always appear first.
 */
@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.EXISTING_PROPERTY,
        property = "type",
        visible = true)
@JsonSubTypes({
    @JsonSubTypes.Type(value = MessagesApiMessageDatePickerFormPage.class, name = "DATE_PICKER"),
    @JsonSubTypes.Type(value = MessagesApiMessageInputFormPage.class, name = "INPUT"),
    @JsonSubTypes.Type(value = MessagesApiMessageIntroFormPage.class, name = "INTRO"),
    @JsonSubTypes.Type(value = MessagesApiMessagePickerFormPage.class, name = "PICKER"),
    @JsonSubTypes.Type(value = MessagesApiMessageSelectFormPage.class, name = "SELECT"),
})
public abstract class MessagesApiMessageFormPage {

    protected final MessagesApiMessageFormPageType type;

    /**
     * Constructs a new {@link MessagesApiMessageFormPage} instance.
     */
    public MessagesApiMessageFormPage(String type) {
        this.type = MessagesApiMessageFormPageType.fromValue(type);
    }

    /**
     * Returns type.
     * <p>
     * The field is required.
     *
     * @return type
     */
    @JsonProperty("type")
    public MessagesApiMessageFormPageType getType() {
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
        MessagesApiMessageFormPage messagesApiMessageFormPage = (MessagesApiMessageFormPage) o;
        return Objects.equals(this.type, messagesApiMessageFormPage.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class MessagesApiMessageFormPage {")
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
