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
 * An array of cards contained within the carousel.
 */
public class ViberCarouselCard {

    private String text;

    private String mediaUrl;

    private List<ViberCarouselButton> buttons = null;

    /**
     * Sets text.
     * <p>
     * Field description:
     * Text to be displayed alongside the card.
     * <p>
     * The field is required.
     *
     * @param text
     * @return This {@link ViberCarouselCard instance}.
     */
    public ViberCarouselCard text(String text) {
        this.text = text;
        return this;
    }

    /**
     * Returns text.
     * <p>
     * Field description:
     * Text to be displayed alongside the card.
     * <p>
     * The field is required.
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
     * Text to be displayed alongside the card.
     * <p>
     * The field is required.
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
     * URL of the image being sent. Must be a valid URL starting with https:// or http://. Supported image types are .jpg, .jpeg, .png. Recommended resolution: 696 px x 600 px.
     * <p>
     * The field is required.
     *
     * @param mediaUrl
     * @return This {@link ViberCarouselCard instance}.
     */
    public ViberCarouselCard mediaUrl(String mediaUrl) {
        this.mediaUrl = mediaUrl;
        return this;
    }

    /**
     * Returns mediaUrl.
     * <p>
     * Field description:
     * URL of the image being sent. Must be a valid URL starting with https:// or http://. Supported image types are .jpg, .jpeg, .png. Recommended resolution: 696 px x 600 px.
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
     * URL of the image being sent. Must be a valid URL starting with https:// or http://. Supported image types are .jpg, .jpeg, .png. Recommended resolution: 696 px x 600 px.
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
     * Sets buttons.
     * <p>
     * Field description:
     * List of buttons that will be sent in card.
     *
     * @param buttons
     * @return This {@link ViberCarouselCard instance}.
     */
    public ViberCarouselCard buttons(List<ViberCarouselButton> buttons) {
        this.buttons = buttons;
        return this;
    }

    /**
     * Adds and item into buttons.
     * <p>
     * Field description:
     * List of buttons that will be sent in card.
     *
     * @param buttonsItem The item to be added to the list.
     * @return This {@link ViberCarouselCard instance}.
     */
    public ViberCarouselCard addButtonsItem(ViberCarouselButton buttonsItem) {
        if (this.buttons == null) {
            this.buttons = new ArrayList<>();
        }
        this.buttons.add(buttonsItem);
        return this;
    }

    /**
     * Returns buttons.
     * <p>
     * Field description:
     * List of buttons that will be sent in card.
     *
     * @return buttons
     */
    @JsonProperty("buttons")
    public List<ViberCarouselButton> getButtons() {
        return buttons;
    }

    /**
     * Sets buttons.
     * <p>
     * Field description:
     * List of buttons that will be sent in card.
     *
     * @param buttons
     */
    @JsonProperty("buttons")
    public void setButtons(List<ViberCarouselButton> buttons) {
        this.buttons = buttons;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ViberCarouselCard viberCarouselCard = (ViberCarouselCard) o;
        return Objects.equals(this.text, viberCarouselCard.text)
                && Objects.equals(this.mediaUrl, viberCarouselCard.mediaUrl)
                && Objects.equals(this.buttons, viberCarouselCard.buttons);
    }

    @Override
    public int hashCode() {
        return Objects.hash(text, mediaUrl, buttons);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class ViberCarouselCard {")
                .append(newLine)
                .append("    text: ")
                .append(toIndentedString(text))
                .append(newLine)
                .append("    mediaUrl: ")
                .append(toIndentedString(mediaUrl))
                .append(newLine)
                .append("    buttons: ")
                .append(toIndentedString(buttons))
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
