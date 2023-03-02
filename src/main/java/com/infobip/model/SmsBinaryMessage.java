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
public class SmsBinaryMessage {

    private SmsBinaryContent binary;

    private String callbackData;

    private SmsDeliveryTimeWindow deliveryTimeWindow;

    private List<SmsDestination> destinations = new ArrayList<>();

    private Boolean flash;

    private String from;

    private Boolean intermediateReport;

    private String notifyContentType;

    private String notifyUrl;

    private SmsRegionalOptions regional;

    private OffsetDateTime sendAt;

    private Long validityPeriod;

    private String entityId;

    private String applicationId;

    /**
     * Sets binary.
     *
     * @param binary
     * @return This {@link SmsBinaryMessage instance}.
     */
    public SmsBinaryMessage binary(SmsBinaryContent binary) {
        this.binary = binary;
        return this;
    }

    /**
     * Returns binary.
     *
     * @return binary
     */
    @JsonProperty("binary")
    public SmsBinaryContent getBinary() {
        return binary;
    }

    /**
     * Sets binary.
     *
     * @param binary
     */
    @JsonProperty("binary")
    public void setBinary(SmsBinaryContent binary) {
        this.binary = binary;
    }

    /**
     * Sets callbackData.
     * <p>
     * Field description:
     * Additional client data that will be sent on the notifyUrl. The maximum value is 4000 characters.
     *
     * @param callbackData
     * @return This {@link SmsBinaryMessage instance}.
     */
    public SmsBinaryMessage callbackData(String callbackData) {
        this.callbackData = callbackData;
        return this;
    }

    /**
     * Returns callbackData.
     * <p>
     * Field description:
     * Additional client data that will be sent on the notifyUrl. The maximum value is 4000 characters.
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
     * Additional client data that will be sent on the notifyUrl. The maximum value is 4000 characters.
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
     * @return This {@link SmsBinaryMessage instance}.
     */
    public SmsBinaryMessage deliveryTimeWindow(SmsDeliveryTimeWindow deliveryTimeWindow) {
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
     * @return This {@link SmsBinaryMessage instance}.
     */
    public SmsBinaryMessage destinations(List<SmsDestination> destinations) {
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
     * @return This {@link SmsBinaryMessage instance}.
     */
    public SmsBinaryMessage addDestinationsItem(SmsDestination destinationsItem) {
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
     * @return This {@link SmsBinaryMessage instance}.
     */
    public SmsBinaryMessage flash(Boolean flash) {
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
     * @return This {@link SmsBinaryMessage instance}.
     */
    public SmsBinaryMessage from(String from) {
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
     * The [real-time intermediate delivery report](https://www.infobip.com/docs/api#channels/sms/receive-outbound-sms-message-report) containing GSM error codes, messages status, pricing, network and country codes, etc., which will be sent on your callback server. Defaults to &#x60;false&#x60;.
     *
     * @param intermediateReport
     * @return This {@link SmsBinaryMessage instance}.
     */
    public SmsBinaryMessage intermediateReport(Boolean intermediateReport) {
        this.intermediateReport = intermediateReport;
        return this;
    }

    /**
     * Returns intermediateReport.
     * <p>
     * Field description:
     * The [real-time intermediate delivery report](https://www.infobip.com/docs/api#channels/sms/receive-outbound-sms-message-report) containing GSM error codes, messages status, pricing, network and country codes, etc., which will be sent on your callback server. Defaults to &#x60;false&#x60;.
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
     * The [real-time intermediate delivery report](https://www.infobip.com/docs/api#channels/sms/receive-outbound-sms-message-report) containing GSM error codes, messages status, pricing, network and country codes, etc., which will be sent on your callback server. Defaults to &#x60;false&#x60;.
     *
     * @param intermediateReport
     */
    @JsonProperty("intermediateReport")
    public void setIntermediateReport(Boolean intermediateReport) {
        this.intermediateReport = intermediateReport;
    }

    /**
     * Sets notifyContentType.
     * <p>
     * Field description:
     * Preferred delivery report content type, &#x60;application/json&#x60; or &#x60;application/xml&#x60;.
     *
     * @param notifyContentType
     * @return This {@link SmsBinaryMessage instance}.
     */
    public SmsBinaryMessage notifyContentType(String notifyContentType) {
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
     * The URL on your call back server on which the Delivery report will be sent.
     *
     * @param notifyUrl
     * @return This {@link SmsBinaryMessage instance}.
     */
    public SmsBinaryMessage notifyUrl(String notifyUrl) {
        this.notifyUrl = notifyUrl;
        return this;
    }

    /**
     * Returns notifyUrl.
     * <p>
     * Field description:
     * The URL on your call back server on which the Delivery report will be sent.
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
     * The URL on your call back server on which the Delivery report will be sent.
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
     * @return This {@link SmsBinaryMessage instance}.
     */
    public SmsBinaryMessage regional(SmsRegionalOptions regional) {
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
     * Date and time when the message is to be sent. Used for [scheduled SMS](https://www.infobip.com/docs/api#channels/sms/get-scheduled-sms-messages). Has the following format: &#x60;yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZ&#x60;, and can only be scheduled for no later than 180 days in advance.
     *
     * @param sendAt
     * @return This {@link SmsBinaryMessage instance}.
     */
    public SmsBinaryMessage sendAt(OffsetDateTime sendAt) {
        this.sendAt = sendAt;
        return this;
    }

    /**
     * Returns sendAt.
     * <p>
     * Field description:
     * Date and time when the message is to be sent. Used for [scheduled SMS](https://www.infobip.com/docs/api#channels/sms/get-scheduled-sms-messages). Has the following format: &#x60;yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZ&#x60;, and can only be scheduled for no later than 180 days in advance.
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
     * Date and time when the message is to be sent. Used for [scheduled SMS](https://www.infobip.com/docs/api#channels/sms/get-scheduled-sms-messages). Has the following format: &#x60;yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZ&#x60;, and can only be scheduled for no later than 180 days in advance.
     *
     * @param sendAt
     */
    @JsonProperty("sendAt")
    public void setSendAt(OffsetDateTime sendAt) {
        this.sendAt = sendAt;
    }

    /**
     * Sets validityPeriod.
     * <p>
     * Field description:
     * The message validity period in minutes. When the period expires, it will not be allowed for the message to be sent. Validity period longer than 48h is not supported (in this case, it will be automatically set to 48h).
     *
     * @param validityPeriod
     * @return This {@link SmsBinaryMessage instance}.
     */
    public SmsBinaryMessage validityPeriod(Long validityPeriod) {
        this.validityPeriod = validityPeriod;
        return this;
    }

    /**
     * Returns validityPeriod.
     * <p>
     * Field description:
     * The message validity period in minutes. When the period expires, it will not be allowed for the message to be sent. Validity period longer than 48h is not supported (in this case, it will be automatically set to 48h).
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
     * The message validity period in minutes. When the period expires, it will not be allowed for the message to be sent. Validity period longer than 48h is not supported (in this case, it will be automatically set to 48h).
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
     * @return This {@link SmsBinaryMessage instance}.
     */
    public SmsBinaryMessage entityId(String entityId) {
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
     * @return This {@link SmsBinaryMessage instance}.
     */
    public SmsBinaryMessage applicationId(String applicationId) {
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
        SmsBinaryMessage smsBinaryMessage = (SmsBinaryMessage) o;
        return Objects.equals(this.binary, smsBinaryMessage.binary)
                && Objects.equals(this.callbackData, smsBinaryMessage.callbackData)
                && Objects.equals(this.deliveryTimeWindow, smsBinaryMessage.deliveryTimeWindow)
                && Objects.equals(this.destinations, smsBinaryMessage.destinations)
                && Objects.equals(this.flash, smsBinaryMessage.flash)
                && Objects.equals(this.from, smsBinaryMessage.from)
                && Objects.equals(this.intermediateReport, smsBinaryMessage.intermediateReport)
                && Objects.equals(this.notifyContentType, smsBinaryMessage.notifyContentType)
                && Objects.equals(this.notifyUrl, smsBinaryMessage.notifyUrl)
                && Objects.equals(this.regional, smsBinaryMessage.regional)
                && Objects.equals(this.sendAt, smsBinaryMessage.sendAt)
                && Objects.equals(this.validityPeriod, smsBinaryMessage.validityPeriod)
                && Objects.equals(this.entityId, smsBinaryMessage.entityId)
                && Objects.equals(this.applicationId, smsBinaryMessage.applicationId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                binary,
                callbackData,
                deliveryTimeWindow,
                destinations,
                flash,
                from,
                intermediateReport,
                notifyContentType,
                notifyUrl,
                regional,
                sendAt,
                validityPeriod,
                entityId,
                applicationId);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class SmsBinaryMessage {")
                .append(newLine)
                .append("    binary: ")
                .append(toIndentedString(binary))
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
