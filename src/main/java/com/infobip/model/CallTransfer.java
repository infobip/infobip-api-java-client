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
 * Call transfers object enables transferring the ongoing call to another recipient(s) and establish a communication between your original recipient and additional one.
 */
public class CallTransfer {

    private Integer callTransferMaxDuration;

    private String equals;

    private String transferTo;

    private String _if;

    /**
     * Sets callTransferMaxDuration.
     * <p>
     * Field description:
     * Maximum duration of the transferred call, specified in seconds.
     *
     * @param callTransferMaxDuration
     * @return This {@link CallTransfer instance}.
     */
    public CallTransfer callTransferMaxDuration(Integer callTransferMaxDuration) {
        this.callTransferMaxDuration = callTransferMaxDuration;
        return this;
    }

    /**
     * Returns callTransferMaxDuration.
     * <p>
     * Field description:
     * Maximum duration of the transferred call, specified in seconds.
     *
     * @return callTransferMaxDuration
     */
    @JsonProperty("callTransferMaxDuration")
    public Integer getCallTransferMaxDuration() {
        return callTransferMaxDuration;
    }

    /**
     * Sets callTransferMaxDuration.
     * <p>
     * Field description:
     * Maximum duration of the transferred call, specified in seconds.
     *
     * @param callTransferMaxDuration
     */
    @JsonProperty("callTransferMaxDuration")
    public void setCallTransferMaxDuration(Integer callTransferMaxDuration) {
        this.callTransferMaxDuration = callTransferMaxDuration;
    }

    /**
     * Sets equals.
     * <p>
     * Field description:
     * Criteria for establishing call transfer, if &#x60;dtmf&#x60; is evaluated.
     *
     * @param equals
     * @return This {@link CallTransfer instance}.
     */
    public CallTransfer equals(String equals) {
        this.equals = equals;
        return this;
    }

    /**
     * Returns equals.
     * <p>
     * Field description:
     * Criteria for establishing call transfer, if &#x60;dtmf&#x60; is evaluated.
     *
     * @return equals
     */
    @JsonProperty("equals")
    public String getEquals() {
        return equals;
    }

    /**
     * Sets equals.
     * <p>
     * Field description:
     * Criteria for establishing call transfer, if &#x60;dtmf&#x60; is evaluated.
     *
     * @param equals
     */
    @JsonProperty("equals")
    public void setEquals(String equals) {
        this.equals = equals;
    }

    /**
     * Sets transferTo.
     * <p>
     * Field description:
     * Phone number of the recipient that will receive transferred call. Must be written in E.164 standard (Example: 41793026727).
     * <p>
     * The field is required.
     *
     * @param transferTo
     * @return This {@link CallTransfer instance}.
     */
    public CallTransfer transferTo(String transferTo) {
        this.transferTo = transferTo;
        return this;
    }

    /**
     * Returns transferTo.
     * <p>
     * Field description:
     * Phone number of the recipient that will receive transferred call. Must be written in E.164 standard (Example: 41793026727).
     * <p>
     * The field is required.
     *
     * @return transferTo
     */
    @JsonProperty("transferTo")
    public String getTransferTo() {
        return transferTo;
    }

    /**
     * Sets transferTo.
     * <p>
     * Field description:
     * Phone number of the recipient that will receive transferred call. Must be written in E.164 standard (Example: 41793026727).
     * <p>
     * The field is required.
     *
     * @param transferTo
     */
    @JsonProperty("transferTo")
    public void setTransferTo(String transferTo) {
        this.transferTo = transferTo;
    }

    /**
     * Sets _if.
     * <p>
     * Field description:
     * Specifies what to evaluate. Can be &#x60;dtmf&#x60; or &#x60;anyDtmf&#x60;.
     * <p>
     * The field is required.
     *
     * @param _if
     * @return This {@link CallTransfer instance}.
     */
    public CallTransfer _if(String _if) {
        this._if = _if;
        return this;
    }

    /**
     * Returns _if.
     * <p>
     * Field description:
     * Specifies what to evaluate. Can be &#x60;dtmf&#x60; or &#x60;anyDtmf&#x60;.
     * <p>
     * The field is required.
     *
     * @return _if
     */
    @JsonProperty("if")
    public String getIf() {
        return _if;
    }

    /**
     * Sets _if.
     * <p>
     * Field description:
     * Specifies what to evaluate. Can be &#x60;dtmf&#x60; or &#x60;anyDtmf&#x60;.
     * <p>
     * The field is required.
     *
     * @param _if
     */
    @JsonProperty("if")
    public void setIf(String _if) {
        this._if = _if;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CallTransfer callTransfer = (CallTransfer) o;
        return Objects.equals(this.callTransferMaxDuration, callTransfer.callTransferMaxDuration)
                && Objects.equals(this.equals, callTransfer.equals)
                && Objects.equals(this.transferTo, callTransfer.transferTo)
                && Objects.equals(this._if, callTransfer._if);
    }

    @Override
    public int hashCode() {
        return Objects.hash(callTransferMaxDuration, equals, transferTo, _if);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class CallTransfer {")
                .append(newLine)
                .append("    callTransferMaxDuration: ")
                .append(toIndentedString(callTransferMaxDuration))
                .append(newLine)
                .append("    equals: ")
                .append(toIndentedString(equals))
                .append(newLine)
                .append("    transferTo: ")
                .append(toIndentedString(transferTo))
                .append(newLine)
                .append("    _if: ")
                .append(toIndentedString(_if))
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
