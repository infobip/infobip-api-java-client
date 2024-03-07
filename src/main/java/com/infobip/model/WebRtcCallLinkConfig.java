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
 * Call link configuration.
 */
public class WebRtcCallLinkConfig {

    private String id;

    private String name;

    private Boolean isDefault;

    private WebRtcInitialOptions initialOptions;

    private WebRtcCallOptions callOptions;

    private WebRtcTheme theme;

    private String subdomainId;

    private WebRtcWebhook webhook;

    /**
     * Sets id.
     * <p>
     * Field description:
     * Configuration ID. Once a call link is created, this value might be sent in the request as one specific call link configuration to be used by the call link.
     *
     * @param id
     * @return This {@link WebRtcCallLinkConfig instance}.
     */
    public WebRtcCallLinkConfig id(String id) {
        this.id = id;
        return this;
    }

    /**
     * Returns id.
     * <p>
     * Field description:
     * Configuration ID. Once a call link is created, this value might be sent in the request as one specific call link configuration to be used by the call link.
     *
     * @return id
     */
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    /**
     * Sets id.
     * <p>
     * Field description:
     * Configuration ID. Once a call link is created, this value might be sent in the request as one specific call link configuration to be used by the call link.
     *
     * @param id
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Sets name.
     * <p>
     * Field description:
     * Configuration name or description. It doesn&#39;t have to be unique.
     *
     * @param name
     * @return This {@link WebRtcCallLinkConfig instance}.
     */
    public WebRtcCallLinkConfig name(String name) {
        this.name = name;
        return this;
    }

    /**
     * Returns name.
     * <p>
     * Field description:
     * Configuration name or description. It doesn&#39;t have to be unique.
     *
     * @return name
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * Sets name.
     * <p>
     * Field description:
     * Configuration name or description. It doesn&#39;t have to be unique.
     *
     * @param name
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Sets isDefault.
     * <p>
     * Field description:
     * When you create call link without callLinkConfigId, the one marked as default will be used. Only one configuration can be default.If you don&#39;t have a configuration, the basic Infobip theme with default values and minimal options will be used.If you want to set another configuration as default, specify its value when adding or updating it.
     *
     * @param isDefault
     * @return This {@link WebRtcCallLinkConfig instance}.
     */
    public WebRtcCallLinkConfig isDefault(Boolean isDefault) {
        this.isDefault = isDefault;
        return this;
    }

    /**
     * Returns isDefault.
     * <p>
     * Field description:
     * When you create call link without callLinkConfigId, the one marked as default will be used. Only one configuration can be default.If you don&#39;t have a configuration, the basic Infobip theme with default values and minimal options will be used.If you want to set another configuration as default, specify its value when adding or updating it.
     *
     * @return isDefault
     */
    @JsonProperty("isDefault")
    public Boolean getIsDefault() {
        return isDefault;
    }

    /**
     * Sets isDefault.
     * <p>
     * Field description:
     * When you create call link without callLinkConfigId, the one marked as default will be used. Only one configuration can be default.If you don&#39;t have a configuration, the basic Infobip theme with default values and minimal options will be used.If you want to set another configuration as default, specify its value when adding or updating it.
     *
     * @param isDefault
     */
    @JsonProperty("isDefault")
    public void setIsDefault(Boolean isDefault) {
        this.isDefault = isDefault;
    }

    /**
     * Sets initialOptions.
     *
     * @param initialOptions
     * @return This {@link WebRtcCallLinkConfig instance}.
     */
    public WebRtcCallLinkConfig initialOptions(WebRtcInitialOptions initialOptions) {
        this.initialOptions = initialOptions;
        return this;
    }

    /**
     * Returns initialOptions.
     *
     * @return initialOptions
     */
    @JsonProperty("initialOptions")
    public WebRtcInitialOptions getInitialOptions() {
        return initialOptions;
    }

    /**
     * Sets initialOptions.
     *
     * @param initialOptions
     */
    @JsonProperty("initialOptions")
    public void setInitialOptions(WebRtcInitialOptions initialOptions) {
        this.initialOptions = initialOptions;
    }

    /**
     * Sets callOptions.
     *
     * @param callOptions
     * @return This {@link WebRtcCallLinkConfig instance}.
     */
    public WebRtcCallLinkConfig callOptions(WebRtcCallOptions callOptions) {
        this.callOptions = callOptions;
        return this;
    }

    /**
     * Returns callOptions.
     *
     * @return callOptions
     */
    @JsonProperty("callOptions")
    public WebRtcCallOptions getCallOptions() {
        return callOptions;
    }

    /**
     * Sets callOptions.
     *
     * @param callOptions
     */
    @JsonProperty("callOptions")
    public void setCallOptions(WebRtcCallOptions callOptions) {
        this.callOptions = callOptions;
    }

    /**
     * Sets theme.
     *
     * @param theme
     * @return This {@link WebRtcCallLinkConfig instance}.
     */
    public WebRtcCallLinkConfig theme(WebRtcTheme theme) {
        this.theme = theme;
        return this;
    }

    /**
     * Returns theme.
     *
     * @return theme
     */
    @JsonProperty("theme")
    public WebRtcTheme getTheme() {
        return theme;
    }

    /**
     * Sets theme.
     *
     * @param theme
     */
    @JsonProperty("theme")
    public void setTheme(WebRtcTheme theme) {
        this.theme = theme;
    }

    /**
     * Sets subdomainId.
     * <p>
     * Field description:
     * Id of the subdomain that will be set on every call link generated with this configuration. If undefined, call links will be generated without a subdomain.
     *
     * @param subdomainId
     * @return This {@link WebRtcCallLinkConfig instance}.
     */
    public WebRtcCallLinkConfig subdomainId(String subdomainId) {
        this.subdomainId = subdomainId;
        return this;
    }

    /**
     * Returns subdomainId.
     * <p>
     * Field description:
     * Id of the subdomain that will be set on every call link generated with this configuration. If undefined, call links will be generated without a subdomain.
     *
     * @return subdomainId
     */
    @JsonProperty("subdomainId")
    public String getSubdomainId() {
        return subdomainId;
    }

    /**
     * Sets subdomainId.
     * <p>
     * Field description:
     * Id of the subdomain that will be set on every call link generated with this configuration. If undefined, call links will be generated without a subdomain.
     *
     * @param subdomainId
     */
    @JsonProperty("subdomainId")
    public void setSubdomainId(String subdomainId) {
        this.subdomainId = subdomainId;
    }

    /**
     * Sets webhook.
     *
     * @param webhook
     * @return This {@link WebRtcCallLinkConfig instance}.
     */
    public WebRtcCallLinkConfig webhook(WebRtcWebhook webhook) {
        this.webhook = webhook;
        return this;
    }

    /**
     * Returns webhook.
     *
     * @return webhook
     */
    @JsonProperty("webhook")
    public WebRtcWebhook getWebhook() {
        return webhook;
    }

    /**
     * Sets webhook.
     *
     * @param webhook
     */
    @JsonProperty("webhook")
    public void setWebhook(WebRtcWebhook webhook) {
        this.webhook = webhook;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WebRtcCallLinkConfig webRtcCallLinkConfig = (WebRtcCallLinkConfig) o;
        return Objects.equals(this.id, webRtcCallLinkConfig.id)
                && Objects.equals(this.name, webRtcCallLinkConfig.name)
                && Objects.equals(this.isDefault, webRtcCallLinkConfig.isDefault)
                && Objects.equals(this.initialOptions, webRtcCallLinkConfig.initialOptions)
                && Objects.equals(this.callOptions, webRtcCallLinkConfig.callOptions)
                && Objects.equals(this.theme, webRtcCallLinkConfig.theme)
                && Objects.equals(this.subdomainId, webRtcCallLinkConfig.subdomainId)
                && Objects.equals(this.webhook, webRtcCallLinkConfig.webhook);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, isDefault, initialOptions, callOptions, theme, subdomainId, webhook);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class WebRtcCallLinkConfig {")
                .append(newLine)
                .append("    id: ")
                .append(toIndentedString(id))
                .append(newLine)
                .append("    name: ")
                .append(toIndentedString(name))
                .append(newLine)
                .append("    isDefault: ")
                .append(toIndentedString(isDefault))
                .append(newLine)
                .append("    initialOptions: ")
                .append(toIndentedString(initialOptions))
                .append(newLine)
                .append("    callOptions: ")
                .append(toIndentedString(callOptions))
                .append(newLine)
                .append("    theme: ")
                .append(toIndentedString(theme))
                .append(newLine)
                .append("    subdomainId: ")
                .append(toIndentedString(subdomainId))
                .append(newLine)
                .append("    webhook: ")
                .append(toIndentedString(webhook))
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
