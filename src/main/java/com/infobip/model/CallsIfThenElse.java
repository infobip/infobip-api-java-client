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
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * If-Then-Else action provides simple branching based on a condition. If the condition evaluates to true, the then block is executed, otherwise the else block is executed. Only one of the blocks is required to be non-empty.
 */
public class CallsIfThenElse implements CallsScriptInner {

    private String _if;

    private List<Object> then = null;

    private List<Object> _else = null;

    private Integer actionId;

    /**
     * Sets _if.
     * <p>
     * Field description:
     * The expression to evaluate
     * <p>
     * The field is required.
     *
     * @param _if
     * @return This {@link CallsIfThenElse instance}.
     */
    public CallsIfThenElse _if(String _if) {
        this._if = _if;
        return this;
    }

    /**
     * Returns _if.
     * <p>
     * Field description:
     * The expression to evaluate
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
     * The expression to evaluate
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
     * Sets then.
     * <p>
     * Field description:
     * The actions to execute if condition is evaluated to true.
     *
     * @param then
     * @return This {@link CallsIfThenElse instance}.
     */
    public CallsIfThenElse then(List<Object> then) {
        this.then = then;
        return this;
    }

    /**
     * Adds and item into then.
     * <p>
     * Field description:
     * The actions to execute if condition is evaluated to true.
     *
     * @param thenItem The item to be added to the list.
     * @return This {@link CallsIfThenElse instance}.
     */
    public CallsIfThenElse addThenItem(Object thenItem) {
        if (this.then == null) {
            this.then = new ArrayList<>();
        }
        this.then.add(thenItem);
        return this;
    }

    /**
     * Returns then.
     * <p>
     * Field description:
     * The actions to execute if condition is evaluated to true.
     *
     * @return then
     */
    @JsonProperty("then")
    public List<Object> getThen() {
        return then;
    }

    /**
     * Sets then.
     * <p>
     * Field description:
     * The actions to execute if condition is evaluated to true.
     *
     * @param then
     */
    @JsonProperty("then")
    public void setThen(List<Object> then) {
        this.then = then;
    }

    /**
     * Sets _else.
     * <p>
     * Field description:
     * The actions to execute if condition is evaluated to false.
     *
     * @param _else
     * @return This {@link CallsIfThenElse instance}.
     */
    public CallsIfThenElse _else(List<Object> _else) {
        this._else = _else;
        return this;
    }

    /**
     * Adds and item into _else.
     * <p>
     * Field description:
     * The actions to execute if condition is evaluated to false.
     *
     * @param _elseItem The item to be added to the list.
     * @return This {@link CallsIfThenElse instance}.
     */
    public CallsIfThenElse addElseItem(Object _elseItem) {
        if (this._else == null) {
            this._else = new ArrayList<>();
        }
        this._else.add(_elseItem);
        return this;
    }

    /**
     * Returns _else.
     * <p>
     * Field description:
     * The actions to execute if condition is evaluated to false.
     *
     * @return _else
     */
    @JsonProperty("else")
    public List<Object> getElse() {
        return _else;
    }

    /**
     * Sets _else.
     * <p>
     * Field description:
     * The actions to execute if condition is evaluated to false.
     *
     * @param _else
     */
    @JsonProperty("else")
    public void setElse(List<Object> _else) {
        this._else = _else;
    }

    /**
     * Sets actionId.
     * <p>
     * Field description:
     * User-defined ID of an action that can be used with go-to action.
     *
     * @param actionId
     * @return This {@link CallsIfThenElse instance}.
     */
    public CallsIfThenElse actionId(Integer actionId) {
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
        CallsIfThenElse callsIfThenElse = (CallsIfThenElse) o;
        return Objects.equals(this._if, callsIfThenElse._if)
                && Objects.equals(this.then, callsIfThenElse.then)
                && Objects.equals(this._else, callsIfThenElse._else)
                && Objects.equals(this.actionId, callsIfThenElse.actionId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(_if, then, _else, actionId);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class CallsIfThenElse {")
                .append(newLine)
                .append("    _if: ")
                .append(toIndentedString(_if))
                .append(newLine)
                .append("    then: ")
                .append(toIndentedString(then))
                .append(newLine)
                .append("    _else: ")
                .append(toIndentedString(_else))
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
