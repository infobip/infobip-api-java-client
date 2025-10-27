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
 * Video media properties.
 */
public class CallsVideoMediaProperties {

    private Boolean camera;

    private Boolean screenShare;

    private Boolean blind;

    /**
     * Sets camera.
     * <p>
     * Field description:
     * Indicates whether there is a video feed.
     *
     * @param camera
     * @return This {@link CallsVideoMediaProperties instance}.
     */
    public CallsVideoMediaProperties camera(Boolean camera) {
        this.camera = camera;
        return this;
    }

    /**
     * Returns camera.
     * <p>
     * Field description:
     * Indicates whether there is a video feed.
     *
     * @return camera
     */
    @JsonProperty("camera")
    public Boolean getCamera() {
        return camera;
    }

    /**
     * Sets camera.
     * <p>
     * Field description:
     * Indicates whether there is a video feed.
     *
     * @param camera
     */
    @JsonProperty("camera")
    public void setCamera(Boolean camera) {
        this.camera = camera;
    }

    /**
     * Sets screenShare.
     * <p>
     * Field description:
     * Indicates whether the end user is sharing their screen.
     *
     * @param screenShare
     * @return This {@link CallsVideoMediaProperties instance}.
     */
    public CallsVideoMediaProperties screenShare(Boolean screenShare) {
        this.screenShare = screenShare;
        return this;
    }

    /**
     * Returns screenShare.
     * <p>
     * Field description:
     * Indicates whether the end user is sharing their screen.
     *
     * @return screenShare
     */
    @JsonProperty("screenShare")
    public Boolean getScreenShare() {
        return screenShare;
    }

    /**
     * Sets screenShare.
     * <p>
     * Field description:
     * Indicates whether the end user is sharing their screen.
     *
     * @param screenShare
     */
    @JsonProperty("screenShare")
    public void setScreenShare(Boolean screenShare) {
        this.screenShare = screenShare;
    }

    /**
     * Sets blind.
     * <p>
     * Field description:
     * Indicates whether the end user can receive remote videos.
     *
     * @param blind
     * @return This {@link CallsVideoMediaProperties instance}.
     */
    public CallsVideoMediaProperties blind(Boolean blind) {
        this.blind = blind;
        return this;
    }

    /**
     * Returns blind.
     * <p>
     * Field description:
     * Indicates whether the end user can receive remote videos.
     *
     * @return blind
     */
    @JsonProperty("blind")
    public Boolean getBlind() {
        return blind;
    }

    /**
     * Sets blind.
     * <p>
     * Field description:
     * Indicates whether the end user can receive remote videos.
     *
     * @param blind
     */
    @JsonProperty("blind")
    public void setBlind(Boolean blind) {
        this.blind = blind;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CallsVideoMediaProperties callsVideoMediaProperties = (CallsVideoMediaProperties) o;
        return Objects.equals(this.camera, callsVideoMediaProperties.camera)
                && Objects.equals(this.screenShare, callsVideoMediaProperties.screenShare)
                && Objects.equals(this.blind, callsVideoMediaProperties.blind);
    }

    @Override
    public int hashCode() {
        return Objects.hash(camera, screenShare, blind);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class CallsVideoMediaProperties {")
                .append(newLine)
                .append("    camera: ")
                .append(toIndentedString(camera))
                .append(newLine)
                .append("    screenShare: ")
                .append(toIndentedString(screenShare))
                .append(newLine)
                .append("    blind: ")
                .append(toIndentedString(blind))
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
