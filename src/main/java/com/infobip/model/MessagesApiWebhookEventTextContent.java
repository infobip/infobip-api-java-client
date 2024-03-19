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
 * Represents MessagesApiWebhookEventTextContent model.
 */
public class MessagesApiWebhookEventTextContent extends MessagesApiWebhookEventContent {

    private String text;

    private String cleanText;

    private String keyword;

    private Integer messageCount;

    /**
     * Constructs a new {@link MessagesApiWebhookEventTextContent} instance.
     */
    public MessagesApiWebhookEventTextContent() {
        super("TEXT");
    }

    /**
     * Sets text.
     * <p>
     * Field description:
     * Text of the message.
     * <p>
     * The field is required.
     *
     * @param text
     * @return This {@link MessagesApiWebhookEventTextContent instance}.
     */
    public MessagesApiWebhookEventTextContent text(String text) {
        this.text = text;
        return this;
    }

    /**
     * Returns text.
     * <p>
     * Field description:
     * Text of the message.
     * <p>
     * The field is required.
     *
     * @return text
     */
    @JsonProperty("text")
    public String getText() {
        return text;
    }

    /**
     * Sets text.
     * <p>
     * Field description:
     * Text of the message.
     * <p>
     * The field is required.
     *
     * @param text
     */
    @JsonProperty("text")
    public void setText(String text) {
        this.text = text;
    }

    /**
     * Sets cleanText.
     * <p>
     * Field description:
     * Text of the message without the keyword (if a keyword was sent).
     * <p>
     * The field is required.
     *
     * @param cleanText
     * @return This {@link MessagesApiWebhookEventTextContent instance}.
     */
    public MessagesApiWebhookEventTextContent cleanText(String cleanText) {
        this.cleanText = cleanText;
        return this;
    }

    /**
     * Returns cleanText.
     * <p>
     * Field description:
     * Text of the message without the keyword (if a keyword was sent).
     * <p>
     * The field is required.
     *
     * @return cleanText
     */
    @JsonProperty("cleanText")
    public String getCleanText() {
        return cleanText;
    }

    /**
     * Sets cleanText.
     * <p>
     * Field description:
     * Text of the message without the keyword (if a keyword was sent).
     * <p>
     * The field is required.
     *
     * @param cleanText
     */
    @JsonProperty("cleanText")
    public void setCleanText(String cleanText) {
        this.cleanText = cleanText;
    }

    /**
     * Sets keyword.
     * <p>
     * Field description:
     * Keyword extracted from the message text.
     *
     * @param keyword
     * @return This {@link MessagesApiWebhookEventTextContent instance}.
     */
    public MessagesApiWebhookEventTextContent keyword(String keyword) {
        this.keyword = keyword;
        return this;
    }

    /**
     * Returns keyword.
     * <p>
     * Field description:
     * Keyword extracted from the message text.
     *
     * @return keyword
     */
    @JsonProperty("keyword")
    public String getKeyword() {
        return keyword;
    }

    /**
     * Sets keyword.
     * <p>
     * Field description:
     * Keyword extracted from the message text.
     *
     * @param keyword
     */
    @JsonProperty("keyword")
    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    /**
     * Sets messageCount.
     * <p>
     * Field description:
     * (Only for SMS) Number of smaller messages the actual SMS got split into due to the SMS character limit.
     *
     * @param messageCount
     * @return This {@link MessagesApiWebhookEventTextContent instance}.
     */
    public MessagesApiWebhookEventTextContent messageCount(Integer messageCount) {
        this.messageCount = messageCount;
        return this;
    }

    /**
     * Returns messageCount.
     * <p>
     * Field description:
     * (Only for SMS) Number of smaller messages the actual SMS got split into due to the SMS character limit.
     *
     * @return messageCount
     */
    @JsonProperty("messageCount")
    public Integer getMessageCount() {
        return messageCount;
    }

    /**
     * Sets messageCount.
     * <p>
     * Field description:
     * (Only for SMS) Number of smaller messages the actual SMS got split into due to the SMS character limit.
     *
     * @param messageCount
     */
    @JsonProperty("messageCount")
    public void setMessageCount(Integer messageCount) {
        this.messageCount = messageCount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MessagesApiWebhookEventTextContent messagesApiWebhookEventTextContent = (MessagesApiWebhookEventTextContent) o;
        return Objects.equals(this.text, messagesApiWebhookEventTextContent.text)
                && Objects.equals(this.cleanText, messagesApiWebhookEventTextContent.cleanText)
                && Objects.equals(this.keyword, messagesApiWebhookEventTextContent.keyword)
                && Objects.equals(this.messageCount, messagesApiWebhookEventTextContent.messageCount)
                && super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(text, cleanText, keyword, messageCount, super.hashCode());
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class MessagesApiWebhookEventTextContent {")
                .append(newLine)
                .append("    ")
                .append(toIndentedString(super.toString()))
                .append(newLine)
                .append("    text: ")
                .append(toIndentedString(text))
                .append(newLine)
                .append("    cleanText: ")
                .append(toIndentedString(cleanText))
                .append(newLine)
                .append("    keyword: ")
                .append(toIndentedString(keyword))
                .append(newLine)
                .append("    messageCount: ")
                .append(toIndentedString(messageCount))
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
