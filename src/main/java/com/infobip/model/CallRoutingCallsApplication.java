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
 * Represents CallRoutingCallsApplication model.
 */
public class CallRoutingCallsApplication extends CallRoutingApplication {

    private String applicationId;

    private Map<String, String> customData = null;

    private Integer timeout;

    /**
     * Constructs a new {@link CallRoutingCallsApplication} instance.
     */
    public CallRoutingCallsApplication() {
        super("CALLS_APPLICATION");
    }

    /**
     * Sets applicationId.
     * <p>
     * Field description:
     * ID of an application to which a call is to be transferred.
     * <p>
     * The field is required.
     *
     * @param applicationId
     * @return This {@link CallRoutingCallsApplication instance}.
     */
    public CallRoutingCallsApplication applicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }

    /**
     * Returns applicationId.
     * <p>
     * Field description:
     * ID of an application to which a call is to be transferred.
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
     * ID of an application to which a call is to be transferred.
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
     * Sets customData.
     * <p>
     * Field description:
     * Client defined data passed to the calls application.
     *
     * @param customData
     * @return This {@link CallRoutingCallsApplication instance}.
     */
    public CallRoutingCallsApplication customData(Map<String, String> customData) {
        this.customData = customData;
        return this;
    }

    /**
     * Puts and entry into customData.
     * <p>
     * Field description:
     * Client defined data passed to the calls application.
     *
     * @param key The given key.
     * @param customDataItem The item to be associated with the given key.
     * @return This {@link CallRoutingCallsApplication instance}.
     */
    public CallRoutingCallsApplication putCustomDataItem(String key, String customDataItem) {
        if (this.customData == null) {
            this.customData = new HashMap<>();
        }
        this.customData.put(key, customDataItem);
        return this;
    }

    /**
     * Returns customData.
     * <p>
     * Field description:
     * Client defined data passed to the calls application.
     *
     * @return customData
     */
    @JsonProperty("customData")
    public Map<String, String> getCustomData() {
        return customData;
    }

    /**
     * Sets customData.
     * <p>
     * Field description:
     * Client defined data passed to the calls application.
     *
     * @param customData
     */
    @JsonProperty("customData")
    public void setCustomData(Map<String, String> customData) {
        this.customData = customData;
    }

    /**
     * Sets timeout.
     * <p>
     * Field description:
     * Time to wait, in seconds, for a receiving application to accept the transfer.
     *
     * @param timeout
     * @return This {@link CallRoutingCallsApplication instance}.
     */
    public CallRoutingCallsApplication timeout(Integer timeout) {
        this.timeout = timeout;
        return this;
    }

    /**
     * Returns timeout.
     * <p>
     * Field description:
     * Time to wait, in seconds, for a receiving application to accept the transfer.
     *
     * @return timeout
     */
    @JsonProperty("timeout")
    public Integer getTimeout() {
        return timeout;
    }

    /**
     * Sets timeout.
     * <p>
     * Field description:
     * Time to wait, in seconds, for a receiving application to accept the transfer.
     *
     * @param timeout
     */
    @JsonProperty("timeout")
    public void setTimeout(Integer timeout) {
        this.timeout = timeout;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CallRoutingCallsApplication callRoutingCallsApplication = (CallRoutingCallsApplication) o;
        return Objects.equals(this.applicationId, callRoutingCallsApplication.applicationId)
                && Objects.equals(this.customData, callRoutingCallsApplication.customData)
                && Objects.equals(this.timeout, callRoutingCallsApplication.timeout)
                && super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(applicationId, customData, timeout, super.hashCode());
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class CallRoutingCallsApplication {")
                .append(newLine)
                .append("    ")
                .append(toIndentedString(super.toString()))
                .append(newLine)
                .append("    applicationId: ")
                .append(toIndentedString(applicationId))
                .append(newLine)
                .append("    customData: ")
                .append(toIndentedString(customData))
                .append(newLine)
                .append("    timeout: ")
                .append(toIndentedString(timeout))
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
