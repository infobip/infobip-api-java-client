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

    private Integer priority;

    private Integer weight;

    private String url;

    private SecurityConfig securityConfig;

    /**
     * Constructs a new {@link CallRoutingUrlDestination} instance.
     */
    public CallRoutingUrlDestination() {
        super("URL");
    }

    /**
     * Sets priority.
     * <p>
     * Field description:
     * Priority of the destination within a route. Destinations with lower value have higher priority. Either all or no destination need to have this value defined.
     *
     * @param priority
     * @return This {@link CallRoutingUrlDestination instance}.
     */
    public CallRoutingUrlDestination priority(Integer priority) {
        this.priority = priority;
        return this;
    }

    /**
     * Returns priority.
     * <p>
     * Field description:
     * Priority of the destination within a route. Destinations with lower value have higher priority. Either all or no destination need to have this value defined.
     *
     * @return priority
     */
    @JsonProperty("priority")
    public Integer getPriority() {
        return priority;
    }

    /**
     * Sets priority.
     * <p>
     * Field description:
     * Priority of the destination within a route. Destinations with lower value have higher priority. Either all or no destination need to have this value defined.
     *
     * @param priority
     */
    @JsonProperty("priority")
    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    /**
     * Sets weight.
     * <p>
     * Field description:
     * Weight of the destination within a route. It specifies how much traffic is handled by destination relative to other destinations within the same priority level. Values are evaluated relative to each other and they don&#39;t need to add up to 100. Either all or no destination need to have this value defined.
     *
     * @param weight
     * @return This {@link CallRoutingUrlDestination instance}.
     */
    public CallRoutingUrlDestination weight(Integer weight) {
        this.weight = weight;
        return this;
    }

    /**
     * Returns weight.
     * <p>
     * Field description:
     * Weight of the destination within a route. It specifies how much traffic is handled by destination relative to other destinations within the same priority level. Values are evaluated relative to each other and they don&#39;t need to add up to 100. Either all or no destination need to have this value defined.
     *
     * @return weight
     */
    @JsonProperty("weight")
    public Integer getWeight() {
        return weight;
    }

    /**
     * Sets weight.
     * <p>
     * Field description:
     * Weight of the destination within a route. It specifies how much traffic is handled by destination relative to other destinations within the same priority level. Values are evaluated relative to each other and they don&#39;t need to add up to 100. Either all or no destination need to have this value defined.
     *
     * @param weight
     */
    @JsonProperty("weight")
    public void setWeight(Integer weight) {
        this.weight = weight;
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
        return Objects.equals(this.priority, callRoutingUrlDestination.priority)
                && Objects.equals(this.weight, callRoutingUrlDestination.weight)
                && Objects.equals(this.url, callRoutingUrlDestination.url)
                && Objects.equals(this.securityConfig, callRoutingUrlDestination.securityConfig)
                && super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(priority, weight, url, securityConfig, super.hashCode());
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
                .append("    priority: ")
                .append(toIndentedString(priority))
                .append(newLine)
                .append("    weight: ")
                .append(toIndentedString(weight))
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
