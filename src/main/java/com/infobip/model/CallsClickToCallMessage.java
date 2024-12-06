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
 * Array of click to call messages to be sent.
 */
public class CallsClickToCallMessage {

    private Boolean anonymization;

    private String audioFileUrl;

    private DeliveryTimeWindow deliveryTimeWindow;

    private String destinationA;

    private String destinationB;

    private String from;

    private String fromB;

    private String language;

    private String machineDetection;

    private Integer maxDuration;

    private String messageId;

    private String notifyContentType;

    private Integer notifyContentVersion;

    private String notifyUrl;

    private CallsRetry retry;

    private String text;

    private CallsVoice voice;

    private Integer warningTime;

    /**
     * Sets anonymization.
     * <p>
     * Field description:
     * If set, same numeric sender (defined in _from_) is used for both calls (towards _destinationA_ and _destinationB_). If not set, _destinationA_ will be shown to _destinationB_. If _fromB_ is set up, _anonymization_ will not be applied; _from_ will be shown to _destinationA_ and _fromB_ will be shown to _destinationB_. Default value is &#x60;false&#x60;.
     *
     * @param anonymization
     * @return This {@link CallsClickToCallMessage instance}.
     */
    public CallsClickToCallMessage anonymization(Boolean anonymization) {
        this.anonymization = anonymization;
        return this;
    }

    /**
     * Returns anonymization.
     * <p>
     * Field description:
     * If set, same numeric sender (defined in _from_) is used for both calls (towards _destinationA_ and _destinationB_). If not set, _destinationA_ will be shown to _destinationB_. If _fromB_ is set up, _anonymization_ will not be applied; _from_ will be shown to _destinationA_ and _fromB_ will be shown to _destinationB_. Default value is &#x60;false&#x60;.
     *
     * @return anonymization
     */
    @JsonProperty("anonymization")
    public Boolean getAnonymization() {
        return anonymization;
    }

    /**
     * Sets anonymization.
     * <p>
     * Field description:
     * If set, same numeric sender (defined in _from_) is used for both calls (towards _destinationA_ and _destinationB_). If not set, _destinationA_ will be shown to _destinationB_. If _fromB_ is set up, _anonymization_ will not be applied; _from_ will be shown to _destinationA_ and _fromB_ will be shown to _destinationB_. Default value is &#x60;false&#x60;.
     *
     * @param anonymization
     */
    @JsonProperty("anonymization")
    public void setAnonymization(Boolean anonymization) {
        this.anonymization = anonymization;
    }

    /**
     * Sets audioFileUrl.
     * <p>
     * Field description:
     * An audio file can be delivered as a voice message to the recipients. An audio file must be uploaded online, so that the existing URL can be available for file download. Size of the audio file must be below 4 MB. Supported formats of the provided file are aac, aiff, m4a, mp2, mp3, mp4 (audio only), ogg, wav and wma. Our platform needs to have permission to make GET and HEAD HTTP requests on the provided URL. Standard http ports (like 80, 8080, etc.) are advised.
     *
     * @param audioFileUrl
     * @return This {@link CallsClickToCallMessage instance}.
     */
    public CallsClickToCallMessage audioFileUrl(String audioFileUrl) {
        this.audioFileUrl = audioFileUrl;
        return this;
    }

    /**
     * Returns audioFileUrl.
     * <p>
     * Field description:
     * An audio file can be delivered as a voice message to the recipients. An audio file must be uploaded online, so that the existing URL can be available for file download. Size of the audio file must be below 4 MB. Supported formats of the provided file are aac, aiff, m4a, mp2, mp3, mp4 (audio only), ogg, wav and wma. Our platform needs to have permission to make GET and HEAD HTTP requests on the provided URL. Standard http ports (like 80, 8080, etc.) are advised.
     *
     * @return audioFileUrl
     */
    @JsonProperty("audioFileUrl")
    public String getAudioFileUrl() {
        return audioFileUrl;
    }

    /**
     * Sets audioFileUrl.
     * <p>
     * Field description:
     * An audio file can be delivered as a voice message to the recipients. An audio file must be uploaded online, so that the existing URL can be available for file download. Size of the audio file must be below 4 MB. Supported formats of the provided file are aac, aiff, m4a, mp2, mp3, mp4 (audio only), ogg, wav and wma. Our platform needs to have permission to make GET and HEAD HTTP requests on the provided URL. Standard http ports (like 80, 8080, etc.) are advised.
     *
     * @param audioFileUrl
     */
    @JsonProperty("audioFileUrl")
    public void setAudioFileUrl(String audioFileUrl) {
        this.audioFileUrl = audioFileUrl;
    }

    /**
     * Sets deliveryTimeWindow.
     *
     * @param deliveryTimeWindow
     * @return This {@link CallsClickToCallMessage instance}.
     */
    public CallsClickToCallMessage deliveryTimeWindow(DeliveryTimeWindow deliveryTimeWindow) {
        this.deliveryTimeWindow = deliveryTimeWindow;
        return this;
    }

    /**
     * Returns deliveryTimeWindow.
     *
     * @return deliveryTimeWindow
     */
    @JsonProperty("deliveryTimeWindow")
    public DeliveryTimeWindow getDeliveryTimeWindow() {
        return deliveryTimeWindow;
    }

    /**
     * Sets deliveryTimeWindow.
     *
     * @param deliveryTimeWindow
     */
    @JsonProperty("deliveryTimeWindow")
    public void setDeliveryTimeWindow(DeliveryTimeWindow deliveryTimeWindow) {
        this.deliveryTimeWindow = deliveryTimeWindow;
    }

    /**
     * Sets destinationA.
     * <p>
     * Field description:
     * Original destination address. Address must be in the international format (Example: &#x60;41793026727&#x60;).
     * <p>
     * The field is required.
     *
     * @param destinationA
     * @return This {@link CallsClickToCallMessage instance}.
     */
    public CallsClickToCallMessage destinationA(String destinationA) {
        this.destinationA = destinationA;
        return this;
    }

    /**
     * Returns destinationA.
     * <p>
     * Field description:
     * Original destination address. Address must be in the international format (Example: &#x60;41793026727&#x60;).
     * <p>
     * The field is required.
     *
     * @return destinationA
     */
    @JsonProperty("destinationA")
    public String getDestinationA() {
        return destinationA;
    }

    /**
     * Sets destinationA.
     * <p>
     * Field description:
     * Original destination address. Address must be in the international format (Example: &#x60;41793026727&#x60;).
     * <p>
     * The field is required.
     *
     * @param destinationA
     */
    @JsonProperty("destinationA")
    public void setDestinationA(String destinationA) {
        this.destinationA = destinationA;
    }

    /**
     * Sets destinationB.
     * <p>
     * Field description:
     * Destination address to which the call will be transferred after successful answering. Address must be in the international format (Example: &#x60;41793026727&#x60;).
     * <p>
     * The field is required.
     *
     * @param destinationB
     * @return This {@link CallsClickToCallMessage instance}.
     */
    public CallsClickToCallMessage destinationB(String destinationB) {
        this.destinationB = destinationB;
        return this;
    }

    /**
     * Returns destinationB.
     * <p>
     * Field description:
     * Destination address to which the call will be transferred after successful answering. Address must be in the international format (Example: &#x60;41793026727&#x60;).
     * <p>
     * The field is required.
     *
     * @return destinationB
     */
    @JsonProperty("destinationB")
    public String getDestinationB() {
        return destinationB;
    }

    /**
     * Sets destinationB.
     * <p>
     * Field description:
     * Destination address to which the call will be transferred after successful answering. Address must be in the international format (Example: &#x60;41793026727&#x60;).
     * <p>
     * The field is required.
     *
     * @param destinationB
     */
    @JsonProperty("destinationB")
    public void setDestinationB(String destinationB) {
        this.destinationB = destinationB;
    }

    /**
     * Sets from.
     * <p>
     * Field description:
     * Numeric sender ID in E.164 format. Will be shown to _destinationA_.
     * <p>
     * The field is required.
     *
     * @param from
     * @return This {@link CallsClickToCallMessage instance}.
     */
    public CallsClickToCallMessage from(String from) {
        this.from = from;
        return this;
    }

    /**
     * Returns from.
     * <p>
     * Field description:
     * Numeric sender ID in E.164 format. Will be shown to _destinationA_.
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
     * Numeric sender ID in E.164 format. Will be shown to _destinationA_.
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
     * Sets fromB.
     * <p>
     * Field description:
     * Numeric sender ID in E.164 format. If set, it will be shown to _destinationB_. If not set, _from_ or _destinationA_ will be shown to _destinationB_, depending on the value of _anonymization_.
     *
     * @param fromB
     * @return This {@link CallsClickToCallMessage instance}.
     */
    public CallsClickToCallMessage fromB(String fromB) {
        this.fromB = fromB;
        return this;
    }

    /**
     * Returns fromB.
     * <p>
     * Field description:
     * Numeric sender ID in E.164 format. If set, it will be shown to _destinationB_. If not set, _from_ or _destinationA_ will be shown to _destinationB_, depending on the value of _anonymization_.
     *
     * @return fromB
     */
    @JsonProperty("fromB")
    public String getFromB() {
        return fromB;
    }

    /**
     * Sets fromB.
     * <p>
     * Field description:
     * Numeric sender ID in E.164 format. If set, it will be shown to _destinationB_. If not set, _from_ or _destinationA_ will be shown to _destinationB_, depending on the value of _anonymization_.
     *
     * @param fromB
     */
    @JsonProperty("fromB")
    public void setFromB(String fromB) {
        this.fromB = fromB;
    }

    /**
     * Sets language.
     * <p>
     * Field description:
     * If the message is in text format, language in which the message is written must be defined for correct pronunciation. In the Languages section, you can find the list of languages that we support. If not set, default language is &#x60;English [en].&#x60;
     *
     * @param language
     * @return This {@link CallsClickToCallMessage instance}.
     */
    public CallsClickToCallMessage language(String language) {
        this.language = language;
        return this;
    }

    /**
     * Returns language.
     * <p>
     * Field description:
     * If the message is in text format, language in which the message is written must be defined for correct pronunciation. In the Languages section, you can find the list of languages that we support. If not set, default language is &#x60;English [en].&#x60;
     *
     * @return language
     */
    @JsonProperty("language")
    public String getLanguage() {
        return language;
    }

    /**
     * Sets language.
     * <p>
     * Field description:
     * If the message is in text format, language in which the message is written must be defined for correct pronunciation. In the Languages section, you can find the list of languages that we support. If not set, default language is &#x60;English [en].&#x60;
     *
     * @param language
     */
    @JsonProperty("language")
    public void setLanguage(String language) {
        this.language = language;
    }

    /**
     * Sets machineDetection.
     * <p>
     * Field description:
     * Used for enabling detection of answering machine after the call has been answered on &#x60;destinationA&#x60;. It can be set to &#x60;hangup&#x60; which means if a machine is detected, the call is hung up. If &#x60;machineDetection&#x60; is used, there is a minimum of 4 seconds detection time, which can result in delay of playing the message. Answering machine detection is additionally charged. For more information please contact your account manager.
     *
     * @param machineDetection
     * @return This {@link CallsClickToCallMessage instance}.
     */
    public CallsClickToCallMessage machineDetection(String machineDetection) {
        this.machineDetection = machineDetection;
        return this;
    }

    /**
     * Returns machineDetection.
     * <p>
     * Field description:
     * Used for enabling detection of answering machine after the call has been answered on &#x60;destinationA&#x60;. It can be set to &#x60;hangup&#x60; which means if a machine is detected, the call is hung up. If &#x60;machineDetection&#x60; is used, there is a minimum of 4 seconds detection time, which can result in delay of playing the message. Answering machine detection is additionally charged. For more information please contact your account manager.
     *
     * @return machineDetection
     */
    @JsonProperty("machineDetection")
    public String getMachineDetection() {
        return machineDetection;
    }

    /**
     * Sets machineDetection.
     * <p>
     * Field description:
     * Used for enabling detection of answering machine after the call has been answered on &#x60;destinationA&#x60;. It can be set to &#x60;hangup&#x60; which means if a machine is detected, the call is hung up. If &#x60;machineDetection&#x60; is used, there is a minimum of 4 seconds detection time, which can result in delay of playing the message. Answering machine detection is additionally charged. For more information please contact your account manager.
     *
     * @param machineDetection
     */
    @JsonProperty("machineDetection")
    public void setMachineDetection(String machineDetection) {
        this.machineDetection = machineDetection;
    }

    /**
     * Sets maxDuration.
     * <p>
     * Field description:
     * Maximum duration of transferred call in seconds. If set, when _maxDuration_ is reached call will be terminated.
     *
     * @param maxDuration
     * @return This {@link CallsClickToCallMessage instance}.
     */
    public CallsClickToCallMessage maxDuration(Integer maxDuration) {
        this.maxDuration = maxDuration;
        return this;
    }

    /**
     * Returns maxDuration.
     * <p>
     * Field description:
     * Maximum duration of transferred call in seconds. If set, when _maxDuration_ is reached call will be terminated.
     *
     * @return maxDuration
     */
    @JsonProperty("maxDuration")
    public Integer getMaxDuration() {
        return maxDuration;
    }

    /**
     * Sets maxDuration.
     * <p>
     * Field description:
     * Maximum duration of transferred call in seconds. If set, when _maxDuration_ is reached call will be terminated.
     *
     * @param maxDuration
     */
    @JsonProperty("maxDuration")
    public void setMaxDuration(Integer maxDuration) {
        this.maxDuration = maxDuration;
    }

    /**
     * Sets messageId.
     * <p>
     * Field description:
     * The ID that uniquely identifies the message sent. It can be defined by you or Infobip will generate unique message ID for this specific call. The field is not mandatory.
     *
     * @param messageId
     * @return This {@link CallsClickToCallMessage instance}.
     */
    public CallsClickToCallMessage messageId(String messageId) {
        this.messageId = messageId;
        return this;
    }

    /**
     * Returns messageId.
     * <p>
     * Field description:
     * The ID that uniquely identifies the message sent. It can be defined by you or Infobip will generate unique message ID for this specific call. The field is not mandatory.
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
     * The ID that uniquely identifies the message sent. It can be defined by you or Infobip will generate unique message ID for this specific call. The field is not mandatory.
     *
     * @param messageId
     */
    @JsonProperty("messageId")
    public void setMessageId(String messageId) {
        this.messageId = messageId;
    }

    /**
     * Sets notifyContentType.
     * <p>
     * Field description:
     * Preferred Delivery report content type. Can be &#x60;application/json&#x60; or &#x60;application/xml&#x60;.
     *
     * @param notifyContentType
     * @return This {@link CallsClickToCallMessage instance}.
     */
    public CallsClickToCallMessage notifyContentType(String notifyContentType) {
        this.notifyContentType = notifyContentType;
        return this;
    }

    /**
     * Returns notifyContentType.
     * <p>
     * Field description:
     * Preferred Delivery report content type. Can be &#x60;application/json&#x60; or &#x60;application/xml&#x60;.
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
     * Preferred Delivery report content type. Can be &#x60;application/json&#x60; or &#x60;application/xml&#x60;.
     *
     * @param notifyContentType
     */
    @JsonProperty("notifyContentType")
    public void setNotifyContentType(String notifyContentType) {
        this.notifyContentType = notifyContentType;
    }

    /**
     * Sets notifyContentVersion.
     * <p>
     * Field description:
     * Specifies the version of the report model to be sent. Can be &#x60;1&#x60; ([deprecated version 1](#programmable-communications/voice/receive-voice-delivery-reports-deprecated)) or &#x60;2&#x60; ([current version 2](#programmable-communications/voice/receive-voice-delivery-reports)). The default is version 2.
     *
     * @param notifyContentVersion
     * @return This {@link CallsClickToCallMessage instance}.
     */
    public CallsClickToCallMessage notifyContentVersion(Integer notifyContentVersion) {
        this.notifyContentVersion = notifyContentVersion;
        return this;
    }

    /**
     * Returns notifyContentVersion.
     * <p>
     * Field description:
     * Specifies the version of the report model to be sent. Can be &#x60;1&#x60; ([deprecated version 1](#programmable-communications/voice/receive-voice-delivery-reports-deprecated)) or &#x60;2&#x60; ([current version 2](#programmable-communications/voice/receive-voice-delivery-reports)). The default is version 2.
     *
     * @return notifyContentVersion
     */
    @JsonProperty("notifyContentVersion")
    public Integer getNotifyContentVersion() {
        return notifyContentVersion;
    }

    /**
     * Sets notifyContentVersion.
     * <p>
     * Field description:
     * Specifies the version of the report model to be sent. Can be &#x60;1&#x60; ([deprecated version 1](#programmable-communications/voice/receive-voice-delivery-reports-deprecated)) or &#x60;2&#x60; ([current version 2](#programmable-communications/voice/receive-voice-delivery-reports)). The default is version 2.
     *
     * @param notifyContentVersion
     */
    @JsonProperty("notifyContentVersion")
    public void setNotifyContentVersion(Integer notifyContentVersion) {
        this.notifyContentVersion = notifyContentVersion;
    }

    /**
     * Sets notifyUrl.
     * <p>
     * Field description:
     * The URL on your callback server on which the Delivery report will be sent.
     *
     * @param notifyUrl
     * @return This {@link CallsClickToCallMessage instance}.
     */
    public CallsClickToCallMessage notifyUrl(String notifyUrl) {
        this.notifyUrl = notifyUrl;
        return this;
    }

    /**
     * Returns notifyUrl.
     * <p>
     * Field description:
     * The URL on your callback server on which the Delivery report will be sent.
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
     * The URL on your callback server on which the Delivery report will be sent.
     *
     * @param notifyUrl
     */
    @JsonProperty("notifyUrl")
    public void setNotifyUrl(String notifyUrl) {
        this.notifyUrl = notifyUrl;
    }

    /**
     * Sets retry.
     *
     * @param retry
     * @return This {@link CallsClickToCallMessage instance}.
     */
    public CallsClickToCallMessage retry(CallsRetry retry) {
        this.retry = retry;
        return this;
    }

    /**
     * Returns retry.
     *
     * @return retry
     */
    @JsonProperty("retry")
    public CallsRetry getRetry() {
        return retry;
    }

    /**
     * Sets retry.
     *
     * @param retry
     */
    @JsonProperty("retry")
    public void setRetry(CallsRetry retry) {
        this.retry = retry;
    }

    /**
     * Sets text.
     * <p>
     * Field description:
     * Text of the message that will be played before call transfer.
     *
     * @param text
     * @return This {@link CallsClickToCallMessage instance}.
     */
    public CallsClickToCallMessage text(String text) {
        this.text = text;
        return this;
    }

    /**
     * Returns text.
     * <p>
     * Field description:
     * Text of the message that will be played before call transfer.
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
     * Text of the message that will be played before call transfer.
     *
     * @param text
     */
    @JsonProperty("text")
    public void setText(String text) {
        this.text = text;
    }

    /**
     * Sets voice.
     *
     * @param voice
     * @return This {@link CallsClickToCallMessage instance}.
     */
    public CallsClickToCallMessage voice(CallsVoice voice) {
        this.voice = voice;
        return this;
    }

    /**
     * Returns voice.
     *
     * @return voice
     */
    @JsonProperty("voice")
    public CallsVoice getVoice() {
        return voice;
    }

    /**
     * Sets voice.
     *
     * @param voice
     */
    @JsonProperty("voice")
    public void setVoice(CallsVoice voice) {
        this.voice = voice;
    }

    /**
     * Sets warningTime.
     * <p>
     * Field description:
     * Time before the end of the transferred call, in seconds, when warning beep sound will be played. For example, if _maxDuration_ is set to &#x60;60&#x60; and warningTime is set to &#x60;5&#x60;, this means that warning beep will be played on &#x60;55.&#x60; second of the transferred call, or &#x60;5&#x60; seconds before it&#39;s end.
     *
     * @param warningTime
     * @return This {@link CallsClickToCallMessage instance}.
     */
    public CallsClickToCallMessage warningTime(Integer warningTime) {
        this.warningTime = warningTime;
        return this;
    }

    /**
     * Returns warningTime.
     * <p>
     * Field description:
     * Time before the end of the transferred call, in seconds, when warning beep sound will be played. For example, if _maxDuration_ is set to &#x60;60&#x60; and warningTime is set to &#x60;5&#x60;, this means that warning beep will be played on &#x60;55.&#x60; second of the transferred call, or &#x60;5&#x60; seconds before it&#39;s end.
     *
     * @return warningTime
     */
    @JsonProperty("warningTime")
    public Integer getWarningTime() {
        return warningTime;
    }

    /**
     * Sets warningTime.
     * <p>
     * Field description:
     * Time before the end of the transferred call, in seconds, when warning beep sound will be played. For example, if _maxDuration_ is set to &#x60;60&#x60; and warningTime is set to &#x60;5&#x60;, this means that warning beep will be played on &#x60;55.&#x60; second of the transferred call, or &#x60;5&#x60; seconds before it&#39;s end.
     *
     * @param warningTime
     */
    @JsonProperty("warningTime")
    public void setWarningTime(Integer warningTime) {
        this.warningTime = warningTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CallsClickToCallMessage callsClickToCallMessage = (CallsClickToCallMessage) o;
        return Objects.equals(this.anonymization, callsClickToCallMessage.anonymization)
                && Objects.equals(this.audioFileUrl, callsClickToCallMessage.audioFileUrl)
                && Objects.equals(this.deliveryTimeWindow, callsClickToCallMessage.deliveryTimeWindow)
                && Objects.equals(this.destinationA, callsClickToCallMessage.destinationA)
                && Objects.equals(this.destinationB, callsClickToCallMessage.destinationB)
                && Objects.equals(this.from, callsClickToCallMessage.from)
                && Objects.equals(this.fromB, callsClickToCallMessage.fromB)
                && Objects.equals(this.language, callsClickToCallMessage.language)
                && Objects.equals(this.machineDetection, callsClickToCallMessage.machineDetection)
                && Objects.equals(this.maxDuration, callsClickToCallMessage.maxDuration)
                && Objects.equals(this.messageId, callsClickToCallMessage.messageId)
                && Objects.equals(this.notifyContentType, callsClickToCallMessage.notifyContentType)
                && Objects.equals(this.notifyContentVersion, callsClickToCallMessage.notifyContentVersion)
                && Objects.equals(this.notifyUrl, callsClickToCallMessage.notifyUrl)
                && Objects.equals(this.retry, callsClickToCallMessage.retry)
                && Objects.equals(this.text, callsClickToCallMessage.text)
                && Objects.equals(this.voice, callsClickToCallMessage.voice)
                && Objects.equals(this.warningTime, callsClickToCallMessage.warningTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                anonymization,
                audioFileUrl,
                deliveryTimeWindow,
                destinationA,
                destinationB,
                from,
                fromB,
                language,
                machineDetection,
                maxDuration,
                messageId,
                notifyContentType,
                notifyContentVersion,
                notifyUrl,
                retry,
                text,
                voice,
                warningTime);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class CallsClickToCallMessage {")
                .append(newLine)
                .append("    anonymization: ")
                .append(toIndentedString(anonymization))
                .append(newLine)
                .append("    audioFileUrl: ")
                .append(toIndentedString(audioFileUrl))
                .append(newLine)
                .append("    deliveryTimeWindow: ")
                .append(toIndentedString(deliveryTimeWindow))
                .append(newLine)
                .append("    destinationA: ")
                .append(toIndentedString(destinationA))
                .append(newLine)
                .append("    destinationB: ")
                .append(toIndentedString(destinationB))
                .append(newLine)
                .append("    from: ")
                .append(toIndentedString(from))
                .append(newLine)
                .append("    fromB: ")
                .append(toIndentedString(fromB))
                .append(newLine)
                .append("    language: ")
                .append(toIndentedString(language))
                .append(newLine)
                .append("    machineDetection: ")
                .append(toIndentedString(machineDetection))
                .append(newLine)
                .append("    maxDuration: ")
                .append(toIndentedString(maxDuration))
                .append(newLine)
                .append("    messageId: ")
                .append(toIndentedString(messageId))
                .append(newLine)
                .append("    notifyContentType: ")
                .append(toIndentedString(notifyContentType))
                .append(newLine)
                .append("    notifyContentVersion: ")
                .append(toIndentedString(notifyContentVersion))
                .append(newLine)
                .append("    notifyUrl: ")
                .append(toIndentedString(notifyUrl))
                .append(newLine)
                .append("    retry: ")
                .append(toIndentedString(retry))
                .append(newLine)
                .append("    text: ")
                .append(toIndentedString(text))
                .append(newLine)
                .append("    voice: ")
                .append(toIndentedString(voice))
                .append(newLine)
                .append("    warningTime: ")
                .append(toIndentedString(warningTime))
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
