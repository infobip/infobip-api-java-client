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
 * Represents CallsEmergencyAddressStatus model.
 */
public class CallsEmergencyAddressStatus {

    private NumbersStatusResponse emergencyService;

    /**
     * Sets emergencyService.
     *
     * @param emergencyService
     * @return This {@link CallsEmergencyAddressStatus instance}.
     */
    public CallsEmergencyAddressStatus emergencyService(NumbersStatusResponse emergencyService) {
        this.emergencyService = emergencyService;
        return this;
    }

    /**
     * Returns emergencyService.
     *
     * @return emergencyService
     */
    @JsonProperty("emergencyService")
    public NumbersStatusResponse getEmergencyService() {
        return emergencyService;
    }

    /**
     * Sets emergencyService.
     *
     * @param emergencyService
     */
    @JsonProperty("emergencyService")
    public void setEmergencyService(NumbersStatusResponse emergencyService) {
        this.emergencyService = emergencyService;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CallsEmergencyAddressStatus callsEmergencyAddressStatus = (CallsEmergencyAddressStatus) o;
        return Objects.equals(this.emergencyService, callsEmergencyAddressStatus.emergencyService);
    }

    @Override
    public int hashCode() {
        return Objects.hash(emergencyService);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class CallsEmergencyAddressStatus {")
                .append(newLine)
                .append("    emergencyService: ")
                .append(toIndentedString(emergencyService))
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
