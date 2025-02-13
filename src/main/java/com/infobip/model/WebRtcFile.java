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
 * Recording file.
 */
public class WebRtcFile {

    private String id;

    private String name;

    private FileFormat fileFormat;

    /**
     * Sets id.
     * <p>
     * Field description:
     * Id of the file.
     *
     * @param id
     * @return This {@link WebRtcFile instance}.
     */
    public WebRtcFile id(String id) {
        this.id = id;
        return this;
    }

    /**
     * Returns id.
     * <p>
     * Field description:
     * Id of the file.
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
     * Id of the file.
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
     * @return This {@link WebRtcFile instance}.
     */
    public WebRtcFile name(String name) {
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
     * @return This {@link WebRtcFile instance}.
     */
    public WebRtcFile fileFormat(FileFormat fileFormat) {
        this.fileFormat = fileFormat;
        return this;
    }

    /**
     * Returns fileFormat.
     *
     * @return fileFormat
     */
    @JsonProperty("fileFormat")
    public FileFormat getFileFormat() {
        return fileFormat;
    }

    /**
     * Sets fileFormat.
     *
     * @param fileFormat
     */
    @JsonProperty("fileFormat")
    public void setFileFormat(FileFormat fileFormat) {
        this.fileFormat = fileFormat;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WebRtcFile webRtcFile = (WebRtcFile) o;
        return Objects.equals(this.id, webRtcFile.id)
                && Objects.equals(this.name, webRtcFile.name)
                && Objects.equals(this.fileFormat, webRtcFile.fileFormat);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, fileFormat);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class WebRtcFile {")
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
