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
 * The list of the results for this page.
 */
public class CallRoutingFile {

    private String id;

    private String name;

    private String fileFormat;

    private Long size;

    private OffsetDateTime creationTime;

    private OffsetDateTime expirationTime;

    private Long duration;

    /**
     * Sets id.
     * <p>
     * Field description:
     * File ID.
     *
     * @param id
     * @return This {@link CallRoutingFile instance}.
     */
    public CallRoutingFile id(String id) {
        this.id = id;
        return this;
    }

    /**
     * Returns id.
     * <p>
     * Field description:
     * File ID.
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
     * File ID.
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
     * File name.
     * <p>
     * The field is required.
     *
     * @param name
     * @return This {@link CallRoutingFile instance}.
     */
    public CallRoutingFile name(String name) {
        this.name = name;
        return this;
    }

    /**
     * Returns name.
     * <p>
     * Field description:
     * File name.
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
     * File name.
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
     * Sets fileFormat.
     * <p>
     * Field description:
     * File format.
     * <p>
     * The field is required.
     *
     * @param fileFormat
     * @return This {@link CallRoutingFile instance}.
     */
    public CallRoutingFile fileFormat(String fileFormat) {
        this.fileFormat = fileFormat;
        return this;
    }

    /**
     * Returns fileFormat.
     * <p>
     * Field description:
     * File format.
     * <p>
     * The field is required.
     *
     * @return fileFormat
     */
    @JsonProperty("fileFormat")
    public String getFileFormat() {
        return fileFormat;
    }

    /**
     * Sets fileFormat.
     * <p>
     * Field description:
     * File format.
     * <p>
     * The field is required.
     *
     * @param fileFormat
     */
    @JsonProperty("fileFormat")
    public void setFileFormat(String fileFormat) {
        this.fileFormat = fileFormat;
    }

    /**
     * Sets size.
     * <p>
     * Field description:
     * File size in bytes.
     *
     * @param size
     * @return This {@link CallRoutingFile instance}.
     */
    public CallRoutingFile size(Long size) {
        this.size = size;
        return this;
    }

    /**
     * Returns size.
     * <p>
     * Field description:
     * File size in bytes.
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
     * File size in bytes.
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
     * File creation time.
     *
     * @param creationTime
     * @return This {@link CallRoutingFile instance}.
     */
    public CallRoutingFile creationTime(OffsetDateTime creationTime) {
        this.creationTime = creationTime;
        return this;
    }

    /**
     * Returns creationTime.
     * <p>
     * Field description:
     * File creation time.
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
     * File creation time.
     *
     * @param creationTime
     */
    @JsonProperty("creationTime")
    public void setCreationTime(OffsetDateTime creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * Sets expirationTime.
     * <p>
     * Field description:
     * File expiration time.
     *
     * @param expirationTime
     * @return This {@link CallRoutingFile instance}.
     */
    public CallRoutingFile expirationTime(OffsetDateTime expirationTime) {
        this.expirationTime = expirationTime;
        return this;
    }

    /**
     * Returns expirationTime.
     * <p>
     * Field description:
     * File expiration time.
     *
     * @return expirationTime
     */
    @JsonProperty("expirationTime")
    public OffsetDateTime getExpirationTime() {
        return expirationTime;
    }

    /**
     * Sets expirationTime.
     * <p>
     * Field description:
     * File expiration time.
     *
     * @param expirationTime
     */
    @JsonProperty("expirationTime")
    public void setExpirationTime(OffsetDateTime expirationTime) {
        this.expirationTime = expirationTime;
    }

    /**
     * Sets duration.
     * <p>
     * Field description:
     * File duration in seconds.
     *
     * @param duration
     * @return This {@link CallRoutingFile instance}.
     */
    public CallRoutingFile duration(Long duration) {
        this.duration = duration;
        return this;
    }

    /**
     * Returns duration.
     * <p>
     * Field description:
     * File duration in seconds.
     *
     * @return duration
     */
    @JsonProperty("duration")
    public Long getDuration() {
        return duration;
    }

    /**
     * Sets duration.
     * <p>
     * Field description:
     * File duration in seconds.
     *
     * @param duration
     */
    @JsonProperty("duration")
    public void setDuration(Long duration) {
        this.duration = duration;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CallRoutingFile callRoutingFile = (CallRoutingFile) o;
        return Objects.equals(this.id, callRoutingFile.id)
                && Objects.equals(this.name, callRoutingFile.name)
                && Objects.equals(this.fileFormat, callRoutingFile.fileFormat)
                && Objects.equals(this.size, callRoutingFile.size)
                && Objects.equals(this.creationTime, callRoutingFile.creationTime)
                && Objects.equals(this.expirationTime, callRoutingFile.expirationTime)
                && Objects.equals(this.duration, callRoutingFile.duration);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, fileFormat, size, creationTime, expirationTime, duration);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class CallRoutingFile {")
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
                .append("    expirationTime: ")
                .append(toIndentedString(expirationTime))
                .append(newLine)
                .append("    duration: ")
                .append(toIndentedString(duration))
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
