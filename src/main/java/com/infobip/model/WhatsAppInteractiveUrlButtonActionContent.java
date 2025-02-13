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
 * Allows you to specify the content of the button and its URL.
 */
public class WhatsAppInteractiveUrlButtonActionContent {

    private String displayText;

    private String url;

    /**
     * Sets displayText.
     * <p>
     * Field description:
     * Content of the button.
     * <p>
     * The field is required.
     *
     * @param displayText
     * @return This {@link WhatsAppInteractiveUrlButtonActionContent instance}.
     */
    public WhatsAppInteractiveUrlButtonActionContent displayText(String displayText) {
        this.displayText = displayText;
        return this;
    }

    /**
     * Returns displayText.
     * <p>
     * Field description:
     * Content of the button.
     * <p>
     * The field is required.
     *
     * @return displayText
     */
    @JsonProperty("displayText")
    public String getDisplayText() {
        return displayText;
    }

    /**
     * Sets displayText.
     * <p>
     * Field description:
     * Content of the button.
     * <p>
     * The field is required.
     *
     * @param displayText
     */
    @JsonProperty("displayText")
    public void setDisplayText(String displayText) {
        this.displayText = displayText;
    }

    /**
     * Sets url.
     * <p>
     * Field description:
     * URL to load in the device&#39;s default web browser when tapped by the WhatsApp user.
     * <p>
     * The field is required.
     *
     * @param url
     * @return This {@link WhatsAppInteractiveUrlButtonActionContent instance}.
     */
    public WhatsAppInteractiveUrlButtonActionContent url(String url) {
        this.url = url;
        return this;
    }

    /**
     * Returns url.
     * <p>
     * Field description:
     * URL to load in the device&#39;s default web browser when tapped by the WhatsApp user.
     * <p>
     * The field is required.
     *
     * @return url
     */
    @JsonProperty("url")
    public String getUrl() {
        return url;
    }

    /**
     * Sets url.
     * <p>
     * Field description:
     * URL to load in the device&#39;s default web browser when tapped by the WhatsApp user.
     * <p>
     * The field is required.
     *
     * @param url
     */
    @JsonProperty("url")
    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WhatsAppInteractiveUrlButtonActionContent whatsAppInteractiveUrlButtonActionContent =
                (WhatsAppInteractiveUrlButtonActionContent) o;
        return Objects.equals(this.displayText, whatsAppInteractiveUrlButtonActionContent.displayText)
                && Objects.equals(this.url, whatsAppInteractiveUrlButtonActionContent.url);
    }

    @Override
    public int hashCode() {
        return Objects.hash(displayText, url);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class WhatsAppInteractiveUrlButtonActionContent {")
                .append(newLine)
                .append("    displayText: ")
                .append(toIndentedString(displayText))
                .append(newLine)
                .append("    url: ")
                .append(toIndentedString(url))
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
