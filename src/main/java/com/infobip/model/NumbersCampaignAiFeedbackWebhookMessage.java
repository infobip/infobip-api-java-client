/*
 * This class is auto generated from the Infobip OpenAPI specification
 * through the OpenAPI Specification Client API libraries (Re)Generator (OSCAR),
 * powered by the OpenAPI Generator (https://openapi-generator.tech).
 *
 * Do not edit manually. To learn how to raise an issue, see the CONTRIBUTING guide
 * or contact us @ support@infobip.com.
 */

package com.infobip.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * Incoming events
 */
public class NumbersCampaignAiFeedbackWebhookMessage {
    /**
     * The name of the event.
     */
    public enum EventEnum {
        AI_CAMPAIGN_FEEDBACK("AI_CAMPAIGN_FEEDBACK");

        private String value;

        EventEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static EventEnum fromValue(String value) {
            for (EventEnum enumElement : EventEnum.values()) {
                if (enumElement.value.equals(value)) {
                    return enumElement;
                }
            }
            throw new IllegalArgumentException("Unexpected enum value '" + value + "'.");
        }
    }

    private EventEnum event;

    private OffsetDateTime receivedAt;

    private NumbersCampaignAiFeedbackWebhookContent content;

    private NumbersCampaignWebhookPlatform platform;

    /**
     * Sets event.
     * <p>
     * Field description:
     * The name of the event.
     *
     * @param event
     * @return This {@link NumbersCampaignAiFeedbackWebhookMessage instance}.
     */
    public NumbersCampaignAiFeedbackWebhookMessage event(EventEnum event) {
        this.event = event;
        return this;
    }

    /**
     * Returns event.
     * <p>
     * Field description:
     * The name of the event.
     *
     * @return event
     */
    @JsonProperty("event")
    public EventEnum getEvent() {
        return event;
    }

    /**
     * Sets event.
     * <p>
     * Field description:
     * The name of the event.
     *
     * @param event
     */
    @JsonProperty("event")
    public void setEvent(EventEnum event) {
        this.event = event;
    }

    /**
     * Sets receivedAt.
     * <p>
     * Field description:
     * Date and time when Infobip received the event.
     *
     * @param receivedAt
     * @return This {@link NumbersCampaignAiFeedbackWebhookMessage instance}.
     */
    public NumbersCampaignAiFeedbackWebhookMessage receivedAt(OffsetDateTime receivedAt) {
        this.receivedAt = receivedAt;
        return this;
    }

    /**
     * Returns receivedAt.
     * <p>
     * Field description:
     * Date and time when Infobip received the event.
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
     * Date and time when Infobip received the event.
     *
     * @param receivedAt
     */
    @JsonProperty("receivedAt")
    public void setReceivedAt(OffsetDateTime receivedAt) {
        this.receivedAt = receivedAt;
    }

    /**
     * Sets content.
     *
     * @param content
     * @return This {@link NumbersCampaignAiFeedbackWebhookMessage instance}.
     */
    public NumbersCampaignAiFeedbackWebhookMessage content(NumbersCampaignAiFeedbackWebhookContent content) {
        this.content = content;
        return this;
    }

    /**
     * Returns content.
     *
     * @return content
     */
    @JsonProperty("content")
    public NumbersCampaignAiFeedbackWebhookContent getContent() {
        return content;
    }

    /**
     * Sets content.
     *
     * @param content
     */
    @JsonProperty("content")
    public void setContent(NumbersCampaignAiFeedbackWebhookContent content) {
        this.content = content;
    }

    /**
     * Sets platform.
     *
     * @param platform
     * @return This {@link NumbersCampaignAiFeedbackWebhookMessage instance}.
     */
    public NumbersCampaignAiFeedbackWebhookMessage platform(NumbersCampaignWebhookPlatform platform) {
        this.platform = platform;
        return this;
    }

    /**
     * Returns platform.
     *
     * @return platform
     */
    @JsonProperty("platform")
    public NumbersCampaignWebhookPlatform getPlatform() {
        return platform;
    }

    /**
     * Sets platform.
     *
     * @param platform
     */
    @JsonProperty("platform")
    public void setPlatform(NumbersCampaignWebhookPlatform platform) {
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
        NumbersCampaignAiFeedbackWebhookMessage numbersCampaignAiFeedbackWebhookMessage =
                (NumbersCampaignAiFeedbackWebhookMessage) o;
        return Objects.equals(this.event, numbersCampaignAiFeedbackWebhookMessage.event)
                && Objects.equals(this.receivedAt, numbersCampaignAiFeedbackWebhookMessage.receivedAt)
                && Objects.equals(this.content, numbersCampaignAiFeedbackWebhookMessage.content)
                && Objects.equals(this.platform, numbersCampaignAiFeedbackWebhookMessage.platform);
    }

    @Override
    public int hashCode() {
        return Objects.hash(event, receivedAt, content, platform);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class NumbersCampaignAiFeedbackWebhookMessage {")
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
