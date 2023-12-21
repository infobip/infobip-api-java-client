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
 * Represents WhatsAppTemplateQualityPushEventChange model.
 */
public class WhatsAppTemplateQualityPushEventChange extends WhatsAppTemplatePushEventChange {

    private WhatsAppPreviousTemplateQuality previousQualityScore;

    private WhatsAppNewTemplateQuality newQualityScore;

    /**
     * Constructs a new {@link WhatsAppTemplateQualityPushEventChange} instance.
     */
    public WhatsAppTemplateQualityPushEventChange() {
        super("TEMPLATE_QUALITY_UPDATE");
    }

    /**
     * Sets previousQualityScore.
     * <p>
     * The field is required.
     *
     * @param previousQualityScore
     * @return This {@link WhatsAppTemplateQualityPushEventChange instance}.
     */
    public WhatsAppTemplateQualityPushEventChange previousQualityScore(
            WhatsAppPreviousTemplateQuality previousQualityScore) {
        this.previousQualityScore = previousQualityScore;
        return this;
    }

    /**
     * Returns previousQualityScore.
     * <p>
     * The field is required.
     *
     * @return previousQualityScore
     */
    @JsonProperty("previousQualityScore")
    public WhatsAppPreviousTemplateQuality getPreviousQualityScore() {
        return previousQualityScore;
    }

    /**
     * Sets previousQualityScore.
     * <p>
     * The field is required.
     *
     * @param previousQualityScore
     */
    @JsonProperty("previousQualityScore")
    public void setPreviousQualityScore(WhatsAppPreviousTemplateQuality previousQualityScore) {
        this.previousQualityScore = previousQualityScore;
    }

    /**
     * Sets newQualityScore.
     * <p>
     * The field is required.
     *
     * @param newQualityScore
     * @return This {@link WhatsAppTemplateQualityPushEventChange instance}.
     */
    public WhatsAppTemplateQualityPushEventChange newQualityScore(WhatsAppNewTemplateQuality newQualityScore) {
        this.newQualityScore = newQualityScore;
        return this;
    }

    /**
     * Returns newQualityScore.
     * <p>
     * The field is required.
     *
     * @return newQualityScore
     */
    @JsonProperty("newQualityScore")
    public WhatsAppNewTemplateQuality getNewQualityScore() {
        return newQualityScore;
    }

    /**
     * Sets newQualityScore.
     * <p>
     * The field is required.
     *
     * @param newQualityScore
     */
    @JsonProperty("newQualityScore")
    public void setNewQualityScore(WhatsAppNewTemplateQuality newQualityScore) {
        this.newQualityScore = newQualityScore;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WhatsAppTemplateQualityPushEventChange whatsAppTemplateQualityPushEventChange =
                (WhatsAppTemplateQualityPushEventChange) o;
        return Objects.equals(this.previousQualityScore, whatsAppTemplateQualityPushEventChange.previousQualityScore)
                && Objects.equals(this.newQualityScore, whatsAppTemplateQualityPushEventChange.newQualityScore)
                && super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(previousQualityScore, newQualityScore, super.hashCode());
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class WhatsAppTemplateQualityPushEventChange {")
                .append(newLine)
                .append("    ")
                .append(toIndentedString(super.toString()))
                .append(newLine)
                .append("    previousQualityScore: ")
                .append(toIndentedString(previousQualityScore))
                .append(newLine)
                .append("    newQualityScore: ")
                .append(toIndentedString(newQualityScore))
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
