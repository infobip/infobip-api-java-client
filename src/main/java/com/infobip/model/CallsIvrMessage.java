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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 * Array of IVR messages to be sent, one object per every message.
 */
public class CallsIvrMessage {

    private String scenarioId;

    private String from;

    private List<CallsDestination> destinations = new ArrayList<>();

    private String notifyUrl;

    private String notifyContentType;

    private Integer notifyContentVersion;

    private String callbackData;

    private Integer validityPeriod;

    private OffsetDateTime sendAt;

    private CallsRetry retry;

    private Integer ringTimeout;

    private CallsSendingSpeed sendingSpeed;

    private Map<String, String> parameters = null;

    private Integer pause;

    private Boolean record;

    private DeliveryTimeWindow deliveryTimeWindow;

    private Integer callTimeout;

    /**
     * Sets scenarioId.
     * <p>
     * Field description:
     * Scenario key.
     * <p>
     * The field is required.
     *
     * @param scenarioId
     * @return This {@link CallsIvrMessage instance}.
     */
    public CallsIvrMessage scenarioId(String scenarioId) {
        this.scenarioId = scenarioId;
        return this;
    }

    /**
     * Returns scenarioId.
     * <p>
     * Field description:
     * Scenario key.
     * <p>
     * The field is required.
     *
     * @return scenarioId
     */
    @JsonProperty("scenarioId")
    public String getScenarioId() {
        return scenarioId;
    }

    /**
     * Sets scenarioId.
     * <p>
     * Field description:
     * Scenario key.
     * <p>
     * The field is required.
     *
     * @param scenarioId
     */
    @JsonProperty("scenarioId")
    public void setScenarioId(String scenarioId) {
        this.scenarioId = scenarioId;
    }

    /**
     * Sets from.
     * <p>
     * Field description:
     * Numeric sender ID length should be between 3 and 14 characters.
     *
     * @param from
     * @return This {@link CallsIvrMessage instance}.
     */
    public CallsIvrMessage from(String from) {
        this.from = from;
        return this;
    }

    /**
     * Returns from.
     * <p>
     * Field description:
     * Numeric sender ID length should be between 3 and 14 characters.
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
     * Numeric sender ID length should be between 3 and 14 characters.
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
     * Array of message destination addresses. Maximum number of destination addresses is 20k.
     * <p>
     * The field is required.
     *
     * @param destinations
     * @return This {@link CallsIvrMessage instance}.
     */
    public CallsIvrMessage destinations(List<CallsDestination> destinations) {
        this.destinations = destinations;
        return this;
    }

    /**
     * Adds and item into destinations.
     * <p>
     * Field description:
     * Array of message destination addresses. Maximum number of destination addresses is 20k.
     * <p>
     * The field is required.
     *
     * @param destinationsItem The item to be added to the list.
     * @return This {@link CallsIvrMessage instance}.
     */
    public CallsIvrMessage addDestinationsItem(CallsDestination destinationsItem) {
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
     * Array of message destination addresses. Maximum number of destination addresses is 20k.
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
     * Array of message destination addresses. Maximum number of destination addresses is 20k.
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
     * Sets notifyUrl.
     * <p>
     * Field description:
     * The URL on your callback server on which the Delivery report will be sent.
     *
     * @param notifyUrl
     * @return This {@link CallsIvrMessage instance}.
     */
    public CallsIvrMessage notifyUrl(String notifyUrl) {
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
     * Sets notifyContentType.
     * <p>
     * Field description:
     * Preferred Delivery report content type. Can be &#x60;application/json&#x60; or &#x60;application/xml&#x60;.
     *
     * @param notifyContentType
     * @return This {@link CallsIvrMessage instance}.
     */
    public CallsIvrMessage notifyContentType(String notifyContentType) {
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
     * @return This {@link CallsIvrMessage instance}.
     */
    public CallsIvrMessage notifyContentVersion(Integer notifyContentVersion) {
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
     * Sets callbackData.
     * <p>
     * Field description:
     * Additional client&#39;s data that will be sent on the notifyUrl. The maximum value is 200 characters.
     *
     * @param callbackData
     * @return This {@link CallsIvrMessage instance}.
     */
    public CallsIvrMessage callbackData(String callbackData) {
        this.callbackData = callbackData;
        return this;
    }

    /**
     * Returns callbackData.
     * <p>
     * Field description:
     * Additional client&#39;s data that will be sent on the notifyUrl. The maximum value is 200 characters.
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
     * Additional client&#39;s data that will be sent on the notifyUrl. The maximum value is 200 characters.
     *
     * @param callbackData
     */
    @JsonProperty("callbackData")
    public void setCallbackData(String callbackData) {
        this.callbackData = callbackData;
    }

    /**
     * Sets validityPeriod.
     * <p>
     * Field description:
     * The message validity period shown in minutes. When the period expires, it will not be allowed for the message to be sent. A validity period longer than 48h is not supported (in this case, it will be automatically set to 48h).
     *
     * @param validityPeriod
     * @return This {@link CallsIvrMessage instance}.
     */
    public CallsIvrMessage validityPeriod(Integer validityPeriod) {
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
     * Sets sendAt.
     * <p>
     * Field description:
     * Used for scheduled Voice messages (message not to be sent immediately, but at scheduled time).
     *
     * @param sendAt
     * @return This {@link CallsIvrMessage instance}.
     */
    public CallsIvrMessage sendAt(OffsetDateTime sendAt) {
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
     * Sets retry.
     *
     * @param retry
     * @return This {@link CallsIvrMessage instance}.
     */
    public CallsIvrMessage retry(CallsRetry retry) {
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
     * @return This {@link CallsIvrMessage instance}.
     */
    public CallsIvrMessage ringTimeout(Integer ringTimeout) {
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
     * Sets sendingSpeed.
     *
     * @param sendingSpeed
     * @return This {@link CallsIvrMessage instance}.
     */
    public CallsIvrMessage sendingSpeed(CallsSendingSpeed sendingSpeed) {
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
     * Sets parameters.
     * <p>
     * Field description:
     * The parameters that should be passed to the scenario on execution.
     *
     * @param parameters
     * @return This {@link CallsIvrMessage instance}.
     */
    public CallsIvrMessage parameters(Map<String, String> parameters) {
        this.parameters = parameters;
        return this;
    }

    /**
     * Puts and entry into parameters.
     * <p>
     * Field description:
     * The parameters that should be passed to the scenario on execution.
     *
     * @param key The given key.
     * @param parametersItem The item to be associated with the given key.
     * @return This {@link CallsIvrMessage instance}.
     */
    public CallsIvrMessage putParametersItem(String key, String parametersItem) {
        if (this.parameters == null) {
            this.parameters = new HashMap<>();
        }
        this.parameters.put(key, parametersItem);
        return this;
    }

    /**
     * Returns parameters.
     * <p>
     * Field description:
     * The parameters that should be passed to the scenario on execution.
     *
     * @return parameters
     */
    @JsonProperty("parameters")
    public Map<String, String> getParameters() {
        return parameters;
    }

    /**
     * Sets parameters.
     * <p>
     * Field description:
     * The parameters that should be passed to the scenario on execution.
     *
     * @param parameters
     */
    @JsonProperty("parameters")
    public void setParameters(Map<String, String> parameters) {
        this.parameters = parameters;
    }

    /**
     * Sets pause.
     * <p>
     * Field description:
     * Indicating period of time in seconds between end user answering the call and message starting to be played. Minimal value is &#x60;0&#x60; and maximum value is &#x60;10&#x60; seconds. Default value is &#x60;0&#x60;.
     *
     * @param pause
     * @return This {@link CallsIvrMessage instance}.
     */
    public CallsIvrMessage pause(Integer pause) {
        this.pause = pause;
        return this;
    }

    /**
     * Returns pause.
     * <p>
     * Field description:
     * Indicating period of time in seconds between end user answering the call and message starting to be played. Minimal value is &#x60;0&#x60; and maximum value is &#x60;10&#x60; seconds. Default value is &#x60;0&#x60;.
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
     * Indicating period of time in seconds between end user answering the call and message starting to be played. Minimal value is &#x60;0&#x60; and maximum value is &#x60;10&#x60; seconds. Default value is &#x60;0&#x60;.
     *
     * @param pause
     */
    @JsonProperty("pause")
    public void setPause(Integer pause) {
        this.pause = pause;
    }

    /**
     * Sets record.
     * <p>
     * Field description:
     * [Early access: Contact your account manager to enable the usage] Record the call and expose it to client as URL inside the delivery report. Can be &#x60;true&#x60; or &#x60;false&#x60;.
     *
     * @param record
     * @return This {@link CallsIvrMessage instance}.
     */
    public CallsIvrMessage record(Boolean record) {
        this.record = record;
        return this;
    }

    /**
     * Returns record.
     * <p>
     * Field description:
     * [Early access: Contact your account manager to enable the usage] Record the call and expose it to client as URL inside the delivery report. Can be &#x60;true&#x60; or &#x60;false&#x60;.
     *
     * @return record
     */
    @JsonProperty("record")
    public Boolean getRecord() {
        return record;
    }

    /**
     * Sets record.
     * <p>
     * Field description:
     * [Early access: Contact your account manager to enable the usage] Record the call and expose it to client as URL inside the delivery report. Can be &#x60;true&#x60; or &#x60;false&#x60;.
     *
     * @param record
     */
    @JsonProperty("record")
    public void setRecord(Boolean record) {
        this.record = record;
    }

    /**
     * Sets deliveryTimeWindow.
     *
     * @param deliveryTimeWindow
     * @return This {@link CallsIvrMessage instance}.
     */
    public CallsIvrMessage deliveryTimeWindow(DeliveryTimeWindow deliveryTimeWindow) {
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
     * Sets callTimeout.
     * <p>
     * Field description:
     * Maximum possible duration of the call to be set, shown in seconds.
     *
     * @param callTimeout
     * @return This {@link CallsIvrMessage instance}.
     */
    public CallsIvrMessage callTimeout(Integer callTimeout) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CallsIvrMessage callsIvrMessage = (CallsIvrMessage) o;
        return Objects.equals(this.scenarioId, callsIvrMessage.scenarioId)
                && Objects.equals(this.from, callsIvrMessage.from)
                && Objects.equals(this.destinations, callsIvrMessage.destinations)
                && Objects.equals(this.notifyUrl, callsIvrMessage.notifyUrl)
                && Objects.equals(this.notifyContentType, callsIvrMessage.notifyContentType)
                && Objects.equals(this.notifyContentVersion, callsIvrMessage.notifyContentVersion)
                && Objects.equals(this.callbackData, callsIvrMessage.callbackData)
                && Objects.equals(this.validityPeriod, callsIvrMessage.validityPeriod)
                && Objects.equals(this.sendAt, callsIvrMessage.sendAt)
                && Objects.equals(this.retry, callsIvrMessage.retry)
                && Objects.equals(this.ringTimeout, callsIvrMessage.ringTimeout)
                && Objects.equals(this.sendingSpeed, callsIvrMessage.sendingSpeed)
                && Objects.equals(this.parameters, callsIvrMessage.parameters)
                && Objects.equals(this.pause, callsIvrMessage.pause)
                && Objects.equals(this.record, callsIvrMessage.record)
                && Objects.equals(this.deliveryTimeWindow, callsIvrMessage.deliveryTimeWindow)
                && Objects.equals(this.callTimeout, callsIvrMessage.callTimeout);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                scenarioId,
                from,
                destinations,
                notifyUrl,
                notifyContentType,
                notifyContentVersion,
                callbackData,
                validityPeriod,
                sendAt,
                retry,
                ringTimeout,
                sendingSpeed,
                parameters,
                pause,
                record,
                deliveryTimeWindow,
                callTimeout);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class CallsIvrMessage {")
                .append(newLine)
                .append("    scenarioId: ")
                .append(toIndentedString(scenarioId))
                .append(newLine)
                .append("    from: ")
                .append(toIndentedString(from))
                .append(newLine)
                .append("    destinations: ")
                .append(toIndentedString(destinations))
                .append(newLine)
                .append("    notifyUrl: ")
                .append(toIndentedString(notifyUrl))
                .append(newLine)
                .append("    notifyContentType: ")
                .append(toIndentedString(notifyContentType))
                .append(newLine)
                .append("    notifyContentVersion: ")
                .append(toIndentedString(notifyContentVersion))
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
                .append("    retry: ")
                .append(toIndentedString(retry))
                .append(newLine)
                .append("    ringTimeout: ")
                .append(toIndentedString(ringTimeout))
                .append(newLine)
                .append("    sendingSpeed: ")
                .append(toIndentedString(sendingSpeed))
                .append(newLine)
                .append("    parameters: ")
                .append(toIndentedString(parameters))
                .append(newLine)
                .append("    pause: ")
                .append(toIndentedString(pause))
                .append(newLine)
                .append("    record: ")
                .append(toIndentedString(record))
                .append(newLine)
                .append("    deliveryTimeWindow: ")
                .append(toIndentedString(deliveryTimeWindow))
                .append(newLine)
                .append("    callTimeout: ")
                .append(toIndentedString(callTimeout))
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
