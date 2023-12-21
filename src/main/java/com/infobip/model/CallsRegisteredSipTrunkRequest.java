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
 * Represents CallsRegisteredSipTrunkRequest model.
 */
public class CallsRegisteredSipTrunkRequest extends CallsSipTrunkRequest {

    private Boolean inviteAuthentication;

    /**
     * Constructs a new {@link CallsRegisteredSipTrunkRequest} instance.
     */
    public CallsRegisteredSipTrunkRequest() {
        super("REGISTERED");
    }

    /**
     * Sets inviteAuthentication.
     * <p>
     * Field description:
     * Enables an authentication challenge for each call.
     *
     * @param inviteAuthentication
     * @return This {@link CallsRegisteredSipTrunkRequest instance}.
     */
    public CallsRegisteredSipTrunkRequest inviteAuthentication(Boolean inviteAuthentication) {
        this.inviteAuthentication = inviteAuthentication;
        return this;
    }

    /**
     * Returns inviteAuthentication.
     * <p>
     * Field description:
     * Enables an authentication challenge for each call.
     *
     * @return inviteAuthentication
     */
    @JsonProperty("inviteAuthentication")
    public Boolean getInviteAuthentication() {
        return inviteAuthentication;
    }

    /**
     * Sets inviteAuthentication.
     * <p>
     * Field description:
     * Enables an authentication challenge for each call.
     *
     * @param inviteAuthentication
     */
    @JsonProperty("inviteAuthentication")
    public void setInviteAuthentication(Boolean inviteAuthentication) {
        this.inviteAuthentication = inviteAuthentication;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CallsRegisteredSipTrunkRequest callsRegisteredSipTrunkRequest = (CallsRegisteredSipTrunkRequest) o;
        return Objects.equals(this.inviteAuthentication, callsRegisteredSipTrunkRequest.inviteAuthentication)
                && super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(inviteAuthentication, super.hashCode());
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class CallsRegisteredSipTrunkRequest {")
                .append(newLine)
                .append("    ")
                .append(toIndentedString(super.toString()))
                .append(newLine)
                .append("    inviteAuthentication: ")
                .append(toIndentedString(inviteAuthentication))
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
