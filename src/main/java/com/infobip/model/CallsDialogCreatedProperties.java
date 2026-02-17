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
 * Properties of the event that provide created &#x60;Dialog&#x60; object.
 */
public class CallsDialogCreatedProperties {

    private CallsDialog dialog;

    private String apiBaseUrl;

    /**
     * Sets dialog.
     *
     * @param dialog
     * @return This {@link CallsDialogCreatedProperties instance}.
     */
    public CallsDialogCreatedProperties dialog(CallsDialog dialog) {
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
     * Sets apiBaseUrl.
     * <p>
     * Field description:
     * Base URL of API which you should invoke for all actions related to the dialog.
     *
     * @param apiBaseUrl
     * @return This {@link CallsDialogCreatedProperties instance}.
     */
    public CallsDialogCreatedProperties apiBaseUrl(String apiBaseUrl) {
        this.apiBaseUrl = apiBaseUrl;
        return this;
    }

    /**
     * Returns apiBaseUrl.
     * <p>
     * Field description:
     * Base URL of API which you should invoke for all actions related to the dialog.
     *
     * @return apiBaseUrl
     */
    @JsonProperty("apiBaseUrl")
    public String getApiBaseUrl() {
        return apiBaseUrl;
    }

    /**
     * Sets apiBaseUrl.
     * <p>
     * Field description:
     * Base URL of API which you should invoke for all actions related to the dialog.
     *
     * @param apiBaseUrl
     */
    @JsonProperty("apiBaseUrl")
    public void setApiBaseUrl(String apiBaseUrl) {
        this.apiBaseUrl = apiBaseUrl;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CallsDialogCreatedProperties callsDialogCreatedProperties = (CallsDialogCreatedProperties) o;
        return Objects.equals(this.dialog, callsDialogCreatedProperties.dialog)
                && Objects.equals(this.apiBaseUrl, callsDialogCreatedProperties.apiBaseUrl);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dialog, apiBaseUrl);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class CallsDialogCreatedProperties {")
                .append(newLine)
                .append("    dialog: ")
                .append(toIndentedString(dialog))
                .append(newLine)
                .append("    apiBaseUrl: ")
                .append(toIndentedString(apiBaseUrl))
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
