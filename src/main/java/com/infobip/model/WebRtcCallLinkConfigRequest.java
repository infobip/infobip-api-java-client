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
public class WebRtcCallLinkConfigRequest {

    private String name;

    private WebRtcInitialOptions initialOptions;

    private WebRtcCallOptions callOptions;

    private WebRtcTheme theme;

    private Boolean isDefault;

    private String subdomainId;

    /**
     * Sets name.
     * <p>
     * Field description:
     * Configuration name.
     * <p>
     * The field is required.
     *
     * @param name
     * @return This {@link WebRtcCallLinkConfigRequest instance}.
     */
    public WebRtcCallLinkConfigRequest name(String name) {
        this.name = name;
        return this;
    }

    /**
     * Returns name.
     * <p>
     * Field description:
     * Configuration name.
     * <p>
     * The field is required.
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
     * Configuration name.
     * <p>
     * The field is required.
     *
     * @param name
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Sets initialOptions.
     *
     * @param initialOptions
     * @return This {@link WebRtcCallLinkConfigRequest instance}.
     */
    public WebRtcCallLinkConfigRequest initialOptions(WebRtcInitialOptions initialOptions) {
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
     * @return This {@link WebRtcCallLinkConfigRequest instance}.
     */
    public WebRtcCallLinkConfigRequest callOptions(WebRtcCallOptions callOptions) {
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
     * @return This {@link WebRtcCallLinkConfigRequest instance}.
     */
    public WebRtcCallLinkConfigRequest theme(WebRtcTheme theme) {
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
     * Sets isDefault.
     * <p>
     * Field description:
     * Indicates whether the specific call link configuration is the default one and used with any call link without a callLinkConfigId. Only one configuration can be default.If you don&#39;t have a configuration, the basic Infobip theme with default values and minimal options will be used.If you want to use another configuration, set this value to &#x60;true&#x60; for the call link config you wish as default.
     *
     * @param isDefault
     * @return This {@link WebRtcCallLinkConfigRequest instance}.
     */
    public WebRtcCallLinkConfigRequest isDefault(Boolean isDefault) {
        this.isDefault = isDefault;
        return this;
    }

    /**
     * Returns isDefault.
     * <p>
     * Field description:
     * Indicates whether the specific call link configuration is the default one and used with any call link without a callLinkConfigId. Only one configuration can be default.If you don&#39;t have a configuration, the basic Infobip theme with default values and minimal options will be used.If you want to use another configuration, set this value to &#x60;true&#x60; for the call link config you wish as default.
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
     * Indicates whether the specific call link configuration is the default one and used with any call link without a callLinkConfigId. Only one configuration can be default.If you don&#39;t have a configuration, the basic Infobip theme with default values and minimal options will be used.If you want to use another configuration, set this value to &#x60;true&#x60; for the call link config you wish as default.
     *
     * @param isDefault
     */
    @JsonProperty("isDefault")
    public void setIsDefault(Boolean isDefault) {
        this.isDefault = isDefault;
    }

    /**
     * Sets subdomainId.
     * <p>
     * Field description:
     * Subdomain to use for every call link generated for this configuration.If not defined, no subdomain will be used.
     *
     * @param subdomainId
     * @return This {@link WebRtcCallLinkConfigRequest instance}.
     */
    public WebRtcCallLinkConfigRequest subdomainId(String subdomainId) {
        this.subdomainId = subdomainId;
        return this;
    }

    /**
     * Returns subdomainId.
     * <p>
     * Field description:
     * Subdomain to use for every call link generated for this configuration.If not defined, no subdomain will be used.
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
     * Subdomain to use for every call link generated for this configuration.If not defined, no subdomain will be used.
     *
     * @param subdomainId
     */
    @JsonProperty("subdomainId")
    public void setSubdomainId(String subdomainId) {
        this.subdomainId = subdomainId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WebRtcCallLinkConfigRequest webRtcCallLinkConfigRequest = (WebRtcCallLinkConfigRequest) o;
        return Objects.equals(this.name, webRtcCallLinkConfigRequest.name)
                && Objects.equals(this.initialOptions, webRtcCallLinkConfigRequest.initialOptions)
                && Objects.equals(this.callOptions, webRtcCallLinkConfigRequest.callOptions)
                && Objects.equals(this.theme, webRtcCallLinkConfigRequest.theme)
                && Objects.equals(this.isDefault, webRtcCallLinkConfigRequest.isDefault)
                && Objects.equals(this.subdomainId, webRtcCallLinkConfigRequest.subdomainId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, initialOptions, callOptions, theme, isDefault, subdomainId);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class WebRtcCallLinkConfigRequest {")
                .append(newLine)
                .append("    name: ")
                .append(toIndentedString(name))
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
                .append("    isDefault: ")
                .append(toIndentedString(isDefault))
                .append(newLine)
                .append("    subdomainId: ")
                .append(toIndentedString(subdomainId))
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
