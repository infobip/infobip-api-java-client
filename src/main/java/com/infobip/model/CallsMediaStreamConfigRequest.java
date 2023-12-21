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
 * Represents CallsMediaStreamConfigRequest model.
 */
public class CallsMediaStreamConfigRequest {

    private String name;

    private String url;

    private CallsUrlSecurityConfig securityConfig;

    /**
     * Sets name.
     * <p>
     * Field description:
     * Media-stream configuration name.
     * <p>
     * The field is required.
     *
     * @param name
     * @return This {@link CallsMediaStreamConfigRequest instance}.
     */
    public CallsMediaStreamConfigRequest name(String name) {
        this.name = name;
        return this;
    }

    /**
     * Returns name.
     * <p>
     * Field description:
     * Media-stream configuration name.
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
     * Media-stream configuration name.
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
     * Sets url.
     * <p>
     * Field description:
     * Destination websocket or load balancer URL.
     * <p>
     * The field is required.
     *
     * @param url
     * @return This {@link CallsMediaStreamConfigRequest instance}.
     */
    public CallsMediaStreamConfigRequest url(String url) {
        this.url = url;
        return this;
    }

    /**
     * Returns url.
     * <p>
     * Field description:
     * Destination websocket or load balancer URL.
     * <p>
     * The field is required.
     *
     * @return url
     */
    @JsonProperty("url")
    public String getUrl() {
        return url;
    }

    /**
     * Sets url.
     * <p>
     * Field description:
     * Destination websocket or load balancer URL.
     * <p>
     * The field is required.
     *
     * @param url
     */
    @JsonProperty("url")
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * Sets securityConfig.
     *
     * @param securityConfig
     * @return This {@link CallsMediaStreamConfigRequest instance}.
     */
    public CallsMediaStreamConfigRequest securityConfig(CallsUrlSecurityConfig securityConfig) {
        this.securityConfig = securityConfig;
        return this;
    }

    /**
     * Returns securityConfig.
     *
     * @return securityConfig
     */
    @JsonProperty("securityConfig")
    public CallsUrlSecurityConfig getSecurityConfig() {
        return securityConfig;
    }

    /**
     * Sets securityConfig.
     *
     * @param securityConfig
     */
    @JsonProperty("securityConfig")
    public void setSecurityConfig(CallsUrlSecurityConfig securityConfig) {
        this.securityConfig = securityConfig;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CallsMediaStreamConfigRequest callsMediaStreamConfigRequest = (CallsMediaStreamConfigRequest) o;
        return Objects.equals(this.name, callsMediaStreamConfigRequest.name)
                && Objects.equals(this.url, callsMediaStreamConfigRequest.url)
                && Objects.equals(this.securityConfig, callsMediaStreamConfigRequest.securityConfig);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, url, securityConfig);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class CallsMediaStreamConfigRequest {")
                .append(newLine)
                .append("    name: ")
                .append(toIndentedString(name))
                .append(newLine)
                .append("    url: ")
                .append(toIndentedString(url))
                .append(newLine)
                .append("    securityConfig: ")
                .append(toIndentedString(securityConfig))
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
