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
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * An array of message objects of a single message or multiple messages sent under one bulk ID.
 */
public class SmsTextualMessage {

    private String callbackData;

    private SmsDeliveryTimeWindow deliveryTimeWindow;

    private List<SmsDestination> destinations = new ArrayList<>();

    private Boolean flash;

    private String from;

    private Boolean intermediateReport;

    private SmsLanguage language;

    private String notifyContentType;

    private String notifyUrl;

    private SmsRegionalOptions regional;

    private OffsetDateTime sendAt;

    private String text;

    private String transliteration;

    private Long validityPeriod;

    private String entityId;

    private String applicationId;

    /**
     * Sets callbackData.
     * <p>
     * Field description:
     * Additional data that can be used for identifying, managing, or monitoring a message. Data included here will also be automatically included in the message [Delivery Report](#channels/sms/get-outbound-sms-message-delivery-reports). The maximum value is 4000 characters.
     *
     * @param callbackData
     * @return This {@link SmsTextualMessage instance}.
     */
    public SmsTextualMessage callbackData(String callbackData) {
        this.callbackData = callbackData;
        return this;
    }

    /**
     * Returns callbackData.
     * <p>
     * Field description:
     * Additional data that can be used for identifying, managing, or monitoring a message. Data included here will also be automatically included in the message [Delivery Report](#channels/sms/get-outbound-sms-message-delivery-reports). The maximum value is 4000 characters.
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
     * Additional data that can be used for identifying, managing, or monitoring a message. Data included here will also be automatically included in the message [Delivery Report](#channels/sms/get-outbound-sms-message-delivery-reports). The maximum value is 4000 characters.
     *
     * @param callbackData
     */
    @JsonProperty("callbackData")
    public void setCallbackData(String callbackData) {
        this.callbackData = callbackData;
    }

    /**
     * Sets deliveryTimeWindow.
     *
     * @param deliveryTimeWindow
     * @return This {@link SmsTextualMessage instance}.
     */
    public SmsTextualMessage deliveryTimeWindow(SmsDeliveryTimeWindow deliveryTimeWindow) {
        this.deliveryTimeWindow = deliveryTimeWindow;
        return this;
    }

    /**
     * Returns deliveryTimeWindow.
     *
     * @return deliveryTimeWindow
     */
    @JsonProperty("deliveryTimeWindow")
    public SmsDeliveryTimeWindow getDeliveryTimeWindow() {
        return deliveryTimeWindow;
    }

    /**
     * Sets deliveryTimeWindow.
     *
     * @param deliveryTimeWindow
     */
    @JsonProperty("deliveryTimeWindow")
    public void setDeliveryTimeWindow(SmsDeliveryTimeWindow deliveryTimeWindow) {
        this.deliveryTimeWindow = deliveryTimeWindow;
    }

    /**
     * Sets destinations.
     * <p>
     * Field description:
     * An array of destination objects for where messages are being sent. A valid destination is required.
     * <p>
     * The field is required.
     *
     * @param destinations
     * @return This {@link SmsTextualMessage instance}.
     */
    public SmsTextualMessage destinations(List<SmsDestination> destinations) {
        this.destinations = destinations;
        return this;
    }

    /**
     * Adds and item into destinations.
     * <p>
     * Field description:
     * An array of destination objects for where messages are being sent. A valid destination is required.
     * <p>
     * The field is required.
     *
     * @param destinationsItem The item to be added to the list.
     * @return This {@link SmsTextualMessage instance}.
     */
    public SmsTextualMessage addDestinationsItem(SmsDestination destinationsItem) {
        if (this.destinations == null) {
            this.destinations = new ArrayList<>();
        }
        this.destinations.add(destinationsItem);
        return this;
    }

    /**
     * Returns destinations.
     * <p>
     * Field description:
     * An array of destination objects for where messages are being sent. A valid destination is required.
     * <p>
     * The field is required.
     *
     * @return destinations
     */
    @JsonProperty("destinations")
    public List<SmsDestination> getDestinations() {
        return destinations;
    }

    /**
     * Sets destinations.
     * <p>
     * Field description:
     * An array of destination objects for where messages are being sent. A valid destination is required.
     * <p>
     * The field is required.
     *
     * @param destinations
     */
    @JsonProperty("destinations")
    public void setDestinations(List<SmsDestination> destinations) {
        this.destinations = destinations;
    }

    /**
     * Sets flash.
     * <p>
     * Field description:
     * Allows for sending a [flash SMS](https://www.infobip.com/docs/sms/message-types#flash-sms) to automatically appear on recipient devices without interaction. Set to &#x60;true&#x60; to enable flash SMS, or leave the default value, &#x60;false&#x60; to send a standard SMS.
     *
     * @param flash
     * @return This {@link SmsTextualMessage instance}.
     */
    public SmsTextualMessage flash(Boolean flash) {
        this.flash = flash;
        return this;
    }

    /**
     * Returns flash.
     * <p>
     * Field description:
     * Allows for sending a [flash SMS](https://www.infobip.com/docs/sms/message-types#flash-sms) to automatically appear on recipient devices without interaction. Set to &#x60;true&#x60; to enable flash SMS, or leave the default value, &#x60;false&#x60; to send a standard SMS.
     *
     * @return flash
     */
    @JsonProperty("flash")
    public Boolean getFlash() {
        return flash;
    }

    /**
     * Sets flash.
     * <p>
     * Field description:
     * Allows for sending a [flash SMS](https://www.infobip.com/docs/sms/message-types#flash-sms) to automatically appear on recipient devices without interaction. Set to &#x60;true&#x60; to enable flash SMS, or leave the default value, &#x60;false&#x60; to send a standard SMS.
     *
     * @param flash
     */
    @JsonProperty("flash")
    public void setFlash(Boolean flash) {
        this.flash = flash;
    }

    /**
     * Sets from.
     * <p>
     * Field description:
     * The sender ID which can be alphanumeric or numeric (e.g., &#x60;CompanyName&#x60;). Make sure you don&#39;t exceed [character limit](https://www.infobip.com/docs/sms/get-started#sender-names).
     *
     * @param from
     * @return This {@link SmsTextualMessage instance}.
     */
    public SmsTextualMessage from(String from) {
        this.from = from;
        return this;
    }

    /**
     * Returns from.
     * <p>
     * Field description:
     * The sender ID which can be alphanumeric or numeric (e.g., &#x60;CompanyName&#x60;). Make sure you don&#39;t exceed [character limit](https://www.infobip.com/docs/sms/get-started#sender-names).
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
     * The sender ID which can be alphanumeric or numeric (e.g., &#x60;CompanyName&#x60;). Make sure you don&#39;t exceed [character limit](https://www.infobip.com/docs/sms/get-started#sender-names).
     *
     * @param from
     */
    @JsonProperty("from")
    public void setFrom(String from) {
        this.from = from;
    }

    /**
     * Sets intermediateReport.
     * <p>
     * Field description:
     * The [real-time intermediate delivery report](#channels/sms/receive-outbound-sms-message-report) containing GSM error codes, messages status, pricing, network and country codes, etc., which will be sent on your callback server. Defaults to &#x60;false&#x60;.
     *
     * @param intermediateReport
     * @return This {@link SmsTextualMessage instance}.
     */
    public SmsTextualMessage intermediateReport(Boolean intermediateReport) {
        this.intermediateReport = intermediateReport;
        return this;
    }

    /**
     * Returns intermediateReport.
     * <p>
     * Field description:
     * The [real-time intermediate delivery report](#channels/sms/receive-outbound-sms-message-report) containing GSM error codes, messages status, pricing, network and country codes, etc., which will be sent on your callback server. Defaults to &#x60;false&#x60;.
     *
     * @return intermediateReport
     */
    @JsonProperty("intermediateReport")
    public Boolean getIntermediateReport() {
        return intermediateReport;
    }

    /**
     * Sets intermediateReport.
     * <p>
     * Field description:
     * The [real-time intermediate delivery report](#channels/sms/receive-outbound-sms-message-report) containing GSM error codes, messages status, pricing, network and country codes, etc., which will be sent on your callback server. Defaults to &#x60;false&#x60;.
     *
     * @param intermediateReport
     */
    @JsonProperty("intermediateReport")
    public void setIntermediateReport(Boolean intermediateReport) {
        this.intermediateReport = intermediateReport;
    }

    /**
     * Sets language.
     *
     * @param language
     * @return This {@link SmsTextualMessage instance}.
     */
    public SmsTextualMessage language(SmsLanguage language) {
        this.language = language;
        return this;
    }

    /**
     * Returns language.
     *
     * @return language
     */
    @JsonProperty("language")
    public SmsLanguage getLanguage() {
        return language;
    }

    /**
     * Sets language.
     *
     * @param language
     */
    @JsonProperty("language")
    public void setLanguage(SmsLanguage language) {
        this.language = language;
    }

    /**
     * Sets notifyContentType.
     * <p>
     * Field description:
     * Preferred delivery report content type, &#x60;application/json&#x60; or &#x60;application/xml&#x60;.
     *
     * @param notifyContentType
     * @return This {@link SmsTextualMessage instance}.
     */
    public SmsTextualMessage notifyContentType(String notifyContentType) {
        this.notifyContentType = notifyContentType;
        return this;
    }

    /**
     * Returns notifyContentType.
     * <p>
     * Field description:
     * Preferred delivery report content type, &#x60;application/json&#x60; or &#x60;application/xml&#x60;.
     *
     * @return notifyContentType
     */
    @JsonProperty("notifyContentType")
    public String getNotifyContentType() {
        return notifyContentType;
    }

    /**
     * Sets notifyContentType.
     * <p>
     * Field description:
     * Preferred delivery report content type, &#x60;application/json&#x60; or &#x60;application/xml&#x60;.
     *
     * @param notifyContentType
     */
    @JsonProperty("notifyContentType")
    public void setNotifyContentType(String notifyContentType) {
        this.notifyContentType = notifyContentType;
    }

    /**
     * Sets notifyUrl.
     * <p>
     * Field description:
     * The URL on your call back server on to which a delivery report will be sent. The [retry cycle](https://www.infobip.com/docs/sms/api#notify-url) for when your URL becomes unavailable uses the following formula: &#x60;1min + (1min * retryNumber * retryNumber)&#x60;.
     *
     * @param notifyUrl
     * @return This {@link SmsTextualMessage instance}.
     */
    public SmsTextualMessage notifyUrl(String notifyUrl) {
        this.notifyUrl = notifyUrl;
        return this;
    }

    /**
     * Returns notifyUrl.
     * <p>
     * Field description:
     * The URL on your call back server on to which a delivery report will be sent. The [retry cycle](https://www.infobip.com/docs/sms/api#notify-url) for when your URL becomes unavailable uses the following formula: &#x60;1min + (1min * retryNumber * retryNumber)&#x60;.
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
     * The URL on your call back server on to which a delivery report will be sent. The [retry cycle](https://www.infobip.com/docs/sms/api#notify-url) for when your URL becomes unavailable uses the following formula: &#x60;1min + (1min * retryNumber * retryNumber)&#x60;.
     *
     * @param notifyUrl
     */
    @JsonProperty("notifyUrl")
    public void setNotifyUrl(String notifyUrl) {
        this.notifyUrl = notifyUrl;
    }

    /**
     * Sets regional.
     *
     * @param regional
     * @return This {@link SmsTextualMessage instance}.
     */
    public SmsTextualMessage regional(SmsRegionalOptions regional) {
        this.regional = regional;
        return this;
    }

    /**
     * Returns regional.
     *
     * @return regional
     */
    @JsonProperty("regional")
    public SmsRegionalOptions getRegional() {
        return regional;
    }

    /**
     * Sets regional.
     *
     * @param regional
     */
    @JsonProperty("regional")
    public void setRegional(SmsRegionalOptions regional) {
        this.regional = regional;
    }

    /**
     * Sets sendAt.
     * <p>
     * Field description:
     * Date and time when the message is to be sent. Used for [scheduled SMS](#channels/sms/get-scheduled-sms-messages). Has the following format: &#x60;yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZ&#x60;, and can only be scheduled for no later than 180 days in advance.
     *
     * @param sendAt
     * @return This {@link SmsTextualMessage instance}.
     */
    public SmsTextualMessage sendAt(OffsetDateTime sendAt) {
        this.sendAt = sendAt;
        return this;
    }

    /**
     * Returns sendAt.
     * <p>
     * Field description:
     * Date and time when the message is to be sent. Used for [scheduled SMS](#channels/sms/get-scheduled-sms-messages). Has the following format: &#x60;yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZ&#x60;, and can only be scheduled for no later than 180 days in advance.
     *
     * @return sendAt
     */
    @JsonProperty("sendAt")
    public OffsetDateTime getSendAt() {
        return sendAt;
    }

    /**
     * Sets sendAt.
     * <p>
     * Field description:
     * Date and time when the message is to be sent. Used for [scheduled SMS](#channels/sms/get-scheduled-sms-messages). Has the following format: &#x60;yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZ&#x60;, and can only be scheduled for no later than 180 days in advance.
     *
     * @param sendAt
     */
    @JsonProperty("sendAt")
    public void setSendAt(OffsetDateTime sendAt) {
        this.sendAt = sendAt;
    }

    /**
     * Sets text.
     * <p>
     * Field description:
     * Content of the message being sent.
     *
     * @param text
     * @return This {@link SmsTextualMessage instance}.
     */
    public SmsTextualMessage text(String text) {
        this.text = text;
        return this;
    }

    /**
     * Returns text.
     * <p>
     * Field description:
     * Content of the message being sent.
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
     * Content of the message being sent.
     *
     * @param text
     */
    @JsonProperty("text")
    public void setText(String text) {
        this.text = text;
    }

    /**
     * Sets transliteration.
     * <p>
     * Field description:
     * The transliteration of your sent message from one script to another. Transliteration is used to replace characters which are not recognized as part of your defaulted alphabet. Possible values: &#x60;TURKISH&#x60;, &#x60;GREEK&#x60;, &#x60;CYRILLIC&#x60;, &#x60;SERBIAN_CYRILLIC&#x60;, &#x60;BULGARIAN_CYRILLIC&#x60;, &#x60;CENTRAL_EUROPEAN&#x60;, &#x60;BALTIC&#x60;, &#x60;PORTUGUESE&#x60;, &#x60;COLOMBIAN&#x60;, and &#x60;NON_UNICODE&#x60;.
     *
     * @param transliteration
     * @return This {@link SmsTextualMessage instance}.
     */
    public SmsTextualMessage transliteration(String transliteration) {
        this.transliteration = transliteration;
        return this;
    }

    /**
     * Returns transliteration.
     * <p>
     * Field description:
     * The transliteration of your sent message from one script to another. Transliteration is used to replace characters which are not recognized as part of your defaulted alphabet. Possible values: &#x60;TURKISH&#x60;, &#x60;GREEK&#x60;, &#x60;CYRILLIC&#x60;, &#x60;SERBIAN_CYRILLIC&#x60;, &#x60;BULGARIAN_CYRILLIC&#x60;, &#x60;CENTRAL_EUROPEAN&#x60;, &#x60;BALTIC&#x60;, &#x60;PORTUGUESE&#x60;, &#x60;COLOMBIAN&#x60;, and &#x60;NON_UNICODE&#x60;.
     *
     * @return transliteration
     */
    @JsonProperty("transliteration")
    public String getTransliteration() {
        return transliteration;
    }

    /**
     * Sets transliteration.
     * <p>
     * Field description:
     * The transliteration of your sent message from one script to another. Transliteration is used to replace characters which are not recognized as part of your defaulted alphabet. Possible values: &#x60;TURKISH&#x60;, &#x60;GREEK&#x60;, &#x60;CYRILLIC&#x60;, &#x60;SERBIAN_CYRILLIC&#x60;, &#x60;BULGARIAN_CYRILLIC&#x60;, &#x60;CENTRAL_EUROPEAN&#x60;, &#x60;BALTIC&#x60;, &#x60;PORTUGUESE&#x60;, &#x60;COLOMBIAN&#x60;, and &#x60;NON_UNICODE&#x60;.
     *
     * @param transliteration
     */
    @JsonProperty("transliteration")
    public void setTransliteration(String transliteration) {
        this.transliteration = transliteration;
    }

    /**
     * Sets validityPeriod.
     * <p>
     * Field description:
     * The message validity period in minutes. When the period expires, it will not be allowed for the message to be sent. Validity period longer than 48h is not supported. Any bigger value will automatically default back to &#x60;2880&#x60;.
     *
     * @param validityPeriod
     * @return This {@link SmsTextualMessage instance}.
     */
    public SmsTextualMessage validityPeriod(Long validityPeriod) {
        this.validityPeriod = validityPeriod;
        return this;
    }

    /**
     * Returns validityPeriod.
     * <p>
     * Field description:
     * The message validity period in minutes. When the period expires, it will not be allowed for the message to be sent. Validity period longer than 48h is not supported. Any bigger value will automatically default back to &#x60;2880&#x60;.
     *
     * @return validityPeriod
     */
    @JsonProperty("validityPeriod")
    public Long getValidityPeriod() {
        return validityPeriod;
    }

    /**
     * Sets validityPeriod.
     * <p>
     * Field description:
     * The message validity period in minutes. When the period expires, it will not be allowed for the message to be sent. Validity period longer than 48h is not supported. Any bigger value will automatically default back to &#x60;2880&#x60;.
     *
     * @param validityPeriod
     */
    @JsonProperty("validityPeriod")
    public void setValidityPeriod(Long validityPeriod) {
        this.validityPeriod = validityPeriod;
    }

    /**
     * Sets entityId.
     * <p>
     * Field description:
     * Required for entity use in a send request for outbound traffic. Returned in notification events. For more details, see our [documentation](https://www.infobip.com/docs/cpaas-x/application-and-entity-management).
     *
     * @param entityId
     * @return This {@link SmsTextualMessage instance}.
     */
    public SmsTextualMessage entityId(String entityId) {
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
     * @return This {@link SmsTextualMessage instance}.
     */
    public SmsTextualMessage applicationId(String applicationId) {
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
        SmsTextualMessage smsTextualMessage = (SmsTextualMessage) o;
        return Objects.equals(this.callbackData, smsTextualMessage.callbackData)
                && Objects.equals(this.deliveryTimeWindow, smsTextualMessage.deliveryTimeWindow)
                && Objects.equals(this.destinations, smsTextualMessage.destinations)
                && Objects.equals(this.flash, smsTextualMessage.flash)
                && Objects.equals(this.from, smsTextualMessage.from)
                && Objects.equals(this.intermediateReport, smsTextualMessage.intermediateReport)
                && Objects.equals(this.language, smsTextualMessage.language)
                && Objects.equals(this.notifyContentType, smsTextualMessage.notifyContentType)
                && Objects.equals(this.notifyUrl, smsTextualMessage.notifyUrl)
                && Objects.equals(this.regional, smsTextualMessage.regional)
                && Objects.equals(this.sendAt, smsTextualMessage.sendAt)
                && Objects.equals(this.text, smsTextualMessage.text)
                && Objects.equals(this.transliteration, smsTextualMessage.transliteration)
                && Objects.equals(this.validityPeriod, smsTextualMessage.validityPeriod)
                && Objects.equals(this.entityId, smsTextualMessage.entityId)
                && Objects.equals(this.applicationId, smsTextualMessage.applicationId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                callbackData,
                deliveryTimeWindow,
                destinations,
                flash,
                from,
                intermediateReport,
                language,
                notifyContentType,
                notifyUrl,
                regional,
                sendAt,
                text,
                transliteration,
                validityPeriod,
                entityId,
                applicationId);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class SmsTextualMessage {")
                .append(newLine)
                .append("    callbackData: ")
                .append(toIndentedString(callbackData))
                .append(newLine)
                .append("    deliveryTimeWindow: ")
                .append(toIndentedString(deliveryTimeWindow))
                .append(newLine)
                .append("    destinations: ")
                .append(toIndentedString(destinations))
                .append(newLine)
                .append("    flash: ")
                .append(toIndentedString(flash))
                .append(newLine)
                .append("    from: ")
                .append(toIndentedString(from))
                .append(newLine)
                .append("    intermediateReport: ")
                .append(toIndentedString(intermediateReport))
                .append(newLine)
                .append("    language: ")
                .append(toIndentedString(language))
                .append(newLine)
                .append("    notifyContentType: ")
                .append(toIndentedString(notifyContentType))
                .append(newLine)
                .append("    notifyUrl: ")
                .append(toIndentedString(notifyUrl))
                .append(newLine)
                .append("    regional: ")
                .append(toIndentedString(regional))
                .append(newLine)
                .append("    sendAt: ")
                .append(toIndentedString(sendAt))
                .append(newLine)
                .append("    text: ")
                .append(toIndentedString(text))
                .append(newLine)
                .append("    transliteration: ")
                .append(toIndentedString(transliteration))
                .append(newLine)
                .append("    validityPeriod: ")
                .append(toIndentedString(validityPeriod))
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
