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
 * Represents CallRoutingInfobipApplication model.
 */
public class CallRoutingInfobipApplication extends CallRoutingApplication {

    private CallRoutingInfobipApplicationId applicationId;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CallRoutingInfobipApplication callRoutingInfobipApplication = (CallRoutingInfobipApplication) o;
        return Objects.equals(this.applicationId, callRoutingInfobipApplication.applicationId) && super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(applicationId, super.hashCode());
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
