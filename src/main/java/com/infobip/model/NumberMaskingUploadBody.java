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
 * Represents NumberMaskingUploadBody model.
 */
public class NumberMaskingUploadBody {

    private String url;

    private List<byte[]> content = null;

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
    public NumberMaskingUploadBody content(List<byte[]> content) {
        this.content = content;
        return this;
    }

    /**
     * Adds and item into content.
     * <p>
     * Field description:
     * Encoded (Base64) value of mp3 file can be included instead of the file location URL.
     *
     * @param contentItem The item to be added to the list.
     * @return This {@link NumberMaskingUploadBody instance}.
     */
    public NumberMaskingUploadBody addContentItem(byte[] contentItem) {
        if (this.content == null) {
            this.content = new ArrayList<>();
        }
        this.content.add(contentItem);
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
    public List<byte[]> getContent() {
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
    public void setContent(List<byte[]> content) {
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
                && Objects.equals(this.content, numberMaskingUploadBody.content);
    }

    @Override
    public int hashCode() {
        return Objects.hash(url, content);
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
