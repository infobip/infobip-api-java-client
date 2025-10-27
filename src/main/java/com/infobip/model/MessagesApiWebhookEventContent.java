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
 * Content of the message.
 */
@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.EXISTING_PROPERTY,
        property = "type",
        visible = true)
@JsonSubTypes({
    @JsonSubTypes.Type(value = MessagesApiWebhookEventAudioContent.class, name = "AUDIO"),
    @JsonSubTypes.Type(
            value = MessagesApiWebhookEventAuthenticationResponseContent.class,
            name = "AUTHENTICATION_RESPONSE"),
    @JsonSubTypes.Type(value = MessagesApiWebhookEventButtonReplyContent.class, name = "BUTTON_REPLY"),
    @JsonSubTypes.Type(value = MessagesApiWebhookEventDocumentContent.class, name = "DOCUMENT"),
    @JsonSubTypes.Type(value = MessagesApiWebhookEventFileContent.class, name = "FILE"),
    @JsonSubTypes.Type(value = MessagesApiWebhookEventFlowResponseContent.class, name = "FLOW_RESPONSE"),
    @JsonSubTypes.Type(value = MessagesApiWebhookEventFormContent.class, name = "FORM_RESPONSE"),
    @JsonSubTypes.Type(value = MessagesApiWebhookEventImageContent.class, name = "IMAGE"),
    @JsonSubTypes.Type(value = MessagesApiWebhookEventListReplyContent.class, name = "LIST_REPLY"),
    @JsonSubTypes.Type(value = MessagesApiWebhookEventLocationContent.class, name = "LOCATION"),
    @JsonSubTypes.Type(value = MessagesApiWebhookEventPaymentResponseContent.class, name = "PAYMENT_RESPONSE"),
    @JsonSubTypes.Type(value = MessagesApiWebhookEventSubjectContent.class, name = "SUBJECT"),
    @JsonSubTypes.Type(value = MessagesApiWebhookEventTextContent.class, name = "TEXT"),
    @JsonSubTypes.Type(value = MessagesApiWebhookEventVideoContent.class, name = "VIDEO"),
})
public abstract class MessagesApiWebhookEventContent {

    protected final MessagesApiWebhookEventContentType type;

    /**
     * Constructs a new {@link MessagesApiWebhookEventContent} instance.
     */
    public MessagesApiWebhookEventContent(String type) {
        this.type = MessagesApiWebhookEventContentType.fromValue(type);
    }

    /**
     * Returns type.
     * <p>
     * The field is required.
     *
     * @return type
     */
    @JsonProperty("type")
    public MessagesApiWebhookEventContentType getType() {
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
        MessagesApiWebhookEventContent messagesApiWebhookEventContent = (MessagesApiWebhookEventContent) o;
        return Objects.equals(this.type, messagesApiWebhookEventContent.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class MessagesApiWebhookEventContent {")
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
