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
 * Represents EmailMediaUploadedReference model.
 */
public class EmailMediaUploadedReference {

    private String type;

    private String contentId;

    /**
     * Sets type.
     * <p>
     * The field is required.
     *
     * @param type
     * @return This {@link EmailMediaUploadedReference instance}.
     */
    public EmailMediaUploadedReference type(String type) {
        this.type = type;
        return this;
    }

    /**
     * Returns type.
     * <p>
     * The field is required.
     *
     * @return type
     */
    @JsonProperty("type")
    public String getType() {
        return type;
    }

    /**
     * Sets type.
     * <p>
     * The field is required.
     *
     * @param type
     */
    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    /**
     * Sets contentId.
     * <p>
     * Field description:
     * ID of previously uploaded binary content. [Upload binary content](https://infobip.com/docs/api/channels/email/upload-binary-content).
     * <p>
     * The field is required.
     *
     * @param contentId
     * @return This {@link EmailMediaUploadedReference instance}.
     */
    public EmailMediaUploadedReference contentId(String contentId) {
        this.contentId = contentId;
        return this;
    }

    /**
     * Returns contentId.
     * <p>
     * Field description:
     * ID of previously uploaded binary content. [Upload binary content](https://infobip.com/docs/api/channels/email/upload-binary-content).
     * <p>
     * The field is required.
     *
     * @return contentId
     */
    @JsonProperty("contentId")
    public String getContentId() {
        return contentId;
    }

    /**
     * Sets contentId.
     * <p>
     * Field description:
     * ID of previously uploaded binary content. [Upload binary content](https://infobip.com/docs/api/channels/email/upload-binary-content).
     * <p>
     * The field is required.
     *
     * @param contentId
     */
    @JsonProperty("contentId")
    public void setContentId(String contentId) {
        this.contentId = contentId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        EmailMediaUploadedReference emailMediaUploadedReference = (EmailMediaUploadedReference) o;
        return Objects.equals(this.type, emailMediaUploadedReference.type)
                && Objects.equals(this.contentId, emailMediaUploadedReference.contentId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, contentId);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class EmailMediaUploadedReference {")
                .append(newLine)
                .append("    type: ")
                .append(toIndentedString(type))
                .append(newLine)
                .append("    contentId: ")
                .append(toIndentedString(contentId))
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
