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
 * The content object to build a message that will be sent.
 */
public class ViberFileContent {

    private String filename;

    private String mediaUrl;

    /**
     * Sets filename.
     * <p>
     * Field description:
     * Name of the file being sent (file extension included).
     * <p>
     * The field is required.
     *
     * @param filename
     * @return This {@link ViberFileContent instance}.
     */
    public ViberFileContent filename(String filename) {
        this.filename = filename;
        return this;
    }

    /**
     * Returns filename.
     * <p>
     * Field description:
     * Name of the file being sent (file extension included).
     * <p>
     * The field is required.
     *
     * @return filename
     */
    @JsonProperty("filename")
    public String getFilename() {
        return filename;
    }

    /**
     * Sets filename.
     * <p>
     * Field description:
     * Name of the file being sent (file extension included).
     * <p>
     * The field is required.
     *
     * @param filename
     */
    @JsonProperty("filename")
    public void setFilename(String filename) {
        this.filename = filename;
    }

    /**
     * Sets mediaUrl.
     * <p>
     * Field description:
     * URL of the file being sent. Must be a valid URL starting with https:// or http://. Supported file types are .doc, .docx, .rtf, .dot, .dotx, .odt ,.odf, .fodt, .txt, .info, .pdf, .xps, .pdax, .eps, .xls, .xlsx, .ods, .fods, .csv, .xlsm, .xltx. Maximum file size is 200 MB.
     * <p>
     * The field is required.
     *
     * @param mediaUrl
     * @return This {@link ViberFileContent instance}.
     */
    public ViberFileContent mediaUrl(String mediaUrl) {
        this.mediaUrl = mediaUrl;
        return this;
    }

    /**
     * Returns mediaUrl.
     * <p>
     * Field description:
     * URL of the file being sent. Must be a valid URL starting with https:// or http://. Supported file types are .doc, .docx, .rtf, .dot, .dotx, .odt ,.odf, .fodt, .txt, .info, .pdf, .xps, .pdax, .eps, .xls, .xlsx, .ods, .fods, .csv, .xlsm, .xltx. Maximum file size is 200 MB.
     * <p>
     * The field is required.
     *
     * @return mediaUrl
     */
    @JsonProperty("mediaUrl")
    public String getMediaUrl() {
        return mediaUrl;
    }

    /**
     * Sets mediaUrl.
     * <p>
     * Field description:
     * URL of the file being sent. Must be a valid URL starting with https:// or http://. Supported file types are .doc, .docx, .rtf, .dot, .dotx, .odt ,.odf, .fodt, .txt, .info, .pdf, .xps, .pdax, .eps, .xls, .xlsx, .ods, .fods, .csv, .xlsm, .xltx. Maximum file size is 200 MB.
     * <p>
     * The field is required.
     *
     * @param mediaUrl
     */
    @JsonProperty("mediaUrl")
    public void setMediaUrl(String mediaUrl) {
        this.mediaUrl = mediaUrl;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ViberFileContent viberFileContent = (ViberFileContent) o;
        return Objects.equals(this.filename, viberFileContent.filename)
                && Objects.equals(this.mediaUrl, viberFileContent.mediaUrl);
    }

    @Override
    public int hashCode() {
        return Objects.hash(filename, mediaUrl);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class ViberFileContent {")
                .append(newLine)
                .append("    filename: ")
                .append(toIndentedString(filename))
                .append(newLine)
                .append("    mediaUrl: ")
                .append(toIndentedString(mediaUrl))
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
