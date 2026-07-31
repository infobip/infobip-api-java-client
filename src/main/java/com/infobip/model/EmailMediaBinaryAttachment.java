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
import java.util.Arrays;
import java.util.Objects;

/**
 * Represents EmailMediaBinaryAttachment model.
 */
public class EmailMediaBinaryAttachment extends EmailMediaAttachment {

    private byte[] content;

    private String contentType;

    private String fileName;

    private String password;

    /**
     * Constructs a new {@link EmailMediaBinaryAttachment} instance.
     */
    public EmailMediaBinaryAttachment() {
        super("binary");
    }

    /**
     * Sets content.
     * <p>
     * Field description:
     * File content as a Base64-encoded byte array.
     * <p>
     * The field is required.
     *
     * @param content
     * @return This {@link EmailMediaBinaryAttachment instance}.
     */
    public EmailMediaBinaryAttachment content(byte[] content) {
        this.content = content;
        return this;
    }

    /**
     * Returns content.
     * <p>
     * Field description:
     * File content as a Base64-encoded byte array.
     * <p>
     * The field is required.
     *
     * @return content
     */
    @JsonProperty("content")
    public byte[] getContent() {
        return content;
    }

    /**
     * Sets content.
     * <p>
     * Field description:
     * File content as a Base64-encoded byte array.
     * <p>
     * The field is required.
     *
     * @param content
     */
    @JsonProperty("content")
    public void setContent(byte[] content) {
        this.content = content;
    }

    /**
     * Sets contentType.
     * <p>
     * Field description:
     * Content type.
     * <p>
     * The field is required.
     *
     * @param contentType
     * @return This {@link EmailMediaBinaryAttachment instance}.
     */
    public EmailMediaBinaryAttachment contentType(String contentType) {
        this.contentType = contentType;
        return this;
    }

    /**
     * Returns contentType.
     * <p>
     * Field description:
     * Content type.
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
     * Content type.
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
     * Sets fileName.
     * <p>
     * Field description:
     * File name.
     * <p>
     * The field is required.
     *
     * @param fileName
     * @return This {@link EmailMediaBinaryAttachment instance}.
     */
    public EmailMediaBinaryAttachment fileName(String fileName) {
        this.fileName = fileName;
        return this;
    }

    /**
     * Returns fileName.
     * <p>
     * Field description:
     * File name.
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
     * File name.
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
     * Sets password.
     * <p>
     * Field description:
     * Optional password used to encrypt PDF attachments. If provided, the generated PDF will be password-protected. Password protection can be applied exclusively to PDF files.
     *
     * @param password
     * @return This {@link EmailMediaBinaryAttachment instance}.
     */
    public EmailMediaBinaryAttachment password(String password) {
        this.password = password;
        return this;
    }

    /**
     * Returns password.
     * <p>
     * Field description:
     * Optional password used to encrypt PDF attachments. If provided, the generated PDF will be password-protected. Password protection can be applied exclusively to PDF files.
     *
     * @return password
     */
    @JsonProperty("password")
    public String getPassword() {
        return password;
    }

    /**
     * Sets password.
     * <p>
     * Field description:
     * Optional password used to encrypt PDF attachments. If provided, the generated PDF will be password-protected. Password protection can be applied exclusively to PDF files.
     *
     * @param password
     */
    @JsonProperty("password")
    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        EmailMediaBinaryAttachment emailMediaBinaryAttachment = (EmailMediaBinaryAttachment) o;
        return Arrays.equals(this.content, emailMediaBinaryAttachment.content)
                && Objects.equals(this.contentType, emailMediaBinaryAttachment.contentType)
                && Objects.equals(this.fileName, emailMediaBinaryAttachment.fileName)
                && Objects.equals(this.password, emailMediaBinaryAttachment.password)
                && super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Arrays.hashCode(content), contentType, fileName, password, super.hashCode());
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class EmailMediaBinaryAttachment {")
                .append(newLine)
                .append("    ")
                .append(toIndentedString(super.toString()))
                .append(newLine)
                .append("    content: ")
                .append(toIndentedString(content))
                .append(newLine)
                .append("    contentType: ")
                .append(toIndentedString(contentType))
                .append(newLine)
                .append("    fileName: ")
                .append(toIndentedString(fileName))
                .append(newLine)
                .append("    password: ")
                .append(toIndentedString(password))
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
