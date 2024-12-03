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
import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * Represents SmsInboundMessage model.
 */
public class SmsInboundMessage {

    private String applicationId;

    private String callbackData;

    private String campaignReferenceId;

    private String cleanText;

    private String entityId;

    private String from;

    private String keyword;

    private String messageId;

    private MessagePrice price;

    private OffsetDateTime receivedAt;

    private Integer smsCount;

    private String text;

    private String to;

    /**
     * Sets applicationId.
     * <p>
     * Field description:
     * Application id linked to the message. For more details, see our [documentation](https://www.infobip.com/docs/cpaas-x/application-and-entity-management).
     *
     * @param applicationId
     * @return This {@link SmsInboundMessage instance}.
     */
    public SmsInboundMessage applicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }

    /**
     * Returns applicationId.
     * <p>
     * Field description:
     * Application id linked to the message. For more details, see our [documentation](https://www.infobip.com/docs/cpaas-x/application-and-entity-management).
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
     * Application id linked to the message. For more details, see our [documentation](https://www.infobip.com/docs/cpaas-x/application-and-entity-management).
     *
     * @param applicationId
     */
    @JsonProperty("applicationId")
    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    /**
     * Sets callbackData.
     * <p>
     * Field description:
     * Custom callback data sent over the notifyUrl.
     *
     * @param callbackData
     * @return This {@link SmsInboundMessage instance}.
     */
    public SmsInboundMessage callbackData(String callbackData) {
        this.callbackData = callbackData;
        return this;
    }

    /**
     * Returns callbackData.
     * <p>
     * Field description:
     * Custom callback data sent over the notifyUrl.
     *
     * @return callbackData
     */
    @JsonProperty("callbackData")
    public String getCallbackData() {
        return callbackData;
    }

    /**
     * Sets callbackData.
     * <p>
     * Field description:
     * Custom callback data sent over the notifyUrl.
     *
     * @param callbackData
     */
    @JsonProperty("callbackData")
    public void setCallbackData(String callbackData) {
        this.callbackData = callbackData;
    }

    /**
     * Sets campaignReferenceId.
     * <p>
     * Field description:
     * ID that allows you to track, analyze, and show an aggregated overview and the performance of individual campaigns per sending channel.
     *
     * @param campaignReferenceId
     * @return This {@link SmsInboundMessage instance}.
     */
    public SmsInboundMessage campaignReferenceId(String campaignReferenceId) {
        this.campaignReferenceId = campaignReferenceId;
        return this;
    }

    /**
     * Returns campaignReferenceId.
     * <p>
     * Field description:
     * ID that allows you to track, analyze, and show an aggregated overview and the performance of individual campaigns per sending channel.
     *
     * @return campaignReferenceId
     */
    @JsonProperty("campaignReferenceId")
    public String getCampaignReferenceId() {
        return campaignReferenceId;
    }

    /**
     * Sets campaignReferenceId.
     * <p>
     * Field description:
     * ID that allows you to track, analyze, and show an aggregated overview and the performance of individual campaigns per sending channel.
     *
     * @param campaignReferenceId
     */
    @JsonProperty("campaignReferenceId")
    public void setCampaignReferenceId(String campaignReferenceId) {
        this.campaignReferenceId = campaignReferenceId;
    }

    /**
     * Sets cleanText.
     * <p>
     * Field description:
     * Content of the message without a keyword (if a keyword was sent).
     *
     * @param cleanText
     * @return This {@link SmsInboundMessage instance}.
     */
    public SmsInboundMessage cleanText(String cleanText) {
        this.cleanText = cleanText;
        return this;
    }

    /**
     * Returns cleanText.
     * <p>
     * Field description:
     * Content of the message without a keyword (if a keyword was sent).
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
     * Content of the message without a keyword (if a keyword was sent).
     *
     * @param cleanText
     */
    @JsonProperty("cleanText")
    public void setCleanText(String cleanText) {
        this.cleanText = cleanText;
    }

    /**
     * Sets entityId.
     * <p>
     * Field description:
     * Entity id linked to the message. For more details, see our [documentation](https://www.infobip.com/docs/cpaas-x/application-and-entity-management).
     *
     * @param entityId
     * @return This {@link SmsInboundMessage instance}.
     */
    public SmsInboundMessage entityId(String entityId) {
        this.entityId = entityId;
        return this;
    }

    /**
     * Returns entityId.
     * <p>
     * Field description:
     * Entity id linked to the message. For more details, see our [documentation](https://www.infobip.com/docs/cpaas-x/application-and-entity-management).
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
     * Entity id linked to the message. For more details, see our [documentation](https://www.infobip.com/docs/cpaas-x/application-and-entity-management).
     *
     * @param entityId
     */
    @JsonProperty("entityId")
    public void setEntityId(String entityId) {
        this.entityId = entityId;
    }

    /**
     * Sets from.
     * <p>
     * Field description:
     * Sender ID that can be alphanumeric or numeric.
     *
     * @param from
     * @return This {@link SmsInboundMessage instance}.
     */
    public SmsInboundMessage from(String from) {
        this.from = from;
        return this;
    }

    /**
     * Returns from.
     * <p>
     * Field description:
     * Sender ID that can be alphanumeric or numeric.
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
     * Sender ID that can be alphanumeric or numeric.
     *
     * @param from
     */
    @JsonProperty("from")
    public void setFrom(String from) {
        this.from = from;
    }

    /**
     * Sets keyword.
     * <p>
     * Field description:
     * Keyword extracted from the message content.
     *
     * @param keyword
     * @return This {@link SmsInboundMessage instance}.
     */
    public SmsInboundMessage keyword(String keyword) {
        this.keyword = keyword;
        return this;
    }

    /**
     * Returns keyword.
     * <p>
     * Field description:
     * Keyword extracted from the message content.
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
     * Keyword extracted from the message content.
     *
     * @param keyword
     */
    @JsonProperty("keyword")
    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    /**
     * Sets messageId.
     * <p>
     * Field description:
     * Unique message ID.
     *
     * @param messageId
     * @return This {@link SmsInboundMessage instance}.
     */
    public SmsInboundMessage messageId(String messageId) {
        this.messageId = messageId;
        return this;
    }

    /**
     * Returns messageId.
     * <p>
     * Field description:
     * Unique message ID.
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
     * Unique message ID.
     *
     * @param messageId
     */
    @JsonProperty("messageId")
    public void setMessageId(String messageId) {
        this.messageId = messageId;
    }

    /**
     * Sets price.
     *
     * @param price
     * @return This {@link SmsInboundMessage instance}.
     */
    public SmsInboundMessage price(MessagePrice price) {
        this.price = price;
        return this;
    }

    /**
     * Returns price.
     *
     * @return price
     */
    @JsonProperty("price")
    public MessagePrice getPrice() {
        return price;
    }

    /**
     * Sets price.
     *
     * @param price
     */
    @JsonProperty("price")
    public void setPrice(MessagePrice price) {
        this.price = price;
    }

    /**
     * Sets receivedAt.
     * <p>
     * Field description:
     * Indicates when the Infobip platform received the message. Has the following format: &#x60;yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZ&#x60;.
     *
     * @param receivedAt
     * @return This {@link SmsInboundMessage instance}.
     */
    public SmsInboundMessage receivedAt(OffsetDateTime receivedAt) {
        this.receivedAt = receivedAt;
        return this;
    }

    /**
     * Returns receivedAt.
     * <p>
     * Field description:
     * Indicates when the Infobip platform received the message. Has the following format: &#x60;yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZ&#x60;.
     *
     * @return receivedAt
     */
    @JsonProperty("receivedAt")
    public OffsetDateTime getReceivedAt() {
        return receivedAt;
    }

    /**
     * Sets receivedAt.
     * <p>
     * Field description:
     * Indicates when the Infobip platform received the message. Has the following format: &#x60;yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZ&#x60;.
     *
     * @param receivedAt
     */
    @JsonProperty("receivedAt")
    public void setReceivedAt(OffsetDateTime receivedAt) {
        this.receivedAt = receivedAt;
    }

    /**
     * Sets smsCount.
     * <p>
     * Field description:
     * The number of characters within a message
     *
     * @param smsCount
     * @return This {@link SmsInboundMessage instance}.
     */
    public SmsInboundMessage smsCount(Integer smsCount) {
        this.smsCount = smsCount;
        return this;
    }

    /**
     * Returns smsCount.
     * <p>
     * Field description:
     * The number of characters within a message
     *
     * @return smsCount
     */
    @JsonProperty("smsCount")
    public Integer getSmsCount() {
        return smsCount;
    }

    /**
     * Sets smsCount.
     * <p>
     * Field description:
     * The number of characters within a message
     *
     * @param smsCount
     */
    @JsonProperty("smsCount")
    public void setSmsCount(Integer smsCount) {
        this.smsCount = smsCount;
    }

    /**
     * Sets text.
     * <p>
     * Field description:
     * Full content of the message.
     *
     * @param text
     * @return This {@link SmsInboundMessage instance}.
     */
    public SmsInboundMessage text(String text) {
        this.text = text;
        return this;
    }

    /**
     * Returns text.
     * <p>
     * Field description:
     * Full content of the message.
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
     * Full content of the message.
     *
     * @param text
     */
    @JsonProperty("text")
    public void setText(String text) {
        this.text = text;
    }

    /**
     * Sets to.
     * <p>
     * Field description:
     * The destination address of the message.
     *
     * @param to
     * @return This {@link SmsInboundMessage instance}.
     */
    public SmsInboundMessage to(String to) {
        this.to = to;
        return this;
    }

    /**
     * Returns to.
     * <p>
     * Field description:
     * The destination address of the message.
     *
     * @return to
     */
    @JsonProperty("to")
    public String getTo() {
        return to;
    }

    /**
     * Sets to.
     * <p>
     * Field description:
     * The destination address of the message.
     *
     * @param to
     */
    @JsonProperty("to")
    public void setTo(String to) {
        this.to = to;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SmsInboundMessage smsInboundMessage = (SmsInboundMessage) o;
        return Objects.equals(this.applicationId, smsInboundMessage.applicationId)
                && Objects.equals(this.callbackData, smsInboundMessage.callbackData)
                && Objects.equals(this.campaignReferenceId, smsInboundMessage.campaignReferenceId)
                && Objects.equals(this.cleanText, smsInboundMessage.cleanText)
                && Objects.equals(this.entityId, smsInboundMessage.entityId)
                && Objects.equals(this.from, smsInboundMessage.from)
                && Objects.equals(this.keyword, smsInboundMessage.keyword)
                && Objects.equals(this.messageId, smsInboundMessage.messageId)
                && Objects.equals(this.price, smsInboundMessage.price)
                && Objects.equals(this.receivedAt, smsInboundMessage.receivedAt)
                && Objects.equals(this.smsCount, smsInboundMessage.smsCount)
                && Objects.equals(this.text, smsInboundMessage.text)
                && Objects.equals(this.to, smsInboundMessage.to);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                applicationId,
                callbackData,
                campaignReferenceId,
                cleanText,
                entityId,
                from,
                keyword,
                messageId,
                price,
                receivedAt,
                smsCount,
                text,
                to);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class SmsInboundMessage {")
                .append(newLine)
                .append("    applicationId: ")
                .append(toIndentedString(applicationId))
                .append(newLine)
                .append("    callbackData: ")
                .append(toIndentedString(callbackData))
                .append(newLine)
                .append("    campaignReferenceId: ")
                .append(toIndentedString(campaignReferenceId))
                .append(newLine)
                .append("    cleanText: ")
                .append(toIndentedString(cleanText))
                .append(newLine)
                .append("    entityId: ")
                .append(toIndentedString(entityId))
                .append(newLine)
                .append("    from: ")
                .append(toIndentedString(from))
                .append(newLine)
                .append("    keyword: ")
                .append(toIndentedString(keyword))
                .append(newLine)
                .append("    messageId: ")
                .append(toIndentedString(messageId))
                .append(newLine)
                .append("    price: ")
                .append(toIndentedString(price))
                .append(newLine)
                .append("    receivedAt: ")
                .append(toIndentedString(receivedAt))
                .append(newLine)
                .append("    smsCount: ")
                .append(toIndentedString(smsCount))
                .append(newLine)
                .append("    text: ")
                .append(toIndentedString(text))
                .append(newLine)
                .append("    to: ")
                .append(toIndentedString(to))
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
