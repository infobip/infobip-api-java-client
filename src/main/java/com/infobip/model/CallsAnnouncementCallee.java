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
 * Announcement to be played to a callee before connecting them to a caller.
 */
public class CallsAnnouncementCallee {

    private String fileId;

    private String fileUrl;

    /**
     * Sets fileId.
     * <p>
     * Field description:
     * ID of an audio file played to a callee. Required if &#x60;fileUrl&#x60; is not provided.
     *
     * @param fileId
     * @return This {@link CallsAnnouncementCallee instance}.
     */
    public CallsAnnouncementCallee fileId(String fileId) {
        this.fileId = fileId;
        return this;
    }

    /**
     * Returns fileId.
     * <p>
     * Field description:
     * ID of an audio file played to a callee. Required if &#x60;fileUrl&#x60; is not provided.
     *
     * @return fileId
     */
    @JsonProperty("fileId")
    public String getFileId() {
        return fileId;
    }

    /**
     * Sets fileId.
     * <p>
     * Field description:
     * ID of an audio file played to a callee. Required if &#x60;fileUrl&#x60; is not provided.
     *
     * @param fileId
     */
    @JsonProperty("fileId")
    public void setFileId(String fileId) {
        this.fileId = fileId;
    }

    /**
     * Sets fileUrl.
     * <p>
     * Field description:
     * URL of an audio file played to a callee. Required if &#x60;fileId&#x60; is not provided.
     *
     * @param fileUrl
     * @return This {@link CallsAnnouncementCallee instance}.
     */
    public CallsAnnouncementCallee fileUrl(String fileUrl) {
        this.fileUrl = fileUrl;
        return this;
    }

    /**
     * Returns fileUrl.
     * <p>
     * Field description:
     * URL of an audio file played to a callee. Required if &#x60;fileId&#x60; is not provided.
     *
     * @return fileUrl
     */
    @JsonProperty("fileUrl")
    public String getFileUrl() {
        return fileUrl;
    }

    /**
     * Sets fileUrl.
     * <p>
     * Field description:
     * URL of an audio file played to a callee. Required if &#x60;fileId&#x60; is not provided.
     *
     * @param fileUrl
     */
    @JsonProperty("fileUrl")
    public void setFileUrl(String fileUrl) {
        this.fileUrl = fileUrl;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CallsAnnouncementCallee callsAnnouncementCallee = (CallsAnnouncementCallee) o;
        return Objects.equals(this.fileId, callsAnnouncementCallee.fileId)
                && Objects.equals(this.fileUrl, callsAnnouncementCallee.fileUrl);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fileId, fileUrl);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class CallsAnnouncementCallee {")
                .append(newLine)
                .append("    fileId: ")
                .append(toIndentedString(fileId))
                .append(newLine)
                .append("    fileUrl: ")
                .append(toIndentedString(fileUrl))
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
