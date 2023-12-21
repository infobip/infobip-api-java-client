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
 * Represents CallsRegisteredSipTrunkResponse model.
 */
public class CallsRegisteredSipTrunkResponse extends CallsSipTrunkResponse {

    private String username;

    private Boolean inviteAuthentication;

    /**
     * Constructs a new {@link CallsRegisteredSipTrunkResponse} instance.
     */
    public CallsRegisteredSipTrunkResponse() {
        super("REGISTERED");
    }

    /**
     * Sets username.
     * <p>
     * Field description:
     * Registration username.
     *
     * @param username
     * @return This {@link CallsRegisteredSipTrunkResponse instance}.
     */
    public CallsRegisteredSipTrunkResponse username(String username) {
        this.username = username;
        return this;
    }

    /**
     * Returns username.
     * <p>
     * Field description:
     * Registration username.
     *
     * @return username
     */
    @JsonProperty("username")
    public String getUsername() {
        return username;
    }

    /**
     * Sets username.
     * <p>
     * Field description:
     * Registration username.
     *
     * @param username
     */
    @JsonProperty("username")
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * Sets inviteAuthentication.
     * <p>
     * Field description:
     * Enables an authentication challenge for each call.
     *
     * @param inviteAuthentication
     * @return This {@link CallsRegisteredSipTrunkResponse instance}.
     */
    public CallsRegisteredSipTrunkResponse inviteAuthentication(Boolean inviteAuthentication) {
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
        CallsRegisteredSipTrunkResponse callsRegisteredSipTrunkResponse = (CallsRegisteredSipTrunkResponse) o;
        return Objects.equals(this.username, callsRegisteredSipTrunkResponse.username)
                && Objects.equals(this.inviteAuthentication, callsRegisteredSipTrunkResponse.inviteAuthentication)
                && super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(username, inviteAuthentication, super.hashCode());
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class CallsRegisteredSipTrunkResponse {")
                .append(newLine)
                .append("    ")
                .append(toIndentedString(super.toString()))
                .append(newLine)
                .append("    username: ")
                .append(toIndentedString(username))
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
