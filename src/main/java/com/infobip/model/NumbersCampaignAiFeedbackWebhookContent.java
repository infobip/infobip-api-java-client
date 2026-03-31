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
import java.util.UUID;

/**
 * Event content.
 */
public class NumbersCampaignAiFeedbackWebhookContent {

    private UUID aiCampaignFeedbackRequestUuid;

    /**
     * Sets aiCampaignFeedbackRequestUuid.
     * <p>
     * Field description:
     * Unique identifier of the AI review request, matching the requestUuid returned when the campaign was submitted for AI review.
     *
     * @param aiCampaignFeedbackRequestUuid
     * @return This {@link NumbersCampaignAiFeedbackWebhookContent instance}.
     */
    public NumbersCampaignAiFeedbackWebhookContent aiCampaignFeedbackRequestUuid(UUID aiCampaignFeedbackRequestUuid) {
        this.aiCampaignFeedbackRequestUuid = aiCampaignFeedbackRequestUuid;
        return this;
    }

    /**
     * Returns aiCampaignFeedbackRequestUuid.
     * <p>
     * Field description:
     * Unique identifier of the AI review request, matching the requestUuid returned when the campaign was submitted for AI review.
     *
     * @return aiCampaignFeedbackRequestUuid
     */
    @JsonProperty("aiCampaignFeedbackRequestUuid")
    public UUID getAiCampaignFeedbackRequestUuid() {
        return aiCampaignFeedbackRequestUuid;
    }

    /**
     * Sets aiCampaignFeedbackRequestUuid.
     * <p>
     * Field description:
     * Unique identifier of the AI review request, matching the requestUuid returned when the campaign was submitted for AI review.
     *
     * @param aiCampaignFeedbackRequestUuid
     */
    @JsonProperty("aiCampaignFeedbackRequestUuid")
    public void setAiCampaignFeedbackRequestUuid(UUID aiCampaignFeedbackRequestUuid) {
        this.aiCampaignFeedbackRequestUuid = aiCampaignFeedbackRequestUuid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        NumbersCampaignAiFeedbackWebhookContent numbersCampaignAiFeedbackWebhookContent =
                (NumbersCampaignAiFeedbackWebhookContent) o;
        return Objects.equals(
                this.aiCampaignFeedbackRequestUuid,
                numbersCampaignAiFeedbackWebhookContent.aiCampaignFeedbackRequestUuid);
    }

    @Override
    public int hashCode() {
        return Objects.hash(aiCampaignFeedbackRequestUuid);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class NumbersCampaignAiFeedbackWebhookContent {")
                .append(newLine)
                .append("    aiCampaignFeedbackRequestUuid: ")
                .append(toIndentedString(aiCampaignFeedbackRequestUuid))
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
