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
 * Represents SmsOutboundMessage model.
 */
public class SmsOutboundMessage {

    private String from;

    private List<SmsDestination> destinations = new ArrayList<>();

    private String text;

    private Boolean flash;

    private Boolean transliteration;

    private String languageCode;

    private Boolean notify;

    private String notifyUrl;

    private String notifyContentType;

    private String callbackData;

    private ValidityPeriod validityPeriod;

    private OffsetDateTime sendAt;

    private String entityId;

    private String applicationId;

    /**
     * Sets from.
     * <p>
     * Field description:
     * Sender ID that can be alphanumeric or numeric (e.g., CompanyName).
     *
     * @param from
     * @return This {@link SmsOutboundMessage instance}.
     */
    public SmsOutboundMessage from(String from) {
        this.from = from;
        return this;
    }

    /**
     * Returns from.
     * <p>
     * Field description:
     * Sender ID that can be alphanumeric or numeric (e.g., CompanyName).
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
     *
     * @param from
     */
    @JsonProperty("from")
    public void setFrom(String from) {
        this.from = from;
    }

    /**
     * Sets destinations.
     * <p>
     * Field description:
     * Array of destination objects for where messages are being sent.
     * <p>
     * The field is required.
     *
     * @param destinations
     * @return This {@link SmsOutboundMessage instance}.
     */
    public SmsOutboundMessage destinations(List<SmsDestination> destinations) {
        this.destinations = destinations;
        return this;
    }

    /**
     * Adds and item into destinations.
     * <p>
     * Field description:
     * Array of destination objects for where messages are being sent.
     * <p>
     * The field is required.
     *
     * @param destinationsItem The item to be added to the list.
     * @return This {@link SmsOutboundMessage instance}.
     */
    public SmsOutboundMessage addDestinationsItem(SmsDestination destinationsItem) {
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
     * Array of destination objects for where messages are being sent.
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
     * Array of destination objects for where messages are being sent.
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
     * Sets text.
     * <p>
     * Field description:
     * Content of the message being sent.
     * <p>
     * The field is required.
     *
     * @param text
     * @return This {@link SmsOutboundMessage instance}.
     */
    public SmsOutboundMessage text(String text) {
        this.text = text;
        return this;
    }

    /**
     * Returns text.
     * <p>
     * Field description:
     * Content of the message being sent.
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
     * Content of the message being sent.
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
     * Sets flash.
     * <p>
     * Field description:
     * Allows for sending a flash SMS to automatically appear on recipient devices without interaction.
     *
     * @param flash
     * @return This {@link SmsOutboundMessage instance}.
     */
    public SmsOutboundMessage flash(Boolean flash) {
        this.flash = flash;
        return this;
    }

    /**
     * Returns flash.
     * <p>
     * Field description:
     * Allows for sending a flash SMS to automatically appear on recipient devices without interaction.
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
     * Allows for sending a flash SMS to automatically appear on recipient devices without interaction.
     *
     * @param flash
     */
    @JsonProperty("flash")
    public void setFlash(Boolean flash) {
        this.flash = flash;
    }

    /**
     * Sets transliteration.
     * <p>
     * Field description:
     * Converts your text from one script to another.
     *
     * @param transliteration
     * @return This {@link SmsOutboundMessage instance}.
     */
    public SmsOutboundMessage transliteration(Boolean transliteration) {
        this.transliteration = transliteration;
        return this;
    }

    /**
     * Returns transliteration.
     * <p>
     * Field description:
     * Converts your text from one script to another.
     *
     * @return transliteration
     */
    @JsonProperty("transliteration")
    public Boolean getTransliteration() {
        return transliteration;
    }

    /**
     * Sets transliteration.
     * <p>
     * Field description:
     * Converts your text from one script to another.
     *
     * @param transliteration
     */
    @JsonProperty("transliteration")
    public void setTransliteration(Boolean transliteration) {
        this.transliteration = transliteration;
    }

    /**
     * Sets languageCode.
     * <p>
     * Field description:
     * Language code for the correct character set.
     *
     * @param languageCode
     * @return This {@link SmsOutboundMessage instance}.
     */
    public SmsOutboundMessage languageCode(String languageCode) {
        this.languageCode = languageCode;
        return this;
    }

    /**
     * Returns languageCode.
     * <p>
     * Field description:
     * Language code for the correct character set.
     *
     * @return languageCode
     */
    @JsonProperty("languageCode")
    public String getLanguageCode() {
        return languageCode;
    }

    /**
     * Sets languageCode.
     * <p>
     * Field description:
     * Language code for the correct character set.
     *
     * @param languageCode
     */
    @JsonProperty("languageCode")
    public void setLanguageCode(String languageCode) {
        this.languageCode = languageCode;
    }

    /**
     * Sets notify.
     * <p>
     * Field description:
     * Allows for delivery reports to be sent for the message.
     *
     * @param notify
     * @return This {@link SmsOutboundMessage instance}.
     */
    public SmsOutboundMessage notify(Boolean notify) {
        this.notify = notify;
        return this;
    }

    /**
     * Returns notify.
     * <p>
     * Field description:
     * Allows for delivery reports to be sent for the message.
     *
     * @return notify
     */
    @JsonProperty("notify")
    public Boolean getNotify() {
        return notify;
    }

    /**
     * Sets notify.
     * <p>
     * Field description:
     * Allows for delivery reports to be sent for the message.
     *
     * @param notify
     */
    @JsonProperty("notify")
    public void setNotify(Boolean notify) {
        this.notify = notify;
    }

    /**
     * Sets notifyUrl.
     * <p>
     * Field description:
     * The URL on your callback server to which delivery reports will be sent.
     *
     * @param notifyUrl
     * @return This {@link SmsOutboundMessage instance}.
     */
    public SmsOutboundMessage notifyUrl(String notifyUrl) {
        this.notifyUrl = notifyUrl;
        return this;
    }

    /**
     * Returns notifyUrl.
     * <p>
     * Field description:
     * The URL on your callback server to which delivery reports will be sent.
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
     * The URL on your callback server to which delivery reports will be sent.
     *
     * @param notifyUrl
     */
    @JsonProperty("notifyUrl")
    public void setNotifyUrl(String notifyUrl) {
        this.notifyUrl = notifyUrl;
    }

    /**
     * Sets notifyContentType.
     * <p>
     * Field description:
     * Preferred delivery report content type.
     *
     * @param notifyContentType
     * @return This {@link SmsOutboundMessage instance}.
     */
    public SmsOutboundMessage notifyContentType(String notifyContentType) {
        this.notifyContentType = notifyContentType;
        return this;
    }

    /**
     * Returns notifyContentType.
     * <p>
     * Field description:
     * Preferred delivery report content type.
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
     * Preferred delivery report content type.
     *
     * @param notifyContentType
     */
    @JsonProperty("notifyContentType")
    public void setNotifyContentType(String notifyContentType) {
        this.notifyContentType = notifyContentType;
    }

    /**
     * Sets callbackData.
     * <p>
     * Field description:
     * Additional data that can be used for identifying the message.
     *
     * @param callbackData
     * @return This {@link SmsOutboundMessage instance}.
     */
    public SmsOutboundMessage callbackData(String callbackData) {
        this.callbackData = callbackData;
        return this;
    }

    /**
     * Returns callbackData.
     * <p>
     * Field description:
     * Additional data that can be used for identifying the message.
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
     * Additional data that can be used for identifying the message.
     *
     * @param callbackData
     */
    @JsonProperty("callbackData")
    public void setCallbackData(String callbackData) {
        this.callbackData = callbackData;
    }

    /**
     * Sets validityPeriod.
     *
     * @param validityPeriod
     * @return This {@link SmsOutboundMessage instance}.
     */
    public SmsOutboundMessage validityPeriod(ValidityPeriod validityPeriod) {
        this.validityPeriod = validityPeriod;
        return this;
    }

    /**
     * Returns validityPeriod.
     *
     * @return validityPeriod
     */
    @JsonProperty("validityPeriod")
    public ValidityPeriod getValidityPeriod() {
        return validityPeriod;
    }

    /**
     * Sets validityPeriod.
     *
     * @param validityPeriod
     */
    @JsonProperty("validityPeriod")
    public void setValidityPeriod(ValidityPeriod validityPeriod) {
        this.validityPeriod = validityPeriod;
    }

    /**
     * Sets sendAt.
     * <p>
     * Field description:
     * Date and time when the message is to be sent.
     *
     * @param sendAt
     * @return This {@link SmsOutboundMessage instance}.
     */
    public SmsOutboundMessage sendAt(OffsetDateTime sendAt) {
        this.sendAt = sendAt;
        return this;
    }

    /**
     * Returns sendAt.
     * <p>
     * Field description:
     * Date and time when the message is to be sent.
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
     * Date and time when the message is to be sent.
     *
     * @param sendAt
     */
    @JsonProperty("sendAt")
    public void setSendAt(OffsetDateTime sendAt) {
        this.sendAt = sendAt;
    }

    /**
     * Sets entityId.
     * <p>
     * Field description:
     * Entity id used to send the message.
     *
     * @param entityId
     * @return This {@link SmsOutboundMessage instance}.
     */
    public SmsOutboundMessage entityId(String entityId) {
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
     * @return This {@link SmsOutboundMessage instance}.
     */
    public SmsOutboundMessage applicationId(String applicationId) {
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
        SmsOutboundMessage smsOutboundMessage = (SmsOutboundMessage) o;
        return Objects.equals(this.from, smsOutboundMessage.from)
                && Objects.equals(this.destinations, smsOutboundMessage.destinations)
                && Objects.equals(this.text, smsOutboundMessage.text)
                && Objects.equals(this.flash, smsOutboundMessage.flash)
                && Objects.equals(this.transliteration, smsOutboundMessage.transliteration)
                && Objects.equals(this.languageCode, smsOutboundMessage.languageCode)
                && Objects.equals(this.notify, smsOutboundMessage.notify)
                && Objects.equals(this.notifyUrl, smsOutboundMessage.notifyUrl)
                && Objects.equals(this.notifyContentType, smsOutboundMessage.notifyContentType)
                && Objects.equals(this.callbackData, smsOutboundMessage.callbackData)
                && Objects.equals(this.validityPeriod, smsOutboundMessage.validityPeriod)
                && Objects.equals(this.sendAt, smsOutboundMessage.sendAt)
                && Objects.equals(this.entityId, smsOutboundMessage.entityId)
                && Objects.equals(this.applicationId, smsOutboundMessage.applicationId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                from,
                destinations,
                text,
                flash,
                transliteration,
                languageCode,
                notify,
                notifyUrl,
                notifyContentType,
                callbackData,
                validityPeriod,
                sendAt,
                entityId,
                applicationId);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class SmsOutboundMessage {")
                .append(newLine)
                .append("    from: ")
                .append(toIndentedString(from))
                .append(newLine)
                .append("    destinations: ")
                .append(toIndentedString(destinations))
                .append(newLine)
                .append("    text: ")
                .append(toIndentedString(text))
                .append(newLine)
                .append("    flash: ")
                .append(toIndentedString(flash))
                .append(newLine)
                .append("    transliteration: ")
                .append(toIndentedString(transliteration))
                .append(newLine)
                .append("    languageCode: ")
                .append(toIndentedString(languageCode))
                .append(newLine)
                .append("    notify: ")
                .append(toIndentedString(notify))
                .append(newLine)
                .append("    notifyUrl: ")
                .append(toIndentedString(notifyUrl))
                .append(newLine)
                .append("    notifyContentType: ")
                .append(toIndentedString(notifyContentType))
                .append(newLine)
                .append("    callbackData: ")
                .append(toIndentedString(callbackData))
                .append(newLine)
                .append("    validityPeriod: ")
                .append(toIndentedString(validityPeriod))
                .append(newLine)
                .append("    sendAt: ")
                .append(toIndentedString(sendAt))
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
