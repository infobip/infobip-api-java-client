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
 * While-Do action executes the do field block of code as long as a specified condition is true in the while field. As with Repeat-While, comparison is done using equal (&#x3D;&#x3D;) or not equal (! &#x3D;) operators. Make sure not to provide a condition that causes an infinite loop.
 */
public class CallsWhileDo implements CallsScriptInner {

    private String _while;

    private List<Object> _do = new ArrayList<>();

    /**
     * Sets _while.
     * <p>
     * Field description:
     * The expression to evaluate.
     * <p>
     * The field is required.
     *
     * @param _while
     * @return This {@link CallsWhileDo instance}.
     */
    public CallsWhileDo _while(String _while) {
        this._while = _while;
        return this;
    }

    /**
     * Returns _while.
     * <p>
     * Field description:
     * The expression to evaluate.
     * <p>
     * The field is required.
     *
     * @return _while
     */
    @JsonProperty("while")
    public String getWhile() {
        return _while;
    }

    /**
     * Sets _while.
     * <p>
     * Field description:
     * The expression to evaluate.
     * <p>
     * The field is required.
     *
     * @param _while
     */
    @JsonProperty("while")
    public void setWhile(String _while) {
        this._while = _while;
    }

    /**
     * Sets _do.
     * <p>
     * Field description:
     * Array of actions to execute if none of the conditions above are met.
     * <p>
     * The field is required.
     *
     * @param _do
     * @return This {@link CallsWhileDo instance}.
     */
    public CallsWhileDo _do(List<Object> _do) {
        this._do = _do;
        return this;
    }

    /**
     * Adds and item into _do.
     * <p>
     * Field description:
     * Array of actions to execute if none of the conditions above are met.
     * <p>
     * The field is required.
     *
     * @param _doItem The item to be added to the list.
     * @return This {@link CallsWhileDo instance}.
     */
    public CallsWhileDo addDoItem(Object _doItem) {
        if (this._do == null) {
            this._do = new ArrayList<>();
        }
        this._do.add(_doItem);
        return this;
    }

    /**
     * Returns _do.
     * <p>
     * Field description:
     * Array of actions to execute if none of the conditions above are met.
     * <p>
     * The field is required.
     *
     * @return _do
     */
    @JsonProperty("do")
    public List<Object> getDo() {
        return _do;
    }

    /**
     * Sets _do.
     * <p>
     * Field description:
     * Array of actions to execute if none of the conditions above are met.
     * <p>
     * The field is required.
     *
     * @param _do
     */
    @JsonProperty("do")
    public void setDo(List<Object> _do) {
        this._do = _do;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CallsWhileDo callsWhileDo = (CallsWhileDo) o;
        return Objects.equals(this._while, callsWhileDo._while) && Objects.equals(this._do, callsWhileDo._do);
    }

    @Override
    public int hashCode() {
        return Objects.hash(_while, _do);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class CallsWhileDo {")
                .append(newLine)
                .append("    _while: ")
                .append(toIndentedString(_while))
                .append(newLine)
                .append("    _do: ")
                .append(toIndentedString(_do))
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
