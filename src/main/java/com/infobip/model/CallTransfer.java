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
 * Represents CallTransfer model.
 */
public class CallTransfer {

    private Integer callTransferMaxDuration;

    private String equals;

    private String _if;

    private String transferTo;

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
     * <p>
     * The field is required.
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
     * <p>
     * The field is required.
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
     * <p>
     * The field is required.
     *
     * @param equals
     */
    @JsonProperty("equals")
    public void setEquals(String equals) {
        this.equals = equals;
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
                && Objects.equals(this._if, callTransfer._if)
                && Objects.equals(this.transferTo, callTransfer.transferTo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(callTransferMaxDuration, equals, _if, transferTo);
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
                .append("    _if: ")
                .append(toIndentedString(_if))
                .append(newLine)
                .append("    transferTo: ")
                .append(toIndentedString(transferTo))
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
