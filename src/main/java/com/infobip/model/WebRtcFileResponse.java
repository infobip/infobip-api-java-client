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
import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * Represents WebRtcFileResponse model.
 */
public class WebRtcFileResponse {

    private String id;

    private String name;

    private WebRtcFileFormat fileFormat;

    private Long size;

    private OffsetDateTime creationTime;

    /**
     * Sets id.
     * <p>
     * Field description:
     * Unique id of the file.
     *
     * @param id
     * @return This {@link WebRtcFileResponse instance}.
     */
    public WebRtcFileResponse id(String id) {
        this.id = id;
        return this;
    }

    /**
     * Returns id.
     * <p>
     * Field description:
     * Unique id of the file.
     *
     * @return id
     */
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    /**
     * Sets id.
     * <p>
     * Field description:
     * Unique id of the file.
     *
     * @param id
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Sets name.
     * <p>
     * Field description:
     * Name of the file.
     *
     * @param name
     * @return This {@link WebRtcFileResponse instance}.
     */
    public WebRtcFileResponse name(String name) {
        this.name = name;
        return this;
    }

    /**
     * Returns name.
     * <p>
     * Field description:
     * Name of the file.
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
     * Name of the file.
     *
     * @param name
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Sets fileFormat.
     *
     * @param fileFormat
     * @return This {@link WebRtcFileResponse instance}.
     */
    public WebRtcFileResponse fileFormat(WebRtcFileFormat fileFormat) {
        this.fileFormat = fileFormat;
        return this;
    }

    /**
     * Returns fileFormat.
     *
     * @return fileFormat
     */
    @JsonProperty("fileFormat")
    public WebRtcFileFormat getFileFormat() {
        return fileFormat;
    }

    /**
     * Sets fileFormat.
     *
     * @param fileFormat
     */
    @JsonProperty("fileFormat")
    public void setFileFormat(WebRtcFileFormat fileFormat) {
        this.fileFormat = fileFormat;
    }

    /**
     * Sets size.
     * <p>
     * Field description:
     * Size in bytes of the file.
     *
     * @param size
     * @return This {@link WebRtcFileResponse instance}.
     */
    public WebRtcFileResponse size(Long size) {
        this.size = size;
        return this;
    }

    /**
     * Returns size.
     * <p>
     * Field description:
     * Size in bytes of the file.
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
     * Size in bytes of the file.
     *
     * @param size
     */
    @JsonProperty("size")
    public void setSize(Long size) {
        this.size = size;
    }

    /**
     * Sets creationTime.
     * <p>
     * Field description:
     * Creation time of the file in UTC timezone. Has the following format: &#x60;yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSS+ZZZZ&#x60;.
     *
     * @param creationTime
     * @return This {@link WebRtcFileResponse instance}.
     */
    public WebRtcFileResponse creationTime(OffsetDateTime creationTime) {
        this.creationTime = creationTime;
        return this;
    }

    /**
     * Returns creationTime.
     * <p>
     * Field description:
     * Creation time of the file in UTC timezone. Has the following format: &#x60;yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSS+ZZZZ&#x60;.
     *
     * @return creationTime
     */
    @JsonProperty("creationTime")
    public OffsetDateTime getCreationTime() {
        return creationTime;
    }

    /**
     * Sets creationTime.
     * <p>
     * Field description:
     * Creation time of the file in UTC timezone. Has the following format: &#x60;yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSS+ZZZZ&#x60;.
     *
     * @param creationTime
     */
    @JsonProperty("creationTime")
    public void setCreationTime(OffsetDateTime creationTime) {
        this.creationTime = creationTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WebRtcFileResponse webRtcFileResponse = (WebRtcFileResponse) o;
        return Objects.equals(this.id, webRtcFileResponse.id)
                && Objects.equals(this.name, webRtcFileResponse.name)
                && Objects.equals(this.fileFormat, webRtcFileResponse.fileFormat)
                && Objects.equals(this.size, webRtcFileResponse.size)
                && Objects.equals(this.creationTime, webRtcFileResponse.creationTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, fileFormat, size, creationTime);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class WebRtcFileResponse {")
                .append(newLine)
                .append("    id: ")
                .append(toIndentedString(id))
                .append(newLine)
                .append("    name: ")
                .append(toIndentedString(name))
                .append(newLine)
                .append("    fileFormat: ")
                .append(toIndentedString(fileFormat))
                .append(newLine)
                .append("    size: ")
                .append(toIndentedString(size))
                .append(newLine)
                .append("    creationTime: ")
                .append(toIndentedString(creationTime))
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
