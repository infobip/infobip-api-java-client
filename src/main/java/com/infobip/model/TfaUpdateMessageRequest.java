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
 * Represents TfaUpdateMessageRequest model.
 */
public class TfaUpdateMessageRequest {

    private TfaLanguage language;

    private String messageText;

    private Integer pinLength;

    private TfaPinType pinType;

    private TfaRegionalOptions regional;

    private String repeatDTMF;

    private String senderId;

    private Double speechRate;

    private String voiceName;

    /**
     * Sets language.
     *
     * @param language
     * @return This {@link TfaUpdateMessageRequest instance}.
     */
    public TfaUpdateMessageRequest language(TfaLanguage language) {
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
     * Sets messageText.
     * <p>
     * Field description:
     * Content of the message being sent which contains at minimum one placeholder for a PIN code (&#x60;{{pin}}&#x60;). Placeholder format is &#x60;{{placeholderName}}&#x60;.
     *
     * @param messageText
     * @return This {@link TfaUpdateMessageRequest instance}.
     */
    public TfaUpdateMessageRequest messageText(String messageText) {
        this.messageText = messageText;
        return this;
    }

    /**
     * Returns messageText.
     * <p>
     * Field description:
     * Content of the message being sent which contains at minimum one placeholder for a PIN code (&#x60;{{pin}}&#x60;). Placeholder format is &#x60;{{placeholderName}}&#x60;.
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
     * Content of the message being sent which contains at minimum one placeholder for a PIN code (&#x60;{{pin}}&#x60;). Placeholder format is &#x60;{{placeholderName}}&#x60;.
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
     * @return This {@link TfaUpdateMessageRequest instance}.
     */
    public TfaUpdateMessageRequest pinLength(Integer pinLength) {
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
     * Sets pinType.
     *
     * @param pinType
     * @return This {@link TfaUpdateMessageRequest instance}.
     */
    public TfaUpdateMessageRequest pinType(TfaPinType pinType) {
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
     * @return This {@link TfaUpdateMessageRequest instance}.
     */
    public TfaUpdateMessageRequest regional(TfaRegionalOptions regional) {
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
     * If the PIN is sent as a voice message, the DTMF code allows the recipient to replay the message.
     *
     * @param repeatDTMF
     * @return This {@link TfaUpdateMessageRequest instance}.
     */
    public TfaUpdateMessageRequest repeatDTMF(String repeatDTMF) {
        this.repeatDTMF = repeatDTMF;
        return this;
    }

    /**
     * Returns repeatDTMF.
     * <p>
     * Field description:
     * If the PIN is sent as a voice message, the DTMF code allows the recipient to replay the message.
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
     * If the PIN is sent as a voice message, the DTMF code allows the recipient to replay the message.
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
     * The name that will appear as the sender of the 2FA message (e.g. CompanyName).
     *
     * @param senderId
     * @return This {@link TfaUpdateMessageRequest instance}.
     */
    public TfaUpdateMessageRequest senderId(String senderId) {
        this.senderId = senderId;
        return this;
    }

    /**
     * Returns senderId.
     * <p>
     * Field description:
     * The name that will appear as the sender of the 2FA message (e.g. CompanyName).
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
     * The name that will appear as the sender of the 2FA message (e.g. CompanyName).
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
     * The speed of narration for messages sent as voice. Supported range is from &#x60;0.5&#x60; to &#x60;2&#x60;.
     *
     * @param speechRate
     * @return This {@link TfaUpdateMessageRequest instance}.
     */
    public TfaUpdateMessageRequest speechRate(Double speechRate) {
        this.speechRate = speechRate;
        return this;
    }

    /**
     * Returns speechRate.
     * <p>
     * Field description:
     * The speed of narration for messages sent as voice. Supported range is from &#x60;0.5&#x60; to &#x60;2&#x60;.
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
     * The speed of narration for messages sent as voice. Supported range is from &#x60;0.5&#x60; to &#x60;2&#x60;.
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
     * @return This {@link TfaUpdateMessageRequest instance}.
     */
    public TfaUpdateMessageRequest voiceName(String voiceName) {
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
        TfaUpdateMessageRequest tfaUpdateMessageRequest = (TfaUpdateMessageRequest) o;
        return Objects.equals(this.language, tfaUpdateMessageRequest.language)
                && Objects.equals(this.messageText, tfaUpdateMessageRequest.messageText)
                && Objects.equals(this.pinLength, tfaUpdateMessageRequest.pinLength)
                && Objects.equals(this.pinType, tfaUpdateMessageRequest.pinType)
                && Objects.equals(this.regional, tfaUpdateMessageRequest.regional)
                && Objects.equals(this.repeatDTMF, tfaUpdateMessageRequest.repeatDTMF)
                && Objects.equals(this.senderId, tfaUpdateMessageRequest.senderId)
                && Objects.equals(this.speechRate, tfaUpdateMessageRequest.speechRate)
                && Objects.equals(this.voiceName, tfaUpdateMessageRequest.voiceName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                language, messageText, pinLength, pinType, regional, repeatDTMF, senderId, speechRate, voiceName);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class TfaUpdateMessageRequest {")
                .append(newLine)
                .append("    language: ")
                .append(toIndentedString(language))
                .append(newLine)
                .append("    messageText: ")
                .append(toIndentedString(messageText))
                .append(newLine)
                .append("    pinLength: ")
                .append(toIndentedString(pinLength))
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
