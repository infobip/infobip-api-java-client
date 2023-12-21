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
 * Represents CallsExtendedSipTrunkStatusResponse model.
 */
public class CallsExtendedSipTrunkStatusResponse {

    private CallsSipTrunkAdminStatus adminStatus;

    private CallsSipTrunkActionStatusResponse actionStatus;

    private CallsSipTrunkRegistrationStatus registrationStatus;

    private Integer activeCalls;

    /**
     * Sets adminStatus.
     *
     * @param adminStatus
     * @return This {@link CallsExtendedSipTrunkStatusResponse instance}.
     */
    public CallsExtendedSipTrunkStatusResponse adminStatus(CallsSipTrunkAdminStatus adminStatus) {
        this.adminStatus = adminStatus;
        return this;
    }

    /**
     * Returns adminStatus.
     *
     * @return adminStatus
     */
    @JsonProperty("adminStatus")
    public CallsSipTrunkAdminStatus getAdminStatus() {
        return adminStatus;
    }

    /**
     * Sets adminStatus.
     *
     * @param adminStatus
     */
    @JsonProperty("adminStatus")
    public void setAdminStatus(CallsSipTrunkAdminStatus adminStatus) {
        this.adminStatus = adminStatus;
    }

    /**
     * Sets actionStatus.
     *
     * @param actionStatus
     * @return This {@link CallsExtendedSipTrunkStatusResponse instance}.
     */
    public CallsExtendedSipTrunkStatusResponse actionStatus(CallsSipTrunkActionStatusResponse actionStatus) {
        this.actionStatus = actionStatus;
        return this;
    }

    /**
     * Returns actionStatus.
     *
     * @return actionStatus
     */
    @JsonProperty("actionStatus")
    public CallsSipTrunkActionStatusResponse getActionStatus() {
        return actionStatus;
    }

    /**
     * Sets actionStatus.
     *
     * @param actionStatus
     */
    @JsonProperty("actionStatus")
    public void setActionStatus(CallsSipTrunkActionStatusResponse actionStatus) {
        this.actionStatus = actionStatus;
    }

    /**
     * Sets registrationStatus.
     *
     * @param registrationStatus
     * @return This {@link CallsExtendedSipTrunkStatusResponse instance}.
     */
    public CallsExtendedSipTrunkStatusResponse registrationStatus(CallsSipTrunkRegistrationStatus registrationStatus) {
        this.registrationStatus = registrationStatus;
        return this;
    }

    /**
     * Returns registrationStatus.
     *
     * @return registrationStatus
     */
    @JsonProperty("registrationStatus")
    public CallsSipTrunkRegistrationStatus getRegistrationStatus() {
        return registrationStatus;
    }

    /**
     * Sets registrationStatus.
     *
     * @param registrationStatus
     */
    @JsonProperty("registrationStatus")
    public void setRegistrationStatus(CallsSipTrunkRegistrationStatus registrationStatus) {
        this.registrationStatus = registrationStatus;
    }

    /**
     * Sets activeCalls.
     * <p>
     * Field description:
     * Number of active calls.
     *
     * @param activeCalls
     * @return This {@link CallsExtendedSipTrunkStatusResponse instance}.
     */
    public CallsExtendedSipTrunkStatusResponse activeCalls(Integer activeCalls) {
        this.activeCalls = activeCalls;
        return this;
    }

    /**
     * Returns activeCalls.
     * <p>
     * Field description:
     * Number of active calls.
     *
     * @return activeCalls
     */
    @JsonProperty("activeCalls")
    public Integer getActiveCalls() {
        return activeCalls;
    }

    /**
     * Sets activeCalls.
     * <p>
     * Field description:
     * Number of active calls.
     *
     * @param activeCalls
     */
    @JsonProperty("activeCalls")
    public void setActiveCalls(Integer activeCalls) {
        this.activeCalls = activeCalls;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CallsExtendedSipTrunkStatusResponse callsExtendedSipTrunkStatusResponse =
                (CallsExtendedSipTrunkStatusResponse) o;
        return Objects.equals(this.adminStatus, callsExtendedSipTrunkStatusResponse.adminStatus)
                && Objects.equals(this.actionStatus, callsExtendedSipTrunkStatusResponse.actionStatus)
                && Objects.equals(this.registrationStatus, callsExtendedSipTrunkStatusResponse.registrationStatus)
                && Objects.equals(this.activeCalls, callsExtendedSipTrunkStatusResponse.activeCalls);
    }

    @Override
    public int hashCode() {
        return Objects.hash(adminStatus, actionStatus, registrationStatus, activeCalls);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class CallsExtendedSipTrunkStatusResponse {")
                .append(newLine)
                .append("    adminStatus: ")
                .append(toIndentedString(adminStatus))
                .append(newLine)
                .append("    actionStatus: ")
                .append(toIndentedString(actionStatus))
                .append(newLine)
                .append("    registrationStatus: ")
                .append(toIndentedString(registrationStatus))
                .append(newLine)
                .append("    activeCalls: ")
                .append(toIndentedString(activeCalls))
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
