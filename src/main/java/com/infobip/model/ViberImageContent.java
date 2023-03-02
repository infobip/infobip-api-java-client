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
 * The content object to build a message that will be sent.
 */
public class ViberImageContent {

    private String text;

    private String mediaUrl;

    private ViberButton button;

    /**
     * Sets text.
     * <p>
     * Field description:
     * Text to be displayed alongside the image.
     *
     * @param text
     * @return This {@link ViberImageContent instance}.
     */
    public ViberImageContent text(String text) {
        this.text = text;
        return this;
    }

    /**
     * Returns text.
     * <p>
     * Field description:
     * Text to be displayed alongside the image.
     *
     * @return text
     */
    @JsonProperty("text")
    public String getText() {
        return text;
    }

    /**
     * Sets text.
     * <p>
     * Field description:
     * Text to be displayed alongside the image.
     *
     * @param text
     */
    @JsonProperty("text")
    public void setText(String text) {
        this.text = text;
    }

    /**
     * Sets mediaUrl.
     * <p>
     * Field description:
     * URL of the image being sent. Must be a valid URL starting with https:// or http://. Supported image types are .jpg, .jpeg, .png.Recommended resolution: 800 px x 800 px.
     * <p>
     * The field is required.
     *
     * @param mediaUrl
     * @return This {@link ViberImageContent instance}.
     */
    public ViberImageContent mediaUrl(String mediaUrl) {
        this.mediaUrl = mediaUrl;
        return this;
    }

    /**
     * Returns mediaUrl.
     * <p>
     * Field description:
     * URL of the image being sent. Must be a valid URL starting with https:// or http://. Supported image types are .jpg, .jpeg, .png.Recommended resolution: 800 px x 800 px.
     * <p>
     * The field is required.
     *
     * @return mediaUrl
     */
    @JsonProperty("mediaUrl")
    public String getMediaUrl() {
        return mediaUrl;
    }

    /**
     * Sets mediaUrl.
     * <p>
     * Field description:
     * URL of the image being sent. Must be a valid URL starting with https:// or http://. Supported image types are .jpg, .jpeg, .png.Recommended resolution: 800 px x 800 px.
     * <p>
     * The field is required.
     *
     * @param mediaUrl
     */
    @JsonProperty("mediaUrl")
    public void setMediaUrl(String mediaUrl) {
        this.mediaUrl = mediaUrl;
    }

    /**
     * Sets button.
     *
     * @param button
     * @return This {@link ViberImageContent instance}.
     */
    public ViberImageContent button(ViberButton button) {
        this.button = button;
        return this;
    }

    /**
     * Returns button.
     *
     * @return button
     */
    @JsonProperty("button")
    public ViberButton getButton() {
        return button;
    }

    /**
     * Sets button.
     *
     * @param button
     */
    @JsonProperty("button")
    public void setButton(ViberButton button) {
        this.button = button;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ViberImageContent viberImageContent = (ViberImageContent) o;
        return Objects.equals(this.text, viberImageContent.text)
                && Objects.equals(this.mediaUrl, viberImageContent.mediaUrl)
                && Objects.equals(this.button, viberImageContent.button);
    }

    @Override
    public int hashCode() {
        return Objects.hash(text, mediaUrl, button);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class ViberImageContent {")
                .append(newLine)
                .append("    text: ")
                .append(toIndentedString(text))
                .append(newLine)
                .append("    mediaUrl: ")
                .append(toIndentedString(mediaUrl))
                .append(newLine)
                .append("    button: ")
                .append(toIndentedString(button))
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
