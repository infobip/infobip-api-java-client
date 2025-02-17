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
 * Represents MmsOutboundSmilSegment model.
 */
public class MmsOutboundSmilSegment extends MmsOutboundSegment {

    private String contentId;

    private String contentType;

    private String smil;

    /**
     * Constructs a new {@link MmsOutboundSmilSegment} instance.
     */
    public MmsOutboundSmilSegment() {
        super("SMIL");
    }

    /**
     * Sets contentId.
     * <p>
     * Field description:
     * Unique identifier within single message. Using other characters (e.g. spaces) may cause your message to be rejected by some mobile carriers.
     *
     * @param contentId
     * @return This {@link MmsOutboundSmilSegment instance}.
     */
    public MmsOutboundSmilSegment contentId(String contentId) {
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
     * Content type for media, for example &#x60;application/smil&#x60;.
     * <p>
     * The field is required.
     *
     * @param contentType
     * @return This {@link MmsOutboundSmilSegment instance}.
     */
    public MmsOutboundSmilSegment contentType(String contentType) {
        this.contentType = contentType;
        return this;
    }

    /**
     * Returns contentType.
     * <p>
     * Field description:
     * Content type for media, for example &#x60;application/smil&#x60;.
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
     * Content type for media, for example &#x60;application/smil&#x60;.
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
     * Sets smil.
     * <p>
     * Field description:
     * Message segment as SMIL format. Be aware that some devices and/or operating systems ignore SMIL, so there is no guarantee that segments will be displayed as specified in SMIL format.
     * <p>
     * The field is required.
     *
     * @param smil
     * @return This {@link MmsOutboundSmilSegment instance}.
     */
    public MmsOutboundSmilSegment smil(String smil) {
        this.smil = smil;
        return this;
    }

    /**
     * Returns smil.
     * <p>
     * Field description:
     * Message segment as SMIL format. Be aware that some devices and/or operating systems ignore SMIL, so there is no guarantee that segments will be displayed as specified in SMIL format.
     * <p>
     * The field is required.
     *
     * @return smil
     */
    @JsonProperty("smil")
    public String getSmil() {
        return smil;
    }

    /**
     * Sets smil.
     * <p>
     * Field description:
     * Message segment as SMIL format. Be aware that some devices and/or operating systems ignore SMIL, so there is no guarantee that segments will be displayed as specified in SMIL format.
     * <p>
     * The field is required.
     *
     * @param smil
     */
    @JsonProperty("smil")
    public void setSmil(String smil) {
        this.smil = smil;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MmsOutboundSmilSegment mmsOutboundSmilSegment = (MmsOutboundSmilSegment) o;
        return Objects.equals(this.contentId, mmsOutboundSmilSegment.contentId)
                && Objects.equals(this.contentType, mmsOutboundSmilSegment.contentType)
                && Objects.equals(this.smil, mmsOutboundSmilSegment.smil)
                && super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(contentId, contentType, smil, super.hashCode());
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class MmsOutboundSmilSegment {")
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
                .append("    smil: ")
                .append(toIndentedString(smil))
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
