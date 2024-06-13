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
 * Represents ViberOutboundFileContent model.
 */
public class ViberOutboundFileContent extends ViberOutboundContent {

    private String fileName;

    private String mediaUrl;

    /**
     * Constructs a new {@link ViberOutboundFileContent} instance.
     */
    public ViberOutboundFileContent() {
        super("FILE");
    }

    /**
     * Sets fileName.
     * <p>
     * Field description:
     * Name of the file being sent (file extension included).
     * <p>
     * The field is required.
     *
     * @param fileName
     * @return This {@link ViberOutboundFileContent instance}.
     */
    public ViberOutboundFileContent fileName(String fileName) {
        this.fileName = fileName;
        return this;
    }

    /**
     * Returns fileName.
     * <p>
     * Field description:
     * Name of the file being sent (file extension included).
     * <p>
     * The field is required.
     *
     * @return fileName
     */
    @JsonProperty("fileName")
    public String getFileName() {
        return fileName;
    }

    /**
     * Sets fileName.
     * <p>
     * Field description:
     * Name of the file being sent (file extension included).
     * <p>
     * The field is required.
     *
     * @param fileName
     */
    @JsonProperty("fileName")
    public void setFileName(String fileName) {
        this.fileName = fileName;
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
     * @return This {@link ViberOutboundFileContent instance}.
     */
    public ViberOutboundFileContent mediaUrl(String mediaUrl) {
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
        ViberOutboundFileContent viberOutboundFileContent = (ViberOutboundFileContent) o;
        return Objects.equals(this.fileName, viberOutboundFileContent.fileName)
                && Objects.equals(this.mediaUrl, viberOutboundFileContent.mediaUrl)
                && super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fileName, mediaUrl, super.hashCode());
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class ViberOutboundFileContent {")
                .append(newLine)
                .append("    ")
                .append(toIndentedString(super.toString()))
                .append(newLine)
                .append("    fileName: ")
                .append(toIndentedString(fileName))
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
