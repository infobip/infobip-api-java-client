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
 * Represents RcsInboundFileContent model.
 */
public class RcsInboundFileContent extends RcsInboundMessageContent {

    private String url;

    private String name;

    private String contentType;

    private Long size;

    /**
     * Constructs a new {@link RcsInboundFileContent} instance.
     */
    public RcsInboundFileContent() {
        super("FILE");
    }

    /**
     * Sets url.
     * <p>
     * Field description:
     * URL of the file which is sent in an incoming message.
     * <p>
     * The field is required.
     *
     * @param url
     * @return This {@link RcsInboundFileContent instance}.
     */
    public RcsInboundFileContent url(String url) {
        this.url = url;
        return this;
    }

    /**
     * Returns url.
     * <p>
     * Field description:
     * URL of the file which is sent in an incoming message.
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
     * URL of the file which is sent in an incoming message.
     * <p>
     * The field is required.
     *
     * @param url
     */
    @JsonProperty("url")
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * Sets name.
     * <p>
     * Field description:
     * Name of a file which is sent in an incoming message.
     * <p>
     * The field is required.
     *
     * @param name
     * @return This {@link RcsInboundFileContent instance}.
     */
    public RcsInboundFileContent name(String name) {
        this.name = name;
        return this;
    }

    /**
     * Returns name.
     * <p>
     * Field description:
     * Name of a file which is sent in an incoming message.
     * <p>
     * The field is required.
     *
     * @return name
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * Sets name.
     * <p>
     * Field description:
     * Name of a file which is sent in an incoming message.
     * <p>
     * The field is required.
     *
     * @param name
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Sets contentType.
     * <p>
     * Field description:
     * Content type of a file which is sent in an incoming message.
     * <p>
     * The field is required.
     *
     * @param contentType
     * @return This {@link RcsInboundFileContent instance}.
     */
    public RcsInboundFileContent contentType(String contentType) {
        this.contentType = contentType;
        return this;
    }

    /**
     * Returns contentType.
     * <p>
     * Field description:
     * Content type of a file which is sent in an incoming message.
     * <p>
     * The field is required.
     *
     * @return contentType
     */
    @JsonProperty("contentType")
    public String getContentType() {
        return contentType;
    }

    /**
     * Sets contentType.
     * <p>
     * Field description:
     * Content type of a file which is sent in an incoming message.
     * <p>
     * The field is required.
     *
     * @param contentType
     */
    @JsonProperty("contentType")
    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    /**
     * Sets size.
     * <p>
     * Field description:
     * Size of the file which is sent in an incoming message. Minimum value is 0. Size of file is considered to be expressed in bytes.
     * <p>
     * The field is required.
     *
     * @param size
     * @return This {@link RcsInboundFileContent instance}.
     */
    public RcsInboundFileContent size(Long size) {
        this.size = size;
        return this;
    }

    /**
     * Returns size.
     * <p>
     * Field description:
     * Size of the file which is sent in an incoming message. Minimum value is 0. Size of file is considered to be expressed in bytes.
     * <p>
     * The field is required.
     *
     * @return size
     */
    @JsonProperty("size")
    public Long getSize() {
        return size;
    }

    /**
     * Sets size.
     * <p>
     * Field description:
     * Size of the file which is sent in an incoming message. Minimum value is 0. Size of file is considered to be expressed in bytes.
     * <p>
     * The field is required.
     *
     * @param size
     */
    @JsonProperty("size")
    public void setSize(Long size) {
        this.size = size;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RcsInboundFileContent rcsInboundFileContent = (RcsInboundFileContent) o;
        return Objects.equals(this.url, rcsInboundFileContent.url)
                && Objects.equals(this.name, rcsInboundFileContent.name)
                && Objects.equals(this.contentType, rcsInboundFileContent.contentType)
                && Objects.equals(this.size, rcsInboundFileContent.size)
                && super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(url, name, contentType, size, super.hashCode());
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class RcsInboundFileContent {")
                .append(newLine)
                .append("    ")
                .append(toIndentedString(super.toString()))
                .append(newLine)
                .append("    url: ")
                .append(toIndentedString(url))
                .append(newLine)
                .append("    name: ")
                .append(toIndentedString(name))
                .append(newLine)
                .append("    contentType: ")
                .append(toIndentedString(contentType))
                .append(newLine)
                .append("    size: ")
                .append(toIndentedString(size))
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
