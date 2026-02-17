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
 * Represents CallsRecordingFile model.
 */
public class CallsRecordingFile {

    private String id;

    private String name;

    private CallsFileFormat fileFormat;

    private Long size;

    private OffsetDateTime creationTime;

    private OffsetDateTime expirationTime;

    private Long duration;

    private OffsetDateTime startTime;

    private OffsetDateTime endTime;

    private CallsRecordingFileLocation location;

    private CallsSftpUploadStatus sftpUploadStatus;

    private Map<String, String> multichannelMappingData = null;

    /**
     * Sets id.
     * <p>
     * Field description:
     * File ID.
     *
     * @param id
     * @return This {@link CallsRecordingFile instance}.
     */
    public CallsRecordingFile id(String id) {
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
     * @return This {@link CallsRecordingFile instance}.
     */
    public CallsRecordingFile name(String name) {
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
     * @return This {@link CallsRecordingFile instance}.
     */
    public CallsRecordingFile fileFormat(CallsFileFormat fileFormat) {
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
     * @return This {@link CallsRecordingFile instance}.
     */
    public CallsRecordingFile size(Long size) {
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
     * @return This {@link CallsRecordingFile instance}.
     */
    public CallsRecordingFile creationTime(OffsetDateTime creationTime) {
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
     * @return This {@link CallsRecordingFile instance}.
     */
    public CallsRecordingFile expirationTime(OffsetDateTime expirationTime) {
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
     * @return This {@link CallsRecordingFile instance}.
     */
    public CallsRecordingFile duration(Long duration) {
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
     * @return This {@link CallsRecordingFile instance}.
     */
    public CallsRecordingFile startTime(OffsetDateTime startTime) {
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
     * @return This {@link CallsRecordingFile instance}.
     */
    public CallsRecordingFile endTime(OffsetDateTime endTime) {
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
     * @return This {@link CallsRecordingFile instance}.
     */
    public CallsRecordingFile location(CallsRecordingFileLocation location) {
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
     * @return This {@link CallsRecordingFile instance}.
     */
    public CallsRecordingFile sftpUploadStatus(CallsSftpUploadStatus sftpUploadStatus) {
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
     * Sets multichannelMappingData.
     * <p>
     * Field description:
     * A map that associates audio channels with their respective call IDs for managing multichannel composed recordings.
     *
     * @param multichannelMappingData
     * @return This {@link CallsRecordingFile instance}.
     */
    public CallsRecordingFile multichannelMappingData(Map<String, String> multichannelMappingData) {
        this.multichannelMappingData = multichannelMappingData;
        return this;
    }

    /**
     * Puts and entry into multichannelMappingData.
     * <p>
     * Field description:
     * A map that associates audio channels with their respective call IDs for managing multichannel composed recordings.
     *
     * @param key The given key.
     * @param multichannelMappingDataItem The item to be associated with the given key.
     * @return This {@link CallsRecordingFile instance}.
     */
    public CallsRecordingFile putMultichannelMappingDataItem(String key, String multichannelMappingDataItem) {
        if (this.multichannelMappingData == null) {
            this.multichannelMappingData = new HashMap<>();
        }
        this.multichannelMappingData.put(key, multichannelMappingDataItem);
        return this;
    }

    /**
     * Returns multichannelMappingData.
     * <p>
     * Field description:
     * A map that associates audio channels with their respective call IDs for managing multichannel composed recordings.
     *
     * @return multichannelMappingData
     */
    @JsonProperty("multichannelMappingData")
    public Map<String, String> getMultichannelMappingData() {
        return multichannelMappingData;
    }

    /**
     * Sets multichannelMappingData.
     * <p>
     * Field description:
     * A map that associates audio channels with their respective call IDs for managing multichannel composed recordings.
     *
     * @param multichannelMappingData
     */
    @JsonProperty("multichannelMappingData")
    public void setMultichannelMappingData(Map<String, String> multichannelMappingData) {
        this.multichannelMappingData = multichannelMappingData;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CallsRecordingFile callsRecordingFile = (CallsRecordingFile) o;
        return Objects.equals(this.id, callsRecordingFile.id)
                && Objects.equals(this.name, callsRecordingFile.name)
                && Objects.equals(this.fileFormat, callsRecordingFile.fileFormat)
                && Objects.equals(this.size, callsRecordingFile.size)
                && Objects.equals(this.creationTime, callsRecordingFile.creationTime)
                && Objects.equals(this.expirationTime, callsRecordingFile.expirationTime)
                && Objects.equals(this.duration, callsRecordingFile.duration)
                && Objects.equals(this.startTime, callsRecordingFile.startTime)
                && Objects.equals(this.endTime, callsRecordingFile.endTime)
                && Objects.equals(this.location, callsRecordingFile.location)
                && Objects.equals(this.sftpUploadStatus, callsRecordingFile.sftpUploadStatus)
                && Objects.equals(this.multichannelMappingData, callsRecordingFile.multichannelMappingData);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                id,
                name,
                fileFormat,
                size,
                creationTime,
                expirationTime,
                duration,
                startTime,
                endTime,
                location,
                sftpUploadStatus,
                multichannelMappingData);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class CallsRecordingFile {")
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
                .append("    multichannelMappingData: ")
                .append(toIndentedString(multichannelMappingData))
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
