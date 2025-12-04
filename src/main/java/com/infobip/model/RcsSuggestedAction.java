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
 * Represents RcsSuggestedAction model.
 */
public class RcsSuggestedAction {

    private String type;

    private String text;

    private String postbackData;

    private String url;

    private String phoneNumber;

    private Double latitude;

    private Double longitude;

    private String label;

    /**
     * Sets type.
     * <p>
     * Field description:
     * Type of the suggested action (reply, openUrl, dialNumber, viewLocation, shareLocation).
     * <p>
     * The field is required.
     *
     * @param type
     * @return This {@link RcsSuggestedAction instance}.
     */
    public RcsSuggestedAction type(String type) {
        this.type = type;
        return this;
    }

    /**
     * Returns type.
     * <p>
     * Field description:
     * Type of the suggested action (reply, openUrl, dialNumber, viewLocation, shareLocation).
     * <p>
     * The field is required.
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
     * Type of the suggested action (reply, openUrl, dialNumber, viewLocation, shareLocation).
     * <p>
     * The field is required.
     *
     * @param type
     */
    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    /**
     * Sets text.
     * <p>
     * Field description:
     * Display text for the action.
     *
     * @param text
     * @return This {@link RcsSuggestedAction instance}.
     */
    public RcsSuggestedAction text(String text) {
        this.text = text;
        return this;
    }

    /**
     * Returns text.
     * <p>
     * Field description:
     * Display text for the action.
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
     * Display text for the action.
     *
     * @param text
     */
    @JsonProperty("text")
    public void setText(String text) {
        this.text = text;
    }

    /**
     * Sets postbackData.
     * <p>
     * Field description:
     * Data to be sent back when action is triggered (for reply type).
     *
     * @param postbackData
     * @return This {@link RcsSuggestedAction instance}.
     */
    public RcsSuggestedAction postbackData(String postbackData) {
        this.postbackData = postbackData;
        return this;
    }

    /**
     * Returns postbackData.
     * <p>
     * Field description:
     * Data to be sent back when action is triggered (for reply type).
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
     * Data to be sent back when action is triggered (for reply type).
     *
     * @param postbackData
     */
    @JsonProperty("postbackData")
    public void setPostbackData(String postbackData) {
        this.postbackData = postbackData;
    }

    /**
     * Sets url.
     * <p>
     * Field description:
     * URL to open (for openUrl type).
     *
     * @param url
     * @return This {@link RcsSuggestedAction instance}.
     */
    public RcsSuggestedAction url(String url) {
        this.url = url;
        return this;
    }

    /**
     * Returns url.
     * <p>
     * Field description:
     * URL to open (for openUrl type).
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
     * URL to open (for openUrl type).
     *
     * @param url
     */
    @JsonProperty("url")
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * Sets phoneNumber.
     * <p>
     * Field description:
     * Phone number to dial (for dialNumber type).
     *
     * @param phoneNumber
     * @return This {@link RcsSuggestedAction instance}.
     */
    public RcsSuggestedAction phoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    /**
     * Returns phoneNumber.
     * <p>
     * Field description:
     * Phone number to dial (for dialNumber type).
     *
     * @return phoneNumber
     */
    @JsonProperty("phoneNumber")
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Sets phoneNumber.
     * <p>
     * Field description:
     * Phone number to dial (for dialNumber type).
     *
     * @param phoneNumber
     */
    @JsonProperty("phoneNumber")
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /**
     * Sets latitude.
     * <p>
     * Field description:
     * Latitude of the location (for viewLocation type).
     *
     * @param latitude
     * @return This {@link RcsSuggestedAction instance}.
     */
    public RcsSuggestedAction latitude(Double latitude) {
        this.latitude = latitude;
        return this;
    }

    /**
     * Returns latitude.
     * <p>
     * Field description:
     * Latitude of the location (for viewLocation type).
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
     * Latitude of the location (for viewLocation type).
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
     * Longitude of the location (for viewLocation type).
     *
     * @param longitude
     * @return This {@link RcsSuggestedAction instance}.
     */
    public RcsSuggestedAction longitude(Double longitude) {
        this.longitude = longitude;
        return this;
    }

    /**
     * Returns longitude.
     * <p>
     * Field description:
     * Longitude of the location (for viewLocation type).
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
     * Longitude of the location (for viewLocation type).
     *
     * @param longitude
     */
    @JsonProperty("longitude")
    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    /**
     * Sets label.
     * <p>
     * Field description:
     * Label for the location (for viewLocation type).
     *
     * @param label
     * @return This {@link RcsSuggestedAction instance}.
     */
    public RcsSuggestedAction label(String label) {
        this.label = label;
        return this;
    }

    /**
     * Returns label.
     * <p>
     * Field description:
     * Label for the location (for viewLocation type).
     *
     * @return label
     */
    @JsonProperty("label")
    public String getLabel() {
        return label;
    }

    /**
     * Sets label.
     * <p>
     * Field description:
     * Label for the location (for viewLocation type).
     *
     * @param label
     */
    @JsonProperty("label")
    public void setLabel(String label) {
        this.label = label;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RcsSuggestedAction rcsSuggestedAction = (RcsSuggestedAction) o;
        return Objects.equals(this.type, rcsSuggestedAction.type)
                && Objects.equals(this.text, rcsSuggestedAction.text)
                && Objects.equals(this.postbackData, rcsSuggestedAction.postbackData)
                && Objects.equals(this.url, rcsSuggestedAction.url)
                && Objects.equals(this.phoneNumber, rcsSuggestedAction.phoneNumber)
                && Objects.equals(this.latitude, rcsSuggestedAction.latitude)
                && Objects.equals(this.longitude, rcsSuggestedAction.longitude)
                && Objects.equals(this.label, rcsSuggestedAction.label);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, text, postbackData, url, phoneNumber, latitude, longitude, label);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class RcsSuggestedAction {")
                .append(newLine)
                .append("    type: ")
                .append(toIndentedString(type))
                .append(newLine)
                .append("    text: ")
                .append(toIndentedString(text))
                .append(newLine)
                .append("    postbackData: ")
                .append(toIndentedString(postbackData))
                .append(newLine)
                .append("    url: ")
                .append(toIndentedString(url))
                .append(newLine)
                .append("    phoneNumber: ")
                .append(toIndentedString(phoneNumber))
                .append(newLine)
                .append("    latitude: ")
                .append(toIndentedString(latitude))
                .append(newLine)
                .append("    longitude: ")
                .append(toIndentedString(longitude))
                .append(newLine)
                .append("    label: ")
                .append(toIndentedString(label))
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
