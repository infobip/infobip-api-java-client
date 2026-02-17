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
 * Represents TfaStartAuthenticationResponse model.
 */
public class TfaStartAuthenticationResponse {

    private String callStatus;

    private String externalMessageId;

    private String ncStatus;

    private String pinId;

    private String smsStatus;

    private String to;

    /**
     * Sets callStatus.
     * <p>
     * Field description:
     * Call status, e.g. &#x60;PENDING_ACCEPTED&#x60;.
     *
     * @param callStatus
     * @return This {@link TfaStartAuthenticationResponse instance}.
     */
    public TfaStartAuthenticationResponse callStatus(String callStatus) {
        this.callStatus = callStatus;
        return this;
    }

    /**
     * Returns callStatus.
     * <p>
     * Field description:
     * Call status, e.g. &#x60;PENDING_ACCEPTED&#x60;.
     *
     * @return callStatus
     */
    @JsonProperty("callStatus")
    public String getCallStatus() {
        return callStatus;
    }

    /**
     * Sets callStatus.
     * <p>
     * Field description:
     * Call status, e.g. &#x60;PENDING_ACCEPTED&#x60;.
     *
     * @param callStatus
     */
    @JsonProperty("callStatus")
    public void setCallStatus(String callStatus) {
        this.callStatus = callStatus;
    }

    /**
     * Sets externalMessageId.
     * <p>
     * Field description:
     * Message ID used for delivery tracking.
     *
     * @param externalMessageId
     * @return This {@link TfaStartAuthenticationResponse instance}.
     */
    public TfaStartAuthenticationResponse externalMessageId(String externalMessageId) {
        this.externalMessageId = externalMessageId;
        return this;
    }

    /**
     * Returns externalMessageId.
     * <p>
     * Field description:
     * Message ID used for delivery tracking.
     *
     * @return externalMessageId
     */
    @JsonProperty("externalMessageId")
    public String getExternalMessageId() {
        return externalMessageId;
    }

    /**
     * Sets externalMessageId.
     * <p>
     * Field description:
     * Message ID used for delivery tracking.
     *
     * @param externalMessageId
     */
    @JsonProperty("externalMessageId")
    public void setExternalMessageId(String externalMessageId) {
        this.externalMessageId = externalMessageId;
    }

    /**
     * Sets ncStatus.
     * <p>
     * Field description:
     * Status of sent [Number Lookup](https://www.infobip.com/docs/number-lookup). Number Lookup status can have one of the following values: &#x60;NC_DESTINATION_UNKNOWN&#x60;, &#x60;NC_DESTINATION_REACHABLE&#x60;, &#x60;NC_DESTINATION_NOT_REACHABLE&#x60;, &#x60;NC_NOT_CONFIGURED&#x60;. Contact your Account Manager, if you get the &#x60;NC_NOT_CONFIGURED&#x60; status. SMS will not be sent only if Number Lookup status is &#x60;NC_NOT_REACHABLE&#x60;.
     *
     * @param ncStatus
     * @return This {@link TfaStartAuthenticationResponse instance}.
     */
    public TfaStartAuthenticationResponse ncStatus(String ncStatus) {
        this.ncStatus = ncStatus;
        return this;
    }

    /**
     * Returns ncStatus.
     * <p>
     * Field description:
     * Status of sent [Number Lookup](https://www.infobip.com/docs/number-lookup). Number Lookup status can have one of the following values: &#x60;NC_DESTINATION_UNKNOWN&#x60;, &#x60;NC_DESTINATION_REACHABLE&#x60;, &#x60;NC_DESTINATION_NOT_REACHABLE&#x60;, &#x60;NC_NOT_CONFIGURED&#x60;. Contact your Account Manager, if you get the &#x60;NC_NOT_CONFIGURED&#x60; status. SMS will not be sent only if Number Lookup status is &#x60;NC_NOT_REACHABLE&#x60;.
     *
     * @return ncStatus
     */
    @JsonProperty("ncStatus")
    public String getNcStatus() {
        return ncStatus;
    }

    /**
     * Sets ncStatus.
     * <p>
     * Field description:
     * Status of sent [Number Lookup](https://www.infobip.com/docs/number-lookup). Number Lookup status can have one of the following values: &#x60;NC_DESTINATION_UNKNOWN&#x60;, &#x60;NC_DESTINATION_REACHABLE&#x60;, &#x60;NC_DESTINATION_NOT_REACHABLE&#x60;, &#x60;NC_NOT_CONFIGURED&#x60;. Contact your Account Manager, if you get the &#x60;NC_NOT_CONFIGURED&#x60; status. SMS will not be sent only if Number Lookup status is &#x60;NC_NOT_REACHABLE&#x60;.
     *
     * @param ncStatus
     */
    @JsonProperty("ncStatus")
    public void setNcStatus(String ncStatus) {
        this.ncStatus = ncStatus;
    }

    /**
     * Sets pinId.
     * <p>
     * Field description:
     * Sent PIN code ID.
     *
     * @param pinId
     * @return This {@link TfaStartAuthenticationResponse instance}.
     */
    public TfaStartAuthenticationResponse pinId(String pinId) {
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
     * Sets smsStatus.
     * <p>
     * Field description:
     * Sent SMS status. Can have one of the following values: &#x60;MESSAGE_SENT&#x60;, &#x60;MESSAGE_NOT_SENT&#x60;.
     *
     * @param smsStatus
     * @return This {@link TfaStartAuthenticationResponse instance}.
     */
    public TfaStartAuthenticationResponse smsStatus(String smsStatus) {
        this.smsStatus = smsStatus;
        return this;
    }

    /**
     * Returns smsStatus.
     * <p>
     * Field description:
     * Sent SMS status. Can have one of the following values: &#x60;MESSAGE_SENT&#x60;, &#x60;MESSAGE_NOT_SENT&#x60;.
     *
     * @return smsStatus
     */
    @JsonProperty("smsStatus")
    public String getSmsStatus() {
        return smsStatus;
    }

    /**
     * Sets smsStatus.
     * <p>
     * Field description:
     * Sent SMS status. Can have one of the following values: &#x60;MESSAGE_SENT&#x60;, &#x60;MESSAGE_NOT_SENT&#x60;.
     *
     * @param smsStatus
     */
    @JsonProperty("smsStatus")
    public void setSmsStatus(String smsStatus) {
        this.smsStatus = smsStatus;
    }

    /**
     * Sets to.
     * <p>
     * Field description:
     * Phone number to which the 2FA message will be sent. Example: &#x60;41793026727&#x60;.
     *
     * @param to
     * @return This {@link TfaStartAuthenticationResponse instance}.
     */
    public TfaStartAuthenticationResponse to(String to) {
        this.to = to;
        return this;
    }

    /**
     * Returns to.
     * <p>
     * Field description:
     * Phone number to which the 2FA message will be sent. Example: &#x60;41793026727&#x60;.
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
     * Phone number to which the 2FA message will be sent. Example: &#x60;41793026727&#x60;.
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
        TfaStartAuthenticationResponse tfaStartAuthenticationResponse = (TfaStartAuthenticationResponse) o;
        return Objects.equals(this.callStatus, tfaStartAuthenticationResponse.callStatus)
                && Objects.equals(this.externalMessageId, tfaStartAuthenticationResponse.externalMessageId)
                && Objects.equals(this.ncStatus, tfaStartAuthenticationResponse.ncStatus)
                && Objects.equals(this.pinId, tfaStartAuthenticationResponse.pinId)
                && Objects.equals(this.smsStatus, tfaStartAuthenticationResponse.smsStatus)
                && Objects.equals(this.to, tfaStartAuthenticationResponse.to);
    }

    @Override
    public int hashCode() {
        return Objects.hash(callStatus, externalMessageId, ncStatus, pinId, smsStatus, to);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class TfaStartAuthenticationResponse {")
                .append(newLine)
                .append("    callStatus: ")
                .append(toIndentedString(callStatus))
                .append(newLine)
                .append("    externalMessageId: ")
                .append(toIndentedString(externalMessageId))
                .append(newLine)
                .append("    ncStatus: ")
                .append(toIndentedString(ncStatus))
                .append(newLine)
                .append("    pinId: ")
                .append(toIndentedString(pinId))
                .append(newLine)
                .append("    smsStatus: ")
                .append(toIndentedString(smsStatus))
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
