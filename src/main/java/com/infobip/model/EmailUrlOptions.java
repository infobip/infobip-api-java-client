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
public class EmailUrlOptions {

    private Boolean track;

    private Boolean trackOpens;

    private Boolean trackClicks;

    private String trackingUrl;

    private String trackingPixelPosition;

    /**
     * Sets track.
     * <p>
     * Field description:
     * Enable or disable open and click tracking. Passing true will only enable tracking and the statistics will be visible in the web interface alone. This can be explicitly overridden by &#x60;trackClicks&#x60; and &#x60;trackOpens&#x60;.
     *
     * @param track
     * @return This {@link EmailUrlOptions instance}.
     */
    public EmailUrlOptions track(Boolean track) {
        this.track = track;
        return this;
    }

    /**
     * Returns track.
     * <p>
     * Field description:
     * Enable or disable open and click tracking. Passing true will only enable tracking and the statistics will be visible in the web interface alone. This can be explicitly overridden by &#x60;trackClicks&#x60; and &#x60;trackOpens&#x60;.
     *
     * @return track
     */
    @JsonProperty("track")
    public Boolean getTrack() {
        return track;
    }

    /**
     * Sets track.
     * <p>
     * Field description:
     * Enable or disable open and click tracking. Passing true will only enable tracking and the statistics will be visible in the web interface alone. This can be explicitly overridden by &#x60;trackClicks&#x60; and &#x60;trackOpens&#x60;.
     *
     * @param track
     */
    @JsonProperty("track")
    public void setTrack(Boolean track) {
        this.track = track;
    }

    /**
     * Sets trackOpens.
     * <p>
     * Field description:
     * This parameter enables or disables track open feature.
     *
     * @param trackOpens
     * @return This {@link EmailUrlOptions instance}.
     */
    public EmailUrlOptions trackOpens(Boolean trackOpens) {
        this.trackOpens = trackOpens;
        return this;
    }

    /**
     * Returns trackOpens.
     * <p>
     * Field description:
     * This parameter enables or disables track open feature.
     *
     * @return trackOpens
     */
    @JsonProperty("trackOpens")
    public Boolean getTrackOpens() {
        return trackOpens;
    }

    /**
     * Sets trackOpens.
     * <p>
     * Field description:
     * This parameter enables or disables track open feature.
     *
     * @param trackOpens
     */
    @JsonProperty("trackOpens")
    public void setTrackOpens(Boolean trackOpens) {
        this.trackOpens = trackOpens;
    }

    /**
     * Sets trackClicks.
     * <p>
     * Field description:
     * This parameter enables or disables track click feature.
     *
     * @param trackClicks
     * @return This {@link EmailUrlOptions instance}.
     */
    public EmailUrlOptions trackClicks(Boolean trackClicks) {
        this.trackClicks = trackClicks;
        return this;
    }

    /**
     * Returns trackClicks.
     * <p>
     * Field description:
     * This parameter enables or disables track click feature.
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
     * This parameter enables or disables track click feature.
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
     * The URL on your callback server on which the open and click notifications will be sent. See [Tracking Notifications](https://www.infobip.com/docs/email/send-email-over-api#tracking-notifications) for details.
     *
     * @param trackingUrl
     * @return This {@link EmailUrlOptions instance}.
     */
    public EmailUrlOptions trackingUrl(String trackingUrl) {
        this.trackingUrl = trackingUrl;
        return this;
    }

    /**
     * Returns trackingUrl.
     * <p>
     * Field description:
     * The URL on your callback server on which the open and click notifications will be sent. See [Tracking Notifications](https://www.infobip.com/docs/email/send-email-over-api#tracking-notifications) for details.
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
     * The URL on your callback server on which the open and click notifications will be sent. See [Tracking Notifications](https://www.infobip.com/docs/email/send-email-over-api#tracking-notifications) for details.
     *
     * @param trackingUrl
     */
    @JsonProperty("trackingUrl")
    public void setTrackingUrl(String trackingUrl) {
        this.trackingUrl = trackingUrl;
    }

    /**
     * Sets trackingPixelPosition.
     * <p>
     * Field description:
     * This parameter specifies the position of the open tracking pixel within the email content. Allowed values are &#x60;TOP&#x60; and &#x60;BOTTOM&#x60;. If no value is provided, the default is &#x60;TOP&#x60;.
     *
     * @param trackingPixelPosition
     * @return This {@link EmailUrlOptions instance}.
     */
    public EmailUrlOptions trackingPixelPosition(String trackingPixelPosition) {
        this.trackingPixelPosition = trackingPixelPosition;
        return this;
    }

    /**
     * Returns trackingPixelPosition.
     * <p>
     * Field description:
     * This parameter specifies the position of the open tracking pixel within the email content. Allowed values are &#x60;TOP&#x60; and &#x60;BOTTOM&#x60;. If no value is provided, the default is &#x60;TOP&#x60;.
     *
     * @return trackingPixelPosition
     */
    @JsonProperty("trackingPixelPosition")
    public String getTrackingPixelPosition() {
        return trackingPixelPosition;
    }

    /**
     * Sets trackingPixelPosition.
     * <p>
     * Field description:
     * This parameter specifies the position of the open tracking pixel within the email content. Allowed values are &#x60;TOP&#x60; and &#x60;BOTTOM&#x60;. If no value is provided, the default is &#x60;TOP&#x60;.
     *
     * @param trackingPixelPosition
     */
    @JsonProperty("trackingPixelPosition")
    public void setTrackingPixelPosition(String trackingPixelPosition) {
        this.trackingPixelPosition = trackingPixelPosition;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        EmailUrlOptions emailUrlOptions = (EmailUrlOptions) o;
        return Objects.equals(this.track, emailUrlOptions.track)
                && Objects.equals(this.trackOpens, emailUrlOptions.trackOpens)
                && Objects.equals(this.trackClicks, emailUrlOptions.trackClicks)
                && Objects.equals(this.trackingUrl, emailUrlOptions.trackingUrl)
                && Objects.equals(this.trackingPixelPosition, emailUrlOptions.trackingPixelPosition);
    }

    @Override
    public int hashCode() {
        return Objects.hash(track, trackOpens, trackClicks, trackingUrl, trackingPixelPosition);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class EmailUrlOptions {")
                .append(newLine)
                .append("    track: ")
                .append(toIndentedString(track))
                .append(newLine)
                .append("    trackOpens: ")
                .append(toIndentedString(trackOpens))
                .append(newLine)
                .append("    trackClicks: ")
                .append(toIndentedString(trackClicks))
                .append(newLine)
                .append("    trackingUrl: ")
                .append(toIndentedString(trackingUrl))
                .append(newLine)
                .append("    trackingPixelPosition: ")
                .append(toIndentedString(trackingPixelPosition))
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
