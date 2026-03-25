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
 * Response for configuring MO resource.
 */
public class ResourcesMoConfigurationResponse {

    private String configurationKey;

    private ResourcesConfigurationType channel;

    private String keyword;

    private String username;

    private ResourcesPlatformDocs platform;

    private ResourcesMoActionDocs forwarding;

    private ResourcesUseConversations conversations;

    private ResourcesUseAnswers answers;

    private ResourcesAutoResponseActionResponse autoResponse;

    private ResourcesBlockListConfigurationResponse blockListConfiguration;

    /**
     * Sets configurationKey.
     * <p>
     * Field description:
     * The key of a stored configuration.
     * <p>
     * The field is required.
     *
     * @param configurationKey
     * @return This {@link ResourcesMoConfigurationResponse instance}.
     */
    public ResourcesMoConfigurationResponse configurationKey(String configurationKey) {
        this.configurationKey = configurationKey;
        return this;
    }

    /**
     * Returns configurationKey.
     * <p>
     * Field description:
     * The key of a stored configuration.
     * <p>
     * The field is required.
     *
     * @return configurationKey
     */
    @JsonProperty("configurationKey")
    public String getConfigurationKey() {
        return configurationKey;
    }

    /**
     * Sets configurationKey.
     * <p>
     * Field description:
     * The key of a stored configuration.
     * <p>
     * The field is required.
     *
     * @param configurationKey
     */
    @JsonProperty("configurationKey")
    public void setConfigurationKey(String configurationKey) {
        this.configurationKey = configurationKey;
    }

    /**
     * Sets channel.
     *
     * @param channel
     * @return This {@link ResourcesMoConfigurationResponse instance}.
     */
    public ResourcesMoConfigurationResponse channel(ResourcesConfigurationType channel) {
        this.channel = channel;
        return this;
    }

    /**
     * Returns channel.
     *
     * @return channel
     */
    @JsonProperty("channel")
    public ResourcesConfigurationType getChannel() {
        return channel;
    }

    /**
     * Sets channel.
     *
     * @param channel
     */
    @JsonProperty("channel")
    public void setChannel(ResourcesConfigurationType channel) {
        this.channel = channel;
    }

    /**
     * Sets keyword.
     * <p>
     * Field description:
     * Configuration keyword.
     *
     * @param keyword
     * @return This {@link ResourcesMoConfigurationResponse instance}.
     */
    public ResourcesMoConfigurationResponse keyword(String keyword) {
        this.keyword = keyword;
        return this;
    }

    /**
     * Returns keyword.
     * <p>
     * Field description:
     * Configuration keyword.
     *
     * @return keyword
     */
    @JsonProperty("keyword")
    public String getKeyword() {
        return keyword;
    }

    /**
     * Sets keyword.
     * <p>
     * Field description:
     * Configuration keyword.
     *
     * @param keyword
     */
    @JsonProperty("keyword")
    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    /**
     * Sets username.
     * <p>
     * Field description:
     * Configuration username.
     *
     * @param username
     * @return This {@link ResourcesMoConfigurationResponse instance}.
     */
    public ResourcesMoConfigurationResponse username(String username) {
        this.username = username;
        return this;
    }

    /**
     * Returns username.
     * <p>
     * Field description:
     * Configuration username.
     *
     * @return username
     */
    @JsonProperty("username")
    public String getUsername() {
        return username;
    }

    /**
     * Sets username.
     * <p>
     * Field description:
     * Configuration username.
     *
     * @param username
     */
    @JsonProperty("username")
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * Sets platform.
     *
     * @param platform
     * @return This {@link ResourcesMoConfigurationResponse instance}.
     */
    public ResourcesMoConfigurationResponse platform(ResourcesPlatformDocs platform) {
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
     * Sets forwarding.
     *
     * @param forwarding
     * @return This {@link ResourcesMoConfigurationResponse instance}.
     */
    public ResourcesMoConfigurationResponse forwarding(ResourcesMoActionDocs forwarding) {
        this.forwarding = forwarding;
        return this;
    }

    /**
     * Returns forwarding.
     *
     * @return forwarding
     */
    @JsonProperty("forwarding")
    public ResourcesMoActionDocs getForwarding() {
        return forwarding;
    }

    /**
     * Sets forwarding.
     *
     * @param forwarding
     */
    @JsonProperty("forwarding")
    public void setForwarding(ResourcesMoActionDocs forwarding) {
        this.forwarding = forwarding;
    }

    /**
     * Sets conversations.
     *
     * @param conversations
     * @return This {@link ResourcesMoConfigurationResponse instance}.
     */
    public ResourcesMoConfigurationResponse conversations(ResourcesUseConversations conversations) {
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
     * @return This {@link ResourcesMoConfigurationResponse instance}.
     */
    public ResourcesMoConfigurationResponse answers(ResourcesUseAnswers answers) {
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

    /**
     * Sets autoResponse.
     *
     * @param autoResponse
     * @return This {@link ResourcesMoConfigurationResponse instance}.
     */
    public ResourcesMoConfigurationResponse autoResponse(ResourcesAutoResponseActionResponse autoResponse) {
        this.autoResponse = autoResponse;
        return this;
    }

    /**
     * Returns autoResponse.
     *
     * @return autoResponse
     */
    @JsonProperty("autoResponse")
    public ResourcesAutoResponseActionResponse getAutoResponse() {
        return autoResponse;
    }

    /**
     * Sets autoResponse.
     *
     * @param autoResponse
     */
    @JsonProperty("autoResponse")
    public void setAutoResponse(ResourcesAutoResponseActionResponse autoResponse) {
        this.autoResponse = autoResponse;
    }

    /**
     * Sets blockListConfiguration.
     *
     * @param blockListConfiguration
     * @return This {@link ResourcesMoConfigurationResponse instance}.
     */
    public ResourcesMoConfigurationResponse blockListConfiguration(
            ResourcesBlockListConfigurationResponse blockListConfiguration) {
        this.blockListConfiguration = blockListConfiguration;
        return this;
    }

    /**
     * Returns blockListConfiguration.
     *
     * @return blockListConfiguration
     */
    @JsonProperty("blockListConfiguration")
    public ResourcesBlockListConfigurationResponse getBlockListConfiguration() {
        return blockListConfiguration;
    }

    /**
     * Sets blockListConfiguration.
     *
     * @param blockListConfiguration
     */
    @JsonProperty("blockListConfiguration")
    public void setBlockListConfiguration(ResourcesBlockListConfigurationResponse blockListConfiguration) {
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
        ResourcesMoConfigurationResponse resourcesMoConfigurationResponse = (ResourcesMoConfigurationResponse) o;
        return Objects.equals(this.configurationKey, resourcesMoConfigurationResponse.configurationKey)
                && Objects.equals(this.channel, resourcesMoConfigurationResponse.channel)
                && Objects.equals(this.keyword, resourcesMoConfigurationResponse.keyword)
                && Objects.equals(this.username, resourcesMoConfigurationResponse.username)
                && Objects.equals(this.platform, resourcesMoConfigurationResponse.platform)
                && Objects.equals(this.forwarding, resourcesMoConfigurationResponse.forwarding)
                && Objects.equals(this.conversations, resourcesMoConfigurationResponse.conversations)
                && Objects.equals(this.answers, resourcesMoConfigurationResponse.answers)
                && Objects.equals(this.autoResponse, resourcesMoConfigurationResponse.autoResponse)
                && Objects.equals(this.blockListConfiguration, resourcesMoConfigurationResponse.blockListConfiguration);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                configurationKey,
                channel,
                keyword,
                username,
                platform,
                forwarding,
                conversations,
                answers,
                autoResponse,
                blockListConfiguration);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class ResourcesMoConfigurationResponse {")
                .append(newLine)
                .append("    configurationKey: ")
                .append(toIndentedString(configurationKey))
                .append(newLine)
                .append("    channel: ")
                .append(toIndentedString(channel))
                .append(newLine)
                .append("    keyword: ")
                .append(toIndentedString(keyword))
                .append(newLine)
                .append("    username: ")
                .append(toIndentedString(username))
                .append(newLine)
                .append("    platform: ")
                .append(toIndentedString(platform))
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
