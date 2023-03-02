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
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * An array of message objects of a single message or multiple messages sent under one bulk ID.
 */
public class MmsAdvancedMessage {

    private String callbackData;

    private MmsDeliveryTimeWindow deliveryTimeWindow;

    private List<MmsDestination> destinations = new ArrayList<>();

    private String from;

    private Boolean intermediateReport;

    private String notifyContentType;

    private String notifyUrl;

    private List<MmsAdvancedMessageSegment> messageSegments = new ArrayList<>();

    private Long validityPeriod;

    private String title;

    private String entityId;

    private String applicationId;

    /**
     * Sets callbackData.
     * <p>
     * Field description:
     * Additional client data to be sent over the notifyUrl. The maximum value is 4000 characters.
     *
     * @param callbackData
     * @return This {@link MmsAdvancedMessage instance}.
     */
    public MmsAdvancedMessage callbackData(String callbackData) {
        this.callbackData = callbackData;
        return this;
    }

    /**
     * Returns callbackData.
     * <p>
     * Field description:
     * Additional client data to be sent over the notifyUrl. The maximum value is 4000 characters.
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
     * Additional client data to be sent over the notifyUrl. The maximum value is 4000 characters.
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
     * @return This {@link MmsAdvancedMessage instance}.
     */
    public MmsAdvancedMessage deliveryTimeWindow(MmsDeliveryTimeWindow deliveryTimeWindow) {
        this.deliveryTimeWindow = deliveryTimeWindow;
        return this;
    }

    /**
     * Returns deliveryTimeWindow.
     *
     * @return deliveryTimeWindow
     */
    @JsonProperty("deliveryTimeWindow")
    public MmsDeliveryTimeWindow getDeliveryTimeWindow() {
        return deliveryTimeWindow;
    }

    /**
     * Sets deliveryTimeWindow.
     *
     * @param deliveryTimeWindow
     */
    @JsonProperty("deliveryTimeWindow")
    public void setDeliveryTimeWindow(MmsDeliveryTimeWindow deliveryTimeWindow) {
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
     * @return This {@link MmsAdvancedMessage instance}.
     */
    public MmsAdvancedMessage destinations(List<MmsDestination> destinations) {
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
     * @return This {@link MmsAdvancedMessage instance}.
     */
    public MmsAdvancedMessage addDestinationsItem(MmsDestination destinationsItem) {
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
    public List<MmsDestination> getDestinations() {
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
    public void setDestinations(List<MmsDestination> destinations) {
        this.destinations = destinations;
    }

    /**
     * Sets from.
     * <p>
     * Field description:
     * The sender ID which can be alphanumeric or numeric (e.g., &#x60;CompanyName&#x60;).
     *
     * @param from
     * @return This {@link MmsAdvancedMessage instance}.
     */
    public MmsAdvancedMessage from(String from) {
        this.from = from;
        return this;
    }

    /**
     * Returns from.
     * <p>
     * Field description:
     * The sender ID which can be alphanumeric or numeric (e.g., &#x60;CompanyName&#x60;).
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
     * The sender ID which can be alphanumeric or numeric (e.g., &#x60;CompanyName&#x60;).
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
     * The [real-time intermediate delivery report](https://www.infobip.com/docs/api/channels/mms/get-outbound-mms-message-delivery-reports) containing GSM error codes, messages status, pricing, network and country codes, etc., which will be sent on your callback server. Defaults to &#x60;false&#x60;.
     *
     * @param intermediateReport
     * @return This {@link MmsAdvancedMessage instance}.
     */
    public MmsAdvancedMessage intermediateReport(Boolean intermediateReport) {
        this.intermediateReport = intermediateReport;
        return this;
    }

    /**
     * Returns intermediateReport.
     * <p>
     * Field description:
     * The [real-time intermediate delivery report](https://www.infobip.com/docs/api/channels/mms/get-outbound-mms-message-delivery-reports) containing GSM error codes, messages status, pricing, network and country codes, etc., which will be sent on your callback server. Defaults to &#x60;false&#x60;.
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
     * The [real-time intermediate delivery report](https://www.infobip.com/docs/api/channels/mms/get-outbound-mms-message-delivery-reports) containing GSM error codes, messages status, pricing, network and country codes, etc., which will be sent on your callback server. Defaults to &#x60;false&#x60;.
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
     * @return This {@link MmsAdvancedMessage instance}.
     */
    public MmsAdvancedMessage notifyContentType(String notifyContentType) {
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
     * The URL on your call back server on to which a delivery report will be sent.
     *
     * @param notifyUrl
     * @return This {@link MmsAdvancedMessage instance}.
     */
    public MmsAdvancedMessage notifyUrl(String notifyUrl) {
        this.notifyUrl = notifyUrl;
        return this;
    }

    /**
     * Returns notifyUrl.
     * <p>
     * Field description:
     * The URL on your call back server on to which a delivery report will be sent.
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
     * The URL on your call back server on to which a delivery report will be sent.
     *
     * @param notifyUrl
     */
    @JsonProperty("notifyUrl")
    public void setNotifyUrl(String notifyUrl) {
        this.notifyUrl = notifyUrl;
    }

    /**
     * Sets messageSegments.
     * <p>
     * Field description:
     * Content of the message being sent.
     * <p>
     * The field is required.
     *
     * @param messageSegments
     * @return This {@link MmsAdvancedMessage instance}.
     */
    public MmsAdvancedMessage messageSegments(List<MmsAdvancedMessageSegment> messageSegments) {
        this.messageSegments = messageSegments;
        return this;
    }

    /**
     * Adds and item into messageSegments.
     * <p>
     * Field description:
     * Content of the message being sent.
     * <p>
     * The field is required.
     *
     * @param messageSegmentsItem The item to be added to the list.
     * @return This {@link MmsAdvancedMessage instance}.
     */
    public MmsAdvancedMessage addMessageSegmentsItem(MmsAdvancedMessageSegment messageSegmentsItem) {
        if (this.messageSegments == null) {
            this.messageSegments = new ArrayList<>();
        }
        this.messageSegments.add(messageSegmentsItem);
        return this;
    }

    /**
     * Returns messageSegments.
     * <p>
     * Field description:
     * Content of the message being sent.
     * <p>
     * The field is required.
     *
     * @return messageSegments
     */
    @JsonProperty("messageSegments")
    public List<MmsAdvancedMessageSegment> getMessageSegments() {
        return messageSegments;
    }

    /**
     * Sets messageSegments.
     * <p>
     * Field description:
     * Content of the message being sent.
     * <p>
     * The field is required.
     *
     * @param messageSegments
     */
    @JsonProperty("messageSegments")
    public void setMessageSegments(List<MmsAdvancedMessageSegment> messageSegments) {
        this.messageSegments = messageSegments;
    }

    /**
     * Sets validityPeriod.
     * <p>
     * Field description:
     * The message validity period in minutes. When the period expires, it will not be allowed for the message to be sent. Validity period longer than 48h is not supported. Any bigger value will automatically default back to &#x60;2880&#x60;.
     *
     * @param validityPeriod
     * @return This {@link MmsAdvancedMessage instance}.
     */
    public MmsAdvancedMessage validityPeriod(Long validityPeriod) {
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
     * Sets title.
     *
     * @param title
     * @return This {@link MmsAdvancedMessage instance}.
     */
    public MmsAdvancedMessage title(String title) {
        this.title = title;
        return this;
    }

    /**
     * Returns title.
     *
     * @return title
     */
    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    /**
     * Sets title.
     *
     * @param title
     */
    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Sets entityId.
     * <p>
     * Field description:
     * Required for entity use in a send request for outbound traffic. Returned in notification events.
     *
     * @param entityId
     * @return This {@link MmsAdvancedMessage instance}.
     */
    public MmsAdvancedMessage entityId(String entityId) {
        this.entityId = entityId;
        return this;
    }

    /**
     * Returns entityId.
     * <p>
     * Field description:
     * Required for entity use in a send request for outbound traffic. Returned in notification events.
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
     * Required for entity use in a send request for outbound traffic. Returned in notification events.
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
     * Required for application use in a send request for outbound traffic. Returned in notification events.
     *
     * @param applicationId
     * @return This {@link MmsAdvancedMessage instance}.
     */
    public MmsAdvancedMessage applicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }

    /**
     * Returns applicationId.
     * <p>
     * Field description:
     * Required for application use in a send request for outbound traffic. Returned in notification events.
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
     * Required for application use in a send request for outbound traffic. Returned in notification events.
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
        MmsAdvancedMessage mmsAdvancedMessage = (MmsAdvancedMessage) o;
        return Objects.equals(this.callbackData, mmsAdvancedMessage.callbackData)
                && Objects.equals(this.deliveryTimeWindow, mmsAdvancedMessage.deliveryTimeWindow)
                && Objects.equals(this.destinations, mmsAdvancedMessage.destinations)
                && Objects.equals(this.from, mmsAdvancedMessage.from)
                && Objects.equals(this.intermediateReport, mmsAdvancedMessage.intermediateReport)
                && Objects.equals(this.notifyContentType, mmsAdvancedMessage.notifyContentType)
                && Objects.equals(this.notifyUrl, mmsAdvancedMessage.notifyUrl)
                && Objects.equals(this.messageSegments, mmsAdvancedMessage.messageSegments)
                && Objects.equals(this.validityPeriod, mmsAdvancedMessage.validityPeriod)
                && Objects.equals(this.title, mmsAdvancedMessage.title)
                && Objects.equals(this.entityId, mmsAdvancedMessage.entityId)
                && Objects.equals(this.applicationId, mmsAdvancedMessage.applicationId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                callbackData,
                deliveryTimeWindow,
                destinations,
                from,
                intermediateReport,
                notifyContentType,
                notifyUrl,
                messageSegments,
                validityPeriod,
                title,
                entityId,
                applicationId);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class MmsAdvancedMessage {")
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
                .append("    messageSegments: ")
                .append(toIndentedString(messageSegments))
                .append(newLine)
                .append("    validityPeriod: ")
                .append(toIndentedString(validityPeriod))
                .append(newLine)
                .append("    title: ")
                .append(toIndentedString(title))
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
