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
 * Configuration used to enable Android push notifications.
 */
public class WebRtcAndroidPushNotificationConfig {

    private String fcmServerKey;

    /**
     * Sets fcmServerKey.
     * <p>
     * Field description:
     * FCM Server Key used to enable Android push notifications.
     * <p>
     * The field is required.
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
     * FCM Server Key used to enable Android push notifications.
     * <p>
     * The field is required.
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
     * FCM Server Key used to enable Android push notifications.
     * <p>
     * The field is required.
     *
     * @param fcmServerKey
     */
    @JsonProperty("fcmServerKey")
    public void setFcmServerKey(String fcmServerKey) {
        this.fcmServerKey = fcmServerKey;
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
        return Objects.equals(this.fcmServerKey, webRtcAndroidPushNotificationConfig.fcmServerKey);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fcmServerKey);
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
