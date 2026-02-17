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
 * Message options.
 */
public class ViberMessageOptions {

    private Platform platform;

    private ValidityPeriod validityPeriod;

    private DeliveryTimeWindow deliveryTimeWindow;

    private String campaignReferenceId;

    private ViberDefaultSmsFailover smsFailover;

    private String trackingData;

    private ViberLabel label;

    private Boolean applySessionRate;

    private Boolean toPrimaryDeviceOnly;

    /**
     * Sets platform.
     *
     * @param platform
     * @return This {@link ViberMessageOptions instance}.
     */
    public ViberMessageOptions platform(Platform platform) {
        this.platform = platform;
        return this;
    }

    /**
     * Returns platform.
     *
     * @return platform
     */
    @JsonProperty("platform")
    public Platform getPlatform() {
        return platform;
    }

    /**
     * Sets platform.
     *
     * @param platform
     */
    @JsonProperty("platform")
    public void setPlatform(Platform platform) {
        this.platform = platform;
    }

    /**
     * Sets validityPeriod.
     *
     * @param validityPeriod
     * @return This {@link ViberMessageOptions instance}.
     */
    public ViberMessageOptions validityPeriod(ValidityPeriod validityPeriod) {
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
     * Sets deliveryTimeWindow.
     *
     * @param deliveryTimeWindow
     * @return This {@link ViberMessageOptions instance}.
     */
    public ViberMessageOptions deliveryTimeWindow(DeliveryTimeWindow deliveryTimeWindow) {
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
     * Sets campaignReferenceId.
     * <p>
     * Field description:
     * ID that allows you to track, analyze, and show an aggregated overview and the performance of individual campaigns per sending channel.
     *
     * @param campaignReferenceId
     * @return This {@link ViberMessageOptions instance}.
     */
    public ViberMessageOptions campaignReferenceId(String campaignReferenceId) {
        this.campaignReferenceId = campaignReferenceId;
        return this;
    }

    /**
     * Returns campaignReferenceId.
     * <p>
     * Field description:
     * ID that allows you to track, analyze, and show an aggregated overview and the performance of individual campaigns per sending channel.
     *
     * @return campaignReferenceId
     */
    @JsonProperty("campaignReferenceId")
    public String getCampaignReferenceId() {
        return campaignReferenceId;
    }

    /**
     * Sets campaignReferenceId.
     * <p>
     * Field description:
     * ID that allows you to track, analyze, and show an aggregated overview and the performance of individual campaigns per sending channel.
     *
     * @param campaignReferenceId
     */
    @JsonProperty("campaignReferenceId")
    public void setCampaignReferenceId(String campaignReferenceId) {
        this.campaignReferenceId = campaignReferenceId;
    }

    /**
     * Sets smsFailover.
     *
     * @param smsFailover
     * @return This {@link ViberMessageOptions instance}.
     */
    public ViberMessageOptions smsFailover(ViberDefaultSmsFailover smsFailover) {
        this.smsFailover = smsFailover;
        return this;
    }

    /**
     * Returns smsFailover.
     *
     * @return smsFailover
     */
    @JsonProperty("smsFailover")
    public ViberDefaultSmsFailover getSmsFailover() {
        return smsFailover;
    }

    /**
     * Sets smsFailover.
     *
     * @param smsFailover
     */
    @JsonProperty("smsFailover")
    public void setSmsFailover(ViberDefaultSmsFailover smsFailover) {
        this.smsFailover = smsFailover;
    }

    /**
     * Sets trackingData.
     * <p>
     * Field description:
     * Custom client&#39;s data that will be passed back with user&#39;s reply. It is not supported for &#x60;OTP_TEMPLATE&#x60; or when &#x60;toPrimaryDeviceOnly&#x60; option is enabled for text only and image only content types.
     *
     * @param trackingData
     * @return This {@link ViberMessageOptions instance}.
     */
    public ViberMessageOptions trackingData(String trackingData) {
        this.trackingData = trackingData;
        return this;
    }

    /**
     * Returns trackingData.
     * <p>
     * Field description:
     * Custom client&#39;s data that will be passed back with user&#39;s reply. It is not supported for &#x60;OTP_TEMPLATE&#x60; or when &#x60;toPrimaryDeviceOnly&#x60; option is enabled for text only and image only content types.
     *
     * @return trackingData
     */
    @JsonProperty("trackingData")
    public String getTrackingData() {
        return trackingData;
    }

    /**
     * Sets trackingData.
     * <p>
     * Field description:
     * Custom client&#39;s data that will be passed back with user&#39;s reply. It is not supported for &#x60;OTP_TEMPLATE&#x60; or when &#x60;toPrimaryDeviceOnly&#x60; option is enabled for text only and image only content types.
     *
     * @param trackingData
     */
    @JsonProperty("trackingData")
    public void setTrackingData(String trackingData) {
        this.trackingData = trackingData;
    }

    /**
     * Sets label.
     *
     * @param label
     * @return This {@link ViberMessageOptions instance}.
     */
    public ViberMessageOptions label(ViberLabel label) {
        this.label = label;
        return this;
    }

    /**
     * Returns label.
     *
     * @return label
     */
    @JsonProperty("label")
    public ViberLabel getLabel() {
        return label;
    }

    /**
     * Sets label.
     *
     * @param label
     */
    @JsonProperty("label")
    public void setLabel(ViberLabel label) {
        this.label = label;
    }

    /**
     * Sets applySessionRate.
     * <p>
     * Field description:
     * Defines if the message should be charged using Viber&#39;s session rate if applicable. The session rate is supported for text only, image only and &#x60;FILE&#x60; content types. For text only and image only content types &#x60;sessionRate&#x60; won&#39;t be applied if parameter &#x60;toPrimaryDeviceOnly&#x60; is set to &#x60;true&#x60;.
     *
     * @param applySessionRate
     * @return This {@link ViberMessageOptions instance}.
     */
    public ViberMessageOptions applySessionRate(Boolean applySessionRate) {
        this.applySessionRate = applySessionRate;
        return this;
    }

    /**
     * Returns applySessionRate.
     * <p>
     * Field description:
     * Defines if the message should be charged using Viber&#39;s session rate if applicable. The session rate is supported for text only, image only and &#x60;FILE&#x60; content types. For text only and image only content types &#x60;sessionRate&#x60; won&#39;t be applied if parameter &#x60;toPrimaryDeviceOnly&#x60; is set to &#x60;true&#x60;.
     *
     * @return applySessionRate
     */
    @JsonProperty("applySessionRate")
    public Boolean getApplySessionRate() {
        return applySessionRate;
    }

    /**
     * Sets applySessionRate.
     * <p>
     * Field description:
     * Defines if the message should be charged using Viber&#39;s session rate if applicable. The session rate is supported for text only, image only and &#x60;FILE&#x60; content types. For text only and image only content types &#x60;sessionRate&#x60; won&#39;t be applied if parameter &#x60;toPrimaryDeviceOnly&#x60; is set to &#x60;true&#x60;.
     *
     * @param applySessionRate
     */
    @JsonProperty("applySessionRate")
    public void setApplySessionRate(Boolean applySessionRate) {
        this.applySessionRate = applySessionRate;
    }

    /**
     * Sets toPrimaryDeviceOnly.
     * <p>
     * Field description:
     * Defines if the message should be sent only to the end user&#39;s [primary device](https://www.infobip.com/docs/viber/business-messages/api) (phone or tablet). Primary device concept is supported for text only, image only, &#x60;FILE&#x60; and &#x60;OTP_TEMPLATE&#x60; content type.
     *
     * @param toPrimaryDeviceOnly
     * @return This {@link ViberMessageOptions instance}.
     */
    public ViberMessageOptions toPrimaryDeviceOnly(Boolean toPrimaryDeviceOnly) {
        this.toPrimaryDeviceOnly = toPrimaryDeviceOnly;
        return this;
    }

    /**
     * Returns toPrimaryDeviceOnly.
     * <p>
     * Field description:
     * Defines if the message should be sent only to the end user&#39;s [primary device](https://www.infobip.com/docs/viber/business-messages/api) (phone or tablet). Primary device concept is supported for text only, image only, &#x60;FILE&#x60; and &#x60;OTP_TEMPLATE&#x60; content type.
     *
     * @return toPrimaryDeviceOnly
     */
    @JsonProperty("toPrimaryDeviceOnly")
    public Boolean getToPrimaryDeviceOnly() {
        return toPrimaryDeviceOnly;
    }

    /**
     * Sets toPrimaryDeviceOnly.
     * <p>
     * Field description:
     * Defines if the message should be sent only to the end user&#39;s [primary device](https://www.infobip.com/docs/viber/business-messages/api) (phone or tablet). Primary device concept is supported for text only, image only, &#x60;FILE&#x60; and &#x60;OTP_TEMPLATE&#x60; content type.
     *
     * @param toPrimaryDeviceOnly
     */
    @JsonProperty("toPrimaryDeviceOnly")
    public void setToPrimaryDeviceOnly(Boolean toPrimaryDeviceOnly) {
        this.toPrimaryDeviceOnly = toPrimaryDeviceOnly;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ViberMessageOptions viberMessageOptions = (ViberMessageOptions) o;
        return Objects.equals(this.platform, viberMessageOptions.platform)
                && Objects.equals(this.validityPeriod, viberMessageOptions.validityPeriod)
                && Objects.equals(this.deliveryTimeWindow, viberMessageOptions.deliveryTimeWindow)
                && Objects.equals(this.campaignReferenceId, viberMessageOptions.campaignReferenceId)
                && Objects.equals(this.smsFailover, viberMessageOptions.smsFailover)
                && Objects.equals(this.trackingData, viberMessageOptions.trackingData)
                && Objects.equals(this.label, viberMessageOptions.label)
                && Objects.equals(this.applySessionRate, viberMessageOptions.applySessionRate)
                && Objects.equals(this.toPrimaryDeviceOnly, viberMessageOptions.toPrimaryDeviceOnly);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                platform,
                validityPeriod,
                deliveryTimeWindow,
                campaignReferenceId,
                smsFailover,
                trackingData,
                label,
                applySessionRate,
                toPrimaryDeviceOnly);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class ViberMessageOptions {")
                .append(newLine)
                .append("    platform: ")
                .append(toIndentedString(platform))
                .append(newLine)
                .append("    validityPeriod: ")
                .append(toIndentedString(validityPeriod))
                .append(newLine)
                .append("    deliveryTimeWindow: ")
                .append(toIndentedString(deliveryTimeWindow))
                .append(newLine)
                .append("    campaignReferenceId: ")
                .append(toIndentedString(campaignReferenceId))
                .append(newLine)
                .append("    smsFailover: ")
                .append(toIndentedString(smsFailover))
                .append(newLine)
                .append("    trackingData: ")
                .append(toIndentedString(trackingData))
                .append(newLine)
                .append("    label: ")
                .append(toIndentedString(label))
                .append(newLine)
                .append("    applySessionRate: ")
                .append(toIndentedString(applySessionRate))
                .append(newLine)
                .append("    toPrimaryDeviceOnly: ")
                .append(toIndentedString(toPrimaryDeviceOnly))
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
