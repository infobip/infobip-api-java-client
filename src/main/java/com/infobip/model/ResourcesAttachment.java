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
 * Attachment.
 */
public class ResourcesAttachment {

    private String documentId;

    private ResourcesDocumentType documentType;

    /**
     * Sets documentId.
     * <p>
     * Field description:
     * The ID of the document.
     *
     * @param documentId
     * @return This {@link ResourcesAttachment instance}.
     */
    public ResourcesAttachment documentId(String documentId) {
        this.documentId = documentId;
        return this;
    }

    /**
     * Returns documentId.
     * <p>
     * Field description:
     * The ID of the document.
     *
     * @return documentId
     */
    @JsonProperty("documentId")
    public String getDocumentId() {
        return documentId;
    }

    /**
     * Sets documentId.
     * <p>
     * Field description:
     * The ID of the document.
     *
     * @param documentId
     */
    @JsonProperty("documentId")
    public void setDocumentId(String documentId) {
        this.documentId = documentId;
    }

    /**
     * Sets documentType.
     *
     * @param documentType
     * @return This {@link ResourcesAttachment instance}.
     */
    public ResourcesAttachment documentType(ResourcesDocumentType documentType) {
        this.documentType = documentType;
        return this;
    }

    /**
     * Returns documentType.
     *
     * @return documentType
     */
    @JsonProperty("documentType")
    public ResourcesDocumentType getDocumentType() {
        return documentType;
    }

    /**
     * Sets documentType.
     *
     * @param documentType
     */
    @JsonProperty("documentType")
    public void setDocumentType(ResourcesDocumentType documentType) {
        this.documentType = documentType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ResourcesAttachment resourcesAttachment = (ResourcesAttachment) o;
        return Objects.equals(this.documentId, resourcesAttachment.documentId)
                && Objects.equals(this.documentType, resourcesAttachment.documentType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(documentId, documentType);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class ResourcesAttachment {")
                .append(newLine)
                .append("    documentId: ")
                .append(toIndentedString(documentId))
                .append(newLine)
                .append("    documentType: ")
                .append(toIndentedString(documentType))
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
