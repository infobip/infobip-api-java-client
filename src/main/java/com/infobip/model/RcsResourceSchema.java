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
 * Resource object describing the media.
 */
public class RcsResourceSchema {

    private String url;

    /**
     * Sets url.
     * <p>
     * Field description:
     * URL of the given resource. The following content types are supported: &#x60;image/jpeg&#x60;, &#x60;image/jpg&#x60;, &#x60;image/gif&#x60;, &#x60;image/png&#x60;, &#x60;audio/aac&#x60;, &#x60;audio/mp3&#x60;, &#x60;audio/mpeg&#x60;, &#x60;audio/mpg&#x60;, &#x60;audio/mp4&#x60;, &#x60;audio/mp4-latm&#x60;, &#x60;audio/3gpp&#x60;, &#x60;application/ogg&#x60;, &#x60;audio/ogg&#x60;, &#x60;video/h263&#x60;, &#x60;video/m4v&#x60;, &#x60;video/mp4&#x60;, &#x60;video/mpeg&#x60;, &#x60;video/mpeg4&#x60;, &#x60;video/webm&#x60;, &#x60;application/pdf&#x60;. Should start with &#x60;http://&#x60; or &#x60;https://&#x60;. Up to 100 MB.
     * <p>
     * The field is required.
     *
     * @param url
     * @return This {@link RcsResourceSchema instance}.
     */
    public RcsResourceSchema url(String url) {
        this.url = url;
        return this;
    }

    /**
     * Returns url.
     * <p>
     * Field description:
     * URL of the given resource. The following content types are supported: &#x60;image/jpeg&#x60;, &#x60;image/jpg&#x60;, &#x60;image/gif&#x60;, &#x60;image/png&#x60;, &#x60;audio/aac&#x60;, &#x60;audio/mp3&#x60;, &#x60;audio/mpeg&#x60;, &#x60;audio/mpg&#x60;, &#x60;audio/mp4&#x60;, &#x60;audio/mp4-latm&#x60;, &#x60;audio/3gpp&#x60;, &#x60;application/ogg&#x60;, &#x60;audio/ogg&#x60;, &#x60;video/h263&#x60;, &#x60;video/m4v&#x60;, &#x60;video/mp4&#x60;, &#x60;video/mpeg&#x60;, &#x60;video/mpeg4&#x60;, &#x60;video/webm&#x60;, &#x60;application/pdf&#x60;. Should start with &#x60;http://&#x60; or &#x60;https://&#x60;. Up to 100 MB.
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
     * URL of the given resource. The following content types are supported: &#x60;image/jpeg&#x60;, &#x60;image/jpg&#x60;, &#x60;image/gif&#x60;, &#x60;image/png&#x60;, &#x60;audio/aac&#x60;, &#x60;audio/mp3&#x60;, &#x60;audio/mpeg&#x60;, &#x60;audio/mpg&#x60;, &#x60;audio/mp4&#x60;, &#x60;audio/mp4-latm&#x60;, &#x60;audio/3gpp&#x60;, &#x60;application/ogg&#x60;, &#x60;audio/ogg&#x60;, &#x60;video/h263&#x60;, &#x60;video/m4v&#x60;, &#x60;video/mp4&#x60;, &#x60;video/mpeg&#x60;, &#x60;video/mpeg4&#x60;, &#x60;video/webm&#x60;, &#x60;application/pdf&#x60;. Should start with &#x60;http://&#x60; or &#x60;https://&#x60;. Up to 100 MB.
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
        RcsResourceSchema rcsResourceSchema = (RcsResourceSchema) o;
        return Objects.equals(this.url, rcsResourceSchema.url);
    }

    @Override
    public int hashCode() {
        return Objects.hash(url);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class RcsResourceSchema {")
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
