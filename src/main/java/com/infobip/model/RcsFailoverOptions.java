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
public class RcsFailoverOptions {

    private Platform platform;

    private ValidityPeriod validityPeriod;

    private DeliveryTimeWindow deliveryTimeWindow;

    private String campaignReferenceId;

    private RcsDefaultSmsFailover smsFailover;

    private RcsMmsFailover mmsFailover;

    /**
     * Sets platform.
     *
     * @param platform
     * @return This {@link RcsFailoverOptions instance}.
     */
    public RcsFailoverOptions platform(Platform platform) {
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
     * @return This {@link RcsFailoverOptions instance}.
     */
    public RcsFailoverOptions validityPeriod(ValidityPeriod validityPeriod) {
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
     * @return This {@link RcsFailoverOptions instance}.
     */
    public RcsFailoverOptions deliveryTimeWindow(DeliveryTimeWindow deliveryTimeWindow) {
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
     * @return This {@link RcsFailoverOptions instance}.
     */
    public RcsFailoverOptions campaignReferenceId(String campaignReferenceId) {
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
     * @return This {@link RcsFailoverOptions instance}.
     */
    public RcsFailoverOptions smsFailover(RcsDefaultSmsFailover smsFailover) {
        this.smsFailover = smsFailover;
        return this;
    }

    /**
     * Returns smsFailover.
     *
     * @return smsFailover
     */
    @JsonProperty("smsFailover")
    public RcsDefaultSmsFailover getSmsFailover() {
        return smsFailover;
    }

    /**
     * Sets smsFailover.
     *
     * @param smsFailover
     */
    @JsonProperty("smsFailover")
    public void setSmsFailover(RcsDefaultSmsFailover smsFailover) {
        this.smsFailover = smsFailover;
    }

    /**
     * Sets mmsFailover.
     *
     * @param mmsFailover
     * @return This {@link RcsFailoverOptions instance}.
     */
    public RcsFailoverOptions mmsFailover(RcsMmsFailover mmsFailover) {
        this.mmsFailover = mmsFailover;
        return this;
    }

    /**
     * Returns mmsFailover.
     *
     * @return mmsFailover
     */
    @JsonProperty("mmsFailover")
    public RcsMmsFailover getMmsFailover() {
        return mmsFailover;
    }

    /**
     * Sets mmsFailover.
     *
     * @param mmsFailover
     */
    @JsonProperty("mmsFailover")
    public void setMmsFailover(RcsMmsFailover mmsFailover) {
        this.mmsFailover = mmsFailover;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RcsFailoverOptions rcsFailoverOptions = (RcsFailoverOptions) o;
        return Objects.equals(this.platform, rcsFailoverOptions.platform)
                && Objects.equals(this.validityPeriod, rcsFailoverOptions.validityPeriod)
                && Objects.equals(this.deliveryTimeWindow, rcsFailoverOptions.deliveryTimeWindow)
                && Objects.equals(this.campaignReferenceId, rcsFailoverOptions.campaignReferenceId)
                && Objects.equals(this.smsFailover, rcsFailoverOptions.smsFailover)
                && Objects.equals(this.mmsFailover, rcsFailoverOptions.mmsFailover);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                platform, validityPeriod, deliveryTimeWindow, campaignReferenceId, smsFailover, mmsFailover);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class RcsFailoverOptions {")
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
                .append("    mmsFailover: ")
                .append(toIndentedString(mmsFailover))
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
