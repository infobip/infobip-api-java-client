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
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

/**
 * Represents ResourcesMoConfigurationRequest model.
 */
@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.EXISTING_PROPERTY,
        property = "channel",
        visible = true)
@JsonSubTypes({
    @JsonSubTypes.Type(value = ResourcesAppleMbMoConfigurationRequest.class, name = "APPLE_MB"),
    @JsonSubTypes.Type(value = ResourcesEmailDomainMoConfigurationRequest.class, name = "EMAIL"),
    @JsonSubTypes.Type(value = ResourcesInstagramDmMoConfigurationRequest.class, name = "INSTAGRAM_DM"),
    @JsonSubTypes.Type(value = ResourcesKakaoSangdamMoConfigurationRequest.class, name = "KAKAO_SANGDAM"),
    @JsonSubTypes.Type(value = ResourcesLineOaMoConfigurationRequest.class, name = "LINE_OA"),
    @JsonSubTypes.Type(value = ResourcesMessengerMoConfigurationRequest.class, name = "MESSENGER"),
    @JsonSubTypes.Type(value = ResourcesMmsMoConfigurationRequest.class, name = "MMS"),
    @JsonSubTypes.Type(value = ResourcesOpenChannelMoConfigurationRequest.class, name = "OPEN_CHANNEL"),
    @JsonSubTypes.Type(value = ResourcesRcsMoConfigurationRequest.class, name = "RCS"),
    @JsonSubTypes.Type(value = ResourcesSmsMoConfigurationRequest.class, name = "SMS"),
    @JsonSubTypes.Type(value = ResourcesTelegramMoConfigurationRequest.class, name = "TELEGRAM"),
    @JsonSubTypes.Type(value = ResourcesTikTokBmMoConfigurationRequest.class, name = "TIKTOK_BM"),
    @JsonSubTypes.Type(value = ResourcesViberBmMoConfigurationRequest.class, name = "VIBER_BM"),
    @JsonSubTypes.Type(value = ResourcesViberBotMoConfigurationRequest.class, name = "VIBER_BOT"),
    @JsonSubTypes.Type(value = ResourcesWhatsAppMoConfigurationRequest.class, name = "WHATSAPP"),
    @JsonSubTypes.Type(value = ResourcesZaloFollowerMoConfigurationRequest.class, name = "ZALO_FOLLOWER"),
    @JsonSubTypes.Type(value = ResourcesZaloZnsMoConfigurationRequest.class, name = "ZALO_ZNS"),
})
public abstract class ResourcesMoConfigurationRequest {

    private String keyword;

    private String username;

    private Set<ResourcesUnsetOption> unset = null;

    protected final ResourcesConfigurationType channel;

    /**
     * Constructs a new {@link ResourcesMoConfigurationRequest} instance.
     */
    public ResourcesMoConfigurationRequest(String channel) {
        this.channel = ResourcesConfigurationType.fromValue(channel);
    }

    /**
     * Sets keyword.
     * <p>
     * Field description:
     * Omitting this value or sending &lt;code&gt;NULL&lt;/code&gt; will set keyword to &lt;code&gt;NULL&lt;/code&gt; because it is a valid keyword which will match all values.
     *
     * @param keyword
     * @return This {@link ResourcesMoConfigurationRequest instance}.
     */
    public ResourcesMoConfigurationRequest keyword(String keyword) {
        this.keyword = keyword;
        return this;
    }

    /**
     * Returns keyword.
     * <p>
     * Field description:
     * Omitting this value or sending &lt;code&gt;NULL&lt;/code&gt; will set keyword to &lt;code&gt;NULL&lt;/code&gt; because it is a valid keyword which will match all values.
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
     * Omitting this value or sending &lt;code&gt;NULL&lt;/code&gt; will set keyword to &lt;code&gt;NULL&lt;/code&gt; because it is a valid keyword which will match all values.
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
     * Sets username that will be applied in appropriate actions.
     *
     * @param username
     * @return This {@link ResourcesMoConfigurationRequest instance}.
     */
    public ResourcesMoConfigurationRequest username(String username) {
        this.username = username;
        return this;
    }

    /**
     * Returns username.
     * <p>
     * Field description:
     * Sets username that will be applied in appropriate actions.
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
     * Sets username that will be applied in appropriate actions.
     *
     * @param username
     */
    @JsonProperty("username")
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * Sets unset.
     * <p>
     * Field description:
     * Used for unsetting configuration options. &lt;br /&gt; &lt;b&gt;If a property appears both in unset, and in the body of the request, it will &lt;u&gt;FIRST&lt;/u&gt; be removed, and then &lt;u&gt;UPDATED&lt;/u&gt; with the value from the request body!&lt;/b&gt;
     *
     * @param unset
     * @return This {@link ResourcesMoConfigurationRequest instance}.
     */
    public ResourcesMoConfigurationRequest unset(Set<ResourcesUnsetOption> unset) {
        this.unset = unset;
        return this;
    }

    /**
     * Adds and item into unset.
     * <p>
     * Field description:
     * Used for unsetting configuration options. &lt;br /&gt; &lt;b&gt;If a property appears both in unset, and in the body of the request, it will &lt;u&gt;FIRST&lt;/u&gt; be removed, and then &lt;u&gt;UPDATED&lt;/u&gt; with the value from the request body!&lt;/b&gt;
     *
     * @param unsetItem The item to be added to the list.
     * @return This {@link ResourcesMoConfigurationRequest instance}.
     */
    public ResourcesMoConfigurationRequest addUnsetItem(ResourcesUnsetOption unsetItem) {
        if (this.unset == null) {
            this.unset = new LinkedHashSet<>();
        }
        this.unset.add(unsetItem);
        return this;
    }

    /**
     * Returns unset.
     * <p>
     * Field description:
     * Used for unsetting configuration options. &lt;br /&gt; &lt;b&gt;If a property appears both in unset, and in the body of the request, it will &lt;u&gt;FIRST&lt;/u&gt; be removed, and then &lt;u&gt;UPDATED&lt;/u&gt; with the value from the request body!&lt;/b&gt;
     *
     * @return unset
     */
    @JsonProperty("unset")
    public Set<ResourcesUnsetOption> getUnset() {
        return unset;
    }

    /**
     * Sets unset.
     * <p>
     * Field description:
     * Used for unsetting configuration options. &lt;br /&gt; &lt;b&gt;If a property appears both in unset, and in the body of the request, it will &lt;u&gt;FIRST&lt;/u&gt; be removed, and then &lt;u&gt;UPDATED&lt;/u&gt; with the value from the request body!&lt;/b&gt;
     *
     * @param unset
     */
    @JsonProperty("unset")
    public void setUnset(Set<ResourcesUnsetOption> unset) {
        this.unset = unset;
    }

    /**
     * Returns channel.
     * <p>
     * The field is required.
     *
     * @return channel
     */
    @JsonProperty("channel")
    public ResourcesConfigurationType getChannel() {
        return channel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ResourcesMoConfigurationRequest resourcesMoConfigurationRequest = (ResourcesMoConfigurationRequest) o;
        return Objects.equals(this.keyword, resourcesMoConfigurationRequest.keyword)
                && Objects.equals(this.username, resourcesMoConfigurationRequest.username)
                && Objects.equals(this.unset, resourcesMoConfigurationRequest.unset)
                && Objects.equals(this.channel, resourcesMoConfigurationRequest.channel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(keyword, username, unset, channel);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class ResourcesMoConfigurationRequest {")
                .append(newLine)
                .append("    keyword: ")
                .append(toIndentedString(keyword))
                .append(newLine)
                .append("    username: ")
                .append(toIndentedString(username))
                .append(newLine)
                .append("    unset: ")
                .append(toIndentedString(unset))
                .append(newLine)
                .append("    channel: ")
                .append(toIndentedString(channel))
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
