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
 * Represents MmsOutboundLinkSegment model.
 */
public class MmsOutboundLinkSegment extends MmsOutboundSegment {

    private String contentId;

    private String contentType;

    private String contentUrl;

    /**
     * Constructs a new {@link MmsOutboundLinkSegment} instance.
     */
    public MmsOutboundLinkSegment() {
        super("LINK");
    }

    /**
     * Sets contentId.
     * <p>
     * Field description:
     * Unique identifier within single message. Using other characters (e.g. spaces) may cause your message to be rejected by some mobile carriers.
     *
     * @param contentId
     * @return This {@link MmsOutboundLinkSegment instance}.
     */
    public MmsOutboundLinkSegment contentId(String contentId) {
        this.contentId = contentId;
        return this;
    }

    /**
     * Returns contentId.
     * <p>
     * Field description:
     * Unique identifier within single message. Using other characters (e.g. spaces) may cause your message to be rejected by some mobile carriers.
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
     * Unique identifier within single message. Using other characters (e.g. spaces) may cause your message to be rejected by some mobile carriers.
     *
     * @param contentId
     */
    @JsonProperty("contentId")
    public void setContentId(String contentId) {
        this.contentId = contentId;
    }

    /**
     * Sets contentType.
     * <p>
     * Field description:
     * Content type for media, for example &#x60;image/png&#x60;.
     *
     * @param contentType
     * @return This {@link MmsOutboundLinkSegment instance}.
     */
    public MmsOutboundLinkSegment contentType(String contentType) {
        this.contentType = contentType;
        return this;
    }

    /**
     * Returns contentType.
     * <p>
     * Field description:
     * Content type for media, for example &#x60;image/png&#x60;.
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
     * Content type for media, for example &#x60;image/png&#x60;.
     *
     * @param contentType
     */
    @JsonProperty("contentType")
    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    /**
     * Sets contentUrl.
     * <p>
     * Field description:
     * URL of externally hosted content.
     * <p>
     * The field is required.
     *
     * @param contentUrl
     * @return This {@link MmsOutboundLinkSegment instance}.
     */
    public MmsOutboundLinkSegment contentUrl(String contentUrl) {
        this.contentUrl = contentUrl;
        return this;
    }

    /**
     * Returns contentUrl.
     * <p>
     * Field description:
     * URL of externally hosted content.
     * <p>
     * The field is required.
     *
     * @return contentUrl
     */
    @JsonProperty("contentUrl")
    public String getContentUrl() {
        return contentUrl;
    }

    /**
     * Sets contentUrl.
     * <p>
     * Field description:
     * URL of externally hosted content.
     * <p>
     * The field is required.
     *
     * @param contentUrl
     */
    @JsonProperty("contentUrl")
    public void setContentUrl(String contentUrl) {
        this.contentUrl = contentUrl;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MmsOutboundLinkSegment mmsOutboundLinkSegment = (MmsOutboundLinkSegment) o;
        return Objects.equals(this.contentId, mmsOutboundLinkSegment.contentId)
                && Objects.equals(this.contentType, mmsOutboundLinkSegment.contentType)
                && Objects.equals(this.contentUrl, mmsOutboundLinkSegment.contentUrl)
                && super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(contentId, contentType, contentUrl, super.hashCode());
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class MmsOutboundLinkSegment {")
                .append(newLine)
                .append("    ")
                .append(toIndentedString(super.toString()))
                .append(newLine)
                .append("    contentId: ")
                .append(toIndentedString(contentId))
                .append(newLine)
                .append("    contentType: ")
                .append(toIndentedString(contentType))
                .append(newLine)
                .append("    contentUrl: ")
                .append(toIndentedString(contentUrl))
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
