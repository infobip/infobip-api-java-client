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
 * Body of the message.
 */
@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.EXISTING_PROPERTY,
        property = "type",
        visible = true)
@JsonSubTypes({
    @JsonSubTypes.Type(value = MessagesApiMessageAuthenticationRequestBody.class, name = "AUTHENTICATION_REQUEST"),
    @JsonSubTypes.Type(value = MessagesApiMessageCarouselBody.class, name = "CAROUSEL"),
    @JsonSubTypes.Type(value = MessagesApiMessageContactBody.class, name = "CONTACT"),
    @JsonSubTypes.Type(value = MessagesApiMessageDocumentBody.class, name = "DOCUMENT"),
    @JsonSubTypes.Type(value = MessagesApiMessageFlowBody.class, name = "FLOW"),
    @JsonSubTypes.Type(value = MessagesApiMessageImageBody.class, name = "IMAGE"),
    @JsonSubTypes.Type(value = MessagesApiMessageListBody.class, name = "LIST"),
    @JsonSubTypes.Type(value = MessagesApiMessageLocationBody.class, name = "LOCATION"),
    @JsonSubTypes.Type(value = MessagesApiMessageMixedBody.class, name = "MIXED"),
    @JsonSubTypes.Type(value = MessagesApiMessageProductBody.class, name = "PRODUCT"),
    @JsonSubTypes.Type(value = MessagesApiMessageRichLinkBody.class, name = "RICH_LINK"),
    @JsonSubTypes.Type(value = MessagesApiMessageStickerBody.class, name = "STICKER"),
    @JsonSubTypes.Type(value = MessagesApiMessageTextBody.class, name = "TEXT"),
    @JsonSubTypes.Type(value = MessagesApiMessageVideoBody.class, name = "VIDEO"),
})
public abstract class MessagesApiMessageBody {

    protected final MessagesApiMessageBodyType type;

    /**
     * Constructs a new {@link MessagesApiMessageBody} instance.
     */
    public MessagesApiMessageBody(String type) {
        this.type = MessagesApiMessageBodyType.fromValue(type);
    }

    /**
     * Returns type.
     * <p>
     * The field is required.
     *
     * @return type
     */
    @JsonProperty("type")
    public MessagesApiMessageBodyType getType() {
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
        MessagesApiMessageBody messagesApiMessageBody = (MessagesApiMessageBody) o;
        return Objects.equals(this.type, messagesApiMessageBody.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class MessagesApiMessageBody {")
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
