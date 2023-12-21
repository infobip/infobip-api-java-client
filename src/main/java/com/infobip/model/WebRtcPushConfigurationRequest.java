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
 * Represents WebRtcPushConfigurationRequest model.
 */
public class WebRtcPushConfigurationRequest {

    private String applicationId;

    private String name;

    private WebRtcIosPushNotificationConfig ios;

    private WebRtcAndroidPushNotificationConfig android;

    /**
     * Sets applicationId.
     * <p>
     * Field description:
     * Application id to associate the push configuration with.
     * <p>
     * The field is required.
     *
     * @param applicationId
     * @return This {@link WebRtcPushConfigurationRequest instance}.
     */
    public WebRtcPushConfigurationRequest applicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }

    /**
     * Returns applicationId.
     * <p>
     * Field description:
     * Application id to associate the push configuration with.
     * <p>
     * The field is required.
     *
     * @return applicationId
     */
    @JsonProperty("applicationId")
    public String getApplicationId() {
        return applicationId;
    }

    /**
     * Sets applicationId.
     * <p>
     * Field description:
     * Application id to associate the push configuration with.
     * <p>
     * The field is required.
     *
     * @param applicationId
     */
    @JsonProperty("applicationId")
    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    /**
     * Sets name.
     * <p>
     * Field description:
     * Optional. Name describing the push configuration.
     *
     * @param name
     * @return This {@link WebRtcPushConfigurationRequest instance}.
     */
    public WebRtcPushConfigurationRequest name(String name) {
        this.name = name;
        return this;
    }

    /**
     * Returns name.
     * <p>
     * Field description:
     * Optional. Name describing the push configuration.
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
     * Optional. Name describing the push configuration.
     *
     * @param name
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Sets ios.
     *
     * @param ios
     * @return This {@link WebRtcPushConfigurationRequest instance}.
     */
    public WebRtcPushConfigurationRequest ios(WebRtcIosPushNotificationConfig ios) {
        this.ios = ios;
        return this;
    }

    /**
     * Returns ios.
     *
     * @return ios
     */
    @JsonProperty("ios")
    public WebRtcIosPushNotificationConfig getIos() {
        return ios;
    }

    /**
     * Sets ios.
     *
     * @param ios
     */
    @JsonProperty("ios")
    public void setIos(WebRtcIosPushNotificationConfig ios) {
        this.ios = ios;
    }

    /**
     * Sets android.
     *
     * @param android
     * @return This {@link WebRtcPushConfigurationRequest instance}.
     */
    public WebRtcPushConfigurationRequest android(WebRtcAndroidPushNotificationConfig android) {
        this.android = android;
        return this;
    }

    /**
     * Returns android.
     *
     * @return android
     */
    @JsonProperty("android")
    public WebRtcAndroidPushNotificationConfig getAndroid() {
        return android;
    }

    /**
     * Sets android.
     *
     * @param android
     */
    @JsonProperty("android")
    public void setAndroid(WebRtcAndroidPushNotificationConfig android) {
        this.android = android;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WebRtcPushConfigurationRequest webRtcPushConfigurationRequest = (WebRtcPushConfigurationRequest) o;
        return Objects.equals(this.applicationId, webRtcPushConfigurationRequest.applicationId)
                && Objects.equals(this.name, webRtcPushConfigurationRequest.name)
                && Objects.equals(this.ios, webRtcPushConfigurationRequest.ios)
                && Objects.equals(this.android, webRtcPushConfigurationRequest.android);
    }

    @Override
    public int hashCode() {
        return Objects.hash(applicationId, name, ios, android);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class WebRtcPushConfigurationRequest {")
                .append(newLine)
                .append("    applicationId: ")
                .append(toIndentedString(applicationId))
                .append(newLine)
                .append("    name: ")
                .append(toIndentedString(name))
                .append(newLine)
                .append("    ios: ")
                .append(toIndentedString(ios))
                .append(newLine)
                .append("    android: ")
                .append(toIndentedString(android))
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
