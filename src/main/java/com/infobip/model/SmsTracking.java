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
 * Sets up tracking parameters to track conversion metrics and type.
 */
public class SmsTracking {

    private String baseUrl;

    private String processKey;

    private String track;

    private String type;

    /**
     * Sets baseUrl.
     * <p>
     * Field description:
     * Custom base URL for shortened links in messages when tracking URL conversions. Legacy - use &#x60;urlOptions&#x60; instead.
     *
     * @param baseUrl
     * @return This {@link SmsTracking instance}.
     */
    public SmsTracking baseUrl(String baseUrl) {
        this.baseUrl = baseUrl;
        return this;
    }

    /**
     * Returns baseUrl.
     * <p>
     * Field description:
     * Custom base URL for shortened links in messages when tracking URL conversions. Legacy - use &#x60;urlOptions&#x60; instead.
     *
     * @return baseUrl
     */
    @JsonProperty("baseUrl")
    public String getBaseUrl() {
        return baseUrl;
    }

    /**
     * Sets baseUrl.
     * <p>
     * Field description:
     * Custom base URL for shortened links in messages when tracking URL conversions. Legacy - use &#x60;urlOptions&#x60; instead.
     *
     * @param baseUrl
     */
    @JsonProperty("baseUrl")
    public void setBaseUrl(String baseUrl) {
        this.baseUrl = baseUrl;
    }

    /**
     * Sets processKey.
     * <p>
     * Field description:
     * The process key which uniquely identifies conversion tracking.
     *
     * @param processKey
     * @return This {@link SmsTracking instance}.
     */
    public SmsTracking processKey(String processKey) {
        this.processKey = processKey;
        return this;
    }

    /**
     * Returns processKey.
     * <p>
     * Field description:
     * The process key which uniquely identifies conversion tracking.
     *
     * @return processKey
     */
    @JsonProperty("processKey")
    public String getProcessKey() {
        return processKey;
    }

    /**
     * Sets processKey.
     * <p>
     * Field description:
     * The process key which uniquely identifies conversion tracking.
     *
     * @param processKey
     */
    @JsonProperty("processKey")
    public void setProcessKey(String processKey) {
        this.processKey = processKey;
    }

    /**
     * Sets track.
     * <p>
     * Field description:
     * Indicates if a message has to be tracked for conversion rates. Values are: &#x60;SMS&#x60; and &#x60;URL&#x60;. &#x60;URL&#x60; is a legacy value. Use &#x60;urlOptions&#x60; instead. For more details on SMS Conversion, see: [Track Conversion](https://www.infobip.com/docs/sms/api#track-conversion).
     *
     * @param track
     * @return This {@link SmsTracking instance}.
     */
    public SmsTracking track(String track) {
        this.track = track;
        return this;
    }

    /**
     * Returns track.
     * <p>
     * Field description:
     * Indicates if a message has to be tracked for conversion rates. Values are: &#x60;SMS&#x60; and &#x60;URL&#x60;. &#x60;URL&#x60; is a legacy value. Use &#x60;urlOptions&#x60; instead. For more details on SMS Conversion, see: [Track Conversion](https://www.infobip.com/docs/sms/api#track-conversion).
     *
     * @return track
     */
    @JsonProperty("track")
    public String getTrack() {
        return track;
    }

    /**
     * Sets track.
     * <p>
     * Field description:
     * Indicates if a message has to be tracked for conversion rates. Values are: &#x60;SMS&#x60; and &#x60;URL&#x60;. &#x60;URL&#x60; is a legacy value. Use &#x60;urlOptions&#x60; instead. For more details on SMS Conversion, see: [Track Conversion](https://www.infobip.com/docs/sms/api#track-conversion).
     *
     * @param track
     */
    @JsonProperty("track")
    public void setTrack(String track) {
        this.track = track;
    }

    /**
     * Sets type.
     * <p>
     * Field description:
     * Sets a custom conversion type naming convention, e.g. &#x60;ONE_TIME_PIN&#x60; or &#x60;SOCIAL_INVITES&#x60;.
     *
     * @param type
     * @return This {@link SmsTracking instance}.
     */
    public SmsTracking type(String type) {
        this.type = type;
        return this;
    }

    /**
     * Returns type.
     * <p>
     * Field description:
     * Sets a custom conversion type naming convention, e.g. &#x60;ONE_TIME_PIN&#x60; or &#x60;SOCIAL_INVITES&#x60;.
     *
     * @return type
     */
    @JsonProperty("type")
    public String getType() {
        return type;
    }

    /**
     * Sets type.
     * <p>
     * Field description:
     * Sets a custom conversion type naming convention, e.g. &#x60;ONE_TIME_PIN&#x60; or &#x60;SOCIAL_INVITES&#x60;.
     *
     * @param type
     */
    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SmsTracking smsTracking = (SmsTracking) o;
        return Objects.equals(this.baseUrl, smsTracking.baseUrl)
                && Objects.equals(this.processKey, smsTracking.processKey)
                && Objects.equals(this.track, smsTracking.track)
                && Objects.equals(this.type, smsTracking.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(baseUrl, processKey, track, type);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class SmsTracking {")
                .append(newLine)
                .append("    baseUrl: ")
                .append(toIndentedString(baseUrl))
                .append(newLine)
                .append("    processKey: ")
                .append(toIndentedString(processKey))
                .append(newLine)
                .append("    track: ")
                .append(toIndentedString(track))
                .append(newLine)
                .append("    type: ")
                .append(toIndentedString(type))
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
