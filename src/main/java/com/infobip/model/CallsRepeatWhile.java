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
 * Repeat-While action is a control flow statement that repeatedly executes a block of code, as long as the boolean condition in the while field is true. Comparison is done using equal (&#x3D;&#x3D;) or not equal (!&#x3D;) operators. Make sure not to provide a condition that causes an infinite loop.
 */
public class CallsRepeatWhile implements CallsScriptInner {

    private List<Object> repeat = new ArrayList<>();

    private String _while;

    /**
     * Sets repeat.
     * <p>
     * Field description:
     * Array of actions to execute.
     * <p>
     * The field is required.
     *
     * @param repeat
     * @return This {@link CallsRepeatWhile instance}.
     */
    public CallsRepeatWhile repeat(List<Object> repeat) {
        this.repeat = repeat;
        return this;
    }

    /**
     * Adds and item into repeat.
     * <p>
     * Field description:
     * Array of actions to execute.
     * <p>
     * The field is required.
     *
     * @param repeatItem The item to be added to the list.
     * @return This {@link CallsRepeatWhile instance}.
     */
    public CallsRepeatWhile addRepeatItem(Object repeatItem) {
        if (this.repeat == null) {
            this.repeat = new ArrayList<>();
        }
        this.repeat.add(repeatItem);
        return this;
    }

    /**
     * Returns repeat.
     * <p>
     * Field description:
     * Array of actions to execute.
     * <p>
     * The field is required.
     *
     * @return repeat
     */
    @JsonProperty("repeat")
    public List<Object> getRepeat() {
        return repeat;
    }

    /**
     * Sets repeat.
     * <p>
     * Field description:
     * Array of actions to execute.
     * <p>
     * The field is required.
     *
     * @param repeat
     */
    @JsonProperty("repeat")
    public void setRepeat(List<Object> repeat) {
        this.repeat = repeat;
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
     * @return This {@link CallsRepeatWhile instance}.
     */
    public CallsRepeatWhile _while(String _while) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CallsRepeatWhile callsRepeatWhile = (CallsRepeatWhile) o;
        return Objects.equals(this.repeat, callsRepeatWhile.repeat)
                && Objects.equals(this._while, callsRepeatWhile._while);
    }

    @Override
    public int hashCode() {
        return Objects.hash(repeat, _while);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class CallsRepeatWhile {")
                .append(newLine)
                .append("    repeat: ")
                .append(toIndentedString(repeat))
                .append(newLine)
                .append("    _while: ")
                .append(toIndentedString(_while))
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
