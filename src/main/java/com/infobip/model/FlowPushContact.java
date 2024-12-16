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
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * List of person&#39;s push registrations.
 */
public class FlowPushContact {

    private String applicationId;

    private String registrationId;

    private Map<String, Object> additionalData = null;

    private Map<String, Object> systemData = null;

    private Boolean isPrimary;

    /**
     * Sets applicationId.
     * <p>
     * Field description:
     * Application Id on which the user is subscribed.
     *
     * @param applicationId
     * @return This {@link FlowPushContact instance}.
     */
    public FlowPushContact applicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }

    /**
     * Returns applicationId.
     * <p>
     * Field description:
     * Application Id on which the user is subscribed.
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
     * Application Id on which the user is subscribed.
     *
     * @param applicationId
     */
    @JsonProperty("applicationId")
    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    /**
     * Sets registrationId.
     * <p>
     * Field description:
     * Push registration ID.
     *
     * @param registrationId
     * @return This {@link FlowPushContact instance}.
     */
    public FlowPushContact registrationId(String registrationId) {
        this.registrationId = registrationId;
        return this;
    }

    /**
     * Returns registrationId.
     * <p>
     * Field description:
     * Push registration ID.
     *
     * @return registrationId
     */
    @JsonProperty("registrationId")
    public String getRegistrationId() {
        return registrationId;
    }

    /**
     * Sets registrationId.
     * <p>
     * Field description:
     * Push registration ID.
     *
     * @param registrationId
     */
    @JsonProperty("registrationId")
    public void setRegistrationId(String registrationId) {
        this.registrationId = registrationId;
    }

    /**
     * Sets additionalData.
     * <p>
     * Field description:
     * Unique user ID for a person.
     *
     * @param additionalData
     * @return This {@link FlowPushContact instance}.
     */
    public FlowPushContact additionalData(Map<String, Object> additionalData) {
        this.additionalData = additionalData;
        return this;
    }

    /**
     * Puts and entry into additionalData.
     * <p>
     * Field description:
     * Unique user ID for a person.
     *
     * @param key The given key.
     * @param additionalDataItem The item to be associated with the given key.
     * @return This {@link FlowPushContact instance}.
     */
    public FlowPushContact putAdditionalDataItem(String key, Object additionalDataItem) {
        if (this.additionalData == null) {
            this.additionalData = new HashMap<>();
        }
        this.additionalData.put(key, additionalDataItem);
        return this;
    }

    /**
     * Returns additionalData.
     * <p>
     * Field description:
     * Unique user ID for a person.
     *
     * @return additionalData
     */
    @JsonProperty("additionalData")
    public Map<String, Object> getAdditionalData() {
        return additionalData;
    }

    /**
     * Sets additionalData.
     * <p>
     * Field description:
     * Unique user ID for a person.
     *
     * @param additionalData
     */
    @JsonProperty("additionalData")
    public void setAdditionalData(Map<String, Object> additionalData) {
        this.additionalData = additionalData;
    }

    /**
     * Sets systemData.
     * <p>
     * Field description:
     * System data collected from the user&#39;s profile.
     *
     * @param systemData
     * @return This {@link FlowPushContact instance}.
     */
    public FlowPushContact systemData(Map<String, Object> systemData) {
        this.systemData = systemData;
        return this;
    }

    /**
     * Puts and entry into systemData.
     * <p>
     * Field description:
     * System data collected from the user&#39;s profile.
     *
     * @param key The given key.
     * @param systemDataItem The item to be associated with the given key.
     * @return This {@link FlowPushContact instance}.
     */
    public FlowPushContact putSystemDataItem(String key, Object systemDataItem) {
        if (this.systemData == null) {
            this.systemData = new HashMap<>();
        }
        this.systemData.put(key, systemDataItem);
        return this;
    }

    /**
     * Returns systemData.
     * <p>
     * Field description:
     * System data collected from the user&#39;s profile.
     *
     * @return systemData
     */
    @JsonProperty("systemData")
    public Map<String, Object> getSystemData() {
        return systemData;
    }

    /**
     * Sets systemData.
     * <p>
     * Field description:
     * System data collected from the user&#39;s profile.
     *
     * @param systemData
     */
    @JsonProperty("systemData")
    public void setSystemData(Map<String, Object> systemData) {
        this.systemData = systemData;
    }

    /**
     * Sets isPrimary.
     * <p>
     * Field description:
     * Set to true if this device is a primary device of a user among other devices.
     *
     * @param isPrimary
     * @return This {@link FlowPushContact instance}.
     */
    public FlowPushContact isPrimary(Boolean isPrimary) {
        this.isPrimary = isPrimary;
        return this;
    }

    /**
     * Returns isPrimary.
     * <p>
     * Field description:
     * Set to true if this device is a primary device of a user among other devices.
     *
     * @return isPrimary
     */
    @JsonProperty("isPrimary")
    public Boolean getIsPrimary() {
        return isPrimary;
    }

    /**
     * Sets isPrimary.
     * <p>
     * Field description:
     * Set to true if this device is a primary device of a user among other devices.
     *
     * @param isPrimary
     */
    @JsonProperty("isPrimary")
    public void setIsPrimary(Boolean isPrimary) {
        this.isPrimary = isPrimary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        FlowPushContact flowPushContact = (FlowPushContact) o;
        return Objects.equals(this.applicationId, flowPushContact.applicationId)
                && Objects.equals(this.registrationId, flowPushContact.registrationId)
                && Objects.equals(this.additionalData, flowPushContact.additionalData)
                && Objects.equals(this.systemData, flowPushContact.systemData)
                && Objects.equals(this.isPrimary, flowPushContact.isPrimary);
    }

    @Override
    public int hashCode() {
        return Objects.hash(applicationId, registrationId, additionalData, systemData, isPrimary);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class FlowPushContact {")
                .append(newLine)
                .append("    applicationId: ")
                .append(toIndentedString(applicationId))
                .append(newLine)
                .append("    registrationId: ")
                .append(toIndentedString(registrationId))
                .append(newLine)
                .append("    additionalData: ")
                .append(toIndentedString(additionalData))
                .append(newLine)
                .append("    systemData: ")
                .append(toIndentedString(systemData))
                .append(newLine)
                .append("    isPrimary: ")
                .append(toIndentedString(isPrimary))
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
