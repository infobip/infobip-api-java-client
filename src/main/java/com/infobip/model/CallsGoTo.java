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
 * Go-To action is used to go back to some specified action that was already executed in the scenario and continue the execution from that point.
 */
public class CallsGoTo implements CallsScriptInner {

    private Integer _goTo;

    private CallsGoToOptions options;

    /**
     * Sets _goTo.
     * <p>
     * Field description:
     * The actionId of an action to which to jump
     * <p>
     * The field is required.
     *
     * @param _goTo
     * @return This {@link CallsGoTo instance}.
     */
    public CallsGoTo _goTo(Integer _goTo) {
        this._goTo = _goTo;
        return this;
    }

    /**
     * Returns _goTo.
     * <p>
     * Field description:
     * The actionId of an action to which to jump
     * <p>
     * The field is required.
     *
     * @return _goTo
     */
    @JsonProperty("goTo")
    public Integer getGoTo() {
        return _goTo;
    }

    /**
     * Sets _goTo.
     * <p>
     * Field description:
     * The actionId of an action to which to jump
     * <p>
     * The field is required.
     *
     * @param _goTo
     */
    @JsonProperty("goTo")
    public void setGoTo(Integer _goTo) {
        this._goTo = _goTo;
    }

    /**
     * Sets options.
     *
     * @param options
     * @return This {@link CallsGoTo instance}.
     */
    public CallsGoTo options(CallsGoToOptions options) {
        this.options = options;
        return this;
    }

    /**
     * Returns options.
     *
     * @return options
     */
    @JsonProperty("options")
    public CallsGoToOptions getOptions() {
        return options;
    }

    /**
     * Sets options.
     *
     * @param options
     */
    @JsonProperty("options")
    public void setOptions(CallsGoToOptions options) {
        this.options = options;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CallsGoTo callsGoTo = (CallsGoTo) o;
        return Objects.equals(this._goTo, callsGoTo._goTo) && Objects.equals(this.options, callsGoTo.options);
    }

    @Override
    public int hashCode() {
        return Objects.hash(_goTo, options);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class CallsGoTo {")
                .append(newLine)
                .append("    _goTo: ")
                .append(toIndentedString(_goTo))
                .append(newLine)
                .append("    options: ")
                .append(toIndentedString(options))
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
