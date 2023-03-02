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
 * Array of urls information.
 */
public class WhatsAppUrlContent {

    private String url;

    private WhatsAppUrlType type;

    /**
     * Sets url.
     * <p>
     * Field description:
     * Contact&#39;s url.
     *
     * @param url
     * @return This {@link WhatsAppUrlContent instance}.
     */
    public WhatsAppUrlContent url(String url) {
        this.url = url;
        return this;
    }

    /**
     * Returns url.
     * <p>
     * Field description:
     * Contact&#39;s url.
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
     * Contact&#39;s url.
     *
     * @param url
     */
    @JsonProperty("url")
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * Sets type.
     *
     * @param type
     * @return This {@link WhatsAppUrlContent instance}.
     */
    public WhatsAppUrlContent type(WhatsAppUrlType type) {
        this.type = type;
        return this;
    }

    /**
     * Returns type.
     *
     * @return type
     */
    @JsonProperty("type")
    public WhatsAppUrlType getType() {
        return type;
    }

    /**
     * Sets type.
     *
     * @param type
     */
    @JsonProperty("type")
    public void setType(WhatsAppUrlType type) {
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WhatsAppUrlContent whatsAppUrlContent = (WhatsAppUrlContent) o;
        return Objects.equals(this.url, whatsAppUrlContent.url) && Objects.equals(this.type, whatsAppUrlContent.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(url, type);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class WhatsAppUrlContent {")
                .append(newLine)
                .append("    url: ")
                .append(toIndentedString(url))
                .append(newLine)
                .append("    type: ")
                .append(toIndentedString(type))
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
