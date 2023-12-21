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
 * Colors settings. If not specified, the default colors will be used.
 */
public class WebRtcColors {

    private String primary;

    private String primaryText;

    private String background;

    /**
     * Sets primary.
     * <p>
     * Field description:
     * Primary color of a theme in the hexadecimal format.
     *
     * @param primary
     * @return This {@link WebRtcColors instance}.
     */
    public WebRtcColors primary(String primary) {
        this.primary = primary;
        return this;
    }

    /**
     * Returns primary.
     * <p>
     * Field description:
     * Primary color of a theme in the hexadecimal format.
     *
     * @return primary
     */
    @JsonProperty("primary")
    public String getPrimary() {
        return primary;
    }

    /**
     * Sets primary.
     * <p>
     * Field description:
     * Primary color of a theme in the hexadecimal format.
     *
     * @param primary
     */
    @JsonProperty("primary")
    public void setPrimary(String primary) {
        this.primary = primary;
    }

    /**
     * Sets primaryText.
     * <p>
     * Field description:
     * Primary color of a text in the hexadecimal format.
     *
     * @param primaryText
     * @return This {@link WebRtcColors instance}.
     */
    public WebRtcColors primaryText(String primaryText) {
        this.primaryText = primaryText;
        return this;
    }

    /**
     * Returns primaryText.
     * <p>
     * Field description:
     * Primary color of a text in the hexadecimal format.
     *
     * @return primaryText
     */
    @JsonProperty("primaryText")
    public String getPrimaryText() {
        return primaryText;
    }

    /**
     * Sets primaryText.
     * <p>
     * Field description:
     * Primary color of a text in the hexadecimal format.
     *
     * @param primaryText
     */
    @JsonProperty("primaryText")
    public void setPrimaryText(String primaryText) {
        this.primaryText = primaryText;
    }

    /**
     * Sets background.
     * <p>
     * Field description:
     * Background color in the hexadecimal format.
     *
     * @param background
     * @return This {@link WebRtcColors instance}.
     */
    public WebRtcColors background(String background) {
        this.background = background;
        return this;
    }

    /**
     * Returns background.
     * <p>
     * Field description:
     * Background color in the hexadecimal format.
     *
     * @return background
     */
    @JsonProperty("background")
    public String getBackground() {
        return background;
    }

    /**
     * Sets background.
     * <p>
     * Field description:
     * Background color in the hexadecimal format.
     *
     * @param background
     */
    @JsonProperty("background")
    public void setBackground(String background) {
        this.background = background;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WebRtcColors webRtcColors = (WebRtcColors) o;
        return Objects.equals(this.primary, webRtcColors.primary)
                && Objects.equals(this.primaryText, webRtcColors.primaryText)
                && Objects.equals(this.background, webRtcColors.background);
    }

    @Override
    public int hashCode() {
        return Objects.hash(primary, primaryText, background);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class WebRtcColors {")
                .append(newLine)
                .append("    primary: ")
                .append(toIndentedString(primary))
                .append(newLine)
                .append("    primaryText: ")
                .append(toIndentedString(primaryText))
                .append(newLine)
                .append("    background: ")
                .append(toIndentedString(background))
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
