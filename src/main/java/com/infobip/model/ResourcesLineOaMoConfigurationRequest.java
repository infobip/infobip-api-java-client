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
 * Represents ResourcesLineOaMoConfigurationRequest model.
 */
public class ResourcesLineOaMoConfigurationRequest extends ResourcesMoConfigurationRequest {

    private String resourceKey;

    private String resource;

    private ResourcesLineOaMoActionDocs forwarding;

    private ResourcesUseConversations conversations;

    /**
     * Constructs a new {@link ResourcesLineOaMoConfigurationRequest} instance.
     */
    public ResourcesLineOaMoConfigurationRequest() {
        super("LINE_OA");
    }

    /**
     * Sets resourceKey.
     * <p>
     * Field description:
     * Required if &lt;code&gt;resource&lt;/code&gt; not present.
     *
     * @param resourceKey
     * @return This {@link ResourcesLineOaMoConfigurationRequest instance}.
     */
    public ResourcesLineOaMoConfigurationRequest resourceKey(String resourceKey) {
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
     * Sets resource.
     * <p>
     * Field description:
     * Required if &lt;code&gt;resourceKey&lt;/code&gt; not present.
     *
     * @param resource
     * @return This {@link ResourcesLineOaMoConfigurationRequest instance}.
     */
    public ResourcesLineOaMoConfigurationRequest resource(String resource) {
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
     * @return This {@link ResourcesLineOaMoConfigurationRequest instance}.
     */
    public ResourcesLineOaMoConfigurationRequest forwarding(ResourcesLineOaMoActionDocs forwarding) {
        this.forwarding = forwarding;
        return this;
    }

    /**
     * Returns forwarding.
     *
     * @return forwarding
     */
    @JsonProperty("forwarding")
    public ResourcesLineOaMoActionDocs getForwarding() {
        return forwarding;
    }

    /**
     * Sets forwarding.
     *
     * @param forwarding
     */
    @JsonProperty("forwarding")
    public void setForwarding(ResourcesLineOaMoActionDocs forwarding) {
        this.forwarding = forwarding;
    }

    /**
     * Sets conversations.
     *
     * @param conversations
     * @return This {@link ResourcesLineOaMoConfigurationRequest instance}.
     */
    public ResourcesLineOaMoConfigurationRequest conversations(ResourcesUseConversations conversations) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ResourcesLineOaMoConfigurationRequest resourcesLineOaMoConfigurationRequest =
                (ResourcesLineOaMoConfigurationRequest) o;
        return Objects.equals(this.resourceKey, resourcesLineOaMoConfigurationRequest.resourceKey)
                && Objects.equals(this.resource, resourcesLineOaMoConfigurationRequest.resource)
                && Objects.equals(this.forwarding, resourcesLineOaMoConfigurationRequest.forwarding)
                && Objects.equals(this.conversations, resourcesLineOaMoConfigurationRequest.conversations)
                && super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(resourceKey, resource, forwarding, conversations, super.hashCode());
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class ResourcesLineOaMoConfigurationRequest {")
                .append(newLine)
                .append("    ")
                .append(toIndentedString(super.toString()))
                .append(newLine)
                .append("    resourceKey: ")
                .append(toIndentedString(resourceKey))
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
