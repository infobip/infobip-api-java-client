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
public class SmsMessageOptions {

    private Platform platform;

    private ValidityPeriod validityPeriod;

    private DeliveryTimeWindow deliveryTimeWindow;

    private String campaignReferenceId;

    private SmsRegionalOptions regional;

    private Boolean flash;

    /**
     * Sets platform.
     *
     * @param platform
     * @return This {@link SmsMessageOptions instance}.
     */
    public SmsMessageOptions platform(Platform platform) {
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
     * @return This {@link SmsMessageOptions instance}.
     */
    public SmsMessageOptions validityPeriod(ValidityPeriod validityPeriod) {
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
     * @return This {@link SmsMessageOptions instance}.
     */
    public SmsMessageOptions deliveryTimeWindow(DeliveryTimeWindow deliveryTimeWindow) {
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
     * @return This {@link SmsMessageOptions instance}.
     */
    public SmsMessageOptions campaignReferenceId(String campaignReferenceId) {
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
     * Sets regional.
     *
     * @param regional
     * @return This {@link SmsMessageOptions instance}.
     */
    public SmsMessageOptions regional(SmsRegionalOptions regional) {
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
     * Sets flash.
     * <p>
     * Field description:
     * Allows for sending a [flash SMS](https://www.infobip.com/docs/sms/message-types#flash-sms) to automatically appear on recipient devices without interaction. Set to &#x60;true&#x60; to enable flash SMS, or leave the default value, &#x60;false&#x60; to send a standard SMS.
     *
     * @param flash
     * @return This {@link SmsMessageOptions instance}.
     */
    public SmsMessageOptions flash(Boolean flash) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SmsMessageOptions smsMessageOptions = (SmsMessageOptions) o;
        return Objects.equals(this.platform, smsMessageOptions.platform)
                && Objects.equals(this.validityPeriod, smsMessageOptions.validityPeriod)
                && Objects.equals(this.deliveryTimeWindow, smsMessageOptions.deliveryTimeWindow)
                && Objects.equals(this.campaignReferenceId, smsMessageOptions.campaignReferenceId)
                && Objects.equals(this.regional, smsMessageOptions.regional)
                && Objects.equals(this.flash, smsMessageOptions.flash);
    }

    @Override
    public int hashCode() {
        return Objects.hash(platform, validityPeriod, deliveryTimeWindow, campaignReferenceId, regional, flash);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class SmsMessageOptions {")
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
                .append("    regional: ")
                .append(toIndentedString(regional))
                .append(newLine)
                .append("    flash: ")
                .append(toIndentedString(flash))
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
