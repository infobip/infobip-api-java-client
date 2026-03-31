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
import java.util.UUID;

/**
 * Preview of the screenshot document. This property is read-only and ignored in POST/PUT calls.
 */
public class NumbersDocumentMetadata {

    private UUID documentId;

    private String documentName;

    private String contentType;

    private Integer contentLength;

    /**
     * Sets documentId.
     * <p>
     * Field description:
     * Unique identifier for the document.
     *
     * @param documentId
     * @return This {@link NumbersDocumentMetadata instance}.
     */
    public NumbersDocumentMetadata documentId(UUID documentId) {
        this.documentId = documentId;
        return this;
    }

    /**
     * Returns documentId.
     * <p>
     * Field description:
     * Unique identifier for the document.
     *
     * @return documentId
     */
    @JsonProperty("documentId")
    public UUID getDocumentId() {
        return documentId;
    }

    /**
     * Sets documentId.
     * <p>
     * Field description:
     * Unique identifier for the document.
     *
     * @param documentId
     */
    @JsonProperty("documentId")
    public void setDocumentId(UUID documentId) {
        this.documentId = documentId;
    }

    /**
     * Sets documentName.
     * <p>
     * Field description:
     * Name of the document file.
     *
     * @param documentName
     * @return This {@link NumbersDocumentMetadata instance}.
     */
    public NumbersDocumentMetadata documentName(String documentName) {
        this.documentName = documentName;
        return this;
    }

    /**
     * Returns documentName.
     * <p>
     * Field description:
     * Name of the document file.
     *
     * @return documentName
     */
    @JsonProperty("documentName")
    public String getDocumentName() {
        return documentName;
    }

    /**
     * Sets documentName.
     * <p>
     * Field description:
     * Name of the document file.
     *
     * @param documentName
     */
    @JsonProperty("documentName")
    public void setDocumentName(String documentName) {
        this.documentName = documentName;
    }

    /**
     * Sets contentType.
     * <p>
     * Field description:
     * MIME type of the document content (e.g., application/pdf, image/png).
     *
     * @param contentType
     * @return This {@link NumbersDocumentMetadata instance}.
     */
    public NumbersDocumentMetadata contentType(String contentType) {
        this.contentType = contentType;
        return this;
    }

    /**
     * Returns contentType.
     * <p>
     * Field description:
     * MIME type of the document content (e.g., application/pdf, image/png).
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
     * MIME type of the document content (e.g., application/pdf, image/png).
     *
     * @param contentType
     */
    @JsonProperty("contentType")
    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    /**
     * Sets contentLength.
     * <p>
     * Field description:
     * Size of the document content in bytes.
     *
     * @param contentLength
     * @return This {@link NumbersDocumentMetadata instance}.
     */
    public NumbersDocumentMetadata contentLength(Integer contentLength) {
        this.contentLength = contentLength;
        return this;
    }

    /**
     * Returns contentLength.
     * <p>
     * Field description:
     * Size of the document content in bytes.
     *
     * @return contentLength
     */
    @JsonProperty("contentLength")
    public Integer getContentLength() {
        return contentLength;
    }

    /**
     * Sets contentLength.
     * <p>
     * Field description:
     * Size of the document content in bytes.
     *
     * @param contentLength
     */
    @JsonProperty("contentLength")
    public void setContentLength(Integer contentLength) {
        this.contentLength = contentLength;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        NumbersDocumentMetadata numbersDocumentMetadata = (NumbersDocumentMetadata) o;
        return Objects.equals(this.documentId, numbersDocumentMetadata.documentId)
                && Objects.equals(this.documentName, numbersDocumentMetadata.documentName)
                && Objects.equals(this.contentType, numbersDocumentMetadata.contentType)
                && Objects.equals(this.contentLength, numbersDocumentMetadata.contentLength);
    }

    @Override
    public int hashCode() {
        return Objects.hash(documentId, documentName, contentType, contentLength);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class NumbersDocumentMetadata {")
                .append(newLine)
                .append("    documentId: ")
                .append(toIndentedString(documentId))
                .append(newLine)
                .append("    documentName: ")
                .append(toIndentedString(documentName))
                .append(newLine)
                .append("    contentType: ")
                .append(toIndentedString(contentType))
                .append(newLine)
                .append("    contentLength: ")
                .append(toIndentedString(contentLength))
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
