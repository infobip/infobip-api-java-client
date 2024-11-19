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
public class MessagesApiMessageOptions {

    private MessagesApiPlatform platform;

    private MessagesApiValidityPeriod validityPeriod;

    private Boolean adaptationMode;

    private MessagesApiRegionalOptions regional;

    private String campaignReferenceId;

    /**
     * Sets platform.
     *
     * @param platform
     * @return This {@link MessagesApiMessageOptions instance}.
     */
    public MessagesApiMessageOptions platform(MessagesApiPlatform platform) {
        this.platform = platform;
        return this;
    }

    /**
     * Returns platform.
     *
     * @return platform
     */
    @JsonProperty("platform")
    public MessagesApiPlatform getPlatform() {
        return platform;
    }

    /**
     * Sets platform.
     *
     * @param platform
     */
    @JsonProperty("platform")
    public void setPlatform(MessagesApiPlatform platform) {
        this.platform = platform;
    }

    /**
     * Sets validityPeriod.
     *
     * @param validityPeriod
     * @return This {@link MessagesApiMessageOptions instance}.
     */
    public MessagesApiMessageOptions validityPeriod(MessagesApiValidityPeriod validityPeriod) {
        this.validityPeriod = validityPeriod;
        return this;
    }

    /**
     * Returns validityPeriod.
     *
     * @return validityPeriod
     */
    @JsonProperty("validityPeriod")
    public MessagesApiValidityPeriod getValidityPeriod() {
        return validityPeriod;
    }

    /**
     * Sets validityPeriod.
     *
     * @param validityPeriod
     */
    @JsonProperty("validityPeriod")
    public void setValidityPeriod(MessagesApiValidityPeriod validityPeriod) {
        this.validityPeriod = validityPeriod;
    }

    /**
     * Sets adaptationMode.
     * <p>
     * Field description:
     * If channel does not fully support message to be sent, we will try to map it as best effort. This is default behavior, even if this option is not specified.
     *
     * @param adaptationMode
     * @return This {@link MessagesApiMessageOptions instance}.
     */
    public MessagesApiMessageOptions adaptationMode(Boolean adaptationMode) {
        this.adaptationMode = adaptationMode;
        return this;
    }

    /**
     * Returns adaptationMode.
     * <p>
     * Field description:
     * If channel does not fully support message to be sent, we will try to map it as best effort. This is default behavior, even if this option is not specified.
     *
     * @return adaptationMode
     */
    @JsonProperty("adaptationMode")
    public Boolean getAdaptationMode() {
        return adaptationMode;
    }

    /**
     * Sets adaptationMode.
     * <p>
     * Field description:
     * If channel does not fully support message to be sent, we will try to map it as best effort. This is default behavior, even if this option is not specified.
     *
     * @param adaptationMode
     */
    @JsonProperty("adaptationMode")
    public void setAdaptationMode(Boolean adaptationMode) {
        this.adaptationMode = adaptationMode;
    }

    /**
     * Sets regional.
     *
     * @param regional
     * @return This {@link MessagesApiMessageOptions instance}.
     */
    public MessagesApiMessageOptions regional(MessagesApiRegionalOptions regional) {
        this.regional = regional;
        return this;
    }

    /**
     * Returns regional.
     *
     * @return regional
     */
    @JsonProperty("regional")
    public MessagesApiRegionalOptions getRegional() {
        return regional;
    }

    /**
     * Sets regional.
     *
     * @param regional
     */
    @JsonProperty("regional")
    public void setRegional(MessagesApiRegionalOptions regional) {
        this.regional = regional;
    }

    /**
     * Sets campaignReferenceId.
     * <p>
     * Field description:
     * ID that allows you to track, analyze, and show an aggregated overview and the performance of individual campaigns per sending channel.
     *
     * @param campaignReferenceId
     * @return This {@link MessagesApiMessageOptions instance}.
     */
    public MessagesApiMessageOptions campaignReferenceId(String campaignReferenceId) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MessagesApiMessageOptions messagesApiMessageOptions = (MessagesApiMessageOptions) o;
        return Objects.equals(this.platform, messagesApiMessageOptions.platform)
                && Objects.equals(this.validityPeriod, messagesApiMessageOptions.validityPeriod)
                && Objects.equals(this.adaptationMode, messagesApiMessageOptions.adaptationMode)
                && Objects.equals(this.regional, messagesApiMessageOptions.regional)
                && Objects.equals(this.campaignReferenceId, messagesApiMessageOptions.campaignReferenceId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(platform, validityPeriod, adaptationMode, regional, campaignReferenceId);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class MessagesApiMessageOptions {")
                .append(newLine)
                .append("    platform: ")
                .append(toIndentedString(platform))
                .append(newLine)
                .append("    validityPeriod: ")
                .append(toIndentedString(validityPeriod))
                .append(newLine)
                .append("    adaptationMode: ")
                .append(toIndentedString(adaptationMode))
                .append(newLine)
                .append("    regional: ")
                .append(toIndentedString(regional))
                .append(newLine)
                .append("    campaignReferenceId: ")
                .append(toIndentedString(campaignReferenceId))
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
