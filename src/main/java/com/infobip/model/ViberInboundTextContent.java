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
 * Represents ViberInboundTextContent model.
 */
public class ViberInboundTextContent extends ViberInboundContent {

    private String text;

    private String trackingData;

    /**
     * Constructs a new {@link ViberInboundTextContent} instance.
     */
    public ViberInboundTextContent() {
        super("TEXT");
    }

    /**
     * Sets text.
     * <p>
     * Field description:
     * Text of received message.
     * <p>
     * The field is required.
     *
     * @param text
     * @return This {@link ViberInboundTextContent instance}.
     */
    public ViberInboundTextContent text(String text) {
        this.text = text;
        return this;
    }

    /**
     * Returns text.
     * <p>
     * Field description:
     * Text of received message.
     * <p>
     * The field is required.
     *
     * @return text
     */
    @JsonProperty("text")
    public String getText() {
        return text;
    }

    /**
     * Sets text.
     * <p>
     * Field description:
     * Text of received message.
     * <p>
     * The field is required.
     *
     * @param text
     */
    @JsonProperty("text")
    public void setText(String text) {
        this.text = text;
    }

    /**
     * Sets trackingData.
     * <p>
     * Field description:
     * Viber&#39;s tracking data from outgoing message that end user replies to. Might be random string of characters if not set explicitly in outgoing message.
     *
     * @param trackingData
     * @return This {@link ViberInboundTextContent instance}.
     */
    public ViberInboundTextContent trackingData(String trackingData) {
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
        ViberInboundTextContent viberInboundTextContent = (ViberInboundTextContent) o;
        return Objects.equals(this.text, viberInboundTextContent.text)
                && Objects.equals(this.trackingData, viberInboundTextContent.trackingData)
                && super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(text, trackingData, super.hashCode());
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class ViberInboundTextContent {")
                .append(newLine)
                .append("    ")
                .append(toIndentedString(super.toString()))
                .append(newLine)
                .append("    text: ")
                .append(toIndentedString(text))
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
