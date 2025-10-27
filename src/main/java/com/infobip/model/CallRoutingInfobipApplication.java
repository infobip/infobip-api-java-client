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
 * Represents CallRoutingInfobipApplication model.
 */
public class CallRoutingInfobipApplication extends CallRoutingApplication {

    private CallRoutingInfobipApplicationId applicationId;

    private Map<String, String> customData = null;

    /**
     * Constructs a new {@link CallRoutingInfobipApplication} instance.
     */
    public CallRoutingInfobipApplication() {
        super("INFOBIP_APPLICATION");
    }

    /**
     * Sets applicationId.
     * <p>
     * The field is required.
     *
     * @param applicationId
     * @return This {@link CallRoutingInfobipApplication instance}.
     */
    public CallRoutingInfobipApplication applicationId(CallRoutingInfobipApplicationId applicationId) {
        this.applicationId = applicationId;
        return this;
    }

    /**
     * Returns applicationId.
     * <p>
     * The field is required.
     *
     * @return applicationId
     */
    @JsonProperty("applicationId")
    public CallRoutingInfobipApplicationId getApplicationId() {
        return applicationId;
    }

    /**
     * Sets applicationId.
     * <p>
     * The field is required.
     *
     * @param applicationId
     */
    @JsonProperty("applicationId")
    public void setApplicationId(CallRoutingInfobipApplicationId applicationId) {
        this.applicationId = applicationId;
    }

    /**
     * Sets customData.
     * <p>
     * Field description:
     * Client defined data passed to the Infobip application.
     *
     * @param customData
     * @return This {@link CallRoutingInfobipApplication instance}.
     */
    public CallRoutingInfobipApplication customData(Map<String, String> customData) {
        this.customData = customData;
        return this;
    }

    /**
     * Puts and entry into customData.
     * <p>
     * Field description:
     * Client defined data passed to the Infobip application.
     *
     * @param key The given key.
     * @param customDataItem The item to be associated with the given key.
     * @return This {@link CallRoutingInfobipApplication instance}.
     */
    public CallRoutingInfobipApplication putCustomDataItem(String key, String customDataItem) {
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
     * Client defined data passed to the Infobip application.
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
     * Client defined data passed to the Infobip application.
     *
     * @param customData
     */
    @JsonProperty("customData")
    public void setCustomData(Map<String, String> customData) {
        this.customData = customData;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CallRoutingInfobipApplication callRoutingInfobipApplication = (CallRoutingInfobipApplication) o;
        return Objects.equals(this.applicationId, callRoutingInfobipApplication.applicationId)
                && Objects.equals(this.customData, callRoutingInfobipApplication.customData)
                && super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(applicationId, customData, super.hashCode());
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class CallRoutingInfobipApplication {")
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
