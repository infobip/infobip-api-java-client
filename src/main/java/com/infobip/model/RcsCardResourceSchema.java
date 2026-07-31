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
 * Resource object describing the main media of the card.
 */
public class RcsCardResourceSchema {

    private String url;

    /**
     * Sets url.
     * <p>
     * Field description:
     * Specifies the URL of the media resource. For supported file formats and aspect ratios, see documentation:  - [Rich Card](https://www.infobip.com/docs/rcs/rcs-message-types-and-templates#message-types-using-rcs-rich-card) - [Carousel](https://www.infobip.com/docs/rcs/rcs-message-types-and-templates#message-types-using-rcs-carousel)  Note that support for specific content types may vary depending on the mobile network operator.
     * <p>
     * The field is required.
     *
     * @param url
     * @return This {@link RcsCardResourceSchema instance}.
     */
    public RcsCardResourceSchema url(String url) {
        this.url = url;
        return this;
    }

    /**
     * Returns url.
     * <p>
     * Field description:
     * Specifies the URL of the media resource. For supported file formats and aspect ratios, see documentation:  - [Rich Card](https://www.infobip.com/docs/rcs/rcs-message-types-and-templates#message-types-using-rcs-rich-card) - [Carousel](https://www.infobip.com/docs/rcs/rcs-message-types-and-templates#message-types-using-rcs-carousel)  Note that support for specific content types may vary depending on the mobile network operator.
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
     * Specifies the URL of the media resource. For supported file formats and aspect ratios, see documentation:  - [Rich Card](https://www.infobip.com/docs/rcs/rcs-message-types-and-templates#message-types-using-rcs-rich-card) - [Carousel](https://www.infobip.com/docs/rcs/rcs-message-types-and-templates#message-types-using-rcs-carousel)  Note that support for specific content types may vary depending on the mobile network operator.
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
        RcsCardResourceSchema rcsCardResourceSchema = (RcsCardResourceSchema) o;
        return Objects.equals(this.url, rcsCardResourceSchema.url);
    }

    @Override
    public int hashCode() {
        return Objects.hash(url);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class RcsCardResourceSchema {")
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
