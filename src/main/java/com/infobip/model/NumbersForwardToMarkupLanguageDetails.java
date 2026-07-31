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
 * Represents NumbersForwardToMarkupLanguageDetails model.
 */
public class NumbersForwardToMarkupLanguageDetails extends NumbersVoiceActionDetails {

    private Long markupLanguageConfigId;

    /**
     * Constructs a new {@link NumbersForwardToMarkupLanguageDetails} instance.
     */
    public NumbersForwardToMarkupLanguageDetails() {
        super("FORWARD_TO_MARKUP_LANGUAGE");
    }

    /**
     * Sets markupLanguageConfigId.
     * <p>
     * Field description:
     * Unique ID of the Markup Language.
     * <p>
     * The field is required.
     *
     * @param markupLanguageConfigId
     * @return This {@link NumbersForwardToMarkupLanguageDetails instance}.
     */
    public NumbersForwardToMarkupLanguageDetails markupLanguageConfigId(Long markupLanguageConfigId) {
        this.markupLanguageConfigId = markupLanguageConfigId;
        return this;
    }

    /**
     * Returns markupLanguageConfigId.
     * <p>
     * Field description:
     * Unique ID of the Markup Language.
     * <p>
     * The field is required.
     *
     * @return markupLanguageConfigId
     */
    @JsonProperty("markupLanguageConfigId")
    public Long getMarkupLanguageConfigId() {
        return markupLanguageConfigId;
    }

    /**
     * Sets markupLanguageConfigId.
     * <p>
     * Field description:
     * Unique ID of the Markup Language.
     * <p>
     * The field is required.
     *
     * @param markupLanguageConfigId
     */
    @JsonProperty("markupLanguageConfigId")
    public void setMarkupLanguageConfigId(Long markupLanguageConfigId) {
        this.markupLanguageConfigId = markupLanguageConfigId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        NumbersForwardToMarkupLanguageDetails numbersForwardToMarkupLanguageDetails =
                (NumbersForwardToMarkupLanguageDetails) o;
        return Objects.equals(this.markupLanguageConfigId, numbersForwardToMarkupLanguageDetails.markupLanguageConfigId)
                && super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(markupLanguageConfigId, super.hashCode());
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class NumbersForwardToMarkupLanguageDetails {")
                .append(newLine)
                .append("    ")
                .append(toIndentedString(super.toString()))
                .append(newLine)
                .append("    markupLanguageConfigId: ")
                .append(toIndentedString(markupLanguageConfigId))
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
