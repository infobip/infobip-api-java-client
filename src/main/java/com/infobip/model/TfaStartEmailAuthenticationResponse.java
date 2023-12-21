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
 * Represents TfaStartEmailAuthenticationResponse model.
 */
public class TfaStartEmailAuthenticationResponse {

    private TfaEmailStatus emailStatus;

    private String pinId;

    private String to;

    /**
     * Sets emailStatus.
     *
     * @param emailStatus
     * @return This {@link TfaStartEmailAuthenticationResponse instance}.
     */
    public TfaStartEmailAuthenticationResponse emailStatus(TfaEmailStatus emailStatus) {
        this.emailStatus = emailStatus;
        return this;
    }

    /**
     * Returns emailStatus.
     *
     * @return emailStatus
     */
    @JsonProperty("emailStatus")
    public TfaEmailStatus getEmailStatus() {
        return emailStatus;
    }

    /**
     * Sets emailStatus.
     *
     * @param emailStatus
     */
    @JsonProperty("emailStatus")
    public void setEmailStatus(TfaEmailStatus emailStatus) {
        this.emailStatus = emailStatus;
    }

    /**
     * Sets pinId.
     * <p>
     * Field description:
     * Sent PIN code ID.
     *
     * @param pinId
     * @return This {@link TfaStartEmailAuthenticationResponse instance}.
     */
    public TfaStartEmailAuthenticationResponse pinId(String pinId) {
        this.pinId = pinId;
        return this;
    }

    /**
     * Returns pinId.
     * <p>
     * Field description:
     * Sent PIN code ID.
     *
     * @return pinId
     */
    @JsonProperty("pinId")
    public String getPinId() {
        return pinId;
    }

    /**
     * Sets pinId.
     * <p>
     * Field description:
     * Sent PIN code ID.
     *
     * @param pinId
     */
    @JsonProperty("pinId")
    public void setPinId(String pinId) {
        this.pinId = pinId;
    }

    /**
     * Sets to.
     * <p>
     * Field description:
     * Email address to which the 2FA message has been sent. Example: john.smith@example.com.
     *
     * @param to
     * @return This {@link TfaStartEmailAuthenticationResponse instance}.
     */
    public TfaStartEmailAuthenticationResponse to(String to) {
        this.to = to;
        return this;
    }

    /**
     * Returns to.
     * <p>
     * Field description:
     * Email address to which the 2FA message has been sent. Example: john.smith@example.com.
     *
     * @return to
     */
    @JsonProperty("to")
    public String getTo() {
        return to;
    }

    /**
     * Sets to.
     * <p>
     * Field description:
     * Email address to which the 2FA message has been sent. Example: john.smith@example.com.
     *
     * @param to
     */
    @JsonProperty("to")
    public void setTo(String to) {
        this.to = to;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TfaStartEmailAuthenticationResponse tfaStartEmailAuthenticationResponse =
                (TfaStartEmailAuthenticationResponse) o;
        return Objects.equals(this.emailStatus, tfaStartEmailAuthenticationResponse.emailStatus)
                && Objects.equals(this.pinId, tfaStartEmailAuthenticationResponse.pinId)
                && Objects.equals(this.to, tfaStartEmailAuthenticationResponse.to);
    }

    @Override
    public int hashCode() {
        return Objects.hash(emailStatus, pinId, to);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class TfaStartEmailAuthenticationResponse {")
                .append(newLine)
                .append("    emailStatus: ")
                .append(toIndentedString(emailStatus))
                .append(newLine)
                .append("    pinId: ")
                .append(toIndentedString(pinId))
                .append(newLine)
                .append("    to: ")
                .append(toIndentedString(to))
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
