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
 * Object defining display of card media.
 */
public class RcsCardMedia {

    private RcsCardResourceSchema _file;

    private RcsResource thumbnail;

    private RcsHeight height;

    /**
     * Sets _file.
     * <p>
     * The field is required.
     *
     * @param _file
     * @return This {@link RcsCardMedia instance}.
     */
    public RcsCardMedia _file(RcsCardResourceSchema _file) {
        this._file = _file;
        return this;
    }

    /**
     * Returns _file.
     * <p>
     * The field is required.
     *
     * @return _file
     */
    @JsonProperty("file")
    public RcsCardResourceSchema getFile() {
        return _file;
    }

    /**
     * Sets _file.
     * <p>
     * The field is required.
     *
     * @param _file
     */
    @JsonProperty("file")
    public void setFile(RcsCardResourceSchema _file) {
        this._file = _file;
    }

    /**
     * Sets thumbnail.
     *
     * @param thumbnail
     * @return This {@link RcsCardMedia instance}.
     */
    public RcsCardMedia thumbnail(RcsResource thumbnail) {
        this.thumbnail = thumbnail;
        return this;
    }

    /**
     * Returns thumbnail.
     *
     * @return thumbnail
     */
    @JsonProperty("thumbnail")
    public RcsResource getThumbnail() {
        return thumbnail;
    }

    /**
     * Sets thumbnail.
     *
     * @param thumbnail
     */
    @JsonProperty("thumbnail")
    public void setThumbnail(RcsResource thumbnail) {
        this.thumbnail = thumbnail;
    }

    /**
     * Sets height.
     * <p>
     * The field is required.
     *
     * @param height
     * @return This {@link RcsCardMedia instance}.
     */
    public RcsCardMedia height(RcsHeight height) {
        this.height = height;
        return this;
    }

    /**
     * Returns height.
     * <p>
     * The field is required.
     *
     * @return height
     */
    @JsonProperty("height")
    public RcsHeight getHeight() {
        return height;
    }

    /**
     * Sets height.
     * <p>
     * The field is required.
     *
     * @param height
     */
    @JsonProperty("height")
    public void setHeight(RcsHeight height) {
        this.height = height;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RcsCardMedia rcsCardMedia = (RcsCardMedia) o;
        return Objects.equals(this._file, rcsCardMedia._file)
                && Objects.equals(this.thumbnail, rcsCardMedia.thumbnail)
                && Objects.equals(this.height, rcsCardMedia.height);
    }

    @Override
    public int hashCode() {
        return Objects.hash(_file, thumbnail, height);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class RcsCardMedia {")
                .append(newLine)
                .append("    _file: ")
                .append(toIndentedString(_file))
                .append(newLine)
                .append("    thumbnail: ")
                .append(toIndentedString(thumbnail))
                .append(newLine)
                .append("    height: ")
                .append(toIndentedString(height))
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
