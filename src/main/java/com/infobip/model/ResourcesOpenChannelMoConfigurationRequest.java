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
 * Represents ResourcesOpenChannelMoConfigurationRequest model.
 */
public class ResourcesOpenChannelMoConfigurationRequest extends ResourcesMoConfigurationRequest {

    private String resourceKey;

    private ResourcesPlatformDocs platform;

    private String resource;

    private ResourcesOpenChannelMoActionDocs forwarding;

    private ResourcesUseConversations conversations;

    private ResourcesUseAnswers answers;

    /**
     * Constructs a new {@link ResourcesOpenChannelMoConfigurationRequest} instance.
     */
    public ResourcesOpenChannelMoConfigurationRequest() {
        super("OPEN_CHANNEL");
    }

    /**
     * Sets resourceKey.
     * <p>
     * Field description:
     * Required if &lt;code&gt;resource&lt;/code&gt; not present.
     *
     * @param resourceKey
     * @return This {@link ResourcesOpenChannelMoConfigurationRequest instance}.
     */
    public ResourcesOpenChannelMoConfigurationRequest resourceKey(String resourceKey) {
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
     * @return This {@link ResourcesOpenChannelMoConfigurationRequest instance}.
     */
    public ResourcesOpenChannelMoConfigurationRequest platform(ResourcesPlatformDocs platform) {
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
     * @return This {@link ResourcesOpenChannelMoConfigurationRequest instance}.
     */
    public ResourcesOpenChannelMoConfigurationRequest resource(String resource) {
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
     * @return This {@link ResourcesOpenChannelMoConfigurationRequest instance}.
     */
    public ResourcesOpenChannelMoConfigurationRequest forwarding(ResourcesOpenChannelMoActionDocs forwarding) {
        this.forwarding = forwarding;
        return this;
    }

    /**
     * Returns forwarding.
     *
     * @return forwarding
     */
    @JsonProperty("forwarding")
    public ResourcesOpenChannelMoActionDocs getForwarding() {
        return forwarding;
    }

    /**
     * Sets forwarding.
     *
     * @param forwarding
     */
    @JsonProperty("forwarding")
    public void setForwarding(ResourcesOpenChannelMoActionDocs forwarding) {
        this.forwarding = forwarding;
    }

    /**
     * Sets conversations.
     *
     * @param conversations
     * @return This {@link ResourcesOpenChannelMoConfigurationRequest instance}.
     */
    public ResourcesOpenChannelMoConfigurationRequest conversations(ResourcesUseConversations conversations) {
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
     * Sets answers.
     *
     * @param answers
     * @return This {@link ResourcesOpenChannelMoConfigurationRequest instance}.
     */
    public ResourcesOpenChannelMoConfigurationRequest answers(ResourcesUseAnswers answers) {
        this.answers = answers;
        return this;
    }

    /**
     * Returns answers.
     *
     * @return answers
     */
    @JsonProperty("answers")
    public ResourcesUseAnswers getAnswers() {
        return answers;
    }

    /**
     * Sets answers.
     *
     * @param answers
     */
    @JsonProperty("answers")
    public void setAnswers(ResourcesUseAnswers answers) {
        this.answers = answers;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ResourcesOpenChannelMoConfigurationRequest resourcesOpenChannelMoConfigurationRequest =
                (ResourcesOpenChannelMoConfigurationRequest) o;
        return Objects.equals(this.resourceKey, resourcesOpenChannelMoConfigurationRequest.resourceKey)
                && Objects.equals(this.platform, resourcesOpenChannelMoConfigurationRequest.platform)
                && Objects.equals(this.resource, resourcesOpenChannelMoConfigurationRequest.resource)
                && Objects.equals(this.forwarding, resourcesOpenChannelMoConfigurationRequest.forwarding)
                && Objects.equals(this.conversations, resourcesOpenChannelMoConfigurationRequest.conversations)
                && Objects.equals(this.answers, resourcesOpenChannelMoConfigurationRequest.answers)
                && super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(resourceKey, platform, resource, forwarding, conversations, answers, super.hashCode());
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class ResourcesOpenChannelMoConfigurationRequest {")
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
                .append("    answers: ")
                .append(toIndentedString(answers))
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
