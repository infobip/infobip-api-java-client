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
 * Represents CallsCreateRegisteredSipTrunkResponse model.
 */
public class CallsCreateRegisteredSipTrunkResponse extends CallsCreateSipTrunkResponse {

    private String username;

    private String password;

    private Boolean inviteAuthentication;

    /**
     * Constructs a new {@link CallsCreateRegisteredSipTrunkResponse} instance.
     */
    public CallsCreateRegisteredSipTrunkResponse() {
        super("REGISTERED");
    }

    /**
     * Sets username.
     * <p>
     * Field description:
     * Registration username.
     *
     * @param username
     * @return This {@link CallsCreateRegisteredSipTrunkResponse instance}.
     */
    public CallsCreateRegisteredSipTrunkResponse username(String username) {
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
     * Sets password.
     * <p>
     * Field description:
     * Registration password.
     *
     * @param password
     * @return This {@link CallsCreateRegisteredSipTrunkResponse instance}.
     */
    public CallsCreateRegisteredSipTrunkResponse password(String password) {
        this.password = password;
        return this;
    }

    /**
     * Returns password.
     * <p>
     * Field description:
     * Registration password.
     *
     * @return password
     */
    @JsonProperty("password")
    public String getPassword() {
        return password;
    }

    /**
     * Sets password.
     * <p>
     * Field description:
     * Registration password.
     *
     * @param password
     */
    @JsonProperty("password")
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * Sets inviteAuthentication.
     * <p>
     * Field description:
     * Enables an authentication challenge for each call.
     *
     * @param inviteAuthentication
     * @return This {@link CallsCreateRegisteredSipTrunkResponse instance}.
     */
    public CallsCreateRegisteredSipTrunkResponse inviteAuthentication(Boolean inviteAuthentication) {
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
        CallsCreateRegisteredSipTrunkResponse callsCreateRegisteredSipTrunkResponse =
                (CallsCreateRegisteredSipTrunkResponse) o;
        return Objects.equals(this.username, callsCreateRegisteredSipTrunkResponse.username)
                && Objects.equals(this.password, callsCreateRegisteredSipTrunkResponse.password)
                && Objects.equals(this.inviteAuthentication, callsCreateRegisteredSipTrunkResponse.inviteAuthentication)
                && super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(username, password, inviteAuthentication, super.hashCode());
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class CallsCreateRegisteredSipTrunkResponse {")
                .append(newLine)
                .append("    ")
                .append(toIndentedString(super.toString()))
                .append(newLine)
                .append("    username: ")
                .append(toIndentedString(username))
                .append(newLine)
                .append("    password: ")
                .append(toIndentedString(password))
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
