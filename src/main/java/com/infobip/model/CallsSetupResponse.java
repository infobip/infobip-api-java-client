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
import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * Represents CallsSetupResponse model.
 */
public class CallsSetupResponse {

    private String key;

    private String name;

    private String callbackUrl;

    private String statusUrl;

    private String backupCallbackUrl;

    private String backupStatusUrl;

    private String description;

    private OffsetDateTime insertDateTime;

    private OffsetDateTime updateDateTime;

    /**
     * Sets key.
     * <p>
     * Field description:
     * Use to connect masking configuration with Voice-enabled number.
     *
     * @param key
     * @return This {@link CallsSetupResponse instance}.
     */
    public CallsSetupResponse key(String key) {
        this.key = key;
        return this;
    }

    /**
     * Returns key.
     * <p>
     * Field description:
     * Use to connect masking configuration with Voice-enabled number.
     *
     * @return key
     */
    @JsonProperty("key")
    public String getKey() {
        return key;
    }

    /**
     * Sets key.
     * <p>
     * Field description:
     * Use to connect masking configuration with Voice-enabled number.
     *
     * @param key
     */
    @JsonProperty("key")
    public void setKey(String key) {
        this.key = key;
    }

    /**
     * Sets name.
     * <p>
     * Field description:
     * Unique configuration name. Alphanumeric, max length 100.
     *
     * @param name
     * @return This {@link CallsSetupResponse instance}.
     */
    public CallsSetupResponse name(String name) {
        this.name = name;
        return this;
    }

    /**
     * Returns name.
     * <p>
     * Field description:
     * Unique configuration name. Alphanumeric, max length 100.
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
     *
     * @param callbackUrl
     * @return This {@link CallsSetupResponse instance}.
     */
    public CallsSetupResponse callbackUrl(String callbackUrl) {
        this.callbackUrl = callbackUrl;
        return this;
    }

    /**
     * Returns callbackUrl.
     * <p>
     * Field description:
     * Client&#39;s URL that will be called on each inbound call to related Number masking Voice number in order to get instructions of how to handle incoming calls. Instructions are a result of mapping logic implemented on your side according to your business case.
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
     * @return This {@link CallsSetupResponse instance}.
     */
    public CallsSetupResponse statusUrl(String statusUrl) {
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
     * @return This {@link CallsSetupResponse instance}.
     */
    public CallsSetupResponse backupCallbackUrl(String backupCallbackUrl) {
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
     * @return This {@link CallsSetupResponse instance}.
     */
    public CallsSetupResponse backupStatusUrl(String backupStatusUrl) {
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
     * Masking configuration description
     *
     * @param description
     * @return This {@link CallsSetupResponse instance}.
     */
    public CallsSetupResponse description(String description) {
        this.description = description;
        return this;
    }

    /**
     * Returns description.
     * <p>
     * Field description:
     * Masking configuration description
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
     * Masking configuration description
     *
     * @param description
     */
    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Sets insertDateTime.
     * <p>
     * Field description:
     * Date and time when masking configuration is created.
     *
     * @param insertDateTime
     * @return This {@link CallsSetupResponse instance}.
     */
    public CallsSetupResponse insertDateTime(OffsetDateTime insertDateTime) {
        this.insertDateTime = insertDateTime;
        return this;
    }

    /**
     * Returns insertDateTime.
     * <p>
     * Field description:
     * Date and time when masking configuration is created.
     *
     * @return insertDateTime
     */
    @JsonProperty("insertDateTime")
    public OffsetDateTime getInsertDateTime() {
        return insertDateTime;
    }

    /**
     * Sets insertDateTime.
     * <p>
     * Field description:
     * Date and time when masking configuration is created.
     *
     * @param insertDateTime
     */
    @JsonProperty("insertDateTime")
    public void setInsertDateTime(OffsetDateTime insertDateTime) {
        this.insertDateTime = insertDateTime;
    }

    /**
     * Sets updateDateTime.
     * <p>
     * Field description:
     * Date and time when masking configuration was last modified.
     *
     * @param updateDateTime
     * @return This {@link CallsSetupResponse instance}.
     */
    public CallsSetupResponse updateDateTime(OffsetDateTime updateDateTime) {
        this.updateDateTime = updateDateTime;
        return this;
    }

    /**
     * Returns updateDateTime.
     * <p>
     * Field description:
     * Date and time when masking configuration was last modified.
     *
     * @return updateDateTime
     */
    @JsonProperty("updateDateTime")
    public OffsetDateTime getUpdateDateTime() {
        return updateDateTime;
    }

    /**
     * Sets updateDateTime.
     * <p>
     * Field description:
     * Date and time when masking configuration was last modified.
     *
     * @param updateDateTime
     */
    @JsonProperty("updateDateTime")
    public void setUpdateDateTime(OffsetDateTime updateDateTime) {
        this.updateDateTime = updateDateTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CallsSetupResponse callsSetupResponse = (CallsSetupResponse) o;
        return Objects.equals(this.key, callsSetupResponse.key)
                && Objects.equals(this.name, callsSetupResponse.name)
                && Objects.equals(this.callbackUrl, callsSetupResponse.callbackUrl)
                && Objects.equals(this.statusUrl, callsSetupResponse.statusUrl)
                && Objects.equals(this.backupCallbackUrl, callsSetupResponse.backupCallbackUrl)
                && Objects.equals(this.backupStatusUrl, callsSetupResponse.backupStatusUrl)
                && Objects.equals(this.description, callsSetupResponse.description)
                && Objects.equals(this.insertDateTime, callsSetupResponse.insertDateTime)
                && Objects.equals(this.updateDateTime, callsSetupResponse.updateDateTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                key,
                name,
                callbackUrl,
                statusUrl,
                backupCallbackUrl,
                backupStatusUrl,
                description,
                insertDateTime,
                updateDateTime);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class CallsSetupResponse {")
                .append(newLine)
                .append("    key: ")
                .append(toIndentedString(key))
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
                .append("    insertDateTime: ")
                .append(toIndentedString(insertDateTime))
                .append(newLine)
                .append("    updateDateTime: ")
                .append(toIndentedString(updateDateTime))
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
