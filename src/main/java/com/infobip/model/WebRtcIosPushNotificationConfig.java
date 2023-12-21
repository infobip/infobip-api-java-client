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
 * Optional. Configuration used to enable iOS push notifications.
 */
public class WebRtcIosPushNotificationConfig {

    private String apnsCertificateFileName;

    private String apnsCertificateFileContent;

    private String apnsCertificatePassword;

    /**
     * Sets apnsCertificateFileName.
     * <p>
     * Field description:
     * Name of the APNS certificate file used to enable iOS push notifications.
     * <p>
     * The field is required.
     *
     * @param apnsCertificateFileName
     * @return This {@link WebRtcIosPushNotificationConfig instance}.
     */
    public WebRtcIosPushNotificationConfig apnsCertificateFileName(String apnsCertificateFileName) {
        this.apnsCertificateFileName = apnsCertificateFileName;
        return this;
    }

    /**
     * Returns apnsCertificateFileName.
     * <p>
     * Field description:
     * Name of the APNS certificate file used to enable iOS push notifications.
     * <p>
     * The field is required.
     *
     * @return apnsCertificateFileName
     */
    @JsonProperty("apnsCertificateFileName")
    public String getApnsCertificateFileName() {
        return apnsCertificateFileName;
    }

    /**
     * Sets apnsCertificateFileName.
     * <p>
     * Field description:
     * Name of the APNS certificate file used to enable iOS push notifications.
     * <p>
     * The field is required.
     *
     * @param apnsCertificateFileName
     */
    @JsonProperty("apnsCertificateFileName")
    public void setApnsCertificateFileName(String apnsCertificateFileName) {
        this.apnsCertificateFileName = apnsCertificateFileName;
    }

    /**
     * Sets apnsCertificateFileContent.
     * <p>
     * Field description:
     * Base64 encoded content of the P12 APNS certificate file used to enable iOS push notifications.
     * <p>
     * The field is required.
     *
     * @param apnsCertificateFileContent
     * @return This {@link WebRtcIosPushNotificationConfig instance}.
     */
    public WebRtcIosPushNotificationConfig apnsCertificateFileContent(String apnsCertificateFileContent) {
        this.apnsCertificateFileContent = apnsCertificateFileContent;
        return this;
    }

    /**
     * Returns apnsCertificateFileContent.
     * <p>
     * Field description:
     * Base64 encoded content of the P12 APNS certificate file used to enable iOS push notifications.
     * <p>
     * The field is required.
     *
     * @return apnsCertificateFileContent
     */
    @JsonProperty("apnsCertificateFileContent")
    public String getApnsCertificateFileContent() {
        return apnsCertificateFileContent;
    }

    /**
     * Sets apnsCertificateFileContent.
     * <p>
     * Field description:
     * Base64 encoded content of the P12 APNS certificate file used to enable iOS push notifications.
     * <p>
     * The field is required.
     *
     * @param apnsCertificateFileContent
     */
    @JsonProperty("apnsCertificateFileContent")
    public void setApnsCertificateFileContent(String apnsCertificateFileContent) {
        this.apnsCertificateFileContent = apnsCertificateFileContent;
    }

    /**
     * Sets apnsCertificatePassword.
     * <p>
     * Field description:
     * Password used for decryption of the APNS certificate.
     *
     * @param apnsCertificatePassword
     * @return This {@link WebRtcIosPushNotificationConfig instance}.
     */
    public WebRtcIosPushNotificationConfig apnsCertificatePassword(String apnsCertificatePassword) {
        this.apnsCertificatePassword = apnsCertificatePassword;
        return this;
    }

    /**
     * Returns apnsCertificatePassword.
     * <p>
     * Field description:
     * Password used for decryption of the APNS certificate.
     *
     * @return apnsCertificatePassword
     */
    @JsonProperty("apnsCertificatePassword")
    public String getApnsCertificatePassword() {
        return apnsCertificatePassword;
    }

    /**
     * Sets apnsCertificatePassword.
     * <p>
     * Field description:
     * Password used for decryption of the APNS certificate.
     *
     * @param apnsCertificatePassword
     */
    @JsonProperty("apnsCertificatePassword")
    public void setApnsCertificatePassword(String apnsCertificatePassword) {
        this.apnsCertificatePassword = apnsCertificatePassword;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WebRtcIosPushNotificationConfig webRtcIosPushNotificationConfig = (WebRtcIosPushNotificationConfig) o;
        return Objects.equals(this.apnsCertificateFileName, webRtcIosPushNotificationConfig.apnsCertificateFileName)
                && Objects.equals(
                        this.apnsCertificateFileContent, webRtcIosPushNotificationConfig.apnsCertificateFileContent)
                && Objects.equals(
                        this.apnsCertificatePassword, webRtcIosPushNotificationConfig.apnsCertificatePassword);
    }

    @Override
    public int hashCode() {
        return Objects.hash(apnsCertificateFileName, apnsCertificateFileContent, apnsCertificatePassword);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class WebRtcIosPushNotificationConfig {")
                .append(newLine)
                .append("    apnsCertificateFileName: ")
                .append(toIndentedString(apnsCertificateFileName))
                .append(newLine)
                .append("    apnsCertificateFileContent: ")
                .append(toIndentedString(apnsCertificateFileContent))
                .append(newLine)
                .append("    apnsCertificatePassword: ")
                .append(toIndentedString(apnsCertificatePassword))
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
