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
 * Sets up [URL shortening](https://www.infobip.com/docs/url-shortening) and tracking feature.
 */
public class UrlOptions {

    private Boolean shortenUrl;

    private Boolean trackClicks;

    private String trackingUrl;

    private Boolean removeProtocol;

    private String customDomain;

    /**
     * Sets shortenUrl.
     * <p>
     * Field description:
     * Enable shortening of the URLs within a message. Set this to &#x60;true&#x60;, if you want to set up other URL options.
     *
     * @param shortenUrl
     * @return This {@link UrlOptions instance}.
     */
    public UrlOptions shortenUrl(Boolean shortenUrl) {
        this.shortenUrl = shortenUrl;
        return this;
    }

    /**
     * Returns shortenUrl.
     * <p>
     * Field description:
     * Enable shortening of the URLs within a message. Set this to &#x60;true&#x60;, if you want to set up other URL options.
     *
     * @return shortenUrl
     */
    @JsonProperty("shortenUrl")
    public Boolean getShortenUrl() {
        return shortenUrl;
    }

    /**
     * Sets shortenUrl.
     * <p>
     * Field description:
     * Enable shortening of the URLs within a message. Set this to &#x60;true&#x60;, if you want to set up other URL options.
     *
     * @param shortenUrl
     */
    @JsonProperty("shortenUrl")
    public void setShortenUrl(Boolean shortenUrl) {
        this.shortenUrl = shortenUrl;
    }

    /**
     * Sets trackClicks.
     * <p>
     * Field description:
     * Enable tracking of short URL clicks within a message: which URL was clicked, how many times, and by whom.
     *
     * @param trackClicks
     * @return This {@link UrlOptions instance}.
     */
    public UrlOptions trackClicks(Boolean trackClicks) {
        this.trackClicks = trackClicks;
        return this;
    }

    /**
     * Returns trackClicks.
     * <p>
     * Field description:
     * Enable tracking of short URL clicks within a message: which URL was clicked, how many times, and by whom.
     *
     * @return trackClicks
     */
    @JsonProperty("trackClicks")
    public Boolean getTrackClicks() {
        return trackClicks;
    }

    /**
     * Sets trackClicks.
     * <p>
     * Field description:
     * Enable tracking of short URL clicks within a message: which URL was clicked, how many times, and by whom.
     *
     * @param trackClicks
     */
    @JsonProperty("trackClicks")
    public void setTrackClicks(Boolean trackClicks) {
        this.trackClicks = trackClicks;
    }

    /**
     * Sets trackingUrl.
     * <p>
     * Field description:
     * The URL of your callback server on to which the Click report will be sent.
     *
     * @param trackingUrl
     * @return This {@link UrlOptions instance}.
     */
    public UrlOptions trackingUrl(String trackingUrl) {
        this.trackingUrl = trackingUrl;
        return this;
    }

    /**
     * Returns trackingUrl.
     * <p>
     * Field description:
     * The URL of your callback server on to which the Click report will be sent.
     *
     * @return trackingUrl
     */
    @JsonProperty("trackingUrl")
    public String getTrackingUrl() {
        return trackingUrl;
    }

    /**
     * Sets trackingUrl.
     * <p>
     * Field description:
     * The URL of your callback server on to which the Click report will be sent.
     *
     * @param trackingUrl
     */
    @JsonProperty("trackingUrl")
    public void setTrackingUrl(String trackingUrl) {
        this.trackingUrl = trackingUrl;
    }

    /**
     * Sets removeProtocol.
     * <p>
     * Field description:
     * Remove a protocol, such as &#x60;https://&#x60;, from links to shorten a message. Note that some mobiles may not recognize such links as a URL.
     *
     * @param removeProtocol
     * @return This {@link UrlOptions instance}.
     */
    public UrlOptions removeProtocol(Boolean removeProtocol) {
        this.removeProtocol = removeProtocol;
        return this;
    }

    /**
     * Returns removeProtocol.
     * <p>
     * Field description:
     * Remove a protocol, such as &#x60;https://&#x60;, from links to shorten a message. Note that some mobiles may not recognize such links as a URL.
     *
     * @return removeProtocol
     */
    @JsonProperty("removeProtocol")
    public Boolean getRemoveProtocol() {
        return removeProtocol;
    }

    /**
     * Sets removeProtocol.
     * <p>
     * Field description:
     * Remove a protocol, such as &#x60;https://&#x60;, from links to shorten a message. Note that some mobiles may not recognize such links as a URL.
     *
     * @param removeProtocol
     */
    @JsonProperty("removeProtocol")
    public void setRemoveProtocol(Boolean removeProtocol) {
        this.removeProtocol = removeProtocol;
    }

    /**
     * Sets customDomain.
     * <p>
     * Field description:
     * Select a predefined custom domain to use when generating a short URL.
     *
     * @param customDomain
     * @return This {@link UrlOptions instance}.
     */
    public UrlOptions customDomain(String customDomain) {
        this.customDomain = customDomain;
        return this;
    }

    /**
     * Returns customDomain.
     * <p>
     * Field description:
     * Select a predefined custom domain to use when generating a short URL.
     *
     * @return customDomain
     */
    @JsonProperty("customDomain")
    public String getCustomDomain() {
        return customDomain;
    }

    /**
     * Sets customDomain.
     * <p>
     * Field description:
     * Select a predefined custom domain to use when generating a short URL.
     *
     * @param customDomain
     */
    @JsonProperty("customDomain")
    public void setCustomDomain(String customDomain) {
        this.customDomain = customDomain;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UrlOptions urlOptions = (UrlOptions) o;
        return Objects.equals(this.shortenUrl, urlOptions.shortenUrl)
                && Objects.equals(this.trackClicks, urlOptions.trackClicks)
                && Objects.equals(this.trackingUrl, urlOptions.trackingUrl)
                && Objects.equals(this.removeProtocol, urlOptions.removeProtocol)
                && Objects.equals(this.customDomain, urlOptions.customDomain);
    }

    @Override
    public int hashCode() {
        return Objects.hash(shortenUrl, trackClicks, trackingUrl, removeProtocol, customDomain);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class UrlOptions {")
                .append(newLine)
                .append("    shortenUrl: ")
                .append(toIndentedString(shortenUrl))
                .append(newLine)
                .append("    trackClicks: ")
                .append(toIndentedString(trackClicks))
                .append(newLine)
                .append("    trackingUrl: ")
                .append(toIndentedString(trackingUrl))
                .append(newLine)
                .append("    removeProtocol: ")
                .append(toIndentedString(removeProtocol))
                .append(newLine)
                .append("    customDomain: ")
                .append(toIndentedString(customDomain))
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
