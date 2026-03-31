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
 * Represents ResourcesDocumentIdentifier model.
 */
public class ResourcesDocumentIdentifier {

    private String documentId;

    /**
     * Sets documentId.
     * <p>
     * Field description:
     * The ID of the document.
     *
     * @param documentId
     * @return This {@link ResourcesDocumentIdentifier instance}.
     */
    public ResourcesDocumentIdentifier documentId(String documentId) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ResourcesDocumentIdentifier resourcesDocumentIdentifier = (ResourcesDocumentIdentifier) o;
        return Objects.equals(this.documentId, resourcesDocumentIdentifier.documentId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(documentId);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class ResourcesDocumentIdentifier {")
                .append(newLine)
                .append("    documentId: ")
                .append(toIndentedString(documentId))
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
