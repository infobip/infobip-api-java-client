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
import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * List of events provided in a single request.
 */
public class ResourcesWebhookNotifApiDocResult {

    private ResourcesWebhookNotifEventType event;

    private OffsetDateTime receivedAt;

    private ResourcesWebhookNotifApiDocResultContent content;

    private Platform platform;

    /**
     * Sets event.
     * <p>
     * The field is required.
     *
     * @param event
     * @return This {@link ResourcesWebhookNotifApiDocResult instance}.
     */
    public ResourcesWebhookNotifApiDocResult event(ResourcesWebhookNotifEventType event) {
        this.event = event;
        return this;
    }

    /**
     * Returns event.
     * <p>
     * The field is required.
     *
     * @return event
     */
    @JsonProperty("event")
    public ResourcesWebhookNotifEventType getEvent() {
        return event;
    }

    /**
     * Sets event.
     * <p>
     * The field is required.
     *
     * @param event
     */
    @JsonProperty("event")
    public void setEvent(ResourcesWebhookNotifEventType event) {
        this.event = event;
    }

    /**
     * Sets receivedAt.
     * <p>
     * Field description:
     * Date and time when the request status was updated.
     * <p>
     * The field is required.
     *
     * @param receivedAt
     * @return This {@link ResourcesWebhookNotifApiDocResult instance}.
     */
    public ResourcesWebhookNotifApiDocResult receivedAt(OffsetDateTime receivedAt) {
        this.receivedAt = receivedAt;
        return this;
    }

    /**
     * Returns receivedAt.
     * <p>
     * Field description:
     * Date and time when the request status was updated.
     * <p>
     * The field is required.
     *
     * @return receivedAt
     */
    @JsonProperty("receivedAt")
    public OffsetDateTime getReceivedAt() {
        return receivedAt;
    }

    /**
     * Sets receivedAt.
     * <p>
     * Field description:
     * Date and time when the request status was updated.
     * <p>
     * The field is required.
     *
     * @param receivedAt
     */
    @JsonProperty("receivedAt")
    public void setReceivedAt(OffsetDateTime receivedAt) {
        this.receivedAt = receivedAt;
    }

    /**
     * Sets content.
     * <p>
     * The field is required.
     *
     * @param content
     * @return This {@link ResourcesWebhookNotifApiDocResult instance}.
     */
    public ResourcesWebhookNotifApiDocResult content(ResourcesWebhookNotifApiDocResultContent content) {
        this.content = content;
        return this;
    }

    /**
     * Returns content.
     * <p>
     * The field is required.
     *
     * @return content
     */
    @JsonProperty("content")
    public ResourcesWebhookNotifApiDocResultContent getContent() {
        return content;
    }

    /**
     * Sets content.
     * <p>
     * The field is required.
     *
     * @param content
     */
    @JsonProperty("content")
    public void setContent(ResourcesWebhookNotifApiDocResultContent content) {
        this.content = content;
    }

    /**
     * Sets platform.
     *
     * @param platform
     * @return This {@link ResourcesWebhookNotifApiDocResult instance}.
     */
    public ResourcesWebhookNotifApiDocResult platform(Platform platform) {
        this.platform = platform;
        return this;
    }

    /**
     * Returns platform.
     *
     * @return platform
     */
    @JsonProperty("platform")
    public Platform getPlatform() {
        return platform;
    }

    /**
     * Sets platform.
     *
     * @param platform
     */
    @JsonProperty("platform")
    public void setPlatform(Platform platform) {
        this.platform = platform;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ResourcesWebhookNotifApiDocResult resourcesWebhookNotifApiDocResult = (ResourcesWebhookNotifApiDocResult) o;
        return Objects.equals(this.event, resourcesWebhookNotifApiDocResult.event)
                && Objects.equals(this.receivedAt, resourcesWebhookNotifApiDocResult.receivedAt)
                && Objects.equals(this.content, resourcesWebhookNotifApiDocResult.content)
                && Objects.equals(this.platform, resourcesWebhookNotifApiDocResult.platform);
    }

    @Override
    public int hashCode() {
        return Objects.hash(event, receivedAt, content, platform);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class ResourcesWebhookNotifApiDocResult {")
                .append(newLine)
                .append("    event: ")
                .append(toIndentedString(event))
                .append(newLine)
                .append("    receivedAt: ")
                .append(toIndentedString(receivedAt))
                .append(newLine)
                .append("    content: ")
                .append(toIndentedString(content))
                .append(newLine)
                .append("    platform: ")
                .append(toIndentedString(platform))
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
