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
 * Properties of the events that provide &#x60;Dialog&#x60; object.
 */
public class CallsDialogProperties {

    private CallsDialog dialog;

    /**
     * Sets dialog.
     *
     * @param dialog
     * @return This {@link CallsDialogProperties instance}.
     */
    public CallsDialogProperties dialog(CallsDialog dialog) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CallsDialogProperties callsDialogProperties = (CallsDialogProperties) o;
        return Objects.equals(this.dialog, callsDialogProperties.dialog);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dialog);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class CallsDialogProperties {")
                .append(newLine)
                .append("    dialog: ")
                .append(toIndentedString(dialog))
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
