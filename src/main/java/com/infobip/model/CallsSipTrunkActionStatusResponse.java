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
 * SIP trunk action status.
 */
public class CallsSipTrunkActionStatusResponse {

    private CallsSipTrunkActionStatus status;

    private String reason;

    /**
     * Sets status.
     *
     * @param status
     * @return This {@link CallsSipTrunkActionStatusResponse instance}.
     */
    public CallsSipTrunkActionStatusResponse status(CallsSipTrunkActionStatus status) {
        this.status = status;
        return this;
    }

    /**
     * Returns status.
     *
     * @return status
     */
    @JsonProperty("status")
    public CallsSipTrunkActionStatus getStatus() {
        return status;
    }

    /**
     * Sets status.
     *
     * @param status
     */
    @JsonProperty("status")
    public void setStatus(CallsSipTrunkActionStatus status) {
        this.status = status;
    }

    /**
     * Sets reason.
     * <p>
     * Field description:
     * Description of the &#x60;FAILED&#x60; or &#x60;RESET&#x60; action.
     *
     * @param reason
     * @return This {@link CallsSipTrunkActionStatusResponse instance}.
     */
    public CallsSipTrunkActionStatusResponse reason(String reason) {
        this.reason = reason;
        return this;
    }

    /**
     * Returns reason.
     * <p>
     * Field description:
     * Description of the &#x60;FAILED&#x60; or &#x60;RESET&#x60; action.
     *
     * @return reason
     */
    @JsonProperty("reason")
    public String getReason() {
        return reason;
    }

    /**
     * Sets reason.
     * <p>
     * Field description:
     * Description of the &#x60;FAILED&#x60; or &#x60;RESET&#x60; action.
     *
     * @param reason
     */
    @JsonProperty("reason")
    public void setReason(String reason) {
        this.reason = reason;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CallsSipTrunkActionStatusResponse callsSipTrunkActionStatusResponse = (CallsSipTrunkActionStatusResponse) o;
        return Objects.equals(this.status, callsSipTrunkActionStatusResponse.status)
                && Objects.equals(this.reason, callsSipTrunkActionStatusResponse.reason);
    }

    @Override
    public int hashCode() {
        return Objects.hash(status, reason);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class CallsSipTrunkActionStatusResponse {")
                .append(newLine)
                .append("    status: ")
                .append(toIndentedString(status))
                .append(newLine)
                .append("    reason: ")
                .append(toIndentedString(reason))
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
