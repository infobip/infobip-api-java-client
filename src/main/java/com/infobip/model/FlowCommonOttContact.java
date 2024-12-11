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
 * A list of person&#39;s Kakao Sangdam destinations.
 */
public class FlowCommonOttContact {

    private String applicationId;

    private String userId;

    private Map<String, Object> systemData = null;

    /**
     * Sets applicationId.
     * <p>
     * Field description:
     * Application Id on which the user is subscribed.
     *
     * @param applicationId
     * @return This {@link FlowCommonOttContact instance}.
     */
    public FlowCommonOttContact applicationId(String applicationId) {
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
     * Sets userId.
     * <p>
     * Field description:
     * Unique user ID for a person.
     *
     * @param userId
     * @return This {@link FlowCommonOttContact instance}.
     */
    public FlowCommonOttContact userId(String userId) {
        this.userId = userId;
        return this;
    }

    /**
     * Returns userId.
     * <p>
     * Field description:
     * Unique user ID for a person.
     *
     * @return userId
     */
    @JsonProperty("userId")
    public String getUserId() {
        return userId;
    }

    /**
     * Sets userId.
     * <p>
     * Field description:
     * Unique user ID for a person.
     *
     * @param userId
     */
    @JsonProperty("userId")
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * Sets systemData.
     * <p>
     * Field description:
     * System data collected from the user&#39;s profile.
     *
     * @param systemData
     * @return This {@link FlowCommonOttContact instance}.
     */
    public FlowCommonOttContact systemData(Map<String, Object> systemData) {
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
     * @return This {@link FlowCommonOttContact instance}.
     */
    public FlowCommonOttContact putSystemDataItem(String key, Object systemDataItem) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        FlowCommonOttContact flowCommonOttContact = (FlowCommonOttContact) o;
        return Objects.equals(this.applicationId, flowCommonOttContact.applicationId)
                && Objects.equals(this.userId, flowCommonOttContact.userId)
                && Objects.equals(this.systemData, flowCommonOttContact.systemData);
    }

    @Override
    public int hashCode() {
        return Objects.hash(applicationId, userId, systemData);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class FlowCommonOttContact {")
                .append(newLine)
                .append("    applicationId: ")
                .append(toIndentedString(applicationId))
                .append(newLine)
                .append("    userId: ")
                .append(toIndentedString(userId))
                .append(newLine)
                .append("    systemData: ")
                .append(toIndentedString(systemData))
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
