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
 * Represents ResourcesMmsMoConfigurationRequest model.
 */
public class ResourcesMmsMoConfigurationRequest extends ResourcesMoConfigurationRequest {

    private String numberKey;

    private ResourcesPlatformDocs platform;

    private String number;

    private String countryCode;

    private ResourcesMmsMoActionDocs forwarding;

    private ResourcesAutoResponseActionRequest autoResponse;

    private ResourcesBlockListConfigurationRequest blockListConfiguration;

    /**
     * Constructs a new {@link ResourcesMmsMoConfigurationRequest} instance.
     */
    public ResourcesMmsMoConfigurationRequest() {
        super("MMS");
    }

    /**
     * Sets numberKey.
     * <p>
     * Field description:
     * Required if &lt;code&gt;number&lt;/code&gt; not present.
     *
     * @param numberKey
     * @return This {@link ResourcesMmsMoConfigurationRequest instance}.
     */
    public ResourcesMmsMoConfigurationRequest numberKey(String numberKey) {
        this.numberKey = numberKey;
        return this;
    }

    /**
     * Returns numberKey.
     * <p>
     * Field description:
     * Required if &lt;code&gt;number&lt;/code&gt; not present.
     *
     * @return numberKey
     */
    @JsonProperty("numberKey")
    public String getNumberKey() {
        return numberKey;
    }

    /**
     * Sets numberKey.
     * <p>
     * Field description:
     * Required if &lt;code&gt;number&lt;/code&gt; not present.
     *
     * @param numberKey
     */
    @JsonProperty("numberKey")
    public void setNumberKey(String numberKey) {
        this.numberKey = numberKey;
    }

    /**
     * Sets platform.
     *
     * @param platform
     * @return This {@link ResourcesMmsMoConfigurationRequest instance}.
     */
    public ResourcesMmsMoConfigurationRequest platform(ResourcesPlatformDocs platform) {
        this.platform = platform;
        return this;
    }

    /**
     * Returns platform.
     *
     * @return platform
     */
    @JsonProperty("platform")
    public ResourcesPlatformDocs getPlatform() {
        return platform;
    }

    /**
     * Sets platform.
     *
     * @param platform
     */
    @JsonProperty("platform")
    public void setPlatform(ResourcesPlatformDocs platform) {
        this.platform = platform;
    }

    /**
     * Sets number.
     * <p>
     * Field description:
     * Required if &lt;code&gt;numberKey&lt;/code&gt; not present.
     *
     * @param number
     * @return This {@link ResourcesMmsMoConfigurationRequest instance}.
     */
    public ResourcesMmsMoConfigurationRequest number(String number) {
        this.number = number;
        return this;
    }

    /**
     * Returns number.
     * <p>
     * Field description:
     * Required if &lt;code&gt;numberKey&lt;/code&gt; not present.
     *
     * @return number
     */
    @JsonProperty("number")
    public String getNumber() {
        return number;
    }

    /**
     * Sets number.
     * <p>
     * Field description:
     * Required if &lt;code&gt;numberKey&lt;/code&gt; not present.
     *
     * @param number
     */
    @JsonProperty("number")
    public void setNumber(String number) {
        this.number = number;
    }

    /**
     * Sets countryCode.
     * <p>
     * Field description:
     * Country code in two-letter ISO standard. Required for identifying country specific resources (for instance, short code number types).
     *
     * @param countryCode
     * @return This {@link ResourcesMmsMoConfigurationRequest instance}.
     */
    public ResourcesMmsMoConfigurationRequest countryCode(String countryCode) {
        this.countryCode = countryCode;
        return this;
    }

    /**
     * Returns countryCode.
     * <p>
     * Field description:
     * Country code in two-letter ISO standard. Required for identifying country specific resources (for instance, short code number types).
     *
     * @return countryCode
     */
    @JsonProperty("countryCode")
    public String getCountryCode() {
        return countryCode;
    }

    /**
     * Sets countryCode.
     * <p>
     * Field description:
     * Country code in two-letter ISO standard. Required for identifying country specific resources (for instance, short code number types).
     *
     * @param countryCode
     */
    @JsonProperty("countryCode")
    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    /**
     * Sets forwarding.
     *
     * @param forwarding
     * @return This {@link ResourcesMmsMoConfigurationRequest instance}.
     */
    public ResourcesMmsMoConfigurationRequest forwarding(ResourcesMmsMoActionDocs forwarding) {
        this.forwarding = forwarding;
        return this;
    }

    /**
     * Returns forwarding.
     *
     * @return forwarding
     */
    @JsonProperty("forwarding")
    public ResourcesMmsMoActionDocs getForwarding() {
        return forwarding;
    }

    /**
     * Sets forwarding.
     *
     * @param forwarding
     */
    @JsonProperty("forwarding")
    public void setForwarding(ResourcesMmsMoActionDocs forwarding) {
        this.forwarding = forwarding;
    }

    /**
     * Sets autoResponse.
     *
     * @param autoResponse
     * @return This {@link ResourcesMmsMoConfigurationRequest instance}.
     */
    public ResourcesMmsMoConfigurationRequest autoResponse(ResourcesAutoResponseActionRequest autoResponse) {
        this.autoResponse = autoResponse;
        return this;
    }

    /**
     * Returns autoResponse.
     *
     * @return autoResponse
     */
    @JsonProperty("autoResponse")
    public ResourcesAutoResponseActionRequest getAutoResponse() {
        return autoResponse;
    }

    /**
     * Sets autoResponse.
     *
     * @param autoResponse
     */
    @JsonProperty("autoResponse")
    public void setAutoResponse(ResourcesAutoResponseActionRequest autoResponse) {
        this.autoResponse = autoResponse;
    }

    /**
     * Sets blockListConfiguration.
     *
     * @param blockListConfiguration
     * @return This {@link ResourcesMmsMoConfigurationRequest instance}.
     */
    public ResourcesMmsMoConfigurationRequest blockListConfiguration(
            ResourcesBlockListConfigurationRequest blockListConfiguration) {
        this.blockListConfiguration = blockListConfiguration;
        return this;
    }

    /**
     * Returns blockListConfiguration.
     *
     * @return blockListConfiguration
     */
    @JsonProperty("blockListConfiguration")
    public ResourcesBlockListConfigurationRequest getBlockListConfiguration() {
        return blockListConfiguration;
    }

    /**
     * Sets blockListConfiguration.
     *
     * @param blockListConfiguration
     */
    @JsonProperty("blockListConfiguration")
    public void setBlockListConfiguration(ResourcesBlockListConfigurationRequest blockListConfiguration) {
        this.blockListConfiguration = blockListConfiguration;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ResourcesMmsMoConfigurationRequest resourcesMmsMoConfigurationRequest = (ResourcesMmsMoConfigurationRequest) o;
        return Objects.equals(this.numberKey, resourcesMmsMoConfigurationRequest.numberKey)
                && Objects.equals(this.platform, resourcesMmsMoConfigurationRequest.platform)
                && Objects.equals(this.number, resourcesMmsMoConfigurationRequest.number)
                && Objects.equals(this.countryCode, resourcesMmsMoConfigurationRequest.countryCode)
                && Objects.equals(this.forwarding, resourcesMmsMoConfigurationRequest.forwarding)
                && Objects.equals(this.autoResponse, resourcesMmsMoConfigurationRequest.autoResponse)
                && Objects.equals(
                        this.blockListConfiguration, resourcesMmsMoConfigurationRequest.blockListConfiguration)
                && super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                numberKey,
                platform,
                number,
                countryCode,
                forwarding,
                autoResponse,
                blockListConfiguration,
                super.hashCode());
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class ResourcesMmsMoConfigurationRequest {")
                .append(newLine)
                .append("    ")
                .append(toIndentedString(super.toString()))
                .append(newLine)
                .append("    numberKey: ")
                .append(toIndentedString(numberKey))
                .append(newLine)
                .append("    platform: ")
                .append(toIndentedString(platform))
                .append(newLine)
                .append("    number: ")
                .append(toIndentedString(number))
                .append(newLine)
                .append("    countryCode: ")
                .append(toIndentedString(countryCode))
                .append(newLine)
                .append("    forwarding: ")
                .append(toIndentedString(forwarding))
                .append(newLine)
                .append("    autoResponse: ")
                .append(toIndentedString(autoResponse))
                .append(newLine)
                .append("    blockListConfiguration: ")
                .append(toIndentedString(blockListConfiguration))
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
