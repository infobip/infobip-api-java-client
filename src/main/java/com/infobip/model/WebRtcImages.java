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
 * Enumerate images shown on a call link page. Once an image is uploaded (by using the image upload API) a unique ID returned in that response can be used to add a background image or a logo image.
 */
public class WebRtcImages {

    private String logoImageId;

    private String backgroundImageId;

    /**
     * Sets logoImageId.
     * <p>
     * Field description:
     * ID of an image shown as a logo on a call link page.
     *
     * @param logoImageId
     * @return This {@link WebRtcImages instance}.
     */
    public WebRtcImages logoImageId(String logoImageId) {
        this.logoImageId = logoImageId;
        return this;
    }

    /**
     * Returns logoImageId.
     * <p>
     * Field description:
     * ID of an image shown as a logo on a call link page.
     *
     * @return logoImageId
     */
    @JsonProperty("logoImageId")
    public String getLogoImageId() {
        return logoImageId;
    }

    /**
     * Sets logoImageId.
     * <p>
     * Field description:
     * ID of an image shown as a logo on a call link page.
     *
     * @param logoImageId
     */
    @JsonProperty("logoImageId")
    public void setLogoImageId(String logoImageId) {
        this.logoImageId = logoImageId;
    }

    /**
     * Sets backgroundImageId.
     * <p>
     * Field description:
     * ID of an image shown as a background on a call link page.
     *
     * @param backgroundImageId
     * @return This {@link WebRtcImages instance}.
     */
    public WebRtcImages backgroundImageId(String backgroundImageId) {
        this.backgroundImageId = backgroundImageId;
        return this;
    }

    /**
     * Returns backgroundImageId.
     * <p>
     * Field description:
     * ID of an image shown as a background on a call link page.
     *
     * @return backgroundImageId
     */
    @JsonProperty("backgroundImageId")
    public String getBackgroundImageId() {
        return backgroundImageId;
    }

    /**
     * Sets backgroundImageId.
     * <p>
     * Field description:
     * ID of an image shown as a background on a call link page.
     *
     * @param backgroundImageId
     */
    @JsonProperty("backgroundImageId")
    public void setBackgroundImageId(String backgroundImageId) {
        this.backgroundImageId = backgroundImageId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WebRtcImages webRtcImages = (WebRtcImages) o;
        return Objects.equals(this.logoImageId, webRtcImages.logoImageId)
                && Objects.equals(this.backgroundImageId, webRtcImages.backgroundImageId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(logoImageId, backgroundImageId);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class WebRtcImages {")
                .append(newLine)
                .append("    logoImageId: ")
                .append(toIndentedString(logoImageId))
                .append(newLine)
                .append("    backgroundImageId: ")
                .append(toIndentedString(backgroundImageId))
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
