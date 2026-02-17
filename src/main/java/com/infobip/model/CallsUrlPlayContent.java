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
 * Represents CallsUrlPlayContent model.
 */
public class CallsUrlPlayContent extends CallsPlayContent {

    private String fileUrl;

    private Integer cacheDuration;

    /**
     * Constructs a new {@link CallsUrlPlayContent} instance.
     */
    public CallsUrlPlayContent() {
        super("URL");
    }

    /**
     * Sets fileUrl.
     * <p>
     * Field description:
     * URL of the audio file. Only &#x60;wav&#x60; and &#x60;mp3&#x60; files are supported.
     * <p>
     * The field is required.
     *
     * @param fileUrl
     * @return This {@link CallsUrlPlayContent instance}.
     */
    public CallsUrlPlayContent fileUrl(String fileUrl) {
        this.fileUrl = fileUrl;
        return this;
    }

    /**
     * Returns fileUrl.
     * <p>
     * Field description:
     * URL of the audio file. Only &#x60;wav&#x60; and &#x60;mp3&#x60; files are supported.
     * <p>
     * The field is required.
     *
     * @return fileUrl
     */
    @JsonProperty("fileUrl")
    public String getFileUrl() {
        return fileUrl;
    }

    /**
     * Sets fileUrl.
     * <p>
     * Field description:
     * URL of the audio file. Only &#x60;wav&#x60; and &#x60;mp3&#x60; files are supported.
     * <p>
     * The field is required.
     *
     * @param fileUrl
     */
    @JsonProperty("fileUrl")
    public void setFileUrl(String fileUrl) {
        this.fileUrl = fileUrl;
    }

    /**
     * Sets cacheDuration.
     *
     * @param cacheDuration
     * @return This {@link CallsUrlPlayContent instance}.
     */
    public CallsUrlPlayContent cacheDuration(Integer cacheDuration) {
        this.cacheDuration = cacheDuration;
        return this;
    }

    /**
     * Returns cacheDuration.
     *
     * @return cacheDuration
     */
    @JsonProperty("cacheDuration")
    public Integer getCacheDuration() {
        return cacheDuration;
    }

    /**
     * Sets cacheDuration.
     *
     * @param cacheDuration
     */
    @JsonProperty("cacheDuration")
    public void setCacheDuration(Integer cacheDuration) {
        this.cacheDuration = cacheDuration;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CallsUrlPlayContent callsUrlPlayContent = (CallsUrlPlayContent) o;
        return Objects.equals(this.fileUrl, callsUrlPlayContent.fileUrl)
                && Objects.equals(this.cacheDuration, callsUrlPlayContent.cacheDuration)
                && super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fileUrl, cacheDuration, super.hashCode());
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class CallsUrlPlayContent {")
                .append(newLine)
                .append("    ")
                .append(toIndentedString(super.toString()))
                .append(newLine)
                .append("    fileUrl: ")
                .append(toIndentedString(fileUrl))
                .append(newLine)
                .append("    cacheDuration: ")
                .append(toIndentedString(cacheDuration))
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
