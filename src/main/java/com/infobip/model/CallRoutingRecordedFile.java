/*
 * This class is auto generated from the Infobip OpenAPI specification
 * through the OpenAPI Specification Client API libraries (Re)Generator (OSCAR),
 * powered by the OpenAPI Generator (https://openapi-generator.tech).
 *
 * Do not edit manually. To learn how to raise an issue, see the CONTRIBUTING guide
 * or contact us @ support@infobip.com.
 */

package com.infobip.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Recorded file.
 */
public class CallRoutingRecordedFile {

    private String id;

    private String name;

    /**
     * File format.
     */
    public enum FileFormatEnum {
        MP3("MP3"),
        WAV("WAV"),
        MP4("MP4");

        private String value;

        FileFormatEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static FileFormatEnum fromValue(String value) {
            for (FileFormatEnum enumElement : FileFormatEnum.values()) {
                if (enumElement.value.equals(value)) {
                    return enumElement;
                }
            }
            throw new IllegalArgumentException("Unexpected enum value '" + value + "'.");
        }
    }

    private FileFormatEnum fileFormat;

    private Long size;

    private OffsetDateTime startTime;

    private OffsetDateTime endTime;

    private OffsetDateTime creationTime;

    private Long duration;

    /**
     * Location of recording file after processing.
     */
    public enum LocationEnum {
        UPLOADING("UPLOADING"),
        UPLOADED("UPLOADED"),
        HOSTED("HOSTED");

        private String value;

        LocationEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static LocationEnum fromValue(String value) {
            for (LocationEnum enumElement : LocationEnum.values()) {
                if (enumElement.value.equals(value)) {
                    return enumElement;
                }
            }
            throw new IllegalArgumentException("Unexpected enum value '" + value + "'.");
        }
    }

    private LocationEnum location;

    private Map<String, String> customData = null;

    /**
     * Sets id.
     * <p>
     * Field description:
     * File ID.
     *
     * @param id
     * @return This {@link CallRoutingRecordedFile instance}.
     */
    public CallRoutingRecordedFile id(String id) {
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
     *
     * @param name
     * @return This {@link CallRoutingRecordedFile instance}.
     */
    public CallRoutingRecordedFile name(String name) {
        this.name = name;
        return this;
    }

    /**
     * Returns name.
     * <p>
     * Field description:
     * File name.
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
     *
     * @param fileFormat
     * @return This {@link CallRoutingRecordedFile instance}.
     */
    public CallRoutingRecordedFile fileFormat(FileFormatEnum fileFormat) {
        this.fileFormat = fileFormat;
        return this;
    }

    /**
     * Returns fileFormat.
     * <p>
     * Field description:
     * File format.
     *
     * @return fileFormat
     */
    @JsonProperty("fileFormat")
    public FileFormatEnum getFileFormat() {
        return fileFormat;
    }

    /**
     * Sets fileFormat.
     * <p>
     * Field description:
     * File format.
     *
     * @param fileFormat
     */
    @JsonProperty("fileFormat")
    public void setFileFormat(FileFormatEnum fileFormat) {
        this.fileFormat = fileFormat;
    }

    /**
     * Sets size.
     * <p>
     * Field description:
     * File size in bytes.
     *
     * @param size
     * @return This {@link CallRoutingRecordedFile instance}.
     */
    public CallRoutingRecordedFile size(Long size) {
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
     * Sets startTime.
     * <p>
     * Field description:
     * Date and time when the recording started.
     *
     * @param startTime
     * @return This {@link CallRoutingRecordedFile instance}.
     */
    public CallRoutingRecordedFile startTime(OffsetDateTime startTime) {
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
     * @return This {@link CallRoutingRecordedFile instance}.
     */
    public CallRoutingRecordedFile endTime(OffsetDateTime endTime) {
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
     * Sets creationTime.
     * <p>
     * Field description:
     * File creation time.
     *
     * @param creationTime
     * @return This {@link CallRoutingRecordedFile instance}.
     */
    public CallRoutingRecordedFile creationTime(OffsetDateTime creationTime) {
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
     * @return This {@link CallRoutingRecordedFile instance}.
     */
    public CallRoutingRecordedFile duration(Long duration) {
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
     * Sets location.
     * <p>
     * Field description:
     * Location of recording file after processing.
     *
     * @param location
     * @return This {@link CallRoutingRecordedFile instance}.
     */
    public CallRoutingRecordedFile location(LocationEnum location) {
        this.location = location;
        return this;
    }

    /**
     * Returns location.
     * <p>
     * Field description:
     * Location of recording file after processing.
     *
     * @return location
     */
    @JsonProperty("location")
    public LocationEnum getLocation() {
        return location;
    }

    /**
     * Sets location.
     * <p>
     * Field description:
     * Location of recording file after processing.
     *
     * @param location
     */
    @JsonProperty("location")
    public void setLocation(LocationEnum location) {
        this.location = location;
    }

    /**
     * Sets customData.
     * <p>
     * Field description:
     * Client-defined data.
     *
     * @param customData
     * @return This {@link CallRoutingRecordedFile instance}.
     */
    public CallRoutingRecordedFile customData(Map<String, String> customData) {
        this.customData = customData;
        return this;
    }

    /**
     * Puts and entry into customData.
     * <p>
     * Field description:
     * Client-defined data.
     *
     * @param key The given key.
     * @param customDataItem The item to be associated with the given key.
     * @return This {@link CallRoutingRecordedFile instance}.
     */
    public CallRoutingRecordedFile putCustomDataItem(String key, String customDataItem) {
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
     * Client-defined data.
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
     * Client-defined data.
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
        CallRoutingRecordedFile callRoutingRecordedFile = (CallRoutingRecordedFile) o;
        return Objects.equals(this.id, callRoutingRecordedFile.id)
                && Objects.equals(this.name, callRoutingRecordedFile.name)
                && Objects.equals(this.fileFormat, callRoutingRecordedFile.fileFormat)
                && Objects.equals(this.size, callRoutingRecordedFile.size)
                && Objects.equals(this.startTime, callRoutingRecordedFile.startTime)
                && Objects.equals(this.endTime, callRoutingRecordedFile.endTime)
                && Objects.equals(this.creationTime, callRoutingRecordedFile.creationTime)
                && Objects.equals(this.duration, callRoutingRecordedFile.duration)
                && Objects.equals(this.location, callRoutingRecordedFile.location)
                && Objects.equals(this.customData, callRoutingRecordedFile.customData);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                id, name, fileFormat, size, startTime, endTime, creationTime, duration, location, customData);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class CallRoutingRecordedFile {")
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
                .append("    startTime: ")
                .append(toIndentedString(startTime))
                .append(newLine)
                .append("    endTime: ")
                .append(toIndentedString(endTime))
                .append(newLine)
                .append("    creationTime: ")
                .append(toIndentedString(creationTime))
                .append(newLine)
                .append("    duration: ")
                .append(toIndentedString(duration))
                .append(newLine)
                .append("    location: ")
                .append(toIndentedString(location))
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
