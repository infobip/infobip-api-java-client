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
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Represents CallsPublicRecordingFile model.
 */
public class CallsPublicRecordingFile {

    private String id;

    private String name;

    private CallsFileFormat fileFormat;

    private Long size;

    private OffsetDateTime creationTime;

    private Long duration;

    private OffsetDateTime startTime;

    private OffsetDateTime endTime;

    private CallsRecordingFileLocation location;

    private CallsSftpUploadStatus sftpUploadStatus;

    private Map<String, String> customData = null;

    /**
     * Sets id.
     * <p>
     * Field description:
     * File ID.
     *
     * @param id
     * @return This {@link CallsPublicRecordingFile instance}.
     */
    public CallsPublicRecordingFile id(String id) {
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
     * @return This {@link CallsPublicRecordingFile instance}.
     */
    public CallsPublicRecordingFile name(String name) {
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
     * The field is required.
     *
     * @param fileFormat
     * @return This {@link CallsPublicRecordingFile instance}.
     */
    public CallsPublicRecordingFile fileFormat(CallsFileFormat fileFormat) {
        this.fileFormat = fileFormat;
        return this;
    }

    /**
     * Returns fileFormat.
     * <p>
     * The field is required.
     *
     * @return fileFormat
     */
    @JsonProperty("fileFormat")
    public CallsFileFormat getFileFormat() {
        return fileFormat;
    }

    /**
     * Sets fileFormat.
     * <p>
     * The field is required.
     *
     * @param fileFormat
     */
    @JsonProperty("fileFormat")
    public void setFileFormat(CallsFileFormat fileFormat) {
        this.fileFormat = fileFormat;
    }

    /**
     * Sets size.
     * <p>
     * Field description:
     * File size in bytes.
     *
     * @param size
     * @return This {@link CallsPublicRecordingFile instance}.
     */
    public CallsPublicRecordingFile size(Long size) {
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
     * @return This {@link CallsPublicRecordingFile instance}.
     */
    public CallsPublicRecordingFile creationTime(OffsetDateTime creationTime) {
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
     * Sets duration.
     * <p>
     * Field description:
     * File duration in seconds.
     *
     * @param duration
     * @return This {@link CallsPublicRecordingFile instance}.
     */
    public CallsPublicRecordingFile duration(Long duration) {
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

    /**
     * Sets startTime.
     * <p>
     * Field description:
     * Date and time when the recording started.
     *
     * @param startTime
     * @return This {@link CallsPublicRecordingFile instance}.
     */
    public CallsPublicRecordingFile startTime(OffsetDateTime startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * Returns startTime.
     * <p>
     * Field description:
     * Date and time when the recording started.
     *
     * @return startTime
     */
    @JsonProperty("startTime")
    public OffsetDateTime getStartTime() {
        return startTime;
    }

    /**
     * Sets startTime.
     * <p>
     * Field description:
     * Date and time when the recording started.
     *
     * @param startTime
     */
    @JsonProperty("startTime")
    public void setStartTime(OffsetDateTime startTime) {
        this.startTime = startTime;
    }

    /**
     * Sets endTime.
     * <p>
     * Field description:
     * Date and time when the recording ended.
     *
     * @param endTime
     * @return This {@link CallsPublicRecordingFile instance}.
     */
    public CallsPublicRecordingFile endTime(OffsetDateTime endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * Returns endTime.
     * <p>
     * Field description:
     * Date and time when the recording ended.
     *
     * @return endTime
     */
    @JsonProperty("endTime")
    public OffsetDateTime getEndTime() {
        return endTime;
    }

    /**
     * Sets endTime.
     * <p>
     * Field description:
     * Date and time when the recording ended.
     *
     * @param endTime
     */
    @JsonProperty("endTime")
    public void setEndTime(OffsetDateTime endTime) {
        this.endTime = endTime;
    }

    /**
     * Sets location.
     *
     * @param location
     * @return This {@link CallsPublicRecordingFile instance}.
     */
    public CallsPublicRecordingFile location(CallsRecordingFileLocation location) {
        this.location = location;
        return this;
    }

    /**
     * Returns location.
     *
     * @return location
     */
    @JsonProperty("location")
    public CallsRecordingFileLocation getLocation() {
        return location;
    }

    /**
     * Sets location.
     *
     * @param location
     */
    @JsonProperty("location")
    public void setLocation(CallsRecordingFileLocation location) {
        this.location = location;
    }

    /**
     * Sets sftpUploadStatus.
     *
     * @param sftpUploadStatus
     * @return This {@link CallsPublicRecordingFile instance}.
     */
    public CallsPublicRecordingFile sftpUploadStatus(CallsSftpUploadStatus sftpUploadStatus) {
        this.sftpUploadStatus = sftpUploadStatus;
        return this;
    }

    /**
     * Returns sftpUploadStatus.
     *
     * @return sftpUploadStatus
     */
    @JsonProperty("sftpUploadStatus")
    public CallsSftpUploadStatus getSftpUploadStatus() {
        return sftpUploadStatus;
    }

    /**
     * Sets sftpUploadStatus.
     *
     * @param sftpUploadStatus
     */
    @JsonProperty("sftpUploadStatus")
    public void setSftpUploadStatus(CallsSftpUploadStatus sftpUploadStatus) {
        this.sftpUploadStatus = sftpUploadStatus;
    }

    /**
     * Sets customData.
     * <p>
     * Field description:
     * Custom data.
     *
     * @param customData
     * @return This {@link CallsPublicRecordingFile instance}.
     */
    public CallsPublicRecordingFile customData(Map<String, String> customData) {
        this.customData = customData;
        return this;
    }

    /**
     * Puts and entry into customData.
     * <p>
     * Field description:
     * Custom data.
     *
     * @param key The given key.
     * @param customDataItem The item to be associated with the given key.
     * @return This {@link CallsPublicRecordingFile instance}.
     */
    public CallsPublicRecordingFile putCustomDataItem(String key, String customDataItem) {
        if (this.customData == null) {
            this.customData = new HashMap<>();
        }
        this.customData.put(key, customDataItem);
        return this;
    }

    /**
     * Returns customData.
     * <p>
     * Field description:
     * Custom data.
     *
     * @return customData
     */
    @JsonProperty("customData")
    public Map<String, String> getCustomData() {
        return customData;
    }

    /**
     * Sets customData.
     * <p>
     * Field description:
     * Custom data.
     *
     * @param customData
     */
    @JsonProperty("customData")
    public void setCustomData(Map<String, String> customData) {
        this.customData = customData;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CallsPublicRecordingFile callsPublicRecordingFile = (CallsPublicRecordingFile) o;
        return Objects.equals(this.id, callsPublicRecordingFile.id)
                && Objects.equals(this.name, callsPublicRecordingFile.name)
                && Objects.equals(this.fileFormat, callsPublicRecordingFile.fileFormat)
                && Objects.equals(this.size, callsPublicRecordingFile.size)
                && Objects.equals(this.creationTime, callsPublicRecordingFile.creationTime)
                && Objects.equals(this.duration, callsPublicRecordingFile.duration)
                && Objects.equals(this.startTime, callsPublicRecordingFile.startTime)
                && Objects.equals(this.endTime, callsPublicRecordingFile.endTime)
                && Objects.equals(this.location, callsPublicRecordingFile.location)
                && Objects.equals(this.sftpUploadStatus, callsPublicRecordingFile.sftpUploadStatus)
                && Objects.equals(this.customData, callsPublicRecordingFile.customData);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                id,
                name,
                fileFormat,
                size,
                creationTime,
                duration,
                startTime,
                endTime,
                location,
                sftpUploadStatus,
                customData);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class CallsPublicRecordingFile {")
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
                .append("    duration: ")
                .append(toIndentedString(duration))
                .append(newLine)
                .append("    startTime: ")
                .append(toIndentedString(startTime))
                .append(newLine)
                .append("    endTime: ")
                .append(toIndentedString(endTime))
                .append(newLine)
                .append("    location: ")
                .append(toIndentedString(location))
                .append(newLine)
                .append("    sftpUploadStatus: ")
                .append(toIndentedString(sftpUploadStatus))
                .append(newLine)
                .append("    customData: ")
                .append(toIndentedString(customData))
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
