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
 * Represents ResourcesRcsMoConfigurationRequest model.
 */
public class ResourcesRcsMoConfigurationRequest extends ResourcesMoConfigurationRequest {

    private String resourceKey;

    private ResourcesPlatformDocs platform;

    private String resource;

    private ResourcesRcsMoActionDocs forwarding;

    private ResourcesUseConversations conversations;

    private ResourcesAutoResponseActionRequest autoResponse;

    private ResourcesBlockListConfigurationRequest blockListConfiguration;

    /**
     * Constructs a new {@link ResourcesRcsMoConfigurationRequest} instance.
     */
    public ResourcesRcsMoConfigurationRequest() {
        super("RCS");
    }

    /**
     * Sets resourceKey.
     * <p>
     * Field description:
     * Required if &lt;code&gt;resource&lt;/code&gt; not present.
     *
     * @param resourceKey
     * @return This {@link ResourcesRcsMoConfigurationRequest instance}.
     */
    public ResourcesRcsMoConfigurationRequest resourceKey(String resourceKey) {
        this.resourceKey = resourceKey;
        return this;
    }

    /**
     * Returns resourceKey.
     * <p>
     * Field description:
     * Required if &lt;code&gt;resource&lt;/code&gt; not present.
     *
     * @return resourceKey
     */
    @JsonProperty("resourceKey")
    public String getResourceKey() {
        return resourceKey;
    }

    /**
     * Sets resourceKey.
     * <p>
     * Field description:
     * Required if &lt;code&gt;resource&lt;/code&gt; not present.
     *
     * @param resourceKey
     */
    @JsonProperty("resourceKey")
    public void setResourceKey(String resourceKey) {
        this.resourceKey = resourceKey;
    }

    /**
     * Sets platform.
     *
     * @param platform
     * @return This {@link ResourcesRcsMoConfigurationRequest instance}.
     */
    public ResourcesRcsMoConfigurationRequest platform(ResourcesPlatformDocs platform) {
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
     * Sets resource.
     * <p>
     * Field description:
     * Required if &lt;code&gt;resourceKey&lt;/code&gt; not present.
     *
     * @param resource
     * @return This {@link ResourcesRcsMoConfigurationRequest instance}.
     */
    public ResourcesRcsMoConfigurationRequest resource(String resource) {
        this.resource = resource;
        return this;
    }

    /**
     * Returns resource.
     * <p>
     * Field description:
     * Required if &lt;code&gt;resourceKey&lt;/code&gt; not present.
     *
     * @return resource
     */
    @JsonProperty("resource")
    public String getResource() {
        return resource;
    }

    /**
     * Sets resource.
     * <p>
     * Field description:
     * Required if &lt;code&gt;resourceKey&lt;/code&gt; not present.
     *
     * @param resource
     */
    @JsonProperty("resource")
    public void setResource(String resource) {
        this.resource = resource;
    }

    /**
     * Sets forwarding.
     *
     * @param forwarding
     * @return This {@link ResourcesRcsMoConfigurationRequest instance}.
     */
    public ResourcesRcsMoConfigurationRequest forwarding(ResourcesRcsMoActionDocs forwarding) {
        this.forwarding = forwarding;
        return this;
    }

    /**
     * Returns forwarding.
     *
     * @return forwarding
     */
    @JsonProperty("forwarding")
    public ResourcesRcsMoActionDocs getForwarding() {
        return forwarding;
    }

    /**
     * Sets forwarding.
     *
     * @param forwarding
     */
    @JsonProperty("forwarding")
    public void setForwarding(ResourcesRcsMoActionDocs forwarding) {
        this.forwarding = forwarding;
    }

    /**
     * Sets conversations.
     *
     * @param conversations
     * @return This {@link ResourcesRcsMoConfigurationRequest instance}.
     */
    public ResourcesRcsMoConfigurationRequest conversations(ResourcesUseConversations conversations) {
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
     * @return This {@link ResourcesRcsMoConfigurationRequest instance}.
     */
    public ResourcesRcsMoConfigurationRequest autoResponse(ResourcesAutoResponseActionRequest autoResponse) {
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
     * @return This {@link ResourcesRcsMoConfigurationRequest instance}.
     */
    public ResourcesRcsMoConfigurationRequest blockListConfiguration(
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
        ResourcesRcsMoConfigurationRequest resourcesRcsMoConfigurationRequest = (ResourcesRcsMoConfigurationRequest) o;
        return Objects.equals(this.resourceKey, resourcesRcsMoConfigurationRequest.resourceKey)
                && Objects.equals(this.platform, resourcesRcsMoConfigurationRequest.platform)
                && Objects.equals(this.resource, resourcesRcsMoConfigurationRequest.resource)
                && Objects.equals(this.forwarding, resourcesRcsMoConfigurationRequest.forwarding)
                && Objects.equals(this.conversations, resourcesRcsMoConfigurationRequest.conversations)
                && Objects.equals(this.autoResponse, resourcesRcsMoConfigurationRequest.autoResponse)
                && Objects.equals(
                        this.blockListConfiguration, resourcesRcsMoConfigurationRequest.blockListConfiguration)
                && super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                resourceKey,
                platform,
                resource,
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
                .append("class ResourcesRcsMoConfigurationRequest {")
                .append(newLine)
                .append("    ")
                .append(toIndentedString(super.toString()))
                .append(newLine)
                .append("    resourceKey: ")
                .append(toIndentedString(resourceKey))
                .append(newLine)
                .append("    platform: ")
                .append(toIndentedString(platform))
                .append(newLine)
                .append("    resource: ")
                .append(toIndentedString(resource))
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
