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
 * Represents TfaCreateMessageRequest model.
 */
public class TfaCreateMessageRequest {

    private TfaLanguage language;

    private String messageText;

    private Integer pinLength;

    private TfaPinType pinType;

    private TfaRegionalOptions regional;

    private String repeatDTMF;

    private String senderId;

    private Double speechRate;

    /**
     * Sets language.
     *
     * @param language
     * @return This {@link TfaCreateMessageRequest instance}.
     */
    public TfaCreateMessageRequest language(TfaLanguage language) {
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
     * <p>
     * The field is required.
     *
     * @param messageText
     * @return This {@link TfaCreateMessageRequest instance}.
     */
    public TfaCreateMessageRequest messageText(String messageText) {
        this.messageText = messageText;
        return this;
    }

    /**
     * Returns messageText.
     * <p>
     * Field description:
     * Content of the message being sent which contains at minimum one placeholder for a PIN code (&#x60;{{pin}}&#x60;). Placeholder format is &#x60;{{placeholderName}}&#x60;.
     * <p>
     * The field is required.
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
     * <p>
     * The field is required.
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
     * @return This {@link TfaCreateMessageRequest instance}.
     */
    public TfaCreateMessageRequest pinLength(Integer pinLength) {
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
     * <p>
     * The field is required.
     *
     * @param pinType
     * @return This {@link TfaCreateMessageRequest instance}.
     */
    public TfaCreateMessageRequest pinType(TfaPinType pinType) {
        this.pinType = pinType;
        return this;
    }

    /**
     * Returns pinType.
     * <p>
     * The field is required.
     *
     * @return pinType
     */
    @JsonProperty("pinType")
    public TfaPinType getPinType() {
        return pinType;
    }

    /**
     * Sets pinType.
     * <p>
     * The field is required.
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
     * @return This {@link TfaCreateMessageRequest instance}.
     */
    public TfaCreateMessageRequest regional(TfaRegionalOptions regional) {
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
     * @return This {@link TfaCreateMessageRequest instance}.
     */
    public TfaCreateMessageRequest repeatDTMF(String repeatDTMF) {
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
     * The name that will appear as the sender of the 2FA message (Example: CompanyName).
     *
     * @param senderId
     * @return This {@link TfaCreateMessageRequest instance}.
     */
    public TfaCreateMessageRequest senderId(String senderId) {
        this.senderId = senderId;
        return this;
    }

    /**
     * Returns senderId.
     * <p>
     * Field description:
     * The name that will appear as the sender of the 2FA message (Example: CompanyName).
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
     * The name that will appear as the sender of the 2FA message (Example: CompanyName).
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
     * @return This {@link TfaCreateMessageRequest instance}.
     */
    public TfaCreateMessageRequest speechRate(Double speechRate) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TfaCreateMessageRequest tfaCreateMessageRequest = (TfaCreateMessageRequest) o;
        return Objects.equals(this.language, tfaCreateMessageRequest.language)
                && Objects.equals(this.messageText, tfaCreateMessageRequest.messageText)
                && Objects.equals(this.pinLength, tfaCreateMessageRequest.pinLength)
                && Objects.equals(this.pinType, tfaCreateMessageRequest.pinType)
                && Objects.equals(this.regional, tfaCreateMessageRequest.regional)
                && Objects.equals(this.repeatDTMF, tfaCreateMessageRequest.repeatDTMF)
                && Objects.equals(this.senderId, tfaCreateMessageRequest.senderId)
                && Objects.equals(this.speechRate, tfaCreateMessageRequest.speechRate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(language, messageText, pinLength, pinType, regional, repeatDTMF, senderId, speechRate);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class TfaCreateMessageRequest {")
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
