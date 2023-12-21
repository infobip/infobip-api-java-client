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
 * Represents ViberInboundFileContent model.
 */
public class ViberInboundFileContent extends ViberInboundContent {

    private String url;

    private String fileName;

    private String trackingData;

    /**
     * Constructs a new {@link ViberInboundFileContent} instance.
     */
    public ViberInboundFileContent() {
        super("FILE");
    }

    /**
     * Sets url.
     * <p>
     * Field description:
     * URL of received file.
     *
     * @param url
     * @return This {@link ViberInboundFileContent instance}.
     */
    public ViberInboundFileContent url(String url) {
        this.url = url;
        return this;
    }

    /**
     * Returns url.
     * <p>
     * Field description:
     * URL of received file.
     *
     * @return url
     */
    @JsonProperty("url")
    public String getUrl() {
        return url;
    }

    /**
     * Sets url.
     * <p>
     * Field description:
     * URL of received file.
     *
     * @param url
     */
    @JsonProperty("url")
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * Sets fileName.
     * <p>
     * Field description:
     * Name of received file.
     *
     * @param fileName
     * @return This {@link ViberInboundFileContent instance}.
     */
    public ViberInboundFileContent fileName(String fileName) {
        this.fileName = fileName;
        return this;
    }

    /**
     * Returns fileName.
     * <p>
     * Field description:
     * Name of received file.
     *
     * @return fileName
     */
    @JsonProperty("fileName")
    public String getFileName() {
        return fileName;
    }

    /**
     * Sets fileName.
     * <p>
     * Field description:
     * Name of received file.
     *
     * @param fileName
     */
    @JsonProperty("fileName")
    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    /**
     * Sets trackingData.
     * <p>
     * Field description:
     * Viber&#39;s tracking data from outgoing message that end user replies to. Might be random string of characters if not set explicitly in outgoing message.
     *
     * @param trackingData
     * @return This {@link ViberInboundFileContent instance}.
     */
    public ViberInboundFileContent trackingData(String trackingData) {
        this.trackingData = trackingData;
        return this;
    }

    /**
     * Returns trackingData.
     * <p>
     * Field description:
     * Viber&#39;s tracking data from outgoing message that end user replies to. Might be random string of characters if not set explicitly in outgoing message.
     *
     * @return trackingData
     */
    @JsonProperty("trackingData")
    public String getTrackingData() {
        return trackingData;
    }

    /**
     * Sets trackingData.
     * <p>
     * Field description:
     * Viber&#39;s tracking data from outgoing message that end user replies to. Might be random string of characters if not set explicitly in outgoing message.
     *
     * @param trackingData
     */
    @JsonProperty("trackingData")
    public void setTrackingData(String trackingData) {
        this.trackingData = trackingData;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ViberInboundFileContent viberInboundFileContent = (ViberInboundFileContent) o;
        return Objects.equals(this.url, viberInboundFileContent.url)
                && Objects.equals(this.fileName, viberInboundFileContent.fileName)
                && Objects.equals(this.trackingData, viberInboundFileContent.trackingData)
                && super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(url, fileName, trackingData, super.hashCode());
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class ViberInboundFileContent {")
                .append(newLine)
                .append("    ")
                .append(toIndentedString(super.toString()))
                .append(newLine)
                .append("    url: ")
                .append(toIndentedString(url))
                .append(newLine)
                .append("    fileName: ")
                .append(toIndentedString(fileName))
                .append(newLine)
                .append("    trackingData: ")
                .append(toIndentedString(trackingData))
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
