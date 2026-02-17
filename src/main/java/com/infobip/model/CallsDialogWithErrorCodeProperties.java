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
 * Properties of the events that provide &#x60;Dialog&#x60; object together with &#x60;ErrorCode&#x60;.
 */
public class CallsDialogWithErrorCodeProperties {

    private CallsDialog dialog;

    private CallsErrorCodeInfo errorCode;

    private CallsDialogHangupSource hangupSource;

    /**
     * Sets dialog.
     *
     * @param dialog
     * @return This {@link CallsDialogWithErrorCodeProperties instance}.
     */
    public CallsDialogWithErrorCodeProperties dialog(CallsDialog dialog) {
        this.dialog = dialog;
        return this;
    }

    /**
     * Returns dialog.
     *
     * @return dialog
     */
    @JsonProperty("dialog")
    public CallsDialog getDialog() {
        return dialog;
    }

    /**
     * Sets dialog.
     *
     * @param dialog
     */
    @JsonProperty("dialog")
    public void setDialog(CallsDialog dialog) {
        this.dialog = dialog;
    }

    /**
     * Sets errorCode.
     *
     * @param errorCode
     * @return This {@link CallsDialogWithErrorCodeProperties instance}.
     */
    public CallsDialogWithErrorCodeProperties errorCode(CallsErrorCodeInfo errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    /**
     * Returns errorCode.
     *
     * @return errorCode
     */
    @JsonProperty("errorCode")
    public CallsErrorCodeInfo getErrorCode() {
        return errorCode;
    }

    /**
     * Sets errorCode.
     *
     * @param errorCode
     */
    @JsonProperty("errorCode")
    public void setErrorCode(CallsErrorCodeInfo errorCode) {
        this.errorCode = errorCode;
    }

    /**
     * Sets hangupSource.
     *
     * @param hangupSource
     * @return This {@link CallsDialogWithErrorCodeProperties instance}.
     */
    public CallsDialogWithErrorCodeProperties hangupSource(CallsDialogHangupSource hangupSource) {
        this.hangupSource = hangupSource;
        return this;
    }

    /**
     * Returns hangupSource.
     *
     * @return hangupSource
     */
    @JsonProperty("hangupSource")
    public CallsDialogHangupSource getHangupSource() {
        return hangupSource;
    }

    /**
     * Sets hangupSource.
     *
     * @param hangupSource
     */
    @JsonProperty("hangupSource")
    public void setHangupSource(CallsDialogHangupSource hangupSource) {
        this.hangupSource = hangupSource;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CallsDialogWithErrorCodeProperties callsDialogWithErrorCodeProperties = (CallsDialogWithErrorCodeProperties) o;
        return Objects.equals(this.dialog, callsDialogWithErrorCodeProperties.dialog)
                && Objects.equals(this.errorCode, callsDialogWithErrorCodeProperties.errorCode)
                && Objects.equals(this.hangupSource, callsDialogWithErrorCodeProperties.hangupSource);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dialog, errorCode, hangupSource);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class CallsDialogWithErrorCodeProperties {")
                .append(newLine)
                .append("    dialog: ")
                .append(toIndentedString(dialog))
                .append(newLine)
                .append("    errorCode: ")
                .append(toIndentedString(errorCode))
                .append(newLine)
                .append("    hangupSource: ")
                .append(toIndentedString(hangupSource))
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
