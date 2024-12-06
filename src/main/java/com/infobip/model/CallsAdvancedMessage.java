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
 * Array of messages to be sent, one object per every message
 */
public class CallsAdvancedMessage {

    private String audioFileUrl;

    private Integer callTimeout;

    private List<CallTransfer> callTransfers = null;

    private String callbackData;

    private DeliveryTimeWindow deliveryTimeWindow;

    private List<CallsDestination> destinations = new ArrayList<>();

    private Integer dtmfTimeout;

    private String from;

    private String language;

    private String machineDetection;

    private Integer maxDtmf;

    private String notifyContentType;

    private Integer notifyContentVersion;

    private String notifyUrl;

    private Integer pause;

    private String repeatDtmf;

    private CallsRetry retry;

    private Integer ringTimeout;

    private OffsetDateTime sendAt;

    private CallsSendingSpeed sendingSpeed;

    private Double speechRate;

    private String text;

    private Integer validityPeriod;

    private CallsVoice voice;

    /**
     * Sets audioFileUrl.
     * <p>
     * Field description:
     * An audio file can be delivered as a voice message to the recipients. An audio file must be uploaded online, so that the existing URL can be available for file download. Size of the audio file must be below 4 MB. Supported formats of the provided file are aac, aiff, m4a, mp2, mp3, mp4 (audio only), ogg, wav and wma. Our platform needs to have permission to make GET and HEAD HTTP requests on the provided URL. Standard http ports (like 80, 8080, etc.) are advised.
     *
     * @param audioFileUrl
     * @return This {@link CallsAdvancedMessage instance}.
     */
    public CallsAdvancedMessage audioFileUrl(String audioFileUrl) {
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
     * Sets callTimeout.
     * <p>
     * Field description:
     * Maximum possible duration of the call to be set, shown in seconds.
     *
     * @param callTimeout
     * @return This {@link CallsAdvancedMessage instance}.
     */
    public CallsAdvancedMessage callTimeout(Integer callTimeout) {
        this.callTimeout = callTimeout;
        return this;
    }

    /**
     * Returns callTimeout.
     * <p>
     * Field description:
     * Maximum possible duration of the call to be set, shown in seconds.
     *
     * @return callTimeout
     */
    @JsonProperty("callTimeout")
    public Integer getCallTimeout() {
        return callTimeout;
    }

    /**
     * Sets callTimeout.
     * <p>
     * Field description:
     * Maximum possible duration of the call to be set, shown in seconds.
     *
     * @param callTimeout
     */
    @JsonProperty("callTimeout")
    public void setCallTimeout(Integer callTimeout) {
        this.callTimeout = callTimeout;
    }

    /**
     * Sets callTransfers.
     * <p>
     * Field description:
     * Call transfers object enables transferring the ongoing call to another recipient(s) and establish a communication between your original recipient and additional one.
     *
     * @param callTransfers
     * @return This {@link CallsAdvancedMessage instance}.
     */
    public CallsAdvancedMessage callTransfers(List<CallTransfer> callTransfers) {
        this.callTransfers = callTransfers;
        return this;
    }

    /**
     * Adds and item into callTransfers.
     * <p>
     * Field description:
     * Call transfers object enables transferring the ongoing call to another recipient(s) and establish a communication between your original recipient and additional one.
     *
     * @param callTransfersItem The item to be added to the list.
     * @return This {@link CallsAdvancedMessage instance}.
     */
    public CallsAdvancedMessage addCallTransfersItem(CallTransfer callTransfersItem) {
        if (this.callTransfers == null) {
            this.callTransfers = new ArrayList<>();
        }
        this.callTransfers.add(callTransfersItem);
        return this;
    }

    /**
     * Returns callTransfers.
     * <p>
     * Field description:
     * Call transfers object enables transferring the ongoing call to another recipient(s) and establish a communication between your original recipient and additional one.
     *
     * @return callTransfers
     */
    @JsonProperty("callTransfers")
    public List<CallTransfer> getCallTransfers() {
        return callTransfers;
    }

    /**
     * Sets callTransfers.
     * <p>
     * Field description:
     * Call transfers object enables transferring the ongoing call to another recipient(s) and establish a communication between your original recipient and additional one.
     *
     * @param callTransfers
     */
    @JsonProperty("callTransfers")
    public void setCallTransfers(List<CallTransfer> callTransfers) {
        this.callTransfers = callTransfers;
    }

    /**
     * Sets callbackData.
     * <p>
     * Field description:
     * Additional client&#39;s data that will be sent on the notifyUrl. The maximum value is 700 characters. Example:  &#x60;Text containing some additional data needed in Delivery Report&#x60;.
     *
     * @param callbackData
     * @return This {@link CallsAdvancedMessage instance}.
     */
    public CallsAdvancedMessage callbackData(String callbackData) {
        this.callbackData = callbackData;
        return this;
    }

    /**
     * Returns callbackData.
     * <p>
     * Field description:
     * Additional client&#39;s data that will be sent on the notifyUrl. The maximum value is 700 characters. Example:  &#x60;Text containing some additional data needed in Delivery Report&#x60;.
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
     * Additional client&#39;s data that will be sent on the notifyUrl. The maximum value is 700 characters. Example:  &#x60;Text containing some additional data needed in Delivery Report&#x60;.
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
     * @return This {@link CallsAdvancedMessage instance}.
     */
    public CallsAdvancedMessage deliveryTimeWindow(DeliveryTimeWindow deliveryTimeWindow) {
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
     * Sets destinations.
     * <p>
     * Field description:
     * Message destination addresses. Destination address must be in the E.164 standard format (Example: 41793026727). Maximum number of destination addresses is 20k.
     * <p>
     * The field is required.
     *
     * @param destinations
     * @return This {@link CallsAdvancedMessage instance}.
     */
    public CallsAdvancedMessage destinations(List<CallsDestination> destinations) {
        this.destinations = destinations;
        return this;
    }

    /**
     * Adds and item into destinations.
     * <p>
     * Field description:
     * Message destination addresses. Destination address must be in the E.164 standard format (Example: 41793026727). Maximum number of destination addresses is 20k.
     * <p>
     * The field is required.
     *
     * @param destinationsItem The item to be added to the list.
     * @return This {@link CallsAdvancedMessage instance}.
     */
    public CallsAdvancedMessage addDestinationsItem(CallsDestination destinationsItem) {
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
     * Message destination addresses. Destination address must be in the E.164 standard format (Example: 41793026727). Maximum number of destination addresses is 20k.
     * <p>
     * The field is required.
     *
     * @return destinations
     */
    @JsonProperty("destinations")
    public List<CallsDestination> getDestinations() {
        return destinations;
    }

    /**
     * Sets destinations.
     * <p>
     * Field description:
     * Message destination addresses. Destination address must be in the E.164 standard format (Example: 41793026727). Maximum number of destination addresses is 20k.
     * <p>
     * The field is required.
     *
     * @param destinations
     */
    @JsonProperty("destinations")
    public void setDestinations(List<CallsDestination> destinations) {
        this.destinations = destinations;
    }

    /**
     * Sets dtmfTimeout.
     * <p>
     * Field description:
     * The waiting period for end user to enter DTMF digits. Default value is &#x60;10&#x60; seconds.
     *
     * @param dtmfTimeout
     * @return This {@link CallsAdvancedMessage instance}.
     */
    public CallsAdvancedMessage dtmfTimeout(Integer dtmfTimeout) {
        this.dtmfTimeout = dtmfTimeout;
        return this;
    }

    /**
     * Returns dtmfTimeout.
     * <p>
     * Field description:
     * The waiting period for end user to enter DTMF digits. Default value is &#x60;10&#x60; seconds.
     *
     * @return dtmfTimeout
     */
    @JsonProperty("dtmfTimeout")
    public Integer getDtmfTimeout() {
        return dtmfTimeout;
    }

    /**
     * Sets dtmfTimeout.
     * <p>
     * Field description:
     * The waiting period for end user to enter DTMF digits. Default value is &#x60;10&#x60; seconds.
     *
     * @param dtmfTimeout
     */
    @JsonProperty("dtmfTimeout")
    public void setDtmfTimeout(Integer dtmfTimeout) {
        this.dtmfTimeout = dtmfTimeout;
    }

    /**
     * Sets from.
     * <p>
     * Field description:
     * Numeric sender ID in E.164 standard format (Example: 41793026727). This is caller ID that will be presented to the end user where applicable.
     *
     * @param from
     * @return This {@link CallsAdvancedMessage instance}.
     */
    public CallsAdvancedMessage from(String from) {
        this.from = from;
        return this;
    }

    /**
     * Returns from.
     * <p>
     * Field description:
     * Numeric sender ID in E.164 standard format (Example: 41793026727). This is caller ID that will be presented to the end user where applicable.
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
     * Numeric sender ID in E.164 standard format (Example: 41793026727). This is caller ID that will be presented to the end user where applicable.
     *
     * @param from
     */
    @JsonProperty("from")
    public void setFrom(String from) {
        this.from = from;
    }

    /**
     * Sets language.
     * <p>
     * Field description:
     * If the message is in text format, the language in which the message is written must be defined for correct pronunciation. More about Text-to-speech functionality and supported TTS languages can be found [here](https://www.infobip.com/docs/voice-and-video/outbound-calls#text-to-speech-voice-over-broadcast). If not set, default language is &#x60;English [en]&#x60;. If voice is not set, then default voice for that specific language is used. In the case of English language, the voice is &#x60;[Joanna]&#x60;.
     *
     * @param language
     * @return This {@link CallsAdvancedMessage instance}.
     */
    public CallsAdvancedMessage language(String language) {
        this.language = language;
        return this;
    }

    /**
     * Returns language.
     * <p>
     * Field description:
     * If the message is in text format, the language in which the message is written must be defined for correct pronunciation. More about Text-to-speech functionality and supported TTS languages can be found [here](https://www.infobip.com/docs/voice-and-video/outbound-calls#text-to-speech-voice-over-broadcast). If not set, default language is &#x60;English [en]&#x60;. If voice is not set, then default voice for that specific language is used. In the case of English language, the voice is &#x60;[Joanna]&#x60;.
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
     * If the message is in text format, the language in which the message is written must be defined for correct pronunciation. More about Text-to-speech functionality and supported TTS languages can be found [here](https://www.infobip.com/docs/voice-and-video/outbound-calls#text-to-speech-voice-over-broadcast). If not set, default language is &#x60;English [en]&#x60;. If voice is not set, then default voice for that specific language is used. In the case of English language, the voice is &#x60;[Joanna]&#x60;.
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
     * Used for enabling detection of answering machine after the call has been answered. It can be set to &#x60;hangup&#x60; or &#x60;continue&#x60;. When set to &#x60;hangup&#x60;, if a machine is detected call will hang up. When set to &#x60;continue&#x60;, if a machine is detected, then voice message starts playing into voice mail after the answering message is finished with its greeting. If machineDetection is used, there is a minimum of 4 seconds detection time, which can result in delay of playing the message. Answering machine detection is additionally charged. For more information please contact your account manager and check documentation on Answering Machine Detection.
     *
     * @param machineDetection
     * @return This {@link CallsAdvancedMessage instance}.
     */
    public CallsAdvancedMessage machineDetection(String machineDetection) {
        this.machineDetection = machineDetection;
        return this;
    }

    /**
     * Returns machineDetection.
     * <p>
     * Field description:
     * Used for enabling detection of answering machine after the call has been answered. It can be set to &#x60;hangup&#x60; or &#x60;continue&#x60;. When set to &#x60;hangup&#x60;, if a machine is detected call will hang up. When set to &#x60;continue&#x60;, if a machine is detected, then voice message starts playing into voice mail after the answering message is finished with its greeting. If machineDetection is used, there is a minimum of 4 seconds detection time, which can result in delay of playing the message. Answering machine detection is additionally charged. For more information please contact your account manager and check documentation on Answering Machine Detection.
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
     * Used for enabling detection of answering machine after the call has been answered. It can be set to &#x60;hangup&#x60; or &#x60;continue&#x60;. When set to &#x60;hangup&#x60;, if a machine is detected call will hang up. When set to &#x60;continue&#x60;, if a machine is detected, then voice message starts playing into voice mail after the answering message is finished with its greeting. If machineDetection is used, there is a minimum of 4 seconds detection time, which can result in delay of playing the message. Answering machine detection is additionally charged. For more information please contact your account manager and check documentation on Answering Machine Detection.
     *
     * @param machineDetection
     */
    @JsonProperty("machineDetection")
    public void setMachineDetection(String machineDetection) {
        this.machineDetection = machineDetection;
    }

    /**
     * Sets maxDtmf.
     * <p>
     * Field description:
     * Defines the maximum number of DTMF codes entered by end user that would be collected.
     *
     * @param maxDtmf
     * @return This {@link CallsAdvancedMessage instance}.
     */
    public CallsAdvancedMessage maxDtmf(Integer maxDtmf) {
        this.maxDtmf = maxDtmf;
        return this;
    }

    /**
     * Returns maxDtmf.
     * <p>
     * Field description:
     * Defines the maximum number of DTMF codes entered by end user that would be collected.
     *
     * @return maxDtmf
     */
    @JsonProperty("maxDtmf")
    public Integer getMaxDtmf() {
        return maxDtmf;
    }

    /**
     * Sets maxDtmf.
     * <p>
     * Field description:
     * Defines the maximum number of DTMF codes entered by end user that would be collected.
     *
     * @param maxDtmf
     */
    @JsonProperty("maxDtmf")
    public void setMaxDtmf(Integer maxDtmf) {
        this.maxDtmf = maxDtmf;
    }

    /**
     * Sets notifyContentType.
     * <p>
     * Field description:
     * Preferred Delivery report content type. Can be &#x60;application/json&#x60; or &#x60;application/xml&#x60;. [Read more](https://www.infobip.com/docs/api#channels/voice/get-voice-delivery-reports).
     *
     * @param notifyContentType
     * @return This {@link CallsAdvancedMessage instance}.
     */
    public CallsAdvancedMessage notifyContentType(String notifyContentType) {
        this.notifyContentType = notifyContentType;
        return this;
    }

    /**
     * Returns notifyContentType.
     * <p>
     * Field description:
     * Preferred Delivery report content type. Can be &#x60;application/json&#x60; or &#x60;application/xml&#x60;. [Read more](https://www.infobip.com/docs/api#channels/voice/get-voice-delivery-reports).
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
     * Preferred Delivery report content type. Can be &#x60;application/json&#x60; or &#x60;application/xml&#x60;. [Read more](https://www.infobip.com/docs/api#channels/voice/get-voice-delivery-reports).
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
     * Specifies the version of the Delivery report to be sent. Can be &#x60;1&#x60; ([deprecated version 1](#programmable-communications/voice/receive-voice-delivery-reports-deprecated)) or &#x60;2&#x60; ([current version 2](#programmable-communications/voice/receive-voice-delivery-reports)). The default is version 2. [Read more](https://www.infobip.com/docs/api#channels/voice/get-voice-delivery-reports).
     *
     * @param notifyContentVersion
     * @return This {@link CallsAdvancedMessage instance}.
     */
    public CallsAdvancedMessage notifyContentVersion(Integer notifyContentVersion) {
        this.notifyContentVersion = notifyContentVersion;
        return this;
    }

    /**
     * Returns notifyContentVersion.
     * <p>
     * Field description:
     * Specifies the version of the Delivery report to be sent. Can be &#x60;1&#x60; ([deprecated version 1](#programmable-communications/voice/receive-voice-delivery-reports-deprecated)) or &#x60;2&#x60; ([current version 2](#programmable-communications/voice/receive-voice-delivery-reports)). The default is version 2. [Read more](https://www.infobip.com/docs/api#channels/voice/get-voice-delivery-reports).
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
     * Specifies the version of the Delivery report to be sent. Can be &#x60;1&#x60; ([deprecated version 1](#programmable-communications/voice/receive-voice-delivery-reports-deprecated)) or &#x60;2&#x60; ([current version 2](#programmable-communications/voice/receive-voice-delivery-reports)). The default is version 2. [Read more](https://www.infobip.com/docs/api#channels/voice/get-voice-delivery-reports).
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
     * @return This {@link CallsAdvancedMessage instance}.
     */
    public CallsAdvancedMessage notifyUrl(String notifyUrl) {
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
     * Sets pause.
     * <p>
     * Field description:
     * Period of time in seconds between end user answering the call and message starting to be played. Minimal value is &#x60;0&#x60; and maximum value is 10 seconds. Default value is &#x60;0&#x60;.
     *
     * @param pause
     * @return This {@link CallsAdvancedMessage instance}.
     */
    public CallsAdvancedMessage pause(Integer pause) {
        this.pause = pause;
        return this;
    }

    /**
     * Returns pause.
     * <p>
     * Field description:
     * Period of time in seconds between end user answering the call and message starting to be played. Minimal value is &#x60;0&#x60; and maximum value is 10 seconds. Default value is &#x60;0&#x60;.
     *
     * @return pause
     */
    @JsonProperty("pause")
    public Integer getPause() {
        return pause;
    }

    /**
     * Sets pause.
     * <p>
     * Field description:
     * Period of time in seconds between end user answering the call and message starting to be played. Minimal value is &#x60;0&#x60; and maximum value is 10 seconds. Default value is &#x60;0&#x60;.
     *
     * @param pause
     */
    @JsonProperty("pause")
    public void setPause(Integer pause) {
        this.pause = pause;
    }

    /**
     * Sets repeatDtmf.
     * <p>
     * Field description:
     * Specify DTMF code that is used as an indicator to repeat the voice message to the end user. The # key cannot be collected, as it is reserved for user input termination. Message can be repeated up to 5 times.
     *
     * @param repeatDtmf
     * @return This {@link CallsAdvancedMessage instance}.
     */
    public CallsAdvancedMessage repeatDtmf(String repeatDtmf) {
        this.repeatDtmf = repeatDtmf;
        return this;
    }

    /**
     * Returns repeatDtmf.
     * <p>
     * Field description:
     * Specify DTMF code that is used as an indicator to repeat the voice message to the end user. The # key cannot be collected, as it is reserved for user input termination. Message can be repeated up to 5 times.
     *
     * @return repeatDtmf
     */
    @JsonProperty("repeatDtmf")
    public String getRepeatDtmf() {
        return repeatDtmf;
    }

    /**
     * Sets repeatDtmf.
     * <p>
     * Field description:
     * Specify DTMF code that is used as an indicator to repeat the voice message to the end user. The # key cannot be collected, as it is reserved for user input termination. Message can be repeated up to 5 times.
     *
     * @param repeatDtmf
     */
    @JsonProperty("repeatDtmf")
    public void setRepeatDtmf(String repeatDtmf) {
        this.repeatDtmf = repeatDtmf;
    }

    /**
     * Sets retry.
     *
     * @param retry
     * @return This {@link CallsAdvancedMessage instance}.
     */
    public CallsAdvancedMessage retry(CallsRetry retry) {
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
     * Sets ringTimeout.
     * <p>
     * Field description:
     * Ringing duration, unless there are no operator limitations. Default value is &#x60;45&#x60;. Note: There are no limitations on the Voice platform regarding this value, however, most of the operators have their own ring timeout limitations and it is advisable to keep the ringTimeout value up to &#x60;45&#x60; seconds.
     *
     * @param ringTimeout
     * @return This {@link CallsAdvancedMessage instance}.
     */
    public CallsAdvancedMessage ringTimeout(Integer ringTimeout) {
        this.ringTimeout = ringTimeout;
        return this;
    }

    /**
     * Returns ringTimeout.
     * <p>
     * Field description:
     * Ringing duration, unless there are no operator limitations. Default value is &#x60;45&#x60;. Note: There are no limitations on the Voice platform regarding this value, however, most of the operators have their own ring timeout limitations and it is advisable to keep the ringTimeout value up to &#x60;45&#x60; seconds.
     *
     * @return ringTimeout
     */
    @JsonProperty("ringTimeout")
    public Integer getRingTimeout() {
        return ringTimeout;
    }

    /**
     * Sets ringTimeout.
     * <p>
     * Field description:
     * Ringing duration, unless there are no operator limitations. Default value is &#x60;45&#x60;. Note: There are no limitations on the Voice platform regarding this value, however, most of the operators have their own ring timeout limitations and it is advisable to keep the ringTimeout value up to &#x60;45&#x60; seconds.
     *
     * @param ringTimeout
     */
    @JsonProperty("ringTimeout")
    public void setRingTimeout(Integer ringTimeout) {
        this.ringTimeout = ringTimeout;
    }

    /**
     * Sets sendAt.
     * <p>
     * Field description:
     * Used for scheduled Voice messages (message not to be sent immediately, but at scheduled time).
     *
     * @param sendAt
     * @return This {@link CallsAdvancedMessage instance}.
     */
    public CallsAdvancedMessage sendAt(OffsetDateTime sendAt) {
        this.sendAt = sendAt;
        return this;
    }

    /**
     * Returns sendAt.
     * <p>
     * Field description:
     * Used for scheduled Voice messages (message not to be sent immediately, but at scheduled time).
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
     * Used for scheduled Voice messages (message not to be sent immediately, but at scheduled time).
     *
     * @param sendAt
     */
    @JsonProperty("sendAt")
    public void setSendAt(OffsetDateTime sendAt) {
        this.sendAt = sendAt;
    }

    /**
     * Sets sendingSpeed.
     *
     * @param sendingSpeed
     * @return This {@link CallsAdvancedMessage instance}.
     */
    public CallsAdvancedMessage sendingSpeed(CallsSendingSpeed sendingSpeed) {
        this.sendingSpeed = sendingSpeed;
        return this;
    }

    /**
     * Returns sendingSpeed.
     *
     * @return sendingSpeed
     */
    @JsonProperty("sendingSpeed")
    public CallsSendingSpeed getSendingSpeed() {
        return sendingSpeed;
    }

    /**
     * Sets sendingSpeed.
     *
     * @param sendingSpeed
     */
    @JsonProperty("sendingSpeed")
    public void setSendingSpeed(CallsSendingSpeed sendingSpeed) {
        this.sendingSpeed = sendingSpeed;
    }

    /**
     * Sets speechRate.
     * <p>
     * Field description:
     * The reproduction speed of speech in the resulting message. Effective only when using text. Supported range is from &#x60;0.5&#x60; (slow down speech) to &#x60;2&#x60; (speed up speech). Values less than &#x60;0.5&#x60; will be replaced with &#x60;0.5&#x60;, and values higher than &#x60;2&#x60; will be replaced with &#x60;2&#x60;. Default value is &#x60;1&#x60;.
     *
     * @param speechRate
     * @return This {@link CallsAdvancedMessage instance}.
     */
    public CallsAdvancedMessage speechRate(Double speechRate) {
        this.speechRate = speechRate;
        return this;
    }

    /**
     * Returns speechRate.
     * <p>
     * Field description:
     * The reproduction speed of speech in the resulting message. Effective only when using text. Supported range is from &#x60;0.5&#x60; (slow down speech) to &#x60;2&#x60; (speed up speech). Values less than &#x60;0.5&#x60; will be replaced with &#x60;0.5&#x60;, and values higher than &#x60;2&#x60; will be replaced with &#x60;2&#x60;. Default value is &#x60;1&#x60;.
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
     * The reproduction speed of speech in the resulting message. Effective only when using text. Supported range is from &#x60;0.5&#x60; (slow down speech) to &#x60;2&#x60; (speed up speech). Values less than &#x60;0.5&#x60; will be replaced with &#x60;0.5&#x60;, and values higher than &#x60;2&#x60; will be replaced with &#x60;2&#x60;. Default value is &#x60;1&#x60;.
     *
     * @param speechRate
     */
    @JsonProperty("speechRate")
    public void setSpeechRate(Double speechRate) {
        this.speechRate = speechRate;
    }

    /**
     * Sets text.
     * <p>
     * Field description:
     * Text of the message that will be sent. Message text can be up to 1400 characters long and cannot contain only punctuation. Adding _pauses_ between the words and extending the duration of the voice message is possible by using the comma character &#x60;“,”&#x60;. For example, if you want to have a 3 second pause after each word, then the text parameter should look like this &#x60;“one,,,,,,two,,,,,,three,,,,,,”&#x60;. Each comma creates a pause of 0.5 seconds. SSML (_Speech Synthesis Markup Language_) is supported and can be used to fully customize pronunciation of the provided text.
     *
     * @param text
     * @return This {@link CallsAdvancedMessage instance}.
     */
    public CallsAdvancedMessage text(String text) {
        this.text = text;
        return this;
    }

    /**
     * Returns text.
     * <p>
     * Field description:
     * Text of the message that will be sent. Message text can be up to 1400 characters long and cannot contain only punctuation. Adding _pauses_ between the words and extending the duration of the voice message is possible by using the comma character &#x60;“,”&#x60;. For example, if you want to have a 3 second pause after each word, then the text parameter should look like this &#x60;“one,,,,,,two,,,,,,three,,,,,,”&#x60;. Each comma creates a pause of 0.5 seconds. SSML (_Speech Synthesis Markup Language_) is supported and can be used to fully customize pronunciation of the provided text.
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
     * Text of the message that will be sent. Message text can be up to 1400 characters long and cannot contain only punctuation. Adding _pauses_ between the words and extending the duration of the voice message is possible by using the comma character &#x60;“,”&#x60;. For example, if you want to have a 3 second pause after each word, then the text parameter should look like this &#x60;“one,,,,,,two,,,,,,three,,,,,,”&#x60;. Each comma creates a pause of 0.5 seconds. SSML (_Speech Synthesis Markup Language_) is supported and can be used to fully customize pronunciation of the provided text.
     *
     * @param text
     */
    @JsonProperty("text")
    public void setText(String text) {
        this.text = text;
    }

    /**
     * Sets validityPeriod.
     * <p>
     * Field description:
     * The message validity period shown in minutes. When the period expires, it will not be allowed for the message to be sent. A validity period longer than 48h is not supported (in this case, it will be automatically set to 48h).
     *
     * @param validityPeriod
     * @return This {@link CallsAdvancedMessage instance}.
     */
    public CallsAdvancedMessage validityPeriod(Integer validityPeriod) {
        this.validityPeriod = validityPeriod;
        return this;
    }

    /**
     * Returns validityPeriod.
     * <p>
     * Field description:
     * The message validity period shown in minutes. When the period expires, it will not be allowed for the message to be sent. A validity period longer than 48h is not supported (in this case, it will be automatically set to 48h).
     *
     * @return validityPeriod
     */
    @JsonProperty("validityPeriod")
    public Integer getValidityPeriod() {
        return validityPeriod;
    }

    /**
     * Sets validityPeriod.
     * <p>
     * Field description:
     * The message validity period shown in minutes. When the period expires, it will not be allowed for the message to be sent. A validity period longer than 48h is not supported (in this case, it will be automatically set to 48h).
     *
     * @param validityPeriod
     */
    @JsonProperty("validityPeriod")
    public void setValidityPeriod(Integer validityPeriod) {
        this.validityPeriod = validityPeriod;
    }

    /**
     * Sets voice.
     *
     * @param voice
     * @return This {@link CallsAdvancedMessage instance}.
     */
    public CallsAdvancedMessage voice(CallsVoice voice) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CallsAdvancedMessage callsAdvancedMessage = (CallsAdvancedMessage) o;
        return Objects.equals(this.audioFileUrl, callsAdvancedMessage.audioFileUrl)
                && Objects.equals(this.callTimeout, callsAdvancedMessage.callTimeout)
                && Objects.equals(this.callTransfers, callsAdvancedMessage.callTransfers)
                && Objects.equals(this.callbackData, callsAdvancedMessage.callbackData)
                && Objects.equals(this.deliveryTimeWindow, callsAdvancedMessage.deliveryTimeWindow)
                && Objects.equals(this.destinations, callsAdvancedMessage.destinations)
                && Objects.equals(this.dtmfTimeout, callsAdvancedMessage.dtmfTimeout)
                && Objects.equals(this.from, callsAdvancedMessage.from)
                && Objects.equals(this.language, callsAdvancedMessage.language)
                && Objects.equals(this.machineDetection, callsAdvancedMessage.machineDetection)
                && Objects.equals(this.maxDtmf, callsAdvancedMessage.maxDtmf)
                && Objects.equals(this.notifyContentType, callsAdvancedMessage.notifyContentType)
                && Objects.equals(this.notifyContentVersion, callsAdvancedMessage.notifyContentVersion)
                && Objects.equals(this.notifyUrl, callsAdvancedMessage.notifyUrl)
                && Objects.equals(this.pause, callsAdvancedMessage.pause)
                && Objects.equals(this.repeatDtmf, callsAdvancedMessage.repeatDtmf)
                && Objects.equals(this.retry, callsAdvancedMessage.retry)
                && Objects.equals(this.ringTimeout, callsAdvancedMessage.ringTimeout)
                && Objects.equals(this.sendAt, callsAdvancedMessage.sendAt)
                && Objects.equals(this.sendingSpeed, callsAdvancedMessage.sendingSpeed)
                && Objects.equals(this.speechRate, callsAdvancedMessage.speechRate)
                && Objects.equals(this.text, callsAdvancedMessage.text)
                && Objects.equals(this.validityPeriod, callsAdvancedMessage.validityPeriod)
                && Objects.equals(this.voice, callsAdvancedMessage.voice);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                audioFileUrl,
                callTimeout,
                callTransfers,
                callbackData,
                deliveryTimeWindow,
                destinations,
                dtmfTimeout,
                from,
                language,
                machineDetection,
                maxDtmf,
                notifyContentType,
                notifyContentVersion,
                notifyUrl,
                pause,
                repeatDtmf,
                retry,
                ringTimeout,
                sendAt,
                sendingSpeed,
                speechRate,
                text,
                validityPeriod,
                voice);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class CallsAdvancedMessage {")
                .append(newLine)
                .append("    audioFileUrl: ")
                .append(toIndentedString(audioFileUrl))
                .append(newLine)
                .append("    callTimeout: ")
                .append(toIndentedString(callTimeout))
                .append(newLine)
                .append("    callTransfers: ")
                .append(toIndentedString(callTransfers))
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
                .append("    dtmfTimeout: ")
                .append(toIndentedString(dtmfTimeout))
                .append(newLine)
                .append("    from: ")
                .append(toIndentedString(from))
                .append(newLine)
                .append("    language: ")
                .append(toIndentedString(language))
                .append(newLine)
                .append("    machineDetection: ")
                .append(toIndentedString(machineDetection))
                .append(newLine)
                .append("    maxDtmf: ")
                .append(toIndentedString(maxDtmf))
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
                .append("    pause: ")
                .append(toIndentedString(pause))
                .append(newLine)
                .append("    repeatDtmf: ")
                .append(toIndentedString(repeatDtmf))
                .append(newLine)
                .append("    retry: ")
                .append(toIndentedString(retry))
                .append(newLine)
                .append("    ringTimeout: ")
                .append(toIndentedString(ringTimeout))
                .append(newLine)
                .append("    sendAt: ")
                .append(toIndentedString(sendAt))
                .append(newLine)
                .append("    sendingSpeed: ")
                .append(toIndentedString(sendingSpeed))
                .append(newLine)
                .append("    speechRate: ")
                .append(toIndentedString(speechRate))
                .append(newLine)
                .append("    text: ")
                .append(toIndentedString(text))
                .append(newLine)
                .append("    validityPeriod: ")
                .append(toIndentedString(validityPeriod))
                .append(newLine)
                .append("    voice: ")
                .append(toIndentedString(voice))
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
