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
 * Represents MessagesApiWebhookEventLocationContent model.
 */
public class MessagesApiWebhookEventLocationContent extends MessagesApiWebhookEventContent {

    private Double latitude;

    private Double longitude;

    private String url;

    /**
     * Constructs a new {@link MessagesApiWebhookEventLocationContent} instance.
     */
    public MessagesApiWebhookEventLocationContent() {
        super("LOCATION");
    }

    /**
     * Sets latitude.
     * <p>
     * Field description:
     * Latitude of the location.
     *
     * @param latitude
     * @return This {@link MessagesApiWebhookEventLocationContent instance}.
     */
    public MessagesApiWebhookEventLocationContent latitude(Double latitude) {
        this.latitude = latitude;
        return this;
    }

    /**
     * Returns latitude.
     * <p>
     * Field description:
     * Latitude of the location.
     *
     * @return latitude
     */
    @JsonProperty("latitude")
    public Double getLatitude() {
        return latitude;
    }

    /**
     * Sets latitude.
     * <p>
     * Field description:
     * Latitude of the location.
     *
     * @param latitude
     */
    @JsonProperty("latitude")
    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    /**
     * Sets longitude.
     * <p>
     * Field description:
     * Longitude of the location.
     *
     * @param longitude
     * @return This {@link MessagesApiWebhookEventLocationContent instance}.
     */
    public MessagesApiWebhookEventLocationContent longitude(Double longitude) {
        this.longitude = longitude;
        return this;
    }

    /**
     * Returns longitude.
     * <p>
     * Field description:
     * Longitude of the location.
     *
     * @return longitude
     */
    @JsonProperty("longitude")
    public Double getLongitude() {
        return longitude;
    }

    /**
     * Sets longitude.
     * <p>
     * Field description:
     * Longitude of the location.
     *
     * @param longitude
     */
    @JsonProperty("longitude")
    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    /**
     * Sets url.
     * <p>
     * Field description:
     * URL of the location.
     *
     * @param url
     * @return This {@link MessagesApiWebhookEventLocationContent instance}.
     */
    public MessagesApiWebhookEventLocationContent url(String url) {
        this.url = url;
        return this;
    }

    /**
     * Returns url.
     * <p>
     * Field description:
     * URL of the location.
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
     * URL of the location.
     *
     * @param url
     */
    @JsonProperty("url")
    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MessagesApiWebhookEventLocationContent messagesApiWebhookEventLocationContent =
                (MessagesApiWebhookEventLocationContent) o;
        return Objects.equals(this.latitude, messagesApiWebhookEventLocationContent.latitude)
                && Objects.equals(this.longitude, messagesApiWebhookEventLocationContent.longitude)
                && Objects.equals(this.url, messagesApiWebhookEventLocationContent.url)
                && super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(latitude, longitude, url, super.hashCode());
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class MessagesApiWebhookEventLocationContent {")
                .append(newLine)
                .append("    ")
                .append(toIndentedString(super.toString()))
                .append(newLine)
                .append("    latitude: ")
                .append(toIndentedString(latitude))
                .append(newLine)
                .append("    longitude: ")
                .append(toIndentedString(longitude))
                .append(newLine)
                .append("    url: ")
                .append(toIndentedString(url))
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
