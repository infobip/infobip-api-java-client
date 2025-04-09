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
public class WhatsAppWebhookUrl {

    private String url;

    private String type;

    /**
     * Sets url.
     * <p>
     * Field description:
     * Contact&#39;s url.
     *
     * @param url
     * @return This {@link WhatsAppWebhookUrl instance}.
     */
    public WhatsAppWebhookUrl url(String url) {
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
     * <p>
     * Field description:
     * Type of the url. Can be &#x60;HOME&#x60; or &#x60;WORK&#x60;.
     *
     * @param type
     * @return This {@link WhatsAppWebhookUrl instance}.
     */
    public WhatsAppWebhookUrl type(String type) {
        this.type = type;
        return this;
    }

    /**
     * Returns type.
     * <p>
     * Field description:
     * Type of the url. Can be &#x60;HOME&#x60; or &#x60;WORK&#x60;.
     *
     * @return type
     */
    @JsonProperty("type")
    public String getType() {
        return type;
    }

    /**
     * Sets type.
     * <p>
     * Field description:
     * Type of the url. Can be &#x60;HOME&#x60; or &#x60;WORK&#x60;.
     *
     * @param type
     */
    @JsonProperty("type")
    public void setType(String type) {
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
        WhatsAppWebhookUrl whatsAppWebhookUrl = (WhatsAppWebhookUrl) o;
        return Objects.equals(this.url, whatsAppWebhookUrl.url) && Objects.equals(this.type, whatsAppWebhookUrl.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(url, type);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class WhatsAppWebhookUrl {")
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
