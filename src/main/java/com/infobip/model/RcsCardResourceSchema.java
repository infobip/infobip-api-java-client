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
     * Specifies the URL of the media resource. Supported content types include: &lt;ul&gt;     &lt;li&gt;image/jpeg, image/jpg, image/gif, image/png&lt;/li&gt;     &lt;li&gt;video/h263, video/m4v, video/mp4, video/mpeg, video/mpeg4, video/webm&lt;/li&gt;     &lt;li&gt;application/pdf (India only)&lt;/li&gt; &lt;/ul&gt; Note that support for specific content types may vary depending on the mobile network operator.&lt;br/&gt; Requirements: &lt;ul&gt;     &lt;li&gt;The URL must begin with http:// or https://.&lt;/li&gt;     &lt;li&gt;         Aspect ratios:         &lt;ul&gt;             &lt;li&gt;                 Rich card:                 &lt;ul&gt;                     &lt;li&gt;VERTICAL orientation: MEDIUM height 2:1 (for example, 960 x 480), SHORT height 3:1 (for example, 1080 x 360)&lt;/li&gt;                     &lt;li&gt;HORIZONTAL orientation: 3:4 (for example, 720 x 960)&lt;/li&gt;                 &lt;/ul&gt;             &lt;/li&gt;             &lt;li&gt;                 Carousel:                 &lt;ul&gt;                     &lt;li&gt;MEDIUM width: MEDIUM height 4:3 (for example, 960 x 720), SHORT height 2:1  (for example, 960 x 480)&lt;/li&gt;                     &lt;li&gt;SMALL width: MEDIUM height 4:5 (for example, 960 x 1200), SHORT height 5:4 (for example, 1200 x 960)&lt;/li&gt;                 &lt;/ul&gt;             &lt;/li&gt;         &lt;/ul&gt;     &lt;/li&gt; &lt;/ul&gt;
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
     * Specifies the URL of the media resource. Supported content types include: &lt;ul&gt;     &lt;li&gt;image/jpeg, image/jpg, image/gif, image/png&lt;/li&gt;     &lt;li&gt;video/h263, video/m4v, video/mp4, video/mpeg, video/mpeg4, video/webm&lt;/li&gt;     &lt;li&gt;application/pdf (India only)&lt;/li&gt; &lt;/ul&gt; Note that support for specific content types may vary depending on the mobile network operator.&lt;br/&gt; Requirements: &lt;ul&gt;     &lt;li&gt;The URL must begin with http:// or https://.&lt;/li&gt;     &lt;li&gt;         Aspect ratios:         &lt;ul&gt;             &lt;li&gt;                 Rich card:                 &lt;ul&gt;                     &lt;li&gt;VERTICAL orientation: MEDIUM height 2:1 (for example, 960 x 480), SHORT height 3:1 (for example, 1080 x 360)&lt;/li&gt;                     &lt;li&gt;HORIZONTAL orientation: 3:4 (for example, 720 x 960)&lt;/li&gt;                 &lt;/ul&gt;             &lt;/li&gt;             &lt;li&gt;                 Carousel:                 &lt;ul&gt;                     &lt;li&gt;MEDIUM width: MEDIUM height 4:3 (for example, 960 x 720), SHORT height 2:1  (for example, 960 x 480)&lt;/li&gt;                     &lt;li&gt;SMALL width: MEDIUM height 4:5 (for example, 960 x 1200), SHORT height 5:4 (for example, 1200 x 960)&lt;/li&gt;                 &lt;/ul&gt;             &lt;/li&gt;         &lt;/ul&gt;     &lt;/li&gt; &lt;/ul&gt;
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
     * Specifies the URL of the media resource. Supported content types include: &lt;ul&gt;     &lt;li&gt;image/jpeg, image/jpg, image/gif, image/png&lt;/li&gt;     &lt;li&gt;video/h263, video/m4v, video/mp4, video/mpeg, video/mpeg4, video/webm&lt;/li&gt;     &lt;li&gt;application/pdf (India only)&lt;/li&gt; &lt;/ul&gt; Note that support for specific content types may vary depending on the mobile network operator.&lt;br/&gt; Requirements: &lt;ul&gt;     &lt;li&gt;The URL must begin with http:// or https://.&lt;/li&gt;     &lt;li&gt;         Aspect ratios:         &lt;ul&gt;             &lt;li&gt;                 Rich card:                 &lt;ul&gt;                     &lt;li&gt;VERTICAL orientation: MEDIUM height 2:1 (for example, 960 x 480), SHORT height 3:1 (for example, 1080 x 360)&lt;/li&gt;                     &lt;li&gt;HORIZONTAL orientation: 3:4 (for example, 720 x 960)&lt;/li&gt;                 &lt;/ul&gt;             &lt;/li&gt;             &lt;li&gt;                 Carousel:                 &lt;ul&gt;                     &lt;li&gt;MEDIUM width: MEDIUM height 4:3 (for example, 960 x 720), SHORT height 2:1  (for example, 960 x 480)&lt;/li&gt;                     &lt;li&gt;SMALL width: MEDIUM height 4:5 (for example, 960 x 1200), SHORT height 5:4 (for example, 1200 x 960)&lt;/li&gt;                 &lt;/ul&gt;             &lt;/li&gt;         &lt;/ul&gt;     &lt;/li&gt; &lt;/ul&gt;
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
