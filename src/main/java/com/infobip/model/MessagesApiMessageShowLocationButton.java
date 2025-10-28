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
 * Represents MessagesApiMessageShowLocationButton model.
 */
public class MessagesApiMessageShowLocationButton extends MessagesApiMessageButton {

    private String text;

    private Double latitude;

    private Double longitude;

    private String name;

    private String postbackData;

    /**
     * Constructs a new {@link MessagesApiMessageShowLocationButton} instance.
     */
    public MessagesApiMessageShowLocationButton() {
        super("SHOW_LOCATION");
    }

    /**
     * Sets text.
     * <p>
     * Field description:
     * Text to be displayed on the button.
     * <p>
     * The field is required.
     *
     * @param text
     * @return This {@link MessagesApiMessageShowLocationButton instance}.
     */
    public MessagesApiMessageShowLocationButton text(String text) {
        this.text = text;
        return this;
    }

    /**
     * Returns text.
     * <p>
     * Field description:
     * Text to be displayed on the button.
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
     * Text to be displayed on the button.
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
     * Sets latitude.
     * <p>
     * Field description:
     * Latitude of the location.
     * <p>
     * The field is required.
     *
     * @param latitude
     * @return This {@link MessagesApiMessageShowLocationButton instance}.
     */
    public MessagesApiMessageShowLocationButton latitude(Double latitude) {
        this.latitude = latitude;
        return this;
    }

    /**
     * Returns latitude.
     * <p>
     * Field description:
     * Latitude of the location.
     * <p>
     * The field is required.
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
     * <p>
     * The field is required.
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
     * <p>
     * The field is required.
     *
     * @param longitude
     * @return This {@link MessagesApiMessageShowLocationButton instance}.
     */
    public MessagesApiMessageShowLocationButton longitude(Double longitude) {
        this.longitude = longitude;
        return this;
    }

    /**
     * Returns longitude.
     * <p>
     * Field description:
     * Longitude of the location.
     * <p>
     * The field is required.
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
     * <p>
     * The field is required.
     *
     * @param longitude
     */
    @JsonProperty("longitude")
    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    /**
     * Sets name.
     * <p>
     * Field description:
     * Location name.
     *
     * @param name
     * @return This {@link MessagesApiMessageShowLocationButton instance}.
     */
    public MessagesApiMessageShowLocationButton name(String name) {
        this.name = name;
        return this;
    }

    /**
     * Returns name.
     * <p>
     * Field description:
     * Location name.
     *
     * @return name
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * Sets name.
     * <p>
     * Field description:
     * Location name.
     *
     * @param name
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Sets postbackData.
     * <p>
     * Field description:
     * Custom data that will be sent to you when the user replies to the message.
     *
     * @param postbackData
     * @return This {@link MessagesApiMessageShowLocationButton instance}.
     */
    public MessagesApiMessageShowLocationButton postbackData(String postbackData) {
        this.postbackData = postbackData;
        return this;
    }

    /**
     * Returns postbackData.
     * <p>
     * Field description:
     * Custom data that will be sent to you when the user replies to the message.
     *
     * @return postbackData
     */
    @JsonProperty("postbackData")
    public String getPostbackData() {
        return postbackData;
    }

    /**
     * Sets postbackData.
     * <p>
     * Field description:
     * Custom data that will be sent to you when the user replies to the message.
     *
     * @param postbackData
     */
    @JsonProperty("postbackData")
    public void setPostbackData(String postbackData) {
        this.postbackData = postbackData;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MessagesApiMessageShowLocationButton messagesApiMessageShowLocationButton =
                (MessagesApiMessageShowLocationButton) o;
        return Objects.equals(this.text, messagesApiMessageShowLocationButton.text)
                && Objects.equals(this.latitude, messagesApiMessageShowLocationButton.latitude)
                && Objects.equals(this.longitude, messagesApiMessageShowLocationButton.longitude)
                && Objects.equals(this.name, messagesApiMessageShowLocationButton.name)
                && Objects.equals(this.postbackData, messagesApiMessageShowLocationButton.postbackData)
                && super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(text, latitude, longitude, name, postbackData, super.hashCode());
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class MessagesApiMessageShowLocationButton {")
                .append(newLine)
                .append("    ")
                .append(toIndentedString(super.toString()))
                .append(newLine)
                .append("    text: ")
                .append(toIndentedString(text))
                .append(newLine)
                .append("    latitude: ")
                .append(toIndentedString(latitude))
                .append(newLine)
                .append("    longitude: ")
                .append(toIndentedString(longitude))
                .append(newLine)
                .append("    name: ")
                .append(toIndentedString(name))
                .append(newLine)
                .append("    postbackData: ")
                .append(toIndentedString(postbackData))
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
