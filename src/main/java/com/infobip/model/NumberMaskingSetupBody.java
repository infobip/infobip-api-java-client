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
 * Represents NumberMaskingSetupBody model.
 */
public class NumberMaskingSetupBody {

    private String name;

    private String callbackUrl;

    private String statusUrl;

    private String backupCallbackUrl;

    private String backupStatusUrl;

    private String description;

    /**
     * Sets name.
     * <p>
     * Field description:
     * Unique configuration name. Alphanumeric, max length 100.
     * <p>
     * The field is required.
     *
     * @param name
     * @return This {@link NumberMaskingSetupBody instance}.
     */
    public NumberMaskingSetupBody name(String name) {
        this.name = name;
        return this;
    }

    /**
     * Returns name.
     * <p>
     * Field description:
     * Unique configuration name. Alphanumeric, max length 100.
     * <p>
     * The field is required.
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
     * Unique configuration name. Alphanumeric, max length 100.
     * <p>
     * The field is required.
     *
     * @param name
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Sets callbackUrl.
     * <p>
     * Field description:
     * Client&#39;s URL that will be called on each inbound call to related Number masking Voice number in order to get instructions of how to handle incoming calls. Instructions are a result of mapping logic implemented on your side according to your business case.
     * <p>
     * The field is required.
     *
     * @param callbackUrl
     * @return This {@link NumberMaskingSetupBody instance}.
     */
    public NumberMaskingSetupBody callbackUrl(String callbackUrl) {
        this.callbackUrl = callbackUrl;
        return this;
    }

    /**
     * Returns callbackUrl.
     * <p>
     * Field description:
     * Client&#39;s URL that will be called on each inbound call to related Number masking Voice number in order to get instructions of how to handle incoming calls. Instructions are a result of mapping logic implemented on your side according to your business case.
     * <p>
     * The field is required.
     *
     * @return callbackUrl
     */
    @JsonProperty("callbackUrl")
    public String getCallbackUrl() {
        return callbackUrl;
    }

    /**
     * Sets callbackUrl.
     * <p>
     * Field description:
     * Client&#39;s URL that will be called on each inbound call to related Number masking Voice number in order to get instructions of how to handle incoming calls. Instructions are a result of mapping logic implemented on your side according to your business case.
     * <p>
     * The field is required.
     *
     * @param callbackUrl
     */
    @JsonProperty("callbackUrl")
    public void setCallbackUrl(String callbackUrl) {
        this.callbackUrl = callbackUrl;
    }

    /**
     * Sets statusUrl.
     * <p>
     * Field description:
     * Client&#39;s URL for status report delivery after the call is finished.
     *
     * @param statusUrl
     * @return This {@link NumberMaskingSetupBody instance}.
     */
    public NumberMaskingSetupBody statusUrl(String statusUrl) {
        this.statusUrl = statusUrl;
        return this;
    }

    /**
     * Returns statusUrl.
     * <p>
     * Field description:
     * Client&#39;s URL for status report delivery after the call is finished.
     *
     * @return statusUrl
     */
    @JsonProperty("statusUrl")
    public String getStatusUrl() {
        return statusUrl;
    }

    /**
     * Sets statusUrl.
     * <p>
     * Field description:
     * Client&#39;s URL for status report delivery after the call is finished.
     *
     * @param statusUrl
     */
    @JsonProperty("statusUrl")
    public void setStatusUrl(String statusUrl) {
        this.statusUrl = statusUrl;
    }

    /**
     * Sets backupCallbackUrl.
     * <p>
     * Field description:
     * If callbackUrl is unavailable this one will be called instead.
     *
     * @param backupCallbackUrl
     * @return This {@link NumberMaskingSetupBody instance}.
     */
    public NumberMaskingSetupBody backupCallbackUrl(String backupCallbackUrl) {
        this.backupCallbackUrl = backupCallbackUrl;
        return this;
    }

    /**
     * Returns backupCallbackUrl.
     * <p>
     * Field description:
     * If callbackUrl is unavailable this one will be called instead.
     *
     * @return backupCallbackUrl
     */
    @JsonProperty("backupCallbackUrl")
    public String getBackupCallbackUrl() {
        return backupCallbackUrl;
    }

    /**
     * Sets backupCallbackUrl.
     * <p>
     * Field description:
     * If callbackUrl is unavailable this one will be called instead.
     *
     * @param backupCallbackUrl
     */
    @JsonProperty("backupCallbackUrl")
    public void setBackupCallbackUrl(String backupCallbackUrl) {
        this.backupCallbackUrl = backupCallbackUrl;
    }

    /**
     * Sets backupStatusUrl.
     * <p>
     * Field description:
     * If statusUrl is unavailable this one will be called instead.
     *
     * @param backupStatusUrl
     * @return This {@link NumberMaskingSetupBody instance}.
     */
    public NumberMaskingSetupBody backupStatusUrl(String backupStatusUrl) {
        this.backupStatusUrl = backupStatusUrl;
        return this;
    }

    /**
     * Returns backupStatusUrl.
     * <p>
     * Field description:
     * If statusUrl is unavailable this one will be called instead.
     *
     * @return backupStatusUrl
     */
    @JsonProperty("backupStatusUrl")
    public String getBackupStatusUrl() {
        return backupStatusUrl;
    }

    /**
     * Sets backupStatusUrl.
     * <p>
     * Field description:
     * If statusUrl is unavailable this one will be called instead.
     *
     * @param backupStatusUrl
     */
    @JsonProperty("backupStatusUrl")
    public void setBackupStatusUrl(String backupStatusUrl) {
        this.backupStatusUrl = backupStatusUrl;
    }

    /**
     * Sets description.
     * <p>
     * Field description:
     * Masking configuration description.
     *
     * @param description
     * @return This {@link NumberMaskingSetupBody instance}.
     */
    public NumberMaskingSetupBody description(String description) {
        this.description = description;
        return this;
    }

    /**
     * Returns description.
     * <p>
     * Field description:
     * Masking configuration description.
     *
     * @return description
     */
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    /**
     * Sets description.
     * <p>
     * Field description:
     * Masking configuration description.
     *
     * @param description
     */
    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        NumberMaskingSetupBody numberMaskingSetupBody = (NumberMaskingSetupBody) o;
        return Objects.equals(this.name, numberMaskingSetupBody.name)
                && Objects.equals(this.callbackUrl, numberMaskingSetupBody.callbackUrl)
                && Objects.equals(this.statusUrl, numberMaskingSetupBody.statusUrl)
                && Objects.equals(this.backupCallbackUrl, numberMaskingSetupBody.backupCallbackUrl)
                && Objects.equals(this.backupStatusUrl, numberMaskingSetupBody.backupStatusUrl)
                && Objects.equals(this.description, numberMaskingSetupBody.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, callbackUrl, statusUrl, backupCallbackUrl, backupStatusUrl, description);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class NumberMaskingSetupBody {")
                .append(newLine)
                .append("    name: ")
                .append(toIndentedString(name))
                .append(newLine)
                .append("    callbackUrl: ")
                .append(toIndentedString(callbackUrl))
                .append(newLine)
                .append("    statusUrl: ")
                .append(toIndentedString(statusUrl))
                .append(newLine)
                .append("    backupCallbackUrl: ")
                .append(toIndentedString(backupCallbackUrl))
                .append(newLine)
                .append("    backupStatusUrl: ")
                .append(toIndentedString(backupStatusUrl))
                .append(newLine)
                .append("    description: ")
                .append(toIndentedString(description))
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
