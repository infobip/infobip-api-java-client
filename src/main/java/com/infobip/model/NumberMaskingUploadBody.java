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
import java.util.Arrays;
import java.util.Objects;

/**
 * Represents NumberMaskingUploadBody model.
 */
public class NumberMaskingUploadBody {

    private String url;

    private byte[] content;

    /**
     * Sets url.
     * <p>
     * Field description:
     * URL of your voice file location. Max size of the file is 4MB. The acceptable file format is mp3.
     *
     * @param url
     * @return This {@link NumberMaskingUploadBody instance}.
     */
    public NumberMaskingUploadBody url(String url) {
        this.url = url;
        return this;
    }

    /**
     * Returns url.
     * <p>
     * Field description:
     * URL of your voice file location. Max size of the file is 4MB. The acceptable file format is mp3.
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
     * URL of your voice file location. Max size of the file is 4MB. The acceptable file format is mp3.
     *
     * @param url
     */
    @JsonProperty("url")
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * Sets content.
     * <p>
     * Field description:
     * Encoded (Base64) value of mp3 file can be included instead of the file location URL.
     *
     * @param content
     * @return This {@link NumberMaskingUploadBody instance}.
     */
    public NumberMaskingUploadBody content(byte[] content) {
        this.content = content;
        return this;
    }

    /**
     * Returns content.
     * <p>
     * Field description:
     * Encoded (Base64) value of mp3 file can be included instead of the file location URL.
     *
     * @return content
     */
    @JsonProperty("content")
    public byte[] getContent() {
        return content;
    }

    /**
     * Sets content.
     * <p>
     * Field description:
     * Encoded (Base64) value of mp3 file can be included instead of the file location URL.
     *
     * @param content
     */
    @JsonProperty("content")
    public void setContent(byte[] content) {
        this.content = content;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        NumberMaskingUploadBody numberMaskingUploadBody = (NumberMaskingUploadBody) o;
        return Objects.equals(this.url, numberMaskingUploadBody.url)
                && Arrays.equals(this.content, numberMaskingUploadBody.content);
    }

    @Override
    public int hashCode() {
        return Objects.hash(url, Arrays.hashCode(content));
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class NumberMaskingUploadBody {")
                .append(newLine)
                .append("    url: ")
                .append(toIndentedString(url))
                .append(newLine)
                .append("    content: ")
                .append(toIndentedString(content))
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
