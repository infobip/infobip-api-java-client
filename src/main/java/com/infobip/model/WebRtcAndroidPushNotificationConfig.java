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
 * Optional. Required if ios is not set. Configuration used to enable Android push notifications.
 */
public class WebRtcAndroidPushNotificationConfig {

    private String fcmServerKey;

    private String privateKeyJson;

    /**
     * Sets fcmServerKey.
     * <p>
     * Field description:
     * Optional. Required if privateKeyJson is not set. FCM server key used to enable Android push notifications.
     *
     * @param fcmServerKey
     * @return This {@link WebRtcAndroidPushNotificationConfig instance}.
     */
    public WebRtcAndroidPushNotificationConfig fcmServerKey(String fcmServerKey) {
        this.fcmServerKey = fcmServerKey;
        return this;
    }

    /**
     * Returns fcmServerKey.
     * <p>
     * Field description:
     * Optional. Required if privateKeyJson is not set. FCM server key used to enable Android push notifications.
     *
     * @return fcmServerKey
     */
    @JsonProperty("fcmServerKey")
    public String getFcmServerKey() {
        return fcmServerKey;
    }

    /**
     * Sets fcmServerKey.
     * <p>
     * Field description:
     * Optional. Required if privateKeyJson is not set. FCM server key used to enable Android push notifications.
     *
     * @param fcmServerKey
     */
    @JsonProperty("fcmServerKey")
    public void setFcmServerKey(String fcmServerKey) {
        this.fcmServerKey = fcmServerKey;
    }

    /**
     * Sets privateKeyJson.
     * <p>
     * Field description:
     * Optional. Required if fcmServerKey is not set. Private key JSON file used to enable Android push notifications.
     *
     * @param privateKeyJson
     * @return This {@link WebRtcAndroidPushNotificationConfig instance}.
     */
    public WebRtcAndroidPushNotificationConfig privateKeyJson(String privateKeyJson) {
        this.privateKeyJson = privateKeyJson;
        return this;
    }

    /**
     * Returns privateKeyJson.
     * <p>
     * Field description:
     * Optional. Required if fcmServerKey is not set. Private key JSON file used to enable Android push notifications.
     *
     * @return privateKeyJson
     */
    @JsonProperty("privateKeyJson")
    public String getPrivateKeyJson() {
        return privateKeyJson;
    }

    /**
     * Sets privateKeyJson.
     * <p>
     * Field description:
     * Optional. Required if fcmServerKey is not set. Private key JSON file used to enable Android push notifications.
     *
     * @param privateKeyJson
     */
    @JsonProperty("privateKeyJson")
    public void setPrivateKeyJson(String privateKeyJson) {
        this.privateKeyJson = privateKeyJson;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WebRtcAndroidPushNotificationConfig webRtcAndroidPushNotificationConfig =
                (WebRtcAndroidPushNotificationConfig) o;
        return Objects.equals(this.fcmServerKey, webRtcAndroidPushNotificationConfig.fcmServerKey)
                && Objects.equals(this.privateKeyJson, webRtcAndroidPushNotificationConfig.privateKeyJson);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fcmServerKey, privateKeyJson);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class WebRtcAndroidPushNotificationConfig {")
                .append(newLine)
                .append("    fcmServerKey: ")
                .append(toIndentedString(fcmServerKey))
                .append(newLine)
                .append("    privateKeyJson: ")
                .append(toIndentedString(privateKeyJson))
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
