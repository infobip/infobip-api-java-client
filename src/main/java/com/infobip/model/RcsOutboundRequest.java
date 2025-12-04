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
 * Represents RcsOutboundRequest model.
 */
public class RcsOutboundRequest {

    private String from;

    private List<String> to = new ArrayList<>();

    private RcsContent content;

    private String notifyUrl;

    private String messageId;

    private String entityId;

    private String applicationId;

    /**
     * Sets from.
     * <p>
     * Field description:
     * Sender ID that can be alphanumeric or numeric (e.g., CompanyName).
     * <p>
     * The field is required.
     *
     * @param from
     * @return This {@link RcsOutboundRequest instance}.
     */
    public RcsOutboundRequest from(String from) {
        this.from = from;
        return this;
    }

    /**
     * Returns from.
     * <p>
     * Field description:
     * Sender ID that can be alphanumeric or numeric (e.g., CompanyName).
     * <p>
     * The field is required.
     *
     * @return from
     */
    @JsonProperty("from")
    public String getFrom() {
        return from;
    }

    /**
     * Sets from.
     * <p>
     * Field description:
     * Sender ID that can be alphanumeric or numeric (e.g., CompanyName).
     * <p>
     * The field is required.
     *
     * @param from
     */
    @JsonProperty("from")
    public void setFrom(String from) {
        this.from = from;
    }

    /**
     * Sets to.
     * <p>
     * Field description:
     * Array of recipient phone numbers in international format.
     * <p>
     * The field is required.
     *
     * @param to
     * @return This {@link RcsOutboundRequest instance}.
     */
    public RcsOutboundRequest to(List<String> to) {
        this.to = to;
        return this;
    }

    /**
     * Adds and item into to.
     * <p>
     * Field description:
     * Array of recipient phone numbers in international format.
     * <p>
     * The field is required.
     *
     * @param toItem The item to be added to the list.
     * @return This {@link RcsOutboundRequest instance}.
     */
    public RcsOutboundRequest addToItem(String toItem) {
        if (this.to == null) {
            this.to = new ArrayList<>();
        }
        this.to.add(toItem);
        return this;
    }

    /**
     * Returns to.
     * <p>
     * Field description:
     * Array of recipient phone numbers in international format.
     * <p>
     * The field is required.
     *
     * @return to
     */
    @JsonProperty("to")
    public List<String> getTo() {
        return to;
    }

    /**
     * Sets to.
     * <p>
     * Field description:
     * Array of recipient phone numbers in international format.
     * <p>
     * The field is required.
     *
     * @param to
     */
    @JsonProperty("to")
    public void setTo(List<String> to) {
        this.to = to;
    }

    /**
     * Sets content.
     * <p>
     * Field description:
     * Content of the RCS message.
     * <p>
     * The field is required.
     *
     * @param content
     * @return This {@link RcsOutboundRequest instance}.
     */
    public RcsOutboundRequest content(RcsContent content) {
        this.content = content;
        return this;
    }

    /**
     * Returns content.
     * <p>
     * Field description:
     * Content of the RCS message.
     * <p>
     * The field is required.
     *
     * @return content
     */
    @JsonProperty("content")
    public RcsContent getContent() {
        return content;
    }

    /**
     * Sets content.
     * <p>
     * Field description:
     * Content of the RCS message.
     * <p>
     * The field is required.
     *
     * @param content
     */
    @JsonProperty("content")
    public void setContent(RcsContent content) {
        this.content = content;
    }

    /**
     * Sets notifyUrl.
     * <p>
     * Field description:
     * The URL on your callback server to which delivery and seen reports will be sent.
     *
     * @param notifyUrl
     * @return This {@link RcsOutboundRequest instance}.
     */
    public RcsOutboundRequest notifyUrl(String notifyUrl) {
        this.notifyUrl = notifyUrl;
        return this;
    }

    /**
     * Returns notifyUrl.
     * <p>
     * Field description:
     * The URL on your callback server to which delivery and seen reports will be sent.
     *
     * @return notifyUrl
     */
    @JsonProperty("notifyUrl")
    public String getNotifyUrl() {
        return notifyUrl;
    }

    /**
     * Sets notifyUrl.
     * <p>
     * Field description:
     * The URL on your callback server to which delivery and seen reports will be sent.
     *
     * @param notifyUrl
     */
    @JsonProperty("notifyUrl")
    public void setNotifyUrl(String notifyUrl) {
        this.notifyUrl = notifyUrl;
    }

    /**
     * Sets messageId.
     * <p>
     * Field description:
     * The ID that uniquely identifies the message sent.
     *
     * @param messageId
     * @return This {@link RcsOutboundRequest instance}.
     */
    public RcsOutboundRequest messageId(String messageId) {
        this.messageId = messageId;
        return this;
    }

    /**
     * Returns messageId.
     * <p>
     * Field description:
     * The ID that uniquely identifies the message sent.
     *
     * @return messageId
     */
    @JsonProperty("messageId")
    public String getMessageId() {
        return messageId;
    }

    /**
     * Sets messageId.
     * <p>
     * Field description:
     * The ID that uniquely identifies the message sent.
     *
     * @param messageId
     */
    @JsonProperty("messageId")
    public void setMessageId(String messageId) {
        this.messageId = messageId;
    }

    /**
     * Sets entityId.
     * <p>
     * Field description:
     * Entity id used to send the message.
     *
     * @param entityId
     * @return This {@link RcsOutboundRequest instance}.
     */
    public RcsOutboundRequest entityId(String entityId) {
        this.entityId = entityId;
        return this;
    }

    /**
     * Returns entityId.
     * <p>
     * Field description:
     * Entity id used to send the message.
     *
     * @return entityId
     */
    @JsonProperty("entityId")
    public String getEntityId() {
        return entityId;
    }

    /**
     * Sets entityId.
     * <p>
     * Field description:
     * Entity id used to send the message.
     *
     * @param entityId
     */
    @JsonProperty("entityId")
    public void setEntityId(String entityId) {
        this.entityId = entityId;
    }

    /**
     * Sets applicationId.
     * <p>
     * Field description:
     * Application id used to send the message.
     *
     * @param applicationId
     * @return This {@link RcsOutboundRequest instance}.
     */
    public RcsOutboundRequest applicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }

    /**
     * Returns applicationId.
     * <p>
     * Field description:
     * Application id used to send the message.
     *
     * @return applicationId
     */
    @JsonProperty("applicationId")
    public String getApplicationId() {
        return applicationId;
    }

    /**
     * Sets applicationId.
     * <p>
     * Field description:
     * Application id used to send the message.
     *
     * @param applicationId
     */
    @JsonProperty("applicationId")
    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RcsOutboundRequest rcsOutboundRequest = (RcsOutboundRequest) o;
        return Objects.equals(this.from, rcsOutboundRequest.from)
                && Objects.equals(this.to, rcsOutboundRequest.to)
                && Objects.equals(this.content, rcsOutboundRequest.content)
                && Objects.equals(this.notifyUrl, rcsOutboundRequest.notifyUrl)
                && Objects.equals(this.messageId, rcsOutboundRequest.messageId)
                && Objects.equals(this.entityId, rcsOutboundRequest.entityId)
                && Objects.equals(this.applicationId, rcsOutboundRequest.applicationId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(from, to, content, notifyUrl, messageId, entityId, applicationId);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class RcsOutboundRequest {")
                .append(newLine)
                .append("    from: ")
                .append(toIndentedString(from))
                .append(newLine)
                .append("    to: ")
                .append(toIndentedString(to))
                .append(newLine)
                .append("    content: ")
                .append(toIndentedString(content))
                .append(newLine)
                .append("    notifyUrl: ")
                .append(toIndentedString(notifyUrl))
                .append(newLine)
                .append("    messageId: ")
                .append(toIndentedString(messageId))
                .append(newLine)
                .append("    entityId: ")
                .append(toIndentedString(entityId))
                .append(newLine)
                .append("    applicationId: ")
                .append(toIndentedString(applicationId))
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
