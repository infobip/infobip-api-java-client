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
 * An array of messages being sent.
 */
public class WhatsAppMessage {

    private String from;

    private String to;

    private String messageId;

    private WhatsAppTemplateContent content;

    private String callbackData;

    private String notifyUrl;

    private UrlOptions urlOptions;

    private WhatsAppFailover smsFailover;

    private String entityId;

    private String applicationId;

    /**
     * Sets from.
     * <p>
     * Field description:
     * Registered WhatsApp sender number. Must be in international format and comply with [WhatsApp&#39;s requirements](https://www.infobip.com/docs/whatsapp/get-started#phone-number-what-you-need-to-know).
     * <p>
     * The field is required.
     *
     * @param from
     * @return This {@link WhatsAppMessage instance}.
     */
    public WhatsAppMessage from(String from) {
        this.from = from;
        return this;
    }

    /**
     * Returns from.
     * <p>
     * Field description:
     * Registered WhatsApp sender number. Must be in international format and comply with [WhatsApp&#39;s requirements](https://www.infobip.com/docs/whatsapp/get-started#phone-number-what-you-need-to-know).
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
     * Registered WhatsApp sender number. Must be in international format and comply with [WhatsApp&#39;s requirements](https://www.infobip.com/docs/whatsapp/get-started#phone-number-what-you-need-to-know).
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
     * Message recipient number. Must be in international format.
     * <p>
     * The field is required.
     *
     * @param to
     * @return This {@link WhatsAppMessage instance}.
     */
    public WhatsAppMessage to(String to) {
        this.to = to;
        return this;
    }

    /**
     * Returns to.
     * <p>
     * Field description:
     * Message recipient number. Must be in international format.
     * <p>
     * The field is required.
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
     * Message recipient number. Must be in international format.
     * <p>
     * The field is required.
     *
     * @param to
     */
    @JsonProperty("to")
    public void setTo(String to) {
        this.to = to;
    }

    /**
     * Sets messageId.
     * <p>
     * Field description:
     * The ID that uniquely identifies the message sent.
     *
     * @param messageId
     * @return This {@link WhatsAppMessage instance}.
     */
    public WhatsAppMessage messageId(String messageId) {
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
     * Sets content.
     * <p>
     * The field is required.
     *
     * @param content
     * @return This {@link WhatsAppMessage instance}.
     */
    public WhatsAppMessage content(WhatsAppTemplateContent content) {
        this.content = content;
        return this;
    }

    /**
     * Returns content.
     * <p>
     * The field is required.
     *
     * @return content
     */
    @JsonProperty("content")
    public WhatsAppTemplateContent getContent() {
        return content;
    }

    /**
     * Sets content.
     * <p>
     * The field is required.
     *
     * @param content
     */
    @JsonProperty("content")
    public void setContent(WhatsAppTemplateContent content) {
        this.content = content;
    }

    /**
     * Sets callbackData.
     * <p>
     * Field description:
     * Custom client data that will be included in a [Delivery Report](#channels/whatsapp/receive-whatsapp-delivery-reports).
     *
     * @param callbackData
     * @return This {@link WhatsAppMessage instance}.
     */
    public WhatsAppMessage callbackData(String callbackData) {
        this.callbackData = callbackData;
        return this;
    }

    /**
     * Returns callbackData.
     * <p>
     * Field description:
     * Custom client data that will be included in a [Delivery Report](#channels/whatsapp/receive-whatsapp-delivery-reports).
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
     * Custom client data that will be included in a [Delivery Report](#channels/whatsapp/receive-whatsapp-delivery-reports).
     *
     * @param callbackData
     */
    @JsonProperty("callbackData")
    public void setCallbackData(String callbackData) {
        this.callbackData = callbackData;
    }

    /**
     * Sets notifyUrl.
     * <p>
     * Field description:
     * The URL on your callback server to which delivery and seen reports will be sent. [Delivery report format](#channels/whatsapp/receive-whatsapp-delivery-reports), [Seen report format](#channels/whatsapp/receive-whatsapp-seen-reports).
     *
     * @param notifyUrl
     * @return This {@link WhatsAppMessage instance}.
     */
    public WhatsAppMessage notifyUrl(String notifyUrl) {
        this.notifyUrl = notifyUrl;
        return this;
    }

    /**
     * Returns notifyUrl.
     * <p>
     * Field description:
     * The URL on your callback server to which delivery and seen reports will be sent. [Delivery report format](#channels/whatsapp/receive-whatsapp-delivery-reports), [Seen report format](#channels/whatsapp/receive-whatsapp-seen-reports).
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
     * The URL on your callback server to which delivery and seen reports will be sent. [Delivery report format](#channels/whatsapp/receive-whatsapp-delivery-reports), [Seen report format](#channels/whatsapp/receive-whatsapp-seen-reports).
     *
     * @param notifyUrl
     */
    @JsonProperty("notifyUrl")
    public void setNotifyUrl(String notifyUrl) {
        this.notifyUrl = notifyUrl;
    }

    /**
     * Sets urlOptions.
     *
     * @param urlOptions
     * @return This {@link WhatsAppMessage instance}.
     */
    public WhatsAppMessage urlOptions(UrlOptions urlOptions) {
        this.urlOptions = urlOptions;
        return this;
    }

    /**
     * Returns urlOptions.
     *
     * @return urlOptions
     */
    @JsonProperty("urlOptions")
    public UrlOptions getUrlOptions() {
        return urlOptions;
    }

    /**
     * Sets urlOptions.
     *
     * @param urlOptions
     */
    @JsonProperty("urlOptions")
    public void setUrlOptions(UrlOptions urlOptions) {
        this.urlOptions = urlOptions;
    }

    /**
     * Sets smsFailover.
     *
     * @param smsFailover
     * @return This {@link WhatsAppMessage instance}.
     */
    public WhatsAppMessage smsFailover(WhatsAppFailover smsFailover) {
        this.smsFailover = smsFailover;
        return this;
    }

    /**
     * Returns smsFailover.
     *
     * @return smsFailover
     */
    @JsonProperty("smsFailover")
    public WhatsAppFailover getSmsFailover() {
        return smsFailover;
    }

    /**
     * Sets smsFailover.
     *
     * @param smsFailover
     */
    @JsonProperty("smsFailover")
    public void setSmsFailover(WhatsAppFailover smsFailover) {
        this.smsFailover = smsFailover;
    }

    /**
     * Sets entityId.
     * <p>
     * Field description:
     * Required for entity use in a send request for outbound traffic. Returned in notification events. For more details, see our [documentation](https://www.infobip.com/docs/cpaas-x/application-and-entity-management).
     *
     * @param entityId
     * @return This {@link WhatsAppMessage instance}.
     */
    public WhatsAppMessage entityId(String entityId) {
        this.entityId = entityId;
        return this;
    }

    /**
     * Returns entityId.
     * <p>
     * Field description:
     * Required for entity use in a send request for outbound traffic. Returned in notification events. For more details, see our [documentation](https://www.infobip.com/docs/cpaas-x/application-and-entity-management).
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
     * Required for entity use in a send request for outbound traffic. Returned in notification events. For more details, see our [documentation](https://www.infobip.com/docs/cpaas-x/application-and-entity-management).
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
     * Required for application use in a send request for outbound traffic. Returned in notification events. For more details, see our [documentation](https://www.infobip.com/docs/cpaas-x/application-and-entity-management).
     *
     * @param applicationId
     * @return This {@link WhatsAppMessage instance}.
     */
    public WhatsAppMessage applicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }

    /**
     * Returns applicationId.
     * <p>
     * Field description:
     * Required for application use in a send request for outbound traffic. Returned in notification events. For more details, see our [documentation](https://www.infobip.com/docs/cpaas-x/application-and-entity-management).
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
     * Required for application use in a send request for outbound traffic. Returned in notification events. For more details, see our [documentation](https://www.infobip.com/docs/cpaas-x/application-and-entity-management).
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
        WhatsAppMessage whatsAppMessage = (WhatsAppMessage) o;
        return Objects.equals(this.from, whatsAppMessage.from)
                && Objects.equals(this.to, whatsAppMessage.to)
                && Objects.equals(this.messageId, whatsAppMessage.messageId)
                && Objects.equals(this.content, whatsAppMessage.content)
                && Objects.equals(this.callbackData, whatsAppMessage.callbackData)
                && Objects.equals(this.notifyUrl, whatsAppMessage.notifyUrl)
                && Objects.equals(this.urlOptions, whatsAppMessage.urlOptions)
                && Objects.equals(this.smsFailover, whatsAppMessage.smsFailover)
                && Objects.equals(this.entityId, whatsAppMessage.entityId)
                && Objects.equals(this.applicationId, whatsAppMessage.applicationId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                from,
                to,
                messageId,
                content,
                callbackData,
                notifyUrl,
                urlOptions,
                smsFailover,
                entityId,
                applicationId);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class WhatsAppMessage {")
                .append(newLine)
                .append("    from: ")
                .append(toIndentedString(from))
                .append(newLine)
                .append("    to: ")
                .append(toIndentedString(to))
                .append(newLine)
                .append("    messageId: ")
                .append(toIndentedString(messageId))
                .append(newLine)
                .append("    content: ")
                .append(toIndentedString(content))
                .append(newLine)
                .append("    callbackData: ")
                .append(toIndentedString(callbackData))
                .append(newLine)
                .append("    notifyUrl: ")
                .append(toIndentedString(notifyUrl))
                .append(newLine)
                .append("    urlOptions: ")
                .append(toIndentedString(urlOptions))
                .append(newLine)
                .append("    smsFailover: ")
                .append(toIndentedString(smsFailover))
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
