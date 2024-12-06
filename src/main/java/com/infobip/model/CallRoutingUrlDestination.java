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
 * Represents CallRoutingUrlDestination model.
 */
public class CallRoutingUrlDestination extends CallRoutingDestination {

    private String url;

    private SecurityConfig securityConfig;

    /**
     * Constructs a new {@link CallRoutingUrlDestination} instance.
     */
    public CallRoutingUrlDestination() {
        super("URL");
    }

    /**
     * Sets url.
     * <p>
     * Field description:
     * URL endpoint which provides next destination to be tried in a route as a response to &#x60;POST&#x60; HTTP request sent by the Infobip Platform. Returned destination must be of &#x60;ENDPOINT_DESTINATION&#x60; type.
     * <p>
     * The field is required.
     *
     * @param url
     * @return This {@link CallRoutingUrlDestination instance}.
     */
    public CallRoutingUrlDestination url(String url) {
        this.url = url;
        return this;
    }

    /**
     * Returns url.
     * <p>
     * Field description:
     * URL endpoint which provides next destination to be tried in a route as a response to &#x60;POST&#x60; HTTP request sent by the Infobip Platform. Returned destination must be of &#x60;ENDPOINT_DESTINATION&#x60; type.
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
     * URL endpoint which provides next destination to be tried in a route as a response to &#x60;POST&#x60; HTTP request sent by the Infobip Platform. Returned destination must be of &#x60;ENDPOINT_DESTINATION&#x60; type.
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
     * @return This {@link CallRoutingUrlDestination instance}.
     */
    public CallRoutingUrlDestination securityConfig(SecurityConfig securityConfig) {
        this.securityConfig = securityConfig;
        return this;
    }

    /**
     * Returns securityConfig.
     *
     * @return securityConfig
     */
    @JsonProperty("securityConfig")
    public SecurityConfig getSecurityConfig() {
        return securityConfig;
    }

    /**
     * Sets securityConfig.
     *
     * @param securityConfig
     */
    @JsonProperty("securityConfig")
    public void setSecurityConfig(SecurityConfig securityConfig) {
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
        CallRoutingUrlDestination callRoutingUrlDestination = (CallRoutingUrlDestination) o;
        return Objects.equals(this.url, callRoutingUrlDestination.url)
                && Objects.equals(this.securityConfig, callRoutingUrlDestination.securityConfig)
                && super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(url, securityConfig, super.hashCode());
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class CallRoutingUrlDestination {")
                .append(newLine)
                .append("    ")
                .append(toIndentedString(super.toString()))
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
