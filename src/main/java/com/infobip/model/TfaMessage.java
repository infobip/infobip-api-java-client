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
 * Represents TfaMessage model.
 */
public class TfaMessage {

    private String applicationId;

    private Long emailTemplateId;

    private String from;

    private TfaLanguage language;

    private String messageId;

    private String messageText;

    private Integer pinLength;

    private String pinPlaceholder;

    private TfaPinType pinType;

    private TfaRegionalOptions regional;

    private String repeatDTMF;

    private String senderId;

    private Double speechRate;

    private String voiceName;

    /**
     * Sets applicationId.
     * <p>
     * Field description:
     * The ID of the application that represents your service (e.g. 2FA for login, 2FA for changing the password, etc.) for which the requested message has been created.
     *
     * @param applicationId
     * @return This {@link TfaMessage instance}.
     */
    public TfaMessage applicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }

    /**
     * Returns applicationId.
     * <p>
     * Field description:
     * The ID of the application that represents your service (e.g. 2FA for login, 2FA for changing the password, etc.) for which the requested message has been created.
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
     * The ID of the application that represents your service (e.g. 2FA for login, 2FA for changing the password, etc.) for which the requested message has been created.
     *
     * @param applicationId
     */
    @JsonProperty("applicationId")
    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    /**
     * Sets emailTemplateId.
     * <p>
     * Field description:
     * Email template ID that should reference a previously created Email template. This field is present only for [Email message templates](#channels/sms/create-2fa-email-message-template).
     *
     * @param emailTemplateId
     * @return This {@link TfaMessage instance}.
     */
    public TfaMessage emailTemplateId(Long emailTemplateId) {
        this.emailTemplateId = emailTemplateId;
        return this;
    }

    /**
     * Returns emailTemplateId.
     * <p>
     * Field description:
     * Email template ID that should reference a previously created Email template. This field is present only for [Email message templates](#channels/sms/create-2fa-email-message-template).
     *
     * @return emailTemplateId
     */
    @JsonProperty("emailTemplateId")
    public Long getEmailTemplateId() {
        return emailTemplateId;
    }

    /**
     * Sets emailTemplateId.
     * <p>
     * Field description:
     * Email template ID that should reference a previously created Email template. This field is present only for [Email message templates](#channels/sms/create-2fa-email-message-template).
     *
     * @param emailTemplateId
     */
    @JsonProperty("emailTemplateId")
    public void setEmailTemplateId(Long emailTemplateId) {
        this.emailTemplateId = emailTemplateId;
    }

    /**
     * Sets from.
     * <p>
     * Field description:
     * The sender of the 2FA message, an email address with an optional sender name (e.g. &#x60;company@example.com&#x60; or &#x60;Jane Smith &lt;jane.smith@somecompany.com&gt;&#x60;). This field is present only for [Email message templates](#channels/sms/create-2fa-email-message-template).
     *
     * @param from
     * @return This {@link TfaMessage instance}.
     */
    public TfaMessage from(String from) {
        this.from = from;
        return this;
    }

    /**
     * Returns from.
     * <p>
     * Field description:
     * The sender of the 2FA message, an email address with an optional sender name (e.g. &#x60;company@example.com&#x60; or &#x60;Jane Smith &lt;jane.smith@somecompany.com&gt;&#x60;). This field is present only for [Email message templates](#channels/sms/create-2fa-email-message-template).
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
     * The sender of the 2FA message, an email address with an optional sender name (e.g. &#x60;company@example.com&#x60; or &#x60;Jane Smith &lt;jane.smith@somecompany.com&gt;&#x60;). This field is present only for [Email message templates](#channels/sms/create-2fa-email-message-template).
     *
     * @param from
     */
    @JsonProperty("from")
    public void setFrom(String from) {
        this.from = from;
    }

    /**
     * Sets language.
     *
     * @param language
     * @return This {@link TfaMessage instance}.
     */
    public TfaMessage language(TfaLanguage language) {
        this.language = language;
        return this;
    }

    /**
     * Returns language.
     *
     * @return language
     */
    @JsonProperty("language")
    public TfaLanguage getLanguage() {
        return language;
    }

    /**
     * Sets language.
     *
     * @param language
     */
    @JsonProperty("language")
    public void setLanguage(TfaLanguage language) {
        this.language = language;
    }

    /**
     * Sets messageId.
     * <p>
     * Field description:
     * The ID of the message template (message body with the PIN placeholder) that is sent to the recipient.
     *
     * @param messageId
     * @return This {@link TfaMessage instance}.
     */
    public TfaMessage messageId(String messageId) {
        this.messageId = messageId;
        return this;
    }

    /**
     * Returns messageId.
     * <p>
     * Field description:
     * The ID of the message template (message body with the PIN placeholder) that is sent to the recipient.
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
     * The ID of the message template (message body with the PIN placeholder) that is sent to the recipient.
     *
     * @param messageId
     */
    @JsonProperty("messageId")
    public void setMessageId(String messageId) {
        this.messageId = messageId;
    }

    /**
     * Sets messageText.
     * <p>
     * Field description:
     * Text of a message that will be sent. Message text must contain &#x60;pinPlaceholder&#x60;.
     *
     * @param messageText
     * @return This {@link TfaMessage instance}.
     */
    public TfaMessage messageText(String messageText) {
        this.messageText = messageText;
        return this;
    }

    /**
     * Returns messageText.
     * <p>
     * Field description:
     * Text of a message that will be sent. Message text must contain &#x60;pinPlaceholder&#x60;.
     *
     * @return messageText
     */
    @JsonProperty("messageText")
    public String getMessageText() {
        return messageText;
    }

    /**
     * Sets messageText.
     * <p>
     * Field description:
     * Text of a message that will be sent. Message text must contain &#x60;pinPlaceholder&#x60;.
     *
     * @param messageText
     */
    @JsonProperty("messageText")
    public void setMessageText(String messageText) {
        this.messageText = messageText;
    }

    /**
     * Sets pinLength.
     * <p>
     * Field description:
     * PIN code length.
     *
     * @param pinLength
     * @return This {@link TfaMessage instance}.
     */
    public TfaMessage pinLength(Integer pinLength) {
        this.pinLength = pinLength;
        return this;
    }

    /**
     * Returns pinLength.
     * <p>
     * Field description:
     * PIN code length.
     *
     * @return pinLength
     */
    @JsonProperty("pinLength")
    public Integer getPinLength() {
        return pinLength;
    }

    /**
     * Sets pinLength.
     * <p>
     * Field description:
     * PIN code length.
     *
     * @param pinLength
     */
    @JsonProperty("pinLength")
    public void setPinLength(Integer pinLength) {
        this.pinLength = pinLength;
    }

    /**
     * Sets pinPlaceholder.
     * <p>
     * Field description:
     * The PIN code placeholder that will be replaced with a generated PIN code.
     *
     * @param pinPlaceholder
     * @return This {@link TfaMessage instance}.
     */
    public TfaMessage pinPlaceholder(String pinPlaceholder) {
        this.pinPlaceholder = pinPlaceholder;
        return this;
    }

    /**
     * Returns pinPlaceholder.
     * <p>
     * Field description:
     * The PIN code placeholder that will be replaced with a generated PIN code.
     *
     * @return pinPlaceholder
     */
    @JsonProperty("pinPlaceholder")
    public String getPinPlaceholder() {
        return pinPlaceholder;
    }

    /**
     * Sets pinPlaceholder.
     * <p>
     * Field description:
     * The PIN code placeholder that will be replaced with a generated PIN code.
     *
     * @param pinPlaceholder
     */
    @JsonProperty("pinPlaceholder")
    public void setPinPlaceholder(String pinPlaceholder) {
        this.pinPlaceholder = pinPlaceholder;
    }

    /**
     * Sets pinType.
     *
     * @param pinType
     * @return This {@link TfaMessage instance}.
     */
    public TfaMessage pinType(TfaPinType pinType) {
        this.pinType = pinType;
        return this;
    }

    /**
     * Returns pinType.
     *
     * @return pinType
     */
    @JsonProperty("pinType")
    public TfaPinType getPinType() {
        return pinType;
    }

    /**
     * Sets pinType.
     *
     * @param pinType
     */
    @JsonProperty("pinType")
    public void setPinType(TfaPinType pinType) {
        this.pinType = pinType;
    }

    /**
     * Sets regional.
     *
     * @param regional
     * @return This {@link TfaMessage instance}.
     */
    public TfaMessage regional(TfaRegionalOptions regional) {
        this.regional = regional;
        return this;
    }

    /**
     * Returns regional.
     *
     * @return regional
     */
    @JsonProperty("regional")
    public TfaRegionalOptions getRegional() {
        return regional;
    }

    /**
     * Sets regional.
     *
     * @param regional
     */
    @JsonProperty("regional")
    public void setRegional(TfaRegionalOptions regional) {
        this.regional = regional;
    }

    /**
     * Sets repeatDTMF.
     * <p>
     * Field description:
     * In case PIN message is sent by Voice, DTMF code will enable replaying the message.
     *
     * @param repeatDTMF
     * @return This {@link TfaMessage instance}.
     */
    public TfaMessage repeatDTMF(String repeatDTMF) {
        this.repeatDTMF = repeatDTMF;
        return this;
    }

    /**
     * Returns repeatDTMF.
     * <p>
     * Field description:
     * In case PIN message is sent by Voice, DTMF code will enable replaying the message.
     *
     * @return repeatDTMF
     */
    @JsonProperty("repeatDTMF")
    public String getRepeatDTMF() {
        return repeatDTMF;
    }

    /**
     * Sets repeatDTMF.
     * <p>
     * Field description:
     * In case PIN message is sent by Voice, DTMF code will enable replaying the message.
     *
     * @param repeatDTMF
     */
    @JsonProperty("repeatDTMF")
    public void setRepeatDTMF(String repeatDTMF) {
        this.repeatDTMF = repeatDTMF;
    }

    /**
     * Sets senderId.
     * <p>
     * Field description:
     * The sender of the 2FA message (Example: CompanyName).
     *
     * @param senderId
     * @return This {@link TfaMessage instance}.
     */
    public TfaMessage senderId(String senderId) {
        this.senderId = senderId;
        return this;
    }

    /**
     * Returns senderId.
     * <p>
     * Field description:
     * The sender of the 2FA message (Example: CompanyName).
     *
     * @return senderId
     */
    @JsonProperty("senderId")
    public String getSenderId() {
        return senderId;
    }

    /**
     * Sets senderId.
     * <p>
     * Field description:
     * The sender of the 2FA message (Example: CompanyName).
     *
     * @param senderId
     */
    @JsonProperty("senderId")
    public void setSenderId(String senderId) {
        this.senderId = senderId;
    }

    /**
     * Sets speechRate.
     * <p>
     * Field description:
     * In case PIN message is sent by Voice, the speed of speech can be set for the message. Supported range is from &#x60;0.5&#x60; to &#x60;2&#x60;.
     *
     * @param speechRate
     * @return This {@link TfaMessage instance}.
     */
    public TfaMessage speechRate(Double speechRate) {
        this.speechRate = speechRate;
        return this;
    }

    /**
     * Returns speechRate.
     * <p>
     * Field description:
     * In case PIN message is sent by Voice, the speed of speech can be set for the message. Supported range is from &#x60;0.5&#x60; to &#x60;2&#x60;.
     *
     * @return speechRate
     */
    @JsonProperty("speechRate")
    public Double getSpeechRate() {
        return speechRate;
    }

    /**
     * Sets speechRate.
     * <p>
     * Field description:
     * In case PIN message is sent by Voice, the speed of speech can be set for the message. Supported range is from &#x60;0.5&#x60; to &#x60;2&#x60;.
     *
     * @param speechRate
     */
    @JsonProperty("speechRate")
    public void setSpeechRate(Double speechRate) {
        this.speechRate = speechRate;
    }

    /**
     * Sets voiceName.
     * <p>
     * Field description:
     * Defines the voice that will be used for the chosen language (example: Joanna). For each supported language, we may offer different voices (learn more [here](https://www.infobip.com/docs/voice-and-video/reference#text-to-speech-languages)). You can use this [method](https://www.infobip.com/docs/api/channels/voice/voice-message/get-voices) to retrieve all voices for the given language. If not defined, it will default to the standard voice for the selected language (if available). If the standard voice is not available, the request will fail. To avoid that, you can choose one of the neural voices (charges will apply).
     *
     * @param voiceName
     * @return This {@link TfaMessage instance}.
     */
    public TfaMessage voiceName(String voiceName) {
        this.voiceName = voiceName;
        return this;
    }

    /**
     * Returns voiceName.
     * <p>
     * Field description:
     * Defines the voice that will be used for the chosen language (example: Joanna). For each supported language, we may offer different voices (learn more [here](https://www.infobip.com/docs/voice-and-video/reference#text-to-speech-languages)). You can use this [method](https://www.infobip.com/docs/api/channels/voice/voice-message/get-voices) to retrieve all voices for the given language. If not defined, it will default to the standard voice for the selected language (if available). If the standard voice is not available, the request will fail. To avoid that, you can choose one of the neural voices (charges will apply).
     *
     * @return voiceName
     */
    @JsonProperty("voiceName")
    public String getVoiceName() {
        return voiceName;
    }

    /**
     * Sets voiceName.
     * <p>
     * Field description:
     * Defines the voice that will be used for the chosen language (example: Joanna). For each supported language, we may offer different voices (learn more [here](https://www.infobip.com/docs/voice-and-video/reference#text-to-speech-languages)). You can use this [method](https://www.infobip.com/docs/api/channels/voice/voice-message/get-voices) to retrieve all voices for the given language. If not defined, it will default to the standard voice for the selected language (if available). If the standard voice is not available, the request will fail. To avoid that, you can choose one of the neural voices (charges will apply).
     *
     * @param voiceName
     */
    @JsonProperty("voiceName")
    public void setVoiceName(String voiceName) {
        this.voiceName = voiceName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TfaMessage tfaMessage = (TfaMessage) o;
        return Objects.equals(this.applicationId, tfaMessage.applicationId)
                && Objects.equals(this.emailTemplateId, tfaMessage.emailTemplateId)
                && Objects.equals(this.from, tfaMessage.from)
                && Objects.equals(this.language, tfaMessage.language)
                && Objects.equals(this.messageId, tfaMessage.messageId)
                && Objects.equals(this.messageText, tfaMessage.messageText)
                && Objects.equals(this.pinLength, tfaMessage.pinLength)
                && Objects.equals(this.pinPlaceholder, tfaMessage.pinPlaceholder)
                && Objects.equals(this.pinType, tfaMessage.pinType)
                && Objects.equals(this.regional, tfaMessage.regional)
                && Objects.equals(this.repeatDTMF, tfaMessage.repeatDTMF)
                && Objects.equals(this.senderId, tfaMessage.senderId)
                && Objects.equals(this.speechRate, tfaMessage.speechRate)
                && Objects.equals(this.voiceName, tfaMessage.voiceName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                applicationId,
                emailTemplateId,
                from,
                language,
                messageId,
                messageText,
                pinLength,
                pinPlaceholder,
                pinType,
                regional,
                repeatDTMF,
                senderId,
                speechRate,
                voiceName);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class TfaMessage {")
                .append(newLine)
                .append("    applicationId: ")
                .append(toIndentedString(applicationId))
                .append(newLine)
                .append("    emailTemplateId: ")
                .append(toIndentedString(emailTemplateId))
                .append(newLine)
                .append("    from: ")
                .append(toIndentedString(from))
                .append(newLine)
                .append("    language: ")
                .append(toIndentedString(language))
                .append(newLine)
                .append("    messageId: ")
                .append(toIndentedString(messageId))
                .append(newLine)
                .append("    messageText: ")
                .append(toIndentedString(messageText))
                .append(newLine)
                .append("    pinLength: ")
                .append(toIndentedString(pinLength))
                .append(newLine)
                .append("    pinPlaceholder: ")
                .append(toIndentedString(pinPlaceholder))
                .append(newLine)
                .append("    pinType: ")
                .append(toIndentedString(pinType))
                .append(newLine)
                .append("    regional: ")
                .append(toIndentedString(regional))
                .append(newLine)
                .append("    repeatDTMF: ")
                .append(toIndentedString(repeatDTMF))
                .append(newLine)
                .append("    senderId: ")
                .append(toIndentedString(senderId))
                .append(newLine)
                .append("    speechRate: ")
                .append(toIndentedString(speechRate))
                .append(newLine)
                .append("    voiceName: ")
                .append(toIndentedString(voiceName))
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
