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
 * Call link messaging settings.
 */
public class WebRtcMessages {

    private String welcomeText;

    private String inactiveText;

    private String expirationText;

    /**
     * Sets welcomeText.
     * <p>
     * Field description:
     * Message shown when a call link is opened.
     *
     * @param welcomeText
     * @return This {@link WebRtcMessages instance}.
     */
    public WebRtcMessages welcomeText(String welcomeText) {
        this.welcomeText = welcomeText;
        return this;
    }

    /**
     * Returns welcomeText.
     * <p>
     * Field description:
     * Message shown when a call link is opened.
     *
     * @return welcomeText
     */
    @JsonProperty("welcomeText")
    public String getWelcomeText() {
        return welcomeText;
    }

    /**
     * Sets welcomeText.
     * <p>
     * Field description:
     * Message shown when a call link is opened.
     *
     * @param welcomeText
     */
    @JsonProperty("welcomeText")
    public void setWelcomeText(String welcomeText) {
        this.welcomeText = welcomeText;
    }

    /**
     * Sets inactiveText.
     * <p>
     * Field description:
     * Message shown when a call link is not active.
     *
     * @param inactiveText
     * @return This {@link WebRtcMessages instance}.
     */
    public WebRtcMessages inactiveText(String inactiveText) {
        this.inactiveText = inactiveText;
        return this;
    }

    /**
     * Returns inactiveText.
     * <p>
     * Field description:
     * Message shown when a call link is not active.
     *
     * @return inactiveText
     */
    @JsonProperty("inactiveText")
    public String getInactiveText() {
        return inactiveText;
    }

    /**
     * Sets inactiveText.
     * <p>
     * Field description:
     * Message shown when a call link is not active.
     *
     * @param inactiveText
     */
    @JsonProperty("inactiveText")
    public void setInactiveText(String inactiveText) {
        this.inactiveText = inactiveText;
    }

    /**
     * Sets expirationText.
     * <p>
     * Field description:
     * Message shown when a call link is expired.
     *
     * @param expirationText
     * @return This {@link WebRtcMessages instance}.
     */
    public WebRtcMessages expirationText(String expirationText) {
        this.expirationText = expirationText;
        return this;
    }

    /**
     * Returns expirationText.
     * <p>
     * Field description:
     * Message shown when a call link is expired.
     *
     * @return expirationText
     */
    @JsonProperty("expirationText")
    public String getExpirationText() {
        return expirationText;
    }

    /**
     * Sets expirationText.
     * <p>
     * Field description:
     * Message shown when a call link is expired.
     *
     * @param expirationText
     */
    @JsonProperty("expirationText")
    public void setExpirationText(String expirationText) {
        this.expirationText = expirationText;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WebRtcMessages webRtcMessages = (WebRtcMessages) o;
        return Objects.equals(this.welcomeText, webRtcMessages.welcomeText)
                && Objects.equals(this.inactiveText, webRtcMessages.inactiveText)
                && Objects.equals(this.expirationText, webRtcMessages.expirationText);
    }

    @Override
    public int hashCode() {
        return Objects.hash(welcomeText, inactiveText, expirationText);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class WebRtcMessages {")
                .append(newLine)
                .append("    welcomeText: ")
                .append(toIndentedString(welcomeText))
                .append(newLine)
                .append("    inactiveText: ")
                .append(toIndentedString(inactiveText))
                .append(newLine)
                .append("    expirationText: ")
                .append(toIndentedString(expirationText))
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
