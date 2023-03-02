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
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Represents SmsPreviewResponse model.
 */
public class SmsPreviewResponse {

    private String originalText;

    private List<SmsPreview> previews = null;

    /**
     * Sets originalText.
     * <p>
     * Field description:
     * Message content supplied in the request.
     *
     * @param originalText
     * @return This {@link SmsPreviewResponse instance}.
     */
    public SmsPreviewResponse originalText(String originalText) {
        this.originalText = originalText;
        return this;
    }

    /**
     * Returns originalText.
     * <p>
     * Field description:
     * Message content supplied in the request.
     *
     * @return originalText
     */
    @JsonProperty("originalText")
    public String getOriginalText() {
        return originalText;
    }

    /**
     * Sets originalText.
     * <p>
     * Field description:
     * Message content supplied in the request.
     *
     * @param originalText
     */
    @JsonProperty("originalText")
    public void setOriginalText(String originalText) {
        this.originalText = originalText;
    }

    /**
     * Sets previews.
     * <p>
     * Field description:
     * Allows for previewing the original message content once additional language configuration has been applied to it.
     *
     * @param previews
     * @return This {@link SmsPreviewResponse instance}.
     */
    public SmsPreviewResponse previews(List<SmsPreview> previews) {
        this.previews = previews;
        return this;
    }

    /**
     * Adds and item into previews.
     * <p>
     * Field description:
     * Allows for previewing the original message content once additional language configuration has been applied to it.
     *
     * @param previewsItem The item to be added to the list.
     * @return This {@link SmsPreviewResponse instance}.
     */
    public SmsPreviewResponse addPreviewsItem(SmsPreview previewsItem) {
        if (this.previews == null) {
            this.previews = new ArrayList<>();
        }
        this.previews.add(previewsItem);
        return this;
    }

    /**
     * Returns previews.
     * <p>
     * Field description:
     * Allows for previewing the original message content once additional language configuration has been applied to it.
     *
     * @return previews
     */
    @JsonProperty("previews")
    public List<SmsPreview> getPreviews() {
        return previews;
    }

    /**
     * Sets previews.
     * <p>
     * Field description:
     * Allows for previewing the original message content once additional language configuration has been applied to it.
     *
     * @param previews
     */
    @JsonProperty("previews")
    public void setPreviews(List<SmsPreview> previews) {
        this.previews = previews;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SmsPreviewResponse smsPreviewResponse = (SmsPreviewResponse) o;
        return Objects.equals(this.originalText, smsPreviewResponse.originalText)
                && Objects.equals(this.previews, smsPreviewResponse.previews);
    }

    @Override
    public int hashCode() {
        return Objects.hash(originalText, previews);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class SmsPreviewResponse {")
                .append(newLine)
                .append("    originalText: ")
                .append(toIndentedString(originalText))
                .append(newLine)
                .append("    previews: ")
                .append(toIndentedString(previews))
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
