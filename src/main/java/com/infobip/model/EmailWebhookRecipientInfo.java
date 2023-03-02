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
 * Recipient information such as device type, OS, device name.
 */
public class EmailWebhookRecipientInfo {

    private String deviceType;

    private String os;

    private String deviceName;

    /**
     * Sets deviceType.
     * <p>
     * Field description:
     * The type of device used by the recipient to do the user action.
     *
     * @param deviceType
     * @return This {@link EmailWebhookRecipientInfo instance}.
     */
    public EmailWebhookRecipientInfo deviceType(String deviceType) {
        this.deviceType = deviceType;
        return this;
    }

    /**
     * Returns deviceType.
     * <p>
     * Field description:
     * The type of device used by the recipient to do the user action.
     *
     * @return deviceType
     */
    @JsonProperty("deviceType")
    public String getDeviceType() {
        return deviceType;
    }

    /**
     * Sets deviceType.
     * <p>
     * Field description:
     * The type of device used by the recipient to do the user action.
     *
     * @param deviceType
     */
    @JsonProperty("deviceType")
    public void setDeviceType(String deviceType) {
        this.deviceType = deviceType;
    }

    /**
     * Sets os.
     * <p>
     * Field description:
     * The type OS present in the device used by the recipient.
     *
     * @param os
     * @return This {@link EmailWebhookRecipientInfo instance}.
     */
    public EmailWebhookRecipientInfo os(String os) {
        this.os = os;
        return this;
    }

    /**
     * Returns os.
     * <p>
     * Field description:
     * The type OS present in the device used by the recipient.
     *
     * @return os
     */
    @JsonProperty("os")
    public String getOs() {
        return os;
    }

    /**
     * Sets os.
     * <p>
     * Field description:
     * The type OS present in the device used by the recipient.
     *
     * @param os
     */
    @JsonProperty("os")
    public void setOs(String os) {
        this.os = os;
    }

    /**
     * Sets deviceName.
     * <p>
     * Field description:
     * Device name of the action originating device.
     *
     * @param deviceName
     * @return This {@link EmailWebhookRecipientInfo instance}.
     */
    public EmailWebhookRecipientInfo deviceName(String deviceName) {
        this.deviceName = deviceName;
        return this;
    }

    /**
     * Returns deviceName.
     * <p>
     * Field description:
     * Device name of the action originating device.
     *
     * @return deviceName
     */
    @JsonProperty("deviceName")
    public String getDeviceName() {
        return deviceName;
    }

    /**
     * Sets deviceName.
     * <p>
     * Field description:
     * Device name of the action originating device.
     *
     * @param deviceName
     */
    @JsonProperty("deviceName")
    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        EmailWebhookRecipientInfo emailWebhookRecipientInfo = (EmailWebhookRecipientInfo) o;
        return Objects.equals(this.deviceType, emailWebhookRecipientInfo.deviceType)
                && Objects.equals(this.os, emailWebhookRecipientInfo.os)
                && Objects.equals(this.deviceName, emailWebhookRecipientInfo.deviceName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(deviceType, os, deviceName);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class EmailWebhookRecipientInfo {")
                .append(newLine)
                .append("    deviceType: ")
                .append(toIndentedString(deviceType))
                .append(newLine)
                .append("    os: ")
                .append(toIndentedString(os))
                .append(newLine)
                .append("    deviceName: ")
                .append(toIndentedString(deviceName))
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
