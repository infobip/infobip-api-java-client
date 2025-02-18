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
 * Call link theme-specific configuration settings. Use it to add image, color, and text selections to customize a call link page.
 */
public class WebRtcTheme {

    private WebRtcImages images;

    private WebRtcMessages messages;

    private WebRtcColors colors;

    private List<WebRtcLayout> layouts = null;

    private WebRtcLocalization localization;

    /**
     * Sets images.
     *
     * @param images
     * @return This {@link WebRtcTheme instance}.
     */
    public WebRtcTheme images(WebRtcImages images) {
        this.images = images;
        return this;
    }

    /**
     * Returns images.
     *
     * @return images
     */
    @JsonProperty("images")
    public WebRtcImages getImages() {
        return images;
    }

    /**
     * Sets images.
     *
     * @param images
     */
    @JsonProperty("images")
    public void setImages(WebRtcImages images) {
        this.images = images;
    }

    /**
     * Sets messages.
     *
     * @param messages
     * @return This {@link WebRtcTheme instance}.
     */
    public WebRtcTheme messages(WebRtcMessages messages) {
        this.messages = messages;
        return this;
    }

    /**
     * Returns messages.
     *
     * @return messages
     */
    @JsonProperty("messages")
    public WebRtcMessages getMessages() {
        return messages;
    }

    /**
     * Sets messages.
     *
     * @param messages
     */
    @JsonProperty("messages")
    public void setMessages(WebRtcMessages messages) {
        this.messages = messages;
    }

    /**
     * Sets colors.
     *
     * @param colors
     * @return This {@link WebRtcTheme instance}.
     */
    public WebRtcTheme colors(WebRtcColors colors) {
        this.colors = colors;
        return this;
    }

    /**
     * Returns colors.
     *
     * @return colors
     */
    @JsonProperty("colors")
    public WebRtcColors getColors() {
        return colors;
    }

    /**
     * Sets colors.
     *
     * @param colors
     */
    @JsonProperty("colors")
    public void setColors(WebRtcColors colors) {
        this.colors = colors;
    }

    /**
     * Sets layouts.
     * <p>
     * Field description:
     * Represents layout during the call.When GRID layout is selected, multiple video streams are displayed simultaneously and user can spotlight specific video stream.When SOLO layout is selected, an user can see only his video streams.If there are more than one layout in this list, the first one will be initially selected, and users can change it during the call.The default layout will be set to GRID.
     *
     * @param layouts
     * @return This {@link WebRtcTheme instance}.
     */
    public WebRtcTheme layouts(List<WebRtcLayout> layouts) {
        this.layouts = layouts;
        return this;
    }

    /**
     * Adds and item into layouts.
     * <p>
     * Field description:
     * Represents layout during the call.When GRID layout is selected, multiple video streams are displayed simultaneously and user can spotlight specific video stream.When SOLO layout is selected, an user can see only his video streams.If there are more than one layout in this list, the first one will be initially selected, and users can change it during the call.The default layout will be set to GRID.
     *
     * @param layoutsItem The item to be added to the list.
     * @return This {@link WebRtcTheme instance}.
     */
    public WebRtcTheme addLayoutsItem(WebRtcLayout layoutsItem) {
        if (this.layouts == null) {
            this.layouts = new ArrayList<>();
        }
        this.layouts.add(layoutsItem);
        return this;
    }

    /**
     * Returns layouts.
     * <p>
     * Field description:
     * Represents layout during the call.When GRID layout is selected, multiple video streams are displayed simultaneously and user can spotlight specific video stream.When SOLO layout is selected, an user can see only his video streams.If there are more than one layout in this list, the first one will be initially selected, and users can change it during the call.The default layout will be set to GRID.
     *
     * @return layouts
     */
    @JsonProperty("layouts")
    public List<WebRtcLayout> getLayouts() {
        return layouts;
    }

    /**
     * Sets layouts.
     * <p>
     * Field description:
     * Represents layout during the call.When GRID layout is selected, multiple video streams are displayed simultaneously and user can spotlight specific video stream.When SOLO layout is selected, an user can see only his video streams.If there are more than one layout in this list, the first one will be initially selected, and users can change it during the call.The default layout will be set to GRID.
     *
     * @param layouts
     */
    @JsonProperty("layouts")
    public void setLayouts(List<WebRtcLayout> layouts) {
        this.layouts = layouts;
    }

    /**
     * Sets localization.
     *
     * @param localization
     * @return This {@link WebRtcTheme instance}.
     */
    public WebRtcTheme localization(WebRtcLocalization localization) {
        this.localization = localization;
        return this;
    }

    /**
     * Returns localization.
     *
     * @return localization
     */
    @JsonProperty("localization")
    public WebRtcLocalization getLocalization() {
        return localization;
    }

    /**
     * Sets localization.
     *
     * @param localization
     */
    @JsonProperty("localization")
    public void setLocalization(WebRtcLocalization localization) {
        this.localization = localization;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WebRtcTheme webRtcTheme = (WebRtcTheme) o;
        return Objects.equals(this.images, webRtcTheme.images)
                && Objects.equals(this.messages, webRtcTheme.messages)
                && Objects.equals(this.colors, webRtcTheme.colors)
                && Objects.equals(this.layouts, webRtcTheme.layouts)
                && Objects.equals(this.localization, webRtcTheme.localization);
    }

    @Override
    public int hashCode() {
        return Objects.hash(images, messages, colors, layouts, localization);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class WebRtcTheme {")
                .append(newLine)
                .append("    images: ")
                .append(toIndentedString(images))
                .append(newLine)
                .append("    messages: ")
                .append(toIndentedString(messages))
                .append(newLine)
                .append("    colors: ")
                .append(toIndentedString(colors))
                .append(newLine)
                .append("    layouts: ")
                .append(toIndentedString(layouts))
                .append(newLine)
                .append("    localization: ")
                .append(toIndentedString(localization))
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
