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
 * Switch-Case action takes a saved variable (obtained via either a Collect, Call API action or scenario parameters) and performs flow control based on it. It works similarly to the switch case block, using case-sensitive comparison.
 */
public class CallsSwitchCase implements CallsScriptInner {

    private String _switch;

    private CallsCaseObject _case;

    private Integer actionId;

    /**
     * Sets _switch.
     * <p>
     * Field description:
     * Name of the variable whose value to inspect.
     * <p>
     * The field is required.
     *
     * @param _switch
     * @return This {@link CallsSwitchCase instance}.
     */
    public CallsSwitchCase _switch(String _switch) {
        this._switch = _switch;
        return this;
    }

    /**
     * Returns _switch.
     * <p>
     * Field description:
     * Name of the variable whose value to inspect.
     * <p>
     * The field is required.
     *
     * @return _switch
     */
    @JsonProperty("switch")
    public String getSwitch() {
        return _switch;
    }

    /**
     * Sets _switch.
     * <p>
     * Field description:
     * Name of the variable whose value to inspect.
     * <p>
     * The field is required.
     *
     * @param _switch
     */
    @JsonProperty("switch")
    public void setSwitch(String _switch) {
        this._switch = _switch;
    }

    /**
     * Sets _case.
     * <p>
     * The field is required.
     *
     * @param _case
     * @return This {@link CallsSwitchCase instance}.
     */
    public CallsSwitchCase _case(CallsCaseObject _case) {
        this._case = _case;
        return this;
    }

    /**
     * Returns _case.
     * <p>
     * The field is required.
     *
     * @return _case
     */
    @JsonProperty("case")
    public CallsCaseObject getCase() {
        return _case;
    }

    /**
     * Sets _case.
     * <p>
     * The field is required.
     *
     * @param _case
     */
    @JsonProperty("case")
    public void setCase(CallsCaseObject _case) {
        this._case = _case;
    }

    /**
     * Sets actionId.
     * <p>
     * Field description:
     * User-defined ID of an action that can be used with go-to action.
     *
     * @param actionId
     * @return This {@link CallsSwitchCase instance}.
     */
    public CallsSwitchCase actionId(Integer actionId) {
        this.actionId = actionId;
        return this;
    }

    /**
     * Returns actionId.
     * <p>
     * Field description:
     * User-defined ID of an action that can be used with go-to action.
     *
     * @return actionId
     */
    @JsonProperty("actionId")
    public Integer getActionId() {
        return actionId;
    }

    /**
     * Sets actionId.
     * <p>
     * Field description:
     * User-defined ID of an action that can be used with go-to action.
     *
     * @param actionId
     */
    @JsonProperty("actionId")
    public void setActionId(Integer actionId) {
        this.actionId = actionId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CallsSwitchCase callsSwitchCase = (CallsSwitchCase) o;
        return Objects.equals(this._switch, callsSwitchCase._switch)
                && Objects.equals(this._case, callsSwitchCase._case)
                && Objects.equals(this.actionId, callsSwitchCase.actionId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(_switch, _case, actionId);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class CallsSwitchCase {")
                .append(newLine)
                .append("    _switch: ")
                .append(toIndentedString(_switch))
                .append(newLine)
                .append("    _case: ")
                .append(toIndentedString(_case))
                .append(newLine)
                .append("    actionId: ")
                .append(toIndentedString(actionId))
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
