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
 * Represents CallsMediaStreamAudioProperties model.
 */
public class CallsMediaStreamAudioProperties {

    private String mediaStreamConfigId;

    private Boolean replaceMedia;

    /**
     * Sets mediaStreamConfigId.
     * <p>
     * Field description:
     * Media stream configuration ID.
     * <p>
     * The field is required.
     *
     * @param mediaStreamConfigId
     * @return This {@link CallsMediaStreamAudioProperties instance}.
     */
    public CallsMediaStreamAudioProperties mediaStreamConfigId(String mediaStreamConfigId) {
        this.mediaStreamConfigId = mediaStreamConfigId;
        return this;
    }

    /**
     * Returns mediaStreamConfigId.
     * <p>
     * Field description:
     * Media stream configuration ID.
     * <p>
     * The field is required.
     *
     * @return mediaStreamConfigId
     */
    @JsonProperty("mediaStreamConfigId")
    public String getMediaStreamConfigId() {
        return mediaStreamConfigId;
    }

    /**
     * Sets mediaStreamConfigId.
     * <p>
     * Field description:
     * Media stream configuration ID.
     * <p>
     * The field is required.
     *
     * @param mediaStreamConfigId
     */
    @JsonProperty("mediaStreamConfigId")
    public void setMediaStreamConfigId(String mediaStreamConfigId) {
        this.mediaStreamConfigId = mediaStreamConfigId;
    }

    /**
     * Sets replaceMedia.
     * <p>
     * Field description:
     * Indicates whether outbound media should be replaced. The replacement media is received from the url defined in the media stream configuration.
     *
     * @param replaceMedia
     * @return This {@link CallsMediaStreamAudioProperties instance}.
     */
    public CallsMediaStreamAudioProperties replaceMedia(Boolean replaceMedia) {
        this.replaceMedia = replaceMedia;
        return this;
    }

    /**
     * Returns replaceMedia.
     * <p>
     * Field description:
     * Indicates whether outbound media should be replaced. The replacement media is received from the url defined in the media stream configuration.
     *
     * @return replaceMedia
     */
    @JsonProperty("replaceMedia")
    public Boolean getReplaceMedia() {
        return replaceMedia;
    }

    /**
     * Sets replaceMedia.
     * <p>
     * Field description:
     * Indicates whether outbound media should be replaced. The replacement media is received from the url defined in the media stream configuration.
     *
     * @param replaceMedia
     */
    @JsonProperty("replaceMedia")
    public void setReplaceMedia(Boolean replaceMedia) {
        this.replaceMedia = replaceMedia;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CallsMediaStreamAudioProperties callsMediaStreamAudioProperties = (CallsMediaStreamAudioProperties) o;
        return Objects.equals(this.mediaStreamConfigId, callsMediaStreamAudioProperties.mediaStreamConfigId)
                && Objects.equals(this.replaceMedia, callsMediaStreamAudioProperties.replaceMedia);
    }

    @Override
    public int hashCode() {
        return Objects.hash(mediaStreamConfigId, replaceMedia);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class CallsMediaStreamAudioProperties {")
                .append(newLine)
                .append("    mediaStreamConfigId: ")
                .append(toIndentedString(mediaStreamConfigId))
                .append(newLine)
                .append("    replaceMedia: ")
                .append(toIndentedString(replaceMedia))
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
