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
 * Represents ResourcesWhatsAppMoConfigurationRequest model.
 */
public class ResourcesWhatsAppMoConfigurationRequest extends ResourcesMoConfigurationRequest {

    private String numberKey;

    private ResourcesPlatformDocs platform;

    private String number;

    private ResourcesWhatsAppMoActionDocs forwarding;

    private ResourcesUseConversations conversations;

    private ResourcesAutoResponseActionRequest autoResponse;

    private ResourcesBlockListConfigurationRequest blockListConfiguration;

    /**
     * Constructs a new {@link ResourcesWhatsAppMoConfigurationRequest} instance.
     */
    public ResourcesWhatsAppMoConfigurationRequest() {
        super("WHATSAPP");
    }

    /**
     * Sets numberKey.
     * <p>
     * Field description:
     * Required if &lt;code&gt;number&lt;/code&gt; not present.
     *
     * @param numberKey
     * @return This {@link ResourcesWhatsAppMoConfigurationRequest instance}.
     */
    public ResourcesWhatsAppMoConfigurationRequest numberKey(String numberKey) {
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
     * @return This {@link ResourcesWhatsAppMoConfigurationRequest instance}.
     */
    public ResourcesWhatsAppMoConfigurationRequest platform(ResourcesPlatformDocs platform) {
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
     * @return This {@link ResourcesWhatsAppMoConfigurationRequest instance}.
     */
    public ResourcesWhatsAppMoConfigurationRequest number(String number) {
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
     * Sets forwarding.
     *
     * @param forwarding
     * @return This {@link ResourcesWhatsAppMoConfigurationRequest instance}.
     */
    public ResourcesWhatsAppMoConfigurationRequest forwarding(ResourcesWhatsAppMoActionDocs forwarding) {
        this.forwarding = forwarding;
        return this;
    }

    /**
     * Returns forwarding.
     *
     * @return forwarding
     */
    @JsonProperty("forwarding")
    public ResourcesWhatsAppMoActionDocs getForwarding() {
        return forwarding;
    }

    /**
     * Sets forwarding.
     *
     * @param forwarding
     */
    @JsonProperty("forwarding")
    public void setForwarding(ResourcesWhatsAppMoActionDocs forwarding) {
        this.forwarding = forwarding;
    }

    /**
     * Sets conversations.
     *
     * @param conversations
     * @return This {@link ResourcesWhatsAppMoConfigurationRequest instance}.
     */
    public ResourcesWhatsAppMoConfigurationRequest conversations(ResourcesUseConversations conversations) {
        this.conversations = conversations;
        return this;
    }

    /**
     * Returns conversations.
     *
     * @return conversations
     */
    @JsonProperty("conversations")
    public ResourcesUseConversations getConversations() {
        return conversations;
    }

    /**
     * Sets conversations.
     *
     * @param conversations
     */
    @JsonProperty("conversations")
    public void setConversations(ResourcesUseConversations conversations) {
        this.conversations = conversations;
    }

    /**
     * Sets autoResponse.
     *
     * @param autoResponse
     * @return This {@link ResourcesWhatsAppMoConfigurationRequest instance}.
     */
    public ResourcesWhatsAppMoConfigurationRequest autoResponse(ResourcesAutoResponseActionRequest autoResponse) {
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
     * @return This {@link ResourcesWhatsAppMoConfigurationRequest instance}.
     */
    public ResourcesWhatsAppMoConfigurationRequest blockListConfiguration(
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
        ResourcesWhatsAppMoConfigurationRequest resourcesWhatsAppMoConfigurationRequest =
                (ResourcesWhatsAppMoConfigurationRequest) o;
        return Objects.equals(this.numberKey, resourcesWhatsAppMoConfigurationRequest.numberKey)
                && Objects.equals(this.platform, resourcesWhatsAppMoConfigurationRequest.platform)
                && Objects.equals(this.number, resourcesWhatsAppMoConfigurationRequest.number)
                && Objects.equals(this.forwarding, resourcesWhatsAppMoConfigurationRequest.forwarding)
                && Objects.equals(this.conversations, resourcesWhatsAppMoConfigurationRequest.conversations)
                && Objects.equals(this.autoResponse, resourcesWhatsAppMoConfigurationRequest.autoResponse)
                && Objects.equals(
                        this.blockListConfiguration, resourcesWhatsAppMoConfigurationRequest.blockListConfiguration)
                && super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                numberKey,
                platform,
                number,
                forwarding,
                conversations,
                autoResponse,
                blockListConfiguration,
                super.hashCode());
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class ResourcesWhatsAppMoConfigurationRequest {")
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
                .append("    forwarding: ")
                .append(toIndentedString(forwarding))
                .append(newLine)
                .append("    conversations: ")
                .append(toIndentedString(conversations))
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
